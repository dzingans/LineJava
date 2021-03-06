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

public class CreateSquareResponse implements org.apache.thrift.TBase<CreateSquareResponse, CreateSquareResponse._Fields>, java.io.Serializable, Cloneable, Comparable<CreateSquareResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CreateSquareResponse");

  private static final org.apache.thrift.protocol.TField SQUARE_FIELD_DESC = new org.apache.thrift.protocol.TField("square", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CREATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("creator", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField AUTHORITY_FIELD_DESC = new org.apache.thrift.protocol.TField("authority", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CreateSquareResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CreateSquareResponseTupleSchemeFactory());
  }

  public Square square; // required
  public SquareMember creator; // required
  public SquareAuthority authority; // required
  public SquareStatus status; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE((short)1, "square"),
    CREATOR((short)2, "creator"),
    AUTHORITY((short)3, "authority"),
    STATUS((short)4, "status");

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
        case 1: // SQUARE
          return SQUARE;
        case 2: // CREATOR
          return CREATOR;
        case 3: // AUTHORITY
          return AUTHORITY;
        case 4: // STATUS
          return STATUS;
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
    tmpMap.put(_Fields.SQUARE, new org.apache.thrift.meta_data.FieldMetaData("square", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Square.class)));
    tmpMap.put(_Fields.CREATOR, new org.apache.thrift.meta_data.FieldMetaData("creator", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class)));
    tmpMap.put(_Fields.AUTHORITY, new org.apache.thrift.meta_data.FieldMetaData("authority", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareAuthority.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareStatus.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CreateSquareResponse.class, metaDataMap);
  }

  public CreateSquareResponse() {
  }

  public CreateSquareResponse(
    Square square,
    SquareMember creator,
    SquareAuthority authority,
    SquareStatus status)
  {
    this();
    this.square = square;
    this.creator = creator;
    this.authority = authority;
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateSquareResponse(CreateSquareResponse other) {
    if (other.isSetSquare()) {
      this.square = new Square(other.square);
    }
    if (other.isSetCreator()) {
      this.creator = new SquareMember(other.creator);
    }
    if (other.isSetAuthority()) {
      this.authority = new SquareAuthority(other.authority);
    }
    if (other.isSetStatus()) {
      this.status = new SquareStatus(other.status);
    }
  }

  public CreateSquareResponse deepCopy() {
    return new CreateSquareResponse(this);
  }

  @Override
  public void clear() {
    this.square = null;
    this.creator = null;
    this.authority = null;
    this.status = null;
  }

  public Square getSquare() {
    return this.square;
  }

  public CreateSquareResponse setSquare(Square square) {
    this.square = square;
    return this;
  }

  public void unsetSquare() {
    this.square = null;
  }

  /** Returns true if field square is set (has been assigned a value) and false otherwise */
  public boolean isSetSquare() {
    return this.square != null;
  }

  public void setSquareIsSet(boolean value) {
    if (!value) {
      this.square = null;
    }
  }

  public SquareMember getCreator() {
    return this.creator;
  }

  public CreateSquareResponse setCreator(SquareMember creator) {
    this.creator = creator;
    return this;
  }

  public void unsetCreator() {
    this.creator = null;
  }

  /** Returns true if field creator is set (has been assigned a value) and false otherwise */
  public boolean isSetCreator() {
    return this.creator != null;
  }

  public void setCreatorIsSet(boolean value) {
    if (!value) {
      this.creator = null;
    }
  }

  public SquareAuthority getAuthority() {
    return this.authority;
  }

  public CreateSquareResponse setAuthority(SquareAuthority authority) {
    this.authority = authority;
    return this;
  }

  public void unsetAuthority() {
    this.authority = null;
  }

  /** Returns true if field authority is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthority() {
    return this.authority != null;
  }

  public void setAuthorityIsSet(boolean value) {
    if (!value) {
      this.authority = null;
    }
  }

  public SquareStatus getStatus() {
    return this.status;
  }

  public CreateSquareResponse setStatus(SquareStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SQUARE:
      if (value == null) {
        unsetSquare();
      } else {
        setSquare((Square)value);
      }
      break;

    case CREATOR:
      if (value == null) {
        unsetCreator();
      } else {
        setCreator((SquareMember)value);
      }
      break;

    case AUTHORITY:
      if (value == null) {
        unsetAuthority();
      } else {
        setAuthority((SquareAuthority)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((SquareStatus)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE:
      return getSquare();

    case CREATOR:
      return getCreator();

    case AUTHORITY:
      return getAuthority();

    case STATUS:
      return getStatus();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SQUARE:
      return isSetSquare();
    case CREATOR:
      return isSetCreator();
    case AUTHORITY:
      return isSetAuthority();
    case STATUS:
      return isSetStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateSquareResponse)
      return this.equals((CreateSquareResponse)that);
    return false;
  }

  public boolean equals(CreateSquareResponse that) {
    if (that == null)
      return false;

    boolean this_present_square = true && this.isSetSquare();
    boolean that_present_square = true && that.isSetSquare();
    if (this_present_square || that_present_square) {
      if (!(this_present_square && that_present_square))
        return false;
      if (!this.square.equals(that.square))
        return false;
    }

    boolean this_present_creator = true && this.isSetCreator();
    boolean that_present_creator = true && that.isSetCreator();
    if (this_present_creator || that_present_creator) {
      if (!(this_present_creator && that_present_creator))
        return false;
      if (!this.creator.equals(that.creator))
        return false;
    }

    boolean this_present_authority = true && this.isSetAuthority();
    boolean that_present_authority = true && that.isSetAuthority();
    if (this_present_authority || that_present_authority) {
      if (!(this_present_authority && that_present_authority))
        return false;
      if (!this.authority.equals(that.authority))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CreateSquareResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSquare()).compareTo(other.isSetSquare());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquare()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.square, other.square);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreator()).compareTo(other.isSetCreator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creator, other.creator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAuthority()).compareTo(other.isSetAuthority());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthority()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authority, other.authority);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
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
    StringBuilder sb = new StringBuilder("CreateSquareResponse(");
    boolean first = true;

    sb.append("square:");
    if (this.square == null) {
      sb.append("null");
    } else {
      sb.append(this.square);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("creator:");
    if (this.creator == null) {
      sb.append("null");
    } else {
      sb.append(this.creator);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("authority:");
    if (this.authority == null) {
      sb.append("null");
    } else {
      sb.append(this.authority);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (square != null) {
      square.validate();
    }
    if (creator != null) {
      creator.validate();
    }
    if (authority != null) {
      authority.validate();
    }
    if (status != null) {
      status.validate();
    }
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

  private static class CreateSquareResponseStandardSchemeFactory implements SchemeFactory {
    public CreateSquareResponseStandardScheme getScheme() {
      return new CreateSquareResponseStandardScheme();
    }
  }

  private static class CreateSquareResponseStandardScheme extends StandardScheme<CreateSquareResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CreateSquareResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.square = new Square();
              struct.square.read(iprot);
              struct.setSquareIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.creator = new SquareMember();
              struct.creator.read(iprot);
              struct.setCreatorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AUTHORITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.authority = new SquareAuthority();
              struct.authority.read(iprot);
              struct.setAuthorityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new SquareStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CreateSquareResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.square != null) {
        oprot.writeFieldBegin(SQUARE_FIELD_DESC);
        struct.square.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.creator != null) {
        oprot.writeFieldBegin(CREATOR_FIELD_DESC);
        struct.creator.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.authority != null) {
        oprot.writeFieldBegin(AUTHORITY_FIELD_DESC);
        struct.authority.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreateSquareResponseTupleSchemeFactory implements SchemeFactory {
    public CreateSquareResponseTupleScheme getScheme() {
      return new CreateSquareResponseTupleScheme();
    }
  }

  private static class CreateSquareResponseTupleScheme extends TupleScheme<CreateSquareResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CreateSquareResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSquare()) {
        optionals.set(0);
      }
      if (struct.isSetCreator()) {
        optionals.set(1);
      }
      if (struct.isSetAuthority()) {
        optionals.set(2);
      }
      if (struct.isSetStatus()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSquare()) {
        struct.square.write(oprot);
      }
      if (struct.isSetCreator()) {
        struct.creator.write(oprot);
      }
      if (struct.isSetAuthority()) {
        struct.authority.write(oprot);
      }
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CreateSquareResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.square = new Square();
        struct.square.read(iprot);
        struct.setSquareIsSet(true);
      }
      if (incoming.get(1)) {
        struct.creator = new SquareMember();
        struct.creator.read(iprot);
        struct.setCreatorIsSet(true);
      }
      if (incoming.get(2)) {
        struct.authority = new SquareAuthority();
        struct.authority.read(iprot);
        struct.setAuthorityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.status = new SquareStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
    }
  }

}

