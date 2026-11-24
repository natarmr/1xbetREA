package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0o0 f42939a = maz.b(new xng((byte) 0));
    public static final List b = q3d.j(len.g, len.h, len.i);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0151  */
    /* JADX WARN: Code duplicated, block: B:24:0x0153  */
    /* JADX WARN: Code duplicated, block: B:27:0x015a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0162  */
    /* JADX WARN: Code duplicated, block: B:31:0x0165  */
    /* JADX WARN: Code duplicated, block: B:33:0x0168  */
    /* JADX WARN: Code duplicated, block: B:35:0x016b  */
    /* JADX WARN: Code duplicated, block: B:37:0x016e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
    /* JADX WARN: Code duplicated, block: B:40:0x0174  */
    /* JADX WARN: Code duplicated, block: B:41:0x0178  */
    /* JADX WARN: Code duplicated, block: B:42:0x017c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0180  */
    /* JADX WARN: Code duplicated, block: B:44:0x0184  */
    /* JADX WARN: Code duplicated, block: B:47:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x01be  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c7  */
    public static final void a(lc00 lc00Var, men menVar, m9s m9sVar, boolean z, ctf0 ctf0Var) {
        String str;
        int i;
        int i2;
        boolean z2;
        String str2;
        int iOrdinal;
        m9sVar.getClass();
        ctf0Var.getClass();
        len lenVar = menVar.f21654a;
        int i3 = menVar.c;
        nen nenVar = menVar.g;
        nen nenVar2 = menVar.f;
        int i4 = menVar.e;
        int i5 = menVar.d;
        tna0 tna0Var = menVar.b;
        String strA = "";
        switch (lenVar.ordinal()) {
            case 0:
                strA = ctf0Var.b.a(R.string.sport_durak_distribution, Arrays.copyOf(new Object[0], 0));
                str = strA;
                qng qngVar = new qng(str, lenVar);
                String str3 = m9sVar.i;
                str3.getClass();
                String str4 = m9sVar.j;
                str4.getClass();
                Object[] objArr = {Integer.valueOf(i5 + i4)};
                lsm0 lsm0Var = ctf0Var.b;
                String strA2 = lsm0Var.a(R.string.durak_game_count_v2, Arrays.copyOf(objArr, 1));
                String strA3 = lsm0Var.a(R.string.durak_game_rebound_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                String strA4 = lsm0Var.a(R.string.durak_game_take_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
                    i = -1;
                } else {
                    i = i3;
                }
                int iF = z1x.F(tna0Var);
                if (i3 == 0) {
                    iOrdinal = tna0Var.f34224a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.drawable.ic_spade_durak_black;
                    } else if (iOrdinal != 1) {
                        i2 = R.drawable.ic_clubs_durak_black;
                    } else if (iOrdinal != 2) {
                        i2 = R.drawable.ic_diamonds_durak_red;
                    } else if (iOrdinal != 3) {
                        i2 = R.drawable.ic_heart_durak_red;
                    } else if (iOrdinal == 4) {
                        t9f.b();
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = R.drawable.card_back;
                }
                ing ingVar = new ing(i, iF, i2);
                String strD = d(nenVar2, lenVar, ctf0Var);
                String strD2 = d(nenVar, lenVar, ctf0Var);
                nng nngVar = new nng(b(menVar), c(tna0Var, menVar.h));
                rng rngVar = new rng(b(menVar), c(tna0Var, menVar.i));
                ArrayList arrayListB = b(menVar);
                if (nenVar2 == nen.f23393a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jng jngVar = new jng(arrayListB, lenVar, z2);
                if (z) {
                    str2 = "static/img/android/esports/153/B_tablet.png";
                } else {
                    str2 = "static/img/android/esports/153/B.png";
                }
                lc00Var.add(new wng(qngVar, str3, str4, strD, strD2, strA2, strA3, strA4, ingVar, nngVar, rngVar, jngVar, str2));
                break;
            case 1:
                strA = ctf0Var.b.a(R.string.sport_durak_rebound, Arrays.copyOf(new Object[0], 0));
                str = strA;
                qng qngVar2 = new qng(str, lenVar);
                String str5 = m9sVar.i;
                str5.getClass();
                String str6 = m9sVar.j;
                str6.getClass();
                Object[] objArr2 = {Integer.valueOf(i5 + i4)};
                lsm0 lsm0Var2 = ctf0Var.b;
                String strA5 = lsm0Var2.a(R.string.durak_game_count_v2, Arrays.copyOf(objArr2, 1));
                String strA6 = lsm0Var2.a(R.string.durak_game_rebound_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                String strA7 = lsm0Var2.a(R.string.durak_game_take_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
                    i = -1;
                } else {
                    i = i3;
                }
                int iF2 = z1x.F(tna0Var);
                if (i3 == 0) {
                    iOrdinal = tna0Var.f34224a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.drawable.ic_spade_durak_black;
                    } else if (iOrdinal != 1) {
                        i2 = R.drawable.ic_clubs_durak_black;
                    } else if (iOrdinal != 2) {
                        i2 = R.drawable.ic_diamonds_durak_red;
                    } else if (iOrdinal != 3) {
                        i2 = R.drawable.ic_heart_durak_red;
                    } else if (iOrdinal == 4) {
                        t9f.b();
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = R.drawable.card_back;
                }
                ing ingVar2 = new ing(i, iF2, i2);
                String strD3 = d(nenVar2, lenVar, ctf0Var);
                String strD4 = d(nenVar, lenVar, ctf0Var);
                nng nngVar2 = new nng(b(menVar), c(tna0Var, menVar.h));
                rng rngVar2 = new rng(b(menVar), c(tna0Var, menVar.i));
                ArrayList arrayListB2 = b(menVar);
                if (nenVar2 == nen.f23393a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jng jngVar2 = new jng(arrayListB2, lenVar, z2);
                if (z) {
                    str2 = "static/img/android/esports/153/B_tablet.png";
                } else {
                    str2 = "static/img/android/esports/153/B.png";
                }
                lc00Var.add(new wng(qngVar2, str5, str6, strD3, strD4, strA5, strA6, strA7, ingVar2, nngVar2, rngVar2, jngVar2, str2));
                break;
            case 2:
                strA = ctf0Var.b.a(R.string.sport_durak_take, Arrays.copyOf(new Object[0], 0));
                str = strA;
                qng qngVar3 = new qng(str, lenVar);
                String str7 = m9sVar.i;
                str7.getClass();
                String str8 = m9sVar.j;
                str8.getClass();
                Object[] objArr3 = {Integer.valueOf(i5 + i4)};
                lsm0 lsm0Var3 = ctf0Var.b;
                String strA8 = lsm0Var3.a(R.string.durak_game_count_v2, Arrays.copyOf(objArr3, 1));
                String strA9 = lsm0Var3.a(R.string.durak_game_rebound_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                String strA10 = lsm0Var3.a(R.string.durak_game_take_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
                    i = -1;
                } else {
                    i = i3;
                }
                int iF3 = z1x.F(tna0Var);
                if (i3 == 0) {
                    iOrdinal = tna0Var.f34224a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.drawable.ic_spade_durak_black;
                    } else if (iOrdinal != 1) {
                        i2 = R.drawable.ic_clubs_durak_black;
                    } else if (iOrdinal != 2) {
                        i2 = R.drawable.ic_diamonds_durak_red;
                    } else if (iOrdinal != 3) {
                        i2 = R.drawable.ic_heart_durak_red;
                    } else if (iOrdinal == 4) {
                        t9f.b();
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = R.drawable.card_back;
                }
                ing ingVar3 = new ing(i, iF3, i2);
                String strD5 = d(nenVar2, lenVar, ctf0Var);
                String strD6 = d(nenVar, lenVar, ctf0Var);
                nng nngVar3 = new nng(b(menVar), c(tna0Var, menVar.h));
                rng rngVar3 = new rng(b(menVar), c(tna0Var, menVar.i));
                ArrayList arrayListB3 = b(menVar);
                if (nenVar2 == nen.f23393a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jng jngVar3 = new jng(arrayListB3, lenVar, z2);
                if (z) {
                    str2 = "static/img/android/esports/153/B_tablet.png";
                } else {
                    str2 = "static/img/android/esports/153/B.png";
                }
                lc00Var.add(new wng(qngVar3, str7, str8, strD5, strD6, strA8, strA9, strA10, ingVar3, nngVar3, rngVar3, jngVar3, str2));
                break;
            case 3:
                strA = ctf0Var.b.a(R.string.sport_durak_card_set, Arrays.copyOf(new Object[0], 0));
                str = strA;
                qng qngVar4 = new qng(str, lenVar);
                String str9 = m9sVar.i;
                str9.getClass();
                String str10 = m9sVar.j;
                str10.getClass();
                Object[] objArr4 = {Integer.valueOf(i5 + i4)};
                lsm0 lsm0Var4 = ctf0Var.b;
                String strA11 = lsm0Var4.a(R.string.durak_game_count_v2, Arrays.copyOf(objArr4, 1));
                String strA12 = lsm0Var4.a(R.string.durak_game_rebound_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                String strA13 = lsm0Var4.a(R.string.durak_game_take_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
                    i = -1;
                } else {
                    i = i3;
                }
                int iF4 = z1x.F(tna0Var);
                if (i3 == 0) {
                    iOrdinal = tna0Var.f34224a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.drawable.ic_spade_durak_black;
                    } else if (iOrdinal != 1) {
                        i2 = R.drawable.ic_clubs_durak_black;
                    } else if (iOrdinal != 2) {
                        i2 = R.drawable.ic_diamonds_durak_red;
                    } else if (iOrdinal != 3) {
                        i2 = R.drawable.ic_heart_durak_red;
                    } else if (iOrdinal == 4) {
                        t9f.b();
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = R.drawable.card_back;
                }
                ing ingVar4 = new ing(i, iF4, i2);
                String strD7 = d(nenVar2, lenVar, ctf0Var);
                String strD8 = d(nenVar, lenVar, ctf0Var);
                nng nngVar4 = new nng(b(menVar), c(tna0Var, menVar.h));
                rng rngVar4 = new rng(b(menVar), c(tna0Var, menVar.i));
                ArrayList arrayListB4 = b(menVar);
                if (nenVar2 == nen.f23393a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jng jngVar4 = new jng(arrayListB4, lenVar, z2);
                if (z) {
                    str2 = "static/img/android/esports/153/B_tablet.png";
                } else {
                    str2 = "static/img/android/esports/153/B.png";
                }
                lc00Var.add(new wng(qngVar4, str9, str10, strD7, strD8, strA11, strA12, strA13, ingVar4, nngVar4, rngVar4, jngVar4, str2));
                break;
            case 4:
                nen nenVar3 = nen.f23393a;
                if (nenVar2 == nenVar3) {
                    strA = ctf0Var.b.a(R.string.sport_durak_next_step_v2, Arrays.copyOf(new Object[]{1}, 1));
                } else if (nenVar == nenVar3) {
                    strA = ctf0Var.b.a(R.string.sport_durak_next_step_v2, Arrays.copyOf(new Object[]{2}, 1));
                }
                str = strA;
                qng qngVar5 = new qng(str, lenVar);
                String str11 = m9sVar.i;
                str11.getClass();
                String str12 = m9sVar.j;
                str12.getClass();
                Object[] objArr5 = {Integer.valueOf(i5 + i4)};
                lsm0 lsm0Var5 = ctf0Var.b;
                String strA14 = lsm0Var5.a(R.string.durak_game_count_v2, Arrays.copyOf(objArr5, 1));
                String strA15 = lsm0Var5.a(R.string.durak_game_rebound_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                String strA16 = lsm0Var5.a(R.string.durak_game_take_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
                    i = -1;
                } else {
                    i = i3;
                }
                int iF5 = z1x.F(tna0Var);
                if (i3 == 0) {
                    iOrdinal = tna0Var.f34224a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.drawable.ic_spade_durak_black;
                    } else if (iOrdinal != 1) {
                        i2 = R.drawable.ic_clubs_durak_black;
                    } else if (iOrdinal != 2) {
                        i2 = R.drawable.ic_diamonds_durak_red;
                    } else if (iOrdinal != 3) {
                        i2 = R.drawable.ic_heart_durak_red;
                    } else if (iOrdinal == 4) {
                        t9f.b();
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = R.drawable.card_back;
                }
                ing ingVar5 = new ing(i, iF5, i2);
                String strD9 = d(nenVar2, lenVar, ctf0Var);
                String strD10 = d(nenVar, lenVar, ctf0Var);
                nng nngVar5 = new nng(b(menVar), c(tna0Var, menVar.h));
                rng rngVar5 = new rng(b(menVar), c(tna0Var, menVar.i));
                ArrayList arrayListB5 = b(menVar);
                if (nenVar2 == nen.f23393a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jng jngVar5 = new jng(arrayListB5, lenVar, z2);
                if (z) {
                    str2 = "static/img/android/esports/153/B_tablet.png";
                } else {
                    str2 = "static/img/android/esports/153/B.png";
                }
                lc00Var.add(new wng(qngVar5, str11, str12, strD9, strD10, strA14, strA15, strA16, ingVar5, nngVar5, rngVar5, jngVar5, str2));
                break;
            case 5:
                strA = ctf0Var.b.a(R.string.sport_durak_game_text_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5 + i4 + 1)}, 1));
                str = strA;
                qng qngVar6 = new qng(str, lenVar);
                String str13 = m9sVar.i;
                str13.getClass();
                String str14 = m9sVar.j;
                str14.getClass();
                Object[] objArr6 = {Integer.valueOf(i5 + i4)};
                lsm0 lsm0Var6 = ctf0Var.b;
                String strA17 = lsm0Var6.a(R.string.durak_game_count_v2, Arrays.copyOf(objArr6, 1));
                String strA18 = lsm0Var6.a(R.string.durak_game_rebound_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                String strA19 = lsm0Var6.a(R.string.durak_game_take_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
                    i = -1;
                } else {
                    i = i3;
                }
                int iF6 = z1x.F(tna0Var);
                if (i3 == 0) {
                    iOrdinal = tna0Var.f34224a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.drawable.ic_spade_durak_black;
                    } else if (iOrdinal != 1) {
                        i2 = R.drawable.ic_clubs_durak_black;
                    } else if (iOrdinal != 2) {
                        i2 = R.drawable.ic_diamonds_durak_red;
                    } else if (iOrdinal != 3) {
                        i2 = R.drawable.ic_heart_durak_red;
                    } else if (iOrdinal == 4) {
                        t9f.b();
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = R.drawable.card_back;
                }
                ing ingVar6 = new ing(i, iF6, i2);
                String strD11 = d(nenVar2, lenVar, ctf0Var);
                String strD12 = d(nenVar, lenVar, ctf0Var);
                nng nngVar6 = new nng(b(menVar), c(tna0Var, menVar.h));
                rng rngVar6 = new rng(b(menVar), c(tna0Var, menVar.i));
                ArrayList arrayListB6 = b(menVar);
                if (nenVar2 == nen.f23393a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jng jngVar6 = new jng(arrayListB6, lenVar, z2);
                if (z) {
                    str2 = "static/img/android/esports/153/B_tablet.png";
                } else {
                    str2 = "static/img/android/esports/153/B.png";
                }
                lc00Var.add(new wng(qngVar6, str13, str14, strD11, strD12, strA17, strA18, strA19, ingVar6, nngVar6, rngVar6, jngVar6, str2));
                break;
            case 6:
                strA = ctf0Var.b.a(R.string.sport_durak_end_game_win_v2, Arrays.copyOf(new Object[]{1}, 1));
                str = strA;
                qng qngVar7 = new qng(str, lenVar);
                String str15 = m9sVar.i;
                str15.getClass();
                String str16 = m9sVar.j;
                str16.getClass();
                Object[] objArr7 = {Integer.valueOf(i5 + i4)};
                lsm0 lsm0Var7 = ctf0Var.b;
                String strA110 = lsm0Var7.a(R.string.durak_game_count_v2, Arrays.copyOf(objArr7, 1));
                String strA111 = lsm0Var7.a(R.string.durak_game_rebound_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                String strA112 = lsm0Var7.a(R.string.durak_game_take_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
                    i = -1;
                } else {
                    i = i3;
                }
                int iF7 = z1x.F(tna0Var);
                if (i3 == 0) {
                    iOrdinal = tna0Var.f34224a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.drawable.ic_spade_durak_black;
                    } else if (iOrdinal != 1) {
                        i2 = R.drawable.ic_clubs_durak_black;
                    } else if (iOrdinal != 2) {
                        i2 = R.drawable.ic_diamonds_durak_red;
                    } else if (iOrdinal != 3) {
                        i2 = R.drawable.ic_heart_durak_red;
                    } else if (iOrdinal == 4) {
                        t9f.b();
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = R.drawable.card_back;
                }
                ing ingVar7 = new ing(i, iF7, i2);
                String strD13 = d(nenVar2, lenVar, ctf0Var);
                String strD14 = d(nenVar, lenVar, ctf0Var);
                nng nngVar7 = new nng(b(menVar), c(tna0Var, menVar.h));
                rng rngVar7 = new rng(b(menVar), c(tna0Var, menVar.i));
                ArrayList arrayListB7 = b(menVar);
                if (nenVar2 == nen.f23393a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jng jngVar7 = new jng(arrayListB7, lenVar, z2);
                if (z) {
                    str2 = "static/img/android/esports/153/B_tablet.png";
                } else {
                    str2 = "static/img/android/esports/153/B.png";
                }
                lc00Var.add(new wng(qngVar7, str15, str16, strD13, strD14, strA110, strA111, strA112, ingVar7, nngVar7, rngVar7, jngVar7, str2));
                break;
            case 7:
                strA = ctf0Var.b.a(R.string.sport_durak_end_game_win_v2, Arrays.copyOf(new Object[]{2}, 1));
                str = strA;
                qng qngVar8 = new qng(str, lenVar);
                String str17 = m9sVar.i;
                str17.getClass();
                String str18 = m9sVar.j;
                str18.getClass();
                Object[] objArr8 = {Integer.valueOf(i5 + i4)};
                lsm0 lsm0Var8 = ctf0Var.b;
                String strA113 = lsm0Var8.a(R.string.durak_game_count_v2, Arrays.copyOf(objArr8, 1));
                String strA114 = lsm0Var8.a(R.string.durak_game_rebound_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                String strA115 = lsm0Var8.a(R.string.durak_game_take_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
                    i = -1;
                } else {
                    i = i3;
                }
                int iF8 = z1x.F(tna0Var);
                if (i3 == 0) {
                    iOrdinal = tna0Var.f34224a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.drawable.ic_spade_durak_black;
                    } else if (iOrdinal != 1) {
                        i2 = R.drawable.ic_clubs_durak_black;
                    } else if (iOrdinal != 2) {
                        i2 = R.drawable.ic_diamonds_durak_red;
                    } else if (iOrdinal != 3) {
                        i2 = R.drawable.ic_heart_durak_red;
                    } else if (iOrdinal == 4) {
                        t9f.b();
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = R.drawable.card_back;
                }
                ing ingVar8 = new ing(i, iF8, i2);
                String strD15 = d(nenVar2, lenVar, ctf0Var);
                String strD16 = d(nenVar, lenVar, ctf0Var);
                nng nngVar8 = new nng(b(menVar), c(tna0Var, menVar.h));
                rng rngVar8 = new rng(b(menVar), c(tna0Var, menVar.i));
                ArrayList arrayListB8 = b(menVar);
                if (nenVar2 == nen.f23393a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jng jngVar8 = new jng(arrayListB8, lenVar, z2);
                if (z) {
                    str2 = "static/img/android/esports/153/B_tablet.png";
                } else {
                    str2 = "static/img/android/esports/153/B.png";
                }
                lc00Var.add(new wng(qngVar8, str17, str18, strD15, strD16, strA113, strA114, strA115, ingVar8, nngVar8, rngVar8, jngVar8, str2));
                break;
            case 8:
                strA = ctf0Var.b.a(R.string.drow, Arrays.copyOf(new Object[0], 0));
                str = strA;
                qng qngVar9 = new qng(str, lenVar);
                String str19 = m9sVar.i;
                str19.getClass();
                String str110 = m9sVar.j;
                str110.getClass();
                Object[] objArr9 = {Integer.valueOf(i5 + i4)};
                lsm0 lsm0Var9 = ctf0Var.b;
                String strA116 = lsm0Var9.a(R.string.durak_game_count_v2, Arrays.copyOf(objArr9, 1));
                String strA117 = lsm0Var9.a(R.string.durak_game_rebound_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                String strA118 = lsm0Var9.a(R.string.durak_game_take_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
                    i = -1;
                } else {
                    i = i3;
                }
                int iF9 = z1x.F(tna0Var);
                if (i3 == 0) {
                    iOrdinal = tna0Var.f34224a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.drawable.ic_spade_durak_black;
                    } else if (iOrdinal != 1) {
                        i2 = R.drawable.ic_clubs_durak_black;
                    } else if (iOrdinal != 2) {
                        i2 = R.drawable.ic_diamonds_durak_red;
                    } else if (iOrdinal != 3) {
                        i2 = R.drawable.ic_heart_durak_red;
                    } else if (iOrdinal == 4) {
                        t9f.b();
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = R.drawable.card_back;
                }
                ing ingVar9 = new ing(i, iF9, i2);
                String strD17 = d(nenVar2, lenVar, ctf0Var);
                String strD18 = d(nenVar, lenVar, ctf0Var);
                nng nngVar9 = new nng(b(menVar), c(tna0Var, menVar.h));
                rng rngVar9 = new rng(b(menVar), c(tna0Var, menVar.i));
                ArrayList arrayListB9 = b(menVar);
                if (nenVar2 == nen.f23393a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jng jngVar9 = new jng(arrayListB9, lenVar, z2);
                if (z) {
                    str2 = "static/img/android/esports/153/B_tablet.png";
                } else {
                    str2 = "static/img/android/esports/153/B.png";
                }
                lc00Var.add(new wng(qngVar9, str19, str110, strD17, strD18, strA116, strA117, strA118, ingVar9, nngVar9, rngVar9, jngVar9, str2));
                break;
            case 9:
                str = strA;
                qng qngVar10 = new qng(str, lenVar);
                String str111 = m9sVar.i;
                str111.getClass();
                String str112 = m9sVar.j;
                str112.getClass();
                Object[] objArr10 = {Integer.valueOf(i5 + i4)};
                lsm0 lsm0Var10 = ctf0Var.b;
                String strA119 = lsm0Var10.a(R.string.durak_game_count_v2, Arrays.copyOf(objArr10, 1));
                String strA1110 = lsm0Var10.a(R.string.durak_game_rebound_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
                String strA1111 = lsm0Var10.a(R.string.durak_game_take_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
                if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
                    i = -1;
                } else {
                    i = i3;
                }
                int iF10 = z1x.F(tna0Var);
                if (i3 == 0) {
                    iOrdinal = tna0Var.f34224a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = R.drawable.ic_spade_durak_black;
                    } else if (iOrdinal != 1) {
                        i2 = R.drawable.ic_clubs_durak_black;
                    } else if (iOrdinal != 2) {
                        i2 = R.drawable.ic_diamonds_durak_red;
                    } else if (iOrdinal != 3) {
                        i2 = R.drawable.ic_heart_durak_red;
                    } else if (iOrdinal == 4) {
                        t9f.b();
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = R.drawable.card_back;
                }
                ing ingVar10 = new ing(i, iF10, i2);
                String strD19 = d(nenVar2, lenVar, ctf0Var);
                String strD110 = d(nenVar, lenVar, ctf0Var);
                nng nngVar10 = new nng(b(menVar), c(tna0Var, menVar.h));
                rng rngVar10 = new rng(b(menVar), c(tna0Var, menVar.i));
                ArrayList arrayListB10 = b(menVar);
                if (nenVar2 == nen.f23393a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jng jngVar10 = new jng(arrayListB10, lenVar, z2);
                if (z) {
                    str2 = "static/img/android/esports/153/B_tablet.png";
                } else {
                    str2 = "static/img/android/esports/153/B.png";
                }
                lc00Var.add(new wng(qngVar10, str111, str112, strD19, strD110, strA119, strA1110, strA1111, ingVar10, nngVar10, rngVar10, jngVar10, str2));
                break;
            default:
                t9f.b();
                break;
        }
    }

    public static final ArrayList b(men menVar) {
        List list = menVar.j;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new una0(z1x.F((tna0) it.next())));
        }
        List list2 = menVar.k;
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new una0(z1x.F((tna0) it2.next())));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            una0 una0Var = (una0) CollectionsKt.W(i, arrayList);
            int i2 = R.drawable.transparent;
            int i3 = una0Var != null ? una0Var.f35951a : R.drawable.transparent;
            una0 una0Var2 = (una0) CollectionsKt.W(i, arrayList2);
            if (una0Var2 != null) {
                i2 = una0Var2.f35951a;
            }
            arrayList3.add(new fng(i3, i2));
        }
        return arrayList3;
    }

    public static final List c(tna0 tna0Var, List list) {
        if (tna0Var.equals(new tna0(sna0.e, rna0.UNKNOWN))) {
            return (List) f42939a.getValue();
        }
        Set setP0 = CollectionsKt.P0(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setP0) {
            if (((tna0) obj).f34224a != sna0.e) {
                arrayList.add(obj);
            }
        }
        List listA0 = CollectionsKt.A0(arrayList, new vt5((byte) 19));
        ArrayList arrayList2 = new ArrayList(r3d.q(listA0, 10));
        Iterator it = listA0.iterator();
        while (it.hasNext()) {
            arrayList2.add(new una0(z1x.F((tna0) it.next())));
        }
        return arrayList2;
    }

    public static final String d(nen nenVar, len lenVar, ctf0 ctf0Var) {
        nen nenVar2 = nen.f23393a;
        List list = b;
        if (nenVar != nenVar2 || list.contains(lenVar)) {
            return (nenVar != nen.b || list.contains(lenVar)) ? "" : ctf0Var.b.a(R.string.sport_durak_protect, Arrays.copyOf(new Object[0], 0));
        }
        return ctf0Var.b.a(R.string.sport_durak_attack, Arrays.copyOf(new Object[0], 0));
    }
}
