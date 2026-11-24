package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q9y extends ere0 implements jhy, biy {
    public q9y() {
        super(rgy.k);
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
        return p().c;
    }

    @Override // a.dre0
    public final Object L() {
        return p().e;
    }

    @Override // a.pgy
    public final List getAnnotations() {
        return iun.f15405a;
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        return iun.f15405a;
    }

    @Override // a.qgy
    public final viy getVisibility() {
        return p().getVisibility();
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
        p().getClass();
        return fm40.FINAL;
    }

    public abstract t9y p();

    @Override // a.dre0
    public final boolean t() {
        return p().t();
    }
}
