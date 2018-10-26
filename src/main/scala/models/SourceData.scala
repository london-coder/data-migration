package models

import scala.language.higherKinds

sealed trait SourceData [A] {
	
	def readFilesList[A] : List[A] 

}

final case class StorageCredentials(name: String, accessKey: String, secretKey: String)

final case class StorageFiles(fNames: List[String])

