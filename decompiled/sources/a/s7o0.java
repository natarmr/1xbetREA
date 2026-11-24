package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s7o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f31759a;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 27; i3++) {
            arrayList.add(new bpg0(i, i2, R.drawable.cybergame_russian_lotto_bilet_item_bg, R.color.static_black, ""));
            if (i == 8) {
                i2++;
                i = 0;
            } else {
                i++;
            }
        }
        f31759a = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    public static final void a(lc00 lc00Var, m9s m9sVar, wog0 wog0Var, ctf0 ctf0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String strA;
        m9sVar.getClass();
        ctf0Var.getClass();
        qqs qqsVar = m9sVar.h;
        long jF = znq0.f(qqsVar.h);
        znq0 znq0Var = qqsVar.k;
        kpg0 kpg0Var = new kpg0(znq0Var != null ? Long.valueOf(znq0.f(znq0Var.f44687a)) : null, jF);
        List list = wog0Var.f39496a;
        List list2 = wog0Var.c;
        opg0 opg0Var = wog0Var.d;
        ArrayList arrayListB = b(list, list2);
        ArrayList arrayListB2 = b(wog0Var.b, list2);
        int iOrdinal = opg0Var.ordinal();
        if (iOrdinal != 0) {
            i = R.string.player_one;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i = R.string.draw_title;
                } else if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
            }
        } else {
            i = R.string.win_title;
        }
        int iOrdinal2 = opg0Var.ordinal();
        if (iOrdinal2 == 0) {
            i2 = R.color.static_white;
        } else {
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    i2 = R.color.static_white;
                } else if (iOrdinal2 != 3) {
                    t9f.b();
                    return;
                }
            }
            i2 = R.color.static_black;
        }
        int iOrdinal3 = opg0Var.ordinal();
        if (iOrdinal3 == 0) {
            i3 = R.drawable.ic_russian_lotto_first_part_win_bilet;
        } else if (iOrdinal3 == 1) {
            i3 = R.drawable.ic_russian_lotto_first_part_bilet;
        } else if (iOrdinal3 != 2) {
            if (iOrdinal3 != 3) {
                t9f.b();
                return;
            }
            i3 = R.drawable.ic_russian_lotto_first_part_bilet;
        } else {
            i3 = R.drawable.ic_russian_lotto_first_part_draw_bilet;
        }
        lsm0 lsm0Var = ctf0Var.b;
        uog0 uog0Var = new uog0(lsm0Var.a(i, Arrays.copyOf(new Object[0], 0)), i2, i3);
        int iOrdinal4 = opg0Var.ordinal();
        int i6 = R.string.player_two;
        if (iOrdinal4 != 0) {
            if (iOrdinal4 == 1) {
                i6 = R.string.win_title;
            } else if (iOrdinal4 == 2) {
                i6 = R.string.draw_title;
            } else if (iOrdinal4 != 3) {
                t9f.b();
                return;
            }
        }
        int iOrdinal5 = opg0Var.ordinal();
        if (iOrdinal5 == 0) {
            i4 = R.color.static_black;
        } else if (iOrdinal5 == 1 || iOrdinal5 == 2) {
            i4 = R.color.static_white;
        } else {
            if (iOrdinal5 != 3) {
                t9f.b();
                return;
            }
            i4 = R.color.static_black;
        }
        int iOrdinal6 = opg0Var.ordinal();
        if (iOrdinal6 == 0) {
            i5 = R.drawable.ic_russian_lotto_first_part_bilet;
        } else if (iOrdinal6 == 1) {
            i5 = R.drawable.ic_russian_lotto_first_part_win_bilet;
        } else if (iOrdinal6 != 2) {
            if (iOrdinal6 != 3) {
                t9f.b();
                return;
            }
            i5 = R.drawable.ic_russian_lotto_first_part_bilet;
        } else {
            i5 = R.drawable.ic_russian_lotto_first_part_draw_bilet;
        }
        uog0 uog0Var2 = new uog0(lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0)), i4, i5);
        list2.getClass();
        long j = m9sVar.v;
        int iOrdinal7 = opg0Var.ordinal();
        if (iOrdinal7 == 0) {
            strA = lsm0Var.a(R.string.player_one_wins, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal7 == 1) {
            strA = lsm0Var.a(R.string.player_two_wins, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal7 != 2) {
            uen uenVar = wen.b;
            long jL = j - wen.l(ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS), bfn.SECONDS);
            strA = (1 > jL || jL >= 21600) ? "" : lsm0Var.a(R.string.bet_before_game_start, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = lsm0Var.a(R.string.drow, Arrays.copyOf(new Object[0], 0));
        }
        lc00Var.add(new npg0(kpg0Var, arrayListB, arrayListB2, uog0Var, uog0Var2, list2, strA));
    }

    public static final ArrayList b(List list, List list2) {
        Object next;
        ArrayList<bpg0> arrayList = f31759a;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (bpg0 bpg0Var : arrayList) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                xog0 xog0Var = (xog0) next;
                if (bpg0Var.f2982a == xog0Var.f41218a && bpg0Var.b == xog0Var.b) {
                    break;
                }
            }
            xog0 xog0Var2 = (xog0) next;
            if (xog0Var2 != null) {
                int i = xog0Var2.c;
                boolean zContains = list2.contains(Integer.valueOf(i));
                bpg0Var = new bpg0(xog0Var2.f41218a, xog0Var2.b, zContains ? R.drawable.cybergame_russian_lotto_bilet_item_selected_bg : R.drawable.cybergame_russian_lotto_bilet_item_bg, zContains ? R.color.static_white : R.color.static_black, String.valueOf(i));
            }
            arrayList2.add(bpg0Var);
        }
        return arrayList2;
    }
}
