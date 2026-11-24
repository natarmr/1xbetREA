package a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class au40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1461a;
    public TimeInterpolator c = null;
    public int d = 0;
    public int e = 1;
    public long b = 150;

    public au40(long j) {
        this.f1461a = j;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f1461a);
        objectAnimator.setDuration(this.b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.d);
        objectAnimator.setRepeatMode(this.e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : n73.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au40)) {
            return false;
        }
        au40 au40Var = (au40) obj;
        if (this.f1461a == au40Var.f1461a && this.b == au40Var.b && this.d == au40Var.d && this.e == au40Var.e) {
            return b().getClass().equals(au40Var.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1461a;
        long j2 = this.b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Separators.RETURN);
        sb.append(au40.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f1461a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return rz4.j(this.e, "}\n", sb);
    }
}
