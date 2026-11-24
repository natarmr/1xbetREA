package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class sth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f32772a;
    public final TextView b;

    public sth(TextView textView, TextView textView2) {
        this.f32772a = textView;
        this.b = textView2;
    }

    public static sth a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.cybergame_statistic_header_title_item, viewGroup, false);
        if (viewInflate != null) {
            TextView textView = (TextView) viewInflate;
            return new sth(textView, textView);
        }
        hny.u("rootView");
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32772a;
    }
}
