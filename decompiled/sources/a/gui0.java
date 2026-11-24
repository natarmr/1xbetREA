package a;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class gui0 extends jwq {
    public final Object d;
    public final f0x e;
    public Rect f;
    public final int g;
    public final int h;

    public gui0(b1x b1xVar, Size size, f0x f0xVar) {
        super(b1xVar);
        this.d = new Object();
        if (size == null) {
            this.g = this.b.j();
            this.h = this.b.f();
        } else {
            this.g = size.getWidth();
            this.h = size.getHeight();
        }
        this.e = f0xVar;
    }

    @Override // a.jwq, a.b1x
    public final f0x K0() {
        return this.e;
    }

    @Override // a.jwq, a.b1x
    public final int f() {
        return this.h;
    }

    @Override // a.jwq, a.b1x
    public final int j() {
        return this.g;
    }

    @Override // a.jwq, a.b1x
    public final Rect u0() {
        synchronized (this.d) {
            try {
                if (this.f == null) {
                    return new Rect(0, 0, this.g, this.h);
                }
                return new Rect(this.f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
