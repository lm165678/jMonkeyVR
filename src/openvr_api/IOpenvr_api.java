package openvr_api;
import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.ann.Name;
import org.bridj.ann.Namespace;
import org.bridj.ann.Ptr;
/**
 * Interface for library <b>openvr_api</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
public interface IOpenvr_api {
	/**
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:347</i>
	 */
	public @Name("Hmd_Eye") 
	@Namespace("vr") 
	enum Hmd_Eye implements IntValuedEnum<Hmd_Eye > {
		Eye_Left(0),
		Eye_Right(1);
		Hmd_Eye(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<Hmd_Eye > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<Hmd_Eye > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:353</i>
	 */
	public @Name("GraphicsAPIConvention") 
	@Namespace("vr") 
	enum GraphicsAPIConvention implements IntValuedEnum<GraphicsAPIConvention > {
		/** Normalized Z goes from 0 at the viewer to 1 at the far clip plane */
		API_DirectX(0),
		/** Normalized Z goes from 1 at the viewer to -1 at the far clip plane */
		API_OpenGL(1);
		GraphicsAPIConvention(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<GraphicsAPIConvention > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<GraphicsAPIConvention > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:359</i>
	 */
	public @Name("HmdTrackingResult") 
	@Namespace("vr") 
	enum HmdTrackingResult implements IntValuedEnum<HmdTrackingResult > {
		TrackingResult_Uninitialized(1),
		TrackingResult_Calibrating_InProgress(100),
		TrackingResult_Calibrating_OutOfRange(101),
		TrackingResult_Running_OK(200),
		TrackingResult_Running_OutOfRange(201);
		HmdTrackingResult(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<HmdTrackingResult > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<HmdTrackingResult > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * Describes what kind of object is being tracked at a given ID<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:375</i>
	 */
	public @Name("TrackedDeviceClass") 
	@Namespace("vr") 
	enum TrackedDeviceClass implements IntValuedEnum<TrackedDeviceClass > {
		/** the ID was not valid. */
		TrackedDeviceClass_Invalid(0),
		/** Head-Mounted Displays */
		TrackedDeviceClass_HMD(1),
		/** Tracked controllers */
		TrackedDeviceClass_Controller(2),
		/** Camera and base stations that serve as tracking reference points */
		TrackedDeviceClass_TrackingReference(4),
		TrackedDeviceClass_Other(1000);
		TrackedDeviceClass(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<TrackedDeviceClass > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<TrackedDeviceClass > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * Identifies which style of tracking origin the application wants to use<br>
	 * for the poses it is requesting<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:402</i>
	 */
	public @Name("TrackingUniverseOrigin") 
	@Namespace("vr") 
	enum TrackingUniverseOrigin implements IntValuedEnum<TrackingUniverseOrigin > {
		/** Poses are provided relative to the seated zero pose */
		TrackingUniverseSeated(0),
		/** Poses are provided relative to the safe bounds configured by the user */
		TrackingUniverseStanding(1),
		/** Poses are provided in the coordinate system defined by the driver. You probably don't want this one. */
		TrackingUniverseRawAndUncalibrated(2);
		TrackingUniverseOrigin(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<TrackingUniverseOrigin > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<TrackingUniverseOrigin > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * Each entry in this enum represents a property that can be retrieved about a<br>
	 * tracked device. Many fields are only valid for one TrackedDeviceClass.<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:412</i>
	 */
	public @Name("TrackedDeviceProperty") 
	@Namespace("vr") 
	enum TrackedDeviceProperty implements IntValuedEnum<TrackedDeviceProperty > {
		Prop_TrackingSystemName_String(1000),
		Prop_ModelNumber_String(1001),
		Prop_SerialNumber_String(1002),
		Prop_RenderModelName_String(1003),
		Prop_WillDriftInYaw_Bool(1004),
		Prop_ManufacturerName_String(1005),
		Prop_TrackingFirmwareVersion_String(1006),
		Prop_HardwareRevision_String(1007),
		Prop_ReportsTimeSinceVSync_Bool(2000),
		Prop_SecondsFromVsyncToPhotons_Float(2001),
		Prop_DisplayFrequency_Float(2002),
		Prop_UserIpdMeters_Float(2003),
		Prop_CurrentUniverseId_Uint64(2004),
		Prop_PreviousUniverseId_Uint64(2005),
		Prop_DisplayFirmwareVersion_String(2006),
		Prop_AttachedDeviceId_String(3000),
		Prop_SupportedButtons_Uint64(3001),
		/** Return value is of type EVRControllerAxisType */
		Prop_Axis0Type_Int32(3002),
		/** Return value is of type EVRControllerAxisType */
		Prop_Axis1Type_Int32(3003),
		/** Return value is of type EVRControllerAxisType */
		Prop_Axis2Type_Int32(3004),
		/** Return value is of type EVRControllerAxisType */
		Prop_Axis3Type_Int32(3005),
		/** Return value is of type EVRControllerAxisType */
		Prop_Axis4Type_Int32(3006),
		Prop_FieldOfViewLeftDegrees_Float(4000),
		Prop_FieldOfViewRightDegrees_Float(4001),
		Prop_FieldOfViewTopDegrees_Float(4002),
		Prop_FieldOfViewBottomDegrees_Float(4003),
		Prop_TrackingRangeMinimumMeters_Float(4004),
		Prop_TrackingRangeMaximumMeters_Float(4005);
		TrackedDeviceProperty(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<TrackedDeviceProperty > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<TrackedDeviceProperty > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * Used to return errors that occur when reading properties.<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:459</i>
	 */
	public @Name("TrackedPropertyError") 
	@Namespace("vr") 
	enum TrackedPropertyError implements IntValuedEnum<TrackedPropertyError > {
		TrackedProp_Success(0),
		TrackedProp_WrongDataType(1),
		TrackedProp_WrongDeviceClass(2),
		TrackedProp_BufferTooSmall(3),
		TrackedProp_UnknownProperty(4),
		TrackedProp_InvalidDevice(5),
		TrackedProp_CouldNotContactServer(6),
		TrackedProp_ValueNotProvidedByDevice(7),
		TrackedProp_StringExceedsMaximumLength(8);
		TrackedPropertyError(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<TrackedPropertyError > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<TrackedPropertyError > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * The types of events that could be posted (and what the parameters mean for each event type)<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:501</i>
	 */
	public @Name("EVREventType") 
	@Namespace("vr") 
	enum EVREventType implements IntValuedEnum<EVREventType > {
		VREvent_None(0),
		VREvent_TrackedDeviceActivated(100),
		VREvent_TrackedDeviceDeactivated(101),
		VREvent_TrackedDeviceUpdated(102),
		/** data is controller */
		VREvent_ButtonPress(200),
		/** data is controller */
		VREvent_ButtonUnpress(201),
		/** data is controller */
		VREvent_ButtonTouch(202),
		/** data is controller */
		VREvent_ButtonUntouch(203),
		/** data is mouse */
		VREvent_MouseMove(300),
		/** data is mouse */
		VREvent_MouseButtonDown(301),
		/** data is mouse */
		VREvent_MouseButtonUp(302),
		/** data is process */
		VREvent_InputFocusCaptured(400),
		/** data is process */
		VREvent_InputFocusReleased(401);
		EVREventType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<EVREventType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<EVREventType > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * VR controller button and axis IDs<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:524</i>
	 */
	public @Name("EVRButtonId") 
	@Namespace("vr") 
	enum EVRButtonId implements IntValuedEnum<EVRButtonId > {
		k_EButton_System(0),
		k_EButton_ApplicationMenu(1),
		k_EButton_Grip(2),
		k_EButton_Axis0(32),
		k_EButton_Axis1(33),
		k_EButton_Axis2(34),
		k_EButton_Axis3(35),
		k_EButton_Axis4(36),
		k_EButton_SteamVR_Touchpad(32),
		k_EButton_SteamVR_Trigger(33),
		k_EButton_Max(64);
		EVRButtonId(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<EVRButtonId > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<EVRButtonId > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * used for simulated mouse events in overlay space<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:553</i>
	 */
	public @Name("EVRMouseButton") 
	@Namespace("vr") 
	enum EVRMouseButton implements IntValuedEnum<EVRMouseButton > {
		VRMouseButton_Left(0x0001),
		VRMouseButton_Right(0x0002),
		VRMouseButton_Middle(0x0004);
		EVRMouseButton(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<EVRMouseButton > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<EVRMouseButton > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * Identifies what kind of axis is on the controller at index n. Read this type <br>
	 * with pVRSystem->Get( nControllerDeviceIndex, Prop_Axis0Type_Int32 + n );<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:620</i>
	 */
	public @Name("EVRControllerAxisType") 
	@Namespace("vr") 
	enum EVRControllerAxisType implements IntValuedEnum<EVRControllerAxisType > {
		k_eControllerAxis_None(0),
		k_eControllerAxis_TrackPad(1),
		k_eControllerAxis_Joystick(2),
		/** Analog trigger data is in the X axis */
		k_eControllerAxis_Trigger(3);
		EVRControllerAxisType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<EVRControllerAxisType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<EVRControllerAxisType > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * determines how to provide output to the application of various event processing functions.<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:661</i>
	 */
	public @Name("EVRControllerEventOutputType") 
	@Namespace("vr") 
	enum EVRControllerEventOutputType implements IntValuedEnum<EVRControllerEventOutputType > {
		ControllerEventOutput_OSEvents(0),
		ControllerEventOutput_VREvents(1);
		EVRControllerEventOutputType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<EVRControllerEventOutputType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<EVRControllerEventOutputType > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * error codes returned by Vr_Init<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:681</i>
	 */
	public @Name("HmdError") 
	@Namespace("vr") 
	enum HmdError implements IntValuedEnum<HmdError > {
		HmdError_None(0),
		HmdError_Unknown(1),
		HmdError_Init_InstallationNotFound(100),
		HmdError_Init_InstallationCorrupt(101),
		HmdError_Init_VRClientDLLNotFound(102),
		HmdError_Init_FileNotFound(103),
		HmdError_Init_FactoryNotFound(104),
		HmdError_Init_InterfaceNotFound(105),
		HmdError_Init_InvalidInterface(106),
		HmdError_Init_UserConfigDirectoryInvalid(107),
		HmdError_Init_HmdNotFound(108),
		HmdError_Init_NotInitialized(109),
		HmdError_Init_PathRegistryNotFound(110),
		HmdError_Init_NoConfigPath(111),
		HmdError_Init_NoLogPath(112),
		HmdError_Init_PathRegistryNotWritable(113),
		HmdError_Driver_Failed(200),
		HmdError_Driver_Unknown(201),
		HmdError_Driver_HmdUnknown(202),
		HmdError_Driver_NotLoaded(203),
		HmdError_Driver_RuntimeOutOfDate(204),
		HmdError_Driver_HmdInUse(205),
		HmdError_IPC_ServerInitFailed(300),
		HmdError_IPC_ConnectFailed(301),
		HmdError_IPC_SharedStateInitFailed(302),
		HmdError_IPC_CompositorInitFailed(303),
		HmdError_IPC_MutexInitFailed(304),
		HmdError_VendorSpecific_UnableToConnectToOculusRuntime(1000),
		HmdError_Steam_SteamInstallationNotFound(2000);
		HmdError(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<HmdError > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<HmdError > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:1000</i>
	 */
	public @Name("ChaperoneCalibrationState") 
	@Namespace("vr") 
	enum ChaperoneCalibrationState implements IntValuedEnum<ChaperoneCalibrationState > {
		/** Chaperone is fully calibrated and working correctly */
		ChaperoneCalibrationState_OK(1),
		ChaperoneCalibrationState_Warning(100),
		/** A base station thinks that it might have moved */
		ChaperoneCalibrationState_Warning_BaseStationMayHaveMoved(101),
		/** There are less base stations than when calibrated */
		ChaperoneCalibrationState_Warning_BaseStationRemoved(102),
		/** Seated bounds haven't been calibrated for the current tracking center */
		ChaperoneCalibrationState_Warning_SeatedBoundsInvalid(103),
		ChaperoneCalibrationState_Error(200),
		/** Tracking center hasn't be calibrated for at least one of the base stations */
		ChaperoneCalibrationState_Error_BaseStationUninitalized(201),
		/** Tracking center is calibrated, but base stations disagree on the tracking space */
		ChaperoneCalibrationState_Error_BaseStationConflict(202),
		/** Soft bounds haven't been calibrated for the current tracking center */
		ChaperoneCalibrationState_Error_SoftBoundsInvalid(203),
		/** Hard bounds haven't been calibrated for the current tracking center */
		ChaperoneCalibrationState_Error_HardBoundsInvalid(204);
		ChaperoneCalibrationState(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<ChaperoneCalibrationState > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<ChaperoneCalibrationState > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * Identifies the graphics API for the associated device<br>
	 * enum values<br>
	 * <i>native declaration : /usr/include/stdint.h:1080</i>
	 */
	public @Name("Compositor_DeviceType") 
	@Namespace("vr") 
	enum Compositor_DeviceType implements IntValuedEnum<Compositor_DeviceType > {
		Compositor_DeviceType_None(0),
		Compositor_DeviceType_D3D9(1),
		Compositor_DeviceType_D3D9Ex(2),
		Compositor_DeviceType_D3D10(3),
		Compositor_DeviceType_D3D11(4),
		Compositor_DeviceType_OpenGL(5);
		Compositor_DeviceType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<Compositor_DeviceType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<Compositor_DeviceType > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public static final int k_unTrackingStringSize = 32;
	public static final int k_unMaxTrackedDeviceCount = 16;
	public static final int k_unTrackedDeviceIndex_Hmd = 0;
	public static final int k_unTrackedDeviceIndexInvalid = 0xFFFFFFFF;
	/** No string property will ever be longer than this length */
	public static final int k_unMaxPropertyStringSize = 32 * 1024;
	/** the number of axes in the controller state */
	public static final int k_unControllerStateAxisCount = 5;
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int _STDINT_H = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int _FEATURES_H = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int _DEFAULT_SOURCE = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int _BSD_SOURCE = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int _SVID_SOURCE = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_POSIX_IMPLICITLY = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int _POSIX_SOURCE = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int _POSIX_C_SOURCE = (int)200809;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_POSIX = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_POSIX2 = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_POSIX199309 = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_POSIX199506 = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_XOPEN2K = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_ISOC95 = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_ISOC99 = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_XOPEN2K8 = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int _ATFILE_SOURCE = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_MISC = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_BSD = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_SVID = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_ATFILE = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __USE_FORTIFY_LEVEL = (int)0;
	/** <i>native declaration : /usr/include/stdc-predef.h</i> */
	public static final int _STDC_PREDEF_H = (int)1;
	/** <i>native declaration : /usr/include/stdc-predef.h</i> */
	public static final int __STDC_IEC_559__ = (int)1;
	/** <i>native declaration : /usr/include/stdc-predef.h</i> */
	public static final int __STDC_IEC_559_COMPLEX__ = (int)1;
	/** <i>native declaration : /usr/include/stdc-predef.h</i> */
	public static final int __STDC_ISO_10646__ = (int)201103;
	/** <i>native declaration : /usr/include/stdc-predef.h</i> */
	public static final int __STDC_NO_THREADS__ = (int)1;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __GNU_LIBRARY__ = (int)6;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __GLIBC__ = (int)2;
	/** <i>native declaration : /usr/include/features.h</i> */
	public static final int __GLIBC_MINOR__ = (int)19;
	/** <i>native declaration : /usr/include/sys/cdefs.h</i> */
	public static final int _SYS_CDEFS_H = (int)1;
	/** <i>native declaration : /usr/include/bits/wordsize.h</i> */
	public static final int __WORDSIZE = (int)64;
	/** <i>native declaration : /usr/include/bits/wordsize.h</i> */
	public static final int __WORDSIZE_TIME64_COMPAT32 = (int)1;
	/** <i>native declaration : /usr/include/bits/wordsize.h</i> */
	public static final int __SYSCALL_WORDSIZE = (int)64;
	/** <i>native declaration : /usr/include/bits/wchar.h</i> */
	public static final int _BITS_WCHAR_H = (int)1;
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT8_MIN = (int)(-128);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT16_MIN = (int)(-32767 - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT32_MIN = (int)(-2147483647 - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INT64_MIN = (long)(-9223372036854775807L - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT8_MAX = (int)(127);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT16_MAX = (int)(32767);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT32_MAX = (int)(2147483647);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INT64_MAX = (long)(9223372036854775807L);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int UINT8_MAX = (int)(255);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int UINT16_MAX = (int)(65535);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long UINT32_MAX = (long)(4294967295L);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT_LEAST8_MIN = (int)(-128);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT_LEAST16_MIN = (int)(-32767 - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT_LEAST32_MIN = (int)(-2147483647 - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INT_LEAST64_MIN = (long)(-9223372036854775807L - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT_LEAST8_MAX = (int)(127);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT_LEAST16_MAX = (int)(32767);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT_LEAST32_MAX = (int)(2147483647);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INT_LEAST64_MAX = (long)(9223372036854775807L);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int UINT_LEAST8_MAX = (int)(255);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int UINT_LEAST16_MAX = (int)(65535);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long UINT_LEAST32_MAX = (long)(4294967295L);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT_FAST8_MIN = (int)(-128);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INT_FAST16_MIN = (long)(-9223372036854775807L - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INT_FAST32_MIN = (long)(-9223372036854775807L - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INT_FAST64_MIN = (long)(-9223372036854775807L - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int INT_FAST8_MAX = (int)(127);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INT_FAST16_MAX = (long)(9223372036854775807L);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INT_FAST32_MAX = (long)(9223372036854775807L);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INT_FAST64_MAX = (long)(9223372036854775807L);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int UINT_FAST8_MAX = (int)(255);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INTPTR_MIN = (long)(-9223372036854775807L - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INTPTR_MAX = (long)(9223372036854775807L);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INTMAX_MIN = (long)(-9223372036854775807L - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long INTMAX_MAX = (long)(9223372036854775807L);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long PTRDIFF_MIN = (long)(-9223372036854775807L - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long PTRDIFF_MAX = (long)(9223372036854775807L);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int SIG_ATOMIC_MIN = (int)(-2147483647 - 1);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int SIG_ATOMIC_MAX = (int)(2147483647);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final int WINT_MIN = (int)(0);
	/** <i>native declaration : /usr/include/stdint.h</i> */
	public static final long WINT_MAX = (long)(4294967295L);
	@Name("VR_Init") 
	@Ptr 
	long vRInit(@Ptr long peError);
	/**
	 * Original signature : <code>void VR_Shutdown()</code><br>
	 * <i>native declaration : /usr/include/stdint.h:1348</i>
	 */
	@Name("VR_Shutdown") 
	void vRShutdown();
	/**
	 * Original signature : <code>bool VR_IsHmdPresent()</code><br>
	 * <i>native declaration : /usr/include/stdint.h:1354</i>
	 */
	@Name("VR_IsHmdPresent") 
	boolean vRIsHmdPresent();
	@Name("VR_GetStringForHmdError") 
	@Ptr 
	long vRGetStringForHmdError(@Ptr long error);
	@Name("VR_GetGenericInterface") 
	@Ptr 
	long vRGetGenericInterface(@Ptr long pchInterfaceVersion, @Ptr long peError);
	/** Undefined type */
	public static interface TrackedDeviceIndex_t {
		
	};
	/** Undefined type */
	public static interface VRControllerState_t {
		
	};
}
