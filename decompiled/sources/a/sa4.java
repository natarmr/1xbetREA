package a;

import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sa4 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31874a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ sa4(Function1 function1, byte b) {
        this.f31874a = b;
        this.b = function1;
    }

    public void a(kb00 kb00Var) {
        byte b = this.f31874a;
        Function1 function1 = this.b;
        switch (b) {
            case 4:
                kb00Var.getClass();
                function1.invoke(((jb00) kb00Var).f16214a);
                break;
            case 5:
                kb00Var.getClass();
                function1.invoke(((jb00) kb00Var).f16214a);
                break;
            case 6:
                kb00Var.getClass();
                function1.invoke(((jb00) kb00Var).f16214a);
                break;
            default:
                kb00Var.getClass();
                function1.invoke(((jb00) kb00Var).f16214a);
                break;
        }
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        Object serializable;
        String string;
        byte b = this.f31874a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                str.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle.getSerializable(str, rvs0.class);
                } else {
                    Object serializable2 = bundle.getSerializable(str);
                    if (!(serializable2 instanceof rvs0)) {
                        serializable2 = null;
                    }
                    serializable = (rvs0) serializable2;
                }
                rvs0 rvs0Var = serializable instanceof rvs0 ? (rvs0) serializable : null;
                if (rvs0Var != null) {
                    function1.invoke(new oa4(rvs0Var));
                }
                break;
            case 1:
                str.getClass();
                if (str.equals("KEY_LOGIN_QR_SCANNER_REQUEST") && bundle.containsKey("KEY_LOGIN_QR_SCANNER_BUNDLE") && (string = bundle.getString("KEY_LOGIN_QR_SCANNER_BUNDLE")) != null && string.length() != 0) {
                    function1.invoke(new ia4(string));
                }
                break;
            case 2:
                str.getClass();
                ConfirmationNewPlaceResultType confirmationNewPlaceResultType = Build.VERSION.SDK_INT >= 33 ? (ConfirmationNewPlaceResultType) bundle.getParcelable("KEY_BUNDLE_CONFIRMATION_NEW_PLACE", ConfirmationNewPlaceResultType.class) : (ConfirmationNewPlaceResultType) bundle.getParcelable("KEY_BUNDLE_CONFIRMATION_NEW_PLACE");
                if (confirmationNewPlaceResultType != null) {
                    function1.invoke(confirmationNewPlaceResultType);
                }
                break;
            case 3:
                str.getClass();
                if (str.hashCode() == -2111857280 && str.equals("KEY_SUB_GAME_FILTER_MODEL_REQUEST")) {
                    function1.invoke(Long.valueOf(bundle.getLong("KEY_SUB_GAME_FILTER_MODEL_REQUEST")));
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                str.getClass();
                if (str.equals("WildFreeBetFeature.FRAGMENT_RESULT_KEY") && bundle.containsKey("WildFreeBetFeature.GAME_SELECT_KEY")) {
                    function1.invoke(Long.valueOf(bundle.getLong("WildFreeBetFeature.GAME_SELECT_KEY")));
                }
                break;
            case 8:
                str.getClass();
                if (str.equals("REQUEST_ACTION_SELECTOR_DIALOG_KEY") && bundle.containsKey("CHANGE_FAVORITE_STATUS_KEY")) {
                    function1.invoke(new an60());
                }
                break;
        }
    }
}
