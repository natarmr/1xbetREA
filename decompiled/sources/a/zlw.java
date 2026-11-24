package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.StickyHeaderLayoutManager;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes.dex */
public final class zlw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44600a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public zlw(View view, int i, int i2, StickyHeaderLayoutManager stickyHeaderLayoutManager) {
        this.b = view;
        this.c = i;
        this.d = i2;
        this.e = stickyHeaderLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f44600a;
        int i = this.d;
        int i2 = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((HorizontalScrollView) obj).scrollTo(i2, i);
                break;
            default:
                StickyHeaderLayoutManager stickyHeaderLayoutManager = (StickyHeaderLayoutManager) obj;
                int i3 = i + i2;
                while (i2 < i3) {
                    xhe0 xhe0VarO = stickyHeaderLayoutManager.g1.O(i2);
                    View view = xhe0VarO != null ? xhe0VarO.f40887a : null;
                    if ((view instanceof FrameLayout) && (((FrameLayout) view).getChildAt(0) instanceof DsSegmentedGroup)) {
                        int iF = q3d.f(stickyHeaderLayoutManager.j1, Integer.valueOf(i2));
                        if (iF < 0 && (iF = -(iF + 1)) >= stickyHeaderLayoutManager.j1.size()) {
                            iF = -1;
                        }
                        ArrayList arrayList = stickyHeaderLayoutManager.j1;
                        if (iF != -1) {
                            arrayList.add(iF, Integer.valueOf(i2));
                        } else {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    i2++;
                }
                break;
        }
    }

    public zlw(HorizontalScrollView horizontalScrollView, HorizontalScrollView horizontalScrollView2, int i, int i2) {
        this.e = horizontalScrollView2;
        this.c = i;
        this.d = i2;
    }
}
