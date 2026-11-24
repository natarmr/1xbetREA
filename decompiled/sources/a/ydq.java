package a;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ydq implements ee60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42451a;
    public final /* synthetic */ sik b;

    public /* synthetic */ ydq(sik sikVar, byte b) {
        this.f42451a = b;
        this.b = sikVar;
    }

    @Override // a.ee60
    public final void a(Object obj) {
        byte b = this.f42451a;
        sik sikVar = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                zdq zdqVar = (zdq) sikVar;
                Handler handler = zdqVar.Y1;
                mx2 mx2Var = zdqVar.Z1;
                handler.removeCallbacks(mx2Var);
                int iIntValue = num.intValue();
                if (zdqVar.d2 != null) {
                    int i = zdqVar.a2.A;
                    Context contextD = zdqVar.D();
                    Drawable drawable = null;
                    if (contextD == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        int i2 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i == 0 && iIntValue == 1) {
                            drawable = contextD.getDrawable(i2);
                        } else {
                            if (i == 1 && iIntValue == 2) {
                                i2 = R.drawable.fingerprint_dialog_error;
                            } else if ((i == 2 && iIntValue == 1) || (i == 1 && iIntValue == 3)) {
                            }
                            drawable = contextD.getDrawable(i2);
                        }
                    }
                    if (drawable != null) {
                        zdqVar.d2.setImageDrawable(drawable);
                        if ((i != 0 || iIntValue != 1) && (((i == 1 && iIntValue == 2) || (i == 2 && iIntValue == 1)) && (drawable instanceof AnimatedVectorDrawable))) {
                            ((AnimatedVectorDrawable) drawable).start();
                        }
                        zdqVar.a2.A = iIntValue;
                    }
                }
                int iIntValue2 = num.intValue();
                TextView textView = zdqVar.e2;
                if (textView != null) {
                    textView.setTextColor(iIntValue2 == 2 ? zdqVar.b2 : zdqVar.c2);
                }
                handler.postDelayed(mx2Var, 2000L);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                zdq zdqVar2 = (zdq) sikVar;
                Handler handler2 = zdqVar2.Y1;
                mx2 mx2Var2 = zdqVar2.Z1;
                handler2.removeCallbacks(mx2Var2);
                TextView textView2 = zdqVar2.e2;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                handler2.postDelayed(mx2Var2, 2000L);
                break;
            default:
                if (((clz) obj) != null && sikVar.O1) {
                    View viewQ0 = sikVar.q0();
                    if (viewQ0.getParent() != null) {
                        jf4.n("DialogFragment can not be attached to a container view");
                    } else if (sikVar.S1 != null) {
                        if (androidx.fragment.app.e.V(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + sikVar.S1);
                        }
                        sikVar.S1.setContentView(viewQ0);
                    }
                    break;
                }
                break;
        }
    }
}
