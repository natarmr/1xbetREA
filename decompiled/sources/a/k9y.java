package a;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class k9y extends t9y implements rhy {
    public final a8z j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9y(ihy ihyVar, Field field, Object obj, rgy rgyVar) {
        super(ihyVar, field, obj, rgyVar);
        ihyVar.getClass();
        rgyVar.getClass();
        this.j = maz.a(wez.f39042a, new aaw(this, (byte) 10));
    }

    @Override // a.t9y, a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new k9y(ihyVar, u(), this.e, rgyVar);
    }

    @Override // a.uhy
    public final phy e() {
        return (j9y) this.j.getValue();
    }

    @Override // a.rhy
    public final void set(Object obj) {
        ((j9y) this.j.getValue()).call(obj);
    }

    @Override // a.rhy, a.uhy
    public final qhy e() {
        return (j9y) this.j.getValue();
    }
}
