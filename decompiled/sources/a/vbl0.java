package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vbl0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ ncl0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vbl0(ncl0 ncl0Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = ncl0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        ncl0 ncl0Var = this.k;
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                vbl0 vbl0Var = new vbl0(ncl0Var, yjeVar, (byte) 0);
                vbl0Var.j = th;
                return vbl0Var.invokeSuspend(Unit.f46060a);
            case 1:
                vbl0 vbl0Var2 = new vbl0(ncl0Var, yjeVar, (byte) 1);
                vbl0Var2.j = th;
                return vbl0Var2.invokeSuspend(Unit.f46060a);
            case 2:
                vbl0 vbl0Var3 = new vbl0(ncl0Var, yjeVar, (byte) 2);
                vbl0Var3.j = th;
                return vbl0Var3.invokeSuspend(Unit.f46060a);
            case 3:
                vbl0 vbl0Var4 = new vbl0(ncl0Var, yjeVar, (byte) 3);
                vbl0Var4.j = th;
                return vbl0Var4.invokeSuspend(Unit.f46060a);
            case 4:
                vbl0 vbl0Var5 = new vbl0(ncl0Var, yjeVar, (byte) 4);
                vbl0Var5.j = th;
                return vbl0Var5.invokeSuspend(Unit.f46060a);
            case 5:
                vbl0 vbl0Var6 = new vbl0(ncl0Var, yjeVar, (byte) 5);
                vbl0Var6.j = th;
                return vbl0Var6.invokeSuspend(Unit.f46060a);
            case 6:
                vbl0 vbl0Var7 = new vbl0(ncl0Var, yjeVar, (byte) 6);
                vbl0Var7.j = th;
                return vbl0Var7.invokeSuspend(Unit.f46060a);
            default:
                vbl0 vbl0Var8 = new vbl0(ncl0Var, yjeVar, (byte) 7);
                vbl0Var8.j = th;
                return vbl0Var8.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        final byte b2 = 0;
        final byte b3 = 1;
        final ncl0 ncl0Var = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ncl0Var.m.b(th, new Function2() { // from class: a.ubl0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b2;
                        ncl0 ncl0Var2 = ncl0Var;
                        switch (b4) {
                            case 0:
                                ncl0Var2.D(false);
                                break;
                            default:
                                ncl0Var2.D(false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ncl0Var.m.b(th, new Function2() { // from class: a.ubl0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        ncl0 ncl0Var2 = ncl0Var;
                        switch (b4) {
                            case 0:
                                ncl0Var2.D(false);
                                break;
                            default:
                                ncl0Var2.D(false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ncl0Var.m.b(th, new jak0((byte) 26));
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ncl0Var.m.b(th, new jak0((byte) 27));
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ncl0Var.m.b(th, new jak0((byte) 28));
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                ncl0Var.m.b(th, new jak0((byte) 29));
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                ncl0Var.m.b(th, new gcl0((byte) 0));
                break;
            default:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                ncl0Var.m.b(th, new gcl0((byte) 1));
                break;
        }
        return Unit.f46060a;
    }
}
