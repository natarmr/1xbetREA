package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class vgg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugg0 f37379a;

    static {
        ld90 ld90VarE = pzb.e(50);
        f37379a = new ugg0(ld90VarE, ld90VarE, ld90VarE, ld90VarE);
    }

    public static final ugg0 a(float f) {
        zcl zclVar = new zcl(f);
        return new ugg0(zclVar, zclVar, zclVar, zclVar);
    }

    public static final ugg0 b(float f, float f2, float f3, float f4) {
        return new ugg0(new zcl(f), new zcl(f2), new zcl(f3), new zcl(f4));
    }

    public static ugg0 c(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return b(f, f2, f3, f4);
    }
}
