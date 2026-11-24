package a;

import android.view.View;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$registrationFailScreen$1;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;
import org.xplatform.login.core.presentation.model.AuthDataModel;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;
import org.xplatform.login.new_place.impl.navigation.ConfirmationNewPlaceScreen;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ys3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43150a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ys3(Object obj, Object obj2, byte b) {
        this.f43150a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43150a;
        byte b2 = 0;
        byte b3 = 23;
        byte b4 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                zu3 zu3Var = (zu3) obj3;
                mie0 mie0Var = (mie0) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                if ((th instanceof zhi0) && ((zhi0) th).f44396a == i2o.BadRequest.getErrorCode()) {
                    r70 r70Var = (r70) zu3Var.K.get();
                    String str = (String) mie0Var.f21842a;
                    String strB = ((rmt) zu3Var.L.get()).f30758a.b();
                    boolean zD = ((igu) zu3Var.M.get()).f14751a.d();
                    ((aqt) zu3Var.N.get()).a();
                    r70Var.getClass();
                    str.getClass();
                    ony onyVar = r70Var.f29956a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("deviceId", ncy.c(str));
                    linkedHashMap.put("bTag", ncy.c(strB));
                    linkedHashMap.put(Payload.TYPE, ncy.a(Boolean.valueOf(zD)));
                    linkedHashMap.put("os", ncy.c("android"));
                    linkedHashMap.put("bundle", ncy.c("org.xbet.client1"));
                    ((rny) onyVar).a("AffiliateInstallBadRequestException", new tny("logAffiliateInstallRequest", xp20.n(linkedHashMap)));
                }
                ((duj) zu3Var.F.get()).b(th, new o33((byte) 6));
                return Unit.f46060a;
            case 1:
                agk0 agk0Var = (agk0) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                if (!((tly) ((pz40) obj3).getValue()).f34169a) {
                    agk0Var.m(fFloatValue);
                }
                return Unit.f46060a;
            case 2:
                ((View) obj).getClass();
                ((bk2) obj3).invoke(Integer.valueOf(((v54) ((cp) obj2).u()).d));
                return Unit.f46060a;
            case 3:
                db10 db10Var = (db10) obj;
                db10Var.getClass();
                DSLottieEmptyContainer dSLottieEmptyContainer = db10Var.b;
                jkm jkmVar = ((v1o) ((x1o) obj3)).f36643a;
                int i = DSLottieEmptyContainer.d;
                dSLottieEmptyContainer.b(jkmVar, 10000L, new bmh((byte) 12));
                dSLottieEmptyContainer.setButtonOnClickListener(new zk2((Function1) obj2, (byte) 16));
                return Unit.f46060a;
            case 4:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((kc4) obj3).O(new AuthDataErrorModel(th2, new AuthDataModel.Qr((String) obj2)));
                return Unit.f46060a;
            case 5:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((kc4) obj3).O(new AuthDataErrorModel(th3, (AuthDataModel.Social) obj2));
                return Unit.f46060a;
            case 6:
                ((k0w0) obj).h(((kc4) obj3).T.a(new RegistrationDefaultScreenParams((q7f0) CollectionsKt.U((List) obj2))));
                return Unit.f46060a;
            case 7:
                hcz hczVar = (hcz) obj;
                qek0 qek0Var = ze4.g2;
                hczVar.getClass();
                List list = (List) ((l7m0) obj3).getValue();
                hczVar.f(list.size(), new ci2(new or3((byte) 17), list, (byte) 15), new b8(list, (byte) 23), new ugd(802480018, true, new xe4(list, (ze4) obj2, b2)));
                return Unit.f46060a;
            case 8:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ((fh4) obj3).V.getClass();
                k0w0Var.h(new ConfirmationNewPlaceScreen((ConfirmationNewPlaceScreenType) obj2));
                return Unit.f46060a;
            case 9:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((fh4) obj3).P(new AuthDataErrorModel(th4, (AuthDataModel.Social) obj2));
                return Unit.f46060a;
            case 10:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((fh4) obj3).P(new AuthDataErrorModel(th5, new AuthDataModel.Qr((String) obj2)));
                return Unit.f46060a;
            case 11:
                t89 t89Var = (t89) obj3;
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                if (((Boolean) ((pz40) obj2).getValue()).booleanValue()) {
                    g7zVar.a();
                } else {
                    fhl.r(g7zVar, t89Var, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                fhl.u(g7zVar, StaticColors.INSTANCE.m71getBlack300d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 12:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((hk4) obj3).P(new AuthDataErrorModel(th6, new AuthDataModel.Qr((String) obj2)));
                return Unit.f46060a;
            case 13:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((hk4) obj3).P(new AuthDataErrorModel(th7, (AuthDataModel.Social) obj2));
                return Unit.f46060a;
            case 14:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((df2) obj3).invoke(th8, (uu4) obj2);
                return Unit.f46060a;
            case 15:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((df2) obj3).invoke(th9, (uu4) obj2);
                return Unit.f46060a;
            case 16:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((df2) obj3).invoke(th10, (ru4) obj2);
                return Unit.f46060a;
            case 17:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((df2) obj3).invoke(th11, (uu4) obj2);
                return Unit.f46060a;
            case 18:
                ((String) obj).getClass();
                ((Function1) obj3).invoke((xo4) obj2);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                rek0 rek0Var = ((kp4) obj3).s;
                String message = ((Throwable) obj2).getMessage();
                if (message == null) {
                    message = "";
                }
                rek0Var.getClass();
                k0w0Var2.h(new AuthenticatorScreenFactoryImpl$registrationFailScreen$1(message, false));
                return Unit.f46060a;
            case 20:
                ((Long) obj).getClass();
                ((Function1) obj3).invoke(((e860) obj2).f7358a);
                return Unit.f46060a;
            case 21:
                ((Long) obj).getClass();
                ((Function1) obj3).invoke(((ydj) obj2).f42441a);
                return Unit.f46060a;
            case 22:
                ((mvl) obj).getClass();
                ((Function1) obj3).invoke(((wq4) obj2).b);
                return Unit.f46060a;
            case 23:
                String str2 = (String) obj2;
                kkm kkmVar = (kkm) obj;
                kkmVar.getClass();
                DSLottieEmptyContainer dSLottieEmptyContainer2 = kkmVar.b;
                dSLottieEmptyContainer2.a((jkm) obj3);
                if (str2.length() > 0) {
                    dSLottieEmptyContainer2.setSubtitleText(str2);
                }
                return Unit.f46060a;
            case 24:
                ku4 ku4Var = (ku4) obj3;
                Function0 function0 = (Function0) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    ku4Var.v.f(new qt4(ku4Var.B, ku4Var.C));
                } else if (iIntValue == 1) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fy4 fy4Var = (fy4) obj3;
                ((nb7) fy4Var.J.f20392a.b).b = ((m97) obj).d;
                fy4Var.a0.f(new fw4(new xdk0(rek0.b, (String) obj2, null, null, jdk0.f16332a, null, 108)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ka5 ka5Var = (ka5) obj3;
                la5 la5Var = (la5) obj2;
                scq0 scq0Var = ka5Var.o;
                if (scq0Var != null) {
                    scq0Var.b();
                }
                ka5Var.o = null;
                odd oddVar = la5Var.c;
                if (oddVar != null) {
                    oddVar.N(Unit.f46060a);
                }
                la5Var.c = null;
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rb5 rb5Var = (rb5) obj3;
                uhd uhdVar = (uhd) obj2;
                rb5Var.a(uhdVar);
                return new pr0(rb5Var, uhdVar, (byte) 2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cg5 cg5Var = (cg5) obj3;
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                th12.getLocalizedMessage();
                cg5Var.j.o(null, i8d.e);
                cg5Var.f(th12, (vne) obj2);
                return Unit.f46060a;
            default:
                a4x a4xVar = (a4x) obj3;
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8zVar.e(a4xVar.size(), new ci2(new ij4((byte) 22), a4xVar, (byte) 18), null, new ci2(new ij4(b3), a4xVar, (byte) 19), new ugd(-1117249557, true, new xe4(a4xVar, (rfv) obj2, b4)));
                return Unit.f46060a;
        }
    }
}
