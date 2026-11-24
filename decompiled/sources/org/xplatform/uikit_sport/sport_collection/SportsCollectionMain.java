package org.xplatform.uikit_sport.sport_collection;

import a.cqd0;
import a.iql0;
import a.jql0;
import a.ke9;
import a.ktt0;
import a.maz;
import a.n0o0;
import a.nql0;
import a.oh60;
import a.t9f;
import a.ud9;
import a.uql0;
import a.wql0;
import a.xdr;
import a.yql0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.sport_collection.SportsCollectionMain;

/* JADX INFO: loaded from: classes6.dex */
public final class SportsCollectionMain extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wql0 f47301a;
    public final FrameLayout.LayoutParams b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public int h;
    public uql0 i;
    public xdr j;
    public final ArrayList k;
    public HorizontalScrollView l;
    public LinearLayout m;
    public int n;
    public final int o;
    public final n0o0 p;
    public final n0o0 q;

    /* JADX WARN: Illegal instructions before constructor call */
    public SportsCollectionMain(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b = 0;
        super(context, attributeSet, 0);
        this.b = new FrameLayout.LayoutParams(-1, -2);
        this.c = "";
        this.d = "";
        this.e = "";
        this.i = uql0.e;
        this.k = new ArrayList();
        this.n = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.o = getResources().getDimensionPixelSize(R.dimen.space_40);
        this.p = maz.b(new Function0(this) { // from class: a.mql0
            public final /* synthetic */ SportsCollectionMain b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                SportsCollectionMain sportsCollectionMain = this.b;
                switch (b2) {
                    case 0:
                        return new ke9(new m0x(sportsCollectionMain.f, null, 6), sportsCollectionMain.e.toString());
                    default:
                        return new ud9(new m0x(sportsCollectionMain.g, null, 6), sportsCollectionMain.d.toString());
                }
            }
        });
        final byte b2 = 1;
        this.q = maz.b(new Function0(this) { // from class: a.mql0
            public final /* synthetic */ SportsCollectionMain b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                SportsCollectionMain sportsCollectionMain = this.b;
                switch (b3) {
                    case 0:
                        return new ke9(new m0x(sportsCollectionMain.f, null, 6), sportsCollectionMain.e.toString());
                    default:
                        return new ud9(new m0x(sportsCollectionMain.g, null, 6), sportsCollectionMain.d.toString());
                }
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqd0.h, 0, 0);
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 6);
        this.c = strP == null ? "" : strP;
        String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context, 0);
        this.d = strP2 == null ? "" : strP2;
        String strP3 = ktt0.p(typedArrayObtainStyledAttributes, context, 2);
        this.e = strP3 != null ? strP3 : "";
        this.f = typedArrayObtainStyledAttributes.getResourceId(9, 0);
        this.g = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final ud9 getButtonAllUiModel() {
        return (ud9) this.q.getValue();
    }

    private final ke9 getButtonFilterUiModel() {
        return (ke9) this.p.getValue();
    }

    private final void setSportCollection(wql0 wql0Var) {
        this.f47301a = wql0Var;
    }

    private final void setStyle(int i) {
        wql0 wql0Var = this.f47301a;
        if (wql0Var != null) {
            wql0Var.setStyle(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ViewGroup viewGroup, int i) {
        wql0 wql0Var = (wql0) viewGroup;
        setSportCollection(wql0Var);
        wql0Var.e(this.n);
        setStyle(i);
        addView(viewGroup, this.b);
    }

    public final void b(ArrayList arrayList, oh60 oh60Var) {
        LinearLayout linearLayout = this.m;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        HorizontalScrollView horizontalScrollView = this.l;
        if (horizontalScrollView != null) {
            horizontalScrollView.removeAllViews();
        }
        removeView(this.l);
        this.l = null;
        this.m = null;
        wql0 wql0Var = this.f47301a;
        if (wql0Var != null) {
            wql0Var.a();
        }
        ArrayList arrayList2 = this.k;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        int i = this.h;
        if (i != 2132017988 && i != 0) {
            arrayList2.add(0, new iql0(getButtonAllUiModel()));
            arrayList2.add(new jql0(getButtonFilterUiModel()));
            arrayList = arrayList2;
        }
        List listL0 = CollectionsKt.L0(arrayList);
        wql0 wql0Var2 = this.f47301a;
        if (wql0Var2 != null) {
            wql0Var2.b(listL0, oh60Var);
        }
    }

    public final RecyclerView getRecyclerView() {
        wql0 wql0Var = this.f47301a;
        if (wql0Var != null) {
            return wql0Var.getRecyclerView();
        }
        return null;
    }

    public final void setOnButtonClickTypeListener(xdr xdrVar) {
        xdrVar.getClass();
        this.j = xdrVar;
        wql0 wql0Var = this.f47301a;
        if (wql0Var != null) {
            wql0Var.setSportCollectionClickListener(xdrVar);
        }
    }

    public final void setType(uql0 uql0Var) {
        wql0 wql0Var;
        wql0 wql0Var2;
        wql0 wql0Var3;
        uql0Var.getClass();
        if (this.i == uql0Var) {
            return;
        }
        this.i = uql0Var;
        Object obj = this.f47301a;
        View view = obj instanceof View ? (View) obj : null;
        if (view != null) {
            removeView(view);
        }
        int iOrdinal = uql0Var.ordinal();
        if (iOrdinal == 0) {
            this.n = getResources().getDimensionPixelSize(R.dimen.space_4);
            this.h = R.style.SportsCollectionSimple_RectangleS_WithHeader;
            a(new yql0(new ContextThemeWrapper(getContext(), R.style.SportCollectionWithHeader), this.c, this.d, this.f), this.h);
        } else if (iOrdinal == 1) {
            this.n = getResources().getDimensionPixelSize(R.dimen.space_8);
            this.h = R.style.SportsCollectionSimple_CircleWithLabel;
            Context context = getContext();
            context.getClass();
            a(new nql0(context), this.h);
        } else if (iOrdinal == 2) {
            this.n = getResources().getDimensionPixelSize(R.dimen.space_4);
            this.h = R.style.SportsCollectionSimple_RectangleS;
            Context context2 = getContext();
            context2.getClass();
            a(new nql0(context2), this.h);
        } else if (iOrdinal == 3) {
            this.n = getResources().getDimensionPixelSize(R.dimen.space_4);
            this.h = R.style.SportsCollectionSimple_RectangleM;
            Context context3 = getContext();
            context3.getClass();
            a(new nql0(context3), this.h);
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return;
            }
            this.n = getResources().getDimensionPixelSize(R.dimen.space_4);
            this.h = R.style.SportsCollectionSimple_RectangleL;
            Context context4 = getContext();
            context4.getClass();
            a(new nql0(context4), this.h);
        }
        xdr xdrVar = this.j;
        if (xdrVar != null && (wql0Var3 = this.f47301a) != null) {
            wql0Var3.setSportCollectionClickListener(xdrVar);
        }
        ArrayList arrayList = this.k;
        if (!arrayList.isEmpty() && (wql0Var2 = this.f47301a) != null) {
            wql0Var2.b(arrayList, null);
        }
        int i = this.h;
        if (i == 0 || (wql0Var = this.f47301a) == null) {
            return;
        }
        wql0Var.setStyle(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportsCollectionMain(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportsCollectionMain(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
