package org.xplatform.cyber.game.universal.impl.presentation.killerjoker;

import a.akc;
import a.al1;
import a.coy;
import a.doy;
import a.eng;
import a.epv0;
import a.f140;
import a.hxm0;
import a.iun;
import a.maz;
import a.n0o0;
import a.n23;
import a.o6o;
import a.q3d;
import a.qzn;
import a.r3d;
import a.r9g;
import a.sb3;
import a.sj3;
import a.svl;
import a.w6x;
import a.yhn;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;

/* JADX INFO: loaded from: classes4.dex */
public final class KillerJokerView extends FrameLayout {
    public static final /* synthetic */ int h1 = 0;
    public int A;
    public final n0o0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46532a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final n0o0 f1;
    public final int g;
    public final n0o0 g1;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final ArrayList m;
    public List n;
    public List o;
    public List p;
    public List q;
    public boolean r;
    public boolean s;
    public String t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KillerJokerView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f46532a = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_24);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_20);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_50);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_30);
        this.e = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.f = dimensionPixelSize2;
        this.g = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_44);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.size_100);
        this.i = dimensionPixelSize3;
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.size_132);
        this.j = dimensionPixelSize4;
        this.k = dimensionPixelSize3 - dimensionPixelSize;
        this.l = dimensionPixelSize4 - dimensionPixelSize2;
        this.m = new ArrayList();
        iun iunVar = iun.f15405a;
        this.n = iunVar;
        this.o = iunVar;
        this.p = iunVar;
        this.q = iunVar;
        this.t = "";
        this.u = "";
        final byte b = 0;
        this.B = maz.b(new Function0() { // from class: a.qoy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                KillerJokerView killerJokerView = this;
                Context context2 = context;
                switch (b2) {
                    case 0:
                        int i = KillerJokerView.h1;
                        ImageView imageView = new ImageView(context2);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(killerJokerView.g, killerJokerView.h));
                        imageView.setImageDrawable(sj3.U(R.drawable.killer_joker_joker_bg, context2));
                        killerJokerView.addView(imageView);
                        return imageView;
                    case 1:
                        int i2 = KillerJokerView.h1;
                        TextView textView = new TextView(context2);
                        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        textView.setTextColor(context2.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Caption_Regular_M);
                        killerJokerView.addView(textView);
                        return textView;
                    default:
                        int i3 = KillerJokerView.h1;
                        TextView textView2 = new TextView(context2);
                        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        textView2.setTextColor(context2.getColor(R.color.static_white));
                        textView2.setTextAppearance(R.style.TextAppearance_Caption_Regular_M);
                        killerJokerView.addView(textView2);
                        return textView2;
                }
            }
        });
        final byte b2 = 1;
        this.f1 = maz.b(new Function0() { // from class: a.qoy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                KillerJokerView killerJokerView = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        int i = KillerJokerView.h1;
                        ImageView imageView = new ImageView(context2);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(killerJokerView.g, killerJokerView.h));
                        imageView.setImageDrawable(sj3.U(R.drawable.killer_joker_joker_bg, context2));
                        killerJokerView.addView(imageView);
                        return imageView;
                    case 1:
                        int i2 = KillerJokerView.h1;
                        TextView textView = new TextView(context2);
                        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        textView.setTextColor(context2.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Caption_Regular_M);
                        killerJokerView.addView(textView);
                        return textView;
                    default:
                        int i3 = KillerJokerView.h1;
                        TextView textView2 = new TextView(context2);
                        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        textView2.setTextColor(context2.getColor(R.color.static_white));
                        textView2.setTextAppearance(R.style.TextAppearance_Caption_Regular_M);
                        killerJokerView.addView(textView2);
                        return textView2;
                }
            }
        });
        final byte b3 = 2;
        this.g1 = maz.b(new Function0() { // from class: a.qoy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                KillerJokerView killerJokerView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i = KillerJokerView.h1;
                        ImageView imageView = new ImageView(context2);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(killerJokerView.g, killerJokerView.h));
                        imageView.setImageDrawable(sj3.U(R.drawable.killer_joker_joker_bg, context2));
                        killerJokerView.addView(imageView);
                        return imageView;
                    case 1:
                        int i2 = KillerJokerView.h1;
                        TextView textView = new TextView(context2);
                        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        textView.setTextColor(context2.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Caption_Regular_M);
                        killerJokerView.addView(textView);
                        return textView;
                    default:
                        int i3 = KillerJokerView.h1;
                        TextView textView2 = new TextView(context2);
                        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        textView2.setTextColor(context2.getColor(R.color.static_white));
                        textView2.setTextAppearance(R.style.TextAppearance_Caption_Regular_M);
                        killerJokerView.addView(textView2);
                        return textView2;
                }
            }
        });
        setWillNotDraw(false);
    }

    public static final void d(ImageView imageView, KillerJokerView killerJokerView, ValueAnimator valueAnimator) {
        imageView.setAlpha(((Float) w6x.m(valueAnimator)).floatValue());
        float x = killerJokerView.getJokerEmptyImageView().getX() - (killerJokerView.k / 2);
        float y = killerJokerView.getJokerEmptyImageView().getY() - (killerJokerView.l / 2);
        imageView.setX(x);
        imageView.setY(y);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setVisibility(0);
    }

    public static final void f(KillerJokerView killerJokerView, int i) {
        killerJokerView.getFirstPlayerCardSizeView().setX((i / 2.0f) - (killerJokerView.e / 2));
        killerJokerView.getFirstPlayerCardSizeView().setY(killerJokerView.c);
    }

    public static final void g(KillerJokerView killerJokerView, int i, int i2) {
        killerJokerView.getJokerEmptyImageView().setX((i / 2.0f) - (killerJokerView.e / 2));
        killerJokerView.getJokerEmptyImageView().setY((i2 / 2.0f) - (killerJokerView.f / 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getFirstPlayerCardSizeView() {
        return (TextView) this.f1.getValue();
    }

    private final ImageView getJokerEmptyImageView() {
        return (ImageView) this.B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getSecondPlayerCardSizeView() {
        return (TextView) this.g1.getValue();
    }

    public static final void h(KillerJokerView killerJokerView, int i, int i2) {
        killerJokerView.getSecondPlayerCardSizeView().setX((i / 2.0f) - (killerJokerView.e / 2));
        killerJokerView.getSecondPlayerCardSizeView().setY(i2 - (killerJokerView.d - killerJokerView.f46532a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayersCardsSize(coy coyVar) {
        if (StringsKt.O(coyVar.f4721a, "HEARTS", false) || StringsKt.O(coyVar.f4721a, "DIAMONDS", false)) {
            TextView secondPlayerCardSizeView = getSecondPlayerCardSizeView();
            int i = this.w;
            if (this.A > i) {
                i++;
            }
            this.w = i;
            secondPlayerCardSizeView.setText(i + "/18");
            return;
        }
        TextView firstPlayerCardSizeView = getFirstPlayerCardSizeView();
        int i2 = this.v;
        if (this.z > i2) {
            i2++;
        }
        this.v = i2;
        firstPlayerCardSizeView.setText(i2 + "/18");
    }

    public final void e(List list, int i, Function2 function2) {
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            coy coyVar = (coy) obj;
            Pair pair = (Pair) function2.invoke(Integer.valueOf(i2), Integer.valueOf(list.size()));
            int iIntValue = ((Number) pair.f46059a).intValue();
            int iIntValue2 = ((Number) pair.b).intValue();
            int size = list.size() / 2;
            if (i2 >= size) {
                i2 -= size;
            }
            int i4 = this.e;
            int i5 = (i2 * i4) + (i * i2);
            this.m.add(new doy(coyVar.b, i5, iIntValue, i5 + i4, iIntValue2, coyVar.f4721a));
            i2 = i3;
        }
    }

    public final boolean getDealing() {
        return this.s;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void i(ArrayList arrayList, qzn qznVar, yhn yhnVar) {
        Object next;
        AnimatorSet animatorSet;
        char c;
        int i = 1;
        if (this.p.isEmpty() && !this.r) {
            this.r = true;
            this.p = arrayList;
            this.q = arrayList;
            invalidate();
            return;
        }
        ArrayList<coy> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!this.p.contains((coy) obj)) {
                arrayList2.add(obj);
            }
        }
        boolean z = false;
        if (arrayList2.size() > 3) {
            this.p = arrayList;
            this.q = arrayList;
            invalidate();
            List list = this.p;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                String str = ((coy) obj2).f4721a;
                if (StringsKt.O(str, "CLUBS", false) || (StringsKt.O(str, "SPADES", false) && !StringsKt.O(str, "JOKER", false))) {
                    arrayList3.add(obj2);
                }
            }
            this.v = arrayList3.size();
            List list2 = this.p;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list2) {
                String str2 = ((coy) obj3).f4721a;
                if (StringsKt.O(str2, "HEARTS", false) || (StringsKt.O(str2, "DIAMONDS", false) && !StringsKt.O(str2, "JOKER", false))) {
                    arrayList4.add(obj3);
                }
            }
            this.w = arrayList4.size();
            getFirstPlayerCardSizeView().setText(this.v + "/18");
            getSecondPlayerCardSizeView().setText(this.w + "/18");
            return;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.q = this.p;
        this.p = arrayList;
        ArrayList arrayList5 = new ArrayList(r3d.q(arrayList2, 10));
        for (coy coyVar : arrayList2) {
            final ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(coyVar.b);
            imageView.setVisibility(8);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(this.i, this.j));
            addView(imageView);
            byte b = 2;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new sb3(imageView, this, (byte) 4));
            String str3 = coyVar.f4721a;
            boolean z2 = z;
            if (StringsKt.O(str3, "JOKER", z)) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.36f);
                valueAnimatorOfFloat2.setDuration(600L);
                valueAnimatorOfFloat2.addUpdateListener(new eng(imageView, b));
                animatorSet = new AnimatorSet();
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setStartDelay(600L);
                Animator[] animatorArr = new Animator[i];
                animatorArr[z2 ? 1 : 0] = valueAnimatorOfFloat2;
                animatorSet2.playTogether(animatorArr);
                animatorSet2.addListener(new r9g((Object) yhnVar, (byte) 6));
                animatorSet2.addListener(new r9g((Object) this, (byte) 5));
                Animator[] animatorArr2 = new Animator[2];
                animatorArr2[z2 ? 1 : 0] = valueAnimatorOfFloat;
                animatorArr2[i] = animatorSet2;
                animatorSet.playSequentially(animatorArr2);
                c = 3;
            } else {
                Iterator it = this.m.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((doy) next).f.equals(str3));
                doy doyVar = (doy) next;
                float x = getJokerEmptyImageView().getX();
                float f = this.k / 2;
                float f2 = x - f;
                int i2 = i;
                float f3 = (doyVar != null ? doyVar.b : 0.0f) - f;
                final byte b2 = z2 ? (byte) 1 : (byte) 0;
                Function1 function1 = new Function1() { // from class: a.soy
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        byte b3 = b2;
                        ImageView imageView2 = imageView;
                        float fFloatValue = ((Float) obj4).floatValue();
                        switch (b3) {
                            case 0:
                                int i3 = KillerJokerView.h1;
                                imageView2.setX(fFloatValue);
                                break;
                            default:
                                int i4 = KillerJokerView.h1;
                                imageView2.setY(fFloatValue);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                float[] fArr = new float[2];
                fArr[z2 ? 1 : 0] = f2;
                fArr[i2 == true ? 1 : 0] = f3;
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(fArr);
                valueAnimatorOfFloat3.setDuration(600L);
                valueAnimatorOfFloat3.addUpdateListener(new svl(function1, (byte) 2));
                float y = getJokerEmptyImageView().getY();
                float f4 = this.l / 2;
                float f5 = y - f4;
                float f6 = (doyVar != null ? doyVar.c : 0.0f) - f4;
                final byte b3 = i2 == true ? (byte) 1 : (byte) 0;
                Function1 function2 = new Function1() { // from class: a.soy
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        byte b4 = b3;
                        ImageView imageView2 = imageView;
                        float fFloatValue = ((Float) obj4).floatValue();
                        switch (b4) {
                            case 0:
                                int i3 = KillerJokerView.h1;
                                imageView2.setX(fFloatValue);
                                break;
                            default:
                                int i4 = KillerJokerView.h1;
                                imageView2.setY(fFloatValue);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                float[] fArr2 = new float[2];
                fArr2[0] = f5;
                fArr2[i2 == true ? 1 : 0] = f6;
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(fArr2);
                valueAnimatorOfFloat4.setDuration(600L);
                valueAnimatorOfFloat4.addUpdateListener(new svl(function2, (byte) 2));
                ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.32f);
                valueAnimatorOfFloat5.setDuration(600L);
                valueAnimatorOfFloat5.addUpdateListener(new eng(imageView, (byte) 2));
                animatorSet = new AnimatorSet();
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.setStartDelay(600L);
                c = 3;
                z2 = false;
                i = 1;
                animatorSet3.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
                animatorSet3.addListener(new akc(this, coyVar, (byte) 8));
                animatorSet.playSequentially(valueAnimatorOfFloat, animatorSet3);
            }
            arrayList5.add(animatorSet);
            z = z2;
            i = i;
        }
        this.s = i;
        qznVar.invoke(Boolean.TRUE);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(arrayList5);
        animatorSet4.addListener(new akc(this, qznVar, (byte) 7));
        animatorSet4.start();
    }

    public final void j(int i, int i2) {
        if (this.v == 0) {
            this.t = f140.i(i, "/18");
            getFirstPlayerCardSizeView().setText(this.t);
            TextView firstPlayerCardSizeView = getFirstPlayerCardSizeView();
            Context context = getContext();
            context.getClass();
            firstPlayerCardSizeView.setBackground(sj3.U(i2, context));
            this.v = i;
        }
        this.z = i;
        this.x = i2;
    }

    public final void k(int i, int i2) {
        if (this.w == 0) {
            this.u = f140.i(i, "/18");
            getSecondPlayerCardSizeView().setText(this.u);
            TextView secondPlayerCardSizeView = getSecondPlayerCardSizeView();
            Context context = getContext();
            context.getClass();
            secondPlayerCardSizeView.setBackground(sj3.U(i2, context));
            this.w = i;
        }
        this.A = i;
        this.y = i2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object next;
        Drawable drawableU;
        canvas.getClass();
        ArrayList<doy> arrayList = this.m;
        for (doy doyVar : arrayList) {
            int i = doyVar.f6434a;
            int i2 = doyVar.b;
            int i3 = doyVar.c;
            int i4 = doyVar.d;
            int i5 = doyVar.e;
            Drawable drawableU2 = epv0.U(i, getContext());
            if (drawableU2 != null) {
                drawableU2.setBounds(i2, i3, i4, i5);
                drawableU2.draw(canvas);
            }
        }
        for (coy coyVar : this.q) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((doy) next).f.equals(coyVar.f4721a));
            doy doyVar2 = (doy) next;
            if (doyVar2 != null) {
                int i6 = coyVar.b;
                int i7 = doyVar2.b;
                int i8 = doyVar2.c;
                int i9 = doyVar2.d;
                int i10 = doyVar2.e;
                Drawable drawableU3 = epv0.U(i6, getContext());
                if (drawableU3 != null) {
                    drawableU3.setBounds(i7, i8, i9, i10);
                    drawableU3.draw(canvas);
                }
            }
            if (StringsKt.O(coyVar.f4721a, "JOKER", false) && (drawableU = epv0.U(coyVar.b, getContext())) != null) {
                hxm0.v(getJokerEmptyImageView());
                int intrinsicWidth = (int) (drawableU.getIntrinsicWidth() * 1.2f);
                int intrinsicHeight = (int) (drawableU.getIntrinsicHeight() * 1.2f);
                int width = (canvas.getWidth() - intrinsicWidth) / 2;
                int height = (canvas.getHeight() - intrinsicHeight) / 2;
                drawableU.setBounds(width, height, intrinsicWidth + width, intrinsicHeight + height);
                drawableU.draw(canvas);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        final int size = View.MeasureSpec.getSize(i);
        int size2 = this.n.size() / 2;
        int i3 = this.e;
        final int size3 = (this.d * 2) + (this.b * 2) + (((size - (size2 * i3)) / ((this.n.size() - 1) / 2)) * 2) + this.h + (this.f * 4);
        if (this.m.isEmpty()) {
            int size4 = (size - ((this.n.size() / 2) * i3)) / ((this.n.size() - 1) / 2);
            e(this.n, size4, new o6o(this, size4, (byte) 19));
            e(this.o, size4, new al1((byte) 2, size4, size3, (Object) this));
        }
        post(new n23((Object) this, size, (byte) 8));
        final byte b = 0;
        post(new Runnable(this) { // from class: a.roy
            public final /* synthetic */ KillerJokerView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                int i4 = size3;
                int i5 = size;
                KillerJokerView killerJokerView = this.b;
                switch (b2) {
                    case 0:
                        KillerJokerView.h(killerJokerView, i5, i4);
                        break;
                    default:
                        KillerJokerView.g(killerJokerView, i5, i4);
                        break;
                }
            }
        });
        final byte b2 = 1;
        post(new Runnable(this) { // from class: a.roy
            public final /* synthetic */ KillerJokerView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                int i4 = size3;
                int i5 = size;
                KillerJokerView killerJokerView = this.b;
                switch (b3) {
                    case 0:
                        KillerJokerView.h(killerJokerView, i5, i4);
                        break;
                    default:
                        KillerJokerView.g(killerJokerView, i5, i4);
                        break;
                }
            }
        });
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size3, 1073741824));
    }

    public final void setFirstPlayerGameField(List<coy> list) {
        list.getClass();
        if (this.n.isEmpty()) {
            this.n = list;
            invalidate();
        }
    }

    public final void setSecondPlayerGameField(List<coy> list) {
        list.getClass();
        if (this.o.isEmpty()) {
            this.o = list;
            invalidate();
        }
    }
}
