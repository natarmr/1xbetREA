package org.xplatform.games_mania.presentation.views;

import a.akk;
import a.e6t;
import a.epv0;
import a.f0p;
import a.f1e0;
import a.iun;
import a.j7t;
import a.jcs;
import a.q3d;
import a.r3d;
import a.s7n0;
import a.unh0;
import a.vls;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class GamesManiaDice extends FrameLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46719a;
    public AnimatorSet b;
    public Function1 c;
    public Function0 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public GamesManiaDice(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.c = new vls((byte) 11);
        this.d = new e6t((byte) 7);
    }

    private final float getRandomRotation() {
        f1e0.f8761a.getClass();
        return f1e0.b.d(0, 360);
    }

    private final int getRandomX() {
        int x = (int) (getX() + 8.0f);
        int x2 = (int) (((getX() + getWidth()) - this.f46719a) - 8.0f);
        f1e0.f8761a.getClass();
        return f1e0.b.d(x, x2);
    }

    private final int getRandomY() {
        int y = (int) (getY() + 8.0f);
        int y2 = (int) (((getY() + getHeight()) - this.f46719a) - 8.0f);
        f1e0.f8761a.getClass();
        return f1e0.b.d(y, y2);
    }

    public final void a(long j, List list) {
        int i;
        removeAllViews();
        this.c.invoke(list);
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            j7t j7tVar = (j7t) list.get(i3);
            Point point = j7tVar.f16057a;
            int i4 = j7tVar.b;
            float f = j7tVar.c;
            int i5 = this.f46719a;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i5, i5);
            Context context = getContext();
            context.getClass();
            akk akkVar = new akk(context, null, i2);
            akkVar.d = iun.f15405a;
            akkVar.e = 1;
            akkVar.setBackground(epv0.U(R.drawable.dice_background, akkVar.getContext()));
            akkVar.setDealerDice(1);
            akkVar.setN(i4);
            if (j != 0) {
                Context context2 = getContext();
                context2.getClass();
                int i6 = context2.getResources().getConfiguration().getLayoutDirection() == 1 ? -1 : 1;
                AnimatorSet animatorSet = new AnimatorSet();
                this.b = animatorSet;
                float width = getWidth() * i6;
                float f2 = point.x;
                i = i2;
                float[] fArr = new float[2];
                fArr[i] = width;
                fArr[1] = f2;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(akkVar, "translationX", fArr);
                objectAnimatorOfFloat.getClass();
                AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat);
                float height = getHeight() / 2;
                float f3 = point.y;
                float[] fArr2 = new float[2];
                fArr2[i] = height;
                fArr2[1] = f3;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(akkVar, "translationY", fArr2);
                objectAnimatorOfFloat2.getClass();
                AnimatorSet.Builder builderWith = builderPlay.with(objectAnimatorOfFloat2);
                float[] fArr3 = new float[2];
                fArr3[i] = 0.0f;
                fArr3[1] = f;
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(akkVar, "rotation", fArr3);
                objectAnimatorOfFloat3.getClass();
                builderWith.with(objectAnimatorOfFloat3);
                animatorSet.setDuration(j);
                animatorSet.setInterpolator(new f0p((byte) 1));
                animatorSet.addListener(unh0.h0(s7n0.l(this), null, new jcs(this, (byte) 13), 11));
                animatorSet.start();
            } else {
                i = i2;
                akkVar.setX(point.x);
                akkVar.setY(point.y);
                akkVar.setRotation(f);
                this.d.invoke();
            }
            addView(akkVar, layoutParams);
            i3++;
            i2 = i;
        }
    }

    public final void b(long j, List list) {
        float y;
        float y2;
        Point point;
        list.getClass();
        Point point2 = new Point(getRandomX(), getRandomY());
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            int i3 = Integer.parseInt((String) obj);
            if (i == 0) {
                point = point2;
            } else {
                int i4 = point2.y + this.f46719a;
                if (i4 < getHeight() / 2) {
                    y = i4 + 8.0f;
                    y2 = (getY() + getHeight()) - this.f46719a;
                } else {
                    y = getY() + 8.0f;
                    y2 = point2.y - this.f46719a;
                }
                float f = y2 - 8.0f;
                f1e0.f8761a.getClass();
                point = new Point(getRandomX(), f1e0.b.d((int) y, (int) f));
            }
            arrayList.add(new j7t(point, i3, getRandomRotation()));
            i = i2;
        }
        a(j, arrayList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f46719a = (int) (((double) getHeight()) * 0.2d);
    }

    public final void setDiceListener$games_mania(Function1<? super List<j7t>, Unit> function1) {
        function1.getClass();
        this.c = function1;
    }

    public final void setDiceShownListener$games_mania(Function0<Unit> function0) {
        function0.getClass();
        this.d = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GamesManiaDice(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GamesManiaDice(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
