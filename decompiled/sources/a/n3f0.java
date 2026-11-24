package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n3f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f22847a;
    public final String b;

    public n3f0(u0f0 u0f0Var, String str) {
        str.getClass();
        this.f22847a = u0f0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3f0)) {
            return false;
        }
        n3f0 n3f0Var = (n3f0) obj;
        return this.f22847a == n3f0Var.f22847a && Intrinsics.d(this.b, n3f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22847a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTextFieldUserInput(registrationFieldType=" + this.f22847a + ", inputText=" + this.b + Separators.RPAREN;
    }
}
