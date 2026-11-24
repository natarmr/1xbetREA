package org.xplatform.resident.presentation.views;

import a.b4f0;
import a.bkx;
import a.bue0;
import a.dff0;
import a.dyb;
import a.eme0;
import a.g18;
import a.hny;
import a.hrf0;
import a.kkx;
import a.krf0;
import a.l1e0;
import a.lrf0;
import a.maz;
import a.mrf0;
import a.n0o0;
import a.srf0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.resident.presentation.views.ResidentSafeLineView;

/* JADX INFO: loaded from: classes5.dex */
public final class ResidentSafeLineView extends LinearLayout {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46885a;
    public Function1 b;
    public Function1 c;
    public int d;
    public boolean e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;

    /* JADX WARN: Illegal instructions before constructor call */
    public ResidentSafeLineView(final Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b = 0;
        super(context, attributeSet, 0, 0);
        ArrayList arrayList = new ArrayList();
        this.f46885a = arrayList;
        this.b = new bue0((byte) 25);
        this.c = new bue0((byte) 26);
        this.f = maz.b(new hrf0(context, (byte) 0));
        this.g = maz.b(new b4f0((byte) 19));
        this.h = maz.b(new Function0(this) { // from class: a.irf0
            public final /* synthetic */ ResidentSafeLineView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                ResidentSafeLineView residentSafeLineView = this.b;
                switch (b2) {
                    case 0:
                        return Float.valueOf(ResidentSafeLineView.a(residentSafeLineView));
                    default:
                        return Integer.valueOf(ResidentSafeLineView.d(residentSafeLineView));
                }
            }
        });
        this.i = maz.b(new b4f0((byte) 20));
        this.j = maz.b(new Function0() { // from class: a.jrf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                ResidentSafeLineView residentSafeLineView = this;
                Context context2 = context;
                switch (b2) {
                    case 0:
                        return ResidentSafeLineView.e(context2, residentSafeLineView);
                    default:
                        int i2 = ResidentSafeLineView.m;
                        context2.getClass();
                        int i3 = context2.getResources().getDisplayMetrics().widthPixels;
                        int i4 = 0;
                        Iterator it = l1e0.o(0, 4).iterator();
                        while (((kkx) it).c) {
                            krf0 krf0VarC = residentSafeLineView.c(((bkx) it).nextInt());
                            i4 += krf0VarC.f18763a + krf0VarC.b;
                        }
                        return Integer.valueOf(((((i3 - i4) / 4) * 100) / 67) + ((int) Math.abs(-40.0f)));
                }
            }
        });
        final byte b2 = 1;
        this.k = maz.b(new Function0(this) { // from class: a.irf0
            public final /* synthetic */ ResidentSafeLineView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ResidentSafeLineView residentSafeLineView = this.b;
                switch (b3) {
                    case 0:
                        return Float.valueOf(ResidentSafeLineView.a(residentSafeLineView));
                    default:
                        return Integer.valueOf(ResidentSafeLineView.d(residentSafeLineView));
                }
            }
        });
        this.l = maz.b(new Function0() { // from class: a.jrf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ResidentSafeLineView residentSafeLineView = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        return ResidentSafeLineView.e(context2, residentSafeLineView);
                    default:
                        int i2 = ResidentSafeLineView.m;
                        context2.getClass();
                        int i3 = context2.getResources().getDisplayMetrics().widthPixels;
                        int i4 = 0;
                        Iterator it = l1e0.o(0, 4).iterator();
                        while (((kkx) it).c) {
                            krf0 krf0VarC = residentSafeLineView.c(((bkx) it).nextInt());
                            i4 += krf0VarC.f18763a + krf0VarC.b;
                        }
                        return Integer.valueOf(((((i3 - i4) / 4) * 100) / 67) + ((int) Math.abs(-40.0f)));
                }
            }
        });
        setWillNotDraw(false);
        setOrientation(0);
        if (getChildCount() == 4) {
            return;
        }
        removeAllViews();
        arrayList.clear();
        Iterator it = l1e0.o(0, 4).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            Context context2 = getContext();
            context2.getClass();
            srf0 srf0Var = new srf0(context2);
            krf0 krf0VarC = c(iNextInt);
            int i2 = krf0VarC.f18763a;
            int i3 = krf0VarC.b;
            addView(srf0Var);
            dyb.c0(srf0Var, new g18((Object) srf0Var, (Object) this, iNextInt, (byte) 13));
            ViewGroup.LayoutParams layoutParams = srf0Var.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                throw null;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 1.0f;
            layoutParams2.setMarginStart(i2);
            layoutParams2.setMarginEnd(i3);
            layoutParams2.bottomMargin = getSafesMarginBottom();
            srf0Var.setLayoutParams(layoutParams2);
            arrayList.add(srf0Var);
        }
        b();
    }

    public static final float a(ResidentSafeLineView residentSafeLineView) {
        return residentSafeLineView.getMeasuredHeight() - residentSafeLineView.getStepsBitmap().getHeight();
    }

    public static final int d(ResidentSafeLineView residentSafeLineView) {
        return (residentSafeLineView.getStepsSize().b * 90) / 100;
    }

    public static final Bitmap e(Context context, ResidentSafeLineView residentSafeLineView) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_resident_steps), residentSafeLineView.getStepsSize().f20530a, residentSafeLineView.getStepsSize().b, true);
    }

    private final float getBitmapX() {
        return ((Number) this.i.getValue()).floatValue();
    }

    private final float getBitmapY() {
        return ((Number) this.h.getValue()).floatValue();
    }

    private final int getSafesHeight() {
        return ((Number) this.l.getValue()).intValue();
    }

    private final int getSafesMarginBottom() {
        return ((Number) this.k.getValue()).intValue();
    }

    private final Bitmap getStepsBitmap() {
        Object value = this.j.getValue();
        value.getClass();
        return (Bitmap) value;
    }

    private final Paint getStepsPaint() {
        return (Paint) this.g.getValue();
    }

    private final lrf0 getStepsSize() {
        return (lrf0) this.f.getValue();
    }

    public final void b() {
        this.d = 0;
        for (srf0 srf0Var : this.f46885a) {
            srf0Var.setOnApplyListener(new eme0(this, (byte) 13));
            srf0Var.a(new mrf0(15), this.e);
        }
    }

    public final krf0 c(int i) {
        if (i != 0) {
            return i != 3 ? new krf0((int) getResources().getDimension(R.dimen.space_4), (int) getResources().getDimension(R.dimen.space_4)) : new krf0((int) getResources().getDimension(R.dimen.space_4), (int) getResources().getDimension(R.dimen.space_28));
        }
        return new krf0((int) getResources().getDimension(R.dimen.space_28), (int) getResources().getDimension(R.dimen.space_4));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        canvas.drawBitmap(getStepsBitmap(), getBitmapX(), getBitmapY(), getStepsPaint());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(i, View.MeasureSpec.getSize((getStepsSize().b - (getStepsSize().b - getSafesMarginBottom())) + getSafesHeight()));
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        Iterator it = this.f46885a.iterator();
        while (it.hasNext()) {
            ((srf0) it.next()).setClickable(z);
        }
    }

    public final void setOnSafeAppliedListener(Function1<? super mrf0, Unit> function1) {
        function1.getClass();
        this.c = function1;
    }

    public final void setOnSafeClickListener(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.b = function1;
    }

    public final void setSafesState(List<mrf0> list) {
        list.getClass();
        this.d = 0;
        if (list.isEmpty()) {
            b();
            return;
        }
        for (mrf0 mrf0Var : list) {
            srf0 srf0Var = (srf0) CollectionsKt.W(mrf0Var.c - 1, this.f46885a);
            if (srf0Var != null) {
                srf0Var.setOnApplyListener(new dff0(this, list, (byte) 7));
            }
            if (srf0Var != null) {
                srf0Var.a(mrf0Var, this.e);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResidentSafeLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResidentSafeLineView(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
