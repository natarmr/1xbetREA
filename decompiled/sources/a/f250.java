package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f250 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8797a;
    public final hkl b;

    public f250(String str, hkl hklVar) {
        str.getClass();
        this.f8797a = str;
        this.b = hklVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f250)) {
            return false;
        }
        f250 f250Var = (f250) obj;
        return Intrinsics.d(this.f8797a, f250Var.f8797a) && this.b.equals(f250Var.b);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f8797a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8797a.hashCode() * 31);
    }

    public final String toString() {
        return "RegistrationBonusBanner(key=" + this.f8797a + ", model=" + this.b + Separators.RPAREN;
    }
}
