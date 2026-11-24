package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class acg0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f626a;
    public final int b;
    public boolean c;
    public int d;
    public final ArrayList e;
    public final ArrayList f;
    public hc50 g;
    public e1i h;
    public final j6g0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acg0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f626a = getResources().getDimensionPixelSize(R.dimen.space_48);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_52);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new hc50("SEARCH_BUTTON", ybg0.f42342a, 0, new j6g0((byte) 7), 2032);
        e1i e1iVar = new e1i(context);
        e1iVar.setId(jmu0.d());
        this.h = e1iVar;
        this.i = new j6g0((byte) 8);
    }

    public final boolean getSearchFieldOpenedState() {
        return this.c;
    }

    public final List<e1i> getVisibleButtons() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.e) {
            if (((e1i) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List<e1i> visibleButtons = getVisibleButtons();
        if (visibleButtons.isEmpty()) {
            return;
        }
        int i5 = 0;
        for (e1i e1iVar : visibleButtons) {
            int i6 = this.f626a;
            acg0 acg0Var = this;
            jmu0.f(i5, 0, i5 + i6, i6, e1iVar, acg0Var);
            i5 += acg0Var.f626a;
            this = acg0Var;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        List<e1i> visibleButtons = getVisibleButtons();
        Iterator<T> it = visibleButtons.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i3 = this.f626a;
            if (!zHasNext) {
                this.d = i3;
                setMeasuredDimension(visibleButtons.size() * this.d, this.b);
                return;
            }
            ((e1i) it.next()).measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
    }

    public final void setButtonsAlpha(float f) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((e1i) it.next()).setButtonAlpha(f);
        }
    }

    public final void setButtonsBackgroundsColor(Integer num) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((e1i) it.next()).setNavigationBarButtonBackgroundTint(num);
        }
    }

    public final void setButtonsScale(float f) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((e1i) it.next()).setButtonScale(f);
        }
    }

    public final void setButtonsTranslationY(float f) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((e1i) it.next()).setButtonTranslationY(f);
        }
    }

    public final void setNavigationBarButtonsColorStateList(ColorStateList colorStateList) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((e1i) it.next()).setNavigationBarButtonTint(colorStateList);
        }
    }

    public final void setButtonsBackgroundsColor(ColorStateList colorStateList) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((e1i) it.next()).setNavigationBarButtonBackgroundTint(colorStateList);
        }
    }
}
