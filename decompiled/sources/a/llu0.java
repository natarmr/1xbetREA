package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class llu0 implements kmf0, qvj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gbe0 f20266a;
    public final o1x b;
    public final zjt c;
    public final glz d;
    public final bby e;

    public llu0(gbe0 gbe0Var, o1x o1xVar, zjt zjtVar, glz glzVar, bby bbyVar) {
        this.f20266a = gbe0Var;
        this.b = o1xVar;
        this.c = zjtVar;
        this.d = glzVar;
        this.e = bbyVar;
    }

    @Override // a.kmf0
    public final void a() {
        zjt zjtVar = this.c;
        if (zjtVar.getView().isAttachedToWindow()) {
            return;
        }
        mlu0 mlu0VarR = o5n0.r(zjtVar.getView());
        llu0 llu0Var = mlu0VarR.d;
        if (llu0Var != null) {
            glz glzVar = llu0Var.d;
            llu0Var.e.cancel(null);
            zjt zjtVar2 = llu0Var.c;
            if (zjtVar2 != null && glzVar != null) {
                glzVar.f(zjtVar2);
            }
            if (glzVar != null) {
                glzVar.f(llu0Var);
            }
        }
        mlu0VarR.d = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // a.kmf0
    public final void c() {
        glz glzVar = this.d;
        if (glzVar != null) {
            glzVar.a(this);
        }
        zjt zjtVar = this.c;
        if (zjtVar != null && glzVar != null) {
            glzVar.f(zjtVar);
            glzVar.a(zjtVar);
        }
        mlu0 mlu0VarR = o5n0.r(zjtVar.getView());
        llu0 llu0Var = mlu0VarR.d;
        if (llu0Var != null) {
            glz glzVar2 = llu0Var.d;
            llu0Var.e.cancel(null);
            zjt zjtVar2 = llu0Var.c;
            if (zjtVar2 != null && glzVar2 != null) {
                glzVar2.f(zjtVar2);
            }
            if (glzVar2 != null) {
                glzVar2.f(llu0Var);
            }
        }
        mlu0VarR.d = this;
    }

    @Override // a.kmf0
    public final Object d(fbe0 fbe0Var) {
        glz glzVar = this.d;
        return glzVar != null ? x1x.v(glzVar, fbe0Var) : Unit.f46060a;
    }

    @Override // a.qvj
    public final void onDestroy(clz clzVar) {
        o5n0.r(this.c.getView()).a();
    }
}
