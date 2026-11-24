package a;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class xen0 implements zv00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40751a;
    public volatile zv00 b;
    public Boolean c;
    public Method d;
    public sfo e;
    public final LinkedBlockingQueue f;
    public final boolean g;

    public xen0(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f40751a = str;
        this.f = linkedBlockingQueue;
        this.g = z;
    }

    @Override // a.zv00
    public final boolean a() {
        return c().a();
    }

    @Override // a.zv00
    public final boolean b() {
        return c().b();
    }

    public final zv00 c() {
        if (this.b != null) {
            return this.b;
        }
        if (this.g) {
            return u850.b;
        }
        sfo sfoVar = this.e;
        if (sfoVar != null) {
            return sfoVar;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.f;
        sfo sfoVar2 = new sfo();
        sfoVar2.f32127a = this;
        sfoVar2.b = linkedBlockingQueue;
        this.e = sfoVar2;
        return sfoVar2;
    }

    @Override // a.zv00
    public final boolean e() {
        return c().e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xen0.class == obj.getClass() && this.f40751a.equals(((xen0) obj).f40751a);
    }

    @Override // a.zv00
    public final boolean f() {
        return c().f();
    }

    @Override // a.zv00
    public final void g(p96 p96Var, String str) {
        c().g(p96Var, str);
    }

    @Override // a.zv00
    public final void h(p96 p96Var, String str) {
        c().h(p96Var, str);
    }

    public final int hashCode() {
        return this.f40751a.hashCode();
    }

    @Override // a.zv00
    public final boolean i() {
        return c().i();
    }

    @Override // a.zv00
    public final void k(p96 p96Var, String str) {
        c().k(p96Var, str);
    }

    @Override // a.zv00
    public final void o(p96 p96Var, String str) {
        c().o(p96Var, str);
    }

    public final boolean p() {
        Boolean bool;
        Boolean bool2 = this.c;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", yen0.class);
            bool = Boolean.TRUE;
            this.c = bool;
        } catch (NoSuchMethodException unused) {
            bool = Boolean.FALSE;
            this.c = bool;
        }
        return bool.booleanValue();
    }

    @Override // a.zv00
    public final void q(p96 p96Var, String str) {
        c().q(p96Var, str);
    }
}
