package org.xplatform.game_broadcasting.impl.presentation.video;

import a.a8z;
import a.bkx;
import a.c4m0;
import a.ctr;
import a.d5c;
import a.dfu0;
import a.e0g0;
import a.elo;
import a.ey;
import a.fhu0;
import a.gwj;
import a.gys;
import a.hsj;
import a.huj;
import a.j0g0;
import a.kin0;
import a.kkx;
import a.l1e0;
import a.maz;
import a.myj;
import a.nsr;
import a.nyj;
import a.qem0;
import a.qjj;
import a.rwj;
import a.sje;
import a.sqs;
import a.tvk;
import a.ulo;
import a.wen;
import a.wez;
import a.xx50;
import a.y0x0;
import a.yje;
import a.ys10;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.media3.common.MediaItem;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public final class GameVideoView extends ctr {
    public static final /* synthetic */ int u = 0;
    public final a8z b;
    public final View c;
    public final GameBroadcastingControlPanelView d;
    public final ImageView e;
    public final ProgressBar f;
    public Function0 g;
    public Function0 h;
    public String i;
    public ulo j;
    public boolean k;
    public Bitmap l;
    public int m;
    public int n;
    public boolean o;
    public sje p;
    public final dfu0 q;
    public c4m0 r;
    public boolean s;
    public final gys t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = maz.a(wez.b, new nsr((Object) this, (Object) this, (byte) 2));
        this.c = getBinding().c;
        this.d = getBinding().g;
        this.e = getBinding().e;
        this.f = getBinding().d;
        this.g = new sqs((byte) 8);
        this.h = new sqs((byte) 9);
        this.i = "";
        this.k = true;
        this.q = new dfu0();
        this.t = new gys(this);
        setBackgroundColor(context.getColor(R.color.static_black));
        getBinding().e.setImageResource(R.drawable.ic_glyph_sound_on);
        getBinding().d.setLayerType(1, null);
    }

    private final fhu0 getBinding() {
        return (fhu0) this.b.getValue();
    }

    public static TextureView j(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof TextureView) {
            return (TextureView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        Iterator it = l1e0.o(0, viewGroup.getChildCount()).iterator();
        while (((kkx) it).c) {
            View childAt = viewGroup.getChildAt(((bkx) it).nextInt());
            childAt.getClass();
            TextureView textureViewJ = j(childAt);
            if (textureViewJ != null) {
                return textureViewJ;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVolume(double d) {
        double d2 = 100.0d - d;
        float fLog = (float) (1.0d - ((d2 > 0.0d ? Math.log(d2) : 0.0d) / Math.log(100.0d)));
        ulo uloVar = this.j;
        if (uloVar != null) {
            uloVar.V(fLog);
        }
    }

    public final void f() {
        h();
        this.i = "";
        this.o = false;
        ulo uloVar = this.j;
        if (uloVar != null) {
            uloVar.P(false);
        }
        ulo uloVar2 = this.j;
        if (uloVar2 != null) {
            uloVar2.W();
        }
        ulo uloVar3 = this.j;
        if (uloVar3 != null) {
            uloVar3.J(0L);
        }
    }

    public final void g() {
        Bitmap bitmap;
        ulo uloVar = this.j;
        if (uloVar != null) {
            if (uloVar.y()) {
                TextureView textureViewJ = j(getBinding().f);
                if (textureViewJ != null && (bitmap = textureViewJ.getBitmap()) != null) {
                    Context context = getContext();
                    context.getClass();
                    int width = (int) (bitmap.getWidth() * 0.5f);
                    if (width < 1) {
                        width = 1;
                    }
                    int height = (int) (bitmap.getHeight() * 0.5f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height >= 1 ? height : 1, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.getClass();
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.scale(0.5f, 0.5f);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(2));
                    try {
                        y0x0.D(context, bitmapCreateBitmap);
                    } catch (RSRuntimeException unused) {
                    }
                    this.l = bitmapCreateBitmap;
                    this.m = getBinding().f.getWidth();
                    this.n = getBinding().f.getHeight();
                }
                ulo uloVar2 = this.j;
                if (uloVar2 != null) {
                    uloVar2.P(false);
                }
                ulo uloVar3 = this.j;
                if (uloVar3 != null) {
                    uloVar3.W();
                }
                ulo uloVar4 = this.j;
                if (uloVar4 != null) {
                    uloVar4.J(0L);
                }
            }
        }
        h();
        this.i = "";
        this.o = false;
        getBinding().f.setVisibility(8);
        Bitmap bitmap2 = this.l;
        if (bitmap2 == null) {
            setBackgroundColor(0);
            return;
        }
        getBinding().b.setLayoutParams(new FrameLayout.LayoutParams(this.m, this.n, 17));
        getBinding().b.setImageBitmap(bitmap2);
        getBinding().b.setVisibility(0);
    }

    @Override // a.ctr
    public View getBroadcastingContainerView() {
        return this.c;
    }

    @Override // a.ctr
    public GameBroadcastingControlPanelView getBroadcastingControlPanelView() {
        return this.d;
    }

    public final Function0<Unit> getOnMediaFileNeedReloadListener() {
        return this.h;
    }

    @Override // a.ctr
    public Function0<Unit> getOnMediaFileReddyListener() {
        return this.g;
    }

    @Override // a.ctr
    public View getSoundEnableButton() {
        return this.e;
    }

    public final void h() {
        c4m0 c4m0Var = this.r;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.r = null;
        this.q.f6017a = 0;
        this.s = false;
    }

    public final void i() {
        ulo uloVar;
        if (this.i.length() == 0) {
            return;
        }
        Context context = getContext();
        Context context2 = getContext();
        context2.getClass();
        gwj gwjVar = new gwj(new hsj(context2), new huj());
        gwjVar.g(new xx50(0, false));
        ulo uloVarA = new elo(context, gwjVar).a();
        nyj nyjVar = (nyj) uloVarA.v();
        nyjVar.getClass();
        myj myjVar = new myj(nyjVar);
        myjVar.v = true;
        uloVarA.R(new nyj(myjVar));
        this.j = uloVarA;
        getBinding().f.setPlayer(this.j);
        ulo uloVar2 = this.j;
        if (uloVar2 != null) {
            uloVar2.a(this.t);
        }
        ulo uloVar3 = this.j;
        if (uloVar3 != null) {
            uloVar3.Q(0);
        }
        getBinding().f.setUseController(false);
        try {
            e0g0 e0g0Var = j0g0.b;
            ulo uloVar4 = this.j;
            if (uloVar4 != null) {
                uloVar4.N(MediaItem.a(this.i));
            }
            ulo uloVar5 = this.j;
            if (uloVar5 != null) {
                uloVar5.E();
            }
            if (!this.o || (uloVar = this.j) == null) {
                return;
            }
            uloVar.P(true);
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
        }
    }

    public final void k() {
        h();
        n();
        getBinding().f.setVisibility(8);
    }

    public final void l() {
        if (this.s) {
            c4m0 c4m0Var = this.r;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.q.f6017a = 0;
            wen.b.getClass();
            o(0L);
        }
    }

    public final void m() {
        this.l = null;
        this.m = 0;
        this.n = 0;
        getBinding().b.setVisibility(8);
        getBinding().b.setImageBitmap(null);
        getBinding().f.setVisibility(0);
    }

    public final void n() {
        ulo uloVar = this.j;
        this.j = null;
        if (uloVar == null) {
            return;
        }
        uloVar.G(this.t);
        getBinding().f.setPlayer(null);
        try {
            e0g0 e0g0Var = j0g0.b;
            uloVar.W();
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
        }
        try {
            uloVar.F();
        } catch (Throwable unused2) {
            e0g0 e0g0Var3 = j0g0.b;
        }
    }

    public final void o(long j) {
        GameVideoView gameVideoView;
        this.s = true;
        setProgressVisible(true);
        c4m0 c4m0Var = this.r;
        c4m0 c4m0VarW = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        sje sjeVar = this.p;
        if (sjeVar != null) {
            gameVideoView = this;
            c4m0VarW = qjj.W(sjeVar, null, null, new ey(j, (Object) gameVideoView, (yje) c4m0VarW, (byte) 21), 3);
        } else {
            gameVideoView = this;
        }
        gameVideoView.r = c4m0VarW;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kin0 kin0VarE = qem0.e();
        rwj rwjVar = tvk.f34603a;
        this.p = d5c.a(e.c(kin0VarE, ys10.f43147a.x()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sje sjeVar = this.p;
        if (sjeVar != null) {
            d5c.G(sjeVar, null);
        }
        this.p = null;
        this.r = null;
        this.i = "";
        h();
        n();
    }

    public final void p() {
        f();
        setBackgroundColor(getContext().getColor(R.color.static_black));
        setProgressVisible(false);
        getBinding().b.setVisibility(8);
        getBinding().b.setImageBitmap(null);
        getBinding().f.setVisibility(8);
    }

    @Override // a.ctr
    public void setBroadcastingUrl(String str) {
        str.getClass();
        if (Intrinsics.d(this.i, str)) {
            return;
        }
        this.i = "";
        h();
        n();
        h();
        m();
        this.i = str;
        this.o = true;
        i();
    }

    public final void setOnMediaFileNeedReloadListener(Function0<Unit> function0) {
        function0.getClass();
        this.h = function0;
    }

    @Override // a.ctr
    public void setOnMediaFileReddyListener(Function0<Unit> function0) {
        function0.getClass();
        this.g = function0;
    }

    @Override // a.ctr
    public void setProgressVisible(boolean z) {
        if (!z) {
            if (this.s) {
                return;
            }
            ulo uloVar = this.j;
            if (uloVar != null && uloVar.s() == 2) {
                return;
            }
        }
        super.setProgressVisible(z);
    }

    public final void setSoundEnable(boolean z) {
        if (this.j == null || z == this.k) {
            return;
        }
        if (z) {
            setVolume(100.0d);
            getBinding().e.setImageResource(R.drawable.ic_glyph_sound_on);
            this.k = true;
        } else {
            setVolume(0.0d);
            getBinding().e.setImageResource(R.drawable.ic_glyph_sound_off);
            this.k = false;
        }
    }

    @Override // a.ctr
    public ProgressBar getProgressView() {
        return this.f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameVideoView(Context context) {
        this(context, null);
        context.getClass();
    }
}
