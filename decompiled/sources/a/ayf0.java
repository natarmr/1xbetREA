package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.Editable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ayf0;", "La/yx5;", "<init>", "()V", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ayf0 extends yx5 {
    public final i9o0 K1;
    public gl5 L1;
    public rl70 M1;
    public csi N1;
    public wdk0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final kiu0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(ayf0.class, "viewBinding", "getViewBinding()Lorg/xplatform/security/impl/databinding/FragmentRestoreByPhoneBinding;", 0)};
    public static final eke0 S1 = new eke0();

    public ayf0() {
        super(R.layout.fragment_restore_by_phone);
        this.K1 = i9o0.f14396a;
        txf0 txf0Var = new txf0(this, (byte) 1);
        yxf0 yxf0Var = new yxf0(this, (byte) 0);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new yxf0(yxf0Var, (byte) 1));
        tre0 tre0Var = sre0.f32672a;
        this.P1 = agc.G(this, tre0Var.b(nyf0.class), new fxf0(a8zVarA, (byte) 2), new fxf0(a8zVarA, (byte) 3), txf0Var);
        this.Q1 = ltt0.o(this, zxf0.f45155a);
        a8z a8zVarA2 = maz.a(wezVar, new yxf0(new txf0(this, (byte) 2), (byte) 2));
        this.R1 = agc.G(this, tre0Var.b(f190.class), new fxf0(a8zVarA2, (byte) 4), new fxf0(a8zVarA2, (byte) 5), new sue0(this, a8zVarA2, (byte) 8));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final DsPhoneTextField dsPhoneTextField = G0().b;
        dsPhoneTextField.d();
        dsPhoneTextField.setCodeClickListener(new jpe0(this, (byte) 3));
        final byte b = 0;
        dsPhoneTextField.b.a(new da0(new Function1(this) { // from class: a.vxf0
            public final /* synthetic */ ayf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                DsPhoneTextField dsPhoneTextField2 = dsPhoneTextField;
                ayf0 ayf0Var = this.b;
                switch (b2) {
                    case 0:
                        Editable editable = (Editable) obj;
                        eke0 eke0Var = ayf0.S1;
                        editable.getClass();
                        ayf0Var.H0().w(editable, dsPhoneTextField2.getPhone());
                        break;
                    default:
                        String str = (String) obj;
                        eke0 eke0Var2 = ayf0.S1;
                        str.getClass();
                        ayf0Var.H0().w(dsPhoneTextField2.getCode(), str);
                        break;
                }
                return Unit.f46060a;
            }
        }));
        dsPhoneTextField.b();
        dsPhoneTextField.a();
        final byte b2 = 1;
        dsPhoneTextField.setAfterTextFormattingCallback(new Function1(this) { // from class: a.vxf0
            public final /* synthetic */ ayf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                DsPhoneTextField dsPhoneTextField2 = dsPhoneTextField;
                ayf0 ayf0Var = this.b;
                switch (b3) {
                    case 0:
                        Editable editable = (Editable) obj;
                        eke0 eke0Var = ayf0.S1;
                        editable.getClass();
                        ayf0Var.H0().w(editable, dsPhoneTextField2.getPhone());
                        break;
                    default:
                        String str = (String) obj;
                        eke0 eke0Var2 = ayf0.S1;
                        str.getClass();
                        ayf0Var.H0().w(dsPhoneTextField2.getCode(), str);
                        break;
                }
                return Unit.f46060a;
            }
        });
        CharSequence code = dsPhoneTextField.getCode();
        if (code == null || code.length() == 0) {
            dsPhoneTextField.e();
        }
        yje yjeVar = null;
        if (this.L1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "RESTORE_PHONE_REQUEST_CAPTCHA_CODE_DIALOG_KEY", new txf0(this, (byte) 0), new eme0(this, (byte) 16));
        nyf0 nyf0VarH0 = H0();
        mne mneVar = nyf0VarH0.q;
        int i = ((d190) nyf0VarH0.s.f16851a.f10448a).d;
        String str = ((d190) nyf0VarH0.t.f16997a.f10448a).c;
        if (i == Integer.MIN_VALUE) {
            sac.V(jiu0.a(nyf0VarH0), new cyf0(nyf0VarH0, (byte) 0), null, mneVar.f22085a, new z8b0(nyf0VarH0, yjeVar, (byte) 10), 10);
        } else {
            sac.V(jiu0.a(nyf0VarH0), new cyf0(nyf0VarH0, (byte) 4), null, mneVar.f22085a, new gc1(i, (Object) nyf0VarH0, (Object) str, yjeVar, (byte) 18), 10);
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(uwf0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            uwf0 uwf0Var = (uwf0) (ze3Var instanceof uwf0 ? ze3Var : null);
            if (uwf0Var != null) {
                cad cadVar = uwf0Var.b;
                pp90 pp90Var = uwf0Var.o;
                ctf0 ctf0Var = uwf0Var.p;
                ntu ntuVar = uwf0Var.q;
                duj dujVar = uwf0Var.f36391a;
                rjo rjoVar = uwf0Var.c;
                s31 s31Var = uwf0Var.d;
                cyh cyhVar = uwf0Var.e;
                z4w0 z4w0Var = uwf0Var.f;
                d190 d190Var = uwf0Var.g;
                rpt rptVar = uwf0Var.h;
                czt cztVar = uwf0Var.i;
                gii0 gii0Var = uwf0Var.j;
                at4 at4Var = uwf0Var.k;
                btt0 btt0Var = uwf0Var.l;
                wdk0 wdk0Var = uwf0Var.m;
                knf0 knf0Var = uwf0Var.n;
                rl70 rl70Var = uwf0Var.r;
                lef0 lef0Var = uwf0Var.s;
                es esVar = uwf0Var.t;
                s64 s64Var = uwf0Var.u;
                mi70 mi70Var = uwf0Var.v;
                zn00 zn00Var = uwf0Var.w;
                pp90Var.getClass();
                ctf0Var.getClass();
                d190Var.getClass();
                gii0Var.getClass();
                at4Var.getClass();
                btt0Var.getClass();
                wdk0Var.getClass();
                knf0Var.getClass();
                cr crVar = new cr(cadVar, pp90Var, lef0Var, ctf0Var, ntuVar, dujVar, rjoVar, s31Var, cyhVar, z4w0Var, rptVar, cztVar, wdk0Var, rl70Var, esVar, s64Var, mi70Var, zn00Var);
                this.L1 = new gl5((byte) 17);
                this.M1 = rl70Var;
                this.N1 = (csi) ((n5d0) crVar.r).get();
                this.O1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(uwf0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = ((f190) this.R1.getValue()).c;
        yje yjeVar = null;
        xxf0 xxf0Var = new xxf0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w7f0(ol60Var, clzVarW, xxf0Var, (yje) null), 3);
        p7m0 p7m0Var = H0().G;
        coc0 coc0Var = new coc0(this, yjeVar, (byte) 27);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new w7f0(p7m0Var, clzVarW2, coc0Var, (yje) null, (byte) 0), 3);
        ol60 ol60Var2 = H0().H;
        xxf0 xxf0Var2 = new xxf0(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new w7f0(ol60Var2, clzVarW3, xxf0Var2, (yje) null, (byte) 0), 3);
        ol60 ol60Var3 = H0().I;
        xxf0 xxf0Var3 = new xxf0(this, yjeVar, (byte) 2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new w7f0((gmq) ol60Var3, clzVarW4, xxf0Var3, (yje) null, (char) 0), 3);
    }

    public final i4r G0() {
        Object objN = this.Q1.n(U1[0], this);
        objN.getClass();
        return (i4r) objN;
    }

    public final nyf0 H0() {
        return (nyf0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        final byte b = 0;
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new Function2(this) { // from class: a.uxf0
            public final /* synthetic */ ayf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                yje yjeVar = null;
                ayf0 ayf0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b2) {
                    case 0:
                        eke0 eke0Var = ayf0.S1;
                        int iH = f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST");
                        nyf0 nyf0VarH0 = ayf0Var.H0();
                        sac.V(jiu0.a(nyf0VarH0), lyf0.f20860a, null, nyf0VarH0.q.f22085a, new bh0(nyf0VarH0, iH, yjeVar, (byte) 23), 10);
                        break;
                    default:
                        eke0 eke0Var2 = ayf0.S1;
                        int iH2 = f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST");
                        nyf0 nyf0VarH1 = ayf0Var.H0();
                        sac.V(jiu0.a(nyf0VarH1), new cyf0(nyf0VarH1, (byte) 1), null, nyf0VarH1.q.f22085a, new defpackage.e(nyf0VarH1, iH2, yjeVar, (byte) 9), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        sj3.A0(this, "KEY_PICKER_COUNTRY_ID_REQUEST", new Function2(this) { // from class: a.uxf0
            public final /* synthetic */ ayf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                yje yjeVar = null;
                ayf0 ayf0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b3) {
                    case 0:
                        eke0 eke0Var = ayf0.S1;
                        int iH = f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST");
                        nyf0 nyf0VarH0 = ayf0Var.H0();
                        sac.V(jiu0.a(nyf0VarH0), lyf0.f20860a, null, nyf0VarH0.q.f22085a, new bh0(nyf0VarH0, iH, yjeVar, (byte) 23), 10);
                        break;
                    default:
                        eke0 eke0Var2 = ayf0.S1;
                        int iH2 = f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST");
                        nyf0 nyf0VarH1 = ayf0Var.H0();
                        sac.V(jiu0.a(nyf0VarH1), new cyf0(nyf0VarH1, (byte) 1), null, nyf0VarH1.q.f22085a, new defpackage.e(nyf0VarH1, iH2, yjeVar, (byte) 9), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        DsPhoneTextField dsPhoneTextField = G0().b;
        H0().w(dsPhoneTextField.getCode(), dsPhoneTextField.getPhone());
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
