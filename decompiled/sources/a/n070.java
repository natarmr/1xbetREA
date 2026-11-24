package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n070 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n070 f22688a;
    private static final ugi0 descriptor;

    static {
        n070 n070Var = new n070();
        f22688a = n070Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.OneXGamesPreviewResult", n070Var, 2);
        zna0Var.j("games", false);
        zna0Var.j("categories", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = p070.c;
        return new jiy[]{a8zVarArr[0].getValue(), a8zVarArr[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = p070.c;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new p070(i, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p070 p070Var = (p070) obj;
        p070Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = p070.c;
        cldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), p070Var.f26136a);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), p070Var.b);
        cldVarA.c(ugi0Var);
    }
}
