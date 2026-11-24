package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class sjl implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f32308a;
    public final /* synthetic */ float b;
    public final /* synthetic */ byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public sjl(float f, float f2, int i) {
        this.f32308a = f;
        this.b = f2;
        this.c = i;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        Integer num;
        list.getClass();
        final int iT = vj30Var.T(this.f32308a);
        final int iT2 = vj30Var.T(this.b);
        int i = p4e.i(j);
        byte b = this.c;
        final int i2 = (i - ((b - 1) * iT)) / b;
        final ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((pj30) it.next()).S(p4e.b(j, i2, i2, 0, 0, 12)));
        }
        int size = ((arrayList.size() + b) - 1) / b;
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Integer numValueOf = Integer.valueOf(((pu90) it2.next()).b);
            while (it2.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((pu90) it2.next()).b);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        final int iIntValue = num != null ? num.intValue() : 0;
        int iB = twn.b(size, 1, iT2, size * iIntValue);
        int i3 = p4e.i(j);
        final byte b2 = this.c;
        return vj30.x(vj30Var, i3, iB, new Function1() { // from class: a.rjl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                int i4 = 0;
                for (Object obj2 : arrayList) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    byte b3 = b2;
                    int i6 = i4 / b3;
                    ou90Var.m((pu90) obj2, (i2 + iT) * (i4 % b3), (iIntValue + iT2) * i6, 0.0f);
                    i4 = i5;
                }
                return Unit.f46060a;
            }
        });
    }
}
