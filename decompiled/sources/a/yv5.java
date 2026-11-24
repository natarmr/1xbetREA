package a;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yv5 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43303a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yv5(Object obj, Object obj2, byte b) {
        this.f43303a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Dialog dialog;
        byte b = this.f43303a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                iw5 iw5Var = (iw5) obj2;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                iiy[] iiyVarArr = iw5.j2;
                if (iw5Var.N() && iw5Var.Q() && !iw5Var.e2) {
                    boolean z = true;
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        z = false;
                    }
                    bottomSheetBehavior.L = z;
                    if (iw5Var.a2 && iw5Var.N1 && z && !iw5Var.R() && (dialog = iw5Var.S1) != null) {
                        dialog.cancel();
                    }
                }
                break;
            case 1:
                x530 x530Var = (x530) obj2;
                cp cpVar = (cp) obj;
                if (motionEvent.getAction() == 0) {
                    x530Var.invoke(cpVar);
                }
                break;
            case 2:
                f630 f630Var = (f630) obj2;
                cp cpVar2 = (cp) obj;
                if (motionEvent.getAction() == 0) {
                    f630Var.invoke(cpVar2);
                }
                break;
            default:
                kcl0 kcl0Var = (kcl0) obj2;
                cp cpVar3 = (cp) obj;
                if (motionEvent.getAction() == 0) {
                    kcl0Var.invoke(cpVar3);
                }
                break;
        }
        return false;
    }
}
