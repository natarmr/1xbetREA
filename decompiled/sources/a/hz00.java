package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hz00 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hz00 f13885a;
    private static final ugi0 descriptor;

    static {
        hz00 hz00Var = new hz00();
        f13885a = hz00Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.cyber_info.lol.data.model.LolChampionResponse", hz00Var, 6);
        zna0Var.j("name", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("winrate", true);
        zna0Var.j("picks", true);
        zna0Var.j("tier", true);
        zna0Var.j("position", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jz00.g;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(klq.f18504a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[5].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jz00.g;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Float f = null;
        Integer num = null;
        Integer num2 = null;
        lz00 lz00Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    f = (Float) bldVarA.e(ugi0Var, 2, klq.f18504a, f);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i |= 16;
                    break;
                case 5:
                    lz00Var = (lz00) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), lz00Var);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new jz00(i, str, str2, f, num, num2, lz00Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jz00 jz00Var = (jz00) obj;
        jz00Var.getClass();
        lz00 lz00Var = jz00Var.f;
        Integer num = jz00Var.e;
        Integer num2 = jz00Var.d;
        Float f = jz00Var.c;
        String str = jz00Var.b;
        String str2 = jz00Var.f17385a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jz00.g;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 2, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || lz00Var != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), lz00Var);
        }
        cldVarA.c(ugi0Var);
    }
}
