package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class nif0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ oif0 k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nif0(oif0 oif0Var, long j, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = oif0Var;
        this.l = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        switch (this.i) {
            case 0:
                return new nif0(this.k, this.l, yjeVar, (byte) 0);
            default:
                return new nif0(this.k, this.l, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((nif0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        long j = this.l;
        oif0 oif0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                y3v y3vVar = (y3v) oif0Var.b;
                this.j = true;
                Object objA = ((y9n0) y3vVar.b).a(j, this, false);
                return objA == wneVar ? wneVar : objA;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    y3v y3vVar2 = (y3v) oif0Var.b;
                    List listU = cs0.u(j);
                    this.j = true;
                    if (y3vVar2.x(listU, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
