package a;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l1w implements k4r, zon0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19279a;
    public final /* synthetic */ s1w b;

    public /* synthetic */ l1w(s1w s1wVar, byte b) {
        this.f19279a = b;
        this.b = s1wVar;
    }

    @Override // a.zon0
    public void b() {
        bst bstVar = s1w.d2;
        this.b.M0().G(false);
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        String string;
        byte b = this.f19279a;
        s1w s1wVar = this.b;
        switch (b) {
            case 0:
                bst bstVar = s1w.d2;
                str.getClass();
                if (bundle.containsKey("BET_INFO_FRAGMENT_REQUEST_KEY") && (string = bundle.getString("BET_INFO_FRAGMENT_REQUEST_KEY")) != null) {
                    td9 td9Var = s1wVar.M0().J;
                    td9Var.getClass();
                    td9Var.h(new ka6(string, (byte) 7));
                    td9Var.f33756a = false;
                    td9Var.e = new bp00(false);
                    td9Var.h(new umu((byte) 27));
                    break;
                }
                break;
            default:
                bst bstVar2 = s1w.d2;
                str.getClass();
                if (str.equals("REQUEST_HIDE_BET_HISTORY_ITEM_KEY")) {
                    if (bundle.containsKey("RESULT_BET_HISTORY_ITEM_CLICK")) {
                        Serializable serializable = bundle.getSerializable("RESULT_BET_HISTORY_ITEM_CLICK");
                        s77 s77Var = serializable instanceof s77 ? (s77) serializable : null;
                        if (s77Var != null) {
                            s1wVar.M0().E(s77Var);
                        }
                    } else if (bundle.containsKey("RESULT_HIDE_HISTORY_CLICK")) {
                        naw nawVarM0 = s1wVar.M0();
                        nawVarM0.l0.b(f4w.h);
                        nawVarM0.Z0.f(new i9w(nawVarM0.Q0.f32117a.b.d));
                    }
                    break;
                }
                break;
        }
    }
}
