package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class in extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ xcz m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in(pz40 pz40Var, String str, xcz xczVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pz40Var;
        this.l = str;
        this.m = xczVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new in(this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new in(this.k, this.l, this.m, yjeVar, (byte) 1);
            default:
                return new in(this.k, this.l, this.m, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((in) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xcz xczVar = this.m;
        String str = this.l;
        pz40 pz40Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (!Intrinsics.d(pz40Var.getValue(), str)) {
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (!Intrinsics.d(pz40Var.getValue(), str)) {
                        this.j = true;
                        v0h0 v0h0Var2 = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (!Intrinsics.d(pz40Var.getValue(), str)) {
                        this.j = true;
                        v0h0 v0h0Var3 = xcz.y;
                        if (xczVar.l(0, 0, this) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
