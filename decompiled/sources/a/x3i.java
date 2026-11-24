package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x3i extends u3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gtj f40219a;

    public x3i(gtj gtjVar) {
        this.f40219a = gtjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3i) && this.f40219a == ((x3i) obj).f40219a;
    }

    public final int hashCode() {
        return this.f40219a.hashCode();
    }

    public final String toString() {
        return "Available(buttonState=" + this.f40219a + Separators.RPAREN;
    }
}
