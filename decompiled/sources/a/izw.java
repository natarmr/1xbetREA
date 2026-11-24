package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class izw implements vii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15652a;
    public final /* synthetic */ Object b;

    public /* synthetic */ izw(Object obj, byte b) {
        this.f15652a = b;
        this.b = obj;
    }

    @Override // a.vii0
    public final void a(xii0 xii0Var) {
        byte b = this.f15652a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mzw mzwVar = (mzw) obj;
                if (mzwVar.d() != null) {
                    ito0 ito0Var = mzwVar.z;
                    ito0Var.getClass();
                    ofm0.m();
                    ito0Var.f = true;
                    snf0 snf0Var = ito0Var.d;
                    if (snf0Var != null) {
                        ofm0.m();
                        if (!snf0Var.d.b.isDone()) {
                            ozw ozwVar = new ozw(3, "The request is aborted silently and retried.", null);
                            ofm0.m();
                            snf0Var.g = true;
                            qbb qbbVar = snf0Var.i;
                            Objects.requireNonNull(qbbVar);
                            qbbVar.cancel(true);
                            snf0Var.e.d(ozwVar);
                            snf0Var.f.b(null);
                            ito0 ito0Var2 = snf0Var.b;
                            o55 o55Var = snf0Var.f32492a;
                            ofm0.m();
                            l8x.U("TakePictureManagerImpl", "Add a new request for retrying.");
                            ito0Var2.f15364a.addFirst(o55Var);
                            ito0Var2.c();
                        }
                    }
                    mzwVar.G(true);
                    String strF = mzwVar.f();
                    nzw nzwVar = (nzw) mzwVar.i;
                    h55 h55Var = mzwVar.j;
                    h55Var.getClass();
                    tii0 tii0VarH = mzwVar.H(strF, nzwVar, h55Var);
                    mzwVar.x = tii0VarH;
                    Object[] objArr = {tii0VarH.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    mzwVar.E(Collections.unmodifiableList(arrayList));
                    mzwVar.r();
                    ito0 ito0Var3 = mzwVar.z;
                    ito0Var3.getClass();
                    ofm0.m();
                    ito0Var3.f = false;
                    ito0Var3.c();
                    break;
                }
                break;
            case 1:
                oub0 oub0Var = (oub0) obj;
                if (oub0Var.d() != null) {
                    oub0Var.I((pub0) oub0Var.i, oub0Var.j);
                    oub0Var.r();
                    break;
                }
                break;
            default:
                Iterator it = ((wii0) obj).n.iterator();
                while (it.hasNext()) {
                    ((vii0) it.next()).a(xii0Var);
                }
                break;
        }
    }
}
