package a;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.adapter.LinearLayoutManagerWithAccurateOffset;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ShimmerLinearLayout;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/hgb;", "La/yx5;", "", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hgb extends yx5 {
    public final hnm0 K1;
    public final e9o0 L1;
    public final boolean M1;
    public final r34 N1;
    public final khf0 O1;
    public final phf0 P1;
    public fiu0 Q1;
    public zfb R1;
    public final HashMap S1;
    public final d930 U1;
    public int V1;
    public final s0r W1;
    public jk3 X1;
    public final v62 Y1;
    public final tvj Z1;
    public final kiu0 a2;
    public final a8z b2;
    public static final /* synthetic */ iiy[] d2 = {new ez40(hgb.class, "sportId", "getSportId()J", 0), new ez40(hgb.class, "stageId", "getStageId()Lorg/xplatform/statistic/stage/api/domain/TypeStageId;", 0), new ez40(hgb.class, "title", "getTitle()Ljava/lang/String;", 0), new j0d0(hgb.class, "binding", "getBinding()Lorg/xplatform/statistic/stage/impl/databinding/FragmentChampStatisticTourNetBinding;", 0)};
    public static final kl5 c2 = new kl5();

    public hgb() {
        super(R.layout.fragment_champ_statistic_tour_net);
        this.K1 = hnm0.f13359a;
        this.L1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        final byte b = 1;
        this.M1 = true;
        this.N1 = new r34("SPORT_ID");
        this.O1 = new khf0("STAGE_ID");
        this.P1 = new phf0("TITLE");
        this.S1 = new HashMap();
        this.U1 = new d930((byte) 1);
        this.W1 = ltt0.o(this, egb.f7756a);
        this.Y1 = new v62(this, (byte) 6);
        final byte b2 = 0;
        this.Z1 = new tvj(new Function2(this) { // from class: a.bgb
            public final /* synthetic */ hgb b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                hgb hgbVar = this.b;
                clz clzVar = (clz) obj;
                blz blzVar = (blz) obj2;
                switch (b3) {
                    case 0:
                        kl5 kl5Var = hgb.c2;
                        clzVar.getClass();
                        blzVar.getClass();
                        hgbVar.n0().k().a(clzVar, hgbVar.Y1);
                        break;
                    default:
                        kl5 kl5Var2 = hgb.c2;
                        clzVar.getClass();
                        blzVar.getClass();
                        hgbVar.Y1.e();
                        break;
                }
                return Unit.f46060a;
            }
        }, new Function2(this) { // from class: a.bgb
            public final /* synthetic */ hgb b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b;
                hgb hgbVar = this.b;
                clz clzVar = (clz) obj;
                blz blzVar = (blz) obj2;
                switch (b3) {
                    case 0:
                        kl5 kl5Var = hgb.c2;
                        clzVar.getClass();
                        blzVar.getClass();
                        hgbVar.n0().k().a(clzVar, hgbVar.Y1);
                        break;
                    default:
                        kl5 kl5Var2 = hgb.c2;
                        clzVar.getClass();
                        blzVar.getClass();
                        hgbVar.Y1.e();
                        break;
                }
                return Unit.f46060a;
            }
        }, null, 51);
        dgb dgbVar = new dgb(this, (byte) 0);
        h79 h79Var = new h79(this, (byte) 12);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new h79(h79Var, (byte) 13));
        this.a2 = agc.G(this, sre0.f32672a.b(jgb.class), new rt6(a8zVarA, (byte) 26), new rt6(a8zVarA, (byte) 27), dgbVar);
        this.b2 = maz.a(wezVar, new dgb(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Window window;
        kxq kxqVarB = B();
        final byte b = 1;
        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null) {
            ofm0.y(window, o0(), R.attr.uikitBackgroundContent, R.attr.uikitBackgroundContent, !qem0.r(B()), !qem0.r(B()));
        }
        Window window2 = n0().getWindow();
        this.V1 = window2.getAttributes().softInputMode;
        if (Build.VERSION.SDK_INT > 29) {
            window2.setSoftInputMode(48);
        } else {
            window2.setSoftInputMode(16);
        }
        ConstraintLayout constraintLayout = G0().f41716a;
        peg0 peg0Var = new peg0(this, (byte) 20);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(constraintLayout, peg0Var);
        vvw.o(G0().f, true, 1);
        final byte b2 = 2;
        G0().d.setTitle(this.P1.n(this, d2[2]));
        mc50.a(G0().d, new dgb(this, (byte) 2));
        this.X1 = jk3.b(G0().f41716a);
        DsNavigationBar dsNavigationBar = G0().d;
        mc50.a(dsNavigationBar, new dgb(this, (byte) 3));
        dsNavigationBar.setNavigationBarButtons(q3d.e(new hc50("search", ybg0.f42342a, R.drawable.ic_search, new dgb(this, (byte) 4), 2032)));
        dsNavigationBar.g("search");
        dsNavigationBar.setOnHideSearchBarClickListener(new dgb(this, (byte) 5));
        dsNavigationBar.setSearchFieldHint(H(R.string.tour_net_search_hint));
        dsNavigationBar.e(new Function1(this) { // from class: a.cgb
            public final /* synthetic */ hgb b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                hgb hgbVar = this.b;
                switch (b3) {
                    case 0:
                        kl5 kl5Var = hgb.c2;
                        ((View) obj).getClass();
                        jgb jgbVarH0 = hgbVar.H0();
                        zz2 zz2Var = jgbVarH0.p;
                        if (zz2Var != null) {
                            int i = zz2Var.f45232a;
                            int i2 = i + 1;
                            zz2Var.f45232a = i2;
                            int iMin = Math.min(i2, ((List) zz2Var.b).size() - 1);
                            zz2Var.f45232a = iMin;
                            if (i != iMin) {
                                jgbVarH0.C();
                            }
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        kl5 kl5Var2 = hgb.c2;
                        str.getClass();
                        p7m0 p7m0Var = hgbVar.H0().o;
                        p7m0Var.getClass();
                        p7m0Var.o(null, str);
                        break;
                    default:
                        kl5 kl5Var3 = hgb.c2;
                        ((View) obj).getClass();
                        jgb jgbVarH1 = hgbVar.H0();
                        zz2 zz2Var2 = jgbVarH1.p;
                        if (zz2Var2 != null) {
                            int i3 = zz2Var2.f45232a;
                            int i4 = i3 - 1;
                            zz2Var2.f45232a = i4;
                            int iMax = Math.max(i4, 0);
                            zz2Var2.f45232a = iMax;
                            if (i3 != iMax) {
                                jgbVarH1.C();
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        jk3 jk3Var = this.X1;
        if (jk3Var != null) {
            dyb.O((ImageView) jk3Var.d, new Function1(this) { // from class: a.cgb
                public final /* synthetic */ hgb b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b3 = b2;
                    hgb hgbVar = this.b;
                    switch (b3) {
                        case 0:
                            kl5 kl5Var = hgb.c2;
                            ((View) obj).getClass();
                            jgb jgbVarH0 = hgbVar.H0();
                            zz2 zz2Var = jgbVarH0.p;
                            if (zz2Var != null) {
                                int i = zz2Var.f45232a;
                                int i2 = i + 1;
                                zz2Var.f45232a = i2;
                                int iMin = Math.min(i2, ((List) zz2Var.b).size() - 1);
                                zz2Var.f45232a = iMin;
                                if (i != iMin) {
                                    jgbVarH0.C();
                                }
                            }
                            break;
                        case 1:
                            String str = (String) obj;
                            kl5 kl5Var2 = hgb.c2;
                            str.getClass();
                            p7m0 p7m0Var = hgbVar.H0().o;
                            p7m0Var.getClass();
                            p7m0Var.o(null, str);
                            break;
                        default:
                            kl5 kl5Var3 = hgb.c2;
                            ((View) obj).getClass();
                            jgb jgbVarH1 = hgbVar.H0();
                            zz2 zz2Var2 = jgbVarH1.p;
                            if (zz2Var2 != null) {
                                int i3 = zz2Var2.f45232a;
                                int i4 = i3 - 1;
                                zz2Var2.f45232a = i4;
                                int iMax = Math.max(i4, 0);
                                zz2Var2.f45232a = iMax;
                                if (i3 != iMax) {
                                    jgbVarH1.C();
                                }
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        }
        jk3 jk3Var2 = this.X1;
        if (jk3Var2 != null) {
            final byte b3 = 0;
            dyb.O((ImageView) jk3Var2.c, new Function1(this) { // from class: a.cgb
                public final /* synthetic */ hgb b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b4 = b3;
                    hgb hgbVar = this.b;
                    switch (b4) {
                        case 0:
                            kl5 kl5Var = hgb.c2;
                            ((View) obj).getClass();
                            jgb jgbVarH0 = hgbVar.H0();
                            zz2 zz2Var = jgbVarH0.p;
                            if (zz2Var != null) {
                                int i = zz2Var.f45232a;
                                int i2 = i + 1;
                                zz2Var.f45232a = i2;
                                int iMin = Math.min(i2, ((List) zz2Var.b).size() - 1);
                                zz2Var.f45232a = iMin;
                                if (i != iMin) {
                                    jgbVarH0.C();
                                }
                            }
                            break;
                        case 1:
                            String str = (String) obj;
                            kl5 kl5Var2 = hgb.c2;
                            str.getClass();
                            p7m0 p7m0Var = hgbVar.H0().o;
                            p7m0Var.getClass();
                            p7m0Var.o(null, str);
                            break;
                        default:
                            kl5 kl5Var3 = hgb.c2;
                            ((View) obj).getClass();
                            jgb jgbVarH1 = hgbVar.H0();
                            zz2 zz2Var2 = jgbVarH1.p;
                            if (zz2Var2 != null) {
                                int i3 = zz2Var2.f45232a;
                                int i4 = i3 - 1;
                                zz2Var2.f45232a = i4;
                                int iMax = Math.max(i4, 0);
                                zz2Var2.f45232a = iMax;
                                if (i3 != iMax) {
                                    jgbVarH1.C();
                                }
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        }
        n6r n6rVarK = K();
        n6rVarK.b();
        n6rVarK.c.a(this.Z1);
    }

    @Override // a.yx5
    public final void C0() {
        this.Q1 = ((mwi) this.b2.getValue()).a();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().j);
        lkz lkzVar = lkz.f20223a;
        ggb ggbVar = new ggb(this, null, (byte) 0);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yxa(xae0VarN, clzVarW, ggbVar, (yje) null), 3);
        p7m0 p7m0Var = H0().k;
        ggb ggbVar2 = new ggb(this, null, (byte) 1);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new yxa(p7m0Var, clzVarW2, ggbVar2, (yje) null), 3);
        vae0 vae0VarM = vtb.M(H0().l);
        ggb ggbVar3 = new ggb(this, null, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new yxa(vae0VarM, clzVarW3, ggbVar3, (yje) null), 3);
    }

    public final xyq G0() {
        Object objN = this.W1.n(d2[3], this);
        objN.getClass();
        return (xyq) objN;
    }

    public final jgb H0() {
        return (jgb) this.a2.getValue();
    }

    public final void I0(List list, boolean z) {
        K0(false);
        G0().c.setVisibility(8);
        G0().b.setVisibility(0);
        G0().f.setLayoutManager(new LinearLayoutManagerWithAccurateOffset(o0()));
        this.R1 = new zfb(list, this.S1, new o47(2, H0(), jgb.class, "showBottomSheet", "showBottomSheet(Lorg/xplatform/statistic/stage/impl/stage_net/presentation/models/NetCellUiModel;Ljava/lang/String;)V", 0, (byte) 21), new vra(1, H0(), jgb.class, "onClickGameItem", "onClickGameItem(Lorg/xplatform/statistic/stage/impl/stage_net/presentation/models/NetCellUiModel;)V", 0, (byte) 28), new o47(2, H0(), jgb.class, "onClickTab", "onClickTab(II)V", 0, (byte) 22), this.U1, z);
        G0().f.setAdapter(this.R1);
        G0().f.setHasFixedSize(true);
        G0().f.setOnFlingListener(new fgb(this, (byte) 0));
        RecyclerView recyclerView = G0().f;
        zfb zfbVar = this.R1;
        if (zfbVar == null) {
            return;
        }
        recyclerView.m(new twk(zfbVar));
    }

    public final void J0(boolean z) {
        int i = o0().getResources().getBoolean(R.bool.isTablet) ? R.layout.shimmer_item_stage_net_bottom_table : R.layout.shimmer_item_stage_net_bottom;
        ShimmerLinearLayout shimmerLinearLayout = G0().e;
        if (z) {
            shimmerLinearLayout.setShimmerItems(i);
        }
        shimmerLinearLayout.setVisibility(z ? 0 : 8);
    }

    public final void K0(boolean z) {
        G0().f.setVisibility(!z ? 0 : 8);
        J0(z);
    }

    public final void L0(boolean z) {
        G0().d.d.d(z ? ypm.b : ypm.f43038a);
        G0().d.c("search");
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        n0().getWindow().setSoftInputMode(this.V1);
        G0().f.setAdapter(null);
        this.R1 = null;
        jgb jgbVarH0 = H0();
        jgbVarH0.q = false;
        p7m0 p7m0Var = jgbVarH0.k;
        if ((p7m0Var.getValue() instanceof o26) || (p7m0Var.getValue() instanceof n26)) {
            jgbVarH0.y();
        }
        n6r n6rVarK = K();
        n6rVarK.b();
        n6rVarK.c.f(this.Z1);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.L1;
    }
}
