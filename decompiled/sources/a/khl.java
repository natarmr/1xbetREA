package a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class khl implements dyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f18298a;

    public khl(Drawable drawable) {
        this.f18298a = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khl) && Intrinsics.d(this.f18298a, ((khl) obj).f18298a);
    }

    @Override // a.dyw
    public final int f() {
        return lut0.a(this.f18298a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f18298a.hashCode() * 31);
    }

    @Override // a.dyw
    public final int j() {
        return lut0.b(this.f18298a);
    }

    @Override // a.dyw
    public final void k(Canvas canvas) {
        this.f18298a.draw(canvas);
    }

    @Override // a.dyw
    public final boolean l() {
        return false;
    }

    @Override // a.dyw
    public final long m() {
        Drawable drawable = this.f18298a;
        long jB = ((long) lut0.b(drawable)) * 4 * ((long) lut0.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.f18298a + ", shareable=false)";
    }
}
