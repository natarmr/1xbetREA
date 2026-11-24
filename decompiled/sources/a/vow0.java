package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vow0 implements xmw0, w6x0, a7x0, ngn, g5x0, d5x0, c7x0 {
    public static final /* synthetic */ vow0 b = new vow0(0);
    public static final /* synthetic */ vow0 c = new vow0(1);
    public static final /* synthetic */ vow0 d = new vow0(2);
    public static final /* synthetic */ vow0 e = new vow0(3);
    public static final /* synthetic */ vow0 f = new vow0(4);
    public static final /* synthetic */ vow0 g = new vow0(5);
    public static final /* synthetic */ vow0 h = new vow0(6);
    public static final /* synthetic */ vow0 i = new vow0(7);
    public static final /* synthetic */ vow0 j = new vow0(8);
    public static final /* synthetic */ vow0 k = new vow0(9);
    public static final /* synthetic */ vow0 l = new vow0(10);
    public static final /* synthetic */ vow0 m = new vow0(11);
    public static final /* synthetic */ vow0 n = new vow0(12);
    public static final /* synthetic */ vow0 o = new vow0(13);
    public static final /* synthetic */ vow0 p = new vow0(14);
    public static final /* synthetic */ vow0 q = new vow0(15);
    public static final /* synthetic */ vow0 r = new vow0(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37785a;

    public vow0(byte[] bArr, byte[] bArr2) {
        this.f37785a = (byte) 29;
    }

    public static Cipher b() {
        try {
            Cipher cipher = (Cipher) iyw0.f15608a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e2);
        }
    }

    @Override // a.g5x0
    public vkr0 a(atm0 atm0Var) throws GeneralSecurityException {
        switch (this.f37785a) {
            case 20:
                krw0 krw0Var = (krw0) atm0Var;
                pvw0.c(krw0Var.f18788a);
                dbx0 dbx0VarW = ebx0.w();
                byte[] bArrB = ((icw0) krw0Var.b.b).b();
                vjw0 vjw0VarH = sjw0.h(bArrB, 0, bArrB.length);
                dbx0VarW.d();
                ebx0.v((ebx0) dbx0VarW.b, vjw0VarH);
                return vkr0.C("type.googleapis.com/google.crypto.tink.AesGcmKey", ((ebx0) dbx0VarW.c()).a(), hbb.j, pvw0.b(krw0Var.f18788a.d), krw0Var.d);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                g0x0 g0x0Var = (g0x0) atm0Var;
                oex0 oex0VarY = qex0.y();
                oex0VarY.d();
                ((qex0) oex0VarY.b).zzf = 0;
                tex0 tex0VarD = l0x0.d(g0x0Var.f10482a);
                oex0VarY.d();
                qex0.x((qex0) oex0VarY.b, tex0VarD);
                byte[] bArrB2 = ((icw0) g0x0Var.b.b).b();
                vjw0 vjw0VarH2 = sjw0.h(bArrB2, 0, bArrB2.length);
                oex0VarY.d();
                qex0.w((qex0) oex0VarY.b, vjw0VarH2);
                return vkr0.C("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((qex0) oex0VarY.c()).a(), hbb.k, l0x0.b(g0x0Var.f10482a.f27924a.d), g0x0Var.t());
            default:
                yzw0 yzw0Var = (yzw0) atm0Var;
                ocx0 ocx0VarY = pcx0.y();
                ocx0VarY.d();
                ((pcx0) ocx0VarY.b).zzf = 0;
                tcx0 tcx0VarD = x1x0.d(yzw0Var.f43537a);
                ocx0VarY.d();
                pcx0.x((pcx0) ocx0VarY.b, tcx0VarD);
                xzw0 xzw0Var = yzw0Var.f43537a.f8737a;
                if (xzw0Var.f41775a.equals(vzw0.e)) {
                    byte[] bArrB3 = ((icw0) yzw0Var.c.b).b();
                    vjw0 vjw0VarH3 = sjw0.h(bArrB3, 0, bArrB3.length);
                    ocx0VarY.d();
                    pcx0.w((pcx0) ocx0VarY.b, vjw0VarH3);
                } else {
                    byte[] bArrG = ibm0.G((BigInteger) yzw0Var.b.b, x1x0.a(xzw0Var.f41775a));
                    vjw0 vjw0VarH4 = sjw0.h(bArrG, 0, bArrG.length);
                    ocx0VarY.d();
                    pcx0.w((pcx0) ocx0VarY.b, vjw0VarH4);
                }
                return vkr0.C("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((pcx0) ocx0VarY.c()).a(), hbb.k, x1x0.b(xzw0Var.d), yzw0Var.t());
        }
    }

    @Override // a.d5x0
    public atm0 c(vkr0 vkr0Var) throws GeneralSecurityException {
        arw0 arw0Var;
        if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            jf4.o("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
            return null;
        }
        try {
            ugx0 ugx0VarU = ugx0.u((sjw0) vkr0Var.c, dkw0.b);
            if (ugx0VarU.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (ugx0VarU.z().e() != 32) {
                throw new GeneralSecurityException("Only 32 byte key size is accepted");
            }
            lpw0 lpw0Var = (lpw0) vkr0Var.e;
            if (lpw0Var == lpw0.c) {
                arw0Var = arw0.f;
            } else {
                if (lpw0Var != lpw0.e) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(lpw0Var)));
                }
                arw0Var = arw0.g;
            }
            return qtw0.v(xtw0.b(arw0Var, ugx0VarU.y().t()), new rkt0(icw0.a(ugx0VarU.z().r()), (byte) 11), (Integer) vkr0Var.f);
        } catch (qkw0 unused) {
            hny.o("Parsing XAesGcmKey failed");
            return null;
        }
    }

    @Override // a.w6x0
    public fpw0 e(x4w0 x4w0Var) throws GeneralSecurityException {
        String str = (String) x4w0Var.b;
        if (!str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            jf4.o(kng0.k("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", str));
            return null;
        }
        try {
            return wsw0.a(ogx0.u((sjw0) x4w0Var.f40287a, dkw0.b), (lpw0) x4w0Var.c);
        } catch (qkw0 e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    @Override // a.a7x0
    public x4w0 h(fpw0 fpw0Var) throws GeneralSecurityException {
        switch (this.f37785a) {
            case 18:
                brw0 brw0Var = (brw0) fpw0Var;
                lpw0 lpw0VarB = ruw0.b(brw0Var.e);
                iax0 iax0VarT = jax0.t();
                oax0 oax0VarW = pax0.w();
                rax0 rax0VarV = sax0.v();
                int i2 = brw0Var.c;
                rax0VarV.d();
                ((sax0) rax0VarV.b).zze = i2;
                sax0 sax0Var = (sax0) rax0VarV.c();
                oax0VarW.d();
                pax0.v((pax0) oax0VarW.b, sax0Var);
                int i3 = brw0Var.f3100a;
                oax0VarW.d();
                ((pax0) oax0VarW.b).zzg = i3;
                pax0 pax0Var = (pax0) oax0VarW.c();
                iax0VarT.d();
                jax0.v((jax0) iax0VarT.b, pax0Var);
                odx0 odx0VarY = qdx0.y();
                wdx0 wdx0VarD = ruw0.d(brw0Var);
                odx0VarY.d();
                qdx0.w((qdx0) odx0VarY.b, wdx0VarD);
                int i4 = brw0Var.b;
                odx0VarY.d();
                ((qdx0) odx0VarY.b).zzg = i4;
                qdx0 qdx0Var = (qdx0) odx0VarY.c();
                iax0VarT.d();
                jax0.w((jax0) iax0VarT.b, qdx0Var);
                return x4w0.d("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", lpw0VarB, ((jax0) iax0VarT.c()).a());
            case 21:
                return x4w0.d("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", rww0.b(((vrw0) fpw0Var).f37922a), bcx0.u().a());
            default:
                zyw0 zyw0Var = (zyw0) fpw0Var;
                drq drqVar = zyw0Var.b;
                Map map = hzw0.e;
                if (!map.containsKey(drqVar)) {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(drqVar)));
                }
                lpw0 lpw0Var = (lpw0) map.get(drqVar);
                ubx0 ubx0VarX = vbx0.x();
                int i5 = zyw0Var.f45226a;
                ubx0VarX.d();
                ((vbx0) ubx0VarX.b).zze = i5;
                return x4w0.d("type.googleapis.com/google.crypto.tink.AesSivKey", lpw0Var, ((vbx0) ubx0VarX.c()).a());
        }
    }

    @Override // a.ngn
    public j6 i(Context context, String str, mgn mgnVar) {
        j6 j6Var = new j6();
        int iG = mgnVar.g(context, str);
        j6Var.f15959a = iG;
        if (iG != 0) {
            j6Var.c = -1;
            return j6Var;
        }
        int iD = mgnVar.d(context, str, true);
        j6Var.b = iD;
        if (iD != 0) {
            j6Var.c = 1;
        }
        return j6Var;
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f37785a) {
            case 0:
                List list = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.sgtm.upload.min_delay_after_background", 48, 600000L).get();
            case 1:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.realtime_upload_interval", 33, 10000L).get();
            case 2:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.refresh_blacklisted_config_interval", 34, 604800000L).get();
            case 3:
                List list4 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.google_signal_max_queue_time", 15, 605000L).get();
            case 4:
                List list5 = btw0.f3204a;
                kiw0.b.get();
                return (Boolean) liw0.f20126a.r("measurement.test.boolean_flag", 0, false).get();
            case 5:
                List list6 = btw0.f3204a;
                kiw0.b.get();
                return Integer.valueOf((int) ((Long) liw0.f20126a.u("measurement.test.int_flag", 3, -2L).get()).longValue());
            case 6:
                List list7 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_event_parameter_value_length", 19, 500L).get()).longValue());
            case 7:
                List list8 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.dma_consent.max_daily_dcu_realtime_events", 18, 1L).get()).longValue());
            case 8:
                List list9 = btw0.f3204a;
                zgw0.b.get();
                return (String) ahw0.f896a.v(32, "measurement.rb.attribution.app_allowlist", "").get();
            case 9:
                List list10 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.rb.attribution.max_queue_time", 57, 864000000L).get();
            case 10:
                List list11 = btw0.f3204a;
                zgw0.b.get();
                return (Boolean) ahw0.f896a.r("measurement.config.notify_trigger_uris_on_backgrounded", 31, true).get();
            case 11:
                List list12 = btw0.f3204a;
                return (Boolean) whw0.b.get();
            case 12:
                List list13 = btw0.f3204a;
                return (Boolean) kjw0.f18408a.get();
            case 13:
                List list14 = btw0.f3204a;
                return (Boolean) xiw0.f40968a.get();
            case 14:
                List list15 = btw0.f3204a;
                miw0.b.get();
                return (Boolean) oiw0.f25331a.r("measurement.rb.attribution.uuid_generation", 8, true).get();
            case 15:
                List list16 = btw0.f3204a;
                miw0.b.get();
                return (Boolean) oiw0.f25331a.r("measurement.rb.attribution.service.trigger_uris_high_priority", 2, true).get();
            default:
                List list17 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.ad_id_cache_time", 0, 10000L).get();
        }
    }

    public /* synthetic */ vow0(byte b2) {
        this.f37785a = b2;
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public Object mo8a(atm0 atm0Var) {
        switch (this.f37785a) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return cix0.a((yzw0) atm0Var);
            default:
                gfk0 gfk0Var = gfk0.h;
                vkr0 vkr0Var = ((o5x0) atm0Var).f24707a;
                o5x0.u(vkr0Var, gfk0Var);
                return new b3x0((dnw0) a5x0.d.a(dnw0.class, (String) vkr0Var.b).a((sjw0) vkr0Var.c), bcm0.F((lpw0) vkr0Var.e, (Integer) vkr0Var.f).b());
        }
    }
}
