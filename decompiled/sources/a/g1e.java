package a;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;
import org.xplatform.login.new_place.api.navigation.SmsCodeExtras;
import org.xplatform.login.new_place.impl.navigation.ConfirmationNewPlaceScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class g1e extends w46 {
    public String A;
    public final p7m0 B;
    public final ol60 C;
    public c4m0 D;
    public bby E;
    public bby F;
    public c4m0 G;
    public boolean H;
    public final vzg0 b;
    public final i1w0 c;
    public final ConfirmationNewPlaceScreenType d;
    public final duj e;
    public final mne f;
    public final m1e g;
    public final cyh h;
    public final z4w0 i;
    public final ojj j;
    public final wpt k;
    public final yuu l;
    public final suk m;
    public final ctf0 n;
    public final qgd o;
    public final epc p;
    public final tvd q;
    public final dkj r;
    public final tyu s;
    public final g2v t;
    public final im4 u;
    public final usd v;
    public final nyb w;
    public final s64 x;
    public final p7m0 y;
    public boolean z;

    public g1e(vzg0 vzg0Var, i1w0 i1w0Var, ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType, duj dujVar, mne mneVar, m1e m1eVar, cyh cyhVar, z4w0 z4w0Var, ojj ojjVar, wpt wptVar, yuu yuuVar, suk sukVar, ctf0 ctf0Var, qgd qgdVar, epc epcVar, tvd tvdVar, dkj dkjVar, tyu tyuVar, g2v g2vVar, im4 im4Var, usd usdVar, nyb nybVar, s64 s64Var, pru pruVar) {
        byte b;
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = confirmationNewPlaceScreenType;
        this.e = dujVar;
        this.f = mneVar;
        this.g = m1eVar;
        this.h = cyhVar;
        this.i = z4w0Var;
        this.j = ojjVar;
        this.k = wptVar;
        this.l = yuuVar;
        this.m = sukVar;
        this.n = ctf0Var;
        this.o = qgdVar;
        this.p = epcVar;
        this.q = tvdVar;
        this.r = dkjVar;
        this.s = tyuVar;
        this.t = g2vVar;
        this.u = im4Var;
        this.v = usdVar;
        this.w = nybVar;
        this.x = s64Var;
        this.y = q7m0.a(yzd.f43509a);
        this.A = "";
        String strA = confirmationNewPlaceScreenType instanceof ConfirmationNewPlaceScreenType.Authenticator ? ctf0Var.b.a(R.string.confirm_by_authenticator_another_method_description, Arrays.copyOf(new Object[0], 0)) : confirmationNewPlaceScreenType.getF46758a();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
        sjt sjtVar = new sjt(Regex.d(new Regex("\\w+[.]{2,}\\w+"), strA));
        while (true) {
            b = 1;
            if (!sjtVar.hasNext()) {
                break;
            }
            MatchResult matchResult = (MatchResult) sjtVar.next();
            spannableStringBuilder.setSpan(new StyleSpan(1), matchResult.b().f46068a, matchResult.b().b + 1, 33);
        }
        wzd wzdVarZ = z();
        ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType2 = this.d;
        boolean z = confirmationNewPlaceScreenType2 instanceof ConfirmationNewPlaceScreenType.Authenticator;
        ctf0 ctf0Var2 = this.n;
        wzd wzdVar = new wzd(z ? ctf0Var2.b.a(R.string.get_code_use_another_method, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.get_code_by_authenticator, Arrays.copyOf(new Object[0], 0)), z || ((confirmationNewPlaceScreenType2 instanceof ConfirmationNewPlaceScreenType.SmsCode) && (((ConfirmationNewPlaceScreenType.SmsCode) confirmationNewPlaceScreenType2).d instanceof SmsCodeExtras.FromAuthenticatorExtras)), true);
        wzd wzdVarA = A();
        ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType3 = this.d;
        boolean z2 = !(confirmationNewPlaceScreenType3 instanceof ConfirmationNewPlaceScreenType.SmsCode);
        boolean z3 = confirmationNewPlaceScreenType3 instanceof ConfirmationNewPlaceScreenType.Authenticator;
        boolean z4 = (confirmationNewPlaceScreenType3 instanceof ConfirmationNewPlaceScreenType.Simple) && pruVar.a().E0 && !((ConfirmationNewPlaceScreenType.Simple) this.d).d;
        boolean z5 = this.d instanceof ConfirmationNewPlaceScreenType.Authenticator;
        ctf0 ctf0Var3 = this.n;
        this.B = q7m0.a(new r0e(false, spannableStringBuilder, wzdVarZ, wzdVar, wzdVarA, z2, z3, z4, z5 ? ctf0Var3.b.a(R.string.authenticator_verification, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.confirm_new_place, Arrays.copyOf(new Object[0], 0))));
        this.C = new ol60(3);
        ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType4 = this.d;
        if ((confirmationNewPlaceScreenType4 instanceof ConfirmationNewPlaceScreenType.SmsCode) && !(((ConfirmationNewPlaceScreenType.SmsCode) confirmationNewPlaceScreenType4).d instanceof SmsCodeExtras.FromAuthenticatorExtras)) {
            D();
        }
        sac.V(jiu0.a(this), new vzd((byte) 0), null, this.f.f22085a, new c1e(this, null, b), 10);
    }

    public final wzd A() {
        ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType = this.d;
        boolean z = confirmationNewPlaceScreenType instanceof ConfirmationNewPlaceScreenType.SmsCode;
        boolean z2 = false;
        ctf0 ctf0Var = this.n;
        if (z && (((ConfirmationNewPlaceScreenType.SmsCode) confirmationNewPlaceScreenType).d instanceof SmsCodeExtras.FromAuthenticatorExtras)) {
            return new wzd(ctf0Var.b.a(R.string.send_sms, Arrays.copyOf(new Object[0], 0)), true, true);
        }
        String strA = ctf0Var.b.a(R.string.confirm, Arrays.copyOf(new Object[0], 0));
        if (StringsKt.u0(this.A).toString().length() > 0 && this.z) {
            z2 = true;
        }
        return new wzd(strA, true, z2);
    }

    public final void B() {
        i1w0 i1w0Var = this.c;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void C(String str) {
        this.H = false;
        bby bbyVar = this.E;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.w.b(str);
            bvc bvcVarA = jiu0.a(this);
            dvj dvjVar = this.f.b;
            enc encVar = new enc(1, this, g1e.class, "handleSocketError", "handleSocketError(Ljava/lang/Throwable;)V", 0, (byte) 28);
            byte b = 2;
            this.E = sac.V(bvcVarA, encVar, new jwd(this, b), dvjVar, new c1e(this, null, b), 8);
        }
    }

    public final void D() {
        zl60 zl60Var = new zl60("AuthSendConfirmationSms", "", "");
        mie0 mie0Var = new mie0();
        sac.V(jiu0.a(this), new h6c(this, mie0Var, (byte) 19), null, this.f.b, new ex1((byte) 22, null, mie0Var, this, zl60Var), 10);
    }

    public final void E(String str) {
        this.C.f(new h0e(str, (str == null || str.length() == 0) ? R.attr.uikitSecondary : R.attr.uikitWarning));
    }

    public final void F() {
        p7m0 p7m0Var = this.B;
        if (((r0e) p7m0Var.getValue()).g) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jY = y();
            p7m0 p7m0Var2 = this.y;
            yje yjeVar = null;
            if (jY == 0) {
                p7m0Var2.getClass();
                p7m0Var2.o(null, yzd.f43509a);
            } else if (y() <= jCurrentTimeMillis) {
                p7m0Var2.getClass();
                p7m0Var2.o(null, xzd.f41749a);
            } else {
                long jY2 = y() - jCurrentTimeMillis;
                c4m0 c4m0Var = this.G;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                this.G = sac.T(new dnq(new fnq(sac.L(6, jY2, 0L), new yg1((Object) this, yjeVar, (byte) 6), (byte) 4), new rj((Object) this, yjeVar, (byte) 13), (byte) 0), d5c.S(jiu0.a(this), this.f.c), d1e.h);
            }
            H(p7m0Var);
        }
    }

    public final void G() {
        ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType = this.d;
        if (confirmationNewPlaceScreenType == null) {
            return;
        }
        boolean z = confirmationNewPlaceScreenType instanceof ConfirmationNewPlaceScreenType.SmsCode;
        i1w0 i1w0Var = this.c;
        if (z) {
            SmsCodeExtras smsCodeExtras = ((ConfirmationNewPlaceScreenType.SmsCode) confirmationNewPlaceScreenType).d;
            SmsCodeExtras.FromAuthenticatorExtras fromAuthenticatorExtras = smsCodeExtras instanceof SmsCodeExtras.FromAuthenticatorExtras ? (SmsCodeExtras.FromAuthenticatorExtras) smsCodeExtras : null;
            if (fromAuthenticatorExtras == null) {
                return;
            }
            String str = fromAuthenticatorExtras.f46759a;
            x();
            ConfirmationNewPlaceScreenType.Authenticator authenticator = new ConfirmationNewPlaceScreenType.Authenticator(confirmationNewPlaceScreenType.getF46758a(), confirmationNewPlaceScreenType.getB(), confirmationNewPlaceScreenType.getC(), str);
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new d1w0(new ConfirmationNewPlaceScreen(authenticator))), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!(confirmationNewPlaceScreenType instanceof ConfirmationNewPlaceScreenType.Authenticator)) {
                return;
            }
            String str2 = ((ConfirmationNewPlaceScreenType.Authenticator) confirmationNewPlaceScreenType).d;
            x();
            ConfirmationNewPlaceScreenType.SmsCode smsCode = new ConfirmationNewPlaceScreenType.SmsCode(this.n.b.a(R.string.new_place_sent_sms_action_text, Arrays.copyOf(new Object[0], 0)), confirmationNewPlaceScreenType.getB(), confirmationNewPlaceScreenType.getC(), new SmsCodeExtras.FromAuthenticatorExtras(str2));
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new d1w0(new ConfirmationNewPlaceScreen(smsCode))), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }

    public final void H(p7m0 p7m0Var) {
        Object value;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, r0e.a((r0e) value, false, z(), null, 507)));
    }

    public final void I(qz40 qz40Var) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = (p7m0) qz40Var;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, r0e.a((r0e) value, false, null, A(), 495)));
    }

    public final void a() {
        ConfirmationNewPlaceScreenType confirmationNewPlaceScreenType = this.d;
        if (confirmationNewPlaceScreenType != null) {
            boolean z = confirmationNewPlaceScreenType instanceof ConfirmationNewPlaceScreenType.Authenticator;
            j0e j0eVar = j0e.f15679a;
            ol60 ol60Var = this.C;
            if (z) {
                ol60Var.f(j0eVar);
                return;
            } else if (confirmationNewPlaceScreenType instanceof ConfirmationNewPlaceScreenType.Simple) {
                ol60Var.f(e0e.f6985a);
                return;
            } else if (confirmationNewPlaceScreenType instanceof ConfirmationNewPlaceScreenType.SmsCode) {
                ol60Var.f(j0eVar);
                return;
            }
        }
        t9f.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r9.a(r8, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r8, a.zje r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.s0e
            if (r0 == 0) goto L13
            r0 = r9
            a.s0e r0 = (a.s0e) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.s0e r0 = new a.s0e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r9)
            goto L69
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L31:
            a.z1x.P(r9)
            goto L54
        L35:
            a.z1x.P(r9)
            r0.k = r5
            a.g2v r9 = r7.t
            java.lang.Object r9 = r9.f10580a
            a.pzu r9 = (a.pzu) r9
            java.lang.Object r2 = r9.f
            a.mne r2 = (a.mne) r2
            a.dvj r2 = r2.b
            a.juy r5 = new a.juy
            r6 = 18
            r5.<init>(r9, r8, r3, r6)
            java.lang.Object r9 = a.qjj.d0(r2, r5, r0)
            if (r9 != r1) goto L54
            goto L68
        L54:
            a.kx00 r9 = (a.kx00) r9
            a.pl4 r8 = new a.pl4
            r8.<init>(r9)
            r0.k = r4
            a.im4 r9 = r7.u
            r9.getClass()
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            a.ol60 r8 = r7.C
            a.c0e r9 = a.c0e.f3520a
            r8.f(r9)
            a.epc r7 = r7.p
            r7.b()
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g1e.w(java.lang.String, a.zje):java.lang.Object");
    }

    public final void x() {
        bby bbyVar = this.E;
        if (bbyVar != null) {
            bbyVar.cancel(plc.b("Operation canceled by user", new art0()));
        }
    }

    public final long y() {
        Long l = (Long) this.b.a("SAVED_FINISH_TIME");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final wzd z() {
        boolean z = false;
        String strA = this.n.b.a(R.string.send_again, Arrays.copyOf(new Object[0], 0));
        if ((this.d instanceof ConfirmationNewPlaceScreenType.Authenticator) && Intrinsics.d(this.y.getValue(), xzd.f41749a) && y() != 0) {
            z = true;
        }
        return new wzd(strA, z, true);
    }
}
