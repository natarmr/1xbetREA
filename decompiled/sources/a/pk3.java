package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.app_update.impl.presentation.update_screen.views.content.dropdowncards.model.DropDownCard;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pk3 {
    public static final List a(um3 um3Var, ctf0 ctf0Var) {
        int i;
        if (!um3Var.b.f34174a) {
            return iun.f15405a;
        }
        String[] strArrG = ctf0Var.g(R.array.message_list);
        lsm0 lsm0Var = ctf0Var.b;
        for (String str : strArrG) {
            if (str.length() <= 0) {
                return iun.f15405a;
            }
        }
        ArrayList arrayList = new ArrayList(strArrG.length);
        int length = strArrG.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str2 = strArrG[i2];
            int i4 = i3 + 1;
            if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_1, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_quick_bet_inactive;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_2, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_authenticator;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_3, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_navigation;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_4, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_gift;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_5, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_balloons;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_6, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_bonus;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_7, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_coupon_alt;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_8, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_multievent;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_9, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_fast_bet;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_10, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_stream;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_11, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_placing_bet;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_12, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_money;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_13, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_withdraw_account;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_14, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_replenish_account;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_15, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_financial_security;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_16, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_language;
            } else if (Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_17, Arrays.copyOf(new Object[0], 0)))) {
                i = R.drawable.ic_glyph_support;
            } else {
                i = Intrinsics.d(str2, lsm0Var.a(R.string.app_update_universal_message_18, Arrays.copyOf(new Object[0], 0))) ? R.drawable.ic_glyph_results : R.drawable.ic_drop_down_card;
            }
            arrayList.add((i3 == 0 || i3 % 2 == 0) ? new DropDownCard.RightCard(str2, i) : new DropDownCard.LeftCard(str2, i));
            i2++;
            i3 = i4;
        }
        return arrayList;
    }
}
