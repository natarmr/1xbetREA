package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v7y implements y7y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jpr0 f36953a;

    public v7y(jpr0 jpr0Var) {
        this.f36953a = jpr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7y) && this.f36953a.equals(((v7y) obj).f36953a);
    }

    public final int hashCode() {
        return this.f36953a.hashCode();
    }

    public final String toString() {
        return "Content(headerModel=" + this.f36953a + Separators.RPAREN;
    }
}
