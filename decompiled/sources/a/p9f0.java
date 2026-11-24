package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p9f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f26603a;
    public final String b;

    public p9f0(u0f0 u0f0Var, String str) {
        str.getClass();
        this.f26603a = u0f0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9f0)) {
            return false;
        }
        p9f0 p9f0Var = (p9f0) obj;
        return this.f26603a == p9f0Var.f26603a && Intrinsics.d(this.b, p9f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26603a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTextFieldUserInput(registrationFieldType=" + this.f26603a + ", inputText=" + this.b + Separators.RPAREN;
    }
}
