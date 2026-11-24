package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class alh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1067a;
    public final a4x b;

    public alh0(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f1067a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alh0)) {
            return false;
        }
        alh0 alh0Var = (alh0) obj;
        return Intrinsics.d(this.f1067a, alh0Var.f1067a) && Intrinsics.d(this.b, alh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1067a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("SecretQuestionChoiceModel(title=", this.f1067a, ", secretQuestions=", this.b, Separators.RPAREN);
    }
}
