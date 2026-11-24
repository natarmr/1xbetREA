package a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.cyberstatistic.impl.navigation.CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;
import org.xplatform.cyber.game.dota.api.presentation.CyberGameDotaScreenParams;
import org.xplatform.statistic.full_statistic.impl.presentation.FullStatisticScreen;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z08 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43553a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z08(int i, Object obj, byte b) {
        this.f43553a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r11v17 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j4n j4nVar;
        int i;
        String str;
        byte b = this.f43553a;
        byte b2 = 28;
        byte b3 = 3;
        byte b4 = 7;
        char c = 2;
        boolean z = false;
        byte b5 = 1;
        String str2 = 0;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                a4x a4xVar = (a4x) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(a4xVar.size(), new at7(new nk7((byte) 10), a4xVar, b5), new b8(a4xVar, b2), new ugd(802480018, true, new c18(i2, a4xVar)));
                return Unit.f46060a;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new x9c((r7f) obj2, i2, (byte) 4))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 2:
                ebl eblVar = (ebl) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                gr00 gr00Var = eblVar.V;
                CyberGameDotaScreenParams cyberGameDotaScreenParams = eblVar.r;
                m9s m9sVarC = d5c.C(((f9l) eblVar.D()).c);
                CyberGameStatisticScreenParams cyberGameStatisticScreenParams = new CyberGameStatisticScreenParams(sj3.j0(m9sVarC != null ? m9sVarC.G : 0, String.valueOf(cyberGameDotaScreenParams.f46514a)), this.b, cyberGameDotaScreenParams.i, cyberGameDotaScreenParams.d);
                gr00Var.getClass();
                k0w0Var2.h(new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams, gr00Var));
                return Unit.f46060a;
            case 3:
                boolean zH1 = ((nqq) obj).h1(i2);
                ((mie0) obj2).f21842a = Boolean.valueOf(zH1);
                return Boolean.valueOf(zH1);
            case 4:
                dit ditVar = (dit) obj2;
                hcz hczVar2 = (hcz) obj;
                xak xakVar = dit.m2;
                hczVar2.getClass();
                List listN = ditVar.l2.n(ditVar, dit.n2[1]);
                hczVar2.f(listN.size(), null, new far(listN, b4), new ugd(2039820996, true, new cit(listN, ditVar, i2, z ? 1 : 0)));
                return Unit.f46060a;
            case 5:
                fit fitVar = (fit) obj2;
                hcz hczVar3 = (hcz) obj;
                ddk ddkVar = fit.m2;
                hczVar3.getClass();
                List listN2 = fitVar.l2.n(fitVar, fit.n2[1]);
                hczVar3.f(listN2.size(), null, new far(listN2, (byte) 8), new ugd(2039820996, true, new cit(listN2, fitVar, i2, b5)));
                return Unit.f46060a;
            case 6:
                fsv fsvVar = (fsv) obj2;
                int iIntValue = ((Integer) obj).intValue();
                fsvVar.t(iIntValue, i2);
                RecyclerView recyclerView = fsvVar.w;
                xhe0 xhe0VarO = recyclerView != null ? recyclerView.O(i2 + 1) : null;
                vju0 vju0Var = xhe0VarO instanceof vju0 ? (vju0) xhe0VarO : null;
                if (vju0Var != null) {
                    vju0Var.A(iIntValue);
                    BracketItemView bracketItemView = (BracketItemView) vju0Var.u.d;
                    float f = iIntValue;
                    int i3 = BracketItemView.n1;
                    bracketItemView.l(f, true, true, true, true);
                    vju0Var.y(vju0Var.d(), false);
                }
                return Unit.f46060a;
            case 7:
                rbz rbzVar = (rbz) obj;
                ovj ovjVar = ((d9z) obj2).f5722a;
                rfk0 rfk0VarJ = vdx.J();
                vdx.Y(rfk0VarJ, vdx.W(rfk0VarJ), rfk0VarJ != null ? rfk0VarJ.e() : null);
                ovjVar.getClass();
                int i4 = rbzVar.f30213a;
                int i5 = i4 != -1 ? i4 : 2;
                for (int i6 = 0; i6 < i5; i6++) {
                    rbzVar.a(i2 + i6);
                }
                return Unit.f46060a;
            case 8:
                rbz rbzVar2 = (rbz) obj;
                pcz pczVar = ((xcz) obj2).f40671a;
                rfk0 rfk0VarJ2 = vdx.J();
                vdx.Y(rfk0VarJ2, vdx.W(rfk0VarJ2), rfk0VarJ2 != null ? rfk0VarJ2.e() : null);
                pczVar.b(rbzVar2, i2);
                return Unit.f46060a;
            case 9:
                f120 f120Var = (f120) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                nek nekVar = f120Var.f0;
                String str3 = ((v020) f120Var.D()).f;
                nekVar.getClass();
                k0w0Var3.h(new FullStatisticScreen(str3, i2));
                return Unit.f46060a;
            case 10:
                nc30 nc30Var = (nc30) obj2;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                List list = (List) nc30Var.d.get(i2);
                hczVar4.f(list.size(), null, new bgz(list, (byte) 27), new ugd(2039820996, true, new cit(list, nc30Var, i2, c)));
                return Unit.f46060a;
            case 11:
                qd30 qd30Var = (qd30) obj2;
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                List list2 = (List) qd30Var.e.get(i2);
                hczVar5.f(list2.size(), null, new bgz(list2, b2), new ugd(2039820996, true, new cit(list2, qd30Var, i2, b3)));
                return Unit.f46060a;
            case 12:
                nx50 nx50Var = (nx50) obj2;
                ((View) obj).getClass();
                rh60 rh60Var = nx50Var.d == mx50.f22536a ? nx50Var.b : null;
                if (rh60Var != null) {
                    nx50Var.d = mx50.b;
                    nx50Var.f24266a = i2;
                    rh60Var.c(i2);
                }
                return Unit.f46060a;
            case 13:
                ov0 ov0Var = (ov0) obj2;
                n0o0 n0o0Var = (n0o0) ov0Var.e;
                l730 l730Var = (l730) obj;
                l730Var.getClass();
                if (l730Var instanceof i730) {
                    int iOrdinal = ((i730) l730Var).f14272a.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.bets_on_players_no_bets_pitch_subtitle;
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        i = R.string.bets_on_players_no_bets_list_subtitle;
                    }
                    int i7 = i;
                    pdm pdmVar = pdm.c;
                    xuz xuzVar = pb10.c;
                    pb10 pb10Var = pb10.r1;
                    xuzVar.getClass();
                    return new z6a0(new mdm(xuz.a(pb10Var, i2), pdmVar, null, 0, 0, i7, 0, 0, 0L, 0L, 732));
                }
                if (!l730Var.equals(j730.f16021a)) {
                    if (l730Var instanceof k730) {
                        return new b7a0((a4x) ((fee) ((n0o0) ov0Var.f).getValue()).b(), ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue());
                    }
                    t9f.b();
                    return null;
                }
                int iOrdinal2 = ((udl0) ov0Var.d).ordinal();
                if (iOrdinal2 == 0) {
                    j4nVar = g4n.f10675a;
                } else if (iOrdinal2 == 1) {
                    j4nVar = f4n.f8923a;
                } else if (iOrdinal2 == 2) {
                    j4nVar = i4n.f14154a;
                } else {
                    if (iOrdinal2 != 3) {
                        t9f.b();
                        return null;
                    }
                    j4nVar = h4n.f12441a;
                }
                return new a7a0(j4nVar, ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue());
            case 14:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                k0w0Var4.h(oct.f(((kgb0) obj2).S, 0L, null, this.b, null, null, 27));
                return Unit.f46060a;
            case 15:
                aye0 aye0Var = (aye0) obj;
                aye0Var.getClass();
                q1f0 q1f0VarA = q1f0.a(aye0Var.h, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, Integer.valueOf(i2), null, null, false, false, null, null, false, false, null, -536870913, 127);
                Map mapD = dq00.d(aye0Var, kotlin.collections.a.c(u0f0.j));
                vzg0 vzg0Var = (vzg0) ((dq00) obj2).b;
                vzg0Var.e("SOCIAL_TYPE_SELECTED", q1f0VarA.D);
                vzg0Var.e("SOCIAL", q1f0VarA.E);
                return new Pair(q1f0VarA, mapD);
            case 16:
                u4f0 u4f0Var = (u4f0) obj;
                u4f0Var.getClass();
                r1f0 r1f0VarA = r1f0.a(u4f0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, Integer.valueOf(i2), null, null, false, null, null, null, false, false, null, -536870913, 127);
                Map mapF = g090.f(u4f0Var, kotlin.collections.a.c(u0f0.j));
                vzg0 vzg0Var2 = (vzg0) ((g090) obj2).f10448a;
                vzg0Var2.e("SOCIAL_TYPE_SELECTED", r1f0VarA.D);
                vzg0Var2.e("SOCIAL", r1f0VarA.E);
                return new Pair(r1f0VarA, mapF);
            case 17:
                mbf0 mbf0Var = (mbf0) obj;
                mbf0Var.getClass();
                p1f0 p1f0VarA = p1f0.a(mbf0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, Integer.valueOf(i2), null, null, false, false, null, null, false, false, null, -536870913, 127);
                Map mapE = j910.e(mbf0Var, kotlin.collections.a.c(u0f0.j));
                vzg0 vzg0Var3 = (vzg0) ((j910) obj2).b;
                vzg0Var3.e("SOCIAL_TYPE_SELECTED", p1f0VarA.D);
                vzg0Var3.e("SOCIAL", p1f0VarA.E);
                return new Pair(p1f0VarA, mapE);
            case 18:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                tik0 tik0Var = (tik0) obj2;
                iiy[] iiyVarArr = tik0.Q1;
                ((View) obj).getClass();
                tkz tkzVarQ = x0x.Q(tik0Var.x());
                rwj rwjVar = tvk.f34603a;
                qjj.W(tkzVarQ, ys10.f43147a, null, new u52((Object) tik0Var, i2, (yje) str2, (byte) 24), 2);
                cjk0 cjk0VarI0 = tik0Var.I0();
                if (i2 == 1) {
                    str = "VK";
                } else if (i2 == 5) {
                    str = Payload.RESPONSE_OK;
                } else if (i2 == 7) {
                    str = "Yandex";
                } else if (i2 == 9) {
                    str = "Mail";
                } else if (i2 == 11) {
                    str = "Google";
                } else if (i2 == 13) {
                    str = "XCom";
                } else if (i2 == 17) {
                    str = "Telegram";
                } else if (i2 != 19) {
                    str = i2 != 31 ? "Unknown" : "Discord";
                } else {
                    str = "Apple_ID";
                }
                ag3 ag3Var = cjk0VarI0.e;
                ag3Var.getClass();
                i8i.D("social_media", str, ag3Var.f809a, "acc_social_media_add");
                au0 au0Var = cjk0VarI0.f;
                au0Var.getClass();
                b1j.v(str, au0Var.f1455a, 3257L);
                return Unit.f46060a;
            case 20:
                Object obj3 = ((List) obj2).get(i2);
                obj3.getClass();
                ((View) obj3).setVisibility(0);
                return Unit.f46060a;
            default:
                y2m0 y2m0Var = rxo0.j2;
                ((View) obj).getClass();
                ((rxo0) obj2).T0(i2);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ z08(Object obj, int i, byte b) {
        this.f43553a = b;
        this.c = obj;
        this.b = i;
    }
}
