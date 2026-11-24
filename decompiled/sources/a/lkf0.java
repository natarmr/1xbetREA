package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lkf0 implements zkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kkz f20201a;
    public final /* synthetic */ mie0 b;
    public final /* synthetic */ vne c;
    public final /* synthetic */ kkz d;
    public final /* synthetic */ n5a e;
    public final /* synthetic */ k050 f;
    public final /* synthetic */ Function2 g;

    public lkf0(kkz kkzVar, mie0 mie0Var, vne vneVar, kkz kkzVar2, n5a n5aVar, k050 k050Var, Function2 function2) {
        this.f20201a = kkzVar;
        this.b = mie0Var;
        this.c = vneVar;
        this.d = kkzVar2;
        this.e = n5aVar;
        this.f = k050Var;
        this.g = function2;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        kkz kkzVar2 = this.f20201a;
        mie0 mie0Var = this.b;
        if (kkzVar == kkzVar2) {
            mie0Var.f21842a = qjj.W(this.c, null, null, new pnd0(this.f, this.g, null, (byte) 8), 3);
            return;
        }
        if (kkzVar == this.d) {
            bby bbyVar = (bby) mie0Var.f21842a;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            mie0Var.f21842a = null;
        }
        if (kkzVar == kkz.ON_DESTROY) {
            e0g0 e0g0Var = j0g0.b;
            this.e.resumeWith(Unit.f46060a);
        }
    }
}
