/**
 * Copyright (C) 2017 DANS - Data Archiving and Networked Services (info@dans.knaw.nl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.knaw.dans.easy.bagindex

import java.nio.file.{ Files, Path, Paths }

import org.apache.commons.io.FileUtils
import org.scalatest._

trait TestSupportFixture extends FlatSpec with Matchers with Inside {

  lazy val testDir: Path = {
    val path = Paths.get(s"target/test/${ getClass.getSimpleName }").toAbsolutePath
    FileUtils.deleteQuietly(path.toFile)
    Files.createDirectories(path)
    path
  }

  lazy val testDoi: Doi = "10.5072/dans-x6f-kf66"
  lazy val testDois = List("10.5072/dans-x6f-kf6x", "10.5072/dans-x6f-kf66", "10.5072/dans-y7g-lg77")
}
