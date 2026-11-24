package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ltj extends uo9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f20632a;

    public ltj(Executor executor) {
        this.f20632a = executor;
    }

    @Override // a.uo9
    public final vo9 a(Type type, Annotation[] annotationArr) {
        if (ay3.S(type) != to9.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new jtj((Object) ay3.R(0, (ParameterizedType) type), (Object) (ay3.X(annotationArr, w7k0.class) ? null : this.f20632a), (byte) 0);
        }
        jf4.o("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
