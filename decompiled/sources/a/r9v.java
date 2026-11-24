package a;

import kotlin.text.StringsKt;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r9v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30106a = StringsKt.o0('/', "static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus.png", "static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus.png");
    public static final String b = StringsKt.o0('/', "static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus1.png", "static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus1.png");
    public static final String c = StringsKt.o0('/', "static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png", "static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png");

    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    public static final void a(mm40 mm40Var, u9v u9vVar, boolean z, String str, fet fetVar, int i) {
        String str2;
        String str3;
        String str4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-938053594);
        int i2 = i | (fetVar2.g(u9vVar) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.g(str) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (u9vVar == null || (str2 = u9vVar.b) == null) {
                str2 = "";
            }
            long jM123getWhite0d7_KjU = u9vVar != null ? u9vVar.c : StaticColors.INSTANCE.m123getWhite0d7_KjU();
            String str5 = u9vVar != null ? u9vVar.d : "";
            if (z) {
                if (u9vVar != null) {
                    str3 = u9vVar.e;
                    str4 = str3;
                } else {
                    str4 = str;
                }
            } else if (u9vVar != null) {
                str3 = u9vVar.f35301a;
                str4 = str3;
            } else {
                str4 = str;
            }
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pge pgeVar = gqw0.A;
            mm40 mm40VarE0 = jm40.b;
            k7x.a(str4, null, mm40VarE0, pgeVar, null, fetVar2, 1573296, 1976);
            String strO0 = StringsKt.o0('/', str5, str5);
            if (strO0.equals(f30106a)) {
                mm40VarE0 = o2e.e0(mm40VarE0, "GOLD_RUSH_GREEN_BONUS_CELL");
            } else if (strO0.equals(b)) {
                mm40VarE0 = o2e.e0(mm40VarE0, "GOLD_RUSH_RED_BONUS_CELL");
            } else if (strO0.equals(c)) {
                mm40VarE0 = o2e.e0(mm40VarE0, "GOLD_RUSH_GRAY_BONUS_CELL");
            }
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            k7x.a(str5, null, s5x0.J(mm40VarE0, 2.0f), pgeVar, null, fetVar2, 1572912, 1976);
            if (str2.length() > 0) {
                fetVar2.e0(-1650071487);
                v8q0.a(str2, null, jM123getWhite0d7_KjU, null, qmk.s, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0.a(new y9q0(0L, qmk.z, psq.g, j1t0.d, 0L, null, 0, 0, qmk.K, 16646105), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24576, 113642);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1649783838);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 12, i, mm40Var, u9vVar, str, z);
        }
    }
}
