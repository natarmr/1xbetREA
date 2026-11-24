package a;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bb1 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2285a;
    public final /* synthetic */ cb1 b;

    public /* synthetic */ bb1(cb1 cb1Var, byte b) {
        this.f2285a = b;
        this.b = cb1Var;
    }

    @Override // a.k4r
    public final void i(Bundle bundle, String str) {
        Serializable serializable;
        Serializable serializable2;
        Serializable serializable3;
        Serializable serializable4;
        byte b = this.f2285a;
        sa1 sa1Var = sa1.f31871a;
        cb1 cb1Var = this.b;
        switch (b) {
            case 0:
                rek0 rek0Var = cb1.e2;
                str.getClass();
                cb1Var.H0().x(ra1.f30111a);
                break;
            case 1:
                rek0 rek0Var2 = cb1.e2;
                str.getClass();
                if (str.equals("CHANGE_BALANCE_REQUEST_KEY")) {
                    if (bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                        } else {
                            Serializable serializable5 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                            if (!(serializable5 instanceof ql5)) {
                                serializable5 = null;
                            }
                            serializable = (ql5) serializable5;
                        }
                        ql5 ql5Var = serializable instanceof ql5 ? (ql5) serializable : null;
                        if (ql5Var != null) {
                            cb1Var.H0().x(new la1(ql5Var));
                        } else {
                            cb1Var.H0().x(sa1Var);
                        }
                    } else if (!bundle.containsKey("RESULT_ON_PAYMENT_OPENED_KEY") && !bundle.containsKey("RESULT_ON_ADD_ACCOUNT_OPENED_KEY") && bundle.containsKey("RESULT_ON_DISMISS_KEY")) {
                        cb1Var.H0().x(sa1Var);
                    }
                    cb1Var.C().g("CHANGE_BALANCE_REQUEST_KEY");
                    break;
                }
                break;
            case 2:
                rek0 rek0Var3 = cb1.e2;
                str.getClass();
                if (str.equals("SELECT_BALANCE_REQUEST_KEY")) {
                    if (bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable2 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                        } else {
                            Serializable serializable6 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                            if (!(serializable6 instanceof ql5)) {
                                serializable6 = null;
                            }
                            serializable2 = (ql5) serializable6;
                        }
                        ql5 ql5Var2 = serializable2 instanceof ql5 ? (ql5) serializable2 : null;
                        if (ql5Var2 != null) {
                            cb1Var.H0().x(new ma1(ql5Var2));
                        } else {
                            cb1Var.H0().x(sa1Var);
                        }
                    } else if (!bundle.containsKey("RESULT_ON_PAYMENT_OPENED_KEY") && !bundle.containsKey("RESULT_ON_ADD_ACCOUNT_OPENED_KEY") && bundle.containsKey("RESULT_ON_DISMISS_KEY")) {
                        cb1Var.H0().x(sa1Var);
                    }
                    cb1Var.C().g("SELECT_BALANCE_REQUEST_KEY");
                    break;
                }
                break;
            case 3:
                rek0 rek0Var4 = cb1.e2;
                str.getClass();
                if (str.equals("SELECT_GAME_MODE_REQUEST_KEY")) {
                    if (bundle.containsKey("RESULT_GAME_MODE_LISTENER_KEY")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable3 = bundle.getSerializable("RESULT_GAME_MODE_LISTENER_KEY", av0.class);
                        } else {
                            Serializable serializable7 = bundle.getSerializable("RESULT_GAME_MODE_LISTENER_KEY");
                            if (!(serializable7 instanceof av0)) {
                                serializable7 = null;
                            }
                            serializable3 = (av0) serializable7;
                        }
                        av0 av0Var = serializable3 instanceof av0 ? (av0) serializable3 : null;
                        if (av0Var != null) {
                            cb1Var.H0().x(new xa1(av0Var));
                        } else {
                            cb1Var.H0().x(sa1Var);
                        }
                    } else {
                        cb1Var.H0().x(sa1Var);
                    }
                    cb1Var.C().g("SELECT_GAME_MODE_REQUEST_KEY");
                    break;
                }
                break;
            case 4:
                rek0 rek0Var5 = cb1.e2;
                str.getClass();
                if (str.equals("GAME_NICKNAME_REQUEST_KEY")) {
                    if (bundle.containsKey("RESULT_GAME_NICKNAME_LISTENER_KEY")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable4 = bundle.getSerializable("RESULT_GAME_NICKNAME_LISTENER_KEY", String.class);
                        } else {
                            Serializable serializable8 = bundle.getSerializable("RESULT_GAME_NICKNAME_LISTENER_KEY");
                            if (!(serializable8 instanceof String)) {
                                serializable8 = null;
                            }
                            serializable4 = (String) serializable8;
                        }
                        String str2 = serializable4 instanceof String ? (String) serializable4 : null;
                        if (str2 != null) {
                            cb1Var.H0().x(new wa1(str2));
                        } else {
                            cb1Var.H0().x(sa1Var);
                        }
                    } else {
                        cb1Var.H0().x(sa1Var);
                    }
                    cb1Var.C().g("GAME_NICKNAME_REQUEST_KEY");
                    break;
                }
                break;
            default:
                rek0 rek0Var6 = cb1.e2;
                str.getClass();
                if (str.equals("GAME_CURRENCY_CONVERSATION_REQUEST_KEY")) {
                    if (bundle.containsKey("GAME_CURRENCY_CONVERSATION_RESULT_KEY_CONTINUE")) {
                        cb1Var.H0().x(new qa1(bundle.getBoolean("GAME_CURRENCY_CONVERSATION_RESULT_KEY_CONTINUE"), true));
                    } else if (bundle.containsKey("GAME_CURRENCY_CONVERSATION_RESULT_KEY_EXIT")) {
                        cb1Var.H0().x(new qa1(bundle.getBoolean("GAME_CURRENCY_CONVERSATION_RESULT_KEY_EXIT"), false));
                    }
                    break;
                }
                break;
        }
    }
}
