package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.security.GeneralSecurityException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qow0 implements xmw0, c7x0, g5x0, a7x0, w6x0, d5x0, mff0, anw0 {
    public static final /* synthetic */ qow0 b = new qow0(0);
    public static final /* synthetic */ qow0 c = new qow0(1);
    public static final /* synthetic */ qow0 d = new qow0(2);
    public static final /* synthetic */ qow0 e = new qow0(3);
    public static final /* synthetic */ qow0 f = new qow0(4);
    public static final /* synthetic */ qow0 g = new qow0(5);
    public static final /* synthetic */ qow0 h = new qow0(6);
    public static final /* synthetic */ qow0 i = new qow0(7);
    public static final /* synthetic */ qow0 j = new qow0(8);
    public static final /* synthetic */ qow0 k = new qow0(10);
    public static final /* synthetic */ qow0 l = new qow0(11);
    public static final /* synthetic */ qow0 m = new qow0(12);
    public static final /* synthetic */ qow0 n = new qow0(13);
    public static final /* synthetic */ qow0 o = new qow0(14);
    public static final /* synthetic */ qow0 p = new qow0(15);
    public static final /* synthetic */ qow0 q = new qow0(16);
    public static final /* synthetic */ qow0 r = new qow0(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29089a;

    public /* synthetic */ qow0(byte b2) {
        this.f29089a = b2;
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public vkr0 mo8a(atm0 atm0Var) throws GeneralSecurityException {
        lpw0 lpw0Var;
        switch (this.f29089a) {
            case 17:
                usw0 usw0Var = (usw0) atm0Var;
                igx0 igx0VarW = kgx0.w();
                ogx0 ogx0VarB = wsw0.b(usw0Var.f36231a);
                igx0VarW.d();
                kgx0.v((kgx0) igx0VarW.b, ogx0VarB);
                vjw0 vjw0VarA = ((kgx0) igx0VarW.c()).a();
                hbb hbbVar = hbb.m;
                hbb hbbVar2 = usw0Var.f36231a.f34483a;
                if (hbb.n == hbbVar2) {
                    lpw0Var = lpw0.c;
                } else {
                    if (hbb.o != hbbVar2) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(hbbVar2)));
                    }
                    lpw0Var = lpw0.e;
                }
                return vkr0.C("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", vjw0VarA, hbbVar, lpw0Var, usw0Var.c);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                q0x0 q0x0Var = (q0x0) atm0Var;
                return vkr0.C("type.googleapis.com/google.crypto.tink.HpkePublicKey", l0x0.d(q0x0Var).a(), hbb.l, l0x0.b(q0x0Var.f27924a.d), q0x0Var.d);
            default:
                f0x0 f0x0Var = (f0x0) atm0Var;
                return vkr0.C("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", x1x0.d(f0x0Var).a(), hbb.l, x1x0.b(f0x0Var.f8737a.d), f0x0Var.e);
        }
    }

    @Override // a.mff0
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i2 = tzw0.l;
    }

    @Override // a.d5x0
    public atm0 c(vkr0 vkr0Var) throws GeneralSecurityException {
        if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            jf4.o("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
            return null;
        }
        try {
            jhx0 jhx0VarU = jhx0.u((sjw0) vkr0Var.c, dkw0.b);
            if (jhx0VarU.t() == 0) {
                return cuw0.v(ayw0.a((lpw0) vkr0Var.e), new rkt0(icw0.a(jhx0VarU.x().r()), (byte) 11), (Integer) vkr0Var.f);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (qkw0 unused) {
            hny.o("Parsing XChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // a.w6x0
    public fpw0 e(x4w0 x4w0Var) throws GeneralSecurityException {
        arw0 arw0Var;
        switch (this.f29089a) {
            case 21:
                String str = (String) x4w0Var.b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    nbx0 nbx0VarU = nbx0.u((sjw0) x4w0Var.f40287a, dkw0.b);
                    if (nbx0VarU.w() != 0) {
                        hny.o("Only version 0 parameters are accepted");
                        return null;
                    }
                    okt0 okt0VarB = srw0.b();
                    okt0VarB.p(nbx0VarU.t());
                    okt0VarB.b = fww0.a((lpw0) x4w0Var.c);
                    return okt0VarB.m();
                } catch (qkw0 e2) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
                }
            case 22:
                String str2 = (String) x4w0Var.b;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    ahx0 ahx0VarU = ahx0.u((sjw0) x4w0Var.f40287a, dkw0.b);
                    if (ahx0VarU.t() != 0) {
                        hny.o("Only version 0 parameters are accepted");
                        return null;
                    }
                    lpw0 lpw0Var = (lpw0) x4w0Var.c;
                    if (lpw0Var == lpw0.c) {
                        arw0Var = arw0.f;
                    } else {
                        if (lpw0Var != lpw0.e) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
                        }
                        arw0Var = arw0.g;
                    }
                    return xtw0.b(arw0Var, ahx0VarU.x().t());
                } catch (qkw0 e3) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e3);
                }
            default:
                String str3 = (String) x4w0Var.b;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to AesSivParameters.parseParameters: ", str3));
                    return null;
                }
                try {
                    vbx0 vbx0VarU = vbx0.u((sjw0) x4w0Var.f40287a, dkw0.b);
                    if (vbx0VarU.w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    hcp0 hcp0VarB = zyw0.b();
                    hcp0VarB.y(vbx0VarU.t());
                    hcp0VarB.c = hzw0.a((lpw0) x4w0Var.c);
                    return hcp0VarB.x();
                } catch (qkw0 e4) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e4);
                }
        }
    }

    @Override // a.anw0
    public Object f(fck0 fck0Var, Class cls) throws GeneralSecurityException {
        if (cls.equals(cnw0.class)) {
            return cls.cast(afn0.D(fck0Var, new epw0((byte) 26)));
        }
        if (cls.equals(dnw0.class)) {
            return cls.cast(n8n0.q(fck0Var, new tow0((byte) 27)));
        }
        hny.o("HybridConfigurationV1 can only create HybridEncrypt and HybridDecrypt primitives");
        return null;
    }

    @Override // a.a7x0
    public x4w0 h(fpw0 fpw0Var) {
        switch (this.f29089a) {
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                jrw0 jrw0Var = (jrw0) fpw0Var;
                lpw0 lpw0VarB = dvw0.b(jrw0Var.d);
                xax0 xax0VarX = yax0.x();
                bbx0 bbx0VarC = dvw0.c(jrw0Var);
                xax0VarX.d();
                yax0.w((yax0) xax0VarX.b, bbx0VarC);
                int i2 = jrw0Var.f17024a;
                xax0VarX.d();
                ((yax0) xax0VarX.b).zzg = i2;
                return x4w0.d("type.googleapis.com/google.crypto.tink.AesEaxKey", lpw0VarB, ((yax0) xax0VarX.c()).a());
            default:
                mrw0 mrw0Var = (mrw0) fpw0Var;
                pvw0.c(mrw0Var);
                lpw0 lpw0VarB2 = pvw0.b(mrw0Var.d);
                gbx0 gbx0VarX = hbx0.x();
                int i3 = mrw0Var.f22292a;
                gbx0VarX.d();
                ((hbx0) gbx0VarX.b).zze = i3;
                return x4w0.d("type.googleapis.com/google.crypto.tink.AesGcmKey", lpw0VarB2, ((hbx0) gbx0VarX.c()).a());
        }
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f29089a) {
            case 0:
                List list = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.sgtm.upload.min_delay_after_startup", 50, 5000L).get();
            case 1:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.window_interval", 79, 3600000L).get();
            case 2:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.stale_data_deletion_interval", 53, 86400000L).get();
            case 3:
                List list4 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.retry_count", 76, 6L).get()).longValue());
            case 4:
                List list5 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.service_client.reconnect_millis", 38, 1000L).get();
            case 5:
                List list6 = btw0.f3204a;
                kiw0.b.get();
                return (Long) liw0.f20126a.u("measurement.test.long_flag", 4, -1L).get();
            case 6:
                List list7 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_item_scoped_custom_parameters", 23, 27L).get()).longValue());
            case 7:
                List list8 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_bundles", 67, 100L).get()).longValue());
            case 8:
                List list9 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case 9:
            default:
                List list10 = btw0.f3204a;
                return (Boolean) tiw0.f34026a.get();
            case 10:
                List list11 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.rb.max_trigger_registrations_per_day", 24, 1000L).get()).longValue());
            case 11:
                List list12 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("45769094", 11, 3600000L).get();
            case 12:
                List list13 = btw0.f3204a;
                return (Boolean) eiw0.f7880a.get();
            case 13:
                List list14 = btw0.f3204a;
                return (Boolean) uhw0.b.get();
            case 14:
                List list15 = btw0.f3204a;
                miw0.b.get();
                return (Boolean) oiw0.f25331a.r("measurement.rb.attribution.service", 6, true).get();
            case 15:
                List list16 = btw0.f3204a;
                return (Boolean) riw0.f30563a.get();
        }
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public Object mo8a(atm0 atm0Var) {
        switch (this.f29089a) {
            case 9:
                return fcw0.a((krw0) atm0Var);
            case 18:
                return zxw0.a((qtw0) atm0Var);
            default:
                return m2x0.a((q0x0) atm0Var);
        }
    }
}
