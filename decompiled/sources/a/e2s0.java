package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e2s0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2s0 f7102a;
    private static final ugi0 descriptor;

    static {
        e2s0 e2s0Var = new e2s0();
        f7102a = e2s0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.universal.data.model.feed_statistic.lol.TournamentLolFeedStatisticHeroResponse", e2s0Var, 10);
        zna0Var.j("name", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("tier", true);
        zna0Var.j("presence", true);
        zna0Var.j("picks", true);
        zna0Var.j("position", true);
        zna0Var.j("bans", true);
        zna0Var.j("wins", true);
        zna0Var.j("loses", true);
        zna0Var.j("winrate", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = g2s0.k;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ2 = mrv.j0(okxVar);
        klq klqVar = klq.f18504a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(klqVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[5].getValue()), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(klqVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = g2s0.k;
        Float f = null;
        Integer num = null;
        boolean z = true;
        Integer num2 = null;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num3 = null;
        Float f2 = null;
        Integer num4 = null;
        d2s0 d2s0Var = null;
        Integer num5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    f2 = (Float) bldVarA.e(ugi0Var, 3, klq.f18504a, f2);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    d2s0Var = (d2s0) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), d2s0Var);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    num5 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num5);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num2);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    f = (Float) bldVarA.e(ugi0Var, 9, klq.f18504a, f);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new g2s0(i, str, str2, num3, f2, num4, d2s0Var, num5, num2, num, f);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        g2s0 g2s0Var = (g2s0) obj;
        g2s0Var.getClass();
        Float f = g2s0Var.j;
        Integer num = g2s0Var.i;
        Integer num2 = g2s0Var.h;
        Integer num3 = g2s0Var.g;
        d2s0 d2s0Var = g2s0Var.f;
        Integer num4 = g2s0Var.e;
        Float f2 = g2s0Var.d;
        Integer num5 = g2s0Var.c;
        String str = g2s0Var.b;
        String str2 = g2s0Var.f10576a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = g2s0.k;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 3, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || d2s0Var != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), d2s0Var);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 9, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
