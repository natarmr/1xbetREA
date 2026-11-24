package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.CyberMainDisciplinesParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/y4h;", "La/yx5;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y4h extends yx5 {
    public final hnm0 K1;
    public final boolean L1;
    public fiu0 M1;
    public poq0 N1;
    public wdk0 O1;
    public kud P1;
    public final khf0 Q1;
    public final kiu0 R1;
    public final s0r S1;
    public final kiu0 U1;
    public final gle0 V1;
    public static final /* synthetic */ iiy[] X1 = {new ez40(y4h.class, "params", "getParams()Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams;", 0), new j0d0(y4h.class, "binding", "getBinding()Lorg/xplatform/cyber/section/impl/databinding/CybergamesFragmentMainBinding;", 0)};
    public static final kwd W1 = new kwd();
    public static final byte Y1 = 8;

    public y4h() {
        super(R.layout.cybergames_fragment_main);
        this.K1 = hnm0.f13359a;
        this.L1 = true;
        this.Q1 = new khf0("params");
        e8g e8gVar = new e8g(this, (byte) 14);
        x4h x4hVar = new x4h(this, (byte) 0);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new q7g(x4hVar, (byte) 16));
        tre0 tre0Var = sre0.f32672a;
        this.R1 = agc.G(this, tre0Var.b(c5h.class), new r7g(a8zVarA, (byte) 16), new r7g(a8zVarA, (byte) 17), e8gVar);
        this.S1 = ltt0.o(this, v4h.f36778a);
        a8z a8zVarA2 = maz.a(wezVar, new q7g(new x4h(this, (byte) 1), (byte) 17));
        this.U1 = agc.G(this, tre0Var.b(luk.class), new r7g(a8zVarA2, (byte) 18), new r7g(a8zVarA2, (byte) 19), new lhf(this, a8zVarA2, (byte) 7));
        this.V1 = new gle0();
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.S1.n(X1[1], this);
        objN.getClass();
        ComposeView composeView = ((vth) objN).b;
        c5h c5hVar = (c5h) this.R1.getValue();
        x6f x6fVar = new x6f(1, (luk) this.U1.getValue(), luk.class, "setSearchQuery", "setSearchQuery(Ljava/lang/String;)V", 0, (byte) 26);
        gle0 gle0Var = this.V1;
        gle0Var.getClass();
        pkd.h(composeView, new owp0(this), null, new ugd(1623527897, true, new dfc0((Object) gle0Var, (Object) this, (Object) c5hVar, (Object) x6fVar, (byte) 15)));
        wdk0 wdk0Var = this.O1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.L1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(gzg.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            gzg gzgVar = (gzg) (ze3Var instanceof gzg ? ze3Var : null);
            if (gzgVar != null) {
                CyberMainDisciplinesParams cyberMainDisciplinesParams = (CyberMainDisciplinesParams) this.Q1.n(this, X1[0]);
                q7d0 q7d0Var = gzgVar.b;
                duj dujVar = gzgVar.c;
                mne mneVar = gzgVar.d;
                pru pruVar = gzgVar.e;
                oeg0 oeg0Var = gzgVar.f12176a;
                kt2 kt2Var = gzgVar.f;
                m1e m1eVar = gzgVar.g;
                poq0 poq0Var = gzgVar.h;
                pyg pygVar = gzgVar.i;
                lbu lbuVar = gzgVar.j;
                cyu cyuVar = gzgVar.k;
                zr1 zr1Var = gzgVar.l;
                wdk0 wdk0Var = gzgVar.m;
                hvt hvtVar = gzgVar.n;
                ctf0 ctf0Var = gzgVar.o;
                oeg0Var.getClass();
                q7d0Var.getClass();
                kt2Var.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                pygVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(c5h.class, (uci) new nc0(pygVar, dujVar, mneVar, cyberMainDisciplinesParams, pruVar, kt2Var, m1eVar, poq0Var, lbuVar, cyuVar, zr1Var, wdk0Var, hvtVar, ctf0Var).n));
                this.N1 = poq0Var;
                this.O1 = wdk0Var;
                this.P1 = pygVar.n();
                return;
            }
        }
        jf4.n(b1j.i(gzg.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.R1;
        ol60 ol60Var = ((c5h) kiu0Var.getValue()).r;
        yje yjeVar = null;
        w4h w4hVar = new w4h(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g8g(ol60Var, clzVarW, w4hVar, (yje) null), 3);
        p7m0 p7m0Var = ((luk) this.U1.getValue()).b;
        w4h w4hVar2 = new w4h(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g8g(p7m0Var, clzVarW2, w4hVar2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var2 = ((c5h) kiu0Var.getValue()).t;
        w4h w4hVar3 = new w4h(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new g8g((gmq) p7m0Var2, clzVarW3, w4hVar3, (yje) null, (char) 0), 3);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        c5h c5hVar = (c5h) this.R1.getValue();
        bby bbyVar = c5hVar.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            c5hVar.u = sac.V(jiu0.a(c5hVar), new x6f(1, c5hVar.k, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, c5hVar.m.b, new wib(c5hVar, null, (byte) 20), 10);
        }
        c5hVar.w();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.L1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
