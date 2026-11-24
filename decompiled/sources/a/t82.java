package a;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class t82 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t82(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = 3;
        Boolean bool = (Boolean) obj;
        switch (this.i) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                t82 t82Var = new t82(b, (yje) obj3, (byte) 0);
                t82Var.j = zBooleanValue;
                t82Var.k = zBooleanValue2;
                return t82Var.invokeSuspend(Unit.f46060a);
            case 1:
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                t82 t82Var2 = new t82(b, (yje) obj3, (byte) 1);
                t82Var2.j = zBooleanValue3;
                t82Var2.k = zBooleanValue4;
                return t82Var2.invokeSuspend(Unit.f46060a);
            case 2:
                boolean zBooleanValue5 = bool.booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                t82 t82Var3 = new t82(b, (yje) obj3, (byte) 2);
                t82Var3.j = zBooleanValue5;
                t82Var3.k = zBooleanValue6;
                return t82Var3.invokeSuspend(Unit.f46060a);
            case 3:
                boolean zBooleanValue7 = bool.booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                t82 t82Var4 = new t82(b, (yje) obj3, b);
                t82Var4.j = zBooleanValue7;
                t82Var4.k = zBooleanValue8;
                return t82Var4.invokeSuspend(Unit.f46060a);
            case 4:
                boolean zBooleanValue9 = bool.booleanValue();
                boolean zBooleanValue10 = ((Boolean) obj2).booleanValue();
                t82 t82Var5 = new t82(b, (yje) obj3, (byte) 4);
                t82Var5.j = zBooleanValue9;
                t82Var5.k = zBooleanValue10;
                return t82Var5.invokeSuspend(Unit.f46060a);
            default:
                boolean zBooleanValue11 = bool.booleanValue();
                boolean zBooleanValue12 = ((Boolean) obj2).booleanValue();
                t82 t82Var6 = new t82(b, (yje) obj3, (byte) 5);
                t82Var6.j = zBooleanValue11;
                t82Var6.k = zBooleanValue12;
                return t82Var6.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.i) {
            case 0:
                boolean z2 = this.j;
                boolean z3 = this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(z2 ? z3 : true);
            case 1:
                boolean z4 = this.j;
                boolean z5 = this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(z4 || z5);
            case 2:
                boolean z6 = this.j;
                boolean z7 = this.k;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z6 && z7) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                boolean z8 = this.j;
                boolean z9 = this.k;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                return new Pair(Boolean.valueOf(z8), Boolean.valueOf(z9));
            case 4:
                boolean z10 = this.j;
                boolean z11 = this.k;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (z10 && !z11) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                boolean z12 = this.j;
                boolean z13 = this.k;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(!z12 || z13);
        }
    }
}
