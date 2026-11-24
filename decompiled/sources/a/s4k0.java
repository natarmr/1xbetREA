package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;

/* JADX INFO: loaded from: classes6.dex */
public final class s4k0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextThemeWrapper f31611a;
    public DsTeamLogo b;
    public DsTeamLogo c;
    public String d;
    public String e;
    public final int f;
    public final int g;
    public final int h;
    public final TextView i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4k0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f31611a = new ContextThemeWrapper(context, R.style.Widget_DSSportTeamLogo);
        this.d = "";
        this.e = "";
        this.f = getResources().getDimensionPixelSize(R.dimen.text_12);
        this.g = getResources().getDimensionPixelSize(R.dimen.text_14);
        this.h = getResources().getDimensionPixelSize(R.dimen.text_1);
        TextView textView = new TextView(context);
        cem0.n(R.style.TextStyle_Text_Medium_TextPrimary, textView);
        textView.setMaxLines(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        addView(textView);
        this.i = textView;
        this.j = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.k = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.l = getResources().getDimensionPixelSize(R.dimen.size_54);
        this.m = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.n = getResources().getDimensionPixelSize(R.dimen.space_2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private final int getTeamNameGravity() {
        boolean z;
        if (this.p) {
            z = getLayoutDirection() == 1;
        }
        if (z && this.o) {
            return 8388611;
        }
        if (z) {
            return 8388613;
        }
        return this.o ? 3 : 5;
    }

    private final void setPlaceholderImageDrawable(DsTeamLogo dsTeamLogo) {
        dsTeamLogo.setImageDrawable(dsTeamLogo.getContext().getDrawable(R.drawable.ic_glyph_placeholder_player_secondary60));
    }

    private final void setTeamLogos(efp0 efp0Var) {
        if (Intrinsics.d(efp0Var, bfp0.f2514a)) {
            this.d = "";
            View view = this.b;
            if (view != null) {
                if (view.getParent() != null) {
                    removeView(view);
                }
                this.b = null;
            }
            this.e = "";
            View view2 = this.c;
            if (view2 != null) {
                if (view2.getParent() != null) {
                    removeView(view2);
                }
                this.c = null;
                return;
            }
            return;
        }
        if (!(efp0Var instanceof cfp0)) {
            if (!(efp0Var instanceof dfp0)) {
                t9f.b();
                return;
            }
            this.e = "";
            View view3 = this.c;
            if (view3 != null) {
                if (view3.getParent() != null) {
                    removeView(view3);
                }
                this.c = null;
            }
            a(((dfp0) efp0Var).f6010a);
            return;
        }
        cfp0 cfp0Var = (cfp0) efp0Var;
        a(cfp0Var.f4275a);
        String str = cfp0Var.b;
        if (this.c == null) {
            DsTeamLogo dsTeamLogo = new DsTeamLogo(this.f31611a, null);
            addView(dsTeamLogo);
            this.c = dsTeamLogo;
        }
        if (str.length() == 0) {
            DsTeamLogo dsTeamLogo2 = this.c;
            if (dsTeamLogo2 != null) {
                setPlaceholderImageDrawable(dsTeamLogo2);
                return;
            }
            return;
        }
        if (Intrinsics.d(this.e, str)) {
            return;
        }
        this.e = str;
        DsTeamLogo dsTeamLogo3 = this.c;
        if (dsTeamLogo3 != null) {
            dsTeamLogo3.post(new riz(dsTeamLogo3, str, new r4k0(this, (byte) 0), (byte) 1));
        }
    }

    public final void a(String str) {
        if (this.b == null) {
            DsTeamLogo dsTeamLogo = new DsTeamLogo(this.f31611a, null);
            addView(dsTeamLogo);
            this.b = dsTeamLogo;
        }
        if (str.length() == 0) {
            DsTeamLogo dsTeamLogo2 = this.b;
            if (dsTeamLogo2 != null) {
                setPlaceholderImageDrawable(dsTeamLogo2);
                return;
            }
            return;
        }
        if (Intrinsics.d(this.d, str)) {
            return;
        }
        this.d = str;
        DsTeamLogo dsTeamLogo3 = this.b;
        if (dsTeamLogo3 != null) {
            dsTeamLogo3.post(new riz(dsTeamLogo3, str, new r4k0(this, (byte) 1), (byte) 1));
        }
    }

    public final void b(String str, efp0 efp0Var) {
        str.getClass();
        this.i.setText(str);
        setTeamLogos(efp0Var);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.p;
        TextView textView = this.i;
        if (z2 && getLayoutDirection() == 1) {
            int i5 = this.w;
            jmu0.f(i5, this.s, textView.getMeasuredWidth() + i5, textView.getMeasuredHeight() + this.s, textView, this);
            DsTeamLogo dsTeamLogo = this.b;
            if (dsTeamLogo != null) {
                int i6 = this.v;
                int i7 = this.t;
                int i8 = this.q;
                jmu0.f(i6, i7, i6 + i8, i8 + i7, dsTeamLogo, this);
            }
            DsTeamLogo dsTeamLogo2 = this.c;
            if (dsTeamLogo2 != null) {
                int i9 = this.v;
                int i10 = this.u;
                int i11 = this.q;
                jmu0.f(i9, i10, i9 + i11, i11 + i10, dsTeamLogo2, this);
                return;
            }
            return;
        }
        int i12 = this.w;
        textView.layout(i12, this.s, textView.getMeasuredWidth() + i12, textView.getMeasuredHeight() + this.s);
        DsTeamLogo dsTeamLogo3 = this.b;
        if (dsTeamLogo3 != null) {
            int i13 = this.v;
            int i14 = this.t;
            int i15 = this.q;
            dsTeamLogo3.layout(i13, i14, i13 + i15, i15 + i14);
        }
        DsTeamLogo dsTeamLogo4 = this.c;
        if (dsTeamLogo4 != null) {
            int i16 = this.v;
            int i17 = this.u;
            int i18 = this.q;
            dsTeamLogo4.layout(i16, i17, i16 + i18, i18 + i17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        DsTeamLogo dsTeamLogo = this.b;
        if (dsTeamLogo == null && this.c == null) {
            i3 = 0;
        } else if (dsTeamLogo != null && this.c == null) {
            i3 = this.k;
        } else if (dsTeamLogo == null || this.c == null) {
            i3 = 0;
        } else {
            i3 = this.j;
        }
        this.q = i3;
        Integer numValueOf = Integer.valueOf(i3 + this.m);
        if (this.b == null) {
            numValueOf = null;
        }
        this.r = numValueOf != null ? numValueOf.intValue() : 0;
        int size2 = View.MeasureSpec.getSize(i) - this.r;
        int i4 = this.g;
        int i5 = this.h;
        TextView textView = this.i;
        aem0.r(textView, this.f, i4, i5, 0);
        textView.setTextDirection(1);
        textView.setTextAlignment(1);
        textView.setGravity(getTeamNameGravity() | 16);
        textView.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), i2);
        int i6 = this.l;
        Integer numValueOf2 = Integer.valueOf((i6 / 2) - (textView.getMeasuredHeight() / 2));
        if (i6 <= textView.getMeasuredHeight()) {
            numValueOf2 = null;
        }
        this.s = numValueOf2 != null ? numValueOf2.intValue() : 0;
        Integer num = this.o ? null : 0;
        this.w = num != null ? num.intValue() : this.r;
        int iMax = Math.max(i6, textView.getMeasuredHeight());
        DsTeamLogo dsTeamLogo2 = this.c;
        int i7 = this.q;
        int i8 = this.n;
        int i9 = dsTeamLogo2 != null ? ((iMax / 2) - (i8 / 2)) - i7 : (iMax / 2) - (i7 / 2);
        this.t = i9;
        this.u = i9 + i7 + i8;
        Integer numValueOf3 = this.o ? null : Integer.valueOf(size - i7);
        this.v = numValueOf3 != null ? numValueOf3.intValue() : 0;
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
        setTag("TEAM_NAME_TEXT_VIEW");
        setContentDescription(textView.getText());
    }

    public final void setReversedOrder(boolean z) {
        this.o = z;
        requestLayout();
    }

    public final void setRtlSupportEnabled(boolean z) {
        this.p = z;
        requestLayout();
    }
}
