package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class elh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7997a;
    public final a4x b;

    public elh0(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f7997a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elh0)) {
            return false;
        }
        elh0 elh0Var = (elh0) obj;
        return Intrinsics.d(this.f7997a, elh0Var.f7997a) && Intrinsics.d(this.b, elh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7997a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("SecretQuestionChoiceState(title=", this.f7997a, ", secretQuestions=", this.b, Separators.RPAREN);
    }
}
