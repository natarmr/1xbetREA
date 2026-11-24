package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z5x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f43838a = q3d.j(Long.valueOf(ewg.d.b), Long.valueOf(pxg.d.b), Long.valueOf(fsg.d.b), Long.valueOf(yrg.d.b), Long.valueOf(rtg.d.b), Long.valueOf(hwg.d.b), Long.valueOf(ntg.d.b), Long.valueOf(lug.d.b), Long.valueOf(jwg.d.b), Long.valueOf(cug.d.b), Long.valueOf(mxg.d.b));

    public static final void a(lc00 lc00Var, l5x l5xVar, ctf0 ctf0Var, boolean z, m9s m9sVar) {
        String strA;
        ctf0Var.getClass();
        m9sVar.getClass();
        long j = m9sVar.p;
        qqs qqsVar = m9sVar.h;
        long j2 = qqsVar.h;
        long jF = (j == 2 || znq0.f(j2) == 0) ? 0L : znq0.f(j2);
        List list = l5xVar.f19480a;
        k5x k5xVar = l5xVar.e;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(z1x.F((tna0) it.next())));
        }
        List list2 = l5xVar.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(z1x.F((tna0) it2.next())));
        }
        int iOrdinal = k5xVar.ordinal();
        boolean z2 = false;
        if (iOrdinal == 0) {
            strA = ctf0Var.b.a(R.string.first_round, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal == 1) {
            strA = ctf0Var.b.a(R.string.second_round, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal == 2) {
            strA = ctf0Var.b.a(R.string.third_round, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal == 3) {
            strA = ctf0Var.b.a(R.string.first_player_wins, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal != 4) {
            strA = iOrdinal != 5 ? "" : ctf0Var.b.a(R.string.draw, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = ctf0Var.b.a(R.string.second_player_wins, Arrays.copyOf(new Object[0], 0));
        }
        String str = strA;
        String str2 = l5xVar.c;
        k5x k5xVar2 = k5x.d;
        int i = R.drawable.cybergame_indian_poker_cards_bg;
        m5x m5xVar = new m5x(str2, k5xVar == k5xVar2 ? R.drawable.cybergame_indian_poker_cards_win_bg : R.drawable.cybergame_indian_poker_cards_bg);
        String str3 = l5xVar.d;
        if (k5xVar == k5x.e) {
            i = R.drawable.cybergame_indian_poker_cards_win_bg;
        }
        m5x m5xVar2 = new m5x(str3, i);
        if (jF != 0) {
            if (!f43838a.contains(Long.valueOf(m9sVar.o))) {
                boolean zE0 = dyb.e0(m9sVar.v);
                if (m9sVar.x && !zE0) {
                    z2 = true;
                }
            }
        }
        int i2 = m9sVar.J;
        znq0 znq0Var = qqsVar.k;
        lc00Var.add(new y5x(arrayList, arrayList2, str, m5xVar, m5xVar2, z, new wnq0(z2, jF, true, i2, znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null)));
    }
}
