package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hqm0;", "La/yx5;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hqm0 extends yx5 {
    public final hnm0 K1;
    public epi0 L1;
    public fiu0 M1;
    public poq0 N1;
    public final khf0 O1;
    public final boolean P1;
    public final kiu0 Q1;
    public final s0r R1;
    public final b0l0 S1;
    public final a8z U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(hqm0.class, "page", "getPage()Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;", 0), new j0d0(hqm0.class, "binding", "getBinding()Lorg/xplatform/cyber/section/impl/databinding/CybergamesFragmentStockBinding;", 0)};
    public static final s9m0 V1 = new s9m0();

    public hqm0() {
        super(R.layout.cybergames_fragment_stock);
        this.K1 = hnm0.f13359a;
        this.O1 = new khf0("params_key");
        final byte b = 1;
        this.P1 = true;
        final byte b2 = 0;
        Function0 function0 = new Function0(this) { // from class: a.eqm0
            public final /* synthetic */ hqm0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                hqm0 hqm0Var = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = hqm0Var.M1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        b0l0 b0l0Var = hqm0Var.S1;
                        b0l0Var.getClass();
                        bqm0 bqm0Var = new bqm0(bqm0.f);
                        bqm0Var.d.b(new gbn(new acm0((byte) 1), new asj0(3, (byte) 11), new iok(b0l0Var, (byte) 2), wjj0.r));
                        return bqm0Var;
                }
            }
        };
        fyk0 fyk0Var = new fyk0(this, (byte) 10);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new fyk0(fyk0Var, (byte) 11));
        this.Q1 = agc.G(this, sre0.f32672a.b(rqm0.class), new cdl0(a8zVarA, (byte) 8), new cdl0(a8zVarA, (byte) 9), function0);
        this.R1 = ltt0.o(this, fqm0.f9983a);
        this.S1 = new b0l0(this, (byte) 5);
        this.U1 = maz.a(wezVar, new Function0(this) { // from class: a.eqm0
            public final /* synthetic */ hqm0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                hqm0 hqm0Var = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = hqm0Var.M1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        b0l0 b0l0Var = hqm0Var.S1;
                        b0l0Var.getClass();
                        bqm0 bqm0Var = new bqm0(bqm0.f);
                        bqm0Var.d.b(new gbn(new acm0((byte) 1), new asj0(3, (byte) 11), new iok(b0l0Var, (byte) 2), wjj0.r));
                        return bqm0Var;
                }
            }
        });
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().c.setButtonOnClickListener(new lph0(0, I0(), rqm0.class, "onRefreshClick", "onRefreshClick()V", 0, (byte) 26));
        epi0 epi0VarH0 = H0();
        RecyclerView recyclerView = G0().d;
        bqm0 bqm0Var = (bqm0) this.U1.getValue();
        bqm0Var.getClass();
        epi0VarH0.b = bqm0Var;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(bqm0Var);
        recyclerView.setItemAnimator(null);
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.space_16);
        recyclerView.m(new qmk0(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.space_32), 1, null, null, 448));
        vvw.o(recyclerView, true, 1);
        pkd.h(G0().b, new owp0(this), null, new ugd(-2145468424, true, new edk0(this, (byte) 25)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(f0h.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            f0h f0hVar = (f0h) (ze3Var instanceof f0h ? ze3Var : null);
            if (f0hVar != null) {
                CyberGamesPage cyberGamesPage = (CyberGamesPage) this.O1.n(this, W1[0]);
                duj dujVar = f0hVar.f8717a;
                cad cadVar = f0hVar.c;
                gii0 gii0Var = f0hVar.d;
                oeg0 oeg0Var = f0hVar.b;
                kt2 kt2Var = f0hVar.e;
                g2v g2vVar = f0hVar.f;
                m1e m1eVar = f0hVar.g;
                pyg pygVar = f0hVar.h;
                n2u n2uVar = f0hVar.i;
                hvt hvtVar = f0hVar.j;
                poq0 poq0Var = f0hVar.k;
                q8u q8uVar = f0hVar.l;
                cyg0 cyg0Var = f0hVar.m;
                pru pruVar = f0hVar.n;
                zr1 zr1Var = f0hVar.o;
                oeg0Var.getClass();
                gii0Var.getClass();
                kt2Var.getClass();
                m1eVar.getClass();
                pygVar.getClass();
                v7i v7iVar = new v7i(cadVar, pygVar, dujVar, kt2Var, g2vVar, m1eVar, n2uVar, hvtVar, poq0Var, cyberGamesPage, q8uVar, cyg0Var, pruVar, zr1Var);
                this.L1 = new epi0((byte) 12);
                this.M1 = new fiu0(Collections.singletonMap(rqm0.class, (uci) v7iVar.o));
                this.N1 = poq0Var;
                return;
            }
        }
        jf4.n(b1j.i(f0h.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        rqm0 rqm0VarI0 = I0();
        yje yjeVar = null;
        fnq fnqVar = new fnq(rqm0VarI0.r, new tmg0(rqm0VarI0, yjeVar, (byte) 23));
        lkz lkzVar = lkz.f20223a;
        gqm0 gqm0Var = new gqm0(this, yjeVar, (byte) 0);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zol0(fnqVar, clzVarW, gqm0Var, (yje) null), 3);
        ol60 ol60Var = I0().w;
        gqm0 gqm0Var2 = new gqm0(this, yjeVar, (byte) 1);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zol0(ol60Var, clzVarW2, gqm0Var2, (yje) null), 3);
    }

    public final wth G0() {
        Object objN = this.R1.n(W1[1], this);
        objN.getClass();
        return (wth) objN;
    }

    public final epi0 H0() {
        epi0 epi0Var = this.L1;
        if (epi0Var != null) {
            return epi0Var;
        }
        Intrinsics.h("stockRecyclerFragmentDelegate");
        throw null;
    }

    public final rqm0 I0() {
        return (rqm0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        H0();
        G0().d.setAdapter(null);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        rqm0 rqm0VarI0 = I0();
        if (rqm0VarI0.n.f27342a.d().r(fk60.CYBER_PROMO)) {
            rqm0VarI0.w.f(nqm0.f23968a);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
