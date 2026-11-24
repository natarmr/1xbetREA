package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class enu0 implements s0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0a f8112a;
    public final yo b;
    public final hnu0 c;
    public final fnu0 d;

    public enu0(s0a s0aVar, fnu0 fnu0Var, b0l0 b0l0Var) {
        this.f8112a = s0aVar;
        this.d = fnu0Var;
        this.b = new yo(s0aVar.d(), b0l0Var);
        this.c = new hnu0(s0aVar.h());
    }

    @Override // a.s0a
    public final da60 b() {
        return this.f8112a.b();
    }

    @Override // a.eot0
    public final void c(fot0 fot0Var) {
        ofm0.m();
        this.d.c(fot0Var);
    }

    @Override // a.s0a
    public final ry9 d() {
        return this.b;
    }

    @Override // a.s0a
    public final n0a h() {
        return this.c;
    }

    @Override // a.eot0
    public final void i(fot0 fot0Var) {
        ofm0.m();
        this.d.i(fot0Var);
    }

    @Override // a.eot0
    public final void j(fot0 fot0Var) {
        ofm0.m();
        this.d.j(fot0Var);
    }

    @Override // a.eot0
    public final void l(fot0 fot0Var) {
        ofm0.m();
        this.d.l(fot0Var);
    }

    @Override // a.s0a
    public final void n(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // a.s0a
    public final void o(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // a.s0a
    public final boolean q() {
        return false;
    }

    @Override // a.s0a
    public final ig00 release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
