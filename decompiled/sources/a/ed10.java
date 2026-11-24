package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ed10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7595a;
    public final String b;

    public ed10(String str, String str2) {
        str.getClass();
        this.f7595a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed10)) {
            return false;
        }
        ed10 ed10Var = (ed10) obj;
        return Intrinsics.d(this.f7595a, ed10Var.f7595a) && this.b.equals(ed10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7595a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LottoModel(gameUrl=", this.f7595a, ", message=", this.b, Separators.RPAREN);
    }
}
