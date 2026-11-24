package a;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j71 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16017a;
    public final /* synthetic */ m71 b;

    public /* synthetic */ j71(m71 m71Var, byte b) {
        this.f16017a = b;
        this.b = m71Var;
    }

    @Override // a.k4r
    public final void i(Bundle bundle, String str) {
        Serializable serializable;
        Serializable serializable2;
        Serializable serializable3;
        Serializable serializable4;
        byte b = this.f16017a;
        q61 q61Var = q61.f28178a;
        m71 m71Var = this.b;
        switch (b) {
            case 0:
                rek0 rek0Var = m71.e2;
                str.getClass();
                if (str.equals("GAME_NICKNAME_REQUEST_KEY")) {
                    if (bundle.containsKey("RESULT_GAME_NICKNAME_LISTENER_KEY")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle.getSerializable("RESULT_GAME_NICKNAME_LISTENER_KEY", String.class);
                        } else {
                            Serializable serializable5 = bundle.getSerializable("RESULT_GAME_NICKNAME_LISTENER_KEY");
                            if (!(serializable5 instanceof String)) {
                                serializable5 = null;
                            }
                            serializable = (String) serializable5;
                        }
                        String str2 = serializable instanceof String ? (String) serializable : null;
                        if (str2 != null) {
                            m71Var.J0().x(new g71(str2));
                        } else {
                            m71Var.J0().x(q61Var);
                        }
                    } else {
                        m71Var.J0().x(q61Var);
                    }
                    m71Var.C().g("GAME_NICKNAME_REQUEST_KEY");
                    break;
                }
                break;
            case 1:
                rek0 rek0Var2 = m71.e2;
                str.getClass();
                if (str.equals("PLAY_FOR_REAL_DIALOG_KEY") && bundle.containsKey("RESULT_PLAY_FOR_REAL_LISTENER_KEY")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable2 = bundle.getSerializable("RESULT_PLAY_FOR_REAL_LISTENER_KEY", xw90.class);
                    } else {
                        Serializable serializable6 = bundle.getSerializable("RESULT_PLAY_FOR_REAL_LISTENER_KEY");
                        if (!(serializable6 instanceof xw90)) {
                            serializable6 = null;
                        }
                        serializable2 = (xw90) serializable6;
                    }
                    xw90 xw90Var = serializable2 instanceof xw90 ? (xw90) serializable2 : null;
                    if (xw90Var != null) {
                        m71Var.J0().x(new b71(xw90Var));
                    } else {
                        m71Var.J0().x(new b71(xw90.e));
                    }
                    m71Var.C().g("PLAY_FOR_REAL_DIALOG_KEY");
                }
                break;
            case 2:
                rek0 rek0Var3 = m71.e2;
                str.getClass();
                m71Var.J0().x(t61.f33393a);
                break;
            case 3:
                rek0 rek0Var4 = m71.e2;
                str.getClass();
                if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable3 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                    } else {
                        Serializable serializable7 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                        if (!(serializable7 instanceof ql5)) {
                            serializable7 = null;
                        }
                        serializable3 = (ql5) serializable7;
                    }
                    ql5 ql5Var = serializable3 instanceof ql5 ? (ql5) serializable3 : null;
                    if (ql5Var == null) {
                        m71Var.J0().x(q61Var);
                    } else {
                        m71Var.J0().x(new j61(ql5Var));
                    }
                }
                break;
            case 4:
                rek0 rek0Var5 = m71.e2;
                str.getClass();
                if (str.equals("GAME_CURRENCY_CONVERSATION_REQUEST_KEY")) {
                    if (bundle.containsKey("GAME_CURRENCY_CONVERSATION_RESULT_KEY_CONTINUE")) {
                        m71Var.J0().x(new p61(bundle.getBoolean("GAME_CURRENCY_CONVERSATION_RESULT_KEY_CONTINUE"), true));
                    } else if (bundle.containsKey("GAME_CURRENCY_CONVERSATION_RESULT_KEY_EXIT")) {
                        m71Var.J0().x(new p61(bundle.getBoolean("GAME_CURRENCY_CONVERSATION_RESULT_KEY_EXIT"), false));
                    }
                    break;
                }
                break;
            default:
                rek0 rek0Var6 = m71.e2;
                str.getClass();
                if (str.equals("CHANGE_BALANCE_REQUEST_KEY") && bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable4 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                    } else {
                        Serializable serializable8 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                        if (!(serializable8 instanceof ql5)) {
                            serializable8 = null;
                        }
                        serializable4 = (ql5) serializable8;
                    }
                    ql5 ql5Var2 = serializable4 instanceof ql5 ? (ql5) serializable4 : null;
                    if (ql5Var2 == null) {
                        m71Var.J0().x(q61Var);
                    } else {
                        m71Var.J0().x(new i61(ql5Var2));
                    }
                }
                break;
        }
    }
}
