package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pyr implements ryr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fus f27811a;

    public final boolean equals(Object obj) {
        if (obj instanceof pyr) {
            return this.f27811a.equals(((pyr) obj).f27811a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27811a.hashCode();
    }

    public final String toString() {
        return axq.i("GameTimer(value=", this.f27811a, Separators.RPAREN);
    }
}
