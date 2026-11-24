package a;

import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.spec.ECPoint;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cpw0 implements xmw0, c7x0, w6x0, d5x0, g5x0, k2x0, tew0 {
    public static final /* synthetic */ cpw0 b = new cpw0((byte) 0);
    public static final /* synthetic */ cpw0 c = new cpw0((byte) 1);
    public static final /* synthetic */ cpw0 d = new cpw0((byte) 2);
    public static final /* synthetic */ cpw0 e = new cpw0((byte) 3);
    public static final /* synthetic */ cpw0 f = new cpw0((byte) 4);
    public static final /* synthetic */ cpw0 g = new cpw0((byte) 6);
    public static final /* synthetic */ cpw0 h = new cpw0((byte) 8);
    public static final /* synthetic */ cpw0 i = new cpw0((byte) 9);
    public static final /* synthetic */ cpw0 j = new cpw0((byte) 10);
    public static final /* synthetic */ cpw0 k = new cpw0((byte) 11);
    public static final /* synthetic */ cpw0 l = new cpw0((byte) 12);
    public static final /* synthetic */ cpw0 m = new cpw0((byte) 13);
    public static final /* synthetic */ cpw0 n = new cpw0((byte) 14);
    public static final /* synthetic */ cpw0 o = new cpw0((byte) 15);
    public static final /* synthetic */ cpw0 p = new cpw0((byte) 16);
    public static final /* synthetic */ cpw0 q = new cpw0((byte) 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4770a;

    public cpw0(AppMeasurementReceiver appMeasurementReceiver) {
        this.f4770a = (byte) 20;
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public Object mo8a(atm0 atm0Var) {
        switch (this.f4770a) {
            case 5:
                gfk0 gfk0Var = gfk0.h;
                vkr0 vkr0Var = ((o5x0) atm0Var).f24707a;
                o5x0.u(vkr0Var, gfk0Var);
                return new fcw0((tmw0) a5x0.d.a(tmw0.class, (String) vkr0Var.b).a((sjw0) vkr0Var.c), bcm0.F((lpw0) vkr0Var.e, (Integer) vkr0Var.f).b());
            case 6:
            default:
                uyw0 uyw0Var = (uyw0) atm0Var;
                yyw0.a(uyw0Var.f36511a);
                return new xhx0(((icw0) uyw0Var.b.b).b(), uyw0Var.c);
            case 7:
                return vhx0.a((crw0) atm0Var);
        }
    }

    @Override // a.k2x0
    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if (!lww0.d()) {
            return new gxw0(bArr, (byte) 0).O(ByteBuffer.wrap(Arrays.copyOfRange(bArr3, i2, bArr3.length)), bArr2, bArr4);
        }
        Provider provider = lww0.a().getProvider();
        if (!esw0.d(1)) {
            hny.o("Can not use ChaCha20Poly1305 in FIPS-mode.");
            return null;
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
        if (bArr3 == null) {
            hny.u("ciphertext is null");
            return null;
        }
        if (bArr2.length != 12) {
            hny.o("nonce length must be 12 bytes.");
            return null;
        }
        if (bArr3.length < i2 + 16) {
            hny.o("ciphertext too short");
            return null;
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr4.length != 0) {
            cipher.updateAAD(bArr4);
        }
        return cipher.doFinal(bArr3, i2, bArr3.length - i2);
    }

    @Override // a.d5x0
    public atm0 c(vkr0 vkr0Var) throws GeneralSecurityException {
        switch (this.f4770a) {
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    jf4.o("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                    return null;
                }
                try {
                    vax0 vax0VarU = vax0.u((sjw0) vkr0Var.c, dkw0.b);
                    if (vax0VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    fht0 fht0VarB = jrw0.b();
                    fht0VarB.x(vax0VarU.z().e());
                    fht0VarB.u(vax0VarU.y().t());
                    fht0VarB.A();
                    fht0VarB.d = dvw0.a((lpw0) vkr0Var.e);
                    jrw0 jrw0VarR = fht0VarB.r();
                    l8w0 l8w0Var = new l8w0();
                    l8w0Var.b = null;
                    l8w0Var.c = null;
                    l8w0Var.f19624a = jrw0VarR;
                    l8w0Var.b = new rkt0(icw0.a(vax0VarU.z().r()), (byte) 11);
                    l8w0Var.c = (Integer) vkr0Var.f;
                    return l8w0Var.c();
                } catch (qkw0 unused) {
                    hny.o("Parsing AesEaxKey failed");
                    return null;
                }
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str = (String) vkr0Var.b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", str));
                    return null;
                }
                try {
                    qex0 qex0VarU = qex0.u((sjw0) vkr0Var.c, dkw0.b);
                    if (qex0VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    tex0 tex0VarZ = qex0VarU.z();
                    if (tex0VarZ.u() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    e0x0 e0x0VarC = l0x0.c((lpw0) vkr0Var.e, tex0VarZ.z());
                    d0x0 d0x0Var = e0x0VarC.f7012a;
                    return g0x0.v(q0x0.v(e0x0VarC, l0x0.a(d0x0Var, tex0VarZ.C().r()), (Integer) vkr0Var.f), new rkt0(icw0.a(ibm0.G(ibm0.E(qex0VarU.A().r()), c3x0.c(d0x0Var))), (byte) 11));
                } catch (qkw0 unused2) {
                    hny.o("Parsing HpkePrivateKey failed");
                    return null;
                }
            default:
                String str2 = (String) vkr0Var.b;
                Integer num = (Integer) vkr0Var.f;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ", str2));
                    return null;
                }
                try {
                    pcx0 pcx0VarU = pcx0.u((sjw0) vkr0Var.c, dkw0.b);
                    if (pcx0VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    tcx0 tcx0VarZ = pcx0VarU.z();
                    if (tcx0VarZ.u() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    xzw0 xzw0VarC = x1x0.c((lpw0) vkr0Var.e, tcx0VarZ.z());
                    return xzw0VarC.f41775a.equals(vzw0.e) ? yzw0.w(f0x0.w(xzw0VarC, icw0.a(tcx0VarZ.D().r()), num), new rkt0(icw0.a(pcx0VarU.A().r()), (byte) 11)) : yzw0.v(f0x0.x(xzw0VarC, new ECPoint(ibm0.E(tcx0VarZ.D().r()), ibm0.E(tcx0VarZ.t().r())), num), new zas0(ibm0.E(pcx0VarU.A().r()), (byte) 15));
                } catch (qkw0 | IllegalArgumentException unused3) {
                    hny.o("Parsing EcdsaPrivateKey failed");
                    return null;
                }
        }
    }

    @Override // a.w6x0
    public fpw0 e(x4w0 x4w0Var) throws GeneralSecurityException {
        switch (this.f4770a) {
            case 18:
                String str = (String) x4w0Var.b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    jax0 jax0VarU = jax0.u((sjw0) x4w0Var.f40287a, dkw0.b);
                    if (jax0VarU.y().x() != 0) {
                        hny.o("Only version 0 keys are accepted");
                        return null;
                    }
                    zcw0 zcw0VarB = brw0.b();
                    zcw0VarB.d(jax0VarU.x().t());
                    zcw0VarB.f(jax0VarU.y().t());
                    zcw0VarB.j(jax0VarU.x().y().t());
                    zcw0VarB.m(jax0VarU.y().A().t());
                    zcw0VarB.e = ruw0.a(jax0VarU.y().A().w());
                    zcw0VarB.f = ruw0.c((lpw0) x4w0Var.c);
                    return zcw0VarB.a();
                } catch (qkw0 e2) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
                }
            case 21:
                String str2 = (String) x4w0Var.b;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    jf4.o(kng0.k("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    bcx0.t((sjw0) x4w0Var.f40287a, dkw0.b);
                    return new vrw0(rww0.a((lpw0) x4w0Var.c));
                } catch (qkw0 e3) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e3);
                }
            default:
                String str3 = (String) x4w0Var.b;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    jf4.o(kng0.k("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", str3));
                    return null;
                }
                try {
                    if (ohx0.u((sjw0) x4w0Var.f40287a, dkw0.b).t() == 0) {
                        return new muw0(ayw0.a((lpw0) x4w0Var.c));
                    }
                    hny.o("Only version 0 parameters are accepted");
                    return null;
                } catch (qkw0 e4) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e4);
                }
        }
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public Object mo0zza() throws GeneralSecurityException {
        switch (this.f4770a) {
            case 0:
                List list = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.config.cache_time", 5, 86400000L).get();
            case 1:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.minimum_delay", 28, 500L).get();
            case 2:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(8, "measurement.config.url_scheme", "https").get();
            case 3:
                List list4 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.audience.filter_result_max_count", 22, 200L).get()).longValue());
            case 4:
                List list5 = btw0.f3204a;
                kiw0.b.get();
                return (String) liw0.f20126a.v(5, "measurement.test.string_flag", "---").get();
            case 5:
            case 7:
            default:
                HashSet hashSet = new HashSet();
                h0q0 h0q0VarB = mrw0.b();
                h0q0VarB.G();
                h0q0VarB.I(16);
                h0q0VarB.K();
                p50 p50Var = p50.k;
                h0q0VarB.d = p50Var;
                hashSet.add(h0q0VarB.D());
                h0q0 h0q0VarB2 = mrw0.b();
                h0q0VarB2.G();
                h0q0VarB2.I(32);
                h0q0VarB2.K();
                h0q0VarB2.d = p50Var;
                hashSet.add(h0q0VarB2.D());
                zcw0 zcw0VarB = brw0.b();
                zcw0VarB.d(16);
                zcw0VarB.f(32);
                zcw0VarB.m(16);
                zcw0VarB.j(16);
                fhn fhnVar = fhn.g;
                zcw0VarB.e = fhnVar;
                arw0 arw0Var = arw0.e;
                zcw0VarB.f = arw0Var;
                hashSet.add(zcw0VarB.a());
                zcw0 zcw0VarB2 = brw0.b();
                zcw0VarB2.d(32);
                zcw0VarB2.f(32);
                zcw0VarB2.m(32);
                zcw0VarB2.j(16);
                zcw0VarB2.e = fhnVar;
                zcw0VarB2.f = arw0Var;
                hashSet.add(zcw0VarB2.a());
                hashSet.add(new muw0(fhn.l));
                hcp0 hcp0VarB = zyw0.b();
                hcp0VarB.y(64);
                hcp0VarB.c = drq.j;
                hashSet.add(hcp0VarB.x());
                return Collections.unmodifiableSet(hashSet);
            case 6:
                List list6 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.sdk.attribution.cache.ttl", 61, 604800000L).get();
            case 8:
                List list7 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case 9:
                List list8 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.rb.attribution.client.min_time_after_boot_seconds", 55, 90L).get()).longValue());
            case 10:
                List list9 = btw0.f3204a;
                zgw0.b.get();
                return (Boolean) ahw0.f896a.r("measurement.config.default_flag_values", 10, true).get();
            case 11:
                List list10 = btw0.f3204a;
                return (Boolean) whw0.c.get();
            case 12:
                List list11 = btw0.f3204a;
                return Integer.valueOf((int) ((Long) dhw0.f6113a.get()).longValue());
            case 13:
                List list12 = btw0.f3204a;
                return (Boolean) djw0.f6207a.get();
            case 14:
                List list13 = btw0.f3204a;
                miw0.b.get();
                return (Boolean) oiw0.f25331a.r("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", 4, true).get();
            case 15:
                List list14 = btw0.f3204a;
                return (Boolean) tiw0.b.get();
            case 16:
                return new Boolean(((Boolean) ciw0.f4434a.get()).booleanValue());
            case 17:
                return new Boolean(((Boolean) bjw0.f2724a.get()).booleanValue());
        }
    }

    @Override // a.k2x0
    public byte[] zzc() {
        return c3x0.k;
    }

    public /* synthetic */ cpw0(byte b2) {
        this.f4770a = b2;
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public vkr0 mo8a(atm0 atm0Var) throws GeneralSecurityException {
        uyw0 uyw0Var = (uyw0) atm0Var;
        pbx0 pbx0VarW = qbx0.w();
        byte[] bArrB = ((icw0) uyw0Var.b.b).b();
        vjw0 vjw0VarH = sjw0.h(bArrB, 0, bArrB.length);
        pbx0VarW.d();
        qbx0.v((qbx0) pbx0VarW.b, vjw0VarH);
        vjw0 vjw0VarA = ((qbx0) pbx0VarW.c()).a();
        hbb hbbVar = hbb.j;
        drq drqVar = uyw0Var.f36511a.b;
        Map map = hzw0.e;
        if (map.containsKey(drqVar)) {
            return vkr0.C("type.googleapis.com/google.crypto.tink.AesSivKey", vjw0VarA, hbbVar, (lpw0) map.get(drqVar), uyw0Var.d);
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(drqVar)));
    }

    @Override // a.k2x0
    public int zza() {
        return 32;
    }
}
