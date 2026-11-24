package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j2s0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2s0 f15797a;
    private static final ugi0 descriptor;

    static {
        j2s0 j2s0Var = new j2s0();
        f15797a = j2s0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.universal.data.model.feed_statistic.lol.TournamentLolFeedStatisticPlayerResponse", j2s0Var, 10);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("role", true);
        zna0Var.j("wins", true);
        zna0Var.j("loses", true);
        zna0Var.j("winrate", true);
        zna0Var.j("kda", true);
        zna0Var.j("teamName", true);
        zna0Var.j("teamImageS3", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = l2s0.k;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0((jiy) a8zVarArr[3].getValue());
        okx okxVar = okx.f25427a;
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        klq klqVar = klq.f18504a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = l2s0.k;
        String str = null;
        String str2 = null;
        boolean z = true;
        Float f = null;
        int i = 0;
        Long l = null;
        String str3 = null;
        String str4 = null;
        d2s0 d2s0Var = null;
        Integer num = null;
        Integer num2 = null;
        Float f2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    str3 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str3);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    d2s0Var = (d2s0) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), d2s0Var);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num2);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    f2 = (Float) bldVarA.e(ugi0Var, 6, klq.f18504a, f2);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    f = (Float) bldVarA.e(ugi0Var, 7, klq.f18504a, f);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    str2 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str2);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new l2s0(i, l, str3, str4, d2s0Var, num, num2, f2, f, str2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l2s0 l2s0Var = (l2s0) obj;
        l2s0Var.getClass();
        String str = l2s0Var.j;
        String str2 = l2s0Var.i;
        Float f = l2s0Var.h;
        Float f2 = l2s0Var.g;
        Integer num = l2s0Var.f;
        Integer num2 = l2s0Var.e;
        d2s0 d2s0Var = l2s0Var.d;
        String str3 = l2s0Var.c;
        String str4 = l2s0Var.b;
        Long l = l2s0Var.f19328a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = l2s0.k;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || d2s0Var != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), d2s0Var);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 6, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 7, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
