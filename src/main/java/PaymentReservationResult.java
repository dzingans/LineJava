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

public class PaymentReservationResult implements org.apache.thrift.TBase<PaymentReservationResult, PaymentReservationResult._Fields>, java.io.Serializable, Cloneable, Comparable<PaymentReservationResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PaymentReservationResult");

  private static final org.apache.thrift.protocol.TField ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("orderId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CONFIRM_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("confirmUrl", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXTRAS_FIELD_DESC = new org.apache.thrift.protocol.TField("extras", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PaymentReservationResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PaymentReservationResultTupleSchemeFactory());
  }

  public String orderId; // required
  public String confirmUrl; // required
  public Map<String,String> extras; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORDER_ID((short)1, "orderId"),
    CONFIRM_URL((short)2, "confirmUrl"),
    EXTRAS((short)3, "extras");

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
        case 1: // ORDER_ID
          return ORDER_ID;
        case 2: // CONFIRM_URL
          return CONFIRM_URL;
        case 3: // EXTRAS
          return EXTRAS;
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
    tmpMap.put(_Fields.ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("orderId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONFIRM_URL, new org.apache.thrift.meta_data.FieldMetaData("confirmUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTRAS, new org.apache.thrift.meta_data.FieldMetaData("extras", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PaymentReservationResult.class, metaDataMap);
  }

  public PaymentReservationResult() {
  }

  public PaymentReservationResult(
    String orderId,
    String confirmUrl,
    Map<String,String> extras)
  {
    this();
    this.orderId = orderId;
    this.confirmUrl = confirmUrl;
    this.extras = extras;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaymentReservationResult(PaymentReservationResult other) {
    if (other.isSetOrderId()) {
      this.orderId = other.orderId;
    }
    if (other.isSetConfirmUrl()) {
      this.confirmUrl = other.confirmUrl;
    }
    if (other.isSetExtras()) {
      Map<String,String> __this__extras = new HashMap<String,String>(other.extras);
      this.extras = __this__extras;
    }
  }

  public PaymentReservationResult deepCopy() {
    return new PaymentReservationResult(this);
  }

  @Override
  public void clear() {
    this.orderId = null;
    this.confirmUrl = null;
    this.extras = null;
  }

  public String getOrderId() {
    return this.orderId;
  }

  public PaymentReservationResult setOrderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  public void unsetOrderId() {
    this.orderId = null;
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return this.orderId != null;
  }

  public void setOrderIdIsSet(boolean value) {
    if (!value) {
      this.orderId = null;
    }
  }

  public String getConfirmUrl() {
    return this.confirmUrl;
  }

  public PaymentReservationResult setConfirmUrl(String confirmUrl) {
    this.confirmUrl = confirmUrl;
    return this;
  }

  public void unsetConfirmUrl() {
    this.confirmUrl = null;
  }

  /** Returns true if field confirmUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetConfirmUrl() {
    return this.confirmUrl != null;
  }

  public void setConfirmUrlIsSet(boolean value) {
    if (!value) {
      this.confirmUrl = null;
    }
  }

  public int getExtrasSize() {
    return (this.extras == null) ? 0 : this.extras.size();
  }

  public void putToExtras(String key, String val) {
    if (this.extras == null) {
      this.extras = new HashMap<String,String>();
    }
    this.extras.put(key, val);
  }

  public Map<String,String> getExtras() {
    return this.extras;
  }

  public PaymentReservationResult setExtras(Map<String,String> extras) {
    this.extras = extras;
    return this;
  }

  public void unsetExtras() {
    this.extras = null;
  }

  /** Returns true if field extras is set (has been assigned a value) and false otherwise */
  public boolean isSetExtras() {
    return this.extras != null;
  }

  public void setExtrasIsSet(boolean value) {
    if (!value) {
      this.extras = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORDER_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        setOrderId((String)value);
      }
      break;

    case CONFIRM_URL:
      if (value == null) {
        unsetConfirmUrl();
      } else {
        setConfirmUrl((String)value);
      }
      break;

    case EXTRAS:
      if (value == null) {
        unsetExtras();
      } else {
        setExtras((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORDER_ID:
      return getOrderId();

    case CONFIRM_URL:
      return getConfirmUrl();

    case EXTRAS:
      return getExtras();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ORDER_ID:
      return isSetOrderId();
    case CONFIRM_URL:
      return isSetConfirmUrl();
    case EXTRAS:
      return isSetExtras();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PaymentReservationResult)
      return this.equals((PaymentReservationResult)that);
    return false;
  }

  public boolean equals(PaymentReservationResult that) {
    if (that == null)
      return false;

    boolean this_present_orderId = true && this.isSetOrderId();
    boolean that_present_orderId = true && that.isSetOrderId();
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (!this.orderId.equals(that.orderId))
        return false;
    }

    boolean this_present_confirmUrl = true && this.isSetConfirmUrl();
    boolean that_present_confirmUrl = true && that.isSetConfirmUrl();
    if (this_present_confirmUrl || that_present_confirmUrl) {
      if (!(this_present_confirmUrl && that_present_confirmUrl))
        return false;
      if (!this.confirmUrl.equals(that.confirmUrl))
        return false;
    }

    boolean this_present_extras = true && this.isSetExtras();
    boolean that_present_extras = true && that.isSetExtras();
    if (this_present_extras || that_present_extras) {
      if (!(this_present_extras && that_present_extras))
        return false;
      if (!this.extras.equals(that.extras))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PaymentReservationResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOrderId()).compareTo(other.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderId, other.orderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConfirmUrl()).compareTo(other.isSetConfirmUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfirmUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.confirmUrl, other.confirmUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtras()).compareTo(other.isSetExtras());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtras()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extras, other.extras);
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
    StringBuilder sb = new StringBuilder("PaymentReservationResult(");
    boolean first = true;

    sb.append("orderId:");
    if (this.orderId == null) {
      sb.append("null");
    } else {
      sb.append(this.orderId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("confirmUrl:");
    if (this.confirmUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.confirmUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("extras:");
    if (this.extras == null) {
      sb.append("null");
    } else {
      sb.append(this.extras);
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

  private static class PaymentReservationResultStandardSchemeFactory implements SchemeFactory {
    public PaymentReservationResultStandardScheme getScheme() {
      return new PaymentReservationResultStandardScheme();
    }
  }

  private static class PaymentReservationResultStandardScheme extends StandardScheme<PaymentReservationResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PaymentReservationResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.orderId = iprot.readString();
              struct.setOrderIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONFIRM_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.confirmUrl = iprot.readString();
              struct.setConfirmUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXTRAS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map246 = iprot.readMapBegin();
                struct.extras = new HashMap<String,String>(2*_map246.size);
                for (int _i247 = 0; _i247 < _map246.size; ++_i247)
                {
                  String _key248;
                  String _val249;
                  _key248 = iprot.readString();
                  _val249 = iprot.readString();
                  struct.extras.put(_key248, _val249);
                }
                iprot.readMapEnd();
              }
              struct.setExtrasIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PaymentReservationResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.orderId != null) {
        oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
        oprot.writeString(struct.orderId);
        oprot.writeFieldEnd();
      }
      if (struct.confirmUrl != null) {
        oprot.writeFieldBegin(CONFIRM_URL_FIELD_DESC);
        oprot.writeString(struct.confirmUrl);
        oprot.writeFieldEnd();
      }
      if (struct.extras != null) {
        oprot.writeFieldBegin(EXTRAS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extras.size()));
          for (Map.Entry<String, String> _iter250 : struct.extras.entrySet())
          {
            oprot.writeString(_iter250.getKey());
            oprot.writeString(_iter250.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PaymentReservationResultTupleSchemeFactory implements SchemeFactory {
    public PaymentReservationResultTupleScheme getScheme() {
      return new PaymentReservationResultTupleScheme();
    }
  }

  private static class PaymentReservationResultTupleScheme extends TupleScheme<PaymentReservationResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PaymentReservationResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOrderId()) {
        optionals.set(0);
      }
      if (struct.isSetConfirmUrl()) {
        optionals.set(1);
      }
      if (struct.isSetExtras()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOrderId()) {
        oprot.writeString(struct.orderId);
      }
      if (struct.isSetConfirmUrl()) {
        oprot.writeString(struct.confirmUrl);
      }
      if (struct.isSetExtras()) {
        {
          oprot.writeI32(struct.extras.size());
          for (Map.Entry<String, String> _iter251 : struct.extras.entrySet())
          {
            oprot.writeString(_iter251.getKey());
            oprot.writeString(_iter251.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PaymentReservationResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.orderId = iprot.readString();
        struct.setOrderIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.confirmUrl = iprot.readString();
        struct.setConfirmUrlIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map252 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extras = new HashMap<String,String>(2*_map252.size);
          for (int _i253 = 0; _i253 < _map252.size; ++_i253)
          {
            String _key254;
            String _val255;
            _key254 = iprot.readString();
            _val255 = iprot.readString();
            struct.extras.put(_key254, _val255);
          }
        }
        struct.setExtrasIsSet(true);
      }
    }
  }

}
