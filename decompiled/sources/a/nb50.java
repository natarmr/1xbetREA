package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nb50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23223a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nb50(int i, pdz pdzVar) {
        this.f23223a = (byte) 20;
        this.b = i;
        this.c = pdzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mb10 mb10Var;
        nk80 nk80Var;
        byte b = this.f23223a;
        int i = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ((ob50) obj3).a(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            case 1:
                lb10 lb10Var = (lb10) obj3;
                qu50 qu50Var = (qu50) obj2;
                ((oyg0) obj).getClass();
                qu50Var.getClass();
                int iOrdinal = lb10Var.ordinal();
                if (iOrdinal == 0) {
                    mb10Var = new mb10(lb10Var, null);
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    xuz xuzVar = pb10.c;
                    pb10 pb10Var = pb10.g;
                    xuzVar.getClass();
                    mb10Var = new mb10(lb10Var, new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                return qu50.a(qu50Var, null, mb10Var, null, 0, false, 59);
            case 2:
                mk80 mk80Var = (mk80) obj3;
                zv50 zv50Var = (zv50) obj2;
                ((oyg0) obj).getClass();
                zv50Var.getClass();
                int iOrdinal2 = mk80Var.ordinal();
                if (iOrdinal2 == 0) {
                    nk80Var = new nk80(mk80Var, null);
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var2 = pb10.g;
                    xuzVar2.getClass();
                    nk80Var = new nk80(mk80Var, new mdm(xuz.a(pb10Var2, i), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                return zv50.a(zv50Var, null, null, nk80Var, false, null, 0, false, false, false, false, 65527);
            case 3:
                ((Integer) obj2).getClass();
                xia0.I((hh80) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                oja0.J((m960) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 5:
                kk80 kk80Var = (kk80) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zmx zmxVarQ = kk80Var.b.b().q(i);
                    ((gk80) zmxVarQ.c).b.j(rk80.f30637a, Integer.valueOf(i - zmxVarQ.f44646a), fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 6:
                rs80 rs80Var = (rs80) obj2;
                ((oyg0) obj).getClass();
                rs80Var.getClass();
                return rs80.a(rs80Var, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, new Pair(Boolean.valueOf(Intrinsics.d(((FilterItemUi) obj3).getF46280a(), "0")), Integer.valueOf(i)), 67108863);
            case 7:
                ((Integer) obj2).getClass();
                gfx.u((efa0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                bww.j((hfa0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 9:
                Integer num = (Integer) obj;
                num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                ((xdr) obj3).F(Integer.valueOf(i), num, num2);
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                tfx.l((ajg0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).intValue();
                l8x.s((dqh0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                bdx.N((cum) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                vdx.B((eum) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                u7x.t((j3m0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                k5n0.f((pz40) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                ycm0.c((au6) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                aad.k((h1p0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).intValue();
                zcm0.b((tlp0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                qsm0.j((r0q0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 20:
                pdz pdzVar = (pdz) obj3;
                boolean z = false;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if ((iIntValue2 & 3) != 2) {
                    z = true;
                }
                if (fetVar2.U(iIntValue2 & 1, z)) {
                    i4w0.J(null, this.b, pdzVar, fetVar2, 0, 1);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                mym0.e((uy6) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                pym0.e((vy6) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 23:
                wpr0 wpr0Var = (wpr0) obj3;
                a8z a8zVar = wpr0Var.O1;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s9m0 s9m0Var = wpr0.P1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oja0.T((k3t0) a8zVar.getValue(), i, fetVar3, 0);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI = fetVar3.i(wpr0Var);
                    Object objP = fetVar3.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        mjr0 mjr0Var = new mjr0(1, wpr0Var, wpr0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/toto_jackpot/impl/presentation/compose/jackpot/udf/TotoJackpotSideEffect;)V", 0, (byte) 4);
                        fetVar3.o0(mjr0Var);
                        objP = mjr0Var;
                    }
                    clz clzVar = (clz) fetVar3.k(or00.f25714a);
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar3);
                    boolean zI2 = fetVar3.i(k3t0Var) | fetVar3.i(clzVar) | fetVar3.e(3) | fetVar3.g(pz40VarF);
                    Object objP2 = fetVar3.P();
                    if (zI2 || objP2 == cl5Var) {
                        kc70 kc70Var = new kc70(k3t0Var, clzVar, pz40VarF, null, (byte) 27);
                        fetVar3.o0(kc70Var);
                        objP2 = kc70Var;
                    }
                    m0x0.t(fetVar3, clzVar, (Function2) objP2);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 24:
                urr0 urr0Var = (urr0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                j6m0 j6m0Var = urr0.O1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ffb0.I((k3t0) urr0Var.N1.getValue(), i, fetVar4, 8);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                c5n0 c5n0Var = (c5n0) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zq8.a(0, fetVar5, o7k0.e(o7k0.d(jm40.b, 1.0f), c5n0Var.r0(i)));
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                qem0.f((brq0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                dem0.i((z2k0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                pvm0.j((lss0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                vbw0.N((kts0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ nb50(uy6 uy6Var, int i) {
        this.f23223a = (byte) 21;
        this.c = uy6Var;
        this.b = i;
    }

    public /* synthetic */ nb50(vy6 vy6Var, int i) {
        this.f23223a = (byte) 22;
        this.c = vy6Var;
        this.b = i;
    }

    public /* synthetic */ nb50(pz40 pz40Var, int i) {
        this.f23223a = (byte) 15;
        this.c = pz40Var;
        this.b = i;
    }

    public /* synthetic */ nb50(h1p0 h1p0Var, int i) {
        this.f23223a = (byte) 17;
        this.c = h1p0Var;
        this.b = i;
    }

    public /* synthetic */ nb50(r0q0 r0q0Var, int i) {
        this.f23223a = (byte) 19;
        this.c = r0q0Var;
        this.b = i;
    }

    public /* synthetic */ nb50(brq0 brq0Var, int i) {
        this.f23223a = (byte) 26;
        this.c = brq0Var;
        this.b = i;
    }

    public /* synthetic */ nb50(lss0 lss0Var, int i) {
        this.f23223a = (byte) 28;
        this.c = lss0Var;
        this.b = i;
    }

    public /* synthetic */ nb50(kts0 kts0Var, int i) {
        this.f23223a = (byte) 29;
        this.c = kts0Var;
        this.b = i;
    }

    public /* synthetic */ nb50(Object obj, int i, byte b) {
        this.f23223a = b;
        this.c = obj;
        this.b = i;
    }
}
