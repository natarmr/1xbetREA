package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ewe0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f8521a;
    public final String b;

    public ewe0(u0f0 u0f0Var, String str) {
        str.getClass();
        this.f8521a = u0f0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewe0)) {
            return false;
        }
        ewe0 ewe0Var = (ewe0) obj;
        return this.f8521a == ewe0Var.f8521a && Intrinsics.d(this.b, ewe0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8521a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTextFieldUserInput(registrationFieldType=" + this.f8521a + ", inputText=" + this.b + Separators.RPAREN;
    }
}
