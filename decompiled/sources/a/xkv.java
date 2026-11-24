package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class xkv extends w46 {
    public final i1w0 b;
    public final brt c;
    public final oeu d;
    public final oeu e;
    public final pmi0 f;
    public final xfu g;
    public final ctf0 h;
    public final zg i;
    public final ix0 j;
    public final wkv k;
    public final p7m0 l;

    public xkv(i1w0 i1w0Var, String str, brt brtVar, pru pruVar, oeu oeuVar, oeu oeuVar2, pmi0 pmi0Var, xfu xfuVar, ctf0 ctf0Var, zg zgVar, ix0 ix0Var) throws Throwable {
        Object value;
        lc00 lc00VarB;
        Throwable th;
        String strF;
        int i;
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.b = i1w0Var;
        this.c = brtVar;
        this.d = oeuVar;
        this.e = oeuVar2;
        this.f = pmi0Var;
        this.g = xfuVar;
        this.h = ctf0Var;
        this.i = zgVar;
        this.j = ix0Var;
        p7m0 p7m0VarA = q7m0.a(iun.f15405a);
        this.l = p7m0VarA;
        rkv rkvVarB = xfuVar.b();
        String str2 = pruVar.a().d.f27973a.b;
        boolean zA = oeuVar.a();
        this.k = new wkv(rkvVarB, zA);
        do {
            value = p7m0VarA.getValue();
            lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(new nkv(zA));
            sff0 sff0VarA = this.c.f3095a.a();
            List listA0 = CollectionsKt.A0(rkv.j, new e3l((byte) 25));
            ArrayList<rkv> arrayList = new ArrayList();
            Iterator it = listA0.iterator();
            while (true) {
                th = null;
                boolean z = true;
                if (it.hasNext()) {
                    Object next = it.next();
                    switch (((rkv) next).ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                            break;
                        case 3:
                            z = sff0VarA.f32117a.c.f1900a;
                            break;
                        case 4:
                            z = sff0VarA.c.f7565a.f12870a;
                            break;
                        case 5:
                            z = sff0VarA.d.f27973a.f6914a;
                            break;
                        case 6:
                            z = sff0VarA.b.f13233a.b;
                            break;
                        default:
                            t9f.b();
                            throw null;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            for (rkv rkvVar : arrayList) {
                ctf0 ctf0Var2 = this.h;
                boolean z2 = rkvVarB == rkvVar;
                rkvVar.getClass();
                ctf0Var2.getClass();
                switch (rkvVar.ordinal()) {
                    case 0:
                        strF = ctf0Var2.f(R.string.pay_in, new Object[0]);
                        break;
                    case 1:
                        strF = ctf0Var2.f(R.string.bet_history, new Object[0]);
                        break;
                    case 2:
                        strF = ctf0Var2.f(R.string.favorites_name, new Object[0]);
                        break;
                    case 3:
                        strF = ctf0Var2.f(R.string.day_express, new Object[0]);
                        break;
                    case 4:
                        strF = ctf0Var2.f(R.string.cyberSport, new Object[0]);
                        break;
                    case 5:
                        strF = str2;
                        break;
                    case 6:
                        strF = ctf0Var2.f(R.string.cases_casino, new Object[0]);
                        break;
                    default:
                        t9f.b();
                        throw th;
                }
                switch (rkvVar.ordinal()) {
                    case 0:
                        i = R.drawable.ic_glyph_replenish_account;
                        break;
                    case 1:
                        i = R.drawable.ic_glyph_history;
                        break;
                    case 2:
                        i = R.drawable.ic_glyph_favourite_active;
                        break;
                    case 3:
                        i = R.drawable.ic_glyph_express;
                        break;
                    case 4:
                        i = R.drawable.ic_glyph_cyber_gamepad;
                        break;
                    case 5:
                        i = R.drawable.ic_glyph_games;
                        break;
                    case 6:
                        i = R.drawable.ic_glyph_cards;
                        break;
                    default:
                        t9f.b();
                        throw th;
                }
                boolean z3 = zA;
                zA = z3;
                arrayList2.add(new vkv(strF, i, z3, rkvVar, z2));
                th = th;
            }
            lc00VarB.addAll(arrayList2);
        } while (!p7m0VarA.m(value, kotlin.collections.a.a(lc00VarB)));
    }

    public final void w() {
        String str;
        rkv rkvVarB = this.g.b();
        boolean zA = this.d.a();
        if (!new wkv(rkvVarB, zA).equals(this.k)) {
            switch (rkvVarB.ordinal()) {
                case 0:
                    str = "Deposit";
                    break;
                case 1:
                    str = "BetHistory";
                    break;
                case 2:
                    str = "Favor";
                    break;
                case 3:
                    str = "Express";
                    break;
                case 4:
                    str = "Cyber";
                    break;
                case 5:
                    str = "games";
                    break;
                case 6:
                    str = "Slots";
                    break;
                default:
                    t9f.b();
                    return;
            }
            zg zgVar = this.i;
            zgVar.getClass();
            zgVar.f44322a.a("acc_settings_gesture_set", xp20.f(new Pair("option", zA ? "shake_on" : "shake_off"), new Pair("point", str)));
            String strA = rkvVarB.a();
            ix0 ix0Var = this.j;
            ix0Var.getClass();
            ix0Var.f15516a.a(dui0.c(new j1p(zA ? "shake_on" : "shake_off", (byte) 0), new j1p(strA, (byte) 1)), 3289L);
        }
        i1w0 i1w0Var = this.b;
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
}
