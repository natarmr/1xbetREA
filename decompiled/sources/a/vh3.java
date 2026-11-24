package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vh3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ij3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh3(ij3 ij3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ij3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ij3 ij3Var = this.k;
        switch (b) {
            case 0:
                return new vh3(ij3Var, yjeVar, (byte) 0);
            case 1:
                return new vh3(ij3Var, yjeVar, (byte) 1);
            default:
                vh3 vh3Var = new vh3(ij3Var, yjeVar, (byte) 2);
                vh3Var.j = ((Boolean) obj).booleanValue();
                return vh3Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vh3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vh3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((vh3) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        g8d g8dVar;
        byte b = this.i;
        ij3 ij3Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gr00 gr00Var = ij3Var.c;
                    this.j = true;
                    if (gr00Var.B(this) == wneVar) {
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
                if (!z2) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jV0 = ibc.v0(1, bfn.MINUTES);
                    this.j = true;
                    if (qcc.P(jV0, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list = ((jh3) ij3Var.j0.getValue()).d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    List list2 = ((npm0) obj2).b;
                    if (!list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (((mpm0) it.next()).b);
                    }
                    arrayList.add(obj2);
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((npm0) it2.next()).f23921a.b);
                }
                ij3Var.m.i(arrayList2);
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3 && (g8dVar = (g8d) ij3Var.m0.get(kh3.RESOLVE)) != null) {
                    ij3Var.z(g8dVar, new rh3(ij3Var, (byte) 4));
                }
                return Unit.f46060a;
        }
    }
}
