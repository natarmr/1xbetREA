package a;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class zeu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44270a;
    public boolean b;
    public weu0 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h = 1.0f;
    public int i = 0;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public zeu0(Context context) {
        this.f44270a = context;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.i == Integer.MIN_VALUE || this.g == 0.0f || !surface.isValid()) {
            return;
        }
        this.g = 0.0f;
        try {
            this.e.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e) {
            f1t0.R("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public final void b() {
        this.o = -1L;
        this.l = -1L;
        this.n = -9223372036854775807L;
        this.j = 0L;
        this.k = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    public final void c(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.i == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.d) {
            float f2 = this.f;
            if (f2 != -1.0f) {
                f = f2 * this.h;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.g != f) {
            this.g = f;
            try {
                this.e.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                f1t0.R("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }
}
