package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.bet_summary.BetsSummaryInfoUiModel;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeUiModel;
import org.xplatform.bet_history.history.presentation.dialog.history_menu.model.HistoryMenuItemUiModel;
import org.xplatform.bet_history.history.presentation.model.DatePeriodState;
import org.xplatform.ui_core.calendar.model.DateCalendarBottomSheetParams;
import org.xplatform.ui_core.calendar.model.DateRangeCalendarBottomSheetParams;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes3.dex */
public final class f97 extends i3t0 {
    public static final /* synthetic */ int R0 = 0;
    public final iqt A;
    public final nj7 A0;
    public final cmt B;
    public final n660 B0;
    public final f47 C;
    public final x1u C0;
    public final p37 D;
    public final i1w0 D0;
    public final sqc E;
    public final jru E0;
    public final duj F;
    public final obe F0;
    public final upt G;
    public final vqc G0;
    public final k9u H;
    public final evz H0;
    public final nsc I;
    public final pzu I0;
    public final vpt J;
    public final nh70 J0;
    public final r9u K;
    public ek80 K0;
    public final b8u L;
    public c4m0 L0;
    public final z7u M;
    public bby M0;
    public final mfu N;
    public bby N0;
    public final ocl O;
    public bby O0;
    public final ntu P;
    public bby P0;
    public final luu Q;
    public c4m0 Q0;
    public final sqc R;
    public final jtj S;
    public final khf0 T;
    public final iqi U;
    public final o470 V;
    public final rrc W;
    public final gbi X;
    public final znt Y;
    public final ryu Z;
    public final ot a0;
    public final chf0 b0;
    public final hru c0;
    public final fvt0 d0;
    public final npc e0;
    public final hpi0 f0;
    public final ptt g0;
    public final lsn h0;
    public final k7u i0;
    public final cmt j0;
    public final lfu k0;
    public final zoi0 l0;
    public final sqc m0;
    public final npc n0;
    public final vzg0 o;
    public final lfu o0;
    public final BetHistoryScreenModel p;
    public final clc p0;
    public final mne q;
    public final h03 q0;
    public final ctf0 r;
    public final nsc r0;
    public final b8u s;
    public final o470 s0;
    public final jrt t;
    public final npc t0;
    public final pru u;
    public final hnu u0;
    public final nrt v;
    public final a3u v0;
    public final art w;
    public final uyn w0;
    public final jfu x;
    public final epi0 x0;
    public final ywu y;
    public final f4u y0;
    public final rou z;
    public final bst z0;

    public f97(vzg0 vzg0Var, BetHistoryScreenModel betHistoryScreenModel, mne mneVar, ctf0 ctf0Var, b8u b8uVar, jrt jrtVar, pru pruVar, nrt nrtVar, kc60 kc60Var, art artVar, jfu jfuVar, ywu ywuVar, rou rouVar, iqt iqtVar, cmt cmtVar, f47 f47Var, p37 p37Var, sqc sqcVar, duj dujVar, ocl oclVar, upt uptVar, k9u k9uVar, nsc nscVar, vpt vptVar, r9u r9uVar, b8u b8uVar2, z7u z7uVar, mfu mfuVar, ocl oclVar2, ntu ntuVar, yiu yiuVar, luu luuVar, sqc sqcVar2, jtj jtjVar, khf0 khf0Var, iqi iqiVar, o470 o470Var, m1e m1eVar, rrc rrcVar, gbi gbiVar, znt zntVar, ryu ryuVar, ot otVar, chf0 chf0Var, hru hruVar, fvt0 fvt0Var, npc npcVar, hpi0 hpi0Var, ptt pttVar, lsn lsnVar, k7u k7uVar, cmt cmtVar2, lfu lfuVar, m8u m8uVar, zoi0 zoi0Var, sqc sqcVar3, npc npcVar2, lfu lfuVar2, clc clcVar, h03 h03Var, nsc nscVar2, o470 o470Var2, bzt bztVar, npc npcVar3, hnu hnuVar, a3u a3uVar, uyn uynVar, epi0 epi0Var, f4u f4uVar, bst bstVar, nj7 nj7Var, n660 n660Var, x1u x1uVar, i1w0 i1w0Var, jru jruVar, obe obeVar, vqc vqcVar, ouu ouuVar, evz evzVar, pzu pzuVar, nh70 nh70Var) {
        ctf0Var.getClass();
        r9uVar.getClass();
        mfuVar.getClass();
        m1eVar.getClass();
        k7uVar.getClass();
        b87 b87Var = new b87(pruVar, vzg0Var, betHistoryScreenModel, cmtVar2, iqtVar, m8uVar, yiuVar, bztVar, r9uVar, (byte) 0);
        cz czVar = new cz(ctf0Var, oclVar, (byte) 3);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, b87Var, czVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = vzg0Var;
        this.p = betHistoryScreenModel;
        this.q = mneVar;
        this.r = ctf0Var;
        this.s = b8uVar;
        this.t = jrtVar;
        this.u = pruVar;
        this.v = nrtVar;
        this.w = artVar;
        this.x = jfuVar;
        this.y = ywuVar;
        this.z = rouVar;
        this.A = iqtVar;
        this.B = cmtVar;
        this.C = f47Var;
        this.D = p37Var;
        this.E = sqcVar;
        this.F = dujVar;
        this.G = uptVar;
        this.H = k9uVar;
        this.I = nscVar;
        this.J = vptVar;
        this.K = r9uVar;
        this.L = b8uVar2;
        this.M = z7uVar;
        this.N = mfuVar;
        this.O = oclVar2;
        this.P = ntuVar;
        this.Q = luuVar;
        this.R = sqcVar2;
        this.S = jtjVar;
        this.T = khf0Var;
        this.U = iqiVar;
        this.V = o470Var;
        this.W = rrcVar;
        this.X = gbiVar;
        this.Y = zntVar;
        this.Z = ryuVar;
        this.a0 = otVar;
        this.b0 = chf0Var;
        this.c0 = hruVar;
        this.d0 = fvt0Var;
        this.e0 = npcVar;
        this.f0 = hpi0Var;
        this.g0 = pttVar;
        this.h0 = lsnVar;
        this.i0 = k7uVar;
        this.j0 = cmtVar2;
        this.k0 = lfuVar;
        this.l0 = zoi0Var;
        this.m0 = sqcVar3;
        this.n0 = npcVar2;
        this.o0 = lfuVar2;
        this.p0 = clcVar;
        this.q0 = h03Var;
        this.r0 = nscVar2;
        this.s0 = o470Var2;
        this.t0 = npcVar3;
        this.u0 = hnuVar;
        this.v0 = a3uVar;
        this.w0 = uynVar;
        this.x0 = epi0Var;
        this.y0 = f4uVar;
        this.z0 = bstVar;
        this.A0 = nj7Var;
        this.B0 = n660Var;
        this.C0 = x1uVar;
        this.D0 = i1w0Var;
        this.E0 = jruVar;
        this.F0 = obeVar;
        this.G0 = vqcVar;
        this.H0 = evzVar;
        this.I0 = pzuVar;
        this.J0 = nh70Var;
        h0();
        yje yjeVar = null;
        byte b = 0;
        sac.T(new fnq(kc60Var.a(), new r87(this, yjeVar, b), (byte) 4), jiu0.a(this), foe.h);
        sac.T(new fnq(new va(((qe50) ouuVar.b).b, (byte) 1), new wa(this, yjeVar, (byte) 26), (byte) 4), d5c.S(jiu0.a(this), rwjVar), w87.h);
        slb.U(new fnq(i120.W(new dnq(m1eVar.b(), new s87(this, yjeVar, b), (byte) 1)), new q87(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar));
    }

    public final void M(HistoryTypeModel historyTypeModel) {
        if (((i77) D()).i == historyTypeModel) {
            return;
        }
        i3t0.A(this, this.D, new g1k(historyTypeModel), null, null, 6);
        H(new d87(historyTypeModel, (byte) 0));
        this.o.e("KEY_HISTORY_TYPE", historyTypeModel);
        ((t47) this.t0.f23905a.e).f33305a = null;
        h0();
        a0();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x010c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (r1 == r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0145, code lost:
    
        if (r1 == r3) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(boolean r18, a.zje r19) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f97.N(boolean, a.zje):java.lang.Object");
    }

    public final void O() {
        Calendar calendar = Calendar.getInstance();
        SimpleDate simpleDateG0 = bsr0.g0(calendar.getTimeInMillis(), calendar);
        calendar.add(5, -(((i77) D()).A - 1));
        SimpleDate simpleDateG1 = bsr0.g0(calendar.getTimeInMillis(), calendar);
        String strA = this.r.b.a(R.string.calendar_date_module_select_date, Arrays.copyOf(new Object[0], 0));
        wdj wdjVar = ((i77) D()).l;
        tdj tdjVar = wdjVar instanceof tdj ? (tdj) wdjVar : null;
        G(new z57(new DateCalendarBottomSheetParams(strA, simpleDateG1, simpleDateG0, tdjVar != null ? bsr0.g0(TimeUnit.SECONDS.toMillis(tdjVar.f33771a), calendar) : null)));
    }

    public final void P(long j) {
        if (!((i77) D()).Q) {
            G(new x57(j, ((i77) D()).A));
            return;
        }
        Calendar calendar = Calendar.getInstance();
        SimpleDate simpleDateG0 = bsr0.g0(calendar.getTimeInMillis(), calendar);
        calendar.add(5, -(((i77) D()).A - 1));
        SimpleDate simpleDateG1 = bsr0.g0(calendar.getTimeInMillis(), calendar);
        wdj wdjVar = ((i77) D()).l;
        DateRangeModel dateRangeModel = null;
        vdj vdjVar = wdjVar instanceof vdj ? (vdj) wdjVar : null;
        ctf0 ctf0Var = this.r;
        lsm0 lsm0Var = ctf0Var.b;
        lsm0 lsm0Var2 = ctf0Var.b;
        String strA = lsm0Var.a(R.string.calendar_date_module_select_period, Arrays.copyOf(new Object[0], 0));
        String strA2 = lsm0Var2.a(R.string.start_date_period, Arrays.copyOf(new Object[0], 0));
        String strA3 = lsm0Var2.a(R.string.end_date_period, Arrays.copyOf(new Object[0], 0));
        int i = ((i77) D()).A;
        if (vdjVar != null) {
            long j2 = vdjVar.f37235a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            dateRangeModel = new DateRangeModel(bsr0.g0(timeUnit.toMillis(j2), calendar), bsr0.g0(timeUnit.toMillis(vdjVar.b), calendar));
        }
        G(new d67(new DateRangeCalendarBottomSheetParams(strA, strA2, strA3, simpleDateG1, simpleDateG0, null, i, dateRangeModel)));
    }

    public final void Q(long j, long j2) {
        if (j2 == 0) {
            G(new y57(j));
        } else {
            sac.V(jiu0.a(this), null, null, null, new wg0(this, j, j2, null, (byte) 2), 15);
        }
    }

    public final ArrayList R(String str) {
        List list = ((i77) D()).t;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.d(((a5w) obj).d(), str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Serializable S(yje yjeVar) {
        ql5 ql5Var = ((i77) D()).e;
        return ql5Var == null ? T(yjeVar) : ql5Var;
    }

    public final Serializable T(yje yjeVar) {
        BetHistoryScreenModel betHistoryScreenModel = this.p;
        return this.t.b(betHistoryScreenModel.getF46388a(), betHistoryScreenModel.getB(), yjeVar);
    }

    public final void U() {
        ((t47) ((mii0) this.p0.b).e).b = null;
        bby bbyVar = this.N0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.N0 = sac.V(jiu0.a(this), new c87(this, (byte) 12), null, this.q.b, new o87(this, null), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V(zje zjeVar) {
        p87 p87Var;
        boolean zD;
        List list;
        List list2;
        boolean z;
        boolean z2;
        List list3;
        Serializable serializableA;
        List list4;
        boolean z3;
        boolean z4;
        List list5;
        List list6;
        if (zjeVar instanceof p87) {
            p87Var = (p87) zjeVar;
            int i = p87Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                p87Var.p = i - Integer.MIN_VALUE;
            } else {
                p87Var = new p87(this, zjeVar);
            }
        } else {
            p87Var = new p87(this, zjeVar);
        }
        Object obj = p87Var.n;
        wne wneVar = wne.f39444a;
        int i2 = p87Var.p;
        if (i2 == 0) {
            z1x.P(obj);
            List listA = this.Q.f20692a.a();
            ygp ygpVar = ygp.c;
            r9u r9uVar = this.K;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            zD = j1q0Var.f15748a.d(ygpVar);
            p87Var.i = listA;
            p87Var.l = zD;
            p87Var.p = 1;
            Object objB = ((zfo) this.L.f2175a).b(p87Var);
            if (objB != wneVar) {
                list = listA;
                obj = objB;
            }
            return wneVar;
        }
        if (i2 == 1) {
            zD = p87Var.l;
            list = p87Var.i;
            z1x.P(obj);
        } else {
            if (i2 == 2) {
                z2 = p87Var.m;
                z = p87Var.l;
                List list7 = p87Var.j;
                List list8 = p87Var.i;
                z1x.P(obj);
                list2 = list7;
                list = list8;
                list3 = (List) obj;
                p87Var.i = list;
                p87Var.j = list2;
                p87Var.k = list3;
                p87Var.l = z;
                p87Var.m = z2;
                p87Var.p = 3;
                serializableA = this.v0.a(p87Var);
                if (serializableA != wneVar) {
                    list4 = list3;
                    obj = serializableA;
                    z3 = z2;
                    z4 = z;
                    list5 = list;
                    list6 = list2;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = p87Var.m;
            z4 = p87Var.l;
            list4 = p87Var.k;
            list6 = p87Var.j;
            list5 = p87Var.i;
            z1x.P(obj);
        }
        H(new ry2((Map) obj, new dyv(list5, list6, z4, z3), list4, (byte) 19));
        return Unit.f46060a;
        List list9 = (List) obj;
        boolean zJ = this.P.f24118a.f15748a.j();
        p87Var.i = list;
        p87Var.j = list9;
        p87Var.l = zD;
        p87Var.m = zJ;
        p87Var.p = 2;
        List listJ = this.O.j();
        if (listJ != wneVar) {
            list2 = list9;
            obj = listJ;
            z = zD;
            z2 = zJ;
            list3 = (List) obj;
            p87Var.i = list;
            p87Var.j = list2;
            p87Var.k = list3;
            p87Var.l = z;
            p87Var.m = z2;
            p87Var.p = 3;
            serializableA = this.v0.a(p87Var);
            if (serializableA != wneVar) {
                list4 = list3;
                obj = serializableA;
                z3 = z2;
                z4 = z;
                list5 = list;
                list6 = list2;
                H(new ry2((Map) obj, new dyv(list5, list6, z4, z3), list4, (byte) 19));
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    public final a5w W(String str) {
        Object next;
        Iterator it = ((i77) D()).t.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((a5w) next).d(), str)) {
                return (a5w) next;
            }
        }
        next = null;
        return (a5w) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final n3w X(String str) {
        Object obj;
        a5w a5wVarW = W(str);
        if (a5wVarW == null) {
            return n3w.d(n3w.Q1, str, 0.0d, null, null, 0L, null, 0.0d, 0.0d, null, null, null, false, null, null, null, -2, -1);
        }
        boolean z = a5wVarW instanceof vw4;
        pru pruVar = this.u;
        if (z) {
            vw4 vw4Var = (vw4) a5wVarW;
            HistoryTypeModel historyTypeModel = ((i77) D()).i;
            ql5 ql5Var = ((i77) D()).e;
            String str2 = ql5Var != null ? ql5Var.f : null;
            String str3 = str2 == null ? "" : str2;
            List list = ((i77) D()).x;
            Long lT0 = StringsKt.t0(str);
            boolean zContains = list.contains(Long.valueOf(lT0 != null ? lT0.longValue() : 0L));
            boolean z2 = pruVar.a().f32117a.b.h;
            dyv dyvVar = ((i77) D()).u;
            boolean z3 = dyvVar != null && dyvVar.b;
            dyv dyvVar2 = ((i77) D()).u;
            obj = dyvVar2 != null ? dyvVar2.c : null;
            if (obj == null) {
                obj = iun.f15405a;
            }
            ?? r16 = obj;
            dyv dyvVar3 = ((i77) D()).u;
            return ckb.e0(vw4Var, historyTypeModel, str3, zContains, z2, z3, r16, dyvVar3 != null && dyvVar3.d, ((i77) D()).G, ((i77) D()).K, ((i77) D()).L);
        }
        if (!(a5wVarW instanceof kzv)) {
            if (a5wVarW instanceof z7y) {
                return ckb.g0((z7y) a5wVarW);
            }
            if (a5wVarW instanceof for0) {
                for0 for0Var = (for0) a5wVarW;
                ql5 ql5Var2 = ((i77) D()).e;
                obj = ql5Var2 != null ? ql5Var2.f : null;
                return ckb.i0(for0Var, obj != null ? obj : "");
            }
            if (a5wVarW instanceof nc10) {
                nc10 nc10Var = (nc10) a5wVarW;
                ql5 ql5Var3 = ((i77) D()).e;
                obj = ql5Var3 != null ? ql5Var3.f : null;
                return ckb.h0(nc10Var, obj != null ? obj : "");
            }
            if (a5wVarW instanceof y21) {
                return n3w.d(n3w.Q1, str, 0.0d, null, null, 0L, null, 0.0d, 0.0d, null, null, null, false, null, null, null, -2, -1);
            }
            t9f.b();
            return null;
        }
        kzv kzvVar = (kzv) a5wVarW;
        HistoryTypeModel historyTypeModel2 = ((i77) D()).i;
        ql5 ql5Var4 = ((i77) D()).e;
        String str4 = ql5Var4 != null ? ql5Var4.f : null;
        String str5 = str4 == null ? "" : str4;
        List list2 = ((i77) D()).x;
        Long lT1 = StringsKt.t0(str);
        boolean zContains2 = list2.contains(Long.valueOf(lT1 != null ? lT1.longValue() : 0L));
        boolean z4 = pruVar.a().f32117a.b.h;
        dyv dyvVar4 = ((i77) D()).u;
        boolean z5 = dyvVar4 != null && dyvVar4.b;
        dyv dyvVar5 = ((i77) D()).u;
        obj = dyvVar5 != null ? dyvVar5.c : null;
        if (obj == null) {
            obj = iun.f15405a;
        }
        ?? r17 = obj;
        dyv dyvVar6 = ((i77) D()).u;
        return ckb.f0(kzvVar, historyTypeModel2, str5, zContains2, z4, z5, r17, dyvVar6 != null && dyvVar6.d, ((i77) D()).G, ((i77) D()).K, ((i77) D()).L);
    }

    public final HashMap Y(List list) {
        HashMap map = new HashMap();
        BetHistoryScreenModel betHistoryScreenModel = this.p;
        if (betHistoryScreenModel.getC() == k77.COMPACT_NO_EXPAND || betHistoryScreenModel.getC() == k77.TABS_AND_ACCORDEON || betHistoryScreenModel.getC() == k77.NO_TABS_EXPANDABLE_CARDS) {
            f8w f8wVarA = i8w.a(betHistoryScreenModel);
            gx7 gx7Var = this.u.a().f32117a;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a5w a5wVar = (a5w) it.next();
                String strD = a5wVar.d();
                HistoryTypeModel historyTypeModel = ((i77) D()).i;
                ql5 ql5Var = ((i77) D()).e;
                boolean zA = ql5Var != null ? ql5Var.i.a() : false;
                this.w.getClass();
                map.put(strD, art.e(a5wVar, f8wVarA, historyTypeModel, zA, gx7Var));
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    public final qgv0 Z(List list) {
        qgv0 qgv0Var;
        if ((this.p instanceof BetHistoryScreenModel.BetHistory) && !list.isEmpty()) {
            a5w a5wVar = (a5w) CollectionsKt.firstOrNull(list);
            gx7 gx7Var = this.u.a().f32117a;
            HistoryTypeModel historyTypeModel = ((i77) D()).i;
            ctf0 ctf0Var = this.r;
            ctf0Var.getClass();
            String str = gx7Var.l;
            if (historyTypeModel != HistoryTypeModel.EVENTS || gx7Var.k.length() <= 0 || str.length() <= 0 || !(a5wVar instanceof kzv)) {
                qgv0Var = null;
            } else {
                kzv kzvVar = (kzv) a5wVar;
                String str2 = kzvVar.f19169a;
                i0w i0wVar = kzvVar.g;
                if (i0wVar == i0w.d || i0wVar == i0w.e) {
                    String strF = ctf0Var.f(R.string.win_back_win_title, new Object[0]);
                    String strF2 = ctf0Var.f(R.string.win_back_win_description, new Object[0]);
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String strConcat = "static/img/android/win_back/win/".concat(str);
                    if (strConcat.length() == 0) {
                        sb.setLength(0);
                    } else if (StringsKt.O(strConcat, ujn.h, false) || kotlin.text.c.x(strConcat, "https://", false)) {
                        sb.setLength(0);
                        sb.append(strConcat);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(strConcat, '/'));
                    }
                    String string = sb.toString();
                    pz40 pz40Var = s6t0.f31722a;
                    qgv0Var = new qgv0("winner_banner".concat(str2), strF, strF2, string, ctf0Var.f(R.string.win_analytics, new Object[0]), s6t0.b().f33626a.getCommerce());
                } else if (i0wVar == i0w.c) {
                    String strF3 = ctf0Var.f(R.string.win_back_lose_title, new Object[0]);
                    String strF4 = ctf0Var.f(R.string.win_back_lose_description, new Object[0]);
                    StringBuilder sb2 = new StringBuilder(ujn.h);
                    String strConcat2 = "static/img/android/win_back/loose/".concat(str);
                    if (strConcat2.length() == 0) {
                        sb2.setLength(0);
                    } else if (StringsKt.O(strConcat2, ujn.h, false) || kotlin.text.c.x(strConcat2, "https://", false)) {
                        sb2.setLength(0);
                        sb2.append(strConcat2);
                    } else {
                        if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                            sb2.append('/');
                        }
                        sb2.append(StringsKt.y0(strConcat2, '/'));
                    }
                    String string2 = sb2.toString();
                    pz40 pz40Var2 = s6t0.f31722a;
                    qgv0Var = new qgv0("lost_banner".concat(str2), strF3, strF4, string2, ctf0Var.f(R.string.lose_analytics, new Object[0]), s6t0.b().f33626a.getPrimary());
                } else {
                    qgv0Var = null;
                }
            }
            if (qgv0Var != null) {
                i3t0.A(this, this.D, new t1k(qgv0Var.f), null, null, 6);
                return qgv0Var;
            }
        }
        return null;
    }

    public final void a0() {
        bby bbyVar;
        ek80 ek80Var = this.K0;
        if (ek80Var != null && (bbyVar = ek80Var.d) != null) {
            bbyVar.cancel(null);
        }
        e3c.n(this.N0);
        U();
    }

    public final void b0(boolean z) {
        H(new os6((byte) 17));
        bby bbyVar = this.P0;
        yje yjeVar = null;
        mne mneVar = this.q;
        if ((bbyVar == null || !bbyVar.isActive() || ((i77) D()).c) && this.A.f15225a.a() && !((i77) D()).w) {
            this.P0 = sac.V(jiu0.a(this), new c87(this, (byte) 15), null, mneVar.b, new fj3((diu0) this, z, yjeVar, (byte) 2), 10);
        } else {
            sac.V(jiu0.a(this), new c87(this, (byte) 14), null, mneVar.b, new q87(this, yjeVar, (byte) 0), 10);
        }
    }

    public final void c0(String str) {
        sys0 sys0Var;
        BetHistoryScreenModel betHistoryScreenModelA;
        if (((i77) D()).i != HistoryTypeModel.AGGREGATOR) {
            HistoryTypeModel historyTypeModel = ((i77) D()).i;
            HistoryTypeModel historyTypeModel2 = HistoryTypeModel.LOTTO;
            if (historyTypeModel == historyTypeModel2 && this.u.a().D1) {
                this.D0.d(new c87(this, (byte) 17));
                return;
            }
            HistoryTypeModel historyTypeModel3 = ((i77) D()).i;
            BetHistoryScreenModel betHistoryScreenModel = this.p;
            ryu ryuVar = this.Z;
            if (historyTypeModel3 != historyTypeModel2) {
                ygp ygpVar = ygp.p;
                r9u r9uVar = this.K;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                if (j1q0Var.f15748a.d(ygpVar)) {
                    a5w a5wVarW = W(str);
                    if (a5wVarW != null) {
                        ryuVar.b(a5wVarW);
                        i3t0.A(this, this.D, new h1k(a5wVarW, ((i77) D()).i, ((i77) D()).G), null, null, 6);
                    }
                    if (betHistoryScreenModel != null) {
                        if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                            BetHistoryScreenModel.BetChampHistory betChampHistory = (BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel;
                            ql5 ql5Var = ((i77) D()).e;
                            betHistoryScreenModelA = BetHistoryScreenModel.BetChampHistory.a(betChampHistory, ql5Var != null ? ql5Var.f28916a : 0L, ((i77) D()).i, 60);
                        } else if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) {
                            BetHistoryScreenModel.BetHistory betHistory = (BetHistoryScreenModel.BetHistory) betHistoryScreenModel;
                            ql5 ql5Var2 = ((i77) D()).e;
                            betHistoryScreenModelA = BetHistoryScreenModel.BetHistory.a(betHistory, ql5Var2 != null ? ql5Var2.f28916a : 0L, ((i77) D()).i, 12);
                        }
                        i3t0.A(this, this.C, new f0k(str, betHistoryScreenModelA), null, null, 6);
                        return;
                    }
                    t9f.b();
                    return;
                }
            }
            if (((i77) D()).i != historyTypeModel2) {
                n3w n3wVarX = X(str);
                a5w a5wVarW2 = W(str);
                if (a5wVarW2 != null) {
                    ryuVar.b(a5wVarW2);
                }
                i3t0.A(this, this.D, new i1k(n3wVarX, ((i77) D()).i), null, null, 6);
                ql5 ql5Var3 = ((i77) D()).e;
                long j = ql5Var3 != null ? ql5Var3.f28916a : 0L;
                betHistoryScreenModel.getClass();
                if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                    sys0Var = sys0.c;
                } else {
                    if (!(betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory)) {
                        t9f.b();
                        return;
                    }
                    sys0Var = sys0.f33037a;
                }
                i3t0.A(this, this.C, new g0k(n3wVarX, j, sys0Var), null, null, 6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0(HistoryMenuItem historyMenuItem, String str) {
        i3t0.A(this, this.D, new x0k(historyMenuItem, ((i77) D()).i, X(str).l), null, null, 6);
        int iOrdinal = historyMenuItem.ordinal();
        byte b = 1;
        ctf0 ctf0Var = this.r;
        r9u r9uVar = this.K;
        mne mneVar = this.q;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (iOrdinal) {
            case 0:
                a5w a5wVarW = W(str);
                if (a5wVarW != null) {
                    sac.V(jiu0.a(this), null, null, mneVar.b, new u47(this, str, a5wVarW, (yje) null), 11);
                    break;
                }
                break;
            case 1:
                lsm0 lsm0Var = ctf0Var.b;
                lsm0 lsm0Var2 = ctf0Var.b;
                G(new s67(lsm0Var.a(R.string.history_hide_bet, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.hide_with_number, Arrays.copyOf(new Object[]{lsm0Var2.a(R.string.snackbar_coupon_number, Arrays.copyOf(new Object[]{str}, 1))}, 1)), str));
                break;
            case 2:
                G(new e67(ctf0Var.b.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str}, 1)), str));
                break;
            case 3:
                sac.V(jiu0.a(this), new c87(this, (byte) 2), null, mneVar.b, new xw5(this, str, objArr == true ? 1 : 0, (byte) 16), 10);
                break;
            case 4:
                this.V.f(X(str));
                ql5 ql5Var = ((i77) D()).e;
                if (ql5Var != null) {
                    i3t0.A(this, this.C, new d0k(ql5Var.f28916a), null, null, 6);
                }
                break;
            case 5:
                ygp ygpVar = ygp.x;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                n3w n3wVarX = X(str);
                if (n3wVarX.Y) {
                    str.getClass();
                    G(new f67(str));
                } else if (!zD) {
                    ql5 ql5Var2 = ((i77) D()).e;
                    if (ql5Var2 != null) {
                        i3t0.A(this, this.C, new b0k(n3wVarX, ql5Var2.f28916a, false), null, null, 6);
                    }
                } else {
                    j0(str);
                    ql5 ql5Var3 = ((i77) D()).e;
                    if (ql5Var3 != null) {
                        i3t0.A(this, this.C, new a0k(str, ql5Var3.f28916a, false, ((i77) D()).i), null, null, 6);
                    }
                }
                break;
            case 6:
                ygp ygpVar2 = ygp.x;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                boolean zD2 = j1q0Var2.f15748a.d(ygpVar2);
                if (zD2) {
                    a5w a5wVarW2 = W(str);
                    kzv kzvVar = a5wVarW2 instanceof kzv ? (kzv) a5wVarW2 : null;
                    if (Intrinsics.c(kzvVar != null ? Double.valueOf(kzvVar.c0) : null, 0.0d) || !((i77) D()).E.n) {
                        f0(str);
                    }
                }
                if (!zD2) {
                    n3w n3wVarX2 = X(str);
                    ql5 ql5Var4 = ((i77) D()).e;
                    if (ql5Var4 != null) {
                        i3t0.A(this, this.C, new p0k(n3wVarX2, ql5Var4.f28916a), null, null, 6);
                    }
                } else {
                    j0(str);
                    ql5 ql5Var5 = ((i77) D()).e;
                    if (ql5Var5 != null) {
                        i3t0.A(this, this.C, new o0k(str, ql5Var5.f28916a, ((i77) D()).i), null, null, 6);
                    }
                }
                break;
            case 7:
                sac.V(jiu0.a(this), new c87(this, (byte) 3), null, mneVar.b, new wn2((i3t0) this, str, (yje) (objArr2 == true ? 1 : 0), (byte) 6), 10);
                break;
            case 8:
                str.getClass();
                i3t0.A(this, this.C, new r0k(str), null, null, 6);
                break;
            case 9:
                n3w n3wVarX3 = X(str);
                ql5 ql5Var6 = ((i77) D()).e;
                if (ql5Var6 != null) {
                    ygp ygpVar3 = ygp.j1;
                    r9uVar.getClass();
                    j1q0 j1q0Var3 = r9uVar.f30104a;
                    j1q0Var3.getClass();
                    if (!j1q0Var3.f15748a.d(ygpVar3)) {
                        long j = ql5Var6.f28916a;
                        byte b2 = ((i77) D()).i.f46393a;
                        String str2 = n3wVarX3.f22868a;
                        String str3 = n3wVarX3.b;
                        i3t0.A(this, this.C, new t0k(new xfs0(n3wVarX3.o, n3wVarX3.m, n3wVarX3.n, b2, j, n3wVarX3.j, str2, str3, n3wVarX3.m1, n3wVarX3.f, ql5Var6.f)), null, null, 6);
                    } else {
                        j0(str);
                        i3t0.A(this, this.C, new s0k(str, ql5Var6.f28916a), null, null, 6);
                    }
                    break;
                }
                break;
            case 10:
                sac.V(jiu0.a(this), new c87(this, (byte) 5), null, mneVar.b, new x87(this, str, objArr3 == true ? 1 : 0, b), 10);
                break;
            case 11:
                str.getClass();
                G(new v57(str));
                break;
            case 12:
                e0(str);
                break;
            default:
                t9f.b();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    public final void e0(String str) {
        ql5 ql5Var;
        ctf0 ctf0Var;
        i0w i0wVar;
        List list;
        Object next;
        HistoryMenuItemUiModel historyMenuItemUiModelV;
        a5w a5wVarW = W(str);
        if (a5wVarW == null || (ql5Var = ((i77) D()).e) == null) {
            return;
        }
        HistoryTypeModel historyTypeModel = ((i77) D()).i;
        BetHistoryScreenModel betHistoryScreenModel = this.p;
        f8w f8wVarA = i8w.a(betHistoryScreenModel);
        boolean zA = ql5Var.i.a();
        gx7 gx7Var = this.u.a().f32117a;
        this.w.getClass();
        List listE = art.e(a5wVarW, f8wVarA, historyTypeModel, zA, gx7Var);
        ArrayList arrayList = new ArrayList(r3d.q(listE, 10));
        Iterator it = ((ArrayList) listE).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ctf0Var = this.r;
            if (!zHasNext) {
                break;
            } else {
                arrayList.add(kkb.V((HistoryMenuItem) it.next(), ctf0Var));
            }
        }
        if (a5wVarW instanceof kzv) {
            i0wVar = ((kzv) a5wVarW).g;
        } else if (a5wVarW instanceof z7y) {
            i0wVar = ((z7y) a5wVarW).e;
        } else {
            i0wVar = a5wVarW instanceof for0 ? ((for0) a5wVarW).g : null;
        }
        if ((i0wVar != i0w.b || tx3.l0(new HistoryTypeModel[]{HistoryTypeModel.TOTO, HistoryTypeModel.JACKPOT, HistoryTypeModel.AUTO}).contains(historyTypeModel)) && (list = (List) ((i77) D()).H.get(a5wVarW.d())) != null) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int iOrdinal = ((HistoryMenuItem) next).ordinal();
                    do {
                        Object next2 = it2.next();
                        int iOrdinal2 = ((HistoryMenuItem) next2).ordinal();
                        if (iOrdinal > iOrdinal2) {
                            next = next2;
                            iOrdinal = iOrdinal2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            HistoryMenuItem historyMenuItem = (HistoryMenuItem) next;
            if (historyMenuItem != null) {
                historyMenuItemUiModelV = kkb.V(historyMenuItem, ctf0Var);
            } else {
                historyMenuItemUiModelV = null;
            }
        } else {
            historyMenuItemUiModelV = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((HistoryMenuItemUiModel) obj).c != (historyMenuItemUiModelV != null ? historyMenuItemUiModelV.c : null)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((HistoryMenuItemUiModel) obj2).c != HistoryMenuItem.c || betHistoryScreenModel.getC() != k77.NO_TABS_EXPANDABLE_CARDS) {
                arrayList3.add(obj2);
            }
        }
        G(new v67(a5wVarW.d(), arrayList3));
    }

    public final void f0(String str) {
        a5w a5wVarW = W(str);
        if (a5wVarW == null) {
            return;
        }
        n3w n3wVarX = X(str);
        this.A0.a(r6w.k, xkb.N(n3wVarX), xkb.f0(n3wVarX));
        this.Z.b(a5wVarW);
        ql5 ql5Var = ((i77) D()).e;
        String str2 = ql5Var != null ? ql5Var.f : null;
        if (str2 == null) {
            str2 = "";
        }
        G(new w67(str, str2));
    }

    public final void g0() {
        long j = ((ev7) this.I.f24044a.d).b;
        if (j == -1) {
            return;
        }
        if (!this.J.a()) {
            G(r67.f29921a);
            return;
        }
        String strValueOf = String.valueOf(j);
        sac.V(jiu0.a(this), new c87(this, (byte) 19), null, this.q.b, new ex1((Object) this, (Object) strValueOf, (yje) null, (byte) 13), 10);
    }

    public final void h0() {
        H(new sr1(this.u0.h(((i77) D()).i, i8w.a(((i77) D()).f), ((i77) D()).E.m || ((i77) D()).E.n || ((i77) D()).E.q), this.w0.k(((i77) D()).i), (byte) 28));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a4 -> B:29:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i0(java.lang.String r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f97.i0(java.lang.String, a.zje):java.lang.Object");
    }

    public final void j0(String str) {
        a5w a5wVarW = W(str);
        if (a5wVarW != null) {
            this.Z.b(a5wVarW);
        }
    }

    public final void k0(String str) {
        bby bbyVar = this.O0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.O0 = sac.V(jiu0.a(this), new c87(this, (byte) 18), null, this.q.b, new xb2((Object) this, (Object) str, (yje) null, (byte) 6), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r11 == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable l0(java.lang.String r10, a.zje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.e97
            if (r0 == 0) goto L14
            r0 = r11
            a.e97 r0 = (a.e97) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.n = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            a.e97 r0 = new a.e97
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.l
            a.wne r0 = a.wne.f39444a
            int r1 = r5.n
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            a.z1x.P(r11)
            goto L7a
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r4
        L33:
            int r10 = r5.k
            java.lang.String r1 = r5.j
            a.lsn r3 = r5.i
            a.z1x.P(r11)
            r6 = r1
            goto L62
        L3e:
            a.z1x.P(r11)
            a.k7u r11 = r9.i0
            a.uzc r11 = r11.f17841a
            a.jvn r11 = r11.b()
            int r11 = r11.getId()
            a.lsn r1 = r9.h0
            r5.i = r1
            r5.j = r10
            r5.k = r11
            r5.n = r3
            java.io.Serializable r3 = r9.S(r5)
            if (r3 != r0) goto L5e
            goto L79
        L5e:
            r6 = r10
            r10 = r11
            r11 = r3
            r3 = r1
        L62:
            a.ql5 r11 = (a.ql5) r11
            long r7 = r11.f28916a
            r5.i = r4
            r5.j = r4
            r5.n = r2
            java.lang.Object r11 = r3.f20589a
            r1 = r11
            a.nr r1 = (a.nr) r1
            r2 = r10
            r3 = r7
            java.lang.Object r11 = r1.g(r2, r3, r5, r6)
            if (r11 != r0) goto L7a
        L79:
            return r0
        L7a:
            a.a5w r11 = (a.a5w) r11
            java.lang.Object r9 = r9.D()
            a.i77 r9 = (a.i77) r9
            java.util.List r9 = r9.t
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 10
            int r0 = a.r3d.q(r9, r0)
            r10.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L93:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r9.next()
            a.a5w r0 = (a.a5w) r0
            java.lang.String r1 = r0.d()
            java.lang.String r2 = r11.d()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 == 0) goto Lae
            r0 = r11
        Lae:
            r10.add(r0)
            goto L93
        Lb2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f97.l0(java.lang.String, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v187 */
    /* JADX WARN: Type inference failed for: r1v188 */
    /* JADX WARN: Type inference failed for: r1v202 */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ek80 ek80Var;
        String strA;
        HistoryDateFilterTypeModel historyDateFilterTypeModel;
        char c;
        String strA2;
        String str;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        String strA3;
        Object i0kVar;
        o37 o37Var = (o37) obj;
        o37Var.getClass();
        super.x(o37Var);
        boolean z = o37Var instanceof b27;
        int i = 0;
        BetHistoryScreenModel betHistoryScreenModel = this.p;
        mne mneVar = this.q;
        byte b = 1;
        yje yjeVar = null;
        if (z) {
            b27 b27Var = (b27) o37Var;
            if (b27Var.equals(t17.f33156a)) {
                i3t0.A(this, this.C, c0k.f3528a, null, null, 6);
                return;
            }
            boolean zEquals = b27Var.equals(y17.f41841a);
            cmt cmtVar = this.B;
            if (zEquals) {
                ql5 ql5Var = ((i77) D()).e;
                if (ql5Var != null) {
                    i3t0.A(this, this.C, new l0k(ql5Var.f28916a), null, null, 6);
                    i3t0.A(this, this.D, new b1k(cmtVar.g()), null, null, 6);
                    return;
                }
                return;
            }
            if (b27Var.equals(w17.f38384a)) {
                i3t0.A(this, this.C, h0k.f12239a, null, null, 6);
                i3t0.A(this, this.D, j1k.f15739a, null, null, 6);
                return;
            }
            if (b27Var.equals(z17.f43604a)) {
                i3t0.A(this, this.C, n0k.f22701a, null, null, 6);
                i3t0.A(this, this.D, new m1k(cmtVar.g()), null, null, 6);
                return;
            }
            if (b27Var.equals(v17.f36615a)) {
                i3t0.A(this, this.D, new d1k(true), null, null, 6);
                i3t0.A(this, this.C, e0k.f6993a, null, null, 6);
                return;
            }
            if (b27Var.equals(u17.f34889a)) {
                i3t0.A(this, this.D, new d1k(false), null, null, 6);
                return;
            }
            if (b27Var.equals(a27.f110a)) {
                sac.V(jiu0.a(this), new c87(this, b), null, mneVar.b, new a97(this, null), 10);
                return;
            }
            if (!b27Var.equals(x17.f40106a)) {
                t9f.b();
                return;
            }
            if (betHistoryScreenModel != null) {
                if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                    BetHistoryScreenModel.BetChampHistory betChampHistory = (BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel;
                    i0kVar = new j0k(Integer.parseInt(betChampHistory.f), betChampHistory.e);
                } else if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) {
                    i0kVar = new i0k(((i77) D()).i);
                }
                i3t0.A(this, this.C, i0kVar, null, null, 6);
                return;
            }
            t9f.b();
            return;
        }
        if (o37Var.equals(i17.f13983a)) {
            i3t0.A(this, this.D, w0k.f38352a, null, null, 6);
            G(new n67(((i77) D()).i == HistoryTypeModel.EVENTS || ((i77) D()).i == HistoryTypeModel.UNSETTLED));
            return;
        }
        if (o37Var.equals(m17.f20992a)) {
            sac.V(jiu0.a(this), new c87(this, (byte) i), null, null, new q87(this, yjeVar, (byte) 6), 14);
            return;
        }
        boolean zEquals2 = o37Var.equals(j17.f15719a);
        udj udjVar = udj.f35481a;
        ctf0 ctf0Var = this.r;
        byte b2 = 2;
        if (zEquals2) {
            ov7 ov7Var = ((i77) D()).h;
            if (!(ov7Var instanceof mv7)) {
                if (ov7Var.equals(nv7.f24177a)) {
                    return;
                }
                t9f.b();
                return;
            }
            lv7 lv7Var = ((mv7) ov7Var).f22443a;
            ql5 ql5Var2 = ((i77) D()).e;
            if (ql5Var2 == null || (str = ql5Var2.f) == null) {
                return;
            }
            wdj wdjVar = ((i77) D()).l;
            int i2 = ((i77) D()).A;
            ctf0Var.getClass();
            betHistoryScreenModel.getClass();
            if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                strA3 = ctf0Var.b.a(R.string.period_info, Arrays.copyOf(new Object[]{((BetHistoryScreenModel.BetChampHistory) betHistoryScreenModel).e}, 1));
            } else {
                if (!(betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory)) {
                    t9f.b();
                    return;
                }
                long j = ((long) i2) * 83544;
                if (wdjVar.equals(udjVar)) {
                    jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - j;
                } else if (wdjVar instanceof tdj) {
                    jCurrentTimeMillis = ((tdj) wdjVar).f33771a;
                } else {
                    if (!(wdjVar instanceof vdj)) {
                        t9f.b();
                        return;
                    }
                    jCurrentTimeMillis = ((vdj) wdjVar).f37235a;
                }
                if (wdjVar.equals(udjVar)) {
                    jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                } else if (wdjVar instanceof tdj) {
                    jCurrentTimeMillis2 = ((tdj) wdjVar).f33771a;
                } else {
                    if (!(wdjVar instanceof vdj)) {
                        t9f.b();
                        return;
                    }
                    jCurrentTimeMillis2 = ((vdj) wdjVar).b;
                }
                rdj rdjVar = rdj.f30294a;
                sdj sdjVar = sdj.UNIVERSAL;
                strA3 = ctf0Var.b.a(R.string.bets_summary_period_info, Arrays.copyOf(new Object[]{rdj.f(new znq0(jCurrentTimeMillis), sdjVar, null, 60), rdj.f(new znq0(jCurrentTimeMillis2), sdjVar, null, 60)}, 2));
            }
            String str2 = strA3;
            String strValueOf = String.valueOf(lv7Var.f20704a);
            pn40 pn40Var = pn40.f27267a;
            String strI = pn40.i(lv7Var.d, 2);
            String strI2 = pn40.i(lv7Var.e, 2);
            String strI3 = pn40.i(lv7Var.f, 2);
            lsm0 lsm0Var = ctf0Var.b;
            G(new m67(new BetsSummaryInfoUiModel(str2, strValueOf, strI, strI2, strI3, str, lsm0Var.a(R.string.bet_count_dots, Arrays.copyOf(new Object[0], 0)), w6x.r(new Object[0], 0, lsm0Var, R.string.bets_sum, Separators.COLON), w6x.r(new Object[0], 0, lsm0Var, R.string.paid_out, Separators.COLON), w6x.r(new Object[0], 0, lsm0Var, R.string.unsettled_bet, Separators.COLON))));
            return;
        }
        if (o37Var.equals(k17.f17506a)) {
            i3t0.A(this, this.D, new p1k(((i77) D()).i), null, null, 6);
            G(new u67(i8w.a(betHistoryScreenModel), ((i77) D()).i));
            return;
        }
        int i3 = 3;
        if (o37Var.equals(l17.f19235a)) {
            f8w f8wVarA = i8w.a(betHistoryScreenModel);
            HistoryTypeModel historyTypeModel = ((i77) D()).i;
            boolean z2 = ((i77) D()).Q;
            pru pruVar = this.x.f16447a;
            ?? r1 = f8wVarA != f8w.b && pruVar.a().f32117a.b.f28136a;
            HistoryDateFilterTypeModel historyDateFilterTypeModel2 = HistoryDateFilterTypeModel.f46397a;
            if (r1 == false || !z2) {
                historyDateFilterTypeModel2 = null;
            }
            HistoryDateFilterTypeModel historyDateFilterTypeModel3 = HistoryDateFilterTypeModel.b;
            if (r1 == false) {
                historyDateFilterTypeModel3 = null;
            }
            List listZ = tx3.z(new HistoryDateFilterTypeModel[]{historyDateFilterTypeModel2, historyDateFilterTypeModel3, r1 != false ? HistoryDateFilterTypeModel.c : null, (historyTypeModel == HistoryTypeModel.EVENTS && pruVar.a().f32117a.b.b) ? HistoryDateFilterTypeModel.d : null});
            ArrayList arrayList = new ArrayList(r3d.q(listZ, 10));
            for (HistoryDateFilterTypeModel historyDateFilterTypeModel4 : (ArrayList) listZ) {
                int i4 = ((i77) D()).A;
                wdj wdjVar2 = ((i77) D()).l;
                historyDateFilterTypeModel4.getClass();
                ctf0Var.getClass();
                int iOrdinal = historyDateFilterTypeModel4.ordinal();
                if (iOrdinal == 0) {
                    strA = ctf0Var.b.a(R.string.history_filter_day, Arrays.copyOf(new Object[i], (int) i));
                } else if (iOrdinal == 1) {
                    strA = ctf0Var.b.a(R.string.history_filter_month, Arrays.copyOf(new Object[i], (int) i));
                } else if (iOrdinal == 2) {
                    strA = ctf0Var.b.a(R.string.history_filter_set_period, Arrays.copyOf(new Object[i], (int) i));
                } else {
                    if (iOrdinal != i3) {
                        t9f.b();
                        return;
                    }
                    strA = ctf0Var.b.a(R.string.send_to_email, Arrays.copyOf(new Object[i], (int) i));
                }
                if (wdjVar2 instanceof tdj) {
                    historyDateFilterTypeModel = HistoryDateFilterTypeModel.f46397a;
                } else if (wdjVar2.equals(udjVar)) {
                    historyDateFilterTypeModel = HistoryDateFilterTypeModel.b;
                } else {
                    if (!(wdjVar2 instanceof vdj)) {
                        t9f.b();
                        return;
                    }
                    historyDateFilterTypeModel = HistoryDateFilterTypeModel.c;
                }
                ?? r8 = historyDateFilterTypeModel == historyDateFilterTypeModel4 ? 1 : i;
                int iOrdinal2 = historyDateFilterTypeModel4.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        arrayList = arrayList;
                        long j2 = ((long) i4) * 83544000;
                        rdj rdjVar2 = rdj.f30294a;
                        Date date = new Date(System.currentTimeMillis() - j2);
                        sdj sdjVar2 = sdj.UNIVERSAL;
                        strA2 = ctf0Var.b.a(R.string.date_filter_title, Arrays.copyOf(new Object[]{rdj.c(rdjVar2, sdjVar2, date, null, 60), rdj.c(rdjVar2, sdjVar2, new Date(), null, 60)}, 2));
                    } else if (iOrdinal2 == 2) {
                        long j3 = ((long) i4) * 83544000;
                        rdj rdjVar3 = rdj.f30294a;
                        Date date2 = new Date(System.currentTimeMillis() - j3);
                        sdj sdjVar3 = sdj.UNIVERSAL;
                        strA2 = ctf0Var.b.a(R.string.bets_summary_period_info, Arrays.copyOf(new Object[]{rdj.c(rdjVar3, sdjVar3, date2, null, 60), rdj.c(rdjVar3, sdjVar3, new Date(), null, 60)}, 2));
                    } else {
                        if (iOrdinal2 != i3) {
                            t9f.b();
                            return;
                        }
                        rdj rdjVar4 = rdj.f30294a;
                        Date date3 = new Date(System.currentTimeMillis() - 7518960000L);
                        sdj sdjVar4 = sdj.UNIVERSAL;
                        strA2 = ctf0Var.b.a(R.string.bets_summary_period_info, Arrays.copyOf(new Object[]{rdj.c(rdjVar4, sdjVar4, date3, null, 60), rdj.c(rdjVar4, sdjVar4, new Date(), null, 60)}, 2));
                    }
                    c = '<';
                } else {
                    arrayList = arrayList;
                    r8 = r8 == true ? 1 : 0;
                    long j4 = ((long) i4) * 83544000;
                    rdj rdjVar5 = rdj.f30294a;
                    Date date4 = new Date(System.currentTimeMillis() - j4);
                    sdj sdjVar5 = sdj.UNIVERSAL;
                    c = '<';
                    strA2 = ctf0Var.b.a(R.string.date_filter_title, Arrays.copyOf(new Object[]{rdj.c(rdjVar5, sdjVar5, date4, null, 60), rdj.c(rdjVar5, sdjVar5, new Date(), null, 60)}, 2));
                }
                HistoryDateFilterTypeUiModel historyDateFilterTypeUiModel = new HistoryDateFilterTypeUiModel(strA, strA2, historyDateFilterTypeModel4, r8);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(historyDateFilterTypeUiModel);
                arrayList = arrayList2;
                i = 0;
                i3 = 3;
            }
            i3t0.A(this, this.D, z0k.f43571a, null, null, 6);
            G(new w57(arrayList));
            return;
        }
        if (o37Var instanceof l27) {
            M(((l27) o37Var).f19294a);
            return;
        }
        byte b3 = 4;
        if (o37Var instanceof k27) {
            sac.V(jiu0.a(this), new c87(this, (byte) 11), null, mneVar.b, new xb2(this, ((k27) o37Var).f17559a, yjeVar, b3), 10);
            return;
        }
        if (o37Var.equals(j27.f15768a)) {
            G(new t67(((i77) D()).A));
            return;
        }
        if (o37Var.equals(r27.f29717a)) {
            E();
            return;
        }
        byte b4 = 9;
        if (o37Var instanceof o27) {
            sac.V(jiu0.a(this), new c87(this, b4), null, mneVar.b, new y87(this, ((o27) o37Var).f24518a, yjeVar, b), 10);
            return;
        }
        boolean z3 = o37Var instanceof r17;
        vzg0 vzg0Var = this.o;
        if (z3) {
            SimpleDate simpleDate = ((r17) o37Var).f29663a;
            Calendar calendar = Calendar.getInstance();
            calendar.getClass();
            wdx.J(simpleDate, calendar);
            long timeInMillis = calendar.getTimeInMillis() / 1000;
            H(new a21((byte) 3, timeInMillis));
            vzg0Var.e("KEY_DATE", new DatePeriodState.Day(timeInMillis));
            a0();
            return;
        }
        boolean z4 = o37Var instanceof n17;
        byte b5 = 15;
        byte b6 = 5;
        DatePeriodState.Full full = DatePeriodState.Full.f46401a;
        if (z4) {
            if (((i77) D()).Q) {
                HistoryDateFilterTypeModel historyDateFilterTypeModel5 = ((n17) o37Var).f22735a;
                i3t0.A(this, this.D, new a1k(historyDateFilterTypeModel5), null, null, 6);
                int iOrdinal3 = historyDateFilterTypeModel5.ordinal();
                if (iOrdinal3 == 0) {
                    O();
                    return;
                }
                if (iOrdinal3 == 1) {
                    if (HistoryDateFilterTypeModel.b == obb.m0(((i77) D()).l)) {
                        return;
                    }
                    H(new os6(b5));
                    vzg0Var.e("KEY_DATE", full);
                    a0();
                    return;
                }
                if (iOrdinal3 == 2) {
                    P(0L);
                    return;
                } else if (iOrdinal3 == 3) {
                    sac.V(jiu0.a(this), b97.f2194a, null, mneVar.b, new q87(this, yjeVar, b6), 10);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            HistoryDateFilterTypeModel historyDateFilterTypeModel6 = ((n17) o37Var).f22735a;
            i3t0.A(this, this.D, new a1k(historyDateFilterTypeModel6), null, null, 6);
            int iOrdinal4 = historyDateFilterTypeModel6.ordinal();
            if (iOrdinal4 == 0) {
                O();
                return;
            }
            if (iOrdinal4 == 1) {
                if (HistoryDateFilterTypeModel.b == obb.m0(((i77) D()).l)) {
                    return;
                }
                H(new os6((byte) 14));
                vzg0Var.e("KEY_DATE", full);
                a0();
                return;
            }
            if (iOrdinal4 == 2) {
                P(0L);
                return;
            } else if (iOrdinal4 == 3) {
                sac.V(jiu0.a(this), b97.f2194a, null, mneVar.b, new q87(this, yjeVar, b6), 10);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (o37Var instanceof q17) {
            DateRangeModel dateRangeModel = ((q17) o37Var).f27938a;
            SimpleDate simpleDate2 = dateRangeModel.f47284a;
            SimpleDate simpleDate3 = dateRangeModel.b;
            if (simpleDate2 == null && simpleDate3 == null) {
                return;
            }
            H(new g52(simpleDate2, Calendar.getInstance(), simpleDate3, b));
            vzg0Var.e("KEY_DATE", full);
            a0();
            return;
        }
        if (o37Var instanceof o17) {
            o17 o17Var = (o17) o37Var;
            long j5 = o17Var.f24465a;
            long j6 = o17Var.b;
            if (j6 == 0) {
                P(j5);
                return;
            } else {
                if (!((i77) D()).l.equals(new vdj(j5, j6)) && this.A.f15225a.a()) {
                    sac.V(jiu0.a(this), new c87(this, (byte) 7), null, mneVar.b, new l87(this, j5, j6, null, (byte) 0), 10);
                    vzg0Var.e("KEY_DATE", new DatePeriodState.Period(j5, j6));
                    return;
                }
                return;
            }
        }
        if (o37Var instanceof p17) {
            p17 p17Var = (p17) o37Var;
            Q(p17Var.f26186a, p17Var.b);
            return;
        }
        if (o37Var instanceof s17) {
            s17 s17Var = (s17) o37Var;
            Q(s17Var.f31440a / 1000, s17Var.b / 1000);
            return;
        }
        if (o37Var.equals(l37.f19345a)) {
            if (((i77) D()).y || (ek80Var = this.K0) == null) {
                return;
            }
            ek80Var.a(false);
            return;
        }
        if (o37Var.equals(m37.f21099a)) {
            a0();
            return;
        }
        if (o37Var.equals(n37.f22835a)) {
            H(new os6(b4));
            bby bbyVar = this.P0;
            if (bbyVar == null || !bbyVar.isActive() || ((i77) D()).c) {
                this.P0 = sac.V(jiu0.a(this), null, null, mneVar.b, new z87(this, yjeVar, b), 11);
                return;
            } else {
                sac.V(jiu0.a(this), null, null, mneVar.b, new q87(this, yjeVar, b2), 11);
                return;
            }
        }
        if (o37Var.equals(k37.f17604a)) {
            a0();
            return;
        }
        if (o37Var.equals(j37.f15816a)) {
            H(new os6((byte) 12));
            a0();
            return;
        }
        if (o37Var instanceof n27) {
            sac.V(jiu0.a(this), new c87(this, (byte) 10), null, mneVar.f22085a, new x87(this, ((n27) o37Var).f22785a, yjeVar, (byte) 0), 10);
            return;
        }
        if (o37Var instanceof e27) {
            c0(((e27) o37Var).f7071a);
            return;
        }
        if (o37Var instanceof f27) {
            e0(((f27) o37Var).f8798a);
            return;
        }
        if (o37Var instanceof h27) {
            String str3 = ((h27) o37Var).f12318a;
            a5w a5wVarW = W(str3);
            if (a5wVarW == null) {
                return;
            }
            sac.V(jiu0.a(this), null, null, mneVar.b, new u47(this, str3, a5wVarW, (yje) null), 11);
            return;
        }
        if (o37Var instanceof g27) {
            sac.V(jiu0.a(this), new c87(this, b), null, mneVar.b, new a97(this, null), 10);
            return;
        }
        if (o37Var instanceof t27) {
            t27 t27Var = (t27) o37Var;
            d0(t27Var.f33202a, t27Var.b);
            return;
        }
        if (o37Var instanceof c27) {
            String str4 = ((c27) o37Var).f3610a;
            sac.V(jiu0.a(this), new c87(this, (byte) 8), null, mneVar.b, new n1((byte) 2, yjeVar, (Serializable) X(str4), (Object) this, (Object) str4), 10);
            return;
        }
        byte b7 = 13;
        if (o37Var instanceof b37) {
            sac.V(jiu0.a(this), new c87(this, b7), null, null, new xw5(this, o37Var, yjeVar, b5), 14);
            return;
        }
        if (o37Var instanceof s27) {
            String str5 = ((s27) o37Var).f31489a;
            sac.V(jiu0.a(this), new qo5(this, str5, (byte) 24), null, mneVar.b, new y87(this, str5, yjeVar, (byte) 0), 10);
            return;
        }
        boolean zEquals3 = o37Var.equals(h37.f12371a);
        npc npcVar = this.t0;
        if (zEquals3) {
            ((t47) npcVar.f23905a.e).f33305a = null;
            h0();
            i3t0.A(this, this.D, new o1k(((i77) D()).i, ((i77) D()).m), null, null, 6);
            H(new os6((byte) 16));
            a0();
            return;
        }
        if (o37Var.equals(q27.f27987a)) {
            H(new os6(b7));
            this.l0.f44722a.f36880a.d("COMPACT_HISTORY", !((i77) D()).q);
            i3t0.A(this, this.D, new y0k(((i77) D()).q), null, null, 6);
            return;
        }
        if (o37Var instanceof d37) {
            g0();
            return;
        }
        if (o37Var instanceof p27) {
            this.G.a(true);
            this.H.a(true);
            g0();
            return;
        }
        if (o37Var.equals(e37.f7120a)) {
            e3c.n(this.P0);
            b0(true);
            return;
        }
        if (o37Var instanceof i37) {
            String str6 = ((i37) o37Var).f14083a;
            String str7 = this.u.a().f32117a.k;
            str6.getClass();
            i3t0.A(this, this.D, new s1k(str6), null, null, 6);
            lt2 lt2Var = new lt2(str6, str7);
            lfu lfuVar = this.o0;
            lfuVar.getClass();
            t47 t47Var = (t47) lfuVar.f19975a.e;
            t47Var.getClass();
            t47Var.b = lt2Var;
            G(new h67(str7, str6));
            return;
        }
        if (o37Var.equals(h17.f12269a)) {
            wdj wdjVar3 = ((i77) D()).l;
            epi0 epi0Var = this.x0;
            epi0Var.getClass();
            xdj xdjVar = (xdj) ((prc) epi0Var.b).b;
            xdjVar.getClass();
            xdjVar.f40695a = wdjVar3;
            G(new l67(i8w.a(betHistoryScreenModel), ((i77) D()).i));
            return;
        }
        if (o37Var instanceof m27) {
            List listK = this.w0.k(((i77) D()).i);
            wdj wdjVar4 = ((xdj) ((prc) this.y0.b).b).f40695a;
            ((t47) npcVar.f23905a.e).f33305a = null;
            h0();
            H(new sr1(wdjVar4, listK, (byte) 29));
            e3c.n(this.N0);
            U();
            return;
        }
        if (o37Var.equals(a37.f159a)) {
            H(new os6((byte) 23));
            return;
        }
        boolean zEquals4 = o37Var.equals(w27.f38436a);
        vqc vqcVar = this.G0;
        if (zEquals4) {
            if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) {
                ((fme) ((zas0) vqcVar.b).b).b.getAndSet(false);
            }
            c4m0 c4m0Var = this.L0;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            c4m0 c4m0Var2 = this.Q0;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            bby bbyVar2 = this.M0;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
                return;
            }
            return;
        }
        boolean zEquals5 = o37Var.equals(c37.f3659a);
        obe obeVar = this.F0;
        if (zEquals5) {
            if ((betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) && ((fme) ((zas0) vqcVar.b).b).b.getAndSet(false)) {
                qkt0 qkt0Var = (qkt0) ztb.b(((fme) obeVar.f24973a.b).f9776a.j());
                if (qkt0Var != null) {
                    String str8 = qkt0Var.f28903a;
                    if (str8 != null) {
                        k0(str8);
                    } else {
                        e3c.n(this.P0);
                        b0(true);
                    }
                } else {
                    b0(false);
                }
            } else {
                sac.V(jiu0.a(this), null, null, mneVar.b, new q87(this, yjeVar, b3), 11);
            }
            c4m0 c4m0Var3 = this.L0;
            if (c4m0Var3 != null) {
                c4m0Var3.cancel(null);
            }
            this.L0 = sac.T(new dnq(new fnq(this.s.a(bm5.c), new r87(this, yjeVar, b), (byte) 4), new s87(this, yjeVar, b), (byte) 1), jiu0.a(this), foe.h);
            c4m0 c4m0Var4 = this.Q0;
            if (c4m0Var4 != null) {
                e3c.n(c4m0Var4);
            }
            this.Q0 = sac.T(new fnq(xkb.V(((fme) ((zas0) this.E0.b).b).f9776a), new r87(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), d97.h);
            return;
        }
        if (o37Var.equals(y27.f41892a)) {
            sac.V(jiu0.a(this), new c87(this, b3), null, mneVar.f22085a, new q87(this, yjeVar, (byte) 3), 10);
            return;
        }
        if (o37Var.equals(f37.f8847a)) {
            qkt0 qkt0Var2 = (qkt0) ztb.b(((fme) obeVar.f24973a.b).f9776a.j());
            if (qkt0Var2 == null) {
                b0(false);
                return;
            }
            String str9 = qkt0Var2.f28903a;
            if (str9 != null) {
                k0(str9);
                return;
            } else {
                e3c.n(this.P0);
                b0(true);
                return;
            }
        }
        byte b8 = 0;
        yje yjeVar2 = null;
        if (Intrinsics.d(o37Var, x27.f40153a)) {
            sac.V(jiu0.a(this), null, null, mneVar.f22085a, new z87(this, yjeVar2, b8), 11);
            return;
        }
        if (o37Var instanceof d27) {
            String str10 = ((d27) o37Var).f5343a;
            byte b9 = ((i77) D()).i.f46393a;
            Set set = (HashSet) ((i77) D()).J.get(Integer.valueOf(b9));
            if (set == null) {
                set = xun.f41520a;
            }
            LinkedHashSet linkedHashSetE = set.contains(str10) ? eui0.e(set, str10) : eui0.h(set, str10);
            LinkedHashMap linkedHashMap = new LinkedHashMap(((i77) D()).J);
            linkedHashMap.put(Integer.valueOf(b9), CollectionsKt.J0(linkedHashSetE));
            H(new e87(linkedHashMap));
            return;
        }
        if (o37Var instanceof i27) {
            f0(((i27) o37Var).f14034a);
            return;
        }
        if (o37Var instanceof z27) {
            String str11 = ((z27) o37Var).f43656a;
            this.A0.d();
            H(new os6((byte) 10));
            sac.i0(jiu0.a(this), f97.class.getSimpleName().concat(".onSaleConfirmed"), 3, 0L, q3d.j(oqt0.class, lai0.class), null, new xb2(this, str11, yjeVar2, b6), null, mneVar.b, new c87(this, str11), null, 596);
            return;
        }
        if (o37Var instanceof g37) {
            k0(((g37) o37Var).f10598a);
        } else if (Intrinsics.d(o37Var, u27.f34932a)) {
            i3t0.A(this, this.D, new k1k(slb.d0(((i77) D()).i)), null, null, 6);
        } else {
            if (!Intrinsics.d(o37Var, v27.f36669a)) {
                throw new m460();
            }
            i3t0.A(this, this.D, new l1k(slb.d0(((i77) D()).i)), null, null, 6);
        }
    }
}
