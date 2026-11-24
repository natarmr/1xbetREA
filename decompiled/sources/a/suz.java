package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class suz implements tuz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32842a;

    public final boolean equals(Object obj) {
        if (obj instanceof suz) {
            return this.f32842a == ((suz) obj).f32842a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32842a);
    }

    public final String toString() {
        return ua80.e(this.f32842a, "OnTabSelect(currentTab=", Separators.RPAREN);
    }
}
