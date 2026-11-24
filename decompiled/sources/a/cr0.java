package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class cr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jr0 l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cr0(jr0 jr0Var, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = jr0Var;
        this.m = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                cr0 cr0Var = new cr0(this.l, this.m, yjeVar, (byte) 0);
                cr0Var.k = obj;
                return cr0Var;
            default:
                cr0 cr0Var2 = new cr0(this.l, this.m, yjeVar, (byte) 1);
                cr0Var2.k = obj;
                return cr0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((cr0) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List list;
        byte b = this.i;
        long j = this.m;
        jr0 jr0Var = this.l;
        switch (b) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ap0 ap0Var = jr0Var.b;
                    mi1 mi1Var = ap0Var.c;
                    if (mi1Var == null || (list = mi1Var.b) == null) {
                        Object obj2 = ap0Var.f1227a.get(Long.valueOf(j));
                        if (obj2 == null) {
                            obj2 = iun.f15405a;
                        }
                        list = (List) obj2;
                    }
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(list, this) == wneVar) {
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
                kmq kmqVar2 = (kmq) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    Object obj3 = jr0Var.b.b.get(Long.valueOf(j));
                    if (obj3 == null) {
                        obj3 = iun.f15405a;
                    }
                    this.k = null;
                    this.j = true;
                    if (kmqVar2.a((List) obj3, this) == wneVar2) {
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
