package org.snapshotscience.rov.wet.vehicle;

/* This file is part of WAHU ROV Software.
 *
 * WAHU ROV Software is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WAHU ROV Software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WAHU ROV Software.  If not, see <https://www.gnu.org/licenses/>.
 */

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bytedeco.opencv.presets.opencv_core;
import org.hibernate.validator.constraints.NotBlank;
import org.snapshotscience.rov.common.capabilities.Video;
import org.snapshotscience.rov.wet.service.camera.CameraStreamer;

/**
 * @author Jacob Buelow
 * @author Brian Wachsmuth
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VideoConfig extends Video implements AccessoryConfig {

  private static final long serialVersionUID = -7260327768559672636L;

  @NotBlank private String name;
  @NotBlank private Class<CameraStreamer> streamClass;
  @NotBlank private int width;
  @NotBlank private int height;
  @NotBlank private double framerate;
  @NotBlank private String device;
  @NotBlank private String outputURL;

  @Override
  public void validateConfigurtion() {
    // TODO Auto-generated method stub

  }

}