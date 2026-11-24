package a;

import android.content.res.AssetManager;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public final class sko {
    public static final String[] G;
    public static final int[] H;
    public static final byte[] I;
    public static final pko J;
    public static final pko[][] K;
    public static final pko[] L;
    public static final HashMap[] M;
    public static final HashMap[] N;
    public static final Set O;
    public static final HashMap P;
    public static final Charset Q;
    public static final byte[] R;
    public static final byte[] S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32360a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final boolean e;
    public final HashMap[] f;
    public final HashSet g;
    public ByteOrder h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public oko n;
    public static final boolean o = Log.isLoggable("ExifInterface", 3);
    public static final List p = Arrays.asList(1, 6, 3, 8);
    public static final List q = Arrays.asList(2, 7, 4, 5);
    public static final int[] r = {8, 8, 8};
    public static final int[] s = {8};
    public static final byte[] t = {-1, -40, -1};
    public static final byte[] u = {102, 116, 121, 112};
    public static final byte[] v = {109, 105, 102, 49};
    public static final byte[] w = {104, 101, 105, 99};
    public static final byte[] x = {97, 118, 105, 102};
    public static final byte[] y = {97, 118, 105, 115};
    public static final byte[] z = {79, 76, 89, 77, 80, 0};
    public static final byte[] A = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] B = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] C = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] D = {82, 73, 70, 70};
    public static final byte[] E = {87, 69, 66, 80};
    public static final byte[] F = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        G = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        H = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        I = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        pko[] pkoVarArr = {new pko("NewSubfileType", 254, 4), new pko("SubfileType", 255, 4), new pko(256, 3, 4, "ImageWidth"), new pko(257, 3, 4, "ImageLength"), new pko("BitsPerSample", 258, 3), new pko("Compression", 259, 3), new pko("PhotometricInterpretation", 262, 3), new pko("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new pko("Make", 271, 2), new pko("Model", 272, 2), new pko(273, 3, 4, "StripOffsets"), new pko("Orientation", 274, 3), new pko("SamplesPerPixel", 277, 3), new pko(278, 3, 4, "RowsPerStrip"), new pko(279, 3, 4, "StripByteCounts"), new pko("XResolution", 282, 5), new pko("YResolution", 283, 5), new pko("PlanarConfiguration", 284, 3), new pko("ResolutionUnit", 296, 3), new pko("TransferFunction", 301, 3), new pko("Software", 305, 2), new pko("DateTime", WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD, 2), new pko("Artist", 315, 2), new pko("WhitePoint", 318, 5), new pko("PrimaryChromaticities", 319, 5), new pko("SubIFDPointer", WarningHeader.MULTICAST_NOT_AVAILABLE, 4), new pko("JPEGInterchangeFormat", Response.MESSAGE_TOO_LARGE, 4), new pko("JPEGInterchangeFormatLength", 514, 4), new pko("YCbCrCoefficients", 529, 5), new pko("YCbCrSubSampling", 530, 3), new pko("YCbCrPositioning", 531, 3), new pko("ReferenceBlackWhite", 532, 5), new pko("Copyright", 33432, 2), new pko("ExifIFDPointer", 34665, 4), new pko("GPSInfoIFDPointer", 34853, 4), new pko("SensorTopBorder", 4, 4), new pko("SensorLeftBorder", 5, 4), new pko("SensorBottomBorder", 6, 4), new pko("SensorRightBorder", 7, 4), new pko("ISO", 23, 3), new pko("JpgFromRaw", 46, 7), new pko("Xmp", 700, 1)};
        pko[] pkoVarArr2 = {new pko("ExposureTime", 33434, 5), new pko("FNumber", 33437, 5), new pko("ExposureProgram", 34850, 3), new pko("SpectralSensitivity", 34852, 2), new pko("PhotographicSensitivity", 34855, 3), new pko("OECF", 34856, 7), new pko("SensitivityType", 34864, 3), new pko("StandardOutputSensitivity", 34865, 4), new pko("RecommendedExposureIndex", 34866, 4), new pko("ISOSpeed", 34867, 4), new pko("ISOSpeedLatitudeyyy", 34868, 4), new pko("ISOSpeedLatitudezzz", 34869, 4), new pko("ExifVersion", 36864, 2), new pko("DateTimeOriginal", 36867, 2), new pko("DateTimeDigitized", 36868, 2), new pko("OffsetTime", 36880, 2), new pko("OffsetTimeOriginal", 36881, 2), new pko("OffsetTimeDigitized", 36882, 2), new pko("ComponentsConfiguration", 37121, 7), new pko("CompressedBitsPerPixel", 37122, 5), new pko("ShutterSpeedValue", 37377, 10), new pko("ApertureValue", 37378, 5), new pko("BrightnessValue", 37379, 10), new pko("ExposureBiasValue", 37380, 10), new pko("MaxApertureValue", 37381, 5), new pko("SubjectDistance", 37382, 5), new pko("MeteringMode", 37383, 3), new pko("LightSource", 37384, 3), new pko("Flash", 37385, 3), new pko("FocalLength", 37386, 5), new pko("SubjectArea", 37396, 3), new pko("MakerNote", 37500, 7), new pko("UserComment", 37510, 7), new pko("SubSecTime", 37520, 2), new pko("SubSecTimeOriginal", 37521, 2), new pko("SubSecTimeDigitized", 37522, 2), new pko("FlashpixVersion", 40960, 7), new pko("ColorSpace", 40961, 3), new pko(40962, 3, 4, "PixelXDimension"), new pko(40963, 3, 4, "PixelYDimension"), new pko("RelatedSoundFile", 40964, 2), new pko("InteroperabilityIFDPointer", 40965, 4), new pko("FlashEnergy", 41483, 5), new pko("SpatialFrequencyResponse", 41484, 7), new pko("FocalPlaneXResolution", 41486, 5), new pko("FocalPlaneYResolution", 41487, 5), new pko("FocalPlaneResolutionUnit", 41488, 3), new pko("SubjectLocation", 41492, 3), new pko("ExposureIndex", 41493, 5), new pko("SensingMethod", 41495, 3), new pko("FileSource", 41728, 7), new pko("SceneType", 41729, 7), new pko("CFAPattern", 41730, 7), new pko("CustomRendered", 41985, 3), new pko("ExposureMode", 41986, 3), new pko("WhiteBalance", 41987, 3), new pko("DigitalZoomRatio", 41988, 5), new pko("FocalLengthIn35mmFilm", 41989, 3), new pko("SceneCaptureType", 41990, 3), new pko("GainControl", 41991, 3), new pko("Contrast", 41992, 3), new pko("Saturation", 41993, 3), new pko("Sharpness", 41994, 3), new pko("DeviceSettingDescription", 41995, 7), new pko("SubjectDistanceRange", 41996, 3), new pko("ImageUniqueID", 42016, 2), new pko("CameraOwnerName", 42032, 2), new pko("BodySerialNumber", 42033, 2), new pko("LensSpecification", 42034, 5), new pko("LensMake", 42035, 2), new pko("LensModel", 42036, 2), new pko("Gamma", 42240, 5), new pko("DNGVersion", 50706, 1), new pko(50720, 3, 4, "DefaultCropSize")};
        pko[] pkoVarArr3 = {new pko("GPSVersionID", 0, 1), new pko("GPSLatitudeRef", 1, 2), new pko(2, 5, 10, "GPSLatitude"), new pko("GPSLongitudeRef", 3, 2), new pko(4, 5, 10, "GPSLongitude"), new pko("GPSAltitudeRef", 5, 1), new pko("GPSAltitude", 6, 5), new pko("GPSTimeStamp", 7, 5), new pko("GPSSatellites", 8, 2), new pko("GPSStatus", 9, 2), new pko("GPSMeasureMode", 10, 2), new pko("GPSDOP", 11, 5), new pko("GPSSpeedRef", 12, 2), new pko("GPSSpeed", 13, 5), new pko("GPSTrackRef", 14, 2), new pko("GPSTrack", 15, 5), new pko("GPSImgDirectionRef", 16, 2), new pko("GPSImgDirection", 17, 5), new pko("GPSMapDatum", 18, 2), new pko("GPSDestLatitudeRef", 19, 2), new pko("GPSDestLatitude", 20, 5), new pko("GPSDestLongitudeRef", 21, 2), new pko("GPSDestLongitude", 22, 5), new pko("GPSDestBearingRef", 23, 2), new pko("GPSDestBearing", 24, 5), new pko("GPSDestDistanceRef", 25, 2), new pko("GPSDestDistance", 26, 5), new pko("GPSProcessingMethod", 27, 7), new pko("GPSAreaInformation", 28, 7), new pko("GPSDateStamp", 29, 2), new pko("GPSDifferential", 30, 3), new pko("GPSHPositioningError", 31, 5)};
        pko[] pkoVarArr4 = {new pko("InteroperabilityIndex", 1, 2)};
        pko[] pkoVarArr5 = {new pko("NewSubfileType", 254, 4), new pko("SubfileType", 255, 4), new pko(256, 3, 4, "ThumbnailImageWidth"), new pko(257, 3, 4, "ThumbnailImageLength"), new pko("BitsPerSample", 258, 3), new pko("Compression", 259, 3), new pko("PhotometricInterpretation", 262, 3), new pko("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new pko("Make", 271, 2), new pko("Model", 272, 2), new pko(273, 3, 4, "StripOffsets"), new pko("ThumbnailOrientation", 274, 3), new pko("SamplesPerPixel", 277, 3), new pko(278, 3, 4, "RowsPerStrip"), new pko(279, 3, 4, "StripByteCounts"), new pko("XResolution", 282, 5), new pko("YResolution", 283, 5), new pko("PlanarConfiguration", 284, 3), new pko("ResolutionUnit", 296, 3), new pko("TransferFunction", 301, 3), new pko("Software", 305, 2), new pko("DateTime", WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD, 2), new pko("Artist", 315, 2), new pko("WhitePoint", 318, 5), new pko("PrimaryChromaticities", 319, 5), new pko("SubIFDPointer", WarningHeader.MULTICAST_NOT_AVAILABLE, 4), new pko("JPEGInterchangeFormat", Response.MESSAGE_TOO_LARGE, 4), new pko("JPEGInterchangeFormatLength", 514, 4), new pko("YCbCrCoefficients", 529, 5), new pko("YCbCrSubSampling", 530, 3), new pko("YCbCrPositioning", 531, 3), new pko("ReferenceBlackWhite", 532, 5), new pko("Copyright", 33432, 2), new pko("ExifIFDPointer", 34665, 4), new pko("GPSInfoIFDPointer", 34853, 4), new pko("DNGVersion", 50706, 1), new pko(50720, 3, 4, "DefaultCropSize")};
        J = new pko("StripOffsets", 273, 3);
        K = new pko[][]{pkoVarArr, pkoVarArr2, pkoVarArr3, pkoVarArr4, pkoVarArr5, pkoVarArr, new pko[]{new pko("ThumbnailImage", 256, 7), new pko("CameraSettingsIFDPointer", 8224, 4), new pko("ImageProcessingIFDPointer", 8256, 4)}, new pko[]{new pko("PreviewImageStart", 257, 4), new pko("PreviewImageLength", 258, 4)}, new pko[]{new pko("AspectFrame", 4371, 3)}, new pko[]{new pko("ColorSpace", 55, 3)}};
        L = new pko[]{new pko("SubIFDPointer", WarningHeader.MULTICAST_NOT_AVAILABLE, 4), new pko("ExifIFDPointer", 34665, 4), new pko("GPSInfoIFDPointer", 34853, 4), new pko("InteroperabilityIFDPointer", 40965, 4), new pko("CameraSettingsIFDPointer", 8224, 1), new pko("ImageProcessingIFDPointer", 8256, 1)};
        M = new HashMap[10];
        N = new HashMap[10];
        O = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        P = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        Q = charsetForName;
        R = "Exif\u0000\u0000".getBytes(charsetForName);
        S = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            pko[][] pkoVarArr6 = K;
            if (i >= pkoVarArr6.length) {
                HashMap map = P;
                pko[] pkoVarArr7 = L;
                map.put(Integer.valueOf(pkoVarArr7[0].f27145a), 5);
                map.put(Integer.valueOf(pkoVarArr7[1].f27145a), 1);
                map.put(Integer.valueOf(pkoVarArr7[2].f27145a), 2);
                map.put(Integer.valueOf(pkoVarArr7[3].f27145a), 3);
                map.put(Integer.valueOf(pkoVarArr7[4].f27145a), 7);
                map.put(Integer.valueOf(pkoVarArr7[5].f27145a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            M[i] = new HashMap();
            N[i] = new HashMap();
            for (pko pkoVar : pkoVarArr6[i]) {
                M[i].put(Integer.valueOf(pkoVar.f27145a), pkoVar);
                N[i].put(pkoVar.b, pkoVar);
            }
            i++;
        }
    }

    public sko(String str) throws Throwable {
        boolean z2;
        pko[][] pkoVarArr = K;
        this.f = new HashMap[pkoVarArr.length];
        this.g = new HashSet(pkoVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream = null;
        if (str == null) {
            hny.u("filename cannot be null");
            throw null;
        }
        this.c = null;
        this.f32360a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    if (o) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z2 = false;
                }
                if (z2) {
                    this.b = fileInputStream2.getFD();
                } else {
                    this.b = null;
                }
                r(fileInputStream2);
                acb.M(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                acb.M(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(Separators.COMMA, -1);
            String[] strArrSplit2 = strArrSplit[0].split(Separators.SLASH, -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split(Separators.SLASH, -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split(Separators.SLASH, -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals(TokenNames.S) && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals(TokenNames.E)) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static ByteOrder u(nko nkoVar) throws IOException {
        short s2 = nkoVar.readShort();
        boolean z2 = o;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            ohq.r(Integer.toHexString(s2), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void A(rko rkoVar, int i) throws IOException {
        oko okoVarD;
        oko okoVarD2;
        HashMap[] mapArr = this.f;
        oko okoVar = (oko) mapArr[i].get("DefaultCropSize");
        oko okoVar2 = (oko) mapArr[i].get("SensorTopBorder");
        oko okoVar3 = (oko) mapArr[i].get("SensorLeftBorder");
        oko okoVar4 = (oko) mapArr[i].get("SensorBottomBorder");
        oko okoVar5 = (oko) mapArr[i].get("SensorRightBorder");
        if (okoVar != null) {
            int i2 = okoVar.f25414a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                qko[] qkoVarArr = (qko[]) okoVar.h(byteOrder);
                if (qkoVarArr == null || qkoVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(qkoVarArr));
                    return;
                } else {
                    okoVarD = oko.c(new qko[]{qkoVarArr[0]}, this.h);
                    okoVarD2 = oko.c(new qko[]{qkoVarArr[1]}, this.h);
                }
            } else {
                int[] iArr = (int[]) okoVar.h(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                okoVarD = oko.d(iArr[0], this.h);
                okoVarD2 = oko.d(iArr[1], this.h);
            }
            mapArr[i].put("ImageWidth", okoVarD);
            mapArr[i].put("ImageLength", okoVarD2);
            return;
        }
        if (okoVar2 != null && okoVar3 != null && okoVar4 != null && okoVar5 != null) {
            int iF = okoVar2.f(this.h);
            int iF2 = okoVar4.f(this.h);
            int iF3 = okoVar5.f(this.h);
            int iF4 = okoVar3.f(this.h);
            if (iF2 <= iF || iF3 <= iF4) {
                return;
            }
            oko okoVarD3 = oko.d(iF2 - iF, this.h);
            oko okoVarD4 = oko.d(iF3 - iF4, this.h);
            mapArr[i].put("ImageLength", okoVarD3);
            mapArr[i].put("ImageWidth", okoVarD4);
            return;
        }
        oko okoVar6 = (oko) mapArr[i].get("ImageLength");
        oko okoVar7 = (oko) mapArr[i].get("ImageWidth");
        if (okoVar6 == null || okoVar7 == null) {
            oko okoVar8 = (oko) mapArr[i].get("JPEGInterchangeFormat");
            oko okoVar9 = (oko) mapArr[i].get("JPEGInterchangeFormatLength");
            if (okoVar8 == null || okoVar9 == null) {
                return;
            }
            int iF5 = okoVar8.f(this.h);
            int iF6 = okoVar8.f(this.h);
            rkoVar.c(iF5);
            byte[] bArr = new byte[iF6];
            rkoVar.readFully(bArr);
            g(new nko(bArr), iF5, i);
        }
    }

    public final void B() {
        z(0, 5);
        z(0, 4);
        z(5, 4);
        HashMap[] mapArr = this.f;
        oko okoVar = (oko) mapArr[1].get("PixelXDimension");
        oko okoVar2 = (oko) mapArr[1].get("PixelYDimension");
        if (okoVar != null && okoVar2 != null) {
            mapArr[0].put("ImageWidth", okoVar);
            mapArr[0].put("ImageLength", okoVar2);
        }
        if (mapArr[4].isEmpty() && q(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!q(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        x(0, "ThumbnailOrientation", "Orientation");
        x(0, "ThumbnailImageLength", "ImageLength");
        x(0, "ThumbnailImageWidth", "ImageWidth");
        x(5, "ThumbnailOrientation", "Orientation");
        x(5, "ThumbnailImageLength", "ImageLength");
        x(5, "ThumbnailImageWidth", "ImageWidth");
        x(4, "Orientation", "ThumbnailOrientation");
        x(4, "ImageLength", "ThumbnailImageLength");
        x(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap[] mapArr = this.f;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", oko.a(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", oko.b(0L, this.h));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", oko.b(0L, this.h));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", oko.b(0L, this.h));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", oko.b(0L, this.h));
        }
    }

    public final String c(String str) {
        if (str == null) {
            hny.u("tag shouldn't be null");
            return null;
        }
        oko okoVarE = e(str);
        if (okoVarE != null) {
            int i = okoVarE.f25414a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                qko[] qkoVarArr = (qko[]) okoVarE.h(this.h);
                if (qkoVarArr == null || qkoVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(qkoVarArr));
                    return null;
                }
                qko qkoVar = qkoVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (qkoVar.f28895a / qkoVar.b));
                qko qkoVar2 = qkoVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (qkoVar2.f28895a / qkoVar2.b));
                qko qkoVar3 = qkoVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (qkoVar3.f28895a / qkoVar3.b)));
            }
            boolean zContains = O.contains(str);
            ByteOrder byteOrder = this.h;
            if (!zContains) {
                return okoVarE.g(byteOrder);
            }
            try {
                return Double.toString(okoVarE.e(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int d(int i, String str) {
        oko okoVarE = e(str);
        if (okoVarE != null) {
            try {
                return okoVarE.f(this.h);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final oko e(String str) {
        oko okoVar;
        int i;
        oko okoVar2;
        if (str == null) {
            hny.u("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (o) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (okoVar2 = this.n) != null)) {
            return okoVar2;
        }
        for (int i2 = 0; i2 < K.length; i2++) {
            oko okoVar3 = (oko) this.f[i2].get(str);
            if (okoVar3 != null) {
                return okoVar3;
            }
        }
        if (!"Xmp".equals(str) || (okoVar = this.n) == null) {
            return null;
        }
        return okoVar;
    }

    public final void f(rko rkoVar, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            v4i0.p("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i3 < 31) {
            v4i0.p("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new mko(rkoVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if (AuthorizationHeaderIms.YES.equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if (AuthorizationHeaderIms.YES.equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", oko.d(Integer.parseInt(strExtractMetadata), this.h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", oko.d(Integer.parseInt(strExtractMetadata3), this.h));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", oko.d(i2, this.h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    rkoVar.c(i5);
                    byte[] bArr = new byte[6];
                    rkoVar.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, R)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    rkoVar.readFully(bArr2);
                    this.j = i7;
                    v(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    rkoVar.c(j);
                    byte[] bArr3 = new byte[i10];
                    rkoVar.readFully(bArr3);
                    this.n = new oko(j, bArr3, 1, i10);
                }
                if (o) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                    throw th;
                } catch (IOException unused2) {
                    throw th;
                }
            }
        } catch (RuntimeException e) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00af A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[LOOP:0: B:10:0x0033->B:56:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a7. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void g(a.nko r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sko.g(a.nko, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01a5  */
    public final int h(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        nko nkoVar;
        int i2;
        nko nkoVar2;
        int i3;
        int i4;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr2 = t;
            if (i5 >= bArr2.length) {
                return 4;
            }
            if (bArr[i5] != bArr2[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr[i6] != bytes[i6]) {
                        nko nkoVar3 = null;
                        try {
                            nkoVar = new nko(bArr);
                            try {
                                try {
                                    long j2 = nkoVar.readInt();
                                    byte[] bArr3 = new byte[4];
                                    nkoVar.readFully(bArr3);
                                    if (Arrays.equals(bArr3, u)) {
                                        if (j2 == 1) {
                                            j2 = nkoVar.readLong();
                                            j = 16;
                                            if (j2 < 16) {
                                            }
                                            nkoVar.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            j = 8;
                                        }
                                        if (j2 > 5000) {
                                            j2 = 5000;
                                        }
                                        long j3 = j2 - j;
                                        if (j3 < 8) {
                                            nkoVar.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            byte[] bArr4 = new byte[4];
                                            long j4 = 0;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            boolean z4 = false;
                                            while (true) {
                                                if (j4 < j3 / 4) {
                                                    try {
                                                        nkoVar.readFully(bArr4);
                                                        if (j4 != 1) {
                                                            i = 0;
                                                            try {
                                                                if (Arrays.equals(bArr4, v)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr4, w)) {
                                                                    z3 = true;
                                                                } else if (Arrays.equals(bArr4, x) || Arrays.equals(bArr4, y)) {
                                                                    z4 = true;
                                                                }
                                                                if (!z2) {
                                                                    continue;
                                                                } else if (z3) {
                                                                    nkoVar.close();
                                                                    i2 = 12;
                                                                } else if (z4) {
                                                                    nkoVar.close();
                                                                    i2 = 15;
                                                                }
                                                            } catch (Exception e) {
                                                                e = e;
                                                                if (o) {
                                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                                }
                                                                if (nkoVar != null) {
                                                                    nkoVar.close();
                                                                }
                                                                i2 = i;
                                                            }
                                                        }
                                                        j4++;
                                                    } catch (EOFException unused) {
                                                        i = 0;
                                                        nkoVar.close();
                                                        i2 = i;
                                                    }
                                                } else {
                                                    i = 0;
                                                }
                                                nkoVar.close();
                                                i2 = i;
                                            }
                                        }
                                    } else {
                                        nkoVar.close();
                                        i = 0;
                                        i2 = 0;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                nkoVar3 = nkoVar;
                                if (nkoVar3 != null) {
                                    nkoVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            nkoVar = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (nkoVar3 != null) {
                                nkoVar3.close();
                            }
                            throw th;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        try {
                            nkoVar2 = new nko(bArr);
                            try {
                                ByteOrder byteOrderU = u(nkoVar2);
                                this.h = byteOrderU;
                                nkoVar2.c = byteOrderU;
                                short s2 = nkoVar2.readShort();
                                i3 = (s2 == 20306 || s2 == 21330) ? 1 : i;
                                nkoVar2.close();
                            } catch (Exception unused2) {
                                if (nkoVar2 != null) {
                                    nkoVar2.close();
                                }
                                i3 = i;
                            } catch (Throwable th3) {
                                th = th3;
                                nkoVar3 = nkoVar2;
                                if (nkoVar3 != null) {
                                    nkoVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused3) {
                            nkoVar2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        try {
                            nko nkoVar4 = new nko(bArr);
                            try {
                                ByteOrder byteOrderU2 = u(nkoVar4);
                                this.h = byteOrderU2;
                                nkoVar4.c = byteOrderU2;
                                i4 = nkoVar4.readShort() != 85 ? i : 1;
                                nkoVar4.close();
                            } catch (Exception unused4) {
                                nkoVar3 = nkoVar4;
                                if (nkoVar3 != null) {
                                    nkoVar3.close();
                                }
                                i4 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                nkoVar3 = nkoVar4;
                                if (nkoVar3 != null) {
                                    nkoVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused5) {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i4 != 0) {
                            return 10;
                        }
                        int i7 = i;
                        while (true) {
                            byte[] bArr5 = B;
                            if (i7 >= bArr5.length) {
                                return 13;
                            }
                            if (bArr[i7] != bArr5[i7]) {
                                int i8 = i;
                                while (true) {
                                    byte[] bArr6 = D;
                                    if (i8 >= bArr6.length) {
                                        int i9 = i;
                                        while (true) {
                                            byte[] bArr7 = E;
                                            if (i9 >= bArr7.length) {
                                                return 14;
                                            }
                                            if (bArr[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                break;
                                            }
                                            i9++;
                                        }
                                    } else {
                                        if (bArr[i8] != bArr6[i8]) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                return i;
                            }
                            i7++;
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void i(rko rkoVar) throws IOException {
        int i;
        int i2;
        l(rkoVar);
        HashMap[] mapArr = this.f;
        oko okoVar = (oko) mapArr[1].get("MakerNote");
        if (okoVar != null) {
            rko rkoVar2 = new rko(okoVar.d);
            rkoVar2.c = this.h;
            byte[] bArr = z;
            byte[] bArr2 = new byte[bArr.length];
            rkoVar2.readFully(bArr2);
            rkoVar2.c(0L);
            byte[] bArr3 = A;
            byte[] bArr4 = new byte[bArr3.length];
            rkoVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                rkoVar2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                rkoVar2.c(12L);
            }
            w(rkoVar2, 6);
            oko okoVar2 = (oko) mapArr[7].get("PreviewImageStart");
            oko okoVar3 = (oko) mapArr[7].get("PreviewImageLength");
            if (okoVar2 != null && okoVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", okoVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", okoVar3);
            }
            oko okoVar4 = (oko) mapArr[8].get("AspectFrame");
            if (okoVar4 != null) {
                int[] iArr = (int[]) okoVar4.h(this.h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                oko okoVarD = oko.d(i5, this.h);
                oko okoVarD2 = oko.d(i6, this.h);
                mapArr[0].put("ImageWidth", okoVarD);
                mapArr[0].put("ImageLength", okoVarD2);
            }
        }
    }

    public final void j(nko nkoVar) throws IOException {
        if (o) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + nkoVar);
        }
        nkoVar.c = ByteOrder.BIG_ENDIAN;
        int i = nkoVar.b;
        nkoVar.a(B.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int i2 = nkoVar.readInt();
                int i3 = nkoVar.readInt();
                int i4 = nkoVar.b;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z2) {
                    this.j = i6;
                    byte[] bArr = new byte[i2];
                    nkoVar.readFully(bArr);
                    int i7 = nkoVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    v(bArr, 0);
                    B();
                    y(new nko(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = C;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        nkoVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = nkoVar.b - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            nkoVar.readFully(bArr4);
                            this.n = new oko(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                nkoVar.a(i5 - nkoVar.b);
            } catch (EOFException e) {
                csj.c("Encountered corrupt PNG file.", e);
                return;
            }
        }
    }

    public final void k(nko nkoVar) throws IOException {
        boolean z2 = o;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + nkoVar);
        }
        nkoVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        nkoVar.readFully(bArr);
        nkoVar.readFully(bArr2);
        nkoVar.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        nkoVar.a(i - nkoVar.b);
        nkoVar.readFully(bArr4);
        g(new nko(bArr4), i, 5);
        nkoVar.a(i3 - nkoVar.b);
        nkoVar.c = ByteOrder.BIG_ENDIAN;
        int i4 = nkoVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = nkoVar.readUnsignedShort();
            int unsignedShort2 = nkoVar.readUnsignedShort();
            if (unsignedShort == J.f27145a) {
                short s2 = nkoVar.readShort();
                short s3 = nkoVar.readShort();
                oko okoVarD = oko.d(s2, this.h);
                oko okoVarD2 = oko.d(s3, this.h);
                HashMap[] mapArr = this.f;
                mapArr[0].put("ImageLength", okoVarD);
                mapArr[0].put("ImageWidth", okoVarD2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            nkoVar.a(unsignedShort2);
        }
    }

    public final void l(rko rkoVar) throws IOException {
        s(rkoVar);
        w(rkoVar, 0);
        A(rkoVar, 0);
        A(rkoVar, 5);
        A(rkoVar, 4);
        B();
        if (this.d == 8) {
            HashMap[] mapArr = this.f;
            oko okoVar = (oko) mapArr[1].get("MakerNote");
            if (okoVar != null) {
                rko rkoVar2 = new rko(okoVar.d);
                rkoVar2.c = this.h;
                rkoVar2.a(6);
                w(rkoVar2, 9);
                oko okoVar2 = (oko) mapArr[9].get("ColorSpace");
                if (okoVar2 != null) {
                    mapArr[1].put("ColorSpace", okoVar2);
                }
            }
        }
    }

    public final void m(rko rkoVar) throws IOException {
        if (o) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + rkoVar);
        }
        l(rkoVar);
        HashMap[] mapArr = this.f;
        oko okoVar = (oko) mapArr[0].get("JpgFromRaw");
        if (okoVar != null) {
            g(new nko(okoVar.d), (int) okoVar.c, 5);
        }
        oko okoVar2 = (oko) mapArr[0].get("ISO");
        oko okoVar3 = (oko) mapArr[1].get("PhotographicSensitivity");
        if (okoVar2 == null || okoVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", okoVar2);
    }

    public final boolean n(rko rkoVar) throws IOException {
        byte[] bArr = R;
        byte[] bArr2 = new byte[bArr.length];
        rkoVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = rkoVar.f23690a.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.j = bArr.length;
                v(bArrCopyOf2, 0);
                return true;
            }
            i += i2;
            rkoVar.b += i2;
        }
    }

    public final void o(nko nkoVar) throws IOException {
        if (o) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + nkoVar);
        }
        nkoVar.c = ByteOrder.LITTLE_ENDIAN;
        nkoVar.a(D.length);
        int i = nkoVar.readInt() + 8;
        byte[] bArr = E;
        nkoVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                nkoVar.readFully(bArr2);
                int i2 = nkoVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(F, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    nkoVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = R;
                    if (acb.X(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.j = i3;
                    v(bArrCopyOfRange, 0);
                    y(new nko(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                nkoVar.a(i2);
            } catch (EOFException e) {
                csj.c("Encountered corrupt WebP file.", e);
                return;
            }
        }
    }

    public final void p(nko nkoVar, HashMap map) throws IOException {
        oko okoVar = (oko) map.get("JPEGInterchangeFormat");
        oko okoVar2 = (oko) map.get("JPEGInterchangeFormatLength");
        if (okoVar == null || okoVar2 == null) {
            return;
        }
        int iF = okoVar.f(this.h);
        int iF2 = okoVar2.f(this.h);
        if (this.d == 7) {
            iF += this.k;
        }
        if (iF > 0 && iF2 > 0 && this.f32360a == null && this.c == null && this.b == null) {
            nkoVar.a(iF);
            nkoVar.readFully(new byte[iF2]);
        }
        if (o) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iF + ", length: " + iF2);
        }
    }

    public final boolean q(HashMap map) {
        oko okoVar = (oko) map.get("ImageLength");
        oko okoVar2 = (oko) map.get("ImageWidth");
        if (okoVar == null || okoVar2 == null) {
            return false;
        }
        return okoVar.f(this.h) <= 512 && okoVar2.f(this.h) <= 512;
    }

    public final void r(InputStream inputStream) {
        boolean z2 = o;
        for (int i = 0; i < K.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z2) {
                        t();
                    }
                    throw th;
                }
            } catch (IOException | UnsupportedOperationException e) {
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z2) {
                    t();
                    return;
                }
                return;
            }
        }
        boolean z3 = this.e;
        if (!z3) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.d;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            nko nkoVar = new nko(inputStream);
            int i3 = this.d;
            if (i3 == 4) {
                g(nkoVar, 0, 0);
            } else if (i3 == 13) {
                j(nkoVar);
            } else if (i3 == 9) {
                k(nkoVar);
            } else if (i3 == 14) {
                o(nkoVar);
            }
        } else {
            rko rkoVar = new rko(inputStream);
            if (!z3) {
                int i4 = this.d;
                if (i4 == 12 || i4 == 15) {
                    f(rkoVar, i4);
                } else if (i4 == 7) {
                    i(rkoVar);
                } else if (i4 == 10) {
                    m(rkoVar);
                } else {
                    l(rkoVar);
                }
            } else if (!n(rkoVar)) {
                a();
                if (z2) {
                    t();
                    return;
                }
                return;
            }
            rkoVar.c(this.j);
            y(rkoVar);
        }
        a();
        if (z2) {
            t();
        }
    }

    public final void s(rko rkoVar) throws IOException {
        ByteOrder byteOrderU = u(rkoVar);
        this.h = byteOrderU;
        rkoVar.c = byteOrderU;
        int unsignedShort = rkoVar.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            ohq.r(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = rkoVar.readInt();
        if (i2 < 8) {
            ohq.l(twn.m(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            rkoVar.a(i3);
        }
    }

    public final void t() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbM = b1j.m(i, "The size of tag group[", "]: ");
            sbM.append(mapArr[i].size());
            Log.d("ExifInterface", sbM.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                oko okoVar = (oko) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + okoVar.toString() + ", tagValue: '" + okoVar.g(this.h) + Separators.QUOTE);
            }
            i++;
        }
    }

    public final void v(byte[] bArr, int i) throws IOException {
        rko rkoVar = new rko(bArr);
        s(rkoVar);
        w(rkoVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:148:0x0328  */
    /* JADX WARN: Code duplicated, block: B:175:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    public final void w(rko rkoVar, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        Integer num;
        HashSet hashSet;
        long j4;
        String str;
        int unsignedShort;
        long j5;
        String strH;
        int i3;
        int i4 = rkoVar.b;
        int i5 = rkoVar.e;
        Integer numValueOf = Integer.valueOf(i4);
        HashSet hashSet2 = this.g;
        hashSet2.add(numValueOf);
        short s2 = rkoVar.readShort();
        boolean z3 = o;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.f;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = rkoVar.readUnsignedShort();
            int unsignedShort3 = rkoVar.readUnsignedShort();
            int i6 = rkoVar.readInt();
            long j6 = ((long) rkoVar.b) + 4;
            short s4 = s2;
            pko pkoVar = (pko) M[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), pkoVar != null ? pkoVar.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            }
            if (pkoVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = H;
                    if (unsignedShort3 < iArr.length) {
                        byte b = pkoVar.c;
                        if (b == 7 || unsignedShort3 == 7 || b == unsignedShort3 || (i2 = pkoVar.d) == unsignedShort3 || (((b == 4 || i2 == 4) && unsignedShort3 == 3) || (((b == 9 || i2 == 9) && unsignedShort3 == 8) || ((b == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = b;
                            }
                            j = j6;
                            j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i6);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + G[unsignedShort3] + ") is unexpected for tag: " + pkoVar.b);
                        }
                    }
                    if (z2) {
                        j3 = j;
                        if (j2 > 4) {
                            i3 = rkoVar.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i3);
                            }
                            if (this.d == 7) {
                                if ("MakerNote".equals(pkoVar.b)) {
                                    this.k = i3;
                                } else if (i != 6 && "ThumbnailImage".equals(pkoVar.b)) {
                                    this.l = i3;
                                    this.m = i6;
                                    oko okoVarD = oko.d(6, this.h);
                                    oko okoVarB = oko.b(this.l, this.h);
                                    oko okoVarB2 = oko.b(this.m, this.h);
                                    mapArr[4].put("Compression", okoVarD);
                                    mapArr[4].put("JPEGInterchangeFormat", okoVarB);
                                    mapArr[4].put("JPEGInterchangeFormatLength", okoVarB2);
                                }
                            }
                            rkoVar.c(i3);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            pkoVar = pkoVar;
                        }
                        num = (Integer) P.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j5 = ((long) rkoVar.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = rkoVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = rkoVar.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pkoVar.b));
                                }
                                if (j5 > 0 || (i5 != -1 && j5 >= i5)) {
                                    hashSet = hashSet2;
                                    if (z3 != 0) {
                                        strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i5 != -1) {
                                            strH = strH + " (total length: " + i5 + Separators.RPAREN;
                                        }
                                        Log.d("ExifInterface", strH);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        rkoVar.c(j5);
                                        w(rkoVar, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + Separators.RPAREN);
                                    }
                                }
                                rkoVar.c(j3);
                            } else {
                                unsignedShort = rkoVar.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pkoVar.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strH = strH + " (total length: " + i5 + Separators.RPAREN;
                                    }
                                    Log.d("ExifInterface", strH);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strH = strH + " (total length: " + i5 + Separators.RPAREN;
                                    }
                                    Log.d("ExifInterface", strH);
                                }
                            }
                            rkoVar.c(j3);
                        } else {
                            hashSet = hashSet2;
                            j4 = j3;
                            int i7 = rkoVar.b + this.j;
                            byte[] bArr = new byte[(int) j2];
                            rkoVar.readFully(bArr);
                            oko okoVar = new oko(i7, bArr, unsignedShort3, i6);
                            HashMap map = mapArr[i];
                            str = pkoVar.b;
                            map.put(str, okoVar);
                            if ("DNGVersion".equals(str)) {
                                this.d = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && okoVar.g(this.h).contains("PENTAX")) || ("Compression".equals(str) && okoVar.f(this.h) == 65535)) {
                                this.d = 8;
                            }
                            if (rkoVar.b != j4) {
                                rkoVar.c(j4);
                            }
                        }
                    } else {
                        rkoVar.c(j);
                        hashSet = hashSet2;
                    }
                    s3 = (short) (s3 + 1);
                    hashSet2 = hashSet;
                    s2 = s4;
                    z3 = z3;
                }
                j = j6;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                    rkoVar.c(j);
                    hashSet = hashSet2;
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i3 = rkoVar.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i3);
                        }
                        if (this.d == 7) {
                            if ("MakerNote".equals(pkoVar.b)) {
                                this.k = i3;
                            } else if (i != 6) {
                            }
                        }
                        rkoVar.c(i3);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        pkoVar = pkoVar;
                    }
                    num = (Integer) P.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j5 = ((long) rkoVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = rkoVar.readInt();
                            } else {
                                unsignedShort = rkoVar.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pkoVar.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strH = strH + " (total length: " + i5 + Separators.RPAREN;
                                    }
                                    Log.d("ExifInterface", strH);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strH = strH + " (total length: " + i5 + Separators.RPAREN;
                                    }
                                    Log.d("ExifInterface", strH);
                                }
                            }
                            rkoVar.c(j3);
                        } else {
                            unsignedShort = rkoVar.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pkoVar.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strH = strH + " (total length: " + i5 + Separators.RPAREN;
                                }
                                Log.d("ExifInterface", strH);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strH = strH + " (total length: " + i5 + Separators.RPAREN;
                                }
                                Log.d("ExifInterface", strH);
                            }
                        }
                        rkoVar.c(j3);
                    } else {
                        hashSet = hashSet2;
                        j4 = j3;
                        int i8 = rkoVar.b + this.j;
                        byte[] bArr2 = new byte[(int) j2];
                        rkoVar.readFully(bArr2);
                        oko okoVar2 = new oko(i8, bArr2, unsignedShort3, i6);
                        HashMap map2 = mapArr[i];
                        str = pkoVar.b;
                        map2.put(str, okoVar2);
                        if ("DNGVersion".equals(str)) {
                            this.d = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.d = 8;
                        if (rkoVar.b != j4) {
                            rkoVar.c(j4);
                        }
                    }
                }
                s3 = (short) (s3 + 1);
                hashSet2 = hashSet;
                s2 = s4;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z2 = false;
            if (z2) {
                rkoVar.c(j);
                hashSet = hashSet2;
            } else {
                j3 = j;
                if (j2 > 4) {
                    i3 = rkoVar.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i3);
                    }
                    if (this.d == 7) {
                        if ("MakerNote".equals(pkoVar.b)) {
                            this.k = i3;
                        } else if (i != 6) {
                        }
                    }
                    rkoVar.c(i3);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    pkoVar = pkoVar;
                }
                num = (Integer) P.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j5 = ((long) rkoVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = rkoVar.readInt();
                        } else {
                            unsignedShort = rkoVar.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pkoVar.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strH = strH + " (total length: " + i5 + Separators.RPAREN;
                                }
                                Log.d("ExifInterface", strH);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strH = strH + " (total length: " + i5 + Separators.RPAREN;
                                }
                                Log.d("ExifInterface", strH);
                            }
                        }
                        rkoVar.c(j3);
                    } else {
                        unsignedShort = rkoVar.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), pkoVar.b));
                    }
                    if (j5 > 0) {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                            if (i5 != -1) {
                                strH = strH + " (total length: " + i5 + Separators.RPAREN;
                            }
                            Log.d("ExifInterface", strH);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strH = h97.h(j5, "Skip jump into the IFD since its offset is invalid: ");
                            if (i5 != -1) {
                                strH = strH + " (total length: " + i5 + Separators.RPAREN;
                            }
                            Log.d("ExifInterface", strH);
                        }
                    }
                    rkoVar.c(j3);
                } else {
                    hashSet = hashSet2;
                    j4 = j3;
                    int i9 = rkoVar.b + this.j;
                    byte[] bArr3 = new byte[(int) j2];
                    rkoVar.readFully(bArr3);
                    oko okoVar3 = new oko(i9, bArr3, unsignedShort3, i6);
                    HashMap map3 = mapArr[i];
                    str = pkoVar.b;
                    map3.put(str, okoVar3);
                    if ("DNGVersion".equals(str)) {
                        this.d = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.d = 8;
                    if (rkoVar.b != j4) {
                        rkoVar.c(j4);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            hashSet2 = hashSet;
            s2 = s4;
            z3 = z3;
        }
        HashSet hashSet3 = hashSet2;
        boolean z4 = z3;
        int i10 = rkoVar.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j7 = i10;
        if (j7 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i10))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        rkoVar.c(j7);
        if (mapArr[4].isEmpty()) {
            w(rkoVar, 4);
        } else if (mapArr[5].isEmpty()) {
            w(rkoVar, 5);
        }
    }

    public final void x(int i, String str, String str2) {
        HashMap[] mapArr = this.f;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (oko) map.get(str));
        mapArr[i].remove(str);
    }

    public final void y(nko nkoVar) throws IOException {
        oko okoVar;
        int iF;
        HashMap map = this.f[4];
        oko okoVar2 = (oko) map.get("Compression");
        if (okoVar2 == null) {
            p(nkoVar, map);
            return;
        }
        int iF2 = okoVar2.f(this.h);
        if (iF2 != 1) {
            if (iF2 == 6) {
                p(nkoVar, map);
                return;
            } else if (iF2 != 7) {
                return;
            }
        }
        oko okoVar3 = (oko) map.get("BitsPerSample");
        if (okoVar3 != null) {
            int[] iArr = (int[]) okoVar3.h(this.h);
            int[] iArr2 = r;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (okoVar = (oko) map.get("PhotometricInterpretation")) != null && (((iF = okoVar.f(this.h)) == 1 && Arrays.equals(iArr, s)) || (iF == 6 && Arrays.equals(iArr, iArr2))))) {
                oko okoVar4 = (oko) map.get("StripOffsets");
                oko okoVar5 = (oko) map.get("StripByteCounts");
                if (okoVar4 == null || okoVar5 == null) {
                    return;
                }
                long[] jArrO = acb.O(okoVar4.h(this.h));
                long[] jArrO2 = acb.O(okoVar5.h(this.h));
                if (jArrO == null || jArrO.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrO2 == null || jArrO2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrO.length != jArrO2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrO2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.i = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrO.length; i3++) {
                    int i4 = (int) jArrO[i3];
                    int i5 = (int) jArrO2[i3];
                    if (i3 < jArrO.length - 1 && i4 + i5 != jArrO[i3 + 1]) {
                        this.i = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        nkoVar.a(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            nkoVar.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.i) {
                    long j3 = jArrO[0];
                    return;
                }
                return;
            }
        }
        if (o) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void z(int i, int i2) {
        HashMap[] mapArr = this.f;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = o;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        oko okoVar = (oko) mapArr[i].get("ImageLength");
        oko okoVar2 = (oko) mapArr[i].get("ImageWidth");
        oko okoVar3 = (oko) mapArr[i2].get("ImageLength");
        oko okoVar4 = (oko) mapArr[i2].get("ImageWidth");
        if (okoVar == null || okoVar2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (okoVar3 == null || okoVar4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iF = okoVar.f(this.h);
        int iF2 = okoVar2.f(this.h);
        int iF3 = okoVar3.f(this.h);
        int iF4 = okoVar4.f(this.h);
        if (iF >= iF3 || iF2 >= iF4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public sko(InputStream inputStream) throws IOException {
        pko[][] pkoVarArr = K;
        this.f = new HashMap[pkoVarArr.length];
        this.g = new HashSet(pkoVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        this.f32360a = null;
        this.e = false;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (o) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.c = null;
                this.b = null;
            }
        } else {
            this.c = null;
            this.b = null;
        }
        r(inputStream);
    }
}
