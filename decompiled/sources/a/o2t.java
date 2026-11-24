package a;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o2t {
    public static void a(androidx.fragment.app.e eVar) {
        eVar.getClass();
        eVar.g("GamesActionsFragmentResultModel.UM_RESULT_KEY".concat(""));
    }

    public static final void b(androidx.fragment.app.e eVar, long j, String str) {
        str.getClass();
        c(eVar, new GamesActionsFragmentResultModel.OneXGamesGameUnderMaintenance(j), str);
    }

    public static final void c(androidx.fragment.app.e eVar, GamesActionsFragmentResultModel gamesActionsFragmentResultModel, String str) {
        eVar.getClass();
        str.getClass();
        String strConcat = "GamesActionsFragmentResultModel.UM_RESULT_KEY".concat(str);
        Bundle bundle = new Bundle();
        lv00.S("GamesActionsFragmentResultModel.UM_RESULT_BUNDLE_KEY", bundle, gamesActionsFragmentResultModel);
        eVar.t0(bundle, strConcat);
    }

    public static final void d(androidx.fragment.app.e eVar, clz clzVar, String str, Function1 function1) {
        eVar.getClass();
        clzVar.getClass();
        eVar.u0("GamesActionsFragmentResultModel.UM_RESULT_KEY".concat(str), clzVar, new kto((byte) 3, str, function1));
    }

    public static void e(androidx.fragment.app.e eVar, clz clzVar, Function1 function1, Function0 function0, bm60 bm60Var, int i) {
        if ((i & 4) != 0) {
            function1 = new vls((byte) 8);
        }
        Object sqsVar = bm60Var;
        if ((i & 16) != 0) {
            sqsVar = new sqs((byte) 23);
        }
        eVar.getClass();
        clzVar.getClass();
        d(eVar, clzVar, "", new f8m((byte) 27, sqsVar, (Object) function0, function1));
    }
}
