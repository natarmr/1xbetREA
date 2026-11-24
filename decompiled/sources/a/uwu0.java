package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.registration.api.domain.models.BonusInfoModel;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uwu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36410a;
    public final /* synthetic */ ctf0 b;

    public /* synthetic */ uwu0(ctf0 ctf0Var, byte b) {
        this.f36410a = b;
        this.b = ctf0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wui0 wui0Var;
        i3m0 i3m0Var;
        int i;
        String str;
        String str2;
        bjm zimVar;
        byte b = this.f36410a;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                ((swu0) obj).getClass();
                return new m72(ctf0Var, (byte) 18);
            case 1:
                txu0 txu0Var = (txu0) obj;
                txu0Var.getClass();
                return new c69(ctf0Var, txu0Var);
            case 2:
                e9v0 e9v0Var = (e9v0) obj;
                e9v0Var.getClass();
                ctf0Var.getClass();
                boolean z = e9v0Var.f7443a;
                List list = e9v0Var.c;
                rx3 rx3VarS0 = CollectionsKt.S0(list);
                int iA = wp20.a(r3d.q(rx3VarS0, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                Iterator it = rx3VarS0.iterator();
                while (true) {
                    iil iilVar = (iil) it;
                    if (!iilVar.b.hasNext()) {
                        th90 th90VarP0 = dyb.p0(linkedHashMap);
                        lsm0 lsm0Var = ctf0Var.b;
                        return new f9v0(z, th90VarP0, new hjm(lsm0Var.a(R.string.bonus_title, Arrays.copyOf(new Object[0], 0)), new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188), new uc50(lsm0Var.a(R.string.registration_bonus_participation_menu_title, Arrays.copyOf(new Object[0], 0))), new hjm(lsm0Var.a(R.string.information, Arrays.copyOf(new Object[0], 0)), new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188), lsm0Var.a(R.string.registration_bonus_rules_part1, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.registration_bonus_rules_part2, Arrays.copyOf(new Object[0], 0)));
                    }
                    IndexedValue indexedValue = (IndexedValue) iilVar.next();
                    int i2 = indexedValue.f46061a;
                    BonusInfoModel bonusInfoModel = (BonusInfoModel) indexedValue.b;
                    int i3 = bonusInfoModel.f46848a;
                    Integer numValueOf = Integer.valueOf(i3);
                    boolean z2 = !e9v0Var.b;
                    int size = list.size();
                    if (size == 1) {
                        wui0Var = wui0.f39793a;
                    } else if (i2 == 0) {
                        wui0Var = wui0.b;
                    } else {
                        wui0Var = i2 == size + (-1) ? wui0.d : wui0.c;
                    }
                    wui0 wui0Var2 = wui0Var;
                    Integer numValueOf2 = Integer.valueOf(R.drawable.ic_bonus_placeholder);
                    String strValueOf = String.valueOf(i3);
                    bzu bzuVar = new bzu((byte) 23);
                    bzuVar.g("static");
                    bzuVar.g("img");
                    bzuVar.g("android");
                    bzuVar.g("actions");
                    bzuVar.g("first_bonus_registration");
                    bzuVar.g("new_default_" + strValueOf + ".svg");
                    n0x n0xVar = new n0x(((StringBuilder) bzuVar.b).toString());
                    pz40 pz40Var = s6t0.f31722a;
                    linkedHashMap.put(numValueOf, new rqm(new uui0(bonusInfoModel.b, null, bonusInfoModel.c, null, null, 58), new nui0(numValueOf2, null, n0xVar, new y3d(s6t0.b().f33626a.getPrimary()), null, null, 0.0f, 242), new nvi0(e9v0Var.d == i3 || bonusInfoModel.d), (d4d) null, (tvi0) null, wui0Var2, z2, (e900) null, 312));
                }
                break;
            case 3:
                ncv0 ncv0Var = (ncv0) obj;
                ncv0Var.getClass();
                ctf0Var.getClass();
                boolean z3 = ncv0Var.c;
                int i4 = ncv0Var.g;
                List<i3m0> list2 = ncv0Var.f23312a;
                if (z3) {
                    xuz xuzVar = pb10.c;
                    pb10 pb10Var = pb10.g;
                    xuzVar.getClass();
                    return new pcv0(new mdm(xuz.a(pb10Var, i4), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                if (ncv0Var.h && list2.isEmpty()) {
                    return qcv0.f28503a;
                }
                if (list2.isEmpty() || (i3m0Var = ncv0Var.b) == null) {
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var2 = pb10.g;
                    xuzVar2.getClass();
                    return new pcv0(new mdm(xuz.a(pb10Var2, i4), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                int iIndexOf = list2.indexOf(i3m0Var);
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                for (i3m0 i3m0Var2 : list2) {
                    i3m0Var2.getClass();
                    if (i3m0Var2.equals(f3m0.f8871a)) {
                        i = R.string.special_events_who_win_final;
                    } else if (i3m0Var2.equals(e3m0.f7145a)) {
                        i = R.string.special_events_who_win_group;
                    } else {
                        if (!i3m0Var2.equals(g3m0.f10617a)) {
                            t9f.b();
                            return null;
                        }
                        i = R.string.special_events_who_win_play_off;
                    }
                    arrayList.add(new yvh0(ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0)), bwh0.f3325a));
                }
                return new ocv0(i3m0Var, new oxh0(iIndexOf, dyb.o0(arrayList), ncv0Var.d));
            default:
                hfv0 hfv0Var = (hfv0) obj;
                hfv0Var.getClass();
                Integer numValueOf3 = Integer.valueOf(R.drawable.ic_games_square);
                ctf0Var.getClass();
                pbv pbvVar = hfv0Var.f12989a;
                ao60 ao60Var = new ao60(pbvVar != null ? new n0x(pbvVar.n.b) : new m0x(R.drawable.ic_games_square, null, 6), pbvVar != null ? new n0x(azw.R(pbvVar.n.b)) : new m0x(R.drawable.ic_games_square, null, 6), new m0x(R.drawable.ic_games_square, null, 6));
                if (pbvVar == null || (str = pbvVar.c) == null) {
                    str = "";
                }
                iul iulVar = iul.e;
                oe9 oe9Var = oe9.f25112a;
                lsm0 lsm0Var2 = ctf0Var.b;
                wul wulVar = new wul(iulVar, oe9Var, new ue9(lsm0Var2.a(R.string.wild_free_bet_activate_button, Arrays.copyOf(new Object[0], 0))), true, false, true);
                hjm hjmVar = new hjm(lsm0Var2.a(R.string.wild_free_bet_other_games_title, Arrays.copyOf(new Object[0], 0)), new mjm(127), null, null, null, null, false, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7164);
                List<pbv> list3 = hfv0Var.b;
                ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                for (pbv pbvVar2 : list3) {
                    long j = pbvVar2.f26728a;
                    hds hdsVar = pbvVar2.n;
                    int i5 = (int) j;
                    String str3 = pbvVar2.c;
                    if (pbvVar2.p) {
                        String str4 = hdsVar.b;
                        String str5 = hdsVar.f12884a;
                        zimVar = new ajm(new n0x(str4), new n0x(azw.R(hdsVar.b)), new n0x(str5), new n0x(azw.R(str5)), numValueOf3, Integer.valueOf(R.drawable.ic_glyph_technical_works), 32);
                        str2 = str3;
                    } else {
                        str2 = str3;
                        String str6 = hdsVar.b;
                        String str7 = hdsVar.f12884a;
                        zimVar = new zim(new n0x(str6), new n0x(azw.R(hdsVar.b)), new n0x(str7), new n0x(azw.R(str7)), numValueOf3, 32);
                    }
                    arrayList2.add(new wim(i5, zimVar, str2));
                }
                return new ifv0(ao60Var, str, wulVar, new ov60(hjmVar, new cjm(dyb.r0(arrayList2), xim.f40952a)));
        }
    }
}
