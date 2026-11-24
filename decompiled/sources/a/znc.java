package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class znc extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ int j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ znc(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.i) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                znc zncVar = new znc(i, (yje) obj3, (byte) 0);
                zncVar.k = (List) obj;
                zncVar.j = iIntValue;
                return zncVar.invokeSuspend(Unit.f46060a);
            default:
                int iIntValue2 = ((Number) obj).intValue();
                znc zncVar2 = new znc(i, (yje) obj3, (byte) 1);
                zncVar2.j = iIntValue2;
                zncVar2.k = (wmm0) obj2;
                return zncVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                List list = (List) this.k;
                int i = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int size = list.size();
                if (size <= i) {
                    i = size;
                }
                return new Integer(i);
            default:
                int i2 = this.j;
                wmm0 wmm0Var = (wmm0) this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return new jqg(wmm0Var.f39414a, wmm0Var.b, wmm0Var.c, i2, wmm0Var.d, wmm0Var.e, wmm0Var.f, wmm0Var.g, wmm0Var.h);
        }
    }
}
