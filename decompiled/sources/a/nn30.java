package a;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class nn30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f930 f23800a;
    public final Object b;
    public final ixg0[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public on30 g;
    public final boolean[] h;
    public final boolean[] i;
    public final j16[] j;
    public final syj k;
    public final jo30 l;
    public nn30 m;
    public dcs0 n;
    public ucs0 o;
    public long p;

    public nn30(j16[] j16VarArr, long j, syj syjVar, lhf0 lhf0Var, jo30 jo30Var, on30 on30Var, ucs0 ucs0Var) {
        this.j = j16VarArr;
        this.p = j;
        this.k = syjVar;
        this.l = jo30Var;
        vn30 vn30Var = on30Var.f25528a;
        Object obj = vn30Var.f37698a;
        this.b = obj;
        this.g = on30Var;
        this.n = dcs0.d;
        this.o = ucs0Var;
        this.c = new ixg0[j16VarArr.length];
        this.h = new boolean[j16VarArr.length];
        this.i = new boolean[j16VarArr.length];
        long j2 = on30Var.b;
        jo30Var.getClass();
        int i = wna0.k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        vn30 vn30VarA = vn30Var.a(pair.second);
        io30 io30Var = (io30) jo30Var.e.get(obj2);
        io30Var.getClass();
        jo30Var.h.add(io30Var);
        ho30 ho30Var = (ho30) jo30Var.g.get(io30Var);
        if (ho30Var != null) {
            ho30Var.f13375a.d(ho30Var.b);
        }
        io30Var.c.add(vn30VarA);
        f930 f930VarA = io30Var.f15100a.a(vn30VarA, lhf0Var, j2);
        jo30Var.d.put(f930VarA, io30Var);
        jo30Var.c();
        this.f23800a = f930VarA;
    }

    public final long a(ucs0 ucs0Var, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        j16[] j16VarArr;
        boolean[] zArr3;
        ixg0[] ixg0VarArr;
        fmo[] fmoVarArr = (fmo[]) ucs0Var.d;
        int i = 0;
        while (true) {
            int i2 = ucs0Var.b;
            zArr2 = this.i;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || !ucs0Var.o(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            j16VarArr = this.j;
            int length = j16VarArr.length;
            zArr3 = zArr2;
            ixg0VarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (j16VarArr[i3].b == -2) {
                ixg0VarArr[i3] = null;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = ucs0Var;
        c();
        long j2 = this.f23800a.j(fmoVarArr, zArr3, ixg0VarArr, zArr, j);
        for (int i4 = 0; i4 < j16VarArr.length; i4++) {
            if (j16VarArr[i4].b == -2 && this.o.p(i4)) {
                ixg0VarArr[i4] = new tun();
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < ixg0VarArr.length; i5++) {
            if (ixg0VarArr[i5] != null) {
                x0x.K(ucs0Var.p(i5));
                if (j16VarArr[i5].b != -2) {
                    this.f = true;
                }
            } else {
                x0x.K(fmoVarArr[i5] == null);
            }
        }
        return j2;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            ucs0 ucs0Var = this.o;
            if (i >= ucs0Var.b) {
                return;
            }
            boolean zP = ucs0Var.p(i);
            fmo fmoVar = ((fmo[]) this.o.d)[i];
            if (zP && fmoVar != null) {
                fmoVar.a();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            ucs0 ucs0Var = this.o;
            if (i >= ucs0Var.b) {
                return;
            }
            boolean zP = ucs0Var.p(i);
            fmo fmoVar = ((fmo[]) this.o.d)[i];
            if (zP && fmoVar != null) {
                fmoVar.b();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jS = this.f ? this.f23800a.s() : Long.MIN_VALUE;
        return jS == Long.MIN_VALUE ? this.g.e : jS;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, bmq0 bmq0Var, boolean z) {
        this.e = true;
        this.n = this.f23800a.p();
        ucs0 ucs0VarJ = j(f, bmq0Var, z);
        on30 on30Var = this.g;
        long jMax = on30Var.b;
        long j = on30Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(ucs0VarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        on30 on30Var2 = this.g;
        this.p = (on30Var2.b - jA) + j2;
        this.g = on30Var2.b(jA, on30Var2.c);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.f23800a.s() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        jo30 jo30Var = this.l;
        f930 f930Var = this.f23800a;
        try {
            IdentityHashMap identityHashMap = jo30Var.d;
            io30 io30Var = (io30) identityHashMap.remove(f930Var);
            io30Var.getClass();
            io30Var.f15100a.m(f930Var);
            io30Var.c.remove(f930Var.f9136a);
            if (!identityHashMap.isEmpty()) {
                jo30Var.c();
            }
            jo30Var.d(io30Var);
        } catch (RuntimeException e) {
            f1t0.R("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02e1  */
    public final ucs0 j(float f, bmq0 bmq0Var, boolean z) {
        String str;
        rcf0 rcf0VarG;
        rcf0 rcf0VarT;
        int[] iArr;
        long[][] jArr;
        int i;
        int i2;
        int[] iArr2;
        String languageTag;
        CaptioningManager captioningManager;
        Locale locale;
        Pair pairK;
        boolean z2;
        Context context;
        int[] iArr3;
        syj syjVar = this.k;
        j16[] j16VarArr = this.j;
        dcs0 dcs0Var = this.n;
        syjVar.getClass();
        int i3 = 1;
        int[] iArr4 = new int[j16VarArr.length + 1];
        int length = j16VarArr.length + 1;
        ccs0[][] ccs0VarArr = new ccs0[length][];
        int[][][] iArr5 = new int[j16VarArr.length + 1][][];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = dcs0Var.f5860a;
            ccs0VarArr[i4] = new ccs0[i5];
            iArr5[i4] = new int[i5][];
        }
        int length2 = j16VarArr.length;
        int[] iArr6 = new int[length2];
        for (int i6 = 0; i6 < length2; i6++) {
            iArr6[i6] = j16VarArr[i6].E();
        }
        int i7 = 0;
        while (i7 < dcs0Var.f5860a) {
            ccs0 ccs0VarA = dcs0Var.a(i7);
            int i8 = ccs0VarA.c == 5 ? i3 : 0;
            int length3 = j16VarArr.length;
            int i9 = i3;
            int i10 = 0;
            int i11 = 0;
            while (i10 < j16VarArr.length) {
                j16 j16Var = j16VarArr[i10];
                dcs0 dcs0Var2 = dcs0Var;
                int[] iArr7 = iArr4;
                int i12 = i3;
                int iMax = 0;
                for (int i13 = 0; i13 < ccs0VarA.f4128a; i13++) {
                    iMax = Math.max(iMax, j16Var.D(ccs0VarA.d[i13]) & 7);
                }
                int i14 = iArr7[i10] == 0 ? i12 : 0;
                if (iMax > i11 || (iMax == i11 && i8 != 0 && i9 == 0 && i14 != 0)) {
                    i11 = iMax;
                    i9 = i14;
                    length3 = i10;
                }
                i10++;
                i3 = i12;
                dcs0Var = dcs0Var2;
                iArr4 = iArr7;
            }
            dcs0 dcs0Var3 = dcs0Var;
            int[] iArr8 = iArr4;
            int i15 = i3;
            if (length3 == j16VarArr.length) {
                iArr3 = new int[ccs0VarA.f4128a];
            } else {
                j16 j16Var2 = j16VarArr[length3];
                int[] iArr9 = new int[ccs0VarA.f4128a];
                for (int i16 = 0; i16 < ccs0VarA.f4128a; i16++) {
                    iArr9[i16] = j16Var2.D(ccs0VarA.d[i16]);
                }
                iArr3 = iArr9;
            }
            int i17 = iArr8[length3];
            ccs0VarArr[length3][i17] = ccs0VarA;
            iArr5[length3][i17] = iArr3;
            iArr8[length3] = i17 + 1;
            i7++;
            i3 = i15;
            dcs0Var = dcs0Var3;
            iArr4 = iArr8;
        }
        int[] iArr10 = iArr4;
        int i18 = i3;
        dcs0[] dcs0VarArr = new dcs0[j16VarArr.length];
        String[] strArr = new String[j16VarArr.length];
        int[] iArr11 = new int[j16VarArr.length];
        for (int i19 = 0; i19 < j16VarArr.length; i19++) {
            int i20 = iArr10[i19];
            dcs0VarArr[i19] = new dcs0((ccs0[]) vtt0.O(i20, ccs0VarArr[i19]));
            iArr5[i19] = (int[][]) vtt0.O(i20, iArr5[i19]);
            strArr[i19] = j16VarArr[i19].k();
            iArr11[i19] = j16VarArr[i19].b;
        }
        sp20 sp20Var = new sp20(iArr11, dcs0VarArr, iArr6, iArr5, new dcs0((ccs0[]) vtt0.O(iArr10[j16VarArr.length], ccs0VarArr[j16VarArr.length])));
        syjVar.g = Thread.currentThread();
        Boolean boolValueOf = syjVar.j;
        if (boolValueOf == null && (context = syjVar.c) != null) {
            boolValueOf = Boolean.valueOf(vtt0.L(context));
            syjVar.j = boolValueOf;
        }
        if (syjVar.f.C && Build.VERSION.SDK_INT >= 32 && syjVar.h == null) {
            syjVar.h = new o24(syjVar.c, new ccf(syjVar, (byte) 10), boolValueOf);
        }
        int i21 = sp20Var.f32571a;
        emo[] emoVarArr = new emo[i21];
        syj.c(sp20Var, syjVar.f, emoVarArr);
        syj.a(sp20Var, syjVar.f, emoVarArr);
        syj.b(sp20Var, syjVar.f, emoVarArr);
        nyj nyjVar = syjVar.f;
        Context context2 = syjVar.c;
        int i22 = sp20Var.f32571a;
        Pair pairE = syj.e(emoVarArr, i18);
        if (pairE == null) {
            int i23 = 0;
            while (true) {
                if (i23 >= i22) {
                    z2 = false;
                    break;
                }
                if (2 == iArr11[i23] && dcs0VarArr[i23].f5860a > 0) {
                    z2 = true;
                    break;
                }
                i23++;
            }
            pairE = syj.k(1, sp20Var, iArr5, new iyj(syjVar, nyjVar, z2, iArr6), new l13((byte) 10));
            if (pairE != null) {
                emoVarArr[((Integer) pairE.second).intValue()] = (emo) pairE.first;
            }
        }
        if (pairE == null) {
            str = null;
        } else {
            emo emoVar = (emo) pairE.first;
            str = emoVar.f8057a.d[emoVar.b[0]].d;
        }
        Pair pairE2 = syj.e(emoVarArr, 2);
        Pair pairE3 = syj.e(emoVarArr, 4);
        if (pairE2 == null && pairE3 == null) {
            nyjVar.q.getClass();
            Pair pairK2 = syj.k(2, sp20Var, iArr5, new ncf(nyjVar, str, iArr6, (!nyjVar.g || context2 == null) ? null : vtt0.t(context2)), new l13((byte) 9));
            if (pairK2 == null) {
                nyjVar.q.getClass();
                pairK = syj.k(4, sp20Var, iArr5, new z9f(nyjVar, (byte) 11), new l13((byte) 8));
            } else {
                pairK = null;
            }
            if (pairK != null) {
                emoVarArr[((Integer) pairK.second).intValue()] = (emo) pairK.first;
            } else if (pairK2 != null) {
                emoVarArr[((Integer) pairK2.second).intValue()] = (emo) pairK2.first;
            }
        }
        if (syj.e(emoVarArr, 3) == null) {
            nyjVar.q.getClass();
            if (!nyjVar.t || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = vtt0.f38024a;
                languageTag = locale.toLanguageTag();
            }
            Pair pairK3 = syj.k(3, sp20Var, iArr5, new hi(nyjVar, str, languageTag), new l13((byte) 11));
            if (pairK3 != null) {
                emoVarArr[((Integer) pairK3.second).intValue()] = (emo) pairK3.first;
            }
        }
        nyjVar.q.getClass();
        int i24 = f4x.c;
        e4x e4xVar = new e4x(4);
        int iF = j16.f(0, 0, 0, 0);
        int i25 = 0;
        while (i25 < i21) {
            emo emoVar2 = emoVarArr[i25];
            if (emoVar2 != null) {
                ccs0 ccs0Var = emoVar2.f8057a;
                if (nyjVar.G.get(i25)) {
                    i2 = i25;
                } else {
                    i2 = i25;
                    if (!nyjVar.x.contains(Integer.valueOf(ccs0Var.c))) {
                        e4xVar.a(ccs0Var.b);
                        int i26 = 0;
                        while (true) {
                            int[] iArr12 = emoVar2.b;
                            iArr2 = iArr11;
                            if (i26 < iArr12.length) {
                                String str3 = ccs0Var.d[iArr12[i26]].n;
                                if (str3 != null) {
                                    e4xVar.b(str3);
                                }
                                i26++;
                                iArr11 = iArr2;
                            }
                        }
                    }
                }
                iArr2 = iArr11;
            } else {
                i2 = i25;
                iArr2 = iArr11;
            }
            i25 = i2 + 1;
            iArr11 = iArr2;
        }
        int[] iArr13 = iArr11;
        f4x f4xVarG = e4xVar.g();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i27 = 0;
        while (i27 < i22) {
            if (iArr13[i27] != 5) {
                i = i27;
            } else {
                dcs0 dcs0Var4 = dcs0VarArr[i27];
                i = i27;
                int i28 = 0;
                while (i28 < dcs0Var4.f5860a) {
                    ccs0 ccs0VarA2 = dcs0Var4.a(i28);
                    arrayList.add(ccs0VarA2);
                    dcs0[] dcs0VarArr2 = dcs0VarArr;
                    int[] iArr14 = (int[]) iArr5[i][i28].clone();
                    int[][][] iArr15 = iArr5;
                    dcs0 dcs0Var5 = dcs0Var4;
                    for (int i29 = 0; i29 < iArr14.length; i29++) {
                        String str4 = ccs0VarA2.d[i29].n;
                        if (str4 != null && !f4xVarG.contains(str4)) {
                            iArr14[i29] = iF;
                        }
                    }
                    arrayList2.add(iArr14);
                    i28++;
                    iArr5 = iArr15;
                    dcs0VarArr = dcs0VarArr2;
                    dcs0Var4 = dcs0Var5;
                }
            }
            i27 = i + 1;
            iArr5 = iArr5;
            dcs0VarArr = dcs0VarArr;
        }
        dcs0[] dcs0VarArr3 = dcs0VarArr;
        int[][][] iArr16 = iArr5;
        int size = arrayList.size();
        ccs0[] ccs0VarArr2 = new ccs0[size];
        x0x.K(arrayList.size() == size);
        arrayList.toArray(ccs0VarArr2);
        dcs0 dcs0Var6 = new dcs0(ccs0VarArr2);
        int size2 = arrayList2.size();
        int[][] iArr17 = new int[size2][];
        x0x.K(arrayList2.size() == size2);
        arrayList2.toArray(iArr17);
        for (int i30 = 0; i30 < i22; i30++) {
            if (iArr13[i30] == 5) {
                emo emoVarJ = syj.j(dcs0Var6, iArr17, nyjVar);
                emoVarArr[i30] = emoVarJ;
                if (emoVarJ == null) {
                    break;
                }
                Arrays.fill(iArr17[dcs0Var6.b(emoVarJ.f8057a)], iF);
            }
        }
        for (int i31 = 0; i31 < i22; i31++) {
            int i32 = iArr13[i31];
            if (i32 != 2 && i32 != 1) {
                if (i32 != 3 && i32 != 4) {
                    if (i32 != 5 && emoVarArr[i31] == null) {
                        emoVarArr[i31] = syj.j(dcs0VarArr3[i31], iArr16[i31], nyjVar);
                    }
                }
            }
        }
        syj.c(sp20Var, syjVar.f, emoVarArr);
        syj.a(sp20Var, syjVar.f, emoVarArr);
        syj.b(sp20Var, syjVar.f, emoVarArr);
        pek0 pek0Var = syjVar.d;
        rsj rsjVar = syjVar.b;
        rsjVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (emo emoVar3 : emoVarArr) {
            if (emoVar3 == null || emoVar3.b.length <= 1) {
                arrayList3.add(null);
            } else {
                u3x u3xVarL = b4x.l();
                u3xVarL.b(new mp(0L, 0L));
                arrayList3.add(u3xVarL);
            }
        }
        int length4 = emoVarArr.length;
        long[][] jArr2 = new long[length4][];
        for (int i33 = 0; i33 < emoVarArr.length; i33++) {
            emo emoVar4 = emoVarArr[i33];
            if (emoVar4 == null) {
                jArr2[i33] = new long[0];
            } else {
                int[] iArr18 = emoVar4.b;
                jArr2[i33] = new long[iArr18.length];
                for (int i34 = 0; i34 < iArr18.length; i34++) {
                    long j = emoVar4.f8057a.d[iArr18[i34]].k;
                    long[] jArr3 = jArr2[i33];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i34] = j;
                }
                Arrays.sort(jArr2[i33]);
            }
        }
        int[] iArr19 = new int[length4];
        long[] jArr4 = new long[length4];
        for (int i35 = 0; i35 < length4; i35++) {
            long[] jArr5 = jArr2[i35];
            jArr4[i35] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        np.v(arrayList3, jArr4);
        e3c.s(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(s950.b);
        lx40 lx40Var = new lx40();
        e3c.s(2, "expectedValuesPerKey");
        mx40 mx40Var = new mx40(treeMap);
        mx40Var.f = lx40Var;
        int i36 = 0;
        loop19: while (true) {
            if (i36 >= length4) {
                int[] iArr20 = iArr19;
                long[][] jArr6 = jArr2;
                Collection b4Var = mx40Var.b;
                if (b4Var == null) {
                    b4Var = new b4(mx40Var, (byte) 0);
                    mx40Var.b = b4Var;
                }
                b4x b4xVarO = b4x.o(b4Var);
                for (int i37 = 0; i37 < b4xVarO.size(); i37++) {
                    int iIntValue = ((Integer) b4xVarO.get(i37)).intValue();
                    int i38 = iArr20[iIntValue] + 1;
                    iArr20[iIntValue] = i38;
                    jArr4[iIntValue] = jArr6[iIntValue][i38];
                    np.v(arrayList3, jArr4);
                }
                for (int i39 = 0; i39 < emoVarArr.length; i39++) {
                    if (arrayList3.get(i39) != null) {
                        jArr4[i39] = jArr4[i39] * 2;
                    }
                }
                np.v(arrayList3, jArr4);
                u3x u3xVarL2 = b4x.l();
                for (int i40 = 0; i40 < arrayList3.size(); i40++) {
                    u3x u3xVar = (u3x) arrayList3.get(i40);
                    u3xVarL2.b(u3xVar == null ? rcf0.e : u3xVar.g());
                }
                rcf0VarG = u3xVarL2.g();
                break;
            }
            long[] jArr7 = jArr2[i36];
            if (jArr7.length <= 1) {
                iArr = iArr19;
                jArr = jArr2;
            } else {
                int length5 = jArr7.length;
                double[] dArr = new double[length5];
                int i41 = 0;
                while (true) {
                    long[] jArr8 = jArr2[i36];
                    iArr = iArr19;
                    double dLog = 0.0d;
                    if (i41 >= jArr8.length) {
                        break;
                    }
                    long[][] jArr9 = jArr2;
                    long j2 = jArr8[i41];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i41] = dLog;
                    i41++;
                    iArr19 = iArr;
                    jArr2 = jArr9;
                }
                jArr = jArr2;
                int i42 = length5 - 1;
                double d = dArr[i42] - dArr[0];
                int i43 = 0;
                while (i43 < i42) {
                    double d2 = dArr[i43];
                    int i44 = i43 + 1;
                    Double dValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i44]) * 0.5d) - dArr[0]) / d);
                    double d3 = d;
                    Integer numValueOf = Integer.valueOf(i36);
                    Map map = mx40Var.d;
                    Collection collection = (Collection) map.get(dValueOf);
                    if (collection == null) {
                        Collection collectionF = mx40Var.f();
                        if (!collectionF.add(numValueOf)) {
                            c99.l("New Collection violated the Collection spec");
                            rcf0VarG = null;
                            break loop19;
                        }
                        mx40Var.e++;
                        map.put(dValueOf, collectionF);
                    } else if (collection.add(numValueOf)) {
                        mx40Var.e++;
                    }
                    d = d3;
                    i43 = i44;
                }
            }
            i36++;
            length4 = length4;
            iArr19 = iArr;
            jArr2 = jArr;
        }
        fmo[] fmoVarArr = new fmo[emoVarArr.length];
        for (int i45 = 0; i45 < emoVarArr.length; i45++) {
            emo emoVar5 = emoVarArr[i45];
            if (emoVar5 != null) {
                int[] iArr21 = emoVar5.b;
                if (iArr21.length != 0) {
                    int length6 = iArr21.length;
                    ccs0 ccs0Var2 = emoVar5.f8057a;
                    fmoVarArr[i45] = length6 == 1 ? new riq(0, ccs0Var2, new int[]{iArr21[0]}) : new np(ccs0Var2, iArr21, rsjVar, (b4x) rcf0VarG.get(i45));
                }
            }
        }
        tjf0[] tjf0VarArr = new tjf0[i21];
        for (int i46 = 0; i46 < i21; i46++) {
            tjf0VarArr[i46] = (syjVar.f.G.get(i46) || syjVar.f.x.contains(Integer.valueOf(sp20Var.b[i46])) || (sp20Var.b[i46] != -2 && fmoVarArr[i46] == null)) ? null : tjf0.c;
        }
        syjVar.f.getClass();
        syjVar.f.q.getClass();
        Pair pairCreate = Pair.create(tjf0VarArr, fmoVarArr);
        fmo[] fmoVarArr2 = (fmo[]) pairCreate.second;
        int length7 = fmoVarArr2.length;
        List[] listArr = new List[length7];
        for (int i47 = 0; i47 < fmoVarArr2.length; i47++) {
            fmo fmoVar = fmoVarArr2[i47];
            if (fmoVar != null) {
                rcf0VarT = b4x.t(fmoVar);
            } else {
                v3x v3xVar = b4x.b;
                rcf0VarT = rcf0.e;
            }
            listArr[i47] = rcf0VarT;
        }
        u3x u3xVar2 = new u3x(4);
        int i48 = 0;
        while (true) {
            int i49 = sp20Var.f32571a;
            dcs0[] dcs0VarArr4 = sp20Var.c;
            if (i48 >= i49) {
                break;
            }
            dcs0 dcs0Var7 = dcs0VarArr4[i48];
            int i50 = 0;
            while (i50 < dcs0Var7.f5860a) {
                ccs0 ccs0VarA3 = dcs0Var7.a(i50);
                int i51 = dcs0VarArr4[i48].a(i50).f4128a;
                int[] iArr22 = new int[i51];
                int i52 = 0;
                int i53 = 0;
                while (i52 < i51) {
                    List[] listArr2 = listArr;
                    if ((sp20Var.e[i48][i50][i52] & 7) == 4) {
                        iArr22[i53] = i52;
                        i53++;
                    }
                    i52++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr22, i53);
                dcs0 dcs0Var8 = dcs0Var7;
                int iMin = 16;
                String str5 = null;
                int i54 = 0;
                boolean z3 = false;
                int i55 = 0;
                while (i54 < iArrCopyOf.length) {
                    int[] iArr23 = iArrCopyOf;
                    String str6 = dcs0VarArr4[i48].a(i50).d[iArrCopyOf[i54]].p;
                    int i56 = i55 + 1;
                    if (i55 == 0) {
                        str5 = str6;
                    } else {
                        z3 = (!Objects.equals(str5, str6)) | z3;
                    }
                    iMin = Math.min(iMin, sp20Var.e[i48][i50][i54] & 24);
                    i54++;
                    i55 = i56;
                    iArrCopyOf = iArr23;
                }
                if (z3) {
                    iMin = Math.min(iMin, sp20Var.d[i48]);
                }
                boolean z4 = iMin != 0;
                int i57 = ccs0VarA3.f4128a;
                int[] iArr24 = new int[i57];
                boolean[] zArr = new boolean[i57];
                for (int i58 = 0; i58 < ccs0VarA3.f4128a; i58++) {
                    iArr24[i58] = sp20Var.e[i48][i50][i58] & 7;
                    int i59 = 0;
                    boolean z5 = false;
                    while (i59 < length7) {
                        List list = listArr3[i59];
                        int i60 = length7;
                        dcs0[] dcs0VarArr5 = dcs0VarArr4;
                        int i61 = 0;
                        while (i61 < list.size()) {
                            fmo fmoVar2 = (fmo) list.get(i61);
                            int i62 = i61;
                            if (fmoVar2.n().equals(ccs0VarA3) && fmoVar2.l(i58) != -1) {
                                z5 = true;
                                break;
                            }
                            i61 = i62 + 1;
                        }
                        i59++;
                        length7 = i60;
                        dcs0VarArr4 = dcs0VarArr5;
                    }
                    zArr[i58] = z5;
                }
                u3xVar2.b(new qds0(ccs0VarA3, z4, iArr24, zArr));
                i50++;
                listArr = listArr3;
                dcs0Var7 = dcs0Var8;
                length7 = length7;
            }
            i48++;
        }
        dcs0 dcs0Var9 = sp20Var.f;
        for (int i63 = 0; i63 < dcs0Var9.f5860a; i63++) {
            ccs0 ccs0VarA4 = dcs0Var9.a(i63);
            int[] iArr25 = new int[ccs0VarA4.f4128a];
            Arrays.fill(iArr25, 0);
            u3xVar2.b(new qds0(ccs0VarA4, false, iArr25, new boolean[ccs0VarA4.f4128a]));
        }
        ucs0 ucs0Var = new ucs0((tjf0[]) pairCreate.first, (fmo[]) pairCreate.second, new rds0(u3xVar2.g()), sp20Var);
        for (int i64 = 0; i64 < ucs0Var.b; i64++) {
            boolean zP = ucs0Var.p(i64);
            fmo[] fmoVarArr3 = (fmo[]) ucs0Var.d;
            if (zP) {
                x0x.K(fmoVarArr3[i64] != null || this.j[i64].b == -2);
            } else {
                x0x.K(fmoVarArr3[i64] == null);
            }
        }
        for (fmo fmoVar3 : (fmo[]) ucs0Var.d) {
            if (fmoVar3 != null) {
                fmoVar3.i(f);
                fmoVar3.o(z);
            }
        }
        return ucs0Var;
    }
}
