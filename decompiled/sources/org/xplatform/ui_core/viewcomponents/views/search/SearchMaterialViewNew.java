package org.xplatform.ui_core.viewcomponents.views.search;

import a.aqd0;
import a.b4d;
import a.bkb;
import a.dgh0;
import a.egh0;
import a.epv0;
import a.hie0;
import a.j5d;
import a.kie0;
import a.mie0;
import a.q14;
import a.vcc;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchMaterialViewNew extends d {
    public static final /* synthetic */ int U1 = 0;
    public final EditText J1;
    public final View K1;
    public final View L1;
    public int M1;
    public int N1;
    public int O1;
    public int P1;
    public boolean Q1;
    public boolean R1;
    public int S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMaterialViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewFindViewById = findViewById(R.id.search_src_text);
        viewFindViewById.getClass();
        EditText editText = (EditText) viewFindViewById;
        this.J1 = editText;
        View viewFindViewById2 = findViewById(R.id.search_edit_frame);
        viewFindViewById2.getClass();
        this.K1 = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.search_plate);
        viewFindViewById3.getClass();
        this.L1 = viewFindViewById3;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.space_8);
        this.N1 = getResources().getDimensionPixelOffset(R.dimen.space_16);
        this.O1 = getResources().getDimensionPixelOffset(R.dimen.space_4);
        this.P1 = getResources().getDimensionPixelOffset(R.dimen.space_4);
        this.R1 = true;
        TypedValue typedValue = j5d.f15927a;
        this.S1 = j5d.a(context, R.attr.uikitBackground, false);
        setAttributes(attributeSet);
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(dimensionPixelOffset);
        }
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
        layoutParams3.getClass();
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.setMarginStart(this.M1);
        layoutParams4.setMarginEnd(this.N1);
        layoutParams4.topMargin = this.O1;
        layoutParams4.bottomMargin = this.P1;
        Context context2 = getContext();
        context2.getClass();
        editText.setTextColor(j5d.a(context2, R.attr.uikitTextPrimary, false));
        Context context3 = getContext();
        context3.getClass();
        editText.setHintTextColor(j5d.a(context3, R.attr.uikitSecondary, false));
        Drawable drawableU = epv0.U(R.drawable.view_search_corner_new, getContext());
        if (drawableU != null) {
            int i = this.S1;
            b4d b4dVar = b4d.f1952a;
            vcc.b0(drawableU, i);
        }
        viewFindViewById2.setBackground(drawableU);
        viewFindViewById3.setBackground(drawableU);
        setIconifiedByDefault(false);
        setText(R.string.input_query_message);
        setMaxLength(100);
    }

    private final void setAttributes(AttributeSet attributeSet) {
        if (attributeSet != null) {
            Context context = getContext();
            context.getClass();
            q14 q14Var = new q14(context, attributeSet, aqd0.u);
            TypedArray typedArray = q14Var.b;
            try {
                try {
                    this.Q1 = typedArray.getBoolean(5, this.Q1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    this.S1 = typedArray.getColor(4, this.S1);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                try {
                    this.O1 = typedArray.getDimensionPixelSize(3, this.O1);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                try {
                    this.P1 = typedArray.getDimensionPixelSize(0, this.P1);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                try {
                    this.M1 = typedArray.getDimensionPixelSize(2, this.M1);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                try {
                    this.N1 = typedArray.getDimensionPixelSize(1, this.N1);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                q14Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(q14Var, th);
                    throw th2;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Drawable drawableU;
        super.onAttachedToWindow();
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.search_mag_icon);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(R.id.search_close_btn);
        Drawable drawable = null;
        if (this.Q1 && (drawableU = epv0.U(R.drawable.ic_search_new, getContext())) != null) {
            TypedValue typedValue = j5d.f15927a;
            Context context = getContext();
            context.getClass();
            drawableU.setTint(j5d.a(context, R.attr.uikitSecondary, false));
            drawable = drawableU;
        }
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setVisibility(this.Q1 ? 0 : 8);
        appCompatImageView2.setImageResource(R.drawable.ic_close_material_new);
    }

    @Override // androidx.appcompat.widget.d
    public void setIconified(boolean z) {
        if (this.r1 == z && this.R1) {
            return;
        }
        super.setIconified(z);
    }

    public final void setIgnorePrevIconifiedValue(boolean z) {
        this.R1 = z;
    }

    public final void setMaxLength(int i) {
        hie0 hie0Var = new hie0();
        mie0 mie0Var = new mie0();
        mie0Var.f21842a = "";
        mie0 mie0Var2 = new mie0();
        mie0Var2.f21842a = "";
        this.J1.addTextChangedListener(new egh0(hie0Var, mie0Var, i, new kie0(), mie0Var2, this));
    }

    public final void setOnFocusChangeListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.J1.setOnFocusChangeListener(new dgh0(function1, (byte) 0));
    }

    public final void setSearchText(String str) {
        str.getClass();
        this.J1.setText(str);
    }

    public final void setText(int i) {
        setQueryHint(getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchMaterialViewNew(Context context) {
        this(context, null);
        context.getClass();
    }
}
