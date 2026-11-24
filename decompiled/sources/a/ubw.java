package a;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ubw implements ixg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35402a;
    public final ybw b;
    public int c = -1;

    public ubw(ybw ybwVar, int i) {
        this.b = ybwVar;
        this.f35402a = i;
    }

    @Override // a.ixg0
    public final int b(hsj hsjVar, wkj wkjVar, int i) {
        androidx.media3.common.b bVar;
        if (this.c == -3) {
            wkjVar.b(4);
            return -4;
        }
        if (f()) {
            int i2 = this.c;
            ybw ybwVar = this.b;
            ArrayList arrayList = ybwVar.n;
            if (!ybwVar.F()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((yaw) arrayList.get(i4)).k;
                        int length = ybwVar.v.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (ybwVar.o1[i6] && ybwVar.v[i6].v() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    String str = vtt0.f38024a;
                    if (i4 > arrayList.size() || i4 < 0) {
                        e9d0.o();
                        return 0;
                    }
                    if (i4 != 0) {
                        arrayList.subList(0, i4).clear();
                    }
                    yaw yawVar = (yaw) arrayList.get(0);
                    androidx.media3.common.b bVar2 = yawVar.d;
                    if (!bVar2.equals(ybwVar.h1)) {
                        zhl zhlVar = ybwVar.k;
                        zhlVar.a(new uq(zhlVar, new in30(1, ybwVar.b, bVar2, yawVar.e, yawVar.f, vtt0.Y(yawVar.g), -9223372036854775807L), (byte) 20));
                    }
                    ybwVar.h1 = bVar2;
                }
                if (arrayList.isEmpty() || ((yaw) arrayList.get(0)).f()) {
                    int iW = ybwVar.v[i2].w(hsjVar, wkjVar, i, ybwVar.u1);
                    if (iW == -5) {
                        androidx.media3.common.b bVarD = (androidx.media3.common.b) hsjVar.b;
                        bVarD.getClass();
                        if (i2 == ybwVar.B) {
                            int iS = n6x.s(ybwVar.v[i2].v());
                            while (i3 < arrayList.size() && ((yaw) arrayList.get(i3)).k != iS) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                bVar = ((yaw) arrayList.get(i3)).d;
                            } else {
                                bVar = ybwVar.g1;
                                bVar.getClass();
                            }
                            bVarD = bVarD.d(bVar);
                        }
                        hsjVar.b = bVarD;
                    }
                    return iW;
                }
            }
        }
        return -3;
    }

    @Override // a.ixg0
    public final void c() throws IOException {
        int i = this.c;
        ybw ybwVar = this.b;
        if (i == -2) {
            ybwVar.x();
            throw new l52(kng0.l("Unable to bind a sample queue to TrackGroup with MIME type ", ybwVar.j1.a(this.f35402a).d[0].p, Separators.DOT));
        }
        if (i == -1) {
            ybwVar.H();
            return;
        }
        if (i != -3) {
            ybwVar.H();
            xbw xbwVar = ybwVar.v[i];
            ivn ivnVar = xbwVar.h;
            if (ivnVar == null || ivnVar.e() != 1) {
                return;
            }
            xhl xhlVarC = xbwVar.h.c();
            xhlVarC.getClass();
            throw xhlVarC;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    @Override // a.ixg0
    public final int d(long j) throws Throwable {
        Object next;
        Object objL;
        if (!f()) {
            return 0;
        }
        int i = this.c;
        ybw ybwVar = this.b;
        if (ybwVar.F()) {
            return 0;
        }
        xbw xbwVar = ybwVar.v[i];
        int iQ = xbwVar.q(ybwVar.u1, j);
        ArrayList arrayList = ybwVar.n;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objL = next;
            } else {
                objL = null;
            }
        } else if (arrayList.isEmpty()) {
            objL = null;
        } else {
            objL = dw9.l(1, arrayList);
        }
        yaw yawVar = (yaw) objL;
        if (yawVar != null && !yawVar.f()) {
            iQ = Math.min(iQ, yawVar.e(i) - xbwVar.o());
        }
        xbwVar.B(iQ);
        return iQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void e() {
        x0x.A(this.c == -1);
        ybw ybwVar = this.b;
        ybwVar.x();
        ybwVar.l1.getClass();
        int[] iArr = ybwVar.l1;
        int i = this.f35402a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = ybwVar.o1;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (ybwVar.k1.contains(ybwVar.j1.a(i))) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.c = i2;
    }

    public final boolean f() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // a.ixg0
    public final boolean isReady() {
        if (this.c == -3) {
            return true;
        }
        if (!f()) {
            return false;
        }
        int i = this.c;
        ybw ybwVar = this.b;
        return !ybwVar.F() && ybwVar.v[i].s(ybwVar.u1);
    }
}
