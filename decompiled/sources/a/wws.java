package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.GameVideoPlayerColorScheme;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;
import org.xplatform.game_broadcasting.impl.presentation.video.GameVideoView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wws;", "La/yx5;", "<init>", "()V", "a/pek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wws extends yx5 implements osr {
    public final boolean K1;
    public fiu0 L1;
    public roq0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final khf0 P1;
    public final khf0 Q1;
    public final vr3 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(wws.class, "binding", "getBinding()Lorg/xplatform/game_broadcasting/impl/databinding/FragmentGameVideoLayoutBinding;", 0), new ez40(wws.class, "params", "getParams()Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;", 0), new ez40(wws.class, "gameVideoUiConfig", "getGameVideoUiConfig()Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;", 0)};
    public static final pek S1 = new pek();

    public wws() {
        super(R.layout.fragment_game_video_layout);
        this.K1 = true;
        jcs jcsVar = new jcs(this, (byte) 8);
        a8z a8zVarA = maz.a(wez.b, new jfl(new jfl(this, (byte) 23), (byte) 24));
        this.N1 = agc.G(this, sre0.f32672a.b(yys.class), new r6p(a8zVarA, (byte) 10), new r6p(a8zVarA, (byte) 11), jcsVar);
        this.O1 = ltt0.o(this, vws.f38168a);
        this.P1 = new khf0("VIDEO_PARAMS");
        this.Q1 = new khf0("UI_CONFIG");
        this.R1 = new vr3(this, (byte) 1);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 2;
        GameVideoUiConfig gameVideoUiConfig = (GameVideoUiConfig) this.Q1.n(this, U1[2]);
        int i = gameVideoUiConfig.d;
        int i2 = gameVideoUiConfig.c;
        int i3 = gameVideoUiConfig.b;
        String str = gameVideoUiConfig.f46692a;
        jxs[] jxsVarArr = jxs.f17324a;
        if (!Intrinsics.d(str, "16:9")) {
            View view = G0().n;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            a3e a3eVar = (a3e) layoutParams;
            ((ViewGroup.MarginLayoutParams) a3eVar).width = -1;
            a3eVar.G = str;
            view.setLayoutParams(a3eVar);
        }
        if (i3 != -1) {
            hxm0.x(G0().h, G().getDimensionPixelSize(i3));
            hxm0.x(G0().m, G().getDimensionPixelSize(i3));
            hxm0.x(G0().f, G().getDimensionPixelSize(i3));
        }
        if (i2 != -1) {
            GameVideoView gameVideoView = G0().h;
            ViewGroup.LayoutParams layoutParams2 = gameVideoView.getLayoutParams();
            if (layoutParams2 == null) {
                hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            } else {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.height = G().getDimensionPixelSize(i2);
                gameVideoView.setLayoutParams(layoutParams3);
            }
        }
        if (i != -1) {
            int dimensionPixelSize = G().getDimensionPixelSize(i);
            sj3.L0(G0().h, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        }
        GameVideoPlayerColorScheme gameVideoPlayerColorScheme = gameVideoUiConfig.e;
        Context contextO0 = o0();
        zws zwsVarA = axs.a(gameVideoPlayerColorScheme);
        e0r e0rVarG0 = G0();
        View view2 = e0rVarG0.f;
        TypedValue typedValue = j5d.f15927a;
        final byte b2 = 0;
        view2.setBackgroundColor(j5d.a(contextO0, zwsVarA.f45123a, false));
        e0rVarG0.j.setImageTintList(ColorStateList.valueOf(j5d.a(contextO0, zwsVarA.c, false)));
        TextView textView = e0rVarG0.c;
        int i4 = zwsVarA.b;
        textView.setTextColor(j5d.a(contextO0, i4, false));
        e0rVarG0.l.setTextColor(j5d.a(contextO0, i4, false));
        vcc.g0(this, "REQUEST_KEY_UPDATE_GAME_ID", new jar(this, (byte) 18));
        dyb.O(G0().d, new Function1(this) { // from class: a.uws
            public final /* synthetic */ wws b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                wws wwsVar = this.b;
                View view3 = (View) obj;
                switch (b3) {
                    case 0:
                        pek pekVar = wws.S1;
                        view3.getClass();
                        yys yysVarH0 = wwsVar.H0();
                        i8i.D("screen", "game_screen", yysVarH0.u.b, "login_page_call");
                        s64 s64Var = yysVarH0.s;
                        y1p y1pVar = y1p.MAIN;
                        s64Var.c("game_screen");
                        i1w0 i1w0VarC = ((oeg0) yysVarH0.c.f1068a).c();
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0VarC, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    case 1:
                        pek pekVar2 = wws.S1;
                        view3.getClass();
                        yys yysVarH1 = wwsVar.H0();
                        i8i.D("screen", "game_screen", yysVarH1.u.b, "reg_page_call");
                        yysVarH1.s.d(y1p.GAME_SCREEN, yysVarH1.t.g());
                        sac.V(jiu0.a(yysVarH1), vys.f38264a, null, yysVarH1.p.c, new cin(yysVarH1, null, (byte) 11), 10);
                        break;
                    case 2:
                        pek pekVar3 = wws.S1;
                        view3.getClass();
                        yys yysVarH2 = wwsVar.H0();
                        yysVarH2.E(gl90.ADD);
                        ali aliVar = yysVarH2.c;
                        ((oeg0) aliVar.f1068a).c().d(new g7p(aliVar, (byte) 18));
                        break;
                    default:
                        pek pekVar4 = wws.S1;
                        view3.getClass();
                        yys yysVarH3 = wwsVar.H0();
                        yysVarH3.E(gl90.ACTIVATE);
                        ali aliVar2 = yysVarH3.c;
                        ((oeg0) aliVar2.f1068a).c().d(new f5p(aliVar2, ((ixs) yysVarH3.B.getValue()).p, (byte) 26));
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 1;
        dyb.O(G0().k, new Function1(this) { // from class: a.uws
            public final /* synthetic */ wws b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                wws wwsVar = this.b;
                View view3 = (View) obj;
                switch (b4) {
                    case 0:
                        pek pekVar = wws.S1;
                        view3.getClass();
                        yys yysVarH0 = wwsVar.H0();
                        i8i.D("screen", "game_screen", yysVarH0.u.b, "login_page_call");
                        s64 s64Var = yysVarH0.s;
                        y1p y1pVar = y1p.MAIN;
                        s64Var.c("game_screen");
                        i1w0 i1w0VarC = ((oeg0) yysVarH0.c.f1068a).c();
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0VarC, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    case 1:
                        pek pekVar2 = wws.S1;
                        view3.getClass();
                        yys yysVarH1 = wwsVar.H0();
                        i8i.D("screen", "game_screen", yysVarH1.u.b, "reg_page_call");
                        yysVarH1.s.d(y1p.GAME_SCREEN, yysVarH1.t.g());
                        sac.V(jiu0.a(yysVarH1), vys.f38264a, null, yysVarH1.p.c, new cin(yysVarH1, null, (byte) 11), 10);
                        break;
                    case 2:
                        pek pekVar3 = wws.S1;
                        view3.getClass();
                        yys yysVarH2 = wwsVar.H0();
                        yysVarH2.E(gl90.ADD);
                        ali aliVar = yysVarH2.c;
                        ((oeg0) aliVar.f1068a).c().d(new g7p(aliVar, (byte) 18));
                        break;
                    default:
                        pek pekVar4 = wws.S1;
                        view3.getClass();
                        yys yysVarH3 = wwsVar.H0();
                        yysVarH3.E(gl90.ACTIVATE);
                        ali aliVar2 = yysVarH3.c;
                        ((oeg0) aliVar2.f1068a).c().d(new f5p(aliVar2, ((ixs) yysVarH3.B.getValue()).p, (byte) 26));
                        break;
                }
                return Unit.f46060a;
            }
        });
        GameVideoView gameVideoView2 = G0().h;
        gameVideoView2.getBroadcastingControlPanelView().u(H0());
        Class<yys> cls = yys.class;
        G0().h.setOnMediaFileReddyListener(new wej(0, H0(), cls, "onMediaFileReddy", "onMediaFileReddy()V", 0, (byte) 21));
        int i5 = 0;
        int i6 = 0;
        G0().h.setOnMediaFileNeedReloadListener(new wej(i6, H0(), cls, "onMediaFileError", "onMediaFileError()V", i5, (byte) 22));
        G0().h.setOnContainerClickListener(new wej(i6, H0(), cls, "onVideoContainerClick", "onVideoContainerClick()V", i5, (byte) 23));
        G0().h.setSoundEnableButtonClickListener(new wej(i6, H0(), cls, "onSoundEnableButtonClick", "onSoundEnableButtonClick()V", i5, (byte) 24));
        dyb.O(G0().e.c, new Function1(this) { // from class: a.uws
            public final /* synthetic */ wws b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b;
                wws wwsVar = this.b;
                View view3 = (View) obj;
                switch (b4) {
                    case 0:
                        pek pekVar = wws.S1;
                        view3.getClass();
                        yys yysVarH0 = wwsVar.H0();
                        i8i.D("screen", "game_screen", yysVarH0.u.b, "login_page_call");
                        s64 s64Var = yysVarH0.s;
                        y1p y1pVar = y1p.MAIN;
                        s64Var.c("game_screen");
                        i1w0 i1w0VarC = ((oeg0) yysVarH0.c.f1068a).c();
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0VarC, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    case 1:
                        pek pekVar2 = wws.S1;
                        view3.getClass();
                        yys yysVarH1 = wwsVar.H0();
                        i8i.D("screen", "game_screen", yysVarH1.u.b, "reg_page_call");
                        yysVarH1.s.d(y1p.GAME_SCREEN, yysVarH1.t.g());
                        sac.V(jiu0.a(yysVarH1), vys.f38264a, null, yysVarH1.p.c, new cin(yysVarH1, null, (byte) 11), 10);
                        break;
                    case 2:
                        pek pekVar3 = wws.S1;
                        view3.getClass();
                        yys yysVarH2 = wwsVar.H0();
                        yysVarH2.E(gl90.ADD);
                        ali aliVar = yysVarH2.c;
                        ((oeg0) aliVar.f1068a).c().d(new g7p(aliVar, (byte) 18));
                        break;
                    default:
                        pek pekVar4 = wws.S1;
                        view3.getClass();
                        yys yysVarH3 = wwsVar.H0();
                        yysVarH3.E(gl90.ACTIVATE);
                        ali aliVar2 = yysVarH3.c;
                        ((oeg0) aliVar2.f1068a).c().d(new f5p(aliVar2, ((ixs) yysVarH3.B.getValue()).p, (byte) 26));
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b4 = 3;
        dyb.O(G0().b.c, new Function1(this) { // from class: a.uws
            public final /* synthetic */ wws b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                wws wwsVar = this.b;
                View view3 = (View) obj;
                switch (b5) {
                    case 0:
                        pek pekVar = wws.S1;
                        view3.getClass();
                        yys yysVarH0 = wwsVar.H0();
                        i8i.D("screen", "game_screen", yysVarH0.u.b, "login_page_call");
                        s64 s64Var = yysVarH0.s;
                        y1p y1pVar = y1p.MAIN;
                        s64Var.c("game_screen");
                        i1w0 i1w0VarC = ((oeg0) yysVarH0.c.f1068a).c();
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0VarC, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    case 1:
                        pek pekVar2 = wws.S1;
                        view3.getClass();
                        yys yysVarH1 = wwsVar.H0();
                        i8i.D("screen", "game_screen", yysVarH1.u.b, "reg_page_call");
                        yysVarH1.s.d(y1p.GAME_SCREEN, yysVarH1.t.g());
                        sac.V(jiu0.a(yysVarH1), vys.f38264a, null, yysVarH1.p.c, new cin(yysVarH1, null, (byte) 11), 10);
                        break;
                    case 2:
                        pek pekVar3 = wws.S1;
                        view3.getClass();
                        yys yysVarH2 = wwsVar.H0();
                        yysVarH2.E(gl90.ADD);
                        ali aliVar = yysVarH2.c;
                        ((oeg0) aliVar.f1068a).c().d(new g7p(aliVar, (byte) 18));
                        break;
                    default:
                        pek pekVar4 = wws.S1;
                        view3.getClass();
                        yys yysVarH3 = wwsVar.H0();
                        yysVarH3.E(gl90.ACTIVATE);
                        ali aliVar2 = yysVarH3.c;
                        ((oeg0) aliVar2.f1068a).c().d(new f5p(aliVar2, ((ixs) yysVarH3.B.getValue()).p, (byte) 26));
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xws.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            xws xwsVar = (xws) (ze3Var instanceof xws ? ze3Var : null);
            if (xwsVar != null) {
                GameBroadcastingParams gameBroadcastingParams = (GameBroadcastingParams) this.P1.n(this, U1[1]);
                us00 us00Var = xwsVar.f41625a;
                oeg0 oeg0Var = xwsVar.b;
                m1e m1eVar = xwsVar.c;
                cad cadVar = xwsVar.d;
                btt0 btt0Var = xwsVar.e;
                gii0 gii0Var = xwsVar.f;
                bn6 bn6Var = xwsVar.h;
                azj0 azj0Var = xwsVar.i;
                ctf0 ctf0Var = xwsVar.j;
                tgk tgkVar = xwsVar.k;
                gst0 gst0Var = xwsVar.g;
                nhv0 nhv0Var = xwsVar.l;
                ysr ysrVar = xwsVar.m;
                m49 m49Var = xwsVar.p;
                n49 n49Var = xwsVar.q;
                us3 us3Var = xwsVar.s;
                knf0 knf0Var = xwsVar.u;
                pru pruVar = xwsVar.t;
                ik4 ik4Var = xwsVar.v;
                vd1 vd1Var = xwsVar.w;
                atr atrVar = xwsVar.n;
                rsr rsrVar = xwsVar.o;
                s64 s64Var = xwsVar.x;
                cmt cmtVar = xwsVar.y;
                meu0 meu0Var = xwsVar.r;
                b3c0 b3c0Var = xwsVar.z;
                mi70 mi70Var = xwsVar.A;
                roq0 roq0Var = xwsVar.B;
                r9u r9uVar = xwsVar.C;
                c49 c49Var = xwsVar.D;
                viu viuVar = xwsVar.E;
                oeg0Var.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                gst0Var.getClass();
                azj0Var.getClass();
                ctf0Var.getClass();
                tgkVar.getClass();
                nhv0Var.getClass();
                ysrVar.getClass();
                atrVar.getClass();
                rsrVar.getClass();
                m49Var.getClass();
                n49Var.getClass();
                us3Var.getClass();
                knf0Var.getClass();
                b3c0Var.getClass();
                meu0Var.getClass();
                r9uVar.getClass();
                c49Var.getClass();
                this.L1 = new fiu0(wcf0.h(yys.class, (dci) new z8i(cadVar, us00Var, oeg0Var, gameBroadcastingParams, m1eVar, btt0Var, gii0Var, gst0Var, bn6Var, azj0Var, ctf0Var, tgkVar, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, us3Var, knf0Var, pruVar, ik4Var, vd1Var, s64Var, cmtVar, b3c0Var, meu0Var, mi70Var, roq0Var, r9uVar, c49Var, viuVar).E));
                this.M1 = roq0Var;
                return;
            }
        }
        jf4.n(b1j.i(xws.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        yys yysVarH0 = H0();
        lys lysVar = new lys(yysVarH0.B, yysVarH0, (byte) 0);
        Class<wws> cls = wws.class;
        pfl pflVar = new pfl(2, this, cls, "handleUiState", "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/video/part_screen/GameVideoUiState;)V", 4, (byte) 13);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fns(lysVar, clzVarW, pflVar, (yje) null), 3);
        p7m0 p7m0Var = H0().C;
        int i = 4;
        int i2 = 2;
        pfl pflVar2 = new pfl(i2, this, cls, "handleEvent", "handleEvent(Lorg/xplatform/game_broadcasting/impl/presentation/video/part_screen/GameVideoEvent;)V", i, (byte) 14);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fns(p7m0Var, clzVarW2, pflVar2, (yje) null), 3);
        gmq gmqVarB = H0().o.b();
        pfl pflVar3 = new pfl(i2, this, cls, "handleNetworkAvailable", "handleNetworkAvailable(Z)V", i, (byte) 15);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new fns(gmqVarB, clzVarW3, pflVar3, (yje) null, (byte) 0), 3);
    }

    public final e0r G0() {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        return (e0r) objN;
    }

    public final yys H0() {
        return (yys) this.N1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void c0() {
        if (O()) {
            yys yysVarH0 = H0();
            if (((ixs) yysVarH0.B.getValue()).r) {
                yysVarH0.w();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        Object value;
        this.j1 = true;
        c4m0 c4m0Var = H0().G;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = H0().I;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        yys yysVarH0 = H0();
        p7m0 p7m0Var = yysVarH0.B;
        yysVarH0.E = ((ixs) p7m0Var.getValue()).f;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 524191)));
        yysVarH0.B();
        yysVarH0.A();
        G0().h.g();
        GameVideoView gameVideoView = G0().h;
        gameVideoView.i = "";
        gameVideoView.h();
        gameVideoView.n();
        G0().h.k();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        Object value;
        super.e0();
        yys yysVarH0 = H0();
        if (yysVarH0.E) {
            p7m0 p7m0Var = yysVarH0.B;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, true, false, false, false, null, false, false, null, false, null, false, true, 393119)));
        }
        yys yysVarH1 = H0();
        c4m0 c4m0Var = yysVarH1.G;
        byte b = 4;
        byte b2 = 1;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yysVarH1.G = sac.T(new fnq(new p6d(yysVarH1.o.b(), yysVarH1.r.a(), new oys(3, null), b2), new u88(yysVarH1, yjeVar, (byte) 18), b), d5c.S(jiu0.a(yysVarH1), yysVarH1.p.f22085a), pys.h);
        }
        yys yysVarH2 = H0();
        c4m0 c4m0Var2 = yysVarH2.I;
        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
            yysVarH2.I = sac.T(new fnq(new lys(i120.W(new h2c(((neu0) yysVarH2.k.f43005a).f23405a.c, (byte) 25)), yysVarH2, b2), new sys(yysVarH2, yjeVar, (byte) 0), b), d5c.S(jiu0.a(yysVarH2), yysVarH2.p.f22085a), tys.h);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        List<Fragment> listP = F().c.p();
        listP.getClass();
        if (!listP.isEmpty()) {
            for (Fragment fragment : listP) {
                roq0 roq0Var = this.M1;
                if (roq0Var == null) {
                    Intrinsics.h("tipsDialogScreenFactory");
                    throw null;
                }
                fragment.getClass();
                if (roq0Var.b(fragment) && fragment.N()) {
                    H0().z();
                    break;
                }
            }
        }
        F().k0(this.R1, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        F().B0(this.R1);
        G0().h.setVisibility(8);
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        j9o0 j9o0VarZ0;
        Fragment fragment = this.y;
        yx5 yx5Var = fragment instanceof yx5 ? (yx5) fragment : null;
        return (yx5Var == null || (j9o0VarZ0 = yx5Var.getK1()) == null) ? i9o0.f14396a : j9o0VarZ0;
    }
}
