package a;

import android.javax.sip.header.WarningHeader;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lko {
    public static final wko[] b;
    public static final wko[][] c;
    public static final HashSet d;
    public static final String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20209a;

    static {
        wko[] wkoVarArr = {new wko(256, 3, 4, "ImageWidth"), new wko(257, 3, 4, "ImageLength"), new wko("Make", 271, 2), new wko("Model", 272, 2), new wko("Orientation", 274, 3), new wko("XResolution", 282, 5), new wko("YResolution", 283, 5), new wko("ResolutionUnit", 296, 3), new wko("Software", 305, 2), new wko("DateTime", WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD, 2), new wko("YCbCrPositioning", 531, 3), new wko("SubIFDPointer", WarningHeader.MULTICAST_NOT_AVAILABLE, 4), new wko("ExifIFDPointer", 34665, 4), new wko("GPSInfoIFDPointer", 34853, 4)};
        wko[] wkoVarArr2 = {new wko("ExposureTime", 33434, 5), new wko("FNumber", 33437, 5), new wko("ExposureProgram", 34850, 3), new wko("PhotographicSensitivity", 34855, 3), new wko("SensitivityType", 34864, 3), new wko("ExifVersion", 36864, 2), new wko("DateTimeOriginal", 36867, 2), new wko("DateTimeDigitized", 36868, 2), new wko("ComponentsConfiguration", 37121, 7), new wko("ShutterSpeedValue", 37377, 10), new wko("ApertureValue", 37378, 5), new wko("BrightnessValue", 37379, 10), new wko("ExposureBiasValue", 37380, 10), new wko("MaxApertureValue", 37381, 5), new wko("MeteringMode", 37383, 3), new wko("LightSource", 37384, 3), new wko("Flash", 37385, 3), new wko("FocalLength", 37386, 5), new wko("SubSecTime", 37520, 2), new wko("SubSecTimeOriginal", 37521, 2), new wko("SubSecTimeDigitized", 37522, 2), new wko("FlashpixVersion", 40960, 7), new wko("ColorSpace", 40961, 3), new wko(40962, 3, 4, "PixelXDimension"), new wko(40963, 3, 4, "PixelYDimension"), new wko("InteroperabilityIFDPointer", 40965, 4), new wko("FocalPlaneResolutionUnit", 41488, 3), new wko("SensingMethod", 41495, 3), new wko("FileSource", 41728, 7), new wko("SceneType", 41729, 7), new wko("CustomRendered", 41985, 3), new wko("ExposureMode", 41986, 3), new wko("WhiteBalance", 41987, 3), new wko("SceneCaptureType", 41990, 3), new wko("Contrast", 41992, 3), new wko("Saturation", 41993, 3), new wko("Sharpness", 41994, 3)};
        wko[] wkoVarArr3 = {new wko("GPSVersionID", 0, 1), new wko("GPSLatitudeRef", 1, 2), new wko(2, 5, 10, "GPSLatitude"), new wko("GPSLongitudeRef", 3, 2), new wko(4, 5, 10, "GPSLongitude"), new wko("GPSAltitudeRef", 5, 1), new wko("GPSAltitude", 6, 5), new wko("GPSTimeStamp", 7, 5), new wko("GPSSpeedRef", 12, 2), new wko("GPSTrackRef", 14, 2), new wko("GPSImgDirectionRef", 16, 2), new wko("GPSDestBearingRef", 23, 2), new wko("GPSDestDistanceRef", 25, 2)};
        b = new wko[]{new wko("SubIFDPointer", WarningHeader.MULTICAST_NOT_AVAILABLE, 4), new wko("ExifIFDPointer", 34665, 4), new wko("GPSInfoIFDPointer", 34853, 4), new wko("InteroperabilityIFDPointer", 40965, 4)};
        c = new wko[][]{wkoVarArr, wkoVarArr2, wkoVarArr3, new wko[]{new wko("InteroperabilityIndex", 1, 2)}};
        d = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        e = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public lko(ArrayList arrayList) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        z1x.y("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.f20209a = arrayList;
    }

    public final Map a(int i) {
        z1x.v(i, 0, 4, ua80.e(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.f20209a.get(i);
    }
}
