package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c850 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ p850 j;
    public final /* synthetic */ ha8 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c850(p850 p850Var, ha8 ha8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = p850Var;
        this.k = ha8Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ha8 ha8Var = this.k;
        p850 p850Var = this.j;
        switch (b) {
            case 0:
                return new c850(p850Var, ha8Var, yjeVar, (byte) 0);
            default:
                return new c850(p850Var, ha8Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((c850) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((c850) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVarR;
        byte b = this.i;
        ha8 ha8Var = this.k;
        p850 p850Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = ((p650) p850Var.D()).h;
                ArrayList<jge> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!(((jge) obj2) instanceof yfe)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    p850Var.H(new b850(ha8Var.getKey(), (byte) 0));
                    bbyVarR = p850Var.R(ha8Var.getKey());
                    if (bbyVarR != null) {
                        bbyVarR.cancel(null);
                    }
                    p850Var.b0(ha8Var.getKey());
                } else {
                    for (jge jgeVar : arrayList) {
                        if (!(jgeVar.a() instanceof y98) && !(jgeVar.a() instanceof ba8)) {
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (((jge) it.next()).a() instanceof da8) {
                                        p850Var.H(new b850(ha8Var.getKey(), (byte) 1));
                                        bby bbyVarR2 = p850Var.R(ha8Var.getKey());
                                        if (bbyVarR2 != null) {
                                            bbyVarR2.cancel(null);
                                        }
                                        p850Var.b0(ha8Var.getKey());
                                    }
                                }
                            }
                        }
                    }
                    p850Var.H(new b850(ha8Var.getKey(), (byte) 0));
                    bbyVarR = p850Var.R(ha8Var.getKey());
                    if (bbyVarR != null) {
                        bbyVarR.cancel(null);
                    }
                    p850Var.b0(ha8Var.getKey());
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                b850 b850Var = new b850(ha8Var.getKey(), (byte) 11);
                int i = p850.p0;
                p850Var.H(b850Var);
                p850Var.b0(ha8Var.getKey());
                break;
        }
        return Unit.f46060a;
    }
}
