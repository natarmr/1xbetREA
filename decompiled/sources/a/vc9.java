package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class vc9 extends uke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37176a;

    public /* synthetic */ vc9(byte b) {
        this.f37176a = b;
    }

    @Override // a.uke
    public vke a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y9g0 y9g0Var) {
        switch (this.f37176a) {
            case 0:
                if (RequestBody.class.isAssignableFrom(ay3.S(type))) {
                    return lwf.e;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, y9g0Var);
        }
    }

    @Override // a.uke
    public final vke b(Type type, Annotation[] annotationArr, y9g0 y9g0Var) {
        switch (this.f37176a) {
            case 0:
                if (type == ResponseBody.class) {
                    return ay3.X(annotationArr, wrm0.class) ? ujn.e : m2a.f;
                }
                if (type == Void.class) {
                    return rv00.f;
                }
                if (ay3.o && type == Unit.class) {
                    return jtv.d;
                }
                return null;
            default:
                if (ay3.S(type) != Optional.class) {
                    return null;
                }
                return new yox(y9g0Var.d(ay3.R(0, (ParameterizedType) type), annotationArr));
        }
    }
}
