package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e9y extends ere0 {
    public final ihy c;
    public final Member d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9y(ihy ihyVar, Member member, Object obj, rgy rgyVar) {
        super(rgyVar);
        ihyVar.getClass();
        member.getClass();
        rgyVar.getClass();
        this.c = ihyVar;
        this.d = member;
        this.e = obj;
    }

    @Override // a.dre0
    public final ihy K() {
        return this.c;
    }

    @Override // a.dre0
    public final Object L() {
        return this.e;
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

    @Override // a.qgy
    public final viy getVisibility() {
        int modifiers = this.d.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return viy.f37504a;
        }
        if (Modifier.isPrivate(modifiers)) {
            return viy.d;
        }
        return null;
    }

    @Override // a.qgy
    public final boolean isSuspend() {
        return false;
    }

    @Override // a.dre0
    public fm40 m() {
        fm40 fm40Var = this.f8277a.b;
        if (fm40Var != null) {
            return fm40Var;
        }
        Member member = this.d;
        if (Modifier.isFinal(member.getModifiers()) || tke.W(member)) {
            return fm40.FINAL;
        }
        return Modifier.isAbstract(member.getModifiers()) ? fm40.ABSTRACT : fm40.OPEN;
    }

    @Override // a.dre0
    public final boolean t() {
        int modifiers = this.d.getModifiers();
        swq swqVar = xtt0.f41480a;
        return (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || Modifier.isPrivate(modifiers)) ? false : true;
    }
}
