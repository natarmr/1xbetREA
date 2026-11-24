package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pfg0 implements rfg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26904a;

    public final boolean equals(Object obj) {
        if (obj instanceof pfg0) {
            return this.f26904a == ((pfg0) obj).f26904a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26904a);
    }

    public final String toString() {
        return ua80.e(this.f26904a, "NewValue(value=", Separators.RPAREN);
    }
}
