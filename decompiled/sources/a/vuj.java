package a;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vuj implements iq00 {
    public static final csj w = new csj((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final psc f38050a;
    public final qbw b;
    public final x860 c;
    public zhl f;
    public lhf0 g;
    public Handler h;
    public jbw i;
    public rsj j;
    public mbw k;
    public kq80 l;
    public xaw m;
    public b4x n;
    public b4x o;
    public b4x p;
    public b4x q;
    public Uri r;
    public ibw s;
    public Uri t;
    public boolean u;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long v = -9223372036854775807L;

    public vuj(psc pscVar, x860 x860Var, qbw qbwVar) {
        this.f38050a = pscVar;
        this.b = qbwVar;
        this.c = x860Var;
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
        this.f.f(new wn00(vn00Var), mq80Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final void b(List list, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            tbw tbwVar = (tbw) list.get(i);
            uuj uujVar = new uuj(this, tbwVar, z);
            eet0 it = f4x.m(tbwVar.b.values()).iterator();
            while (it.hasNext()) {
                this.d.put((Uri) it.next(), uujVar);
            }
        }
    }

    public final ibw c(boolean z, Uri uri) {
        HashMap map = this.d;
        uuj uujVar = (uuj) map.get(uri);
        if (uujVar == null) {
            return null;
        }
        ibw ibwVarB = uujVar.b(uri);
        if (ibwVarB != null && z) {
            i(false, uri);
            uuj uujVar2 = (uuj) map.get(uri);
            uujVar2.getClass();
            HashMap map2 = uujVar2.b;
            x0x.K(map2.containsKey(uri));
            tuj tujVar = (tuj) map2.get(uri);
            tujVar.getClass();
            if (!tujVar.l) {
                x0x.K(map2.containsKey(uri));
                tuj tujVar2 = (tuj) map2.get(uri);
                tujVar2.getClass();
                tujVar2.l = true;
                ibw ibwVarB2 = uujVar2.b(uri);
                if (ibwVarB2 != null && !ibwVarB2.o) {
                    uujVar2.e(true, uri);
                }
            }
        }
        return ibwVarB;
    }

    public final b4x d(int i) {
        if (i == 0) {
            return this.n;
        }
        if (i == 1) {
            return this.o;
        }
        if (i == 2) {
            return this.p;
        }
        if (i != 3) {
            return null;
        }
        return this.q;
    }

    public final Uri e(Uri uri) {
        ebw ebwVar;
        ibw ibwVar = this.s;
        if (ibwVar == null || !ibwVar.v.e || (ebwVar = (ebw) ibwVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ebwVar.b));
        int i = ebwVar.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean f(tbw tbwVar, long j) {
        uuj uujVar = (uuj) this.d.get(tbwVar.b());
        if (uujVar == null) {
            return false;
        }
        Iterator it = uujVar.b.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= j <= ((tuj) it.next()).i;
        }
        return z;
    }

    public final boolean g(Uri uri, long j) {
        uuj uujVar = (uuj) this.d.get(uri);
        if (uujVar != null) {
            return uujVar.c(uri, j);
        }
        return false;
    }

    public final boolean h(Uri uri) {
        int i;
        uuj uujVar = (uuj) this.d.get(uri);
        if (uujVar == null) {
            return false;
        }
        HashMap map = uujVar.b;
        x0x.K(map.containsKey(uri));
        tuj tujVar = (tuj) map.get(uri);
        tujVar.getClass();
        if (tujVar.e == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, vtt0.Y(tujVar.e.u));
        ibw ibwVar = tujVar.e;
        return ibwVar.o || (i = ibwVar.d) == 2 || i == 1 || tujVar.f + jMax > jElapsedRealtime;
    }

    public final void i(boolean z, Uri uri) {
        if (uri.equals(this.r)) {
            return;
        }
        HashMap map = this.d;
        uuj uujVar = (uuj) map.get(uri);
        boolean z2 = false;
        if (uujVar != null ? uujVar.c : false) {
            ibw ibwVar = this.s;
            if (ibwVar == null || !ibwVar.o) {
                uuj uujVar2 = (uuj) map.get(uri);
                uujVar2.getClass();
                ibw ibwVarB = uujVar2.b(uri);
                if (ibwVarB != null && ibwVarB.o) {
                    z2 = true;
                }
                if (!z2 && z) {
                    uujVar2.d(uri, e(uri));
                    this.t = uri;
                    return;
                }
                this.r = uri;
                if (!z2) {
                    uujVar2.d(uri, e(uri));
                } else {
                    this.s = ibwVarB;
                    this.i.t(ibwVarB);
                }
            }
        }
    }

    public final void j(Uri uri) throws IOException {
        uuj uujVar = (uuj) this.d.get(uri);
        if (uujVar != null) {
            HashMap map = uujVar.b;
            x0x.K(map.containsKey(uri));
            tuj tujVar = (tuj) map.get(uri);
            tujVar.getClass();
            lhf0 lhf0Var = tujVar.c;
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
            IOException iOException3 = tujVar.k;
            if (iOException3 != null) {
                throw iOException3;
            }
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
        this.c.getClass();
        this.f.b(wn00Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // a.iq00
    public final void u(kq00 kq00Var, long j, long j2) {
        mbw mbwVar;
        mq80 mq80Var = (mq80) kq00Var;
        nbw nbwVar = (nbw) mq80Var.f;
        boolean z = nbwVar instanceof ibw;
        if (z) {
            String str = nbwVar.f23262a;
            mbw mbwVar2 = mbw.o;
            Uri uri = Uri.parse(str);
            awq awqVar = new awq();
            awqVar.f1587a = "0";
            awqVar.n = mg40.n("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new lbw(uri, new androidx.media3.common.b(awqVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            mbwVar = new mbw("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list, null);
        } else {
            mbwVar = (mbw) nbwVar;
        }
        this.k = mbwVar;
        grd grdVar = new grd(mbwVar);
        try {
            grdVar.d();
            this.n = (b4x) grdVar.f;
            this.o = grdVar.c(1);
            this.p = grdVar.c(2);
            this.q = grdVar.c(3);
            lbu lbuVar = this.k.n;
            if (lbuVar != null) {
                psc pscVar = this.f38050a;
                prc prcVar = new prc((Object) this, (byte) 24);
                rsj rsjVar = this.j;
                rsjVar.getClass();
                xaw xawVar = new xaw(pscVar, this, prcVar, rsjVar);
                this.m = xawVar;
                Uri uri2 = (Uri) lbuVar.b;
                String str2 = (String) lbuVar.c;
                zhl zhlVar = this.f;
                if (str2 != null) {
                    x0x.K(xawVar.h.contains(str2));
                    xawVar.l = str2;
                }
                xawVar.k = true;
                xawVar.c(-9223372036854775807L);
                jrs0 jrs0Var = xawVar.f40575a;
                hru hruVar = new hru(xawVar);
                jrs0Var.e = uri2;
                jrs0Var.f = hruVar;
                jrs0Var.g = zhlVar;
                jrs0Var.i = new q9o0(new Handler(vtt0.u(), null));
                jrs0Var.j = new lhf0("SteeringManifestTracker", (byte) 1);
                jrs0Var.f17020a = true;
                jrs0Var.g();
            }
            this.r = ((tbw) this.n.get(0)).b();
            this.e.add(new suj(this));
            b(this.n, true);
            b(this.o, false);
            b(this.p, false);
            b(this.q, false);
            vn00 vn00Var = new vn00(mq80Var.f22211a, mq80Var.b, j);
            enm0 enm0Var = mq80Var.d;
            vn00Var.f = enm0Var.c;
            vn00Var.g = enm0Var.d;
            vn00Var.c = j2;
            vn00Var.d = enm0Var.b;
            wn00 wn00Var = new wn00(vn00Var);
            uuj uujVar = (uuj) this.d.get(this.r);
            uujVar.getClass();
            if (z) {
                Uri uri3 = mq80Var.d.c;
                HashMap map = uujVar.b;
                x0x.K(map.containsKey(uri3));
                tuj tujVar = (tuj) map.get(uri3);
                tujVar.getClass();
                tujVar.e((ibw) nbwVar, wn00Var);
            } else {
                uujVar.e(false, this.r);
            }
            this.c.getClass();
            this.f.c(wn00Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (kq80 e) {
            this.l = e;
        }
    }

    @Override // a.iq00
    public final ejx w(kq00 kq00Var, long j, long j2, IOException iOException, int i) {
        mq80 mq80Var = (mq80) kq00Var;
        vn00 vn00Var = new vn00(mq80Var.f22211a, mq80Var.b, j);
        enm0 enm0Var = mq80Var.d;
        vn00Var.f = enm0Var.c;
        vn00Var.g = enm0Var.d;
        vn00Var.c = j2;
        vn00Var.d = enm0Var.b;
        wn00 wn00Var = new wn00(vn00Var);
        byte b = mq80Var.c;
        long jF = this.c.f(new y78((Object) iOException, i, (byte) 7));
        boolean z = jF == -9223372036854775807L;
        this.f.e(wn00Var, b, iOException, z);
        return z ? lhf0.g : new ejx(0, jF);
    }
}
