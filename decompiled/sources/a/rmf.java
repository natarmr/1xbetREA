package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rmf implements vmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa30 f30741a;

    public final boolean equals(Object obj) {
        if (obj instanceof rmf) {
            return this.f30741a.equals(((rmf) obj).f30741a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30741a.hashCode();
    }

    public final String toString() {
        return "SendGameMatchInfoGameSideEffect(value=" + this.f30741a + Separators.RPAREN;
    }
}
