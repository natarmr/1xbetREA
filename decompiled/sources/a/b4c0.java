package a;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.MediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class b4c0 extends e06 {
    public final hbj i;
    public final ex60 j;
    public final cil k;
    public final x860 l;
    public final androidx.media3.common.b m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public rsj s;
    public MediaItem t;

    public b4c0(MediaItem mediaItem, hbj hbjVar, ex60 ex60Var, cil cilVar, x860 x860Var, androidx.media3.common.b bVar) {
        this.t = mediaItem;
        this.i = hbjVar;
        this.j = ex60Var;
        this.k = cilVar;
        this.l = x860Var;
        this.m = bVar;
    }

    @Override // a.e06
    public final mn30 a(vn30 vn30Var, lhf0 lhf0Var, long j) {
        jbj jbjVarD = this.i.d();
        rsj rsjVar = this.s;
        if (rsjVar != null) {
            jbjVarD.c(rsjVar);
        }
        en30 en30Var = g().b;
        en30Var.getClass();
        Uri uri = en30Var.f8073a;
        this.g.getClass();
        int i = 0;
        return new y3c0(uri, jbjVarD, new oif0((iuo) this.j.b), this.k, new zhl(this.d.c, i, vn30Var), this.l, new zhl(this.c.c, i, vn30Var), this, lhf0Var, this.m, vtt0.M(en30Var.e), null);
    }

    @Override // a.e06
    public final synchronized MediaItem g() {
        return this.t;
    }

    @Override // a.e06
    public final void k(rsj rsjVar) {
        this.s = rsjVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        a4a0 a4a0Var = this.g;
        a4a0Var.getClass();
        cil cilVar = this.k;
        cilVar.a(looperMyLooper, a4a0Var);
        cilVar.b();
        s();
    }

    @Override // a.e06
    public final void m(mn30 mn30Var) {
        y3c0 y3c0Var = (y3c0) mn30Var;
        if (y3c0Var.x) {
            for (hxg0 hxg0Var : y3c0Var.u) {
                hxg0Var.j();
                ivn ivnVar = hxg0Var.h;
                if (ivnVar != null) {
                    ivnVar.m(hxg0Var.e);
                    hxg0Var.h = null;
                    hxg0Var.g = null;
                }
            }
        }
        y3c0Var.l.F(y3c0Var);
        y3c0Var.q.removeCallbacksAndMessages(null);
        y3c0Var.r = null;
        y3c0Var.t1 = true;
    }

    @Override // a.e06
    public final void o() {
        this.k.release();
    }

    @Override // a.e06
    public final synchronized void r(MediaItem mediaItem) {
        this.t = mediaItem;
    }

    public final void s() {
        long j = this.o;
        boolean z = this.p;
        boolean z2 = this.q;
        MediaItem mediaItemG = g();
        bmq0 i3k0Var = new i3k0(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, mediaItemG, z2 ? mediaItemG.c : null);
        if (this.n) {
            i3k0Var = new z3c0(i3k0Var);
        }
        l(i3k0Var);
    }

    public final void t(long j, fvh0 fvh0Var, boolean z) {
        if (this.r && fvh0Var.a()) {
            return;
        }
        this.r = !fvh0Var.a();
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean zD = fvh0Var.d();
        if (!this.n && this.o == j && this.p == zD && this.q == z) {
            return;
        }
        this.o = j;
        this.p = zD;
        this.q = z;
        this.n = false;
        s();
    }
}
