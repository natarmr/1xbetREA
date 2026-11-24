package a;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class td3 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static td3 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dtf0 f33746a;

    public static synchronized td3 a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return dtf0.f(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            td3 td3Var = new td3();
            c = td3Var;
            td3Var.f33746a = dtf0.c();
            dtf0 dtf0Var = c.f33746a;
            esg0 esg0Var = new esg0();
            esg0Var.f8326a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
            esg0Var.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            esg0Var.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
            esg0Var.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
            esg0Var.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            esg0Var.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (dtf0Var) {
                dtf0Var.e = esg0Var;
            }
        }
    }

    public final synchronized Drawable b(int i, Context context) {
        return this.f33746a.d(i, context);
    }
}
