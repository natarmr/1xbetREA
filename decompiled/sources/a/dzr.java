package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dzr implements hzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f6953a;

    public final boolean equals(Object obj) {
        if (obj instanceof dzr) {
            return this.f6953a.equals(((dzr) obj).f6953a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6953a.hashCode();
    }

    public final String toString() {
        return "Score(value=" + ((Object) this.f6953a) + Separators.RPAREN;
    }
}
