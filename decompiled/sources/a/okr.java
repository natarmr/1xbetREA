package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class okr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25418a;
    public final String b;
    public final rqm c;
    public final rqm d;
    public final djr e;

    public okr(int i, String str, rqm rqmVar, rqm rqmVar2, djr djrVar) {
        this.f25418a = i;
        this.b = str;
        this.c = rqmVar;
        this.d = rqmVar2;
        this.e = djrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okr)) {
            return false;
        }
        okr okrVar = (okr) obj;
        return this.f25418a == okrVar.f25418a && this.b.equals(okrVar.b) && this.c.equals(okrVar.c) && this.d.equals(okrVar.d) && this.e == okrVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b(Integer.hashCode(this.f25418a) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f25418a, "GamblingExamQuestionUiModel(id=", ", questionText=", this.b, ", positiveCell=");
        sbR.append(this.c);
        sbR.append(", negativeCell=");
        sbR.append(this.d);
        sbR.append(", answerStatus=");
        sbR.append(this.e);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
