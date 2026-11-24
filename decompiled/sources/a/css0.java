package a;

import android.gov.nist.core.Separators;
import android.text.Layout;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class css0 implements lfn0 {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final gah0 i = new gah0(1, 30.0f, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f4907a;

    public css0() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f4907a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            e9d0.m("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static ess0 a(ess0 ess0Var) {
        return ess0Var == null ? new ess0() : ess0Var;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(RemoteMessageConst.DATA) || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            f1t0.g0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i3 = Integer.parseInt(strGroup2);
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            x0x.v(i2, i3, "Invalid cell resolution %s %s", z);
            return i3;
        } catch (NumberFormatException unused) {
            f1t0.g0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void e(String str, ess0 ess0Var) throws ffn0 {
        Matcher matcher;
        String str2 = vtt0.f38024a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new ffn0(rz4.j(strArrSplit.length, Separators.DOT, new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            f1t0.g0("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new ffn0(kng0.l("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                ess0Var.j = 3;
                break;
            case "em":
                ess0Var.j = 2;
                break;
            case "px":
                ess0Var.j = 1;
                break;
            default:
                throw new ffn0(kng0.l("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        ess0Var.k = Float.parseFloat(strGroup2);
    }

    public static gah0 g(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = vtt0.f38024a;
            String[] strArrSplit = attributeValue2.split(Separators.SP, -1);
            x0x.z("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f2 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f2 = 1.0f;
        }
        gah0 gah0Var = i;
        int i3 = gah0Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = gah0Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new gah0(i3, i2 * f2, i4);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v20 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v21 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v26 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static void h(org.xmlpull.v1.XmlPullParser r21, java.util.HashMap r22, int r23, a.eld0 r24, java.util.HashMap r25, java.util.HashMap r26) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.css0.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, a.eld0, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    public static bss0 i(XmlPullParser xmlPullParser, bss0 bss0Var, HashMap map, gah0 gah0Var) throws ffn0 {
        long j;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        ess0 ess0VarJ = j(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long jK = -9223372036854775807L;
        long jK2 = -9223372036854775807L;
        long jK3 = -9223372036854775807L;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jK3 = k(attributeValue, gah0Var);
                    break;
                case "end":
                    jK2 = k(attributeValue, gah0Var);
                    break;
                case "begin":
                    jK = k(attributeValue, gah0Var);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = vtt0.f38024a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith(Separators.POUND)) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (bss0Var != null) {
            long j2 = bss0Var.d;
            if (j2 != -9223372036854775807L) {
                jK = jK != -9223372036854775807L ? jK + j2 : j2;
                if (jK2 != -9223372036854775807L) {
                    jK2 += j2;
                }
            }
        }
        if (jK2 != -9223372036854775807L) {
            j = jK2;
        } else {
            if (jK3 != -9223372036854775807L) {
                jK2 = jK + jK3;
            } else if (bss0Var != null) {
                long j3 = bss0Var.e;
                if (j3 != -9223372036854775807L) {
                    j = j3;
                }
            }
            j = jK2;
        }
        return new bss0(xmlPullParser.getName(), null, jK, j, ess0VarJ, strArr, str, strSubstring, bss0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:125:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:155:0x024d  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0269  */
    /* JADX WARN: Code duplicated, block: B:169:0x0288  */
    /* JADX WARN: Code duplicated, block: B:171:0x0299  */
    /* JADX WARN: Code duplicated, block: B:174:0x029f  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:181:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:191:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:192:0x02de  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    public static ess0 j(XmlPullParser xmlPullParser, ess0 ess0Var) {
        byte b2;
        int i2;
        yti0 yti0VarB;
        yti0 yti0VarB2;
        yti0 yti0VarB3;
        String str;
        int iHashCode;
        String str2;
        int iHashCode2;
        int i3;
        s5q0 s5q0Var;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        ess0 ess0VarA = ess0Var;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            String attributeName = xmlPullParser.getAttributeName(i4);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b2 = 0;
                    break;
                case "extent":
                    b2 = 1;
                    break;
                case "fontFamily":
                    b2 = 2;
                    break;
                case "textAlign":
                    b2 = 3;
                    break;
                case "origin":
                    b2 = 4;
                    break;
                case "textDecoration":
                    b2 = 5;
                    break;
                case "fontWeight":
                    b2 = 6;
                    break;
                case "id":
                    b2 = 7;
                    break;
                case "ruby":
                    b2 = 8;
                    break;
                case "color":
                    b2 = 9;
                    break;
                case "shear":
                    b2 = 10;
                    break;
                case "textCombine":
                    b2 = 11;
                    break;
                case "fontSize":
                    b2 = 12;
                    break;
                case "textEmphasis":
                    b2 = 13;
                    break;
                case "rubyPosition":
                    b2 = 14;
                    break;
                case "backgroundColor":
                    b2 = 15;
                    break;
                case "displayAlign":
                    b2 = 16;
                    break;
                case "multiRowAlign":
                    b2 = 17;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b2) {
                case 0:
                    ess0VarA = a(ess0VarA);
                    ess0VarA.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    ess0VarA = a(ess0VarA);
                    ess0VarA.u = attributeValue;
                    break;
                case 2:
                    ess0VarA = a(ess0VarA);
                    ess0VarA.f8346a = attributeValue;
                    break;
                case 3:
                    ess0VarA = a(ess0VarA);
                    String strH0 = j47.H0(attributeValue);
                    strH0.getClass();
                    switch (strH0) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    ess0VarA.o = alignment;
                    break;
                case 4:
                    ess0VarA = a(ess0VarA);
                    ess0VarA.t = attributeValue;
                    break;
                case 5:
                    String strH1 = j47.H0(attributeValue);
                    strH1.getClass();
                    switch (strH1) {
                        case "nounderline":
                            ess0VarA = a(ess0VarA);
                            ess0VarA.g = 0;
                            break;
                        case "underline":
                            ess0VarA = a(ess0VarA);
                            ess0VarA.g = 1;
                            break;
                        case "nolinethrough":
                            ess0VarA = a(ess0VarA);
                            ess0VarA.f = 0;
                            break;
                        case "linethrough":
                            ess0VarA = a(ess0VarA);
                            ess0VarA.f = 1;
                            break;
                    }
                    break;
                case 6:
                    ess0VarA = a(ess0VarA);
                    ess0VarA.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        ess0VarA = a(ess0VarA);
                        ess0VarA.l = attributeValue;
                    }
                    break;
                case 8:
                    String strH2 = j47.H0(attributeValue);
                    strH2.getClass();
                    switch (strH2) {
                        case "baseContainer":
                        case "base":
                            ess0VarA = a(ess0VarA);
                            ess0VarA.m = 2;
                            break;
                        case "container":
                            ess0VarA = a(ess0VarA);
                            ess0VarA.m = 1;
                            break;
                        case "delimiter":
                            ess0VarA = a(ess0VarA);
                            ess0VarA.m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            ess0VarA = a(ess0VarA);
                            ess0VarA.m = 3;
                            break;
                    }
                    break;
                case 9:
                    ess0VarA = a(ess0VarA);
                    try {
                        ess0VarA.b = j4d.a(attributeValue, false);
                        ess0VarA.c = true;
                    } catch (IllegalArgumentException unused) {
                        dw9.A("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 10:
                    ess0 ess0VarA2 = a(ess0VarA);
                    Matcher matcher = e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e2) {
                            f1t0.h0("TtmlParser", "Failed to parse shear: " + attributeValue, e2);
                        }
                    } else {
                        dw9.A("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    ess0VarA2.s = fMin;
                    ess0VarA = ess0VarA2;
                    break;
                case 11:
                    String strH3 = j47.H0(attributeValue);
                    strH3.getClass();
                    if (strH3.equals("all")) {
                        ess0VarA = a(ess0VarA);
                        ess0VarA.q = 1;
                    } else if (strH3.equals("none")) {
                        ess0VarA = a(ess0VarA);
                        ess0VarA.q = 0;
                    }
                    break;
                case 12:
                    try {
                        ess0VarA = a(ess0VarA);
                        e(attributeValue, ess0VarA);
                    } catch (ffn0 unused2) {
                        dw9.A("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 13:
                    ess0VarA = a(ess0VarA);
                    Pattern pattern = s5q0.d;
                    if (attributeValue == null) {
                        s5q0Var = null;
                    } else {
                        String strH4 = j47.H0(attributeValue.trim());
                        if (strH4.isEmpty()) {
                            s5q0Var = null;
                        } else {
                            String[] strArrSplit = TextUtils.split(strH4, s5q0.d);
                            int length = strArrSplit.length;
                            f4x f4xVarL = length != 0 ? length != 1 ? f4x.l(strArrSplit.length, (Object[]) strArrSplit.clone()) : new r5k0(strArrSplit[0]) : ycf0.j;
                            String str4 = (String) g8x.D(d7x.B(s5q0.h, f4xVarL), "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i2 = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i2 = -2;
                                }
                                yti0VarB = d7x.B(s5q0.e, f4xVarL);
                                if (yti0VarB.isEmpty()) {
                                    yti0VarB2 = d7x.B(s5q0.g, f4xVarL);
                                    yti0VarB3 = d7x.B(s5q0.f, f4xVarL);
                                    if (yti0VarB2.isEmpty() || !yti0VarB3.isEmpty()) {
                                        str = (String) g8x.D(yti0VarB2, "filled");
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i5 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            str2 = (String) g8x.D(yti0VarB3, "circle");
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i3 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i3 = 3;
                                                }
                                                s5q0Var = new s5q0(i3, i5, i2);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i3 = 1;
                                            s5q0Var = new s5q0(i3, i5, i2);
                                        } else {
                                            str.equals("filled");
                                        }
                                        str2 = (String) g8x.D(yti0VarB3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i3 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i3 = 3;
                                            }
                                            s5q0Var = new s5q0(i3, i5, i2);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i3 = 1;
                                        s5q0Var = new s5q0(i3, i5, i2);
                                    } else {
                                        s5q0Var = new s5q0(-1, 0, i2);
                                    }
                                } else {
                                    str3 = (String) new dzx(yti0VarB.f43219a, yti0VarB.b).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i6 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        s5q0Var = new s5q0(i6, 0, i2);
                                    } else {
                                        str3.equals("auto");
                                    }
                                    s5q0Var = new s5q0(i6, 0, i2);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i2 = 1;
                            yti0VarB = d7x.B(s5q0.e, f4xVarL);
                            if (yti0VarB.isEmpty()) {
                                str3 = (String) new dzx(yti0VarB.f43219a, yti0VarB.b).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    s5q0Var = new s5q0(i6, 0, i2);
                                } else {
                                    str3.equals("auto");
                                }
                                s5q0Var = new s5q0(i6, 0, i2);
                            } else {
                                yti0VarB2 = d7x.B(s5q0.g, f4xVarL);
                                yti0VarB3 = d7x.B(s5q0.f, f4xVarL);
                                if (yti0VarB2.isEmpty()) {
                                    str = (String) g8x.D(yti0VarB2, "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) g8x.D(yti0VarB3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i3 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i3 = 3;
                                            }
                                            s5q0Var = new s5q0(i3, i5, i2);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i3 = 1;
                                        s5q0Var = new s5q0(i3, i5, i2);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) g8x.D(yti0VarB3, "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i3 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i3 = 3;
                                        }
                                        s5q0Var = new s5q0(i3, i5, i2);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i3 = 1;
                                    s5q0Var = new s5q0(i3, i5, i2);
                                } else {
                                    str = (String) g8x.D(yti0VarB2, "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) g8x.D(yti0VarB3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i3 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i3 = 3;
                                            }
                                            s5q0Var = new s5q0(i3, i5, i2);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i3 = 1;
                                        s5q0Var = new s5q0(i3, i5, i2);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) g8x.D(yti0VarB3, "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i3 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i3 = 3;
                                        }
                                        s5q0Var = new s5q0(i3, i5, i2);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i3 = 1;
                                    s5q0Var = new s5q0(i3, i5, i2);
                                }
                            }
                        }
                    }
                    ess0VarA.r = s5q0Var;
                    break;
                case 14:
                    String strH5 = j47.H0(attributeValue);
                    strH5.getClass();
                    if (strH5.equals("before")) {
                        ess0VarA = a(ess0VarA);
                        ess0VarA.n = 1;
                    } else if (strH5.equals("after")) {
                        ess0VarA = a(ess0VarA);
                        ess0VarA.n = 2;
                    }
                    break;
                case 15:
                    ess0VarA = a(ess0VarA);
                    try {
                        ess0VarA.d = j4d.a(attributeValue, false);
                        ess0VarA.e = true;
                    } catch (IllegalArgumentException unused3) {
                        dw9.A("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 16:
                    ess0VarA = a(ess0VarA);
                    ess0VarA.v = attributeValue;
                    break;
                case 17:
                    ess0VarA = a(ess0VarA);
                    String strH6 = j47.H0(attributeValue);
                    strH6.getClass();
                    switch (strH6) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    ess0VarA.p = alignment;
                    break;
            }
        }
        return ess0VarA;
    }

    public static long k(String str, gah0 gah0Var) throws ffn0 {
        double d2;
        double d3;
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d4 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d5 = d4 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d6 = d5 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d7 = d6 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d8 = d7 + (strGroup5 != null ? Long.parseLong(strGroup5) / gah0Var.f10965a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d8 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) gah0Var.b)) / ((double) gah0Var.f10965a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new ffn0(kng0.k("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d9 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d2 = gah0Var.f10965a;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            case "h":
                d3 = 3600.0d;
                break;
            case "m":
                d3 = 60.0d;
                break;
            case "t":
                d2 = gah0Var.c;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            case "ms":
                d2 = 1000.0d;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            default:
                return (long) (d9 * 1000000.0d);
        }
        d9 *= d3;
        return (long) (d9 * 1000000.0d);
    }

    public static eld0 l(XmlPullParser xmlPullParser) {
        String strN = u4n0.n(xmlPullParser, "extent");
        if (strN == null) {
            return null;
        }
        Matcher matcher = g.matcher(strN);
        if (!matcher.matches()) {
            f1t0.g0("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strN));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new eld0(i2, Integer.parseInt(strGroup2), (byte) 11);
        } catch (NumberFormatException unused) {
            f1t0.g0("TtmlParser", "Ignoring malformed tts extent: ".concat(strN));
            return null;
        }
    }

    @Override // a.lfn0
    public final void d(byte[] bArr, int i2, int i3, kfn0 kfn0Var, rbe rbeVar) {
        pzw.V(f(bArr, i2, i3), kfn0Var, rbeVar);
    }

    @Override // a.lfn0
    public final dfn0 f(byte[] bArr, int i2, int i3) {
        dfn0 dfn0Var;
        dfn0 dfn0Var2 = null;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f4907a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new dss0("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            gah0 gah0VarG = i;
            int iC = 15;
            int i4 = 0;
            vkr0 vkr0Var = null;
            eld0 eld0VarL = null;
            while (eventType != 1) {
                bss0 bss0Var = (bss0) arrayDeque.peek();
                if (i4 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    dfn0Var = dfn0Var2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                gah0VarG = g(xmlPullParserNewPullParser);
                                iC = c(xmlPullParserNewPullParser);
                                eld0VarL = l(xmlPullParserNewPullParser);
                            }
                            gah0 gah0Var = gah0VarG;
                            int i5 = iC;
                            eld0 eld0Var = eld0VarL;
                            if (b(name)) {
                                if ("head".equals(name)) {
                                    h(xmlPullParserNewPullParser, map, i5, eld0Var, map2, map3);
                                } else {
                                    try {
                                        bss0 bss0VarI = i(xmlPullParserNewPullParser, bss0Var, map2, gah0Var);
                                        arrayDeque.push(bss0VarI);
                                        if (bss0Var != null) {
                                            ArrayList arrayList = bss0Var.m;
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                bss0Var.m = arrayList;
                                            }
                                            arrayList.add(bss0VarI);
                                        }
                                    } catch (ffn0 e2) {
                                        f1t0.h0("TtmlParser", "Suppressing parser error", e2);
                                        i4++;
                                    }
                                }
                                eld0VarL = eld0Var;
                                iC = i5;
                                gah0VarG = gah0Var;
                            } else {
                                f1t0.a0("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            }
                            i4++;
                            eld0VarL = eld0Var;
                            iC = i5;
                            gah0VarG = gah0Var;
                        } catch (IOException e3) {
                            e = e3;
                            hny.q("Unexpected error when reading input.", e);
                            return dfn0Var;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            hny.q("Unable to decode source", e);
                            return dfn0Var;
                        }
                    } else if (eventType == 4) {
                        bss0Var.getClass();
                        bss0 bss0VarA = bss0.a(xmlPullParserNewPullParser.getText());
                        ArrayList arrayList2 = bss0Var.m;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            bss0Var.m = arrayList2;
                        }
                        arrayList2.add(bss0VarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            bss0 bss0Var2 = (bss0) arrayDeque.peek();
                            bss0Var2.getClass();
                            vkr0Var = new vkr0(bss0Var2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    dfn0Var = dfn0Var2;
                    if (eventType == 2) {
                        i4++;
                    } else if (eventType == 3) {
                        i4--;
                    }
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                dfn0Var2 = dfn0Var;
            }
            dfn0Var = dfn0Var2;
            vkr0Var.getClass();
            return vkr0Var;
        } catch (IOException e5) {
            e = e5;
            dfn0Var = dfn0Var2;
        } catch (XmlPullParserException e6) {
            e = e6;
            dfn0Var = dfn0Var2;
        }
    }
}
