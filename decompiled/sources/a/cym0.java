package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xplatform.sportgame.subgames.impl.presentation.models.SelectedTabState;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cym0 extends rer implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5185a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cym0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f5185a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        cjr0 cjr0Var;
        byte b = this.f5185a;
        SelectedTabState.PositionHandled positionHandled = SelectedTabState.PositionHandled.f47017a;
        byte b2 = 6;
        byte b3 = 21;
        byte b4 = 1;
        byte b5 = 0;
        yje yjeVar = null;
        switch (b) {
            case 0:
                p7m0 p7m0Var = ((dzm0) this.receiver).m;
                p7m0Var.getClass();
                p7m0Var.o(null, positionHandled);
                return Unit.f46060a;
            case 1:
                p7m0 p7m0Var2 = ((dzm0) this.receiver).m;
                p7m0Var2.getClass();
                p7m0Var2.o(null, positionHandled);
                return Unit.f46060a;
            case 2:
                zyn0 zyn0Var = (zyn0) this.receiver;
                zyn0Var.H(new acm0(b3));
                zyn0Var.T();
                zyn0Var.H(new acm0((byte) 22));
                zyn0Var.Q();
                zyn0Var.P(true);
                zyn0Var.V();
                return Unit.f46060a;
            case 3:
                return ((nfo0) this.receiver).p0();
            case 4:
                ((dk5) this.receiver).a();
                return Unit.f46060a;
            case 5:
                ((dk5) this.receiver).O();
                return Unit.f46060a;
            case 6:
                ((dk5) this.receiver).N();
                return Unit.f46060a;
            case 7:
                ((dk5) this.receiver).O();
                return Unit.f46060a;
            case 8:
                ((dk5) this.receiver).N();
                return Unit.f46060a;
            case 9:
                ((Function0) this.receiver).invoke();
                return Unit.f46060a;
            case 10:
                urp0 urp0Var = (urp0) this.receiver;
                urp0Var.getClass();
                urp0Var.A(j1i0.CLEAR, iun.f15405a);
                urp0Var.b.e("SELECTED_IDS", new crp0(xun.f41520a));
                return Unit.f46060a;
            case 11:
                urp0 urp0Var2 = (urp0) this.receiver;
                urp0Var2.getClass();
                urp0Var2.A(j1i0.DEFAULT, iun.f15405a);
                urp0Var2.b.e("SELECTED_IDS", new crp0(CollectionsKt.P0(urp0Var2.r)));
                return Unit.f46060a;
            case 12:
                urp0 urp0Var3 = (urp0) this.receiver;
                if (((erp0) urp0Var3.s.f40549a.getValue()) instanceof drp0) {
                    urp0Var3.y();
                }
                p7m0 p7m0Var3 = urp0Var3.p;
                p7m0Var3.getClass();
                p7m0Var3.o(null, orp0.f25746a);
                urp0Var3.z();
                return Unit.f46060a;
            case 13:
                fhq0 fhq0Var = (fhq0) this.receiver;
                m6m0 m6m0Var = fhq0.q2;
                fhq0Var.U0();
                return Unit.f46060a;
            case 14:
                fhq0 fhq0Var2 = (fhq0) this.receiver;
                m6m0 m6m0Var2 = fhq0.q2;
                fhq0Var2.U0();
                return Unit.f46060a;
            case 15:
                fhq0 fhq0Var3 = (fhq0) this.receiver;
                m6m0 m6m0Var3 = fhq0.q2;
                Pair pair = fhq0Var3.o2;
                if (((ynq0) pair.f46059a).f42952a == -1 || ((ynq0) pair.b).f42952a == -1) {
                    fhq0Var3.U0();
                } else {
                    fhq0Var3.T0(ygq0.CUSTOM_DATE);
                }
                return Unit.f46060a;
            case 16:
                xtq0 xtq0Var = (xtq0) this.receiver;
                xtq0Var.C0.f(new gtq0(((smu) xtq0Var.Z.get()).a(), ((rmu) xtq0Var.a0.get()).a()));
                return Unit.f46060a;
            case 17:
                return ((q7r0) this.receiver).p0();
            case 18:
                return ((udr0) this.receiver).p0();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                njr0 njr0Var = (njr0) this.receiver;
                p7m0 p7m0Var4 = njr0Var.H;
                p7m0Var4.getClass();
                p7m0Var4.o(null, 10000L);
                njr0Var.A(true);
                return Unit.f46060a;
            case 20:
                p7m0 p7m0Var5 = ((njr0) this.receiver).G;
                do {
                    value = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value, cjr0.a((cjr0) value, null, null, false, 3)));
                return Unit.f46060a;
            case 21:
                p7m0 p7m0Var6 = ((njr0) this.receiver).G;
                do {
                    value2 = p7m0Var6.getValue();
                    cjr0Var = (cjr0) value2;
                } while (!p7m0Var6.m(value2, cjr0.a(cjr0Var, jjr0.a(cjr0Var.f4474a, null, 6), null, false, 6)));
                return Unit.f46060a;
            case 22:
                njr0 njr0Var2 = (njr0) this.receiver;
                njr0Var2.getClass();
                sac.V(jiu0.a(njr0Var2), new mjr0(1, njr0Var2, njr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, njr0Var2.b.b, new kjr0(njr0Var2, yjeVar, b2), 10);
                return Unit.f46060a;
            case 23:
                njr0 njr0Var3 = (njr0) this.receiver;
                njr0Var3.getClass();
                sac.V(jiu0.a(njr0Var3), new ddr0(1, njr0Var3, njr0.class, "handleMakeBetError", "handleMakeBetError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, njr0Var3.b.b, new kjr0(njr0Var3, yjeVar, (byte) 4), 10);
                return Unit.f46060a;
            case 24:
                ((njr0) this.receiver).x();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                njr0 njr0Var4 = (njr0) this.receiver;
                if ((((cjr0) njr0Var4.G.getValue()).b instanceof hjr0) && ((rkr0) njr0Var4.k.f10580a).s().size() != 0) {
                    njr0Var4.I.f(wir0.f39232a);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                njr0 njr0Var5 = (njr0) this.receiver;
                if (njr0Var5.i.f4960a.r().c != ulr0.NONE) {
                    njr0Var5.c.d(new rir0(njr0Var5, b4));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((njr0) this.receiver).I.f(vir0.f37494a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function0) this.receiver).invoke();
                return Unit.f46060a;
            default:
                cqs0 cqs0Var = (cqs0) this.receiver;
                cqs0Var.getClass();
                sac.V(jiu0.a(cqs0Var), new tps0(cqs0Var, b5), null, null, new meq0(cqs0Var, yjeVar, b3), 14);
                return Unit.f46060a;
        }
    }
}
