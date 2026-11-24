package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ttf extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gy40 k;
    public final /* synthetic */ pz40 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ttf(gy40 gy40Var, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gy40Var;
        this.l = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ttf(this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new ttf(this.k, this.l, yjeVar, (byte) 1);
            default:
                return new ttf(this.k, this.l, yjeVar, (byte) 2);
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
        return ((ttf) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        pz40 pz40Var = this.l;
        gy40 gy40Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    va vaVar = new va(gy40Var.f12108a, (byte) 12);
                    yy0 yy0Var = new yy0(pz40Var, (byte) 4);
                    this.j = true;
                    if (vaVar.c(yy0Var, this) == wneVar) {
                        return wneVar;
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
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayListT = twn.t(obj);
                qoj0 qoj0Var = gy40Var.f12108a;
                na naVar = new na(arrayListT, pz40Var, (byte) 29);
                this.j = true;
                qoj0Var.c(naVar, this);
                return wneVar2;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0Var2 = gy40Var.f12108a;
                yy0 yy0Var2 = new yy0(pz40Var, (byte) 8);
                this.j = true;
                qoj0Var2.c(yy0Var2, this);
                return wneVar3;
        }
    }
}
