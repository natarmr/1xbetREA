package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jt1 implements ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrl f17077a;
    public final krl b;

    public jt1(hrl hrlVar, krl krlVar) {
        this.f17077a = hrlVar;
        this.b = krlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt1)) {
            return false;
        }
        jt1 jt1Var = (jt1) obj;
        return this.f17077a == jt1Var.f17077a && this.b.equals(jt1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17077a.hashCode() * 31);
    }

    public final String toString() {
        return "RulesUiModel(style=" + this.f17077a + ", uiModel=" + this.b + Separators.RPAREN;
    }
}
