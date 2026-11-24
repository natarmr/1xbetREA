package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ipg0 implements mpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uog0 f15162a;

    public final boolean equals(Object obj) {
        if (obj instanceof ipg0) {
            return this.f15162a.equals(((ipg0) obj).f15162a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15162a.hashCode();
    }

    public final String toString() {
        return "SecondPlayerCounterfoilParams(value=" + this.f15162a + Separators.RPAREN;
    }
}
