package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b0t extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ c0t k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0t(c0t c0tVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = c0tVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        c0t c0tVar = this.k;
        switch (b) {
            case 0:
                b0t b0tVar = new b0t(c0tVar, yjeVar, (byte) 0);
                b0tVar.j = ((Boolean) obj).booleanValue();
                return b0tVar;
            case 1:
                b0t b0tVar2 = new b0t(c0tVar, yjeVar, (byte) 1);
                b0tVar2.j = ((Boolean) obj).booleanValue();
                return b0tVar2;
            case 2:
                b0t b0tVar3 = new b0t(c0tVar, yjeVar, (byte) 2);
                b0tVar3.j = ((Boolean) obj).booleanValue();
                return b0tVar3;
            default:
                return new b0t(c0tVar, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((b0t) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((b0t) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((b0t) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((b0t) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        byte b = this.i;
        c0t c0tVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = c0t.b0;
                p7m0 p7m0Var = c0tVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, wrs.a((wrs) value, null, null, null, null, null, null, null, null, null, null, null, false, z, false, null, false, 0L, 0L, 67043327)));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    c0tVar.t.h();
                }
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = c0t.b0;
                p7m0 p7m0Var2 = c0tVar.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    boolean z4 = z3;
                    if (p7m0Var2.m(value3, wrs.a((wrs) value3, null, null, null, null, null, null, null, null, null, null, null, z4, false, false, null, false, 0L, 0L, 67076095))) {
                        return Unit.f46060a;
                    }
                    z3 = z4;
                }
                break;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    j3c j3cVar = c0tVar.F;
                    this.j = true;
                    objA = j3cVar.a(189L, 0L, this);
                    if (objA == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ypl0 ypl0Var = (ypl0) objA;
                int i3 = c0t.b0;
                p7m0 p7m0Var3 = c0tVar.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, wrs.a((wrs) value2, null, null, ypl0Var, null, null, null, null, null, null, null, null, false, false, false, null, false, 0L, 0L, 67108855)));
                return Unit.f46060a;
        }
    }
}
