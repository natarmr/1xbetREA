package a;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.favorites.impl.presentation.screen.category_image_header.models.CategoryImageHeaderTab;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wg2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39091a;
    public final /* synthetic */ vzg0 b;

    public /* synthetic */ wg2(vzg0 vzg0Var, byte b) {
        this.f39091a = b;
        this.b = vzg0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39091a;
        vzg0 vzg0Var = this.b;
        switch (b) {
            case 0:
                return new ug2(null, true, fat.f9225a, false, false, true, true, xun.f41520a, (List) vzg0Var.a("PENDING_DELETE_GAME_GROUPS"), "", false);
            case 1:
                return new nl2(null, true, false, dds0.f5911a, false, false, true, (s4i0) vzg0Var.a("SELECTED_TRACK_COEF_KEY"), (s4i0) vzg0Var.a("REMOVING_TRACK_COEF_KEY"));
            case 2:
                CategoryImageHeaderTab categoryImageHeaderTab = (CategoryImageHeaderTab) vzg0Var.a("CURRENT_TAB_KEY");
                if (categoryImageHeaderTab == null) {
                    categoryImageHeaderTab = CategoryImageHeaderTab.f46638a;
                }
                CategoryImageHeaderTab categoryImageHeaderTab2 = categoryImageHeaderTab;
                ex70 ex70Var = new ex70(new zpv(false, false));
                Object objA = vzg0Var.a("SEARCH_FIELD_STATE_KEY");
                Boolean bool = Boolean.TRUE;
                boolean zD = Intrinsics.d(objA, bool);
                String str = (String) vzg0Var.a("SEARCH_QUERY_KEY");
                return new p5b(null, categoryImageHeaderTab2, hm5.f13289a, ex70Var, false, zD, str == null ? "" : str, Intrinsics.d(vzg0Var.a("SEARCH_FIELD_STATE_KEY"), bool));
            case 3:
                ClassicFavoriteTab classicFavoriteTab = (ClassicFavoriteTab) vzg0Var.a("CURRENT_TAB_KEY");
                if (classicFavoriteTab == null) {
                    classicFavoriteTab = ClassicFavoriteTab.f46639a;
                }
                ClassicFavoriteTab classicFavoriteTab2 = classicFavoriteTab;
                zpv zpvVar = new zpv(false, false);
                String str2 = (String) vzg0Var.a("SEARCH_QUERY_KEY");
                return new onc(null, classicFavoriteTab2, jmc.f16757a, 0, zpvVar, false, false, str2 == null ? "" : str2, true);
            case 4:
                Long l = (Long) vzg0Var.a("KEY_CURRENT_TAB");
                return new dwh(false, true, false, false, l != null ? l.longValue() : 0L, new mwh(b9a0.g, iun.f15405a));
            case 5:
                Long l2 = (Long) vzg0Var.a("SELECTED_CHIP");
                return new oxh(true, false, false, new zwh(0, iun.f15405a), l2 != null ? l2.longValue() : 0L);
            case 6:
                iun iunVar = iun.f15405a;
                Integer num = (Integer) vzg0Var.a("INSTRUMENT_ID_KEY");
                Integer num2 = (Integer) vzg0Var.a("SELECTED_INDEX_KEY");
                int iIntValue = num2 != null ? num2.intValue() : 11;
                wbq wbqVar = (wbq) vzg0Var.a("SELECTED_TYPE_KEY");
                if (wbqVar == null) {
                    wbqVar = wbq.c;
                }
                return new oaq(iunVar, false, num, null, null, null, null, true, false, iIntValue, wbqVar, false);
            case 7:
                Integer num3 = (Integer) vzg0Var.a("KEY_MAIN_TAB");
                int iIntValue2 = num3 != null ? num3.intValue() : 0;
                Integer num4 = (Integer) vzg0Var.a("KEY_SUB_TAB_LEFT");
                int iIntValue3 = num4 != null ? num4.intValue() : 0;
                Integer num5 = (Integer) vzg0Var.a("KEY_SUB_TAB_RIGHT");
                return new n3a0(null, iIntValue2, iIntValue3, num5 != null ? num5.intValue() : 0, true, false);
            case 8:
                String str3 = (String) vzg0Var.a("SAVE_STATE_INPUT_PROMO_KEY");
                return new jac0(false, false, false, str3 == null ? "" : str3, null);
            case 9:
                String str4 = (String) vzg0Var.a("EXTRA_CATEGORY_NAME");
                return new wpc0(str4 == null ? "" : str4, iun.f15405a, true, false, false);
            case 10:
                Long l3 = (Long) vzg0Var.a("SELECTED_CHIP");
                return new yrd0(true, false, null, l3 != null ? l3.longValue() : 0L);
            default:
                Long l4 = (Long) vzg0Var.a("CHECKED_CHIPS_ID_KEY");
                return new qkp0(0L, true, false, null, l4 != null ? l4.longValue() : 0L);
        }
    }
}
