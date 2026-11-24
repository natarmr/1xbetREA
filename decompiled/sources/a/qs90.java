package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class qs90 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f29249a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ pz40 e;
    public final /* synthetic */ pz40 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ j73 h;
    public final /* synthetic */ pz40 i;
    public final /* synthetic */ xcz j;
    public final /* synthetic */ float k;
    public final /* synthetic */ vne l;
    public final /* synthetic */ a8x m;
    public final /* synthetic */ l7m0 n;
    public final /* synthetic */ pz40 o;
    public final /* synthetic */ cgk0 p;

    public qs90(pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, pz40 pz40Var5, pz40 pz40Var6, boolean z, j73 j73Var, pz40 pz40Var7, xcz xczVar, float f, vne vneVar, a8x a8xVar, l7m0 l7m0Var, pz40 pz40Var8, cgk0 cgk0Var) {
        this.f29249a = pz40Var;
        this.b = pz40Var2;
        this.c = pz40Var3;
        this.d = pz40Var4;
        this.e = pz40Var5;
        this.f = pz40Var6;
        this.g = z;
        this.h = j73Var;
        this.i = pz40Var7;
        this.j = xczVar;
        this.k = f;
        this.l = vneVar;
        this.m = a8xVar;
        this.n = l7m0Var;
        this.o = pz40Var8;
        this.p = cgk0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        ((Function1) this.f29249a.getValue()).invoke(bool);
        pz40 pz40Var = this.c;
        pz40 pz40Var2 = this.b;
        if (zBooleanValue) {
            float f = ys90.f43156a;
            pz40Var2.setValue(Boolean.TRUE);
            pz40Var.setValue(Boolean.FALSE);
            return Unit.f46060a;
        }
        float f2 = ys90.f43156a;
        if (!((Boolean) pz40Var2.getValue()).booleanValue()) {
            return Unit.f46060a;
        }
        if (ys90.c(this.d)) {
            pz40Var.setValue(Boolean.TRUE);
            return Unit.f46060a;
        }
        Boolean bool2 = Boolean.FALSE;
        pz40Var2.setValue(bool2);
        pz40Var.setValue(bool2);
        ys90.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.d, this.m, this.n, this.o, this.p);
        return Unit.f46060a;
    }
}
