package a;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ay40 implements sgy, yx40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgy f1654a;
    public final qlc b;
    public final a8z c;
    public final a8z d;
    public final a8z e;

    public ay40(xgy xgyVar, qlc qlcVar) {
        this.f1654a = xgyVar;
        this.b = qlcVar;
        wez wezVar = wez.f39042a;
        this.c = maz.a(wezVar, new zx40(this, (byte) 0));
        this.d = maz.a(wezVar, new zx40(this, (byte) 1));
        this.e = maz.a(wezVar, new zx40(this, (byte) 2));
    }

    @Override // a.sgy
    public final boolean I() {
        return this.f1654a.I();
    }

    @Override // a.sgy
    public final String J() {
        String strB = this.b.f().b();
        strB.getClass();
        return strB;
    }

    @Override // a.sgy
    public final List b() {
        return (List) this.e.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yx40) {
            return this.f1654a.equals(((yx40) obj).w());
        }
        return false;
    }

    @Override // a.sgy
    public final Collection g() {
        return this.f1654a.g();
    }

    @Override // a.pgy
    public final List getAnnotations() {
        return this.f1654a.getAnnotations();
    }

    @Override // a.sgy, a.oiy
    public final List getTypeParameters() {
        return ((nzs0) this.d.getValue()).f24388a;
    }

    @Override // a.sgy
    public final int hashCode() {
        return this.f1654a.hashCode();
    }

    @Override // a.sgy
    public final boolean i() {
        return this.f1654a.i();
    }

    @Override // a.sgy
    public final boolean l() {
        return this.f1654a.l();
    }

    @Override // a.sgy
    public final boolean r(Object obj) {
        return this.f1654a.r(obj);
    }

    @Override // a.sgy
    public final Collection s() {
        return this.f1654a.s();
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.f1654a + ')';
    }

    @Override // a.sgy
    public final String v() {
        return this.b.a().f32934a.f34663a;
    }

    @Override // a.yx40
    public final sgy w() {
        return this.f1654a;
    }
}
