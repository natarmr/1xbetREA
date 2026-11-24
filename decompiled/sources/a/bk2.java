package a;

import android.content.Context;
import android.widget.Toast;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bk2 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2729a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk2(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f2729a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = 0;
        byte b2 = 5;
        yje yjeVar = null;
        switch (this.f2729a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((fk2) this.receiver).O(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ul2 ul2Var = (ul2) this.receiver;
                p7m0 p7m0Var = ul2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ul2Var.f.getClass();
                } while (!p7m0Var.m(value, nl2.a((nl2) value, null, false, false, new cds0(th2), false, false, false, null, null, 471)));
                ul2Var.I.b(th2, new ma2((byte) 15));
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                yn2 yn2Var = (yn2) this.receiver;
                yn2Var.H.b(th3, new fa2(yn2Var, b2));
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((yn2) this.receiver).N(th4);
                return Unit.f46060a;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                yn2 yn2Var2 = (yn2) this.receiver;
                yn2Var2.H.b(th5, new fa2(yn2Var2, b2));
                return Unit.f46060a;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                yn2 yn2Var3 = (yn2) this.receiver;
                yn2Var3.H.b(th6, new fa2(yn2Var3, b2));
                return Unit.f46060a;
            case 6:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((yn2) this.receiver).N(th7);
                return Unit.f46060a;
            case 7:
                ((s03) this.receiver).d((x5a) obj);
                return Unit.f46060a;
            case 8:
                ((s03) this.receiver).d((x5a) obj);
                return Unit.f46060a;
            case 9:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ij3 ij3Var = (ij3) this.receiver;
                ij3Var.getClass();
                sac.V(jiu0.a(ij3Var), ej3.f7888a, null, null, new fj3(ij3Var, zBooleanValue, yjeVar, b), 14);
                return Unit.f46060a;
            case 10:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((to3) this.receiver).i(th8);
                return Unit.f46060a;
            case 11:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((kq3) this.receiver).A(th9);
                return Unit.f46060a;
            case 12:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((kq3) this.receiver).C(th10);
                return Unit.f46060a;
            case 13:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((kq3) this.receiver).A(th11);
                return Unit.f46060a;
            case 14:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((kq3) this.receiver).A(th12);
                return Unit.f46060a;
            case 15:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((kq3) this.receiver).A(th13);
                return Unit.f46060a;
            case 16:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((kq3) this.receiver).C(th14);
                return Unit.f46060a;
            case 17:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((kq3) this.receiver).C(th15);
                return Unit.f46060a;
            case 18:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((kq3) this.receiver).C(th16);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                p7m0 p7m0Var2 = ((umx) ((jpi0) ((zu3) this.receiver).b0.get()).f16903a.f13549a).b;
                do {
                    value2 = p7m0Var2.getValue();
                    ((Boolean) value2).getClass();
                } while (!p7m0Var2.m(value2, bool));
                return Unit.f46060a;
            case 20:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ApplicationLoader applicationLoader = (ApplicationLoader) this.receiver;
                ApplicationLoader applicationLoader2 = ApplicationLoader.v1;
                applicationLoader.f(th17);
                return Unit.f46060a;
            case 21:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ApplicationLoader applicationLoader3 = (ApplicationLoader) this.receiver;
                ApplicationLoader applicationLoader4 = ApplicationLoader.v1;
                applicationLoader3.f(th18);
                return Unit.f46060a;
            case 22:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                ApplicationLoader applicationLoader5 = (ApplicationLoader) this.receiver;
                ApplicationLoader applicationLoader6 = ApplicationLoader.v1;
                applicationLoader5.f(th19);
                return Unit.f46060a;
            case 23:
                Throwable th20 = (Throwable) obj;
                th20.getClass();
                ApplicationLoader applicationLoader7 = (ApplicationLoader) this.receiver;
                ApplicationLoader applicationLoader8 = ApplicationLoader.v1;
                applicationLoader7.f(th20);
                return Unit.f46060a;
            case 24:
                l54 l54Var = (l54) obj;
                l54Var.getClass();
                d54 d54Var = (d54) this.receiver;
                gfk0 gfk0Var = d54.R1;
                d54Var.getClass();
                if (l54Var.equals(k54.f17700a)) {
                    new nvu(d54Var.o0()).Z();
                    kxq kxqVarB = d54Var.B();
                    if (kxqVarB == null || !kxqVarB.isFinishing()) {
                        Context contextO0 = d54Var.o0();
                        Toast.makeText(contextO0, contextO0.getString(R.string.double_click_exit), 1).show();
                    }
                } else {
                    if (!l54Var.equals(j54.f15915a)) {
                        t9f.b();
                        return null;
                    }
                    kxq kxqVarB2 = d54Var.B();
                    if (kxqVarB2 != null) {
                        kxqVarB2.finishAffinity();
                    }
                }
                d54Var.G0().x(u44.f35026a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                a54 a54Var = (a54) obj;
                a54Var.getClass();
                ((k3t0) this.receiver).x(a54Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue = ((Number) obj).intValue();
                p7m0 p7m0Var3 = ((m64) this.receiver).e;
                c64 c64Var = new c64(iIntValue);
                p7m0Var3.getClass();
                p7m0Var3.o(null, c64Var);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                y84 y84Var = (y84) obj;
                y84Var.getClass();
                b84 b84Var = (b84) this.receiver;
                gfk0 gfk0Var2 = b84.P1;
                b84Var.getClass();
                if (y84Var instanceof x84) {
                    x84 x84Var = (x84) y84Var;
                    String str = x84Var.f40445a;
                    sek0 sek0Var = x84Var.b;
                    wdk0 wdk0Var = b84Var.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(sek0Var, str, null, null, null, null, 124), b84Var, null, null, false, null, 1020);
                } else if (y84Var instanceof w84) {
                    q84 q84Var = ((w84) y84Var).f38703a;
                    rek0 rek0Var = w74.r2;
                    androidx.fragment.app.e eVarC = b84Var.C();
                    eVarC.getClass();
                    rek0Var.getClass();
                    if (eVarC.J("AuthHistoryEndSessionDialog") == null) {
                        w74 w74Var = new w74();
                        String str2 = q84Var.c;
                        iiy[] iiyVarArr = w74.s2;
                        w74Var.l2.x(w74Var, iiyVarArr[1], str2);
                        int i = q84Var.e;
                        w74Var.o2.I(w74Var, iiyVarArr[4], i);
                        long j = q84Var.d;
                        w74Var.n2.j(w74Var, iiyVarArr[3], j);
                        w74Var.p2.x(w74Var, iiyVarArr[5], q84Var.f28282a);
                        boolean z = q84Var.f;
                        w74Var.m2.v(w74Var, iiyVarArr[2], z);
                        w74Var.k2.x(w74Var, iiyVarArr[0], "REQUEST_EXIT_SESSION_DIALOG_KEY");
                        boolean z2 = q84Var.g;
                        w74Var.q2.v(w74Var, iiyVarArr[6], z2);
                        w74Var.H0(eVarC, "AuthHistoryEndSessionDialog");
                    }
                } else if (y84Var instanceof v84) {
                    qek0 qek0Var = u74.l2;
                    androidx.fragment.app.e eVarC2 = b84Var.C();
                    eVarC2.getClass();
                    qek0Var.getClass();
                    if (eVarC2.J("AuthHistoryEndAllSessionsDialog") == null) {
                        u74 u74Var = new u74();
                        u74Var.k2.x(u74Var, u74.m2[0], "REQUEST_EXIT_ALL_SESSIONS_DIALOG_KEY");
                        u74Var.H0(eVarC2, "AuthHistoryEndAllSessionsDialog");
                    }
                } else {
                    if (!(y84Var instanceof u84)) {
                        t9f.b();
                        return null;
                    }
                    qcc.Q(b84Var);
                }
                b84Var.G0().x(t64.f33397a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                l74 l74Var = (l74) obj;
                l74Var.getClass();
                ((k3t0) this.receiver).x(l74Var);
                return Unit.f46060a;
            default:
                Throwable th21 = (Throwable) obj;
                th21.getClass();
                ((l94) this.receiver).M(th21);
                return Unit.f46060a;
        }
    }
}
