package a;

import android.gov.nist.core.Separators;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class jko {
    public static final Pattern b = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern c = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final ArrayList e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16680a;

    static {
        hko hkoVar = new hko((byte) 0);
        hkoVar.b = 0;
        e = Collections.list(hkoVar);
    }

    public jko() {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        hko hkoVar = new hko((byte) 1);
        hkoVar.b = 0;
        this.f16680a = Collections.list(hkoVar);
    }

    public static Pair a(String str) {
        if (str.contains(Separators.COMMA)) {
            String[] strArrSplit = str.split(Separators.COMMA, -1);
            Pair pairA = a(strArrSplit[0]);
            if (((Integer) pairA.first).intValue() == 2) {
                return pairA;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairA2 = a(strArrSplit[i]);
                int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairA;
        }
        if (!str.contains(Separators.SLASH)) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > 65535) {
                        return j < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split(Separators.SLASH, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(arrayList, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x030c  */
    /* JADX WARN: Code duplicated, block: B:104:0x031d A[LOOP:9: B:102:0x031a->B:104:0x031d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0336  */
    /* JADX WARN: Code duplicated, block: B:109:0x0347 A[LOOP:10: B:107:0x0344->B:109:0x0347, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0369 A[LOOP:11: B:111:0x0367->B:112:0x0369, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x037f  */
    /* JADX WARN: Code duplicated, block: B:115:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:117:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:119:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:122:0x03db  */
    /* JADX WARN: Code duplicated, block: B:61:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x018b A[LOOP:1: B:66:0x0188->B:68:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01af A[LOOP:2: B:70:0x01ad->B:71:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e2 A[LOOP:3: B:76:0x01df->B:78:0x01e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x022a A[LOOP:4: B:80:0x0228->B:81:0x022a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0249  */
    /* JADX WARN: Code duplicated, block: B:87:0x0257 A[LOOP:5: B:85:0x0254->B:87:0x0257, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x027b A[LOOP:6: B:89:0x0279->B:90:0x027b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0290  */
    /* JADX WARN: Code duplicated, block: B:95:0x029e A[LOOP:7: B:93:0x029b->B:95:0x029e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x02eb A[LOOP:8: B:97:0x02e9->B:98:0x02eb, LOOP_END] */
    public final void c(List list, String str, String str2) {
        ByteOrder byteOrder;
        int i;
        int i2;
        int i3;
        int i4;
        gko gkoVar;
        int i5;
        String[] strArrSplit;
        int length;
        int[] iArr;
        int i6;
        ByteBuffer byteBufferWrap;
        int i7;
        String[] strArrSplit2;
        long[] jArr;
        int i8;
        int i9;
        String[] strArrSplit3;
        int length2;
        br8[] br8VarArr;
        int i10;
        ByteBuffer byteBufferWrap2;
        int i11;
        String[] strArrSplit4;
        int length3;
        int[] iArr2;
        int i12;
        ByteBuffer byteBufferWrap3;
        int i13;
        String[] strArrSplit5;
        int length4;
        br8[] br8VarArr2;
        int i14;
        ByteBuffer byteBufferWrap4;
        int i15;
        String[] strArrSplit6;
        int length5;
        double[] dArr;
        int i16;
        ByteBuffer byteBufferWrap5;
        int i17;
        String str3 = str;
        String strReplaceAll = str2;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = c.matcher(strReplaceAll).find();
            boolean zFind2 = d.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                l8x.E0("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", Separators.COLON);
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        int i18 = 3;
        byte b2 = 2;
        int i19 = 1;
        if (strReplaceAll != null && lko.d.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = b.matcher(strReplaceAll);
                if (!matcher.find()) {
                    l8x.E0("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                String strGroup = matcher.group(1);
                strGroup.getClass();
                sb.append(Integer.parseInt(strGroup));
                sb.append("/1,");
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                sb.append(Integer.parseInt(strGroup2));
                sb.append("/1,");
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                sb.append(Integer.parseInt(strGroup3));
                sb.append("/1");
                strReplaceAll = sb.toString();
            } else {
                try {
                    strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                } catch (NumberFormatException e2) {
                    l8x.F0("ExifData", ua80.i("Invalid value for ", str3, " : ", strReplaceAll), e2);
                    return;
                }
            }
        }
        int i20 = 0;
        int i21 = 0;
        while (true) {
            wko[] wkoVarArr = lko.b;
            if (i21 >= 4) {
                return;
            }
            wko wkoVar = (wko) ((HashMap) e.get(i21)).get(str3);
            if (wkoVar != null) {
                int i22 = wkoVar.d;
                byte b3 = wkoVar.c;
                if (strReplaceAll != null) {
                    Pair pairA = a(strReplaceAll);
                    int i23 = -1;
                    if (b3 != ((Integer) pairA.first).intValue() && b3 != ((Integer) pairA.second).intValue()) {
                        if (i22 != -1 && (i22 == ((Integer) pairA.first).intValue() || i22 == ((Integer) pairA.second).intValue())) {
                            switch (i22) {
                                case 1:
                                    byteOrder = byteOrder2;
                                    i = i18;
                                    i3 = i21;
                                    Map map = (Map) list.get(i3);
                                    Charset charset = gko.d;
                                    i4 = i19;
                                    if (strReplaceAll.length() == i4) {
                                        i2 = 0;
                                        if (strReplaceAll.charAt(0) < '0') {
                                        }
                                        map.put(str3, gkoVar);
                                    } else {
                                        i2 = 0;
                                    }
                                    byte[] bytes = strReplaceAll.getBytes(gko.d);
                                    gkoVar = new gko(bytes, i4, bytes.length);
                                    map.put(str3, gkoVar);
                                    break;
                                case 2:
                                case 7:
                                    byteOrder = byteOrder2;
                                    i = i18;
                                    i3 = i21;
                                    i5 = i19;
                                    Map map2 = (Map) list.get(i3);
                                    Charset charset2 = gko.d;
                                    byte[] bytes2 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(gko.d);
                                    b2 = 2;
                                    map2.put(str3, new gko(bytes2, 2, bytes2.length));
                                    i2 = 0;
                                    i4 = i5;
                                    break;
                                case 3:
                                    byteOrder = byteOrder2;
                                    i3 = i21;
                                    i5 = i19;
                                    i = i18;
                                    strArrSplit = strReplaceAll.split(Separators.COMMA, -1);
                                    length = strArrSplit.length;
                                    iArr = new int[length];
                                    for (i6 = 0; i6 < strArrSplit.length; i6++) {
                                        iArr[i6] = Integer.parseInt(strArrSplit[i6]);
                                    }
                                    Map map3 = (Map) list.get(i3);
                                    byteBufferWrap = ByteBuffer.wrap(new byte[gko.f[i] * length]);
                                    byteBufferWrap.order(byteOrder);
                                    for (i7 = 0; i7 < length; i7++) {
                                        byteBufferWrap.putShort((short) iArr[i7]);
                                    }
                                    map3.put(str3, new gko(byteBufferWrap.array(), i, length));
                                    i2 = 0;
                                    b2 = 2;
                                    i4 = i5;
                                    break;
                                case 4:
                                    byteOrder = byteOrder2;
                                    i3 = i21;
                                    i5 = i19;
                                    i = i18;
                                    strArrSplit2 = strReplaceAll.split(Separators.COMMA, -1);
                                    jArr = new long[strArrSplit2.length];
                                    for (i8 = 0; i8 < strArrSplit2.length; i8++) {
                                        jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                    }
                                    ((Map) list.get(i3)).put(str3, gko.b(jArr, byteOrder));
                                    i2 = 0;
                                    b2 = 2;
                                    i4 = i5;
                                    break;
                                case 5:
                                    i5 = i19;
                                    i9 = -1;
                                    strArrSplit3 = strReplaceAll.split(Separators.COMMA, -1);
                                    length2 = strArrSplit3.length;
                                    br8VarArr = new br8[length2];
                                    i10 = i20;
                                    while (i10 < strArrSplit3.length) {
                                        String[] strArrSplit7 = strArrSplit3[i10].split(Separators.SLASH, i9);
                                        br8VarArr[i10] = new br8((byte) 3, (long) Double.parseDouble(strArrSplit7[i20]), (long) Double.parseDouble(strArrSplit7[i5]));
                                        i10++;
                                        i18 = i18;
                                        byteOrder2 = byteOrder2;
                                        i21 = i21;
                                        i20 = 0;
                                        i9 = -1;
                                    }
                                    ByteOrder byteOrder3 = byteOrder2;
                                    i = i18;
                                    i3 = i21;
                                    Map map4 = (Map) list.get(i3);
                                    byteBufferWrap2 = ByteBuffer.wrap(new byte[gko.f[5] * length2]);
                                    byteOrder = byteOrder3;
                                    byteBufferWrap2.order(byteOrder);
                                    for (i11 = 0; i11 < length2; i11++) {
                                        br8 br8Var = br8VarArr[i11];
                                        byteBufferWrap2.putInt((int) br8Var.b);
                                        byteBufferWrap2.putInt((int) br8Var.c);
                                    }
                                    map4.put(str3, new gko(byteBufferWrap2.array(), 5, length2));
                                    i2 = 0;
                                    b2 = 2;
                                    i4 = i5;
                                    break;
                                case 9:
                                    i5 = i19;
                                    strArrSplit4 = strReplaceAll.split(Separators.COMMA, -1);
                                    length3 = strArrSplit4.length;
                                    iArr2 = new int[length3];
                                    for (i12 = i20; i12 < strArrSplit4.length; i12++) {
                                        iArr2[i12] = Integer.parseInt(strArrSplit4[i12]);
                                    }
                                    Map map5 = (Map) list.get(i21);
                                    byteBufferWrap3 = ByteBuffer.wrap(new byte[gko.f[9] * length3]);
                                    byteBufferWrap3.order(byteOrder2);
                                    for (i13 = i20; i13 < length3; i13++) {
                                        byteBufferWrap3.putInt(iArr2[i13]);
                                    }
                                    map5.put(str3, new gko(byteBufferWrap3.array(), 9, length3));
                                    b2 = 2;
                                    byteOrder = byteOrder2;
                                    i = i18;
                                    i2 = i20;
                                    i3 = i21;
                                    i4 = i5;
                                    break;
                                case 10:
                                    i5 = i19;
                                    strArrSplit5 = strReplaceAll.split(Separators.COMMA, -1);
                                    length4 = strArrSplit5.length;
                                    br8VarArr2 = new br8[length4];
                                    i14 = i20;
                                    while (i14 < strArrSplit5.length) {
                                        String[] strArrSplit8 = strArrSplit5[i14].split(Separators.SLASH, i23);
                                        br8VarArr2[i14] = new br8((byte) 3, (long) Double.parseDouble(strArrSplit8[i20]), (long) Double.parseDouble(strArrSplit8[i5]));
                                        i14++;
                                        length4 = length4;
                                        i23 = -1;
                                    }
                                    Map map6 = (Map) list.get(i21);
                                    byteBufferWrap4 = ByteBuffer.wrap(new byte[gko.f[10] * length4]);
                                    byteBufferWrap4.order(byteOrder2);
                                    for (i15 = i20; i15 < length4; i15++) {
                                        br8 br8Var2 = br8VarArr2[i15];
                                        byteBufferWrap4.putInt((int) br8Var2.b);
                                        byteBufferWrap4.putInt((int) br8Var2.c);
                                    }
                                    map6.put(str3, new gko(byteBufferWrap4.array(), 10, length4));
                                    b2 = 2;
                                    byteOrder = byteOrder2;
                                    i = i18;
                                    i2 = i20;
                                    i3 = i21;
                                    i4 = i5;
                                    break;
                                case 12:
                                    strArrSplit6 = strReplaceAll.split(Separators.COMMA, -1);
                                    length5 = strArrSplit6.length;
                                    dArr = new double[length5];
                                    for (i16 = i20; i16 < strArrSplit6.length; i16++) {
                                        dArr[i16] = Double.parseDouble(strArrSplit6[i16]);
                                    }
                                    Map map7 = (Map) list.get(i21);
                                    byteBufferWrap5 = ByteBuffer.wrap(new byte[gko.f[12] * length5]);
                                    byteBufferWrap5.order(byteOrder2);
                                    i17 = i20;
                                    while (i17 < length5) {
                                        double[] dArr2 = dArr;
                                        byteBufferWrap5.putDouble(dArr2[i17]);
                                        i17++;
                                        i19 = i19;
                                        dArr = dArr2;
                                    }
                                    i5 = i19;
                                    map7.put(str3, new gko(byteBufferWrap5.array(), 12, length5));
                                    byteOrder = byteOrder2;
                                    i = i18;
                                    i2 = i20;
                                    i3 = i21;
                                    i4 = i5;
                                    break;
                            }
                        } else if (b3 == i19 || b3 == 7 || b3 == b2) {
                            i22 = b3;
                            switch (i22) {
                                case 1:
                                    byteOrder = byteOrder2;
                                    i = i18;
                                    i3 = i21;
                                    Map map8 = (Map) list.get(i3);
                                    Charset charset3 = gko.d;
                                    i4 = i19;
                                    if (strReplaceAll.length() == i4) {
                                        i2 = 0;
                                        if (strReplaceAll.charAt(0) < '0') {
                                        }
                                        map8.put(str3, gkoVar);
                                    } else {
                                        i2 = 0;
                                    }
                                    byte[] bytes3 = strReplaceAll.getBytes(gko.d);
                                    gkoVar = new gko(bytes3, i4, bytes3.length);
                                    map8.put(str3, gkoVar);
                                    break;
                                case 2:
                                case 7:
                                    byteOrder = byteOrder2;
                                    i = i18;
                                    i3 = i21;
                                    i5 = i19;
                                    Map map9 = (Map) list.get(i3);
                                    Charset charset4 = gko.d;
                                    byte[] bytes4 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(gko.d);
                                    b2 = 2;
                                    map9.put(str3, new gko(bytes4, 2, bytes4.length));
                                    i2 = 0;
                                    i4 = i5;
                                    break;
                                case 3:
                                    byteOrder = byteOrder2;
                                    i3 = i21;
                                    i5 = i19;
                                    i = i18;
                                    strArrSplit = strReplaceAll.split(Separators.COMMA, -1);
                                    length = strArrSplit.length;
                                    iArr = new int[length];
                                    while (i6 < strArrSplit.length) {
                                        iArr[i6] = Integer.parseInt(strArrSplit[i6]);
                                    }
                                    Map map10 = (Map) list.get(i3);
                                    byteBufferWrap = ByteBuffer.wrap(new byte[gko.f[i] * length]);
                                    byteBufferWrap.order(byteOrder);
                                    while (i7 < length) {
                                        byteBufferWrap.putShort((short) iArr[i7]);
                                    }
                                    map10.put(str3, new gko(byteBufferWrap.array(), i, length));
                                    i2 = 0;
                                    b2 = 2;
                                    i4 = i5;
                                    break;
                                case 4:
                                    byteOrder = byteOrder2;
                                    i3 = i21;
                                    i5 = i19;
                                    i = i18;
                                    strArrSplit2 = strReplaceAll.split(Separators.COMMA, -1);
                                    jArr = new long[strArrSplit2.length];
                                    while (i8 < strArrSplit2.length) {
                                        jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                    }
                                    ((Map) list.get(i3)).put(str3, gko.b(jArr, byteOrder));
                                    i2 = 0;
                                    b2 = 2;
                                    i4 = i5;
                                    break;
                                case 5:
                                    i5 = i19;
                                    i9 = -1;
                                    strArrSplit3 = strReplaceAll.split(Separators.COMMA, -1);
                                    length2 = strArrSplit3.length;
                                    br8VarArr = new br8[length2];
                                    i10 = i20;
                                    while (i10 < strArrSplit3.length) {
                                        String[] strArrSplit9 = strArrSplit3[i10].split(Separators.SLASH, i9);
                                        br8VarArr[i10] = new br8((byte) 3, (long) Double.parseDouble(strArrSplit9[i20]), (long) Double.parseDouble(strArrSplit9[i5]));
                                        i10++;
                                        i18 = i18;
                                        byteOrder2 = byteOrder2;
                                        i21 = i21;
                                        i20 = 0;
                                        i9 = -1;
                                    }
                                    ByteOrder byteOrder4 = byteOrder2;
                                    i = i18;
                                    i3 = i21;
                                    Map map11 = (Map) list.get(i3);
                                    byteBufferWrap2 = ByteBuffer.wrap(new byte[gko.f[5] * length2]);
                                    byteOrder = byteOrder4;
                                    byteBufferWrap2.order(byteOrder);
                                    while (i11 < length2) {
                                        br8 br8Var3 = br8VarArr[i11];
                                        byteBufferWrap2.putInt((int) br8Var3.b);
                                        byteBufferWrap2.putInt((int) br8Var3.c);
                                    }
                                    map11.put(str3, new gko(byteBufferWrap2.array(), 5, length2));
                                    i2 = 0;
                                    b2 = 2;
                                    i4 = i5;
                                    break;
                                case 9:
                                    i5 = i19;
                                    strArrSplit4 = strReplaceAll.split(Separators.COMMA, -1);
                                    length3 = strArrSplit4.length;
                                    iArr2 = new int[length3];
                                    while (i12 < strArrSplit4.length) {
                                        iArr2[i12] = Integer.parseInt(strArrSplit4[i12]);
                                    }
                                    Map map12 = (Map) list.get(i21);
                                    byteBufferWrap3 = ByteBuffer.wrap(new byte[gko.f[9] * length3]);
                                    byteBufferWrap3.order(byteOrder2);
                                    while (i13 < length3) {
                                        byteBufferWrap3.putInt(iArr2[i13]);
                                    }
                                    map12.put(str3, new gko(byteBufferWrap3.array(), 9, length3));
                                    b2 = 2;
                                    byteOrder = byteOrder2;
                                    i = i18;
                                    i2 = i20;
                                    i3 = i21;
                                    i4 = i5;
                                    break;
                                case 10:
                                    i5 = i19;
                                    strArrSplit5 = strReplaceAll.split(Separators.COMMA, -1);
                                    length4 = strArrSplit5.length;
                                    br8VarArr2 = new br8[length4];
                                    i14 = i20;
                                    while (i14 < strArrSplit5.length) {
                                        String[] strArrSplit10 = strArrSplit5[i14].split(Separators.SLASH, i23);
                                        br8VarArr2[i14] = new br8((byte) 3, (long) Double.parseDouble(strArrSplit10[i20]), (long) Double.parseDouble(strArrSplit10[i5]));
                                        i14++;
                                        length4 = length4;
                                        i23 = -1;
                                    }
                                    Map map13 = (Map) list.get(i21);
                                    byteBufferWrap4 = ByteBuffer.wrap(new byte[gko.f[10] * length4]);
                                    byteBufferWrap4.order(byteOrder2);
                                    while (i15 < length4) {
                                        br8 br8Var4 = br8VarArr2[i15];
                                        byteBufferWrap4.putInt((int) br8Var4.b);
                                        byteBufferWrap4.putInt((int) br8Var4.c);
                                    }
                                    map13.put(str3, new gko(byteBufferWrap4.array(), 10, length4));
                                    b2 = 2;
                                    byteOrder = byteOrder2;
                                    i = i18;
                                    i2 = i20;
                                    i3 = i21;
                                    i4 = i5;
                                    break;
                                case 12:
                                    strArrSplit6 = strReplaceAll.split(Separators.COMMA, -1);
                                    length5 = strArrSplit6.length;
                                    dArr = new double[length5];
                                    while (i16 < strArrSplit6.length) {
                                        dArr[i16] = Double.parseDouble(strArrSplit6[i16]);
                                    }
                                    Map map14 = (Map) list.get(i21);
                                    byteBufferWrap5 = ByteBuffer.wrap(new byte[gko.f[12] * length5]);
                                    byteBufferWrap5.order(byteOrder2);
                                    i17 = i20;
                                    while (i17 < length5) {
                                        double[] dArr3 = dArr;
                                        byteBufferWrap5.putDouble(dArr3[i17]);
                                        i17++;
                                        i19 = i19;
                                        dArr = dArr3;
                                    }
                                    i5 = i19;
                                    map14.put(str3, new gko(byteBufferWrap5.array(), 12, length5));
                                    byteOrder = byteOrder2;
                                    i = i18;
                                    i2 = i20;
                                    i3 = i21;
                                    i4 = i5;
                                    break;
                            }
                        }
                    } else {
                        i22 = b3;
                        switch (i22) {
                            case 1:
                                byteOrder = byteOrder2;
                                i = i18;
                                i3 = i21;
                                Map map15 = (Map) list.get(i3);
                                Charset charset5 = gko.d;
                                i4 = i19;
                                if (strReplaceAll.length() == i4) {
                                    i2 = 0;
                                    if (strReplaceAll.charAt(0) < '0' && strReplaceAll.charAt(0) <= '1') {
                                        byte[] bArr = new byte[i4];
                                        bArr[0] = (byte) (strReplaceAll.charAt(0) - '0');
                                        gkoVar = new gko(bArr, i4, i4);
                                    }
                                    map15.put(str3, gkoVar);
                                } else {
                                    i2 = 0;
                                }
                                byte[] bytes5 = strReplaceAll.getBytes(gko.d);
                                gkoVar = new gko(bytes5, i4, bytes5.length);
                                map15.put(str3, gkoVar);
                                break;
                            case 2:
                            case 7:
                                byteOrder = byteOrder2;
                                i = i18;
                                i3 = i21;
                                i5 = i19;
                                Map map16 = (Map) list.get(i3);
                                Charset charset6 = gko.d;
                                byte[] bytes6 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(gko.d);
                                b2 = 2;
                                map16.put(str3, new gko(bytes6, 2, bytes6.length));
                                i2 = 0;
                                i4 = i5;
                                break;
                            case 3:
                                byteOrder = byteOrder2;
                                i3 = i21;
                                i5 = i19;
                                i = i18;
                                strArrSplit = strReplaceAll.split(Separators.COMMA, -1);
                                length = strArrSplit.length;
                                iArr = new int[length];
                                while (i6 < strArrSplit.length) {
                                    iArr[i6] = Integer.parseInt(strArrSplit[i6]);
                                }
                                Map map17 = (Map) list.get(i3);
                                byteBufferWrap = ByteBuffer.wrap(new byte[gko.f[i] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i7 < length) {
                                    byteBufferWrap.putShort((short) iArr[i7]);
                                }
                                map17.put(str3, new gko(byteBufferWrap.array(), i, length));
                                i2 = 0;
                                b2 = 2;
                                i4 = i5;
                                break;
                            case 4:
                                byteOrder = byteOrder2;
                                i3 = i21;
                                i5 = i19;
                                i = i18;
                                strArrSplit2 = strReplaceAll.split(Separators.COMMA, -1);
                                jArr = new long[strArrSplit2.length];
                                while (i8 < strArrSplit2.length) {
                                    jArr[i8] = Long.parseLong(strArrSplit2[i8]);
                                }
                                ((Map) list.get(i3)).put(str3, gko.b(jArr, byteOrder));
                                i2 = 0;
                                b2 = 2;
                                i4 = i5;
                                break;
                            case 5:
                                i5 = i19;
                                i9 = -1;
                                strArrSplit3 = strReplaceAll.split(Separators.COMMA, -1);
                                length2 = strArrSplit3.length;
                                br8VarArr = new br8[length2];
                                i10 = i20;
                                while (i10 < strArrSplit3.length) {
                                    String[] strArrSplit11 = strArrSplit3[i10].split(Separators.SLASH, i9);
                                    br8VarArr[i10] = new br8((byte) 3, (long) Double.parseDouble(strArrSplit11[i20]), (long) Double.parseDouble(strArrSplit11[i5]));
                                    i10++;
                                    i18 = i18;
                                    byteOrder2 = byteOrder2;
                                    i21 = i21;
                                    i20 = 0;
                                    i9 = -1;
                                }
                                ByteOrder byteOrder5 = byteOrder2;
                                i = i18;
                                i3 = i21;
                                Map map18 = (Map) list.get(i3);
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[gko.f[5] * length2]);
                                byteOrder = byteOrder5;
                                byteBufferWrap2.order(byteOrder);
                                while (i11 < length2) {
                                    br8 br8Var5 = br8VarArr[i11];
                                    byteBufferWrap2.putInt((int) br8Var5.b);
                                    byteBufferWrap2.putInt((int) br8Var5.c);
                                }
                                map18.put(str3, new gko(byteBufferWrap2.array(), 5, length2));
                                i2 = 0;
                                b2 = 2;
                                i4 = i5;
                                break;
                            case 9:
                                i5 = i19;
                                strArrSplit4 = strReplaceAll.split(Separators.COMMA, -1);
                                length3 = strArrSplit4.length;
                                iArr2 = new int[length3];
                                while (i12 < strArrSplit4.length) {
                                    iArr2[i12] = Integer.parseInt(strArrSplit4[i12]);
                                }
                                Map map19 = (Map) list.get(i21);
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[gko.f[9] * length3]);
                                byteBufferWrap3.order(byteOrder2);
                                while (i13 < length3) {
                                    byteBufferWrap3.putInt(iArr2[i13]);
                                }
                                map19.put(str3, new gko(byteBufferWrap3.array(), 9, length3));
                                b2 = 2;
                                byteOrder = byteOrder2;
                                i = i18;
                                i2 = i20;
                                i3 = i21;
                                i4 = i5;
                                break;
                            case 10:
                                i5 = i19;
                                strArrSplit5 = strReplaceAll.split(Separators.COMMA, -1);
                                length4 = strArrSplit5.length;
                                br8VarArr2 = new br8[length4];
                                i14 = i20;
                                while (i14 < strArrSplit5.length) {
                                    String[] strArrSplit12 = strArrSplit5[i14].split(Separators.SLASH, i23);
                                    br8VarArr2[i14] = new br8((byte) 3, (long) Double.parseDouble(strArrSplit12[i20]), (long) Double.parseDouble(strArrSplit12[i5]));
                                    i14++;
                                    length4 = length4;
                                    i23 = -1;
                                }
                                Map map110 = (Map) list.get(i21);
                                byteBufferWrap4 = ByteBuffer.wrap(new byte[gko.f[10] * length4]);
                                byteBufferWrap4.order(byteOrder2);
                                while (i15 < length4) {
                                    br8 br8Var6 = br8VarArr2[i15];
                                    byteBufferWrap4.putInt((int) br8Var6.b);
                                    byteBufferWrap4.putInt((int) br8Var6.c);
                                }
                                map110.put(str3, new gko(byteBufferWrap4.array(), 10, length4));
                                b2 = 2;
                                byteOrder = byteOrder2;
                                i = i18;
                                i2 = i20;
                                i3 = i21;
                                i4 = i5;
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(Separators.COMMA, -1);
                                length5 = strArrSplit6.length;
                                dArr = new double[length5];
                                while (i16 < strArrSplit6.length) {
                                    dArr[i16] = Double.parseDouble(strArrSplit6[i16]);
                                }
                                Map map111 = (Map) list.get(i21);
                                byteBufferWrap5 = ByteBuffer.wrap(new byte[gko.f[12] * length5]);
                                byteBufferWrap5.order(byteOrder2);
                                i17 = i20;
                                while (i17 < length5) {
                                    double[] dArr4 = dArr;
                                    byteBufferWrap5.putDouble(dArr4[i17]);
                                    i17++;
                                    i19 = i19;
                                    dArr = dArr4;
                                }
                                i5 = i19;
                                map111.put(str3, new gko(byteBufferWrap5.array(), 12, length5));
                                byteOrder = byteOrder2;
                                i = i18;
                                i2 = i20;
                                i3 = i21;
                                i4 = i5;
                                break;
                        }
                    }
                } else {
                    ((Map) list.get(i21)).remove(str3);
                }
                byteOrder = byteOrder2;
                i = i18;
                i2 = i20;
                i3 = i21;
                i4 = i19;
            } else {
                byteOrder = byteOrder2;
                i = i18;
                i2 = i20;
                i3 = i21;
                i4 = i19;
            }
            i19 = i4;
            byteOrder2 = byteOrder;
            i21 = i3 + 1;
            i20 = i2;
            i18 = i;
        }
    }

    public final void d(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            l8x.E0("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
            i2 = 0;
        } else {
            i2 = 8;
        }
        c(this.f16680a, "Orientation", String.valueOf(i2));
    }
}
