package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class kb4 implements lb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17994a;

    public final boolean equals(Object obj) {
        if (obj instanceof kb4) {
            return this.f17994a == ((kb4) obj).f17994a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17994a);
    }

    public final String toString() {
        return ua80.e(this.f17994a, "ShowLoginBySocialDialog(social=", Separators.RPAREN);
    }
}
