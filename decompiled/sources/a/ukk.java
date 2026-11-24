package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ukk implements wkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okk f35830a;

    public final boolean equals(Object obj) {
        if (obj instanceof ukk) {
            return this.f35830a.equals(((ukk) obj).f35830a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35830a.hashCode();
    }

    public final String toString() {
        return "Status(value=" + this.f35830a + Separators.RPAREN;
    }
}
