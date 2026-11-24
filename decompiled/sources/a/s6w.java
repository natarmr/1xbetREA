package a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s6w implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31724a;
    public final /* synthetic */ cp b;

    public /* synthetic */ s6w(cp cpVar, byte b) {
        this.f31724a = b;
        this.b = cpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f31724a;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                ((j1w) cpVar.u).b.performClick();
                break;
            default:
                vwx vwxVar = (vwx) cpVar.u;
                ViewParent parent = vwxVar.f38175a.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    View viewFindFocus = viewGroup.findFocus();
                    if (!Intrinsics.d(viewFindFocus, view) && viewFindFocus != null) {
                        viewFindFocus.setFocusable(false);
                        viewFindFocus.setFocusableInTouchMode(false);
                    }
                    TextView textView = vwxVar.b.getTextView();
                    if (textView != null) {
                        textView.setFocusable(true);
                        textView.setFocusableInTouchMode(true);
                    }
                    vwxVar.b.requestFocus();
                    break;
                }
                break;
        }
    }
}
