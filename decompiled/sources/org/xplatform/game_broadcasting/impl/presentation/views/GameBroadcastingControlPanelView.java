package org.xplatform.game_broadcasting.impl.presentation.views;

import a.a8z;
import a.dhu0;
import a.dke;
import a.e1t;
import a.epv0;
import a.i7q;
import a.maz;
import a.n0o0;
import a.nsr;
import a.p89;
import a.q3d;
import a.t9f;
import a.w3w0;
import a.wez;
import a.wgm0;
import a.wzs;
import a.x1t;
import a.yys;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingVideoLandscapeParams;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingZoneLandscapeParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.impl.navigation.BroadcastingVideoFullScreenFactory$getScreen$1;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public final class GameBroadcastingControlPanelView extends ConstraintLayout {
    public static final /* synthetic */ int A = 0;
    public final a8z q;
    public final n0o0 r;
    public final n0o0 s;
    public final n0o0 t;
    public final n0o0 u;
    public final n0o0 v;
    public final n0o0 w;
    public final n0o0 x;
    public final n0o0 y;
    public final n0o0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public GameBroadcastingControlPanelView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new nsr((Object) this, (Object) this, (byte) 0));
        this.r = maz.b(new i7q(context, (byte) 3));
        this.s = maz.b(new i7q(context, (byte) 4));
        this.t = maz.b(new i7q(context, (byte) 5));
        this.u = maz.b(new i7q(context, (byte) 6));
        this.v = maz.b(new i7q(context, (byte) 7));
        this.w = maz.b(new i7q(context, (byte) 8));
        this.x = maz.b(new i7q(context, (byte) 9));
        this.y = maz.b(new i7q(context, (byte) 10));
        this.z = maz.b(new i7q(context, (byte) 11));
        setBackground(epv0.U(R.drawable.background_control_panel, context));
        setAlpha(0.0f);
        getBinding().f.setEnabled(false);
        getBinding().f.setClickable(false);
        getBinding().e.setEnabled(false);
        getBinding().e.setClickable(false);
        getBinding().c.setEnabled(false);
        getBinding().c.setClickable(false);
        getBinding().d.setEnabled(false);
        getBinding().d.setClickable(false);
        getBinding().b.setEnabled(false);
        getBinding().b.setClickable(false);
    }

    private final dhu0 getBinding() {
        Object value = this.q.getValue();
        value.getClass();
        return (dhu0) value;
    }

    private final Drawable getFromFullscreenDrawable() {
        return (Drawable) this.w.getValue();
    }

    private final Drawable getFromWindowDrawable() {
        return (Drawable) this.u.getValue();
    }

    private final Drawable getGoToZone2DFormatDrawable() {
        return (Drawable) this.y.getValue();
    }

    private final Drawable getGoToZone3DFormatDrawable() {
        return (Drawable) this.z.getValue();
    }

    private final Drawable getPauseDrawable() {
        return (Drawable) this.r.getValue();
    }

    private final Drawable getPlayDrawable() {
        return (Drawable) this.s.getValue();
    }

    private final Drawable getStopDrawable() {
        return (Drawable) this.x.getValue();
    }

    private final Drawable getToFullscreenDrawable() {
        return (Drawable) this.v.getValue();
    }

    private final Drawable getToWindowDrawable() {
        return (Drawable) this.t.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        List listJ = q3d.j(getBinding().e, getBinding().c, getBinding().d, getBinding().f, getBinding().b);
        ArrayList<ImageView> arrayList = new ArrayList();
        for (Object obj : listJ) {
            ImageView imageView = (ImageView) obj;
            imageView.getClass();
            if (imageView.getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        for (ImageView imageView2 : arrayList) {
            imageView2.getClass();
            wgm0.t(imageView2, this, R.dimen.space_12, R.dimen.space_12);
        }
    }

    public final void setPlayDrawable(boolean z) {
        getBinding().c.setImageDrawable(z ? getPauseDrawable() : getPlayDrawable());
    }

    public final void setZoneFormatDrawable(w3w0 w3w0Var) {
        Drawable goToZone2DFormatDrawable;
        w3w0Var.getClass();
        ImageView imageView = getBinding().f;
        int iOrdinal = w3w0Var.ordinal();
        if (iOrdinal == 0) {
            goToZone2DFormatDrawable = getGoToZone2DFormatDrawable();
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            goToZone2DFormatDrawable = getGoToZone3DFormatDrawable();
        }
        imageView.setImageDrawable(goToZone2DFormatDrawable);
    }

    public final void setZoneFormatIsVisible(boolean z) {
        getBinding().f.setVisibility(z ? 0 : 8);
    }

    public final void u(dke dkeVar) {
        dkeVar.getClass();
        final byte b = 2;
        final byte b2 = 1;
        final byte b3 = 0;
        if (dkeVar instanceof yys) {
            final yys yysVar = (yys) dkeVar;
            ImageView imageView = getBinding().e;
            imageView.setImageDrawable(getToWindowDrawable());
            imageView.setOnClickListener(new View.OnClickListener() { // from class: a.ksr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    byte b4 = b3;
                    yje yjeVar = null;
                    yys yysVar2 = yysVar;
                    switch (b4) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            yysVar2.getClass();
                            p39 p39Var = p39.WINDOWED;
                            v39 v39Var = v39.VIDEO;
                            xex xexVar = yysVar2.A;
                            GameBroadcastingParams gameBroadcastingParams = yysVar2.b;
                            xexVar.N(p39Var, v39Var, gameBroadcastingParams.d, gameBroadcastingParams.g, gameBroadcastingParams.f46691a);
                            p7m0 p7m0Var = yysVar2.B;
                            do {
                                value = p7m0Var.getValue();
                            } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 393215)));
                            p7m0 p7m0Var2 = yysVar2.C;
                            ows owsVar = new ows(new jcs(yysVar2, (byte) 9));
                            p7m0Var2.getClass();
                            p7m0Var2.o(null, owsVar);
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var3 = yysVar2.B;
                            if (!((ixs) p7m0Var3.getValue()).f) {
                                do {
                                    value2 = p7m0Var3.getValue();
                                } while (!p7m0Var3.m(value2, ixs.a((ixs) value2, 0L, null, true, false, false, false, null, false, false, null, false, null, false, false, 524255)));
                                yysVar2.D();
                            } else {
                                p39 p39Var2 = p39.PAUSE;
                                v39 v39Var2 = v39.VIDEO;
                                xex xexVar2 = yysVar2.A;
                                GameBroadcastingParams gameBroadcastingParams2 = yysVar2.b;
                                xexVar2.N(p39Var2, v39Var2, gameBroadcastingParams2.d, gameBroadcastingParams2.g, gameBroadcastingParams2.f46691a);
                                do {
                                    value3 = p7m0Var3.getValue();
                                } while (!p7m0Var3.m(value3, ixs.a((ixs) value3, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 524191)));
                                yysVar2.B();
                                yysVar2.A();
                            }
                            break;
                        default:
                            int i3 = GameBroadcastingControlPanelView.A;
                            yysVar2.getClass();
                            p39 p39Var3 = p39.FULLSCREEN;
                            v39 v39Var3 = v39.VIDEO;
                            xex xexVar3 = yysVar2.A;
                            GameBroadcastingParams gameBroadcastingParams3 = yysVar2.b;
                            xexVar3.N(p39Var3, v39Var3, gameBroadcastingParams3.d, gameBroadcastingParams3.g, gameBroadcastingParams3.f46691a);
                            p7m0 p7m0Var4 = yysVar2.B;
                            do {
                                value4 = p7m0Var4.getValue();
                            } while (!p7m0Var4.m(value4, ixs.a((ixs) value4, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 393215)));
                            p7m0 p7m0Var5 = yysVar2.C;
                            nws nwsVar = nws.b;
                            p7m0Var5.getClass();
                            p7m0Var5.o(null, nwsVar);
                            yysVar2.f.b();
                            yysVar2.B();
                            sac.V(jiu0.a(yysVar2), uys.f36506a, null, yysVar2.p.f22085a, new sys(yysVar2, yjeVar, (byte) 1), 10);
                            ali aliVar = yysVar2.c;
                            BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams = new BroadcastingVideoLandscapeParams(((ixs) p7m0Var4.getValue()).f15558a, ((ixs) p7m0Var4.getValue()).b, ((ixs) p7m0Var4.getValue()).d, ((ixs) p7m0Var4.getValue()).c, ((ixs) p7m0Var4.getValue()).e, false);
                            i1w0 i1w0VarC = ((oeg0) aliVar.f1068a).c();
                            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            FragmentScreen broadcastingVideoFullScreenFactory$getScreen$1 = new BroadcastingVideoFullScreenFactory$getScreen$1(broadcastingVideoLandscapeParams);
                            if (broadcastingVideoFullScreenFactory$getScreen$1 instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) broadcastingVideoFullScreenFactory$getScreen$1)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(broadcastingVideoFullScreenFactory$getScreen$1)));
                            }
                            ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                paw pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            getBinding().c.setOnClickListener(new View.OnClickListener() { // from class: a.ksr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    byte b4 = b2;
                    yje yjeVar = null;
                    yys yysVar2 = yysVar;
                    switch (b4) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            yysVar2.getClass();
                            p39 p39Var = p39.WINDOWED;
                            v39 v39Var = v39.VIDEO;
                            xex xexVar = yysVar2.A;
                            GameBroadcastingParams gameBroadcastingParams = yysVar2.b;
                            xexVar.N(p39Var, v39Var, gameBroadcastingParams.d, gameBroadcastingParams.g, gameBroadcastingParams.f46691a);
                            p7m0 p7m0Var = yysVar2.B;
                            do {
                                value = p7m0Var.getValue();
                            } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 393215)));
                            p7m0 p7m0Var2 = yysVar2.C;
                            ows owsVar = new ows(new jcs(yysVar2, (byte) 9));
                            p7m0Var2.getClass();
                            p7m0Var2.o(null, owsVar);
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var3 = yysVar2.B;
                            if (!((ixs) p7m0Var3.getValue()).f) {
                                do {
                                    value2 = p7m0Var3.getValue();
                                } while (!p7m0Var3.m(value2, ixs.a((ixs) value2, 0L, null, true, false, false, false, null, false, false, null, false, null, false, false, 524255)));
                                yysVar2.D();
                            } else {
                                p39 p39Var2 = p39.PAUSE;
                                v39 v39Var2 = v39.VIDEO;
                                xex xexVar2 = yysVar2.A;
                                GameBroadcastingParams gameBroadcastingParams2 = yysVar2.b;
                                xexVar2.N(p39Var2, v39Var2, gameBroadcastingParams2.d, gameBroadcastingParams2.g, gameBroadcastingParams2.f46691a);
                                do {
                                    value3 = p7m0Var3.getValue();
                                } while (!p7m0Var3.m(value3, ixs.a((ixs) value3, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 524191)));
                                yysVar2.B();
                                yysVar2.A();
                            }
                            break;
                        default:
                            int i3 = GameBroadcastingControlPanelView.A;
                            yysVar2.getClass();
                            p39 p39Var3 = p39.FULLSCREEN;
                            v39 v39Var3 = v39.VIDEO;
                            xex xexVar3 = yysVar2.A;
                            GameBroadcastingParams gameBroadcastingParams3 = yysVar2.b;
                            xexVar3.N(p39Var3, v39Var3, gameBroadcastingParams3.d, gameBroadcastingParams3.g, gameBroadcastingParams3.f46691a);
                            p7m0 p7m0Var4 = yysVar2.B;
                            do {
                                value4 = p7m0Var4.getValue();
                            } while (!p7m0Var4.m(value4, ixs.a((ixs) value4, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 393215)));
                            p7m0 p7m0Var5 = yysVar2.C;
                            nws nwsVar = nws.b;
                            p7m0Var5.getClass();
                            p7m0Var5.o(null, nwsVar);
                            yysVar2.f.b();
                            yysVar2.B();
                            sac.V(jiu0.a(yysVar2), uys.f36506a, null, yysVar2.p.f22085a, new sys(yysVar2, yjeVar, (byte) 1), 10);
                            ali aliVar = yysVar2.c;
                            BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams = new BroadcastingVideoLandscapeParams(((ixs) p7m0Var4.getValue()).f15558a, ((ixs) p7m0Var4.getValue()).b, ((ixs) p7m0Var4.getValue()).d, ((ixs) p7m0Var4.getValue()).c, ((ixs) p7m0Var4.getValue()).e, false);
                            i1w0 i1w0VarC = ((oeg0) aliVar.f1068a).c();
                            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            FragmentScreen broadcastingVideoFullScreenFactory$getScreen$1 = new BroadcastingVideoFullScreenFactory$getScreen$1(broadcastingVideoLandscapeParams);
                            if (broadcastingVideoFullScreenFactory$getScreen$1 instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) broadcastingVideoFullScreenFactory$getScreen$1)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(broadcastingVideoFullScreenFactory$getScreen$1)));
                            }
                            ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                paw pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            ImageView imageView2 = getBinding().b;
            imageView2.setImageDrawable(getToFullscreenDrawable());
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: a.ksr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    byte b4 = b;
                    yje yjeVar = null;
                    yys yysVar2 = yysVar;
                    switch (b4) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            yysVar2.getClass();
                            p39 p39Var = p39.WINDOWED;
                            v39 v39Var = v39.VIDEO;
                            xex xexVar = yysVar2.A;
                            GameBroadcastingParams gameBroadcastingParams = yysVar2.b;
                            xexVar.N(p39Var, v39Var, gameBroadcastingParams.d, gameBroadcastingParams.g, gameBroadcastingParams.f46691a);
                            p7m0 p7m0Var = yysVar2.B;
                            do {
                                value = p7m0Var.getValue();
                            } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 393215)));
                            p7m0 p7m0Var2 = yysVar2.C;
                            ows owsVar = new ows(new jcs(yysVar2, (byte) 9));
                            p7m0Var2.getClass();
                            p7m0Var2.o(null, owsVar);
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var3 = yysVar2.B;
                            if (!((ixs) p7m0Var3.getValue()).f) {
                                do {
                                    value2 = p7m0Var3.getValue();
                                } while (!p7m0Var3.m(value2, ixs.a((ixs) value2, 0L, null, true, false, false, false, null, false, false, null, false, null, false, false, 524255)));
                                yysVar2.D();
                            } else {
                                p39 p39Var2 = p39.PAUSE;
                                v39 v39Var2 = v39.VIDEO;
                                xex xexVar2 = yysVar2.A;
                                GameBroadcastingParams gameBroadcastingParams2 = yysVar2.b;
                                xexVar2.N(p39Var2, v39Var2, gameBroadcastingParams2.d, gameBroadcastingParams2.g, gameBroadcastingParams2.f46691a);
                                do {
                                    value3 = p7m0Var3.getValue();
                                } while (!p7m0Var3.m(value3, ixs.a((ixs) value3, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 524191)));
                                yysVar2.B();
                                yysVar2.A();
                            }
                            break;
                        default:
                            int i3 = GameBroadcastingControlPanelView.A;
                            yysVar2.getClass();
                            p39 p39Var3 = p39.FULLSCREEN;
                            v39 v39Var3 = v39.VIDEO;
                            xex xexVar3 = yysVar2.A;
                            GameBroadcastingParams gameBroadcastingParams3 = yysVar2.b;
                            xexVar3.N(p39Var3, v39Var3, gameBroadcastingParams3.d, gameBroadcastingParams3.g, gameBroadcastingParams3.f46691a);
                            p7m0 p7m0Var4 = yysVar2.B;
                            do {
                                value4 = p7m0Var4.getValue();
                            } while (!p7m0Var4.m(value4, ixs.a((ixs) value4, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 393215)));
                            p7m0 p7m0Var5 = yysVar2.C;
                            nws nwsVar = nws.b;
                            p7m0Var5.getClass();
                            p7m0Var5.o(null, nwsVar);
                            yysVar2.f.b();
                            yysVar2.B();
                            sac.V(jiu0.a(yysVar2), uys.f36506a, null, yysVar2.p.f22085a, new sys(yysVar2, yjeVar, (byte) 1), 10);
                            ali aliVar = yysVar2.c;
                            BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams = new BroadcastingVideoLandscapeParams(((ixs) p7m0Var4.getValue()).f15558a, ((ixs) p7m0Var4.getValue()).b, ((ixs) p7m0Var4.getValue()).d, ((ixs) p7m0Var4.getValue()).c, ((ixs) p7m0Var4.getValue()).e, false);
                            i1w0 i1w0VarC = ((oeg0) aliVar.f1068a).c();
                            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                            FragmentScreen broadcastingVideoFullScreenFactory$getScreen$1 = new BroadcastingVideoFullScreenFactory$getScreen$1(broadcastingVideoLandscapeParams);
                            if (broadcastingVideoFullScreenFactory$getScreen$1 instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) broadcastingVideoFullScreenFactory$getScreen$1)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(broadcastingVideoFullScreenFactory$getScreen$1)));
                            }
                            ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                            while (true) {
                                paw pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0VarC.a((oe50) pawVar.next());
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        final byte b4 = 3;
        if (dkeVar instanceof wzs) {
            final wzs wzsVar = (wzs) dkeVar;
            ImageView imageView3 = getBinding().e;
            imageView3.setImageDrawable(getFromWindowDrawable());
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: a.msr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    byte b5 = b3;
                    yje yjeVar = null;
                    wzs wzsVar2 = wzsVar;
                    switch (b5) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            wzsVar2.x();
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = wzsVar2.u;
                            if (!((czs) p7m0Var.getValue()).f) {
                                do {
                                    value = p7m0Var.getValue();
                                } while (!p7m0Var.m(value, czs.a((czs) value, 0L, 0L, null, 0L, null, true, false, false, false, false, false, false, null, 65503)));
                                czs czsVar = (czs) p7m0Var.getValue();
                                wzsVar2.q.A(czsVar.f5238a, czsVar.b, czsVar.d, v39.VIDEO, czsVar.c, czsVar.o);
                            } else {
                                do {
                                    value2 = p7m0Var.getValue();
                                } while (!p7m0Var.m(value2, czs.a((czs) value2, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 65439)));
                                wzsVar2.z();
                                wzsVar2.y();
                            }
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var2 = wzsVar2.u;
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, czs.a((czs) value3, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 49151)));
                            sac.V(jiu0.a(wzsVar2), szs.f33084a, null, wzsVar2.m.f22085a, new mzs(wzsVar2, yjeVar, (byte) 1), 10);
                            break;
                        default:
                            int i4 = GameBroadcastingControlPanelView.A;
                            wzsVar2.getClass();
                            sac.V(jiu0.a(wzsVar2), tzs.f34819a, null, wzsVar2.m.f22085a, new mzs(wzsVar2, yjeVar, (byte) 2), 10);
                            break;
                    }
                }
            });
            getBinding().c.setOnClickListener(new View.OnClickListener() { // from class: a.msr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    byte b5 = b2;
                    yje yjeVar = null;
                    wzs wzsVar2 = wzsVar;
                    switch (b5) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            wzsVar2.x();
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = wzsVar2.u;
                            if (!((czs) p7m0Var.getValue()).f) {
                                do {
                                    value = p7m0Var.getValue();
                                } while (!p7m0Var.m(value, czs.a((czs) value, 0L, 0L, null, 0L, null, true, false, false, false, false, false, false, null, 65503)));
                                czs czsVar = (czs) p7m0Var.getValue();
                                wzsVar2.q.A(czsVar.f5238a, czsVar.b, czsVar.d, v39.VIDEO, czsVar.c, czsVar.o);
                            } else {
                                do {
                                    value2 = p7m0Var.getValue();
                                } while (!p7m0Var.m(value2, czs.a((czs) value2, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 65439)));
                                wzsVar2.z();
                                wzsVar2.y();
                            }
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var2 = wzsVar2.u;
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, czs.a((czs) value3, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 49151)));
                            sac.V(jiu0.a(wzsVar2), szs.f33084a, null, wzsVar2.m.f22085a, new mzs(wzsVar2, yjeVar, (byte) 1), 10);
                            break;
                        default:
                            int i4 = GameBroadcastingControlPanelView.A;
                            wzsVar2.getClass();
                            sac.V(jiu0.a(wzsVar2), tzs.f34819a, null, wzsVar2.m.f22085a, new mzs(wzsVar2, yjeVar, (byte) 2), 10);
                            break;
                    }
                }
            });
            ImageView imageView4 = getBinding().b;
            imageView4.setImageDrawable(getToFullscreenDrawable());
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: a.msr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    byte b5 = b;
                    yje yjeVar = null;
                    wzs wzsVar2 = wzsVar;
                    switch (b5) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            wzsVar2.x();
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = wzsVar2.u;
                            if (!((czs) p7m0Var.getValue()).f) {
                                do {
                                    value = p7m0Var.getValue();
                                } while (!p7m0Var.m(value, czs.a((czs) value, 0L, 0L, null, 0L, null, true, false, false, false, false, false, false, null, 65503)));
                                czs czsVar = (czs) p7m0Var.getValue();
                                wzsVar2.q.A(czsVar.f5238a, czsVar.b, czsVar.d, v39.VIDEO, czsVar.c, czsVar.o);
                            } else {
                                do {
                                    value2 = p7m0Var.getValue();
                                } while (!p7m0Var.m(value2, czs.a((czs) value2, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 65439)));
                                wzsVar2.z();
                                wzsVar2.y();
                            }
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var2 = wzsVar2.u;
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, czs.a((czs) value3, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 49151)));
                            sac.V(jiu0.a(wzsVar2), szs.f33084a, null, wzsVar2.m.f22085a, new mzs(wzsVar2, yjeVar, (byte) 1), 10);
                            break;
                        default:
                            int i4 = GameBroadcastingControlPanelView.A;
                            wzsVar2.getClass();
                            sac.V(jiu0.a(wzsVar2), tzs.f34819a, null, wzsVar2.m.f22085a, new mzs(wzsVar2, yjeVar, (byte) 2), 10);
                            break;
                    }
                }
            });
            ImageView imageView5 = getBinding().d;
            imageView5.setVisibility(0);
            imageView5.setImageDrawable(getStopDrawable());
            imageView5.setOnClickListener(new View.OnClickListener() { // from class: a.msr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    byte b5 = b4;
                    yje yjeVar = null;
                    wzs wzsVar2 = wzsVar;
                    switch (b5) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            wzsVar2.x();
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = wzsVar2.u;
                            if (!((czs) p7m0Var.getValue()).f) {
                                do {
                                    value = p7m0Var.getValue();
                                } while (!p7m0Var.m(value, czs.a((czs) value, 0L, 0L, null, 0L, null, true, false, false, false, false, false, false, null, 65503)));
                                czs czsVar = (czs) p7m0Var.getValue();
                                wzsVar2.q.A(czsVar.f5238a, czsVar.b, czsVar.d, v39.VIDEO, czsVar.c, czsVar.o);
                            } else {
                                do {
                                    value2 = p7m0Var.getValue();
                                } while (!p7m0Var.m(value2, czs.a((czs) value2, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 65439)));
                                wzsVar2.z();
                                wzsVar2.y();
                            }
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var2 = wzsVar2.u;
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, czs.a((czs) value3, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 49151)));
                            sac.V(jiu0.a(wzsVar2), szs.f33084a, null, wzsVar2.m.f22085a, new mzs(wzsVar2, yjeVar, (byte) 1), 10);
                            break;
                        default:
                            int i4 = GameBroadcastingControlPanelView.A;
                            wzsVar2.getClass();
                            sac.V(jiu0.a(wzsVar2), tzs.f34819a, null, wzsVar2.m.f22085a, new mzs(wzsVar2, yjeVar, (byte) 2), 10);
                            break;
                    }
                }
            });
            return;
        }
        if (dkeVar instanceof e1t) {
            final e1t e1tVar = (e1t) dkeVar;
            ImageView imageView6 = getBinding().e;
            imageView6.setImageDrawable(getToWindowDrawable());
            imageView6.setOnClickListener(new View.OnClickListener() { // from class: a.isr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    s0t s0tVar;
                    w3w0 w3w0Var;
                    Object value5;
                    byte b5 = b4;
                    yje yjeVar = null;
                    e1t e1tVar2 = e1tVar;
                    switch (b5) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = e1tVar2.n;
                            if (!((s0t) p7m0Var.getValue()).f) {
                                do {
                                    value = p7m0Var.getValue();
                                } while (!p7m0Var.m(value, s0t.a((s0t) value, true, false, false, false, null, false, false, 32735)));
                                e1tVar2.z();
                            } else {
                                p39 p39Var = p39.PAUSE;
                                v39 v39Var = v39.ZONE;
                                xex xexVar = e1tVar2.m;
                                GameBroadcastingParams gameBroadcastingParams = e1tVar2.b;
                                xexVar.N(p39Var, v39Var, gameBroadcastingParams.d, gameBroadcastingParams.g, gameBroadcastingParams.f46691a);
                                e1tVar2.y();
                                do {
                                    value2 = p7m0Var.getValue();
                                } while (!p7m0Var.m(value2, s0t.a((s0t) value2, false, false, false, false, null, false, false, 32607)));
                            }
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            e1tVar2.getClass();
                            p39 p39Var2 = p39.FULLSCREEN;
                            v39 v39Var2 = v39.ZONE;
                            xex xexVar2 = e1tVar2.m;
                            GameBroadcastingParams gameBroadcastingParams2 = e1tVar2.b;
                            xexVar2.N(p39Var2, v39Var2, gameBroadcastingParams2.d, gameBroadcastingParams2.g, gameBroadcastingParams2.f46691a);
                            p7m0 p7m0Var2 = e1tVar2.n;
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, s0t.a((s0t) value3, false, false, false, false, null, false, false, 24575)));
                            p7m0 p7m0Var3 = e1tVar2.o;
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, k0t.f17485a);
                            e1tVar2.e.v();
                            sac.V(jiu0.a(e1tVar2), c1t.f3591a, null, e1tVar2.i.f22085a, new b1t(e1tVar2, yjeVar, (byte) 1), 10);
                            e1tVar2.c.C(new BroadcastingZoneLandscapeParams(gameBroadcastingParams2.f46691a, gameBroadcastingParams2.d, gameBroadcastingParams2.e, gameBroadcastingParams2.g, false));
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var4 = e1tVar2.n;
                            if (((s0t) p7m0Var4.getValue()).m) {
                                do {
                                    value4 = p7m0Var4.getValue();
                                    s0tVar = (s0t) value4;
                                    w3w0 w3w0Var2 = ((s0t) p7m0Var4.getValue()).l;
                                    w3w0Var = w3w0.b;
                                    if (w3w0Var2 == w3w0Var) {
                                        w3w0Var = w3w0.f38519a;
                                    }
                                } while (!p7m0Var4.m(value4, s0t.a(s0tVar, false, false, false, false, w3w0Var, false, false, 30719)));
                            }
                            break;
                        default:
                            int i4 = GameBroadcastingControlPanelView.A;
                            e1tVar2.getClass();
                            p39 p39Var3 = p39.WINDOWED;
                            v39 v39Var3 = v39.ZONE;
                            xex xexVar3 = e1tVar2.m;
                            GameBroadcastingParams gameBroadcastingParams3 = e1tVar2.b;
                            xexVar3.N(p39Var3, v39Var3, gameBroadcastingParams3.d, gameBroadcastingParams3.g, gameBroadcastingParams3.f46691a);
                            p7m0 p7m0Var5 = e1tVar2.n;
                            do {
                                value5 = p7m0Var5.getValue();
                            } while (!p7m0Var5.m(value5, s0t.a((s0t) value5, false, false, false, false, null, false, false, 24575)));
                            p7m0 p7m0Var6 = e1tVar2.o;
                            l0t l0tVar = new l0t(new jcs(e1tVar2, (byte) 11));
                            p7m0Var6.getClass();
                            p7m0Var6.o(null, l0tVar);
                            break;
                    }
                }
            });
            getBinding().c.setOnClickListener(new View.OnClickListener() { // from class: a.isr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    s0t s0tVar;
                    w3w0 w3w0Var;
                    Object value5;
                    byte b5 = b3;
                    yje yjeVar = null;
                    e1t e1tVar2 = e1tVar;
                    switch (b5) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = e1tVar2.n;
                            if (!((s0t) p7m0Var.getValue()).f) {
                                do {
                                    value = p7m0Var.getValue();
                                } while (!p7m0Var.m(value, s0t.a((s0t) value, true, false, false, false, null, false, false, 32735)));
                                e1tVar2.z();
                            } else {
                                p39 p39Var = p39.PAUSE;
                                v39 v39Var = v39.ZONE;
                                xex xexVar = e1tVar2.m;
                                GameBroadcastingParams gameBroadcastingParams = e1tVar2.b;
                                xexVar.N(p39Var, v39Var, gameBroadcastingParams.d, gameBroadcastingParams.g, gameBroadcastingParams.f46691a);
                                e1tVar2.y();
                                do {
                                    value2 = p7m0Var.getValue();
                                } while (!p7m0Var.m(value2, s0t.a((s0t) value2, false, false, false, false, null, false, false, 32607)));
                            }
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            e1tVar2.getClass();
                            p39 p39Var2 = p39.FULLSCREEN;
                            v39 v39Var2 = v39.ZONE;
                            xex xexVar2 = e1tVar2.m;
                            GameBroadcastingParams gameBroadcastingParams2 = e1tVar2.b;
                            xexVar2.N(p39Var2, v39Var2, gameBroadcastingParams2.d, gameBroadcastingParams2.g, gameBroadcastingParams2.f46691a);
                            p7m0 p7m0Var2 = e1tVar2.n;
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, s0t.a((s0t) value3, false, false, false, false, null, false, false, 24575)));
                            p7m0 p7m0Var3 = e1tVar2.o;
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, k0t.f17485a);
                            e1tVar2.e.v();
                            sac.V(jiu0.a(e1tVar2), c1t.f3591a, null, e1tVar2.i.f22085a, new b1t(e1tVar2, yjeVar, (byte) 1), 10);
                            e1tVar2.c.C(new BroadcastingZoneLandscapeParams(gameBroadcastingParams2.f46691a, gameBroadcastingParams2.d, gameBroadcastingParams2.e, gameBroadcastingParams2.g, false));
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var4 = e1tVar2.n;
                            if (((s0t) p7m0Var4.getValue()).m) {
                                do {
                                    value4 = p7m0Var4.getValue();
                                    s0tVar = (s0t) value4;
                                    w3w0 w3w0Var2 = ((s0t) p7m0Var4.getValue()).l;
                                    w3w0Var = w3w0.b;
                                    if (w3w0Var2 == w3w0Var) {
                                        w3w0Var = w3w0.f38519a;
                                    }
                                } while (!p7m0Var4.m(value4, s0t.a(s0tVar, false, false, false, false, w3w0Var, false, false, 30719)));
                            }
                            break;
                        default:
                            int i4 = GameBroadcastingControlPanelView.A;
                            e1tVar2.getClass();
                            p39 p39Var3 = p39.WINDOWED;
                            v39 v39Var3 = v39.ZONE;
                            xex xexVar3 = e1tVar2.m;
                            GameBroadcastingParams gameBroadcastingParams3 = e1tVar2.b;
                            xexVar3.N(p39Var3, v39Var3, gameBroadcastingParams3.d, gameBroadcastingParams3.g, gameBroadcastingParams3.f46691a);
                            p7m0 p7m0Var5 = e1tVar2.n;
                            do {
                                value5 = p7m0Var5.getValue();
                            } while (!p7m0Var5.m(value5, s0t.a((s0t) value5, false, false, false, false, null, false, false, 24575)));
                            p7m0 p7m0Var6 = e1tVar2.o;
                            l0t l0tVar = new l0t(new jcs(e1tVar2, (byte) 11));
                            p7m0Var6.getClass();
                            p7m0Var6.o(null, l0tVar);
                            break;
                    }
                }
            });
            ImageView imageView7 = getBinding().b;
            imageView7.setImageDrawable(getToFullscreenDrawable());
            imageView7.setOnClickListener(new View.OnClickListener() { // from class: a.isr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    s0t s0tVar;
                    w3w0 w3w0Var;
                    Object value5;
                    byte b5 = b2;
                    yje yjeVar = null;
                    e1t e1tVar2 = e1tVar;
                    switch (b5) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = e1tVar2.n;
                            if (!((s0t) p7m0Var.getValue()).f) {
                                do {
                                    value = p7m0Var.getValue();
                                } while (!p7m0Var.m(value, s0t.a((s0t) value, true, false, false, false, null, false, false, 32735)));
                                e1tVar2.z();
                            } else {
                                p39 p39Var = p39.PAUSE;
                                v39 v39Var = v39.ZONE;
                                xex xexVar = e1tVar2.m;
                                GameBroadcastingParams gameBroadcastingParams = e1tVar2.b;
                                xexVar.N(p39Var, v39Var, gameBroadcastingParams.d, gameBroadcastingParams.g, gameBroadcastingParams.f46691a);
                                e1tVar2.y();
                                do {
                                    value2 = p7m0Var.getValue();
                                } while (!p7m0Var.m(value2, s0t.a((s0t) value2, false, false, false, false, null, false, false, 32607)));
                            }
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            e1tVar2.getClass();
                            p39 p39Var2 = p39.FULLSCREEN;
                            v39 v39Var2 = v39.ZONE;
                            xex xexVar2 = e1tVar2.m;
                            GameBroadcastingParams gameBroadcastingParams2 = e1tVar2.b;
                            xexVar2.N(p39Var2, v39Var2, gameBroadcastingParams2.d, gameBroadcastingParams2.g, gameBroadcastingParams2.f46691a);
                            p7m0 p7m0Var2 = e1tVar2.n;
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, s0t.a((s0t) value3, false, false, false, false, null, false, false, 24575)));
                            p7m0 p7m0Var3 = e1tVar2.o;
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, k0t.f17485a);
                            e1tVar2.e.v();
                            sac.V(jiu0.a(e1tVar2), c1t.f3591a, null, e1tVar2.i.f22085a, new b1t(e1tVar2, yjeVar, (byte) 1), 10);
                            e1tVar2.c.C(new BroadcastingZoneLandscapeParams(gameBroadcastingParams2.f46691a, gameBroadcastingParams2.d, gameBroadcastingParams2.e, gameBroadcastingParams2.g, false));
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var4 = e1tVar2.n;
                            if (((s0t) p7m0Var4.getValue()).m) {
                                do {
                                    value4 = p7m0Var4.getValue();
                                    s0tVar = (s0t) value4;
                                    w3w0 w3w0Var2 = ((s0t) p7m0Var4.getValue()).l;
                                    w3w0Var = w3w0.b;
                                    if (w3w0Var2 == w3w0Var) {
                                        w3w0Var = w3w0.f38519a;
                                    }
                                } while (!p7m0Var4.m(value4, s0t.a(s0tVar, false, false, false, false, w3w0Var, false, false, 30719)));
                            }
                            break;
                        default:
                            int i4 = GameBroadcastingControlPanelView.A;
                            e1tVar2.getClass();
                            p39 p39Var3 = p39.WINDOWED;
                            v39 v39Var3 = v39.ZONE;
                            xex xexVar3 = e1tVar2.m;
                            GameBroadcastingParams gameBroadcastingParams3 = e1tVar2.b;
                            xexVar3.N(p39Var3, v39Var3, gameBroadcastingParams3.d, gameBroadcastingParams3.g, gameBroadcastingParams3.f46691a);
                            p7m0 p7m0Var5 = e1tVar2.n;
                            do {
                                value5 = p7m0Var5.getValue();
                            } while (!p7m0Var5.m(value5, s0t.a((s0t) value5, false, false, false, false, null, false, false, 24575)));
                            p7m0 p7m0Var6 = e1tVar2.o;
                            l0t l0tVar = new l0t(new jcs(e1tVar2, (byte) 11));
                            p7m0Var6.getClass();
                            p7m0Var6.o(null, l0tVar);
                            break;
                    }
                }
            });
            ImageView imageView8 = getBinding().f;
            imageView8.setVisibility(0);
            imageView8.setImageDrawable(getGoToZone3DFormatDrawable());
            imageView8.setOnClickListener(new View.OnClickListener() { // from class: a.isr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    s0t s0tVar;
                    w3w0 w3w0Var;
                    Object value5;
                    byte b5 = b;
                    yje yjeVar = null;
                    e1t e1tVar2 = e1tVar;
                    switch (b5) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = e1tVar2.n;
                            if (!((s0t) p7m0Var.getValue()).f) {
                                do {
                                    value = p7m0Var.getValue();
                                } while (!p7m0Var.m(value, s0t.a((s0t) value, true, false, false, false, null, false, false, 32735)));
                                e1tVar2.z();
                            } else {
                                p39 p39Var = p39.PAUSE;
                                v39 v39Var = v39.ZONE;
                                xex xexVar = e1tVar2.m;
                                GameBroadcastingParams gameBroadcastingParams = e1tVar2.b;
                                xexVar.N(p39Var, v39Var, gameBroadcastingParams.d, gameBroadcastingParams.g, gameBroadcastingParams.f46691a);
                                e1tVar2.y();
                                do {
                                    value2 = p7m0Var.getValue();
                                } while (!p7m0Var.m(value2, s0t.a((s0t) value2, false, false, false, false, null, false, false, 32607)));
                            }
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            e1tVar2.getClass();
                            p39 p39Var2 = p39.FULLSCREEN;
                            v39 v39Var2 = v39.ZONE;
                            xex xexVar2 = e1tVar2.m;
                            GameBroadcastingParams gameBroadcastingParams2 = e1tVar2.b;
                            xexVar2.N(p39Var2, v39Var2, gameBroadcastingParams2.d, gameBroadcastingParams2.g, gameBroadcastingParams2.f46691a);
                            p7m0 p7m0Var2 = e1tVar2.n;
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, s0t.a((s0t) value3, false, false, false, false, null, false, false, 24575)));
                            p7m0 p7m0Var3 = e1tVar2.o;
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, k0t.f17485a);
                            e1tVar2.e.v();
                            sac.V(jiu0.a(e1tVar2), c1t.f3591a, null, e1tVar2.i.f22085a, new b1t(e1tVar2, yjeVar, (byte) 1), 10);
                            e1tVar2.c.C(new BroadcastingZoneLandscapeParams(gameBroadcastingParams2.f46691a, gameBroadcastingParams2.d, gameBroadcastingParams2.e, gameBroadcastingParams2.g, false));
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var4 = e1tVar2.n;
                            if (((s0t) p7m0Var4.getValue()).m) {
                                do {
                                    value4 = p7m0Var4.getValue();
                                    s0tVar = (s0t) value4;
                                    w3w0 w3w0Var2 = ((s0t) p7m0Var4.getValue()).l;
                                    w3w0Var = w3w0.b;
                                    if (w3w0Var2 == w3w0Var) {
                                        w3w0Var = w3w0.f38519a;
                                    }
                                } while (!p7m0Var4.m(value4, s0t.a(s0tVar, false, false, false, false, w3w0Var, false, false, 30719)));
                            }
                            break;
                        default:
                            int i4 = GameBroadcastingControlPanelView.A;
                            e1tVar2.getClass();
                            p39 p39Var3 = p39.WINDOWED;
                            v39 v39Var3 = v39.ZONE;
                            xex xexVar3 = e1tVar2.m;
                            GameBroadcastingParams gameBroadcastingParams3 = e1tVar2.b;
                            xexVar3.N(p39Var3, v39Var3, gameBroadcastingParams3.d, gameBroadcastingParams3.g, gameBroadcastingParams3.f46691a);
                            p7m0 p7m0Var5 = e1tVar2.n;
                            do {
                                value5 = p7m0Var5.getValue();
                            } while (!p7m0Var5.m(value5, s0t.a((s0t) value5, false, false, false, false, null, false, false, 24575)));
                            p7m0 p7m0Var6 = e1tVar2.o;
                            l0t l0tVar = new l0t(new jcs(e1tVar2, (byte) 11));
                            p7m0Var6.getClass();
                            p7m0Var6.o(null, l0tVar);
                            break;
                    }
                }
            });
            return;
        }
        final byte b5 = 4;
        if (dkeVar instanceof p89) {
            final p89 p89Var = (p89) dkeVar;
            ImageView imageView9 = getBinding().e;
            imageView9.setImageDrawable(getToWindowDrawable());
            imageView9.setOnClickListener(new View.OnClickListener() { // from class: a.jsr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    b89 b89Var;
                    w3w0 w3w0Var;
                    byte b6 = b3;
                    p89 p89Var2 = p89Var;
                    switch (b6) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = p89Var2.l;
                            do {
                                value = p7m0Var.getValue();
                            } while (!p7m0Var.m(value, b89.a((b89) value, false, false, false, false, null, false, 24575)));
                            p89Var2.x();
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var2 = p89Var2.l;
                            if (!((b89) p7m0Var2.getValue()).f) {
                                do {
                                    value2 = p7m0Var2.getValue();
                                } while (!p7m0Var2.m(value2, b89.a((b89) value2, true, false, false, false, null, false, 32735)));
                                p89Var2.z();
                            } else {
                                do {
                                    value3 = p7m0Var2.getValue();
                                } while (!p7m0Var2.m(value3, b89.a((b89) value3, false, false, false, false, null, false, 32607)));
                                p89Var2.y();
                            }
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p89Var2.w();
                            break;
                        case 3:
                            int i4 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var3 = p89Var2.m;
                            t79 t79Var = t79.b;
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, t79Var);
                            sac.V(jiu0.a(p89Var2), m89.f21359a, null, p89Var2.d.f22085a, new k89(p89Var2, null, (byte) 2), 10);
                            p89Var2.e.d();
                            break;
                        default:
                            int i5 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var4 = p89Var2.l;
                            if (((b89) p7m0Var4.getValue()).m) {
                                do {
                                    value4 = p7m0Var4.getValue();
                                    b89Var = (b89) value4;
                                    w3w0 w3w0Var2 = ((b89) p7m0Var4.getValue()).l;
                                    w3w0Var = w3w0.b;
                                    if (w3w0Var2 == w3w0Var) {
                                        w3w0Var = w3w0.f38519a;
                                    }
                                } while (!p7m0Var4.m(value4, b89.a(b89Var, false, false, false, false, w3w0Var, false, 30719)));
                            }
                            break;
                    }
                }
            });
            getBinding().c.setOnClickListener(new View.OnClickListener() { // from class: a.jsr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    b89 b89Var;
                    w3w0 w3w0Var;
                    byte b6 = b2;
                    p89 p89Var2 = p89Var;
                    switch (b6) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = p89Var2.l;
                            do {
                                value = p7m0Var.getValue();
                            } while (!p7m0Var.m(value, b89.a((b89) value, false, false, false, false, null, false, 24575)));
                            p89Var2.x();
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var2 = p89Var2.l;
                            if (!((b89) p7m0Var2.getValue()).f) {
                                do {
                                    value2 = p7m0Var2.getValue();
                                } while (!p7m0Var2.m(value2, b89.a((b89) value2, true, false, false, false, null, false, 32735)));
                                p89Var2.z();
                            } else {
                                do {
                                    value3 = p7m0Var2.getValue();
                                } while (!p7m0Var2.m(value3, b89.a((b89) value3, false, false, false, false, null, false, 32607)));
                                p89Var2.y();
                            }
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p89Var2.w();
                            break;
                        case 3:
                            int i4 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var3 = p89Var2.m;
                            t79 t79Var = t79.b;
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, t79Var);
                            sac.V(jiu0.a(p89Var2), m89.f21359a, null, p89Var2.d.f22085a, new k89(p89Var2, null, (byte) 2), 10);
                            p89Var2.e.d();
                            break;
                        default:
                            int i5 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var4 = p89Var2.l;
                            if (((b89) p7m0Var4.getValue()).m) {
                                do {
                                    value4 = p7m0Var4.getValue();
                                    b89Var = (b89) value4;
                                    w3w0 w3w0Var2 = ((b89) p7m0Var4.getValue()).l;
                                    w3w0Var = w3w0.b;
                                    if (w3w0Var2 == w3w0Var) {
                                        w3w0Var = w3w0.f38519a;
                                    }
                                } while (!p7m0Var4.m(value4, b89.a(b89Var, false, false, false, false, w3w0Var, false, 30719)));
                            }
                            break;
                    }
                }
            });
            ImageView imageView10 = getBinding().b;
            imageView10.setImageDrawable(getFromFullscreenDrawable());
            imageView10.setOnClickListener(new View.OnClickListener() { // from class: a.jsr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    b89 b89Var;
                    w3w0 w3w0Var;
                    byte b6 = b;
                    p89 p89Var2 = p89Var;
                    switch (b6) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = p89Var2.l;
                            do {
                                value = p7m0Var.getValue();
                            } while (!p7m0Var.m(value, b89.a((b89) value, false, false, false, false, null, false, 24575)));
                            p89Var2.x();
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var2 = p89Var2.l;
                            if (!((b89) p7m0Var2.getValue()).f) {
                                do {
                                    value2 = p7m0Var2.getValue();
                                } while (!p7m0Var2.m(value2, b89.a((b89) value2, true, false, false, false, null, false, 32735)));
                                p89Var2.z();
                            } else {
                                do {
                                    value3 = p7m0Var2.getValue();
                                } while (!p7m0Var2.m(value3, b89.a((b89) value3, false, false, false, false, null, false, 32607)));
                                p89Var2.y();
                            }
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p89Var2.w();
                            break;
                        case 3:
                            int i4 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var3 = p89Var2.m;
                            t79 t79Var = t79.b;
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, t79Var);
                            sac.V(jiu0.a(p89Var2), m89.f21359a, null, p89Var2.d.f22085a, new k89(p89Var2, null, (byte) 2), 10);
                            p89Var2.e.d();
                            break;
                        default:
                            int i5 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var4 = p89Var2.l;
                            if (((b89) p7m0Var4.getValue()).m) {
                                do {
                                    value4 = p7m0Var4.getValue();
                                    b89Var = (b89) value4;
                                    w3w0 w3w0Var2 = ((b89) p7m0Var4.getValue()).l;
                                    w3w0Var = w3w0.b;
                                    if (w3w0Var2 == w3w0Var) {
                                        w3w0Var = w3w0.f38519a;
                                    }
                                } while (!p7m0Var4.m(value4, b89.a(b89Var, false, false, false, false, w3w0Var, false, 30719)));
                            }
                            break;
                    }
                }
            });
            ImageView imageView11 = getBinding().d;
            imageView11.setVisibility(0);
            imageView11.setImageDrawable(getStopDrawable());
            imageView11.setOnClickListener(new View.OnClickListener() { // from class: a.jsr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    b89 b89Var;
                    w3w0 w3w0Var;
                    byte b6 = b4;
                    p89 p89Var2 = p89Var;
                    switch (b6) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = p89Var2.l;
                            do {
                                value = p7m0Var.getValue();
                            } while (!p7m0Var.m(value, b89.a((b89) value, false, false, false, false, null, false, 24575)));
                            p89Var2.x();
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var2 = p89Var2.l;
                            if (!((b89) p7m0Var2.getValue()).f) {
                                do {
                                    value2 = p7m0Var2.getValue();
                                } while (!p7m0Var2.m(value2, b89.a((b89) value2, true, false, false, false, null, false, 32735)));
                                p89Var2.z();
                            } else {
                                do {
                                    value3 = p7m0Var2.getValue();
                                } while (!p7m0Var2.m(value3, b89.a((b89) value3, false, false, false, false, null, false, 32607)));
                                p89Var2.y();
                            }
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p89Var2.w();
                            break;
                        case 3:
                            int i4 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var3 = p89Var2.m;
                            t79 t79Var = t79.b;
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, t79Var);
                            sac.V(jiu0.a(p89Var2), m89.f21359a, null, p89Var2.d.f22085a, new k89(p89Var2, null, (byte) 2), 10);
                            p89Var2.e.d();
                            break;
                        default:
                            int i5 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var4 = p89Var2.l;
                            if (((b89) p7m0Var4.getValue()).m) {
                                do {
                                    value4 = p7m0Var4.getValue();
                                    b89Var = (b89) value4;
                                    w3w0 w3w0Var2 = ((b89) p7m0Var4.getValue()).l;
                                    w3w0Var = w3w0.b;
                                    if (w3w0Var2 == w3w0Var) {
                                        w3w0Var = w3w0.f38519a;
                                    }
                                } while (!p7m0Var4.m(value4, b89.a(b89Var, false, false, false, false, w3w0Var, false, 30719)));
                            }
                            break;
                    }
                }
            });
            ImageView imageView12 = getBinding().f;
            imageView12.setVisibility(0);
            imageView12.setImageDrawable(getGoToZone3DFormatDrawable());
            imageView12.setOnClickListener(new View.OnClickListener() { // from class: a.jsr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object value;
                    Object value2;
                    Object value3;
                    Object value4;
                    b89 b89Var;
                    w3w0 w3w0Var;
                    byte b6 = b5;
                    p89 p89Var2 = p89Var;
                    switch (b6) {
                        case 0:
                            int i = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var = p89Var2.l;
                            do {
                                value = p7m0Var.getValue();
                            } while (!p7m0Var.m(value, b89.a((b89) value, false, false, false, false, null, false, 24575)));
                            p89Var2.x();
                            break;
                        case 1:
                            int i2 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var2 = p89Var2.l;
                            if (!((b89) p7m0Var2.getValue()).f) {
                                do {
                                    value2 = p7m0Var2.getValue();
                                } while (!p7m0Var2.m(value2, b89.a((b89) value2, true, false, false, false, null, false, 32735)));
                                p89Var2.z();
                            } else {
                                do {
                                    value3 = p7m0Var2.getValue();
                                } while (!p7m0Var2.m(value3, b89.a((b89) value3, false, false, false, false, null, false, 32607)));
                                p89Var2.y();
                            }
                            break;
                        case 2:
                            int i3 = GameBroadcastingControlPanelView.A;
                            p89Var2.w();
                            break;
                        case 3:
                            int i4 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var3 = p89Var2.m;
                            t79 t79Var = t79.b;
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, t79Var);
                            sac.V(jiu0.a(p89Var2), m89.f21359a, null, p89Var2.d.f22085a, new k89(p89Var2, null, (byte) 2), 10);
                            p89Var2.e.d();
                            break;
                        default:
                            int i5 = GameBroadcastingControlPanelView.A;
                            p7m0 p7m0Var4 = p89Var2.l;
                            if (((b89) p7m0Var4.getValue()).m) {
                                do {
                                    value4 = p7m0Var4.getValue();
                                    b89Var = (b89) value4;
                                    w3w0 w3w0Var2 = ((b89) p7m0Var4.getValue()).l;
                                    w3w0Var = w3w0.b;
                                    if (w3w0Var2 == w3w0Var) {
                                        w3w0Var = w3w0.f38519a;
                                    }
                                } while (!p7m0Var4.m(value4, b89.a(b89Var, false, false, false, false, w3w0Var, false, 30719)));
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (!(dkeVar instanceof x1t)) {
            t9f.b();
            return;
        }
        final x1t x1tVar = (x1t) dkeVar;
        ImageView imageView13 = getBinding().e;
        imageView13.setImageDrawable(getFromWindowDrawable());
        imageView13.setOnClickListener(new View.OnClickListener() { // from class: a.lsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object value2;
                Object value3;
                Object value4;
                Object value5;
                j1t j1tVar;
                w3w0 w3w0Var;
                byte b6 = b3;
                yje yjeVar = null;
                x1t x1tVar2 = x1tVar;
                switch (b6) {
                    case 0:
                        int i = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var = x1tVar2.m;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, j1t.a((j1t) value, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                        sac.V(jiu0.a(x1tVar2), w1t.f38417a, null, x1tVar2.g.f22085a, new r1t(x1tVar2, yjeVar, (byte) 4), 10);
                        break;
                    case 1:
                        int i2 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var2 = x1tVar2.m;
                        if (!((j1t) p7m0Var2.getValue()).f) {
                            do {
                                value2 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value2, j1t.a((j1t) value2, 0L, 0L, 0, 0L, null, true, false, false, null, false, null, 32735)));
                            x1tVar2.y();
                        } else {
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, j1t.a((j1t) value3, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 32607)));
                            x1tVar2.x();
                        }
                        break;
                    case 2:
                        int i3 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var3 = x1tVar2.m;
                        do {
                            value4 = p7m0Var3.getValue();
                        } while (!p7m0Var3.m(value4, j1t.a((j1t) value4, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                        sac.V(jiu0.a(x1tVar2), t1t.f33183a, null, x1tVar2.g.c, new r1t(x1tVar2, yjeVar, (byte) 1), 10);
                        break;
                    case 3:
                        int i4 = GameBroadcastingControlPanelView.A;
                        x1tVar2.getClass();
                        sac.V(jiu0.a(x1tVar2), u1t.f34916a, null, x1tVar2.g.c, new r1t(x1tVar2, yjeVar, (byte) 2), 10);
                        break;
                    default:
                        int i5 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var4 = x1tVar2.m;
                        if (((j1t) p7m0Var4.getValue()).m) {
                            do {
                                value5 = p7m0Var4.getValue();
                                j1tVar = (j1t) value5;
                                w3w0 w3w0Var2 = ((j1t) p7m0Var4.getValue()).l;
                                w3w0Var = w3w0.b;
                                if (w3w0Var2 == w3w0Var) {
                                    w3w0Var = w3w0.f38519a;
                                }
                            } while (!p7m0Var4.m(value5, j1t.a(j1tVar, 0L, 0L, 0, 0L, null, false, false, false, w3w0Var, false, null, 30719)));
                        }
                        break;
                }
            }
        });
        getBinding().c.setOnClickListener(new View.OnClickListener() { // from class: a.lsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object value2;
                Object value3;
                Object value4;
                Object value5;
                j1t j1tVar;
                w3w0 w3w0Var;
                byte b6 = b2;
                yje yjeVar = null;
                x1t x1tVar2 = x1tVar;
                switch (b6) {
                    case 0:
                        int i = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var = x1tVar2.m;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, j1t.a((j1t) value, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                        sac.V(jiu0.a(x1tVar2), w1t.f38417a, null, x1tVar2.g.f22085a, new r1t(x1tVar2, yjeVar, (byte) 4), 10);
                        break;
                    case 1:
                        int i2 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var2 = x1tVar2.m;
                        if (!((j1t) p7m0Var2.getValue()).f) {
                            do {
                                value2 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value2, j1t.a((j1t) value2, 0L, 0L, 0, 0L, null, true, false, false, null, false, null, 32735)));
                            x1tVar2.y();
                        } else {
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, j1t.a((j1t) value3, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 32607)));
                            x1tVar2.x();
                        }
                        break;
                    case 2:
                        int i3 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var3 = x1tVar2.m;
                        do {
                            value4 = p7m0Var3.getValue();
                        } while (!p7m0Var3.m(value4, j1t.a((j1t) value4, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                        sac.V(jiu0.a(x1tVar2), t1t.f33183a, null, x1tVar2.g.c, new r1t(x1tVar2, yjeVar, (byte) 1), 10);
                        break;
                    case 3:
                        int i4 = GameBroadcastingControlPanelView.A;
                        x1tVar2.getClass();
                        sac.V(jiu0.a(x1tVar2), u1t.f34916a, null, x1tVar2.g.c, new r1t(x1tVar2, yjeVar, (byte) 2), 10);
                        break;
                    default:
                        int i5 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var4 = x1tVar2.m;
                        if (((j1t) p7m0Var4.getValue()).m) {
                            do {
                                value5 = p7m0Var4.getValue();
                                j1tVar = (j1t) value5;
                                w3w0 w3w0Var2 = ((j1t) p7m0Var4.getValue()).l;
                                w3w0Var = w3w0.b;
                                if (w3w0Var2 == w3w0Var) {
                                    w3w0Var = w3w0.f38519a;
                                }
                            } while (!p7m0Var4.m(value5, j1t.a(j1tVar, 0L, 0L, 0, 0L, null, false, false, false, w3w0Var, false, null, 30719)));
                        }
                        break;
                }
            }
        });
        ImageView imageView14 = getBinding().b;
        imageView14.setImageDrawable(getToFullscreenDrawable());
        imageView14.setOnClickListener(new View.OnClickListener() { // from class: a.lsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object value2;
                Object value3;
                Object value4;
                Object value5;
                j1t j1tVar;
                w3w0 w3w0Var;
                byte b6 = b;
                yje yjeVar = null;
                x1t x1tVar2 = x1tVar;
                switch (b6) {
                    case 0:
                        int i = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var = x1tVar2.m;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, j1t.a((j1t) value, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                        sac.V(jiu0.a(x1tVar2), w1t.f38417a, null, x1tVar2.g.f22085a, new r1t(x1tVar2, yjeVar, (byte) 4), 10);
                        break;
                    case 1:
                        int i2 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var2 = x1tVar2.m;
                        if (!((j1t) p7m0Var2.getValue()).f) {
                            do {
                                value2 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value2, j1t.a((j1t) value2, 0L, 0L, 0, 0L, null, true, false, false, null, false, null, 32735)));
                            x1tVar2.y();
                        } else {
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, j1t.a((j1t) value3, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 32607)));
                            x1tVar2.x();
                        }
                        break;
                    case 2:
                        int i3 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var3 = x1tVar2.m;
                        do {
                            value4 = p7m0Var3.getValue();
                        } while (!p7m0Var3.m(value4, j1t.a((j1t) value4, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                        sac.V(jiu0.a(x1tVar2), t1t.f33183a, null, x1tVar2.g.c, new r1t(x1tVar2, yjeVar, (byte) 1), 10);
                        break;
                    case 3:
                        int i4 = GameBroadcastingControlPanelView.A;
                        x1tVar2.getClass();
                        sac.V(jiu0.a(x1tVar2), u1t.f34916a, null, x1tVar2.g.c, new r1t(x1tVar2, yjeVar, (byte) 2), 10);
                        break;
                    default:
                        int i5 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var4 = x1tVar2.m;
                        if (((j1t) p7m0Var4.getValue()).m) {
                            do {
                                value5 = p7m0Var4.getValue();
                                j1tVar = (j1t) value5;
                                w3w0 w3w0Var2 = ((j1t) p7m0Var4.getValue()).l;
                                w3w0Var = w3w0.b;
                                if (w3w0Var2 == w3w0Var) {
                                    w3w0Var = w3w0.f38519a;
                                }
                            } while (!p7m0Var4.m(value5, j1t.a(j1tVar, 0L, 0L, 0, 0L, null, false, false, false, w3w0Var, false, null, 30719)));
                        }
                        break;
                }
            }
        });
        ImageView imageView15 = getBinding().d;
        imageView15.setVisibility(0);
        imageView15.setImageDrawable(getStopDrawable());
        imageView15.setOnClickListener(new View.OnClickListener() { // from class: a.lsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object value2;
                Object value3;
                Object value4;
                Object value5;
                j1t j1tVar;
                w3w0 w3w0Var;
                byte b6 = b4;
                yje yjeVar = null;
                x1t x1tVar2 = x1tVar;
                switch (b6) {
                    case 0:
                        int i = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var = x1tVar2.m;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, j1t.a((j1t) value, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                        sac.V(jiu0.a(x1tVar2), w1t.f38417a, null, x1tVar2.g.f22085a, new r1t(x1tVar2, yjeVar, (byte) 4), 10);
                        break;
                    case 1:
                        int i2 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var2 = x1tVar2.m;
                        if (!((j1t) p7m0Var2.getValue()).f) {
                            do {
                                value2 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value2, j1t.a((j1t) value2, 0L, 0L, 0, 0L, null, true, false, false, null, false, null, 32735)));
                            x1tVar2.y();
                        } else {
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, j1t.a((j1t) value3, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 32607)));
                            x1tVar2.x();
                        }
                        break;
                    case 2:
                        int i3 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var3 = x1tVar2.m;
                        do {
                            value4 = p7m0Var3.getValue();
                        } while (!p7m0Var3.m(value4, j1t.a((j1t) value4, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                        sac.V(jiu0.a(x1tVar2), t1t.f33183a, null, x1tVar2.g.c, new r1t(x1tVar2, yjeVar, (byte) 1), 10);
                        break;
                    case 3:
                        int i4 = GameBroadcastingControlPanelView.A;
                        x1tVar2.getClass();
                        sac.V(jiu0.a(x1tVar2), u1t.f34916a, null, x1tVar2.g.c, new r1t(x1tVar2, yjeVar, (byte) 2), 10);
                        break;
                    default:
                        int i5 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var4 = x1tVar2.m;
                        if (((j1t) p7m0Var4.getValue()).m) {
                            do {
                                value5 = p7m0Var4.getValue();
                                j1tVar = (j1t) value5;
                                w3w0 w3w0Var2 = ((j1t) p7m0Var4.getValue()).l;
                                w3w0Var = w3w0.b;
                                if (w3w0Var2 == w3w0Var) {
                                    w3w0Var = w3w0.f38519a;
                                }
                            } while (!p7m0Var4.m(value5, j1t.a(j1tVar, 0L, 0L, 0, 0L, null, false, false, false, w3w0Var, false, null, 30719)));
                        }
                        break;
                }
            }
        });
        ImageView imageView16 = getBinding().f;
        imageView16.setVisibility(0);
        imageView16.setImageDrawable(getGoToZone3DFormatDrawable());
        imageView16.setOnClickListener(new View.OnClickListener() { // from class: a.lsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object value2;
                Object value3;
                Object value4;
                Object value5;
                j1t j1tVar;
                w3w0 w3w0Var;
                byte b6 = b5;
                yje yjeVar = null;
                x1t x1tVar2 = x1tVar;
                switch (b6) {
                    case 0:
                        int i = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var = x1tVar2.m;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, j1t.a((j1t) value, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                        sac.V(jiu0.a(x1tVar2), w1t.f38417a, null, x1tVar2.g.f22085a, new r1t(x1tVar2, yjeVar, (byte) 4), 10);
                        break;
                    case 1:
                        int i2 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var2 = x1tVar2.m;
                        if (!((j1t) p7m0Var2.getValue()).f) {
                            do {
                                value2 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value2, j1t.a((j1t) value2, 0L, 0L, 0, 0L, null, true, false, false, null, false, null, 32735)));
                            x1tVar2.y();
                        } else {
                            do {
                                value3 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value3, j1t.a((j1t) value3, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 32607)));
                            x1tVar2.x();
                        }
                        break;
                    case 2:
                        int i3 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var3 = x1tVar2.m;
                        do {
                            value4 = p7m0Var3.getValue();
                        } while (!p7m0Var3.m(value4, j1t.a((j1t) value4, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 24575)));
                        sac.V(jiu0.a(x1tVar2), t1t.f33183a, null, x1tVar2.g.c, new r1t(x1tVar2, yjeVar, (byte) 1), 10);
                        break;
                    case 3:
                        int i4 = GameBroadcastingControlPanelView.A;
                        x1tVar2.getClass();
                        sac.V(jiu0.a(x1tVar2), u1t.f34916a, null, x1tVar2.g.c, new r1t(x1tVar2, yjeVar, (byte) 2), 10);
                        break;
                    default:
                        int i5 = GameBroadcastingControlPanelView.A;
                        p7m0 p7m0Var4 = x1tVar2.m;
                        if (((j1t) p7m0Var4.getValue()).m) {
                            do {
                                value5 = p7m0Var4.getValue();
                                j1tVar = (j1t) value5;
                                w3w0 w3w0Var2 = ((j1t) p7m0Var4.getValue()).l;
                                w3w0Var = w3w0.b;
                                if (w3w0Var2 == w3w0Var) {
                                    w3w0Var = w3w0.f38519a;
                                }
                            } while (!p7m0Var4.m(value5, j1t.a(j1tVar, 0L, 0L, 0, 0L, null, false, false, false, w3w0Var, false, null, 30719)));
                        }
                        break;
                }
            }
        });
    }

    public final void v() {
        getBinding().f.setEnabled(false);
        getBinding().f.setClickable(false);
        getBinding().e.setEnabled(false);
        getBinding().e.setClickable(false);
        getBinding().c.setEnabled(false);
        getBinding().c.setClickable(false);
        getBinding().d.setEnabled(false);
        getBinding().d.setClickable(false);
        getBinding().b.setEnabled(false);
        getBinding().b.setClickable(false);
    }

    public final void w() {
        getBinding().f.setEnabled(true);
        getBinding().f.setClickable(true);
        getBinding().e.setEnabled(true);
        getBinding().e.setClickable(true);
        getBinding().c.setEnabled(true);
        getBinding().c.setClickable(true);
        getBinding().d.setEnabled(true);
        getBinding().d.setClickable(true);
        getBinding().b.setEnabled(true);
        getBinding().b.setClickable(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameBroadcastingControlPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameBroadcastingControlPanelView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
