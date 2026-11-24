package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rc9 implements sc9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30226a;
    public final String b;

    public rc9(String str) {
        str.getClass();
        this.f30226a = "BuilderTagKey";
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc9)) {
            return false;
        }
        rc9 rc9Var = (rc9) obj;
        return this.f30226a.equals(rc9Var.f30226a) && Intrinsics.d(this.b, rc9Var.b);
    }

    @Override // a.sc9
    public final String getKey() {
        return this.f30226a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30226a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Title(key=", this.f30226a, ", title=", this.b, Separators.RPAREN);
    }
}
