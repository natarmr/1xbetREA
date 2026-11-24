package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lr20 implements zv00, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20508a;

    @Override // a.zv00
    public final void g(p96 p96Var, String str) {
        d(str);
    }

    public String getName() {
        return this.f20508a;
    }

    @Override // a.zv00
    public final void h(p96 p96Var, String str) {
        j(str);
    }

    @Override // a.zv00
    public final void k(p96 p96Var, String str) {
        l(str);
    }

    @Override // a.zv00
    public final void o(p96 p96Var, String str) {
        n(str);
    }

    @Override // a.zv00
    public final void q(p96 p96Var, String str) {
        m(str);
    }

    public final String toString() {
        return getClass().getName() + Separators.LPAREN + getName() + Separators.RPAREN;
    }
}
