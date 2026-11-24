package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class jc50 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16259a;
    public int b;
    public final ArrayList c;
    public ukm d;
    public gc50 e;
    public Function0 f;
    public final int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc50(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f16259a = new ArrayList();
        this.c = new ArrayList();
        this.d = new ukm(context);
        this.e = new gc50("SEARCH_BUTTON", ic50.b, 0, new ec40((byte) 23), 2032);
        this.f = new ec40((byte) 24);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_48);
    }

    private final List<ukm> getVisibleButtons() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f16259a) {
            if (((ukm) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a() {
        ukm ukmVar = this.d;
        ArrayList arrayList = this.f16259a;
        if (arrayList.contains(ukmVar)) {
            return;
        }
        arrayList.add(0, this.d);
        this.c.add(0, this.e);
        addView(this.d, 0);
        requestLayout();
    }

    public final ukm b(String str) {
        Object next;
        Iterator it = this.f16259a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((ukm) next).getButtonIconId(), str)) {
                return (ukm) next;
            }
        }
        next = null;
        return (ukm) next;
    }

    public final void c() {
        ukm ukmVar = this.d;
        ArrayList arrayList = this.f16259a;
        if (arrayList.contains(ukmVar)) {
            arrayList.remove(this.d);
            this.c.remove(this.e);
            removeView(this.d);
            requestLayout();
        }
    }

    public final void d(ArrayList arrayList, Function0 function0) {
        arrayList.getClass();
        removeAllViews();
        List<gc50> listA0 = CollectionsKt.A0(arrayList, new lk30((byte) 7));
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList2.addAll(listA0);
        ArrayList arrayList3 = this.f16259a;
        arrayList3.clear();
        for (gc50 gc50Var : listA0) {
            Context context = getContext();
            context.getClass();
            ukm ukmVar = new ukm(context);
            ukmVar.setButtonIconId(gc50Var.f11043a);
            ukmVar.setNavigationBarButtonStyle(gc50Var.b);
            ukmVar.setNavigationBarButtonImageResource(gc50Var.c);
            ukmVar.setNavigationBarButtonAlpha(false);
            ukmVar.setClickable(true);
            if (gc50Var.e) {
                this.e = gc50Var;
                this.d = ukmVar;
                ukmVar.setOnNavigationBarButtonClickListener(new g8l(function0, gc50Var, this, (byte) 27));
            } else {
                ukmVar.setOnNavigationBarButtonClickListener(gc50Var.d);
            }
            arrayList3.add(ukmVar);
            addView(ukmVar);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List<ukm> visibleButtons = getVisibleButtons();
        int i5 = i3 - i;
        int size = visibleButtons.size();
        int i6 = this.b;
        int i7 = ((i4 - i2) - i6) / 2;
        Iterator<T> it = visibleButtons.iterator();
        int i8 = i5 - (size * i6);
        while (it.hasNext()) {
            jc50 jc50Var = this;
            jmu0.f(i8, i7, i8 + this.b, i7 + this.g, (ukm) it.next(), jc50Var);
            i8 += jc50Var.b;
            this = jc50Var;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        List<ukm> visibleButtons = getVisibleButtons();
        for (ukm ukmVar : visibleButtons) {
            ukmVar.measure(View.MeasureSpec.makeMeasureSpec(ukmVar.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ukmVar.getMeasuredHeight(), 1073741824));
            this.b = ukmVar.getMeasuredWidth();
        }
        setMeasuredDimension(visibleButtons.size() * this.b, getHeight());
    }

    public final void setNavigationBarButtonsColorStateList(ColorStateList colorStateList) {
        Iterator it = this.f16259a.iterator();
        while (it.hasNext()) {
            ((ukm) it.next()).setNavigationBarButtonTint(colorStateList);
        }
        requestLayout();
    }
}
