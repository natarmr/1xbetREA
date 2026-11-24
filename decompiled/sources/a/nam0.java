package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nam0;", "La/yx5;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nam0 extends yx5 {
    public final hnm0 K1;
    public wui L1;
    public wdk0 M1;
    public ii N1;
    public final kiu0 O1;
    public final s0r P1;
    public final khf0 Q1;
    public final r9m0 R1;
    public final a8z S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(nam0.class, "binding", "getBinding()Lorg/xplatform/cyber/statistics_blocks/impl/databinding/StatisticBlocksFragmentBinding;", 0), new ez40(nam0.class, "params", "getParams()Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;", 0)};
    public static final s2m0 U1 = new s2m0();
    public static final byte W1 = 8;

    public nam0() {
        super(R.layout.statistic_blocks_fragment);
        this.K1 = hnm0.f13359a;
        lam0 lam0Var = new lam0(this, (byte) 0);
        fyk0 fyk0Var = new fyk0(this, (byte) 8);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new fyk0(fyk0Var, (byte) 9));
        this.O1 = agc.G(this, sre0.f32672a.b(tam0.class), new cdl0(a8zVarA, (byte) 6), new cdl0(a8zVarA, (byte) 7), lam0Var);
        this.P1 = ltt0.o(this, mam0.f21465a);
        this.Q1 = new khf0("params_key");
        this.R1 = new r9m0();
        this.S1 = maz.a(wezVar, new lam0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        o9m0 o9m0Var = (o9m0) this.S1.getValue();
        final byte b = 0;
        Object objN = this.P1.n(V1[0], this);
        objN.getClass();
        oam0 oam0Var = (oam0) objN;
        final tam0 tam0Var = (tam0) this.O1.getValue();
        wdk0 wdk0Var = this.M1;
        yje yjeVar = null;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        ii iiVar = this.N1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        r9m0 r9m0Var = this.R1;
        r9m0Var.getClass();
        o9m0Var.getClass();
        ComposeView composeView = oam0Var.c;
        DsBottomBar dsBottomBar = oam0Var.b;
        final byte b2 = 1;
        pkd.h(composeView, new owp0(this), null, new ugd(1252241044, true, new o3m0(tam0Var, this, (byte) 4)));
        RecyclerView recyclerView = oam0Var.e;
        recyclerView.setAdapter(o9m0Var);
        recyclerView.setLayoutManager(new LinearLayoutManager(o0()));
        vvw.o(recyclerView, true, 1);
        if (r9m0Var.f30090a == null) {
            vyx vyxVar = new vyx(new w9m0(o9m0Var));
            r9m0Var.f30090a = vyxVar;
            vyxVar.i(recyclerView);
        }
        dnq dnqVar = new dnq(tam0Var.j, new sye0(tam0Var, yjeVar, (byte) 10), (byte) 0);
        ah0 ah0Var = new ah0(o9m0Var, oam0Var, this, yjeVar, (byte) 22);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zol0(dnqVar, clzVarW, ah0Var, (yje) null), 3);
        ccq0.V(this, "ABORT_CHANGES_REQUEST_PARAMS", new Function0() { // from class: a.p9m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                yje yjeVar2 = null;
                tam0 tam0Var2 = tam0Var;
                switch (b3) {
                    case 0:
                        qjj.W(jiu0.a(tam0Var2), tam0Var2.d.f22085a, null, new sam0(tam0Var2, yjeVar2, (byte) 2), 2);
                        break;
                    case 1:
                        tam0Var2.x();
                        break;
                    default:
                        sac.V(jiu0.a(tam0Var2), new q9m0(tam0Var2, (byte) 3), null, tam0Var2.d.f22085a, new sam0(tam0Var2, yjeVar2, (byte) 1), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        ccq0.V(this, "REJECT_CHANGES_REQUEST_PARAMS", new Function0() { // from class: a.p9m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                yje yjeVar2 = null;
                tam0 tam0Var2 = tam0Var;
                switch (b4) {
                    case 0:
                        qjj.W(jiu0.a(tam0Var2), tam0Var2.d.f22085a, null, new sam0(tam0Var2, yjeVar2, (byte) 2), 2);
                        break;
                    case 1:
                        tam0Var2.x();
                        break;
                    default:
                        sac.V(jiu0.a(tam0Var2), new q9m0(tam0Var2, (byte) 3), null, tam0Var2.d.f22085a, new sam0(tam0Var2, yjeVar2, (byte) 1), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        ol60 ol60Var = tam0Var.l;
        ah0 ah0Var2 = new ah0(wdk0Var, this, iiVar, yjeVar, (byte) 21);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zol0(ol60Var, clzVarW2, ah0Var2, (yje) null), 3);
        DsBottomBar.u(dsBottomBar, new Function0() { // from class: a.p9m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                yje yjeVar2 = null;
                tam0 tam0Var2 = tam0Var;
                switch (b4) {
                    case 0:
                        qjj.W(jiu0.a(tam0Var2), tam0Var2.d.f22085a, null, new sam0(tam0Var2, yjeVar2, (byte) 2), 2);
                        break;
                    case 1:
                        tam0Var2.x();
                        break;
                    default:
                        sac.V(jiu0.a(tam0Var2), new q9m0(tam0Var2, (byte) 3), null, tam0Var2.d.f22085a, new sam0(tam0Var2, yjeVar2, (byte) 1), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        knm0.i(dsBottomBar, false);
        qcc.X(this, new lam0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pam0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            pam0 pam0Var = (pam0) (ze3Var instanceof pam0 ? ze3Var : null);
            if (pam0Var != null) {
                StatisticBlocksParams statisticBlocksParams = (StatisticBlocksParams) this.Q1.n(this, V1[1]);
                cad cadVar = pam0Var.f26661a;
                ogh oghVar = pam0Var.b;
                ctf0 ctf0Var = pam0Var.c;
                q7d0 q7d0Var = pam0Var.d;
                vby vbyVar = pam0Var.e;
                wdk0 wdk0Var = pam0Var.f;
                ii iiVar = pam0Var.g;
                oeg0 oeg0Var = pam0Var.h;
                g2v g2vVar = pam0Var.i;
                oghVar.getClass();
                ctf0Var.getClass();
                q7d0Var.getClass();
                vbyVar.getClass();
                wdk0Var.getClass();
                iiVar.getClass();
                oeg0Var.getClass();
                ywq0 ywq0Var = new ywq0();
                ywq0Var.f43384a = statisticBlocksParams;
                ywq0Var.b = cadVar;
                ywq0Var.c = oghVar;
                ywq0Var.d = ctf0Var;
                ywq0Var.e = oeg0Var;
                ywq0Var.f = g2vVar;
                ywq0Var.g = n0k0.a(new rti(ywq0Var, (byte) 12));
                this.L1 = (wui) ((n5d0) ywq0Var.g).get();
                this.M1 = wdk0Var;
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(pam0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
