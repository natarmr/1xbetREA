package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class nkr implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23694a;
    public final String b;
    public final String c;
    public final ejr d;

    public nkr(int i, String str, String str2, ejr ejrVar) {
        this.f23694a = i;
        this.b = str;
        this.c = str2;
        this.d = ejrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkr)) {
            return false;
        }
        nkr nkrVar = (nkr) obj;
        return this.f23694a == nkrVar.f23694a && this.b.equals(nkrVar.b) && this.c.equals(nkrVar.c) && this.d == nkrVar.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof nkr) || !(p6t0Var2 instanceof nkr)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        nkr nkrVar = (nkr) p6t0Var;
        nkr nkrVar2 = (nkr) p6t0Var2;
        return nkrVar.f23694a == nkrVar2.f23694a && nkrVar.b.equals(nkrVar2.b);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(Integer.hashCode(this.f23694a) * 31, 31, this.b), 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof nkr) || !(p6t0Var2 instanceof nkr)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        nkr nkrVar = (nkr) p6t0Var;
        nkr nkrVar2 = (nkr) p6t0Var2;
        k9x.G(linkedHashSet, new kkr(nkrVar.b), new kkr(nkrVar2.b));
        k9x.G(linkedHashSet, new lkr(nkrVar.c), new lkr(nkrVar2.c));
        k9x.G(linkedHashSet, new jkr(nkrVar.d), new jkr(nkrVar2.d));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("QuestionNumber(value=", this.b, Separators.RPAREN);
        return ua80.m(vqd.r(this.f23694a, "GamblingExamQuestionUiModel(id=", ", questionNumber=", strL, ", questionText="), kng0.l("QuestionText(value=", this.c, Separators.RPAREN), ", answer=", "Answer(value=" + this.d + Separators.RPAREN, Separators.RPAREN);
    }
}
