package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u1y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34922a;
    public final /* synthetic */ wyu b;
    public final /* synthetic */ hrc c;
    public final /* synthetic */ ctf0 d;

    public /* synthetic */ u1y(wyu wyuVar, hrc hrcVar, ctf0 ctf0Var, byte b) {
        this.f34922a = b;
        this.b = wyuVar;
        this.c = hrcVar;
        this.d = ctf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34922a;
        int i = R.drawable.j_bet_game_info_light_theme_bg;
        ctf0 ctf0Var = this.d;
        hrc hrcVar = this.c;
        wyu wyuVar = this.b;
        switch (b) {
            case 0:
                boolean zA = h97.A(wyuVar, uaq0.f35345a);
                String strValueOf = String.valueOf(hrcVar.a());
                sm5 sm5Var = new sm5(0L, -1L, "", "", false, false);
                ax6 ax6Var = new ax6(androidx.compose.runtime.e.e(new a8q0("", 0L, 6)), -1.0d, -1.0d, -1.0d);
                String strA = ctf0Var.b.a(R.string.toto_jackpot_tax_info, Arrays.copyOf(new Object[0], 0));
                String strN = !zA ? ohs0.n(ujn.h, "/static/img/android/BottomBet/backgrounds/jackpot/en/01-d.png") : ohs0.n(ujn.h, "/static/img/android/BottomBet/backgrounds/jackpot/en/01-l.png");
                if (!zA) {
                    i = R.drawable.j_bet_game_info_dark_them_bg;
                }
                return new s1y(new bz6(strN, i, ctf0Var.b.a(R.string.toto_jackpot_title, Arrays.copyOf(new Object[0], 0))), strValueOf, sm5Var, ax6Var, strA, false, false);
            case 1:
                boolean zA2 = h97.A(wyuVar, uaq0.f35345a);
                String strN2 = !zA2 ? ohs0.n(ujn.h, "/static/img/android/BottomBet/backgrounds/jackpot/en/01-d.png") : ohs0.n(ujn.h, "/static/img/android/BottomBet/backgrounds/jackpot/en/01-l.png");
                int i2 = !zA2 ? R.drawable.j_bet_game_info_dark_them_bg : R.drawable.j_bet_game_info_light_theme_bg;
                String strValueOf2 = String.valueOf(hrcVar.a());
                lsm0 lsm0Var = ctf0Var.b;
                lsm0 lsm0Var2 = ctf0Var.b;
                return new x3y(new zy6(i2, strN2, strValueOf2, lsm0Var.a(R.string.toto_jackpot_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new tm5(0L, -1L, "", "", false), new xw6(androidx.compose.runtime.e.e(new a8q0("", 0L, 6)), new dpm0(-1.0d, 0.0d, -1.0d, -1.0d, "", true)), lsm0Var2.a(R.string.toto_jackpot_tax_info, Arrays.copyOf(new Object[0], 0)), false);
            default:
                boolean zA3 = h97.A(wyuVar, uaq0.f35345a);
                String strN3 = !zA3 ? ohs0.n(ujn.h, "/static/img/android/BottomBet/backgrounds/jackpot/en/01-d.png") : ohs0.n(ujn.h, "/static/img/android/BottomBet/backgrounds/jackpot/en/01-l.png");
                int i3 = !zA3 ? R.drawable.j_bet_game_info_dark_them_bg : R.drawable.j_bet_game_info_light_theme_bg;
                String strValueOf3 = String.valueOf(hrcVar.a());
                lsm0 lsm0Var3 = ctf0Var.b;
                lsm0 lsm0Var4 = ctf0Var.b;
                return new zzx(new az6(i3, strN3, strValueOf3, lsm0Var3.a(R.string.toto_jackpot_title, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new um5(0L, -1L, "", "", false), new yw6(androidx.compose.runtime.e.e(new a8q0("", 0L, 6)), new epm0(-1.0d, 0.0d, -1.0d, -1.0d, "", true)), lsm0Var4.a(R.string.toto_jackpot_tax_info, Arrays.copyOf(new Object[0], 0)), false);
        }
    }
}
