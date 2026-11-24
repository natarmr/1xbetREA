package a;

import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ndo0 implements sv40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f23345a;
    public final /* synthetic */ float b;
    public final /* synthetic */ odo0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ cch0 e;

    public ndo0(float f, float f2, odo0 odo0Var, int i, cch0 cch0Var) {
        this.f23345a = f;
        this.b = f2;
        this.c = odo0Var;
        this.d = i;
        this.e = cch0Var;
    }

    @Override // a.sv40
    public final uj30 b(final vj30 vj30Var, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        float f = this.f23345a;
        final int iT = vj30Var.T(f);
        int size = list2.size();
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((pj30) list2.get(i)).b(Integer.MAX_VALUE)));
        }
        final int iIntValue = numValueOf.intValue();
        int i2 = iT * 2;
        float f2 = this.b;
        long jB = p4e.b(j, vj30Var.T(f2), 0, iIntValue, iIntValue, 2);
        final jie0 jie0Var = new jie0();
        jie0Var.f16571a = f;
        final ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list2.size();
        int iE = 0;
        while (iE < size3) {
            iE = w6x.e((pj30) list2.get(iE), jB, arrayList2, iE, 1);
            size3 = size3;
            f2 = f2;
        }
        float f3 = f2;
        MutableIntList mutableIntList = new MutableIntList();
        int size4 = list2.size();
        for (int i3 = 0; i3 < size4; i3++) {
            mutableIntList.a(((pj30) list2.get(i3)).P(Integer.MAX_VALUE));
        }
        final ArrayList arrayList3 = new ArrayList(size);
        int iT2 = i2;
        int i4 = 0;
        while (i4 < size) {
            float f4 = ((ycl) idd.d(new ycl(f3), new ycl(vj30Var.r0(((pu90) arrayList2.get(i4)).f27604a)))).f42389a;
            iT2 += vj30Var.T(f4);
            float f5 = f3;
            float f6 = ((ycl) idd.d(new ycl(vj30Var.r0(mutableIntList.c(i4)) - (nbo0.f23252a * 2.0f)), new ycl(24.0f))).f42389a;
            float f7 = jie0Var.f16571a;
            ado0 ado0Var = new ado0(f7, f4, f6);
            jie0Var.f16571a = f7 + f4;
            arrayList3.add(ado0Var);
            i4++;
            f3 = f5;
        }
        ((hgk0) this.c.f25085a).setValue(arrayList3);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size5 = list3.size();
        int iE2 = 0;
        while (iE2 < size5) {
            iE2 = w6x.e((pj30) list3.get(iE2), p4e.a(0, vj30Var.T(((ado0) arrayList3.get(this.d)).c), 0, iIntValue), arrayList4, iE2, 1);
        }
        final float f8 = this.f23345a;
        final cch0 cch0Var = this.e;
        final int i5 = this.d;
        return vj30.x(vj30Var, iT2, iIntValue, new Function1() { // from class: a.mdo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vj30 vj30Var2;
                ArrayList arrayList5;
                ou90 ou90Var = (ou90) obj;
                jie0 jie0Var2 = jie0Var;
                jie0Var2.f16571a = f8;
                ArrayList arrayList6 = arrayList2;
                int size6 = arrayList6.size();
                int i6 = 0;
                while (true) {
                    vj30Var2 = vj30Var;
                    arrayList5 = arrayList3;
                    if (i6 >= size6) {
                        break;
                    }
                    ou90Var.m((pu90) arrayList6.get(i6), vj30Var2.T(jie0Var2.f16571a), 0, 0.0f);
                    jie0Var2.f16571a += ((ado0) arrayList5.get(i6)).b;
                    i6++;
                }
                ArrayList arrayList7 = arrayList4;
                int size7 = arrayList7.size();
                int i7 = 0;
                while (true) {
                    int i8 = i5;
                    if (i7 >= size7) {
                        cch0Var.a(vj30Var2, iT, arrayList5, i8);
                        return Unit.f46060a;
                    }
                    pu90 pu90Var = (pu90) arrayList7.get(i7);
                    ou90Var.m(pu90Var, Math.max(0, (vj30Var2.T(((ado0) arrayList5.get(i8)).b) - pu90Var.f27604a) / 2), iIntValue - pu90Var.b, 0.0f);
                    i7++;
                }
            }
        });
    }
}
