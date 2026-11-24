package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f850 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ p850 k;
    public final /* synthetic */ ha8 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f850(p850 p850Var, ha8 ha8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = p850Var;
        this.l = ha8Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ha8 ha8Var = this.l;
        p850 p850Var = this.k;
        switch (b) {
            case 0:
                f850 f850Var = new f850(p850Var, ha8Var, yjeVar, (byte) 0);
                f850Var.j = obj;
                return f850Var;
            case 1:
                f850 f850Var2 = new f850(p850Var, ha8Var, yjeVar, (byte) 1);
                f850Var2.j = obj;
                return f850Var2;
            case 2:
                f850 f850Var3 = new f850(p850Var, ha8Var, yjeVar, (byte) 2);
                f850Var3.j = obj;
                return f850Var3;
            case 3:
                f850 f850Var4 = new f850(p850Var, ha8Var, yjeVar, (byte) 3);
                f850Var4.j = obj;
                return f850Var4;
            default:
                f850 f850Var5 = new f850(p850Var, ha8Var, yjeVar, (byte) 4);
                f850Var5.j = obj;
                return f850Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((f850) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((f850) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((f850) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((f850) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((f850) create((w2j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVarR;
        byte b = this.i;
        byte b2 = 9;
        ha8 ha8Var = this.l;
        p850 p850Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                d850 d850Var = new d850((byte) 1, ha8Var.getKey(), (List) obj2);
                int i = p850.p0;
                p850Var.H(d850Var);
                bby bbyVarR2 = p850Var.R(ha8Var.getKey());
                if (bbyVarR2 != null) {
                    bbyVarR2.cancel(null);
                }
                p850Var.b0(ha8Var.getKey());
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p850Var.h0.b((Throwable) obj2, new o240((byte) 25));
                p850Var.H(new b850(ha8Var.getKey(), (byte) 5));
                p850Var.b0(ha8Var.getKey());
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                ArrayList arrayListT = twn.t(obj);
                for (Object obj3 : (List) obj2) {
                    if (((myr0) obj3).g) {
                        arrayListT.add(obj3);
                    }
                }
                d850 d850Var2 = new d850((byte) 3, ha8Var.getKey(), CollectionsKt.D0(arrayListT, 8));
                int i2 = p850.p0;
                p850Var.H(d850Var2);
                bby bbyVarR3 = p850Var.R(ha8Var.getKey());
                if (bbyVarR3 != null) {
                    bbyVarR3.cancel(null);
                }
                p850Var.b0(ha8Var.getKey());
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                b850 b850Var = new b850(ha8Var.getKey(), b2);
                int i3 = p850.p0;
                p850Var.H(b850Var);
                p850Var.h0.b((Throwable) obj2, new o240((byte) 26));
                bby bbyVarR4 = p850Var.R(ha8Var.getKey());
                if (bbyVarR4 != null) {
                    bbyVarR4.cancel(null);
                }
                p850Var.b0(ha8Var.getKey());
                break;
            default:
                w2j w2jVar = (w2j) obj2;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (w2jVar == null) {
                    l750 l750Var = new l750(ha8Var.getKey(), ha8Var, (byte) 10);
                    int i4 = p850.p0;
                    p850Var.H(l750Var);
                    bbyVarR = p850Var.R(ha8Var.getKey());
                    if (bbyVarR != null) {
                        bbyVarR.cancel(null);
                    }
                    p850Var.b0(ha8Var.getKey());
                } else if (w2jVar instanceof t2j) {
                    xrk xrkVar = new xrk(ha8Var.getKey(), ha8Var, w2jVar, (byte) 4);
                    int i5 = p850.p0;
                    p850Var.H(xrkVar);
                } else if (w2jVar instanceof u2j) {
                    l750 l750Var2 = new l750(ha8Var.getKey(), ha8Var, (byte) 9);
                    int i6 = p850.p0;
                    p850Var.H(l750Var2);
                    bby bbyVarR5 = p850Var.R(ha8Var.getKey());
                    if (bbyVarR5 != null) {
                        bbyVarR5.cancel(null);
                    }
                    p850Var.b0(ha8Var.getKey());
                } else {
                    l750 l750Var3 = new l750(ha8Var.getKey(), ha8Var, (byte) 10);
                    int i7 = p850.p0;
                    p850Var.H(l750Var3);
                    bbyVarR = p850Var.R(ha8Var.getKey());
                    if (bbyVarR != null) {
                        bbyVarR.cancel(null);
                    }
                    p850Var.b0(ha8Var.getKey());
                }
                break;
        }
        return Unit.f46060a;
    }
}
