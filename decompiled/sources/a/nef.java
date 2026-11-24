package a;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class nef implements hms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cns0 f23382a;
    public final u1x b;
    public final int c;

    public nef(cns0 cns0Var, u1x u1xVar, int i) {
        this.f23382a = cns0Var;
        this.b = u1xVar;
        this.c = i;
        if (i > 0) {
            return;
        }
        jf4.o("durationMillis must be > 0.");
        throw null;
    }

    @Override // a.hms0
    public final void a() {
        cns0 cns0Var = this.f23382a;
        Drawable drawable = cns0Var.getDrawable();
        u1x u1xVar = this.b;
        dyw dywVarB = u1xVar.b();
        boolean z = u1xVar instanceof hhn0;
        gef gefVar = new gef(drawable, dywVarB != null ? c3x.q(dywVarB, cns0Var.getView().getResources()) : null, u1xVar.getRequest().s, this.c, (z && ((hhn0) u1xVar).g) ? false : true);
        if (z) {
            cns0Var.onSuccess(c3x.r(gefVar));
        } else if (u1xVar instanceof r1o) {
            cns0Var.onError(c3x.r(gefVar));
        } else {
            t9f.b();
        }
    }
}
