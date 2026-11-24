package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hs40 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13562a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs40(Object obj, Object obj2, byte b) {
        super(2);
        this.f13562a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13562a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                long j = ((ne60) obj2).f23370a;
                dqm0.l((j6u0) obj4, (dpa0) obj);
                ((htb) obj3).f(new js40(true, j, 0L));
                break;
            default:
                fet fetVar = (fet) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && fetVar.D()) {
                    fetVar.X();
                } else {
                    ((ugd) obj4).F((nt40) obj3, fetVar, 0);
                }
                break;
        }
        return Unit.f46060a;
    }
}
