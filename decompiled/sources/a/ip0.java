package a;

import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ip0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15140a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ip0(mm40 mm40Var, uzm uzmVar, uzm uzmVar2, mpm mpmVar, boolean z, int i) {
        this.f15140a = (byte) 17;
        uso0 uso0Var = uso0.f36223a;
        this.b = mm40Var;
        this.d = uzmVar;
        this.e = uzmVar2;
        this.f = mpmVar;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15140a;
        boolean z = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                nia0.H((mm40) obj6, (String) obj5, (m0x) obj4, this.c, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                knx.j((mm40) obj6, (pz40) obj5, this.c, (hh80) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ay3.h((mm40) obj6, (z77) obj5, this.c, (Function0) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                vbw0.k((mm40) obj6, (ey8) obj5, (d9z) obj4, this.c, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                hmw0.l((mm40) obj6, (cy8) obj5, (d9z) obj4, this.c, (Function1) obj3, (fet) obj, x8x.L(7));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ju70.k((mm40) obj6, (imm) obj5, this.c, (Function0) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                kj5 kj5Var = xnb.w2;
                ((xnb) obj5).P0((mm40) obj6, this.c, (Function0) obj3, (Function0) obj4, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                rcb.j((mm40) obj6, (on5) obj5, (Function0) obj3, (Function0) obj4, (fet) obj, x8x.L(1), this.c ? 1 : 0);
                break;
            case 8:
                Calendar calendar = (Calendar) obj6;
                jej jejVar = (jej) obj5;
                Function1 function1 = (Function1) obj4;
                omv omvVar = (omv) obj3;
                long jLongValue = ((Long) obj).longValue();
                ((yk9) obj2).getClass();
                if (z) {
                    calendar.getClass();
                    SimpleDate simpleDateG0 = bsr0.g0(jLongValue, calendar);
                    DateRangeModel dateRangeModelA = jejVar.a();
                    int i = jejVar.d;
                    Integer num = jejVar.e;
                    SimpleDate simpleDate = jejVar.b;
                    SimpleDate simpleDate2 = jejVar.c;
                    if (bsr0.W(simpleDateG0, simpleDate) >= 0 && bsr0.W(simpleDateG0, simpleDate2) <= 0) {
                        SimpleDate simpleDate3 = dateRangeModelA.f47284a;
                        SimpleDate simpleDate4 = dateRangeModelA.b;
                        if (simpleDate3 == null || simpleDate4 != null || bsr0.W(simpleDateG0, simpleDate3) <= 0) {
                            dateRangeModelA = new DateRangeModel(simpleDateG0, null);
                        } else {
                            int iR = sj3.R(simpleDate3, simpleDateG0, calendar) + 1;
                            dateRangeModelA = ((iR < i) == true || (iR > num.intValue())) ? null : new DateRangeModel(simpleDate3, simpleDateG0);
                        }
                    }
                    if (dateRangeModelA != null) {
                        if (!dateRangeModelA.equals(jejVar.a())) {
                            jejVar.f.setValue(dateRangeModelA);
                            function1.invoke(dateRangeModelA);
                            ckb.a0(omvVar, 3);
                        }
                    }
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                gq80.r((mm40) obj6, (String) obj5, (y9q0) obj4, (String) obj3, this.c, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                obb.G((mm40) obj6, (d2m) obj4, (x1m) obj3, (String) obj5, this.c, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                dub.S((mm40) obj6, (ivm) obj5, (ivm) obj4, (mpm) obj3, this.c, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                wvb.E((mm40) obj6, (jvm) obj5, (jvm) obj4, (a2m) obj3, this.c, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                jwb.w((mm40) obj6, (kvm) obj5, (kvm) obj4, (a2m) obj3, this.c, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                dyb.c((mm40) obj6, (vum) obj5, (vum) obj4, (a2m) obj3, this.c, (fet) obj, x8x.L(7));
                break;
            case 15:
                ((Integer) obj2).getClass();
                twm.b((mm40) obj6, (String) obj5, (dkk) obj4, (String) obj3, this.c, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                bkb.s((mm40) obj6, (String) obj5, (c280) obj4, (String) obj3, this.c, (fet) obj, x8x.L(1));
                break;
            case 17:
                uso0 uso0Var = uso0.f36223a;
                ((Integer) obj2).getClass();
                jiq0.O((mm40) obj6, (uzm) obj5, (uzm) obj4, (mpm) obj3, this.c, (fet) obj, x8x.L(1));
                break;
            case 18:
                uso0 uso0Var2 = uso0.f36223a;
                ((Integer) obj2).getClass();
                fxb.x((mm40) obj6, (xzm) obj5, (xzm) obj4, (a2m) obj3, this.c, (fet) obj, x8x.L(1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                uso0 uso0Var3 = uso0.f36223a;
                ((Integer) obj2).getClass();
                dyb.E((mm40) obj6, (yzm) obj5, (yzm) obj4, (a2m) obj3, this.c, (fet) obj, x8x.L(1));
                break;
            case 20:
                mm40 mm40Var = (mm40) obj6;
                b1n b1nVar = (b1n) obj5;
                a2m a2mVar = (a2m) obj4;
                b1n b1nVar2 = (b1n) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 80.0f);
                    thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    fbc.G(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), b1nVar, true, fetVar, 384);
                    obb.q(null, a2mVar, this.c, fetVar, 0, 1);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    fbc.G(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), b1nVar2, false, fetVar, 384);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                bsr0.G((mm40) obj6, (c1n) obj5, (c1n) obj4, (a2m) obj3, this.c, (fet) obj, x8x.L(1));
                break;
            case 22:
                mie0 mie0Var = (mie0) obj6;
                kie0 kie0Var = (kie0) obj5;
                sso0 sso0Var = (sso0) obj4;
                List list = (List) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fetVar2.e0(-1960217670);
                    Iterator it = ((Iterable) mie0Var.f21842a).iterator();
                    while (it.hasNext()) {
                        j6n.h((String) list.get(((Number) it.next()).intValue()), sso0Var, null, 0, 0, fetVar2, 0, 28);
                    }
                    fetVar2.r(false);
                    if (kie0Var.f18333a > 0) {
                        fetVar2.e0(-1960214581);
                        int i2 = kie0Var.f18333a;
                        String strE = (z ? by7.e : by7.d).e("+ " + i2);
                        strE.getClass();
                        j6n.h(strE, sso0Var, null, 0, 0, fetVar2, 0, 28);
                    } else {
                        fetVar2.e0(-637030102);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                azw.e((mm40) obj6, (jam0) obj5, (ehm0) obj4, this.c, (Function1) obj3, (fet) obj, x8x.L(49));
                break;
            case 24:
                ((Integer) obj2).getClass();
                x1x.a((s820) obj6, this.c, (qn8) obj5, (Function0) obj3, (Function0) obj4, (fet) obj, x8x.L(7));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                ucx.x((mm40) obj6, this.c, (String) obj5, (String) obj4, (String) obj3, (fet) obj, x8x.L(49));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ju70.z((mm40) obj6, (l7m0) obj5, (Fragment) obj4, this.c, (Function1) obj3, (fet) obj, x8x.L(7));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                gq80.H((Fragment) obj6, (l7m0) obj5, (w2d) obj4, this.c, (Function1) obj3, (fet) obj, x8x.L(Response.MESSAGE_TOO_LARGE));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                q0x.u((Function1) obj5, (Function1) obj4, (ehm0) obj3, this.c, (mm40) obj6, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                q0x.E((a4x) obj6, (a4x) obj5, (xcz) obj4, this.c, (Function1) obj3, (fet) obj, x8x.L(24577));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ip0(byte b, int i, mm40 mm40Var, Object obj, Object obj2, Object obj3, boolean z) {
        this.f15140a = b;
        this.b = mm40Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = z;
    }

    public /* synthetic */ ip0(xnb xnbVar, mm40 mm40Var, boolean z, Function0 function0, Function0 function1, int i) {
        this.f15140a = (byte) 6;
        this.d = xnbVar;
        this.b = mm40Var;
        this.c = z;
        this.f = function0;
        this.e = function1;
    }

    public /* synthetic */ ip0(s820 s820Var, boolean z, qn8 qn8Var, Function0 function0, Function0 function1, int i) {
        this.f15140a = (byte) 24;
        this.b = s820Var;
        this.c = z;
        this.d = qn8Var;
        this.f = function0;
        this.e = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ip0(mm40 mm40Var, on5 on5Var, Function0 function0, Function0 function1, int i, int i2) {
        this.f15140a = (byte) 7;
        this.b = mm40Var;
        this.d = on5Var;
        this.f = function0;
        this.e = function1;
        this.c = i2;
    }

    public /* synthetic */ ip0(mm40 mm40Var, d2m d2mVar, x1m x1mVar, String str, boolean z, int i) {
        this.f15140a = (byte) 10;
        this.b = mm40Var;
        this.e = d2mVar;
        this.f = x1mVar;
        this.d = str;
        this.c = z;
    }

    public /* synthetic */ ip0(byte b, int i, wdr wdrVar, Object obj, Object obj2, Object obj3, boolean z) {
        this.f15140a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = z;
        this.f = wdrVar;
    }

    public /* synthetic */ ip0(mm40 mm40Var, xzm xzmVar, xzm xzmVar2, a2m a2mVar, boolean z, int i) {
        this.f15140a = (byte) 18;
        uso0 uso0Var = uso0.f36223a;
        this.b = mm40Var;
        this.d = xzmVar;
        this.e = xzmVar2;
        this.f = a2mVar;
        this.c = z;
    }

    public /* synthetic */ ip0(mm40 mm40Var, yzm yzmVar, yzm yzmVar2, a2m a2mVar, boolean z, int i) {
        this.f15140a = (byte) 19;
        uso0 uso0Var = uso0.f36223a;
        this.b = mm40Var;
        this.d = yzmVar;
        this.e = yzmVar2;
        this.f = a2mVar;
        this.c = z;
    }

    public /* synthetic */ ip0(mm40 mm40Var, b1n b1nVar, a2m a2mVar, boolean z, b1n b1nVar2) {
        this.f15140a = (byte) 20;
        this.b = mm40Var;
        this.d = b1nVar;
        this.e = a2mVar;
        this.c = z;
        this.f = b1nVar2;
    }

    public /* synthetic */ ip0(mm40 mm40Var, pz40 pz40Var, boolean z, hh80 hh80Var, Function1 function1, int i) {
        this.f15140a = (byte) 1;
        this.b = mm40Var;
        this.d = pz40Var;
        this.c = z;
        this.e = hh80Var;
        this.f = function1;
    }

    public /* synthetic */ ip0(mm40 mm40Var, Object obj, boolean z, Function0 function0, wdr wdrVar, int i, byte b) {
        this.f15140a = b;
        this.b = mm40Var;
        this.d = obj;
        this.c = z;
        this.f = function0;
        this.e = wdrVar;
    }

    public /* synthetic */ ip0(mm40 mm40Var, boolean z, String str, String str2, String str3, int i) {
        this.f15140a = (byte) 25;
        this.b = mm40Var;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public /* synthetic */ ip0(mie0 mie0Var, kie0 kie0Var, boolean z, sso0 sso0Var, List list) {
        this.f15140a = (byte) 22;
        this.b = mie0Var;
        this.d = kie0Var;
        this.c = z;
        this.e = sso0Var;
        this.f = list;
    }

    public /* synthetic */ ip0(Function1 function1, Function1 function2, ehm0 ehm0Var, boolean z, mm40 mm40Var, int i) {
        this.f15140a = (byte) 28;
        this.d = function1;
        this.e = function2;
        this.f = ehm0Var;
        this.c = z;
        this.b = mm40Var;
    }

    public /* synthetic */ ip0(boolean z, Calendar calendar, jej jejVar, Function1 function1, omv omvVar) {
        this.f15140a = (byte) 8;
        this.c = z;
        this.b = calendar;
        this.d = jejVar;
        this.e = function1;
        this.f = omvVar;
    }
}
