package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zxb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45151a;

    public /* synthetic */ zxb(byte b) {
        this.f45151a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45151a) {
            case 0:
                return new zw3(ist0.f15322a, (byte) 0);
            case 1:
                return new zw3(u2c.f34939a, (byte) 0);
            case 2:
                kl5 kl5Var = l5c.W1;
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            case 4:
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                return Unit.f46060a;
            case 7:
                return new zw3(v8g0.f36981a, (byte) 0);
            case 8:
                return Unit.f46060a;
            case 9:
                return new rdc(iun.f15405a, 0.0d, new i8r(new h8r("", 0.0d), new h8r("", 0.0d)), "", false, 0.0d, null, false, null);
            case 10:
                return new afc(iun.f15405a);
            case 11:
                return new g0o("org.xplatform.chooselang.navigation.ChooseLanguageRoute", jgc.INSTANCE, new Annotation[0]);
            case 12:
                return new qgc("", iun.f15405a);
            case 13:
                return new egc("", "", "", lak0.c, "");
            case 14:
                return Unit.f46060a;
            case 15:
                return new whc(0L, 0L, -1L, "", iun.f15405a, true, false, "");
            case 16:
                return new zw3(ukc.f35822a, (byte) 0);
            case 17:
                return new zw3(kwp.f19013a, (byte) 0);
            case 18:
                kl5 kl5Var2 = gnc.Z1;
                return new bdz();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new hsc(iun.f15405a);
            case 20:
                String property = System.getProperty("http.agent");
                return property == null ? "Dalvik/2.1.0 (Linux; U; Android)" : property;
            case 21:
                return Unit.f46060a;
            case 22:
                return Unit.f46060a;
            case 23:
                return Unit.f46060a;
            case 24:
                return new zw3(j3b.f15822a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new x2d(-3.4028235E38f, 0.0f, 0.0f);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new f3d();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                long j = f4d.z;
                return new t4d(j, f4d.j, f4d.A, f4d.k, f4d.e, f4d.E, f4d.n, f4d.F, f4d.o, f4d.R, f4d.t, f4d.S, f4d.u, f4d.f8909a, f4d.g, f4d.I, f4d.r, f4d.Q, f4d.s, j, f4d.f, f4d.d, f4d.b, f4d.h, f4d.c, f4d.i, f4d.x, f4d.y, f4d.D, f4d.J, f4d.P, f4d.K, f4d.L, f4d.M, f4d.N, f4d.O, f4d.B, f4d.C, f4d.l, f4d.m, f4d.G, f4d.H, f4d.p, f4d.q, f4d.T, f4d.U, f4d.v, f4d.w);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Boolean.TRUE;
            default:
                return new zw3(g6d.f10757a, (byte) 0);
        }
    }
}
