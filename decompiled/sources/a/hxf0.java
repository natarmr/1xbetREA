package a;

import android.os.Bundle;
import android.text.Editable;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hxf0;", "La/yx5;", "<init>", "()V", "a/zie0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hxf0 extends yx5 {
    public final i9o0 K1;
    public final phf0 L1;
    public gl5 M1;
    public ii N1;
    public wdk0 O1;
    public final s0r P1;
    public asi Q1;
    public final a8z R1;
    public final kiu0 S1;
    public final kiu0 U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(hxf0.class, "email", "getEmail()Ljava/lang/String;", 0), new j0d0(hxf0.class, "viewBinding", "getViewBinding()Lorg/xplatform/security/impl/databinding/FragmentRestoreByEmailBinding;", 0)};
    public static final zie0 V1 = new zie0();

    public hxf0() {
        super(R.layout.fragment_restore_by_email);
        this.K1 = i9o0.f14396a;
        this.L1 = new phf0("email_bundle_key");
        this.P1 = ltt0.o(this, gxf0.f12076a);
        dxf0 dxf0Var = new dxf0(this, (byte) 0);
        wez wezVar = wez.b;
        this.R1 = maz.a(wezVar, dxf0Var);
        dxf0 dxf0Var2 = new dxf0(this, (byte) 1);
        a8z a8zVarA = maz.a(wezVar, new lce0(new lce0(this, (byte) 27), (byte) 28));
        tre0 tre0Var = sre0.f32672a;
        this.S1 = agc.G(this, tre0Var.b(sxf0.class), new wbe0(a8zVarA, (byte) 28), new wbe0(a8zVarA, (byte) 29), dxf0Var2);
        a8z a8zVarA2 = maz.a(wezVar, new lce0(new dxf0(this, (byte) 2), (byte) 29));
        this.U1 = agc.G(this, tre0Var.b(f190.class), new fxf0(a8zVarA2, (byte) 0), new fxf0(a8zVarA2, (byte) 1), new sue0(this, a8zVarA2, (byte) 7));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        da0 da0Var = new da0(new Function1(this) { // from class: a.cxf0
            public final /* synthetic */ hxf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence charSequenceU0;
                byte b2 = b;
                hxf0 hxf0Var = this.b;
                switch (b2) {
                    case 0:
                        Editable editable = (Editable) obj;
                        zie0 zie0Var = hxf0.V1;
                        editable.getClass();
                        sxf0 sxf0VarH0 = hxf0Var.H0();
                        String string = editable.toString();
                        if (string == null || (charSequenceU0 = StringsKt.u0(string)) == null) {
                            charSequenceU0 = "";
                        }
                        sxf0VarH0.b.e("email_key", charSequenceU0);
                        sxf0VarH0.f.l(sxf0.w.matcher(charSequenceU0).matches() || sxf0VarH0.u.length() > 0);
                        break;
                    default:
                        iqt0 iqt0Var = (iqt0) obj;
                        zie0 zie0Var2 = hxf0.V1;
                        iqt0Var.getClass();
                        hxf0Var.H0().i.a(iqt0Var);
                        break;
                }
                return Unit.f46060a;
            }
        });
        G0().d.a(da0Var);
        DsTextField dsTextField = G0().d;
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (dsTextField.isAttachedToWindow()) {
            dsTextField.addOnAttachStateChangeListener(new i14(dsTextField, this, da0Var, (byte) 3));
        } else {
            G0().d.c(da0Var);
        }
        if (this.M1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        final byte b2 = 1;
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new dxf0(this, (byte) 4), new Function1(this) { // from class: a.cxf0
            public final /* synthetic */ hxf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence charSequenceU0;
                byte b3 = b2;
                hxf0 hxf0Var = this.b;
                switch (b3) {
                    case 0:
                        Editable editable = (Editable) obj;
                        zie0 zie0Var = hxf0.V1;
                        editable.getClass();
                        sxf0 sxf0VarH0 = hxf0Var.H0();
                        String string = editable.toString();
                        if (string == null || (charSequenceU0 = StringsKt.u0(string)) == null) {
                            charSequenceU0 = "";
                        }
                        sxf0VarH0.b.e("email_key", charSequenceU0);
                        sxf0VarH0.f.l(sxf0.w.matcher(charSequenceU0).matches() || sxf0VarH0.u.length() > 0);
                        break;
                    default:
                        iqt0 iqt0Var = (iqt0) obj;
                        zie0 zie0Var2 = hxf0.V1;
                        iqt0Var.getClass();
                        hxf0Var.H0().i.a(iqt0Var);
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        bsi bsiVar = (bsi) this.R1.getValue();
        bsiVar.getClass();
        this.M1 = new gl5((byte) 17);
        this.N1 = bsiVar.f3131a;
        this.O1 = bsiVar.b;
        this.Q1 = (asi) bsiVar.p.get();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = ((f190) this.U1.getValue()).b;
        yje yjeVar = null;
        exf0 exf0Var = new exf0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w7f0(ol60Var, clzVarW, exf0Var, (yje) null), 3);
        p7m0 p7m0Var = H0().s;
        coc0 coc0Var = new coc0(this, yjeVar, (byte) 25);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new w7f0(p7m0Var, clzVarW2, coc0Var, (yje) null), 3);
        ol60 ol60Var2 = H0().t;
        exf0 exf0Var2 = new exf0(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new w7f0(ol60Var2, clzVarW3, exf0Var2, (yje) null, (byte) 0), 3);
    }

    public final h4r G0() {
        Object objN = this.P1.n(W1[1], this);
        objN.getClass();
        return (h4r) objN;
    }

    public final sxf0 H0() {
        return (sxf0) this.S1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new dxf0(this, (byte) 3));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        sxf0 sxf0VarH0 = H0();
        bvc bvcVarA = jiu0.a(sxf0VarH0);
        qxf0 qxf0Var = qxf0.f29483a;
        mne mneVar = sxf0VarH0.l;
        yje yjeVar = null;
        sac.V(bvcVarA, qxf0Var, null, mneVar.f22085a, new d7a0(sxf0VarH0, yjeVar, (byte) 28), 10);
        sac.V(jiu0.a(sxf0VarH0), new ixf0(sxf0VarH0, (byte) 0), null, mneVar.f22085a, new coc0(sxf0VarH0, yjeVar, (byte) 26), 10);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
