package a;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eek implements sgy, yx40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgy f7678a;
    public final wm40 b;
    public final a8z c;
    public final a8z d;

    public eek(sgy sgyVar, wm40 wm40Var) {
        this.f7678a = sgyVar;
        this.b = wm40Var;
        wez wezVar = wez.f39042a;
        this.c = maz.a(wezVar, new dek(this, (byte) 0));
        this.d = maz.a(wezVar, new dek(this, (byte) 1));
    }

    @Override // a.sgy
    public final boolean I() {
        return this.f7678a.I();
    }

    @Override // a.sgy
    public final String J() {
        String strB = this.b.getName().b();
        strB.getClass();
        return strB;
    }

    @Override // a.sgy
    public final List b() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yx40) {
            return this.f7678a.equals(((yx40) obj).w());
        }
        return false;
    }

    @Override // a.sgy
    public final Collection g() {
        return this.f7678a.g();
    }

    @Override // a.pgy
    public final List getAnnotations() {
        return this.f7678a.getAnnotations();
    }

    @Override // a.sgy, a.oiy
    public final List getTypeParameters() {
        return (List) this.c.getValue();
    }

    @Override // a.sgy
    public final int hashCode() {
        return this.f7678a.hashCode() * 31;
    }

    @Override // a.sgy
    public final boolean i() {
        return this.f7678a.i();
    }

    @Override // a.sgy
    public final boolean l() {
        return this.f7678a.l();
    }

    @Override // a.sgy
    public final boolean r(Object obj) {
        return this.f7678a.r(obj);
    }

    @Override // a.sgy
    public final Collection s() {
        return this.f7678a.s();
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.f7678a + ')';
    }

    @Override // a.sgy
    public final String v() {
        return rek.g(this.b).f32934a.f34663a;
    }

    @Override // a.yx40
    public final sgy w() {
        return this.f7678a;
    }
}
