package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ron0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zj f30848a;
    public final int b;
    public final bpn0 c;
    public final Interpolator d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ron0(DecelerateInterpolator decelerateInterpolator, int i) {
        int i2;
        zj zjVar = zj.b;
        if ((i & 2) != 0) {
            pek pekVar = ven.b;
            i2 = Response.BUSY_EVERYWHERE;
        } else {
            i2 = Response.BAD_REQUEST;
        }
        this(zjVar, i2, bpn0.f2993a, (i & 8) != 0 ? new AccelerateInterpolator() : decelerateInterpolator);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ron0)) {
            return false;
        }
        ron0 ron0Var = (ron0) obj;
        return this.f30848a == ron0Var.f30848a && this.b == ron0Var.b && this.c == ron0Var.c && Intrinsics.d(this.d, ron0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, this.f30848a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SwipeAnimationSetting(actionType=" + this.f30848a + ", duration=" + this.b + ", swipeType=" + this.c + ", interpolator=" + this.d + Separators.RPAREN;
    }

    public ron0(zj zjVar, int i, bpn0 bpn0Var, Interpolator interpolator) {
        zjVar.getClass();
        interpolator.getClass();
        this.f30848a = zjVar;
        this.b = i;
        this.c = bpn0Var;
        this.d = interpolator;
    }
}
