package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class d5e0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5502a;
    public final FrameLayout b;
    public final TextView c;

    public /* synthetic */ d5e0(FrameLayout frameLayout, TextView textView, byte b) {
        this.f5502a = b;
        this.b = frameLayout;
        this.c = textView;
    }

    public static d5e0 a(View view) {
        TextView textView = (TextView) yum0.f(view, R.id.titleTv);
        if (textView != null) {
            return new d5e0((FrameLayout) view, textView, (byte) 3);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.titleTv)));
        return null;
    }

    public static d5e0 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.toto_table_cell_view, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvContent);
        if (textView != null) {
            return new d5e0((FrameLayout) viewInflate, textView, (byte) 4);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvContent)));
        return null;
    }

    public static d5e0 c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.tournament_column_title_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.title);
        if (textView != null) {
            return new d5e0((FrameLayout) viewInflate, textView, (byte) 5);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.title)));
        return null;
    }

    public static d5e0 d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.vh_column_header_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvContent);
        if (textView != null) {
            return new d5e0((FrameLayout) viewInflate, textView, (byte) 7);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvContent)));
        return null;
    }

    public static d5e0 e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.vh_footer_total_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvContent);
        if (textView != null) {
            return new d5e0((FrameLayout) viewInflate, textView, (byte) 11);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvContent)));
        return null;
    }

    public static d5e0 f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.vh_players_statistics_cricket_data_cell, viewGroup, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvCellValue);
        if (textView != null) {
            return new d5e0((FrameLayout) viewInflate, textView, (byte) 20);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvCellValue)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f5502a;
        return this.b;
    }
}
