package a;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class waw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ruj f38848a;
    public final jbj b;
    public final jbj c;
    public final owp0 d;
    public final tbw[] e;
    public final androidx.media3.common.b[] f;
    public final vuj g;
    public final xaw h;
    public final ccs0 i;
    public final List j;
    public final a4a0 l;
    public boolean m;
    public lb6 o;
    public Uri p;
    public Uri q;
    public boolean r;
    public fmo s;
    public final uyn k = new uyn();
    public byte[] n = vtt0.b;
    public long t = -9223372036854775807L;

    public waw(ruj rujVar, vuj vujVar, tbw[] tbwVarArr, androidx.media3.common.b[] bVarArr, psc pscVar, rsj rsjVar, owp0 owp0Var, List list, a4a0 a4a0Var) {
        this.f38848a = rujVar;
        this.g = vujVar;
        this.h = vujVar.m;
        this.e = tbwVarArr;
        this.f = bVarArr;
        this.d = owp0Var;
        this.j = list;
        this.l = a4a0Var;
        hbj hbjVar = (hbj) pscVar.b;
        jbj jbjVarD = hbjVar.d();
        this.b = jbjVarD;
        if (rsjVar != null) {
            jbjVarD.c(rsjVar);
        }
        this.c = hbjVar.d();
        this.i = new ccs0("", bVarArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < tbwVarArr.length; i2++) {
            if ((bVarArr[i2].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        ccs0 ccs0Var = this.i;
        int[] iArrM0 = n6x.m0(arrayList);
        uaw uawVar = new uaw(0, ccs0Var, iArrM0);
        androidx.media3.common.b bVar = ccs0Var.d[iArrM0[0]];
        while (i < uawVar.b) {
            if (uawVar.d[i] == bVar) {
                uawVar.h = i;
                this.s = uawVar;
            }
            i++;
        }
        i = -1;
        uawVar.h = i;
        this.s = uawVar;
    }

    public static vaw f(ibw ibwVar, long j, int i) {
        long j2 = ibwVar.k;
        b4x b4xVar = ibwVar.s;
        int i2 = (int) (j - j2);
        b4x b4xVar2 = ibwVar.r;
        if (i2 == b4xVar2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < b4xVar.size()) {
                return new vaw((gbw) b4xVar.get(i), j, i);
            }
            return null;
        }
        fbw fbwVar = (fbw) b4xVar2.get(i2);
        if (i == -1) {
            return new vaw(fbwVar, j, -1);
        }
        if (i < fbwVar.m.size()) {
            return new vaw((gbw) fbwVar.m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < b4xVar2.size()) {
            return new vaw((gbw) b4xVar2.get(i3), j + 1, -1);
        }
        if (b4xVar.isEmpty()) {
            return null;
        }
        return new vaw((gbw) b4xVar.get(0), j + 1, 0);
    }

    public final dmk a(Uri uri) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        vuj vujVar = this.g;
        uuj uujVar = (uuj) vujVar.d.get(uri);
        tbw tbwVar = uujVar != null ? uujVar.f36302a : null;
        tbwVar.getClass();
        HashMap map = tbwVar.b;
        int size = map.size();
        eet0 it = f4x.m(map.values()).iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if (vujVar.g((Uri) it.next(), jElapsedRealtime)) {
                i++;
            }
        }
        int length = this.s.length();
        xaw xawVar = this.h;
        if (xawVar != null && xawVar.k) {
            z = true;
        }
        boolean z2 = z;
        return new dmk(z2, size, i, length, d(z2, jElapsedRealtime));
    }

    public final am30[] b(yaw yawVar, long j) {
        List listUnmodifiableList;
        waw wawVar = this;
        yaw yawVar2 = yawVar;
        int iA = yawVar2 == null ? -1 : wawVar.i.a(yawVar2.d);
        int length = wawVar.s.length();
        am30[] am30VarArr = new am30[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iG = wawVar.s.g(i);
            Uri uriB = wawVar.e[iG].b();
            vuj vujVar = wawVar.g;
            if (vujVar.h(uriB)) {
                ibw ibwVarC = vujVar.c(z, uriB);
                ibwVarC.getClass();
                long j2 = ibwVarC.h - vujVar.v;
                Pair pairE = wawVar.e(yawVar2, iG != iA ? true : z, ibwVarC, j2, j);
                long jLongValue = ((Long) pairE.first).longValue();
                int iIntValue = ((Integer) pairE.second).intValue();
                long j3 = ibwVarC.k;
                b4x b4xVar = ibwVarC.s;
                b4x b4xVar2 = ibwVarC.r;
                int i2 = (int) (jLongValue - j3);
                if (i2 < 0 || b4xVar2.size() < i2) {
                    v3x v3xVar = b4x.b;
                    listUnmodifiableList = rcf0.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < b4xVar2.size()) {
                        if (iIntValue != -1) {
                            fbw fbwVar = (fbw) b4xVar2.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(fbwVar);
                            } else if (iIntValue < fbwVar.m.size()) {
                                b4x b4xVar3 = fbwVar.m;
                                arrayList.addAll(b4xVar3.subList(iIntValue, b4xVar3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(b4xVar2.subList(i2, b4xVar2.size()));
                        iIntValue = 0;
                    }
                    if (ibwVarC.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < b4xVar.size()) {
                            arrayList.addAll(b4xVar.subList(iIntValue, b4xVar.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                am30VarArr[i] = new taw(j2, listUnmodifiableList);
            } else {
                am30VarArr[i] = am30.v0;
            }
            i++;
            wawVar = this;
            yawVar2 = yawVar;
            z = false;
        }
        return am30VarArr;
    }

    public final int c(yaw yawVar) {
        int i = yawVar.o;
        if (i == -1) {
            return 1;
        }
        ibw ibwVarC = this.g.c(false, yawVar.m);
        ibwVarC.getClass();
        b4x b4xVar = ibwVarC.r;
        int i2 = (int) (yawVar.j - ibwVarC.k);
        if (i2 < 0) {
            return 1;
        }
        b4x b4xVar2 = i2 < b4xVar.size() ? ((fbw) b4xVar.get(i2)).m : ibwVarC.s;
        if (i >= b4xVar2.size()) {
            return 2;
        }
        dbw dbwVar = (dbw) b4xVar2.get(i);
        if (dbwVar.m) {
            return 0;
        }
        return Objects.equals(Uri.parse(msm0.o(ibwVarC.f23262a, dbwVar.f11032a)), yawVar.b.f21512a) ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    public final int d(boolean z, long j) {
        fmo fmoVar = this.s;
        int length = fmoVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int iG = fmoVar.g(i2);
            tbw[] tbwVarArr = this.e;
            vuj vujVar = this.g;
            if (z) {
                if (fmoVar.c(i2, j) || vujVar.g(tbwVarArr[iG].b(), j)) {
                    i++;
                }
            } else if (fmoVar.c(i2, j) || vujVar.f(tbwVarArr[iG], j)) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    public final Pair e(yaw yawVar, boolean z, ibw ibwVar, long j, long j2) {
        int i;
        b4x b4xVar;
        boolean z2 = true;
        if (yawVar != null) {
            long j3 = yawVar.j;
            int i2 = yawVar.o;
            if (!z) {
                if (!yawVar.H) {
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i2));
                }
                if (i2 == -1) {
                    j3 = j3 != -1 ? j3 + 1 : -1L;
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
            }
        }
        long j4 = ibwVar.u;
        long j5 = ibwVar.k;
        b4x b4xVar2 = ibwVar.s;
        b4x b4xVar3 = ibwVar.r;
        long j6 = j + j4;
        long j7 = (yawVar == null || this.r) ? j2 : yawVar.g;
        if (!ibwVar.o && j7 >= j6) {
            return new Pair(Long.valueOf(j5 + ((long) b4xVar3.size())), -1);
        }
        long j8 = j7 - j;
        Long lValueOf = Long.valueOf(j8);
        vuj vujVar = this.g;
        if (vujVar.u && yawVar != null) {
            z2 = false;
        }
        int iD = vtt0.d(b4xVar3, lValueOf, z2);
        long j9 = ((long) iD) + j5;
        if (!vujVar.u) {
            return new Pair(Long.valueOf(j9), -1);
        }
        if (iD < 0) {
            i = -1;
        } else {
            if (b4xVar3.isEmpty()) {
                b4xVar = b4xVar2;
            } else {
                fbw fbwVar = (fbw) b4xVar3.get(iD);
                if (j8 < fbwVar.e + fbwVar.c) {
                    b4xVar = fbwVar.m;
                } else {
                    b4xVar = b4xVar2;
                }
            }
            for (int i3 = 0; i3 < b4xVar.size(); i3++) {
                dbw dbwVar = (dbw) b4xVar.get(i3);
                if (j8 < dbwVar.e + dbwVar.c) {
                    if (dbwVar.l) {
                        j9 += (b4xVar != b4xVar2 || b4xVar3.isEmpty()) ? 0L : 1L;
                        i = i3;
                    }
                }
            }
            i = -1;
        }
        return new Pair(Long.valueOf(j9), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final saw g(Uri uri, int i, boolean z) {
        icr icrVar = (icr) this.k.f36498a;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) icrVar.remove(uri);
        if (bArr != null) {
            return null;
        }
        mbj mbjVar = new mbj(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, 1);
        androidx.media3.common.b bVar = this.f[i];
        int iS = this.s.s();
        Object objJ = this.s.j();
        byte[] bArr2 = this.n;
        saw sawVar = new saw(this.c, mbjVar, 3, bVar, iS, objJ, -9223372036854775807L, -9223372036854775807L, null);
        if (bArr2 == null) {
            bArr2 = vtt0.b;
        }
        sawVar.j = bArr2;
        return sawVar;
    }
}
