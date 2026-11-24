package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.SparseArray;
import android.widget.ImageView;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class x23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40148a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public x23(String str) {
        this.c = new HashMap();
        this.f40148a = 125;
        this.b = 125;
        this.e = new eld0(-16777216, -1, (byte) 6);
        this.d = str;
    }

    public int a(long j) {
        int i = this.f40148a + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            qx3.g(jArr, jArr2, 0, 0, jArr.length);
            qx3.h(0, 0, 14, (int[]) this.d, iArr);
            this.c = jArr2;
            this.d = iArr;
        }
        int i3 = this.f40148a;
        this.f40148a = i3 + 1;
        int[] iArr2 = (int[]) this.e;
        int length2 = iArr2.length;
        if (this.b >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            qx3.h(0, 0, 14, (int[]) this.e, iArr2);
            this.e = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.b;
        this.b = iArr2[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (Intrinsics.f(jArr3[i8], j) <= 0) {
                break;
            }
            j(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public Bitmap b() {
        try {
            r68 r68VarC = c((String) this.d);
            eld0 eld0Var = (eld0) this.e;
            int i = eld0Var.b;
            int i2 = eld0Var.c;
            int i3 = r68VarC.f29923a;
            int i4 = r68VarC.b;
            int[] iArr = new int[i3 * i4];
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 * i3;
                for (int i7 = 0; i7 < i3; i7++) {
                    iArr[i6 + i7] = r68VarC.b(i7, i5) ? i : i2;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, i3, 0, 0, i3, i4);
            return bitmapCreateBitmap;
        } catch (lrv0 e) {
            throw new ss3("Failed to create QR image from text due to underlying exception", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:277:0x0629  */
    /* JADX WARN: Code duplicated, block: B:279:0x062e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0648  */
    /* JADX WARN: Code duplicated, block: B:285:0x064f  */
    /* JADX WARN: Code duplicated, block: B:287:0x0659  */
    /* JADX WARN: Code duplicated, block: B:296:0x067a  */
    /* JADX WARN: Code duplicated, block: B:298:0x067d  */
    /* JADX WARN: Code duplicated, block: B:300:0x0685  */
    /* JADX WARN: Code duplicated, block: B:330:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:333:0x06d5 A[LOOP:29: B:329:0x06cb->B:333:0x06d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:335:0x06db  */
    /* JADX WARN: Code duplicated, block: B:339:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:341:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:368:0x0739  */
    /* JADX WARN: Code duplicated, block: B:379:0x076a  */
    /* JADX WARN: Code duplicated, block: B:381:0x076f  */
    /* JADX WARN: Code duplicated, block: B:383:0x0774  */
    /* JADX WARN: Code duplicated, block: B:388:0x078d  */
    /* JADX WARN: Code duplicated, block: B:389:0x0790  */
    /* JADX WARN: Code duplicated, block: B:394:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:396:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:398:0x07db  */
    /* JADX WARN: Code duplicated, block: B:485:0x0669 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x06d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x06dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0776 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x07de A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v23, types: [a.p68] */
    /* JADX WARN: Type inference failed for: r7v24, types: [a.p68] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    public r68 c(String str) throws lrv0 {
        Charset charsetForName;
        int i;
        hm40 hm40Var;
        int i2;
        ubu0 ubu0VarC;
        ?? r7;
        ubu0 ubu0Var;
        uvb uvbVar;
        int i3;
        int i4;
        int i5;
        int iMin;
        int i6;
        int i7;
        r68 r68Var;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        byte[][] bArr;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iAbs;
        byte[] bArr2;
        int i20;
        int i21;
        byte[] bArr3;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        byte[] bArr4;
        int i30;
        byte b;
        int i31;
        int i32;
        byte[] bArr5;
        char c;
        int i33 = this.f40148a;
        int i34 = this.b;
        HashMap map = (HashMap) this.c;
        if (str.isEmpty()) {
            jf4.o("Found empty contents");
            return null;
        }
        if (i33 < 0 || i34 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i33 + 'x' + i34);
        }
        yvn yvnVar = yvn.f43329a;
        int iG = map.containsKey(yvnVar) ? hne.G(map.get(yvnVar).toString()) : 1;
        yvn yvnVar2 = yvn.c;
        int i35 = 4;
        int i36 = map.containsKey(yvnVar2) ? Integer.parseInt(map.get(yvnVar2).toString()) : 4;
        Charset charset = awn.b;
        yvn yvnVar3 = yvn.g;
        boolean z = map.containsKey(yvnVar3) && Boolean.parseBoolean(map.get(yvnVar3).toString());
        yvn yvnVar4 = yvn.f;
        boolean z2 = map.containsKey(yvnVar4) && Boolean.parseBoolean(map.get(yvnVar4).toString());
        yvn yvnVar5 = yvn.b;
        boolean zContainsKey = map.containsKey(yvnVar5);
        if (zContainsKey) {
            try {
                charsetForName = Charset.forName(map.get(yvnVar5).toString());
            } catch (UnsupportedCharsetException unused) {
                charsetForName = charset;
            }
        } else {
            charsetForName = charset;
        }
        int i37 = 8;
        int i38 = 1;
        if (z2) {
            if (charsetForName.equals(charset)) {
                charsetForName = null;
            }
            qo8 qo8Var = new qo8(str, charsetForName, z, iG);
            int i39 = qo8Var.b;
            ubu0[] ubu0VarArr = {qo8.f(1), qo8.f(2), qo8.f(3)};
            i = 0;
            ouu[] ouuVarArr = {qo8Var.e(ubu0VarArr[0]), qo8Var.e(ubu0VarArr[1]), qo8Var.e(ubu0VarArr[2])};
            int i40 = Integer.MAX_VALUE;
            int i41 = 0;
            int i42 = -1;
            for (int i43 = 3; i41 < i43; i43 = 3) {
                ouu ouuVar = ouuVarArr[i41];
                int iV = ouuVar.v((ubu0) ouuVar.c);
                if (awn.c(iV, ubu0VarArr[i41], i39) && iV < i40) {
                    i40 = iV;
                    i42 = i41;
                }
                i41++;
            }
            if (i42 < 0) {
                throw new lrv0("Data too big for any version");
            }
            ouu ouuVar2 = ouuVarArr[i42];
            p68 p68Var = new p68();
            for (sg40 sg40Var : (ArrayList) ouuVar2.b) {
                int i44 = sg40Var.c;
                ouu ouuVar3 = sg40Var.e;
                qo8 qo8Var2 = (qo8) ouuVar3.d;
                hm40 hm40Var2 = sg40Var.f32143a;
                p68Var.b(hm40Var2.b, i35);
                int i45 = sg40Var.d;
                if (i45 > 0) {
                    p68Var.b(sg40Var.a(), hm40Var2.a((ubu0) ouuVar3.c));
                }
                if (hm40Var2 == hm40.ECI) {
                    p68Var.b(((uvb) uvb.d.get(((rgn) qo8Var2.e).f30446a[i44].charset().name())).f36340a[0], 8);
                } else if (i45 > 0) {
                    String str2 = (String) qo8Var2.d;
                    int i46 = sg40Var.b;
                    awn.a(str2.substring(i46, i45 + i46), hm40Var2, p68Var, ((rgn) qo8Var2.e).f30446a[i44].charset());
                }
                i35 = 4;
            }
            ubu0Var = (ubu0) ouuVar2.c;
            r7 = p68Var;
        } else {
            i = 0;
            Charset charset2 = ctm0.b;
            hm40 hm40Var3 = hm40.BYTE;
            if (charset2 == null || !charset2.equals(charsetForName) || !awn.b(str)) {
                boolean z3 = false;
                boolean z4 = false;
                int i47 = 0;
                while (true) {
                    if (i47 < str.length()) {
                        char cCharAt = str.charAt(i47);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            z4 = true;
                        } else if ((cCharAt < '`' ? awn.f1583a[cCharAt] : -1) != -1) {
                            z3 = true;
                        }
                        i47++;
                        z3 = z3;
                        z4 = z4;
                    } else {
                        if (z3) {
                            hm40Var = hm40.ALPHANUMERIC;
                            break;
                        }
                        if (z4) {
                            hm40Var = hm40.NUMERIC;
                            break;
                        }
                    }
                    hm40Var = hm40Var3;
                    break;
                }
            }
            hm40Var = hm40.KANJI;
            p68 p68Var2 = new p68();
            if (hm40Var == hm40Var3 && zContainsKey && (uvbVar = (uvb) uvb.d.get(charsetForName.name())) != null) {
                i2 = 4;
                p68Var2.b(7, 4);
                p68Var2.b(uvbVar.f36340a[0], 8);
            } else {
                i2 = 4;
            }
            if (z) {
                p68Var2.b(5, i2);
            }
            p68Var2.b(hm40Var.b, i2);
            p68 p68Var3 = new p68();
            awn.a(str, hm40Var, p68Var3, charsetForName);
            yvn yvnVar6 = yvn.d;
            if (map.containsKey(yvnVar6)) {
                ubu0 ubu0VarC2 = ubu0.c(Integer.parseInt(map.get(yvnVar6).toString()));
                if (!awn.c(hm40Var.a(ubu0VarC2) + p68Var2.b + p68Var3.b, ubu0VarC2, iG)) {
                    throw new lrv0("Data too big for requested version");
                }
                ubu0VarC = ubu0VarC2;
            } else {
                int iA = hm40Var.a(ubu0.c(1)) + p68Var2.b + p68Var3.b;
                int i48 = 1;
                while (true) {
                    if (i48 > 40) {
                        throw new lrv0("Data too big");
                    }
                    ubu0 ubu0VarC3 = ubu0.c(i48);
                    if (awn.c(iA, ubu0VarC3, iG)) {
                        int iA2 = hm40Var.a(ubu0VarC3) + p68Var2.b + p68Var3.b;
                        int i49 = 1;
                        while (true) {
                            if (i49 > 40) {
                                throw new lrv0("Data too big");
                            }
                            ubu0VarC = ubu0.c(i49);
                            if (awn.c(iA2, ubu0VarC, iG)) {
                                break;
                            }
                            i49++;
                            i36 = i36;
                            iG = iG;
                            i37 = 8;
                        }
                    } else {
                        i48++;
                        i36 = i36;
                        iG = iG;
                        i37 = 8;
                    }
                }
            }
            p68 p68Var4 = new p68();
            int i50 = p68Var2.b;
            p68Var4.c(i50);
            for (int i51 = 0; i51 < i50; i51++) {
                p68Var4.a(p68Var2.d(i51));
            }
            int iG2 = hm40Var == hm40Var3 ? p68Var3.g() : str.length();
            int iA3 = hm40Var.a(ubu0VarC);
            int i52 = 1 << iA3;
            if (iG2 >= i52) {
                StringBuilder sb = new StringBuilder();
                sb.append(iG2);
                sb.append(" is bigger than ");
                sb.append(i52 - 1);
                throw new lrv0(sb.toString());
            }
            p68Var4.b(iG2, iA3);
            int i53 = p68Var3.b;
            p68Var4.c(p68Var4.b + i53);
            for (int i54 = 0; i54 < i53; i54++) {
                p68Var4.a(p68Var3.d(i54));
            }
            r7 = p68Var4;
            ubu0Var = ubu0VarC;
        }
        oo8 oo8Var = ubu0Var.c[hne.E(iG)];
        int i55 = ubu0Var.d;
        byte b2 = oo8Var.f25582a;
        qbu0[] qbu0VarArr = (qbu0[]) oo8Var.b;
        int length = qbu0VarArr.length;
        int i56 = i;
        int i57 = i56;
        while (i56 < length) {
            i57 += qbu0VarArr[i56].f28456a;
            i56++;
        }
        int i58 = i55 - (i57 * b2);
        int i59 = i58 * 8;
        if (r7.b > i59) {
            throw new lrv0("data bits cannot fit in the QR Code" + r7.b + " > " + i59);
        }
        for (int i60 = i; i60 < 4 && r7.b < i59; i60++) {
            r7.a(i);
        }
        ?? r13 = i;
        int i61 = r7.b & 7;
        if (i61 > 0) {
            while (i61 < i37) {
                r7.a(r13);
                i61++;
                r13 = 0;
            }
        }
        int iG3 = i58 - r7.g();
        for (int i62 = 0; i62 < iG3; i62++) {
            r7.b((i62 & 1) == 0 ? 236 : 17, i37);
        }
        if (r7.b != i59) {
            throw new lrv0("Bits size does not equal capacity");
        }
        int i63 = 0;
        for (qbu0 qbu0Var : qbu0VarArr) {
            i63 += qbu0Var.f28456a;
        }
        if (r7.g() != i58) {
            throw new lrv0("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i63);
        int i64 = 0;
        int i65 = 0;
        int iMax = 0;
        int iMax2 = 0;
        ?? r8 = r7;
        while (i64 < i63) {
            int i66 = i36;
            int i67 = i38;
            int[] iArr = new int[i67];
            int[] iArr2 = new int[i67];
            if (i64 >= i63) {
                throw new lrv0("Block ID too large");
            }
            int i68 = i55 % i63;
            int i69 = i63 - i68;
            int i70 = i55 / i63;
            int i71 = i70 + 1;
            int i72 = i58 / i63;
            int i73 = i72 + 1;
            int i74 = i70 - i72;
            int i75 = i34;
            int i76 = i71 - i73;
            if (i74 != i76) {
                throw new lrv0("EC bytes mismatch");
            }
            if (i63 != i69 + i68) {
                throw new lrv0("RS blocks mismatch");
            }
            if (i55 != ((i73 + i76) * i68) + ((i72 + i74) * i69)) {
                throw new lrv0("Total bytes mismatch");
            }
            if (i64 < i69) {
                c = 0;
                iArr[0] = i72;
                iArr2[0] = i74;
            } else {
                c = 0;
                iArr[0] = i73;
                iArr2[0] = i76;
            }
            int i77 = iArr[c];
            byte[] bArr6 = new byte[i77];
            int i78 = i65 * 8;
            int i79 = 0;
            while (i79 < i77) {
                int i80 = i33;
                int i81 = i79;
                int i82 = i63;
                int i83 = i78;
                int i84 = i64;
                int i85 = 0;
                for (int i86 = 0; i86 < 8; i86++) {
                    if (r8.d(i83)) {
                        i85 = (1 << (7 - i86)) | i85;
                    }
                    i83++;
                }
                bArr6[i81] = (byte) i85;
                i79 = i81 + 1;
                i64 = i84;
                i33 = i80;
                i78 = i83;
                i63 = i82;
            }
            int i87 = i33;
            int i88 = i64;
            int i89 = i63;
            int i90 = iArr2[0];
            int i91 = i77 + i90;
            int[] iArr3 = new int[i91];
            int i92 = 0;
            while (i92 < i77) {
                iArr3[i92] = bArr6[i92] & 255;
                i92++;
                i91 = i91;
            }
            int i93 = i91;
            wjt wjtVar = wjt.l;
            ArrayList arrayList2 = new ArrayList();
            ?? r29 = r8;
            int i94 = iG;
            arrayList2.add(new xjt(wjtVar, new int[]{1}));
            if (i90 == 0) {
                jf4.o("No error correction bytes");
                return null;
            }
            int i95 = i93 - i90;
            if (i95 <= 0) {
                jf4.o("No data bytes provided");
                return null;
            }
            if (i90 >= arrayList2.size()) {
                xjt xjtVar = (xjt) dw9.l(1, arrayList2);
                int size = arrayList2.size();
                xjt xjtVarG = xjtVar;
                while (size <= i90) {
                    int i96 = size;
                    xjtVarG = xjtVarG.g(new xjt(wjtVar, new int[]{1, wjtVar.f39280a[(i96 - 1) + (wjtVar.g ? 1 : 0)]}));
                    arrayList2.add(xjtVarG);
                    size = i96 + 1;
                    i55 = i55;
                    ubu0Var = ubu0Var;
                }
            }
            ubu0 ubu0Var2 = ubu0Var;
            int i97 = i55;
            xjt xjtVar2 = (xjt) arrayList2.get(i90);
            int[] iArr4 = new int[i95];
            System.arraycopy(iArr3, 0, iArr4, 0, i95);
            if (i95 == 0) {
                e9d0.o();
                return null;
            }
            if (i95 > 1 && iArr4[0] == 0) {
                int i98 = 1;
                while (i98 < i95 && iArr4[i98] == 0) {
                    i98++;
                }
                if (i98 == i95) {
                    iArr4 = new int[]{0};
                } else {
                    int i99 = i95 - i98;
                    int[] iArr5 = new int[i99];
                    System.arraycopy(iArr4, i98, iArr5, 0, i99);
                    iArr4 = iArr5;
                }
            }
            if (i90 < 0) {
                e9d0.o();
                return null;
            }
            int length2 = iArr4.length;
            int[] iArr6 = new int[length2 + i90];
            int i100 = 0;
            while (i100 < length2) {
                iArr6[i100] = wjtVar.c(iArr4[i100], 1);
                i100++;
                iArr4 = iArr4;
            }
            xjt xjtVar3 = new xjt(wjtVar, iArr6);
            if (!wjtVar.equals(xjtVar2.f41003a)) {
                jf4.o("GenericGFPolys do not have same GenericGF field");
                return null;
            }
            if (xjtVar2.e()) {
                jf4.o("Divide by 0");
                return null;
            }
            xjt xjtVarA = wjtVar.c;
            int iB = wjtVar.b(xjtVar2.c(xjtVar2.d()));
            while (xjtVar3.d() >= xjtVar2.d() && !xjtVar3.e()) {
                int iD = xjtVar3.d() - xjtVar2.d();
                int iC = wjtVar.c(xjtVar3.c(xjtVar3.d()), iB);
                int i101 = iB;
                xjt xjtVarH = xjtVar2.h(iD, iC);
                xjtVarA = xjtVarA.a(wjtVar.a(iD, iC));
                xjtVar3 = xjtVar3.a(xjtVarH);
                iB = i101;
            }
            int[] iArr7 = new xjt[]{xjtVarA, xjtVar3}[1].b;
            int length3 = i90 - iArr7.length;
            for (int i102 = 0; i102 < length3; i102++) {
                iArr3[i95 + i102] = 0;
            }
            System.arraycopy(iArr7, 0, iArr3, i95 + length3, iArr7.length);
            byte[] bArr7 = new byte[i90];
            for (int i103 = 0; i103 < i90; i103++) {
                bArr7[i103] = (byte) iArr3[i77 + i103];
            }
            arrayList.add(new r88(bArr6, bArr7));
            iMax2 = Math.max(iMax2, i77);
            iMax = Math.max(iMax, i90);
            i65 += iArr[0];
            i64 = i88 + 1;
            i36 = i66;
            i34 = i75;
            map = map;
            i63 = i89;
            i33 = i87;
            r8 = r29;
            iG = i94;
            i55 = i97;
            ubu0Var = ubu0Var2;
            i38 = 1;
        }
        HashMap map2 = map;
        ubu0 ubu0Var3 = ubu0Var;
        int i104 = i33;
        int i105 = i34;
        int i106 = iG;
        int i107 = i36;
        int i108 = i55;
        if (i58 != i65) {
            throw new lrv0("Data bytes does not match offset");
        }
        p68 p68Var5 = new p68();
        for (int i109 = 0; i109 < iMax2; i109++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr8 = ((r88) it.next()).f30012a;
                if (i109 < bArr8.length) {
                    p68Var5.b(bArr8[i109], 8);
                }
            }
        }
        for (int i110 = 0; i110 < iMax; i110++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr9 = ((r88) it2.next()).b;
                if (i110 < bArr9.length) {
                    p68Var5.b(bArr9[i110], 8);
                }
            }
        }
        if (i108 != p68Var5.g()) {
            StringBuilder sbM = b1j.m(i108, "Interleaving error: ", " and ");
            sbM.append(p68Var5.g());
            sbM.append(" differ.");
            throw new lrv0(sbM.toString());
        }
        int i111 = (ubu0Var3.f35401a * 4) + 17;
        cf60 cf60Var = new cf60(i111, i111);
        int i112 = cf60Var.c;
        int i113 = cf60Var.b;
        yvn yvnVar7 = yvn.e;
        if (map2.containsKey(yvnVar7)) {
            i4 = Integer.parseInt(map2.get(yvnVar7).toString());
            i3 = 8;
            if (i4 < 0 || i4 >= 8) {
            }
            i5 = -1;
            if (i4 == -1) {
                i11 = Integer.MAX_VALUE;
                i12 = 0;
                while (i12 < i3) {
                    int i114 = i106;
                    xf0.F(p68Var5, i114, ubu0Var3, i12, cf60Var);
                    i13 = 0;
                    int iQ = vvw.q(cf60Var, false) + vvw.q(cf60Var, true);
                    bArr = (byte[][]) cf60Var.d;
                    i14 = 0;
                    int i115 = 0;
                    while (i14 < i112 - 1) {
                        bArr4 = bArr[i14];
                        i30 = i13;
                        while (i30 < i113 - 1) {
                            b = bArr4[i30];
                            i31 = i30 + 1;
                            i32 = i30;
                            if (b == bArr4[i31]) {
                                bArr5 = bArr[i14 + 1];
                                if (b != bArr5[i32] && b == bArr5[i31]) {
                                    i115++;
                                }
                            }
                            i30 = i31;
                        }
                        i14++;
                        i13 = 0;
                    }
                    int i116 = (i115 * 3) + iQ;
                    i15 = 0;
                    i16 = 0;
                    while (i15 < i112) {
                        i21 = 0;
                        while (i21 < i113) {
                            bArr3 = bArr[i15];
                            i22 = i21 + 6;
                            int i117 = i5;
                            if (i22 < i113) {
                                i23 = i16;
                                byte b3 = 1;
                                if (bArr3[i21] != 1 && bArr3[i21 + 1] == 0 && bArr3[i21 + 2] == 1 && bArr3[i21 + 3] == 1 && bArr3[i21 + 4] == 1 && bArr3[i21 + 5] == 0 && bArr3[i22] == 1) {
                                    int i118 = i21 - 4;
                                    if (i118 < 0 || bArr3.length < i21) {
                                        i27 = i21 + 7;
                                        i28 = i21 + 11;
                                        if (i27 >= 0 && bArr3.length >= i28) {
                                            while (true) {
                                                if (i27 < i28) {
                                                    i29 = i27;
                                                    if (bArr3[i27] == 1) {
                                                        i27 = i29 + 1;
                                                    }
                                                } else {
                                                    i16 = i23 + 1;
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (i118 < i21) {
                                                if (bArr3[i118] == b3) {
                                                    i27 = i21 + 7;
                                                    i28 = i21 + 11;
                                                    if (i27 >= 0) {
                                                        while (true) {
                                                            if (i27 < i28) {
                                                                i29 = i27;
                                                                if (bArr3[i27] == 1) {
                                                                    i27 = i29 + 1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i118++;
                                                    b3 = 1;
                                                }
                                            }
                                            i16 = i23 + 1;
                                        }
                                    }
                                }
                                i24 = i15 + 6;
                                if (i24 < i112) {
                                    byte b4 = 1;
                                    if (bArr[i15][i21] != 1 && bArr[i15 + 1][i21] == 0 && bArr[i15 + 2][i21] == 1 && bArr[i15 + 3][i21] == 1 && bArr[i15 + 4][i21] == 1 && bArr[i15 + 5][i21] == 0 && bArr[i24][i21] == 1) {
                                        int i119 = i15 - 4;
                                        if (i119 < 0 || bArr.length < i15) {
                                            i26 = i15 + 7;
                                            int i120 = i15 + 11;
                                            if (i26 >= 0 || bArr.length < i120) {
                                                i25 = i15;
                                            } else {
                                                while (true) {
                                                    if (i26 < i120) {
                                                        i25 = i15;
                                                        if (bArr[i26][i21] != 1) {
                                                            i26++;
                                                            i15 = i25;
                                                        }
                                                    } else {
                                                        i25 = i15;
                                                        i16++;
                                                    }
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                if (i119 < i15) {
                                                    if (bArr[i119][i21] == b4) {
                                                        i26 = i15 + 7;
                                                        int i121 = i15 + 11;
                                                        if (i26 >= 0) {
                                                            i25 = i15;
                                                        } else {
                                                            i25 = i15;
                                                        }
                                                    } else {
                                                        i119++;
                                                        b4 = 1;
                                                    }
                                                }
                                                i25 = i15;
                                                i16++;
                                            }
                                        }
                                    } else {
                                        i25 = i15;
                                    }
                                } else {
                                    i25 = i15;
                                }
                                i21++;
                                i5 = i117;
                                i15 = i25;
                            } else {
                                i23 = i16;
                            }
                            i16 = i23;
                            i24 = i15 + 6;
                            if (i24 < i112) {
                                byte b5 = 1;
                                if (bArr[i15][i21] != 1) {
                                    i25 = i15;
                                } else {
                                    i25 = i15;
                                }
                            } else {
                                i25 = i15;
                            }
                            i21++;
                            i5 = i117;
                            i15 = i25;
                        }
                        i15++;
                    }
                    i17 = i5;
                    int i122 = (i16 * 40) + i116;
                    i19 = 0;
                    for (i18 = 0; i18 < i112; i18++) {
                        bArr2 = bArr[i18];
                        for (i20 = 0; i20 < i113; i20++) {
                            if (bArr2[i20] == 1) {
                                i19++;
                            }
                        }
                    }
                    int i123 = i112 * i113;
                    iAbs = (((Math.abs((i19 * 2) - i123) * 10) / i123) * 10) + i122;
                    if (iAbs < i11) {
                        i11 = iAbs;
                        i5 = i12;
                    } else {
                        i5 = i17;
                    }
                    i12++;
                    i106 = i114;
                    i3 = 8;
                }
                i4 = i5;
            }
            xf0.F(p68Var5, i106, ubu0Var3, i4, cf60Var);
            int i124 = i107 * 2;
            int i125 = i113 + i124;
            int i126 = i124 + i112;
            int iMax3 = Math.max(i104, i125);
            int iMax4 = Math.max(i105, i126);
            iMin = Math.min(iMax3 / i125, iMax4 / i126);
            i6 = (iMax3 - (i113 * iMin)) / 2;
            i7 = (iMax4 - (i112 * iMin)) / 2;
            r68Var = new r68(iMax3, iMax4);
            i8 = 0;
            while (i8 < i112) {
                i9 = i6;
                i10 = 0;
                while (i10 < i113) {
                    if (cf60Var.o(i10, i8) == 1) {
                        r68Var.i(i9, i7, iMin, iMin);
                    }
                    i10++;
                    i9 += iMin;
                }
                i8++;
                i7 += iMin;
            }
            return r68Var;
        }
        i3 = 8;
        i4 = -1;
        i5 = -1;
        if (i4 == -1) {
            i11 = Integer.MAX_VALUE;
            i12 = 0;
            while (i12 < i3) {
                int i1110 = i106;
                xf0.F(p68Var5, i1110, ubu0Var3, i12, cf60Var);
                i13 = 0;
                int iQ2 = vvw.q(cf60Var, false) + vvw.q(cf60Var, true);
                bArr = (byte[][]) cf60Var.d;
                i14 = 0;
                int i1111 = 0;
                while (i14 < i112 - 1) {
                    bArr4 = bArr[i14];
                    i30 = i13;
                    while (i30 < i113 - 1) {
                        b = bArr4[i30];
                        i31 = i30 + 1;
                        i32 = i30;
                        if (b == bArr4[i31]) {
                            bArr5 = bArr[i14 + 1];
                            if (b != bArr5[i32]) {
                            }
                        }
                        i30 = i31;
                    }
                    i14++;
                    i13 = 0;
                }
                int i1112 = (i1111 * 3) + iQ2;
                i15 = 0;
                i16 = 0;
                while (i15 < i112) {
                    i21 = 0;
                    while (i21 < i113) {
                        bArr3 = bArr[i15];
                        i22 = i21 + 6;
                        int i1113 = i5;
                        if (i22 < i113) {
                            i23 = i16;
                            byte b6 = 1;
                            if (bArr3[i21] != 1) {
                            }
                            i24 = i15 + 6;
                            if (i24 < i112) {
                                byte b7 = 1;
                                if (bArr[i15][i21] != 1) {
                                    i25 = i15;
                                } else {
                                    i25 = i15;
                                }
                            } else {
                                i25 = i15;
                            }
                            i21++;
                            i5 = i1113;
                            i15 = i25;
                        } else {
                            i23 = i16;
                        }
                        i16 = i23;
                        i24 = i15 + 6;
                        if (i24 < i112) {
                            byte b8 = 1;
                            if (bArr[i15][i21] != 1) {
                                i25 = i15;
                            } else {
                                i25 = i15;
                            }
                        } else {
                            i25 = i15;
                        }
                        i21++;
                        i5 = i1113;
                        i15 = i25;
                    }
                    i15++;
                }
                i17 = i5;
                int i127 = (i16 * 40) + i1112;
                i19 = 0;
                while (i18 < i112) {
                    bArr2 = bArr[i18];
                    while (i20 < i113) {
                        if (bArr2[i20] == 1) {
                            i19++;
                        }
                    }
                }
                int i128 = i112 * i113;
                iAbs = (((Math.abs((i19 * 2) - i128) * 10) / i128) * 10) + i127;
                if (iAbs < i11) {
                    i11 = iAbs;
                    i5 = i12;
                } else {
                    i5 = i17;
                }
                i12++;
                i106 = i1110;
                i3 = 8;
            }
            i4 = i5;
        }
        xf0.F(p68Var5, i106, ubu0Var3, i4, cf60Var);
        int i129 = i107 * 2;
        int i1210 = i113 + i129;
        int i1211 = i129 + i112;
        int iMax5 = Math.max(i104, i1210);
        int iMax6 = Math.max(i105, i1211);
        iMin = Math.min(iMax5 / i1210, iMax6 / i1211);
        i6 = (iMax5 - (i113 * iMin)) / 2;
        i7 = (iMax6 - (i112 * iMin)) / 2;
        r68Var = new r68(iMax5, iMax6);
        i8 = 0;
        while (i8 < i112) {
            i9 = i6;
            i10 = 0;
            while (i10 < i113) {
                if (cf60Var.o(i10, i8) == 1) {
                    r68Var.i(i9, i7, iMin, iMin);
                }
                i10++;
                i9 += iMin;
            }
            i8++;
            i7 += iMin;
        }
        return r68Var;
    }

    public float d(TypedArray typedArray, String str, int i, float f) {
        if (zsm0.r((XmlPullParser) this.c, str)) {
            f = typedArray.getFloat(i, f);
        }
        k(typedArray.getChangingConfigurations());
        return f;
    }

    public void e() {
        ImageView imageView = (ImageView) this.c;
        this.f40148a = si30.b(imageView.getMeasuredHeight() * 0.056f);
        this.b = si30.b(imageView.getMeasuredHeight() * 0.078f);
    }

    public void f(Context context, XmlResourceParser xmlResourceParser) {
        r3e r3eVar = new r3e();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && ParameterNames.ID.equals(attributeName)) {
                int identifier = attributeValue.contains(Separators.SLASH) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), ParameterNames.ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                r3eVar.k(context, xmlResourceParser);
                ((SparseArray) this.e).put(identifier, r3eVar);
                return;
            }
        }
    }

    public void g(List list, Function1 function1, Function1 function2) {
        x23 x23Var;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        list.getClass();
        if (list.isEmpty()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.d;
            Iterator it = linkedHashMap2.values().iterator();
            while (it.hasNext()) {
                function2.invoke((m7l) it.next());
            }
            linkedHashMap2.clear();
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                function2.invoke((ImageView) it2.next());
            }
            linkedHashMap.clear();
            return;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            a3l a3lVar = (a3l) it3.next();
            if (linkedHashMap.get(a3lVar.a()) == null) {
                String strA = a3lVar.a();
                ImageView imageView = new ImageView(((ImageView) this.c).getContext());
                function1.invoke(imageView);
                float fB = a3lVar.b();
                float fC = a3lVar.c();
                ImageView imageView2 = (ImageView) this.c;
                x23Var = this;
                tl60.a(imageView2, new n7l(imageView2, fB, fC, x23Var, imageView));
                linkedHashMap.put(strA, imageView);
            } else {
                x23Var = this;
            }
            ImageView imageView3 = (ImageView) linkedHashMap.get(a3lVar.a());
            if (imageView3 != null) {
                imageView3.setImageResource(a3lVar.f177a);
            }
            this = x23Var;
        }
    }

    public void h(List list, Function1 function1) {
        x23 x23Var;
        ImageView imageView = (ImageView) this.c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o5l o5lVar = (o5l) it.next();
            int i = o5lVar.f24692a;
            if (linkedHashMap.get(Integer.valueOf(i)) == null) {
                Integer numValueOf = Integer.valueOf(i);
                Context context = imageView.getContext();
                context.getClass();
                m7l m7lVar = new m7l(context);
                function1.invoke(m7lVar);
                linkedHashMap.put(numValueOf, m7lVar);
            }
            m7l m7lVar2 = (m7l) linkedHashMap.get(Integer.valueOf(i));
            if (m7lVar2 != null) {
                x23Var = this;
                tl60.a(imageView, new pb90(imageView, o5lVar, m7lVar2, x23Var, (byte) 3));
            } else {
                x23Var = this;
            }
            this = x23Var;
        }
    }

    public void i(String str, boolean z, Function0 function0) {
        List list = u0d.f34849a;
        u0d.j((ImageView) this.c, str, R.drawable.dota_stage_map_placeholder, 0, z ? kotlin.collections.a.c(e2x.f7107a) : iun.f15405a, new y(function0, (byte) 28), null, 364);
    }

    public void j(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public void k(int i) {
        this.f40148a = i | this.f40148a;
    }

    public x23(ImageView imageView) {
        imageView.getClass();
        this.c = imageView;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
    }
}
