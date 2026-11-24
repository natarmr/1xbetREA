package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.javax.sip.message.Response;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class mg40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f21724a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        eld0 eld0VarF;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "application/vnd.dvb.ait":
            case "application/x-icy":
            case "application/x-camera-motion":
            case "application/id3":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "application/meta":
            case "audio/ac3":
            case "audio/raw":
            case "application/x-media3-cues":
            case "application/x-itut-t35":
            case "application/x-emsg":
            case "video/apv":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "application/x-scte35":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (eld0VarF = f(str2)) == null || (iA = eld0VarF.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrW = vtt0.W(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrW) {
                if (str2.equals(d(str3))) {
                    if (sb.length() > 0) {
                        sb.append(Separators.COMMA);
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        eld0 eld0VarF;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (eld0VarF = f(str2)) == null) {
                    return 0;
                }
                return eld0VarF.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        eld0 eld0VarF;
        String strE = null;
        if (str != null) {
            String strH0 = j47.H0(str.trim());
            if (strH0.startsWith("avc1") || strH0.startsWith("avc3")) {
                return "video/avc";
            }
            if (strH0.startsWith("hev1") || strH0.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strH0.startsWith("vvc1") || strH0.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (strH0.startsWith("dvav") || strH0.startsWith("dva1") || strH0.startsWith("dvhe") || strH0.startsWith("dvh1") || strH0.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (strH0.startsWith("av01")) {
                return "video/av01";
            }
            if (strH0.startsWith("vp9") || strH0.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strH0.startsWith("vp8") || strH0.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strH0.startsWith("mp4a")) {
                if (strH0.startsWith("mp4a.") && (eld0VarF = f(strH0)) != null) {
                    strE = e(eld0VarF.b);
                }
                return strE == null ? "audio/mp4a-latm" : strE;
            }
            if (strH0.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strH0.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strH0.startsWith("ac-3") || strH0.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strH0.startsWith("ec-3") || strH0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strH0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strH0.startsWith("ac-4") || strH0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strH0.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strH0.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strH0.startsWith("dtsh") || strH0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strH0.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strH0.startsWith("opus")) {
                return "audio/opus";
            }
            if (strH0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strH0.startsWith("flac")) {
                return "audio/flac";
            }
            if (strH0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strH0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strH0.contains("cea708")) {
                return "application/cea-708";
            }
            if (strH0.contains("eia608") || strH0.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f21724a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                hny.b();
                return null;
            }
        }
        return null;
    }

    public static String e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case Response.TRYING /* 100 */:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static eld0 f(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new eld0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, (byte) 8);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if (k(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f21724a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        hny.b();
        return 0;
    }

    public static boolean i(String str) {
        return "audio".equals(g(str));
    }

    public static boolean j(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean k(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean l(String str) {
        return ParameterNames.TEXT.equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m(String str) {
        return "video".equals(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        String strH0 = j47.H0(str);
        strH0.getClass();
        switch (strH0) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strH0;
        }
    }
}
