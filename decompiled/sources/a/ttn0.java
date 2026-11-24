package a;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.favorites.impl.presentation.teambet.presentation.models.TeamBetScreenParams;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;
import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$BetValue;
import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$UiState;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ttn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34517a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ttn0(Object obj, byte b) {
        this.f34517a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        evo0 evo0Var;
        Object value3;
        Object value4;
        Object value5;
        byte b = this.f34517a;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ktn0 ktn0Var = (ktn0) obj2;
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ktn0Var.p.setImageDrawable(drawable);
                }
                return Unit.f46060a;
            case 1:
                Editable editable = (Editable) obj;
                s2m0 s2m0Var = bun0.g2;
                editable.getClass();
                pun0 pun0VarR0 = ((bun0) obj2).R0();
                String string = editable.toString();
                string.getClass();
                pun0VarR0.w(new SwipexChangeBetValueViewModel$BetValue((((SwipexChangeBetValueViewModel$UiState) pun0VarR0.v.f40549a.getValue()).b.f47114a != null ? 1 : 0) != 0 ? string : null), true);
                return Unit.f46060a;
            case 2:
                bvn0 bvn0Var = (bvn0) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = bvn0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    bvn0Var.f.getClass();
                } while (!p7m0Var.m(value, gvn0.a((gvn0) value, true, false, false, false, null, null, null, 254)));
                th.printStackTrace();
                return Unit.f46060a;
            case 3:
                x6o0 x6o0Var = (x6o0) obj;
                s9m0 s9m0Var = d7o0.R1;
                x6o0Var.getClass();
                ((d7o0) obj2).G0().x(x6o0Var);
                return Unit.f46060a;
            case 4:
                k7o0 k7o0Var = (k7o0) obj2;
                i7o0 i7o0Var = (i7o0) obj;
                i7o0Var.getClass();
                List list = i7o0Var.d;
                Integer num = i7o0Var.b;
                int iIntValue = num != null ? num.intValue() : 0;
                ctf0 ctf0Var = k7o0Var.b;
                v5l0 v5l0Var = i7o0Var.g.g.y;
                q0s q0sVar = q0s.f27918a;
                boolean z = i7o0Var.h;
                ctf0Var.getClass();
                if (list == null || list.isEmpty()) {
                    return iun.f15405a;
                }
                ArrayList<x0g0> arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(pzw.Z((icg) it.next(), q0sVar, v5l0Var, ctf0Var));
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (x0g0 x0g0Var : arrayList) {
                    arrayList2.add(new f7o0(ua80.e(iIntValue, "RESULTS", x0g0Var.getKey()), x0g0Var, z));
                }
                return dyb.o0(arrayList2);
            case 5:
                m7o0 m7o0Var = (m7o0) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = m7o0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    m7o0Var.f.getClass();
                } while (!p7m0Var2.m(value2, i7o0.a((i7o0) value2, false, null, null, null, false, 215)));
                return Unit.f46060a;
            case 6:
                zco0 zco0Var = (zco0) obj2;
                zco0Var.G(new dlb0(zco0Var.z.b.a(((Integer) obj).intValue(), Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            case 7:
                f240 f240Var = (f240) obj;
                s9m0 s9m0Var2 = nfo0.O1;
                f240Var.getClass();
                ((rio0) ((nfo0) obj2).M1.getValue()).E(f240Var);
                return Unit.f46060a;
            case 8:
                s2m0 s2m0Var2 = ufo0.Q1;
                ((GamesActionsFragmentResultModel) obj).getClass();
                ((ufo0) obj2).H0().H();
                return Unit.f46060a;
            case 9:
                y2m0 y2m0Var = jho0.R1;
                ((GamesActionsFragmentResultModel) obj).getClass();
                ((jho0) obj2).H0().H();
                return Unit.f46060a;
            case 10:
                cko0 cko0Var = (cko0) obj2;
                hcz hczVar = (hcz) obj;
                m6m0 m6m0Var = cko0.m2;
                hczVar.getClass();
                List listN = cko0Var.l2.n(cko0Var, cko0.n2[1]);
                hczVar.f(listN.size(), null, new adn0(listN, (byte) 7), new ugd(2039820996, true, new xy1(listN, (byte) 28)));
                return Unit.f46060a;
            case 11:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.a(abi0Var, ((vlo0) obj2).e);
                return Unit.f46060a;
            case 12:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                cbi0.b(abi0Var2, new n0x(((llo0) obj2).f20258a));
                return Unit.f46060a;
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                oyq0 oyq0Var = ((zyn) obj2).f45214a;
                oyq0Var.c(oyq0Var.c.l() + fFloatValue);
                return Unit.f46060a;
            case 14:
                TaxExpandableSpoiler taxExpandableSpoiler = (TaxExpandableSpoiler) obj2;
                int i = TaxExpandableSpoiler.k;
                ((View) obj).getClass();
                int iOrdinal = taxExpandableSpoiler.b.ordinal();
                if (iOrdinal == 0) {
                    evo0Var = evo0.b;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    evo0Var = evo0.f8481a;
                }
                taxExpandableSpoiler.b = evo0Var;
                taxExpandableSpoiler.d();
                return Unit.f46060a;
            case 15:
                y2m0 y2m0Var2 = rxo0.j2;
                ((View) obj).getClass();
                m6m0 m6m0Var2 = bop0.b;
                ((rxo0) obj2).T0(0);
                return Unit.f46060a;
            case 16:
                s7p0 s7p0Var = (s7p0) obj2;
                a0o a0oVar = (a0o) obj;
                a0oVar.getClass();
                ArrayList arrayList3 = new ArrayList(r3d.q(a0oVar, 10));
                Iterator<E> it2 = a0oVar.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new yvh0(s7p0Var.b.b.a(((j3p0) it2.next()).b, Arrays.copyOf(new Object[0], 0)), bwh0.f3325a));
                }
                return dyb.o0(arrayList3);
            case 17:
                TeamBetScreenParams teamBetScreenParams = (TeamBetScreenParams) obj2;
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                return new kyo0(null, teamBetScreenParams.b, (String) a8k0.H(vzg0Var, "TEAN_IMAGE_KEY", ""), teamBetScreenParams.c, (j3p0) a8k0.H(vzg0Var, "CURRENT_TAB_KEY", j3p0.c), false, false);
            case 18:
                uid uidVar = (uid) obj;
                j6m0 j6m0Var = i0p0.Z1;
                uidVar.getClass();
                ((i0p0) obj2).I0().x(new uyo0(uidVar));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                o6p0 o6p0Var = (o6p0) obj2;
                oyg0 oyg0Var = o6p0Var.f;
                ocj ocjVar = o6p0Var.i;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if (th2 instanceof ff5) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value4, z5p0.a((z5p0) value4, null, null, false, false, true, false, null, 199)));
                } else {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value3, z5p0.a((z5p0) value3, null, null, false, true, false, false, null, 199)));
                }
                return Unit.f46060a;
            case 20:
                g7p0 g7p0Var = (g7p0) obj;
                s9m0 s9m0Var3 = m7p0.P1;
                g7p0Var.getClass();
                ((k3t0) ((m7p0) obj2).M1.getValue()).x(g7p0Var);
                return Unit.f46060a;
            case 21:
                s7p0 s7p0Var2 = (s7p0) obj2;
                p7p0 p7p0Var = (p7p0) obj;
                p7p0Var.getClass();
                o9p0 o9p0Var = p7p0Var.b;
                if (o9p0Var != null) {
                    i4 i4VarL = idm0.l(s7p0Var2.b, o9p0Var.i);
                    if (i4VarL != null) {
                        return i4VarL;
                    }
                }
                return lak0.c;
            case 22:
                x8p0 x8p0Var = (x8p0) obj2;
                Long l = (Long) obj;
                l.getClass();
                s2m0 s2m0Var3 = x8p0.l2;
                if (!x8p0Var.R()) {
                    vcc.f0(i120.V(new Pair("TEAM_DETAILS_DISCIPLINE_DIALOG_RESULT_KEY", l)), x8p0Var, "TEAM_DETAILS_DISCIPLINE_DIALOG_RESULT_KEY");
                    x8p0Var.y0();
                }
                return Unit.f46060a;
            case 23:
                nap0 nap0Var = (nap0) obj;
                j6m0 j6m0Var2 = sap0.R1;
                nap0Var.getClass();
                ((sap0) obj2).G0().x(nap0Var);
                return Unit.f46060a;
            case 24:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                dyb.O(((mgp0) cpVar.u).c, new itn0((ngp0) obj2, cpVar, (byte) 24));
                cpVar.t(new kzi0(cpVar, (byte) 17));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                rhp0 rhp0Var = (rhp0) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                rhp0Var.p.b(th3, new qhp0(rhp0Var, b2));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                xip0 xip0Var = (xip0) obj2;
                bop0 bop0Var = (bop0) obj;
                g9m0 g9m0Var = xip0.n2;
                bop0Var.getClass();
                phf0 phf0Var = xip0Var.g2;
                iiy[] iiyVarArr = xip0.o2;
                vcc.f0(i120.V(new Pair("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", new ojp0(xip0Var.i2.n(xip0Var, iiyVarArr[2]).intValue(), xip0Var.j2.n(xip0Var, iiyVarArr[3]).intValue(), bop0Var.f2946a))), xip0Var, phf0Var.n(xip0Var, iiyVarArr[0]));
                xip0Var.x0();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ykp0 ykp0Var = (ykp0) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ykp0Var.s.b(th4, new l7p0(ykp0Var, (byte) 6));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                qnp0 qnp0Var = (qnp0) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var5 = qnp0Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                    qnp0Var.f.getClass();
                } while (!p7m0Var5.m(value5, knp0.a((knp0) value5, false, true, null, 0, 57)));
                return Unit.f46060a;
            default:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                ((a3k) cpVar2.u).d.setListCheckBoxClickListener(new bs50(obj2, (Object) cpVar2, (byte) 13));
                cpVar2.t(new pgj0(cpVar2, cpVar2, (byte) 15));
                return Unit.f46060a;
        }
    }
}
