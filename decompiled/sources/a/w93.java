package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38757a;
    public final String b;
    public final String c;
    public final x93 d;

    public w93(int i, String str, String str2, x93 x93Var) {
        this.f38757a = i;
        this.b = str;
        this.c = str2;
        this.d = x93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w93)) {
            return false;
        }
        w93 w93Var = (w93) obj;
        return this.f38757a == w93Var.f38757a && this.b.equals(w93Var.b) && this.c.equals(w93Var.c) && this.d == w93Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(Integer.hashCode(this.f38757a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f38757a, "AnswerModel(questionId=", ", number=", this.b, ", title=");
        sbR.append(this.c);
        sbR.append(", answered=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
