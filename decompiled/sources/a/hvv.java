package a;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class hvv extends k3e implements vuo {
    public final f7m0 l0;
    public final int m0;
    public final ArrayList n0;

    public hvv(f7m0 f7m0Var, int i) {
        super(f7m0Var);
        this.n0 = new ArrayList();
        this.l0 = f7m0Var;
        this.m0 = i;
    }

    @Override // a.k3e, a.vme0
    public final k4e a() {
        return s();
    }

    public final void q(Object... objArr) {
        Collections.addAll(this.n0, objArr);
    }

    public final void r() {
        super.apply();
    }

    public jvv s() {
        return null;
    }

    @Override // a.k3e, a.vme0, a.vuo
    public void apply() {
    }
}
