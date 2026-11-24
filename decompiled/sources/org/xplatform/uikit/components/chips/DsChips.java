package org.xplatform.uikit.components.chips;

import a.bqd0;
import a.cxj;
import a.iun;
import a.iyl;
import a.lyl;
import a.mxl;
import a.t9f;
import a.uyl;
import a.wxl;
import a.wyl;
import a.xyl;
import a.yyl;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsChips extends FrameLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47240a;
    public xyl b;
    public wxl c;
    public final wyl d;
    public List e;
    public iyl f;
    public int g;
    public Function2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsChips(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.extra_large_horizontal_margin_dynamic);
        this.f47240a = getResources().getDimensionPixelSize(R.dimen.space_4);
        xyl xylVar = xyl.f41710a;
        this.b = xylVar;
        wxl wxlVar = wxl.PRIMARY;
        this.c = wxlVar;
        wyl wylVar = wyl.f39978a;
        this.d = wylVar;
        this.e = iun.f15405a;
        this.g = dimensionPixelSize;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.K, 0, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(3, 0) != 0 ? xyl.b : xylVar;
        int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (i2 != 0) {
            if (i2 == 1) {
                wxlVar = wxl.SECONDARY;
            } else if (i2 == 2) {
                wxlVar = wxl.TERTIARY;
            } else if (i2 == 3) {
                wxlVar = wxl.OVERLAY;
            }
        }
        this.c = wxlVar;
        this.d = typedArrayObtainStyledAttributes.getInt(1, 0) != 0 ? wyl.b : wylVar;
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, dimensionPixelSize);
        a();
        typedArrayObtainStyledAttributes.recycle();
        setTag("DsChips");
    }

    private final int getCorrectCustomMargin() {
        return this.g - this.f47240a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.iyl, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup, org.xplatform.uikit.components.chips.DsChips] */
    public final void a() {
        ?? lylVar;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            lylVar = new lyl(context);
        } else if (iOrdinal != 1) {
            t9f.b();
            return;
        } else {
            Context context2 = getContext();
            context2.getClass();
            lylVar = new yyl(context2);
        }
        lylVar.setStyle(this.c);
        lylVar.setSkeletonStyle(this.d);
        lylVar.setCustomHorizontalMargin(getCorrectCustomMargin());
        lylVar.setOnChipClickListener(this.h);
        if (!this.e.isEmpty()) {
            lylVar.setChips(this.e);
        }
        Object obj = this.f;
        if (obj != null) {
            removeView((View) obj);
        }
        this.f = lylVar;
        lylVar.setTag("DsChips");
        addView(lylVar);
    }

    public final void setChips(List<mxl> list) {
        list.getClass();
        this.e = list;
        iyl iylVar = this.f;
        if (iylVar != null) {
            iylVar.setChips(list);
        }
    }

    public final void setCustomHorizontalMargin(int i2) {
        this.g = i2;
        iyl iylVar = this.f;
        if (iylVar != null) {
            iylVar.setCustomHorizontalMargin(getCorrectCustomMargin());
        }
    }

    public final void setDsChipsType(xyl xylVar) {
        xylVar.getClass();
        if (this.b != xylVar) {
            this.b = xylVar;
            removeAllViews();
            a();
        }
    }

    public final void setLoading(boolean z) {
        iyl iylVar = this.f;
        if (iylVar != null) {
            iylVar.setLoading(z);
        }
    }

    public final void setOnChipClickListener(Function2<? super mxl, ? super Integer, Unit> function2) {
        this.h = function2;
        iyl iylVar = this.f;
        if (iylVar != null) {
            iylVar.setOnChipClickListener(new cxj(this, function2, (byte) 22));
        }
    }

    public final void setSelectionMode(uyl uylVar) {
        uylVar.getClass();
        iyl iylVar = this.f;
        if (iylVar != null) {
            iylVar.setSelectionMode(uylVar);
        }
    }

    public final void setStyle(wxl wxlVar) {
        wxlVar.getClass();
        if (this.c != wxlVar) {
            this.c = wxlVar;
            iyl iylVar = this.f;
            if (iylVar != null) {
                iylVar.setStyle(wxlVar);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsChips(Context context) {
        this(context, null);
        context.getClass();
    }
}
