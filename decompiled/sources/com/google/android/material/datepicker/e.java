package com.google.android.material.datepicker;

import a.a4n0;
import a.ai30;
import a.bi30;
import a.c46;
import a.ci30;
import a.cu;
import a.hny;
import a.jw20;
import a.qkv;
import a.rgu0;
import a.rp90;
import a.tk80;
import a.uij;
import a.wh;
import a.wsz;
import a.y63;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class e<S> extends rp90 {
    public int I1;
    public CalendarConstraints J1;
    public Month K1;
    public int L1;
    public cu M1;
    public RecyclerView N1;
    public RecyclerView O1;
    public View P1;
    public View Q1;
    public View R1;
    public View S1;
    public MaterialButton U1;
    public AccessibilityManager V1;
    public tk80 W1;
    public boolean X1;

    public final void A0(int i) {
        this.L1 = i;
        if (i == 2) {
            this.N1.getLayoutManager().H0(this.K1.c - ((j) this.N1.getAdapter()).d.J1.f45564a.c);
            this.R1.setVisibility(0);
            this.S1.setVisibility(8);
            this.P1.setVisibility(8);
            this.Q1.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.R1.setVisibility(8);
            this.S1.setVisibility(0);
            this.P1.setVisibility(0);
            this.Q1.setVisibility(0);
            z0(this.K1);
        }
    }

    public final void B0(View view) {
        if (view == null) {
            return;
        }
        int i = this.L1;
        if (i == 2) {
            rgu0.p(view, H(R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            rgu0.p(view, H(R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void C0() {
        Month month;
        i iVar = (i) this.O1.getAdapter();
        if (iVar == null || this.X1 || (month = this.K1) == null || month.equals(iVar.h)) {
            return;
        }
        int iA = iVar.A(iVar.h);
        iVar.h = month;
        int iA2 = iVar.A(month);
        iVar.h(iA);
        iVar.h(iA2);
    }

    public final void D0(int i) {
        View view = this.Q1;
        if (view != null) {
            view.setEnabled(i + 1 < this.O1.getAdapter().d());
        }
        View view2 = this.P1;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        this.I1 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            hny.b();
            return;
        }
        this.J1 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.K1 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            hny.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(D(), this.I1);
        this.M1 = new cu(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.V1 = (AccessibilityManager) o0().getSystemService("accessibility");
        Month month = this.J1.f45564a;
        boolean zK0 = f.K0(android.R.attr.windowFullscreen, contextThemeWrapper);
        this.X1 = zK0;
        byte b = 0;
        byte b2 = 1;
        if (zK0) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = o0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = h.d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        rgu0.o(gridView, new bi30(b));
        int i4 = this.J1.e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new uij(i4) : new uij()));
        gridView.setNumColumns(month.d);
        gridView.setEnabled(false);
        this.O1 = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.O1.setLayoutManager(new ci30(this, D(), i2, i2));
        this.O1.setTag("MONTHS_VIEW_GROUP_TAG");
        i iVar = new i(contextThemeWrapper, this.J1, new c(this), new jw20((Object) this, (byte) 2));
        this.O1.setAdapter(iVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.N1 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.N1.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.N1.setAdapter(new j(this));
            this.N1.m(new qkv(this));
        }
        if (!this.X1) {
            tk80 tk80Var = new tk80();
            this.W1 = tk80Var;
            tk80Var.b(this.O1);
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.U1 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            rgu0.o(this.U1, new c46(this, (byte) 6));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.P1 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            a4n0.l(this.P1, H(R.string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.Q1 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            a4n0.l(this.Q1, H(R.string.mtrl_picker_next_month_tooltip));
            this.R1 = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.S1 = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            A0(1);
            this.U1.setText(this.K1.d());
            this.O1.o(new d(this, iVar));
            this.U1.setOnClickListener(new wh(this, (byte) 3));
            this.Q1.setOnClickListener(new ai30(this, iVar, b));
            this.P1.setOnClickListener(new ai30(this, iVar, b2));
            D0(iVar.A(this.K1));
        }
        this.O1.y0(iVar.A(this.K1));
        rgu0.o(this.O1, new bi30(b2));
        B0(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.I1);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.J1);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.K1);
    }

    @Override // a.rp90
    public final void x0(wsz wszVar) {
        this.H1.add(wszVar);
    }

    public final boolean y0(boolean z) {
        Month month;
        if (this.X1) {
            return false;
        }
        if (this.O1.getScrollState() != 0) {
            return true;
        }
        i iVar = (i) this.O1.getAdapter();
        if (iVar == null || (month = this.K1) == null) {
            return false;
        }
        int iA = iVar.A(month) + (z ? 1 : -1);
        if (iA < 0 || iA >= iVar.d.g) {
            return false;
        }
        iVar.i = z ? 2 : 1;
        z0(iVar.z(iA));
        return true;
    }

    public final void z0(Month month) {
        i iVar = (i) this.O1.getAdapter();
        int iA = iVar.A(month);
        AccessibilityManager accessibilityManager = this.V1;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iA2 = iA - iVar.A(this.K1);
            boolean z = Math.abs(iA2) > 3;
            boolean z2 = iA2 > 0;
            this.K1 = month;
            byte b = 2;
            if (z && z2) {
                this.O1.y0(iA - 3);
                this.O1.post(new y63(this, iA, b));
            } else {
                RecyclerView recyclerView = this.O1;
                if (z) {
                    recyclerView.y0(iA + 3);
                    this.O1.post(new y63(this, iA, b));
                } else {
                    recyclerView.post(new y63(this, iA, b));
                }
            }
        } else {
            this.K1 = month;
            this.O1.y0(iA);
        }
        C0();
        D0(iA);
    }
}
