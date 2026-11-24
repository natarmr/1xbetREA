package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class jr9 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ diu0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr9(diu0 diu0Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        diu0 diu0Var = this.l;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                jr9 jr9Var = new jr9((mr9) diu0Var, yjeVar, (byte) 0);
                jr9Var.j = zBooleanValue;
                jr9Var.k = zBooleanValue2;
                return jr9Var.invokeSuspend(Unit.f46060a);
            case 1:
                jr9 jr9Var2 = new jr9((at9) diu0Var, yjeVar, (byte) 1);
                jr9Var2.j = zBooleanValue;
                jr9Var2.k = zBooleanValue2;
                return jr9Var2.invokeSuspend(Unit.f46060a);
            case 2:
                jr9 jr9Var3 = new jr9((qg20) diu0Var, yjeVar, (byte) 2);
                jr9Var3.j = zBooleanValue;
                jr9Var3.k = zBooleanValue2;
                return jr9Var3.invokeSuspend(Unit.f46060a);
            default:
                jr9 jr9Var4 = new jr9((t190) diu0Var, yjeVar, (byte) 3);
                jr9Var4.j = zBooleanValue;
                jr9Var4.k = zBooleanValue2;
                return jr9Var4.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVar;
        bby bbyVar2;
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        yje yjeVar = null;
        boolean z = false;
        z = false;
        diu0 diu0Var = this.l;
        switch (b) {
            case 0:
                mr9 mr9Var = (mr9) diu0Var;
                p7m0 p7m0Var = mr9Var.l;
                boolean z2 = this.j;
                boolean z3 = this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (!z3 || z2) {
                    ds9 ds9Var = ((es9) p7m0Var.getValue()).b;
                    ds9 ds9Var2 = ds9.f6602a;
                    if (ds9Var == ds9Var2 && !z2) {
                        mr9Var.w(ds9.c);
                    } else if ((((es9) p7m0Var.getValue()).b == ds9Var2 || z3) && z2 && ((bbyVar = mr9Var.k) == null || !bbyVar.isActive())) {
                        mr9Var.w(ds9.b);
                        mr9Var.k = sac.V(jiu0.a(mr9Var), new cr9(mr9Var, (byte) 0), null, mr9Var.e.f22085a, new gr9(mr9Var, yjeVar, z ? (byte) 1 : (byte) 0), 10);
                    }
                } else {
                    mr9Var.w(ds9.c);
                }
                p7m0 p7m0Var2 = mr9Var.m;
                Boolean bool = Boolean.FALSE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool);
                break;
            case 1:
                at9 at9Var = (at9) diu0Var;
                oyg0 oyg0Var = at9Var.f;
                ocj ocjVar = at9Var.i;
                boolean z4 = this.j;
                boolean z5 = this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!z5 || z4) {
                    bs9 bs9Var = ((cs9) at9Var.D()).b;
                    bs9 bs9Var2 = bs9.f3118a;
                    if (bs9Var == bs9Var2 && !z4) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var3.getValue();
                            value2.getClass();
                        } while (!p7m0Var3.m(value2, cs9.a((cs9) value2, null, bs9.c, false, null, 29)));
                    } else if ((((cs9) at9Var.D()).b == bs9Var2 || z5) && z4 && ((bbyVar2 = at9Var.x) == null || !bbyVar2.isActive())) {
                        p7m0 p7m0Var4 = ocjVar.f25029a;
                        do {
                            value = p7m0Var4.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var4.m(value, cs9.a((cs9) value, null, bs9.b, false, null, 29)));
                        at9Var.x = sac.V(jiu0.a(at9Var), new vs9(at9Var, (byte) 1), null, at9Var.q.f22085a, new xs9(at9Var, yjeVar, z ? (byte) 1 : (byte) 0), 10);
                    }
                } else {
                    int i = at9.z;
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var5.getValue();
                        value3.getClass();
                    } while (!p7m0Var5.m(value3, cs9.a((cs9) value3, null, bs9.c, false, null, 29)));
                }
                p7m0 p7m0Var6 = at9Var.y;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var6.getClass();
                p7m0Var6.o(null, bool2);
                break;
            case 2:
                boolean z6 = this.j;
                boolean z7 = this.k;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!z7 && z6) {
                    ((qg20) diu0Var).Q(true);
                }
                break;
            default:
                boolean z8 = this.j;
                boolean z9 = this.k;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var7 = ((t190) diu0Var).v;
                if (z9 && z8) {
                    z = true;
                }
                twn.A(z, p7m0Var7, null);
                break;
        }
        return Unit.f46060a;
    }
}
