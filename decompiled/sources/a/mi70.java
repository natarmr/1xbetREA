package a;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class mi70 implements kotlin.coroutines.f, ylx {
    public static void c(i7a i7aVar, String str, androidx.fragment.app.e eVar) {
        i7aVar.getClass();
        if (eVar.J("PictureCaptchaDialogFragment") == null) {
            et90 et90Var = new et90();
            iiy[] iiyVarArr = et90.k2;
            et90Var.g2.u(et90Var, iiyVarArr[0], i7aVar);
            et90Var.h2.x(et90Var, iiyVarArr[1], str);
            et90Var.E0(false);
            et90Var.H0(eVar, "PictureCaptchaDialogFragment");
        }
    }

    public void a(Rect rect, View view) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public void b(rmb0 rmb0Var, int i, int i2) {
    }
}
