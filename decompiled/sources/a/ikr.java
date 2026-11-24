package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ikr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14942a;
    public final String b;
    public final djr c;

    public ikr(int i, String str, djr djrVar) {
        this.f14942a = i;
        this.b = str;
        this.c = djrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikr)) {
            return false;
        }
        ikr ikrVar = (ikr) obj;
        return this.f14942a == ikrVar.f14942a && this.b.equals(ikrVar.b) && this.c == ikrVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f14942a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f14942a, "GamblingExamQuestionModel(questionId=", ", questionText=", this.b, ", answerStatus=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
