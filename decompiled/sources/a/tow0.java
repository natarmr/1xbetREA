package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tow0 implements xmw0, anw0, n7x0, c7x0, a7x0, g5x0, d5x0, ngn, w6x0 {
    public static final /* synthetic */ tow0 b = new tow0(0);
    public static final /* synthetic */ tow0 c = new tow0(1);
    public static final /* synthetic */ tow0 d = new tow0(3);
    public static final /* synthetic */ tow0 e = new tow0(5);
    public static final /* synthetic */ tow0 f = new tow0(7);
    public static final /* synthetic */ tow0 g = new tow0(8);
    public static final /* synthetic */ tow0 h = new tow0(9);
    public static final /* synthetic */ tow0 i = new tow0(10);
    public static final /* synthetic */ tow0 j = new tow0(11);
    public static final /* synthetic */ tow0 k = new tow0(12);
    public static final /* synthetic */ tow0 l = new tow0(14);
    public static final /* synthetic */ tow0 m = new tow0(16);
    public static final /* synthetic */ tow0 n = new tow0(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34305a;

    public /* synthetic */ tow0(byte b2) {
        this.f34305a = b2;
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public vkr0 mo8a(atm0 atm0Var) {
        switch (this.f34305a) {
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                crw0 crw0Var = (crw0) atm0Var;
                uax0 uax0VarX = vax0.x();
                bbx0 bbx0VarC = dvw0.c(crw0Var.f4865a);
                uax0VarX.d();
                vax0.w((vax0) uax0VarX.b, bbx0VarC);
                byte[] bArrB = ((icw0) crw0Var.b.b).b();
                vjw0 vjw0VarH = sjw0.h(bArrB, 0, bArrB.length);
                uax0VarX.d();
                vax0.v((vax0) uax0VarX.b, vjw0VarH);
                return vkr0.C("type.googleapis.com/google.crypto.tink.AesEaxKey", ((vax0) uax0VarX.c()).a(), hbb.j, dvw0.b(crw0Var.f4865a.d), crw0Var.d);
            default:
                cuw0 cuw0Var = (cuw0) atm0Var;
                hhx0 hhx0VarW = jhx0.w();
                byte[] bArrB2 = ((icw0) cuw0Var.b.b).b();
                vjw0 vjw0VarH2 = sjw0.h(bArrB2, 0, bArrB2.length);
                hhx0VarW.d();
                jhx0.v((jhx0) hhx0VarW.b, vjw0VarH2);
                return vkr0.C("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((jhx0) hhx0VarW.c()).a(), hbb.j, ayw0.b(cuw0Var.f5006a.f22431a), cuw0Var.d);
        }
    }

    @Override // a.d5x0
    public atm0 c(vkr0 vkr0Var) throws GeneralSecurityException {
        switch (this.f34305a) {
            case 20:
                if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    jf4.o("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    ebx0 ebx0VarU = ebx0.u((sjw0) vkr0Var.c, dkw0.b);
                    if (ebx0VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    h0q0 h0q0VarB = mrw0.b();
                    h0q0VarB.I(ebx0VarU.x().e());
                    h0q0VarB.G();
                    h0q0VarB.K();
                    h0q0VarB.d = pvw0.a((lpw0) vkr0Var.e);
                    mrw0 mrw0VarD = h0q0VarB.D();
                    cmt0 cmt0Var = new cmt0();
                    cmt0Var.b = null;
                    cmt0Var.c = null;
                    cmt0Var.f4625a = mrw0VarD;
                    cmt0Var.b = new rkt0(icw0.a(ebx0VarU.x().r()), (byte) 11);
                    cmt0Var.c = (Integer) vkr0Var.f;
                    return cmt0Var.d();
                } catch (qkw0 unused) {
                    hny.o("Parsing AesGcmKey failed");
                    return null;
                }
            default:
                if (!((String) vkr0Var.b).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    jf4.o("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                    return null;
                }
                try {
                    kbx0 kbx0VarU = kbx0.u((sjw0) vkr0Var.c, dkw0.b);
                    if (kbx0VarU.t() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    okt0 okt0VarB = srw0.b();
                    okt0VarB.p(kbx0VarU.x().e());
                    okt0VarB.b = fww0.a((lpw0) vkr0Var.e);
                    srw0 srw0VarM = okt0VarB.m();
                    mpt0 mpt0Var = new mpt0((byte) 4);
                    mpt0Var.c = null;
                    mpt0Var.d = null;
                    mpt0Var.b = srw0VarM;
                    mpt0Var.c = new rkt0(icw0.a(kbx0VarU.x().r()), (byte) 11);
                    mpt0Var.d = (Integer) vkr0Var.f;
                    return mpt0Var.b();
                } catch (qkw0 unused2) {
                    hny.o("Parsing AesGcmSivKey failed");
                    return null;
                }
        }
    }

    @Override // a.n7x0
    public Object d(dow0 dow0Var) throws GeneralSecurityException {
        fcw0 fcw0Var;
        Object cyw0Var;
        switch (this.f34305a) {
            case 4:
                atm0 atm0Var = dow0Var.f6432a;
                if (atm0Var instanceof uqw0) {
                    return hix0.a((uqw0) atm0Var);
                }
                if (atm0Var instanceof krw0) {
                    return fcw0.a((krw0) atm0Var);
                }
                if (atm0Var instanceof nrw0) {
                    return iyw0.a((nrw0) atm0Var);
                }
                if (atm0Var instanceof crw0) {
                    return vhx0.a((crw0) atm0Var);
                }
                if (atm0Var instanceof trw0) {
                    trw0 trw0Var = (trw0) atm0Var;
                    icw0 icw0Var = trw0Var.c;
                    rkt0 rkt0Var = trw0Var.b;
                    if (!lww0.d()) {
                        fcw0Var = new fcw0(((icw0) rkt0Var.b).b(), icw0Var.b(), (byte) 4);
                        return fcw0Var;
                    }
                    cyw0Var = new lww0(((icw0) rkt0Var.b).b(), icw0Var.b(), lww0.a().getProvider());
                    return cyw0Var;
                }
                if (!(atm0Var instanceof cuw0)) {
                    if (atm0Var instanceof qtw0) {
                        return zxw0.a((qtw0) atm0Var);
                    }
                    throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(atm0Var.getClass())));
                }
                cuw0 cuw0Var = (cuw0) atm0Var;
                icw0 icw0Var2 = cuw0Var.c;
                rkt0 rkt0Var2 = cuw0Var.b;
                if (!lww0.d()) {
                    fcw0Var = new fcw0(((icw0) rkt0Var2.b).b(), icw0Var2.b(), (byte) 0);
                    return fcw0Var;
                }
                cyw0Var = new cyw0(((icw0) rkt0Var2.b).b(), icw0Var2.b(), lww0.a().getProvider());
                return cyw0Var;
            default:
                atm0 atm0Var2 = dow0Var.f6432a;
                if (atm0Var2 instanceof yzw0) {
                    return cix0.a((yzw0) atm0Var2);
                }
                if (atm0Var2 instanceof g0x0) {
                    return p2x0.a((g0x0) atm0Var2);
                }
                throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(atm0Var2.getClass())));
        }
    }

    @Override // a.w6x0
    public fpw0 e(x4w0 x4w0Var) throws GeneralSecurityException {
        switch (this.f34305a) {
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str = (String) x4w0Var.b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    return l0x0.c((lpw0) x4w0Var.c, gex0.t((sjw0) x4w0Var.f40287a, dkw0.b).w());
                } catch (qkw0 e2) {
                    throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e2);
                }
            default:
                String str2 = (String) x4w0Var.b;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    jf4.o(kng0.k("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    return x1x0.c((lpw0) x4w0Var.c, hcx0.u((sjw0) x4w0Var.f40287a, dkw0.b).w());
                } catch (qkw0 e3) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e3);
                }
        }
    }

    @Override // a.anw0
    public Object f(fck0 fck0Var, Class cls) throws GeneralSecurityException {
        icw0 icw0VarV;
        List list;
        icw0 icw0VarV2;
        List list2;
        icw0 icw0VarV3;
        List arrayList;
        j7x0 j7x0Var = (j7x0) n6x0.b.f23015a.get();
        HashMap map = j7x0Var.b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls)));
        }
        rqw0 rqw0Var = (rqw0) map.get(cls);
        afm0 afm0Var = new afm0((byte) 27);
        afm0Var.b = j7x0Var;
        afm0Var.c = rqw0Var;
        int i2 = 0;
        switch (rqw0Var.f30953a) {
            case 0:
                return v2n0.x(fck0Var, afm0Var);
            case 1:
                if (!x7x0.a(fck0Var)) {
                    hny.o("keyset doesn't contain a valid primary key");
                    return null;
                }
                HashMap map2 = new HashMap();
                while (i2 < ((List) fck0Var.b).size()) {
                    dow0 dow0VarQ = fck0Var.q(i2);
                    if (dow0VarQ.c == pfw.g) {
                        atm0 atm0Var = dow0VarQ.f6432a;
                        if (atm0Var instanceof uyw0) {
                            icw0VarV = ((uyw0) atm0Var).c;
                        } else {
                            if (!(atm0Var instanceof o5x0)) {
                                throw new GeneralSecurityException(ua80.i("Cannot get output prefix for key of class ", atm0Var.getClass().getName(), " with parameters ", String.valueOf(atm0Var.s())));
                            }
                            icw0VarV = ((o5x0) atm0Var).v();
                        }
                        epw0 epw0Var = new epw0((byte) 24);
                        byte[] bArr = icw0VarV.f14556a;
                        if (bArr.length != 0 && bArr.length != 5) {
                            hny.o("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map2.containsKey(icw0VarV)) {
                            list = (List) map2.get(icw0VarV);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            map2.put(icw0VarV, arrayList2);
                            list = arrayList2;
                        }
                        list.add(epw0Var);
                    }
                    i2++;
                }
                fck0Var.x();
                fck0Var.D();
                return new qzw0();
            case 2:
                return n8n0.q(fck0Var, afm0Var);
            case 3:
                return afn0.D(fck0Var, afm0Var);
            case 4:
                if (!x7x0.a(fck0Var)) {
                    hny.o("keyset doesn't contain a valid primary key");
                    return null;
                }
                dow0 dow0VarD = fck0Var.D();
                HashMap map3 = new HashMap();
                while (i2 < ((List) fck0Var.b).size()) {
                    dow0 dow0VarQ2 = fck0Var.q(i2);
                    if (dow0VarQ2.c == pfw.g) {
                        f9x0 f9x0Var = (f9x0) afm0Var.d(dow0VarQ2);
                        atm0 atm0Var2 = dow0VarQ2.f6432a;
                        if (atm0Var2 instanceof t8x0) {
                            icw0VarV2 = ((t8x0) atm0Var2).u();
                        } else {
                            if (!(atm0Var2 instanceof o5x0)) {
                                throw new GeneralSecurityException(ua80.i("Cannot get output prefix for key of class ", atm0Var2.getClass().getName(), " with parameters ", String.valueOf(atm0Var2.s())));
                            }
                            icw0VarV2 = ((o5x0) atm0Var2).v();
                        }
                        byte[] bArr2 = icw0VarV2.f14556a;
                        if (bArr2.length != 0 && bArr2.length != 5) {
                            hny.o("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map3.containsKey(icw0VarV2)) {
                            list2 = (List) map3.get(icw0VarV2);
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            map3.put(icw0VarV2, arrayList3);
                            list2 = arrayList3;
                        }
                        list2.add(f9x0Var);
                    }
                    i2++;
                }
                return new f9x0();
            default:
                if (!x7x0.a(fck0Var)) {
                    hny.o("keyset doesn't contain a valid primary key");
                    return null;
                }
                HashMap map4 = new HashMap();
                while (i2 < ((List) fck0Var.b).size()) {
                    dow0 dow0VarQ3 = fck0Var.q(i2);
                    if (dow0VarQ3.c == pfw.g) {
                        xow0 xow0Var = (xow0) afm0Var.d(dow0VarQ3);
                        atm0 atm0Var3 = dow0VarQ3.f6432a;
                        if (atm0Var3 instanceof t8x0) {
                            icw0VarV3 = ((t8x0) atm0Var3).u();
                        } else {
                            if (!(atm0Var3 instanceof o5x0)) {
                                throw new GeneralSecurityException(ua80.i("Cannot get output prefix for key of class ", atm0Var3.getClass().getName(), " with parameters ", String.valueOf(atm0Var3.s())));
                            }
                            icw0VarV3 = ((o5x0) atm0Var3).v();
                        }
                        m8x0 m8x0Var = new m8x0(xow0Var, dow0VarQ3.d);
                        byte[] bArr3 = icw0VarV3.f14556a;
                        if (bArr3.length != 0 && bArr3.length != 5) {
                            hny.o("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map4.containsKey(icw0VarV3)) {
                            arrayList = (List) map4.get(icw0VarV3);
                        } else {
                            arrayList = new ArrayList();
                            map4.put(icw0VarV3, arrayList);
                        }
                        arrayList.add(m8x0Var);
                    }
                    i2++;
                }
                fck0Var.x();
                new m8x0((xow0) afm0Var.d(fck0Var.D()), fck0Var.D().d);
                new b7x0(map4);
                return new m9x0();
        }
    }

    @Override // a.a7x0
    public x4w0 h(fpw0 fpw0Var) throws GeneralSecurityException {
        lpw0 lpw0Var;
        switch (this.f34305a) {
            case 15:
                msw0 msw0Var = (msw0) fpw0Var;
                lpw0 lpw0VarA = psw0.a(msw0Var.b);
                agx0 agx0VarT = bgx0.t();
                String str = msw0Var.f22344a;
                agx0VarT.d();
                bgx0.v((bgx0) agx0VarT.b, str);
                return x4w0.d("type.googleapis.com/google.crypto.tink.KmsAeadKey", lpw0VarA, ((bgx0) agx0VarT.c()).a());
            default:
                xtw0 xtw0Var = (xtw0) fpw0Var;
                arw0 arw0Var = xtw0Var.f41484a;
                if (arw0Var == arw0.f) {
                    lpw0Var = lpw0.c;
                } else {
                    if (arw0Var != arw0.g) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(arw0Var)));
                    }
                    lpw0Var = lpw0.e;
                }
                ygx0 ygx0VarW = ahx0.w();
                dhx0 dhx0VarV = fhx0.v();
                int i2 = xtw0Var.b;
                dhx0VarV.d();
                ((fhx0) dhx0VarV.b).zze = i2;
                fhx0 fhx0Var = (fhx0) dhx0VarV.c();
                ygx0VarW.d();
                ahx0.v((ahx0) ygx0VarW.b, fhx0Var);
                return x4w0.d("type.googleapis.com/google.crypto.tink.XAesGcmKey", lpw0Var, ((ahx0) ygx0VarW.c()).a());
        }
    }

    @Override // a.ngn
    public j6 i(Context context, String str, mgn mgnVar) {
        int iD;
        j6 j6Var = new j6();
        int iG = mgnVar.g(context, str);
        j6Var.f15959a = iG;
        int i2 = 1;
        int i3 = 0;
        if (iG != 0) {
            iD = mgnVar.d(context, str, false);
            j6Var.b = iD;
        } else {
            iD = mgnVar.d(context, str, true);
            j6Var.b = iD;
        }
        int i4 = j6Var.f15959a;
        if (i4 == 0) {
            if (iD == 0) {
                i2 = 0;
            }
            j6Var.c = i2;
            return j6Var;
        }
        i3 = i4;
        if (i3 >= iD) {
            i2 = -1;
        }
        j6Var.c = i2;
        return j6Var;
    }

    @Override // a.xmw0
    /* JADX INFO: renamed from: zza */
    public Object mo0zza() {
        switch (this.f34305a) {
            case 0:
                List list = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.sgtm.upload.min_delay_after_broadcast", 49, 1000L).get();
            case 1:
                List list2 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.interval", 65, 3600000L).get();
            case 2:
            case 4:
            case 6:
            case 13:
            case 15:
            default:
                return new Boolean(((Boolean) iiw0.f14849a.get()).booleanValue());
            case 3:
                List list3 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.upload.max_queue_time", 73, 518400000L).get();
            case 5:
                List list4 = btw0.f3204a;
                kiw0.b.get();
                return (Long) liw0.f20126a.u("measurement.test.cached_long_flag", 1, -1L).get();
            case 7:
                List list5 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.rb.attribution.client.min_ad_services_version", 26, 7L).get()).longValue());
            case 8:
                List list6 = btw0.f3204a;
                zgw0.b.get();
                return (Long) ahw0.f896a.u("measurement.session.engagement_interval", 12, 3600000L).get();
            case 9:
                List list7 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_batch_size", 75, 65536L).get()).longValue());
            case 10:
                List list8 = btw0.f3204a;
                zgw0.b.get();
                return (Boolean) ahw0.f896a.r("measurement.config.bundle_for_all_apps_on_backgrounded", 2, true).get();
            case 11:
                List list9 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_bundle_size", 66, 65536L).get()).longValue());
            case 12:
                List list10 = btw0.f3204a;
                return (Boolean) ijw0.f14899a.get();
            case 14:
                List list11 = btw0.f3204a;
                miw0.b.get();
                return (Boolean) oiw0.f25331a.r("measurement.rb.attribution.client2", 1, true).get();
            case 16:
                List list12 = btw0.f3204a;
                zgw0.b.get();
                return Integer.valueOf((int) ((Long) ahw0.f896a.u("measurement.upload.max_events_per_day", 71, 100000L).get()).longValue());
        }
    }

    @Override // a.c7x0
    /* JADX INFO: renamed from: a */
    public Object mo8a(atm0 atm0Var) throws GeneralSecurityException {
        switch (this.f34305a) {
            case 6:
                return hix0.a((uqw0) atm0Var);
            case 13:
                osw0 osw0Var = (osw0) atm0Var;
                msw0 msw0Var = osw0Var.f25803a;
                uow0.a(msw0Var.f22344a);
                return new fcw0(i4x0.a(msw0Var.f22344a), osw0Var.b.b());
            case 18:
                cuw0 cuw0Var = (cuw0) atm0Var;
                icw0 icw0Var = cuw0Var.c;
                rkt0 rkt0Var = cuw0Var.b;
                if (lww0.d()) {
                    return new cyw0(((icw0) rkt0Var.b).b(), icw0Var.b(), lww0.a().getProvider());
                }
                return new fcw0(((icw0) rkt0Var.b).b(), icw0Var.b(), (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return aix0.a((f0x0) atm0Var);
            default:
                return p2x0.a((g0x0) atm0Var);
        }
    }
}
