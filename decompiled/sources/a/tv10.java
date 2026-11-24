package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tv10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tv10 f34577a;
    private static final ugi0 descriptor;

    static {
        tv10 tv10Var = new tv10();
        f34577a = tv10Var;
        zna0 zna0Var = new zna0("org.xplatform.config.data.models.MainMenu", tv10Var, 10);
        zna0Var.j("TopMenuItemsOrder", true);
        zna0Var.j("SingleTopMenuItemsOrder", true);
        zna0Var.j("SportMenuItemsOrder", true);
        zna0Var.j("SingleSportMenuItemsOrder", true);
        zna0Var.j("AggregatorMenuItemsOrder", true);
        zna0Var.j("SingleAggregatorMenuItemsOrder", true);
        zna0Var.j("GamesMenuItemsOrder", true);
        zna0Var.j("SingleGamesMenuItemsOrder", true);
        zna0Var.j("OtherMenuItemsOrder", true);
        zna0Var.j("SingleOtherMenuItemsOrder", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = vv10.k;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue()), mrv.j0((jiy) a8zVarArr[5].getValue()), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0((jiy) a8zVarArr[9].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = vv10.k;
        List list = null;
        List list2 = null;
        boolean z = true;
        List list3 = null;
        int i = 0;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        List list9 = null;
        List list10 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    list4 = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list4);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    list5 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list5);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    list6 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list6);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    list7 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list7);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    list8 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list8);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    list9 = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list9);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    list10 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list10);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    list3 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list3);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr2[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new vv10(i, list4, list5, list6, list7, list8, list9, list10, list3, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vv10 vv10Var = (vv10) obj;
        vv10Var.getClass();
        List list = vv10Var.j;
        List list2 = vv10Var.i;
        List list3 = vv10Var.h;
        List list4 = vv10Var.g;
        List list5 = vv10Var.f;
        List list6 = vv10Var.e;
        List list7 = vv10Var.d;
        List list8 = vv10Var.c;
        List list9 = vv10Var.b;
        List list10 = vv10Var.f38077a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = vv10.k;
        if (cldVarA.u(ugi0Var) || list10 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list10);
        }
        if (cldVarA.u(ugi0Var) || list9 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list9);
        }
        if (cldVarA.u(ugi0Var) || list8 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list8);
        }
        if (cldVarA.u(ugi0Var) || list7 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list7);
        }
        if (cldVarA.u(ugi0Var) || list6 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list6);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
