package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qjr implements sjr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28853a;
    public final djr b;

    public qjr(int i, djr djrVar) {
        this.f28853a = i;
        this.b = djrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjr)) {
            return false;
        }
        qjr qjrVar = (qjr) obj;
        return this.f28853a == qjrVar.f28853a && this.b == qjrVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f28853a) * 31);
    }

    public final String toString() {
        return "OnQuestionAnswered(questionId=" + this.f28853a + ", answerStatus=" + this.b + Separators.RPAREN;
    }
}
