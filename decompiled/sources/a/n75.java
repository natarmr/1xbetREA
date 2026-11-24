package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/n75;", "La/yx5;", "<init>", "()V", "a/pek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n75 extends yx5 {
    public final e9o0 K1;
    public wdk0 L1;
    public ii M1;
    public fiu0 N1;
    public final kiu0 O1;
    public final s0r P1;
    public final zz2 Q1;
    public final r34 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(n75.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAvailableGamesBinding;", 0), new ez40(n75.class, "bundleBonusId", "getBundleBonusId()I", 0), new ez40(n75.class, "bundleAccountId", "getBundleAccountId()J", 0)};
    public static final pek0 S1 = new pek0();

    public n75() {
        super(R.layout.fragment_available_games);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, 12);
        zo4 zo4Var = new zo4(this, (byte) 5);
        a8z a8zVarA = maz.a(wez.b, new pp4(new pp4(this, (byte) 15), (byte) 16));
        this.O1 = agc.G(this, sre0.f32672a.b(g85.class), new qw4(a8zVarA, (byte) 4), new qw4(a8zVarA, (byte) 5), zo4Var);
        this.P1 = ltt0.o(this, m75.f21303a);
        this.Q1 = new zz2("PARTITION_ID");
        this.R1 = new r34("ACCOUNT_ID");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.P1.n(U1[0], this);
        objN.getClass();
        pkd.h(((fyq) objN).f10372a, new owp0(this), null, new ugd(-1017432767, true, new tx(this, (byte) 8)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(l75.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            l75 l75Var = (l75) (ze3Var instanceof l75 ? ze3Var : null);
            if (l75Var != null) {
                iiy[] iiyVarArr = U1;
                int iIntValue = this.Q1.n(this, iiyVarArr[1]).intValue();
                this.R1.n(this, iiyVarArr[2]);
                vw3 vw3Var = new vw3(iIntValue, nw80.t.getId(), rj1.c);
                cad cadVar = l75Var.f19539a;
                oeg0 oeg0Var = l75Var.j;
                btt0 btt0Var = l75Var.b;
                xk0 xk0Var = l75Var.c;
                gii0 gii0Var = l75Var.d;
                j1q0 j1q0Var = l75Var.e;
                r9u r9uVar = l75Var.f;
                peg0 peg0Var = l75Var.n;
                m1e m1eVar = l75Var.g;
                s91 s91Var = l75Var.h;
                ii iiVar = l75Var.s;
                duj dujVar = l75Var.i;
                vby vbyVar = l75Var.k;
                j51 j51Var = l75Var.l;
                knf0 knf0Var = l75Var.m;
                ntu ntuVar = l75Var.o;
                x2c0 x2c0Var = l75Var.p;
                ehf0 ehf0Var = l75Var.q;
                pru pruVar = l75Var.r;
                iqt iqtVar = l75Var.t;
                wdk0 wdk0Var = l75Var.u;
                ctf0 ctf0Var = l75Var.v;
                peg0 peg0Var2 = l75Var.w;
                gst0 gst0Var = l75Var.x;
                ytt yttVar = l75Var.y;
                iiVar.getClass();
                oeg0Var.getClass();
                btt0Var.getClass();
                xk0Var.getClass();
                gii0Var.getClass();
                j1q0Var.getClass();
                r9uVar.getClass();
                m1eVar.getClass();
                s91Var.getClass();
                vbyVar.getClass();
                j51Var.getClass();
                knf0Var.getClass();
                x2c0Var.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                gst0Var.getClass();
                v7i v7iVar = new v7i(cadVar, ehf0Var, peg0Var, peg0Var2, iiVar, oeg0Var, j1q0Var, m1eVar, vw3Var, dujVar, ntuVar, pruVar, iqtVar, wdk0Var, ctf0Var, gst0Var, yttVar);
                x1x.x(((yzn0) peg0Var.b).i());
                this.L1 = wdk0Var;
                this.M1 = iiVar;
                this.N1 = new fiu0(Collections.singletonMap(g85.class, (f7i) v7iVar.o));
                return;
            }
        }
        jf4.n(b1j.i(l75.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
