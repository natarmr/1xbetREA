package a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vdv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k4e f37251a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public byte q;
    public final HashMap r;
    public i0t0 s;

    public vdv0(vdv0 vdv0Var) {
        this.f37251a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = (byte) 0;
        this.r = new HashMap();
        this.f37251a = vdv0Var.f37251a;
        this.b = vdv0Var.b;
        this.c = vdv0Var.c;
        this.d = vdv0Var.d;
        this.e = vdv0Var.e;
        e(vdv0Var);
    }

    public static float a(float f, float f2, float f3, float f4) {
        boolean zIsNaN = Float.isNaN(f);
        boolean zIsNaN2 = Float.isNaN(f2);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (zIsNaN) {
            f = f3;
        }
        if (zIsNaN2) {
            f2 = f3;
        }
        return rw2.a(f2, f, f4, f);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x0219  */
    /* JADX WARN: Code duplicated, block: B:75:0x021e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0227  */
    /* JADX WARN: Code duplicated, block: B:77:0x022a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0237  */
    /* JADX WARN: Code duplicated, block: B:82:0x0249  */
    /* JADX WARN: Code duplicated, block: B:84:0x0257  */
    /* JADX WARN: Code duplicated, block: B:87:0x0268  */
    /* JADX WARN: Code duplicated, block: B:88:0x02be  */
    /* JADX WARN: Code duplicated, block: B:89:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e8  */
    public static void b(vdv0 vdv0Var, vdv0 vdv0Var2, vdv0 vdv0Var3, fms0 fms0Var, float f) {
        float f2;
        int i;
        int i2;
        int i3;
        HashMap map;
        float f3;
        Iterator it;
        String str;
        HashMap map2;
        Iterator it2;
        HashMap map3;
        HashMap map4;
        iyf iyfVar;
        iyf iyfVar2;
        iyf iyfVar3;
        int iD;
        char c;
        short s;
        int iD2;
        float[] fArr;
        float[] fArr2;
        char c2;
        int i4;
        char c3;
        float[] fArr3;
        float fA;
        Object objValueOf;
        float f4 = f * 100.0f;
        int i5 = (int) f4;
        int i6 = vdv0Var2.b;
        HashMap map5 = vdv0Var2.r;
        int i7 = vdv0Var2.c;
        int i8 = vdv0Var3.b;
        HashMap map6 = vdv0Var3.r;
        int i9 = vdv0Var3.c;
        int i10 = vdv0Var2.d - i6;
        int i11 = vdv0Var2.e - i7;
        int i12 = vdv0Var3.d - i8;
        int i13 = vdv0Var3.e - i9;
        float f5 = vdv0Var2.p;
        float f6 = vdv0Var3.p;
        if (vdv0Var2.q == 8) {
            i6 -= (int) (i12 / 2.0f);
            i7 -= (int) (i13 / 2.0f);
            i11 = i13;
            if (Float.isNaN(f5)) {
                i = i11;
                i10 = i12;
                f2 = 0.0f;
            } else {
                i10 = i12;
                f2 = f5;
                i = i11;
            }
        } else {
            f2 = f5;
            i = i13;
        }
        if (vdv0Var3.q == 8) {
            i8 -= (int) (i10 / 2.0f);
            i9 -= (int) (i11 / 2.0f);
            i12 = i10;
            if (Float.isNaN(f6)) {
                i2 = i11;
                f6 = 0.0f;
            } else {
                i2 = i11;
            }
        } else {
            i2 = i;
        }
        if (Float.isNaN(f2) && !Float.isNaN(f6)) {
            f2 = 1.0f;
        }
        if (!Float.isNaN(f2) && Float.isNaN(f6)) {
            f6 = 1.0f;
        }
        float f7 = vdv0Var2.q == 4 ? 0.0f : f2;
        int i14 = i8;
        float f8 = vdv0Var3.q == 4 ? 0.0f : f6;
        k4e k4eVar = vdv0Var.f37251a;
        HashMap map7 = vdv0Var.r;
        if (k4eVar != null) {
            i3 = i9;
            HashMap map8 = fms0Var.f9801a;
            if (map8.size() > 0) {
                String str2 = vdv0Var.f37251a.k;
                int i15 = i5;
                while (i15 >= 0) {
                    HashMap map9 = map6;
                    HashMap map10 = (HashMap) map8.get(Integer.valueOf(i15));
                    if (map10 != null && map10.get(str2) != null) {
                        hny.b();
                        return;
                    } else {
                        i15--;
                        map6 = map9;
                    }
                }
                map = map6;
                String str3 = vdv0Var.f37251a.k;
                for (int i16 = i5; i16 <= 100; i16++) {
                    HashMap map11 = (HashMap) map8.get(Integer.valueOf(i16));
                    if (map11 != null && map11.get(str3) != null) {
                        hny.b();
                        return;
                    }
                }
                f3 = (f4 - 0.0f) / 100.0f;
            }
            vdv0Var.f37251a = vdv0Var2.f37251a;
            int i17 = (int) (((i14 - i6) * f3) + i6);
            vdv0Var.b = i17;
            int i18 = (int) ((f3 * (i3 - i7)) + i7);
            vdv0Var.c = i18;
            float f9 = 1.0f - f;
            vdv0Var.d = i17 + ((int) ((i12 * f) + (i10 * f9)));
            vdv0Var.e = i18 + ((int) ((i2 * f) + (f9 * i11)));
            vdv0Var.f = a(vdv0Var2.f, vdv0Var3.f, 0.5f, f);
            vdv0Var.g = a(vdv0Var2.g, vdv0Var3.g, 0.5f, f);
            vdv0Var.h = a(vdv0Var2.h, vdv0Var3.h, 0.0f, f);
            vdv0Var.i = a(vdv0Var2.i, vdv0Var3.i, 0.0f, f);
            vdv0Var.j = a(vdv0Var2.j, vdv0Var3.j, 0.0f, f);
            vdv0Var.n = a(vdv0Var2.n, vdv0Var3.n, 1.0f, f);
            vdv0Var.o = a(vdv0Var2.o, vdv0Var3.o, 1.0f, f);
            vdv0Var.k = a(vdv0Var2.k, vdv0Var3.k, 0.0f, f);
            vdv0Var.l = a(vdv0Var2.l, vdv0Var3.l, 0.0f, f);
            vdv0Var.m = a(vdv0Var2.m, vdv0Var3.m, 0.0f, f);
            vdv0Var.p = a(f7, f8, 1.0f, f);
            Set setKeySet = map.keySet();
            map7.clear();
            it = setKeySet.iterator();
            while (it.hasNext()) {
                str = (String) it.next();
                map2 = map5;
                if (map2.containsKey(str)) {
                    iyfVar = (iyf) map2.get(str);
                    map4 = map;
                    iyfVar2 = (iyf) map4.get(str);
                    iyfVar3 = new iyf(iyfVar);
                    map3 = map7;
                    map3.put(str, iyfVar3);
                    iD = iyfVar.d();
                    c = 1;
                    s = iyfVar3.b;
                    if (iD == 1) {
                        fA = a(iyfVar.b(), iyfVar2.b(), 0.0f, f);
                        objValueOf = Float.valueOf(fA);
                        switch (s) {
                            case 900:
                                iyfVar3.c = ((Integer) objValueOf).intValue();
                                break;
                            case 901:
                                iyfVar3.d = fA;
                                break;
                            case 902:
                                iyfVar3.c = ((Integer) objValueOf).intValue();
                                break;
                            case 903:
                                iyfVar3.e = (String) objValueOf;
                                break;
                        }
                    } else {
                        iD2 = iyfVar.d();
                        fArr = new float[iD2];
                        fArr2 = new float[iD2];
                        iyfVar.c(fArr);
                        iyfVar2.c(fArr2);
                        c2 = 0;
                        i4 = 0;
                        while (i4 < iD2) {
                            fArr[i4] = a(fArr[i4], fArr2[i4], 0.0f, f);
                            switch (s) {
                                case 900:
                                    c3 = c2;
                                    fArr3 = fArr;
                                    iyfVar3.c = (int) fArr3[c3];
                                    break;
                                case 901:
                                    c3 = c2;
                                    fArr3 = fArr;
                                    iyfVar3.d = fArr3[c3];
                                    break;
                                case 902:
                                    float f10 = fArr[c2];
                                    float f11 = fArr[c];
                                    c3 = c2;
                                    float f12 = fArr[2];
                                    int iRound = Math.round(((float) Math.pow(f10, 0.5d)) * 255.0f) & 255;
                                    int iRound2 = Math.round(((float) Math.pow(f11, 0.5d)) * 255.0f) & 255;
                                    fArr3 = fArr;
                                    iyfVar3.c = (Math.round(((float) Math.pow(f12, 0.5d)) * 255.0f) & 255) | ((Math.round(fArr3[3] * 255.0f) & 255) << 24) | (iRound << 16) | (iRound2 << 8);
                                    break;
                                case 903:
                                    itt0.k("Cannot interpolate String");
                                    return;
                                default:
                                    c3 = c2;
                                    fArr3 = fArr;
                                    break;
                            }
                            i4++;
                            c2 = c3;
                            it = it;
                            iD2 = iD2;
                            fArr = fArr3;
                            s = s;
                            c = 1;
                        }
                    }
                    it2 = it;
                } else {
                    it2 = it;
                    map3 = map7;
                    map4 = map;
                }
                it = it2;
                map5 = map2;
                map = map4;
                map7 = map3;
            }
        }
        i3 = i9;
        map = map6;
        f3 = f;
        vdv0Var.f37251a = vdv0Var2.f37251a;
        int i19 = (int) (((i14 - i6) * f3) + i6);
        vdv0Var.b = i19;
        int i110 = (int) ((f3 * (i3 - i7)) + i7);
        vdv0Var.c = i110;
        float f13 = 1.0f - f;
        vdv0Var.d = i19 + ((int) ((i12 * f) + (i10 * f13)));
        vdv0Var.e = i110 + ((int) ((i2 * f) + (f13 * i11)));
        vdv0Var.f = a(vdv0Var2.f, vdv0Var3.f, 0.5f, f);
        vdv0Var.g = a(vdv0Var2.g, vdv0Var3.g, 0.5f, f);
        vdv0Var.h = a(vdv0Var2.h, vdv0Var3.h, 0.0f, f);
        vdv0Var.i = a(vdv0Var2.i, vdv0Var3.i, 0.0f, f);
        vdv0Var.j = a(vdv0Var2.j, vdv0Var3.j, 0.0f, f);
        vdv0Var.n = a(vdv0Var2.n, vdv0Var3.n, 1.0f, f);
        vdv0Var.o = a(vdv0Var2.o, vdv0Var3.o, 1.0f, f);
        vdv0Var.k = a(vdv0Var2.k, vdv0Var3.k, 0.0f, f);
        vdv0Var.l = a(vdv0Var2.l, vdv0Var3.l, 0.0f, f);
        vdv0Var.m = a(vdv0Var2.m, vdv0Var3.m, 0.0f, f);
        vdv0Var.p = a(f7, f8, 1.0f, f);
        Set setKeySet2 = map.keySet();
        map7.clear();
        it = setKeySet2.iterator();
        while (it.hasNext()) {
            str = (String) it.next();
            map2 = map5;
            if (map2.containsKey(str)) {
                iyfVar = (iyf) map2.get(str);
                map4 = map;
                iyfVar2 = (iyf) map4.get(str);
                iyfVar3 = new iyf(iyfVar);
                map3 = map7;
                map3.put(str, iyfVar3);
                iD = iyfVar.d();
                c = 1;
                s = iyfVar3.b;
                if (iD == 1) {
                    fA = a(iyfVar.b(), iyfVar2.b(), 0.0f, f);
                    objValueOf = Float.valueOf(fA);
                    switch (s) {
                        case 900:
                            iyfVar3.c = ((Integer) objValueOf).intValue();
                            break;
                        case 901:
                            iyfVar3.d = fA;
                            break;
                        case 902:
                            iyfVar3.c = ((Integer) objValueOf).intValue();
                            break;
                        case 903:
                            iyfVar3.e = (String) objValueOf;
                            break;
                    }
                } else {
                    iD2 = iyfVar.d();
                    fArr = new float[iD2];
                    fArr2 = new float[iD2];
                    iyfVar.c(fArr);
                    iyfVar2.c(fArr2);
                    c2 = 0;
                    i4 = 0;
                    while (i4 < iD2) {
                        fArr[i4] = a(fArr[i4], fArr2[i4], 0.0f, f);
                        switch (s) {
                            case 900:
                                c3 = c2;
                                fArr3 = fArr;
                                iyfVar3.c = (int) fArr3[c3];
                                break;
                            case 901:
                                c3 = c2;
                                fArr3 = fArr;
                                iyfVar3.d = fArr3[c3];
                                break;
                            case 902:
                                float f14 = fArr[c2];
                                float f15 = fArr[c];
                                c3 = c2;
                                float f16 = fArr[2];
                                int iRound3 = Math.round(((float) Math.pow(f14, 0.5d)) * 255.0f) & 255;
                                int iRound4 = Math.round(((float) Math.pow(f15, 0.5d)) * 255.0f) & 255;
                                fArr3 = fArr;
                                iyfVar3.c = (Math.round(((float) Math.pow(f16, 0.5d)) * 255.0f) & 255) | ((Math.round(fArr3[3] * 255.0f) & 255) << 24) | (iRound3 << 16) | (iRound4 << 8);
                                break;
                            case 903:
                                itt0.k("Cannot interpolate String");
                                return;
                            default:
                                c3 = c2;
                                fArr3 = fArr;
                                break;
                        }
                        i4++;
                        c2 = c3;
                        it = it;
                        iD2 = iD2;
                        fArr = fArr3;
                        s = s;
                        c = 1;
                    }
                }
                it2 = it;
            } else {
                it2 = it;
                map3 = map7;
                map4 = map;
            }
            it = it2;
            map5 = map2;
            map = map4;
            map7 = map3;
        }
    }

    public final boolean c() {
        return Float.isNaN(this.h) && Float.isNaN(this.i) && Float.isNaN(this.j) && Float.isNaN(this.k) && Float.isNaN(this.l) && Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p);
    }

    public final void d() {
        k4e k4eVar = this.f37251a;
        if (k4eVar != null) {
            this.b = k4eVar.t();
            this.c = this.f37251a.u();
            k4e k4eVar2 = this.f37251a;
            this.d = k4eVar2.t() + k4eVar2.W;
            k4e k4eVar3 = this.f37251a;
            this.e = k4eVar3.u() + k4eVar3.X;
            e(this.f37251a.j);
        }
    }

    public final void e(vdv0 vdv0Var) {
        if (vdv0Var == null) {
            return;
        }
        this.f = vdv0Var.f;
        this.g = vdv0Var.g;
        this.h = vdv0Var.h;
        this.i = vdv0Var.i;
        this.j = vdv0Var.j;
        this.k = vdv0Var.k;
        this.l = vdv0Var.l;
        this.m = vdv0Var.m;
        this.n = vdv0Var.n;
        this.o = vdv0Var.o;
        this.p = vdv0Var.p;
        this.q = vdv0Var.q;
        this.s = vdv0Var.s;
        HashMap map = this.r;
        map.clear();
        for (iyf iyfVar : vdv0Var.r.values()) {
            map.put(iyfVar.f15586a, new iyf(iyfVar));
        }
    }

    public vdv0(k4e k4eVar) {
        this.f37251a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = (byte) 0;
        this.r = new HashMap();
        this.f37251a = k4eVar;
    }

    public vdv0() {
        this.f37251a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = (byte) 0;
        this.r = new HashMap();
    }
}
