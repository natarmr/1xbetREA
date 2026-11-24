package a;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class amn0 implements zy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cmn0 f1117a;
    public final /* synthetic */ bmn0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ i55 d;
    public final /* synthetic */ i55 e;

    public /* synthetic */ amn0(cmn0 cmn0Var, bmn0 bmn0Var, int i, i55 i55Var, i55 i55Var2) {
        this.f1117a = cmn0Var;
        this.b = bmn0Var;
        this.c = i;
        this.d = i55Var;
        this.e = i55Var2;
    }

    @Override // a.zy3
    public final ig00 apply(Object obj) {
        bmn0 bmn0Var = this.b;
        Surface surface = (Surface) obj;
        cmn0 cmn0Var = this.f1117a;
        cmn0Var.getClass();
        surface.getClass();
        try {
            bmn0Var.d();
            imn0 imn0Var = new imn0(surface, this.c, cmn0Var.g.f12463a, this.d, this.e);
            imn0Var.k.b.a(new yln0(bmn0Var, (byte) 1), bnk.a());
            z1x.y("Consumer can only be linked once.", bmn0Var.q == null);
            bmn0Var.q = imn0Var;
            return ro4.a0(imn0Var);
        } catch (gzj e) {
            return new m3x(e, (byte) 1);
        }
    }
}
