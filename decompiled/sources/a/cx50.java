package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class cx50 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gx50 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx50(gx50 gx50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gx50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gx50 gx50Var = this.k;
        switch (b) {
            case 0:
                return new cx50(gx50Var, yjeVar, (byte) 0);
            case 1:
                cx50 cx50Var = new cx50(gx50Var, yjeVar, (byte) 1);
                cx50Var.j = ((Boolean) obj).booleanValue();
                return cx50Var;
            case 2:
                return new cx50(gx50Var, yjeVar, (byte) 2);
            default:
                return new cx50(gx50Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cx50) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((cx50) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((cx50) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cx50) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objL;
        Object value2;
        byte b = this.i;
        gx50 gx50Var = this.k;
        switch (b) {
            case 0:
                oyg0 oyg0Var = gx50Var.f;
                ocj ocjVar = gx50Var.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    boolean z2 = ((pw50) gx50Var.D()).e == null;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, pw50.a((pw50) value, false, z2, false, 0, null, null, null, 121)));
                    xfu xfuVar = gx50Var.t;
                    String str = gx50Var.o;
                    this.j = true;
                    objL = ((j910) xfuVar.f40810a).l(this, str, true);
                    if (objL == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objL = obj;
                }
                xu50 xu50Var = (xu50) objL;
                int i = gx50.B;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, pw50.a((pw50) value2, false, false, false, 0, xu50Var, null, null, 105)));
                return Unit.f46060a;
            case 1:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    int i2 = gx50.B;
                    gx50Var.O();
                    gx50Var.M();
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bby bbyVar = gx50Var.z;
                    if (bbyVar != null) {
                        this.j = true;
                        if (zvw.H(bbyVar, this) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    jwu jwuVar = gx50Var.v;
                    String str2 = gx50Var.o;
                    this.j = true;
                    if (jwuVar.b(str2, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
