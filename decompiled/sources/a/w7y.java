package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w7y implements y7y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jpr0 f38695a;

    public w7y(jpr0 jpr0Var) {
        this.f38695a = jpr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7y) && this.f38695a.equals(((w7y) obj).f38695a);
    }

    public final int hashCode() {
        return this.f38695a.hashCode();
    }

    public final String toString() {
        return "Error(headerModel=" + this.f38695a + Separators.RPAREN;
    }
}
