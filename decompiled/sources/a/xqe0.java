package a;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class xqe0 extends zqe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f41314a;
    public final iun b = iun.f15405a;

    public xqe0(Class cls) {
        this.f41314a = cls;
    }

    @Override // a.zqe0
    public final Type b() {
        return this.f41314a;
    }

    @Override // a.m8y
    public final Collection getAnnotations() {
        return this.b;
    }
}
