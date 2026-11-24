package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class are0 extends qqe0 implements m8y, q8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeVariable f1343a;

    public are0(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.f1343a = typeVariable;
    }

    @Override // a.m8y
    public final cqe0 a(swq swqVar) {
        Annotation[] declaredAnnotations;
        swqVar.getClass();
        TypeVariable typeVariable = this.f1343a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return tfx.z(declaredAnnotations, swqVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof are0) {
            return Intrinsics.d(this.f1343a, ((are0) obj).f1343a);
        }
        return false;
    }

    @Override // a.m8y
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f1343a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? iun.f15405a : tfx.A(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f1343a.hashCode();
    }

    public final String toString() {
        return are0.class.getName() + ": " + this.f1343a;
    }
}
