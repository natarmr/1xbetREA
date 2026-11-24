package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jel0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jel0 f16380a;
    private static final ugi0 descriptor;

    static {
        jel0 jel0Var = new jel0();
        f16380a = jel0Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.dictionaries.sport.domain.model.SportImageModel", jel0Var, 18);
        zna0Var.j("imageSmall", false);
        zna0Var.j("imagePopular", false);
        zna0Var.j("background", false);
        zna0Var.j("backgroundTablet", false);
        zna0Var.j("backgroundChampionsDefault", false);
        zna0Var.j("backgroundChampionsTabletDefault", false);
        zna0Var.j("backgroundChampionsHeaderDefault", false);
        zna0Var.j("backgroundChampionsHeaderTabletDefault", false);
        zna0Var.j("gameBackground", false);
        zna0Var.j("champSmall", false);
        zna0Var.j("feedImageVertical", false);
        zna0Var.j("feedImageHorizontal", false);
        zna0Var.j("feedImageSquare", false);
        zna0Var.j("disciplineIcon3D", false);
        zna0Var.j("esportsEventFocusDisciplineHeader", false);
        zna0Var.j("esportsHeaderFocusDisciplineHeader", false);
        zna0Var.j("defaultOpponentHeader", false);
        zna0Var.j("defaultOpponentHeaderTablet", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i2 = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        String strX6 = null;
        String strX7 = null;
        String strX8 = null;
        String strX9 = null;
        String strX10 = null;
        String strX11 = null;
        String strX12 = null;
        String strX13 = null;
        String strX14 = null;
        String strX15 = null;
        String strX16 = null;
        String strX17 = null;
        String strX18 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strX = bldVarA.x(ugi0Var, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strX2 = bldVarA.x(ugi0Var, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strX3 = bldVarA.x(ugi0Var, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    strX4 = bldVarA.x(ugi0Var, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strX5 = bldVarA.x(ugi0Var, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strX6 = bldVarA.x(ugi0Var, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strX7 = bldVarA.x(ugi0Var, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strX8 = bldVarA.x(ugi0Var, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    strX9 = bldVarA.x(ugi0Var, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    strX10 = bldVarA.x(ugi0Var, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    strX11 = bldVarA.x(ugi0Var, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strX12 = bldVarA.x(ugi0Var, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strX13 = bldVarA.x(ugi0Var, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    strX14 = bldVarA.x(ugi0Var, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    strX15 = bldVarA.x(ugi0Var, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strX16 = bldVarA.x(ugi0Var, 15);
                    i = 32768;
                    break;
                case 16:
                    strX17 = bldVarA.x(ugi0Var, 16);
                    i = 65536;
                    break;
                case 17:
                    strX18 = bldVarA.x(ugi0Var, 17);
                    i = 131072;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            i2 |= i;
        }
        bldVarA.c(ugi0Var);
        return new lel0(i2, strX, strX2, strX3, strX4, strX5, strX6, strX7, strX8, strX9, strX10, strX11, strX12, strX13, strX14, strX15, strX16, strX17, strX18);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lel0 lel0Var = (lel0) obj;
        lel0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, lel0Var.f19909a);
        cldVarA.z(ugi0Var, 1, lel0Var.b);
        cldVarA.z(ugi0Var, 2, lel0Var.c);
        cldVarA.z(ugi0Var, 3, lel0Var.d);
        cldVarA.z(ugi0Var, 4, lel0Var.e);
        cldVarA.z(ugi0Var, 5, lel0Var.f);
        cldVarA.z(ugi0Var, 6, lel0Var.g);
        cldVarA.z(ugi0Var, 7, lel0Var.h);
        cldVarA.z(ugi0Var, 8, lel0Var.i);
        cldVarA.z(ugi0Var, 9, lel0Var.j);
        cldVarA.z(ugi0Var, 10, lel0Var.k);
        cldVarA.z(ugi0Var, 11, lel0Var.l);
        cldVarA.z(ugi0Var, 12, lel0Var.m);
        cldVarA.z(ugi0Var, 13, lel0Var.n);
        cldVarA.z(ugi0Var, 14, lel0Var.o);
        cldVarA.z(ugi0Var, 15, lel0Var.p);
        cldVarA.z(ugi0Var, 16, lel0Var.q);
        cldVarA.z(ugi0Var, 17, lel0Var.r);
        cldVarA.c(ugi0Var);
    }
}
