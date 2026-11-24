package a;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class lxp0 extends FrameLayout implements zse {
    public int A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20826a;
    public String b;
    public String c;
    public vjp0 d;
    public g3h0 e;
    public g3h0 f;
    public int f1;
    public g3h0 g;
    public int g1;
    public final int h;
    public int h1;
    public final int i;
    public int i1;
    public final int j;
    public int j1;
    public final int k;
    public int k1;
    public final int l;
    public int l1;
    public final int m;
    public final int n;
    public final a8z o;
    public final a8z p;
    public final a8z q;
    public final a8z r;
    public final a8z s;
    public final TextPaint t;
    public int u;
    public int v;
    public StaticLayout w;
    public StaticLayout x;
    public StaticLayout y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxp0(Context context) {
        super(context, null, 0);
        context.getClass();
        final byte b = 0;
        this.f20826a = "";
        this.b = "";
        this.c = "";
        this.d = vjp0.f37541a;
        pip0 pip0Var = pip0.DEFAULT;
        this.e = new g3h0("", "", pip0Var, "", pip0Var);
        this.f = new g3h0("", "", pip0Var, "", pip0Var);
        this.g = new g3h0("", "", pip0Var, "", pip0Var);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_14);
        this.h = dimensionPixelSize;
        this.i = getResources().getDimensionPixelSize(R.dimen.size_28);
        this.j = getResources().getDimensionPixelSize(R.dimen.size_24);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.k = dimensionPixelSize2;
        this.l = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.m = getResources().getDimensionPixelSize(R.dimen.space_8);
        final byte b2 = 2;
        this.n = (dimensionPixelSize2 * 2) + dimensionPixelSize;
        wez wezVar = wez.b;
        this.o = maz.a(wezVar, new Function0(this) { // from class: a.kxp0
            public final /* synthetic */ lxp0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                lxp0 lxp0Var = this.b;
                switch (b3) {
                    case 0:
                        return lxp0.b(lxp0Var);
                    case 1:
                        return lxp0.i(lxp0Var);
                    default:
                        return lxp0.j(lxp0Var);
                }
            }
        });
        final byte b3 = 1;
        this.p = maz.a(wezVar, new Function0(this) { // from class: a.kxp0
            public final /* synthetic */ lxp0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                lxp0 lxp0Var = this.b;
                switch (b4) {
                    case 0:
                        return lxp0.b(lxp0Var);
                    case 1:
                        return lxp0.i(lxp0Var);
                    default:
                        return lxp0.j(lxp0Var);
                }
            }
        });
        this.q = maz.a(wezVar, new Function0(this) { // from class: a.kxp0
            public final /* synthetic */ lxp0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b2;
                lxp0 lxp0Var = this.b;
                switch (b4) {
                    case 0:
                        return lxp0.b(lxp0Var);
                    case 1:
                        return lxp0.i(lxp0Var);
                    default:
                        return lxp0.j(lxp0Var);
                }
            }
        });
        this.r = maz.a(wezVar, new yip0(context, this, (byte) 4));
        this.s = maz.a(wezVar, new hrf0(context, (byte) 24));
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Regular_M_TextPrimary);
        this.t = textPaint;
        setWillNotDraw(false);
    }

    public static final List b(lxp0 lxp0Var) {
        return lxp0Var.getNewScoreCellsColumn();
    }

    public static int c(StaticLayout staticLayout) {
        if (staticLayout != null) {
            return staticLayout.getWidth();
        }
        return 0;
    }

    private final List<f3h0> getGameScoreCellsColumn() {
        return (List) this.o.getValue();
    }

    private final List<f3h0> getNewScoreCellsColumn() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), R.style.Widget_ScoreCell_TennisScore);
        List<f3h0> listJ = q3d.j(new f3h0(contextThemeWrapper), new f3h0(contextThemeWrapper));
        Iterator<T> it = listJ.iterator();
        while (it.hasNext()) {
            addView((f3h0) it.next());
        }
        return listJ;
    }

    private final Animation getRotateAnimation() {
        return (Animation) this.s.getValue();
    }

    private final ImageView getServeIndicator() {
        return (ImageView) this.r.getValue();
    }

    private final List<f3h0> getSetScoreCellsColumn() {
        return (List) this.p.getValue();
    }

    private final int getTotalMeasuredHeight() {
        StaticLayout staticLayout = this.y;
        Integer numValueOf = Integer.valueOf(staticLayout != null ? staticLayout.getHeight() : 0);
        if (this.f20826a.length() <= 0 && this.b.length() <= 0 && this.c.length() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int i = this.j * 2;
        int i2 = this.l;
        Integer numValueOf2 = (this.A > 0 || this.B > 0 || this.f1 > 0) ? Integer.valueOf(i + i2 + this.m) : null;
        return iIntValue + (numValueOf2 != null ? numValueOf2.intValue() : 0) + i2;
    }

    private final List<f3h0> getTotalScoreCellsColumn() {
        return (List) this.q.getValue();
    }

    public static void h(List list, g3h0 g3h0Var) {
        f3h0 f3h0Var = (f3h0) CollectionsKt.firstOrNull(list);
        if (f3h0Var != null) {
            f3h0Var.setTeamScore(g3h0Var.b);
        }
        f3h0 f3h0Var2 = (f3h0) CollectionsKt.W(1, list);
        if (f3h0Var2 != null) {
            f3h0Var2.setTeamScore(g3h0Var.d);
        }
        f3h0 f3h0Var3 = (f3h0) CollectionsKt.firstOrNull(list);
        if (f3h0Var3 != null) {
            f3h0Var3.setTeamScoreState(g3h0Var.c);
        }
        f3h0 f3h0Var4 = (f3h0) CollectionsKt.W(1, list);
        if (f3h0Var4 != null) {
            f3h0Var4.setTeamScoreState(g3h0Var.e);
        }
    }

    public static final List i(lxp0 lxp0Var) {
        return lxp0Var.getNewScoreCellsColumn();
    }

    public static final List j(lxp0 lxp0Var) {
        return lxp0Var.getNewScoreCellsColumn();
    }

    public final void a(Canvas canvas, StaticLayout staticLayout, float f) {
        if (getLayoutDirection() == 1) {
            f = (getMeasuredWidth() - c(staticLayout)) - f;
        }
        canvas.save();
        canvas.translate(f, 0.0f);
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    public final int d(List list) {
        f3h0 f3h0Var = (f3h0) CollectionsKt.firstOrNull(list);
        int measuredWidth = f3h0Var != null ? f3h0Var.getMeasuredWidth() : 0;
        Integer numValueOf = Integer.valueOf((this.k * 2) + measuredWidth);
        if (measuredWidth <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final StaticLayout e(int i, String str) {
        if (str.length() <= 0) {
            return null;
        }
        return xdx.I(f1t0.L(str), this.t, i, 1, TextUtils.TruncateAt.END, 0, null, 3568);
    }

    public final void f(int i, List list) {
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            f3h0 f3h0Var = (f3h0) obj;
            Integer numValueOf = i2 == 0 ? Integer.valueOf(this.u) : null;
            int iIntValue = numValueOf != null ? numValueOf.intValue() : this.v;
            jmu0.f(i, iIntValue, f3h0Var.getMeasuredWidth() + i, f3h0Var.getMeasuredHeight() + iIntValue, f3h0Var, this);
            i2 = i3;
        }
    }

    public final void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f3h0) it.next()).measure(View.MeasureSpec.makeMeasureSpec(this.i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        a(canvas, this.w, this.j1);
        a(canvas, this.x, this.k1);
        a(canvas, this.y, this.l1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        if (this.e.b.length() > 0 && this.e.d.length() > 0) {
            f(this.g1, getGameScoreCellsColumn());
        }
        if (this.f.b.length() > 0 && this.f.d.length() > 0) {
            f(this.h1, getSetScoreCellsColumn());
        }
        if (this.g.b.length() > 0 && this.g.d.length() > 0) {
            f(this.i1, getTotalScoreCellsColumn());
        }
        if (this.d != vjp0.f37541a) {
            ImageView serveIndicator = getServeIndicator();
            int i5 = this.z;
            int i6 = this.k;
            int i7 = this.h;
            jmu0.f(i6, i5, i6 + i7, i5 + i7, serveIndicator, this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        g(getGameScoreCellsColumn());
        this.A = d(getGameScoreCellsColumn());
        g(getSetScoreCellsColumn());
        this.B = d(getSetScoreCellsColumn());
        g(getTotalScoreCellsColumn());
        this.f1 = d(getTotalScoreCellsColumn());
        String str = this.f20826a;
        String str2 = this.A > 0 ? str : null;
        if (str2 == null) {
            str2 = "";
        }
        TextPaint textPaint = this.t;
        this.w = e(Math.min((int) textPaint.measureText(str), this.A), str2);
        String str3 = this.b;
        String str4 = this.B > 0 ? str3 : null;
        this.x = e(Math.min((int) textPaint.measureText(str3), this.B), str4 != null ? str4 : "");
        String str5 = this.c;
        this.y = e(Math.min((int) textPaint.measureText(str5), this.f1), str5);
        int i3 = this.n;
        Integer numValueOf = Integer.valueOf(i3);
        vjp0 vjp0Var = this.d;
        vjp0 vjp0Var2 = vjp0.f37541a;
        if (vjp0Var == vjp0Var2) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (this.A > 0 && c(this.w) > 0) {
            this.j1 = ((this.A / 2) + iIntValue) - (c(this.w) / 2);
        }
        if (this.B > 0 && c(this.x) > 0) {
            this.k1 = ((this.B / 2) + (this.A + iIntValue)) - (c(this.x) / 2);
        }
        if (this.f1 > 0 && c(this.y) > 0) {
            this.l1 = ((this.f1 / 2) + ((iIntValue + this.A) + this.B)) - (c(this.y) / 2);
        }
        StaticLayout staticLayout = this.y;
        int height = (staticLayout != null ? staticLayout.getHeight() : 0) + this.l;
        this.u = height;
        int i4 = this.j;
        this.v = height + i4 + this.m;
        Integer numValueOf2 = Integer.valueOf(i3);
        if (this.d == vjp0Var2) {
            numValueOf2 = null;
        }
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        int i5 = this.k;
        this.g1 = iIntValue2 + i5;
        int i6 = iIntValue2 + this.A;
        this.h1 = i6 + i5;
        this.i1 = i6 + this.B + i5;
        this.z = ((i4 / 2) + (this.d == vjp0.b ? this.u : this.v)) - (this.h / 2);
        Integer numValueOf3 = this.d != vjp0Var2 ? Integer.valueOf(i3) : null;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((numValueOf3 != null ? numValueOf3.intValue() : 0) + this.A + this.B + this.f1, 1073741824), View.MeasureSpec.makeMeasureSpec(getTotalMeasuredHeight(), 1073741824));
    }

    @Override // a.zse
    public void setScoreUiModel(yse yseVar) {
        yseVar.getClass();
        xse xseVar = yseVar instanceof xse ? (xse) yseVar : null;
        if (xseVar == null) {
            return;
        }
        g3h0 g3h0Var = xseVar.c;
        g3h0 g3h0Var2 = xseVar.b;
        g3h0 g3h0Var3 = xseVar.f41412a;
        this.f20826a = g3h0Var3.f10612a;
        this.e = g3h0Var3;
        h(getGameScoreCellsColumn(), g3h0Var3);
        this.b = g3h0Var2.f10612a;
        this.f = g3h0Var2;
        h(getSetScoreCellsColumn(), g3h0Var2);
        this.c = g3h0Var.f10612a;
        this.g = g3h0Var;
        h(getTotalScoreCellsColumn(), g3h0Var);
        vjp0 vjp0Var = xseVar.d;
        this.d = vjp0Var;
        if (vjp0Var != vjp0.f37541a) {
            getServeIndicator().setVisibility(0);
            getServeIndicator().startAnimation(getRotateAnimation());
        } else {
            getServeIndicator().clearAnimation();
            getServeIndicator().setVisibility(8);
        }
        invalidate();
        requestLayout();
    }
}
