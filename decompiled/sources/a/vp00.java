package a;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class vp00 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ bq00 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp00(bq00 bq00Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = bq00Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        bq00 bq00Var = this.k;
        switch (b) {
            case 0:
                return new vp00(bq00Var, yjeVar, (byte) 0);
            case 1:
                return new vp00(bq00Var, yjeVar, (byte) 1);
            default:
                return new vp00(bq00Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((vp00) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objG;
        ne5 ne5Var;
        p7m0 p7m0Var;
        Object value;
        byte b = this.i;
        bq00 bq00Var = this.k;
        ne5 ne5Var2 = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gr00 gr00Var = bq00Var.p;
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
                List list = ((cp00) bq00Var.D()).d;
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
                bq00Var.x.i(arrayList2);
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (Build.VERSION.SDK_INT >= 29) {
                        nmo nmoVar = bq00Var.t;
                        this.j = true;
                        objG = nmoVar.g(this);
                        if (objG == wneVar3) {
                            return wneVar3;
                        }
                    }
                    ne5Var = ne5Var2;
                    int i = bq00.n0;
                    p7m0Var = bq00Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, cp00.a((cp00) value, null, null, ne5Var, null, null, null, false, false, 131023)));
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objG = obj;
                ne5Var2 = (ne5) objG;
                ne5Var = ne5Var2;
                int i2 = bq00.n0;
                p7m0Var = bq00Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, cp00.a((cp00) value, null, null, ne5Var, null, null, null, false, false, 131023)));
                return Unit.f46060a;
        }
    }
}
