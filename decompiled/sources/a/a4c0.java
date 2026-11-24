package a;

import androidx.media3.common.MediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class a4c0 implements un30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hbj f216a;
    public final ex60 b;
    public final a1d c;
    public x860 d;

    public a4c0(hbj hbjVar, huj hujVar) {
        ex60 ex60Var = new ex60(hujVar, (byte) 13);
        a1d a1dVar = new a1d((byte) 13);
        x860 x860Var = new x860(-1, false);
        this.f216a = hbjVar;
        this.b = ex60Var;
        this.c = a1dVar;
        this.d = x860Var;
    }

    @Override // a.un30
    public final e06 b(MediaItem mediaItem) {
        mediaItem.b.getClass();
        return new b4c0(mediaItem, this.f216a, this.b, this.c.b(mediaItem), this.d, null);
    }

    @Override // a.un30
    public final un30 c(x860 x860Var) {
        x0x.G(x860Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = x860Var;
        return this;
    }
}
