package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p3k extends kzj0 {
    @Override // a.wsy
    public final List J() {
        return p0().J();
    }

    @Override // a.wsy
    public ays0 K() {
        return p0().K();
    }

    @Override // a.wsy
    public final iys0 S() {
        return p0().S();
    }

    @Override // a.wsy
    public boolean U() {
        return p0().U();
    }

    public abstract kzj0 p0();

    @Override // a.tft0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public kzj0 l0(cty ctyVar) {
        kzj0 kzj0VarP0 = p0();
        kzj0VarP0.getClass();
        return r0(kzj0VarP0);
    }

    public p3k r0(kzj0 kzj0Var) {
        return new t660(kzj0Var);
    }

    @Override // a.wsy
    public final cr30 y() {
        return p0().y();
    }
}
