package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class can implements ean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ban f4020a;

    public can(ban banVar) {
        this.f4020a = banVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof can) && this.f4020a.equals(((can) obj).f4020a);
    }

    public final int hashCode() {
        return this.f4020a.hashCode();
    }

    public final String toString() {
        return "OneButton(button=" + this.f4020a + Separators.RPAREN;
    }
}
