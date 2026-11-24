package a;

import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;
import org.xplatform.login.new_place.api.navigation.SmsCodeExtras;
import org.xplatform.login.new_place.impl.navigation.ConfirmationNewPlaceScreen;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.SocialStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CityStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.DocumentStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.RegionStateModel;
import org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams;
import org.xplatform.security.api.presentation.models.SendEmailIntention;
import org.xplatform.security.impl.presentation.email.confirmation.screen.SendConfirmationEmailScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xwe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41606a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xwe0(dq00 dq00Var, u0f0 u0f0Var) {
        this.f41606a = (byte) 2;
        this.b = dq00Var;
        this.c = u0f0Var;
    }

    private final Object a(Object obj) {
        g090 g090Var = (g090) this.c;
        u0f0 u0f0Var = (u0f0) this.b;
        u4f0 u4f0Var = (u4f0) obj;
        u4f0Var.getClass();
        r1f0 r1f0Var = u4f0Var.g;
        List listC = kotlin.collections.a.c(u0f0Var);
        g090Var.getClass();
        Map mapF = g090.f(u4f0Var, listC);
        vzg0 vzg0Var = (vzg0) g090Var.f10448a;
        int iOrdinal = u0f0Var.ordinal();
        if (iOrdinal == 29) {
            r1f0 r1f0VarA = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, r1f0Var.s, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -262145, 127);
            vzg0Var.e(u0f0Var.name(), r1f0VarA.s);
            return new Pair(r1f0VarA, mapF);
        }
        if (iOrdinal == 30) {
            r1f0 r1f0VarA2 = r1f0.a(r1f0Var, null, !r1f0Var.b, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -3, 127);
            vzg0Var.e(u0f0Var.name(), Boolean.valueOf(r1f0VarA2.b));
            return new Pair(r1f0VarA2, mapF);
        }
        if (iOrdinal == 38) {
            r1f0 r1f0VarA3 = r1f0.a(r1f0Var, null, false, null, null, false, !r1f0Var.f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -33, 127);
            vzg0Var.e(u0f0Var.name(), Boolean.valueOf(r1f0VarA3.f));
            return new Pair(r1f0VarA3, mapF);
        }
        if (iOrdinal == 39) {
            r1f0 r1f0VarA4 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, !r1f0Var.L, null, -1, 95);
            vzg0Var.e(u0f0Var.name(), Boolean.valueOf(r1f0VarA4.L));
            return new Pair(r1f0VarA4, mapF);
        }
        switch (iOrdinal) {
            case 22:
                r1f0 r1f0VarA5 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, !r1f0Var.B, false, null, null, null, false, null, null, null, false, false, null, -134217729, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(r1f0VarA5.B));
                return new Pair(r1f0VarA5, mapF);
            case 23:
                r1f0 r1f0VarA6 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, !r1f0Var.A, false, false, null, null, null, false, null, null, null, false, false, null, -67108865, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(r1f0VarA6.A));
                return new Pair(r1f0VarA6, mapF);
            case 24:
                r1f0 r1f0VarA7 = r1f0.a(r1f0Var, null, false, null, null, !r1f0Var.e, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -17, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(r1f0VarA7.e));
                return new Pair(r1f0VarA7, mapF);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                r1f0 r1f0VarA8 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, !r1f0Var.C, null, null, null, false, null, null, null, false, false, null, -268435457, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(r1f0VarA8.C));
                return new Pair(r1f0VarA8, mapF);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                r1f0 r1f0VarA9 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, !r1f0Var.x, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -8388609, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(r1f0VarA9.x));
                return new Pair(r1f0VarA9, mapF);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                r1f0 r1f0VarA10 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, !r1f0Var.y, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -16777217, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(r1f0VarA10.y));
                return new Pair(r1f0VarA10, mapF);
            default:
                return new Pair(r1f0Var, u4f0Var.e);
        }
    }

    private final Object b(Object obj) {
        q7f0 q7f0Var = (q7f0) this.c;
        g090 g090Var = (g090) this.b;
        u4f0 u4f0Var = (u4f0) obj;
        u4f0Var.getClass();
        r1f0 r1f0VarA = r1f0.a(u4f0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, q7f0Var, -1, 63);
        ((vzg0) g090Var.f10448a).e("REGISTRATION_TYPE", r1f0VarA.M);
        return new Pair(r1f0VarA, u4f0Var.e);
    }

    private final Object c(Object obj) {
        PhoneStateModel phoneStateModel;
        rkt rktVar = (rkt) this.c;
        cm90 cm90Var = rktVar.h;
        g090 g090Var = (g090) this.b;
        u4f0 u4f0Var = (u4f0) obj;
        u4f0Var.getClass();
        r1f0 r1f0Var = u4f0Var.g;
        PhoneStateModel phoneStateModel2 = r1f0Var.r;
        String str = rktVar.c;
        if (phoneStateModel2 != null) {
            String strK = kng0.k("+", str);
            String str2 = cm90Var.d;
            str2.getClass();
            phoneStateModel = new PhoneStateModel("", strK, str2);
        } else {
            phoneStateModel = new PhoneStateModel("", kng0.k("+", str), cm90Var.d);
        }
        r1f0 r1f0VarA = r1f0.a(r1f0Var, null, false, null, null, false, false, new CountryStateModel(rktVar.f30664a, rktVar.e, rktVar.b, rktVar.f, rktVar.d), null, null, null, null, null, null, null, null, null, null, phoneStateModel, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -131137, 127);
        List listJ = q3d.j(u0f0.d, u0f0.h);
        g090Var.getClass();
        Map mapF = g090.f(u4f0Var, listJ);
        vzg0 vzg0Var = (vzg0) g090Var.f10448a;
        vzg0Var.e("COUNTRY", r1f0VarA.g);
        vzg0Var.e("PHONE", r1f0VarA.r);
        return new Pair(r1f0VarA, mapF);
    }

    private final Object g(Object obj) {
        igt igtVar = (igt) this.c;
        g090 g090Var = (g090) this.b;
        u4f0 u4f0Var = (u4f0) obj;
        u4f0Var.getClass();
        r1f0 r1f0VarA = r1f0.a(u4f0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, Integer.valueOf(igtVar.f14750a), false, null, null, null, false, false, null, Integer.MAX_VALUE, 127);
        List listC = kotlin.collections.a.c(u0f0.r);
        g090Var.getClass();
        Map mapF = g090.f(u4f0Var, listC);
        ((vzg0) g090Var.f10448a).e(CommonConstant.RETKEY.GENDER, r1f0VarA.F);
        return new Pair(r1f0VarA, mapF);
    }

    private final Object h(Object obj) {
        SocialStateModel socialStateModel = (SocialStateModel) this.c;
        g090 g090Var = (g090) this.b;
        u4f0 u4f0Var = (u4f0) obj;
        u4f0Var.getClass();
        r1f0 r1f0VarA = r1f0.a(u4f0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, socialStateModel, null, false, null, null, null, false, false, null, -1073741825, 127);
        List listC = kotlin.collections.a.c(u0f0.j);
        g090Var.getClass();
        Map mapF = g090.f(u4f0Var, listC);
        ((vzg0) g090Var.f10448a).e("SOCIAL", r1f0VarA.E);
        return new Pair(r1f0VarA, mapF);
    }

    private final Object i(Object obj) {
        byte b;
        x5f0 x5f0Var = (x5f0) this.c;
        qu4 qu4Var = (qu4) this.b;
        k0w0 k0w0Var = (k0w0) obj;
        k0w0Var.getClass();
        sek sekVar = x5f0Var.o;
        String str = ((u4f0) x5f0Var.D()).g.k;
        String str2 = str == null ? "" : str;
        String str3 = ((u4f0) x5f0Var.D()).g.u;
        String str4 = str3 == null ? "" : str3;
        q7f0 q7f0Var = ((u4f0) x5f0Var.D()).g.M;
        if (q7f0Var != null) {
            b = q7f0Var.f28247a;
        } else {
            gne0 gne0Var = q7f0.b;
            b = 1;
        }
        byte b2 = b;
        CountryStateModel countryStateModel = ((u4f0) x5f0Var.D()).g.g;
        long j = countryStateModel != null ? countryStateModel.f46853a : -1;
        CountryStateModel countryStateModel2 = ((u4f0) x5f0Var.D()).g.g;
        String str5 = countryStateModel2 != null ? countryStateModel2.b : null;
        String str6 = str5 == null ? "" : str5;
        CurrencyStateModel currencyStateModel = ((u4f0) x5f0Var.D()).g.h;
        String str7 = currencyStateModel != null ? currencyStateModel.b : null;
        String str8 = str7 == null ? "" : str7;
        BonusStateModel bonusStateModel = ((u4f0) x5f0Var.D()).g.c;
        String str9 = bonusStateModel != null ? bonusStateModel.b : null;
        String str10 = str9 == null ? "" : str9;
        CountryStateModel countryStateModel3 = ((u4f0) x5f0Var.D()).g.g;
        String str11 = countryStateModel3 != null ? countryStateModel3.e : null;
        ConfirmSendEmailScreenParams.Registration registration = new ConfirmSendEmailScreenParams.Registration(new SendEmailIntention.Registration(str2, str4, b2, str6, str8, str10, j, str11 == null ? "" : str11, ((u4f0) x5f0Var.D()).A.f4650a, ((u4f0) x5f0Var.D()).g.D), new swp0(qu4Var.f29330a, qu4Var.b, false));
        sekVar.getClass();
        k0w0Var.h(new SendConfirmationEmailScreen(registration));
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        ConfirmationNewPlaceScreenType smsCode;
        d7f0 d7f0Var = (d7f0) this.c;
        fn50 fn50Var = (fn50) this.b;
        k0w0 k0w0Var = (k0w0) obj;
        k0w0Var.getClass();
        kwd kwdVar = d7f0Var.I;
        String str = fn50Var.b;
        String str2 = fn50Var.f;
        if (fn50Var.d) {
            smsCode = new ConfirmationNewPlaceScreenType.Authenticator(str, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", str2, fn50Var.c);
        } else {
            smsCode = fn50Var.e ? new ConfirmationNewPlaceScreenType.SmsCode(str, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", str2, SmsCodeExtras.None.f46760a) : new ConfirmationNewPlaceScreenType.Simple(str, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", str2, fn50Var.g);
        }
        kwdVar.getClass();
        k0w0Var.h(new ConfirmationNewPlaceScreen(smsCode));
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        Function0 function0 = (Function0) this.c;
        i3t0 i3t0Var = (i3t0) this.b;
        x7f0 x7f0Var = (x7f0) obj;
        x7f0Var.getClass();
        if (!x7f0Var.equals(x7f0.f40411a)) {
            t9f.b();
            return null;
        }
        function0.invoke();
        i3t0Var.x(r7f0.f29972a);
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        j910 j910Var = (j910) this.c;
        u0f0 u0f0Var = (u0f0) this.b;
        mbf0 mbf0Var = (mbf0) obj;
        mbf0Var.getClass();
        p1f0 p1f0Var = mbf0Var.g;
        List listC = kotlin.collections.a.c(u0f0Var);
        j910Var.getClass();
        Map mapE = j910.e(mbf0Var, listC);
        vzg0 vzg0Var = (vzg0) j910Var.b;
        int iOrdinal = u0f0Var.ordinal();
        if (iOrdinal == 29) {
            p1f0 p1f0VarA = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, p1f0Var.s, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -262145, 127);
            vzg0Var.e(u0f0Var.name(), p1f0VarA.s);
            return new Pair(p1f0VarA, mapE);
        }
        if (iOrdinal == 30) {
            p1f0 p1f0VarA2 = p1f0.a(p1f0Var, null, !p1f0Var.b, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -3, 127);
            vzg0Var.e(u0f0Var.name(), Boolean.valueOf(p1f0VarA2.b));
            return new Pair(p1f0VarA2, mapE);
        }
        if (iOrdinal == 38) {
            p1f0 p1f0VarA3 = p1f0.a(p1f0Var, null, false, null, null, false, !p1f0Var.f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -33, 127);
            vzg0Var.e(u0f0Var.name(), Boolean.valueOf(p1f0VarA3.f));
            return new Pair(p1f0VarA3, mapE);
        }
        if (iOrdinal == 39) {
            p1f0 p1f0VarA4 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, !p1f0Var.L, null, -1, 95);
            vzg0Var.e(u0f0Var.name(), Boolean.valueOf(p1f0VarA4.L));
            return new Pair(p1f0VarA4, mapE);
        }
        switch (iOrdinal) {
            case 22:
                p1f0 p1f0VarA5 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, !p1f0Var.B, false, null, null, null, false, false, null, null, false, false, null, -134217729, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(p1f0VarA5.B));
                return new Pair(p1f0VarA5, mapE);
            case 23:
                p1f0 p1f0VarA6 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, !p1f0Var.A, false, false, null, null, null, false, false, null, null, false, false, null, -67108865, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(p1f0VarA6.A));
                return new Pair(p1f0VarA6, mapE);
            case 24:
                p1f0 p1f0VarA7 = p1f0.a(p1f0Var, null, false, null, null, !p1f0Var.e, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -17, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(p1f0VarA7.e));
                return new Pair(p1f0VarA7, mapE);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                p1f0 p1f0VarA8 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, !p1f0Var.C, null, null, null, false, false, null, null, false, false, null, -268435457, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(p1f0VarA8.C));
                return new Pair(p1f0VarA8, mapE);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                p1f0 p1f0VarA9 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, !p1f0Var.x, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -8388609, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(p1f0VarA9.x));
                return new Pair(p1f0VarA9, mapE);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                p1f0 p1f0VarA10 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, !p1f0Var.y, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -16777217, 127);
                vzg0Var.e(u0f0Var.name(), Boolean.valueOf(p1f0VarA10.y));
                return new Pair(p1f0VarA10, mapE);
            default:
                return new Pair(p1f0Var, mbf0Var.e);
        }
    }

    private final Object p(Object obj) {
        ggt ggtVar = (ggt) this.c;
        j910 j910Var = (j910) this.b;
        mbf0 mbf0Var = (mbf0) obj;
        mbf0Var.getClass();
        p1f0 p1f0VarA = p1f0.a(mbf0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, Integer.valueOf(ggtVar.f11267a), false, false, null, null, false, false, null, Integer.MAX_VALUE, 127);
        List listC = kotlin.collections.a.c(u0f0.r);
        j910Var.getClass();
        Map mapE = j910.e(mbf0Var, listC);
        ((vzg0) j910Var.b).e(CommonConstant.RETKEY.GENDER, p1f0VarA.F);
        return new Pair(p1f0VarA, mapE);
    }

    private final Object r(Object obj) {
        org.xplatform.registration.visual.impl.presentation.state.models.fields.SocialStateModel socialStateModel = (org.xplatform.registration.visual.impl.presentation.state.models.fields.SocialStateModel) this.c;
        j910 j910Var = (j910) this.b;
        mbf0 mbf0Var = (mbf0) obj;
        mbf0Var.getClass();
        p1f0 p1f0VarA = p1f0.a(mbf0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, socialStateModel, null, false, false, null, null, false, false, null, -1073741825, 127);
        List listC = kotlin.collections.a.c(u0f0.j);
        j910Var.getClass();
        Map mapE = j910.e(mbf0Var, listC);
        ((vzg0) j910Var.b).e("SOCIAL", p1f0VarA.E);
        return new Pair(p1f0VarA, mapE);
    }

    private final Object s(Object obj) {
        String str = (String) this.c;
        j910 j910Var = (j910) this.b;
        mbf0 mbf0Var = (mbf0) obj;
        mbf0Var.getClass();
        p1f0 p1f0VarA = p1f0.a(mbf0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -1048577, 127);
        List listC = kotlin.collections.a.c(u0f0.u);
        j910Var.getClass();
        Map mapE = j910.e(mbf0Var, listC);
        ((vzg0) j910Var.b).e("PROMO_CODE", p1f0VarA.u);
        return new Pair(p1f0VarA, mapE);
    }

    private final Object t(Object obj) {
        jkc jkcVar = (jkc) this.c;
        j910 j910Var = (j910) this.b;
        mbf0 mbf0Var = (mbf0) obj;
        mbf0Var.getClass();
        p1f0 p1f0VarA = p1f0.a(mbf0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, new CitizenshipStateModel(jkcVar.b, jkcVar.f16661a, true), null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -16385, 127);
        List listC = kotlin.collections.a.c(u0f0.o);
        j910Var.getClass();
        Map mapE = j910.e(mbf0Var, listC);
        ((vzg0) j910Var.b).e("CITIZENSHIP", p1f0VarA.o);
        return new Pair(p1f0VarA, mapE);
    }

    private final Object u(Object obj) {
        org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel;
        rkt rktVar = (rkt) this.c;
        cm90 cm90Var = rktVar.h;
        j910 j910Var = (j910) this.b;
        mbf0 mbf0Var = (mbf0) obj;
        mbf0Var.getClass();
        p1f0 p1f0Var = mbf0Var.g;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel phoneStateModel2 = p1f0Var.r;
        String str = rktVar.c;
        if (phoneStateModel2 != null) {
            String strK = kng0.k("+", str);
            String str2 = cm90Var.d;
            Integer numValueOf = Integer.valueOf(cm90Var.c);
            str2.getClass();
            phoneStateModel = new org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel("", strK, str2, numValueOf);
        } else {
            phoneStateModel = new org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel("", kng0.k("+", str), cm90Var.d, Integer.valueOf(cm90Var.c));
        }
        p1f0 p1f0VarA = p1f0.a(p1f0Var, null, false, null, null, false, false, new org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel(rktVar.f30664a, rktVar.e, rktVar.b, rktVar.f, rktVar.d), null, null, null, null, null, null, null, null, null, null, phoneStateModel, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -131137, 127);
        List listJ = q3d.j(u0f0.d, u0f0.h);
        j910Var.getClass();
        Map mapE = j910.e(mbf0Var, listJ);
        vzg0 vzg0Var = (vzg0) j910Var.b;
        vzg0Var.e("COUNTRY", p1f0VarA.g);
        vzg0Var.e("PHONE", p1f0VarA.r);
        return new Pair(p1f0VarA, mapE);
    }

    private final Object v(Object obj) {
        nq90 nq90Var = (nq90) this.c;
        j910 j910Var = (j910) this.b;
        vzg0 vzg0Var = (vzg0) j910Var.b;
        mbf0 mbf0Var = (mbf0) obj;
        mbf0Var.getClass();
        p1f0 p1f0Var = mbf0Var.g;
        if (nq90Var instanceof eq90) {
            eq90 eq90Var = (eq90) nq90Var;
            p1f0 p1f0VarA = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, new CitizenshipStateModel(eq90Var.b, eq90Var.f8227a, false), null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -16897, 127);
            Map mapE = j910.e(mbf0Var, kotlin.collections.a.c(u0f0.o));
            vzg0Var.e("CITIZENSHIP", p1f0VarA.o);
            return new Pair(p1f0VarA, mapE);
        }
        if (nq90Var instanceof fq90) {
            fq90 fq90Var = (fq90) nq90Var;
            p1f0 p1f0VarA2 = p1f0.a(p1f0Var, null, false, null, new CityStateModel(fq90Var.f9963a, fq90Var.c), false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -9, 127);
            Map mapE2 = j910.e(mbf0Var, kotlin.collections.a.c(u0f0.f));
            vzg0Var.e("CITY", p1f0VarA2.d);
            return new Pair(p1f0VarA2, mapE2);
        }
        if (nq90Var instanceof gq90) {
            gq90 gq90Var = (gq90) nq90Var;
            org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel countryStateModel = new org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel(gq90Var.f11722a, gq90Var.d, gq90Var.c, gq90Var.e, gq90Var.h);
            String str = gq90Var.f;
            cm90 cm90Var = gq90Var.g;
            return j910Var.d(mbf0Var, countryStateModel, str, cm90Var.d, Integer.valueOf(cm90Var.c), q3d.j(u0f0.d, u0f0.h));
        }
        if (nq90Var instanceof hq90) {
            hq90 hq90Var = (hq90) nq90Var;
            p1f0 p1f0VarA3 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, new org.xplatform.registration.visual.impl.presentation.state.models.fields.CurrencyStateModel(hq90Var.f13474a, hq90Var.c, hq90Var.d), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -129, 127);
            Map mapE3 = j910.e(mbf0Var, kotlin.collections.a.c(u0f0.i));
            vzg0Var.e("CURRENCY", p1f0VarA3.h);
            return new Pair(p1f0VarA3, mapE3);
        }
        if (nq90Var instanceof iq90) {
            iq90 iq90Var = (iq90) nq90Var;
            p1f0 p1f0VarA4 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, new DocumentStateModel(iq90Var.f15199a, iq90Var.b), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -513, 127);
            Map mapE4 = j910.e(mbf0Var, kotlin.collections.a.c(u0f0.p));
            vzg0Var.e("DOCUMENT_TYPE", p1f0VarA4.j);
            return new Pair(p1f0VarA4, mapE4);
        }
        if (nq90Var instanceof kq90) {
            kq90 kq90Var = (kq90) nq90Var;
            org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel countryStateModel2 = new org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel(kq90Var.f18711a, kq90Var.e, kq90Var.d, kq90Var.f, kq90Var.i);
            String str2 = kq90Var.g;
            cm90 cm90Var2 = kq90Var.h;
            return j910Var.d(mbf0Var, countryStateModel2, str2, cm90Var2.d, Integer.valueOf(cm90Var2.c), q3d.j(u0f0.h, u0f0.d));
        }
        if (!(nq90Var instanceof lq90)) {
            return new Pair(p1f0Var, mbf0Var.e);
        }
        lq90 lq90Var = (lq90) nq90Var;
        p1f0 p1f0VarA5 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RegionStateModel(lq90Var.f20476a, lq90Var.c), null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -2097161, 127);
        Map mapE5 = j910.e(mbf0Var, kotlin.collections.a.c(u0f0.e));
        vzg0Var.e("REGION", p1f0VarA5.v);
        vzg0Var.e("CITY", null);
        return new Pair(p1f0VarA5, mapE5);
    }

    private final Object w(Object obj) {
        q7f0 q7f0Var = (q7f0) this.c;
        j910 j910Var = (j910) this.b;
        mbf0 mbf0Var = (mbf0) obj;
        mbf0Var.getClass();
        p1f0 p1f0VarA = p1f0.a(mbf0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, q7f0Var, -1, 63);
        ((vzg0) j910Var.b).e("REGISTRATION_TYPE", p1f0VarA.M);
        return new Pair(p1f0VarA, mbf0Var.e);
    }

    private final Object x(Object obj) {
        byte b;
        ocf0 ocf0Var = (ocf0) this.c;
        qu4 qu4Var = (qu4) this.b;
        k0w0 k0w0Var = (k0w0) obj;
        k0w0Var.getClass();
        sek sekVar = ocf0Var.o;
        String str = ((mbf0) ocf0Var.D()).g.k;
        String str2 = str == null ? "" : str;
        String str3 = ((mbf0) ocf0Var.D()).g.u;
        String str4 = str3 == null ? "" : str3;
        q7f0 q7f0Var = ((mbf0) ocf0Var.D()).g.M;
        if (q7f0Var != null) {
            b = q7f0Var.f28247a;
        } else {
            gne0 gne0Var = q7f0.b;
            b = 1;
        }
        byte b2 = b;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel countryStateModel = ((mbf0) ocf0Var.D()).g.g;
        long j = countryStateModel != null ? countryStateModel.f46863a : -1;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel countryStateModel2 = ((mbf0) ocf0Var.D()).g.g;
        String str5 = countryStateModel2 != null ? countryStateModel2.b : null;
        String str6 = str5 == null ? "" : str5;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.CurrencyStateModel currencyStateModel = ((mbf0) ocf0Var.D()).g.h;
        String str7 = currencyStateModel != null ? currencyStateModel.b : null;
        String str8 = str7 == null ? "" : str7;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.BonusStateModel bonusStateModel = ((mbf0) ocf0Var.D()).g.c;
        String str9 = bonusStateModel != null ? bonusStateModel.b : null;
        String str10 = str9 == null ? "" : str9;
        org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel countryStateModel3 = ((mbf0) ocf0Var.D()).g.g;
        String str11 = countryStateModel3 != null ? countryStateModel3.e : null;
        ConfirmSendEmailScreenParams.Registration registration = new ConfirmSendEmailScreenParams.Registration(new SendEmailIntention.Registration(str2, str4, b2, str6, str8, str10, j, str11 == null ? "" : str11, ((mbf0) ocf0Var.D()).A.f4650a, ((mbf0) ocf0Var.D()).g.D), new swp0(qu4Var.f29330a, qu4Var.b, false));
        sekVar.getClass();
        k0w0Var.h(new SendConfirmationEmailScreen(registration));
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel phoneStateModel;
        Pair pair;
        byte b = this.f41606a;
        byte b2 = 1;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                rkt rktVar = (rkt) obj3;
                cm90 cm90Var = rktVar.h;
                dq00 dq00Var = (dq00) obj2;
                aye0 aye0Var = (aye0) obj;
                aye0Var.getClass();
                q1f0 q1f0Var = aye0Var.h;
                org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel phoneStateModel2 = q1f0Var.r;
                String str = rktVar.c;
                if (phoneStateModel2 != null) {
                    String strK = kng0.k("+", str);
                    String str2 = cm90Var.d;
                    Integer numValueOf = Integer.valueOf(cm90Var.c);
                    str2.getClass();
                    phoneStateModel = new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel("", strK, str2, numValueOf);
                } else {
                    phoneStateModel = new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel("", kng0.k("+", str), cm90Var.d, Integer.valueOf(cm90Var.c));
                }
                q1f0 q1f0VarA = q1f0.a(q1f0Var, null, false, null, null, false, false, new org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel(rktVar.f30664a, rktVar.e, rktVar.b, rktVar.f, rktVar.d), null, null, null, null, null, null, null, null, null, null, phoneStateModel, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -131137, 127);
                List listJ = q3d.j(u0f0.d, u0f0.h);
                dq00Var.getClass();
                Map mapD = dq00.d(aye0Var, listJ);
                vzg0 vzg0Var = (vzg0) dq00Var.b;
                vzg0Var.e("COUNTRY", q1f0VarA.g);
                vzg0Var.e("PHONE", q1f0VarA.r);
                return new Pair(q1f0VarA, mapD);
            case 1:
                dq00 dq00Var2 = (dq00) obj2;
                aye0 aye0Var2 = (aye0) obj;
                aye0Var2.getClass();
                q1f0 q1f0VarA2 = q1f0.a(aye0Var2.h, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (String) obj3, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -1048577, 127);
                List listC = kotlin.collections.a.c(u0f0.u);
                dq00Var2.getClass();
                Map mapD2 = dq00.d(aye0Var2, listC);
                ((vzg0) dq00Var2.b).e("PROMO_CODE", q1f0VarA2.u);
                return new Pair(q1f0VarA2, mapD2);
            case 2:
                dq00 dq00Var3 = (dq00) obj2;
                u0f0 u0f0Var = (u0f0) obj3;
                aye0 aye0Var3 = (aye0) obj;
                aye0Var3.getClass();
                q1f0 q1f0Var2 = aye0Var3.h;
                List listC2 = kotlin.collections.a.c(u0f0Var);
                dq00Var3.getClass();
                Map mapD3 = dq00.d(aye0Var3, listC2);
                vzg0 vzg0Var2 = (vzg0) dq00Var3.b;
                int iOrdinal = u0f0Var.ordinal();
                if (iOrdinal == 29) {
                    q1f0 q1f0VarA3 = q1f0.a(q1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, q1f0Var2.s, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -262145, 127);
                    vzg0Var2.e(u0f0Var.name(), q1f0VarA3.s);
                    pair = new Pair(q1f0VarA3, mapD3);
                } else if (iOrdinal == 30) {
                    q1f0 q1f0VarA4 = q1f0.a(q1f0Var2, null, !q1f0Var2.b, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -3, 127);
                    vzg0Var2.e(u0f0Var.name(), Boolean.valueOf(q1f0VarA4.b));
                    pair = new Pair(q1f0VarA4, mapD3);
                } else if (iOrdinal == 38) {
                    q1f0 q1f0VarA5 = q1f0.a(q1f0Var2, null, false, null, null, false, !q1f0Var2.f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -33, 127);
                    vzg0Var2.e(u0f0Var.name(), Boolean.valueOf(q1f0VarA5.f));
                    pair = new Pair(q1f0VarA5, mapD3);
                } else if (iOrdinal != 39) {
                    switch (iOrdinal) {
                        case 22:
                            q1f0 q1f0VarA6 = q1f0.a(q1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, !q1f0Var2.B, false, null, null, null, false, false, null, null, false, false, null, -134217729, 127);
                            vzg0Var2.e(u0f0Var.name(), Boolean.valueOf(q1f0VarA6.B));
                            pair = new Pair(q1f0VarA6, mapD3);
                            break;
                        case 23:
                            q1f0 q1f0VarA7 = q1f0.a(q1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, !q1f0Var2.A, false, false, null, null, null, false, false, null, null, false, false, null, -67108865, 127);
                            vzg0Var2.e(u0f0Var.name(), Boolean.valueOf(q1f0VarA7.A));
                            pair = new Pair(q1f0VarA7, mapD3);
                            break;
                        case 24:
                            q1f0 q1f0VarA8 = q1f0.a(q1f0Var2, null, false, null, null, !q1f0Var2.e, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -17, 127);
                            vzg0Var2.e(u0f0Var.name(), Boolean.valueOf(q1f0VarA8.e));
                            pair = new Pair(q1f0VarA8, mapD3);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            q1f0 q1f0VarA9 = q1f0.a(q1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, !q1f0Var2.C, null, null, null, false, false, null, null, false, false, null, -268435457, 127);
                            vzg0Var2.e(u0f0Var.name(), Boolean.valueOf(q1f0VarA9.C));
                            pair = new Pair(q1f0VarA9, mapD3);
                            break;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            q1f0 q1f0VarA10 = q1f0.a(q1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, !q1f0Var2.x, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -8388609, 127);
                            vzg0Var2.e(u0f0Var.name(), Boolean.valueOf(q1f0VarA10.x));
                            pair = new Pair(q1f0VarA10, mapD3);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            q1f0 q1f0VarA11 = q1f0.a(q1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, !q1f0Var2.y, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -16777217, 127);
                            vzg0Var2.e(u0f0Var.name(), Boolean.valueOf(q1f0VarA11.y));
                            pair = new Pair(q1f0VarA11, mapD3);
                            break;
                        default:
                            return new Pair(q1f0Var2, aye0Var3.f);
                    }
                } else {
                    q1f0 q1f0VarA12 = q1f0.a(q1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, !q1f0Var2.L, null, -1, 95);
                    vzg0Var2.e(u0f0Var.name(), Boolean.valueOf(q1f0VarA12.L));
                    pair = new Pair(q1f0VarA12, mapD3);
                }
                return pair;
            case 3:
                dq00 dq00Var4 = (dq00) obj2;
                aye0 aye0Var4 = (aye0) obj;
                aye0Var4.getClass();
                q1f0 q1f0VarA13 = q1f0.a(aye0Var4.h, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, Integer.valueOf(((hgt) obj3).f13029a), false, false, null, null, false, false, null, Integer.MAX_VALUE, 127);
                List listC3 = kotlin.collections.a.c(u0f0.r);
                dq00Var4.getClass();
                Map mapD4 = dq00.d(aye0Var4, listC3);
                ((vzg0) dq00Var4.b).e(CommonConstant.RETKEY.GENDER, q1f0VarA13.F);
                return new Pair(q1f0VarA13, mapD4);
            case 4:
                aye0 aye0Var5 = (aye0) obj;
                aye0Var5.getClass();
                q1f0 q1f0VarA14 = q1f0.a(aye0Var5.h, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, (q7f0) obj3, -1, 63);
                ((vzg0) ((dq00) obj2).b).e("REGISTRATION_TYPE", q1f0VarA14.M);
                return new Pair(q1f0VarA14, aye0Var5.f);
            case 5:
                Window window = (Window) obj3;
                iwe0 iwe0Var = (iwe0) obj2;
                ((ilz) obj).getClass();
                if (window != null) {
                    ofm0.x(window, iwe0Var.f15486a ? R.attr.uikitBackgroundContent : R.attr.uikitBackground, null, 6);
                }
                return new pa2((byte) 13);
            case 6:
                eze0 eze0Var = (eze0) obj3;
                qu4 qu4Var = (qu4) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                sek sekVar = eze0Var.p;
                String str3 = ((aye0) eze0Var.D()).h.k;
                String str4 = str3 == null ? "" : str3;
                String str5 = ((aye0) eze0Var.D()).h.u;
                String str6 = str5 == null ? "" : str5;
                q7f0 q7f0Var = ((aye0) eze0Var.D()).h.M;
                if (q7f0Var != null) {
                    b2 = q7f0Var.f28247a;
                } else {
                    gne0 gne0Var = q7f0.b;
                }
                byte b3 = b2;
                org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel countryStateModel = ((aye0) eze0Var.D()).h.g;
                long j = countryStateModel != null ? countryStateModel.f46874a : -1;
                org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel countryStateModel2 = ((aye0) eze0Var.D()).h.g;
                String str7 = countryStateModel2 != null ? countryStateModel2.b : null;
                if (str7 == null) {
                    str7 = "";
                }
                org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CurrencyStateModel currencyStateModel = ((aye0) eze0Var.D()).h.h;
                String str8 = currencyStateModel != null ? currencyStateModel.b : null;
                if (str8 == null) {
                    str8 = "";
                }
                org.xplatform.registration_default.impl.presentation.udf.state.models.fields.BonusStateModel bonusStateModel = ((aye0) eze0Var.D()).h.c;
                String str9 = bonusStateModel != null ? bonusStateModel.b : null;
                String str10 = str9 == null ? "" : str9;
                org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel countryStateModel3 = ((aye0) eze0Var.D()).h.g;
                String str11 = countryStateModel3 != null ? countryStateModel3.e : null;
                ConfirmSendEmailScreenParams.Registration registration = new ConfirmSendEmailScreenParams.Registration(new SendEmailIntention.Registration(str4, str6, b3, str7, str8, str10, j, str11 == null ? "" : str11, ((aye0) eze0Var.D()).A.f4650a, ((aye0) eze0Var.D()).h.D), new swp0(qu4Var.f29330a, qu4Var.b, false));
                sekVar.getClass();
                k0w0Var.h(new SendConfirmationEmailScreen(registration));
                return Unit.f46060a;
            case 7:
                k1f0 k1f0Var = (k1f0) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                th.getLocalizedMessage();
                k1f0Var.k.o(null, i8d.e);
                k1f0Var.f(th, (vne) obj2);
                return Unit.f46060a;
            case 8:
                nq90 nq90Var = (nq90) obj3;
                g090 g090Var = (g090) obj2;
                vzg0 vzg0Var3 = (vzg0) g090Var.f10448a;
                u4f0 u4f0Var = (u4f0) obj;
                u4f0Var.getClass();
                r1f0 r1f0Var = u4f0Var.g;
                if (nq90Var instanceof eq90) {
                    eq90 eq90Var = (eq90) nq90Var;
                    r1f0 r1f0VarA = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, new org.xplatform.registration.simple.impl.presentation.state.models.fields.CitizenshipStateModel(eq90Var.b, eq90Var.f8227a, false), null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -16897, 127);
                    Map mapF = g090.f(u4f0Var, kotlin.collections.a.c(u0f0.o));
                    vzg0Var3.e("CITIZENSHIP", r1f0VarA.o);
                    return new Pair(r1f0VarA, mapF);
                }
                if (nq90Var instanceof fq90) {
                    fq90 fq90Var = (fq90) nq90Var;
                    r1f0 r1f0VarA2 = r1f0.a(r1f0Var, null, false, null, new org.xplatform.registration.simple.impl.presentation.state.models.fields.CityStateModel(fq90Var.f9963a, fq90Var.c), false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -9, 127);
                    Map mapF2 = g090.f(u4f0Var, kotlin.collections.a.c(u0f0.f));
                    vzg0Var3.e("CITY", r1f0VarA2.d);
                    return new Pair(r1f0VarA2, mapF2);
                }
                if (nq90Var instanceof gq90) {
                    gq90 gq90Var = (gq90) nq90Var;
                    return g090Var.c(u4f0Var, new CountryStateModel(gq90Var.f11722a, gq90Var.d, gq90Var.c, gq90Var.e, gq90Var.h), gq90Var.f, gq90Var.g.d, q3d.j(u0f0.d, u0f0.h));
                }
                if (nq90Var instanceof hq90) {
                    hq90 hq90Var = (hq90) nq90Var;
                    r1f0 r1f0VarA3 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, new CurrencyStateModel(hq90Var.f13474a, hq90Var.c, hq90Var.d), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -129, 127);
                    Map mapF3 = g090.f(u4f0Var, kotlin.collections.a.c(u0f0.i));
                    vzg0Var3.e("CURRENCY", r1f0VarA3.h);
                    return new Pair(r1f0VarA3, mapF3);
                }
                if (nq90Var instanceof iq90) {
                    iq90 iq90Var = (iq90) nq90Var;
                    r1f0 r1f0VarA4 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, new org.xplatform.registration.simple.impl.presentation.state.models.fields.DocumentStateModel(iq90Var.f15199a, iq90Var.b), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -513, 127);
                    Map mapF4 = g090.f(u4f0Var, kotlin.collections.a.c(u0f0.p));
                    vzg0Var3.e("DOCUMENT_TYPE", r1f0VarA4.j);
                    return new Pair(r1f0VarA4, mapF4);
                }
                if (nq90Var instanceof kq90) {
                    kq90 kq90Var = (kq90) nq90Var;
                    return g090Var.c(u4f0Var, new CountryStateModel(kq90Var.f18711a, kq90Var.e, kq90Var.d, kq90Var.f, kq90Var.i), kq90Var.g, kq90Var.h.d, q3d.j(u0f0.h, u0f0.d));
                }
                if (!(nq90Var instanceof lq90)) {
                    return new Pair(r1f0Var, u4f0Var.e);
                }
                lq90 lq90Var = (lq90) nq90Var;
                r1f0 r1f0VarA5 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new org.xplatform.registration.simple.impl.presentation.state.models.fields.RegionStateModel(lq90Var.f20476a, lq90Var.c), null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -2097161, 127);
                Map mapF5 = g090.f(u4f0Var, kotlin.collections.a.c(u0f0.e));
                vzg0Var3.e("REGION", r1f0VarA5.v);
                vzg0Var3.e("CITY", null);
                return new Pair(r1f0VarA5, mapF5);
            case 9:
                u4f0 u4f0Var2 = (u4f0) obj;
                u4f0Var2.getClass();
                r1f0 r1f0VarA6 = r1f0.a(u4f0Var2.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, (List) obj3, null, null, false, false, null, -1, 125);
                ((vzg0) ((g090) obj2).f10448a).e("BONUS", r1f0VarA6.c);
                return new Pair(r1f0VarA6, u4f0Var2.e);
            case 10:
                g090 g090Var2 = (g090) obj2;
                u4f0 u4f0Var3 = (u4f0) obj;
                u4f0Var3.getClass();
                r1f0 r1f0VarA7 = r1f0.a(u4f0Var3.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (String) obj3, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -1048577, 127);
                List listC4 = kotlin.collections.a.c(u0f0.u);
                g090Var2.getClass();
                Map mapF6 = g090.f(u4f0Var3, listC4);
                ((vzg0) g090Var2.f10448a).e("PROMO_CODE", r1f0VarA7.u);
                return new Pair(r1f0VarA7, mapF6);
            case 11:
                jkc jkcVar = (jkc) obj3;
                g090 g090Var3 = (g090) obj2;
                u4f0 u4f0Var4 = (u4f0) obj;
                u4f0Var4.getClass();
                r1f0 r1f0VarA8 = r1f0.a(u4f0Var4.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, new org.xplatform.registration.simple.impl.presentation.state.models.fields.CitizenshipStateModel(jkcVar.b, jkcVar.f16661a, true), null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -16385, 127);
                List listC5 = kotlin.collections.a.c(u0f0.o);
                g090Var3.getClass();
                Map mapF7 = g090.f(u4f0Var4, listC5);
                ((vzg0) g090Var3.f10448a).e("CITIZENSHIP", r1f0VarA8.o);
                return new Pair(r1f0VarA8, mapF7);
            case 12:
                return a(obj);
            case 13:
                return c(obj);
            case 14:
                return b(obj);
            case 15:
                return g(obj);
            case 16:
                return h(obj);
            case 17:
                return i(obj);
            case 18:
                return l(obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return m(obj);
            case 20:
                return p(obj);
            case 21:
                return r(obj);
            case 22:
                return s(obj);
            case 23:
                return t(obj);
            case 24:
                return o(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return u(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return v(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return w(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return x(obj);
            default:
                bef0 bef0Var = (bef0) obj3;
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                a4x a4xVar = bef0Var.f2447a;
                i8zVar.e(a4xVar.size(), new pwe0(new bue0((byte) 16), a4xVar, (byte) 3), null, new pwe0(new bue0((byte) 17), a4xVar, (byte) 4), new ugd(-1117249557, true, new h8w((List) a4xVar, (Object) bef0Var, (Function1) obj2, (byte) 18)));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ xwe0(Object obj, Object obj2, byte b) {
        this.f41606a = b;
        this.c = obj;
        this.b = obj2;
    }
}
