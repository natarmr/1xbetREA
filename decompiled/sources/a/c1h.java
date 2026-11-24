package a;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c1h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1h f3570a;
    private static final ugi0 descriptor;

    static {
        c1h c1hVar = new c1h();
        f3570a = c1hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.dota.CyberHeroesStatisticResponse", c1hVar, 17);
        zna0Var.j("HI", true);
        zna0Var.j("HN", true);
        zna0Var.j("LVL", true);
        zna0Var.j("PN", true);
        zna0Var.j("PX", true);
        zna0Var.j("PY", true);
        zna0Var.j("RT", true);
        zna0Var.j("UST", true);
        zna0Var.j("IT", true);
        zna0Var.j("HS", true);
        zna0Var.j("AB", true);
        zna0Var.j("AT", true);
        zna0Var.j("SC", true);
        zna0Var.j("SH", true);
        zna0Var.j("HA", true);
        zna0Var.j("BB", true);
        zna0Var.j(SDPKeywords.IN, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = e1h.r;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ6 = mrv.j0(s710Var);
        jiy jiyVarJ7 = mrv.j0(okxVar);
        jiy jiyVarJ8 = mrv.j0((jiy) a8zVarArr[8].getValue());
        jiy jiyVarJ9 = mrv.j0(m1h.f21007a);
        jiy jiyVarJ10 = mrv.j0((jiy) a8zVarArr[10].getValue());
        jiy jiyVarJ11 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        Integer num2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = e1h.r;
        Long l = null;
        List list = null;
        o1h o1hVar = null;
        List list2 = null;
        Boolean bool = null;
        Integer num3 = null;
        int i2 = 0;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Long l2 = null;
        boolean z = true;
        Integer num8 = null;
        String str = null;
        Integer num9 = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num8;
                    z = false;
                    list = list;
                    num7 = num7;
                    num8 = num;
                    l = l;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num8);
                    i2 |= 1;
                    list = list;
                    num6 = num6;
                    num7 = num7;
                    num8 = num;
                    l = l;
                    break;
                case 1:
                    num2 = num6;
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i2 |= 2;
                    num9 = num9;
                    num6 = num2;
                    num7 = num7;
                    l = l;
                    break;
                case 2:
                    num2 = num6;
                    num9 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num9);
                    i2 |= 4;
                    num6 = num2;
                    num7 = num7;
                    l = l;
                    break;
                case 3:
                    num2 = num6;
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i2 |= 8;
                    num6 = num2;
                    num7 = num7;
                    l = l;
                    break;
                case 4:
                    l = l;
                    num7 = num7;
                    num6 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num6);
                    i2 |= 16;
                    num7 = num7;
                    l = l;
                    break;
                case 5:
                    l = l;
                    num7 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num7);
                    i2 |= 32;
                    num6 = num6;
                    l = l;
                    break;
                case 6:
                    num6 = num6;
                    num7 = num7;
                    l2 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l2);
                    i2 |= 64;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 7:
                    num6 = num6;
                    num7 = num7;
                    num3 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num3);
                    i2 |= 128;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 8:
                    num6 = num6;
                    num7 = num7;
                    list2 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
                    i2 |= 256;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 9:
                    num6 = num6;
                    num7 = num7;
                    o1hVar = (o1h) bldVarA.e(ugi0Var, 9, m1h.f21007a, o1hVar);
                    i2 |= 512;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 10:
                    num6 = num6;
                    num7 = num7;
                    list = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
                    i2 |= 1024;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 11:
                    num6 = num6;
                    num7 = num7;
                    l = (Long) bldVarA.e(ugi0Var, 11, s710.f31729a, l);
                    i2 |= 2048;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 12:
                    num6 = num6;
                    num7 = num7;
                    bool = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool);
                    i2 |= 4096;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 13:
                    num6 = num6;
                    num7 = num7;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i2 |= 8192;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 14:
                    num6 = num6;
                    num7 = num7;
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool3);
                    i2 |= 16384;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 15:
                    num4 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num4);
                    i = 32768;
                    i2 |= i;
                    num6 = num6;
                    num7 = num7;
                    break;
                case 16:
                    num5 = (Integer) bldVarA.e(ugi0Var, 16, okx.f25427a, num5);
                    i = 65536;
                    i2 |= i;
                    num6 = num6;
                    num7 = num7;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l3 = l;
        Integer num10 = num7;
        bldVarA.c(ugi0Var);
        return new e1h(i2, num8, str, num9, str2, num6, num10, l2, num3, list2, o1hVar, list, l3, bool, bool2, bool3, num4, num5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e1h e1hVar = (e1h) obj;
        e1hVar.getClass();
        Integer num = e1hVar.q;
        Integer num2 = e1hVar.p;
        Boolean bool = e1hVar.o;
        Boolean bool2 = e1hVar.n;
        Boolean bool3 = e1hVar.m;
        Long l = e1hVar.l;
        List list = e1hVar.k;
        o1h o1hVar = e1hVar.j;
        List list2 = e1hVar.i;
        Integer num3 = e1hVar.h;
        Long l2 = e1hVar.g;
        Integer num4 = e1hVar.f;
        Integer num5 = e1hVar.e;
        String str = e1hVar.d;
        Integer num6 = e1hVar.c;
        String str2 = e1hVar.b;
        Integer num7 = e1hVar.f7035a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = e1h.r;
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || o1hVar != null) {
            cldVarA.p(ugi0Var, 9, m1h.f21007a, o1hVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 11, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool3 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 16, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
