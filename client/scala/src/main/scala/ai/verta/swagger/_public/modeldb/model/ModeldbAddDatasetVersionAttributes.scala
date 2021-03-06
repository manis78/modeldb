// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.swagger._public.modeldb.model

import scala.util.Try

import net.liftweb.json._

import ai.verta.swagger._public.modeldb.model.DatasetTypeEnumDatasetType._
import ai.verta.swagger._public.modeldb.model.DatasetVisibilityEnumDatasetVisibility._
import ai.verta.swagger._public.modeldb.model.OperatorEnumOperator._
import ai.verta.swagger._public.modeldb.model.PathLocationTypeEnumPathLocationType._
import ai.verta.swagger._public.modeldb.model.ValueTypeEnumValueType._
import ai.verta.swagger._public.modeldb.model.ProtobufNullValue._
import ai.verta.swagger.client.objects._

case class ModeldbAddDatasetVersionAttributes (
  id: Option[String] = None,
  attributes: Option[List[CommonKeyValue]] = None
) extends BaseSwagger {
  def toJson(): JValue = ModeldbAddDatasetVersionAttributes.toJson(this)
}

object ModeldbAddDatasetVersionAttributes {
  def toJson(obj: ModeldbAddDatasetVersionAttributes): JObject = {
    new JObject(
      List[Option[JField]](
        obj.id.map(x => JField("id", JString(x))),
        obj.attributes.map(x => JField("attributes", ((x: List[CommonKeyValue]) => JArray(x.map(((x: CommonKeyValue) => CommonKeyValue.toJson(x)))))(x)))
      ).flatMap(x => x match {
        case Some(y) => List(y)
        case None => Nil
      })
    )
  }

  def fromJson(value: JValue): ModeldbAddDatasetVersionAttributes =
    value match {
      case JObject(fields) => {
        val fieldsMap = fields.map(f => (f.name, f.value)).toMap
        ModeldbAddDatasetVersionAttributes(
          // TODO: handle required
          id = fieldsMap.get("id").map(JsonConverter.fromJsonString),
          attributes = fieldsMap.get("attributes").map((x: JValue) => x match {case JArray(elements) => elements.map(CommonKeyValue.fromJson); case _ => throw new IllegalArgumentException(s"unknown type ${x.getClass.toString}")})
        )
      }
      case _ => throw new IllegalArgumentException(s"unknown type ${value.getClass.toString}")
    }
}
