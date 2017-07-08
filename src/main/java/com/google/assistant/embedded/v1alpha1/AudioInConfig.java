// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/assistant/embedded/v1alpha1/embedded_assistant.proto

package com.google.assistant.embedded.v1alpha1;

/**
 * <pre>
 * Specifies how to process the `audio_in` data that will be provided in
 * subsequent requests. For recommended settings, see the Google Assistant SDK
 * [best practices](https://developers.google.com/assistant/best-practices).
 * </pre>
 *
 * Protobuf type {@code google.assistant.embedded.v1alpha1.AudioInConfig} */
public final class AudioInConfig extends com.google.protobuf.GeneratedMessageV3 implements
// @@protoc_insertion_point(message_implements:google.assistant.embedded.v1alpha1.AudioInConfig)
	AudioInConfigOrBuilder {
	// Use AudioInConfig.newBuilder() to construct.
	private AudioInConfig (com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private AudioInConfig () {
		encoding_ = 0;
		sampleRateHertz_ = 0;
	}

	@java.lang.Override
	public final com.google.protobuf.UnknownFieldSet getUnknownFields () {
		return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
	}

	private AudioInConfig (com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
		throws com.google.protobuf.InvalidProtocolBufferException {
		this();
		int mutable_bitField0_ = 0;
		try {
			boolean done = false;
			while (!done) {
				int tag = input.readTag();
				switch (tag) {
				case 0:
					done = true;
					break;
				default: {
					if (!input.skipField(tag)) {
						done = true;
					}
					break;
				}
				case 8: {
					int rawValue = input.readEnum();

					encoding_ = rawValue;
					break;
				}
				case 16: {

					sampleRateHertz_ = input.readInt32();
					break;
				}
				}
			}
		} catch (com.google.protobuf.InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (java.io.IOException e) {
			throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
		} finally {
			makeExtensionsImmutable();
		}
	}

	public static final com.google.protobuf.Descriptors.Descriptor getDescriptor () {
		return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_AudioInConfig_descriptor;
	}

	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable () {
		return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_AudioInConfig_fieldAccessorTable
			.ensureFieldAccessorsInitialized(com.google.assistant.embedded.v1alpha1.AudioInConfig.class,
				com.google.assistant.embedded.v1alpha1.AudioInConfig.Builder.class);
	}

	/**
	 * <pre>
	 * Audio encoding of the data sent in the audio message.
	 * Audio must be one-channel (mono). The only language supported is "en-US".
	 * </pre>
	 *
	 * Protobuf enum {@code google.assistant.embedded.v1alpha1.AudioInConfig.Encoding} */
	public enum Encoding implements com.google.protobuf.ProtocolMessageEnum {
		/**
		 * <pre>
		 * Not specified. Will return result [google.rpc.Code.INVALID_ARGUMENT][].
		 * </pre>
		 *
		 * <code>ENCODING_UNSPECIFIED = 0;</code> */
		ENCODING_UNSPECIFIED(0),
		/**
		 * <pre>
		 * Uncompressed 16-bit signed little-endian samples (Linear PCM).
		 * This encoding includes no header, only the raw audio bytes.
		 * </pre>
		 *
		 * <code>LINEAR16 = 1;</code> */
		LINEAR16(1),
		/**
		 * <pre>
		 * [`FLAC`](https://xiph.org/flac/documentation.html) (Free Lossless Audio
		 * Codec) is the recommended encoding because it is
		 * lossless--therefore recognition is not compromised--and
		 * requires only about half the bandwidth of `LINEAR16`. This encoding
		 * includes the `FLAC` stream header followed by audio data. It supports
		 * 16-bit and 24-bit samples, however, not all fields in `STREAMINFO` are
		 * supported.
		 * </pre>
		 *
		 * <code>FLAC = 2;</code> */
		FLAC(2), UNRECOGNIZED(-1),;

		/**
		 * <pre>
		 * Not specified. Will return result [google.rpc.Code.INVALID_ARGUMENT][].
		 * </pre>
		 *
		 * <code>ENCODING_UNSPECIFIED = 0;</code> */
		public static final int ENCODING_UNSPECIFIED_VALUE = 0;
		/**
		 * <pre>
		 * Uncompressed 16-bit signed little-endian samples (Linear PCM).
		 * This encoding includes no header, only the raw audio bytes.
		 * </pre>
		 *
		 * <code>LINEAR16 = 1;</code> */
		public static final int LINEAR16_VALUE = 1;
		/**
		 * <pre>
		 * [`FLAC`](https://xiph.org/flac/documentation.html) (Free Lossless Audio
		 * Codec) is the recommended encoding because it is
		 * lossless--therefore recognition is not compromised--and
		 * requires only about half the bandwidth of `LINEAR16`. This encoding
		 * includes the `FLAC` stream header followed by audio data. It supports
		 * 16-bit and 24-bit samples, however, not all fields in `STREAMINFO` are
		 * supported.
		 * </pre>
		 *
		 * <code>FLAC = 2;</code> */
		public static final int FLAC_VALUE = 2;

		public final int getNumber () {
			if (this == UNRECOGNIZED) {
				throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
			}
			return value;
		}

		/** @deprecated Use {@link #forNumber(int)} instead. */
		@java.lang.Deprecated
		public static Encoding valueOf (int value) {
			return forNumber(value);
		}

		public static Encoding forNumber (int value) {
			switch (value) {
			case 0:
				return ENCODING_UNSPECIFIED;
			case 1:
				return LINEAR16;
			case 2:
				return FLAC;
			default:
				return null;
			}
		}

		public static com.google.protobuf.Internal.EnumLiteMap<Encoding> internalGetValueMap () {
			return internalValueMap;
		}

		private static final com.google.protobuf.Internal.EnumLiteMap<Encoding> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<Encoding>() {
			public Encoding findValueByNumber (int number) {
				return Encoding.forNumber(number);
			}
		};

		public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor () {
			return getDescriptor().getValues().get(ordinal());
		}

		public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType () {
			return getDescriptor();
		}

		public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor () {
			return com.google.assistant.embedded.v1alpha1.AudioInConfig.getDescriptor().getEnumTypes().get(0);
		}

		private static final Encoding[] VALUES = values();

		public static Encoding valueOf (com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
			if (desc.getType() != getDescriptor()) {
				throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
			}
			if (desc.getIndex() == -1) {
				return UNRECOGNIZED;
			}
			return VALUES[desc.getIndex()];
		}

		private final int value;

		private Encoding (int value) {
			this.value = value;
		}

		// @@protoc_insertion_point(enum_scope:google.assistant.embedded.v1alpha1.AudioInConfig.Encoding)
	}

	public static final int ENCODING_FIELD_NUMBER = 1;
	private int encoding_;

	/**
	 * <pre>
	 * *Required* Encoding of audio data sent in all `audio_in` messages.
	 * </pre>
	 *
	 * <code>.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding encoding = 1;</code> */
	public int getEncodingValue () {
		return encoding_;
	}

	/**
	 * <pre>
	 * *Required* Encoding of audio data sent in all `audio_in` messages.
	 * </pre>
	 *
	 * <code>.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding encoding = 1;</code> */
	public com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding getEncoding () {
		com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding result = com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding
			.valueOf(encoding_);
		return result == null ? com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding.UNRECOGNIZED : result;
	}

	public static final int SAMPLE_RATE_HERTZ_FIELD_NUMBER = 2;
	private int sampleRateHertz_;

	/**
	 * <pre>
	 * *Required* Sample rate (in Hertz) of the audio data sent in all `audio_in`
	 * messages. Valid values are from 16000-24000, but 16000 is optimal.
	 * For best results, set the sampling rate of the audio source to 16000 Hz.
	 * If that's not possible, use the native sample rate of the audio source
	 * (instead of re-sampling).
	 * </pre>
	 *
	 * <code>int32 sample_rate_hertz = 2;</code> */
	public int getSampleRateHertz () {
		return sampleRateHertz_;
	}

	private byte memoizedIsInitialized = -1;

	public final boolean isInitialized () {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1) return true;
		if (isInitialized == 0) return false;

		memoizedIsInitialized = 1;
		return true;
	}

	public void writeTo (com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
		if (encoding_ != com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding.ENCODING_UNSPECIFIED.getNumber()) {
			output.writeEnum(1, encoding_);
		}
		if (sampleRateHertz_ != 0) {
			output.writeInt32(2, sampleRateHertz_);
		}
	}

	public int getSerializedSize () {
		int size = memoizedSize;
		if (size != -1) return size;

		size = 0;
		if (encoding_ != com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding.ENCODING_UNSPECIFIED.getNumber()) {
			size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, encoding_);
		}
		if (sampleRateHertz_ != 0) {
			size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, sampleRateHertz_);
		}
		memoizedSize = size;
		return size;
	}

	private static final long serialVersionUID = 0L;

	@java.lang.Override
	public boolean equals (final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof com.google.assistant.embedded.v1alpha1.AudioInConfig)) {
			return super.equals(obj);
		}
		com.google.assistant.embedded.v1alpha1.AudioInConfig other = (com.google.assistant.embedded.v1alpha1.AudioInConfig)obj;

		boolean result = true;
		result = result && encoding_ == other.encoding_;
		result = result && (getSampleRateHertz() == other.getSampleRateHertz());
		return result;
	}

	@java.lang.Override
	public int hashCode () {
		if (memoizedHashCode != 0) {
			return memoizedHashCode;
		}
		int hash = 41;
		hash = (19 * hash) + getDescriptor().hashCode();
		hash = (37 * hash) + ENCODING_FIELD_NUMBER;
		hash = (53 * hash) + encoding_;
		hash = (37 * hash) + SAMPLE_RATE_HERTZ_FIELD_NUMBER;
		hash = (53 * hash) + getSampleRateHertz();
		hash = (29 * hash) + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig parseFrom (com.google.protobuf.ByteString data)
		throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig parseFrom (com.google.protobuf.ByteString data,
		com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig parseFrom (byte[] data)
		throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig parseFrom (byte[] data,
		com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig parseFrom (java.io.InputStream input)
		throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig parseFrom (java.io.InputStream input,
		com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig parseDelimitedFrom (java.io.InputStream input)
		throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig parseDelimitedFrom (java.io.InputStream input,
		com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig parseFrom (com.google.protobuf.CodedInputStream input)
		throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig parseFrom (com.google.protobuf.CodedInputStream input,
		com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public Builder newBuilderForType () {
		return newBuilder();
	}

	public static Builder newBuilder () {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder (com.google.assistant.embedded.v1alpha1.AudioInConfig prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder () {
		return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
	}

	@java.lang.Override
	protected Builder newBuilderForType (com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	/**
	 * <pre>
	 * Specifies how to process the `audio_in` data that will be provided in
	 * subsequent requests. For recommended settings, see the Google Assistant SDK
	 * [best practices](https://developers.google.com/assistant/best-practices).
	 * </pre>
	 *
	 * Protobuf type {@code google.assistant.embedded.v1alpha1.AudioInConfig} */
	public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
		// @@protoc_insertion_point(builder_implements:google.assistant.embedded.v1alpha1.AudioInConfig)
		com.google.assistant.embedded.v1alpha1.AudioInConfigOrBuilder {
		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor () {
			return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_AudioInConfig_descriptor;
		}

		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable () {
			return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_AudioInConfig_fieldAccessorTable
				.ensureFieldAccessorsInitialized(com.google.assistant.embedded.v1alpha1.AudioInConfig.class,
					com.google.assistant.embedded.v1alpha1.AudioInConfig.Builder.class);
		}

		// Construct using com.google.assistant.embedded.v1alpha1.AudioInConfig.newBuilder()
		private Builder () {
			maybeForceBuilderInitialization();
		}

		private Builder (com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization () {
			if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
			}
		}

		public Builder clear () {
			super.clear();
			encoding_ = 0;

			sampleRateHertz_ = 0;

			return this;
		}

		public com.google.protobuf.Descriptors.Descriptor getDescriptorForType () {
			return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_AudioInConfig_descriptor;
		}

		public com.google.assistant.embedded.v1alpha1.AudioInConfig getDefaultInstanceForType () {
			return com.google.assistant.embedded.v1alpha1.AudioInConfig.getDefaultInstance();
		}

		public com.google.assistant.embedded.v1alpha1.AudioInConfig build () {
			com.google.assistant.embedded.v1alpha1.AudioInConfig result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public com.google.assistant.embedded.v1alpha1.AudioInConfig buildPartial () {
			com.google.assistant.embedded.v1alpha1.AudioInConfig result = new com.google.assistant.embedded.v1alpha1.AudioInConfig(
				this);
			result.encoding_ = encoding_;
			result.sampleRateHertz_ = sampleRateHertz_;
			onBuilt();
			return result;
		}

		public Builder clone () {
			return (Builder)super.clone();
		}

		public Builder setField (com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return (Builder)super.setField(field, value);
		}

		public Builder clearField (com.google.protobuf.Descriptors.FieldDescriptor field) {
			return (Builder)super.clearField(field);
		}

		public Builder clearOneof (com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return (Builder)super.clearOneof(oneof);
		}

		public Builder setRepeatedField (com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
			return (Builder)super.setRepeatedField(field, index, value);
		}

		public Builder addRepeatedField (com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return (Builder)super.addRepeatedField(field, value);
		}

		public Builder mergeFrom (com.google.protobuf.Message other) {
			if (other instanceof com.google.assistant.embedded.v1alpha1.AudioInConfig) {
				return mergeFrom((com.google.assistant.embedded.v1alpha1.AudioInConfig)other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom (com.google.assistant.embedded.v1alpha1.AudioInConfig other) {
			if (other == com.google.assistant.embedded.v1alpha1.AudioInConfig.getDefaultInstance()) return this;
			if (other.encoding_ != 0) {
				setEncodingValue(other.getEncodingValue());
			}
			if (other.getSampleRateHertz() != 0) {
				setSampleRateHertz(other.getSampleRateHertz());
			}
			onChanged();
			return this;
		}

		public final boolean isInitialized () {
			return true;
		}

		public Builder mergeFrom (com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			com.google.assistant.embedded.v1alpha1.AudioInConfig parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				parsedMessage = (com.google.assistant.embedded.v1alpha1.AudioInConfig)e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		private int encoding_ = 0;

		/**
		 * <pre>
		 * *Required* Encoding of audio data sent in all `audio_in` messages.
		 * </pre>
		 *
		 * <code>.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding encoding = 1;</code> */
		public int getEncodingValue () {
			return encoding_;
		}

		/**
		 * <pre>
		 * *Required* Encoding of audio data sent in all `audio_in` messages.
		 * </pre>
		 *
		 * <code>.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding encoding = 1;</code> */
		public Builder setEncodingValue (int value) {
			encoding_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 * *Required* Encoding of audio data sent in all `audio_in` messages.
		 * </pre>
		 *
		 * <code>.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding encoding = 1;</code> */
		public com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding getEncoding () {
			com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding result = com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding
				.valueOf(encoding_);
			return result == null ? com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding.UNRECOGNIZED : result;
		}

		/**
		 * <pre>
		 * *Required* Encoding of audio data sent in all `audio_in` messages.
		 * </pre>
		 *
		 * <code>.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding encoding = 1;</code> */
		public Builder setEncoding (com.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding value) {
			if (value == null) {
				throw new NullPointerException();
			}

			encoding_ = value.getNumber();
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 * *Required* Encoding of audio data sent in all `audio_in` messages.
		 * </pre>
		 *
		 * <code>.google.assistant.embedded.v1alpha1.AudioInConfig.Encoding encoding = 1;</code> */
		public Builder clearEncoding () {

			encoding_ = 0;
			onChanged();
			return this;
		}

		private int sampleRateHertz_;

		/**
		 * <pre>
		 * *Required* Sample rate (in Hertz) of the audio data sent in all `audio_in`
		 * messages. Valid values are from 16000-24000, but 16000 is optimal.
		 * For best results, set the sampling rate of the audio source to 16000 Hz.
		 * If that's not possible, use the native sample rate of the audio source
		 * (instead of re-sampling).
		 * </pre>
		 *
		 * <code>int32 sample_rate_hertz = 2;</code> */
		public int getSampleRateHertz () {
			return sampleRateHertz_;
		}

		/**
		 * <pre>
		 * *Required* Sample rate (in Hertz) of the audio data sent in all `audio_in`
		 * messages. Valid values are from 16000-24000, but 16000 is optimal.
		 * For best results, set the sampling rate of the audio source to 16000 Hz.
		 * If that's not possible, use the native sample rate of the audio source
		 * (instead of re-sampling).
		 * </pre>
		 *
		 * <code>int32 sample_rate_hertz = 2;</code> */
		public Builder setSampleRateHertz (int value) {

			sampleRateHertz_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 * *Required* Sample rate (in Hertz) of the audio data sent in all `audio_in`
		 * messages. Valid values are from 16000-24000, but 16000 is optimal.
		 * For best results, set the sampling rate of the audio source to 16000 Hz.
		 * If that's not possible, use the native sample rate of the audio source
		 * (instead of re-sampling).
		 * </pre>
		 *
		 * <code>int32 sample_rate_hertz = 2;</code> */
		public Builder clearSampleRateHertz () {

			sampleRateHertz_ = 0;
			onChanged();
			return this;
		}

		public final Builder setUnknownFields (final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		public final Builder mergeUnknownFields (final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		// @@protoc_insertion_point(builder_scope:google.assistant.embedded.v1alpha1.AudioInConfig)
	}

	// @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.AudioInConfig)
	private static final com.google.assistant.embedded.v1alpha1.AudioInConfig DEFAULT_INSTANCE;
	static {
		DEFAULT_INSTANCE = new com.google.assistant.embedded.v1alpha1.AudioInConfig();
	}

	public static com.google.assistant.embedded.v1alpha1.AudioInConfig getDefaultInstance () {
		return DEFAULT_INSTANCE;
	}

	private static final com.google.protobuf.Parser<AudioInConfig> PARSER = new com.google.protobuf.AbstractParser<AudioInConfig>() {
		public AudioInConfig parsePartialFrom (com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
			return new AudioInConfig(input, extensionRegistry);
		}
	};

	public static com.google.protobuf.Parser<AudioInConfig> parser () {
		return PARSER;
	}

	@java.lang.Override
	public com.google.protobuf.Parser<AudioInConfig> getParserForType () {
		return PARSER;
	}

	public com.google.assistant.embedded.v1alpha1.AudioInConfig getDefaultInstanceForType () {
		return DEFAULT_INSTANCE;
	}

}
