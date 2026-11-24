package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/d4b0;", "La/yx5;", "<init>", "()V", "a/jh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d4b0 extends yx5 {
    public wdk0 K1;
    public final a8z L1;
    public final s0r M1;
    public final kiu0 N1;
    public final a8z O1;
    public y3b0 P1;
    public final yzn0 Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(d4b0.class, "viewBinding", "getViewBinding()Lorg/xplatform/feed/impl/databinding/FragmentPopularClassicChampsBinding;", 0), new ez40(d4b0.class, "screenType", "getScreenType()Lorg/xplatform/feed/presentation/models/PopularClassicChampsScreenType;", 0)};
    public static final jh70 S1 = new jh70();

    public d4b0() {
        super(R.layout.fragment_popular_classic_champs);
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.b4b0
            public final /* synthetic */ d4b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                d4b0 d4b0Var = this.b;
                switch (b2) {
                    case 0:
                        jh70 jh70Var = d4b0.S1;
                        ComponentCallbacks2 application = d4b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(e4b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof e4b0)) {
                                ze3Var = null;
                            }
                            e4b0 e4b0Var = (e4b0) ze3Var;
                            if (e4b0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(d4b0Var);
                                f4b0 f4b0Var = (f4b0) d4b0Var.Q1.n(d4b0Var, d4b0.U1[1]);
                                i1w0VarF.getClass();
                                y3v y3vVar = e4b0Var.n;
                                jw20 jw20Var = e4b0Var.d;
                                ugf0 ugf0Var = e4b0Var.f;
                                bwl bwlVar = e4b0Var.b;
                                a1d a1dVar = e4b0Var.c;
                                mne mneVar = e4b0Var.e;
                                ctf0 ctf0Var = e4b0Var.h;
                                lbu lbuVar = e4b0Var.k;
                                qv2 qv2Var = e4b0Var.g;
                                iip iipVar = e4b0Var.l;
                                g2v g2vVar = e4b0Var.i;
                                m1e m1eVar = e4b0Var.j;
                                nr00 nr00Var = e4b0Var.f7174a;
                                wdk0 wdk0Var = e4b0Var.m;
                                h3c h3cVar = e4b0Var.o;
                                iipVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                wdk0Var.getClass();
                                return new toi(ugf0Var, jw20Var, bwlVar, a1dVar, iipVar, mneVar, nr00Var, y3vVar, i1w0VarF, f4b0Var, m1eVar, qv2Var, g2vVar, lbuVar, wdk0Var, h3cVar);
                            }
                        }
                        jf4.n(b1j.i(e4b0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        jh70 jh70Var2 = d4b0.S1;
                        return new q0h0((soi) ((toi) d4b0Var.L1.getValue()).q.get());
                    default:
                        jh70 jh70Var3 = d4b0.S1;
                        r4b0 r4b0Var = (r4b0) d4b0Var.N1.getValue();
                        a4b0 a4b0Var = new a4b0();
                        gbn gbnVar = new gbn(new pua((byte) 18), new lq4(3, (byte) 25), new gcb(r4b0Var, (byte) 1), qja.e);
                        dp dpVar = a4b0Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new pua((byte) 16), new lq4(3, (byte) 24), new gcb(r4b0Var, (byte) 0), qja.d));
                        return a4b0Var;
                }
            }
        };
        wez wezVar = wez.b;
        this.L1 = maz.a(wezVar, function0);
        this.M1 = ltt0.o(this, c4b0.f3717a);
        final byte b2 = 1;
        Function0 function1 = new Function0(this) { // from class: a.b4b0
            public final /* synthetic */ d4b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                d4b0 d4b0Var = this.b;
                switch (b3) {
                    case 0:
                        jh70 jh70Var = d4b0.S1;
                        ComponentCallbacks2 application = d4b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(e4b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof e4b0)) {
                                ze3Var = null;
                            }
                            e4b0 e4b0Var = (e4b0) ze3Var;
                            if (e4b0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(d4b0Var);
                                f4b0 f4b0Var = (f4b0) d4b0Var.Q1.n(d4b0Var, d4b0.U1[1]);
                                i1w0VarF.getClass();
                                y3v y3vVar = e4b0Var.n;
                                jw20 jw20Var = e4b0Var.d;
                                ugf0 ugf0Var = e4b0Var.f;
                                bwl bwlVar = e4b0Var.b;
                                a1d a1dVar = e4b0Var.c;
                                mne mneVar = e4b0Var.e;
                                ctf0 ctf0Var = e4b0Var.h;
                                lbu lbuVar = e4b0Var.k;
                                qv2 qv2Var = e4b0Var.g;
                                iip iipVar = e4b0Var.l;
                                g2v g2vVar = e4b0Var.i;
                                m1e m1eVar = e4b0Var.j;
                                nr00 nr00Var = e4b0Var.f7174a;
                                wdk0 wdk0Var = e4b0Var.m;
                                h3c h3cVar = e4b0Var.o;
                                iipVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                wdk0Var.getClass();
                                return new toi(ugf0Var, jw20Var, bwlVar, a1dVar, iipVar, mneVar, nr00Var, y3vVar, i1w0VarF, f4b0Var, m1eVar, qv2Var, g2vVar, lbuVar, wdk0Var, h3cVar);
                            }
                        }
                        jf4.n(b1j.i(e4b0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        jh70 jh70Var2 = d4b0.S1;
                        return new q0h0((soi) ((toi) d4b0Var.L1.getValue()).q.get());
                    default:
                        jh70 jh70Var3 = d4b0.S1;
                        r4b0 r4b0Var = (r4b0) d4b0Var.N1.getValue();
                        a4b0 a4b0Var = new a4b0();
                        gbn gbnVar = new gbn(new pua((byte) 18), new lq4(3, (byte) 25), new gcb(r4b0Var, (byte) 1), qja.e);
                        dp dpVar = a4b0Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new pua((byte) 16), new lq4(3, (byte) 24), new gcb(r4b0Var, (byte) 0), qja.d));
                        return a4b0Var;
                }
            }
        };
        a8z a8zVarA = maz.a(wezVar, new wz80(new wz80(this, (byte) 23), (byte) 24));
        this.N1 = agc.G(this, sre0.f32672a.b(r4b0.class), new a190(a8zVarA, (byte) 22), new a190(a8zVarA, (byte) 23), function1);
        final byte b3 = 2;
        this.O1 = maz.a(wezVar, new Function0(this) { // from class: a.b4b0
            public final /* synthetic */ d4b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                d4b0 d4b0Var = this.b;
                switch (b4) {
                    case 0:
                        jh70 jh70Var = d4b0.S1;
                        ComponentCallbacks2 application = d4b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(e4b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof e4b0)) {
                                ze3Var = null;
                            }
                            e4b0 e4b0Var = (e4b0) ze3Var;
                            if (e4b0Var != null) {
                                i1w0 i1w0VarF = a4n0.f(d4b0Var);
                                f4b0 f4b0Var = (f4b0) d4b0Var.Q1.n(d4b0Var, d4b0.U1[1]);
                                i1w0VarF.getClass();
                                y3v y3vVar = e4b0Var.n;
                                jw20 jw20Var = e4b0Var.d;
                                ugf0 ugf0Var = e4b0Var.f;
                                bwl bwlVar = e4b0Var.b;
                                a1d a1dVar = e4b0Var.c;
                                mne mneVar = e4b0Var.e;
                                ctf0 ctf0Var = e4b0Var.h;
                                lbu lbuVar = e4b0Var.k;
                                qv2 qv2Var = e4b0Var.g;
                                iip iipVar = e4b0Var.l;
                                g2v g2vVar = e4b0Var.i;
                                m1e m1eVar = e4b0Var.j;
                                nr00 nr00Var = e4b0Var.f7174a;
                                wdk0 wdk0Var = e4b0Var.m;
                                h3c h3cVar = e4b0Var.o;
                                iipVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                wdk0Var.getClass();
                                return new toi(ugf0Var, jw20Var, bwlVar, a1dVar, iipVar, mneVar, nr00Var, y3vVar, i1w0VarF, f4b0Var, m1eVar, qv2Var, g2vVar, lbuVar, wdk0Var, h3cVar);
                            }
                        }
                        jf4.n(b1j.i(e4b0.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        jh70 jh70Var2 = d4b0.S1;
                        return new q0h0((soi) ((toi) d4b0Var.L1.getValue()).q.get());
                    default:
                        jh70 jh70Var3 = d4b0.S1;
                        r4b0 r4b0Var = (r4b0) d4b0Var.N1.getValue();
                        a4b0 a4b0Var = new a4b0();
                        gbn gbnVar = new gbn(new pua((byte) 18), new lq4(3, (byte) 25), new gcb(r4b0Var, (byte) 1), qja.e);
                        dp dpVar = a4b0Var.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new pua((byte) 16), new lq4(3, (byte) 24), new gcb(r4b0Var, (byte) 0), qja.d));
                        return a4b0Var;
                }
            }
        });
        this.Q1 = new yzn0("SCREEN_TYPE_KEY");
        this.R1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        I0();
        RecyclerView recyclerView = H0().c;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(G0());
        Context context = recyclerView.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        Resources resources = context.getResources();
        int i = R.dimen.space_8;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.space_8);
        Resources resources2 = context.getResources();
        if (context.getResources().getBoolean(R.bool.isTablet)) {
            i = R.dimen.space_32;
        }
        int dimensionPixelOffset = resources2.getDimensionPixelOffset(i);
        float dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_20);
        recyclerView.m(new qmk0(dimensionPixelSize, dimensionPixelOffset, 0, dimensionPixelOffset, 0, 1, null, null, 468));
        TypedValue typedValue = j5d.f15927a;
        y3b0 y3b0Var = new y3b0(j5d.a(context, R.attr.uikitBackgroundGroup, false), dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, new kma0((byte) 11), new kma0((byte) 12));
        recyclerView.m(y3b0Var);
        this.P1 = y3b0Var;
        vvw.o(recyclerView, true, 1);
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = ((toi) this.L1.getValue()).f34285a;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.N1;
        r4b0 r4b0Var = (r4b0) kiu0Var.getValue();
        yje yjeVar = null;
        int i = 4;
        dnq dnqVar = new dnq(new fnq(new fnq(r4b0Var.u, new o4b0(r4b0Var, yjeVar, (byte) 0), (byte) 4), new d7a0(r4b0Var, yjeVar, (byte) 1)), new gbv(r4b0Var, yjeVar, (byte) 20), (byte) 0);
        lkz lkzVar = lkz.f20223a;
        Class<d4b0> cls = d4b0.class;
        hi70 hi70Var = new hi70(2, this, cls, "handleScreenUiState", "handleScreenUiState(Lorg/xplatform/feed/popularclassic/champs/PopularClassicChampsViewModel$ScreenUiState;)V", i, (byte) 26);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fra0(dnqVar, clzVarW, hi70Var, (yje) null), 3);
        ol60 ol60Var = ((r4b0) kiu0Var.getValue()).t;
        hi70 hi70Var2 = new hi70(2, this, cls, "handleActionUiState", "handleActionUiState(Lorg/xplatform/feed/popularclassic/champs/PopularClassicChampsViewModel$ActionUiState;)V", i, (byte) 27);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fra0(ol60Var, clzVarW2, hi70Var2, (yje) null), 3);
    }

    public final a4b0 G0() {
        return (a4b0) this.O1.getValue();
    }

    public final v2r H0() {
        Object objN = this.M1.n(U1[0], this);
        objN.getClass();
        return (v2r) objN;
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
    public final boolean getW1() {
        return this.R1;
    }
}
