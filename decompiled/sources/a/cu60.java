package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackMiniCardView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cu60;", "La/yx5;", "<init>", "()V", "a/evz", "cashback"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cu60 extends yx5 {
    public final phf0 K1;
    public ii L1;
    public wdk0 M1;
    public peg0 N1;
    public tbi O1;
    public final kiu0 P1;
    public final kiu0 Q1;
    public final s0r R1;
    public final hnm0 S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(cu60.class, "umResultKey", "getUmResultKey()Ljava/lang/String;", 0), new j0d0(cu60.class, "viewBinding", "getViewBinding()Lorg/xplatform/games_section/feature/cashback/databinding/CashbackFragmentBinding;", 0)};
    public static final evz U1 = new evz();

    public cu60() {
        super(R.layout.cashback_fragment);
        this.K1 = new phf0("UM_RESULT_KEY");
        yt60 yt60Var = new yt60(this, (byte) 7);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new ej50(yt60Var, (byte) 17));
        tre0 tre0Var = sre0.f32672a;
        this.P1 = agc.G(this, tre0Var.b(k370.class), new co60(a8zVarA, (byte) 8), new co60(a8zVarA, (byte) 9), new ha30(this, a8zVarA, (byte) 14));
        yt60 yt60Var2 = new yt60(this, (byte) 1);
        a8z a8zVarA2 = maz.a(wezVar, new ej50(new ej50(this, (byte) 18), (byte) 19));
        this.Q1 = agc.G(this, tre0Var.b(h2b.class), new co60(a8zVarA2, (byte) 10), new co60(a8zVarA2, (byte) 11), yt60Var2);
        this.R1 = ltt0.o(this, bu60.f3216a);
        this.S1 = hnm0.f13359a;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        h2b h2bVarH0 = H0();
        final byte b = 3;
        final byte b2 = 1;
        final byte b3 = 0;
        slb.U(new fnq(new dnq(h2bVarH0.n.b(), new lo3(3, null, (byte) 6), (byte) 1), new a2b(h2bVarH0, null, (byte) 0), (byte) 4), jiu0.a(h2bVarH0));
        h2bVarH0.C();
        final byte b4 = 2;
        o2t.e(F(), this, new Function1(this) { // from class: a.au60
            public final /* synthetic */ cu60 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b3;
                cu60 cu60Var = this.b;
                switch (b5) {
                    case 0:
                        Long l = (Long) obj;
                        long jLongValue = l.longValue();
                        evz evzVar = cu60.U1;
                        o2t.b(cu60Var.F(), jLongValue, cu60Var.K1.n(cu60Var, cu60.V1[0]));
                        cu60Var.H0().F(kotlin.collections.a.c(l));
                        break;
                    case 1:
                        evz evzVar2 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH1 = cu60Var.H0();
                        String simpleName = cu60.class.getSimpleName();
                        String loadedPictureUrl = cu60Var.G0().g.getLoadedPictureUrl();
                        p7m0 p7m0Var = h2bVarH1.V;
                        o1b o1bVar = ((q1b) p7m0Var.getValue()).f27944a;
                        if (o1bVar != null) {
                            h2bVarH1.y(simpleName, o1bVar.f24472a, false, loadedPictureUrl);
                        } else {
                            h2bVarH1.b.d(new qi4(h2bVarH1, x1x.D(((q1b) p7m0Var.getValue()).d.f26192a.f17401a), (byte) 2));
                        }
                        break;
                    case 2:
                        evz evzVar3 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH2 = cu60Var.H0();
                        String simpleName2 = cu60.class.getSimpleName();
                        String loadedPictureUrl2 = cu60Var.G0().m.getLoadedPictureUrl();
                        p7m0 p7m0Var2 = h2bVarH2.V;
                        o1b o1bVar2 = ((q1b) p7m0Var2.getValue()).b;
                        if (o1bVar2 != null) {
                            h2bVarH2.y(simpleName2, o1bVar2.f24472a, false, loadedPictureUrl2);
                        } else {
                            h2bVarH2.b.d(new qi4(h2bVarH2, x1x.D(((q1b) p7m0Var2.getValue()).d.f26192a.f17401a), (byte) 2));
                        }
                        break;
                    default:
                        evz evzVar4 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH3 = cu60Var.H0();
                        String simpleName3 = cu60.class.getSimpleName();
                        String loadedPictureUrl3 = cu60Var.G0().k.getLoadedPictureUrl();
                        o1b o1bVar3 = ((q1b) h2bVarH3.V.getValue()).c;
                        if (o1bVar3 != null) {
                            h2bVarH3.y(simpleName3, o1bVar3.f24472a, true, loadedPictureUrl3);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, new yt60(this, (byte) 2), null, 18);
        MaterialToolbar materialToolbar = G0().n;
        materialToolbar.l(R.menu.menu_cashback);
        materialToolbar.setNavigationOnClickListener(new l910(this, (byte) 7));
        materialToolbar.setOnMenuItemClickListener(new zt60(this));
        CollapsingToolbarLayout collapsingToolbarLayout = G0().e;
        hny hnyVar = new hny((byte) 19);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(collapsingToolbarLayout, hnyVar);
        G0().p.setVisibility(8);
        c5k c5kVar = new c5k();
        AppBarLayout appBarLayout = G0().c;
        n6r n6rVarK = K();
        vb3 vb3Var = new vb3(new View[]{G0().o}, (byte) 0);
        appBarLayout.a(vb3Var);
        c5kVar.f3775a = vb3Var;
        wb3 wb3Var = new wb3(c5kVar, appBarLayout, n6rVarK, (byte) 0);
        n6rVarK.b();
        n6rVarK.c.a(wb3Var);
        c5kVar.b = wb3Var;
        G0().p.setButtonClick(new yt60(this, (byte) 0));
        ccq0.V(this, "REQUEST_FREE_SPIN", new yt60(this, (byte) 3));
        dyb.c0(G0().g, new Function1(this) { // from class: a.au60
            public final /* synthetic */ cu60 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b2;
                cu60 cu60Var = this.b;
                switch (b5) {
                    case 0:
                        Long l = (Long) obj;
                        long jLongValue = l.longValue();
                        evz evzVar = cu60.U1;
                        o2t.b(cu60Var.F(), jLongValue, cu60Var.K1.n(cu60Var, cu60.V1[0]));
                        cu60Var.H0().F(kotlin.collections.a.c(l));
                        break;
                    case 1:
                        evz evzVar2 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH1 = cu60Var.H0();
                        String simpleName = cu60.class.getSimpleName();
                        String loadedPictureUrl = cu60Var.G0().g.getLoadedPictureUrl();
                        p7m0 p7m0Var = h2bVarH1.V;
                        o1b o1bVar = ((q1b) p7m0Var.getValue()).f27944a;
                        if (o1bVar != null) {
                            h2bVarH1.y(simpleName, o1bVar.f24472a, false, loadedPictureUrl);
                        } else {
                            h2bVarH1.b.d(new qi4(h2bVarH1, x1x.D(((q1b) p7m0Var.getValue()).d.f26192a.f17401a), (byte) 2));
                        }
                        break;
                    case 2:
                        evz evzVar3 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH2 = cu60Var.H0();
                        String simpleName2 = cu60.class.getSimpleName();
                        String loadedPictureUrl2 = cu60Var.G0().m.getLoadedPictureUrl();
                        p7m0 p7m0Var2 = h2bVarH2.V;
                        o1b o1bVar2 = ((q1b) p7m0Var2.getValue()).b;
                        if (o1bVar2 != null) {
                            h2bVarH2.y(simpleName2, o1bVar2.f24472a, false, loadedPictureUrl2);
                        } else {
                            h2bVarH2.b.d(new qi4(h2bVarH2, x1x.D(((q1b) p7m0Var2.getValue()).d.f26192a.f17401a), (byte) 2));
                        }
                        break;
                    default:
                        evz evzVar4 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH3 = cu60Var.H0();
                        String simpleName3 = cu60.class.getSimpleName();
                        String loadedPictureUrl3 = cu60Var.G0().k.getLoadedPictureUrl();
                        o1b o1bVar3 = ((q1b) h2bVarH3.V.getValue()).c;
                        if (o1bVar3 != null) {
                            h2bVarH3.y(simpleName3, o1bVar3.f24472a, true, loadedPictureUrl3);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.c0(G0().m, new Function1(this) { // from class: a.au60
            public final /* synthetic */ cu60 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                cu60 cu60Var = this.b;
                switch (b5) {
                    case 0:
                        Long l = (Long) obj;
                        long jLongValue = l.longValue();
                        evz evzVar = cu60.U1;
                        o2t.b(cu60Var.F(), jLongValue, cu60Var.K1.n(cu60Var, cu60.V1[0]));
                        cu60Var.H0().F(kotlin.collections.a.c(l));
                        break;
                    case 1:
                        evz evzVar2 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH1 = cu60Var.H0();
                        String simpleName = cu60.class.getSimpleName();
                        String loadedPictureUrl = cu60Var.G0().g.getLoadedPictureUrl();
                        p7m0 p7m0Var = h2bVarH1.V;
                        o1b o1bVar = ((q1b) p7m0Var.getValue()).f27944a;
                        if (o1bVar != null) {
                            h2bVarH1.y(simpleName, o1bVar.f24472a, false, loadedPictureUrl);
                        } else {
                            h2bVarH1.b.d(new qi4(h2bVarH1, x1x.D(((q1b) p7m0Var.getValue()).d.f26192a.f17401a), (byte) 2));
                        }
                        break;
                    case 2:
                        evz evzVar3 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH2 = cu60Var.H0();
                        String simpleName2 = cu60.class.getSimpleName();
                        String loadedPictureUrl2 = cu60Var.G0().m.getLoadedPictureUrl();
                        p7m0 p7m0Var2 = h2bVarH2.V;
                        o1b o1bVar2 = ((q1b) p7m0Var2.getValue()).b;
                        if (o1bVar2 != null) {
                            h2bVarH2.y(simpleName2, o1bVar2.f24472a, false, loadedPictureUrl2);
                        } else {
                            h2bVarH2.b.d(new qi4(h2bVarH2, x1x.D(((q1b) p7m0Var2.getValue()).d.f26192a.f17401a), (byte) 2));
                        }
                        break;
                    default:
                        evz evzVar4 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH3 = cu60Var.H0();
                        String simpleName3 = cu60.class.getSimpleName();
                        String loadedPictureUrl3 = cu60Var.G0().k.getLoadedPictureUrl();
                        o1b o1bVar3 = ((q1b) h2bVarH3.V.getValue()).c;
                        if (o1bVar3 != null) {
                            h2bVarH3.y(simpleName3, o1bVar3.f24472a, true, loadedPictureUrl3);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.c0(G0().k, new Function1(this) { // from class: a.au60
            public final /* synthetic */ cu60 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b;
                cu60 cu60Var = this.b;
                switch (b5) {
                    case 0:
                        Long l = (Long) obj;
                        long jLongValue = l.longValue();
                        evz evzVar = cu60.U1;
                        o2t.b(cu60Var.F(), jLongValue, cu60Var.K1.n(cu60Var, cu60.V1[0]));
                        cu60Var.H0().F(kotlin.collections.a.c(l));
                        break;
                    case 1:
                        evz evzVar2 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH1 = cu60Var.H0();
                        String simpleName = cu60.class.getSimpleName();
                        String loadedPictureUrl = cu60Var.G0().g.getLoadedPictureUrl();
                        p7m0 p7m0Var = h2bVarH1.V;
                        o1b o1bVar = ((q1b) p7m0Var.getValue()).f27944a;
                        if (o1bVar != null) {
                            h2bVarH1.y(simpleName, o1bVar.f24472a, false, loadedPictureUrl);
                        } else {
                            h2bVarH1.b.d(new qi4(h2bVarH1, x1x.D(((q1b) p7m0Var.getValue()).d.f26192a.f17401a), (byte) 2));
                        }
                        break;
                    case 2:
                        evz evzVar3 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH2 = cu60Var.H0();
                        String simpleName2 = cu60.class.getSimpleName();
                        String loadedPictureUrl2 = cu60Var.G0().m.getLoadedPictureUrl();
                        p7m0 p7m0Var2 = h2bVarH2.V;
                        o1b o1bVar2 = ((q1b) p7m0Var2.getValue()).b;
                        if (o1bVar2 != null) {
                            h2bVarH2.y(simpleName2, o1bVar2.f24472a, false, loadedPictureUrl2);
                        } else {
                            h2bVarH2.b.d(new qi4(h2bVarH2, x1x.D(((q1b) p7m0Var2.getValue()).d.f26192a.f17401a), (byte) 2));
                        }
                        break;
                    default:
                        evz evzVar4 = cu60.U1;
                        ((View) obj).getClass();
                        h2b h2bVarH3 = cu60Var.H0();
                        String simpleName3 = cu60.class.getSimpleName();
                        String loadedPictureUrl3 = cu60Var.G0().k.getLoadedPictureUrl();
                        o1b o1bVar3 = ((q1b) h2bVarH3.V.getValue()).c;
                        if (o1bVar3 != null) {
                            h2bVarH3.y(simpleName3, o1bVar3.f24472a, true, loadedPictureUrl3);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        if (!(application instanceof vmv)) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
        if (applicationLoader.c() == null) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        g8i g8iVarC = applicationLoader.c();
        if (g8iVarC == null) {
            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.CashbackDependencies");
            return;
        }
        a4n0.f(this).getClass();
        nhf0 nhf0Var = new nhf0(new kj5(), g8iVarC);
        this.L1 = g8iVarC.j();
        wdk0 wdk0VarI9 = g8iVarC.I9();
        x1x.x(wdk0VarI9);
        this.M1 = wdk0VarI9;
        this.N1 = g8iVarC.O0();
        this.O1 = (tbi) ((n5d0) nhf0Var.d).get();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        int i;
        int iOrdinal = H0().H.b().ordinal();
        if (iOrdinal == 0) {
            i = R.style.Widget_DSAccountSelection_Primary;
        } else if (iOrdinal == 1) {
            i = R.style.Widget_DSAccountSelection_Secondary;
        } else if (iOrdinal == 2) {
            i = R.style.Widget_DSAccountSelection_Tertiary;
        } else if (iOrdinal == 3) {
            i = R.style.Widget_DSAccountSelection_Quaternary;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return;
            }
            i = R.style.Widget_DSAccountSelection_Fivefold;
        }
        eu4 eu4Var = new eu4(Integer.valueOf(i), (byte) 12);
        vf20 vf20Var = new vf20(2, this, cu60.class, "handleAccountSelectionStyleType", "handleAccountSelectionStyleType(I)V", 4, (byte) 14);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yd60(eu4Var, clzVarW, vf20Var, (yje) null), 3);
        ol60 ol60Var = H0().U;
        vf20 vf20Var2 = new vf20(2, this, cu60.class, "handleOneExecutionState", "handleOneExecutionState(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/CashbackViewModelOld$OneExecutionState;)V", 4, (byte) 15);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new yd60((gmq) ol60Var, clzVarW2, vf20Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var = H0().V;
        vf20 vf20Var3 = new vf20(2, this, cu60.class, "handleViewState", "handleViewState(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/CashbackViewModelOld$CashbackViewState;)V", 4, (byte) 16);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new yd60((gmq) p7m0Var, clzVarW3, vf20Var3, (yje) null, (char) 0), 3);
        p7m0 p7m0Var2 = H0().Z;
        vf20 vf20Var4 = new vf20(2, this, cu60.class, "handleViewActions", "handleViewActions(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/ViewAction;)V", 4, (byte) 17);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new yd60(p7m0Var2, clzVarW4, vf20Var4, (yje) null, 0), 3);
        p7m0 p7m0Var3 = H0().X;
        vf20 vf20Var5 = new vf20(2, this, cu60.class, "showLoading", "showLoading(Z)V", 4, (byte) 18);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new yd60((gmq) p7m0Var3, clzVarW5, vf20Var5, (yje) null, (short) 0), 3);
        p7m0 p7m0Var4 = H0().W;
        vf20 vf20Var6 = new vf20(2, this, cu60.class, "setBalance", "setBalance(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/CashbackViewModelOld$BalanceUiModel;)V", 4, (byte) 19);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new yd60((gmq) p7m0Var4, clzVarW6, vf20Var6, (yje) null, (byte) 0, false), 3);
        p7m0 p7m0Var5 = H0().Y;
        vf20 vf20Var7 = new vf20(2, this, cu60.class, "showError", "showError(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/CashbackViewModelOld$ErrorState;)V", 4, (byte) 20);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new yd60(p7m0Var5, clzVarW7, vf20Var7, (yje) null, (byte) 0, (byte) 0), 3);
        gmq gmqVarW = ((k370) this.P1.getValue()).w();
        vf20 vf20Var8 = new vf20(2, this, cu60.class, "handleGamesSharedState", "handleGamesSharedState(Lorg/xplatform/core/presentation/shared_view_model/OneXGamesSharedState;)V", 4, (byte) 21);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new yd60((i89) gmqVarW, clzVarW8, vf20Var8, (yje) null), 3);
    }

    public final aza G0() {
        Object objN = this.R1.n(V1[1], this);
        objN.getClass();
        return (aza) objN;
    }

    public final h2b H0() {
        return (h2b) this.Q1.getValue();
    }

    public final void I0(CashbackMiniCardView cashbackMiniCardView, a570 a570Var, boolean z, boolean z2, String str, hds hdsVar, boolean z3) {
        a570Var.getClass();
        hdsVar.getClass();
        cashbackMiniCardView.c = null;
        cashbackMiniCardView.f46728a = a570Var;
        String str2 = hdsVar.b;
        String strR = azw.R(str2);
        ImageView imageView = (ImageView) cashbackMiniCardView.b.g;
        lya lyaVar = new lya(cashbackMiniCardView, (byte) 1);
        strR.getClass();
        Context context = imageView.getContext();
        context.getClass();
        hxm0.x(imageView, (int) Math.ceil(context.getResources().getDisplayMetrics().density * 10.0f));
        gbe0 gbe0VarA = o5k0.a(imageView.getContext());
        k1x k1xVar = new k1x(imageView.getContext());
        k1xVar.c = str2;
        t1x.h(k1xVar, imageView);
        t1x.c(k1xVar, R.drawable.ic_games_square);
        t1x.f(k1xVar, R.drawable.ic_games_square);
        Context context2 = imageView.getContext();
        context2.getClass();
        float fCeil = (int) Math.ceil(context2.getResources().getDisplayMetrics().density * 10.0f);
        lls0[] lls0VarArr = {new ahg0(fCeil, fCeil, fCeil, fCeil)};
        kuo kuoVar = q1x.f27974a;
        q1x.b(k1xVar, tx3.g0(lls0VarArr));
        k1xVar.e = new uii(strR, str2, imageView, lyaVar, lyaVar, str2);
        gbe0VarA.a(k1xVar.a());
        cashbackMiniCardView.setGameWorkStatus(z3);
        cashbackMiniCardView.b(str, z, cashbackMiniCardView == G0().k, z2);
        cashbackMiniCardView.setEnabled(!z3);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        o2t.a(F());
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        v3c.N(H0().N);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        h2b h2bVarH0 = H0();
        h2bVarH0.D(false);
        h2bVarH0.C();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getO1() {
        return true;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.S1;
    }
}
