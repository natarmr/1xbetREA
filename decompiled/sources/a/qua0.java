package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class qua0 extends bnn0 implements Function1 {
    public ygs i;
    public boolean j;
    public final /* synthetic */ List k;
    public final /* synthetic */ rua0 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ String n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qua0(List list, rua0 rua0Var, long j, String str, long j2, long j3, yje yjeVar) {
        super(1, yjeVar);
        this.k = list;
        this.l = rua0Var;
        this.m = j;
        this.n = str;
        this.o = j2;
        this.p = j3;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new qua0(this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((qua0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ygs ygsVar;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        rua0 rua0Var = this.l;
        if (!z) {
            z1x.P(obj);
            List list = this.k;
            ygs ygsVar2 = (ygs) CollectionsKt.firstOrNull(list);
            if (list.size() != 1 || ygsVar2 == null) {
                rua0Var.v.d(new zm8((i3t0) rua0Var, (Object) this.n, this.o, this.p, (byte) 2));
            } else {
                h3c h3cVar = rua0Var.u;
                long j = ygsVar2.d;
                this.i = ygsVar2;
                this.j = true;
                obj = h3cVar.b(j, this);
                if (obj == wneVar) {
                    return wneVar;
                }
                ygsVar = ygsVar2;
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ygs ygsVar3 = this.i;
        z1x.P(obj);
        ygsVar = ygsVar3;
        rua0Var.v.d(new q71((byte) 6, this.m, rua0Var, ygsVar, ((Boolean) obj).booleanValue()));
        return Unit.f46060a;
    }
}
