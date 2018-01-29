/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuddyBanner implements org.apache.thrift.TBase<BuddyBanner, BuddyBanner._Fields>, java.io.Serializable, Cloneable, Comparable<BuddyBanner> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuddyBanner");

  private static final org.apache.thrift.protocol.TField BUDDY_BANNER_LINK_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("buddyBannerLinkType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField BUDDY_BANNER_LINK_FIELD_DESC = new org.apache.thrift.protocol.TField("buddyBannerLink", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField BUDDY_BANNER_IMAGE_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("buddyBannerImageUrl", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuddyBannerStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuddyBannerTupleSchemeFactory());
  }

  /**
   * 
   * @see BuddyBannerLinkType
   */
  public BuddyBannerLinkType buddyBannerLinkType; // required
  public String buddyBannerLink; // required
  public String buddyBannerImageUrl; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see BuddyBannerLinkType
     */
    BUDDY_BANNER_LINK_TYPE((short)1, "buddyBannerLinkType"),
    BUDDY_BANNER_LINK((short)2, "buddyBannerLink"),
    BUDDY_BANNER_IMAGE_URL((short)3, "buddyBannerImageUrl");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BUDDY_BANNER_LINK_TYPE
          return BUDDY_BANNER_LINK_TYPE;
        case 2: // BUDDY_BANNER_LINK
          return BUDDY_BANNER_LINK;
        case 3: // BUDDY_BANNER_IMAGE_URL
          return BUDDY_BANNER_IMAGE_URL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUDDY_BANNER_LINK_TYPE, new org.apache.thrift.meta_data.FieldMetaData("buddyBannerLinkType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BuddyBannerLinkType.class)));
    tmpMap.put(_Fields.BUDDY_BANNER_LINK, new org.apache.thrift.meta_data.FieldMetaData("buddyBannerLink", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BUDDY_BANNER_IMAGE_URL, new org.apache.thrift.meta_data.FieldMetaData("buddyBannerImageUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuddyBanner.class, metaDataMap);
  }

  public BuddyBanner() {
  }

  public BuddyBanner(
    BuddyBannerLinkType buddyBannerLinkType,
    String buddyBannerLink,
    String buddyBannerImageUrl)
  {
    this();
    this.buddyBannerLinkType = buddyBannerLinkType;
    this.buddyBannerLink = buddyBannerLink;
    this.buddyBannerImageUrl = buddyBannerImageUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuddyBanner(BuddyBanner other) {
    if (other.isSetBuddyBannerLinkType()) {
      this.buddyBannerLinkType = other.buddyBannerLinkType;
    }
    if (other.isSetBuddyBannerLink()) {
      this.buddyBannerLink = other.buddyBannerLink;
    }
    if (other.isSetBuddyBannerImageUrl()) {
      this.buddyBannerImageUrl = other.buddyBannerImageUrl;
    }
  }

  public BuddyBanner deepCopy() {
    return new BuddyBanner(this);
  }

  @Override
  public void clear() {
    this.buddyBannerLinkType = null;
    this.buddyBannerLink = null;
    this.buddyBannerImageUrl = null;
  }

  /**
   * 
   * @see BuddyBannerLinkType
   */
  public BuddyBannerLinkType getBuddyBannerLinkType() {
    return this.buddyBannerLinkType;
  }

  /**
   * 
   * @see BuddyBannerLinkType
   */
  public BuddyBanner setBuddyBannerLinkType(BuddyBannerLinkType buddyBannerLinkType) {
    this.buddyBannerLinkType = buddyBannerLinkType;
    return this;
  }

  public void unsetBuddyBannerLinkType() {
    this.buddyBannerLinkType = null;
  }

  /** Returns true if field buddyBannerLinkType is set (has been assigned a value) and false otherwise */
  public boolean isSetBuddyBannerLinkType() {
    return this.buddyBannerLinkType != null;
  }

  public void setBuddyBannerLinkTypeIsSet(boolean value) {
    if (!value) {
      this.buddyBannerLinkType = null;
    }
  }

  public String getBuddyBannerLink() {
    return this.buddyBannerLink;
  }

  public BuddyBanner setBuddyBannerLink(String buddyBannerLink) {
    this.buddyBannerLink = buddyBannerLink;
    return this;
  }

  public void unsetBuddyBannerLink() {
    this.buddyBannerLink = null;
  }

  /** Returns true if field buddyBannerLink is set (has been assigned a value) and false otherwise */
  public boolean isSetBuddyBannerLink() {
    return this.buddyBannerLink != null;
  }

  public void setBuddyBannerLinkIsSet(boolean value) {
    if (!value) {
      this.buddyBannerLink = null;
    }
  }

  public String getBuddyBannerImageUrl() {
    return this.buddyBannerImageUrl;
  }

  public BuddyBanner setBuddyBannerImageUrl(String buddyBannerImageUrl) {
    this.buddyBannerImageUrl = buddyBannerImageUrl;
    return this;
  }

  public void unsetBuddyBannerImageUrl() {
    this.buddyBannerImageUrl = null;
  }

  /** Returns true if field buddyBannerImageUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetBuddyBannerImageUrl() {
    return this.buddyBannerImageUrl != null;
  }

  public void setBuddyBannerImageUrlIsSet(boolean value) {
    if (!value) {
      this.buddyBannerImageUrl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BUDDY_BANNER_LINK_TYPE:
      if (value == null) {
        unsetBuddyBannerLinkType();
      } else {
        setBuddyBannerLinkType((BuddyBannerLinkType)value);
      }
      break;

    case BUDDY_BANNER_LINK:
      if (value == null) {
        unsetBuddyBannerLink();
      } else {
        setBuddyBannerLink((String)value);
      }
      break;

    case BUDDY_BANNER_IMAGE_URL:
      if (value == null) {
        unsetBuddyBannerImageUrl();
      } else {
        setBuddyBannerImageUrl((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BUDDY_BANNER_LINK_TYPE:
      return getBuddyBannerLinkType();

    case BUDDY_BANNER_LINK:
      return getBuddyBannerLink();

    case BUDDY_BANNER_IMAGE_URL:
      return getBuddyBannerImageUrl();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BUDDY_BANNER_LINK_TYPE:
      return isSetBuddyBannerLinkType();
    case BUDDY_BANNER_LINK:
      return isSetBuddyBannerLink();
    case BUDDY_BANNER_IMAGE_URL:
      return isSetBuddyBannerImageUrl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuddyBanner)
      return this.equals((BuddyBanner)that);
    return false;
  }

  public boolean equals(BuddyBanner that) {
    if (that == null)
      return false;

    boolean this_present_buddyBannerLinkType = true && this.isSetBuddyBannerLinkType();
    boolean that_present_buddyBannerLinkType = true && that.isSetBuddyBannerLinkType();
    if (this_present_buddyBannerLinkType || that_present_buddyBannerLinkType) {
      if (!(this_present_buddyBannerLinkType && that_present_buddyBannerLinkType))
        return false;
      if (!this.buddyBannerLinkType.equals(that.buddyBannerLinkType))
        return false;
    }

    boolean this_present_buddyBannerLink = true && this.isSetBuddyBannerLink();
    boolean that_present_buddyBannerLink = true && that.isSetBuddyBannerLink();
    if (this_present_buddyBannerLink || that_present_buddyBannerLink) {
      if (!(this_present_buddyBannerLink && that_present_buddyBannerLink))
        return false;
      if (!this.buddyBannerLink.equals(that.buddyBannerLink))
        return false;
    }

    boolean this_present_buddyBannerImageUrl = true && this.isSetBuddyBannerImageUrl();
    boolean that_present_buddyBannerImageUrl = true && that.isSetBuddyBannerImageUrl();
    if (this_present_buddyBannerImageUrl || that_present_buddyBannerImageUrl) {
      if (!(this_present_buddyBannerImageUrl && that_present_buddyBannerImageUrl))
        return false;
      if (!this.buddyBannerImageUrl.equals(that.buddyBannerImageUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(BuddyBanner other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBuddyBannerLinkType()).compareTo(other.isSetBuddyBannerLinkType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuddyBannerLinkType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buddyBannerLinkType, other.buddyBannerLinkType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuddyBannerLink()).compareTo(other.isSetBuddyBannerLink());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuddyBannerLink()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buddyBannerLink, other.buddyBannerLink);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuddyBannerImageUrl()).compareTo(other.isSetBuddyBannerImageUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuddyBannerImageUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buddyBannerImageUrl, other.buddyBannerImageUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BuddyBanner(");
    boolean first = true;

    sb.append("buddyBannerLinkType:");
    if (this.buddyBannerLinkType == null) {
      sb.append("null");
    } else {
      sb.append(this.buddyBannerLinkType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("buddyBannerLink:");
    if (this.buddyBannerLink == null) {
      sb.append("null");
    } else {
      sb.append(this.buddyBannerLink);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("buddyBannerImageUrl:");
    if (this.buddyBannerImageUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.buddyBannerImageUrl);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuddyBannerStandardSchemeFactory implements SchemeFactory {
    public BuddyBannerStandardScheme getScheme() {
      return new BuddyBannerStandardScheme();
    }
  }

  private static class BuddyBannerStandardScheme extends StandardScheme<BuddyBanner> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuddyBanner struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BUDDY_BANNER_LINK_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.buddyBannerLinkType = BuddyBannerLinkType.findByValue(iprot.readI32());
              struct.setBuddyBannerLinkTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUDDY_BANNER_LINK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.buddyBannerLink = iprot.readString();
              struct.setBuddyBannerLinkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BUDDY_BANNER_IMAGE_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.buddyBannerImageUrl = iprot.readString();
              struct.setBuddyBannerImageUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuddyBanner struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.buddyBannerLinkType != null) {
        oprot.writeFieldBegin(BUDDY_BANNER_LINK_TYPE_FIELD_DESC);
        oprot.writeI32(struct.buddyBannerLinkType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.buddyBannerLink != null) {
        oprot.writeFieldBegin(BUDDY_BANNER_LINK_FIELD_DESC);
        oprot.writeString(struct.buddyBannerLink);
        oprot.writeFieldEnd();
      }
      if (struct.buddyBannerImageUrl != null) {
        oprot.writeFieldBegin(BUDDY_BANNER_IMAGE_URL_FIELD_DESC);
        oprot.writeString(struct.buddyBannerImageUrl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuddyBannerTupleSchemeFactory implements SchemeFactory {
    public BuddyBannerTupleScheme getScheme() {
      return new BuddyBannerTupleScheme();
    }
  }

  private static class BuddyBannerTupleScheme extends TupleScheme<BuddyBanner> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuddyBanner struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBuddyBannerLinkType()) {
        optionals.set(0);
      }
      if (struct.isSetBuddyBannerLink()) {
        optionals.set(1);
      }
      if (struct.isSetBuddyBannerImageUrl()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBuddyBannerLinkType()) {
        oprot.writeI32(struct.buddyBannerLinkType.getValue());
      }
      if (struct.isSetBuddyBannerLink()) {
        oprot.writeString(struct.buddyBannerLink);
      }
      if (struct.isSetBuddyBannerImageUrl()) {
        oprot.writeString(struct.buddyBannerImageUrl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuddyBanner struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.buddyBannerLinkType = BuddyBannerLinkType.findByValue(iprot.readI32());
        struct.setBuddyBannerLinkTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.buddyBannerLink = iprot.readString();
        struct.setBuddyBannerLinkIsSet(true);
      }
      if (incoming.get(2)) {
        struct.buddyBannerImageUrl = iprot.readString();
        struct.setBuddyBannerImageUrlIsSet(true);
      }
    }
  }

}
