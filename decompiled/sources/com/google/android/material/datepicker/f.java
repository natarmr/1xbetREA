package com.google.android.material.datepicker;

import a.a4n0;
import a.ajv0;
import a.ani0;
import a.bcm0;
import a.bjv0;
import a.d7x;
import a.epv0;
import a.ett0;
import a.hny;
import a.igu0;
import a.k5d;
import a.ki30;
import a.l910;
import a.n6x;
import a.ofx;
import a.oi30;
import a.plc;
import a.rgu0;
import a.rp90;
import a.rpd0;
import a.sik;
import a.twn;
import a.wsz;
import a.ycm0;
import a.yiv0;
import a.z55;
import a.ziv0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class f<S> extends sik {
    public final LinkedHashSet Y1;
    public final LinkedHashSet Z1;
    public int a2;
    public rp90 b2;
    public CalendarConstraints c2;
    public e d2;
    public int e2;
    public CharSequence f2;
    public boolean g2;
    public int h2;
    public int i2;
    public CharSequence j2;
    public int k2;
    public CharSequence l2;
    public int m2;
    public CharSequence n2;
    public int o2;
    public CharSequence p2;
    public TextView q2;
    public CheckableImageButton r2;
    public ki30 s2;
    public boolean t2;
    public CharSequence u2;
    public CharSequence v2;

    public f() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.Y1 = new LinkedHashSet();
        this.Z1 = new LinkedHashSet();
    }

    public static int J0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(ett0.b());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i = month.d;
        return twn.b(i, 1, dimensionPixelOffset2, (dimensionPixelSize * i) + (dimensionPixelOffset * 2));
    }

    public static boolean K0(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(n6x.U(context, R.attr.materialCalendarStyle, e.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        Context contextO0 = o0();
        o0();
        int i = this.a2;
        if (i == 0) {
            I0();
            throw null;
        }
        Dialog dialog = new Dialog(contextO0, i);
        Context context = dialog.getContext();
        this.g2 = K0(android.R.attr.windowFullscreen, context);
        this.s2 = new ki30(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, rpd0.A, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.s2.o(context);
        this.s2.s(ColorStateList.valueOf(color));
        this.s2.r(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void I0() {
        if (this.g.getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        hny.b();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        this.a2 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            hny.b();
            return;
        }
        this.c2 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            hny.b();
            return;
        }
        this.e2 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.h2 = bundle.getInt("INPUT_MODE_KEY");
        this.i2 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.j2 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.k2 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.l2 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.m2 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.n2 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.o2 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.p2 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f2;
        if (text == null) {
            text = o0().getResources().getText(this.e2);
        }
        this.u2 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), Separators.RETURN);
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.v2 = text;
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.g2 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.g2) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(J0(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(J0(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.r2 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.q2 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.r2.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.r2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, epv0.U(R.drawable.material_ic_calendar_black_24dp, context));
        stateListDrawable.addState(new int[0], epv0.U(R.drawable.material_ic_edit_black_24dp, context));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.r2.setChecked(this.h2 != 0);
        rgu0.o(this.r2, null);
        CheckableImageButton checkableImageButton2 = this.r2;
        this.r2.setContentDescription(this.h2 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.r2;
        a4n0.l(this.r2, this.h2 == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.r2.setOnClickListener(new l910(this, (byte) 5));
        I0();
        throw null;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        super.f0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.a2);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints calendarConstraints = this.c2;
        b bVar = new b();
        long j = calendarConstraints.f45564a.f;
        long j2 = calendarConstraints.b.f;
        bVar.f45568a = Long.valueOf(calendarConstraints.d.f);
        int i = calendarConstraints.e;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.c;
        e eVar = this.d2;
        Month month = eVar == null ? null : eVar.K1;
        if (month != null) {
            bVar.f45568a = Long.valueOf(month.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthB = Month.b(j);
        Month monthB2 = Month.b(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.f45568a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthB, monthB2, dateValidator2, l == null ? null : Month.b(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.e2);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2);
        bundle.putInt("INPUT_MODE_KEY", this.h2);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.i2);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.j2);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.k2);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.l2);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.m2);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.n2);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.o2);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.p2);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        rp90 rp90Var;
        int iE;
        ycm0 ziv0Var;
        ycm0 ziv0Var2;
        super.g0();
        Window window = D0().getWindow();
        if (this.g2) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.s2);
            if (!this.t2) {
                View viewFindViewById = q0().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListF = plc.F(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListF != null ? Integer.valueOf(colorStateListF.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                Integer numY = d7x.y(android.R.attr.colorBackground, window.getContext());
                int iIntValue = numY != null ? numY.intValue() : -16777216;
                if (z2) {
                    numValueOf = Integer.valueOf(iIntValue);
                }
                bcm0.x(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                if (i < 27) {
                    Integer numY2 = d7x.y(android.R.attr.navigationBarColor, context);
                    iE = k5d.e(numY2 != null ? numY2.intValue() : -16777216, 128);
                } else {
                    iE = 0;
                }
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(iE);
                }
                boolean z3 = d7x.D(0) || d7x.D(numValueOf.intValue());
                ani0 ani0Var = new ani0(window.getDecorView());
                if (i >= 35) {
                    ziv0Var = new bjv0(window, ani0Var);
                } else if (i >= 30) {
                    ziv0Var = new ajv0(window, ani0Var);
                } else {
                    ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
                }
                ziv0Var.w(z3);
                boolean zD = d7x.D(iIntValue);
                if (d7x.D(iE) || (iE == 0 && zD)) {
                    z = true;
                }
                ani0 ani0Var2 = new ani0(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    ziv0Var2 = new bjv0(window, ani0Var2);
                } else if (i2 >= 30) {
                    ziv0Var2 = new ajv0(window, ani0Var2);
                } else {
                    ziv0Var2 = i2 >= 26 ? new ziv0(window, ani0Var2) : new yiv0(window, ani0Var2);
                }
                ziv0Var2.v(z);
                z55 z55Var = new z55(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), (byte) 3);
                WeakHashMap weakHashMap = rgu0.f30456a;
                igu0.c(viewFindViewById, z55Var);
                this.t2 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = G().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.s2, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ofx(D0(), rect));
        }
        o0();
        int i3 = this.a2;
        if (i3 == 0) {
            I0();
            throw null;
        }
        Fragment fragmentJ = C().J(this.h2 == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG");
        rp90 rp90Var2 = fragmentJ instanceof rp90 ? (rp90) fragmentJ : null;
        if (rp90Var2 == null) {
            if (this.h2 == 1) {
                I0();
                CalendarConstraints calendarConstraints = this.c2;
                oi30 oi30Var = new oi30();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i3);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
                oi30Var.s0(bundle);
                rp90Var = oi30Var;
            } else {
                I0();
                CalendarConstraints calendarConstraints2 = this.c2;
                e eVar = new e();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i3);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", calendarConstraints2.d);
                eVar.s0(bundle2);
                this.d2 = eVar;
                rp90Var = eVar;
            }
            rp90Var2 = rp90Var;
        }
        this.b2 = rp90Var2;
        rp90Var2.x0(new wsz());
        this.q2.setText((this.h2 == 1 && G().getConfiguration().orientation == 2) ? this.v2 : this.u2);
        I0();
        throw null;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void h0() {
        this.b2.H1.clear();
        super.h0();
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.Y1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.Z1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.l1;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
