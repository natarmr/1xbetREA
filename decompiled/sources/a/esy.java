package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class esy extends pry implements jhy, biy {
    /* JADX WARN: Illegal instructions before constructor call */
    public esy() {
        rgy rgyVar = rgy.k;
        rgyVar.getClass();
        super(rgyVar);
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
        return u().c;
    }

    @Override // a.dre0
    public final Object L() {
        return u().e;
    }

    @Override // a.pgy
    public final List getAnnotations() {
        Annotation[] annotations;
        if (xvw.R(u())) {
            return iun.f15405a;
        }
        Member memberB = x().b();
        List listG0 = null;
        Method method = memberB instanceof Method ? (Method) memberB : null;
        if (method != null && (annotations = method.getAnnotations()) != null) {
            listG0 = tx3.g0(annotations);
        }
        if (listG0 == null) {
            listG0 = iun.f15405a;
        }
        return xtt0.t(listG0);
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        return u().getTypeParameters();
    }

    @Override // a.qgy
    public final viy getVisibility() {
        nuu0 nuu0Var;
        viy viyVarB0;
        eqy eqyVarP = p();
        return (eqyVarP == null || (nuu0Var = (nuu0) j24.u.v(j24.f15764a[46], eqyVarP)) == null || (viyVarB0 = jwb.b0(nuu0Var)) == null) ? u().getVisibility() : viyVarB0;
    }

    @Override // a.jhy
    public final boolean isExternal() {
        eqy eqyVarP = p();
        return eqyVarP != null && j24.w.m(j24.f15764a[49], eqyVarP);
    }

    @Override // a.jhy
    public final boolean isInfix() {
        return false;
    }

    @Override // a.jhy
    public final boolean isInline() {
        eqy eqyVarP = p();
        return eqyVarP != null && j24.x.m(j24.f15764a[50], eqyVarP);
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
        fm40 fm40Var;
        eqy eqyVarP = p();
        return (eqyVarP == null || (fm40Var = (fm40) j24.v.v(j24.f15764a[47], eqyVarP)) == null) ? u().m() : fm40Var;
    }

    public eqy p() {
        return u().f.d;
    }

    public abstract osy u();
}
