package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zzm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45262a;
    public final /* synthetic */ k6z b;
    public final /* synthetic */ jwm c;
    public final /* synthetic */ jwm d;

    public /* synthetic */ zzm(k6z k6zVar, jwm jwmVar, jwm jwmVar2, byte b) {
        this.f45262a = b;
        this.b = k6zVar;
        this.c = jwmVar;
        this.d = jwmVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f45262a;
        k6z k6zVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ulb.m(null, vjm.b, this.c, this.d, k6zVar == k6z.b, 0L, fetVar, 432, 65);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ulb.m(null, vjm.f37535a, this.c, this.d, k6zVar == k6z.b, 0L, fetVar2, 432, 65);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
