package a;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final class zr8 {
    public float A;
    public float B;
    public int C;
    public List D;
    public List E;
    public final int F;
    public final int G;
    public final int H;
    public Rect I;
    public boolean J;
    public float K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final et8 f44840a;
    public final bs8 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final TreeMap h;
    public vs8 i;
    public boolean j;
    public Function0 k;
    public rs8 l;
    public final int m;
    public tr8 n;
    public final Rect o;
    public LinkedHashSet p;
    public final ArrayList q;
    public final LinkedHashSet r;
    public final ArrayList s;
    public List t;
    public boolean u;
    public final pz40 v;
    public final Rect w;
    public int x;
    public int y;
    public int z;

    public zr8(et8 et8Var, bs8 bs8Var, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, tr8 tr8Var) {
        et8Var.getClass();
        this.f44840a = et8Var;
        this.b = bs8Var;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = i4;
        this.h = new TreeMap();
        this.j = true;
        this.m = i2;
        this.n = tr8Var;
        this.o = new Rect(i6, i7, i8, i9);
        this.p = new LinkedHashSet();
        this.q = new ArrayList();
        this.r = new LinkedHashSet();
        this.s = new ArrayList();
        iun iunVar = iun.f15405a;
        this.t = iunVar;
        this.u = true;
        this.v = androidx.compose.runtime.e.e(iunVar);
        androidx.compose.runtime.e.b(0);
        this.w = new Rect();
        this.D = iunVar;
        this.E = iunVar;
        this.F = y0x0.L(tr8Var.f34412a, i, z);
        this.G = y0x0.L(tr8Var.c, i, z);
        this.H = y0x0.L(tr8Var.d, i, z);
        et8Var.b = this;
    }

    public static final vs8 e(zr8 zr8Var, List list) {
        Object obj;
        int iCenterY = zr8Var.w.centerY();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iAbs = Math.abs(iCenterY - ((vs8) next).f.centerY());
                do {
                    Object next2 = it.next();
                    int iAbs2 = Math.abs(iCenterY - ((vs8) next2).f.centerY());
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (vs8) obj;
    }

    public final void a(int i, int i2, boolean z, boolean z2) {
        rs8 rs8Var;
        if (this.n.b == ur8.b) {
            i2 = 0;
        }
        j(i, i2, z, z2);
        boolean z3 = i < 0;
        if (!this.j || (rs8Var = this.l) == null) {
            return;
        }
        rs8Var.b.invoke(Boolean.valueOf(z3));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    public final void b() {
        IntRange intRange;
        vs8 vs8Var;
        TreeMap treeMap;
        int i;
        Iterator it;
        Iterator it2;
        double d;
        ArrayList arrayList = this.s;
        arrayList.clear();
        TreeMap treeMap2 = this.h;
        Integer num = (Integer) CollectionsKt.V(treeMap2.keySet());
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = (Integer) CollectionsKt.e0(treeMap2.keySet());
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                int i5 = this.L;
                int i6 = i5 - 1;
                if (i6 >= iIntValue) {
                    iIntValue = i6;
                }
                int i7 = i5 + 2;
                if (i7 <= iIntValue2) {
                    iIntValue2 = i7;
                }
                intRange = new IntRange(iIntValue, iIntValue2, 1);
            } else {
                intRange = new IntRange(0, 0, 1);
            }
        } else {
            intRange = new IntRange(0, 0, 1);
        }
        int i8 = intRange.f46068a;
        int i9 = intRange.b;
        if (i8 <= i9) {
            while (true) {
                List list = (List) treeMap2.get(Integer.valueOf(i8));
                if (list != null) {
                    Iterator it3 = CollectionsKt.Q0(list, i2, i2).iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((List) it3.next()).iterator();
                        int i10 = i3;
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                q3d.p();
                                throw null;
                            }
                            vs8 vs8Var2 = (vs8) next;
                            ArrayList arrayList2 = vs8Var2.b;
                            vs8 vs8Var3 = (vs8) CollectionsKt.firstOrNull(arrayList2);
                            if (vs8Var3 == null || (vs8Var = (vs8) CollectionsKt.f0(arrayList2)) == null || vs8Var2.f37937a.c == null || (vs8Var3.f37937a.c == null && vs8Var.f37937a.c == null)) {
                                treeMap = treeMap2;
                                i = i9;
                                it = it3;
                                it2 = it4;
                            } else {
                                boolean zContains = this.p.contains(vs8Var2);
                                boolean zContains2 = this.p.contains(vs8Var3);
                                boolean zContains3 = this.p.contains(vs8Var);
                                if (zContains || (zContains2 && zContains3)) {
                                    int i12 = this.G;
                                    int i13 = this.H;
                                    if (!zContains2 && !zContains3) {
                                        Rect rect = vs8Var2.f;
                                        int i14 = rect.left;
                                        int iCenterY = rect.centerY();
                                        Rect rect2 = vs8Var2.f;
                                        arrayList.add(new st8(i14, iCenterY, (rect2.left - i13) - i12, rect2.centerY()));
                                    } else if (arrayList2.size() == i4) {
                                        Rect rect3 = vs8Var3.f;
                                        int i15 = rect3.right;
                                        int iCenterY2 = rect3.centerY();
                                        Rect rect4 = vs8Var2.f;
                                        arrayList.add(new st8(i15, iCenterY2, rect4.left, rect4.centerY()));
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        int i16 = vs8Var3.f.right + i12;
                                        int i17 = 0;
                                        for (Object obj : arrayList2) {
                                            int i18 = i17 + 1;
                                            if (i17 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            vs8 vs8Var4 = (vs8) obj;
                                            if (i17 == 0) {
                                                d = (((double) vs8Var4.e) / 2.0d) + ((double) vs8Var4.f.top);
                                            } else {
                                                float f = vs8Var4.e;
                                                Rect rect5 = vs8Var4.f;
                                                float f2 = rect5.top;
                                                d = (((double) ((rect5.bottom - f) - f2)) / 2.0d) + ((double) (f + f2));
                                            }
                                            int iF = (int) p7x.F((float) d, vs8Var2.f.exactCenterY(), vs8Var4.c);
                                            arrayList3.add(new st8(vs8Var4.f.right, iF, i16, iF));
                                            i17 = i18;
                                            i9 = i9;
                                            treeMap2 = treeMap2;
                                            it3 = it3;
                                            it4 = it4;
                                        }
                                        treeMap = treeMap2;
                                        i = i9;
                                        it = it3;
                                        it2 = it4;
                                        Rect rect6 = vs8Var2.f;
                                        int i19 = rect6.left;
                                        int iCenterY3 = rect6.centerY();
                                        Rect rect7 = vs8Var2.f;
                                        int i20 = rect7.left - i13;
                                        int iCenterY4 = rect7.centerY();
                                        st8 st8Var = new st8(i19, iCenterY3, i20, iCenterY4);
                                        st8 st8Var2 = (st8) CollectionsKt.firstOrNull(arrayList3);
                                        st8 st8Var3 = (st8) CollectionsKt.f0(arrayList3);
                                        if (st8Var2 != null && st8Var3 != null) {
                                            arrayList.add(new st8(st8Var2.c, st8Var2.d, i20, iCenterY4));
                                            arrayList.add(new st8(st8Var3.c, st8Var3.d, i20, iCenterY4));
                                        }
                                        arrayList.add(st8Var);
                                        arrayList.addAll(arrayList3);
                                    }
                                    treeMap = treeMap2;
                                    i = i9;
                                    it = it3;
                                    it2 = it4;
                                } else {
                                    treeMap = treeMap2;
                                    i = i9;
                                    it = it3;
                                    it2 = it4;
                                }
                            }
                            i10 = i11;
                            i9 = i;
                            treeMap2 = treeMap;
                            it3 = it;
                            it4 = it2;
                            i3 = 0;
                            i4 = 1;
                        }
                    }
                }
                TreeMap treeMap3 = treeMap2;
                int i21 = i9;
                if (i8 != i21) {
                    i8++;
                    i9 = i21;
                    treeMap2 = treeMap3;
                    i2 = 2;
                    i3 = 0;
                    i4 = 1;
                }
            }
        }
        List listL0 = CollectionsKt.L0(arrayList);
        et8 et8Var = this.f44840a;
        et8Var.getClass();
        listL0.getClass();
        ((hgk0) et8Var.c).setValue(listL0);
    }

    public final void c() {
        this.j = true;
        this.I = null;
        rs8 rs8Var = this.l;
        if (rs8Var != null) {
            rs8Var.c.invoke(null);
        }
    }

    public final List d(a1m0 a1m0Var, int i, int i2) {
        int i3;
        int i4;
        Map map = a1m0Var.c;
        if (i < 0) {
            return iun.f15405a;
        }
        List list = a1m0Var.f77a;
        List list2 = (List) map.get(CollectionsKt.W(i + 1, list));
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = (List) map.get(list.get(i));
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        if (list2.size() == list3.size()) {
            i3 = i2;
            i4 = i3;
        } else {
            i3 = i2 * 2;
            i4 = i3 + 1;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (Object obj : list3) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                q3d.p();
                throw null;
            }
            pab pabVar = (pab) obj;
            if (i3 <= i5 && i5 <= i4) {
                arrayList.add(new ts8(d(a1m0Var, i - 1, i5), this.b.a(pabVar.f26648a, pabVar.d), pabVar, (String) list.get(i), null));
            }
            i5 = i6;
        }
        return arrayList;
    }

    public final boolean f() {
        vs8 vs8Var;
        Rect rect;
        vs8 vs8Var2;
        Rect rect2;
        Integer numValueOf = Integer.valueOf(this.L);
        TreeMap treeMap = this.h;
        List list = (List) treeMap.get(numValueOf);
        int i = (list == null || (vs8Var2 = (vs8) CollectionsKt.firstOrNull(list)) == null || (rect2 = vs8Var2.f) == null) ? 0 : rect2.top;
        List list2 = (List) treeMap.get(Integer.valueOf(this.L + 1));
        int i2 = (list2 == null || (vs8Var = (vs8) CollectionsKt.firstOrNull(list2)) == null || (rect = vs8Var.f) == null) ? 0 : rect.top;
        if (i > i2) {
            i = i2;
        }
        return i >= this.w.top;
    }

    public final int g(int i) {
        sr8 sr8Var = (sr8) CollectionsKt.W(i, this.E);
        int i2 = sr8Var != null ? sr8Var.f32662a : 0;
        Iterator it = l1e0.o(0, i).iterator();
        while (((kkx) it).c) {
            rr8 rr8Var = (rr8) CollectionsKt.W(((bkx) it).nextInt() + 1, this.D);
            i2 += rr8Var != null ? rr8Var.f30969a : false ? this.c : this.y;
        }
        return -i2;
    }

    public final int h(float f) {
        int i = (int) f;
        float f2 = -g(i);
        rr8 rr8Var = (rr8) CollectionsKt.W(i + 1, this.D);
        return (-((int) rw2.a(f, i, rr8Var != null ? rr8Var.f30969a : false ? this.c : this.y, f2))) - ((int) this.A);
    }

    public final void i(List list) {
        int i = this.o.top;
        for (List list2 : CollectionsKt.K(list, 2)) {
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                vs8 vs8Var = (vs8) obj;
                if (i2 > 0) {
                    i += this.f;
                }
                Rect rect = vs8Var.f;
                ts8 ts8Var = vs8Var.f37937a;
                int i4 = ts8Var.b;
                int i5 = 92;
                if (i4 == 0) {
                    i4 = 92;
                }
                rect.set(rect.left, i, rect.right, i4 + i);
                int i6 = ts8Var.b;
                if (i6 != 0) {
                    i5 = i6;
                }
                i += i5;
                i2 = i3;
            }
            if (!list2.isEmpty()) {
                i += this.g;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, int i2, boolean z, boolean z2) {
        vs8 vs8VarE;
        boolean z3;
        int i3;
        List list;
        vs8 vs8Var;
        Rect rect;
        vs8 vs8Var2;
        Rect rect2;
        vs8 vs8Var3;
        vs8 vs8Var4;
        Rect rect3;
        vs8 vs8Var5;
        Rect rect4;
        boolean z4;
        float f;
        Iterator it;
        Iterator it2;
        Iterator it3;
        int iHeight;
        float fMax;
        vs8 vs8Var6;
        float f2;
        float f3 = this.A;
        float f4 = i + f3;
        this.A = f4;
        float f5 = 0.0f;
        this.A = Math.min(0.0f, Math.max(f4, -this.C));
        float f6 = this.B + i2;
        this.B = f6;
        this.B = Math.min(0.0f, f6);
        int i4 = (int) (this.A - f3);
        m();
        boolean zF = f();
        Integer numValueOf = Integer.valueOf(this.L);
        TreeMap treeMap = this.h;
        List list2 = (List) treeMap.get(numValueOf);
        vs8 vs8Var7 = list2 != null ? (vs8) CollectionsKt.firstOrNull(list2) : null;
        boolean zF2 = f();
        int i5 = this.L;
        int i6 = 1;
        if (zF2) {
            List list3 = (List) treeMap.get(Integer.valueOf(i5));
            vs8VarE = list3 != null ? (vs8) CollectionsKt.firstOrNull(list3) : null;
        } else {
            int size = treeMap.size() - 1;
            int i7 = this.L;
            if (i5 < size) {
                List list4 = (List) treeMap.get(Integer.valueOf(i7 + 1));
                if (list4 == null) {
                    list4 = iun.f15405a;
                }
                vs8VarE = e(this, list4);
            } else {
                List list5 = (List) treeMap.get(Integer.valueOf(i7));
                if (list5 == null) {
                    list5 = iun.f15405a;
                }
                vs8VarE = e(this, list5);
            }
        }
        if (vs8Var7 == null || vs8VarE == null) {
            b();
            return;
        }
        Rect rect5 = new Rect(vs8VarE.f);
        Rect rect6 = new Rect(vs8Var7.f);
        rect6.offset(i4, 0);
        int i8 = rect6.right;
        int i9 = this.G;
        int i10 = this.H;
        int i11 = 16;
        int iMax = i8 - Math.max(hne.D(i8, i9, i10, 16) - this.c, rect6.left);
        Iterator it4 = treeMap.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list6 = (List) entry.getValue();
            int i12 = i6;
            int i13 = this.L;
            if (iIntValue >= i13) {
                if (iIntValue != i13 || iIntValue >= treeMap.size() - 1) {
                    z4 = zF;
                    Iterator it5 = CollectionsKt.K(list6, 2).iterator();
                    int i14 = 0;
                    while (it5.hasNext()) {
                        List list7 = (List) it5.next();
                        Iterator it6 = list7.iterator();
                        int i15 = 0;
                        while (it6.hasNext()) {
                            Object next = it6.next();
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                q3d.p();
                                throw null;
                            }
                            vs8 vs8Var8 = (vs8) next;
                            Iterator it7 = it5;
                            vs8 vs8Var9 = (vs8) CollectionsKt.firstOrNull(vs8Var8.b);
                            int i17 = i14;
                            vs8 vs8Var10 = (vs8) CollectionsKt.f0(vs8Var8.b);
                            if (vs8Var9 == null || vs8Var10 == null) {
                                it2 = it4;
                                it3 = it6;
                                iHeight = i15 > 0 ? i17 + this.f : i17;
                            } else {
                                int i18 = vs8Var9.f.top;
                                it2 = it4;
                                it3 = it6;
                                iHeight = (int) (((((double) (vs8Var10.f.bottom - i18)) / 2.0d) + ((double) i18)) - ((double) (vs8Var8.f.height() / 2)));
                            }
                            Rect rect7 = vs8Var8.f;
                            rect7.offset(0, iHeight - rect7.top);
                            vs8Var8.c = 0.0f;
                            vs8Var8.e = i15 == 0 ? vs8Var8.f.height() : 0.0f;
                            int i19 = vs8Var8.f37937a.b;
                            if (i19 == 0) {
                                i19 = 92;
                            }
                            i14 = iHeight + i19;
                            i15 = i16;
                            it5 = it7;
                            it4 = it2;
                            it6 = it3;
                        }
                        Iterator it8 = it5;
                        int i20 = i14;
                        Iterator it9 = it4;
                        i14 = !list7.isEmpty() ? i20 + this.g : i20;
                        it5 = it8;
                        it4 = it9;
                    }
                } else {
                    if (iMax == 0) {
                        fMax = 1.0f;
                    } else {
                        int i21 = this.L;
                        int iD = hne.D(this.F, i9, i10, i11);
                        fMax = Math.max(f5, ((-this.A) - (i21 * iD)) / iD);
                    }
                    List list8 = (List) treeMap.get(Integer.valueOf(iIntValue + 1));
                    if (list8 == null) {
                        list8 = iun.f15405a;
                    }
                    i(list8);
                    i(list6);
                    Iterator it10 = CollectionsKt.Q0(list6, 2, 2).iterator();
                    while (it10.hasNext()) {
                        List list9 = (List) it10.next();
                        vs8 vs8Var11 = (vs8) CollectionsKt.firstOrNull(list9);
                        if (vs8Var11 != null && (vs8Var6 = vs8Var11.g) != null) {
                            int i22 = 0;
                            for (Object obj : list9) {
                                int i23 = i22 + 1;
                                if (i22 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                vs8 vs8Var12 = (vs8) obj;
                                boolean z5 = zF;
                                Iterator it11 = it10;
                                if (vs8Var6.b.size() == i12) {
                                    vs8Var12.c = 0.0f;
                                    vs8Var12.e = vs8Var12.f.bottom;
                                } else {
                                    Rect rect8 = this.L != this.z ? vs8Var6.f : this.I;
                                    if (rect8 == null) {
                                        rect8 = vs8Var6.f;
                                    }
                                    if (i22 == 0) {
                                        float F = p7x.F(vs8Var12.f.bottom, rect8.centerY(), fMax);
                                        int iF = (int) p7x.F(vs8Var12.f.top, rect8.centerY() - vs8Var12.d, fMax);
                                        Rect rect9 = vs8Var12.f;
                                        f2 = F;
                                        rect9.offset(0, iF - rect9.top);
                                    } else {
                                        float F2 = p7x.F(vs8Var12.f.top, rect8.centerY(), fMax);
                                        int iF2 = (int) p7x.F(vs8Var12.f.top, (rect8.centerY() + vs8Var12.d) - vs8Var12.f.height(), fMax);
                                        Rect rect10 = vs8Var12.f;
                                        f2 = F2;
                                        rect10.offset(0, iF2 - rect10.top);
                                    }
                                    vs8Var12.e = f2 - vs8Var12.f.top;
                                    vs8Var12.c = fMax;
                                }
                                it10 = it11;
                                i22 = i23;
                                zF = z5;
                                i12 = 1;
                            }
                        }
                        it10 = it10;
                        zF = zF;
                        i12 = 1;
                    }
                    z4 = zF;
                    int iB = si30.b(this.K);
                    if (iB != this.z && !this.J) {
                        rs8 rs8Var = this.l;
                        if (rs8Var != null) {
                            rs8Var.f31019a.j(Integer.valueOf(iB), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.TRUE);
                        }
                        this.z = iB;
                    }
                }
                it = it4;
                f = 0.0f;
            } else {
                z4 = zF;
                f = f5;
                it = it4;
            }
            f5 = f;
            zF = z4;
            it4 = it;
            i6 = 1;
            i11 = 16;
        }
        boolean z6 = zF;
        Rect rect11 = new Rect(rect5);
        List list10 = (List) treeMap.get(Integer.valueOf(this.L));
        int i24 = (list10 == null || (vs8Var5 = (vs8) CollectionsKt.firstOrNull(list10)) == null || (rect4 = vs8Var5.f) == null) ? 0 : rect4.top;
        List list11 = (List) treeMap.get(Integer.valueOf(this.L + 1));
        int iMin = Math.min(i24, (list11 == null || (vs8Var4 = (vs8) CollectionsKt.firstOrNull(list11)) == null || (rect3 = vs8Var4.f) == null) ? 0 : rect3.top);
        ur8 ur8Var = this.n.b;
        ur8 ur8Var2 = ur8.f36151a;
        Rect rect12 = this.o;
        if (ur8Var == ur8Var2) {
            rect11.offset(i4, i2);
            List list12 = (List) treeMap.get(Integer.valueOf(this.L));
            if (list12 != null && (vs8Var3 = (vs8) CollectionsKt.d0(list12)) != null) {
                Rect rect13 = vs8Var3.f;
            }
            List list13 = (List) treeMap.get(Integer.valueOf(this.L));
            int i25 = (list13 == null || (vs8Var2 = (vs8) CollectionsKt.f0(list13)) == null || (rect2 = vs8Var2.f) == null) ? 0 : rect2.bottom;
            z3 = true;
            List list14 = (List) treeMap.get(Integer.valueOf(this.L + 1));
            int iMax2 = Math.max(i25, (list14 == null || (vs8Var = (vs8) CollectionsKt.f0(list14)) == null || (rect = vs8Var.f) == null) ? 0 : rect.bottom);
            int iMax3 = rect11.top;
            int i26 = iMax2 + iMax3;
            int i27 = this.m - rect12.bottom;
            if (i26 <= i27) {
                iMax3 -= i26 - Math.max(i26, i27);
                rect11.top = iMax3;
            }
            int i28 = iMin + iMax3;
            if (i28 >= 0 || z6) {
                rect11.top = iMax3 - (i28 - Math.min(i28, rect12.top));
            }
        } else {
            z3 = true;
            new Rect(0, 0, i4, i2).top -= iMin - rect12.top;
        }
        Iterator it12 = treeMap.entrySet().iterator();
        while (it12.hasNext()) {
            Iterator it13 = ((List) ((Map.Entry) it12.next()).getValue()).iterator();
            while (it13.hasNext()) {
                ((vs8) it13.next()).f.offset(i4, 0);
            }
        }
        ArrayList arrayList = this.q;
        arrayList.clear();
        LinkedHashSet linkedHashSet = this.r;
        linkedHashSet.clear();
        if (this.u) {
            Function0 function0 = this.k;
            if (function0 == null || (list = (List) function0.invoke()) == null) {
                list = iun.f15405a;
            }
            this.t = list;
            i3 = 0;
            this.u = false;
        } else {
            i3 = 0;
        }
        Iterator it14 = treeMap.entrySet().iterator();
        while (it14.hasNext()) {
            Iterator it15 = CollectionsKt.K((List) ((Map.Entry) it14.next()).getValue(), 2).iterator();
            while (it15.hasNext()) {
                int i29 = i3;
                for (Object obj2 : (List) it15.next()) {
                    int i30 = i29 + 1;
                    if (i29 < 0) {
                        q3d.p();
                        throw null;
                    }
                    vs8 vs8Var13 = (vs8) obj2;
                    Rect rect14 = vs8Var13.f;
                    int i31 = rect14.left;
                    Rect rect15 = this.w;
                    if (i31 < rect15.right && rect15.left < rect14.right) {
                        linkedHashSet.add(vs8Var13);
                        List list15 = this.t;
                        pab pabVar = vs8Var13.f37937a.c;
                        boolean zL = CollectionsKt.L(list15, pabVar != null ? pabVar.f26648a : null);
                        ts8 ts8Var = vs8Var13.f37937a;
                        arrayList.add(new us8(ts8Var, new Rect(vs8Var13.f), vs8Var13.c, vs8Var13.e, vs8Var13.d, (ts8Var.c == null || !zL) ? i3 : z3, i29 == 0 ? qr8.f29196a : qr8.b));
                    }
                    i29 = i30;
                }
            }
        }
        this.p = linkedHashSet;
        ((hgk0) this.v).setValue(CollectionsKt.L0(arrayList));
        b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(float f, boolean z, boolean z2, boolean z3, boolean z4, zje zjeVar) {
        yr8 yr8Var;
        Object objB;
        if (zjeVar instanceof yr8) {
            yr8Var = (yr8) zjeVar;
            int i = yr8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yr8Var.l = i - Integer.MIN_VALUE;
            } else {
                yr8Var = new yr8(this, zjeVar);
            }
        } else {
            yr8Var = new yr8(this, zjeVar);
        }
        Object obj = yr8Var.j;
        wne wneVar = wne.f39444a;
        int i2 = yr8Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            if (f >= this.h.size()) {
                return Unit.f46060a;
            }
            m();
            float f2 = this.K;
            this.z = f > f2 ? si30.b(f2) : (int) Math.ceil(f2);
            this.j = z2;
            int iH = h(f);
            yr8Var.i = z;
            yr8Var.l = 1;
            et8 et8Var = this.f44840a;
            if (z) {
                objB = et8Var.b(iH, z3, z4, yr8Var);
                if (objB != wneVar) {
                    objB = Unit.f46060a;
                }
            } else {
                zr8 zr8Var = et8Var.b;
                if (zr8Var != null) {
                    zr8Var.a(iH, 0, true, z4);
                }
                objB = Unit.f46060a;
            }
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = yr8Var.i;
            z1x.P(obj);
        }
        if (!z) {
            this.j = true;
        }
        return Unit.f46060a;
    }

    public final void l(ts8 ts8Var) {
        ts8Var.getClass();
        vs8 vs8Var = new vs8(ts8Var);
        this.i = vs8Var;
        Collection collectionC = kotlin.collections.a.c(vs8Var);
        TreeMap treeMap = this.h;
        treeMap.clear();
        this.p.clear();
        this.q.clear();
        this.r.clear();
        this.s.clear();
        ((hgk0) this.v).setValue(iun.f15405a);
        this.w.set(0, 0, this.c, this.d);
        this.z = 0;
        int i = this.G;
        int i2 = this.F;
        this.y = i + i2 + this.H;
        int i3 = ts8Var.f;
        while (!collectionC.isEmpty()) {
            int i4 = i3 - 1;
            treeMap.put(Integer.valueOf(i3), collectionC);
            ArrayList arrayList = new ArrayList(r3d.q(collectionC, 10));
            Iterator it = collectionC.iterator();
            while (it.hasNext()) {
                arrayList.add(((vs8) it.next()).b);
            }
            collectionC = r3d.r(arrayList);
            i3 = i4;
        }
        int i5 = -g(treeMap.size() - 1);
        Rect rect = this.o;
        this.C = i5 + rect.left;
        for (Map.Entry entry : treeMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List<vs8> list = (List) entry.getValue();
            int i6 = rect.left;
            sr8 sr8Var = (sr8) CollectionsKt.W(iIntValue, this.E);
            int iG = (i6 - (sr8Var != null ? sr8Var.f32662a : 0)) - g(iIntValue);
            for (vs8 vs8Var2 : list) {
                int i7 = rect.top;
                int i8 = iG + i2;
                int i9 = vs8Var2.f37937a.b;
                if (i9 == 0) {
                    i9 = 92;
                }
                vs8Var2.f = new Rect(iG, i7, i8, i9 + i7);
            }
        }
        Iterator it2 = treeMap.entrySet().iterator();
        while (it2.hasNext()) {
            for (List list2 : CollectionsKt.K((List) ((Map.Entry) it2.next()).getValue(), 2)) {
                Iterator it3 = list2.iterator();
                if (!it3.hasNext()) {
                    itt0.a();
                    return;
                }
                int iHeight = ((vs8) it3.next()).f.height();
                while (it3.hasNext()) {
                    int iHeight2 = ((vs8) it3.next()).f.height();
                    if (iHeight > iHeight2) {
                        iHeight = iHeight2;
                    }
                }
                float size = iHeight / list2.size();
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    ((vs8) it4.next()).d = size;
                }
            }
        }
        this.A = 0.0f;
        m();
        j(g(0), 0, true, true);
    }

    public final void m() {
        Object next;
        int iIntValue;
        float fG = 0.0f;
        if (this.y != 0) {
            Iterator it = new IntRange(0, this.h.size(), 1).iterator();
            do {
                if (!((kkx) it).c) {
                    next = null;
                    break;
                }
                next = ((bkx) it).next();
            } while (g(((Number) next).intValue()) >= this.A);
            Integer num = (Integer) next;
            if (num != null && (iIntValue = num.intValue() - 1) >= 0) {
                int iG = g(iIntValue);
                fG = ((this.A - iG) / (g(num.intValue()) - iG)) + iIntValue;
            }
        }
        this.K = fG;
        this.L = (int) fG;
    }
}
