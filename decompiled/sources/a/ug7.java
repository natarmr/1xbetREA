package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ug7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ug7 f35610a;
    private static final ugi0 descriptor;

    static {
        ug7 ug7Var = new ug7();
        f35610a = ug7Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.bets_on_favorite.BetOnFavoriteEventResponse", ug7Var, 21);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("num", true);
        zna0Var.j("mainGameId", true);
        zna0Var.j("constId", true);
        zna0Var.j("fullName", true);
        zna0Var.j("startTs", true);
        zna0Var.j("countryId", true);
        zna0Var.j("gameTypeName", true);
        zna0Var.j("periodName", true);
        zna0Var.j("mainConstId", true);
        zna0Var.j("kind", true);
        zna0Var.j("subscriptionAvailable", true);
        zna0Var.j("liga", true);
        zna0Var.j("sport", true);
        zna0Var.j("subSport", true);
        zna0Var.j("opponent1", true);
        zna0Var.j("opponent2", true);
        zna0Var.j("event", true);
        zna0Var.j("homeAwayFlag", true);
        zna0Var.j("scores", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0(ysm0Var);
        jiy jiyVarJ9 = mrv.j0(s710Var);
        jiy jiyVarJ10 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ11 = mrv.j0(sm8Var);
        jiy jiyVarJ12 = mrv.j0(tlz.f34170a);
        jiy jiyVarJ13 = mrv.j0(wjl0.f39267a);
        jiy jiyVarJ14 = mrv.j0(h3n0.f12394a);
        j280 j280Var = j280.f15769a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, mrv.j0(j280Var), mrv.j0(j280Var), mrv.j0(z7p.f43928a), mrv.j0(sm8Var), mrv.j0(w5h0.f38585a), mrv.j0(wg7.f39100a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        Integer num = null;
        Long l2 = null;
        dmz dmzVar = null;
        String str2 = null;
        int i2 = 0;
        qkl0 qkl0Var = null;
        t3n0 t3n0Var = null;
        c380 c380Var = null;
        c380 c380Var2 = null;
        e8p e8pVar = null;
        Boolean bool2 = null;
        e6h0 e6h0Var = null;
        yg7 yg7Var = null;
        boolean z = true;
        Long l3 = null;
        Integer num2 = null;
        Long l4 = null;
        Long l5 = null;
        String str3 = null;
        Long l6 = null;
        Integer num3 = null;
        String str4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l3;
                    z = false;
                    num = num;
                    str2 = str2;
                    l3 = l;
                    bool = bool;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i2 |= 1;
                    num = num;
                    str2 = str2;
                    l2 = l2;
                    l3 = l;
                    bool = bool;
                    break;
                case 1:
                    str = str2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i2 |= 2;
                    l4 = l4;
                    str2 = str;
                    l2 = l2;
                    bool = bool;
                    break;
                case 2:
                    str = str2;
                    l4 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l4);
                    i2 |= 4;
                    str2 = str;
                    l2 = l2;
                    bool = bool;
                    break;
                case 3:
                    str = str2;
                    l5 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l5);
                    i2 |= 8;
                    str2 = str;
                    l2 = l2;
                    bool = bool;
                    break;
                case 4:
                    str = str2;
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i2 |= 16;
                    str2 = str;
                    l2 = l2;
                    bool = bool;
                    break;
                case 5:
                    str = str2;
                    l6 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l6);
                    i2 |= 32;
                    str2 = str;
                    l2 = l2;
                    bool = bool;
                    break;
                case 6:
                    str = str2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num3);
                    i2 |= 64;
                    str2 = str;
                    l2 = l2;
                    bool = bool;
                    break;
                case 7:
                    str = str2;
                    str4 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str4);
                    i2 |= 128;
                    str2 = str;
                    l2 = l2;
                    bool = bool;
                    break;
                case 8:
                    bool = bool;
                    l2 = l2;
                    str2 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str2);
                    i2 |= 256;
                    l2 = l2;
                    bool = bool;
                    break;
                case 9:
                    bool = bool;
                    l2 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l2);
                    i2 |= 512;
                    str2 = str2;
                    bool = bool;
                    break;
                case 10:
                    l2 = l2;
                    str2 = str2;
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i2 |= 1024;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 11:
                    l2 = l2;
                    str2 = str2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i2 |= 2048;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 12:
                    l2 = l2;
                    str2 = str2;
                    dmzVar = (dmz) bldVarA.e(ugi0Var, 12, tlz.f34170a, dmzVar);
                    i2 |= 4096;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 13:
                    l2 = l2;
                    str2 = str2;
                    qkl0Var = (qkl0) bldVarA.e(ugi0Var, 13, wjl0.f39267a, qkl0Var);
                    i2 |= 8192;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 14:
                    l2 = l2;
                    str2 = str2;
                    t3n0Var = (t3n0) bldVarA.e(ugi0Var, 14, h3n0.f12394a, t3n0Var);
                    i2 |= 16384;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 15:
                    c380Var = (c380) bldVarA.e(ugi0Var, 15, j280.f15769a, c380Var);
                    i = 32768;
                    i2 |= i;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 16:
                    c380Var2 = (c380) bldVarA.e(ugi0Var, 16, j280.f15769a, c380Var2);
                    i = 65536;
                    i2 |= i;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 17:
                    e8pVar = (e8p) bldVarA.e(ugi0Var, 17, z7p.f43928a, e8pVar);
                    i = 131072;
                    i2 |= i;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 18:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool2);
                    i = 262144;
                    i2 |= i;
                    str2 = str2;
                    l2 = l2;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    e6h0Var = (e6h0) bldVarA.e(ugi0Var, 19, w5h0.f38585a, e6h0Var);
                    i = 524288;
                    i2 |= i;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 20:
                    yg7Var = (yg7) bldVarA.e(ugi0Var, 20, wg7.f39100a, yg7Var);
                    i = 1048576;
                    i2 |= i;
                    str2 = str2;
                    l2 = l2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool3 = bool;
        String str5 = str2;
        Long l7 = l3;
        Integer num4 = num2;
        Long l8 = l4;
        bldVarA.c(ugi0Var);
        yg7 yg7Var2 = yg7Var;
        e6h0 e6h0Var2 = e6h0Var;
        return new zg7(i2, l7, num4, l8, l5, str3, l6, num3, str4, str5, l2, num, bool3, dmzVar, qkl0Var, t3n0Var, c380Var, c380Var2, e8pVar, bool2, e6h0Var2, yg7Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zg7 zg7Var = (zg7) obj;
        zg7Var.getClass();
        yg7 yg7Var = zg7Var.u;
        e6h0 e6h0Var = zg7Var.t;
        Boolean bool = zg7Var.s;
        e8p e8pVar = zg7Var.r;
        c380 c380Var = zg7Var.q;
        c380 c380Var2 = zg7Var.p;
        t3n0 t3n0Var = zg7Var.o;
        qkl0 qkl0Var = zg7Var.n;
        dmz dmzVar = zg7Var.m;
        Boolean bool2 = zg7Var.l;
        Integer num = zg7Var.k;
        Long l = zg7Var.j;
        String str = zg7Var.i;
        String str2 = zg7Var.h;
        Integer num2 = zg7Var.g;
        Long l2 = zg7Var.f;
        String str3 = zg7Var.e;
        Long l3 = zg7Var.d;
        Long l4 = zg7Var.c;
        Integer num3 = zg7Var.b;
        Long l5 = zg7Var.f44330a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || dmzVar != 0) {
            cldVarA.p(ugi0Var, 12, tlz.f34170a, dmzVar);
        }
        if (cldVarA.u(ugi0Var) || qkl0Var != 0) {
            cldVarA.p(ugi0Var, 13, wjl0.f39267a, qkl0Var);
        }
        if (cldVarA.u(ugi0Var) || t3n0Var != null) {
            cldVarA.p(ugi0Var, 14, h3n0.f12394a, t3n0Var);
        }
        if (cldVarA.u(ugi0Var) || c380Var2 != null) {
            cldVarA.p(ugi0Var, 15, j280.f15769a, c380Var2);
        }
        if (cldVarA.u(ugi0Var) || c380Var != null) {
            cldVarA.p(ugi0Var, 16, j280.f15769a, c380Var);
        }
        if (cldVarA.u(ugi0Var) || e8pVar != null) {
            cldVarA.p(ugi0Var, 17, z7p.f43928a, e8pVar);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || e6h0Var != null) {
            cldVarA.p(ugi0Var, 19, w5h0.f38585a, e6h0Var);
        }
        if (cldVarA.u(ugi0Var) || yg7Var != null) {
            cldVarA.p(ugi0Var, 20, wg7.f39100a, yg7Var);
        }
        cldVarA.c(ugi0Var);
    }
}
