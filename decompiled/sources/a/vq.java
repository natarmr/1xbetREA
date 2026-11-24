package a;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes.dex */
public final class vq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yzn0 f37832a;
    public final ctf0 b;
    public final x20 c;
    public final mii0 d;
    public final ouu e;
    public final wdk0 f;
    public final j9c g;
    public final vqc h;
    public final r9u i;
    public final List j;

    public vq(yzn0 yzn0Var, ctf0 ctf0Var, x20 x20Var, mii0 mii0Var, ouu ouuVar, wdk0 wdk0Var, j9c j9cVar, vqc vqcVar, r9u r9uVar) {
        ctf0Var.getClass();
        wdk0Var.getClass();
        r9uVar.getClass();
        this.f37832a = yzn0Var;
        this.b = ctf0Var;
        this.c = x20Var;
        this.d = mii0Var;
        this.e = ouuVar;
        this.f = wdk0Var;
        this.g = j9cVar;
        this.h = vqcVar;
        this.i = r9uVar;
        this.j = q3d.j(q4f.c, q4f.d, q4f.e, q4f.i, q4f.b);
    }

    public final yq a(Fragment fragment, aud audVar, ViewGroup viewGroup, Function0 function0, Function0 function1, ctc ctcVar, boolean z, ms2 ms2Var, long j, String str) {
        String str2;
        String str3;
        String strF;
        String strF2;
        yzn0 yzn0Var = this.f37832a;
        ii iiVar = (ii) yzn0Var.b;
        ctf0 ctf0Var = (ctf0) yzn0Var.f43523a;
        qek0 qek0Var = qek0.f28589a;
        jtv jtvVar = jtv.f17121a;
        fragment.getClass();
        audVar.getClass();
        ctcVar.getClass();
        ms2Var.getClass();
        str.getClass();
        boolean z2 = audVar instanceof ttd;
        j9c j9cVar = this.g;
        List list = this.j;
        ctf0 ctf0Var2 = this.b;
        boolean z3 = false;
        if (z2) {
            ttd ttdVar = (ttd) audVar;
            if (z) {
                c(ttdVar.f34506a, ttdVar.b, j, ms2Var, str);
            }
            boolean zContains = list.contains(j9cVar.a());
            long j2 = ttdVar.c;
            String str4 = ttdVar.d;
            if (zContains) {
                Long lValueOf = Long.valueOf(j2);
                String str5 = ttdVar.e;
                String str6 = ttdVar.f;
                String str7 = ttdVar.g;
                pek pekVar = jvn.f17210a;
                byte b = ttdVar.i;
                pekVar.getClass();
                strF2 = ctf0Var2.f(R.string.add_to_coupon_with_total_v2, lValueOf, str4, str5, str6, str7, ahb.C(pek.k(b), ttdVar.h, p3u0.e));
            } else {
                strF2 = ctf0Var2.f(R.string.add_to_coupon_without_total_v2, Long.valueOf(j2), str4, ttdVar.e, ttdVar.f, ttdVar.g);
            }
            rrm rrmVarV = yzn0Var.v(viewGroup, this.f, fragment.n0(), qek0Var, strF2, new sq(this, function0, z3), new tq(function1, z3));
            if (ctcVar == ctc.f4929a) {
                gfk0.l(fragment.o0());
            }
            return new xq(rrmVarV);
        }
        if (audVar instanceof utd) {
            utd utdVar = (utd) audVar;
            m0k0 m0k0Var = utdVar.f36250a;
            zxj0 zxj0Var = utdVar.b;
            ygp ygpVar = ygp.l;
            r9u r9uVar = this.i;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            boolean zD = j1q0Var.f15748a.d(ygpVar);
            androidx.fragment.app.e eVarC = fragment.C();
            eVarC.getClass();
            zxj0Var.getClass();
            int i = zD ? R.string.coupon_replace_request : R.string.coupon_replace_or_add_event_description;
            usd usdVar = ure.i2;
            DialogFields dialogFields = new DialogFields((CharSequence) ctf0Var.f(R.string.coupon_record_already_exists, new Object[0]), (CharSequence) ctf0Var.f(i, new Object[0]), (CharSequence) ctf0Var.f(R.string.coupon_replace_event_action, new Object[0]), ctf0Var.f(R.string.cancel, new Object[0]), !zD ? ctf0Var.f(R.string.add_event_btn_text, new Object[0]) : null, "REQUEST_ALREADY_COUPON_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1472);
            usdVar.getClass();
            ure ureVar = new ure();
            ureVar.R0(dialogFields);
            String str8 = dialogFields.f;
            if (str8 == null) {
                str8 = "";
            }
            iiy[] iiyVarArr = ure.j2;
            ureVar.f2.x(ureVar, iiyVarArr[0], str8);
            ureVar.h2.u(ureVar, iiyVarArr[2], zxj0Var);
            ureVar.g2.u(ureVar, iiyVarArr[1], m0k0Var);
            iiVar.c(ureVar, eVarC);
            return jtvVar;
        }
        if (audVar instanceof wtd) {
            wtd wtdVar = (wtd) audVar;
            if (z) {
                d(wtdVar.b, wtdVar.c, ms2Var, false);
            }
            rrm rrmVarV2 = yzn0Var.v(viewGroup, this.f, fragment.n0(), qek0Var, ctf0Var2.f(R.string.bet_event_deleted_from_coupon, new Object[0]), new sq(this, function0, (byte) 1), new q8((byte) 12));
            if (ctcVar == ctc.f4929a) {
                gfk0.l(fragment.o0());
            }
            return new xq(rrmVarV2);
        }
        if (audVar instanceof ytd) {
            ytd ytdVar = (ytd) audVar;
            q4f q4fVar = ytdVar.b;
            androidx.fragment.app.e eVarC2 = fragment.C();
            eVarC2.getClass();
            iiVar.d(new DialogFields((CharSequence) ctf0Var.f(R.string.attention, new Object[0]), (CharSequence) ctf0Var.f(R.string.coupon_max_event_limit, q4fVar != q4f.b ? ctf0Var.f(lgb.V(q4fVar), new Object[0]) : ctf0Var.f(lgb.V(q4f.d), new Object[0]), Integer.valueOf(ytdVar.f43212a)), (CharSequence) ctf0Var.f(R.string.ok, new Object[0]), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528), eVarC2);
            return jtvVar;
        }
        if (audVar.equals(ztd.f44952a)) {
            yzn0Var.v(viewGroup, this.f, fragment.n0(), pek0.f26859a, ctf0Var2.f(R.string.no_try_to_add_more_event, new Object[0]), new sq(this, function0, (byte) 2), new q8((byte) 13));
            return jtvVar;
        }
        if (!(audVar instanceof vtd)) {
            if (!(audVar instanceof xtd)) {
                t9f.b();
                return null;
            }
            boolean z4 = ((xtd) audVar).f41460a;
            androidx.fragment.app.e eVarC3 = fragment.C();
            eVarC3.getClass();
            int i2 = z4 ? R.string.has_incompatible_events_for_bet_builder_in_coupon : R.string.has_bet_builder_events_in_coupon;
            lsm0 lsm0Var = ctf0Var.b;
            lsm0 lsm0Var2 = ctf0Var.b;
            iiVar.d(new DialogFields((CharSequence) lsm0Var2.a(R.string.attention, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var.a(i2, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var2.a(R.string.clear, Arrays.copyOf(new Object[0], 0)), ctf0Var.f(R.string.cancel, new Object[0]), (String) null, "REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488), eVarC3);
            return jtvVar;
        }
        vtd vtdVar = (vtd) audVar;
        String str9 = vtdVar.f;
        String str10 = vtdVar.e;
        String str11 = vtdVar.d;
        if (z) {
            str2 = str10;
            str3 = str11;
            c(vtdVar.f38000a, vtdVar.b, j, ms2Var, str);
        } else {
            str2 = str10;
            str3 = str11;
        }
        boolean zContains2 = list.contains(j9cVar.a());
        String str12 = vtdVar.c;
        if (zContains2) {
            pek pekVar2 = jvn.f17210a;
            byte b2 = vtdVar.h;
            pekVar2.getClass();
            strF = ctf0Var2.f(R.string.change_coupon_with_total, str12, str3, str2, str9, ahb.C(pek.k(b2), vtdVar.g, p3u0.e));
        } else {
            strF = ctf0Var2.f(R.string.change_coupon_without_total, str12, str3, str2, str9);
        }
        yzn0Var.v(viewGroup, this.f, fragment.n0(), qek0Var, strF, new sq(this, function0, (byte) 3), new q8((byte) 14));
        return jtvVar;
    }

    public final xq b(Fragment fragment, ViewGroup viewGroup, Function0 function0) {
        fragment.getClass();
        String strA = this.b.b.a(R.string.coupon_was_cleared, Arrays.copyOf(new Object[0], 0));
        return new xq(this.f37832a.v(viewGroup, this.f, fragment.n0(), pek0.f26859a, strA, new sq(this, function0, (byte) 4), new q8((byte) 15)));
    }

    public final void c(long j, long j2, long j3, ms2 ms2Var, String str) {
        d(j, j2, ms2Var, true);
        if (ms2Var == null) {
            return;
        }
        if ((ms2Var instanceof mq2) || (ms2Var instanceof nq2) || (ms2Var instanceof lq2)) {
            this.h.k(pzb.C(new h0s(j, j2, j3, ms2Var, str)));
        }
    }

    public final void d(long j, long j2, ms2 ms2Var, boolean z) {
        String strV0 = (ms2Var != null && ((ms2Var instanceof lr2) || (ms2Var instanceof kr2) || (ms2Var instanceof jr2) || (ms2Var instanceof ks2))) ? kpb.v0(ms2Var) : null;
        Long lValueOf = j == 40 ? Long.valueOf(j2) : null;
        s1p s1pVar = this.c.f40143a;
        Set setC = dui0.c(new i1p((byte) 2, j), new i1p(z ? 1 : 0, (byte) 0));
        if (strV0 != null) {
            setC.add(new j1p(strV0, (byte) 0));
        }
        if (lValueOf != null) {
            setC.add(new i1p(lValueOf, (byte) 1));
        }
        s1pVar.a(setC, 3058L);
        String str = z ? "1" : "0";
        kt2 kt2Var = (kt2) this.d.b;
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("sport_id", Long.valueOf(j)), new Pair("action", str));
        if (strV0 != null) {
            linkedHashMapH.put("screen", strV0);
        }
        if (lValueOf != null) {
            linkedHashMapH.put("sub_sport_id", lValueOf);
        }
        kt2Var.a("bet_long_click", linkedHashMapH);
    }

    public final void e(Fragment fragment, ms2 ms2Var, xdr xdrVar) {
        fragment.getClass();
        ms2Var.getClass();
        sj3.s0(fragment, "REQUEST_ALREADY_COUPON_DIALOG_KEY", new on(this, fragment, ms2Var, xdrVar));
        fragment.C().u0("REQUEST_ALREADY_COUPON_DIALOG_KEYSECOND", fragment, new uq(this, fragment, ms2Var));
    }

    public final void f(Fragment fragment, ms2 ms2Var, Function0 function0) {
        fragment.getClass();
        ms2Var.getClass();
        ccq0.V(fragment, "REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEY", new tq(function0, (byte) 1));
        ccq0.T(fragment, "REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEY", new mc(this, fragment, ms2Var));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    public final void g(ms2 ms2Var, aao aaoVar) {
        ms2 bq2Var;
        b1p b1pVar;
        du6 du6Var;
        if (ms2Var == null) {
            bq2Var = ms2Var;
        } else if (ms2Var instanceof nr2) {
            bq2Var = new ar2();
        } else if (ms2Var instanceof is2) {
            bq2Var = new er2();
        } else if (ms2Var instanceof wq2) {
            bq2Var = new bq2();
        } else {
            bq2Var = ms2Var;
        }
        ds2 ds2Var = ms2Var instanceof ds2 ? (ds2) ms2Var : null;
        String strV = ds2Var != null ? g1x.v(ds2Var) : kpb.v0(bq2Var);
        int iOrdinal = aaoVar.ordinal();
        if (iOrdinal == 0) {
            b1pVar = b1p.REPLACE;
        } else if (iOrdinal == 1) {
            b1pVar = b1p.ADD;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            b1pVar = b1p.CANCEL;
        }
        this.c.f40143a.a(tx3.l0(new k1p[]{new j1p(strV, (byte) 0), new j1p(b1pVar.f1818a, (byte) 1)}), 11370L);
        int iOrdinal2 = aaoVar.ordinal();
        if (iOrdinal2 == 0) {
            du6Var = du6.REPLACE;
        } else if (iOrdinal2 == 1) {
            du6Var = du6.ADD;
        } else {
            if (iOrdinal2 != 2) {
                t9f.b();
                return;
            }
            du6Var = du6.CANCEL;
        }
        ((kt2) this.d.b).a("event_added", xp20.f(new Pair("action", du6Var.f6685a), new Pair("screen", strV)));
    }

    public final void h(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        xa50 xa50Var = new xa50();
        ouu ouuVar = this.e;
        ouu.o(ouuVar, xa50Var, null, 4);
        ((qe50) ouuVar.b).a(new xa50(), false);
    }
}
