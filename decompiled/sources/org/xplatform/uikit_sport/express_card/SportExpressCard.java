package org.xplatform.uikit_sport.express_card;

import a.a65;
import a.b1j;
import a.cem0;
import a.chl0;
import a.dil0;
import a.epv0;
import a.fet;
import a.fzk0;
import a.gil0;
import a.iun;
import a.jm40;
import a.k0d;
import a.kil0;
import a.m5d;
import a.mm40;
import a.n6l0;
import a.npo;
import a.o2e;
import a.o6l0;
import a.oil0;
import a.p6l0;
import a.ppo;
import a.pz40;
import a.q3d;
import a.q6l0;
import a.qil0;
import a.r3d;
import a.t9f;
import a.ugd;
import a.ukd;
import a.vfc;
import a.wdl0;
import a.xdl0;
import a.xgl0;
import a.y9q0;
import a.ydl0;
import a.zgl0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class SportExpressCard extends FrameLayout {
    public static final /* synthetic */ int r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f47295a;
    public final ComposeView b;
    public final FrameLayout c;
    public float d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final Paint k;
    public final RectF l;
    public final ArrayList m;
    public List n;
    public npo o;
    public chl0 p;
    public Function0 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public SportExpressCard(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, 0);
        ComposeView composeView = new ComposeView(context, null, 6);
        this.b = composeView;
        this.d = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_30);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_58);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.g = dimensionPixelSize;
        this.h = getResources().getDimensionPixelSize(R.dimen.space_6);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.i = dimensionPixelSize2;
        this.j = getResources().getDimensionPixelSize(R.dimen.space_12);
        Paint paint = new Paint(1);
        paint.setColor(m5d.b(R.attr.uikitBackgroundContent, context));
        this.k = paint;
        this.l = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        this.m = new ArrayList();
        this.n = iun.f15405a;
        this.o = npo.f23923a;
        this.p = new chl0("", "", k0d.f17460a, a65.f301a, false, false, false, false, new xgl0(-1L, 0.0d, 0.0d, "", 0, 0L, 0, 0L, false));
        this.q = new fzk0((byte) 1);
        setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, dimensionPixelSize2);
        setLayoutDirection(3);
        TextView textView = new TextView(context);
        textView.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLayoutDirection(3);
        textView.setTextDirection(5);
        cem0.n(R.style.TextStyle_Text_Medium_TextPrimary, textView);
        this.f47295a = textView;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(textView);
        addView(frameLayout);
        addView(composeView);
        setWillNotDraw(false);
    }

    public static final Unit a(SportExpressCard sportExpressCard, fet fetVar, int i) {
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            pz40 pz40VarF = e.f(sportExpressCard.p, fetVar);
            qil0 marketStyle = sportExpressCard.getMarketStyle();
            mm40 mm40VarE0 = o2e.e0(jm40.b, "CoefficientTestTag");
            boolean zI = fetVar.i(sportExpressCard);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new q6l0(sportExpressCard, (byte) 1);
                fetVar.o0(objP);
            }
            vfc.q(mm40VarE0, pz40VarF, marketStyle, (Function1) objP, null, fetVar, 6, 16);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    public static final Unit b(SportExpressCard sportExpressCard, fet fetVar, int i) {
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            pz40 pz40VarF = e.f(sportExpressCard.p, fetVar);
            qil0 marketStyle = sportExpressCard.getMarketStyle();
            boolean zI = fetVar.i(sportExpressCard);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new q6l0(sportExpressCard, (byte) 0);
                fetVar.o0(objP);
            }
            vfc.q(null, pz40VarF, marketStyle, (Function1) objP, null, fetVar, 0, 17);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final int getHeightByStyle() {
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 0) {
            return getResources().getDimensionPixelSize(R.dimen.size_138);
        }
        if (iOrdinal == 1) {
            return getResources().getDimensionPixelSize(R.dimen.size_132);
        }
        if (iOrdinal == 2) {
            return getResources().getDimensionPixelSize(R.dimen.size_148);
        }
        if (iOrdinal == 3) {
            return getResources().getDimensionPixelSize(R.dimen.size_152);
        }
        t9f.b();
        return 0;
    }

    private final qil0 getMarketStyle() {
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 0) {
            return new gil0(1, null, null, new zgl0(), 6);
        }
        if (iOrdinal == 1) {
            return new oil0((y9q0) null, (y9q0) null, new zgl0(), 6);
        }
        if (iOrdinal == 2) {
            return new kil0(null, null, new zgl0(), 14);
        }
        if (iOrdinal == 3) {
            return new dil0((y9q0) null, (y9q0) null, new zgl0(), 6);
        }
        t9f.b();
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        float f = this.d;
        canvas.drawRoundRect(this.l, f, f, this.k);
        super.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int i5 = this.g;
        int width = getWidth() - this.j;
        TextView textView = this.f47295a;
        textView.layout(paddingLeft + i5, paddingTop, width, textView.getMeasuredHeight() + paddingTop);
        int measuredHeight = textView.getMeasuredHeight() + paddingTop;
        int paddingLeft2 = getPaddingLeft();
        int paddingRight = i3 - getPaddingRight();
        FrameLayout frameLayout = this.c;
        frameLayout.layout(paddingLeft2, measuredHeight, paddingRight, frameLayout.getMeasuredHeight() + measuredHeight);
        ArrayList<ppo> arrayList = this.m;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (ppo ppoVar : arrayList) {
            ppoVar.getClass();
            arrayList2.add(ppoVar);
        }
        ?? arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((View) obj).getVisibility() == 0) {
                arrayList3.add(obj);
            }
        }
        if (z2) {
            arrayList3 = CollectionsKt.t0(arrayList3);
        }
        if (!arrayList3.isEmpty()) {
            int width2 = (((getWidth() - getPaddingLeft()) - getPaddingRight()) - ((arrayList3.size() - 1) * i5)) / arrayList3.size();
            int measuredHeight2 = frameLayout.getMeasuredHeight();
            Iterator it = arrayList3.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                int i7 = i6 + width2;
                ((View) it.next()).layout(i6, 0, i7, measuredHeight2);
                i6 = i7 + i5;
            }
        }
        this.b.layout(getPaddingLeft(), frameLayout.getMeasuredHeight() + (this.o == npo.d ? this.i : 0) + measuredHeight, getWidth() - getPaddingRight(), i4 - getPaddingBottom());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int heightByStyle = getHeightByStyle();
        this.f47295a.measure(View.MeasureSpec.makeMeasureSpec(((size - getPaddingLeft()) - getPaddingRight()) - this.i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e, 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.c.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 0), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
        ArrayList<ppo> arrayList = this.m;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (ppo ppoVar : arrayList) {
            ppoVar.getClass();
            arrayList2.add(ppoVar);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((View) obj).getVisibility() == 0) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((((size - getPaddingLeft()) - getPaddingRight()) - ((arrayList3.size() - 1) * this.g)) / arrayList3.size(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ((View) it.next()).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
        }
        this.l.set(0.0f, 0.0f, size, heightByStyle);
        setMeasuredDimension(size, heightByStyle);
    }

    public final void setCoefficient(String str) {
        str.getClass();
        this.p = chl0.a(this.p, null, str, 509);
        b1j.t(this.b, new ugd(-1814294386, true, new p6l0(this, (byte) 0)));
    }

    public final void setHeaderTitle(String str) {
        str.getClass();
        this.f47295a.setText(str);
    }

    public final void setMarketDescription(String str) {
        str.getClass();
        this.p = chl0.a(this.p, str, null, 510);
        b1j.t(this.b, new ugd(723981443, true, new p6l0(this, (byte) 1)));
    }

    public final void setSportEventList(List<o6l0> list) {
        list.getClass();
        if (Intrinsics.d(this.n, list)) {
            return;
        }
        List listD0 = CollectionsKt.D0(list, 6);
        Iterator it = listD0.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.m;
            if (!zHasNext) {
                int size = arrayList.size();
                for (int size2 = listD0.size(); size2 < size; size2++) {
                    Object obj = arrayList.get(size2);
                    obj.getClass();
                    ((View) obj).setVisibility(8);
                }
                this.n = list;
                requestLayout();
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            o6l0 o6l0Var = (o6l0) next;
            ppo ppoVar = (ppo) CollectionsKt.W(i, arrayList);
            if (ppoVar == null) {
                int iOrdinal = this.o.ordinal();
                if (iOrdinal == 0) {
                    Context context = getContext();
                    context.getClass();
                    ppoVar = new ppo(context, n6l0.f23002a);
                } else if (iOrdinal == 1) {
                    Context context2 = getContext();
                    context2.getClass();
                    ppoVar = new ppo(context2, n6l0.b);
                } else if (iOrdinal == 2) {
                    Context context3 = getContext();
                    context3.getClass();
                    ppoVar = new ppo(context3, n6l0.c);
                } else if (iOrdinal != 3) {
                    t9f.b();
                    return;
                } else {
                    Context context4 = getContext();
                    context4.getClass();
                    ppoVar = new ppo(context4, n6l0.d);
                }
                arrayList.add(ppoVar);
                this.c.addView(ppoVar);
            }
            ppoVar.setVisibility(0);
            ppoVar.setCoef(o6l0Var.b);
            ydl0 ydl0Var = o6l0Var.f24742a;
            if (ydl0Var instanceof wdl0) {
                ppoVar.setSportIcon(R.drawable.ic_1x_bonus_new);
            } else {
                if (!(ydl0Var instanceof xdl0)) {
                    t9f.b();
                    return;
                }
                LoadableImageView.h(ppoVar.f27382a, ((xdl0) ydl0Var).f40699a, epv0.U(R.drawable.ic_glyph_category_new, ppoVar.getContext()), 12);
            }
            i = i2;
        }
    }

    public final void setStyle(npo npoVar) {
        npoVar.getClass();
        this.o = npoVar;
        int iOrdinal = npoVar.ordinal();
        int i = this.i;
        TextView textView = this.f47295a;
        if (iOrdinal != 0) {
            int i2 = this.j;
            if (iOrdinal == 1) {
                cem0.n(R.style.TextStyle_Caption_Medium_L_TextPrimary, textView);
                this.e = getResources().getDimensionPixelSize(R.dimen.size_36);
                textView.setPadding(0, i2, 0, i);
                this.d = getResources().getDimensionPixelSize(R.dimen.radius_20);
                this.f = getResources().getDimensionPixelSize(R.dimen.space_46);
            } else if (iOrdinal == 2) {
                this.e = getResources().getDimensionPixelSize(R.dimen.size_36);
                textView.setPadding(0, i2, 0, this.h);
                this.d = getResources().getDimensionPixelSize(R.dimen.radius_20);
                this.f = getResources().getDimensionPixelSize(R.dimen.size_60);
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
                this.e = getResources().getDimensionPixelSize(R.dimen.size_38);
                textView.setPadding(0, i2, 0, i);
                this.d = getResources().getDimensionPixelSize(R.dimen.radius_20);
                this.f = getResources().getDimensionPixelSize(R.dimen.size_58);
            }
        } else {
            this.e = getResources().getDimensionPixelSize(R.dimen.size_30);
            textView.setPadding(0, i, 0, this.g);
            this.d = getResources().getDimensionPixelSize(R.dimen.radius_16);
            this.f = getResources().getDimensionPixelSize(R.dimen.size_58);
        }
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportExpressCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportExpressCard(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
