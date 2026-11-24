package a;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/b8t;", "La/yx5;", "<init>", "()V", "games_mania"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b8t extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(b8t.class, "binding", "getBinding()Lorg/xplatform/games_mania/databinding/GamesManiaGameFragmentBinding;", 0)};
    public final i9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final kiu0 N1;
    public List O1;
    public final n0o0 P1;

    public b8t() {
        super(R.layout.games_mania_game_fragment);
        this.K1 = i9o0.f14396a;
        this.L1 = ltt0.o(this, y7t.f42169a);
        v7t v7tVar = new v7t(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new t7t(new t7t(this, (byte) 1), (byte) 2));
        this.N1 = agc.G(this, sre0.f32672a.b(a9t.class), new r6p(a8zVarA, (byte) 18), new r6p(a8zVarA, (byte) 19), v7tVar);
        this.O1 = iun.f15405a;
        this.P1 = maz.b(new v7t(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        this.O1 = q3d.j((ImageView) H0().k.d, (ImageView) H0().k.f, (ImageView) H0().k.g, (ImageView) H0().k.e, (ImageView) H0().k.c, (ImageView) H0().k.j, (ImageView) H0().k.l, (ImageView) H0().k.m, (ImageView) H0().k.k, (ImageView) H0().k.i, (ImageView) H0().k.n, (ImageView) H0().k.p, (ImageView) H0().k.q, (ImageView) H0().k.o, (ImageView) H0().k.n);
        dyb.O(H0().i, new x7t(this, (byte) 1));
        dyb.O((Button) H0().k.h, new x7t(this, (byte) 2));
        H0().d.setOnTouchListener(new jw5(this, (byte) 7));
        H0().f.setDiceListener$games_mania(new x7t(this, (byte) 3));
        H0().f.setDiceShownListener$games_mania(new v7t(this, (byte) 2));
        GamesManiaMapView gamesManiaMapView = H0().g;
        gamesManiaMapView.i.setAlpha(127);
        gamesManiaMapView.h.setAlpha(10);
        Paint paint = gamesManiaMapView.d;
        paint.setColor(gamesManiaMapView.getContext().getColor(R.color.games_mania_color_noactive_cell));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = gamesManiaMapView.e;
        paint2.setColor(gamesManiaMapView.getContext().getColor(R.color.games_mania_color_noactive_cell_stroke));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(2.0f);
        Paint paint3 = gamesManiaMapView.c;
        paint3.setColor(gamesManiaMapView.getContext().getColor(R.color.games_mania_tooltip));
        paint3.setStyle(Paint.Style.FILL);
        Paint paint4 = gamesManiaMapView.f;
        paint4.setColor(-1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(3.0f);
        Paint paint5 = gamesManiaMapView.g;
        paint5.setAntiAlias(true);
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setTypeface(Typeface.SANS_SERIF);
        GamesManiaMapView gamesManiaMapView2 = H0().g;
        gamesManiaMapView2.setPuzzleCellListener$games_mania(new jar(this, (byte) 19));
        gamesManiaMapView2.setGamesManiaGameResultListener$games_mania(new d2s(this, gamesManiaMapView2, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        cii ciiVar;
        Fragment fragment = this.y;
        u7t u7tVar = fragment instanceof u7t ? (u7t) fragment : null;
        if (u7tVar == null || (ciiVar = (cii) u7tVar.W1.getValue()) == null) {
            return;
        }
        this.M1 = new fiu0(Collections.singletonMap(a9t.class, ciiVar.m0));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = I0().o;
        yje yjeVar = null;
        gkr gkrVar = new gkr(this, yjeVar, (byte) 7);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fns(p7m0Var, clzVarW, gkrVar, (yje) null), 3);
        p7m0 p7m0Var2 = I0().r;
        a8t a8tVar = new a8t(this, yjeVar, (byte) 4);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fns(p7m0Var2, clzVarW2, a8tVar, (yje) null, 0), 3);
        p7m0 p7m0Var3 = I0().s;
        a8t a8tVar2 = new a8t(this, yjeVar, (byte) 0);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new fns(p7m0Var3, clzVarW3, a8tVar2, (yje) null), 3);
        p7m0 p7m0Var4 = I0().t;
        a8t a8tVar3 = new a8t(this, yjeVar, (byte) 1);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new fns((gmq) p7m0Var4, clzVarW4, a8tVar3, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var5 = I0().p;
        lkz lkzVar2 = lkz.f20223a;
        a8t a8tVar4 = new a8t(this, yjeVar, (byte) 2);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new fns((gmq) p7m0Var5, clzVarW5, a8tVar4, (yje) null, (char) 0), 3);
        xae0 xae0VarN = vtb.N(I0().q);
        a8t a8tVar5 = new a8t(this, yjeVar, (byte) 3);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new fns(xae0VarN, clzVarW6, a8tVar5, (yje) null), 3);
    }

    public final void G0(k7t k7tVar, List list, boolean z) {
        GamesManiaMapView gamesManiaMapView = H0().g;
        k7tVar.getClass();
        List list2 = k7tVar.e;
        list.getClass();
        if (gamesManiaMapView.j == 0) {
            int measuredWidth = (gamesManiaMapView.getMeasuredWidth() - (gamesManiaMapView.f46720a * 4)) / 5;
            gamesManiaMapView.j = measuredWidth;
            gamesManiaMapView.g.setTextSize(measuredWidth / 2.7f);
            Bitmap bitmap = gamesManiaMapView.k;
            int i = gamesManiaMapView.j;
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i, false);
            bitmapCreateScaledBitmap.getClass();
            gamesManiaMapView.k = bitmapCreateScaledBitmap;
            Bitmap bitmap2 = gamesManiaMapView.l;
            int i2 = gamesManiaMapView.j;
            Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap2, i2, i2, false);
            bitmapCreateScaledBitmap2.getClass();
            gamesManiaMapView.l = bitmapCreateScaledBitmap2;
            Bitmap bitmap3 = gamesManiaMapView.m;
            int i3 = gamesManiaMapView.j;
            Bitmap bitmapCreateScaledBitmap3 = Bitmap.createScaledBitmap(bitmap3, i3, i3, false);
            bitmapCreateScaledBitmap3.getClass();
            gamesManiaMapView.m = bitmapCreateScaledBitmap3;
        }
        gamesManiaMapView.t = 0;
        gamesManiaMapView.u1 = z ? m9t.c : m9t.b;
        List list3 = k7tVar.f;
        ArrayList arrayListR = GamesManiaMapView.r(list2);
        gamesManiaMapView.n = arrayListR;
        gamesManiaMapView.w = list2;
        gamesManiaMapView.n(arrayListR, list3, list2);
        gamesManiaMapView.q = 1;
        gamesManiaMapView.s = k7tVar.f17839a;
        List list4 = k7tVar.b;
        list4.getClass();
        gamesManiaMapView.A = zys0.b(list4);
        gamesManiaMapView.f(list3, gamesManiaMapView.n);
        gamesManiaMapView.h1 = list;
        H0().g.invalidate();
    }

    public final c8t H0() {
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        return (c8t) objN;
    }

    public final a9t I0() {
        return (a9t) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        I0().w = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        if (!I0().w) {
            H0().f3931a.getViewTreeObserver().removeOnGlobalLayoutListener((z7t) this.P1.getValue());
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        if (I0().w) {
            I0().B();
        } else {
            H0().f3931a.getViewTreeObserver().addOnGlobalLayoutListener((z7t) this.P1.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        AnimatorSet animatorSet = H0().f.b;
        if (animatorSet != null) {
            animatorSet.end();
        }
        this.j1 = true;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
