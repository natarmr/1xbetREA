package a;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kto implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18876a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ kto(byte b, String str, Function1 function1) {
        this.f18876a = b;
        this.b = str;
        this.c = function1;
    }

    @Override // a.k4r
    public final void i(Bundle bundle, String str) {
        byte b = this.f18876a;
        Function1 function1 = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                str.getClass();
                if (str.equals(str2)) {
                    function1.invoke(bundle);
                    break;
                }
                break;
            case 1:
                str.getClass();
                if (str.equals(str2)) {
                    function1.invoke((Parcelable) ahy.f0(bundle, str2));
                    break;
                }
                break;
            case 2:
                str.getClass();
                if (str.equals(str2)) {
                    function1.invoke((Serializable) ahy.f0(bundle, str2));
                    break;
                }
                break;
            default:
                str.getClass();
                if (str.equals("GamesActionsFragmentResultModel.UM_RESULT_KEY".concat(str2))) {
                    GamesActionsFragmentResultModel gamesActionsFragmentResultModel = (GamesActionsFragmentResultModel) (Build.VERSION.SDK_INT <= 33 ? bundle.getParcelable("GamesActionsFragmentResultModel.UM_RESULT_BUNDLE_KEY") : (Parcelable) bundle.getParcelable("GamesActionsFragmentResultModel.UM_RESULT_BUNDLE_KEY", GamesActionsFragmentResultModel.class));
                    if (gamesActionsFragmentResultModel != null) {
                        function1.invoke(gamesActionsFragmentResultModel);
                    }
                    break;
                }
                break;
        }
    }
}
