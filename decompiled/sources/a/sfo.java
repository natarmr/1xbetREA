package a;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class sfo implements zv00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xen0 f32127a;
    public LinkedBlockingQueue b;

    @Override // a.zv00
    public final boolean a() {
        return true;
    }

    @Override // a.zv00
    public final boolean b() {
        return true;
    }

    public final void c() {
        yen0 yen0Var = new yen0();
        System.currentTimeMillis();
        yen0Var.f42495a = this.f32127a;
        Thread.currentThread().getName();
        this.b.add(yen0Var);
    }

    @Override // a.zv00
    public final boolean e() {
        return true;
    }

    @Override // a.zv00
    public final boolean f() {
        return true;
    }

    @Override // a.zv00
    public final void g(p96 p96Var, String str) {
        c();
    }

    @Override // a.zv00
    public final void h(p96 p96Var, String str) {
        c();
    }

    @Override // a.zv00
    public final boolean i() {
        return true;
    }

    @Override // a.zv00
    public final void k(p96 p96Var, String str) {
        c();
    }

    @Override // a.zv00
    public final void o(p96 p96Var, String str) {
        c();
    }

    @Override // a.zv00
    public final void q(p96 p96Var, String str) {
        c();
    }
}
