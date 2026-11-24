package a;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class i63 implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14222a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i63(Object obj, byte b) {
        this.f14222a = b;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        byte b = this.f14222a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((l63) obj).invalidateSelf();
                break;
            default:
                drawable.getClass();
                lhl lhlVar = (lhl) obj;
                pz40 pz40Var = lhlVar.g;
                ((hgk0) pz40Var).setValue(Integer.valueOf(((Number) ((hgk0) pz40Var).getValue()).intValue() + 1));
                Drawable drawable2 = lhlVar.f;
                a8z a8zVar = mhl.f21799a;
                ((hgk0) lhlVar.h).setValue(new h7k0((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : p7x.n(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f14222a) {
            case 0:
                ((l63) this.b).scheduleSelf(runnable, j);
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) mhl.f21799a.getValue()).postAtTime(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f14222a) {
            case 0:
                ((l63) this.b).unscheduleSelf(runnable);
                break;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) mhl.f21799a.getValue()).removeCallbacks(runnable);
                break;
        }
    }
}
