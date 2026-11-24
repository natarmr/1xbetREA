package a;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class gmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11536a;
    public final Method b;

    public gmc(Method method, int i) {
        this.f11536a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmc)) {
            return false;
        }
        gmc gmcVar = (gmc) obj;
        return this.f11536a == gmcVar.f11536a && this.b.getName().equals(gmcVar.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.f11536a * 31);
    }
}
