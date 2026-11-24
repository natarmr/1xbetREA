package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class c430 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d430 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c430(d430 d430Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = d430Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        d430 d430Var = this.k;
        switch (b) {
            case 0:
                return new c430(d430Var, yjeVar, (byte) 0);
            default:
                return new c430(d430Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((c430) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        d430 d430Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    lhf0 lhf0Var = d430Var.u;
                    this.j = true;
                    obj = lhf0Var.u(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list = (List) obj;
                List list2 = d430.v;
                p7m0 p7m0Var = d430Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, y330.a((y330) value, false, null, null, list, 111)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    art artVar = d430Var.r;
                    t730 t730VarN = ufx.N(((y330) d430Var.D()).b);
                    artVar.getClass();
                    aw20 aw20VarD = art.d(t730VarN);
                    zru zruVar = d430Var.q;
                    this.j = true;
                    obj = zruVar.f44876a.e(aw20VarD, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                aw20 aw20Var = (aw20) obj;
                List list3 = d430.v;
                p7m0 p7m0Var2 = d430Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, y330.a((y330) value2, false, aw20Var, aw20Var, null, 115)));
                return Unit.f46060a;
        }
    }
}
