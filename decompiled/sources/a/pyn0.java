package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class pyn0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pyn0(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                pyn0 pyn0Var = new pyn0(3, yjeVar, (byte) 0);
                pyn0Var.j = th;
                return pyn0Var.invokeSuspend(Unit.f46060a);
            case 1:
                pyn0 pyn0Var2 = new pyn0(3, yjeVar, (byte) 1);
                pyn0Var2.j = th;
                return pyn0Var2.invokeSuspend(Unit.f46060a);
            case 2:
                pyn0 pyn0Var3 = new pyn0(3, yjeVar, (byte) 2);
                pyn0Var3.j = th;
                return pyn0Var3.invokeSuspend(Unit.f46060a);
            case 3:
                pyn0 pyn0Var4 = new pyn0(3, yjeVar, (byte) 3);
                pyn0Var4.j = th;
                return pyn0Var4.invokeSuspend(Unit.f46060a);
            case 4:
                pyn0 pyn0Var5 = new pyn0(3, yjeVar, (byte) 4);
                pyn0Var5.j = th;
                return pyn0Var5.invokeSuspend(Unit.f46060a);
            case 5:
                pyn0 pyn0Var6 = new pyn0(3, yjeVar, (byte) 5);
                pyn0Var6.j = th;
                return pyn0Var6.invokeSuspend(Unit.f46060a);
            case 6:
                pyn0 pyn0Var7 = new pyn0(3, yjeVar, (byte) 6);
                pyn0Var7.j = th;
                return pyn0Var7.invokeSuspend(Unit.f46060a);
            case 7:
                pyn0 pyn0Var8 = new pyn0(3, yjeVar, (byte) 7);
                pyn0Var8.j = th;
                return pyn0Var8.invokeSuspend(Unit.f46060a);
            default:
                pyn0 pyn0Var9 = new pyn0(3, yjeVar, (byte) 8);
                pyn0Var9.j = th;
                return pyn0Var9.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                break;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                break;
            default:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                break;
        }
        return Unit.f46060a;
    }
}
