package a;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;

/* JADX INFO: loaded from: classes6.dex */
public final class siz extends FrameLayout implements due {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextThemeWrapper f32284a;
    public DsTeamLogo b;
    public DsTeamLogo c;
    public DsTeamLogo d;
    public DsTeamLogo e;
    public String f;
    public String g;
    public String h;
    public String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public StaticLayout p;
    public StaticLayout q;
    public String r;
    public String s;
    public int t;
    public int u;
    public int v;
    public final n0o0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public siz(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f32284a = new ContextThemeWrapper(context, R.style.Widget_DSSportTeamLogo_Size24);
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.l = getResources().getDimensionPixelSize(R.dimen.size_24);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_32);
        this.m = dimensionPixelSize;
        this.n = dimensionPixelSize * 2;
        this.o = dimensionPixelSize / 2;
        this.r = "";
        this.s = "";
        this.w = maz.b(new i7q(context, (byte) 14));
        setWillNotDraw(false);
        setTag("LeftSideTeamsViewTestTag");
    }

    private final TextPaint getTextTextPaint() {
        return (TextPaint) this.w.getValue();
    }

    private final void setBottomTeamLogos(efp0 efp0Var) {
        if (Intrinsics.d(efp0Var, bfp0.f2514a)) {
            this.h = "";
            DsTeamLogo dsTeamLogo = this.d;
            if (dsTeamLogo != null) {
                if (dsTeamLogo.getParent() != null) {
                    removeView(dsTeamLogo);
                }
                this.d = null;
            }
            this.i = "";
            DsTeamLogo dsTeamLogo2 = this.e;
            if (dsTeamLogo2 != null) {
                if (dsTeamLogo2.getParent() != null) {
                    removeView(dsTeamLogo2);
                }
                this.e = null;
                return;
            }
            return;
        }
        if (!(efp0Var instanceof cfp0)) {
            if (!(efp0Var instanceof dfp0)) {
                t9f.b();
                return;
            }
            b(((dfp0) efp0Var).f6010a);
            this.i = "";
            DsTeamLogo dsTeamLogo3 = this.e;
            if (dsTeamLogo3 != null) {
                if (dsTeamLogo3.getParent() != null) {
                    removeView(dsTeamLogo3);
                }
                this.e = null;
                return;
            }
            return;
        }
        cfp0 cfp0Var = (cfp0) efp0Var;
        b(cfp0Var.f4275a);
        String str = cfp0Var.b;
        if (this.e == null) {
            this.e = c();
        }
        if (str.length() == 0) {
            DsTeamLogo dsTeamLogo4 = this.e;
            if (dsTeamLogo4 != null) {
                setPlaceholderImageDrawable(dsTeamLogo4);
                return;
            }
            return;
        }
        if (Intrinsics.d(this.i, str)) {
            return;
        }
        this.i = str;
        DsTeamLogo dsTeamLogo5 = this.e;
        if (dsTeamLogo5 != null) {
            dsTeamLogo5.post(new riz(dsTeamLogo5, str, new qiz(this, (byte) 1), (byte) 0));
        }
    }

    private final void setPlaceholderImageDrawable(DsTeamLogo dsTeamLogo) {
        dsTeamLogo.setImageDrawable(dsTeamLogo.getContext().getDrawable(R.drawable.ic_glyph_placeholder_player_secondary60));
    }

    private final void setTopTeamLogos(efp0 efp0Var) {
        if (Intrinsics.d(efp0Var, bfp0.f2514a)) {
            this.f = "";
            DsTeamLogo dsTeamLogo = this.b;
            if (dsTeamLogo != null) {
                if (dsTeamLogo.getParent() != null) {
                    removeView(dsTeamLogo);
                }
                this.b = null;
            }
            this.g = "";
            DsTeamLogo dsTeamLogo2 = this.c;
            if (dsTeamLogo2 != null) {
                if (dsTeamLogo2.getParent() != null) {
                    removeView(dsTeamLogo2);
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
            d(((dfp0) efp0Var).f6010a);
            this.g = "";
            DsTeamLogo dsTeamLogo3 = this.c;
            if (dsTeamLogo3 != null) {
                if (dsTeamLogo3.getParent() != null) {
                    removeView(dsTeamLogo3);
                }
                this.c = null;
                return;
            }
            return;
        }
        cfp0 cfp0Var = (cfp0) efp0Var;
        d(cfp0Var.f4275a);
        String str = cfp0Var.b;
        if (this.c == null) {
            this.c = c();
        }
        if (str.length() == 0) {
            DsTeamLogo dsTeamLogo4 = this.c;
            if (dsTeamLogo4 != null) {
                setPlaceholderImageDrawable(dsTeamLogo4);
                return;
            }
            return;
        }
        if (Intrinsics.d(this.g, str)) {
            return;
        }
        this.g = str;
        DsTeamLogo dsTeamLogo5 = this.c;
        if (dsTeamLogo5 != null) {
            dsTeamLogo5.post(new riz(dsTeamLogo5, str, new qiz(this, (byte) 2), (byte) 0));
        }
    }

    public final void a(float f, float f2, Canvas canvas, StaticLayout staticLayout) {
        if (getLayoutDirection() == 1) {
            f = (getMeasuredWidth() - (staticLayout != null ? staticLayout.getWidth() : 0)) - f;
        }
        canvas.save();
        canvas.translate(f, f2);
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(String str) {
        if (this.d == null) {
            this.d = c();
        }
        if (str.length() == 0) {
            DsTeamLogo dsTeamLogo = this.d;
            if (dsTeamLogo != null) {
                setPlaceholderImageDrawable(dsTeamLogo);
                return;
            }
            return;
        }
        if (Intrinsics.d(this.h, str)) {
            return;
        }
        this.h = str;
        DsTeamLogo dsTeamLogo2 = this.d;
        if (dsTeamLogo2 != null) {
            dsTeamLogo2.post(new riz(dsTeamLogo2, str, new qiz(this, (byte) 0), (byte) 0));
        }
    }

    public final DsTeamLogo c() {
        DsTeamLogo dsTeamLogo = new DsTeamLogo(this.f32284a, null);
        addView(dsTeamLogo);
        return dsTeamLogo;
    }

    public final void d(String str) {
        if (this.b == null) {
            this.b = c();
        }
        if (str.length() == 0) {
            DsTeamLogo dsTeamLogo = this.b;
            if (dsTeamLogo != null) {
                setPlaceholderImageDrawable(dsTeamLogo);
                return;
            }
            return;
        }
        if (Intrinsics.d(this.f, str)) {
            return;
        }
        this.f = str;
        DsTeamLogo dsTeamLogo2 = this.b;
        if (dsTeamLogo2 != null) {
            dsTeamLogo2.post(new riz(dsTeamLogo2, str, new qiz(this, (byte) 3), (byte) 0));
        }
    }

    public final void e(int i, DsTeamLogo dsTeamLogo, DsTeamLogo dsTeamLogo2) {
        siz sizVar;
        int i2 = this.l;
        int i3 = i - (i2 / 2);
        if (dsTeamLogo != null) {
            sizVar = this;
            jmu0.f(0, i3, i2, i3 + i2, dsTeamLogo, sizVar);
        } else {
            sizVar = this;
        }
        if (dsTeamLogo2 != null) {
            int i4 = sizVar.j;
            int i5 = sizVar.l;
            int i6 = i5 + i4;
            jmu0.f(i6, i3, i6 + i5, i3 + i5, dsTeamLogo2, sizVar);
        }
    }

    public final String getFirstTeamName() {
        return this.r;
    }

    public final String getSecondTeamName() {
        return this.s;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        a(this.t, this.u, canvas, this.p);
        int i = this.m;
        int i2 = (i / 2) + i;
        StaticLayout staticLayout = this.q;
        a(this.t, i2 - ((staticLayout != null ? staticLayout.getHeight() : 0) / 2), canvas, this.q);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e(this.o, this.b, this.c);
        int i5 = this.m;
        e((i5 / 2) + i5, this.d, this.e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.l;
        Integer numValueOf = Integer.valueOf(i3);
        if (this.b == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int i4 = this.j + i3;
        Integer numValueOf2 = Integer.valueOf(i4);
        if (this.c == null) {
            numValueOf2 = null;
        }
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        Integer numValueOf3 = Integer.valueOf(i3);
        if (this.d == null) {
            numValueOf3 = null;
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
        Integer numValueOf4 = Integer.valueOf(i4);
        if (this.e == null) {
            numValueOf4 = null;
        }
        int iMax = Math.max(iIntValue + iIntValue2, iIntValue3 + (numValueOf4 != null ? numValueOf4.intValue() : 0));
        Integer numValueOf5 = Integer.valueOf(this.k);
        if (this.b == null && this.c == null && this.d == null && this.e == null) {
            numValueOf5 = null;
        }
        this.v = iMax + (numValueOf5 != null ? numValueOf5.intValue() : 0);
        int size = View.MeasureSpec.getSize(i) - this.v;
        this.p = this.r.length() > 0 ? xdx.I(f1t0.L(this.r), getTextTextPaint(), size, 2, TextUtils.TruncateAt.END, 0, null, 3568) : null;
        this.q = this.s.length() > 0 ? xdx.I(f1t0.L(this.s), getTextTextPaint(), size, 2, TextUtils.TruncateAt.END, 0, null, 3568) : null;
        this.t = this.v;
        int i5 = this.m / 2;
        StaticLayout staticLayout = this.p;
        this.u = i5 - ((staticLayout != null ? staticLayout.getHeight() : 0) / 2);
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(this.n, 1073741824));
    }

    @Override // a.due
    public void setTeamsUiModel(cue cueVar) {
        cueVar.getClass();
        bue bueVar = cueVar instanceof bue ? (bue) cueVar : null;
        if (bueVar == null) {
            return;
        }
        this.r = bueVar.f3226a;
        this.s = bueVar.b;
        setTopTeamLogos(bueVar.c);
        setBottomTeamLogos(bueVar.d);
        requestLayout();
    }
}
