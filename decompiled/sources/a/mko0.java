package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mko0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mko0 f21953a;
    private static final ugi0 descriptor;

    static {
        mko0 mko0Var = new mko0();
        f21953a = mko0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.career.data.models.TableResponse", mko0Var, 4);
        zna0Var.j("tag", true);
        zna0Var.j("tableTitles", true);
        zna0Var.j("tableBody", true);
        zna0Var.j("footer", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = uko0.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = uko0.e;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            } else if (iF == 2) {
                list3 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list4 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list4);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new uko0(i, list, list2, list3, list4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uko0 uko0Var = (uko0) obj;
        uko0Var.getClass();
        List list = uko0Var.d;
        List list2 = uko0Var.c;
        List list3 = uko0Var.b;
        List list4 = uko0Var.f35838a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = uko0.e;
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
