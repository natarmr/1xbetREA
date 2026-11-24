package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Matrix;
import android.javax.sip.message.Response;
import android.util.Log;
import android.util.Xml;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class osg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cyu f25781a;
    public brg0 b;
    public boolean c;
    public int d;
    public boolean e;
    public msg0 f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:150:0x0270  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:235:0x037e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0492  */
    /* JADX WARN: Code duplicated, block: B:343:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:388:0x058a  */
    public static void C(xqg0 xqg0Var, String str, String str2) {
        Boolean bool;
        int i;
        String strU;
        jqg0 jqg0VarS;
        String strSubstring;
        jqg0 jqg0VarS2;
        int i2;
        int i3;
        jqg0 jqg0VarR;
        jqg0[] jqg0VarArr;
        int i4;
        int i5;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = lsg0.a(str).ordinal();
        int i6 = 5;
        if (iOrdinal == 1) {
            n660 n660Var = null;
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                tyc tycVar = new tyc(str2.substring(5));
                tycVar.h0();
                jqg0 jqg0VarU = u(tycVar);
                tycVar.g0();
                jqg0 jqg0VarU2 = u(tycVar);
                tycVar.g0();
                jqg0 jqg0VarU3 = u(tycVar);
                tycVar.g0();
                jqg0 jqg0VarU4 = u(tycVar);
                tycVar.h0();
                if (tycVar.u(')') || tycVar.y()) {
                    n660Var = new n660();
                    n660Var.f22981a = jqg0VarU;
                    n660Var.b = jqg0VarU2;
                    n660Var.c = jqg0VarU3;
                    n660Var.d = jqg0VarU4;
                }
            }
            n660 n660Var2 = n660Var;
            xqg0Var.p = n660Var2;
            if (n660Var2 != null) {
                xqg0Var.f41318a |= 1048576;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            xqg0Var.x = r(str2);
            xqg0Var.f41318a |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            xqg0Var.l1 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
            xqg0Var.f41318a |= 536870912;
        }
        try {
            if (iOrdinal == 5) {
                xqg0Var.k = n(str2);
                xqg0Var.f41318a |= 4096;
                return;
            }
            if (iOrdinal == 8) {
                int i7 = str2.equals("ltr") ? 1 : !str2.equals("rtl") ? 0 : 2;
                xqg0Var.j1 = i7;
                if (i7 != 0) {
                    xqg0Var.f41318a |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                xqg0Var.y = r(str2);
                xqg0Var.f41318a |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                xqg0Var.j = v(str2);
                xqg0Var.f41318a |= 2048;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                xqg0Var.o = bool;
                if (bool != null) {
                    xqg0Var.f41318a |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                int i8 = str2.equals("none") ? 1 : !str2.equals("non-scaling-stroke") ? 0 : 2;
                xqg0Var.m1 = i8;
                if (i8 != 0) {
                    xqg0Var.f41318a |= 34359738368L;
                    return;
                }
                return;
            }
            bqg0 bqg0Var = bqg0.f3029a;
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    xqg0Var.z = bqg0Var;
                } else {
                    try {
                        xqg0Var.z = n(str2);
                    } catch (fsg0 e) {
                        Log.w("SVGParser", e.getMessage());
                        return;
                    }
                }
                xqg0Var.f41318a |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                xqg0Var.A = v(str2);
                xqg0Var.f41318a |= 4294967296L;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        i = 2;
                        break;
                    case "end":
                        i = 3;
                        break;
                    case "start":
                        i = 1;
                        break;
                    default:
                        i = 0;
                        break;
                }
                xqg0Var.k1 = i;
                if (i != 0) {
                    xqg0Var.f41318a |= 262144;
                    return;
                }
                return;
            }
            if (iOrdinal == 75) {
                switch (str2) {
                    case "line-through":
                        i6 = 4;
                        break;
                    case "underline":
                        i6 = 2;
                        break;
                    case "none":
                        i6 = 1;
                        break;
                    case "blink":
                        break;
                    case "overline":
                        i6 = 3;
                        break;
                    default:
                        i6 = 0;
                        break;
                }
                xqg0Var.i1 = i6;
                if (i6 != 0) {
                    xqg0Var.f41318a |= 131072;
                    return;
                }
                return;
            }
            switch (iOrdinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2 + '|')) {
                            xqg0Var.t = Boolean.valueOf(!str2.equals("none"));
                            xqg0Var.f41318a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    grg0 grg0VarW = w(str2);
                    xqg0Var.b = grg0VarW;
                    if (grg0VarW != null) {
                        xqg0Var.f41318a |= 1;
                    }
                    break;
                case 16:
                    int i9 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                    xqg0Var.Z = i9;
                    if (i9 != 0) {
                        xqg0Var.f41318a |= 2;
                    }
                    break;
                case 17:
                    Float fV = v(str2);
                    xqg0Var.c = fV;
                    if (fV != null) {
                        xqg0Var.f41318a |= 4;
                    }
                    break;
                case 18:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2 + '|')) {
                        tyc tycVar2 = new tyc(str2);
                        Integer num = null;
                        String str3 = null;
                        int i10 = 0;
                        while (true) {
                            strU = tycVar2.U('/', false);
                            tycVar2.h0();
                            if (strU == null) {
                                break;
                            } else if (num == null || i10 == 0) {
                                if (!strU.equals("normal") && (num != null || (num = (Integer) jsg0.f17050a.get(strU)) == null)) {
                                    if (i10 == 0) {
                                        switch (strU) {
                                            case "oblique":
                                                i10 = 3;
                                                break;
                                            case "italic":
                                                i10 = 2;
                                                break;
                                            case "normal":
                                                i10 = 1;
                                                break;
                                            default:
                                                i10 = 0;
                                                break;
                                        }
                                        if (i10 != 0) {
                                            continue;
                                        }
                                    }
                                    if (str3 == null && strU.equals("small-caps")) {
                                        str3 = strU;
                                    }
                                }
                            }
                        }
                        try {
                            jqg0VarS = (jqg0) isg0.f15302a.get(strU);
                            if (jqg0VarS == null) {
                                jqg0VarS = s(strU);
                            }
                        } catch (fsg0 unused) {
                            jqg0VarS = null;
                        }
                        if (tycVar2.u('/')) {
                            tycVar2.h0();
                            String strT = tycVar2.T();
                            if (strT != null) {
                                s(strT);
                            }
                            tycVar2.h0();
                        }
                        if (tycVar2.y()) {
                            strSubstring = null;
                        } else {
                            int i11 = tycVar2.b;
                            tycVar2.b = tycVar2.c;
                            strSubstring = ((String) tycVar2.d).substring(i11);
                        }
                        xqg0Var.l = q(strSubstring);
                        xqg0Var.m = jqg0VarS;
                        xqg0Var.n = Integer.valueOf(num == null ? Response.BAD_REQUEST : num.intValue());
                        if (i10 == 0) {
                            i10 = 1;
                        }
                        xqg0Var.h1 = i10;
                        xqg0Var.f41318a |= 122880;
                        break;
                    }
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    ArrayList arrayListQ = q(str2);
                    xqg0Var.l = arrayListQ;
                    if (arrayListQ != null) {
                        xqg0Var.f41318a |= 8192;
                    }
                    break;
                case 20:
                    try {
                        jqg0 jqg0Var = (jqg0) isg0.f15302a.get(str2);
                        jqg0VarS2 = jqg0Var == null ? s(str2) : jqg0Var;
                    } catch (fsg0 unused2) {
                        jqg0VarS2 = null;
                    }
                    xqg0Var.m = jqg0VarS2;
                    if (jqg0VarS2 != null) {
                        xqg0Var.f41318a |= 16384;
                    }
                    break;
                case 21:
                    Integer num2 = (Integer) jsg0.f17050a.get(str2);
                    xqg0Var.n = num2;
                    if (num2 != null) {
                        xqg0Var.f41318a |= 32768;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            i2 = 3;
                            break;
                        case "italic":
                            i2 = 2;
                            break;
                        case "normal":
                            i2 = 1;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    xqg0Var.h1 = i2;
                    if (i2 != 0) {
                        xqg0Var.f41318a |= 65536;
                    }
                    break;
                default:
                    switch (iOrdinal) {
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            switch (str2) {
                                case "optimizeQuality":
                                    i3 = 2;
                                    break;
                                case "auto":
                                    i3 = 1;
                                    break;
                                case "optimizeSpeed":
                                    i3 = 3;
                                    break;
                                default:
                                    i3 = 0;
                                    break;
                            }
                            xqg0Var.n1 = i3;
                            if (i3 != 0) {
                                xqg0Var.f41318a |= 137438953472L;
                            }
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            String strR = r(str2);
                            xqg0Var.q = strR;
                            xqg0Var.r = strR;
                            xqg0Var.s = strR;
                            xqg0Var.f41318a |= 14680064;
                            break;
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                            xqg0Var.q = r(str2);
                            xqg0Var.f41318a |= 2097152;
                            break;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            xqg0Var.r = r(str2);
                            xqg0Var.f41318a |= 4194304;
                            break;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            xqg0Var.s = r(str2);
                            xqg0Var.f41318a |= 8388608;
                            break;
                        default:
                            switch (iOrdinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        xqg0Var.v = bqg0Var;
                                    } else {
                                        try {
                                            xqg0Var.v = n(str2);
                                        } catch (fsg0 e2) {
                                            Log.w("SVGParser", e2.getMessage());
                                            return;
                                        }
                                    }
                                    xqg0Var.f41318a |= 67108864;
                                    break;
                                case 63:
                                    xqg0Var.w = v(str2);
                                    xqg0Var.f41318a |= 134217728;
                                    break;
                                case 64:
                                    grg0 grg0VarW2 = w(str2);
                                    xqg0Var.d = grg0VarW2;
                                    if (grg0VarW2 != null) {
                                        xqg0Var.f41318a |= 8;
                                    }
                                    break;
                                case 65:
                                    if (!"none".equals(str2)) {
                                        tyc tycVar3 = new tyc(str2);
                                        tycVar3.h0();
                                        if (tycVar3.y() || (jqg0VarR = tycVar3.R()) == null || jqg0VarR.f()) {
                                            jqg0VarArr = null;
                                        } else {
                                            float f = jqg0VarR.f16952a;
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(jqg0VarR);
                                            while (true) {
                                                if (!tycVar3.y()) {
                                                    tycVar3.g0();
                                                    jqg0 jqg0VarR2 = tycVar3.R();
                                                    if (jqg0VarR2 != null && !jqg0VarR2.f()) {
                                                        arrayList.add(jqg0VarR2);
                                                        f += jqg0VarR2.f16952a;
                                                    }
                                                } else if (f != 0.0f) {
                                                    jqg0VarArr = (jqg0[]) arrayList.toArray(new jqg0[arrayList.size()]);
                                                }
                                                jqg0VarArr = null;
                                            }
                                        }
                                        xqg0Var.h = jqg0VarArr;
                                        if (jqg0VarArr != null) {
                                            xqg0Var.f41318a |= 512;
                                        }
                                    } else {
                                        xqg0Var.h = null;
                                        xqg0Var.f41318a |= 512;
                                    }
                                    break;
                                case 66:
                                    xqg0Var.i = s(str2);
                                    xqg0Var.f41318a |= 1024;
                                    break;
                                case 67:
                                    if ("butt".equals(str2)) {
                                        i4 = 1;
                                    } else if ("round".equals(str2)) {
                                        i4 = 2;
                                    } else {
                                        i4 = "square".equals(str2) ? 3 : 0;
                                    }
                                    xqg0Var.f1 = i4;
                                    if (i4 != 0) {
                                        xqg0Var.f41318a |= 64;
                                    }
                                    break;
                                case 68:
                                    if ("miter".equals(str2)) {
                                        i5 = 1;
                                    } else if ("round".equals(str2)) {
                                        i5 = 2;
                                    } else {
                                        i5 = "bevel".equals(str2) ? 3 : 0;
                                    }
                                    xqg0Var.g1 = i5;
                                    if (i5 != 0) {
                                        xqg0Var.f41318a |= 128;
                                    }
                                    break;
                                case 69:
                                    xqg0Var.g = Float.valueOf(p(str2));
                                    xqg0Var.f41318a |= 256;
                                    break;
                                case 70:
                                    Float fV2 = v(str2);
                                    xqg0Var.e = fV2;
                                    if (fV2 != null) {
                                        xqg0Var.f41318a |= 16;
                                    }
                                    break;
                                case 71:
                                    xqg0Var.f = s(str2);
                                    xqg0Var.f41318a |= 32;
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                xqg0Var.B = bqg0Var;
                                            } else {
                                                try {
                                                    xqg0Var.B = n(str2);
                                                } catch (fsg0 e3) {
                                                    Log.w("SVGParser", e3.getMessage());
                                                    return;
                                                }
                                            }
                                            xqg0Var.f41318a |= 8589934592L;
                                            break;
                                        case 89:
                                            xqg0Var.Y = v(str2);
                                            xqg0Var.f41318a |= 17179869184L;
                                            break;
                                        case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2 + '|')) {
                                                    xqg0Var.u = Boolean.valueOf(str2.equals("visible"));
                                                    xqg0Var.f41318a |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (fsg0 unused3) {
        }
    }

    public static int b(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int d(float f, float f2, float f3) {
        float f4 = 0.0f;
        float f5 = f % 360.0f;
        if (f < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= 0.0f) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        return b(e(f10, f9, f6 - 2.0f) * 256.0f) | (b(e(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (b(e(f10, f9, f6) * 256.0f) << 8);
    }

    public static float e(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return rw2.a(f2, f, f3, f);
        }
        if (f3 < 3.0f) {
            return f2;
        }
        return f3 < 4.0f ? rw2.a(4.0f, f3, f2 - f, f) : f;
    }

    public static void f(zqg0 zqg0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iB = kng0.b(attributes, i);
            if (iB != 73) {
                switch (iB) {
                    case 52:
                        tyc tycVar = new tyc(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!tycVar.y()) {
                            String strT = tycVar.T();
                            if (strT.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strT.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            tycVar.h0();
                        }
                        zqg0Var.d(hashSet);
                        break;
                    case 53:
                        zqg0Var.i(strTrim);
                        break;
                    case 54:
                        tyc tycVar2 = new tyc(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!tycVar2.y()) {
                            hashSet2.add(tycVar2.T());
                            tycVar2.h0();
                        }
                        zqg0Var.j(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListQ = q(strTrim);
                        zqg0Var.h(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                        break;
                }
            } else {
                tyc tycVar3 = new tyc(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!tycVar3.y()) {
                    String strT2 = tycVar3.T();
                    int iIndexOf = strT2.indexOf(45);
                    if (iIndexOf != -1) {
                        strT2 = strT2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strT2, "", "").getLanguage());
                    tycVar3.h0();
                }
                zqg0Var.f(hashSet3);
            }
        }
    }

    public static void g(drg0 drg0Var, Attributes attributes) throws fsg0 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals(ParameterNames.ID) || qName.equals("xml:id")) {
                drg0Var.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    drg0Var.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new fsg0(kng0.k("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    drg0Var.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(eqg0 eqg0Var, Attributes attributes) throws fsg0 {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iB = kng0.b(attributes, i2);
            if (iB == 23) {
                eqg0Var.j = z(strTrim);
            } else if (iB != 24) {
                if (iB != 26) {
                    if (iB == 60) {
                        if (strTrim != null) {
                            try {
                                if (strTrim.equals("pad")) {
                                    i = 1;
                                } else if (strTrim.equals("reflect")) {
                                    i = 2;
                                } else if (strTrim.equals("repeat")) {
                                    i = 3;
                                } else {
                                    jf4.o("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(strTrim));
                                }
                                eqg0Var.k = i;
                            } catch (IllegalArgumentException unused) {
                                throw new fsg0(kng0.l("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                            }
                        } else {
                            hny.u("Name is null");
                        }
                        i = 0;
                        eqg0Var.k = i;
                    } else {
                        continue;
                    }
                } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    eqg0Var.l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                eqg0Var.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    e9d0.s("Invalid value for attribute gradientUnits");
                    return;
                }
                eqg0Var.i = Boolean.TRUE;
            }
        }
    }

    public static void i(sqg0 sqg0Var, Attributes attributes, String str) throws fsg0 {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (lsg0.a(attributes.getLocalName(i)) == lsg0.b) {
                tyc tycVar = new tyc(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                tycVar.h0();
                while (!tycVar.y()) {
                    float fP = tycVar.P();
                    if (Float.isNaN(fP)) {
                        throw new fsg0(kng0.l("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    tycVar.g0();
                    float fP2 = tycVar.P();
                    if (Float.isNaN(fP2)) {
                        throw new fsg0(kng0.l("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    tycVar.g0();
                    arrayList.add(Float.valueOf(fP));
                    arrayList.add(Float.valueOf(fP2));
                }
                sqg0Var.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    sqg0Var.o[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void j(drg0 drg0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iB = kng0.b(attributes, i);
                if (iB == 0) {
                    rh9 rh9Var = new rh9(strTrim);
                    ArrayList arrayList = null;
                    while (!rh9Var.y()) {
                        String strT = rh9Var.T();
                        if (strT != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strT);
                            rh9Var.h0();
                        }
                    }
                    drg0Var.g = arrayList;
                } else if (iB != 72) {
                    xqg0 xqg0Var = drg0Var.e;
                    if (xqg0Var == null) {
                        xqg0Var = new xqg0();
                        drg0Var.e = xqg0Var;
                    }
                    C(xqg0Var, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    tyc tycVar = new tyc(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strU = tycVar.U(':', false);
                        tycVar.h0();
                        if (!tycVar.u(':')) {
                            break;
                        }
                        tycVar.h0();
                        String strU2 = tycVar.U(';', true);
                        if (strU2 == null) {
                            break;
                        }
                        tycVar.h0();
                        if (tycVar.y() || tycVar.u(';')) {
                            xqg0 xqg0Var2 = drg0Var.f;
                            if (xqg0Var2 == null) {
                                xqg0Var2 = new xqg0();
                                drg0Var.f = xqg0Var2;
                            }
                            C(xqg0Var2, strU, strU2);
                            tycVar.h0();
                        }
                    }
                }
            }
        }
    }

    public static void k(srg0 srg0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iB = kng0.b(attributes, i);
            if (iB == 9) {
                srg0Var.p = t(strTrim);
            } else if (iB == 10) {
                srg0Var.q = t(strTrim);
            } else if (iB == 82) {
                srg0Var.n = t(strTrim);
            } else if (iB == 83) {
                srg0Var.o = t(strTrim);
            }
        }
    }

    public static void l(hqg0 hqg0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (lsg0.a(attributes.getLocalName(i)) == lsg0.c) {
                hqg0Var.k(z(attributes.getValue(i)));
            }
        }
    }

    public static void m(jrg0 jrg0Var, Attributes attributes) throws fsg0 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iB = kng0.b(attributes, i);
            if (iB == 48) {
                x(jrg0Var, strTrim);
            } else if (iB != 80) {
                continue;
            } else {
                tyc tycVar = new tyc(strTrim);
                tycVar.h0();
                float fP = tycVar.P();
                tycVar.g0();
                float fP2 = tycVar.P();
                tycVar.g0();
                float fP3 = tycVar.P();
                tycVar.g0();
                float fP4 = tycVar.P();
                if (Float.isNaN(fP) || Float.isNaN(fP2) || Float.isNaN(fP3) || Float.isNaN(fP4)) {
                    e9d0.s("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (fP3 < 0.0f) {
                    e9d0.s("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (fP4 < 0.0f) {
                        e9d0.s("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    jrg0Var.o = new gz40(fP, fP2, fP3, fP4);
                }
            }
        }
    }

    public static aqg0 n(String str) throws fsg0 {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            ejx ejxVar = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (true) {
                    if (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j = j2 * 16;
                                i = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j = j2 * 16;
                                i = cCharAt - 'a';
                            }
                            j2 = j + ((long) i) + 10;
                        } else {
                            j2 = (j2 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j2 <= 4294967295L) {
                            i2++;
                        }
                    }
                    if (i2 != 1) {
                        ejxVar = new ejx(j2, i2);
                    }
                }
            }
            if (ejxVar == null) {
                throw new fsg0("Bad hex colour value: ".concat(str));
            }
            long j3 = ejxVar.b;
            int i3 = ejxVar.f7928a;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new aqg0(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new aqg0(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new fsg0("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new aqg0((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new aqg0((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            tyc tycVar = new tyc(str.substring(zStartsWith ? 5 : 4));
            tycVar.h0();
            float fP = tycVar.P();
            if (!Float.isNaN(fP) && tycVar.u('%')) {
                fP = (fP * 256.0f) / 100.0f;
            }
            float fK = tycVar.k(fP);
            if (!Float.isNaN(fK) && tycVar.u('%')) {
                fK = (fK * 256.0f) / 100.0f;
            }
            float fK2 = tycVar.k(fK);
            if (!Float.isNaN(fK2) && tycVar.u('%')) {
                fK2 = (fK2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                tycVar.h0();
                if (Float.isNaN(fK2) || !tycVar.u(')')) {
                    throw new fsg0("Bad rgb() colour value: ".concat(str));
                }
                return new aqg0((b(fP) << 16) | (-16777216) | (b(fK) << 8) | b(fK2));
            }
            float fK3 = tycVar.k(fK2);
            tycVar.h0();
            if (Float.isNaN(fK3) || !tycVar.u(')')) {
                throw new fsg0("Bad rgba() colour value: ".concat(str));
            }
            return new aqg0((b(fK3 * 256.0f) << 24) | (b(fP) << 16) | (b(fK) << 8) | b(fK2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) hsg0.f13581a.get(lowerCase);
            if (num != null) {
                return new aqg0(num.intValue());
            }
            throw new fsg0("Invalid colour keyword: ".concat(lowerCase));
        }
        tyc tycVar2 = new tyc(str.substring(zStartsWith2 ? 5 : 4));
        tycVar2.h0();
        float fP2 = tycVar2.P();
        float fK4 = tycVar2.k(fP2);
        if (!Float.isNaN(fK4)) {
            tycVar2.u('%');
        }
        float fK5 = tycVar2.k(fK4);
        if (!Float.isNaN(fK5)) {
            tycVar2.u('%');
        }
        if (!zStartsWith2) {
            tycVar2.h0();
            if (Float.isNaN(fK5) || !tycVar2.u(')')) {
                throw new fsg0("Bad hsl() colour value: ".concat(str));
            }
            return new aqg0(d(fP2, fK4, fK5) | (-16777216));
        }
        float fK6 = tycVar2.k(fK5);
        tycVar2.h0();
        if (Float.isNaN(fK6) || !tycVar2.u(')')) {
            throw new fsg0("Bad hsla() colour value: ".concat(str));
        }
        return new aqg0((b(fK6 * 256.0f) << 24) | d(fP2, fK4, fK5));
    }

    public static float o(int i, String str) throws fsg0 {
        float fH = new x860().h(0, i, str);
        if (Float.isNaN(fH)) {
            throw new fsg0(kng0.k("Invalid float value: ", str));
        }
        return fH;
    }

    public static float p(String str) throws fsg0 {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        e9d0.s("Invalid float value (empty string)");
        return 0.0f;
    }

    public static ArrayList q(String str) {
        tyc tycVar = new tyc(str);
        ArrayList arrayList = null;
        do {
            String strS = tycVar.S();
            if (strS == null) {
                strS = tycVar.U(',', true);
            }
            if (strS == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strS);
            tycVar.g0();
        } while (!tycVar.y());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(Separators.RPAREN) ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static jqg0 s(String str) throws fsg0 {
        int iB;
        if (str.length() == 0) {
            e9d0.s("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iB = 9;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iB = kng0.B(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new fsg0("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iB = 1;
        }
        try {
            return new jqg0(o(length, str), iB);
        } catch (NumberFormatException e) {
            throw new fsg0("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList t(String str) throws fsg0 {
        if (str.length() == 0) {
            e9d0.s("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        tyc tycVar = new tyc(str);
        tycVar.h0();
        while (!tycVar.y()) {
            float fP = tycVar.P();
            if (Float.isNaN(fP)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) tycVar.d;
                int i = tycVar.b;
                while (!tycVar.y() && !tyc.K(str2.charAt(tycVar.b))) {
                    tycVar.b++;
                }
                String strSubstring = str2.substring(i, tycVar.b);
                tycVar.b = i;
                sb.append(strSubstring);
                throw new fsg0(sb.toString());
            }
            int iV = tycVar.V();
            if (iV == 0) {
                iV = 1;
            }
            arrayList.add(new jqg0(fP, iV));
            tycVar.g0();
        }
        return arrayList;
    }

    public static jqg0 u(tyc tycVar) {
        return tycVar.v("auto") ? new jqg0(0.0f) : tycVar.R();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f = 0.0f;
            if (fP < 0.0f) {
                fP = f;
            } else {
                f = 1.0f;
                if (fP > 1.0f) {
                    fP = f;
                }
            }
            return Float.valueOf(fP);
        } catch (fsg0 unused) {
            return null;
        }
    }

    public static grg0 w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        grg0 grg0VarN = aqg0.c;
        bqg0 bqg0Var = bqg0.f3029a;
        grg0 grg0Var = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return grg0VarN;
            }
            if (str.equals("currentColor")) {
                return bqg0Var;
            }
            try {
                return n(str);
            } catch (fsg0 unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(Separators.RPAREN);
        if (iIndexOf == -1) {
            return new oqg0(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    grg0VarN = bqg0Var;
                } else {
                    try {
                        grg0VarN = n(strTrim2);
                    } catch (fsg0 unused2) {
                        grg0VarN = null;
                    }
                }
            }
            grg0Var = grg0VarN;
        }
        return new oqg0(strTrim, grg0Var);
    }

    public static void x(hrg0 hrg0Var, String str) throws fsg0 {
        int i;
        tyc tycVar = new tyc(str);
        tycVar.h0();
        String strT = tycVar.T();
        if ("defer".equals(strT)) {
            tycVar.h0();
            strT = tycVar.T();
        }
        aub0 aub0Var = (aub0) gsg0.f11828a.get(strT);
        tycVar.h0();
        if (tycVar.y()) {
            i = 0;
        } else {
            String strT2 = tycVar.T();
            strT2.getClass();
            if (strT2.equals("meet")) {
                i = 1;
            } else {
                if (!strT2.equals("slice")) {
                    throw new fsg0("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        hrg0Var.n = new bub0(aub0Var, i);
    }

    public static HashMap y(tyc tycVar) {
        HashMap map = new HashMap();
        tycVar.h0();
        String strU = tycVar.U('=', false);
        while (strU != null) {
            tycVar.u('=');
            map.put(strU, tycVar.S());
            tycVar.h0();
            strU = tycVar.U('=', false);
        }
        return map;
    }

    public static Matrix z(String str) throws fsg0 {
        Matrix matrix = new Matrix();
        tyc tycVar = new tyc(str);
        tycVar.h0();
        while (!tycVar.y()) {
            String str2 = (String) tycVar.d;
            String strSubstring = null;
            if (!tycVar.y()) {
                int i = tycVar.b;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = tycVar.h();
                    }
                }
                int i2 = tycVar.b;
                while (tyc.K(iCharAt)) {
                    iCharAt = tycVar.h();
                }
                if (iCharAt == 40) {
                    tycVar.b++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    tycVar.b = i;
                }
            }
            if (strSubstring == null) {
                throw new fsg0("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    tycVar.h0();
                    float fP = tycVar.P();
                    tycVar.g0();
                    float fP2 = tycVar.P();
                    tycVar.g0();
                    float fP3 = tycVar.P();
                    tycVar.g0();
                    float fP4 = tycVar.P();
                    tycVar.g0();
                    float fP5 = tycVar.P();
                    tycVar.g0();
                    float fP6 = tycVar.P();
                    tycVar.h0();
                    if (Float.isNaN(fP6) || !tycVar.u(')')) {
                        throw new fsg0("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fP, fP3, fP5, fP2, fP4, fP6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    tycVar.h0();
                    float fP7 = tycVar.P();
                    float fA0 = tycVar.a0();
                    float fA1 = tycVar.a0();
                    tycVar.h0();
                    if (Float.isNaN(fP7) || !tycVar.u(')')) {
                        throw new fsg0("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fA0)) {
                        matrix.preRotate(fP7);
                    } else {
                        if (Float.isNaN(fA1)) {
                            throw new fsg0("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fP7, fA0, fA1);
                    }
                    break;
                    break;
                case "scale":
                    tycVar.h0();
                    float fP8 = tycVar.P();
                    float fA2 = tycVar.a0();
                    tycVar.h0();
                    if (Float.isNaN(fP8) || !tycVar.u(')')) {
                        throw new fsg0("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fA2)) {
                        matrix.preScale(fP8, fA2);
                    } else {
                        matrix.preScale(fP8, fP8);
                    }
                    break;
                    break;
                case "skewX":
                    tycVar.h0();
                    float fP9 = tycVar.P();
                    tycVar.h0();
                    if (Float.isNaN(fP9) || !tycVar.u(')')) {
                        throw new fsg0("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fP9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    tycVar.h0();
                    float fP10 = tycVar.P();
                    tycVar.h0();
                    if (Float.isNaN(fP10) || !tycVar.u(')')) {
                        throw new fsg0("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fP10)));
                    break;
                    break;
                case "translate":
                    tycVar.h0();
                    float fP11 = tycVar.P();
                    float fA3 = tycVar.a0();
                    tycVar.h0();
                    if (Float.isNaN(fP11) || !tycVar.u(')')) {
                        throw new fsg0("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fA3)) {
                        matrix.preTranslate(fP11, fA3);
                    } else {
                        matrix.preTranslate(fP11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new fsg0(kng0.l("Invalid transform list fn: ", strSubstring, Separators.RPAREN));
            }
            if (tycVar.y()) {
                return matrix;
            }
            tycVar.g0();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws fsg0 {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            ksg0 ksg0Var = new ksg0(this);
            xMLReader.setContentHandler(ksg0Var);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", ksg0Var);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new fsg0("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new fsg0("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new fsg0("SVG parse error", e3);
        }
    }

    public final void B(InputStream inputStream) throws fsg0 {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                nsg0 nsg0Var = new nsg0();
                nsg0Var.f24050a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        D();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        tyc tycVar = new tyc(xmlPullParserNewPullParser.getText());
                        String strT = tycVar.T();
                        y(tycVar);
                        strT.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((yqg0) this.f25781a.f5196a) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        E(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, nsg0Var);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        G(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        F(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (XmlPullParserException e) {
                throw new fsg0("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new fsg0("Stream error", e2);
        }
    }

    public final void D() {
        cyu cyuVar = new cyu();
        cyuVar.f5196a = null;
        cyuVar.b = new bi9((byte) 0);
        cyuVar.c = new HashMap();
        this.f25781a = cyuVar;
    }

    /* JADX WARN: Code duplicated, block: B:375:0x06cb A[PHI: r1
  0x06cb: PHI (r1v51 int) = (r1v50 int), (r1v52 int), (r1v52 int), (r1v52 int), (r1v50 int) binds: [B:360:0x0673, B:830:0x06cb, B:382:0x06f3, B:374:0x06b8, B:364:0x0682] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:456:0x0923  */
    /* JADX WARN: Code duplicated, block: B:459:0x092a  */
    /* JADX WARN: Code duplicated, block: B:829:0x0966 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:836:0x094a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v42 */
    public final void E(String str, String str2, String str3, Attributes attributes) throws fsg0 {
        int i;
        char c;
        float fP;
        float f;
        int i2;
        char cCharAt;
        Object[] objArr;
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            msg0 msg0Var = (msg0) msg0.e.get(str2.length() > 0 ? str2 : str3);
            if (msg0Var == null) {
                msg0Var = msg0.d;
            }
            int i3 = 77;
            ?? r10 = 0;
            switch (msg0Var.ordinal()) {
                case 0:
                    yqg0 yqg0Var = new yqg0();
                    yqg0Var.f10017a = this.f25781a;
                    yqg0Var.b = this.b;
                    g(yqg0Var, attributes);
                    j(yqg0Var, attributes);
                    f(yqg0Var, attributes);
                    m(yqg0Var, attributes);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim = attributes.getValue(i4).trim();
                        int iB = kng0.b(attributes, i4);
                        if (iB == 25) {
                            jqg0 jqg0VarS = s(strTrim);
                            yqg0Var.s = jqg0VarS;
                            if (jqg0VarS.f()) {
                                e9d0.s("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        } else if (iB != 79) {
                            switch (iB) {
                                case 81:
                                    jqg0 jqg0VarS2 = s(strTrim);
                                    yqg0Var.r = jqg0VarS2;
                                    if (jqg0VarS2.f()) {
                                        e9d0.s("Invalid <svg> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    yqg0Var.p = s(strTrim);
                                    break;
                                case 83:
                                    yqg0Var.q = s(strTrim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                    }
                    brg0 brg0Var = this.b;
                    if (brg0Var == null) {
                        this.f25781a.f5196a = yqg0Var;
                    } else {
                        brg0Var.g(yqg0Var);
                    }
                    this.b = yqg0Var;
                    return;
                case 1:
                case 7:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    gqg0 gqg0Var = new gqg0();
                    gqg0Var.f10017a = this.f25781a;
                    gqg0Var.b = this.b;
                    g(gqg0Var, attributes);
                    j(gqg0Var, attributes);
                    l(gqg0Var, attributes);
                    f(gqg0Var, attributes);
                    this.b.g(gqg0Var);
                    this.b = gqg0Var;
                    return;
                case 2:
                    brg0 brg0Var2 = this.b;
                    if (brg0Var2 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ypg0 ypg0Var = new ypg0();
                    ypg0Var.f10017a = this.f25781a;
                    ypg0Var.b = brg0Var2;
                    g(ypg0Var, attributes);
                    j(ypg0Var, attributes);
                    l(ypg0Var, attributes);
                    f(ypg0Var, attributes);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String strTrim2 = attributes.getValue(i5).trim();
                        int iB2 = kng0.b(attributes, i5);
                        if (iB2 == 6) {
                            ypg0Var.o = s(strTrim2);
                        } else if (iB2 == 7) {
                            ypg0Var.p = s(strTrim2);
                        } else if (iB2 != 49) {
                            continue;
                        } else {
                            jqg0 jqg0VarS3 = s(strTrim2);
                            ypg0Var.q = jqg0VarS3;
                            if (jqg0VarS3.f()) {
                                e9d0.s("Invalid <circle> element. r cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.g(ypg0Var);
                    return;
                case 3:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    zpg0 zpg0Var = new zpg0();
                    zpg0Var.f10017a = this.f25781a;
                    zpg0Var.b = this.b;
                    g(zpg0Var, attributes);
                    j(zpg0Var, attributes);
                    l(zpg0Var, attributes);
                    f(zpg0Var, attributes);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String strTrim3 = attributes.getValue(i6).trim();
                        if (kng0.b(attributes, i6) == 3) {
                            if ("objectBoundingBox".equals(strTrim3)) {
                                zpg0Var.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim3)) {
                                    e9d0.s("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                                zpg0Var.o = Boolean.TRUE;
                            }
                        }
                    }
                    this.b.g(zpg0Var);
                    this.b = zpg0Var;
                    return;
                case 4:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    cqg0 cqg0Var = new cqg0();
                    cqg0Var.f10017a = this.f25781a;
                    cqg0Var.b = this.b;
                    g(cqg0Var, attributes);
                    j(cqg0Var, attributes);
                    l(cqg0Var, attributes);
                    this.b.g(cqg0Var);
                    this.b = cqg0Var;
                    return;
                case 5:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    this.e = true;
                    this.f = msg0Var;
                    return;
                case 6:
                    brg0 brg0Var3 = this.b;
                    if (brg0Var3 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    dqg0 dqg0Var = new dqg0();
                    dqg0Var.f10017a = this.f25781a;
                    dqg0Var.b = brg0Var3;
                    g(dqg0Var, attributes);
                    j(dqg0Var, attributes);
                    l(dqg0Var, attributes);
                    f(dqg0Var, attributes);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String strTrim4 = attributes.getValue(i7).trim();
                        int iB3 = kng0.b(attributes, i7);
                        if (iB3 == 6) {
                            dqg0Var.o = s(strTrim4);
                        } else if (iB3 == 7) {
                            dqg0Var.p = s(strTrim4);
                        } else if (iB3 == 56) {
                            jqg0 jqg0VarS4 = s(strTrim4);
                            dqg0Var.q = jqg0VarS4;
                            if (jqg0VarS4.f()) {
                                e9d0.s("Invalid <ellipse> element. rx cannot be negative");
                                return;
                            }
                        } else if (iB3 != 57) {
                            continue;
                        } else {
                            jqg0 jqg0VarS5 = s(strTrim4);
                            dqg0Var.r = jqg0VarS5;
                            if (jqg0VarS5.f()) {
                                e9d0.s("Invalid <ellipse> element. ry cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.g(dqg0Var);
                    return;
                case 8:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    iqg0 iqg0Var = new iqg0();
                    iqg0Var.f10017a = this.f25781a;
                    iqg0Var.b = this.b;
                    g(iqg0Var, attributes);
                    j(iqg0Var, attributes);
                    l(iqg0Var, attributes);
                    f(iqg0Var, attributes);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim5 = attributes.getValue(i8).trim();
                        int iB4 = kng0.b(attributes, i8);
                        if (iB4 == 25) {
                            jqg0 jqg0VarS6 = s(strTrim5);
                            iqg0Var.s = jqg0VarS6;
                            if (jqg0VarS6.f()) {
                                e9d0.s("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (iB4 != 26) {
                            if (iB4 != 48) {
                                switch (iB4) {
                                    case 81:
                                        jqg0 jqg0VarS7 = s(strTrim5);
                                        iqg0Var.r = jqg0VarS7;
                                        if (jqg0VarS7.f()) {
                                            e9d0.s("Invalid <use> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case 82:
                                        iqg0Var.p = s(strTrim5);
                                        break;
                                    case 83:
                                        iqg0Var.q = s(strTrim5);
                                        break;
                                }
                            } else {
                                x(iqg0Var, strTrim5);
                            }
                        } else if ("".equals(attributes.getURI(i8)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i8))) {
                            iqg0Var.o = strTrim5;
                        }
                    }
                    this.b.g(iqg0Var);
                    this.b = iqg0Var;
                    return;
                case 9:
                    brg0 brg0Var4 = this.b;
                    if (brg0Var4 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    kqg0 kqg0Var = new kqg0();
                    kqg0Var.f10017a = this.f25781a;
                    kqg0Var.b = brg0Var4;
                    g(kqg0Var, attributes);
                    j(kqg0Var, attributes);
                    l(kqg0Var, attributes);
                    f(kqg0Var, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String strTrim6 = attributes.getValue(i9).trim();
                        switch (kng0.b(attributes, i9)) {
                            case 84:
                                kqg0Var.o = s(strTrim6);
                                break;
                            case 85:
                                kqg0Var.p = s(strTrim6);
                                break;
                            case 86:
                                kqg0Var.q = s(strTrim6);
                                break;
                            case 87:
                                kqg0Var.r = s(strTrim6);
                                break;
                        }
                    }
                    this.b.g(kqg0Var);
                    return;
                case 10:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    erg0 erg0Var = new erg0();
                    erg0Var.f10017a = this.f25781a;
                    erg0Var.b = this.b;
                    g(erg0Var, attributes);
                    j(erg0Var, attributes);
                    h(erg0Var, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String strTrim7 = attributes.getValue(i10).trim();
                        switch (kng0.b(attributes, i10)) {
                            case 84:
                                erg0Var.m = s(strTrim7);
                                break;
                            case 85:
                                erg0Var.n = s(strTrim7);
                                break;
                            case 86:
                                erg0Var.o = s(strTrim7);
                                break;
                            case 87:
                                erg0Var.p = s(strTrim7);
                                break;
                        }
                    }
                    this.b.g(erg0Var);
                    this.b = erg0Var;
                    return;
                case 11:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    lqg0 lqg0Var = new lqg0();
                    lqg0Var.f10017a = this.f25781a;
                    lqg0Var.b = this.b;
                    g(lqg0Var, attributes);
                    j(lqg0Var, attributes);
                    f(lqg0Var, attributes);
                    m(lqg0Var, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim8 = attributes.getValue(i11).trim();
                        int iB5 = kng0.b(attributes, i11);
                        if (iB5 != 41) {
                            if (iB5 == 50) {
                                lqg0Var.q = s(strTrim8);
                            } else if (iB5 != 51) {
                                switch (iB5) {
                                    case 32:
                                        jqg0 jqg0VarS8 = s(strTrim8);
                                        lqg0Var.t = jqg0VarS8;
                                        if (jqg0VarS8.f()) {
                                            e9d0.s("Invalid <marker> element. markerHeight cannot be negative");
                                            return;
                                        }
                                        continue;
                                    case 33:
                                        if ("strokeWidth".equals(strTrim8)) {
                                            lqg0Var.p = false;
                                            continue;
                                        } else {
                                            if (!"userSpaceOnUse".equals(strTrim8)) {
                                                e9d0.s("Invalid value for attribute markerUnits");
                                                return;
                                            }
                                            lqg0Var.p = true;
                                        }
                                        break;
                                    case 34:
                                        jqg0 jqg0VarS9 = s(strTrim8);
                                        lqg0Var.s = jqg0VarS9;
                                        if (jqg0VarS9.f()) {
                                            e9d0.s("Invalid <marker> element. markerWidth cannot be negative");
                                            return;
                                        }
                                        break;
                                }
                            } else {
                                lqg0Var.r = s(strTrim8);
                            }
                        } else if ("auto".equals(strTrim8)) {
                            lqg0Var.u = Float.valueOf(Float.NaN);
                        } else {
                            lqg0Var.u = Float.valueOf(p(strTrim8));
                        }
                    }
                    this.b.g(lqg0Var);
                    this.b = lqg0Var;
                    return;
                case 12:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    mqg0 mqg0Var = new mqg0();
                    mqg0Var.f10017a = this.f25781a;
                    mqg0Var.b = this.b;
                    g(mqg0Var, attributes);
                    j(mqg0Var, attributes);
                    f(mqg0Var, attributes);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim9 = attributes.getValue(i12).trim();
                        int iB6 = kng0.b(attributes, i12);
                        if (iB6 == 25) {
                            jqg0 jqg0VarS10 = s(strTrim9);
                            mqg0Var.q = jqg0VarS10;
                            if (jqg0VarS10.f()) {
                                e9d0.s("Invalid <mask> element. height cannot be negative");
                                return;
                            }
                        } else if (iB6 != 36) {
                            if (iB6 != 37) {
                                switch (iB6) {
                                    case 81:
                                        jqg0 jqg0VarS11 = s(strTrim9);
                                        mqg0Var.p = jqg0VarS11;
                                        if (jqg0VarS11.f()) {
                                            e9d0.s("Invalid <mask> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case 82:
                                        s(strTrim9);
                                        break;
                                    case 83:
                                        s(strTrim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim9)) {
                                mqg0Var.n = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim9)) {
                                    e9d0.s("Invalid value for attribute maskUnits");
                                    return;
                                }
                                mqg0Var.n = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim9)) {
                            mqg0Var.o = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim9)) {
                                e9d0.s("Invalid value for attribute maskContentUnits");
                                return;
                            }
                            mqg0Var.o = Boolean.TRUE;
                        }
                    }
                    this.b.g(mqg0Var);
                    this.b = mqg0Var;
                    return;
                case 13:
                    brg0 brg0Var5 = this.b;
                    if (brg0Var5 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    pqg0 pqg0Var = new pqg0();
                    pqg0Var.f10017a = this.f25781a;
                    pqg0Var.b = brg0Var5;
                    g(pqg0Var, attributes);
                    j(pqg0Var, attributes);
                    l(pqg0Var, attributes);
                    f(pqg0Var, attributes);
                    int i13 = 0;
                    while (i13 < attributes.getLength()) {
                        String strTrim10 = attributes.getValue(i13).trim();
                        int iB7 = kng0.b(attributes, i13);
                        if (iB7 == 13) {
                            tyc tycVar = new tyc(strTrim10);
                            tyc tycVar2 = new tyc((byte) 5, (boolean) r10);
                            tycVar2.b = r10;
                            tycVar2.c = r10;
                            tycVar2.d = new byte[8];
                            tycVar2.e = new float[16];
                            if (tycVar.y()) {
                                i = i13;
                            } else {
                                int iIntValue = tycVar.O().intValue();
                                char c2 = 'm';
                                if (iIntValue == i3 || iIntValue == 109) {
                                    float f2 = 0.0f;
                                    float f3 = 0.0f;
                                    float f4 = 0.0f;
                                    float f5 = 0.0f;
                                    float f6 = 0.0f;
                                    float f7 = 0.0f;
                                    while (true) {
                                        tycVar.h0();
                                        switch (iIntValue) {
                                            case 65:
                                            case 97:
                                                i = i13;
                                                c = c2;
                                                float f8 = f4;
                                                float fP2 = tycVar.P();
                                                float fK = tycVar.k(fP2);
                                                float fK2 = tycVar.k(fK);
                                                Boolean boolJ = tycVar.j(Float.valueOf(fK2));
                                                Boolean boolJ2 = tycVar.j(boolJ);
                                                if (boolJ2 == null) {
                                                    fP = Float.NaN;
                                                } else {
                                                    tycVar.g0();
                                                    fP = tycVar.P();
                                                }
                                                float fK3 = tycVar.k(fP);
                                                if (Float.isNaN(fK3) || fP2 < 0.0f || fK < 0.0f) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    float f9 = fP;
                                                    if (iIntValue == 97) {
                                                        fK3 += f8;
                                                        f = f9 + f2;
                                                    } else {
                                                        f = f9;
                                                    }
                                                    float f10 = fK3;
                                                    tycVar2.d(fP2, fK, fK2, boolJ.booleanValue(), boolJ2.booleanValue(), f, f10);
                                                    f2 = f;
                                                    f3 = f2;
                                                    f4 = f10;
                                                    f5 = f4;
                                                    tycVar.g0();
                                                    if (tycVar.y()) {
                                                        i2 = tycVar.b;
                                                        if (i2 != tycVar.c && (((cCharAt = ((String) tycVar.d).charAt(i2)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                            iIntValue = tycVar.O().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 67:
                                            case 99:
                                                i = i13;
                                                c = c2;
                                                float fP3 = tycVar.P();
                                                float fK4 = tycVar.k(fP3);
                                                float fK5 = tycVar.k(fK4);
                                                float fK6 = tycVar.k(fK5);
                                                float fK7 = tycVar.k(fK6);
                                                float fK8 = tycVar.k(fK7);
                                                if (Float.isNaN(fK8)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 99) {
                                                        fK7 += f2;
                                                        fK8 += f4;
                                                        fP3 += f2;
                                                        fK4 += f4;
                                                        fK5 += f2;
                                                        fK6 += f4;
                                                    }
                                                    float f11 = fK5;
                                                    float f12 = fK8;
                                                    float f13 = fK7;
                                                    tycVar2.c(fP3, fK4, f11, fK6, f13, f12);
                                                    f3 = f11;
                                                    f5 = fK6;
                                                    f2 = f13;
                                                    f4 = f12;
                                                    tycVar.g0();
                                                    if (tycVar.y()) {
                                                        i2 = tycVar.b;
                                                        if (i2 != tycVar.c) {
                                                            iIntValue = tycVar.O().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 72:
                                            case 104:
                                                i = i13;
                                                c = c2;
                                                float fP4 = tycVar.P();
                                                if (Float.isNaN(fP4)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 104) {
                                                        fP4 += f2;
                                                    }
                                                    f2 = fP4;
                                                    tycVar2.e(f2, f4);
                                                    f3 = f2;
                                                    tycVar.g0();
                                                    if (tycVar.y()) {
                                                        i2 = tycVar.b;
                                                        if (i2 != tycVar.c) {
                                                            iIntValue = tycVar.O().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 76:
                                            case 108:
                                                i = i13;
                                                char c3 = c2;
                                                float fP5 = tycVar.P();
                                                float fK9 = tycVar.k(fP5);
                                                if (Float.isNaN(fK9)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 108) {
                                                        fP5 += f2;
                                                        fK9 += f4;
                                                    }
                                                    f2 = fP5;
                                                    f4 = fK9;
                                                    tycVar2.e(f2, f4);
                                                    f3 = f2;
                                                    c = c3;
                                                    f5 = f4;
                                                    tycVar.g0();
                                                    if (tycVar.y()) {
                                                        i2 = tycVar.b;
                                                        if (i2 != tycVar.c) {
                                                            iIntValue = tycVar.O().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 77:
                                            case 109:
                                                i = i13;
                                                float fP6 = tycVar.P();
                                                float fK10 = tycVar.k(fP6);
                                                if (Float.isNaN(fK10)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 109 && tycVar2.b != 0) {
                                                        fP6 += f2;
                                                        fK10 += f4;
                                                    }
                                                    f2 = fP6;
                                                    f4 = fK10;
                                                    tycVar2.b(f2, f4);
                                                    f3 = f2;
                                                    f6 = f3;
                                                    f7 = f4;
                                                    c = 'm';
                                                    iIntValue = iIntValue != 109 ? 76 : 108;
                                                    f5 = f7;
                                                    tycVar.g0();
                                                    if (tycVar.y()) {
                                                        i2 = tycVar.b;
                                                        if (i2 != tycVar.c) {
                                                            iIntValue = tycVar.O().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 81:
                                            case 113:
                                                i = i13;
                                                float fP7 = tycVar.P();
                                                float fK11 = tycVar.k(fP7);
                                                float fK12 = tycVar.k(fK11);
                                                float fK13 = tycVar.k(fK12);
                                                if (Float.isNaN(fK13)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 113) {
                                                        fK12 += f2;
                                                        fK13 += f4;
                                                        fP7 += f2;
                                                        fK11 += f4;
                                                    }
                                                    f2 = fK12;
                                                    f4 = fK13;
                                                    f5 = fK11;
                                                    f3 = fP7;
                                                    tycVar2.a(f3, f5, f2, f4);
                                                    c = 'm';
                                                    tycVar.g0();
                                                    if (tycVar.y()) {
                                                        i2 = tycVar.b;
                                                        if (i2 != tycVar.c) {
                                                            iIntValue = tycVar.O().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 83:
                                            case 115:
                                                float f14 = (f2 * 2.0f) - f3;
                                                float f15 = (2.0f * f4) - f5;
                                                float fP8 = tycVar.P();
                                                float fK14 = tycVar.k(fP8);
                                                i = i13;
                                                float fK15 = tycVar.k(fK14);
                                                float fK16 = tycVar.k(fK15);
                                                if (Float.isNaN(fK16)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                } else {
                                                    if (iIntValue == 115) {
                                                        fK15 += f2;
                                                        fK16 += f4;
                                                        fP8 += f2;
                                                        fK14 += f4;
                                                    }
                                                    float f16 = fP8;
                                                    float f17 = fK16;
                                                    float f18 = fK15;
                                                    float f19 = fK14;
                                                    tycVar2.c(f14, f15, f16, f19, f18, f17);
                                                    f3 = f16;
                                                    f5 = f19;
                                                    f2 = f18;
                                                    f4 = f17;
                                                    c = 'm';
                                                    tycVar.g0();
                                                    if (tycVar.y()) {
                                                        i2 = tycVar.b;
                                                        if (i2 != tycVar.c) {
                                                            iIntValue = tycVar.O().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 84:
                                            case 116:
                                                f3 = (f2 * 2.0f) - f3;
                                                f5 = (2.0f * f4) - f5;
                                                float fP9 = tycVar.P();
                                                float fK17 = tycVar.k(fP9);
                                                if (Float.isNaN(fK17)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                    i = i13;
                                                } else {
                                                    if (iIntValue == 116) {
                                                        fP9 += f2;
                                                        fK17 += f4;
                                                    }
                                                    f2 = fP9;
                                                    f4 = fK17;
                                                    tycVar2.a(f3, f5, f2, f4);
                                                    i = i13;
                                                    c = c2;
                                                    tycVar.g0();
                                                    if (tycVar.y()) {
                                                        i2 = tycVar.b;
                                                        if (i2 != tycVar.c) {
                                                            iIntValue = tycVar.O().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case 86:
                                            case 118:
                                                float fP10 = tycVar.P();
                                                if (Float.isNaN(fP10)) {
                                                    Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                    i = i13;
                                                } else {
                                                    if (iIntValue == 118) {
                                                        fP10 += f4;
                                                    }
                                                    f4 = fP10;
                                                    tycVar2.e(f2, f4);
                                                    i = i13;
                                                    c = c2;
                                                    f5 = f4;
                                                    tycVar.g0();
                                                    if (tycVar.y()) {
                                                        i2 = tycVar.b;
                                                        if (i2 != tycVar.c) {
                                                            iIntValue = tycVar.O().intValue();
                                                        }
                                                        c2 = c;
                                                        i13 = i;
                                                    }
                                                }
                                                break;
                                            case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                                            case 122:
                                                tycVar2.close();
                                                i = i13;
                                                c = c2;
                                                f2 = f6;
                                                f3 = f2;
                                                f4 = f7;
                                                f5 = f4;
                                                tycVar.g0();
                                                if (tycVar.y()) {
                                                    i2 = tycVar.b;
                                                    if (i2 != tycVar.c) {
                                                        iIntValue = tycVar.O().intValue();
                                                    }
                                                    c2 = c;
                                                    i13 = i;
                                                }
                                                break;
                                            default:
                                                i = i13;
                                                break;
                                        }
                                    }
                                } else {
                                    i = i13;
                                }
                            }
                            pqg0Var.o = tycVar2;
                        } else {
                            if (iB7 == 43 && p(strTrim10) < 0.0f) {
                                e9d0.s("Invalid <path> element. pathLength cannot be negative");
                                return;
                            }
                            i = i13;
                        }
                        i13 = i + 1;
                        i3 = 77;
                        r10 = 0;
                    }
                    this.b.g(pqg0Var);
                    return;
                case 14:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    rqg0 rqg0Var = new rqg0();
                    rqg0Var.f10017a = this.f25781a;
                    rqg0Var.b = this.b;
                    g(rqg0Var, attributes);
                    j(rqg0Var, attributes);
                    f(rqg0Var, attributes);
                    m(rqg0Var, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim11 = attributes.getValue(i14).trim();
                        int iB8 = kng0.b(attributes, i14);
                        if (iB8 == 25) {
                            jqg0 jqg0VarS12 = s(strTrim11);
                            rqg0Var.v = jqg0VarS12;
                            if (jqg0VarS12.f()) {
                                e9d0.s("Invalid <pattern> element. height cannot be negative");
                                return;
                            }
                        } else if (iB8 != 26) {
                            switch (iB8) {
                                case 44:
                                    if ("objectBoundingBox".equals(strTrim11)) {
                                        rqg0Var.q = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim11)) {
                                            e9d0.s("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                        rqg0Var.q = Boolean.TRUE;
                                    }
                                    break;
                                case 45:
                                    rqg0Var.r = z(strTrim11);
                                    break;
                                case 46:
                                    if ("objectBoundingBox".equals(strTrim11)) {
                                        rqg0Var.p = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim11)) {
                                            e9d0.s("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                        rqg0Var.p = Boolean.TRUE;
                                    }
                                    break;
                                default:
                                    switch (iB8) {
                                        case 81:
                                            jqg0 jqg0VarS13 = s(strTrim11);
                                            rqg0Var.u = jqg0VarS13;
                                            if (jqg0VarS13.f()) {
                                                e9d0.s("Invalid <pattern> element. width cannot be negative");
                                                return;
                                            }
                                            break;
                                            break;
                                        case 82:
                                            rqg0Var.s = s(strTrim11);
                                            break;
                                        case 83:
                                            rqg0Var.t = s(strTrim11);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i14)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i14))) {
                            rqg0Var.w = strTrim11;
                        }
                    }
                    this.b.g(rqg0Var);
                    this.b = rqg0Var;
                    return;
                case 15:
                    brg0 brg0Var6 = this.b;
                    if (brg0Var6 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tqg0 tqg0Var = new tqg0();
                    tqg0Var.f10017a = this.f25781a;
                    tqg0Var.b = brg0Var6;
                    g(tqg0Var, attributes);
                    j(tqg0Var, attributes);
                    l(tqg0Var, attributes);
                    f(tqg0Var, attributes);
                    i(tqg0Var, attributes, "polygon");
                    this.b.g(tqg0Var);
                    return;
                case 16:
                    brg0 brg0Var7 = this.b;
                    if (brg0Var7 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    sqg0 sqg0Var = new sqg0();
                    sqg0Var.f10017a = this.f25781a;
                    sqg0Var.b = brg0Var7;
                    g(sqg0Var, attributes);
                    j(sqg0Var, attributes);
                    l(sqg0Var, attributes);
                    f(sqg0Var, attributes);
                    i(sqg0Var, attributes, "polyline");
                    this.b.g(sqg0Var);
                    return;
                case 17:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    irg0 irg0Var = new irg0();
                    irg0Var.f10017a = this.f25781a;
                    irg0Var.b = this.b;
                    g(irg0Var, attributes);
                    j(irg0Var, attributes);
                    h(irg0Var, attributes);
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String strTrim12 = attributes.getValue(i15).trim();
                        int iB9 = kng0.b(attributes, i15);
                        if (iB9 == 6) {
                            irg0Var.m = s(strTrim12);
                        } else if (iB9 == 7) {
                            irg0Var.n = s(strTrim12);
                        } else if (iB9 == 11) {
                            irg0Var.p = s(strTrim12);
                        } else if (iB9 == 12) {
                            irg0Var.q = s(strTrim12);
                        } else if (iB9 != 49) {
                            continue;
                        } else {
                            jqg0 jqg0VarS14 = s(strTrim12);
                            irg0Var.o = jqg0VarS14;
                            if (jqg0VarS14.f()) {
                                e9d0.s("Invalid <radialGradient> element. r cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.g(irg0Var);
                    this.b = irg0Var;
                    return;
                case 18:
                    brg0 brg0Var8 = this.b;
                    if (brg0Var8 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    uqg0 uqg0Var = new uqg0();
                    uqg0Var.f10017a = this.f25781a;
                    uqg0Var.b = brg0Var8;
                    g(uqg0Var, attributes);
                    j(uqg0Var, attributes);
                    l(uqg0Var, attributes);
                    f(uqg0Var, attributes);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim13 = attributes.getValue(i16).trim();
                        int iB10 = kng0.b(attributes, i16);
                        if (iB10 == 25) {
                            jqg0 jqg0VarS15 = s(strTrim13);
                            uqg0Var.r = jqg0VarS15;
                            if (jqg0VarS15.f()) {
                                e9d0.s("Invalid <rect> element. height cannot be negative");
                                return;
                            }
                        } else if (iB10 == 56) {
                            jqg0 jqg0VarS16 = s(strTrim13);
                            uqg0Var.s = jqg0VarS16;
                            if (jqg0VarS16.f()) {
                                e9d0.s("Invalid <rect> element. rx cannot be negative");
                                return;
                            }
                        } else if (iB10 != 57) {
                            switch (iB10) {
                                case 81:
                                    jqg0 jqg0VarS17 = s(strTrim13);
                                    uqg0Var.q = jqg0VarS17;
                                    if (jqg0VarS17.f()) {
                                        e9d0.s("Invalid <rect> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    uqg0Var.o = s(strTrim13);
                                    break;
                                case 83:
                                    uqg0Var.p = s(strTrim13);
                                    break;
                            }
                        } else {
                            jqg0 jqg0VarS18 = s(strTrim13);
                            uqg0Var.t = jqg0VarS18;
                            if (jqg0VarS18.f()) {
                                e9d0.s("Invalid <rect> element. ry cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.g(uqg0Var);
                    return;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    brg0 brg0Var9 = this.b;
                    if (brg0Var9 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    vqg0 vqg0Var = new vqg0();
                    vqg0Var.f10017a = this.f25781a;
                    vqg0Var.b = brg0Var9;
                    g(vqg0Var, attributes);
                    j(vqg0Var, attributes);
                    this.b.g(vqg0Var);
                    this.b = vqg0Var;
                    return;
                case 20:
                    brg0 brg0Var10 = this.b;
                    if (brg0Var10 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(brg0Var10 instanceof eqg0)) {
                        e9d0.s("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                    wqg0 wqg0Var = new wqg0();
                    wqg0Var.f10017a = this.f25781a;
                    wqg0Var.b = brg0Var10;
                    g(wqg0Var, attributes);
                    j(wqg0Var, attributes);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim14 = attributes.getValue(i17).trim();
                        if (kng0.b(attributes, i17) == 39) {
                            if (strTrim14.length() == 0) {
                                e9d0.s("Invalid offset value in <stop> (empty string)");
                                return;
                            }
                            int length = strTrim14.length();
                            if (strTrim14.charAt(strTrim14.length() - 1) == '%') {
                                length--;
                                objArr = true;
                            } else {
                                objArr = false;
                            }
                            try {
                                float fO = o(length, strTrim14);
                                float f20 = 100.0f;
                                if (objArr != false) {
                                    fO /= 100.0f;
                                }
                                if (fO < 0.0f) {
                                    f20 = 0.0f;
                                } else if (fO <= 100.0f) {
                                    f20 = fO;
                                }
                                wqg0Var.h = Float.valueOf(f20);
                            } catch (NumberFormatException e) {
                                throw new fsg0("Invalid offset value in <stop>: ".concat(strTrim14), e);
                            }
                        }
                    }
                    this.b.g(wqg0Var);
                    this.b = wqg0Var;
                    return;
                case 21:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    String str4 = "all";
                    boolean zEquals = true;
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim15 = attributes.getValue(i18).trim();
                        int iB11 = kng0.b(attributes, i18);
                        if (iB11 == 38) {
                            str4 = strTrim15;
                        } else if (iB11 == 77) {
                            zEquals = strTrim15.equals("text/css");
                        }
                    }
                    if (zEquals) {
                        rh9 rh9Var = new rh9(str4);
                        rh9Var.h0();
                        for (sh9 sh9Var : u3u0.d(rh9Var)) {
                            if (sh9Var == sh9.f32202a || sh9Var == sh9.b) {
                                this.h = true;
                                return;
                            }
                        }
                    }
                    this.c = true;
                    this.d = 1;
                    return;
                case 22:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    krg0 krg0Var = new krg0();
                    krg0Var.f10017a = this.f25781a;
                    krg0Var.b = this.b;
                    g(krg0Var, attributes);
                    j(krg0Var, attributes);
                    l(krg0Var, attributes);
                    f(krg0Var, attributes);
                    this.b.g(krg0Var);
                    this.b = krg0Var;
                    return;
                case 23:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    lrg0 lrg0Var = new lrg0();
                    lrg0Var.f10017a = this.f25781a;
                    lrg0Var.b = this.b;
                    g(lrg0Var, attributes);
                    j(lrg0Var, attributes);
                    f(lrg0Var, attributes);
                    m(lrg0Var, attributes);
                    this.b.g(lrg0Var);
                    this.b = lrg0Var;
                    return;
                case 24:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    org0 org0Var = new org0();
                    org0Var.f10017a = this.f25781a;
                    org0Var.b = this.b;
                    g(org0Var, attributes);
                    j(org0Var, attributes);
                    l(org0Var, attributes);
                    f(org0Var, attributes);
                    k(org0Var, attributes);
                    this.b.g(org0Var);
                    this.b = org0Var;
                    return;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    rrg0 rrg0Var = new rrg0();
                    rrg0Var.f10017a = this.f25781a;
                    rrg0Var.b = this.b;
                    g(rrg0Var, attributes);
                    j(rrg0Var, attributes);
                    f(rrg0Var, attributes);
                    for (int i19 = 0; i19 < attributes.getLength(); i19++) {
                        String strTrim16 = attributes.getValue(i19).trim();
                        int iB12 = kng0.b(attributes, i19);
                        if (iB12 != 26) {
                            if (iB12 == 61) {
                                rrg0Var.o = s(strTrim16);
                            }
                        } else if ("".equals(attributes.getURI(i19)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i19))) {
                            rrg0Var.n = strTrim16;
                        }
                    }
                    this.b.g(rrg0Var);
                    this.b = rrg0Var;
                    brg0 brg0Var11 = rrg0Var.b;
                    if (brg0Var11 instanceof org0) {
                        rrg0Var.p = (org0) brg0Var11;
                        return;
                    } else {
                        rrg0Var.p = ((prg0) brg0Var11).c();
                        return;
                    }
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    brg0 brg0Var12 = this.b;
                    if (brg0Var12 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(brg0Var12 instanceof qrg0)) {
                        e9d0.s("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                    mrg0 mrg0Var = new mrg0();
                    mrg0Var.f10017a = this.f25781a;
                    mrg0Var.b = this.b;
                    g(mrg0Var, attributes);
                    j(mrg0Var, attributes);
                    f(mrg0Var, attributes);
                    for (int i20 = 0; i20 < attributes.getLength(); i20++) {
                        String strTrim17 = attributes.getValue(i20).trim();
                        if (kng0.b(attributes, i20) == 26 && ("".equals(attributes.getURI(i20)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i20)))) {
                            mrg0Var.n = strTrim17;
                        }
                    }
                    this.b.g(mrg0Var);
                    brg0 brg0Var13 = mrg0Var.b;
                    if (brg0Var13 instanceof org0) {
                        mrg0Var.o = (org0) brg0Var13;
                        return;
                    } else {
                        mrg0Var.o = ((prg0) brg0Var13).c();
                        return;
                    }
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    brg0 brg0Var14 = this.b;
                    if (brg0Var14 == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(brg0Var14 instanceof qrg0)) {
                        e9d0.s("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                    nrg0 nrg0Var = new nrg0();
                    nrg0Var.f10017a = this.f25781a;
                    nrg0Var.b = this.b;
                    g(nrg0Var, attributes);
                    j(nrg0Var, attributes);
                    f(nrg0Var, attributes);
                    k(nrg0Var, attributes);
                    this.b.g(nrg0Var);
                    this.b = nrg0Var;
                    brg0 brg0Var15 = nrg0Var.b;
                    if (brg0Var15 instanceof org0) {
                        nrg0Var.r = (org0) brg0Var15;
                        return;
                    } else {
                        nrg0Var.r = ((prg0) brg0Var15).c();
                        return;
                    }
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    urg0 urg0Var = new urg0();
                    urg0Var.f10017a = this.f25781a;
                    urg0Var.b = this.b;
                    g(urg0Var, attributes);
                    j(urg0Var, attributes);
                    l(urg0Var, attributes);
                    f(urg0Var, attributes);
                    for (int i21 = 0; i21 < attributes.getLength(); i21++) {
                        String strTrim18 = attributes.getValue(i21).trim();
                        int iB13 = kng0.b(attributes, i21);
                        if (iB13 == 25) {
                            jqg0 jqg0VarS19 = s(strTrim18);
                            urg0Var.s = jqg0VarS19;
                            if (jqg0VarS19.f()) {
                                e9d0.s("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (iB13 != 26) {
                            switch (iB13) {
                                case 81:
                                    jqg0 jqg0VarS20 = s(strTrim18);
                                    urg0Var.r = jqg0VarS20;
                                    if (jqg0VarS20.f()) {
                                        e9d0.s("Invalid <use> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    urg0Var.p = s(strTrim18);
                                    break;
                                case 83:
                                    urg0Var.q = s(strTrim18);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i21)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i21))) {
                            urg0Var.o = strTrim18;
                        }
                    }
                    this.b.g(urg0Var);
                    this.b = urg0Var;
                    return;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    if (this.b == null) {
                        e9d0.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                    vrg0 vrg0Var = new vrg0();
                    vrg0Var.f10017a = this.f25781a;
                    vrg0Var.b = this.b;
                    g(vrg0Var, attributes);
                    f(vrg0Var, attributes);
                    m(vrg0Var, attributes);
                    this.b.g(vrg0Var);
                    this.b = vrg0Var;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    public final void F(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            StringBuilder sb = this.g;
            if (sb == null) {
                sb = new StringBuilder(str.length());
                this.g = sb;
            }
            sb.append(str);
            return;
        }
        if (!this.h) {
            if (this.b instanceof qrg0) {
                a(str);
            }
        } else {
            StringBuilder sb2 = this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(str.length());
                this.i = sb2;
            }
            sb2.append(str);
        }
    }

    public final void G(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            StringBuilder sb = this.g;
            if (sb == null) {
                sb = new StringBuilder(i2);
                this.g = sb;
            }
            sb.append(cArr, i, i2);
            return;
        }
        if (!this.h) {
            if (this.b instanceof qrg0) {
                a(new String(cArr, i, i2));
            }
        } else {
            StringBuilder sb2 = this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(i2);
                this.i = sb2;
            }
            sb2.append(cArr, i, i2);
        }
    }

    public final void a(String str) {
        arg0 arg0Var = (arg0) this.b;
        int size = arg0Var.i.size();
        frg0 frg0Var = size == 0 ? null : (frg0) arg0Var.i.get(size - 1);
        if (frg0Var instanceof trg0) {
            trg0 trg0Var = (trg0) frg0Var;
            trg0Var.c = axq.n(new StringBuilder(), trg0Var.c, str);
        } else {
            brg0 brg0Var = this.b;
            trg0 trg0Var2 = new trg0();
            trg0Var2.c = str;
            brg0Var.g(trg0Var2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            msg0 msg0Var = (msg0) msg0.e.get(str2);
            if (msg0Var == null) {
                msg0Var = msg0.d;
            }
            switch (msg0Var.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case 20:
                case 22:
                case 23:
                case 24:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    this.b = ((frg0) this.b).b;
                    break;
                case 5:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    this.e = false;
                    if (this.g != null) {
                        msg0 msg0Var2 = this.f;
                        if (msg0Var2 == msg0.c || msg0Var2 == msg0.f22318a) {
                            this.f25781a.getClass();
                        }
                        this.g.setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String string = sb.toString();
                        u3u0 u3u0Var = new u3u0(1);
                        cyu cyuVar = this.f25781a;
                        rh9 rh9Var = new rh9(string);
                        rh9Var.h0();
                        ((bi9) cyuVar.b).g(u3u0Var.f(rh9Var));
                        this.i.setLength(0);
                    }
                    break;
            }
        }
    }
}
