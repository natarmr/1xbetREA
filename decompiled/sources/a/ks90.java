package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ks90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j73 f18803a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ float e;
    public final /* synthetic */ a8x f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ pz40 h;

    public /* synthetic */ ks90(j73 j73Var, vne vneVar, pz40 pz40Var, xcz xczVar, float f, a8x a8xVar, l7m0 l7m0Var, pz40 pz40Var2) {
        this.f18803a = j73Var;
        this.b = vneVar;
        this.c = pz40Var;
        this.d = xczVar;
        this.e = f;
        this.f = a8xVar;
        this.g = l7m0Var;
        this.h = pz40Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ys90.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ((Integer) obj).intValue(), this.f18803a);
        return Unit.f46060a;
    }
}
