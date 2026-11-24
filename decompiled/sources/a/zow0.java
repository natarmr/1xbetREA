package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zow0 implements xmw0, anw0, mgn, d5x0, a7x0, g5x0, w6x0, ngn, c7x0, p3x0 {
    public static final /* synthetic */ zow0 b = new zow0(0);
    public static final /* synthetic */ zow0 c = new zow0(1);
    public static final /* synthetic */ zow0 d = new zow0(2);
    public static final /* synthetic */ zow0 e = new zow0(3);
    public static final /* synthetic */ zow0 f = new zow0(5);
    public static final /* synthetic */ zow0 g = new zow0(6);
    public static final /* synthetic */ zow0 h = new zow0(7);
    public static final /* synthetic */ zow0 i = new zow0(8);
    public static final /* synthetic */ zow0 j = new zow0(9);
    public static final /* synthetic */ zow0 k = new zow0(10);
    public static final /* synthetic */ zow0 l = new zow0(11);
    public static final /* synthetic */ zow0 m = new zow0(13);
    public static final /* synthetic */ zow0 n = new zow0(14);
    public static final /* synthetic */ zow0 o = new zow0(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44735a;

    public /* synthetic */ zow0(byte b2) {
        this.f44735a = b2;
    }

    @Override // a.g5x0
    public vkr0 a(atm0 atm0Var) throws GeneralSecurityException {
        lpw0 lpw0Var;
        switch (this.f44735a) {
            case 18:
                uqw0 uqw0Var = (uqw0) atm0Var;
                fax0 fax0VarX = gax0.x();
                lax0 lax0VarW = max0.w();
                rax0 rax0VarV = sax0.v();
                int i2 = uqw0Var.f36138a.c;
                rax0VarV.d();
                ((sax0) rax0VarV.b).zze = i2;
                sax0 sax0Var = (sax0) rax0VarV.c();
                lax0VarW.d();
                max0.v((max0) lax0VarW.b, sax0Var);
                byte[] bArrB = ((icw0) uqw0Var.b.b).b();
                vjw0 vjw0VarH = sjw0.h(bArrB, 0, bArrB.length);
                lax0VarW.d();
                max0.u((max0) lax0VarW.b, vjw0VarH);
                max0 max0Var = (max0) lax0VarW.c();
                fax0VarX.d();
                gax0.v((gax0) fax0VarX.b, max0Var);
                jdx0 jdx0VarY = ldx0.y();
                brw0 brw0Var = uqw0Var.f36138a;
                wdx0 wdx0VarD = ruw0.d(brw0Var);
                jdx0VarY.d();
                ldx0.x((ldx0) jdx0VarY.b, wdx0VarD);
                byte[] bArrB2 = ((icw0) uqw0Var.c.b).b();
                vjw0 vjw0VarH2 = sjw0.h(bArrB2, 0, bArrB2.length);
                jdx0VarY.d();
                ldx0.w((ldx0) jdx0VarY.b, vjw0VarH2);
                ldx0 ldx0Var = (ldx0) jdx0VarY.c();
                fax0VarX.d();
                gax0.w((gax0) fax0VarX.b, ldx0Var);
                return vkr0.C("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((gax0) fax0VarX.c()).a(), hbb.j, ruw0.b(brw0Var.e), uqw0Var.e);
            case 21:
                trw0 trw0Var = (trw0) atm0Var;
                xbx0 xbx0VarW = ybx0.w();
                byte[] bArrB3 = ((icw0) trw0Var.b.b).b();
                vjw0 vjw0VarH3 = sjw0.h(bArrB3, 0, bArrB3.length);
                xbx0VarW.d();
                ybx0.v((ybx0) xbx0VarW.b, vjw0VarH3);
                return vkr0.C("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((ybx0) xbx0VarW.c()).a(), hbb.j, rww0.b(trw0Var.f34437a.f37922a), trw0Var.d);
            default:
                qtw0 qtw0Var = (qtw0) atm0Var;
                tgx0 tgx0VarX = ugx0.x();
                byte[] bArrB4 = ((icw0) qtw0Var.b.b).b();
                vjw0 vjw0VarH4 = sjw0.h(bArrB4, 0, bArrB4.length);
                tgx0VarX.d();
                ugx0.v((ugx0) tgx0VarX.b, vjw0VarH4);
                dhx0 dhx0VarV = fhx0.v();
                xtw0 xtw0Var = qtw0Var.f29320a;
                int i3 = xtw0Var.b;
                dhx0VarV.d();
                ((fhx0) dhx0VarV.b).zze = i3;
                fhx0 fhx0Var = (fhx0) dhx0VarV.c();
                tgx0VarX.d();
                ugx0.w((ugx0) tgx0VarX.b, fhx0Var);
                vjw0 vjw0VarA = ((ugx0) tgx0VarX.c()).a();
                hbb hbbVar = hbb.j;
                arw0 arw0Var = xtw0Var.f41484a;
                if (arw0Var == arw0.f) {
                    lpw0Var = lpw0.c;
                } else {
                    if (arw0Var != arw0.g) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(arw0Var)));
                    }
                    lpw0Var = lpw0.e;
                }
                return vkr0.C("type.googleapis.com/google.crypto.tink.XAesGcmKey", vjw0VarA, hbbVar, lpw0Var, qtw0Var.d);
        }
    }

    @Override // a.p3x0
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return dem0.y(bArr, bArr2);
    }

    @Override // a.d5x0
    public atm0 c(vkr0 vkr0Var) throws GeneralSecurityException {
        h70 h70Var;
        switch (this.f44735a) {
            case 15:
                if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    jf4.o("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    wfx0 wfx0VarU = wfx0.u((sjw0) vkr0Var.c, dkw0.b);
                    if (wfx0VarU.t() != 0) {
                        throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(wfx0VarU)));
                    }
                    String strX = wfx0VarU.x().x();
                    lpw0 lpw0Var = (lpw0) vkr0Var.e;
                    if (lpw0Var == lpw0.c) {
                        h70Var = h70.k;
                    } else {
                        if (lpw0Var != lpw0.e) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
                        }
                        h70Var = h70.l;
                    }
                    return osw0.v(new msw0(strX, h70Var), (Integer) vkr0Var.f);
                } catch (qkw0 e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
                }
            case 24:
                if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    jf4.o("Wrong type URL in call to AesSivParameters.parseParameters");
                    return null;
                }
                try {
                    qbx0 qbx0VarU = qbx0.u((sjw0) vkr0Var.c, dkw0.b);
                    if (qbx0VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    hcp0 hcp0VarB = zyw0.b();
                    hcp0VarB.y(qbx0VarU.x().e());
                    hcp0VarB.c = hzw0.a((lpw0) vkr0Var.e);
                    zyw0 zyw0VarX = hcp0VarB.x();
                    mkt0 mkt0Var = new mkt0();
                    mkt0Var.b = null;
                    mkt0Var.c = null;
                    mkt0Var.f21959a = zyw0VarX;
                    mkt0Var.b = new rkt0(icw0.a(qbx0VarU.x().r()), (byte) 11);
                    mkt0Var.c = (Integer) vkr0Var.f;
                    return mkt0Var.c();
                } catch (qkw0 unused) {
                    hny.o("Parsing AesSivKey failed");
                    return null;
                }
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str = (String) vkr0Var.b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", str));
                    return null;
                }
                try {
                    tex0 tex0VarV = tex0.v((sjw0) vkr0Var.c, dkw0.b);
                    if (tex0VarV.u() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    e0x0 e0x0VarC = l0x0.c((lpw0) vkr0Var.e, tex0VarV.z());
                    return q0x0.v(e0x0VarC, l0x0.a(e0x0VarC.f7012a, tex0VarV.C().r()), (Integer) vkr0Var.f);
                } catch (qkw0 unused2) {
                    hny.o("Parsing HpkePublicKey failed");
                    return null;
                }
            default:
                String str2 = (String) vkr0Var.b;
                Integer num = (Integer) vkr0Var.f;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", str2));
                    return null;
                }
                try {
                    tcx0 tcx0VarV = tcx0.v((sjw0) vkr0Var.c, dkw0.b);
                    if (tcx0VarV.u() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    xzw0 xzw0VarC = x1x0.c((lpw0) vkr0Var.e, tcx0VarV.z());
                    if (!xzw0VarC.f41775a.equals(vzw0.e)) {
                        return f0x0.x(xzw0VarC, new ECPoint(ibm0.E(tcx0VarV.D().r()), ibm0.E(tcx0VarV.t().r())), num);
                    }
                    if (tcx0VarV.t().e() == 0) {
                        return f0x0.w(xzw0VarC, icw0.a(tcx0VarV.D().r()), num);
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                } catch (qkw0 | IllegalArgumentException unused3) {
                    hny.o("Parsing EcdsaPublicKey failed");
                    return null;
                }
        }
    }

    @Override // a.mgn
    public int d(Context context, String str, boolean z) {
        return ogn.d(context, str, z);
    }

    @Override // a.w6x0
    public fpw0 e(x4w0 x4w0Var) throws GeneralSecurityException {
        String str = (String) x4w0Var.b;
        if (!str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            jf4.o(kng0.k("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", str));
            return null;
        }
        try {
            yax0 yax0VarU = yax0.u((sjw0) x4w0Var.f40287a, dkw0.b);
            fht0 fht0VarB = jrw0.b();
            fht0VarB.x(yax0VarU.t());
            fht0VarB.u(yax0VarU.y().t());
            fht0VarB.A();
            fht0VarB.d = dvw0.a((lpw0) x4w0Var.c);
            return fht0VarB.r();
        } catch (qkw0 e2) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
        }
    }

    @Override // a.anw0
    public Object f(fck0 fck0Var, Class cls) throws GeneralSecurityException {
        if (cls == tmw0.class) {
            return cls.cast(v2n0.x(fck0Var, new tow0((byte) 4)));
        }
        hny.o("AeadConfigurationV1 can only create AEADs");
        return null;
    }

    @Override // a.mgn
    public int g(Context context, String str) {
        return ogn.a(context, str);
    }

    @Override // a.a7x0
    public x4w0 h(fpw0 fpw0Var) throws GeneralSecurityException {
        lpw0 lpw0Var;
        switch (this.f44735a) {
            case 16:
                tsw0 tsw0Var = (tsw0) fpw0Var;
                hbb hbbVar = tsw0Var.f34483a;
                if (hbb.n == hbbVar) {
                    lpw0Var = lpw0.c;
                } else {
                    if (hbb.o != hbbVar) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(hbbVar)));
                    }
                    lpw0Var = lpw0.e;
                }
                return x4w0.d("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", lpw0Var, wsw0.b(tsw0Var).a());
            default:
                srw0 srw0Var = (srw0) fpw0Var;
                lpw0 lpw0VarB = fww0.b(srw0Var.b);
                mbx0 mbx0VarX = nbx0.x();
                int i2 = srw0Var.f32700a;
                mbx0VarX.d();
                ((nbx0) mbx0VarX.b).zze = i2;
                return x4w0.d("type.googleapis.com/google.crypto.tink.AesGcmSivKey", lpw0VarB, ((nbx0) mbx0VarX.c()).a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
  0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // a.ngn
    public j6 i(Context context, String str, mgn mgnVar) {
        j6 j6Var = new j6();
        j6Var.f15959a = mgnVar.g(context, str);
        int i2 = 1;
        int iD = mgnVar.d(context, str, true);
        j6Var.b = iD;
        int i3 = j6Var.f15959a;
        if (i3 == 0) {
            i3 = 0;
            if (iD == 0) {
                i2 = 0;
            } else if (i3 >= iD) {
                i2 = -1;
            }
        } else if (i3 >= iD) {
            i2 = -1;
        }
        j6Var.c = i2;
        return j6Var;
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f44735a) {
            case 0:
                List list = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.sgtm.batch.long_queuing_threshold", 40, 240000L).get();
            case 1:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.debug_upload_interval", 9, 1000L).get();
            case 2:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.initial_upload_delay_time", 64, 15000L).get();
            case 3:
                List list4 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.lifetimevalue.max_currency_tracked", 17, 4L).get()).longValue());
            case 4:
            case 12:
            default:
                return new Boolean(((Boolean) viw0.f37503a.get()).booleanValue());
            case 5:
                List list5 = btw0.f3204a;
                kiw0.b.get();
                trm0 trm0Var = liw0.f20126a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) trm0Var.b;
                b5x0 b5x0Var = (b5x0) atomicReferenceArray.get(2);
                if (b5x0Var == null) {
                    r4x0 r4x0Var = new r4x0("measurement.test.double_flag", (fbv) ((owp0) trm0Var.c).b);
                    while (!atomicReferenceArray.compareAndSet(2, null, r4x0Var)) {
                        if (atomicReferenceArray.get(2) != null) {
                            b5x0Var = (b5x0) atomicReferenceArray.get(2);
                            b5x0Var.getClass();
                        }
                    }
                    b5x0Var = r4x0Var;
                }
                return (Double) b5x0Var.get();
            case 6:
                List list6 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.max_bundles_per_iteration", 3, 100L).get()).longValue());
            case 7:
                List list7 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(60, "measurement.rb.attribution.uri_scheme", "https").get();
            case 8:
                List list8 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case 9:
                List list9 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.rb.attribution.max_retry_delay_seconds", 54, 16L).get()).longValue());
            case 10:
                List list10 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.rb.attribution.notify_app_delay_millis", 30, 3000L).get()).longValue());
            case 11:
                List list11 = btw0.f3204a;
                return (Boolean) whw0.f39187a.get();
            case 13:
                List list12 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_events_per_bundle", 70, 1000L).get()).longValue());
            case 14:
                List list13 = btw0.f3204a;
                miw0.b.get();
                return (Boolean) oiw0.f25331a.r("measurement.rb.attribution.enable_trigger_redaction", 7, true).get();
        }
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public Object mo8a(atm0 atm0Var) {
        gfk0 gfk0Var = gfk0.h;
        vkr0 vkr0Var = ((o5x0) atm0Var).f24707a;
        o5x0.u(vkr0Var, gfk0Var);
        bcm0.F((lpw0) vkr0Var.e, (Integer) vkr0Var.f).b();
        return new m2x0();
    }
}
