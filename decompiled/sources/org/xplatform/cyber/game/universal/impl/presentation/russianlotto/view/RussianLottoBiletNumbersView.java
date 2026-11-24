package org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view;

import a.bpg0;
import a.hny;
import a.iun;
import a.jiq0;
import a.jmu0;
import a.q3d;
import a.r3d;
import a.r7o0;
import a.twn;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.russianlotto.view.RussianLottoBiletNumbersView;

/* JADX INFO: loaded from: classes4.dex */
public final class RussianLottoBiletNumbersView extends FrameLayout {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46537a;
    public final ArrayList b;
    public List c;

    /* JADX WARN: Illegal instructions before constructor call */
    public RussianLottoBiletNumbersView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_12);
        this.f46537a = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = new ArrayList();
        this.c = iun.f15405a;
        setPadding(getPaddingLeft(), dimensionPixelSize, getPaddingRight(), getPaddingBottom());
    }

    public final ValueAnimator a(int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(getContext().getColor(i), getContext().getColor(i2));
        valueAnimatorOfArgb.setStartDelay(((long) i3) * 700);
        valueAnimatorOfArgb.setDuration(700L);
        return valueAnimatorOfArgb;
    }

    public final r7o0 b(bpg0 bpg0Var, int i) {
        ArrayList arrayList = this.b;
        r7o0 r7o0Var = (r7o0) CollectionsKt.W(i, arrayList);
        if (r7o0Var != null) {
            return r7o0Var;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.synthetic_russian_lotto_bilet_item, (ViewGroup) this, false);
        if (viewInflate == null) {
            hny.u("rootView");
            return null;
        }
        TextView textView = (TextView) viewInflate;
        r7o0 r7o0Var2 = new r7o0(textView, textView);
        int i2 = textView.getLayoutParams().width;
        int i3 = this.f46537a;
        int i4 = (i2 + i3) * bpg0Var.f2982a;
        int i5 = (textView.getLayoutParams().height + i3) * bpg0Var.b;
        textView.setX(i4);
        textView.setY(i5);
        addView(textView);
        arrayList.add(r7o0Var2);
        return r7o0Var2;
    }

    public final void c(ArrayList arrayList, List list) {
        list.getClass();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            bpg0 bpg0Var = (bpg0) obj;
            TextView textView = b(bpg0Var, i).b;
            Context context = getContext();
            context.getClass();
            textView.setBackground(context.getDrawable(bpg0Var.d));
            Context context2 = getContext();
            context2.getClass();
            textView.setTextColor(context2.getColor(bpg0Var.e));
            textView.setText(bpg0Var.c);
            i = i2;
        }
        this.c = list;
    }

    public final void d(ArrayList arrayList, List list) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (!this.c.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayListU.add(obj);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(r3d.q(arrayListU, 10));
        Iterator it = arrayListU.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((Number) it.next()).intValue()));
        }
        final byte b = 1;
        final byte b2 = 0;
        boolean z = arrayList2.size() <= 8;
        int i = 0;
        for (String str : arrayList2) {
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                } else if (Intrinsics.d(((bpg0) it2.next()).c, str)) {
                    break;
                } else {
                    i2++;
                }
            }
            bpg0 bpg0Var = (bpg0) CollectionsKt.W(i2, arrayList);
            if (bpg0Var != null) {
                final r7o0 r7o0VarB = b(bpg0Var, i2);
                TextView textView = r7o0VarB.b;
                if (z) {
                    ValueAnimator valueAnimatorA = a(R.color.static_white, R.color.static_red, i);
                    ValueAnimator valueAnimatorA2 = a(R.color.static_black, R.color.static_white, i);
                    valueAnimatorA.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a.vog0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b3 = b2;
                            r7o0 r7o0Var = r7o0VarB;
                            switch (b3) {
                                case 0:
                                    int i3 = RussianLottoBiletNumbersView.d;
                                    valueAnimator.getClass();
                                    TextView textView2 = r7o0Var.b;
                                    Object animatedValue = valueAnimator.getAnimatedValue();
                                    animatedValue.getClass();
                                    jmu0.j(textView2, ColorStateList.valueOf(((Integer) animatedValue).intValue()));
                                    break;
                                default:
                                    int i4 = RussianLottoBiletNumbersView.d;
                                    valueAnimator.getClass();
                                    TextView textView3 = r7o0Var.b;
                                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                                    animatedValue2.getClass();
                                    textView3.setTextColor(ColorStateList.valueOf(((Integer) animatedValue2).intValue()));
                                    break;
                            }
                        }
                    });
                    valueAnimatorA2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a.vog0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b3 = b;
                            r7o0 r7o0Var = r7o0VarB;
                            switch (b3) {
                                case 0:
                                    int i3 = RussianLottoBiletNumbersView.d;
                                    valueAnimator.getClass();
                                    TextView textView2 = r7o0Var.b;
                                    Object animatedValue = valueAnimator.getAnimatedValue();
                                    animatedValue.getClass();
                                    jmu0.j(textView2, ColorStateList.valueOf(((Integer) animatedValue).intValue()));
                                    break;
                                default:
                                    int i4 = RussianLottoBiletNumbersView.d;
                                    valueAnimator.getClass();
                                    TextView textView3 = r7o0Var.b;
                                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                                    animatedValue2.getClass();
                                    textView3.setTextColor(ColorStateList.valueOf(((Integer) animatedValue2).intValue()));
                                    break;
                            }
                        }
                    });
                    valueAnimatorA.start();
                    valueAnimatorA2.start();
                } else {
                    jmu0.j(textView, jiq0.n0(R.color.static_red, getContext()));
                    Context context = getContext();
                    context.getClass();
                    textView.setTextColor(context.getColor(R.color.static_white));
                }
            }
            i++;
        }
        this.c = list;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPadding((getMeasuredWidth() - getContext().getResources().getDimensionPixelSize(R.dimen.size_258)) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RussianLottoBiletNumbersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RussianLottoBiletNumbersView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
