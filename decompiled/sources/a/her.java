package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class her extends i1 {
    public final /* synthetic */ ier c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public her(ier ierVar) {
        super(ierVar.e);
        this.c = ierVar;
    }

    @Override // a.r5
    public final Collection a() {
        List<qlc> listJ;
        ier ierVar = this.c;
        int i = ierVar.h;
        wer werVar = ierVar.g;
        ser serVar = ser.d;
        if (Intrinsics.d(werVar, serVar)) {
            listJ = kotlin.collections.a.c(ier.l);
        } else if (Intrinsics.d(werVar, ter.d)) {
            listJ = q3d.j(ier.m, new qlc(j4m0.l, serVar.a(i)));
        } else {
            ver verVar = ver.d;
            if (Intrinsics.d(werVar, verVar)) {
                listJ = kotlin.collections.a.c(ier.l);
            } else {
                if (!Intrinsics.d(werVar, uer.d)) {
                    int i2 = ju.f17125a;
                    jf4.n("should not be called");
                    return null;
                }
                listJ = q3d.j(ier.m, new qlc(j4m0.f, verVar.a(i)));
            }
        }
        ym40 ym40VarJ = ((ng80) ierVar.f).j();
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        for (qlc qlcVar : listJ) {
            wm40 wm40VarV = obb.V(ym40VarJ, qlcVar);
            if (wm40VarV == null) {
                c99.m(qlcVar, " not found", "Built-in class ");
                return null;
            }
            List listE0 = CollectionsKt.E0(wm40VarV.h().getParameters().size(), ierVar.k);
            ArrayList arrayList2 = new ArrayList(r3d.q(listE0, 10));
            Iterator it = listE0.iterator();
            while (it.hasNext()) {
                arrayList2.add(new q4m0(((hzs0) it.next()).I()));
            }
            ays0.b.getClass();
            arrayList.add(ucx.f0(ays0.c, wm40VarV, arrayList2));
        }
        return CollectionsKt.L0(arrayList);
    }

    @Override // a.r5
    public final gfk0 e() {
        return gfk0.c;
    }

    @Override // a.iys0
    public final List getParameters() {
        return this.c.k;
    }

    @Override // a.i1
    /* JADX INFO: renamed from: k */
    public final wm40 n() {
        return this.c;
    }

    @Override // a.iys0
    public final foc n() {
        return this.c;
    }

    @Override // a.iys0
    public final boolean p() {
        return true;
    }

    public final String toString() {
        return this.c.toString();
    }
}
