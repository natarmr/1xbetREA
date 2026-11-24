package a;

import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.security.GeneralSecurityException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class epw0 implements xmw0, c7x0, w6x0, g5x0, d5x0, a7x0, n7x0, Continuation {
    public static final /* synthetic */ epw0 b = new epw0(0);
    public static final /* synthetic */ epw0 c = new epw0(1);
    public static final /* synthetic */ epw0 d = new epw0(2);
    public static final /* synthetic */ epw0 e = new epw0(3);
    public static final /* synthetic */ epw0 f = new epw0(4);
    public static final /* synthetic */ epw0 g = new epw0(5);
    public static final /* synthetic */ epw0 h = new epw0(6);
    public static final /* synthetic */ epw0 i = new epw0(7);
    public static final /* synthetic */ epw0 j = new epw0(8);
    public static final /* synthetic */ epw0 k = new epw0(9);
    public static final /* synthetic */ epw0 l = new epw0(12);
    public static final /* synthetic */ epw0 m = new epw0(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8208a;

    public /* synthetic */ epw0(byte b2) {
        this.f8208a = b2;
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public Object mo8a(atm0 atm0Var) throws GeneralSecurityException {
        switch (this.f8208a) {
            case 10:
                return iyw0.a((nrw0) atm0Var);
            case 11:
                trw0 trw0Var = (trw0) atm0Var;
                icw0 icw0Var = trw0Var.c;
                rkt0 rkt0Var = trw0Var.b;
                if (!lww0.d()) {
                    return new fcw0(((icw0) rkt0Var.b).b(), icw0Var.b(), (byte) 4);
                }
                return new lww0(((icw0) rkt0Var.b).b(), icw0Var.b(), lww0.a().getProvider());
            case 12:
            default:
                gfk0 gfk0Var = gfk0.h;
                vkr0 vkr0Var = ((o5x0) atm0Var).f24707a;
                o5x0.u(vkr0Var, gfk0Var);
                lpw0 lpw0Var = (lpw0) vkr0Var.e;
                bcm0.D(lpw0Var);
                bcm0.F(lpw0Var, (Integer) vkr0Var.f).b();
                return new qzw0();
            case 13:
                usw0 usw0Var = (usw0) atm0Var;
                tsw0 tsw0Var = usw0Var.f36231a;
                String str = tsw0Var.b;
                sqw0 sqw0Var = tsw0Var.d;
                uow0.a(str);
                g4x0 g4x0VarA = i4x0.a(str);
                byte[] bArr = isw0.d;
                try {
                    return new fcw0(new isw0(bfx0.v(ktt0.F(sqw0Var), dkw0.b), g4x0VarA), usw0Var.b.b());
                } catch (qkw0 e2) {
                    throw new GeneralSecurityException(e2);
                }
        }
    }

    @Override // a.d5x0
    public atm0 c(vkr0 vkr0Var) throws GeneralSecurityException {
        byte b2 = 11;
        switch (this.f8208a) {
            case 17:
                if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    jf4.o("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    kgx0 kgx0VarU = kgx0.u((sjw0) vkr0Var.c, dkw0.b);
                    if (kgx0VarU.t() != 0) {
                        throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(kgx0VarU)));
                    }
                    ogx0 ogx0VarX = kgx0VarU.x();
                    lpw0 lpw0Var = (lpw0) vkr0Var.e;
                    lpw0 lpw0Var2 = lpw0.c;
                    if (lpw0Var != lpw0Var2 && lpw0Var != (lpw0Var2 = lpw0.e)) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
                    }
                    return usw0.v(wsw0.a(ogx0VarX, lpw0Var2), (Integer) vkr0Var.f);
                } catch (qkw0 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
            case 18:
                if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    jf4.o("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    gax0 gax0VarU = gax0.u((sjw0) vkr0Var.c, dkw0.b);
                    if (gax0VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (gax0VarU.y().t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (gax0VarU.z().u() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    zcw0 zcw0VarB = brw0.b();
                    zcw0VarB.d(gax0VarU.y().z().e());
                    zcw0VarB.f(gax0VarU.z().B().e());
                    zcw0VarB.j(gax0VarU.y().y().t());
                    zcw0VarB.m(gax0VarU.z().A().t());
                    zcw0VarB.e = ruw0.a(gax0VarU.z().A().w());
                    zcw0VarB.f = ruw0.c((lpw0) vkr0Var.e);
                    brw0 brw0VarA = zcw0VarB.a();
                    h0q0 h0q0Var = new h0q0();
                    h0q0Var.b = null;
                    h0q0Var.c = null;
                    h0q0Var.d = null;
                    h0q0Var.f12247a = brw0VarA;
                    h0q0Var.b = new rkt0(icw0.a(gax0VarU.y().z().r()), b2);
                    h0q0Var.c = new rkt0(icw0.a(gax0VarU.z().B().r()), b2);
                    h0q0Var.d = (Integer) vkr0Var.f;
                    return h0q0Var.C();
                } catch (qkw0 unused) {
                    hny.o("Parsing AesCtrHmacAeadKey failed");
                    return null;
                }
            default:
                if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    jf4.o("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                    return null;
                }
                try {
                    ybx0 ybx0VarU = ybx0.u((sjw0) vkr0Var.c, dkw0.b);
                    if (ybx0VarU.t() == 0) {
                        return trw0.v(rww0.a((lpw0) vkr0Var.e), new rkt0(icw0.a(ybx0VarU.x().r()), b2), (Integer) vkr0Var.f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (qkw0 unused2) {
                    hny.o("Parsing ChaCha20Poly1305Key failed");
                    return null;
                }
        }
    }

    @Override // a.n7x0
    public Object d(dow0 dow0Var) throws GeneralSecurityException {
        atm0 atm0Var = dow0Var.f6432a;
        if (atm0Var instanceof f0x0) {
            return aix0.a((f0x0) atm0Var);
        }
        if (atm0Var instanceof q0x0) {
            return m2x0.a((q0x0) atm0Var);
        }
        throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(atm0Var.getClass())));
    }

    @Override // a.w6x0
    public fpw0 e(x4w0 x4w0Var) throws GeneralSecurityException {
        h70 h70Var;
        switch (this.f8208a) {
            case 14:
                String str = (String) x4w0Var.b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    String strX = bgx0.u((sjw0) x4w0Var.f40287a, dkw0.b).x();
                    lpw0 lpw0Var = (lpw0) x4w0Var.c;
                    if (lpw0Var == lpw0.c) {
                        h70Var = h70.k;
                    } else {
                        if (lpw0Var != lpw0.e) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
                        }
                        h70Var = h70.l;
                    }
                    return new msw0(strX, h70Var);
                } catch (qkw0 e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                }
            default:
                String str2 = (String) x4w0Var.b;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    hbx0 hbx0VarU = hbx0.u((sjw0) x4w0Var.f40287a, dkw0.b);
                    if (hbx0VarU.w() != 0) {
                        hny.o("Only version 0 parameters are accepted");
                        return null;
                    }
                    h0q0 h0q0VarB = mrw0.b();
                    h0q0VarB.I(hbx0VarU.t());
                    h0q0VarB.G();
                    h0q0VarB.K();
                    h0q0VarB.d = pvw0.a((lpw0) x4w0Var.c);
                    return h0q0VarB.D();
                } catch (qkw0 e3) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e3);
                }
        }
    }

    @Override // a.a7x0
    public x4w0 h(fpw0 fpw0Var) {
        switch (this.f8208a) {
            case 22:
                return x4w0.d("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ayw0.b(((muw0) fpw0Var).f22431a), ohx0.v().a());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                e0x0 e0x0Var = (e0x0) fpw0Var;
                lpw0 lpw0VarB = l0x0.b(e0x0Var.d);
                fex0 fex0VarV = gex0.v();
                jex0 jex0VarE = l0x0.e(e0x0Var);
                fex0VarV.d();
                gex0.u((gex0) fex0VarV.b, jex0VarE);
                return x4w0.d("type.googleapis.com/google.crypto.tink.HpkePrivateKey", lpw0VarB, ((gex0) fex0VarV.c()).a());
            default:
                xzw0 xzw0Var = (xzw0) fpw0Var;
                lpw0 lpw0VarB2 = x1x0.b(xzw0Var.d);
                gcx0 gcx0VarT = hcx0.t();
                mcx0 mcx0VarE = x1x0.e(xzw0Var);
                gcx0VarT.d();
                hcx0.v((hcx0) gcx0VarT.b, mcx0VarE);
                return x4w0.d("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", lpw0VarB2, ((hcx0) gcx0VarT.c()).a());
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        mew0 mew0VarE;
        zzjh zzjhVar = (zzjh) task.getResult();
        i2x0 i2x0VarX = l2x0.x();
        String str = zzjhVar.f45528a;
        i2x0VarX.c();
        ((l2x0) i2x0VarX.b).y(str);
        String str2 = zzjhVar.c;
        i2x0VarX.c();
        ((l2x0) i2x0VarX.b).A(str2);
        boolean z = zzjhVar.f;
        i2x0VarX.c();
        ((l2x0) i2x0VarX.b).D(z);
        long j2 = zzjhVar.g;
        i2x0VarX.c();
        ((l2x0) i2x0VarX.b).E(j2);
        byte[] bArr = zzjhVar.b;
        if (bArr != null) {
            pdw0 pdw0VarK = qdw0.k(bArr, 0, bArr.length);
            i2x0VarX.c();
            ((l2x0) i2x0VarX.b).z(pdw0VarK);
        }
        for (zzjf zzjfVar : zzjhVar.d) {
            for (zzjo zzjoVar : zzjfVar.b) {
                int i2 = zzjoVar.g;
                String str3 = zzjoVar.f45531a;
                if (i2 == 1) {
                    n2x0 n2x0VarX = q2x0.x();
                    n2x0VarX.h(str3);
                    if (i2 != 1) {
                        jf4.o("Not a long type");
                        return null;
                    }
                    long j3 = zzjoVar.b;
                    n2x0VarX.c();
                    ((q2x0) n2x0VarX.b).A(j3);
                    mew0VarE = n2x0VarX.e();
                } else if (i2 == 2) {
                    n2x0 n2x0VarX2 = q2x0.x();
                    n2x0VarX2.h(str3);
                    if (i2 != 2) {
                        jf4.o("Not a boolean type");
                        return null;
                    }
                    boolean z2 = zzjoVar.c;
                    n2x0VarX2.c();
                    ((q2x0) n2x0VarX2.b).B(z2);
                    mew0VarE = n2x0VarX2.e();
                } else if (i2 == 3) {
                    n2x0 n2x0VarX3 = q2x0.x();
                    n2x0VarX3.h(str3);
                    if (i2 != 3) {
                        jf4.o("Not a double type");
                        return null;
                    }
                    double d2 = zzjoVar.d;
                    n2x0VarX3.c();
                    ((q2x0) n2x0VarX3.b).C(d2);
                    mew0VarE = n2x0VarX3.e();
                } else if (i2 == 4) {
                    n2x0 n2x0VarX4 = q2x0.x();
                    n2x0VarX4.h(str3);
                    if (i2 != 4) {
                        jf4.o("Not a String type");
                        return null;
                    }
                    String str4 = zzjoVar.e;
                    s0x.H(str4);
                    n2x0VarX4.c();
                    ((q2x0) n2x0VarX4.b).D(str4);
                    mew0VarE = n2x0VarX4.e();
                } else {
                    if (i2 != 5) {
                        jf4.o(b1j.h(i2, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i2).length() + 24)));
                        return null;
                    }
                    n2x0 n2x0VarX5 = q2x0.x();
                    n2x0VarX5.h(str3);
                    if (i2 != 5) {
                        jf4.o("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = zzjoVar.f;
                    s0x.H(bArr2);
                    pdw0 pdw0VarK2 = qdw0.k(bArr2, 0, bArr2.length);
                    n2x0VarX5.c();
                    ((q2x0) n2x0VarX5.b).E(pdw0VarK2);
                    mew0VarE = n2x0VarX5.e();
                }
                i2x0VarX.c();
                ((l2x0) i2x0VarX.b).B((q2x0) mew0VarE);
            }
            String[] strArr = zzjfVar.c;
            if (strArr != null) {
                for (String str5 : strArr) {
                    i2x0VarX.c();
                    ((l2x0) i2x0VarX.b).C(str5);
                }
            }
        }
        return (l2x0) i2x0VarX.e();
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f8208a) {
            case 0:
                List list = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.backoff_period", 63, 43200000L).get();
            case 1:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.alarm_manager.minimum_interval", 27, 60000L).get();
            case 2:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.retry_time", 77, 1800000L).get();
            case 3:
                List list4 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.service_client.idle_disconnect_millis", 36, 5000L).get();
            case 4:
                List list5 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 5:
                List list6 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.experiment.max_ids", 21, 50L).get()).longValue());
            case 6:
                List list7 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.redaction.app_instance_id.ttl", 62, 7200000L).get();
            case 7:
                List list8 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case 8:
                List list9 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case 9:
                List list10 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.rb.attribution.max_trigger_uris_queried_at_once", 25, 0L).get()).longValue());
            case 10:
            case 11:
            default:
                return new Boolean(((Boolean) ciw0.b.get()).booleanValue());
            case 12:
                List list11 = btw0.f3204a;
                return (Boolean) uhw0.f35702a.get();
        }
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public vkr0 mo8a(atm0 atm0Var) {
        switch (this.f8208a) {
            case 15:
                osw0 osw0Var = (osw0) atm0Var;
                vfx0 vfx0VarW = wfx0.w();
                agx0 agx0VarT = bgx0.t();
                String str = osw0Var.f25803a.f22344a;
                agx0VarT.d();
                bgx0.v((bgx0) agx0VarT.b, str);
                bgx0 bgx0Var = (bgx0) agx0VarT.c();
                vfx0VarW.d();
                wfx0.v((wfx0) vfx0VarW.b, bgx0Var);
                return vkr0.C("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((wfx0) vfx0VarW.c()).a(), hbb.m, psw0.a(osw0Var.f25803a.b), osw0Var.c);
            default:
                nrw0 nrw0Var = (nrw0) atm0Var;
                jbx0 jbx0VarW = kbx0.w();
                byte[] bArrB = ((icw0) nrw0Var.b.b).b();
                vjw0 vjw0VarH = sjw0.h(bArrB, 0, bArrB.length);
                jbx0VarW.d();
                kbx0.v((kbx0) jbx0VarW.b, vjw0VarH);
                return vkr0.C("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((kbx0) jbx0VarW.c()).a(), hbb.j, fww0.b(nrw0Var.f24026a.b), nrw0Var.d);
        }
    }
}
