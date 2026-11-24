package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rl90 implements ul90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30685a;

    public static String a(String str) {
        return kng0.l("Phone(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rl90) {
            return this.f30685a.equals(((rl90) obj).f30685a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30685a.hashCode();
    }

    public final String toString() {
        return a(this.f30685a);
    }
}
