package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uo9 {
    public vo9 a(Type type, Annotation[] annotationArr) {
        if (ay3.S(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            jf4.n("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeR = ay3.R(0, (ParameterizedType) type);
        if (ay3.S(typeR) != jtf0.class) {
            return new rrc(typeR, (byte) 5);
        }
        if (typeR instanceof ParameterizedType) {
            return new prc((Object) ay3.R(0, (ParameterizedType) typeR), (byte) 6);
        }
        jf4.n("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
