//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.22 at 03:54:11 PM CDT 
//


package io.fusionauth.samlv2.domain.jaxb.w3c.xmlenc11;

import java.math.BigInteger;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PBKDF2ParameterType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PBKDF2ParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Salt">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Specified" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                   &lt;element name="OtherSource" type="{http://www.w3.org/2009/xmlenc11#}AlgorithmIdentifierType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IterationCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="KeyLength" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="PRF" type="{http://www.w3.org/2009/xmlenc11#}PRFAlgorithmIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PBKDF2ParameterType", propOrder = {
    "salt",
    "iterationCount",
    "keyLength",
    "prf"
})
public class PBKDF2ParameterType {

  @XmlElement(name = "IterationCount", required = true)
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger iterationCount;

  @XmlElement(name = "KeyLength", required = true)
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger keyLength;

  @XmlElement(name = "PRF", required = true)
  protected PRFAlgorithmIdentifierType prf;

  @XmlElement(name = "Salt", required = true)
  protected PBKDF2ParameterType.Salt salt;

  /**
   * Gets the value of the iterationCount property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getIterationCount() {
    return iterationCount;
  }

  /**
   * Sets the value of the iterationCount property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setIterationCount(BigInteger value) {
    this.iterationCount = value;
  }

  /**
   * Gets the value of the keyLength property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getKeyLength() {
    return keyLength;
  }

  /**
   * Sets the value of the keyLength property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setKeyLength(BigInteger value) {
    this.keyLength = value;
  }

  /**
   * Gets the value of the prf property.
   *
   * @return possible object is {@link PRFAlgorithmIdentifierType }
   */
  public PRFAlgorithmIdentifierType getPRF() {
    return prf;
  }

  /**
   * Sets the value of the prf property.
   *
   * @param value allowed object is {@link PRFAlgorithmIdentifierType }
   */
  public void setPRF(PRFAlgorithmIdentifierType value) {
    this.prf = value;
  }

  /**
   * Gets the value of the salt property.
   *
   * @return possible object is {@link PBKDF2ParameterType.Salt }
   */
  public PBKDF2ParameterType.Salt getSalt() {
    return salt;
  }

  /**
   * Sets the value of the salt property.
   *
   * @param value allowed object is {@link PBKDF2ParameterType.Salt }
   */
  public void setSalt(PBKDF2ParameterType.Salt value) {
    this.salt = value;
  }

  /**
   * <p>Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;choice>
   *         &lt;element name="Specified" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
   *         &lt;element name="OtherSource" type="{http://www.w3.org/2009/xmlenc11#}AlgorithmIdentifierType"/>
   *       &lt;/choice>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "specified",
      "otherSource"
  })
  public static class Salt {

    @XmlElement(name = "OtherSource")
    protected AlgorithmIdentifierType otherSource;

    @XmlElement(name = "Specified")
    protected byte[] specified;

    /**
     * Gets the value of the otherSource property.
     *
     * @return possible object is {@link AlgorithmIdentifierType }
     */
    public AlgorithmIdentifierType getOtherSource() {
      return otherSource;
    }

    /**
     * Sets the value of the otherSource property.
     *
     * @param value allowed object is {@link AlgorithmIdentifierType }
     */
    public void setOtherSource(AlgorithmIdentifierType value) {
      this.otherSource = value;
    }

    /**
     * Gets the value of the specified property.
     *
     * @return possible object is byte[]
     */
    public byte[] getSpecified() {
      return specified;
    }

    /**
     * Sets the value of the specified property.
     *
     * @param value allowed object is byte[]
     */
    public void setSpecified(byte[] value) {
      this.specified = value;
    }

  }

}
