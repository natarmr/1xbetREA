package a;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class rpm0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tjj0 f30893a;
    public ViewGroup b;
    public DsHeader c;
    public int d;

    public rpm0(tjj0 tjj0Var) {
        tjj0Var.getClass();
        this.f30893a = tjj0Var;
    }

    @Override // a.fhe0
    public final void h(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        View childAt;
        canvas.getClass();
        the0Var.getClass();
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int iF1 = ((LinearLayoutManager) layoutManager).f1();
        int i = -1;
        if (iF1 == -1) {
            return;
        }
        int dimensionPixelSize = this.d;
        if (dimensionPixelSize == 0) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.size_82);
            this.d = dimensionPixelSize;
        }
        int childCount = recyclerView.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = recyclerView.getChildAt(i2);
            if (childAt.getBottom() > dimensionPixelSize && childAt.getTop() <= dimensionPixelSize) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt == null) {
            return;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            ViewParent parent = recyclerView.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            viewGroup = viewGroup2 != null ? (ViewGroup) viewGroup2.findViewById(R.id.sticky_header_container) : null;
            this.b = viewGroup;
            this.c = viewGroup != null ? (DsHeader) viewGroup.findViewById(R.id.group_header) : null;
        }
        if (viewGroup == null) {
            return;
        }
        int iU = RecyclerView.U(childAt);
        tjj0 tjj0Var = this.f30893a;
        List list = (List) tjj0Var.f;
        if ((list != null ? (sjj0) CollectionsKt.W(iU, list) : null) instanceof qjj0) {
            viewGroup.setTranslationY(childAt.getTop() - this.d);
            return;
        }
        do {
            List list2 = (List) tjj0Var.f;
            if ((list2 != null ? (sjj0) CollectionsKt.W(iF1, list2) : null) instanceof qjj0) {
                i = iF1;
                break;
            }
            iF1--;
        } while (iF1 >= 0);
        String strH = tjj0Var.H(i);
        DsHeader dsHeader = this.c;
        if (!StringsKt.W(strH)) {
            if (!Intrinsics.d(dsHeader != null ? dsHeader.getLabel() : null, strH)) {
                if (dsHeader != null) {
                    dsHeader.setLabel(strH);
                }
                if (dsHeader != null) {
                    dsHeader.requestLayout();
                }
            }
        }
        if (viewGroup.getTranslationY() == 0.0f) {
            return;
        }
        viewGroup.setTranslationY(0.0f);
    }
}
