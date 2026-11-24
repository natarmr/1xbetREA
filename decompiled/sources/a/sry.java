package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sry extends pry implements ger, zer, gre0 {
    public final ihy c;
    public final String d;
    public final Object e;
    public final a8z f;
    public final a8z g;
    public final a8z h;
    public final a8z i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sry(ihy ihyVar, String str, Object obj, rgy rgyVar) {
        super(rgyVar);
        ihyVar.getClass();
        str.getClass();
        rgyVar.getClass();
        this.c = ihyVar;
        this.d = str;
        this.e = obj;
        wez wezVar = wez.f39042a;
        this.f = maz.a(wezVar, new rry(this, (byte) 0));
        this.g = maz.a(wezVar, new rry(this, (byte) 1));
        this.h = maz.a(wezVar, new rry(this, (byte) 2));
        this.i = maz.a(wezVar, new rry(this, (byte) 3));
    }

    public fqy A() {
        return null;
    }

    public abstract hfy B();

    public nzs0 C() {
        ihy ihyVar = this.c;
        ihyVar.getClass();
        return ((vgy) ((xgy) ihyVar).c.getValue()).d();
    }

    public abstract List D();

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // a.dre0
    public final bv9 G() {
        return (bv9) this.i.getValue();
    }

    @Override // a.dre0
    public final ihy K() {
        return this.c;
    }

    @Override // a.dre0
    public final Object L() {
        return this.e;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        return (List) this.f.getValue();
    }

    public final boolean equals(Object obj) {
        gre0 gre0VarB = xtt0.b(obj);
        return gre0VarB != null && Intrinsics.d(this.c, gre0VarB.K()) && Intrinsics.d(getName(), gre0VarB.getName()) && Intrinsics.d(this.d, gre0VarB.getSignature()) && Intrinsics.d(this.e, gre0VarB.L());
    }

    @Override // a.cer
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, fet fetVar, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, fetVar, num);
    }

    @Override // a.kry
    public final GenericDeclaration findJavaDeclaration() {
        return t9x.E(this.c, this.d);
    }

    @Override // a.pgy
    public final List getAnnotations() {
        Member memberB = x().b();
        AnnotatedElement annotatedElement = memberB instanceof AnnotatedElement ? (AnnotatedElement) memberB : null;
        if (annotatedElement == null) {
            return iun.f15405a;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return xtt0.t(tx3.g0(annotations));
    }

    @Override // a.ger
    public final int getArity() {
        bv9 bv9VarX = x();
        bv9VarX.getClass();
        return bv9VarX.a().size();
    }

    @Override // a.qgy
    public final List getParameters() {
        return (List) this.g.getValue();
    }

    @Override // a.gre0
    public final String getSignature() {
        return this.d;
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        return C().f24388a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((getName().hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public final sv9 p(Constructor constructor, boolean z) {
        List parameters;
        if (!z && (this instanceof qry)) {
            qry qryVar = (qry) this;
            if (qryVar.getVisibility() != viy.d) {
                elc elcVar = qryVar.c;
                elcVar.getClass();
                if (!((sgy) elcVar).l() && ((parameters = qryVar.getParameters()) == null || !parameters.isEmpty())) {
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        sgy sgyVarG = g7x.G(((hre0) it.next()).p());
                        if (sgyVarG.I() && !sgyVarG.equals(sre0.f32672a.b(j0g0.class))) {
                            return fre0.W(this) ? new cv9(constructor, fre0.P(this), acb.V(constructor)) : new dv9(constructor, acb.V(constructor));
                        }
                    }
                }
            }
        }
        return fre0.W(this) ? new ev9(constructor, fre0.P(this)) : new fv9(constructor);
    }

    @Override // a.ber
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, fet fetVar, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, fetVar, num);
    }

    public final String toString() {
        return rv00.x(this);
    }

    public final jv9 u(Method method, boolean z) {
        if (!fre0.W(this)) {
            return new rv9((byte) 2, 6, method, false);
        }
        ihy ihyVar = this.c;
        if (ihyVar instanceof zhy) {
            return new qv9(method, z, fre0.P(this));
        }
        StringBuilder sb = new StringBuilder("Only top-level functions are supported for now: ");
        sb.append(ihyVar);
        hny.r(sb, getName(), this.d);
        return null;
    }

    @Override // a.dre0
    public final bv9 x() {
        return (bv9) this.h.getValue();
    }

    public List z() {
        return iun.f15405a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }
}
