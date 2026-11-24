package a;

import android.R;
import android.gov.nist.core.LexerCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.message.Response;
import android.util.Pair;
import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f17352a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", TokenNames.C};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");
    public static final byte[] d = {-75, 0, -112, 0, 1};

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = vtt0.f38024a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static Pair b(androidx.media3.common.b bVar) {
        boolean z;
        iyc iycVarD = d(bVar);
        if (iycVarD == null || !(z = iycVarD.c)) {
            return null;
        }
        x0x.K(z);
        Integer numValueOf = Integer.valueOf(iycVarD.f15582a);
        x0x.K(z);
        return new Pair(numValueOf, Integer.valueOf(iycVarD.b));
    }

    public static iyc c(String str, String[] strArr, c4d c4dVar) {
        int i;
        Integer num = null;
        if (strArr.length < 4) {
            dw9.A("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            dw9.A("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        boolean zEquals = "1".equals(strGroup);
        byte b2 = 6;
        iyc iycVar = iyc.d;
        if (zEquals) {
            i = 1;
        } else {
            if (!"2".equals(strGroup)) {
                dw9.A("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return iycVar;
            }
            i = (c4dVar == null || c4dVar.c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        str2.getClass();
        switch (str2.hashCode()) {
            case 70821:
                b2 = !str2.equals("H30") ? (byte) -1 : (byte) 0;
                break;
            case 70914:
                b2 = !str2.equals("H60") ? (byte) -1 : (byte) 1;
                break;
            case 70917:
                b2 = !str2.equals("H63") ? (byte) -1 : (byte) 2;
                break;
            case 71007:
                b2 = !str2.equals("H90") ? (byte) -1 : (byte) 3;
                break;
            case 71010:
                b2 = !str2.equals("H93") ? (byte) -1 : (byte) 4;
                break;
            case 74665:
                b2 = !str2.equals("L30") ? (byte) -1 : (byte) 5;
                break;
            case 74758:
                if (!str2.equals("L60")) {
                    b2 = -1;
                }
                break;
            case 74761:
                b2 = !str2.equals("L63") ? (byte) -1 : (byte) 7;
                break;
            case 74851:
                b2 = !str2.equals("L90") ? (byte) -1 : (byte) 8;
                break;
            case 74854:
                b2 = !str2.equals("L93") ? (byte) -1 : (byte) 9;
                break;
            case 2193639:
                b2 = !str2.equals("H120") ? (byte) -1 : (byte) 10;
                break;
            case 2193642:
                b2 = !str2.equals("H123") ? (byte) -1 : (byte) 11;
                break;
            case 2193732:
                b2 = !str2.equals("H150") ? (byte) -1 : (byte) 12;
                break;
            case 2193735:
                b2 = !str2.equals("H153") ? (byte) -1 : (byte) 13;
                break;
            case 2193738:
                b2 = !str2.equals("H156") ? (byte) -1 : (byte) 14;
                break;
            case 2193825:
                b2 = !str2.equals("H180") ? (byte) -1 : (byte) 15;
                break;
            case 2193828:
                b2 = !str2.equals("H183") ? (byte) -1 : (byte) 16;
                break;
            case 2193831:
                b2 = !str2.equals("H186") ? (byte) -1 : (byte) 17;
                break;
            case 2312803:
                b2 = !str2.equals("L120") ? (byte) -1 : (byte) 18;
                break;
            case 2312806:
                b2 = !str2.equals("L123") ? (byte) -1 : (byte) 19;
                break;
            case 2312896:
                b2 = !str2.equals("L150") ? (byte) -1 : (byte) 20;
                break;
            case 2312899:
                b2 = !str2.equals("L153") ? (byte) -1 : (byte) 21;
                break;
            case 2312902:
                b2 = !str2.equals("L156") ? (byte) -1 : (byte) 22;
                break;
            case 2312989:
                b2 = !str2.equals("L180") ? (byte) -1 : (byte) 23;
                break;
            case 2312992:
                b2 = !str2.equals("L183") ? (byte) -1 : (byte) 24;
                break;
            case 2312995:
                b2 = !str2.equals("L186") ? (byte) -1 : (byte) 25;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                num = 2;
                break;
            case 1:
                num = 8;
                break;
            case 2:
                num = 32;
                break;
            case 3:
                num = 128;
                break;
            case 4:
                num = 512;
                break;
            case 5:
                num = 1;
                break;
            case 6:
                num = 4;
                break;
            case 7:
                num = 16;
                break;
            case 8:
                num = 64;
                break;
            case 9:
                num = 256;
                break;
            case 10:
                num = 2048;
                break;
            case 11:
                num = 8192;
                break;
            case 12:
                num = 32768;
                break;
            case 13:
                num = 131072;
                break;
            case 14:
                num = 524288;
                break;
            case 15:
                num = 2097152;
                break;
            case 16:
                num = 8388608;
                break;
            case 17:
                num = 33554432;
                break;
            case 18:
                num = 1024;
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                num = 4096;
                break;
            case 20:
                num = 16384;
                break;
            case 21:
                num = 65536;
                break;
            case 22:
                num = 262144;
                break;
            case 23:
                num = 1048576;
                break;
            case 24:
                num = 4194304;
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                num = 16777216;
                break;
        }
        if (num != null) {
            return new iyc(i, num.intValue(), true);
        }
        f1t0.g0("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(str2));
        return iycVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:154:0x0243  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:230:0x032e  */
    /* JADX WARN: Code duplicated, block: B:411:0x0585  */
    /* JADX WARN: Code duplicated, block: B:413:0x058b  */
    /* JADX WARN: Code duplicated, block: B:509:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:80:0x0159  */
    /* JADX WARN: Code duplicated, block: B:880:0x0b59  */
    public static iyc d(androidx.media3.common.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte b2;
        Integer num;
        Integer num2 = 1024;
        String str = bVar.l;
        String str2 = bVar.l;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(bVar.p);
        iyc iycVar = iyc.d;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                dw9.A("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                return null;
            }
            Matcher matcher = c.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                dw9.A("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            strGroup.getClass();
            switch (strGroup) {
                case "00":
                    num = 1;
                    break;
                case "01":
                    num = 2;
                    break;
                case "02":
                    num = 4;
                    break;
                case "03":
                    num = 8;
                    break;
                case "04":
                    num = 16;
                    break;
                case "05":
                    num = 32;
                    break;
                case "06":
                    num = 64;
                    break;
                case "07":
                    num = 128;
                    break;
                case "08":
                    num = 256;
                    break;
                case "09":
                    num = 512;
                    break;
                case "10":
                    num = num2;
                    break;
                default:
                    num = null;
                    break;
            }
            if (num == null) {
                f1t0.g0("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(strGroup));
                return iycVar;
            }
            String str3 = strArrSplit[2];
            str3.getClass();
            switch (str3) {
                case "01":
                    num2 = 1;
                    break;
                case "02":
                    num2 = 2;
                    break;
                case "03":
                    num2 = 4;
                    break;
                case "04":
                    num2 = 8;
                    break;
                case "05":
                    num2 = 16;
                    break;
                case "06":
                    num2 = 32;
                    break;
                case "07":
                    num2 = 64;
                    break;
                case "08":
                    num2 = 128;
                    break;
                case "09":
                    num2 = 256;
                    break;
                case "10":
                    num2 = 512;
                    break;
                case "11":
                    break;
                case "12":
                    num2 = 2048;
                    break;
                case "13":
                    num2 = 4096;
                    break;
                default:
                    num2 = null;
                    break;
            }
            if (num2 != null) {
                return new iyc(num.intValue(), num2.intValue(), true);
            }
            f1t0.g0("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(str3));
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "ac-4":
                int i19 = 8;
                if (strArrSplit.length != 4) {
                    dw9.A("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i20 = Integer.parseInt(strArrSplit[1]);
                    int i21 = Integer.parseInt(strArrSplit[2]);
                    int i22 = Integer.parseInt(strArrSplit[3]);
                    if (i20 != 0) {
                        if (i20 != 1) {
                            if (i20 != 2) {
                                i = -1;
                            } else if (i21 == 1) {
                                i = 1026;
                            } else if (i21 == 2) {
                                i = 1028;
                            } else {
                                i = -1;
                            }
                        } else if (i21 == 0) {
                            i = Response.MESSAGE_TOO_LARGE;
                        } else if (i21 == 1) {
                            i = 514;
                        } else {
                            i = -1;
                        }
                    } else if (i21 == 0) {
                        i = 257;
                    } else {
                        i = -1;
                    }
                    if (i == -1) {
                        f1t0.g0("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i20 + Separators.DOT + i21);
                        return iycVar;
                    }
                    if (i22 == 0) {
                        i19 = 1;
                    } else if (i22 == 1) {
                        i19 = 2;
                    } else if (i22 == 2) {
                        i19 = 4;
                    } else if (i22 != 3) {
                        i19 = i22 != 4 ? -1 : 16;
                    }
                    if (i19 != -1) {
                        return new iyc(i, i19, true);
                    }
                    rw2.u(i22, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                    return iycVar;
                } catch (NumberFormatException unused) {
                    dw9.A("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case "apv1":
                if (strArrSplit.length < 4) {
                    dw9.A("Ignoring malformed APV codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i23 = Integer.parseInt(strArrSplit[1].substring(4));
                    int i24 = Integer.parseInt(strArrSplit[2].substring(4));
                    int i25 = Integer.parseInt(strArrSplit[3].substring(4));
                    if (i23 == 33) {
                        i2 = 1;
                    } else {
                        if (i23 != 44) {
                            rw2.u(i23, "Unrecognized APV profile: ", "CodecSpecificDataUtil");
                            return iycVar;
                        }
                        i2 = 8192;
                    }
                    switch (i24) {
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            if (i25 == 0) {
                                i3 = 257;
                            } else if (i25 == 1) {
                                i3 = 258;
                            } else if (i25 == 2) {
                                i3 = 260;
                            } else if (i25 == 3) {
                                i3 = 264;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 33:
                            if (i25 == 0) {
                                i3 = Response.MESSAGE_TOO_LARGE;
                            } else if (i25 == 1) {
                                i3 = 514;
                            } else if (i25 == 2) {
                                i3 = 516;
                            } else if (i25 == 3) {
                                i3 = 520;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 60:
                            if (i25 == 0) {
                                i3 = 1025;
                            } else if (i25 == 1) {
                                i3 = 1026;
                            } else if (i25 == 2) {
                                i3 = 1028;
                            } else if (i25 == 3) {
                                i3 = 1032;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 63:
                            if (i25 == 0) {
                                i3 = 2049;
                            } else if (i25 == 1) {
                                i3 = 2050;
                            } else if (i25 == 2) {
                                i3 = TokenTypes.REGISTER;
                            } else if (i25 == 3) {
                                i3 = TokenTypes.OPTIONS;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                            if (i25 == 0) {
                                i3 = 4097;
                            } else if (i25 == 1) {
                                i3 = 4098;
                            } else if (i25 == 2) {
                                i3 = LexerCore.IPV6;
                            } else if (i25 == 3) {
                                i3 = 4104;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 93:
                            if (i25 == 0) {
                                i3 = 8193;
                            } else if (i25 == 1) {
                                i3 = 8194;
                            } else if (i25 == 2) {
                                i3 = 8196;
                            } else if (i25 == 3) {
                                i3 = JosStatusCodes.RNT_CODE_SERVER_ERROR;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 120:
                            if (i25 == 0) {
                                i3 = 16385;
                            } else if (i25 == 1) {
                                i3 = 16386;
                            } else if (i25 == 2) {
                                i3 = 16388;
                            } else if (i25 == 3) {
                                i3 = 16392;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 123:
                            if (i25 == 0) {
                                i3 = 32769;
                            } else if (i25 == 1) {
                                i3 = 32770;
                            } else if (i25 == 2) {
                                i3 = 32772;
                            } else if (i25 == 3) {
                                i3 = 32776;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 150:
                            if (i25 == 0) {
                                i3 = 65537;
                            } else if (i25 == 1) {
                                i3 = 65538;
                            } else if (i25 == 2) {
                                i3 = 65540;
                            } else if (i25 == 3) {
                                i3 = 65544;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 153:
                            if (i25 == 0) {
                                i3 = 131073;
                            } else if (i25 == 1) {
                                i3 = 131074;
                            } else if (i25 == 2) {
                                i3 = 131076;
                            } else if (i25 == 3) {
                                i3 = 131080;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 180:
                            if (i25 == 0) {
                                i3 = 262145;
                            } else if (i25 == 1) {
                                i3 = 262146;
                            } else if (i25 == 2) {
                                i3 = 262148;
                            } else if (i25 == 3) {
                                i3 = 262152;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case Response.SESSION_PROGRESS /* 183 */:
                            if (i25 == 0) {
                                i3 = 524289;
                            } else if (i25 == 1) {
                                i3 = 524290;
                            } else if (i25 == 2) {
                                i3 = 524292;
                            } else if (i25 == 3) {
                                i3 = 524296;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 210:
                            if (i25 == 0) {
                                i3 = 1048577;
                            } else if (i25 == 1) {
                                i3 = 1048578;
                            } else if (i25 == 2) {
                                i3 = 1048580;
                            } else if (i25 == 3) {
                                i3 = 1048584;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 213:
                            if (i25 == 0) {
                                i3 = 2097153;
                            } else if (i25 == 1) {
                                i3 = 2097154;
                            } else if (i25 == 2) {
                                i3 = 2097156;
                            } else if (i25 == 3) {
                                i3 = 2097160;
                            } else {
                                rw2.u(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        default:
                            rw2.u(i24, "Unrecognized APV level index: ", "CodecSpecificDataUtil");
                            i3 = -1;
                            break;
                    }
                    return i3 == -1 ? iycVar : new iyc(i2, i3, true);
                } catch (NumberFormatException e) {
                    f1t0.h0("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str2, e);
                    return null;
                }
            case "av01":
                c4d c4dVar = bVar.H;
                if (strArrSplit.length < 4) {
                    dw9.A("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i26 = Integer.parseInt(strArrSplit[1]);
                    int i27 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i28 = Integer.parseInt(strArrSplit[3]);
                    if (i26 != 0) {
                        rw2.u(i26, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                        return iycVar;
                    }
                    int i29 = 8;
                    if (i28 != 8 && i28 != 10) {
                        rw2.u(i28, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                        return iycVar;
                    }
                    int i30 = i28 == 8 ? 1 : (c4dVar == null || !(c4dVar.d != null || (i4 = c4dVar.c) == 7 || i4 == 6)) ? 2 : 4096;
                    switch (i27) {
                        case 0:
                            i29 = 1;
                            break;
                        case 1:
                            i29 = 2;
                            break;
                        case 2:
                            i29 = 4;
                            break;
                        case 3:
                            break;
                        case 4:
                            i29 = 16;
                            break;
                        case 5:
                            i29 = 32;
                            break;
                        case 6:
                            i29 = 64;
                            break;
                        case 7:
                            i29 = 128;
                            break;
                        case 8:
                            i29 = 256;
                            break;
                        case 9:
                            i29 = 512;
                            break;
                        case 10:
                            i29 = 1024;
                            break;
                        case 11:
                            i29 = 2048;
                            break;
                        case 12:
                            i29 = 4096;
                            break;
                        case 13:
                            i29 = 8192;
                            break;
                        case 14:
                            i29 = 16384;
                            break;
                        case 15:
                            i29 = 32768;
                            break;
                        case 16:
                            i29 = 65536;
                            break;
                        case 17:
                            i29 = 131072;
                            break;
                        case 18:
                            i29 = 262144;
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            i29 = 524288;
                            break;
                        case 20:
                            i29 = 1048576;
                            break;
                        case 21:
                            i29 = 2097152;
                            break;
                        case 22:
                            i29 = 4194304;
                            break;
                        case 23:
                            i29 = 8388608;
                            break;
                        default:
                            i29 = -1;
                            break;
                    }
                    if (i29 != -1) {
                        return new iyc(i30, i29, true);
                    }
                    rw2.u(i27, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                    return iycVar;
                } catch (NumberFormatException unused2) {
                    dw9.A("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case "avc1":
            case "avc2":
                if (strArrSplit.length < 2) {
                    dw9.A("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i5 = 16;
                        i6 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i7 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        i5 = 16;
                        if (strArrSplit.length < 3) {
                            f1t0.g0("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                            return null;
                        }
                        i6 = Integer.parseInt(strArrSplit[1]);
                        i7 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i6 == 66) {
                        i8 = 1;
                    } else if (i6 == 77) {
                        i8 = 2;
                    } else if (i6 == 88) {
                        i8 = 4;
                    } else if (i6 == 100) {
                        i8 = 8;
                    } else if (i6 == 110) {
                        i8 = i5;
                    } else if (i6 != 122) {
                        i8 = i6 != 244 ? -1 : 64;
                    } else {
                        i8 = 32;
                    }
                    if (i8 == -1) {
                        rw2.u(i6, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                        return iycVar;
                    }
                    switch (i7) {
                        case 10:
                            i5 = 1;
                            i9 = -1;
                            break;
                        case 11:
                            i9 = -1;
                            i5 = 4;
                            break;
                        case 12:
                            i9 = -1;
                            i5 = 8;
                            break;
                        case 13:
                            i9 = -1;
                            break;
                        default:
                            switch (i7) {
                                case 20:
                                    i9 = -1;
                                    i5 = 32;
                                    break;
                                case 21:
                                    i9 = -1;
                                    i5 = 64;
                                    break;
                                case 22:
                                    i9 = -1;
                                    i5 = 128;
                                    break;
                                default:
                                    switch (i7) {
                                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                            i9 = -1;
                                            i5 = 256;
                                            break;
                                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                            i9 = -1;
                                            i5 = 512;
                                            break;
                                        case 32:
                                            i9 = -1;
                                            i5 = 1024;
                                            break;
                                        default:
                                            switch (i7) {
                                                case 40:
                                                    i9 = -1;
                                                    i5 = 2048;
                                                    break;
                                                case 41:
                                                    i9 = -1;
                                                    i5 = 4096;
                                                    break;
                                                case 42:
                                                    i5 = 8192;
                                                    i9 = -1;
                                                    break;
                                                default:
                                                    switch (i7) {
                                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                                            i5 = 16384;
                                                            i9 = -1;
                                                            break;
                                                        case 51:
                                                            i5 = 32768;
                                                            i9 = -1;
                                                            break;
                                                        case 52:
                                                            i5 = 65536;
                                                            i9 = -1;
                                                            break;
                                                        default:
                                                            i9 = -1;
                                                            i5 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i5 != i9) {
                        return new iyc(i8, i5, true);
                    }
                    rw2.u(i7, "Unknown AVC level: ", "CodecSpecificDataUtil");
                    return iycVar;
                } catch (NumberFormatException unused3) {
                    dw9.A("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case "hev1":
            case "hvc1":
                return c(str2, strArrSplit, bVar.H);
            case "iamf":
                if (strArrSplit.length < 4) {
                    dw9.A("Ignoring malformed IAMF codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i31 = Integer.parseInt(strArrSplit[1]);
                    String str5 = strArrSplit[3];
                    str5.getClass();
                    switch (str5) {
                        case "Opus":
                            if (i31 != 0) {
                                if (i31 == 1) {
                                    i10 = R.id.checkbox;
                                } else if (i31 == 2) {
                                    i10 = R.string.copy;
                                } else {
                                    rw2.u(i31, "Unrecognized IAMF Opus profile: ", "CodecSpecificDataUtil");
                                    i10 = -1;
                                }
                                break;
                            } else {
                                i10 = R.attr.label;
                                break;
                            }
                            break;
                        case "fLaC":
                            if (i31 != 0) {
                                if (i31 == 1) {
                                    i10 = R.id.empty;
                                } else if (i31 == 2) {
                                    i10 = R.string.defaultVoiceMailAlphaTag;
                                } else {
                                    rw2.u(i31, "Unrecognized IAMF FLAC profile: ", "CodecSpecificDataUtil");
                                    i10 = -1;
                                }
                                break;
                            } else {
                                i10 = R.attr.manageSpaceActivity;
                                break;
                            }
                            break;
                        case "ipcm":
                            if (i31 != 0) {
                                if (i31 == 1) {
                                    i10 = R.id.icon2;
                                } else if (i31 == 2) {
                                    i10 = R.string.httpErrorUnsupportedScheme;
                                } else {
                                    rw2.u(i31, "Unrecognized IAMF PCM profile: ", "CodecSpecificDataUtil");
                                    i10 = -1;
                                }
                                break;
                            } else {
                                i10 = R.attr.writePermission;
                                break;
                            }
                            break;
                        case "mp4a":
                            if (i31 != 0) {
                                if (i31 == 1) {
                                    i10 = R.id.content;
                                } else if (i31 == 2) {
                                    i10 = R.string.copyUrl;
                                } else {
                                    rw2.u(i31, "Unrecognized IAMF AAC profile: ", "CodecSpecificDataUtil");
                                    i10 = -1;
                                }
                                break;
                            } else {
                                i10 = R.attr.icon;
                                break;
                            }
                            break;
                        default:
                            f1t0.g0("CodecSpecificDataUtil", "Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str5));
                            i10 = -1;
                            break;
                    }
                    return i10 == -1 ? iycVar : new iyc(i10, 0, true);
                } catch (NumberFormatException e2) {
                    f1t0.h0("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArrSplit[1], e2);
                    return null;
                }
            case "mp4a":
                if (strArrSplit.length != 3) {
                    dw9.A("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(mg40.e(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i32 = Integer.parseInt(strArrSplit[2]);
                        int i33 = 17;
                        if (i32 == 17) {
                            i11 = -1;
                        } else {
                            if (i32 != 20) {
                                i33 = 23;
                                if (i32 != 23) {
                                    i33 = 29;
                                    if (i32 != 29) {
                                        i33 = 39;
                                        if (i32 != 39) {
                                            i33 = 42;
                                            if (i32 != 42) {
                                                switch (i32) {
                                                    case 1:
                                                        i33 = 1;
                                                        break;
                                                    case 2:
                                                        i11 = -1;
                                                        i33 = 2;
                                                        break;
                                                    case 3:
                                                        i33 = 3;
                                                        break;
                                                    case 4:
                                                        i11 = -1;
                                                        i33 = 4;
                                                        break;
                                                    case 5:
                                                        i33 = 5;
                                                        break;
                                                    case 6:
                                                        i11 = -1;
                                                        i33 = 6;
                                                        break;
                                                    default:
                                                        i11 = -1;
                                                        i33 = -1;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i33 = 20;
                            }
                            i11 = -1;
                        }
                        if (i33 != i11) {
                            return new iyc(i33, 0, true);
                        }
                        f1t0.g0("CodecSpecificDataUtil", "Unrecognized MP4A profile: " + i33);
                        return iycVar;
                    }
                } catch (NumberFormatException unused4) {
                    dw9.A("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                }
                return null;
            case "s263":
                if (strArrSplit.length < 3) {
                    dw9.A("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i34 = Integer.parseInt(strArrSplit[1]);
                    int i35 = Integer.parseInt(strArrSplit[2]);
                    switch (i34) {
                        case 0:
                            i12 = 1;
                            break;
                        case 1:
                            i12 = 2;
                            break;
                        case 2:
                            i12 = 4;
                            break;
                        case 3:
                            i12 = 8;
                            break;
                        case 4:
                            i12 = 16;
                            break;
                        case 5:
                            i12 = 32;
                            break;
                        case 6:
                            i12 = 64;
                            break;
                        case 7:
                            i12 = 128;
                            break;
                        case 8:
                            i12 = 256;
                            break;
                        default:
                            i12 = -1;
                            break;
                    }
                    if (i12 == -1) {
                        rw2.u(i34, "Unknown H263 profile: ", "CodecSpecificDataUtil");
                        return iycVar;
                    }
                    if (i35 == 10) {
                        i13 = 1;
                        i14 = -1;
                    } else if (i35 == 20) {
                        i14 = -1;
                        i13 = 2;
                    } else if (i35 == 30) {
                        i14 = -1;
                        i13 = 4;
                    } else if (i35 == 40) {
                        i14 = -1;
                        i13 = 8;
                    } else if (i35 == 45) {
                        i14 = -1;
                        i13 = 16;
                    } else if (i35 == 50) {
                        i14 = -1;
                        i13 = 32;
                    } else if (i35 == 60) {
                        i14 = -1;
                        i13 = 64;
                    } else if (i35 != 70) {
                        i14 = -1;
                        i13 = -1;
                    } else {
                        i14 = -1;
                        i13 = 128;
                    }
                    if (i13 != i14) {
                        return new iyc(i12, i13, true);
                    }
                    rw2.u(i35, "Unknown H263 level: ", "CodecSpecificDataUtil");
                    return iycVar;
                } catch (NumberFormatException unused5) {
                    dw9.A("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case "vp09":
                if (strArrSplit.length < 3) {
                    dw9.A("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i36 = Integer.parseInt(strArrSplit[1]);
                    int i37 = Integer.parseInt(strArrSplit[2]);
                    if (i36 == 0) {
                        i15 = 1;
                    } else if (i36 == 1) {
                        i15 = 2;
                    } else if (i36 != 2) {
                        i15 = i36 != 3 ? -1 : 8;
                    } else {
                        i15 = 4;
                    }
                    if (i15 == -1) {
                        rw2.u(i36, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                        return iycVar;
                    }
                    if (i37 != 10) {
                        if (i37 == 11) {
                            i17 = -1;
                            i16 = 2;
                        } else if (i37 == 20) {
                            i17 = -1;
                            i16 = 4;
                        } else if (i37 == 21) {
                            i17 = -1;
                            i16 = 8;
                        } else if (i37 == 30) {
                            i17 = -1;
                            i16 = 16;
                        } else if (i37 == 31) {
                            i17 = -1;
                            i16 = 32;
                        } else if (i37 == 40) {
                            i17 = -1;
                            i16 = 64;
                        } else if (i37 == 41) {
                            i17 = -1;
                            i16 = 128;
                        } else if (i37 == 50) {
                            i17 = -1;
                            i16 = 256;
                        } else if (i37 != 51) {
                            switch (i37) {
                                case 60:
                                    i17 = -1;
                                    i16 = 2048;
                                    break;
                                case 61:
                                    i17 = -1;
                                    i16 = 4096;
                                    break;
                                case 62:
                                    i16 = 8192;
                                    break;
                                default:
                                    i17 = -1;
                                    i16 = -1;
                                    break;
                            }
                        } else {
                            i17 = -1;
                            i16 = 512;
                        }
                        if (i16 == i17) {
                            return new iyc(i15, i16, true);
                        }
                        rw2.u(i37, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                        return iycVar;
                    }
                    i16 = 1;
                    i17 = -1;
                    if (i16 == i17) {
                        return new iyc(i15, i16, true);
                    }
                    rw2.u(i37, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                    return iycVar;
                } catch (NumberFormatException unused6) {
                    dw9.A("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case "vvc1":
            case "vvi1":
                c4d c4dVar2 = bVar.H;
                if (strArrSplit.length < 3) {
                    dw9.A("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i38 = Integer.parseInt(strArrSplit[1]);
                    if (i38 == 1) {
                        i18 = (c4dVar2 == null || c4dVar2.c != 6) ? (c4dVar2 == null || c4dVar2.e != 8) ? 2 : 1 : 4096;
                    } else {
                        if (i38 != 65) {
                            f1t0.g0("CodecSpecificDataUtil", "Unknown VVC profile IDC: " + strArrSplit[1]);
                            return iycVar;
                        }
                        i18 = 4;
                    }
                    String str6 = strArrSplit[2];
                    str6.getClass();
                    switch (str6.hashCode()) {
                        case 70918:
                            if (!str6.equals("H64")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 70921:
                            if (!str6.equals("H67")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 70976:
                            if (!str6.equals("H80")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 70979:
                            if (!str6.equals("H83")) {
                                b2 = -1;
                            }
                            break;
                        case 70982:
                            if (!str6.equals("H86")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 71013:
                            if (!str6.equals("H96")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        case 74609:
                            if (!str6.equals("L16")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case 74667:
                            if (!str6.equals("L32")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        case 74670:
                            if (!str6.equals("L35")) {
                                b2 = -1;
                            } else {
                                b2 = 8;
                            }
                            break;
                        case 74704:
                            if (!str6.equals("L48")) {
                                b2 = -1;
                            } else {
                                b2 = 9;
                            }
                            break;
                        case 74728:
                            if (!str6.equals("L51")) {
                                b2 = -1;
                            } else {
                                b2 = 10;
                            }
                            break;
                        case 74762:
                            if (!str6.equals("L64")) {
                                b2 = -1;
                            } else {
                                b2 = 11;
                            }
                            break;
                        case 74765:
                            if (!str6.equals("L67")) {
                                b2 = -1;
                            } else {
                                b2 = 12;
                            }
                            break;
                        case 74820:
                            if (!str6.equals("L80")) {
                                b2 = -1;
                            }
                            break;
                        case 74823:
                            if (!str6.equals("L83")) {
                                b2 = -1;
                            }
                            break;
                        case 74826:
                            if (!str6.equals("L86")) {
                                b2 = -1;
                            }
                            break;
                        case 74857:
                            if (!str6.equals("L96")) {
                                b2 = -1;
                            } else {
                                b2 = 16;
                            }
                            break;
                        case 2193610:
                            if (!str6.equals("H112")) {
                                b2 = -1;
                            }
                            break;
                        case 2193647:
                            if (!str6.equals("H128")) {
                                b2 = -1;
                            }
                            break;
                        case 2193705:
                            if (!str6.equals("H144")) {
                                b2 = -1;
                            }
                            break;
                        case 2312774:
                            if (!str6.equals("L112")) {
                                b2 = -1;
                            } else {
                                b2 = 20;
                            }
                            break;
                        case 2312811:
                            if (!str6.equals("L128")) {
                                b2 = -1;
                            }
                            break;
                        case 2312869:
                            if (!str6.equals("L144")) {
                                b2 = -1;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            num2 = 64;
                            break;
                        case 1:
                            num2 = 256;
                            break;
                        case 2:
                            break;
                        case 3:
                            num2 = 4096;
                            break;
                        case 4:
                            num2 = 16384;
                            break;
                        case 5:
                            num2 = 65536;
                            break;
                        case 6:
                            num2 = 1;
                            break;
                        case 7:
                            num2 = 2;
                            break;
                        case 8:
                            num2 = 4;
                            break;
                        case 9:
                            num2 = 8;
                            break;
                        case 10:
                            num2 = 16;
                            break;
                        case 11:
                            num2 = 32;
                            break;
                        case 12:
                            num2 = 128;
                            break;
                        case 13:
                            num2 = 512;
                            break;
                        case 14:
                            num2 = 2048;
                            break;
                        case 15:
                            num2 = 8192;
                            break;
                        case 16:
                            num2 = 32768;
                            break;
                        case 17:
                            num2 = 262144;
                            break;
                        case 18:
                            num2 = 1048576;
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            num2 = 4194304;
                            break;
                        case 20:
                            num2 = 131072;
                            break;
                        case 21:
                            num2 = 524288;
                            break;
                        case 22:
                            num2 = 2097152;
                            break;
                        default:
                            num2 = null;
                            break;
                    }
                    if (num2 != null) {
                        return new iyc(i18, num2.intValue(), true);
                    }
                    f1t0.g0("CodecSpecificDataUtil", "Unknown VVC level string: ".concat(str6));
                    return iycVar;
                } catch (NumberFormatException unused7) {
                    dw9.A("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            default:
                return null;
        }
    }

    public static boolean e(androidx.media3.common.b bVar) {
        if (Objects.equals(bVar.p, "application/x-itut-t35")) {
            for (byte[] bArr : bVar.s) {
                int length = bArr.length;
                byte[] bArr2 = d;
                if (length >= bArr2.length) {
                    for (int i = 0; i < bArr2.length; i++) {
                        if (bArr[i] == bArr2[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
