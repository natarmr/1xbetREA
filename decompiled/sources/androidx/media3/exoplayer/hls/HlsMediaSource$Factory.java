package androidx.media3.exoplayer.hls;

import a.a1d;
import a.cil;
import a.csj;
import a.e06;
import a.hbj;
import a.jbw;
import a.kwd;
import a.psc;
import a.qbw;
import a.ruj;
import a.std;
import a.un30;
import a.vuj;
import a.wti;
import a.x0x;
import a.x860;
import androidx.media3.common.MediaItem;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource$Factory implements un30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final psc f45387a;
    public ruj b;
    public kwd c;
    public final a1d i = new a1d((byte) 13);
    public final std f = new std();
    public final csj g = vuj.w;
    public x860 j = new x860(-1, false);
    public final kwd h = new kwd();
    public final boolean l = true;
    public final long m = -9223372036854775807L;
    public final boolean k = true;
    public byte e = 3;
    public boolean d = true;

    public HlsMediaSource$Factory(hbj hbjVar) {
        this.f45387a = new psc(hbjVar, (byte) 21);
    }

    @Override // a.un30
    public final void a() {
        this.d = true;
    }

    @Override // a.un30
    public final e06 b(MediaItem mediaItem) {
        mediaItem.b.getClass();
        ruj rujVar = this.b;
        if (rujVar == null) {
            rujVar = new ruj();
            rujVar.c = new kwd();
            rujVar.b = (byte) 3;
            this.b = rujVar;
        }
        ruj rujVar2 = rujVar;
        kwd kwdVar = this.c;
        if (kwdVar != null) {
            rujVar2.c = kwdVar;
        }
        rujVar2.f31131a = this.d;
        rujVar2.b = this.e;
        List list = mediaItem.b.c;
        boolean zIsEmpty = list.isEmpty();
        qbw wtiVar = this.f;
        if (!zIsEmpty) {
            wtiVar = new wti(wtiVar, list, (byte) 13);
        }
        cil cilVarB = this.i.b(mediaItem);
        x860 x860Var = this.j;
        this.g.getClass();
        psc pscVar = this.f45387a;
        return new jbw(mediaItem, pscVar, rujVar2, this.h, cilVarB, x860Var, new vuj(pscVar, x860Var, wtiVar), this.m, this.k, this.l ? 1 : 0);
    }

    @Override // a.un30
    public final un30 c(x860 x860Var) {
        x0x.G(x860Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.j = x860Var;
        return this;
    }

    @Override // a.un30
    public final void d(kwd kwdVar) {
        this.c = kwdVar;
    }

    @Override // a.un30
    public final void e() {
        this.e = (byte) 3;
    }
}
