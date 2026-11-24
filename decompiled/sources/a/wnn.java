package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.bet_history.edit_coupon.presentation.model.OptionSelectBottomSheetDialogModel;
import org.xplatform.bet_history.edit_event.presentation.EditEventFragmentScreen;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class wnn extends i3t0 {
    public static final /* synthetic */ int g0 = 0;
    public final ctf0 A;
    public final duj B;
    public final rxu C;
    public final reu D;
    public final ocl E;
    public final qv2 F;
    public final p4a G;
    public final edu H;
    public final p4a I;
    public final eyg0 J;
    public final c5k K;
    public final vyt L;
    public final pmi0 M;
    public final bwl N;
    public final ouu O;
    public final p4u P;
    public final sd60 Q;
    public final dqc R;
    public final tzi S;
    public final dqc T;
    public final n4u U;
    public final lsn V;
    public final mii0 W;
    public final x20 X;
    public bby Y;
    public bby Z;
    public c4m0 a0;
    public bby b0;
    public bby c0;
    public bby d0;
    public c4m0 e0;
    public bby f0;
    public final long o;
    public final i1w0 p;
    public final ouu q;
    public final m1e r;
    public final pq s;
    public final rrd t;
    public final mne u;
    public final b4j v;
    public final x20 w;
    public final ag3 x;
    public final ik4 y;
    public final fht0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public wnn(long j, i1w0 i1w0Var, ouu ouuVar, m1e m1eVar, pq pqVar, rrd rrdVar, mne mneVar, b4j b4jVar, x20 x20Var, ag3 ag3Var, ik4 ik4Var, pru pruVar, fht0 fht0Var, ctf0 ctf0Var, duj dujVar, cmt cmtVar, rxu rxuVar, reu reuVar, reu reuVar2, ocl oclVar, qv2 qv2Var, p4a p4aVar, edu eduVar, p4a p4aVar2, bzt bztVar, r9u r9uVar, eyg0 eyg0Var, c5k c5kVar, vyt vytVar, pmi0 pmi0Var, bwl bwlVar, ouu ouuVar2, p4u p4uVar, sd60 sd60Var, dqc dqcVar, tzi tziVar, dqc dqcVar2, n4u n4uVar, lsn lsnVar, mii0 mii0Var, x20 x20Var2) {
        m1eVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        byte b = 1;
        yje yjeVar = null;
        super(new mr0(oclVar, pruVar, bztVar, r9uVar, (byte) 11), cvm0.p(rwjVar, rwjVar), new bcn(ctf0Var, b), (yzn0) null);
        this.o = j;
        this.p = i1w0Var;
        this.q = ouuVar;
        this.r = m1eVar;
        this.s = pqVar;
        this.t = rrdVar;
        this.u = mneVar;
        this.v = b4jVar;
        this.w = x20Var;
        this.x = ag3Var;
        this.y = ik4Var;
        this.z = fht0Var;
        this.A = ctf0Var;
        this.B = dujVar;
        this.C = rxuVar;
        this.D = reuVar;
        this.E = oclVar;
        this.F = qv2Var;
        this.G = p4aVar;
        this.H = eduVar;
        this.I = p4aVar2;
        this.J = eyg0Var;
        this.K = c5kVar;
        this.L = vytVar;
        this.M = pmi0Var;
        this.N = bwlVar;
        this.O = ouuVar2;
        this.P = p4uVar;
        this.Q = sd60Var;
        this.R = dqcVar;
        this.S = tziVar;
        this.T = dqcVar2;
        this.U = n4uVar;
        this.V = lsnVar;
        this.W = mii0Var;
        this.X = x20Var2;
        i3t0.L(this, new fnq(new eu4(new i89(((u0f) ((vqc) cmtVar.b).b).f34851a, (byte) 11), (byte) 5), new unn(this, yjeVar, (byte) 0), (byte) 4), null, null, 3);
        i3t0.L(this, new fnq(((aln) ((bwl) reuVar2.b).f3330a).b, new unn(this, yjeVar, b), (byte) 4), null, null, 3);
    }

    public final void M() {
        this.J.n(false);
        this.K.q();
        i1w0 i1w0Var = this.p;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void N(Throwable th) {
        bby bbyVar = this.b0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.Y;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        bby bbyVar3 = this.b0;
        if (bbyVar3 != null) {
            bbyVar3.cancel(null);
        }
        bby bbyVar4 = this.Z;
        if (bbyVar4 != null) {
            bbyVar4.cancel(null);
        }
        bby bbyVar5 = this.c0;
        if (bbyVar5 != null) {
            bbyVar5.cancel(null);
        }
        P();
        this.B.b(th, new qnn(this, (byte) 1));
    }

    public final boolean O() {
        bby bbyVar = this.b0;
        if (bbyVar != null ? bbyVar.isActive() : false) {
            return true;
        }
        bby bbyVar2 = this.Y;
        return bbyVar2 != null ? bbyVar2.isActive() : false;
    }

    public final void P() {
        Object value;
        bby bbyVar = this.d0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, inn.a((inn) value, null, false, null, null, null, null, false, false, null, 0L, false, 24575)));
    }

    public final void Q() {
        bby bbyVar = this.b0;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.b0 = i3t0.K(this, null, new hin(1, this, wnn.class, "handleLoadEventsListError", "handleLoadEventsListError(Ljava/lang/Throwable;)V", 0, (byte) 4), new rnn(this, yjeVar, (byte) 2), 1);
    }

    public final void R() {
        bby bbyVar = this.Y;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.Y = sac.Z(jiu0.a(this), ibc.v0(8, bfn.SECONDS), this.u.f22085a, new hin(1, this, wnn.class, "handleLoadEventsListError", "handleLoadEventsListError(Ljava/lang/Throwable;)V", 0, (byte) 5), new tnn(this, yjeVar, (byte) 0));
    }

    public final void S() {
        Object value;
        bby bbyVar = this.Y;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.b0;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        bby bbyVar3 = this.Z;
        if (bbyVar3 != null) {
            bbyVar3.cancel(null);
        }
        bby bbyVar4 = this.c0;
        if (bbyVar4 != null) {
            bbyVar4.cancel(null);
        }
        c4m0 c4m0Var = this.e0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        bby bbyVar5 = this.f0;
        if (bbyVar5 != null) {
            bbyVar5.cancel(null);
        }
        bby bbyVar6 = this.d0;
        if (bbyVar6 != null) {
            bbyVar6.cancel(null);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, inn.a((inn) value, null, false, null, xln.f41082a, null, null, false, false, null, 0L, false, 32703)));
    }

    public final void T() {
        bby bbyVar = this.d0;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.d0 = i3t0.K(this, null, null, new rnn(this, yjeVar, (byte) 4), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        int i;
        String strA;
        String strA2;
        wkn wknVar = (wkn) obj;
        wknVar.getClass();
        super.x(wknVar);
        boolean z = wknVar instanceof bkn;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        eyg0 eyg0Var = this.J;
        b4j b4jVar = this.v;
        ctf0 ctf0Var = this.A;
        ?? r9 = 0;
        Object obj2 = null;
        ?? r10 = 1;
        ?? r11 = 1;
        byte b = 0;
        ?? r12 = 0;
        ?? r13 = 0;
        ?? r14 = 0;
        ?? r15 = 0;
        if (!z) {
            if (wknVar instanceof fkn) {
                fkn fknVar = (fkn) wknVar;
                if (!fknVar.equals(dkn.f6239a)) {
                    if (fknVar.equals(ekn.f7960a)) {
                        i3t0.K(this, null, null, new rnn(this, r9, r11 == true ? 1 : 0), 3);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                c4m0 c4m0Var = this.a0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                bby bbyVar = this.Y;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                bby bbyVar2 = this.b0;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                bby bbyVar3 = this.Z;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                bby bbyVar4 = this.c0;
                if (bbyVar4 != null) {
                    bbyVar4.cancel(null);
                }
                c4m0 c4m0Var2 = this.e0;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                bby bbyVar5 = this.f0;
                if (bbyVar5 != null) {
                    bbyVar5.cancel(null);
                }
                bby bbyVar6 = this.d0;
                if (bbyVar6 != null) {
                    bbyVar6.cancel(null);
                    return;
                }
                return;
            }
            if (!(wknVar instanceof vkn)) {
                if (wknVar.equals(mkn.f21951a)) {
                    if (O()) {
                        return;
                    }
                    if (((sln) ((es) this.U.b).f8305a).f32408a.isEmpty()) {
                        Q();
                        return;
                    } else {
                        R();
                        return;
                    }
                }
                if (wknVar.equals(ikn.f14935a)) {
                    i3t0.K(this, null, null, new rnn(this, r9, r15 == true ? 1 : 0), 3);
                    return;
                }
                if (wknVar.equals(ckn.f4515a)) {
                    E();
                    return;
                }
                if (wknVar.equals(gkn.f11452a)) {
                    b4jVar.f1961a.c(a1w.f93a.a());
                    this.w.f40143a.a(xun.f41520a, 3216L);
                    eyg0Var.n(true);
                    ((qp) ((bbw0) this.V.f20589a).b).f29092a.n(Unit.f46060a);
                    this.q.q(new bb50(false), false);
                    return;
                }
                if (wknVar.equals(nkn.f23688a)) {
                    ctf0Var.getClass();
                    lsm0 lsm0Var = ctf0Var.b;
                    G(new enn(new DialogFields((CharSequence) lsm0Var.a(R.string.save, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var.a(R.string.edit_coupon_accept, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "REQUEST_SAVE_COUPON_CONFIRM_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488)));
                    return;
                }
                if (wknVar.equals(okn.f25412a)) {
                    i3t0.K(this, null, new hin(1, this, wnn.class, "handleSaveCouponError", "handleSaveCouponError(Ljava/lang/Throwable;)V", 0, (byte) 6), new vnn(this, (boolean) (r14 == true ? 1 : 0), (yje) r9, (byte) (r13 == true ? 1 : 0)), 1);
                    return;
                }
                if (wknVar.equals(kkn.f18449a)) {
                    i3t0.K(this, null, new hin(1, this, wnn.class, "handleSaveCouponError", "handleSaveCouponError(Ljava/lang/Throwable;)V", 0, (byte) 6), new vnn(this, (boolean) (r10 == true ? 1 : 0), (yje) r9, (byte) (r12 == true ? 1 : 0)), 1);
                    return;
                }
                if (wknVar.equals(hkn.f13215a)) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value, inn.a((inn) value, null, false, null, null, null, null, false, false, null, 0L, false, 28671)));
                    return;
                }
                if (wknVar.equals(jkn.f16678a)) {
                    M();
                    return;
                } else {
                    if (!wknVar.equals(lkn.f20208a)) {
                        t9f.b();
                        return;
                    }
                    ctf0Var.getClass();
                    lsm0 lsm0Var2 = ctf0Var.b;
                    G(new enn(new DialogFields((CharSequence) lsm0Var2.a(R.string.edit_coupon_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var2.a(R.string.edit_coupon_cancel, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var2.a(R.string.yes, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.no, Arrays.copyOf(new Object[0], 0)), (String) null, "REQUEST_CONFIRM_EXIT_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488)));
                    return;
                }
            }
            vkn vknVar = (vkn) wknVar;
            if (vknVar.equals(skn.f32359a)) {
                List list = ((inn) D()).c;
                q4f q4fVar = ((inn) D()).f15082a;
                ctf0Var.getClass();
                list.getClass();
                lsm0 lsm0Var3 = ctf0Var.b;
                String strA3 = lsm0Var3.a(R.string.bet_type, Arrays.copyOf(new Object[0], 0));
                int iIndexOf = list.indexOf(q4fVar);
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(lsm0Var3.a(lgb.V((q4f) it.next()), Arrays.copyOf(new Object[0], 0)));
                }
                G(new fnn(new OptionSelectBottomSheetDialogModel(iIndexOf, strA3, "REQUEST_SELECT_COUPON_TYPE_DIALOG_KEY", "SELECT_COUPON_TYPE_DIALOG_RESULT_KEY", arrayList)));
                return;
            }
            if (vknVar.equals(rkn.f30657a)) {
                ezc ezcVarA = this.L.a();
                ctf0Var.getClass();
                lsm0 lsm0Var4 = ctf0Var.b;
                String strA4 = lsm0Var4.a(R.string.coef_change, Arrays.copyOf(new Object[0], 0));
                c0o c0oVar = ezc.f;
                int iIndexOf2 = c0oVar.indexOf(ezcVarA);
                ArrayList arrayList2 = new ArrayList(r3d.q(c0oVar, 10));
                Iterator it2 = c0oVar.iterator();
                while (it2.hasNext()) {
                    int iOrdinal = ((ezc) it2.next()).ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.to_confirm;
                    } else if (iOrdinal == 1) {
                        i = R.string.to_any_accept;
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return;
                        }
                        i = R.string.to_up_accept;
                    }
                    arrayList2.add(lsm0Var4.a(i, Arrays.copyOf(new Object[0], 0)));
                }
                G(new fnn(new OptionSelectBottomSheetDialogModel(iIndexOf2, strA4, "REQUEST_SELECT_COEF_CHECK_TYPE_DIALOG_KEY", "SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY", arrayList2)));
                return;
            }
            boolean zEquals = vknVar.equals(tkn.f34103a);
            bwl bwlVar = this.N;
            if (zEquals) {
                List<en7> list2 = ((aln) ((bwl) bwlVar.f3330a).f3330a).f1077a;
                en7 en7Var = ((inn) D()).l;
                ctf0Var.getClass();
                list2.getClass();
                lsm0 lsm0Var5 = ctf0Var.b;
                String strA5 = lsm0Var5.a(R.string.choose_bet_type, Arrays.copyOf(new Object[0], 0));
                int iIndexOf3 = list2.indexOf(en7Var);
                ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                for (en7 en7Var2 : list2) {
                    arrayList3.add(String.format(Locale.ENGLISH, "%s %d/", Arrays.copyOf(new Object[]{lsm0Var5.a(R.string.system, Arrays.copyOf(new Object[0], 0)), Integer.valueOf(en7Var2.c)}, 2)) + en7Var2.f8078a);
                }
                G(new fnn(new OptionSelectBottomSheetDialogModel(iIndexOf3, strA5, "REQUEST_SELECT_BET_SYSTEM_TYPE_DIALOG_KEY", "SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY", arrayList3)));
                return;
            }
            if (vknVar instanceof qkn) {
                i3t0.K(this, null, null, new snn(this, ((qkn) vknVar).f28894a, r9, b), 3);
                return;
            }
            if (vknVar instanceof pkn) {
                int i2 = ((pkn) vknVar).f27143a;
                c0o c0oVar2 = ezc.f;
                if (i2 < 0 || i2 >= c0oVar2.b()) {
                    return;
                }
                ezc ezcVar = (ezc) c0oVar2.get(i2);
                pmi0 pmi0Var = this.M;
                pmi0Var.getClass();
                ezcVar.getClass();
                hm7 hm7Var = (hm7) pmi0Var.f27236a;
                hm7Var.getClass();
                ((vwb0) hm7Var.f13293a.b).f(ezcVar.f8665a, "bet_check_koef");
                return;
            }
            if (!(vknVar instanceof ukn)) {
                t9f.b();
                return;
            }
            int i3 = ((ukn) vknVar).f35836a;
            List list3 = ((aln) ((bwl) bwlVar.f3330a).f3330a).f1077a;
            if (i3 < 0 || i3 >= list3.size()) {
                return;
            }
            en7 en7Var3 = (en7) list3.get(i3);
            ouu ouuVar = this.O;
            ouuVar.getClass();
            en7Var3.getClass();
            ((dqc) ouuVar.c).a();
            ((jnn) ((lrc) ((do20) ouuVar.d).f6397a).b).b.n(null);
            aln alnVar = (aln) ((bwl) ouuVar.b).f3330a;
            alnVar.getClass();
            p7m0 p7m0Var2 = alnVar.b;
            p7m0Var2.getClass();
            p7m0Var2.o(null, en7Var3);
            T();
            R();
            return;
        }
        bkn bknVar = (bkn) wknVar;
        if (bknVar.equals(wjn.f39270a)) {
            G(new gnn(new xdk0(pek0.f26859a, ctf0Var.b.a(R.string.auto_sub_info_message, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124)));
            return;
        }
        boolean z2 = bknVar instanceof akn;
        pq pqVar = this.s;
        if (z2) {
            long j = ((akn) bknVar).f1029a;
            for (Object obj3 : pqVar.f27394a.i()) {
                if (((pln) obj3).c == j) {
                    obj2 = obj3;
                    break;
                }
            }
            pln plnVar = (pln) obj2;
            long j2 = plnVar != null ? plnVar.b : 0L;
            f680[] f680VarArr = f680.f8998a;
            this.W.T(j2, "editable_coupon");
            this.X.u(j2, "editable_coupon");
            lsm0 lsm0Var6 = ctf0Var.b;
            lsm0 lsm0Var7 = ctf0Var.b;
            G(new enn(new DialogFields((CharSequence) lsm0Var6.a(R.string.optibet_market_info_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var7.a(R.string.optibet_market_desc, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var7.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528)));
            return;
        }
        if (bknVar instanceof yjn) {
            lsm0 lsm0Var8 = ctf0Var.b;
            lsm0 lsm0Var9 = ctf0Var.b;
            G(new enn(new DialogFields((CharSequence) lsm0Var8.a(R.string.each_way_dialog_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var9.a(R.string.each_way_description, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var9.a(R.string.ok_upper, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528)));
            return;
        }
        if (bknVar instanceof xjn) {
            long j3 = ((xjn) bknVar).f40994a;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            while (true) {
                Object value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
                long j4 = j3;
                if (p7m0Var3.m(value2, inn.a((inn) value2, null, false, null, null, null, null, false, false, null, j4, false, 28671))) {
                    break;
                } else {
                    j3 = j4;
                }
            }
            edu eduVar = this.H;
            q4f q4fVarE = ((vqc) eduVar.b).e();
            int size = ((es) eduVar.c).i().size();
            nwd nwdVar = q4f.f28094a;
            q4f q4fVar2 = q4f.e;
            nwdVar.getClass();
            ?? r16 = (q4fVarE == q4fVar2 && size == nwd.d(q4fVar2)) ? 1 : 0;
            ctf0Var.getClass();
            if (r16 != 0) {
                lsm0 lsm0Var10 = ctf0Var.b;
                strA = lsm0Var10.a(R.string.caution, Arrays.copyOf(new Object[0], 0));
                strA2 = lsm0Var10.a(R.string.reset_coupon_type_to_express_delete_event_message, Arrays.copyOf(new Object[0], 0));
            } else {
                lsm0 lsm0Var11 = ctf0Var.b;
                strA = lsm0Var11.a(R.string.coupon_edit_confirm_delete_title, Arrays.copyOf(new Object[0], 0));
                strA2 = lsm0Var11.a(R.string.coupon_edit_confirm_delete_message, Arrays.copyOf(new Object[0], 0));
            }
            String str = strA;
            String str2 = strA2;
            lsm0 lsm0Var12 = ctf0Var.b;
            G(new enn(new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) lsm0Var12.a(R.string.remove, Arrays.copyOf(new Object[0], 0)), lsm0Var12.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "REQUEST_CONFIRM_DELETE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488)));
            return;
        }
        if (!(bknVar instanceof zjn)) {
            t9f.b();
            return;
        }
        long j5 = ((zjn) bknVar).f44489a;
        b4jVar.f1961a.c(a1w.b.a());
        eyg0Var.n(true);
        for (Object obj4 : pqVar.f27394a.i()) {
            if (((pln) obj4).c == j5) {
                r9 = obj4;
                break;
            }
        }
        pln plnVar2 = (pln) r9;
        if (plnVar2 == null) {
            return;
        }
        i1w0 i1w0Var = this.p;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(new EditEventFragmentScreen(plnVar2.c, plnVar2.g, plnVar2.j));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
