package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z3i extends u3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gtj f43719a;

    public z3i(gtj gtjVar) {
        this.f43719a = gtjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3i) && this.f43719a == ((z3i) obj).f43719a;
    }

    public final int hashCode() {
        return this.f43719a.hashCode();
    }

    public final String toString() {
        return "Available(buttonState=" + this.f43719a + Separators.RPAREN;
    }
}
