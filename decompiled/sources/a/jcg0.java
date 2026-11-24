package a;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class jcg0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f16275a;
    public final ArrayList b;
    public final ArrayList c;
    public final g090 d;
    public int e;

    public jcg0(Context context) {
        super(context);
        this.f16275a = (byte) 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        g090 g090Var = new g090();
        g090Var.f10448a = new LinkedHashMap();
        g090Var.b = new LinkedHashMap();
        this.d = g090Var;
        setClipChildren(false);
        kcg0 kcg0Var = new kcg0(context);
        addView(kcg0Var);
        arrayList.add(kcg0Var);
        arrayList2.add(kcg0Var);
        this.e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
