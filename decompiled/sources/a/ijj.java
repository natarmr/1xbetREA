package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class ijj implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f14876a;
    public final /* synthetic */ float b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ pz40 e;
    public final /* synthetic */ pz40 f;
    public final /* synthetic */ pz40 g;
    public final /* synthetic */ pz40 h;
    public final /* synthetic */ pz40 i;
    public final /* synthetic */ pz40 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ pz40 l;
    public final /* synthetic */ pz40 m;

    public ijj(float f, float f2, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, pz40 pz40Var5, pz40 pz40Var6, pz40 pz40Var7, pz40 pz40Var8, long j, pz40 pz40Var9, pz40 pz40Var10) {
        this.f14876a = f;
        this.b = f2;
        this.c = pz40Var;
        this.d = pz40Var2;
        this.e = pz40Var3;
        this.f = pz40Var4;
        this.g = pz40Var5;
        this.h = pz40Var6;
        this.i = pz40Var7;
        this.j = pz40Var8;
        this.k = j;
        this.l = pz40Var9;
        this.m = pz40Var10;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        Object objZ0 = ((jnn0) hpa0Var).Z0(yjeVar, new hjj(this.f14876a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null));
        return objZ0 == wne.f39444a ? objZ0 : Unit.f46060a;
    }
}
