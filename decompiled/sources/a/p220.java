package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class p220 extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p220(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.i) {
            case 0:
                boolean z2 = this.j;
                boolean z3 = this.k;
                boolean z4 = this.l;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(z2 || z3 || z4);
            case 1:
                boolean z5 = this.j;
                boolean z6 = this.k;
                boolean z7 = this.l;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z5 && z6 && z7) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                boolean z8 = this.j;
                boolean z9 = this.k;
                boolean z10 = this.l;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z8 && z9 && z10) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 4;
        Boolean bool = (Boolean) obj;
        switch (this.i) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                p220 p220Var = new p220(i, (yje) obj4, (byte) 0);
                p220Var.j = zBooleanValue;
                p220Var.k = zBooleanValue2;
                p220Var.l = zBooleanValue3;
                return p220Var.invokeSuspend(Unit.f46060a);
            case 1:
                boolean zBooleanValue4 = bool.booleanValue();
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
                p220 p220Var2 = new p220(i, (yje) obj4, (byte) 1);
                p220Var2.j = zBooleanValue4;
                p220Var2.k = zBooleanValue5;
                p220Var2.l = zBooleanValue6;
                return p220Var2.invokeSuspend(Unit.f46060a);
            default:
                boolean zBooleanValue7 = bool.booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue9 = ((Boolean) obj3).booleanValue();
                p220 p220Var3 = new p220(i, (yje) obj4, (byte) 2);
                p220Var3.j = zBooleanValue7;
                p220Var3.k = zBooleanValue8;
                p220Var3.l = zBooleanValue9;
                return p220Var3.invokeSuspend(Unit.f46060a);
        }
    }
}
