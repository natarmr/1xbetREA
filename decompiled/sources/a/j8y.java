package a;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j8y extends hre0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8y f16110a;
    public final Method b;
    public final int c;
    public final a8z d;

    public j8y(i8y i8yVar, Method method, int i) {
        method.getClass();
        this.f16110a = i8yVar;
        this.b = method;
        this.c = i;
        this.d = maz.a(wez.f39042a, new aaw(this, (byte) 8));
    }

    @Override // a.hre0
    public final dre0 c() {
        return this.f16110a;
    }

    @Override // a.hre0
    public final boolean f() {
        return q();
    }

    @Override // a.pgy
    public final List getAnnotations() {
        throw null;
    }

    @Override // a.hre0
    public final String getName() {
        String name = this.b.getName();
        name.getClass();
        return name;
    }

    @Override // a.hre0
    public final int j() {
        return this.c;
    }

    @Override // a.hre0
    public final aiy n() {
        return aiy.d;
    }

    @Override // a.hre0
    public final kiy p() {
        return (kiy) this.d.getValue();
    }

    @Override // a.hre0
    public final boolean q() {
        return this.b.getDefaultValue() != null;
    }

    @Override // a.hre0
    public final boolean u() {
        return Intrinsics.d(getName(), "value") && this.b.getReturnType().isArray();
    }
}
