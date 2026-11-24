package a;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketLineView;

/* JADX INFO: loaded from: classes6.dex */
public final class zbl extends xhe0 {
    public static final /* synthetic */ int A = 0;
    public final dc3 u;
    public final RecyclerView v;
    public final vju0 w;
    public final vju0 x;
    public final int y;
    public final PathInterpolator z;

    /* JADX WARN: Illegal instructions before constructor call */
    public zbl(dc3 dc3Var, RecyclerView recyclerView, HashMap map, Function2 function2, Function1 function1, Function2 function3, xfb xfbVar, boolean z) {
        map.getClass();
        FrameLayout frameLayout = (FrameLayout) dc3Var.b;
        super(frameLayout);
        this.u = dc3Var;
        this.v = recyclerView;
        this.w = new vju0((dc3) dc3Var.e, recyclerView, map, new LinkedHashMap(), function2, function1, false, false, function3, xfbVar, z);
        this.x = new vju0((dc3) dc3Var.d, recyclerView, map, new LinkedHashMap(), function2, function1, false, false, function3, xfbVar, z);
        this.y = frameLayout.getContext().getResources().getDisplayMetrics().widthPixels;
        this.z = new PathInterpolator(0.15f, 0.7f, 0.4f, 0.8f);
    }

    public final void t(BracketLineView bracketLineView, BracketItemView bracketItemView, BracketItemView bracketItemView2, lk50 lk50Var, lk50 lk50Var2) {
        if (lk50Var == null || lk50Var2 == null) {
            return;
        }
        RecyclerView recyclerView = this.v;
        int iComputeVerticalScrollOffset = recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0;
        Rect rectH = bracketItemView.h(lk50Var, bracketLineView);
        Rect rectH2 = bracketItemView2.h(lk50Var2, bracketLineView);
        if (rectH != null) {
            rectH.offset(0, iComputeVerticalScrollOffset);
        }
        if (rectH2 != null) {
            rectH2.offset(0, iComputeVerticalScrollOffset);
        }
        if (rectH2 == null || rectH == null) {
            bracketLineView.setLines(iun.f15405a);
            return;
        }
        Point point = new Point(rectH2.right, rectH2.centerY());
        int i = rectH.left;
        int i2 = bracketItemView.h1;
        Point point2 = new Point(i - i2, rectH2.centerY());
        Point point3 = new Point(rectH.left - i2, rectH.centerY());
        int i3 = point.x;
        int i4 = point.y;
        int i5 = point2.x;
        int i6 = point2.y;
        bracketLineView.setLines(q3d.j(new tt8(i3, i4, i5, i6), new tt8(i5, i6, point3.x, point3.y)));
    }

    public final void u(BracketItemView bracketItemView, BracketItemView bracketItemView2, View view, boolean z) {
        float fractionalPage = bracketItemView.getFractionalPage() - (bracketItemView.getPagesCount() - 2);
        view.setVisibility(fractionalPage > 0.0f ? 0 : 8);
        if (fractionalPage > 0.0f) {
            int pagesCount = bracketItemView2.getPagesCount() - 2;
            if (z || bracketItemView2.getFractionalPage() > pagesCount) {
                bracketItemView2.l(fractionalPage + pagesCount, false, false, false, true);
            }
            float fMax = Math.max(Math.min(fractionalPage, 1.0f), 0.0f);
            float f = this.y;
            view.setTranslationX(p7x.F(f, -f, this.z.getInterpolation(fMax)));
        }
    }
}
