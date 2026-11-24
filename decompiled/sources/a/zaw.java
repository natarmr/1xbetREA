package a;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zaw implements mn30, rbw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ruj f44085a;
    public final vuj b;
    public final psc c;
    public final rsj d;
    public final cil e;
    public final zhl f;
    public final x860 g;
    public final zhl h;
    public final lhf0 i;
    public final IdentityHashMap j;
    public final owp0 k;
    public final kwd l;
    public final boolean m;
    public final boolean n;
    public final a4a0 o;
    public final jru p = new jru((Object) this, (byte) 18);
    public ln30 q;
    public int r;
    public dcs0 s;
    public ybw[] t;
    public ybw[] u;
    public int v;
    public jld w;
    public final long x;

    /* JADX WARN: Multi-variable type inference failed */
    public zaw(ruj rujVar, vuj vujVar, psc pscVar, rsj rsjVar, cil cilVar, zhl zhlVar, x860 x860Var, zhl zhlVar2, lhf0 lhf0Var, kwd kwdVar, boolean z, int i, a4a0 a4a0Var) {
        this.f44085a = rujVar;
        this.b = vujVar;
        this.c = pscVar;
        this.d = rsjVar;
        this.e = cilVar;
        this.f = zhlVar;
        this.g = x860Var;
        this.h = zhlVar2;
        this.i = lhf0Var;
        this.l = kwdVar;
        this.m = z;
        this.n = i;
        this.o = a4a0Var;
        kwdVar.getClass();
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        this.w = new jld(rcf0Var, rcf0Var);
        this.j = new IdentityHashMap();
        this.k = new owp0((byte) 1);
        this.t = new ybw[0];
        this.u = new ybw[0];
        this.x = Long.MIN_VALUE;
    }

    public static androidx.media3.common.b n(androidx.media3.common.b bVar, androidx.media3.common.b bVar2, boolean z) {
        ed40 ed40Var;
        int i;
        String str;
        String str2;
        b4x b4xVar;
        int i2;
        int i3;
        String str3;
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        if (bVar2 != null) {
            str2 = bVar2.l;
            ed40Var = bVar2.m;
            i2 = bVar2.J;
            i = bVar2.e;
            i3 = bVar2.f;
            str = bVar2.d;
            str3 = bVar2.b;
            b4xVar = bVar2.c;
        } else {
            String strS = vtt0.s(1, bVar.l);
            ed40Var = bVar.m;
            if (z) {
                i2 = bVar.J;
                i = bVar.e;
                i3 = bVar.f;
                str = bVar.d;
                str3 = bVar.b;
                str2 = strS;
                b4xVar = bVar.c;
            } else {
                i = 0;
                str = null;
                str2 = strS;
                b4xVar = rcf0Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strD = mg40.d(str2);
        int i4 = z ? bVar.i : -1;
        int i5 = z ? bVar.j : -1;
        awq awqVar = new awq();
        awqVar.f1587a = bVar.f45386a;
        awqVar.b = str3;
        awqVar.c = b4x.o(b4xVar);
        awqVar.n = mg40.n(bVar.o);
        awqVar.o = mg40.n(strD);
        awqVar.k = str2;
        awqVar.l = ed40Var;
        awqVar.i = i4;
        awqVar.j = i5;
        awqVar.I = i2;
        awqVar.e = i;
        awqVar.f = i3;
        awqVar.d = str;
        return new androidx.media3.common.b(awqVar);
    }

    @Override // a.rbw
    public final void a() {
        for (ybw ybwVar : this.t) {
            lhf0 lhf0Var = ybwVar.j;
            waw wawVar = ybwVar.d;
            ArrayList arrayList = ybwVar.n;
            if (!arrayList.isEmpty()) {
                yaw yawVar = (yaw) g8x.H(arrayList);
                int iC = wawVar.c(yawVar);
                int i = yawVar.o;
                if (iC == 1) {
                    if (!yawVar.f()) {
                        x0x.K(i != -1);
                        ibw ibwVarC = wawVar.g.c(false, yawVar.m);
                        ibwVarC.getClass();
                        b4x b4xVar = ibwVarC.r;
                        int i2 = (int) (yawVar.j - ibwVarC.k);
                        yawVar.K = i2 < 0 ? 0L : ((dbw) (i2 < b4xVar.size() ? ((fbw) b4xVar.get(i2)).m : ibwVarC.s).get(i)).c;
                    }
                } else if (iC == 0) {
                    ybwVar.r.post(new llo(ybwVar, yawVar, (byte) 7));
                } else if (iC == 2 && !ybwVar.u1 && lhf0Var.C()) {
                    lhf0Var.a();
                }
            }
        }
        this.q.a(this);
    }

    @Override // a.hgi0
    public final long b() {
        return this.w.b();
    }

    @Override // a.mn30
    public final long c(long j, gvh0 gvh0Var) {
        for (ybw ybwVar : this.u) {
            if (ybwVar.A == 2) {
                waw wawVar = ybwVar.d;
                vuj vujVar = wawVar.g;
                int iD = wawVar.s.d();
                tbw[] tbwVarArr = wawVar.e;
                ibw ibwVarC = (iD >= tbwVarArr.length || iD == -1) ? null : vujVar.c(true, tbwVarArr[wawVar.s.q()].b());
                if (ibwVarC == null) {
                    break;
                }
                b4x b4xVar = ibwVarC.r;
                if (b4xVar.isEmpty()) {
                    break;
                }
                long j2 = ibwVarC.h - vujVar.v;
                long j3 = j - j2;
                int iD2 = vtt0.d(b4xVar, Long.valueOf(j3), true);
                long j4 = ((fbw) b4xVar.get(iD2)).e;
                return gvh0Var.a(j3, j4, (!ibwVarC.c || iD2 == b4xVar.size() - 1) ? j4 : ((fbw) b4xVar.get(iD2 + 1)).e) + j2;
            }
        }
        return j;
    }

    @Override // a.mn30
    public final long d(long j) throws Throwable {
        ybw[] ybwVarArr = this.u;
        if (ybwVarArr.length > 0) {
            boolean zK = ybwVarArr[0].K(false, j);
            int i = 1;
            while (true) {
                ybw[] ybwVarArr2 = this.u;
                if (i >= ybwVarArr2.length) {
                    break;
                }
                ybwVarArr2[i].K(zK, j);
                i++;
            }
            if (zK) {
                ((SparseArray) this.k.b).clear();
            }
        }
        return j;
    }

    @Override // a.hgi0
    public final boolean e() {
        return this.w.e();
    }

    @Override // a.rbw
    public final boolean f(Uri uri, y78 y78Var, boolean z) {
        int i;
        boolean z2;
        boolean zA;
        un00 un00VarC;
        int iL;
        ybw[] ybwVarArr = this.t;
        int length = ybwVarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            ybw ybwVar = ybwVarArr[i2];
            waw wawVar = ybwVar.d;
            tbw[] tbwVarArr = wawVar.e;
            HashMap map = wawVar.g.d;
            int length2 = tbwVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    tbw tbwVar = tbwVarArr[i3];
                    uuj uujVar = (uuj) map.get(uri);
                    if (tbwVar.equals(uujVar != null ? uujVar.f36302a : null)) {
                        if (z) {
                            un00VarC = null;
                        } else {
                            dmk dmkVarA = wawVar.a(uri);
                            ybwVar.i.getClass();
                            un00VarC = x860.c(dmkVarA, y78Var);
                        }
                        wawVar.p = uri;
                        if (un00VarC != null) {
                            byte b = un00VarC.f35939a;
                            xaw xawVar = wawVar.h;
                            if (xawVar == null || !xawVar.k) {
                                xawVar = null;
                            }
                            i = i2;
                            boolean z4 = false;
                            long j = un00VarC.b;
                            if (b == 1) {
                                z2 = false;
                                if (xawVar != null) {
                                    wawVar.s.e();
                                    zA = xawVar.a(j);
                                } else {
                                    uuj uujVar2 = (uuj) map.get(uri);
                                    if (uujVar2 != null) {
                                        zA = uujVar2.a(uri, j, null);
                                    }
                                }
                            } else {
                                if (b != 2) {
                                    jf4.n(twn.m(b, "Invalid fallback selection type: "));
                                    return false;
                                }
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= tbwVarArr.length) {
                                        z2 = z4;
                                        i4 = -1;
                                        break;
                                    }
                                    tbw tbwVar2 = tbwVarArr[i4];
                                    z2 = z4;
                                    uuj uujVar3 = (uuj) map.get(uri);
                                    if (tbwVar2.equals(uujVar3 != null ? uujVar3.f36302a : null)) {
                                        break;
                                    }
                                    i4++;
                                    z4 = z2;
                                }
                                if (i4 != -1 && (iL = wawVar.s.l(i4)) != -1 && wawVar.s.h(iL, j)) {
                                    uuj uujVar4 = (uuj) map.get(uri);
                                    if (uujVar4 != null ? uujVar4.a(uri, j, null) : z2) {
                                        zA = true;
                                    }
                                }
                            }
                            z3 |= zA;
                            i2 = i + 1;
                        }
                        zA = z2;
                        z3 |= zA;
                        i2 = i + 1;
                    } else {
                        i3++;
                    }
                }
                i = i2;
                z2 = false;
                zA = z2;
                z3 |= zA;
                i2 = i + 1;
            }
        }
        this.q.a(this);
        return z3;
    }

    @Override // a.hgi0
    public final boolean g(yq00 yq00Var) {
        if (this.s != null) {
            return this.w.g(yq00Var);
        }
        for (ybw ybwVar : this.t) {
            if (!ybwVar.Z) {
                xq00 xq00Var = new xq00();
                xq00Var.f41291a = ybwVar.q1;
                ybwVar.g(new yq00(xq00Var));
            }
        }
        return false;
    }

    @Override // a.mn30
    public final long h() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    public final ybw i(String str, int i, tbw[] tbwVarArr, androidx.media3.common.b[] bVarArr, androidx.media3.common.b bVar, List list, Map map, long j) {
        boolean z;
        ybw ybwVar = new ybw(str, i, this.p, new waw(this.f44085a, this.b, tbwVarArr, bVarArr, this.c, this.d, this.k, list, this.o), map, this.i, j, bVar, this.e, this.f, this.g, this.h, this.n ? 1 : 0, null);
        boolean z2 = ybwVar.u1;
        long j2 = this.x;
        if (z2) {
            long j3 = ybwVar.v1;
            if (j3 == Long.MIN_VALUE || (j2 != Long.MIN_VALUE && j2 <= j3)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        ybwVar.v1 = j2;
        if (ybwVar.Y) {
            for (xbw xbwVar : ybwVar.v) {
                xbwVar.A(j2);
            }
        }
        if (z) {
            ybwVar.u1 = false;
            ybwVar.c.a(ybwVar);
        }
        return ybwVar;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:160:0x032c  */
    /* JADX WARN: Code duplicated, block: B:199:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // a.mn30
    public final long j(fmo[] fmoVarArr, boolean[] zArr, ixg0[] ixg0VarArr, boolean[] zArr2, long j) throws Throwable {
        IdentityHashMap identityHashMap;
        Object[] objArr;
        int[] iArr;
        boolean z;
        waw wawVar;
        int i;
        int i2;
        Object[] objArr2;
        int i3;
        int[] iArr2;
        ybw[] ybwVarArr;
        ybw ybwVar;
        boolean z2;
        boolean z3;
        Object[] objArr3;
        int i4;
        int i5;
        Object[] objArr4;
        Object[] objArr5;
        int i6;
        ?? r30;
        int[] iArr3 = new int[fmoVarArr.length];
        int[] iArr4 = new int[fmoVarArr.length];
        int i7 = 0;
        while (true) {
            int length = fmoVarArr.length;
            identityHashMap = this.j;
            if (i7 >= length) {
                break;
            }
            ixg0 ixg0Var = ixg0VarArr[i7];
            iArr3[i7] = ixg0Var == null ? -1 : ((Integer) identityHashMap.get(ixg0Var)).intValue();
            iArr4[i7] = -1;
            fmo fmoVar = fmoVarArr[i7];
            if (fmoVar != null) {
                ccs0 ccs0VarN = fmoVar.n();
                int i8 = 0;
                while (true) {
                    ybw[] ybwVarArr2 = this.t;
                    if (i8 >= ybwVarArr2.length) {
                        break;
                    }
                    ybw ybwVar2 = ybwVarArr2[i8];
                    ybwVar2.x();
                    if (ybwVar2.j1.b(ccs0VarN) != -1) {
                        iArr4[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
            i7++;
        }
        identityHashMap.clear();
        int length2 = fmoVarArr.length;
        int length3 = fmoVarArr.length;
        ixg0[] ixg0VarArr2 = new ixg0[length3];
        int length4 = fmoVarArr.length;
        fmo[] fmoVarArr2 = new fmo[length4];
        boolean z4 = false;
        ybw[] ybwVarArr3 = new ybw[this.t.length];
        int i9 = length3;
        int i10 = 0;
        int i11 = 0;
        boolean z5 = false;
        Object[] objArr6 = new ixg0[length2];
        Object[] objArr7 = ixg0VarArr2;
        while (i10 < this.t.length) {
            int i12 = length2;
            ?? r7 = z4;
            Object[] objArr8 = objArr6;
            while (true) {
                objArr = objArr8;
                if (r7 >= fmoVarArr.length) {
                    break;
                }
                objArr7[r7] = iArr3[r7] == i10 ? ixg0VarArr[r7] : null;
                fmoVarArr2[r7] = iArr4[r7] == i10 ? fmoVarArr[r7] : null;
                objArr8 = objArr;
                r7++;
            }
            ybw ybwVar3 = this.t[i10];
            lhf0 lhf0Var = ybwVar3.j;
            int i13 = i10;
            waw wawVar2 = ybwVar3.d;
            tbw[] tbwVarArr = wawVar2.e;
            vuj vujVar = wawVar2.g;
            ArrayList arrayList = ybwVar3.n;
            ybwVar3.x();
            int i14 = ybwVar3.f1;
            Object[] objArr9 = objArr7;
            ?? r8 = z4;
            while (r8 < length4) {
                ubw ubwVar = (ubw) objArr9[r8];
                if (ubwVar == null || (fmoVarArr2[r8] != null && zArr[r8])) {
                    r30 = r8;
                } else {
                    r30 = r8;
                    ybwVar3.f1--;
                    if (ubwVar.c != -1) {
                        ybw ybwVar4 = ubwVar.b;
                        int i15 = ubwVar.f35402a;
                        ybwVar4.x();
                        ybwVar4.l1.getClass();
                        int i16 = ybwVar4.l1[i15];
                        if (i16 >= 0) {
                            x0x.K(ybwVar4.o1[i16]);
                            ybwVar4.o1[i16] = z4;
                        }
                        ubwVar.c = -1;
                    }
                    objArr9[r30 == true ? 1 : 0] = null;
                }
                fmoVarArr2 = fmoVarArr2;
                r8 = r30 + 1;
            }
            fmo[] fmoVarArr3 = fmoVarArr2;
            boolean z6 = true;
            if (z5) {
                iArr = iArr3;
                z = true;
            } else {
                if (ybwVar3.t1) {
                    if (i14 != 0) {
                        iArr = iArr3;
                    }
                    iArr = iArr3;
                    z = true;
                } else {
                    iArr = iArr3;
                    if (j != ybwVar3.q1) {
                        z = true;
                    }
                }
                z = z4;
            }
            fmo fmoVar2 = wawVar2.s;
            boolean z7 = z;
            fmo fmoVar3 = fmoVar2;
            ?? r9 = z4;
            while (r9 < length4) {
                ?? r31 = r9;
                fmo fmoVar4 = fmoVarArr3[r31 == true ? 1 : 0];
                if (fmoVar4 == null) {
                    i6 = length4;
                } else {
                    i6 = length4;
                    boolean z8 = z7;
                    int iB = ybwVar3.j1.b(fmoVar4.n());
                    if (iB == ybwVar3.m1) {
                        Uri uriB = tbwVarArr[wawVar2.s.q()].b();
                        uuj uujVar = (uuj) vujVar.d.get(uriB);
                        if (uujVar != null) {
                            HashMap map = uujVar.b;
                            x0x.K(map.containsKey(uriB));
                            tuj tujVar = (tuj) map.get(uriB);
                            tujVar.getClass();
                            tujVar.l = z4;
                        }
                        wawVar2.s = fmoVar4;
                        fmoVar3 = fmoVar4;
                    }
                    if (objArr9[r31 == true ? 1 : 0] == null) {
                        ybwVar3.f1++;
                        ubw ubwVar2 = new ubw(ybwVar3, iB);
                        objArr9[r31 == true ? 1 : 0] = ubwVar2;
                        zArr2[r31 == true ? 1 : 0] = z6;
                        if (ybwVar3.l1 != null) {
                            ubwVar2.e();
                            int i17 = ybwVar3.l1[iB];
                            if (z8 || i17 < 0) {
                                z7 = z8;
                            } else {
                                xbw xbwVar = ybwVar3.v[i17];
                                z7 = (xbwVar.o() == 0 || xbwVar.z(z6, j)) ? false : true;
                            }
                        } else {
                            z7 = z8;
                        }
                    } else {
                        z7 = z8;
                    }
                }
                length4 = i6;
                z4 = false;
                z6 = true;
                r9 = (r31 == true ? 1 : 0) + 1;
            }
            int i18 = length4;
            boolean z9 = z7;
            if (ybwVar3.f1 == 0) {
                Uri uriB2 = tbwVarArr[wawVar2.s.q()].b();
                uuj uujVar2 = (uuj) vujVar.d.get(uriB2);
                if (uujVar2 != null) {
                    HashMap map2 = uujVar2.b;
                    x0x.K(map2.containsKey(uriB2));
                    tuj tujVar2 = (tuj) map2.get(uriB2);
                    tujVar2.getClass();
                    tujVar2.l = false;
                }
                wawVar2.o = null;
                ybwVar3.h1 = null;
                ybwVar3.s1 = true;
                arrayList.clear();
                if (lhf0Var.C()) {
                    if (ybwVar3.Y) {
                        for (xbw xbwVar2 : ybwVar3.v) {
                            xbwVar2.j();
                        }
                    }
                    lhf0Var.a();
                } else {
                    ybwVar3.J();
                }
                wawVar = wawVar2;
                i4 = i9;
                i2 = i12;
                objArr3 = objArr;
                i3 = i13;
                z3 = z9;
                iArr2 = iArr4;
                ybwVarArr = ybwVarArr3;
                ybwVar = ybwVar3;
            } else {
                boolean z10 = true;
                if (arrayList.isEmpty() || Objects.equals(fmoVar3, fmoVar2)) {
                    wawVar = wawVar2;
                    i = i9;
                    i2 = i12;
                    objArr2 = objArr;
                    i3 = i13;
                    iArr2 = iArr4;
                    ybwVarArr = ybwVarArr3;
                    ybwVar = ybwVar3;
                } else {
                    if (ybwVar3.t1) {
                        wawVar = wawVar2;
                        i = i9;
                        i2 = i12;
                        objArr4 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        ybwVarArr = ybwVarArr3;
                        ybwVar = ybwVar3;
                    } else {
                        long j2 = j < 0 ? -j : 0L;
                        yaw yawVarD = ybwVar3.D();
                        long j3 = j2;
                        am30[] am30VarArrB = wawVar2.b(yawVarD, j);
                        wawVar = wawVar2;
                        List list = ybwVar3.o;
                        i = i9;
                        i2 = i12;
                        Object[] objArr10 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        ybwVarArr = ybwVarArr3;
                        ybwVar = ybwVar3;
                        fmo fmoVar5 = fmoVar3;
                        fmoVar5.m(j, j3, -9223372036854775807L, list, am30VarArrB);
                        if (fmoVar5.q() != wawVar.i.a(yawVarD.d)) {
                            z10 = true;
                            objArr4 = objArr10;
                        } else {
                            z10 = true;
                            objArr2 = objArr10;
                        }
                    }
                    ybwVar.s1 = z10;
                    z2 = z10;
                    z3 = z2;
                    objArr3 = objArr4;
                    if (z3) {
                        ybwVar.K(z2, j);
                        i4 = i;
                        i5 = 0;
                        while (i5 < i4) {
                            if (objArr9[i5] != null) {
                                zArr2[i5] = z10;
                            }
                            i5++;
                            z10 = true;
                        }
                    } else {
                        i4 = i;
                    }
                }
                z2 = z5;
                z3 = z9;
                objArr3 = objArr2;
                if (z3) {
                    ybwVar.K(z2, j);
                    i4 = i;
                    i5 = 0;
                    while (i5 < i4) {
                        if (objArr9[i5] != null) {
                            zArr2[i5] = z10;
                        }
                        i5++;
                        z10 = true;
                    }
                } else {
                    i4 = i;
                }
            }
            ArrayList arrayList2 = ybwVar.s;
            arrayList2.clear();
            for (int i19 = 0; i19 < i4; i19++) {
                Object obj = objArr9[i19];
                if (obj != null) {
                    arrayList2.add((ubw) obj);
                }
            }
            ybwVar.t1 = true;
            int i20 = 0;
            boolean z11 = false;
            Object[] objArr11 = objArr3;
            while (i20 < fmoVarArr.length) {
                Object obj2 = objArr9[i20];
                int i21 = i3;
                if (iArr2[i20] == i21) {
                    obj2.getClass();
                    objArr5 = objArr11;
                    objArr5[i20] = obj2;
                    identityHashMap.put(obj2, Integer.valueOf(i21));
                    z11 = true;
                } else {
                    objArr5 = objArr11;
                    if (iArr[i20] == i21) {
                        x0x.K(obj2 == null);
                    }
                }
                i20++;
                objArr11 = objArr5;
                i3 = i21;
            }
            Object[] objArr12 = objArr11;
            int i22 = i3;
            int i23 = i11;
            if (z11) {
                ybwVarArr[i23] = ybwVar;
                i11 = i23 + 1;
                if (i23 == 0) {
                    wawVar.m = true;
                    if (z3) {
                        ((SparseArray) this.k.b).clear();
                        z5 = true;
                    } else {
                        ybw[] ybwVarArr4 = this.u;
                        if (ybwVarArr4.length == 0 || ybwVar != ybwVarArr4[0]) {
                            ((SparseArray) this.k.b).clear();
                            z5 = true;
                        }
                    }
                } else {
                    wawVar.m = i22 < this.v;
                }
            }
            i10 = i22 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            ybwVarArr3 = ybwVarArr;
            objArr7 = objArr9;
            fmoVarArr2 = fmoVarArr3;
            length2 = i2;
            z4 = false;
            i9 = i4;
            objArr6 = objArr12;
            length4 = i18;
        }
        boolean z12 = z4;
        System.arraycopy(objArr6, z12 ? 1 : 0, ixg0VarArr, z12 ? 1 : 0, length2);
        ybw[] ybwVarArr5 = (ybw[]) vtt0.O(i11, ybwVarArr3);
        this.u = ybwVarArr5;
        rcf0 rcf0VarQ = b4x.q(ybwVarArr5);
        AbstractList abstractListJ0 = x0x.j0(rcf0VarQ, new sd9((byte) 7));
        this.l.getClass();
        this.w = new jld(rcf0VarQ, abstractListJ0);
        return j;
    }

    @Override // a.mn30
    public final void l() throws IOException {
        for (ybw ybwVar : this.t) {
            ybwVar.H();
            if (ybwVar.u1 && !ybwVar.Z) {
                throw kq80.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // a.mn30
    public final void m(long j) {
        for (ybw ybwVar : this.u) {
            if (ybwVar.Y && !ybwVar.F()) {
                int length = ybwVar.v.length;
                for (int i = 0; i < length; i++) {
                    ybwVar.v[i].i(ybwVar.o1[i], j);
                }
            }
        }
    }

    @Override // a.mn30
    public final dcs0 p() {
        dcs0 dcs0Var = this.s;
        dcs0Var.getClass();
        return dcs0Var;
    }

    @Override // a.mn30
    public final void r(ln30 ln30Var, long j) {
        String str;
        ruj rujVar;
        boolean z;
        Map map;
        ybw[] ybwVarArr;
        int i;
        ArrayList arrayList;
        Map map2;
        b4x b4xVar;
        ArrayList arrayList2;
        int i2;
        HashSet hashSet;
        boolean z2;
        boolean z3;
        int i3;
        List list;
        this.q = ln30Var;
        vuj vujVar = this.b;
        vujVar.e.add(this);
        mbw mbwVar = vujVar.k;
        mbwVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        b4x b4xVarD = vujVar.d(0);
        b4xVarD.getClass();
        b4x b4xVarD2 = vujVar.d(2);
        b4xVarD2.getClass();
        b4x b4xVarD3 = vujVar.d(3);
        b4xVarD3.getClass();
        boolean zIsEmpty = b4xVarD.isEmpty();
        this.r = 0;
        ArrayList arrayList3 = new ArrayList();
        ruj rujVar2 = this.f44085a;
        boolean z4 = this.m;
        if (zIsEmpty) {
            str = "ID3";
            rujVar = rujVar2;
            z = z4;
            map = map3;
        } else {
            androidx.media3.common.b bVar = mbwVar.j;
            List list2 = mbwVar.k;
            int size = b4xVarD.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < b4xVarD.size(); i6++) {
                androidx.media3.common.b bVar2 = ((tbw) b4xVarD.get(i6)).f33689a.f31957a;
                int i7 = bVar2.x;
                String str2 = bVar2.l;
                if (i7 > 0 || vtt0.s(2, str2) != null) {
                    int i8 = i5;
                    iArr[i6] = 2;
                    i4++;
                    i5 = i8;
                } else if (vtt0.s(1, str2) != null) {
                    iArr[i6] = 1;
                    i5++;
                } else {
                    iArr[i6] = -1;
                }
            }
            int i9 = i5;
            if (i4 > 0) {
                z3 = false;
                i3 = i4;
                z2 = true;
            } else if (i9 < size) {
                int i10 = size - i9;
                z2 = false;
                i3 = i10;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
                i3 = size;
            }
            tbw[] tbwVarArr = new tbw[i3];
            androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[i3];
            int i11 = 0;
            boolean z5 = z2;
            int i12 = 0;
            while (i12 < b4xVarD.size()) {
                if (z5) {
                    list = list2;
                    if (iArr[i12] == 2) {
                    }
                    i12++;
                    list2 = list;
                } else {
                    list = list2;
                }
                if (!z3 || iArr[i12] != 1) {
                    tbw tbwVar = (tbw) b4xVarD.get(i12);
                    tbwVarArr[i11] = tbwVar;
                    bVarArr[i11] = tbwVar.f33689a.f31957a;
                    i11++;
                }
                i12++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = bVarArr[0].l;
            int iR = vtt0.r(2, str3);
            int i13 = 1;
            int iR2 = vtt0.r(1, str3);
            boolean z6 = (iR2 == 1 || (iR2 == 0 && b4xVarD2.isEmpty())) && iR <= 1 && iR2 + iR > 0;
            if (z5 || iR2 <= 0) {
                i13 = 0;
            }
            rujVar = rujVar2;
            z = z4;
            ybw ybwVarI = i("main", i13, tbwVarArr, bVarArr, bVar, list3, map3, j);
            arrayList3.add(ybwVarI);
            if (z && z6) {
                ArrayList arrayList4 = new ArrayList();
                if (iR > 0) {
                    androidx.media3.common.b[] bVarArr2 = new androidx.media3.common.b[i3];
                    int i14 = 0;
                    while (i14 < i3) {
                        androidx.media3.common.b bVar3 = bVarArr[i14];
                        androidx.media3.common.b[] bVarArr3 = bVarArr;
                        Map map4 = map3;
                        String strS = vtt0.s(2, bVar3.l);
                        String strD = mg40.d(strS);
                        awq awqVar = new awq();
                        int i15 = i14;
                        awqVar.f1587a = bVar3.f45386a;
                        awqVar.b = bVar3.b;
                        awqVar.c = b4x.o(bVar3.c);
                        awqVar.n = mg40.n(bVar3.o);
                        awqVar.o = mg40.n(strD);
                        awqVar.k = strS;
                        awqVar.l = bVar3.m;
                        awqVar.i = bVar3.i;
                        awqVar.j = bVar3.j;
                        awqVar.v = bVar3.w;
                        awqVar.w = bVar3.x;
                        awqVar.a(bVar3.B);
                        awqVar.e = bVar3.e;
                        awqVar.f = bVar3.f;
                        awqVar.G = bVar3.H;
                        bVarArr2[i15] = new androidx.media3.common.b(awqVar);
                        i14 = i15 + 1;
                        bVarArr = bVarArr3;
                        map3 = map4;
                    }
                    androidx.media3.common.b[] bVarArr4 = bVarArr;
                    map = map3;
                    arrayList4.add(new ccs0("main", bVarArr2));
                    if (iR2 > 0 && (bVar != null || b4xVarD2.isEmpty())) {
                        awq awqVarA = n(bVarArr4[0], bVar, false).a();
                        awqVarA.m = "main";
                        arrayList4.add(new ccs0("main:audio", new androidx.media3.common.b(awqVarA)));
                    }
                    if (list3 != null) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            String strM = twn.m(i16, "main:cc:");
                            awq awqVarA2 = rujVar.c((androidx.media3.common.b) list3.get(i16)).a();
                            awqVarA2.m = "main";
                            arrayList4.add(new ccs0(strM, new androidx.media3.common.b(awqVarA2)));
                        }
                    }
                } else {
                    map = map3;
                    androidx.media3.common.b[] bVarArr5 = new androidx.media3.common.b[i3];
                    for (int i17 = 0; i17 < i3; i17++) {
                        bVarArr5[i17] = n(bVarArr[i17], bVar, true);
                    }
                    arrayList4.add(new ccs0("main", bVarArr5));
                }
                awq awqVar2 = new awq();
                str = "ID3";
                awqVar2.f1587a = str;
                awqVar2.o = mg40.n("application/id3");
                awqVar2.m = "main";
                ccs0 ccs0Var = new ccs0("main:id3", new androidx.media3.common.b(awqVar2));
                arrayList4.add(ccs0Var);
                ybwVarI.I((ccs0[]) arrayList4.toArray(new ccs0[0]), arrayList4.indexOf(ccs0Var));
            } else {
                map = map3;
                str = "ID3";
            }
        }
        ArrayList arrayList5 = new ArrayList(b4xVarD2.size());
        ArrayList arrayList6 = new ArrayList(b4xVarD2.size());
        HashSet hashSet2 = new HashSet();
        int i18 = 0;
        while (i18 < b4xVarD2.size()) {
            String str4 = ((tbw) b4xVarD2.get(i18)).f33689a.c;
            str4.getClass();
            if (hashSet2.add(str4)) {
                arrayList5.clear();
                arrayList6.clear();
                boolean z7 = true;
                for (int i19 = 0; i19 < b4xVarD2.size(); i19++) {
                    if (str4.equals(((tbw) b4xVarD2.get(i19)).f33689a.c)) {
                        tbw tbwVar2 = (tbw) b4xVarD2.get(i19);
                        androidx.media3.common.b bVar4 = tbwVar2.f33689a.f31957a;
                        arrayList5.add(tbwVar2);
                        arrayList6.add(bVar4);
                        z7 &= vtt0.r(1, bVar4.l) == 1;
                    }
                }
                String strConcat = "audio:".concat(str4);
                String str5 = vtt0.f38024a;
                b4x b4xVar2 = b4xVarD2;
                arrayList = arrayList6;
                map2 = map;
                b4xVar = b4xVar2;
                arrayList2 = arrayList5;
                i2 = i18;
                hashSet = hashSet2;
                ybw ybwVarI2 = i(strConcat, 1, (tbw[]) arrayList5.toArray(new tbw[0]), (androidx.media3.common.b[]) arrayList6.toArray(new androidx.media3.common.b[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(ybwVarI2);
                if (z && z7) {
                    String strConcat2 = strConcat.concat(":id3");
                    awq awqVar3 = new awq();
                    awqVar3.f1587a = str;
                    awqVar3.o = mg40.n("application/id3");
                    awqVar3.m = strConcat;
                    ybwVarI2.I(new ccs0[]{new ccs0(strConcat, (androidx.media3.common.b[]) arrayList.toArray(new androidx.media3.common.b[0])), new ccs0(strConcat2, new androidx.media3.common.b(awqVar3))}, 1);
                }
            } else {
                arrayList2 = arrayList5;
                hashSet = hashSet2;
                i2 = i18;
                map2 = map;
                b4xVar = b4xVarD2;
                arrayList = arrayList6;
            }
            i18 = i2 + 1;
            arrayList6 = arrayList;
            arrayList5 = arrayList2;
            b4xVarD2 = b4xVar;
            hashSet2 = hashSet;
            map = map2;
        }
        Map map5 = map;
        this.v = arrayList3.size();
        ArrayList arrayList7 = new ArrayList(b4xVarD3.size());
        ArrayList arrayList8 = new ArrayList(b4xVarD3.size());
        HashSet hashSet3 = new HashSet();
        int i20 = 0;
        while (i20 < b4xVarD3.size()) {
            String str6 = ((tbw) b4xVarD3.get(i20)).f33689a.c;
            str6.getClass();
            if (hashSet3.add(str6)) {
                arrayList7.clear();
                arrayList8.clear();
                for (int i21 = 0; i21 < b4xVarD3.size(); i21++) {
                    if (str6.equals(((tbw) b4xVarD3.get(i21)).f33689a.c)) {
                        tbw tbwVar3 = (tbw) b4xVarD3.get(i21);
                        arrayList7.add(tbwVar3);
                        arrayList8.add(tbwVar3.f33689a.f31957a);
                    }
                }
                String strConcat3 = "subtitle:".concat(str6);
                androidx.media3.common.b[] bVarArr6 = (androidx.media3.common.b[]) arrayList8.toArray(new androidx.media3.common.b[0]);
                String str7 = vtt0.f38024a;
                tbw[] tbwVarArr2 = (tbw[]) arrayList7.toArray(new tbw[0]);
                v3x v3xVar = b4x.b;
                i = i20;
                ybw ybwVarI3 = i(strConcat3, 3, tbwVarArr2, bVarArr6, null, rcf0.e, map5, j);
                arrayList3.add(ybwVarI3);
                int length = bVarArr6.length;
                androidx.media3.common.b[] bVarArr7 = new androidx.media3.common.b[length];
                for (int i22 = 0; i22 < length; i22++) {
                    bVarArr7[i22] = rujVar.c(bVarArr6[i22]);
                }
                ybwVarI3.I(new ccs0[]{new ccs0(strConcat3, bVarArr7)}, new int[0]);
            } else {
                i = i20;
            }
            i20 = i + 1;
        }
        ybw[] ybwVarArr2 = (ybw[]) arrayList3.toArray(new ybw[0]);
        this.t = ybwVarArr2;
        this.r = ybwVarArr2.length;
        int i23 = 0;
        while (true) {
            int i24 = this.v;
            ybwVarArr = this.t;
            if (i23 >= i24) {
                break;
            }
            ybwVarArr[i23].d.m = true;
            i23++;
        }
        for (ybw ybwVar : ybwVarArr) {
            if (!ybwVar.Z) {
                xq00 xq00Var = new xq00();
                xq00Var.f41291a = ybwVar.q1;
                ybwVar.g(new yq00(xq00Var));
            }
        }
        this.u = this.t;
    }

    @Override // a.hgi0
    public final long s() {
        return this.w.s();
    }

    @Override // a.hgi0
    public final void v(long j) {
        this.w.v(j);
    }
}
