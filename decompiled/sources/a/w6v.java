package a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class w6v extends FrameLayout {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f38644a;
    public boolean b;

    public static void a(View view, ArrayList arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (this.b) {
            super.onViewAdded(view);
        } else {
            jf4.n("This GhostViewHolder is detached!");
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        ViewGroup viewGroup = this.f38644a;
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            viewGroup.setTag(R.id.ghost_view_holder, null);
            viewGroup.getOverlay().remove(this);
            this.b = false;
        }
    }
}
