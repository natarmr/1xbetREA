package a;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.net.DatagramSocket;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.cache.DiskLruCache;
import org.xbet.client1.R;
import org.xplatform.aggregator.daily_tasks.impl.di.DailyTasksScreenFactoryImpl$dailyTasksScreen$1;
import org.xplatform.cyber.game.core.presentation.dota.banpick.view.DotaBanPickHeroItemView;
import org.xplatform.cyber.game.core.presentation.dota.banpick.view.DotaBanPickItemView;
import org.xplatform.cyber.game.core.presentation.team_statistic.view.TeamStatisticView;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoCodesScreen$1;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoListScreen$1;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e3j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7138a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e3j(Object obj, byte b) {
        this.f7138a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterable iterableJ0;
        String str;
        String str2;
        Object value;
        byte b = this.f7138a;
        byte b2 = 6;
        yje yjeVar = null;
        byte b3 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                Object obj3 = ((f3j) obj2).g;
                c8d c8dVar = (c8d) k0w0Var.h(new DailyTasksScreenFactoryImpl$dailyTasksScreen$1()).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                ((q5j) ((g3j) obj2).m).getClass();
                c8d c8dVar2 = (c8d) k0w0Var2.h(new DailyTasksScreenFactoryImpl$dailyTasksScreen$1()).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case 2:
                i5j i5jVar = (i5j) obj2;
                l5j l5jVar = (l5j) obj;
                iiy[] iiyVarArr = i5j.O1;
                l5jVar.getClass();
                if (!l5jVar.equals(l5j.f19459a)) {
                    t9f.b();
                    return null;
                }
                qcc.c0(i5jVar);
                ((k3t0) i5jVar.M1.getValue()).x(d5j.f5507a);
                return Unit.f46060a;
            case 3:
                xa9 xa9Var = (xa9) obj2;
                ctf0 ctf0Var = (ctf0) xa9Var.j;
                i6j i6jVar = (i6j) obj;
                i6jVar.getClass();
                if (i6jVar.equals(f6j.f9013a)) {
                    return new f4j((mdm) ((fee) ((n0o0) xa9Var.i).getValue()).b());
                }
                if (!(i6jVar instanceof g6j)) {
                    if (i6jVar.equals(h6j.f12532a)) {
                        return new e4j(sll.f32405a);
                    }
                    t9f.b();
                    return null;
                }
                g6j g6jVar = (g6j) i6jVar;
                m4j m4jVar = g6jVar.b;
                List list = g6jVar.f10768a;
                if (list == null || m4jVar != null) {
                    iterableJ0 = (m4jVar == null || list != null) ? lak0.c : feb.j0(m4jVar, ctf0Var);
                } else {
                    iterableJ0 = feb.J(ctf0Var, list);
                }
                return new e4j(new rll(dyb.r0(iterableJ0), ctf0Var.b.a(R.string.daily_task_subtitle_description, Arrays.copyOf(new Object[0], 0))));
            case 4:
                ncj ncjVar = (ncj) obj2;
                n0o0 n0o0Var = ncjVar.j;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ncjVar.h.b(new hbq(th));
                }
                if (n0o0Var.a()) {
                    ((vzp) n0o0Var.getValue()).close();
                }
                return Unit.f46060a;
            case 5:
                x2i x2iVar = (x2i) obj2;
                cp cpVar = (cp) obj;
                cpVar.getClass();
                ((uro) cpVar.u).f36174a.setOnViewClicked(new cgj(x2iVar, cpVar, b3));
                cpVar.t(new if6(cpVar, x2iVar, cpVar, x2iVar, (byte) 3));
                return Unit.f46060a;
            case 6:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.c = ((inj) obj2).c;
                return Unit.f46060a;
            case 7:
                i1w0 i1w0Var = (i1w0) obj;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                c8d c8dVar3 = (c8d) k0w0VarI.h((PromoScreenFactoryImpl$getPromoCodesScreen$1) obj2).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 8:
                i1w0 i1w0Var2 = (i1w0) obj;
                k0w0 k0w0VarI2 = cs0.i(i1w0Var2, i1w0Var2);
                c8d c8dVar4 = (c8d) k0w0VarI2.h((PromoScreenFactoryImpl$getPromoListScreen$1) obj2).f14945a;
                bjk bjkVar4 = cfx0.o;
                c8dVar4.f3908a = new v7d(true, bjkVar4, bjkVar4);
                ListIterator listIteratorO2 = b1j.o(i1w0Var2, k0w0VarI2.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            case 9:
                ysj ysjVar = (ysj) obj2;
                Editable editable = (Editable) obj;
                qud qudVar = ysj.m2;
                editable.getClass();
                DsPresetTextFieldBasic dsPresetTextFieldBasic = ysjVar.Q0().c;
                String string = editable.toString();
                if (wvb.O(string) == 0.0d) {
                    dsPresetTextFieldBasic.setSelection(dsPresetTextFieldBasic.getText().length());
                }
                btj btjVar = (btj) ysjVar.l2.getValue();
                ctf0 ctf0Var2 = btjVar.j;
                p7m0 p7m0Var = btjVar.k;
                double dO = wvb.O(string);
                double d = btjVar.m;
                ol60 ol60Var = btjVar.l;
                String strC = "";
                if (dO < d) {
                    Object value2 = p7m0Var.getValue();
                    nrn nrnVar = value2 instanceof nrn ? (nrn) value2 : null;
                    if (nrnVar == null || (str2 = nrnVar.g) == null) {
                        str2 = "";
                    }
                    ol60Var.f(new jrn(k9x.E(ctf0Var2, d, str2)));
                } else {
                    Object value3 = p7m0Var.getValue();
                    nrn nrnVar2 = value3 instanceof nrn ? (nrn) value3 : null;
                    if (nrnVar2 == null || (str = nrnVar2.g) == null) {
                        str = "";
                    }
                    ol60Var.f(new krn(k9x.E(ctf0Var2, d, str)));
                }
                Object value4 = p7m0Var.getValue();
                nrn nrnVar3 = value4 instanceof nrn ? (nrn) value4 : null;
                if (nrnVar3 != null) {
                    Double dI = kotlin.text.b.i(string);
                    double dDoubleValue = dI != null ? dI.doubleValue() : 0.0d;
                    boolean z = dDoubleValue >= btjVar.m && dDoubleValue != nrnVar3.f24010a;
                    if (string.length() != 0) {
                        pn40 pn40Var = pn40.f27267a;
                        strC = pn40.c(dDoubleValue, p3u0.c);
                    }
                    p7m0Var.o(null, nrn.a(nrnVar3, dDoubleValue, strC, z));
                }
                return Unit.f46060a;
            case 10:
                m8k m8kVar = (m8k) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                duj dujVar = m8kVar.t;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                dujVar.b(th2, new yfg(m8kVar, (byte) 21));
                return Unit.f46060a;
            case 11:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                FrameLayout frameLayout = ((djj0) cpVar2.u).f6189a;
                frameLayout.getClass();
                dyb.O(frameLayout, new ngh((y6h) obj2, cpVar2, (byte) 12));
                cpVar2.t(new kgh(cpVar2, (byte) 5));
                return Unit.f46060a;
            case 12:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                FrameLayout frameLayout2 = ((djj0) cpVar3.u).f6189a;
                frameLayout2.getClass();
                dyb.O(frameLayout2, new ngh((y6h) obj2, cpVar3, (byte) 13));
                cpVar3.t(new kgh(cpVar3, b2));
                return Unit.f46060a;
            case 13:
                pak pakVar = (pak) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                pakVar.e.b(th3, new yfg(pakVar, (byte) 22));
                return Unit.f46060a;
            case 14:
                jbk jbkVar = (jbk) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                jbkVar.e.b(th4, new yfg(jbkVar, (byte) 24));
                return Unit.f46060a;
            case 15:
                kbk kbkVar = (kbk) obj2;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                kbkVar.r.b(th5, new yfg(kbkVar, (byte) 25));
                return Unit.f46060a;
            case 16:
                xtk xtkVar = (xtk) obj2;
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                xtkVar.x();
                xtkVar.i.a(th6);
                return Unit.f46060a;
            case 17:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                p7m0 p7m0Var2 = ((guk) obj2).h;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, nuk.a((nuk) value, iun.f15405a, null, 6)));
                return Unit.f46060a;
            case 18:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                DsSettingsCell dsSettingsCell = ((ktk) cpVar4.u).d;
                dsSettingsCell.getClass();
                dyb.O(dsSettingsCell, new ngh((yfg) obj2, cpVar4, (byte) 16));
                cpVar4.t(new kgh(cpVar4, (byte) 10));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wuk wukVar = (wuk) obj2;
                nek nekVar = wuk.j2;
                ((Throwable) obj).getClass();
                wukVar.F().t0(i120.V(new Pair("ERROR_SOCIAL", wukVar.H(R.string.exit_from_social))), "ERROR_SOCIAL");
                wukVar.y0();
                return Unit.f46060a;
            case 20:
                return DiskLruCache.newJournalWriter$lambda$0((DiskLruCache) obj2, (IOException) obj);
            case 21:
                ((hvk) obj2).l = true;
                return Unit.f46060a;
            case 22:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                DsMenuCell dsMenuCell = ((zvx) cpVar5.u).f45079a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new ngh((v8) obj2, cpVar5, (byte) 18));
                cpVar5.t(new kgh(cpVar5, (byte) 11));
                return Unit.f46060a;
            case 23:
                DatagramSocket datagramSocket = (DatagramSocket) obj2;
                if ((((Throwable) obj) instanceof CancellationException) && !datagramSocket.isClosed()) {
                    datagramSocket.close();
                }
                return Unit.f46060a;
            case 24:
                l0l l0lVar = (l0l) obj2;
                ((Throwable) obj).getClass();
                bvc bvcVarA = jiu0.a(l0lVar);
                mne mneVar = l0lVar.c;
                sac.V(bvcVarA, d0l.f5272a, null, mneVar.f22085a, new e0l(l0lVar, yjeVar, b3), 10);
                sac.V(jiu0.a(l0lVar), c0l.f3530a, null, mneVar.f22085a, new b1f((Object) l0lVar, (Object) new xy5(false), yjeVar, (byte) 29), 10);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return DotaBanPickHeroItemView.c((DotaBanPickHeroItemView) obj2, (Drawable) obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                v2l v2lVar = (v2l) obj2;
                DotaBanPickItemView dotaBanPickItemView = (DotaBanPickItemView) obj;
                dotaBanPickItemView.getClass();
                dotaBanPickItemView.setFirstTeamLogo(v2lVar.b);
                dotaBanPickItemView.setSecondTeamLogo(v2lVar.c);
                dotaBanPickItemView.setHeroPick(v2lVar.d);
                dotaBanPickItemView.setScrollPosition(v2lVar.e);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lal lalVar = (lal) obj2;
                y6l y6lVar = (y6l) obj;
                y6lVar.getClass();
                y6lVar.setFirstTeam(lalVar.b);
                y6lVar.setSecondTeam(lalVar.c);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                zlp0 zlp0Var = (zlp0) obj2;
                TeamStatisticView teamStatisticView = (TeamStatisticView) obj;
                teamStatisticView.getClass();
                teamStatisticView.setTeam(zlp0Var.b);
                teamStatisticView.setPlayerStatistics(zlp0Var.d);
                teamStatisticView.setCellHeaders(zlp0Var.c);
                return Unit.f46060a;
            default:
                ebl eblVar = (ebl) obj2;
                xus xusVar = (xus) obj;
                xusVar.getClass();
                p7m0 p7m0Var3 = eblVar.i.f25029a;
                while (true) {
                    Object value5 = p7m0Var3.getValue();
                    value5.getClass();
                    eblVar.f.getClass();
                    ebl eblVar2 = eblVar;
                    if (p7m0Var3.m(value5, f9l.a((f9l) value5, null, null, null, null, null, xusVar, false, null, null, false, null, false, false, null, 0, 0, null, 67108799))) {
                        return Unit.f46060a;
                    }
                    eblVar = eblVar2;
                }
                break;
        }
    }
}
