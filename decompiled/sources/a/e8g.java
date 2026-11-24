package a;

import android.view.ViewConfiguration;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e8g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7369a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e8g(Object obj, byte b) {
        this.f7369a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7369a;
        byte b2 = 1;
        byte b3 = 0;
        yje yjeVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                aei aeiVar = ((h8g) obj).g2;
                if (aeiVar != null) {
                    return new q0h0(aeiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                return Float.valueOf(((Number) ((v8g) obj).s.getValue()).floatValue() * 386.0878f * ViewConfiguration.getScrollFriction());
            case 2:
                xai xaiVar = ((b9g) obj).K1;
                if (xaiVar != null) {
                    return new q0h0(xaiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                qud qudVar = b9g.R1;
                ((c9g) obj).c.setVisibility(0);
                return Unit.f46060a;
            case 4:
                tag tagVar = ((hbg) obj).c;
                qjj.W(jiu0.a(tagVar.s()), null, null, new oag(tagVar, yjeVar, b2), 3);
                dyb.u0();
                return Boolean.TRUE;
            case 5:
                nwd nwdVar = dcg.P1;
                fiu0 fiu0Var = ((dcg) obj).L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 6:
                return ((weg) obj).f39017a;
            case 7:
                return ((vfg) obj).f37329a;
            case 8:
                return Integer.valueOf(((i4) obj).size());
            case 9:
                return ((tig) obj).f34008a.f20007a;
            case 10:
                return (sfh) ((qjg) obj).f28837a.b(sre0.f32672a.b(sfh.class));
            case 11:
                return (pkg) ((gii0) ((xr) obj).f41344a).b(sre0.f32672a.b(pkg.class));
            case 12:
                return (kpg) ((gii0) ((chf0) obj).b).b(sre0.f32672a.b(kpg.class));
            case 13:
                return (y2h) ((gii0) ((ehf0) obj).b).b(sre0.f32672a.b(y2h.class));
            case 14:
                kwd kwdVar = y4h.W1;
                fiu0 fiu0Var2 = ((y4h) obj).M1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 15:
                lc00 lc00VarB = kotlin.collections.a.b();
                hdh hdhVar = ((c5h) obj).e.a().c.f7565a;
                if (hdhVar.b) {
                    lc00VarB.add(CyberGamesPage.Real.INSTANCE);
                }
                if (hdhVar.d) {
                    lc00VarB.add(CyberGamesPage.Virtual.INSTANCE);
                }
                if (hdhVar.c) {
                    lc00VarB.add(CyberGamesPage.OneXCyber.INSTANCE);
                }
                return kotlin.collections.a.a(lc00VarB);
            case 16:
                return (tih) ((gii0) ((yzn0) obj).f43523a).b(sre0.f32672a.b(tih.class));
            case 17:
                kud kudVar = muh.R1;
                fiu0 fiu0Var3 = ((muh) obj).P1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 18:
                return (evh) ((gii0) ((xr) obj).f41344a).b(sre0.f32672a.b(evh.class));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                afi afiVar = ((yvh) obj).M1;
                if (afiVar != null) {
                    return new q0h0(afiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 20:
                return Integer.valueOf(((ewh) obj).f);
            case 21:
                return (twh) ((gii0) ((c5k) obj).f3775a).b(sre0.f32672a.b(twh.class));
            case 22:
                bfi bfiVar = ((nxh) obj).M1;
                if (bfiVar != null) {
                    return new q0h0(bfiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 23:
                f3j f3jVar = (f3j) obj;
                ((rl1) f3jVar.e).d(new e3j(f3jVar, b3));
                return Unit.f46060a;
            case 24:
                kud kudVar2 = j4j.R1;
                fiu0 fiu0Var4 = ((j4j) obj).M1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cr crVar = (cr) obj;
                ((b4j) crVar.k).f("alert_bar", "start");
                je jeVar = (je) crVar.m;
                jeVar.d("alert_bar", "start");
                ((b4j) crVar.k).f1961a.c("dchallenge_alert_open");
                jeVar.f16351a.a(xun.f41520a, 10944L);
                i1w0 i1w0VarC = ((oeg0) crVar.g).c();
                k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                k0w0VarI.h(((peg0) crVar.h).q(new jr1(avc0.f1518a)));
                ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                iiy[] iiyVarArr = i5j.O1;
                fiu0 fiu0Var5 = ((i5j) obj).L1;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                v6j v6jVar = (v6j) obj;
                sac.V(jiu0.a(v6jVar), new x2i((byte) 8), null, v6jVar.c.f22085a, new u6j(v6jVar, yjeVar, b2), 10);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((f7j) obj).w();
                return Unit.f46060a;
            default:
                o7j o7jVar = (o7j) obj;
                o7jVar.x(o7jVar.k);
                return Unit.f46060a;
        }
    }
}
