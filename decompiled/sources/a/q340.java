package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q340 implements mn30, ln30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn30[] f28033a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public ln30 f;
    public dcs0 g;
    public mn30[] h;
    public jld i;

    public q340(kwd kwdVar, long[] jArr, mn30... mn30VarArr) {
        this.f28033a = mn30VarArr;
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        this.i = new jld(rcf0Var, rcf0Var);
        this.c = new IdentityHashMap();
        this.h = new mn30[0];
        this.b = new boolean[mn30VarArr.length];
        for (int i = 0; i < mn30VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.f28033a[i] = new xkq0(mn30VarArr[i], j);
            }
        }
    }

    @Override // a.ggi0
    public final void a(hgi0 hgi0Var) {
        ln30 ln30Var = this.f;
        ln30Var.getClass();
        ln30Var.a(this);
    }

    @Override // a.hgi0
    public final long b() {
        return this.i.b();
    }

    @Override // a.mn30
    public final long c(long j, gvh0 gvh0Var) {
        mn30[] mn30VarArr = this.h;
        return (mn30VarArr.length > 0 ? mn30VarArr[0] : this.f28033a[0]).c(j, gvh0Var);
    }

    @Override // a.mn30
    public final long d(long j) {
        long jD = this.h[0].d(j);
        int i = 1;
        while (true) {
            mn30[] mn30VarArr = this.h;
            if (i >= mn30VarArr.length) {
                return jD;
            }
            if (mn30VarArr[i].d(jD) != jD) {
                jf4.n("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // a.hgi0
    public final boolean e() {
        return this.i.e();
    }

    @Override // a.ln30
    public final void f(mn30 mn30Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(mn30Var);
        if (arrayList.isEmpty()) {
            mn30[] mn30VarArr = this.f28033a;
            int i = 0;
            for (mn30 mn30Var2 : mn30VarArr) {
                i += mn30Var2.p().f5860a;
            }
            ccs0[] ccs0VarArr = new ccs0[i];
            int i2 = 0;
            for (int i3 = 0; i3 < mn30VarArr.length; i3++) {
                dcs0 dcs0VarP = mn30VarArr[i3].p();
                int i4 = dcs0VarP.f5860a;
                int i5 = 0;
                while (i5 < i4) {
                    ccs0 ccs0VarA = dcs0VarP.a(i5);
                    int i6 = ccs0VarA.f4128a;
                    androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        androidx.media3.common.b bVar = ccs0VarA.d[i7];
                        awq awqVarA = bVar.a();
                        String str = bVar.n;
                        mn30[] mn30VarArr2 = mn30VarArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(Separators.COLON);
                        String str2 = bVar.f45386a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb.append(str2);
                        awqVarA.f1587a = sb.toString();
                        if (str != null) {
                            awqVarA.m = dw9.m(i3, Separators.COLON, str);
                        }
                        bVarArr[i7] = new androidx.media3.common.b(awqVarA);
                        i7++;
                        mn30VarArr = mn30VarArr2;
                    }
                    mn30[] mn30VarArr3 = mn30VarArr;
                    ccs0 ccs0Var = new ccs0(i3 + Separators.COLON + ccs0VarA.b, bVarArr);
                    this.e.put(ccs0Var, ccs0VarA);
                    ccs0VarArr[i2] = ccs0Var;
                    i5++;
                    i2++;
                    mn30VarArr = mn30VarArr3;
                }
            }
            this.g = new dcs0(ccs0VarArr);
            ln30 ln30Var = this.f;
            ln30Var.getClass();
            ln30Var.f(this);
        }
    }

    @Override // a.hgi0
    public final boolean g(yq00 yq00Var) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.g(yq00Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((mn30) arrayList.get(i)).g(yq00Var);
        }
        return false;
    }

    @Override // a.mn30
    public final long h() {
        long j;
        mn30 mn30Var;
        mn30[] mn30VarArr = this.h;
        int length = mn30VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            mn30 mn30Var2 = mn30VarArr[i];
            long jH = mn30Var2.h();
            if (jH == j2) {
                j = j2;
                if (j3 != j && mn30Var2.d(j3) != j3) {
                    jf4.n("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                mn30[] mn30VarArr2 = this.h;
                int length2 = mn30VarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (mn30Var = mn30VarArr2[i2]) == mn30Var2) {
                        break;
                    }
                    if (mn30Var.d(jH) != jH) {
                        jf4.n("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = jH;
            } else {
                j = j2;
                if (jH != j3) {
                    jf4.n("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // a.mn30
    public final long j(fmo[] fmoVarArr, boolean[] zArr, ixg0[] ixg0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[fmoVarArr.length];
        int[] iArr2 = new int[fmoVarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = fmoVarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            ixg0 ixg0Var = ixg0VarArr[i2];
            Integer num = ixg0Var == null ? null : (Integer) identityHashMap.get(ixg0Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            fmo fmoVar = fmoVarArr[i2];
            if (fmoVar != null) {
                String str = fmoVar.n().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(Separators.COLON)));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = fmoVarArr.length;
        ixg0[] ixg0VarArr2 = new ixg0[length2];
        ixg0[] ixg0VarArr3 = new ixg0[fmoVarArr.length];
        fmo[] fmoVarArr2 = new fmo[fmoVarArr.length];
        mn30[] mn30VarArr = this.f28033a;
        ArrayList arrayList = new ArrayList(mn30VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < mn30VarArr.length) {
            int i4 = i;
            while (i4 < fmoVarArr.length) {
                ixg0VarArr3[i4] = iArr[i4] == i3 ? ixg0VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    fmo fmoVar2 = fmoVarArr[i4];
                    fmoVar2.getClass();
                    ccs0 ccs0Var = (ccs0) this.e.get(fmoVar2.n());
                    ccs0Var.getClass();
                    fmoVarArr2[i4] = new p340(fmoVar2, ccs0Var);
                } else {
                    fmoVarArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            mn30[] mn30VarArr2 = mn30VarArr;
            int i5 = i3;
            long j3 = mn30VarArr2[i3].j(fmoVarArr2, zArr, ixg0VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = j3;
            } else if (j3 != j2) {
                jf4.n("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < fmoVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    ixg0 ixg0Var2 = ixg0VarArr3[i6];
                    ixg0Var2.getClass();
                    ixg0VarArr2[i6] = ixg0VarArr3[i6];
                    identityHashMap.put(ixg0Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    x0x.K(ixg0VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(mn30VarArr2[i5]);
            }
            i3 = i5 + 1;
            mn30VarArr = mn30VarArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(ixg0VarArr2, i7, ixg0VarArr, i7, length2);
        this.h = (mn30[]) arrayList.toArray(new mn30[i7]);
        this.i = new jld(arrayList, x0x.j0(arrayList, new sd9((byte) 10)));
        return j2;
    }

    @Override // a.mn30
    public final void k() {
        for (mn30 mn30Var : this.f28033a) {
            mn30Var.k();
        }
    }

    @Override // a.mn30
    public final void l() {
        for (mn30 mn30Var : this.f28033a) {
            mn30Var.l();
        }
    }

    @Override // a.mn30
    public final void m(long j) {
        for (mn30 mn30Var : this.h) {
            mn30Var.m(j);
        }
    }

    @Override // a.mn30
    public final dcs0 p() {
        dcs0 dcs0Var = this.g;
        dcs0Var.getClass();
        return dcs0Var;
    }

    @Override // a.mn30
    public final void r(ln30 ln30Var, long j) {
        this.f = ln30Var;
        ArrayList arrayList = this.d;
        mn30[] mn30VarArr = this.f28033a;
        Collections.addAll(arrayList, mn30VarArr);
        for (mn30 mn30Var : mn30VarArr) {
            mn30Var.r(this, j);
        }
    }

    @Override // a.hgi0
    public final long s() {
        return this.i.s();
    }

    @Override // a.hgi0
    public final void v(long j) {
        this.i.v(j);
    }
}
