package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f8u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mii0 f9125a;

    public /* synthetic */ f8u(mii0 mii0Var) {
        this.f9125a = mii0Var;
    }

    public ArrayList a(bop0 bop0Var) {
        byte b = bop0Var.f2946a;
        ArrayList<mms> arrayList = ((gs6) this.f9125a.c).f11814a;
        ArrayList arrayList2 = new ArrayList();
        for (mms mmsVar : arrayList) {
            d9a0 d9a0Var = mmsVar.i;
            if (d9a0Var.f == b) {
                arrayList2.add(d9a0Var);
            }
            d9a0 d9a0Var2 = mmsVar.j;
            if (d9a0Var2.f == b) {
                arrayList2.add(d9a0Var2);
            }
        }
        return arrayList2;
    }
}
