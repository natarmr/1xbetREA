package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k150 implements r150 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17503a;
    public final String b;

    public k150(String str, String str2) {
        str2.getClass();
        this.f17503a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k150)) {
            return false;
        }
        k150 k150Var = (k150) obj;
        return this.f17503a.equals(k150Var.f17503a) && Intrinsics.d(this.b, k150Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17503a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OnClickPromoButton(buttonId=", this.f17503a, ", key=", this.b, Separators.RPAREN);
    }
}
