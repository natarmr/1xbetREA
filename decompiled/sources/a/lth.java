package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class lth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20629a;
    public final LinearLayout b;
    public final TextView c;

    public /* synthetic */ lth(LinearLayout linearLayout, TextView textView, byte b) {
        this.f20629a = b;
        this.b = linearLayout;
        this.c = textView;
    }

    public static lth a(View view) {
        TextView textView = (TextView) yum0.f(view, R.id.tvScore);
        if (textView != null) {
            return new lth((LinearLayout) view, textView, (byte) 1);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvScore)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f20629a;
        return this.b;
    }
}
