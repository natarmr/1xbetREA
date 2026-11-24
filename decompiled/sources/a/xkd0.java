package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xkd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41025a;
    public final String b;

    public xkd0(int i, String str) {
        this.f41025a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkd0)) {
            return false;
        }
        xkd0 xkd0Var = (xkd0) obj;
        return this.f41025a == xkd0Var.f41025a && this.b.equals(xkd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f41025a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f41025a, "QuestionModel(questionId=", ", questionText=", this.b, Separators.RPAREN);
    }
}
