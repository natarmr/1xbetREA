package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class gmy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final edu f11562a = edu.q("k");

    public static ArrayList a(ndy ndyVar, fa10 fa10Var, float f, l3u0 l3u0Var, boolean z) {
        ndy ndyVar2;
        fa10 fa10Var2;
        float f2;
        l3u0 l3u0Var2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (ndyVar.w() == 6) {
            fa10Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        ndyVar.c();
        while (ndyVar.l()) {
            if (ndyVar.y(f11562a) != 0) {
                ndyVar.H();
            } else if (ndyVar.w() == 1) {
                ndyVar.a();
                if (ndyVar.w() == 7) {
                    ndy ndyVar3 = ndyVar;
                    fa10 fa10Var3 = fa10Var;
                    float f3 = f;
                    l3u0 l3u0Var3 = l3u0Var;
                    boolean z3 = z;
                    cmy cmyVarB = fmy.b(ndyVar3, fa10Var3, f3, l3u0Var3, false, z3);
                    ndyVar2 = ndyVar3;
                    fa10Var2 = fa10Var3;
                    f2 = f3;
                    l3u0Var2 = l3u0Var3;
                    z2 = z3;
                    arrayList.add(cmyVarB);
                } else {
                    ndyVar2 = ndyVar;
                    fa10Var2 = fa10Var;
                    f2 = f;
                    l3u0Var2 = l3u0Var;
                    z2 = z;
                    while (ndyVar2.l()) {
                        arrayList.add(fmy.b(ndyVar2, fa10Var2, f2, l3u0Var2, true, z2));
                    }
                }
                ndyVar2.d();
                ndyVar = ndyVar2;
                fa10Var = fa10Var2;
                f = f2;
                l3u0Var = l3u0Var2;
                z = z2;
            } else {
                ndy ndyVar4 = ndyVar;
                arrayList.add(fmy.b(ndyVar4, fa10Var, f, l3u0Var, false, z));
                ndyVar = ndyVar4;
            }
        }
        ndyVar.e();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            cmy cmyVar = (cmy) arrayList.get(i2);
            i2++;
            cmy cmyVar2 = (cmy) arrayList.get(i2);
            cmyVar.h = Float.valueOf(cmyVar2.g);
            if (cmyVar.c == null && (obj = cmyVar2.b) != null) {
                cmyVar.c = obj;
                if (cmyVar instanceof d290) {
                    ((d290) cmyVar).d();
                }
            }
        }
        cmy cmyVar3 = (cmy) arrayList.get(i);
        if ((cmyVar3.b == null || cmyVar3.c == null) && arrayList.size() > 1) {
            arrayList.remove(cmyVar3);
        }
    }
}
