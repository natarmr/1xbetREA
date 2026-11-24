package a;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a9y implements bv9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b9y f498a;

    public a9y(b9y b9yVar) {
        this.f498a = b9yVar;
    }

    @Override // a.bv9
    public final List a() {
        return iun.f15405a;
    }

    @Override // a.bv9
    public final Member b() {
        return null;
    }

    @Override // a.bv9
    public final boolean c() {
        return false;
    }

    @Override // a.bv9
    public final Object call(Object[] objArr) {
        objArr.getClass();
        a0o a0oVar = this.f498a.d;
        int length = objArr.length;
        a().getClass();
        if (length == 0) {
            return a0oVar;
        }
        a().getClass();
        c99.k(length, "Callable expects 0 arguments, but ", " were provided.");
        return null;
    }

    @Override // a.bv9
    public final Type getReturnType() {
        kiy returnType = this.f498a.getReturnType();
        returnType.getClass();
        if (returnType instanceof v2) {
            mre0 mre0Var = ((v2) returnType).f36658a;
            Type type = mre0Var != null ? (Type) mre0Var.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return f1t0.N(returnType, false);
    }
}
