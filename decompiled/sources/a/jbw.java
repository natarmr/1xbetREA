package a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.MediaItem;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jbw extends e06 {
    public final ruj i;
    public final psc j;
    public final kwd k;
    public final cil l;
    public final x860 m;
    public final boolean n;
    public final boolean o;
    public final vuj p;
    public final long q;
    public dn30 r;
    public rsj s;
    public MediaItem t;

    static {
        hn30.a("media3.exoplayer.hls");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jbw(MediaItem mediaItem, psc pscVar, ruj rujVar, kwd kwdVar, cil cilVar, x860 x860Var, vuj vujVar, long j, boolean z, int i) {
        this.t = mediaItem;
        this.r = mediaItem.c;
        this.j = pscVar;
        this.i = rujVar;
        this.k = kwdVar;
        this.l = cilVar;
        this.m = x860Var;
        this.p = vujVar;
        this.q = j;
        this.n = z;
        this.o = i;
    }

    public static dbw s(long j, List list) {
        dbw dbwVar = null;
        for (int i = 0; i < list.size(); i++) {
            dbw dbwVar2 = (dbw) list.get(i);
            long j2 = dbwVar2.e;
            if (j2 > j || !dbwVar2.l) {
                if (j2 > j) {
                    break;
                }
            } else {
                dbwVar = dbwVar2;
            }
        }
        return dbwVar;
    }

    @Override // a.e06
    public final mn30 a(vn30 vn30Var, lhf0 lhf0Var, long j) {
        zhl zhlVar = new zhl(this.c.c, 0, vn30Var);
        zhl zhlVar2 = new zhl(this.d.c, 0, vn30Var);
        rsj rsjVar = this.s;
        a4a0 a4a0Var = this.g;
        a4a0Var.getClass();
        return new zaw(this.i, this.p, this.j, rsjVar, this.l, zhlVar2, this.m, zhlVar, lhf0Var, this.k, this.n, this.o ? 1 : 0, a4a0Var);
    }

    @Override // a.e06
    public final synchronized MediaItem g() {
        return this.t;
    }

    @Override // a.e06
    public final void i() throws IOException {
        vuj vujVar = this.p;
        lhf0 lhf0Var = vujVar.g;
        if (lhf0Var != null) {
            IOException iOException = (IOException) lhf0Var.d;
            if (iOException != null) {
                throw iOException;
            }
            jq00 jq00Var = (jq00) lhf0Var.c;
            if (jq00Var != null) {
                int i = jq00Var.f16926a;
                IOException iOException2 = jq00Var.e;
                if (iOException2 != null && jq00Var.f > i) {
                    throw iOException2;
                }
            }
        }
        kq80 kq80Var = vujVar.l;
        if (kq80Var != null) {
            throw kq80Var;
        }
        Uri uri = vujVar.r;
        if (uri != null) {
            vujVar.j(uri);
        }
    }

    @Override // a.e06
    public final void k(rsj rsjVar) {
        this.s = rsjVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        a4a0 a4a0Var = this.g;
        a4a0Var.getClass();
        cil cilVar = this.l;
        cilVar.a(looperMyLooper, a4a0Var);
        cilVar.b();
        zhl zhlVar = new zhl(this.c.c, 0, null);
        en30 en30Var = g().b;
        en30Var.getClass();
        Uri uri = en30Var.f8073a;
        rsj rsjVar2 = this.h;
        rsjVar2.getClass();
        Handler handlerN = vtt0.n(null);
        vuj vujVar = this.p;
        vujVar.h = handlerN;
        vujVar.f = zhlVar;
        vujVar.i = this;
        vujVar.j = rsjVar2;
        Map map = Collections.EMPTY_MAP;
        x0x.G(uri, "The uri must be set.");
        mq80 mq80Var = new mq80(((hbj) vujVar.f38050a.b).d(), new mbj(uri, 1, null, map, 0L, -1L, 1), 4, vujVar.b.a());
        x0x.K(vujVar.g == null);
        lhf0 lhf0Var = new lhf0("DefaultHlsPlaylistTracker:MultivariantPlaylist", (byte) 1);
        vujVar.g = lhf0Var;
        lhf0Var.J(mq80Var, vujVar, vujVar.c.e(mq80Var.c));
    }

    @Override // a.e06
    public final void o() {
        vuj vujVar = this.p;
        HashMap map = vujVar.d;
        vujVar.r = null;
        vujVar.s = null;
        vujVar.k = null;
        xaw xawVar = vujVar.m;
        if (xawVar != null) {
            xawVar.f();
        }
        vujVar.n = null;
        vujVar.o = null;
        vujVar.p = null;
        vujVar.q = null;
        vujVar.l = null;
        vujVar.v = -9223372036854775807L;
        vujVar.g.F(null);
        vujVar.g = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((uuj) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((tuj) it2.next()).c.F(null);
            }
        }
        vujVar.h.removeCallbacksAndMessages(null);
        vujVar.h = null;
        vujVar.j = null;
        map.clear();
        this.l.release();
    }

    @Override // a.e06
    public final synchronized void r(MediaItem mediaItem) {
        this.t = mediaItem;
    }

    public final void t(ibw ibwVar) {
        long j;
        i3k0 i3k0Var;
        long jM;
        long j2;
        long jM2;
        long j3;
        boolean z = ibwVar.p;
        boolean z2 = ibwVar.g;
        b4x b4xVar = ibwVar.r;
        long j4 = ibwVar.u;
        long jM3 = ibwVar.e;
        int i = ibwVar.d;
        long j5 = ibwVar.h;
        long jY = z ? vtt0.Y(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jY : -9223372036854775807L;
        vuj vujVar = this.p;
        vujVar.k.getClass();
        gst gstVar = new gst();
        long j7 = 0;
        if (vujVar.u) {
            hbw hbwVar = ibwVar.v;
            long j8 = hbwVar.c;
            long j9 = hbwVar.d;
            long j10 = j5 - vujVar.v;
            boolean z3 = ibwVar.o;
            long j11 = z3 ? j10 + j4 : -9223372036854775807L;
            if (ibwVar.p) {
                String str = vtt0.f38024a;
                long j12 = this.q;
                jM = vtt0.M(j12 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j12) - (j5 + j4);
            } else {
                jM = 0;
            }
            long j13 = this.r.f6348a;
            if (j13 != -9223372036854775807L) {
                jM2 = vtt0.M(j13);
            } else {
                if (jM3 != -9223372036854775807L) {
                    j2 = j4 - jM3;
                } else if (j9 == -9223372036854775807L || ibwVar.n == -9223372036854775807L) {
                    j2 = j8 != -9223372036854775807L ? j8 : 3 * ibwVar.m;
                } else {
                    j2 = j9;
                }
                jM2 = j2 + jM;
            }
            long j14 = j4 + jM;
            long j15 = vtt0.j(jM2, jM, j14);
            dn30 dn30Var = g().c;
            boolean z4 = dn30Var.d == -3.4028235E38f && dn30Var.e == -3.4028235E38f && j8 == -9223372036854775807L && j9 == -9223372036854775807L;
            cn30 cn30VarA = this.r.a();
            cn30VarA.f4635a = vtt0.Y(j15);
            cn30VarA.d = z4 ? 1.0f : this.r.d;
            cn30VarA.e = z4 ? 1.0f : this.r.e;
            dn30 dn30Var2 = new dn30(cn30VarA);
            this.r = dn30Var2;
            if (jM3 == -9223372036854775807L) {
                jM3 = j14 - vtt0.M(dn30Var2.f6348a);
            }
            if (z2) {
                j7 = jM3;
            } else {
                dbw dbwVarS = s(jM3, ibwVar.s);
                if (dbwVarS != null) {
                    j3 = dbwVarS.e;
                } else if (!b4xVar.isEmpty()) {
                    fbw fbwVar = (fbw) b4xVar.get(vtt0.d(b4xVar, Long.valueOf(jM3), true));
                    dbw dbwVarS2 = s(jM3, fbwVar.m);
                    j3 = dbwVarS2 != null ? dbwVarS2.e : fbwVar.e;
                }
                j7 = j3;
            }
            i3k0Var = new i3k0(j6, jY, j11, ibwVar.u, j10, j7, true, !z3, i == 2 && ibwVar.f, gstVar, g(), this.r);
        } else {
            if (jM3 == -9223372036854775807L || b4xVar.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jM3 != j4) {
                    jM3 = ((fbw) b4xVar.get(vtt0.d(b4xVar, Long.valueOf(jM3), true))).e;
                }
                j = jM3;
            }
            long j16 = ibwVar.u;
            i3k0Var = new i3k0(j6, jY, j16, j16, 0L, j, true, false, true, gstVar, g(), null);
        }
        l(i3k0Var);
    }
}
