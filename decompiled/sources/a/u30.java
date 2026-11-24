package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u30 implements x30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34971a;
    public final String b;

    public u30(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f34971a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u30)) {
            return false;
        }
        u30 u30Var = (u30) obj;
        return Intrinsics.d(this.f34971a, u30Var.f34971a) && Intrinsics.d(this.b, u30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34971a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ValueDisabled(balanceValue=", this.f34971a, ", currency=", this.b, Separators.RPAREN);
    }
}
