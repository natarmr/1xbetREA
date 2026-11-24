package a;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ddq0 implements bv9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ddq0 f5908a = new ddq0();

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
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // a.bv9
    public final Type getReturnType() {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }
}
