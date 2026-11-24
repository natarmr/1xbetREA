package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ls90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f20567a;
    public final /* synthetic */ j73 b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ float d;
    public final /* synthetic */ vne e;
    public final /* synthetic */ pz40 f;
    public final /* synthetic */ a8x g;
    public final /* synthetic */ l7m0 h;
    public final /* synthetic */ pz40 i;

    public /* synthetic */ ls90(pz40 pz40Var, j73 j73Var, xcz xczVar, float f, vne vneVar, pz40 pz40Var2, a8x a8xVar, l7m0 l7m0Var, pz40 pz40Var3) {
        this.f20567a = pz40Var;
        this.b = j73Var;
        this.c = xczVar;
        this.d = f;
        this.e = vneVar;
        this.f = pz40Var2;
        this.g = a8xVar;
        this.h = l7m0Var;
        this.i = pz40Var3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a8x a8xVar = (a8x) this.f20567a.getValue();
        xcz xczVar = this.c;
        float f = this.d;
        if (a8xVar != null) {
            iIntValue = ys90.h(ys90.e(xczVar, f), iIntValue, a8xVar.f450a, a8xVar.c);
        }
        ys90.d(this.e, this.f, xczVar, f, this.g, this.h, this.i, iIntValue, this.b);
        return Unit.f46060a;
    }
}
