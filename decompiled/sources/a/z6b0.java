package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/z6b0;", "La/yx5;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z6b0 extends yx5 {
    public pek K1;
    public tzi L1;
    public final a8z M1;
    public final s0r N1;
    public final kiu0 O1;
    public final a8z P1;
    public final yzn0 Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(z6b0.class, "viewBinding", "getViewBinding()Lorg/xplatform/feed/impl/databinding/FragmentPopularClassicGamesBinding;", 0), new ez40(z6b0.class, "screenType", "getScreenType()Lorg/xplatform/feed/presentation/models/PopularClassicGamesScreenType;", 0)};
    public static final fl70 S1 = new fl70();

    public z6b0() {
        super(R.layout.fragment_popular_classic_games);
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.w6b0
            public final /* synthetic */ z6b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                z6b0 z6b0Var = this.b;
                switch (b2) {
                    case 0:
                        fl70 fl70Var = z6b0.S1;
                        ComponentCallbacks2 application = z6b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(a7b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof a7b0)) {
                                ze3Var = null;
                            }
                            a7b0 a7b0Var = (a7b0) ze3Var;
                            if (a7b0Var != null) {
                                b7b0 b7b0Var = (b7b0) z6b0Var.Q1.n(z6b0Var, z6b0.U1[1]);
                                ugf0 ugf0Var = a7b0Var.c;
                                jw20 jw20Var = a7b0Var.d;
                                mne mneVar = a7b0Var.b;
                                itr itrVar = a7b0Var.e;
                                ctf0 ctf0Var = a7b0Var.f;
                                y78 y78Var = a7b0Var.g;
                                lbu lbuVar = a7b0Var.j;
                                pru pruVar = a7b0Var.k;
                                iip iipVar = a7b0Var.l;
                                g2v g2vVar = a7b0Var.h;
                                m1e m1eVar = a7b0Var.i;
                                nr00 nr00Var = a7b0Var.f359a;
                                vqc vqcVar = a7b0Var.m;
                                h3c h3cVar = a7b0Var.n;
                                viu viuVar = a7b0Var.o;
                                itrVar.getClass();
                                iipVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                return new zoi(itrVar, jw20Var, ugf0Var, iipVar, mneVar, nr00Var, h3cVar, vqcVar, b7b0Var, m1eVar, g2vVar, ctf0Var, y78Var, lbuVar, pruVar, viuVar);
                            }
                        }
                        jf4.n(b1j.i(a7b0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        fl70 fl70Var2 = z6b0.S1;
                        return new q0h0((yoi) ((zoi) z6b0Var.M1.getValue()).q.get());
                    default:
                        fl70 fl70Var3 = z6b0.S1;
                        l7b0 l7b0Var = (l7b0) z6b0Var.O1.getValue();
                        if (z6b0Var.K1 == null) {
                            Intrinsics.h("gameCardCommonAdapterDelegates");
                            throw null;
                        }
                        dtr dtrVar = new dtr();
                        dp dpVar = dtrVar.d;
                        dpVar.getClass();
                        pek.f(dpVar, l7b0Var);
                        return dtrVar;
                }
            }
        };
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, function0);
        this.N1 = ltt0.o(this, y6b0.f42090a);
        final byte b2 = 1;
        Function0 function1 = new Function0(this) { // from class: a.w6b0
            public final /* synthetic */ z6b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                z6b0 z6b0Var = this.b;
                switch (b3) {
                    case 0:
                        fl70 fl70Var = z6b0.S1;
                        ComponentCallbacks2 application = z6b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(a7b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof a7b0)) {
                                ze3Var = null;
                            }
                            a7b0 a7b0Var = (a7b0) ze3Var;
                            if (a7b0Var != null) {
                                b7b0 b7b0Var = (b7b0) z6b0Var.Q1.n(z6b0Var, z6b0.U1[1]);
                                ugf0 ugf0Var = a7b0Var.c;
                                jw20 jw20Var = a7b0Var.d;
                                mne mneVar = a7b0Var.b;
                                itr itrVar = a7b0Var.e;
                                ctf0 ctf0Var = a7b0Var.f;
                                y78 y78Var = a7b0Var.g;
                                lbu lbuVar = a7b0Var.j;
                                pru pruVar = a7b0Var.k;
                                iip iipVar = a7b0Var.l;
                                g2v g2vVar = a7b0Var.h;
                                m1e m1eVar = a7b0Var.i;
                                nr00 nr00Var = a7b0Var.f359a;
                                vqc vqcVar = a7b0Var.m;
                                h3c h3cVar = a7b0Var.n;
                                viu viuVar = a7b0Var.o;
                                itrVar.getClass();
                                iipVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                return new zoi(itrVar, jw20Var, ugf0Var, iipVar, mneVar, nr00Var, h3cVar, vqcVar, b7b0Var, m1eVar, g2vVar, ctf0Var, y78Var, lbuVar, pruVar, viuVar);
                            }
                        }
                        jf4.n(b1j.i(a7b0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        fl70 fl70Var2 = z6b0.S1;
                        return new q0h0((yoi) ((zoi) z6b0Var.M1.getValue()).q.get());
                    default:
                        fl70 fl70Var3 = z6b0.S1;
                        l7b0 l7b0Var = (l7b0) z6b0Var.O1.getValue();
                        if (z6b0Var.K1 == null) {
                            Intrinsics.h("gameCardCommonAdapterDelegates");
                            throw null;
                        }
                        dtr dtrVar = new dtr();
                        dp dpVar = dtrVar.d;
                        dpVar.getClass();
                        pek.f(dpVar, l7b0Var);
                        return dtrVar;
                }
            }
        };
        a8z a8zVarA = maz.a(wezVar, new wz80(new wz80(this, (byte) 28), (byte) 29));
        this.O1 = agc.G(this, sre0.f32672a.b(l7b0.class), new x6b0(a8zVarA, (byte) 0), new x6b0(a8zVarA, (byte) 1), function1);
        final byte b3 = 2;
        this.P1 = maz.a(wezVar, new Function0(this) { // from class: a.w6b0
            public final /* synthetic */ z6b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                z6b0 z6b0Var = this.b;
                switch (b4) {
                    case 0:
                        fl70 fl70Var = z6b0.S1;
                        ComponentCallbacks2 application = z6b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(a7b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof a7b0)) {
                                ze3Var = null;
                            }
                            a7b0 a7b0Var = (a7b0) ze3Var;
                            if (a7b0Var != null) {
                                b7b0 b7b0Var = (b7b0) z6b0Var.Q1.n(z6b0Var, z6b0.U1[1]);
                                ugf0 ugf0Var = a7b0Var.c;
                                jw20 jw20Var = a7b0Var.d;
                                mne mneVar = a7b0Var.b;
                                itr itrVar = a7b0Var.e;
                                ctf0 ctf0Var = a7b0Var.f;
                                y78 y78Var = a7b0Var.g;
                                lbu lbuVar = a7b0Var.j;
                                pru pruVar = a7b0Var.k;
                                iip iipVar = a7b0Var.l;
                                g2v g2vVar = a7b0Var.h;
                                m1e m1eVar = a7b0Var.i;
                                nr00 nr00Var = a7b0Var.f359a;
                                vqc vqcVar = a7b0Var.m;
                                h3c h3cVar = a7b0Var.n;
                                viu viuVar = a7b0Var.o;
                                itrVar.getClass();
                                iipVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                return new zoi(itrVar, jw20Var, ugf0Var, iipVar, mneVar, nr00Var, h3cVar, vqcVar, b7b0Var, m1eVar, g2vVar, ctf0Var, y78Var, lbuVar, pruVar, viuVar);
                            }
                        }
                        jf4.n(b1j.i(a7b0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        fl70 fl70Var2 = z6b0.S1;
                        return new q0h0((yoi) ((zoi) z6b0Var.M1.getValue()).q.get());
                    default:
                        fl70 fl70Var3 = z6b0.S1;
                        l7b0 l7b0Var = (l7b0) z6b0Var.O1.getValue();
                        if (z6b0Var.K1 == null) {
                            Intrinsics.h("gameCardCommonAdapterDelegates");
                            throw null;
                        }
                        dtr dtrVar = new dtr();
                        dp dpVar = dtrVar.d;
                        dpVar.getClass();
                        pek.f(dpVar, l7b0Var);
                        return dtrVar;
                }
            }
        });
        this.Q1 = new yzn0("SCREEN_TYPE_KEY");
        this.R1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        ms2 hr2Var;
        I0();
        RecyclerView recyclerView = H0().c;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 1));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(G0());
        Context context = recyclerView.getContext();
        context.getClass();
        if (context.getResources().getBoolean(R.bool.isTablet)) {
            Context context2 = recyclerView.getContext();
            context2.getClass();
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.space_32);
            int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.space_4);
            recyclerView.m(new ncu0(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, context2.getResources().getDimensionPixelSize(R.dimen.space_8)));
        } else {
            Resources resources = recyclerView.getResources();
            resources.getClass();
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.space_8);
            recyclerView.m(new qmk0(dimensionPixelSize3, dimensionPixelSize3, 0, dimensionPixelSize3, 0, 1, null, null, 468));
        }
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            Context context3 = recyclerView.getContext();
            context3.getClass();
            if (context3.getResources().getBoolean(R.bool.isTablet)) {
                ((GridLayoutManager) layoutManager).N1(2);
            } else {
                ((GridLayoutManager) layoutManager).N1(1);
            }
        }
        tzi tziVar = this.L1;
        if (tziVar == null) {
            Intrinsics.h("gameCardFragmentDelegate");
            throw null;
        }
        l7b0 l7b0Var = (l7b0) this.O1.getValue();
        int iOrdinal = ((b7b0) this.Q1.n(this, U1[1])).ordinal();
        if (iOrdinal == 0) {
            hr2Var = new hr2();
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            hr2Var = new gr2();
        }
        tziVar.w(this, l7b0Var, hr2Var);
    }

    @Override // a.yx5
    public final void C0() {
        itr itrVar = ((zoi) this.M1.getValue()).f44721a;
        this.K1 = itrVar.c();
        tzi tziVarE = itrVar.e();
        x1x.x(tziVarE);
        this.L1 = tziVarE;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        l7b0 l7b0Var = (l7b0) this.O1.getValue();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new fnq(new fnq(l7b0Var.s, new s980(l7b0Var, yjeVar, (byte) 24), (byte) 4), new d7a0(l7b0Var, yjeVar, (byte) 3)), new gbv(l7b0Var, yjeVar, (byte) 22), (byte) 0);
        lkz lkzVar = lkz.f20223a;
        p6b0 p6b0Var = new p6b0(2, this, z6b0.class, "handleScreenUiState", "handleScreenUiState(Lorg/xplatform/feed/popularclassic/games/PopularClassicGamesViewModel$ScreenUiState;)V", 4, (byte) 15);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fra0(dnqVar, clzVarW, p6b0Var, (yje) null, (byte) 0), 3);
    }

    public final dtr G0() {
        return (dtr) this.P1.getValue();
    }

    public final x2r H0() {
        Object objN = this.N1.n(U1[0], this);
        objN.getClass();
        return (x2r) objN;
    }

    public final void I0() {
        ConstraintLayout constraintLayout = H0().d.b;
        x0x.O(constraintLayout);
        constraintLayout.setVisibility(8);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        H0().c.setAdapter(null);
        super.Z();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.R1;
    }
}
