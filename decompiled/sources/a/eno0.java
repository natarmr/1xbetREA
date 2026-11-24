package a;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f8105a = q3d.j(HistoryTypeModel.EVENTS, HistoryTypeModel.UNSETTLED, HistoryTypeModel.SALE, HistoryTypeModel.TOTO, HistoryTypeModel.JACKPOT, HistoryTypeModel.AUTO, HistoryTypeModel.LOTTO);

    public static final wkm a(int i, boolean z, boolean z2) {
        long secondary;
        if (z2) {
            pz40 pz40Var = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getPrimary();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getSecondary();
        }
        return new wkm(0, i, z, ra50.f30118a, secondary);
    }

    public static final j8w b(HistoryTypeModel historyTypeModel, ctf0 ctf0Var, boolean z) {
        int i = dno0.f6380a[historyTypeModel.ordinal()];
        if (i == 1) {
            return new j8w(new s4i(ctf0Var.b.a(R.string.bets, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_history, null, false, 12), HistoryTypeModel.EVENTS);
        }
        if (i == 2 && !z) {
            String upperCase = ctf0Var.b.a(R.string.toto_name, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return new j8w(new s4i(upperCase, R.drawable.ic_glyph_toto, null, false, 12), HistoryTypeModel.TOTO);
        }
        if (i == 3 && !z) {
            return new j8w(new s4i(ctf0Var.b.a(R.string.applications, Arrays.copyOf(new Object[0], 0)), R.drawable.glyph_application, null, false, 12), HistoryTypeModel.AUTO);
        }
        if (i == 4) {
            return new j8w(new s4i(ctf0Var.b.a(R.string.received, Arrays.copyOf(new Object[0], 0)), R.drawable.glyph_accepted_history, null, false, 12), HistoryTypeModel.UNSETTLED);
        }
        if (i == 5 && !z) {
            return new j8w(new s4i(ctf0Var.b.a(R.string.lotto_title, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_loto, null, false, 12), HistoryTypeModel.LOTTO);
        }
        if (i == 6 && !z) {
            return new j8w(new s4i(ctf0Var.b.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_sell, null, false, 12), HistoryTypeModel.SALE);
        }
        if (i == 7) {
            return new j8w(new s4i(ctf0Var.b.a(R.string.promo_jackpot, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_nav_toto, null, false, 12), HistoryTypeModel.JACKPOT);
        }
        return null;
    }
}
