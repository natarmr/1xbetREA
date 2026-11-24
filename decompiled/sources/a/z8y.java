package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z8y extends ere0 implements diy {
    public final /* synthetic */ b9y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8y(b9y b9yVar) {
        super(rgy.k);
        this.c = b9yVar;
    }

    @Override // a.dre0
    public final bv9 G() {
        return null;
    }

    @Override // a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // a.dre0
    public final ihy K() {
        return this.c.c;
    }

    @Override // a.dre0
    public final Object L() {
        return null;
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        return iun.f15405a;
    }

    @Override // a.biy
    public final iiy c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z8y) {
            return this.c.equals(((z8y) obj).c);
        }
        return false;
    }

    @Override // a.pgy
    public final List getAnnotations() {
        return iun.f15405a;
    }

    @Override // a.qgy
    public final String getName() {
        return "<get-entries>";
    }

    @Override // a.qgy
    public final List getParameters() {
        return iun.f15405a;
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return this.c.getReturnType();
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        return iun.f15405a;
    }

    @Override // a.qgy
    public final viy getVisibility() {
        return viy.f37504a;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.c.d;
    }

    @Override // a.jhy
    public final boolean isExternal() {
        return false;
    }

    @Override // a.jhy
    public final boolean isInfix() {
        return false;
    }

    @Override // a.jhy
    public final boolean isInline() {
        return false;
    }

    @Override // a.jhy
    public final boolean isOperator() {
        return false;
    }

    @Override // a.qgy
    public final boolean isSuspend() {
        return false;
    }

    @Override // a.dre0
    public final fm40 m() {
        return fm40.FINAL;
    }

    @Override // a.dre0
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "getter of " + this.c;
    }

    @Override // a.dre0
    public final bv9 x() {
        return this.c.f;
    }
}
