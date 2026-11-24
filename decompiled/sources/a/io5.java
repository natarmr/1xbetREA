package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class io5 implements jo5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15103a;

    public final boolean equals(Object obj) {
        if (obj instanceof io5) {
            return this.f15103a.equals(((io5) obj).f15103a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15103a.hashCode();
    }

    public final String toString() {
        return kng0.l("BallTextUiModel(value=", this.f15103a, Separators.RPAREN);
    }
}
