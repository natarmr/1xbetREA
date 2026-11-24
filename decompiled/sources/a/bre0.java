package a;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class bre0 extends qqe0 implements m8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zqe0 f3078a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public bre0(zqe0 zqe0Var, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.f3078a = zqe0Var;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // a.m8y
    public final cqe0 a(swq swqVar) {
        swqVar.getClass();
        return tfx.z(this.b, swqVar);
    }

    @Override // a.m8y
    public final Collection getAnnotations() {
        return tfx.A(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(bre0.class.getName());
        sb.append(": ");
        sb.append(this.d ? "vararg " : "");
        String str = this.c;
        sb.append(str != null ? g950.d(str) : null);
        sb.append(": ");
        sb.append(this.f3078a);
        return sb.toString();
    }
}
