package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class aol implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow3 f1206a;
    public final /* synthetic */ sw3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ hh80 d;
    public final /* synthetic */ k6z e;

    public aol(ow3 ow3Var, sw3 sw3Var, int i, hh80 hh80Var, k6z k6zVar) {
        this.f1206a = ow3Var;
        this.b = sw3Var;
        this.c = i;
        this.d = hh80Var;
        this.e = k6zVar;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, final long j) {
        list.getClass();
        final ow3 ow3Var = this.f1206a;
        final int iT = vj30Var.T(ow3Var.a());
        final int iT2 = vj30Var.T(this.b.a());
        int i = this.c;
        int i2 = p4e.i(j);
        final hh80 hh80Var = this.d;
        k6z k6zVar = this.e;
        final int iT3 = (((i2 - vj30Var.T(hh80Var.b(k6zVar))) - vj30Var.T(hh80Var.c(k6zVar))) - ((i - 1) * iT)) / i;
        long jB = p4e.b(j, iT3, iT3, 0, 0, 12);
        final ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((pj30) it.next()).S(jB));
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            pu90 pu90Var = (pu90) obj;
            int i5 = i3 % i;
            if (i3 >= i) {
                iArr[i5] = iArr[i5] + iT2;
            }
            iArr[i5] = iArr[i5] + pu90Var.b;
            i3 = i4;
        }
        Integer numR = tx3.R(iArr);
        int iIntValue = numR != null ? numR.intValue() : 0;
        int i6 = p4e.i(j);
        int iT4 = vj30Var.T(hh80Var.a()) + vj30Var.T(hh80Var.d()) + iIntValue;
        final int i7 = this.c;
        final k6z k6zVar2 = this.e;
        return vj30.x(vj30Var, i6, iT4, new Function1() { // from class: a.znl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                hh80 hh80Var2;
                int i8;
                ou90 ou90Var = (ou90) obj2;
                ou90Var.getClass();
                int i9 = i7;
                int[] iArr2 = new int[i9];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    hh80Var2 = hh80Var;
                    if (i11 >= i9) {
                        break;
                    }
                    iArr2[i11] = ou90Var.T(hh80Var2.d());
                    i11++;
                }
                for (Object obj3 : arrayList) {
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pu90 pu90Var2 = (pu90) obj3;
                    int i13 = i10 % i9;
                    if (i10 >= i9) {
                        iArr2[i13] = iArr2[i13] + iT2;
                    }
                    nw3 nw3Var = uc9.e;
                    ow3 ow3Var2 = ow3Var;
                    boolean zEquals = ow3Var2.equals(nw3Var);
                    int i14 = iT3;
                    int i15 = iT;
                    if (zEquals) {
                        i8 = hne.d(i14, pu90Var2.f27604a, 2, (i15 + i14) * i13);
                    } else if (ow3Var2.equals(uc9.b)) {
                        i8 = (i14 - pu90Var2.f27604a) + ((i15 + i14) * i13);
                    } else if (ow3Var2.equals(uc9.g)) {
                        i8 = i9 > 1 ? (((p4e.i(j) - (i14 * i9)) / (i9 - 1)) + i14) * i13 : i13 * i14;
                    } else {
                        i8 = (i14 + i15) * i13;
                    }
                    ou90Var.g(pu90Var2, ou90Var.T(hh80Var2.b(k6zVar2)) + i8, iArr2[i13], 0.0f);
                    iArr2[i13] = iArr2[i13] + pu90Var2.b;
                    i10 = i12;
                }
                return Unit.f46060a;
            }
        });
    }
}
