package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cr5 implements dr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zp5 f4826a;

    public cr5(zp5 zp5Var) {
        this.f4826a = zp5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr5) && this.f4826a.equals(((cr5) obj).f4826a);
    }

    public final int hashCode() {
        return this.f4826a.f44743a.hashCode();
    }

    public final String toString() {
        return "Success(contentItems=" + this.f4826a + Separators.RPAREN;
    }
}
