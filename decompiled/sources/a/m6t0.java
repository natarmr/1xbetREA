package a;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class m6t0 extends v0 {
    @Override // a.bv3
    public final void a(int i, int i2, int i3) {
        ((e7z) this.c).M(i, i2, i3);
    }

    @Override // a.bv3
    public final void b(int i, int i2) {
        ((e7z) this.c).R(i, i2);
    }

    @Override // a.bv3
    public final void d(int i, Object obj) {
    }

    @Override // a.bv3
    public final void e() {
        cg80 cg80Var = ((e7z) this.b).o;
        if (cg80Var != null) {
            ((AndroidComposeView) cg80Var).v();
        }
    }

    @Override // a.bv3
    public final void h(int i, Object obj) {
        ((e7z) this.c).C(i, (e7z) obj);
    }

    @Override // a.bv3
    public final void j() {
        ((e7z) this.c).e();
    }
}
