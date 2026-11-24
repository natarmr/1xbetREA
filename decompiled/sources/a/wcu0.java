package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public final class wcu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38942a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;

    public /* synthetic */ wcu0(LinearLayout linearLayout, TextView textView, TextView textView2, byte b) {
        this.f38942a = b;
        this.b = linearLayout;
        this.c = textView;
        this.d = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        switch (this.f38942a) {
            case 0:
                break;
        }
        return this.b;
    }
}
