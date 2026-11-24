package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.crystal.presentation.views.CrystalFieldView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb.Cs2GameLogBombTimerView;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jwd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17244a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jwd(Object obj, byte b) {
        this.f17244a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object objInvoke;
        byte b = this.f17244a;
        byte b2 = 1;
        yje yjeVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                kwd kwdVar = mwd.k2;
                fiu0 fiu0Var = ((mwd) obj).h2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                fiu0 fiu0Var2 = ((oyd) obj).h2;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                g1e g1eVar = (g1e) obj;
                if (!g1eVar.H) {
                    sac.V(jiu0.a(g1eVar), z0e.f43563a, null, null, new w0e(new IllegalStateException("Connection terminated"), g1eVar, yjeVar, b2), 14);
                }
                return Unit.f46060a;
            case 3:
                return ((ehf0) obj).a(":memory:");
            case 4:
                nhf0 nhf0Var = (nhf0) obj;
                String str = ((pru) nhf0Var.b).a().j0;
                mbe mbeVarM = nhf0Var.m();
                if (mbeVarM == mbe.f21502a) {
                    return "https://mobilaserverstest.xyz/supphelper/";
                }
                if (mbeVarM == mbe.c) {
                    return "https://consdesk.com/widget/stage/api/";
                }
                if (mbeVarM == mbe.d) {
                    return String.format("https://webx-consultant-widget-v2-%s.antflatair.com/services/widget/", Arrays.copyOf(new Object[]{((j1q0) nhf0Var.f23530a).f15748a.n().b}, 1));
                }
                return str.length() == 0 ? ohs0.n(((ntu) nhf0Var.c).a(), "/supphelper/") : kng0.l("https://", str, "/widget/");
            case 5:
                ((vae) obj).r.o(null, Boolean.TRUE);
                return Unit.f46060a;
            case 6:
                kud kudVar = dbe.k2;
                ibe ibeVarU0 = ((dbe) obj).U0();
                qjj.W(jiu0.a(ibeVarU0), null, null, new ya(ibeVarU0, yjeVar, (byte) 18), 3);
                return Unit.f46060a;
            case 7:
                fee feeVar = (fee) obj;
                l7m0 l7m0Var = feeVar.b;
                Function1 function1 = feeVar.f9402a;
                return (l7m0Var == null || (value = l7m0Var.getValue()) == null || (objInvoke = function1.invoke(value)) == null) ? function1.invoke(feeVar.a().getValue()) : objInvoke;
            case 8:
                return ((djz) obj).d();
            case 9:
                return new d7q0((ma80) obj, 0.0f);
            case 10:
                return ((OnexDatabase) ((xqe) obj).f41313a.b).k();
            case 11:
                ldi ldiVar = ((rye) obj).K1;
                if (ldiVar != null) {
                    return ldiVar;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 12:
                return (vre) ((gii0) ((ehf0) obj).b).b(sre0.f32672a.b(vre.class));
            case 13:
                return Integer.valueOf(((p2f) obj).g);
            case 14:
                std stdVar = d2f.O1;
                fiu0 fiu0Var3 = ((d2f) obj).K1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 15:
                ((lbf) obj).r.f(new zaf(false));
                return Unit.f46060a;
            case 16:
                vdf vdfVar = (vdf) obj;
                ydf ydfVar = (ydf) vdfVar.f37228a.b(ydf.Companion.serializer(), vdfVar.b);
                ydfVar.getClass();
                Boolean bool = ydfVar.f42433a;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = ydfVar.c;
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool3 = ydfVar.b;
                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = ydfVar.d;
                boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                Boolean bool5 = ydfVar.e;
                return new zdf(zBooleanValue, zBooleanValue3, zBooleanValue2, zBooleanValue4, bool5 != null ? bool5.booleanValue() : false);
            case 17:
                return CrystalFieldView.e((CrystalFieldView) obj);
            case 18:
                return (tef) ((tgf) obj).f33908a.b(sre0.f32672a.b(tef.class));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                rdi rdiVar = ((alf) obj).L1;
                if (rdiVar != null) {
                    return new q0h0(rdiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 20:
                return Cs2GameLogBombTimerView.c((Cs2GameLogBombTimerView) obj);
            case 21:
                ((xsh) obj).c.setVisibility(8);
                return Unit.f46060a;
            case 22:
                bsf bsfVar = (bsf) obj;
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.addAll((Collection) ((fee) bsfVar.m.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) bsfVar.n.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) bsfVar.p.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) bsfVar.o.getValue()).b(), lc00VarB);
            case 23:
                return (vwf) ((azj0) ((chf0) obj).b).e(sre0.f32672a.b(vwf.class), "https://betpari-ads.com/");
            case 24:
                usd usdVar = o0g.k2;
                fiu0 fiu0Var4 = ((o0g) obj).f2;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                g1g g1gVar = (g1g) obj;
                sac.V(jiu0.a(g1gVar), new r0g(g1gVar, (byte) 4), null, g1gVar.v.f22085a, new x0g(g1gVar, yjeVar, b2), 10);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kud kudVar2 = v4g.l2;
                fiu0 fiu0Var5 = ((v4g) obj).g2;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bei beiVar = ((l6g) obj).K1;
                if (beiVar != null) {
                    return new q0h0(beiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ydi ydiVar = ((s7g) obj).L1;
                if (ydiVar != null) {
                    return new q0h0(ydiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                zdi zdiVar = ((y7g) obj).K1;
                if (zdiVar != null) {
                    return new q0h0(zdiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
