package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fmk implements gmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9786a;
    public final String b;

    public fmk(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f9786a = str;
        this.b = str2;
    }

    @Override // a.gmk
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmk)) {
            return false;
        }
        fmk fmkVar = (fmk) obj;
        return Intrinsics.d(this.f9786a, fmkVar.f9786a) && Intrinsics.d(this.b, fmkVar.b);
    }

    @Override // a.gmk
    public final String getValue() {
        return this.f9786a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9786a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Plus(value=", this.f9786a, ", currency=", this.b, Separators.RPAREN);
    }
}
