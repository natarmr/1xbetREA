package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fed0 implements ked0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9401a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public fed0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f9401a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fed0)) {
            return false;
        }
        fed0 fed0Var = (fed0) obj;
        return this.f9401a == fed0Var.f9401a && this.b == fed0Var.b && this.c == fed0Var.c && this.d == fed0Var.d && this.e == fed0Var.e && this.f == fed0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f9401a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("ConfigurePushSettings(pushTrackingEnabled=", ", pushTrackingChosen=", ", pushTrackingFavoriteChosen=", this.f9401a, this.b);
        ua80.u(", notificationLight=", ", enabledPushSound=", sbQ, this.c, this.d);
        return ohs0.p(", systemNotificationsEnabled=", Separators.RPAREN, sbQ, this.e, this.f);
    }
}
