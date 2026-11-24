package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class elj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f8001a = new zfn(new hwi0((byte) 9), (byte) 1);

    public static final yjj0 a(kkj0 kkj0Var, fet fetVar) {
        dlj0 dlj0Var = (dlj0) fetVar.k(f8001a);
        switch (kkj0Var.ordinal()) {
            case 0:
                return dlj0Var.h;
            case 1:
                return dlj0Var.e;
            case 2:
                return dlj0Var.g;
            case 3:
                return b(dlj0Var.e);
            case 4:
                return dlj0Var.f6285a;
            case 5:
                return b(dlj0Var.f6285a);
            case 6:
                return vgg0.f37379a;
            case 7:
                return dlj0Var.d;
            case 8:
                cne cneVar = dlj0Var.d;
                zcl zclVar = fkj0.i;
                return cne.c(cneVar, zclVar, null, null, zclVar, 6);
            case 9:
                return dlj0Var.f;
            case 10:
                cne cneVar2 = dlj0Var.d;
                zcl zclVar2 = fkj0.i;
                return cne.c(cneVar2, null, zclVar2, zclVar2, null, 9);
            case 11:
                return b(dlj0Var.d);
            case 12:
                return dlj0Var.c;
            case 13:
                return jd8.n;
            case 14:
                return dlj0Var.b;
            default:
                t9f.b();
                return null;
        }
    }

    public static cne b(cne cneVar) {
        zcl zclVar = fkj0.i;
        return cne.c(cneVar, null, null, zclVar, zclVar, 3);
    }
}
