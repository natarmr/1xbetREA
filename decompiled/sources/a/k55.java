package a;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class k55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17702a;
    public final Surface b;

    /* JADX WARN: Multi-variable type inference failed */
    public k55(int i, Surface surface) {
        this.f17702a = i;
        if (surface != null) {
            this.b = surface;
        } else {
            hny.u("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k55)) {
            return false;
        }
        k55 k55Var = (k55) obj;
        return this.f17702a == k55Var.f17702a && this.b.equals(k55Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f17702a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + ((int) this.f17702a) + ", surface=" + this.b + "}";
    }
}
