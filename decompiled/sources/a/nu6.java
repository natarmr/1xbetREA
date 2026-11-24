package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nu6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ou6 l;
    public final /* synthetic */ ArrayList m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nu6(ou6 ou6Var, ArrayList arrayList, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = ou6Var;
        this.m = arrayList;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ArrayList arrayList = this.m;
        ou6 ou6Var = this.l;
        switch (b) {
            case 0:
                nu6 nu6Var = new nu6(ou6Var, arrayList, yjeVar, (byte) 0);
                nu6Var.k = obj;
                return nu6Var;
            default:
                nu6 nu6Var2 = new nu6(ou6Var, arrayList, yjeVar, (byte) 1);
                nu6Var2.k = obj;
                return nu6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qpg0 qpg0Var = (qpg0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((nu6) create(qpg0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ArrayList arrayList = this.m;
        ou6 ou6Var = this.l;
        switch (b) {
            case 0:
                qpg0 qpg0Var = (qpg0) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    sj3 sj3Var = ou6Var.c;
                    this.k = null;
                    this.j = true;
                    if (sj3Var.k0(qpg0Var, arrayList) == wneVar) {
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
            default:
                qpg0 qpg0Var2 = (qpg0) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    fu6 fu6Var = ou6Var.d;
                    this.k = null;
                    this.j = true;
                    if (fu6Var.R(qpg0Var2, arrayList) == wneVar2) {
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
