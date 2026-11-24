package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class yue implements zue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43264a;
    public final String b;

    public yue(int i, String str) {
        this.f43264a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yue)) {
            return false;
        }
        yue yueVar = (yue) obj;
        return this.f43264a == yueVar.f43264a && this.b.equals(yueVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f43264a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f43264a, "ExpressBoostInfoConfiguredModel(eventsCountToBoost=", ", minCoefToBoostText=", this.b, Separators.RPAREN);
    }
}
