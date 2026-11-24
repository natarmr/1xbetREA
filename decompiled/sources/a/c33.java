package a;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class c33 implements wgu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f3653a;

    public c33(ViewConfiguration viewConfiguration) {
        this.f3653a = viewConfiguration;
    }

    @Override // a.wgu0
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // a.wgu0
    public final long b() {
        return 40L;
    }

    @Override // a.wgu0
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // a.wgu0
    public final float d() {
        return this.f3653a.getScaledMinimumFlingVelocity();
    }

    @Override // a.wgu0
    public final float e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f3653a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // a.wgu0
    public final float g() {
        return this.f3653a.getScaledMaximumFlingVelocity();
    }

    @Override // a.wgu0
    public final float h() {
        return this.f3653a.getScaledTouchSlop();
    }

    @Override // a.wgu0
    public final float i() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f3653a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
