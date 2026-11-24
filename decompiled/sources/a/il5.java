package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/il5;", "La/yx5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class il5 extends yx5 {
    public final yzn0 K1;
    public final cgx0 L1;
    public l9i M1;
    public wdk0 N1;
    public final kiu0 O1;
    public final s0r P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(il5.class, "category", "getCategory()Lorg/xplatform/feature/balance_management_old/impl/presentation/compose/history/CategoryHistory;", 0), new ez40(il5.class, "onlyArchive", "getOnlyArchive()Z", 0), new j0d0(il5.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gl5 Q1 = new gl5((byte) 0);

    public il5() {
        super(R.layout.compose_fragment);
        this.K1 = new yzn0("BUNDLE_CATEGORY");
        this.L1 = new cgx0("BUNDLE_ARCHIVE");
        zo4 zo4Var = new zo4(this, (byte) 10);
        a8z a8zVarA = maz.a(wez.b, new pp4(new pp4(this, (byte) 23), (byte) 24));
        this.O1 = agc.G(this, sre0.f32672a.b(dk5.class), new qw4(a8zVarA, (byte) 12), new qw4(a8zVarA, (byte) 13), zo4Var);
        this.P1 = ltt0.o(this, hl5.f13240a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.P1.n(R1[2], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-1906853322, true, new fa2((Object) this, (byte) 21)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ti5.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof ti5)) {
                ze3Var = null;
            }
            ti5 ti5Var = (ti5) ze3Var;
            if (ti5Var != null) {
                iiy[] iiyVarArr = R1;
                n9i n9iVarA = ti5.a(ti5Var, (l4b) this.K1.n(this, iiyVarArr[0]), this.L1.n(this, iiyVarArr[1]).booleanValue(), null, 12);
                this.M1 = (l9i) n9iVarA.J.get();
                this.N1 = n9iVarA.G;
                return;
            }
        }
        jf4.n(b1j.i(ti5.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(((dk5) this.O1.getValue()).a0);
        cm3 cm3Var = new cm3(this, null, (byte) 17);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new me5(xae0VarN, clzVarW, cm3Var, (yje) null), 3);
    }
}
