package a;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class yno extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ long j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yno(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.i) {
            case 0:
                long jLongValue = ((Number) obj2).longValue();
                yno ynoVar = new yno(i, (yje) obj3, (byte) 0);
                ynoVar.k = (fs20) obj;
                ynoVar.j = jLongValue;
                return ynoVar.invokeSuspend(Unit.f46060a);
            case 1:
                long jLongValue2 = ((Number) obj2).longValue();
                yno ynoVar2 = new yno(i, (yje) obj3, (byte) 1);
                ynoVar2.k = (Map) obj;
                ynoVar2.j = jLongValue2;
                return ynoVar2.invokeSuspend(Unit.f46060a);
            default:
                long jLongValue3 = ((Number) obj2).longValue();
                yno ynoVar3 = new yno(i, (yje) obj3, (byte) 2);
                ynoVar3.k = (String) obj;
                ynoVar3.j = jLongValue3;
                return ynoVar3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                fs20 fs20Var = (fs20) this.k;
                long j = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return new Pair(new Long(fs20Var.a()), new Long(j));
            case 1:
                Map map = (Map) this.k;
                long j2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                Set set = (Set) map.get(new Long(j2));
                List listA0 = set != null ? CollectionsKt.A0(set, new vvt((byte) 0)) : null;
                return listA0 == null ? iun.f15405a : listA0;
            default:
                String str = (String) this.k;
                long j3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                return new dxk0(str, j3);
        }
    }
}
