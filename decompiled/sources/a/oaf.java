package a;

import android.os.Bundle;
import android.text.Editable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/oaf;", "La/yx5;", "<init>", "()V", "a/nwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oaf extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public final a8z M1;
    public final s0r N1;
    public final kiu0 O1;
    public final yzn0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(oaf.class, "viewBinding", "getViewBinding()Lorg/xplatform/security/impl/databinding/FragmentCreateNewPasswordBinding;", 0), new ez40(oaf.class, "createNewPasswordParams", "getCreateNewPasswordParams()Lorg/xplatform/security/impl/presentation/password/change/create_password/models/CreateNewPasswordParams;", 0)};
    public static final nwd Q1 = new nwd();

    public oaf() {
        super(R.layout.fragment_create_new_password);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        kaf kafVar = new kaf(this, (byte) 3);
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, kafVar);
        this.N1 = ltt0.o(this, naf.f23187a);
        aqe aqeVar = new aqe(new kaf(this, (byte) 4), (byte) 13);
        a8z a8zVarA = maz.a(wezVar, new aqe(new aqe(this, (byte) 14), (byte) 15));
        this.O1 = agc.G(this, sre0.f32672a.b(lbf.class), new cce(a8zVarA, (byte) 14), new cce(a8zVarA, (byte) 15), aqeVar);
        this.P1 = new yzn0("CHANGE_PASSWORD_PARAMS_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        G0().d.setTitle(H(R.string.password_requirements));
        final byte b = 0;
        G0().c.b(new kaf(this, (byte) 0));
        G0().f.a(new da0(new Function1(this) { // from class: a.laf
            public final /* synthetic */ oaf b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value;
                w190 w190Var;
                Object value2;
                w190 w190Var2;
                byte b2 = b;
                oaf oafVar = this.b;
                Editable editable = (Editable) obj;
                switch (b2) {
                    case 0:
                        nwd nwdVar = oaf.Q1;
                        editable.getClass();
                        lbf lbfVarH0 = oafVar.H0();
                        String string = editable.toString();
                        string.getClass();
                        p7m0 p7m0Var = lbfVarH0.s;
                        do {
                            value = p7m0Var.getValue();
                            w190Var = (w190) value;
                            if (!string.equals(w190Var.b)) {
                                lbfVarH0.y(false);
                            }
                        } while (!p7m0Var.m(value, w190.a(w190Var, string, null, 2)));
                        break;
                    default:
                        nwd nwdVar2 = oaf.Q1;
                        editable.getClass();
                        lbf lbfVarH1 = oafVar.H0();
                        String string2 = editable.toString();
                        string2.getClass();
                        p7m0 p7m0Var2 = lbfVarH1.s;
                        do {
                            value2 = p7m0Var2.getValue();
                            w190Var2 = (w190) value2;
                            if (!string2.equals(w190Var2.f38388a)) {
                                lbfVarH1.y(false);
                            }
                        } while (!p7m0Var2.m(value2, w190.a(w190Var2, null, string2, 1)));
                        break;
                }
                return Unit.f46060a;
            }
        }));
        final byte b2 = 1;
        G0().g.a(new da0(new Function1(this) { // from class: a.laf
            public final /* synthetic */ oaf b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value;
                w190 w190Var;
                Object value2;
                w190 w190Var2;
                byte b3 = b2;
                oaf oafVar = this.b;
                Editable editable = (Editable) obj;
                switch (b3) {
                    case 0:
                        nwd nwdVar = oaf.Q1;
                        editable.getClass();
                        lbf lbfVarH0 = oafVar.H0();
                        String string = editable.toString();
                        string.getClass();
                        p7m0 p7m0Var = lbfVarH0.s;
                        do {
                            value = p7m0Var.getValue();
                            w190Var = (w190) value;
                            if (!string.equals(w190Var.b)) {
                                lbfVarH0.y(false);
                            }
                        } while (!p7m0Var.m(value, w190.a(w190Var, string, null, 2)));
                        break;
                    default:
                        nwd nwdVar2 = oaf.Q1;
                        editable.getClass();
                        lbf lbfVarH1 = oafVar.H0();
                        String string2 = editable.toString();
                        string2.getClass();
                        p7m0 p7m0Var2 = lbfVarH1.s;
                        do {
                            value2 = p7m0Var2.getValue();
                            w190Var2 = (w190) value2;
                            if (!string2.equals(w190Var2.f38388a)) {
                                lbfVarH1.y(false);
                            }
                        } while (!p7m0Var2.m(value2, w190.a(w190Var2, null, string2, 1)));
                        break;
                }
                return Unit.f46060a;
            }
        }));
        uvw.R(G0().b, this, null);
        DsBottomBar.u(G0().b, new kaf(this, (byte) 1));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = H0().r;
        maf mafVar = new maf(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fze(ol60Var, clzVarW, mafVar, (yje) null), 3);
        lbf lbfVarH0 = H0();
        dnq dnqVar = new dnq(new s6n0(lbfVarH0.q, new wib(lbfVarH0, null, (byte) 13)), new e00(lbfVarH0, null, (byte) 14), (byte) 0);
        maf mafVar2 = new maf(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fze(dnqVar, clzVarW2, mafVar2, (yje) null), 3);
    }

    public final qzq G0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        return (qzq) objN;
    }

    public final lbf H0() {
        return (lbf) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "ERROR_REQUEST_KEY", new kaf(this, (byte) 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        j120.Y(this);
        n0().getWindow().setSoftInputMode(32);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().f.clearFocus();
        G0().g.clearFocus();
        n0().getWindow().setSoftInputMode(16);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
