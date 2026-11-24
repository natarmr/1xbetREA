package a;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tuj implements iq00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f34553a;
    public final HashSet b;
    public final lhf0 c;
    public final jbj d;
    public ibw e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public IOException k;
    public boolean l;
    public final /* synthetic */ vuj m;

    public tuj(vuj vujVar, Uri uri, String str) {
        this.m = vujVar;
        this.f34553a = uri;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add(str);
        this.c = new lhf0("DefaultHlsPlaylistTracker:MediaPlaylist", (byte) 1);
        this.d = ((hbj) vujVar.f38050a.b).d();
    }

    @Override // a.iq00
    public final void a(kq00 kq00Var, long j, long j2, int i) {
        mq80 mq80Var = (mq80) kq00Var;
        vn00 vn00Var = new vn00(mq80Var.f22211a, mq80Var.b, j);
        if (i != 0) {
            enm0 enm0Var = mq80Var.d;
            vn00Var.f = enm0Var.c;
            vn00Var.g = enm0Var.d;
            vn00Var.c = j2;
            vn00Var.d = enm0Var.b;
        }
        this.m.f.f(new wn00(vn00Var), mq80Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final Uri b() {
        ibw ibwVar = this.e;
        Uri uri = this.f34553a;
        if (ibwVar != null) {
            hbw hbwVar = ibwVar.v;
            if (hbwVar.f12792a != -9223372036854775807L || hbwVar.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                ibw ibwVar2 = this.e;
                if (ibwVar2.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ibwVar2.k + ((long) ibwVar2.r.size())));
                    ibw ibwVar3 = this.e;
                    if (ibwVar3.n != -9223372036854775807L) {
                        b4x b4xVar = ibwVar3.s;
                        int size = b4xVar.size();
                        if (!b4xVar.isEmpty() && ((dbw) g8x.H(b4xVar)).m) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                hbw hbwVar2 = this.e.v;
                if (hbwVar2.f12792a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", hbwVar2.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    public final void c(Uri uri) {
        vuj vujVar = this.m;
        lq80 lq80VarB = vujVar.b.b(vujVar.k, this.e);
        Map map = Collections.EMPTY_MAP;
        x0x.G(uri, "The uri must be set.");
        z220 z220Var = new z220(this.d, new mbj(uri, 1, null, map, 0L, -1L, 1), lq80VarB);
        xaw xawVar = vujVar.m;
        String str = null;
        if (xawVar != null && xawVar.k) {
            uuj uujVar = (uuj) vujVar.d.get(this.f34553a);
            HashSet hashSet = this.b;
            if (uujVar != null) {
                String str2 = uujVar.f36302a.d;
                if (hashSet.contains(str2)) {
                    str = str2;
                } else {
                    str = (String) g8x.D(hashSet, null);
                }
            } else {
                str = (String) g8x.D(hashSet, null);
            }
        }
        z220Var.e = str;
        mq80 mq80Var = new mq80(z220Var);
        this.c.J(mq80Var, this, vujVar.c.e(mq80Var.c));
    }

    public final void d(Uri uri) {
        this.i = 0L;
        if (this.j) {
            return;
        }
        lhf0 lhf0Var = this.c;
        if (lhf0Var.C() || ((IOException) lhf0Var.d) != null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.h;
        if (jElapsedRealtime >= j) {
            c(uri);
        } else {
            this.j = true;
            this.m.h.postDelayed(new a4e(this, uri, (byte) 17), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0283  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.io.IOException, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.net.Uri, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    public final void e(ibw ibwVar, wn00 wn00Var) {
        boolean z;
        boolean z2;
        long j;
        b4x b4xVar;
        long j2;
        long j3;
        ibw ibwVar2;
        int i;
        int i2;
        b4x b4xVar2;
        fbw fbwVar;
        int i3;
        ibw ibwVar3;
        ?? r1;
        boolean z3;
        ?? l52Var;
        int size;
        int size2;
        int size3;
        boolean z4 = ibwVar.o;
        b4x b4xVar3 = ibwVar.r;
        long j4 = ibwVar.k;
        ibw ibwVar4 = this.e;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f = jElapsedRealtime;
        vuj vujVar = this.m;
        CopyOnWriteArrayList copyOnWriteArrayList = vujVar.e;
        if (ibwVar4 != null) {
            long j5 = ibwVar4.k;
            if (j4 <= j5 && (j4 < j5 || ((size = b4xVar3.size() - ibwVar4.r.size()) == 0 ? !((size2 = ibwVar.s.size()) > (size3 = ibwVar4.s.size()) || (size2 == size3 && z4 && !ibwVar4.o)) : size <= 0))) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        b4x b4xVar4 = ibwVar.r;
        long j6 = 0;
        if (z) {
            z2 = true;
            if (ibwVar.p) {
                j = ibwVar.h;
                b4xVar = b4xVar3;
            } else {
                ibw ibwVar5 = vujVar.s;
                j = ibwVar5 != null ? ibwVar5.h : 0L;
                b4xVar = b4xVar3;
                if (ibwVar4 != null) {
                    long j7 = ibwVar4.h;
                    long j8 = ibwVar4.k;
                    b4x b4xVar5 = ibwVar4.r;
                    int size4 = b4xVar5.size();
                    j2 = j4;
                    int i4 = (int) (j2 - j8);
                    fbw fbwVar2 = i4 < b4xVar5.size() ? (fbw) b4xVar5.get(i4) : null;
                    if (fbwVar2 != null) {
                        j3 = fbwVar2.e;
                    } else if (size4 == j2 - j8) {
                        j3 = ibwVar4.u;
                    }
                    j = j7 + j3;
                }
                long j9 = j;
                if (ibwVar.i) {
                    i3 = ibwVar.j;
                } else {
                    ibwVar2 = vujVar.s;
                    if (ibwVar2 != null) {
                        i = ibwVar2.j;
                    } else {
                        i = 0;
                    }
                    if (ibwVar4 == null) {
                        i2 = (int) (j2 - ibwVar4.k);
                        b4xVar2 = ibwVar4.r;
                        if (i2 < b4xVar2.size()) {
                            fbwVar = (fbw) b4xVar2.get(i2);
                        } else {
                            fbwVar = null;
                        }
                        if (fbwVar != null) {
                            i = (ibwVar4.j + fbwVar.d) - ((fbw) b4xVar4.get(0)).d;
                        }
                    }
                    i3 = i;
                }
                r1 = 0;
                ibwVar3 = new ibw(ibwVar.d, ibwVar.f23262a, ibwVar.b, ibwVar.e, ibwVar.g, j9, true, i3, ibwVar.k, ibwVar.l, ibwVar.m, ibwVar.n, ibwVar.c, ibwVar.o, ibwVar.p, ibwVar.q, b4xVar4, ibwVar.s, ibwVar.v, ibwVar.t, ibwVar.w, ibwVar.x);
            }
            j2 = j4;
            long j10 = j;
            if (ibwVar.i) {
                i3 = ibwVar.j;
            } else {
                ibwVar2 = vujVar.s;
                if (ibwVar2 != null) {
                    i = ibwVar2.j;
                } else {
                    i = 0;
                }
                if (ibwVar4 == null) {
                    i2 = (int) (j2 - ibwVar4.k);
                    b4xVar2 = ibwVar4.r;
                    if (i2 < b4xVar2.size()) {
                        fbwVar = (fbw) b4xVar2.get(i2);
                    } else {
                        fbwVar = null;
                    }
                    if (fbwVar != null) {
                        i = (ibwVar4.j + fbwVar.d) - ((fbw) b4xVar4.get(0)).d;
                    }
                }
                i3 = i;
            }
            r1 = 0;
            ibwVar3 = new ibw(ibwVar.d, ibwVar.f23262a, ibwVar.b, ibwVar.e, ibwVar.g, j10, true, i3, ibwVar.k, ibwVar.l, ibwVar.m, ibwVar.n, ibwVar.c, ibwVar.o, ibwVar.p, ibwVar.q, b4xVar4, ibwVar.s, ibwVar.v, ibwVar.t, ibwVar.w, ibwVar.x);
        } else if (!z4) {
            z2 = true;
            b4xVar = b4xVar3;
            j2 = j4;
            ibwVar3 = ibwVar4;
            r1 = 0;
        } else if (ibwVar4.o) {
            b4xVar = b4xVar3;
            j2 = j4;
            ibwVar3 = ibwVar4;
            r1 = 0;
            z2 = true;
        } else {
            z2 = true;
            b4xVar = b4xVar3;
            ibwVar3 = new ibw(ibwVar4.d, ibwVar4.f23262a, ibwVar4.b, ibwVar4.e, ibwVar4.g, ibwVar4.h, ibwVar4.i, ibwVar4.j, ibwVar4.k, ibwVar4.l, ibwVar4.m, ibwVar4.n, ibwVar4.c, true, ibwVar4.p, ibwVar4.q, ibwVar4.r, ibwVar4.s, ibwVar4.v, ibwVar4.t, ibwVar4.w, ibwVar4.x);
            r1 = 0;
            j2 = j4;
        }
        this.e = ibwVar3;
        Uri uri = this.f34553a;
        if (ibwVar3 != ibwVar4) {
            this.k = r1;
            this.g = jElapsedRealtime;
            if (uri.equals(vujVar.t)) {
                vujVar.r = uri;
                vujVar.t = r1;
            }
            if (uri.equals(vujVar.r)) {
                if (vujVar.s == null) {
                    vujVar.u = !ibwVar3.o;
                    vujVar.v = ibwVar3.h;
                }
                vujVar.s = ibwVar3;
                vujVar.i.t(ibwVar3);
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((rbw) it.next()).a();
            }
        } else if (!ibwVar3.o) {
            long size5 = j2 + ((long) b4xVar.size());
            ibw ibwVar6 = this.e;
            if (size5 < ibwVar6.k) {
                z3 = z2;
                l52Var = new l52();
            } else {
                z3 = false;
                l52Var = ((double) (jElapsedRealtime - this.g)) > ((double) vtt0.Y(ibwVar6.m)) * 3.5d ? new l52() : r1;
            }
            if (l52Var != 0) {
                this.k = l52Var;
                y78 y78Var = new y78((Object) l52Var, z2 ? 1 : 0, (byte) 7);
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((rbw) it2.next()).f(uri, y78Var, z3);
                }
            }
        }
        ibw ibwVar7 = this.e;
        hbw hbwVar = ibwVar7.v;
        long j11 = ibwVar7.m;
        if (hbwVar.e) {
            if (ibwVar7 == ibwVar4) {
                long j12 = ibwVar7.n;
                if (j12 != -9223372036854775807L) {
                    j6 = j12 / 2;
                } else {
                    j11 /= 2;
                }
            }
            this.h = (vtt0.Y(j6) + jElapsedRealtime) - wn00Var.b;
            if (this.e.o) {
            }
            if (!uri.equals(vujVar.r) || this.l) {
                d(b());
            }
            return;
        }
        if (ibwVar7 == ibwVar4) {
            j11 /= 2;
        }
        j6 = j11;
        this.h = (vtt0.Y(j6) + jElapsedRealtime) - wn00Var.b;
        if (this.e.o) {
            if (uri.equals(vujVar.r)) {
            }
            d(b());
        }
    }

    @Override // a.iq00
    public final void n(kq00 kq00Var, long j, long j2, boolean z) {
        mq80 mq80Var = (mq80) kq00Var;
        vn00 vn00Var = new vn00(mq80Var.f22211a, mq80Var.b, j);
        enm0 enm0Var = mq80Var.d;
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = enm0Var.b;
        wn00 wn00Var = new wn00(vn00Var);
        vuj vujVar = this.m;
        vujVar.c.getClass();
        vujVar.f.b(wn00Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // a.iq00
    public final void u(kq00 kq00Var, long j, long j2) {
        mq80 mq80Var = (mq80) kq00Var;
        nbw nbwVar = (nbw) mq80Var.f;
        vn00 vn00Var = new vn00(mq80Var.f22211a, mq80Var.b, j);
        enm0 enm0Var = mq80Var.d;
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = enm0Var.b;
        wn00 wn00Var = new wn00(vn00Var);
        if (nbwVar instanceof ibw) {
            e((ibw) nbwVar, wn00Var);
            this.m.f.c(wn00Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            kq80 kq80VarB = kq80.b("Loaded playlist has unexpected type.");
            this.k = kq80VarB;
            this.m.f.e(wn00Var, 4, kq80VarB, true);
        }
        this.m.c.getClass();
    }

    @Override // a.iq00
    public final ejx w(kq00 kq00Var, long j, long j2, IOException iOException, int i) {
        mq80 mq80Var = (mq80) kq00Var;
        long j3 = mq80Var.f22211a;
        byte b = mq80Var.c;
        vn00 vn00Var = new vn00(j3, mq80Var.b, j);
        enm0 enm0Var = mq80Var.d;
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = enm0Var.b;
        wn00 wn00Var = new wn00(vn00Var);
        boolean z = true;
        boolean z2 = enm0Var.c.getQueryParameter("_HLS_msn") != null;
        boolean z3 = iOException instanceof obw;
        Uri uri = this.f34553a;
        ejx ejxVar = lhf0.f;
        vuj vujVar = this.m;
        if (z2 || z3) {
            int i2 = iOException instanceof ptw ? ((ptw) iOException).c : Integer.MAX_VALUE;
            if (z3 || i2 == 400 || i2 == 503) {
                this.h = SystemClock.elapsedRealtime();
                d(uri);
                zhl zhlVar = vujVar.f;
                String str = vtt0.f38024a;
                zhlVar.e(wn00Var, b, iOException, true);
                return ejxVar;
            }
        }
        y78 y78Var = new y78((Object) iOException, i, (byte) 7);
        Iterator it = vujVar.e.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= !((rbw) it.next()).f(uri, y78Var, false);
        }
        x860 x860Var = vujVar.c;
        if (z4) {
            long jF = x860Var.f(y78Var);
            ejxVar = jF != -9223372036854775807L ? new ejx(0, jF) : lhf0.g;
        }
        int i3 = ejxVar.f7928a;
        if (i3 != 0 && i3 != 1) {
            z = false;
        }
        vujVar.f.e(wn00Var, b, iOException, !z);
        if (!z) {
            x860Var.getClass();
        }
        return ejxVar;
    }
}
