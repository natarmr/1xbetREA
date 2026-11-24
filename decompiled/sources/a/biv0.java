package a;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class biv0 extends civ0 {
    public final WindowInsetsAnimation e;

    public biv0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // a.civ0
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // a.civ0
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // a.civ0
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // a.civ0
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // a.civ0
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
