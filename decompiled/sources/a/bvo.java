package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes6.dex */
public final class bvo extends uke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaType f3287a;
    public final lhi0 b;

    public bvo(MediaType mediaType, lhi0 lhi0Var) {
        this.f3287a = mediaType;
        this.b = lhi0Var;
    }

    @Override // a.uke
    public final vke a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y9g0 y9g0Var) {
        type.getClass();
        annotationArr2.getClass();
        lhi0 lhi0Var = this.b;
        return new gxu(this.f3287a, q5x.Q(lhi0Var.f20057a.b, type), lhi0Var);
    }

    @Override // a.uke
    public final vke b(Type type, Annotation[] annotationArr, y9g0 y9g0Var) {
        annotationArr.getClass();
        lhi0 lhi0Var = this.b;
        return new jtj((Object) q5x.Q(lhi0Var.f20057a.b, type), (Object) lhi0Var, (byte) 2);
    }
}
