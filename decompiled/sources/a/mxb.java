package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mxb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ yxb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mxb(yxb yxbVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yxbVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yxb yxbVar = this.k;
        switch (b) {
            case 0:
                return new mxb(yxbVar, yjeVar, (byte) 0);
            case 1:
                return new mxb(yxbVar, yjeVar, (byte) 1);
            case 2:
                mxb mxbVar = new mxb(yxbVar, yjeVar, (byte) 2);
                mxbVar.j = ((Boolean) obj).booleanValue();
                return mxbVar;
            case 3:
                return new mxb(yxbVar, yjeVar, (byte) 3);
            case 4:
                return new mxb(yxbVar, yjeVar, (byte) 4);
            default:
                return new mxb(yxbVar, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mxb) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((mxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((mxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mxb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVar;
        Object value;
        byte b = this.i;
        yxb yxbVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    frc frcVar = yxbVar.k;
                    this.j = true;
                    Unit unitL0 = frcVar.f10012a.l0(null);
                    if (unitL0 != wneVar) {
                        unitL0 = Unit.f46060a;
                    }
                    if (unitL0 == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                yxbVar.r.f17297a = 0;
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    g45 g45Var = yxbVar.f.f37798a;
                    w7e w7eVar = new w7e(((vae) g45Var.b).g, g45Var, (byte) 1);
                    f5b f5bVar = new f5b(yxbVar, (byte) 24);
                    this.j = true;
                    if (w7eVar.c(f5bVar, this) == wneVar2) {
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
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                yxbVar.u = z3;
                yxbVar.B = false;
                if (z3) {
                    Function0 function0 = yxbVar.s;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    if (yxbVar.s == null && ((bbyVar = yxbVar.z) == null || !bbyVar.isActive())) {
                        yxbVar.z = sac.V(yxbVar.n, xxb.f41649a, null, null, new mxb(yxbVar, yjeVar, (byte) 5), 14);
                    }
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    qv qvVar = yxbVar.e;
                    this.j = true;
                    obj = qvVar.a(60, this);
                    if (obj == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list = (List) obj;
                if (list.size() < 60) {
                    yxbVar.B = true;
                }
                yxbVar.C = true;
                c4m0 c4m0Var = yxbVar.x;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    g45 g45Var2 = yxbVar.d.f16283a;
                    yxbVar.x = slb.U(new dnq(new fnq(i120.W(new i89(new eu4(new c00(((i7e) g45Var2.c).g, g45Var2, (byte) 25), (byte) 14), (byte) 22)), new wib(yxbVar, yjeVar, (byte) 4), (byte) 4), new lo3(3, null, (byte) 7), (byte) 1), yxbVar.n);
                }
                yxbVar.s = null;
                if (list.isEmpty()) {
                    yxbVar.a();
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(3000L, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var = yxbVar.o;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, CollectionsKt.q0((List) value, kotlin.collections.a.c(ixb.b))));
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    frc frcVar2 = yxbVar.b;
                    this.j = true;
                    if (frcVar2.a(this) == wneVar6) {
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
