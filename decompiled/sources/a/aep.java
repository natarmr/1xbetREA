package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class aep extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ bep k;
    public final /* synthetic */ mlr l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aep(bep bepVar, mlr mlrVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bepVar;
        this.l = mlrVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mlr mlrVar = this.l;
        bep bepVar = this.k;
        switch (b) {
            case 0:
                return new aep(bepVar, mlrVar, yjeVar, (byte) 0);
            default:
                return new aep(bepVar, mlrVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((aep) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        e2p e2pVar;
        Object value2;
        byte b = this.i;
        bep bepVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                mlr mlrVar = this.l;
                if (!z) {
                    z1x.P(obj);
                    if (!bepVar.D.c()) {
                        return Unit.f46060a;
                    }
                    xr xrVar = bepVar.p;
                    String strM = bepVar.M(mlrVar);
                    this.j = true;
                    if (xrVar.m(mlrVar, true, 8201, strM, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = bep.I;
                p7m0 p7m0Var = bepVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    e2pVar = (e2p) value;
                } while (!p7m0Var.m(value, e2p.a(e2pVar, false, false, false, false, false, false, null, CollectionsKt.L0(CollectionsKt.O0(CollectionsKt.r0(e2pVar.j, mlrVar))), null, false, 64511)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                mlr mlrVar2 = this.l;
                if (!z2) {
                    z1x.P(obj);
                    if (!bepVar.D.c()) {
                        return Unit.f46060a;
                    }
                    xr xrVar2 = bepVar.p;
                    String strM2 = bepVar.M(mlrVar2);
                    this.j = true;
                    if (xrVar2.m(mlrVar2, false, 8201, strM2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list = ((e2p) bepVar.D()).j;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (mlrVar2.f22006a != ((mlr) obj2).f22006a) {
                        arrayList.add(obj2);
                    }
                }
                p7m0 p7m0Var2 = bepVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, e2p.a((e2p) value2, false, arrayList.isEmpty(), false, false, false, false, null, arrayList, null, false, 64495)));
                return Unit.f46060a;
        }
    }
}
