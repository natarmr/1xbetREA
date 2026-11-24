package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class mqe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nqe l;
    public final /* synthetic */ ArrayList m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mqe(nqe nqeVar, ArrayList arrayList, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = nqeVar;
        this.m = arrayList;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ArrayList arrayList = this.m;
        nqe nqeVar = this.l;
        switch (b) {
            case 0:
                mqe mqeVar = new mqe(nqeVar, arrayList, yjeVar, (byte) 0);
                mqeVar.k = obj;
                return mqeVar;
            case 1:
                mqe mqeVar2 = new mqe(nqeVar, arrayList, yjeVar, (byte) 1);
                mqeVar2.k = obj;
                return mqeVar2;
            default:
                mqe mqeVar3 = new mqe(nqeVar, arrayList, yjeVar, (byte) 2);
                mqeVar3.k = obj;
                return mqeVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qpg0 qpg0Var = (qpg0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((mqe) create(qpg0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ArrayList arrayList = this.m;
        nqe nqeVar = this.l;
        switch (b) {
            case 0:
                qpg0 qpg0Var = (qpg0) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    sj3 sj3Var = nqeVar.b;
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
            case 1:
                qpg0 qpg0Var2 = (qpg0) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    wti wtiVar = nqeVar.d;
                    this.k = null;
                    this.j = true;
                    if (wtiVar.D(qpg0Var2, arrayList, this) == wneVar2) {
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
            default:
                qpg0 qpg0Var3 = (qpg0) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    fu6 fu6Var = nqeVar.c;
                    this.k = null;
                    this.j = true;
                    if (fu6Var.R(qpg0Var3, arrayList) == wneVar3) {
                        return wneVar3;
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
