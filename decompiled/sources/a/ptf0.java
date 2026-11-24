package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ptf0 implements qtf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a640 f27562a;

    public ptf0(a640 a640Var) {
        this.f27562a = a640Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ptf0) && this.f27562a.equals(((ptf0) obj).f27562a);
    }

    public final int hashCode() {
        return this.f27562a.hashCode();
    }

    public final String toString() {
        return "Success(messageModel=" + this.f27562a + Separators.RPAREN;
    }
}
