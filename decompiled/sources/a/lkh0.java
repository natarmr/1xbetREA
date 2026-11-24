package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lkh0 implements okh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20203a;
    public final amh0 b;

    public lkh0(String str, amh0 amh0Var) {
        str.getClass();
        this.f20203a = str;
        this.b = amh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkh0)) {
            return false;
        }
        lkh0 lkh0Var = (lkh0) obj;
        return Intrinsics.d(this.f20203a, lkh0Var.f20203a) && this.b.equals(lkh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20203a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTextFieldAction(value=" + this.f20203a + ", secretQuestionItem=" + this.b + Separators.RPAREN;
    }
}
