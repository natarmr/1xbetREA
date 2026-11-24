package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class azu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ long j;
    public final /* synthetic */ dj50 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azu(dj50 dj50Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dj50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                azu azuVar = new azu(this.k, yjeVar, (byte) 0);
                azuVar.j = ((Number) obj).longValue();
                return azuVar;
            default:
                azu azuVar2 = new azu(this.k, yjeVar, (byte) 1);
                azuVar2.j = ((Number) obj).longValue();
                return azuVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Number number = (Number) obj;
        switch (this.i) {
            case 0:
                return ((azu) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((azu) create(Long.valueOf(number.longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dj50 dj50Var = this.k;
        long j = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return dj50.a(dj50Var, dj50Var.f6166a + (j / 1000));
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return dj50.a(dj50Var, dj50Var.f6166a - (j / 1000));
        }
    }
}
