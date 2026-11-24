package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tkk implements wkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkk f34099a;

    public final boolean equals(Object obj) {
        if (obj instanceof tkk) {
            return this.f34099a.equals(((tkk) obj).f34099a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34099a.hashCode();
    }

    public final String toString() {
        return "SecondPlayerRoll(value=" + this.f34099a + Separators.RPAREN;
    }
}
