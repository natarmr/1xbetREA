package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class t900 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a4x f33538a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public t900(a4x a4xVar, float f, float f2, float f3) {
        this.f33538a = a4xVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, final long j) {
        Integer num;
        list.getClass();
        a4x a4xVar = this.f33538a;
        Iterator<E> it = a4xVar.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((a4x) it.next()).size());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((a4x) it.next()).size());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 1;
        float fI = p4e.i(j) - this.b;
        float f = this.c;
        float f2 = (fI - ((iIntValue - 1) * f)) / iIntValue;
        float f3 = this.d;
        final float f4 = f2 > f3 ? f3 : f2;
        int i = (int) f4;
        if (i < 0) {
            zcx.a("width must be >= 0");
        }
        long jH = r4e.h(i, i, 0, Integer.MAX_VALUE);
        final ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((pj30) it2.next()).S(jH));
        }
        pu90 pu90Var = (pu90) CollectionsKt.firstOrNull(arrayList);
        final int i2 = pu90Var != null ? pu90Var.b : 0;
        float size = (f * (a4xVar.size() - 1)) + (a4xVar.size() * i2);
        if (size < 0.0f) {
            size = 0.0f;
        }
        final a4x a4xVar2 = this.f33538a;
        final float f5 = this.c;
        return vj30.x(vj30Var, p4e.i(j), (int) size, new Function1() { // from class: a.s900
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                Iterator<E> it3 = a4xVar2.iterator();
                int i3 = 0;
                int i4 = 0;
                while (it3.hasNext()) {
                    int size2 = ((a4x) it3.next()).size();
                    float f6 = f4;
                    float f7 = f5;
                    int i5 = (int) ((p4e.i(j) - (((size2 - 1) * f7) + (size2 * f6))) / 2.0f);
                    int i6 = 0;
                    while (i6 < size2) {
                        ou90Var.m((pu90) arrayList.get(i4), i5, i3, 0.0f);
                        i5 += (int) (f6 + f7);
                        i6++;
                        i4++;
                    }
                    i3 += (int) (i2 + f7);
                }
                return Unit.f46060a;
            }
        });
    }
}
