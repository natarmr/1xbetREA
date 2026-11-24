package a;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.cyberstatistic.impl.navigation.CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampResultsParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsResultsParams;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l0i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19204a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0i0(t0i0 t0i0Var, Function1 function1, rqm rqmVar, Function1 function2) {
        this.f19204a = (byte) 0;
        this.b = t0i0Var;
        this.c = function1;
        this.e = rqmVar;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentScreen fragmentScreenA;
        FragmentScreen fragmentScreenA2;
        FragmentScreen fragmentScreenA3;
        FragmentScreen fragmentScreenA4;
        byte b = this.f19204a;
        byte b2 = 9;
        byte b3 = 2;
        byte b4 = 3;
        byte b5 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                t0i0 t0i0Var = (t0i0) obj5;
                Function1 function1 = (Function1) obj4;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.e(hczVar, "points", null, new ugd(-709860727, true, new rqc0((rqm) obj2, (byte) 7)), 2);
                hcz.e(hczVar, "rules_footer", null, ay3.k, 2);
                a4x a4xVar = t0i0Var.f33121a;
                hczVar.f(a4xVar.size(), new pwe0(new eoh0((byte) 7), a4xVar, (byte) 19), new pwe0(new eoh0((byte) 8), a4xVar, (byte) 20), new ugd(802480018, true, new njh0(a4xVar, (Function1) obj3, b3)));
                r0i0 r0i0Var = t0i0Var.c;
                if (r0i0Var instanceof o0i0) {
                    hcz.e(hczVar, "info_footer", null, ay3.l, 2);
                } else if (r0i0Var instanceof q0i0) {
                    hcz.e(hczVar, "single_cashback", null, new ugd(851192412, true, new in80(function1, t0i0Var, (byte) 21)), 2);
                }
                break;
            case 1:
                l7m0 l7m0Var = (l7m0) obj5;
                List list = (List) obj4;
                xk80 xk80Var = (xk80) obj3;
                vne vneVar = (vne) obj2;
                mxx mxxVar = (mxx) obj;
                mxxVar.getClass();
                DsTabs dsTabs = mxxVar.b;
                if (dsTabs.getCurrentTabsStyle() != ((ucj0) l7m0Var.getValue()).f || dsTabs.getSelectedTabModel() == null) {
                    dsTabs.setTabsStyle(((ucj0) l7m0Var.getValue()).f);
                    dsTabs.c(list);
                    dsTabs.v = new euv(b4, vneVar, xk80Var);
                }
                dsTabs.k(xk80Var.k());
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                wdk0.k((wdk0) ((kd30) obj5).b, new xdk0(rek0.b, str, null, null, null, null, 124), (Fragment) obj4, null, (ViewGroup) obj3, false, null, 1012);
                ((Function0) obj2).invoke();
                break;
            case 3:
                f1l0 f1l0Var = (f1l0) obj5;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.d("TOP_CONTENT_KEY", "TOP_CONTENT_KEY", new ugd(-2020525467, true, new v1i0(f1l0Var, (w6k) obj3, (Function1) obj4, (pz40) obj2, (byte) 2)));
                if (f1l0Var instanceof e1l0) {
                    a4x a4xVar2 = ((e1l0) f1l0Var).g;
                    hczVar2.f(a4xVar2.size(), new y9k0(xdx.E(a4xVar2, new ejk0((byte) 17)), (byte) 3), new pwe0(new ejk0((byte) 18), a4xVar2, (byte) 27), new ugd(-1311333631, true, new zd1(a4xVar2, b2)));
                }
                break;
            case 4:
                nsl0 nsl0Var = (nsl0) obj5;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar3 = nsl0Var.c;
                hczVar3.f(a4xVar3.size(), new o3l0(new gcl0((byte) 15), a4xVar3, (byte) 18), new y9k0(a4xVar3, (byte) 20), new ugd(2039820996, true, new vll(a4xVar3, (ekf0) obj4, nsl0Var, (pz40) obj3, (vne) obj2, (byte) 4)));
                break;
            case 5:
                aqm0 aqm0Var = (aqm0) obj5;
                jzj jzjVar = (jzj) obj4;
                xpm0 xpm0Var = (xpm0) obj3;
                pot0 pot0Var = (pot0) obj2;
                Throwable th = (Throwable) obj;
                if ((th instanceof ozw) && ((ozw) th).f26118a == 3) {
                    qjj.W(aqm0Var.b.f, null, null, new lpp(aqm0Var, pot0Var, xpm0Var, null, (byte) 6), 3);
                } else {
                    odd oddVar = xpm0Var.d;
                    jzjVar.getClass();
                    if (th == null) {
                        oddVar.N(jzjVar.getCompleted());
                    } else if (th instanceof CancellationException) {
                        oddVar.s((CancellationException) th);
                    } else {
                        oddVar.b0(th);
                    }
                }
                break;
            case 6:
                zap0 zap0Var = (zap0) obj5;
                String str2 = (String) obj4;
                kie0 kie0Var = (kie0) obj3;
                lap0 lap0Var = (lap0) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                List listB = gql0.b();
                TeamDetailsResultsParams teamDetailsResultsParams = zap0Var.o;
                if (listB.contains(Long.valueOf(teamDetailsResultsParams.f46570a))) {
                    gr00 gr00Var = zap0Var.u;
                    CyberGameStatisticScreenParams cyberGameStatisticScreenParams = new CyberGameStatisticScreenParams(str2, teamDetailsResultsParams.f46570a, 0, kie0Var.f18333a, "", "", "", "", -1L, "");
                    gr00Var.getClass();
                    fragmentScreenA = new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams, gr00Var);
                } else {
                    fragmentScreenA = ((zfm0) zap0Var.v).a(40L, String.valueOf(lap0Var.f19716a));
                }
                k0w0Var.h(fragmentScreenA);
                break;
            case 7:
                wbp0 wbp0Var = (wbp0) obj5;
                String str3 = (String) obj4;
                kie0 kie0Var2 = (kie0) obj3;
                h8p0 h8p0Var = (h8p0) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                List listB2 = gql0.b();
                TeamDetailsParams teamDetailsParams = wbp0Var.p;
                if (listB2.contains(Long.valueOf(teamDetailsParams.f46569a))) {
                    gr00 gr00Var2 = wbp0Var.y;
                    CyberGameStatisticScreenParams cyberGameStatisticScreenParams2 = new CyberGameStatisticScreenParams(str3, teamDetailsParams.f46569a, 0, kie0Var2.f18333a, "", "", "", "", -1L, "");
                    gr00Var2.getClass();
                    fragmentScreenA2 = new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams2, gr00Var2);
                } else {
                    fragmentScreenA2 = ((zfm0) wbp0Var.z).a(40L, String.valueOf(h8p0Var.f12639a));
                }
                k0w0Var2.h(fragmentScreenA2);
                break;
            case 8:
                a4x a4xVar4 = (a4x) obj5;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(a4xVar4.size(), new vdr0(xdx.E(a4xVar4, new t9r0(b2)), (byte) 0), new zcn0(new t9r0((byte) 10), a4xVar4, (byte) 29), new ugd(-1311333631, true, new gq4((List) a4xVar4, (Function1) obj4, obj3, obj2, (byte) 14)));
                break;
            case 9:
                a4x a4xVar5 = (a4x) obj5;
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hcz.e(hczVar5, null, null, new ugd(-1036639654, true, new gcn0((he80) obj3, (byte) 14)), 3);
                hczVar5.f(a4xVar5.size(), null, new vdr0(a4xVar5, (byte) 3), new ugd(2039820996, true, new zip0(a4xVar5, (Function1) obj4, (Function2) obj2, (byte) 5)));
                break;
            case 10:
                a4x a4xVar6 = (a4x) obj5;
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                hczVar6.f(a4xVar6.size(), new xlr0(new t9r0((byte) 22), a4xVar6, b5), new vdr0(a4xVar6, (byte) 4), new ugd(802480018, true, new gq4((List) a4xVar6, (Function1) obj4, obj3, obj2, (byte) 15)));
                break;
            case 11:
                o6s0 o6s0Var = (o6s0) obj5;
                lie0 lie0Var = (lie0) obj4;
                kie0 kie0Var3 = (kie0) obj3;
                vne vneVar2 = (vne) obj2;
                o6s0Var.b(((ne60) ((t33) obj).d()).f23370a);
                long jA = o6s0Var.a();
                if (ne60.c(jA, lie0Var.f20100a)) {
                    int i = kie0Var3.f18333a + 1;
                    kie0Var3.f18333a = i;
                    if (i >= 2) {
                        d5c.G(vneVar2, null);
                    }
                } else {
                    kie0Var3.f18333a = 0;
                    lie0Var.f20100a = jA;
                }
                break;
            case 12:
                pu90 pu90Var = (pu90) obj5;
                pu90 pu90Var2 = (pu90) obj4;
                pu90 pu90Var3 = (pu90) obj3;
                t33 t33Var = (t33) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, 0, 0, 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, 0, 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, 0, si30.b(((Number) t33Var.d()).floatValue()), 0.0f);
                }
                break;
            case 13:
                wbt0 wbt0Var = (wbt0) obj5;
                String str4 = (String) obj4;
                kie0 kie0Var4 = (kie0) obj3;
                hbt0 hbt0Var = (hbt0) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                List listB3 = gql0.b();
                UniversalChampResultsParams universalChampResultsParams = wbt0Var.o;
                if (listB3.contains(Long.valueOf(universalChampResultsParams.c))) {
                    gr00 gr00Var3 = wbt0Var.t;
                    CyberGameStatisticScreenParams cyberGameStatisticScreenParams3 = new CyberGameStatisticScreenParams(str4, universalChampResultsParams.c, 0, kie0Var4.f18333a, "", "", "", "", -1L, "");
                    gr00Var3.getClass();
                    fragmentScreenA3 = new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams3, gr00Var3);
                } else {
                    fragmentScreenA3 = ((zfm0) wbt0Var.u).a(40L, String.valueOf(hbt0Var.f12787a));
                }
                k0w0Var3.h(fragmentScreenA3);
                break;
            case 14:
                jdt0 jdt0Var = (jdt0) obj5;
                String str5 = (String) obj4;
                kie0 kie0Var5 = (kie0) obj3;
                q8t0 q8t0Var = (q8t0) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                List listB4 = gql0.b();
                UniversalChampParams universalChampParams = jdt0Var.o;
                if (listB4.contains(Long.valueOf(universalChampParams.c))) {
                    gr00 gr00Var4 = jdt0Var.w;
                    CyberGameStatisticScreenParams cyberGameStatisticScreenParams4 = new CyberGameStatisticScreenParams(str5, universalChampParams.c, 0, kie0Var5.f18333a, "", "", "", "", -1L, "");
                    gr00Var4.getClass();
                    fragmentScreenA4 = new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams4, gr00Var4);
                } else {
                    fragmentScreenA4 = ((zfm0) jdt0Var.x).a(40L, String.valueOf(q8t0Var.f28315a));
                }
                k0w0Var4.h(fragmentScreenA4);
                break;
            default:
                ki9 ki9Var = (ki9) obj5;
                Function1 function2 = (Function1) obj4;
                p6t0 p6t0Var = (p6t0) obj3;
                Function2 function3 = (Function2) obj2;
                yfu0 yfu0Var = (yfu0) obj;
                yfu0Var.getClass();
                p6t0 p6t0Var2 = ki9Var.f18326a;
                if (p6t0Var2 == null) {
                    function2.invoke(yfu0Var);
                } else {
                    Collection<r6t0> collectionO = p6t0Var.o(p6t0Var2, p6t0Var);
                    if (collectionO != null) {
                        for (r6t0 r6t0Var : collectionO) {
                            r6t0Var.getClass();
                            function3.invoke(yfu0Var, r6t0Var);
                        }
                    }
                }
                ki9Var.f18326a = p6t0Var;
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ l0i0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f19204a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ l0i0(Object obj, Object obj2, Function1 function1, Object obj3, byte b) {
        this.f19204a = b;
        this.b = obj;
        this.d = obj2;
        this.c = function1;
        this.e = obj3;
    }
}
