package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class tl00 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ vl00 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl00(vl00 vl00Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = vl00Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        switch (this.i) {
            case 0:
                return new tl00(this.k, yjeVar, (byte) 0);
            default:
                return new tl00(this.k, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((tl00) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        vl00 vl00Var = this.k;
        byte b2 = 1;
        yje yjeVar = null;
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
                pmi pmiVar = vl00Var.f37600a;
                this.j = true;
                Object objD0 = qjj.d0(((mne) pmiVar.e).b, new wlk(pmiVar, yjeVar, b2), this);
                return objD0 == wneVar ? wneVar : objD0;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                uqe uqeVar = vl00Var.b;
                this.j = true;
                Object objD1 = qjj.d0(uqeVar.e.b, new pqe(uqeVar, yjeVar, (byte) 2), this);
                return objD1 == wneVar2 ? wneVar2 : objD1;
        }
    }
}
