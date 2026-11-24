package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sdu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32049a;

    public final boolean equals(Object obj) {
        if (obj instanceof sdu0) {
            return this.f32049a.equals(((sdu0) obj).f32049a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32049a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondPlayerThirdNumber(value=", this.f32049a, Separators.RPAREN);
    }
}
