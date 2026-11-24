package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;
import org.xplatform.mailing.api.presentation.models.TelegramBonusCodeParams;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nxo0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24292a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nxo0(Object obj, byte b) {
        this.f24292a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24292a;
        Object obj = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = oxo0.q2;
                fiu0 fiu0Var = ((oxo0) obj).k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                m6m0 m6m0Var = bop0.b;
                int i = ((sxo0) obj).f32987a;
                m6m0Var.getClass();
                return new uxo0(m6m0.j(i));
            case 2:
                return Integer.valueOf(((lyo0) obj).d.f15848a ? 1 : 0);
            case 3:
                return new z2p0(null, null, ((TeamBetScreenParams) obj).e, false, null, true, false);
            case 4:
                return new t6n(d4d.SECONDARY60, w6n.h, new c280(((wcp) obj).d, R.drawable.ic_glyph_placeholder_player));
            case 5:
                return (d5p0) ((gii0) ((afm0) obj).b).b(sre0.f32672a.b(d5p0.class));
            case 6:
                fiu0 fiu0Var2 = ((t5p0) obj).N1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 7:
                return (x6p0) ((gii0) ((fck0) obj).b).b(sre0.f32672a.b(x6p0.class));
            case 8:
                return ((i7p0) obj).f14303a;
            case 9:
                return ((pap0) obj).f26665a;
            case 10:
                return (gcp0) ((gii0) ((hcp0) obj).b).b(sre0.f32672a.b(gcp0.class));
            case 11:
                return (ogp0) ((gii0) ((trm0) obj).b).b(sre0.f32672a.b(ogp0.class));
            case 12:
                m6m0 m6m0Var2 = xgp0.P1;
                fiu0 fiu0Var3 = ((xgp0) obj).L1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 13:
                s9m0 s9m0Var = ajp0.r2;
                fiu0 fiu0Var4 = ((ajp0) obj).k2;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 14:
                return (yjp0) ((gii0) ((fuj0) obj).f10166a).b(sre0.f32672a.b(yjp0.class));
            case 15:
                nwi nwiVar = ((jkp0) obj).N1;
                if (nwiVar != null) {
                    return new q0h0(nwiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 16:
                return (slp0) ((gii0) ((g090) obj).f10448a).b(sre0.f32672a.b(slp0.class));
            case 17:
                return (omp0) ((gii0) ((afm0) obj).b).b(sre0.f32672a.b(omp0.class));
            case 18:
                owi owiVar = ((inp0) obj).N1;
                if (owiVar != null) {
                    return new q0h0(owiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                s9m0 s9m0Var2 = lop0.Q1;
                fiu0 fiu0Var5 = ((lop0) obj).O1;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 20:
                return (bpp0) ((gii0) ((fck0) obj).b).b(sre0.f32672a.b(bpp0.class));
            case 21:
                j6m0 j6m0Var = bsp0.R1;
                fiu0 fiu0Var6 = ((bsp0) obj).Q1;
                if (fiu0Var6 != null) {
                    return fiu0Var6;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 22:
                return Integer.valueOf(((ftp0) obj).d);
            case 23:
                return Integer.valueOf(((cgk0) obj).l());
            case 24:
                TelegramBonusCodeParams telegramBonusCodeParams = (TelegramBonusCodeParams) obj;
                return new tup0(telegramBonusCodeParams.b, telegramBonusCodeParams.f46766a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fwp0 fwp0Var = (fwp0) obj;
                g9m0 g9m0Var = fwp0.h2;
                return fwp0Var.f2.n(fwp0Var, fwp0.i2[1]);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return d5c.a(kotlin.coroutines.e.c(qem0.e(), ((mne) obj).f22085a));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wwi wwiVar = ((ryp0) obj).K1;
                if (wwiVar != null) {
                    return new q0h0(wwiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                g9m0 g9m0Var2 = b0q0.P1;
                fiu0 fiu0Var7 = ((b0q0) obj).M1;
                if (fiu0Var7 != null) {
                    return fiu0Var7;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                l2q0 l2q0Var = (l2q0) obj;
                l2q0Var.f1 = null;
                s0x.S(l2q0Var);
                n7x.I(l2q0Var);
                vfc.J(l2q0Var);
                return Boolean.TRUE;
        }
    }
}
