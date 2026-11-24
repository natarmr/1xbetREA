package a;

import android.gov.nist.core.Separators;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;
import org.xplatform.feed.notifictation.presentation.models.GameNotificationScreenParams;
import org.xplatform.services.mobile_services.impl.presentation.services.GoogleMessagingService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gmo implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11549a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gmo(Object obj, Object obj2, byte b) {
        this.f11549a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11549a;
        int i = 0;
        Object[] objArr = 0;
        yje yjeVar = null;
        byte b2 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((Function1) obj2).invoke(Boolean.valueOf(!((mmo) obj).c));
                return Unit.f46060a;
            case 1:
                ((Function1) obj2).invoke(new udm(((kem) obj).f18159a));
                return Unit.f46060a;
            case 2:
                String b3 = ((FavoriteCategoryUiState) obj2).getB();
                iun iunVar = iun.f15405a;
                return new x4p(b3, iunVar, iunVar, f4p.f8926a, null, g2v.b((g2v) obj, pb10.g, pdm.b, null, R.drawable.ic_glyph_circle_favourite, 0, R.string.empty_favorite_team_events_text, 0, 0, 0L, 0L, 980), iunVar, false, false, false, false, v5l0.LARGE_CARD_LARGE_SPORT_ICON, false, false);
            case 3:
                ((Function1) obj2).invoke(new n6p(((e7p) obj).f7338a));
                return Unit.f46060a;
            case 4:
                a8z a8zVar = (a8z) obj;
                String string = StringsKt.u0(kotlin.text.c.r((String) obj2, (String) a8zVar.getValue(), "", false)).toString();
                return cy7.c() ? w6x.q((String) a8zVar.getValue(), Separators.SP, string) : w6x.q(string, Separators.SP, (String) a8zVar.getValue());
            case 5:
                ((Function1) obj2).invoke(Long.valueOf(((dhm) obj).f6097a));
                return Unit.f46060a;
            case 6:
                zfp zfpVar = (zfp) obj;
                ((Function2) obj2).invoke(Long.valueOf(zfpVar.f44311a), Boolean.valueOf(zfpVar.b));
                return Unit.f46060a;
            case 7:
                y4a0 y4a0Var = (y4a0) obj;
                ((Function2) obj2).invoke(Long.valueOf(y4a0Var.b), Boolean.valueOf(y4a0Var.c));
                return Unit.f46060a;
            case 8:
                z4a0 z4a0Var = (z4a0) obj;
                ((Function2) obj2).invoke(Long.valueOf(z4a0Var.b), Boolean.valueOf(z4a0Var.c));
                return Unit.f46060a;
            case 9:
                b5a0 b5a0Var = (b5a0) obj;
                ((Function2) obj2).invoke(Long.valueOf(b5a0Var.b), Boolean.valueOf(b5a0Var.c));
                return Unit.f46060a;
            case 10:
                a5a0 a5a0Var = (a5a0) obj;
                ((Function2) obj2).invoke(Long.valueOf(a5a0Var.b), Boolean.valueOf(a5a0Var.c));
                return Unit.f46060a;
            case 11:
                return new o5q((nmy) obj2, (cny) obj);
            case 12:
                ((r8q) obj2).T.f(new c8q((String) obj));
                return Unit.f46060a;
            case 13:
                ((mie0) obj2).f21842a = mbc.R((lqq) obj, hu90.f13669a);
                return Unit.f46060a;
            case 14:
                ((mie0) obj2).f21842a = ((nqq) obj).b1();
                return Unit.f46060a;
            case 15:
                ((mie0) obj2).f21842a = mbc.R((uqq) obj, hu90.f13669a);
                return Unit.f46060a;
            case 16:
                ywv0 ywv0Var = (ywv0) obj2;
                View view = (View) obj;
                glt0 glt0Var = ywv0Var.d;
                ruv0 ruv0Var = ywv0Var.j;
                if (glt0Var.f()) {
                    ViewParent parent = view.getParent();
                    vjk vjkVar = parent instanceof vjk ? (vjk) parent : null;
                    Window window = vjkVar != null ? vjkVar.getWindow() : null;
                    if (window != null) {
                        window.setSoftInputMode(window.getAttributes().softInputMode | 3);
                    }
                    if (ruv0Var.g()) {
                        vne vneVar = ruv0Var.t;
                        yuv0 yuv0VarF = ruv0Var.f();
                        if (vneVar != null && yuv0VarF != null && !ruv0Var.d.b() && !ruv0Var.i && !ruv0Var.m) {
                            cvv0 cvv0VarF = ruv0Var.b.f();
                            float fG = cvv0VarF == null ? yuv0VarF.b : ktt0.g(cvv0VarF, yuv0VarF.f43288a);
                            c4m0 c4m0Var = ruv0Var.s;
                            if (c4m0Var != null) {
                                c4m0Var.cancel(null);
                            }
                            ruv0Var.s = null;
                            ruv0Var.k();
                            ruv0Var.o = 0;
                            ruv0Var.p = false;
                            qjj.W(vneVar, null, null, new puv0(ruv0Var, fG, yjeVar, b2), 3);
                        }
                        pkk0 pkk0Var = (pkk0) ((hgk0) ywv0Var.f43392a.g).getValue();
                        if (pkk0Var != null) {
                            ((r3k) pkk0Var).a();
                        }
                    }
                }
                return Unit.f46060a;
            case 17:
                dnr dnrVar = (dnr) obj2;
                pnr pnrVar = (pnr) obj;
                if (dnrVar.M1 == null) {
                    Intrinsics.h("actionMenuDialogFactory");
                    throw null;
                }
                androidx.fragment.app.e eVarC = dnrVar.C();
                eVarC.getClass();
                gfk0.h(eVarC, ((mnr) pnrVar).f22102a);
                return Unit.f46060a;
            case 18:
                t33 t33Var = (t33) obj2;
                return Float.valueOf(((Number) t33Var.d()).floatValue() == 0.0f ? l1e0.c(1.0f - (((Number) ((t33) obj).d()).floatValue() * 2.0f), 0.0f, 1.0f) : l1e0.c(1.0f - (((Number) t33Var.d()).floatValue() * 2.0f), 0.0f, 1.0f));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                qm7 qm7Var = (qm7) obj;
                ((f0s) obj2).n(qm7Var.c, qm7Var.d, true);
                return Unit.f46060a;
            case 20:
                nm7 nm7Var = (nm7) obj;
                ((f0s) obj2).n(nm7Var.f23759a, nm7Var.b, false);
                return Unit.f46060a;
            case 21:
                l0s l0sVar = (l0s) obj2;
                sac.V(jiu0.a(l0sVar.s()), new g0s(l0sVar, objArr == true ? 1 : 0), null, null, new cbq(l0sVar, (mie0) obj, yjeVar, (byte) 10), 14);
                return Unit.f46060a;
            case 22:
                dja djaVar = (dja) obj;
                Iterator it = ((List) ((l7m0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    if (((bja) it.next()).getType() == djaVar) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return Integer.valueOf(i);
            case 23:
                i7s i7sVar = (i7s) obj2;
                q7s q7sVar = (q7s) obj;
                if (i7sVar.M1 == null) {
                    Intrinsics.h("actionMenuDialogFactory");
                    throw null;
                }
                androidx.fragment.app.e eVarC2 = i7sVar.C();
                eVarC2.getClass();
                gfk0.h(eVarC2, ((n7s) q7sVar).f23056a);
                return Unit.f46060a;
            case 24:
                cjs cjsVar = (cjs) obj2;
                mjs mjsVar = (mjs) obj;
                if (cjsVar.M1 == null) {
                    Intrinsics.h("actionMenuDialogFactory");
                    throw null;
                }
                androidx.fragment.app.e eVarC3 = cjsVar.C();
                eVarC3.getClass();
                gfk0.h(eVarC3, ((jjs) mjsVar).f16633a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) obj2).invoke(Boolean.valueOf(!((zls) obj).b));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                boolean z = ((GameNotificationScreenParams) obj2).f;
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                int i2 = ((bzt) obj).f3488a.a().r;
                xuzVar.getClass();
                mdm mdmVar = new mdm(xuz.a(pb10Var, i2), null, null, 0, 0, R.string.data_retrieval_error, 0, 0, 0L, 0L, 990);
                iun iunVar2 = iun.f15405a;
                return new qns(true, false, false, false, z, mdmVar, null, iunVar2, iunVar2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                mu40 mu40Var = (mu40) obj;
                ((fet) obj2).F(mu40Var.f22397a, mu40Var.g, mu40Var.b, true);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return GoogleMessagingService.onMessageReceived$lambda$0((GoogleMessagingService) obj2, (HashMap) obj);
            default:
                ((Function1) obj2).invoke(((w1z) obj).f38425a);
                return Unit.f46060a;
        }
    }
}
