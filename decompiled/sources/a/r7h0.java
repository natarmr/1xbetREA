package a;

/* JADX INFO: loaded from: classes.dex */
public final class r7h0 implements kzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kzw f29975a;
    public final Object b = new Object();
    public boolean c;
    public lzw d;

    public r7h0(kzw kzwVar) {
        this.f29975a = kzwVar;
    }

    @Override // a.kzw
    public final void a(long j, lzw lzwVar) {
        synchronized (this.b) {
            this.c = true;
            this.d = lzwVar;
        }
        kzw kzwVar = this.f29975a;
        if (kzwVar != null) {
            kzwVar.a(j, new ex60(this, (byte) 22));
        } else {
            l8x.X("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        synchronized (this.b) {
            try {
                if (this.c) {
                    kzw kzwVar = this.f29975a;
                    if (kzwVar != null) {
                        kzwVar.clear();
                    } else {
                        l8x.X("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    l8x.E0("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                lzw lzwVar = this.d;
                if (lzwVar != null) {
                    lzwVar.g();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.kzw
    public final void clear() {
        b();
    }
}
