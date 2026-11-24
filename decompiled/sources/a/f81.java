package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class f81 implements t81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f9085a;

    public f81(xdk0 xdk0Var) {
        this.f9085a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f81) && this.f9085a.equals(((f81) obj).f9085a);
    }

    public final int hashCode() {
        return this.f9085a.hashCode();
    }

    public final String toString() {
        return cs0.k("ShowGameModeNotification(model=", this.f9085a, Separators.RPAREN);
    }
}
