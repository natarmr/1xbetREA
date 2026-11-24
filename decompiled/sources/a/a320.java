package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a320 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a320 f152a;
    private static final ugi0 descriptor;

    static {
        a320 a320Var = new a320();
        f152a = a320Var;
        zna0 zna0Var = new zna0("org.xplatform.domino.data.model.request.MakeActionDominoRequest", a320Var, 9);
        zna0Var.j("DI", true);
        zna0Var.j("DN", true);
        zna0Var.j("EI", true);
        zna0Var.j("LG", true);
        zna0Var.j("WH", true);
        zna0Var.j("VU", true);
        zna0Var.j("AN", true);
        zna0Var.j("CE", true);
        zna0Var.j("GI", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = c320.j;
        okx okxVar = okx.f25427a;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{okxVar, ujx.c, okxVar, ysm0Var, okxVar, a8zVarArr[5].getValue(), okxVar, okxVar, mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = c320.j;
        Object obj = null;
        boolean z = true;
        String str = null;
        int[] iArr = null;
        String strX = null;
        List list = null;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        int iJ5 = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iJ = bldVarA.j(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iArr = (int[]) bldVarA.m(ugi0Var, 1, ujx.c, iArr);
                    i |= 2;
                    break;
                case 2:
                    iJ2 = bldVarA.j(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iJ3 = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) bldVarA.m(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    iJ4 = bldVarA.j(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iJ5 = bldVarA.j(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new c320(i, iJ, iArr, iJ2, strX, iJ3, list, iJ4, iJ5, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        c320 c320Var = (c320) obj;
        c320Var.getClass();
        String str = c320Var.i;
        int i = c320Var.h;
        int i2 = c320Var.g;
        List list = c320Var.f;
        int i3 = c320Var.e;
        String str2 = c320Var.d;
        int i4 = c320Var.c;
        int[] iArr = c320Var.b;
        int i5 = c320Var.f3652a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = c320.j;
        if (cldVarA.u(ugi0Var) || i5 != 0) {
            cldVarA.i(0, i5, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(iArr, new int[2])) {
            cldVarA.m(ugi0Var, 1, ujx.c, iArr);
        }
        if (cldVarA.u(ugi0Var) || i4 != 0) {
            cldVarA.i(2, i4, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str2, "")) {
            cldVarA.z(ugi0Var, 3, str2);
        }
        if (cldVarA.u(ugi0Var) || i3 != 0) {
            cldVarA.i(4, i3, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(list, kotlin.collections.a.c(0))) {
            cldVarA.m(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || i2 != 0) {
            cldVarA.i(6, i2, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(7, i, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "0")) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
