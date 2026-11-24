package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class k29 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ s29 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k29(s29 s29Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = s29Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s29 s29Var = this.k;
        switch (b) {
            case 0:
                return new k29(s29Var, yjeVar, (byte) 0);
            case 1:
                return new k29(s29Var, yjeVar, (byte) 1);
            case 2:
                return new k29(s29Var, yjeVar, (byte) 2);
            default:
                k29 k29Var = new k29(s29Var, yjeVar, (byte) 3);
                k29Var.j = ((Boolean) obj).booleanValue();
                return k29Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k29) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((k29) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((k29) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((k29) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objK;
        byte b = this.i;
        s29 s29Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    i8i.D("screen", "provbrand", s29Var.x.f35083a, "login_page_call");
                    b1j.v("provbrand", s29Var.B.f1455a, 3035L);
                    ytt yttVar = s29Var.G;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarC = s29Var.s.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0VarC, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    i8i.D("screen", "provbrand", s29Var.x.f35083a, "reg_page_call");
                    au0 au0Var = s29Var.B;
                    s29Var.L.g();
                    au0Var.getClass();
                    b1j.v("provbrand", au0Var.f1455a, 3020L);
                    ytt yttVar2 = s29Var.G;
                    aue0 aue0Var2 = aue0.d;
                    this.j = true;
                    if (yttVar2.a(aue0Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarC2 = s29Var.s.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
                c8d c8dVar2 = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator2 = cs0.h(copyOnWriteArrayListQ2, c8dVar2, c8dVar2, i1w0VarC2, copyOnWriteArrayListQ2).listIterator(0);
                while (true) {
                    paw pawVar2 = (paw) listIterator2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    String str = s29.Y;
                    p7m0 p7m0Var = s29Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, x19.a((x19) value, null, null, null, false, null, null, 255)));
                    gmq gmqVarJ = s29Var.D.j(0L, r7x.B(uzb0.f36529a), "", 1, String.valueOf(s29Var.p), s29Var.M.b.f13233a.k, !h97.A(s29Var.C, uaq0.f35345a), false, false);
                    this.j = true;
                    objK = ntb.K(gmqVarJ, this);
                    if (objK == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                s5d0 s5d0Var = (s5d0) CollectionsKt.firstOrNull((List) objK);
                if (s5d0Var == null) {
                    return Unit.f46060a;
                }
                if (s29Var.q) {
                    s29Var.Q(s5d0Var);
                } else {
                    s29Var.K.d(new op7(s29Var, s5d0Var, (byte) 15));
                }
                return Unit.f46060a;
            default:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (z4) {
                    String str2 = s29.Y;
                    s29Var.P(false, false);
                }
                return Unit.f46060a;
        }
    }
}
