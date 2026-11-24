package androidx.appcompat.view.menu;

import a.hz30;
import a.n240;
import a.nx30;
import a.ox30;
import a.ywu;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements nx30, n240, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ox30 f45283a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ywu ywuVarY = ywu.y(R.attr.listViewStyle, 0, context, attributeSet, b);
        TypedArray typedArray = (TypedArray) ywuVarY.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(ywuVarY.n(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(ywuVarY.n(1));
        }
        ywuVarY.A();
    }

    @Override // a.nx30
    public final boolean a(hz30 hz30Var) {
        return this.f45283a.q(hz30Var, null, 0);
    }

    @Override // a.n240
    public final void c(ox30 ox30Var) {
        this.f45283a = ox30Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((hz30) getAdapter().getItem(i));
    }
}
