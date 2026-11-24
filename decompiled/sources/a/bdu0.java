package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class bdu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2418a;
    public final FrameLayout b;
    public final TextView c;

    public /* synthetic */ bdu0(FrameLayout frameLayout, TextView textView, byte b) {
        this.f2418a = b;
        this.b = frameLayout;
        this.c = textView;
    }

    public static bdu0 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.vh_title_column_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.title);
        if (textView != null) {
            return new bdu0((FrameLayout) viewInflate, textView, (byte) 5);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.title)));
        return null;
    }

    public static bdu0 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.vh_total_row_header, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.footerTitle);
        if (textView != null) {
            return new bdu0((FrameLayout) viewInflate, textView, (byte) 6);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.footerTitle)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        switch (this.f2418a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        return this.b;
    }
}
