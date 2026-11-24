package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.feature.promo_aggregator.impl.navigation.PromoCheckAggregatorFragmentScreen;
import org.xplatform.onboarding.impl.navigation.OnBoardingScreens$TipsDialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class og1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25194a;
    public final /* synthetic */ mh1 b;

    public /* synthetic */ og1(mh1 mh1Var, byte b) {
        this.f25194a = b;
        this.b = mh1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        byte b = this.f25194a;
        mh1 mh1Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                mh1Var.G(if1.f14663a);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                mh1Var.U.b(th, new yr0(th, (byte) 4));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                mh1Var.U.b(th2, new yr0(th2, (byte) 5));
                break;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                p7m0 p7m0Var = mh1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    mh1Var.f.getClass();
                } while (!p7m0Var.m(value, pf1.a((pf1) value, null, 0, 0, false, 0L, null, false, null, null, a6c0.f312a, null, null, null, false, null, false, -134217729, 15)));
                mh1Var.T(th3);
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                p7m0 p7m0Var2 = mh1Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    mh1Var.f.getClass();
                } while (!p7m0Var2.m(value2, pf1.a((pf1) value2, null, 0, 0, false, 0L, null, false, null, vuc0.f38042a, null, null, null, null, false, null, false, -67108865, 15)));
                mh1Var.T(th4);
                break;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                p7m0 p7m0Var3 = mh1Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    mh1Var.f.getClass();
                } while (!p7m0Var3.m(value3, pf1.a((pf1) value3, null, 0, 0, false, 0L, null, false, null, null, null, ttc0.f34505a, null, null, false, null, false, -268435457, 15)));
                mh1Var.T(th5);
                break;
            case 6:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                mh1Var.T(th6);
                break;
            case 7:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                mh1Var.U.b(th7, new g20((byte) 26));
                break;
            case 8:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                p7m0 p7m0Var4 = mh1Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    mh1Var.f.getClass();
                } while (!p7m0Var4.m(value4, pf1.a((pf1) value4, null, 0, 0, false, 0L, null, false, jlc0.f16709a, null, null, null, null, null, false, null, false, -16777217, 15)));
                mh1Var.T(th8);
                break;
            case 9:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                roq0 roq0Var = mh1Var.L;
                uuz uuzVar = fk60.b;
                je1.S1.getClass();
                String str = je1.V1;
                roq0Var.getClass();
                str.getClass();
                k0w0Var.h(new OnBoardingScreens$TipsDialogScreen(17, str));
                break;
            case 10:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                mh1Var.U.b(th9, new g20((byte) 28));
                break;
            case 11:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var5 = mh1Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                    mh1Var.f.getClass();
                } while (!p7m0Var5.m(value5, pf1.a((pf1) value5, null, 0, 0, false, 0L, null, false, null, null, null, null, null, null, false, pb0Var.f26680a, false, -1, 14)));
                break;
            case 12:
                mh1Var.U.b((Throwable) obj, new xg1((byte) 0));
                break;
            default:
                jh70 jh70Var = mh1Var.P;
                int i = ((pf1) mh1Var.D()).p;
                int i2 = ((pf1) mh1Var.D()).q;
                jh70Var.getClass();
                c8d c8dVar = (c8d) ((k0w0) obj).h(new PromoCheckAggregatorFragmentScreen(i, i2)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(!((pf1) mh1Var.D()).r, bjkVar, bjkVar);
                break;
        }
        return Unit.f46060a;
    }
}
