package a;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class aqe0 extends u0 {
    public static final aqe0 d;

    static {
        fty ftyVar = fty.f;
        ftyVar.getClass();
        w9y w9yVar = v9y.d;
        fty ftyVar2 = w9yVar.b;
        zlf0 zlf0Var = (ftyVar2 == null || ftyVar2.d - ftyVar.d > 0) ? w9yVar.f38802a : w9yVar.c;
        zlf0Var.getClass();
        d = new aqe0(new cgx0(new ydy(zlf0Var, zlf0Var == zlf0.WARN ? null : zlf0Var), new w0(ftyVar, (byte) 26)));
    }

    @Override // a.u0
    public final swq d(Object obj) {
        Annotation annotation = (Annotation) obj;
        annotation.getClass();
        String strV = azw.F(annotation).v();
        if (strV != null) {
            return new swq(strV);
        }
        return null;
    }

    @Override // a.u0
    public final Object e(Object obj) {
        Annotation annotation = (Annotation) obj;
        annotation.getClass();
        return azw.F(annotation);
    }

    @Override // a.u0
    public final Iterable f(Object obj) {
        ((Annotation) obj).getClass();
        return iun.f15405a;
    }

    @Override // a.u0
    public final boolean h() {
        return true;
    }
}
