package a;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sv9 implements bv9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32856a = 0;
    public final List b;
    public final Member c;
    public final Type d;

    public sv9(Method method, List list) {
        this.c = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.d = returnType;
    }

    @Override // a.bv9
    public final List a() {
        switch (this.f32856a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // a.bv9
    public final Member b() {
        switch (this.f32856a) {
            case 0:
                return this.c;
            default:
                return null;
        }
    }

    @Override // a.bv9
    public final boolean c() {
        switch (this.f32856a) {
        }
        return false;
    }

    public void d(int i) {
        if (a().size() == i) {
            return;
        }
        c99.i(a().size(), i);
    }

    public void e(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
    }

    public void f(Object obj) {
        if (obj == null || !this.c.getDeclaringClass().isInstance(obj)) {
            jf4.o("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // a.bv9
    public final Type getReturnType() {
        switch (this.f32856a) {
            case 0:
                return this.d;
            default:
                return (Class) this.d;
        }
    }

    public sv9(Member member, Type type, Type[] typeArr) {
        this.c = member;
        this.d = type;
        this.b = tx3.g0(typeArr);
    }
}
