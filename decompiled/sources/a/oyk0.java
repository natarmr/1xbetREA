package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class oyk0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ tyk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oyk0(tyk0 tyk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = tyk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tyk0 tyk0Var = this.k;
        switch (b) {
            case 0:
                return new oyk0(tyk0Var, yjeVar, (byte) 0);
            case 1:
                return new oyk0(tyk0Var, yjeVar, (byte) 1);
            case 2:
                return new oyk0(tyk0Var, yjeVar, (byte) 2);
            case 3:
                return new oyk0(tyk0Var, yjeVar, (byte) 3);
            case 4:
                return new oyk0(tyk0Var, yjeVar, (byte) 4);
            default:
                return new oyk0(tyk0Var, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((oyk0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objK;
        Object objK2;
        Object objM;
        byte b = this.i;
        tyk0 tyk0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    tyk0Var.E(new jav0(true));
                    vyk0 vyk0Var = tyk0Var.m.f24499a.d.c;
                    fq fqVar = tyk0Var.f;
                    ly5 ly5Var = new ly5(vyk0Var.f, lnm0.b, false, vyk0Var.c, vyk0Var.b, tyk0Var.e.a().f4905a.f3145a, vyk0Var.f38252a);
                    this.j = true;
                    if (fqVar.f(ly5Var, this) == wneVar) {
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
                    p7m0 p7m0VarA = tyk0Var.o.a();
                    this.j = true;
                    objK = ntb.K(p7m0VarA, this);
                    if (objK == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                List list = (List) objK;
                if (tyk0Var.n.f43187a.d.b == yxk0.g && list.isEmpty()) {
                    sac.V(jiu0.a(tyk0Var), new ejk0((byte) 14), null, null, new oyk0(tyk0Var, yjeVar, (byte) 4), 14);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    p7m0 p7m0VarA2 = tyk0Var.o.a();
                    this.j = true;
                    objK2 = ntb.K(p7m0VarA2, this);
                    if (objK2 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK2 = obj;
                }
                List list2 = (List) objK2;
                if (!list2.isEmpty()) {
                    tyk0Var.D(new bcs(list2));
                    c4m0 c4m0Var = tyk0Var.A;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    tyk0Var.z();
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    p7m0 p7m0VarA3 = tyk0Var.o.a();
                    this.j = true;
                    objM = ntb.M(p7m0VarA3, this);
                    if (objM == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM = obj;
                }
                List list3 = (List) objM;
                if (list3 != null) {
                    ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(xxk0.a((xxk0) it.next(), true));
                    }
                    tyk0Var.C(new pc7(arrayList));
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    qoj0 qoj0Var = tyk0Var.D;
                    this.j = true;
                    if (qoj0Var.a(pl60.f27169a, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    qoj0 qoj0Var2 = tyk0Var.G;
                    kav0 kav0Var = new kav0(false, (yxk0) CollectionsKt.d0(tyk0Var.m.f24499a.d.c.d));
                    this.j = true;
                    if (qoj0Var2.a(kav0Var, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
