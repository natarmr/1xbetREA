package a;

import android.gov.nist.core.Separators;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public enum gtc0 {
    DEFAULT(0, 0, new m0x(R.drawable.ic_glyph_bonus_info, null, 6), 0),
    BONUS_GAMES(1, R.string.promo_bonus_games_title, new m0x(R.drawable.ic_glyph_bonus_games, null, 6), 0),
    USER_PROMO_CODES(2, R.string.your_promo_codes, new m0x(R.drawable.ic_glyph_promocode_active, null, 6), 0),
    CHAMPIONS_CLUB(12, R.string.one_x_club, new m0x(R.drawable.ic_glyph_champions_club, null, 6), R.string.promo_menu_champions_club_subtitle),
    PROMO_CODE_CHECK(3, R.string.check_promocode_title, new m0x(R.drawable.ic_glyph_view, null, 6), R.string.promo_menu_check_promocode_subtitle),
    CASHBACK(4, R.string.cashback, new m0x(R.drawable.ic_glyph_cashback, null, 6), R.string.promo_menu_cashback_subtitle),
    VIP_CASHBACK(5, R.string.vip_cashback_title_text, new m0x(R.drawable.ic_glyph_vip_cashback, null, 6), R.string.promo_menu_vip_cashback_subtitle),
    SPORT_CASHBACK(6, R.string.sport_cashback, new m0x(R.drawable.ic_glyph_sport_cashback, null, 6), 0),
    SPORT_CASHBACK_CP(6, R.string.sport_cashback, new m0x(R.drawable.ic_glyph_cashback, null, 6), 0),
    PROMO_PARTICIPATION(7, R.string.promotions_participation, new m0x(R.drawable.ic_glyph_money, null, 6), R.string.promo_menu_participation_subtitle),
    BONUSES(8, R.string.bonuses, new m0x(R.drawable.ic_glyph_gift, null, 6), R.string.promo_menu_bonuses_subtitle),
    REFERRAL_PROGRAM(9, R.string.bring_friend, new m0x(R.drawable.ic_glyph_profile_add, null, 6), R.string.promo_menu_referral_subtitle),
    REGISTRATION_BONUS_PARTICIPATION(11, R.string.registration_bonus_participation_menu_title, new m0x(R.drawable.ic_glyph_bonus_alt, null, 6), 0);

    public static final fl70 e = new fl70();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f11874a;
    public final int b;
    public final m0x c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    gtc0(int i, int i2, m0x m0xVar, int i3) {
        this.f11874a = i;
        this.b = i2;
        this.c = m0xVar;
        this.d = i3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0020. Please report as an issue. */
    public final n0x a(zuc0 zuc0Var) {
        String str;
        String strA;
        String str2;
        String strL;
        zuc0Var.getClass();
        String str3 = zuc0Var.f45004a;
        if (zuc0Var == zuc0.PLAIN_LIST || this == CHAMPIONS_CLUB) {
            return null;
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        switch (ordinal()) {
            case 2:
                str = "/img/img_promocode.webp";
                strL = kng0.l("static/img/android/promo_store/styles/", str3, str);
                break;
            case 3:
            case 8:
            default:
                strA = j0x.A(zuc0Var);
                str2 = "/img/additional_other";
                strL = b1j.k("static/img/android/promo_store/styles/", str3, str2, strA, ".webp");
                break;
            case 4:
                strA = j0x.A(zuc0Var);
                str2 = "/img/additional_check_promocode";
                strL = b1j.k("static/img/android/promo_store/styles/", str3, str2, strA, ".webp");
                break;
            case 5:
                strA = j0x.A(zuc0Var);
                str2 = "/img/additional_cashback";
                strL = b1j.k("static/img/android/promo_store/styles/", str3, str2, strA, ".webp");
                break;
            case 6:
                strA = j0x.A(zuc0Var);
                str2 = "/img/additional_vip_cashback";
                strL = b1j.k("static/img/android/promo_store/styles/", str3, str2, strA, ".webp");
                break;
            case 7:
                strA = j0x.A(zuc0Var);
                str2 = "/img/additional_cashback_sport";
                strL = b1j.k("static/img/android/promo_store/styles/", str3, str2, strA, ".webp");
                break;
            case 9:
                strA = j0x.A(zuc0Var);
                str2 = "/img/additional_sale";
                strL = b1j.k("static/img/android/promo_store/styles/", str3, str2, strA, ".webp");
                break;
            case 10:
                strA = j0x.A(zuc0Var);
                str2 = "/img/additional_bonuses";
                strL = b1j.k("static/img/android/promo_store/styles/", str3, str2, strA, ".webp");
                break;
            case 11:
                str = "/img/img_add_friend.webp";
                strL = kng0.l("static/img/android/promo_store/styles/", str3, str);
                break;
        }
        if (strL.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
            sb.setLength(0);
            sb.append(strL);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strL, '/'));
        }
        return new n0x(sb.toString());
    }

    public final n0x b(zuc0 zuc0Var) {
        zuc0Var.getClass();
        if (this != CHAMPIONS_CLUB) {
            return a(zuc0Var);
        }
        if (zuc0Var == zuc0.PLAIN_LIST) {
            return null;
        }
        return new n0x(thb.t());
    }
}
