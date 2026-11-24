package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e63 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7261a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e63(float f, Object obj, Object obj2, byte b) {
        this.f7261a = b;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, final long j) {
        long j2;
        pu90 pu90VarS;
        byte b = this.f7261a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                list.getClass();
                final ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pj30) it.next()).S(j));
                }
                int size = arrayList.size();
                final float f = this.b;
                if (size <= 1) {
                    return vj30.x(vj30Var, p4e.i(j), p4e.h(j), new c63(j, arrayList, f));
                }
                final SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                final t33 t33Var = (t33) obj2;
                return vj30.x(vj30Var, p4e.i(j), p4e.h(j), new Function1() { // from class: a.d63
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        ou90 ou90Var = (ou90) obj3;
                        ou90Var.getClass();
                        long j3 = j;
                        int i = p4e.i(j3) / 2;
                        int iH = p4e.h(j3) / 2;
                        float f2 = f;
                        float f3 = i;
                        float f4 = (0.4f * f2) / 2.0f;
                        float f5 = (f3 - f4) - f2;
                        float f6 = f4 + f3;
                        int i2 = 0;
                        for (Object obj4 : arrayList) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            pu90 pu90Var = (pu90) obj4;
                            SnapshotStateList snapshotStateList2 = snapshotStateList;
                            float fFloatValue = ((Number) snapshotStateList2.get(i2)).floatValue();
                            t33 t33Var2 = t33Var;
                            ou90Var.m(pu90Var, si30.b(l1e0.c((((Number) t33Var2.d()).floatValue() + fFloatValue) - (f2 / 2.0f), f5, f6)), iH - (pu90Var.b / 2), 1.0f - (Math.abs(((((Number) t33Var2.d()).floatValue() + ((Number) snapshotStateList2.get(i2)).floatValue()) - f3) / f2) * 0.2f));
                            i2 = i3;
                        }
                        return Unit.f46060a;
                    }
                });
            default:
                list.getClass();
                int i = p4e.i(j);
                int i2 = i < 0 ? 0 : i;
                int iH = p4e.h(j);
                int i3 = iH < 0 ? 0 : iH;
                pu90 pu90VarS2 = ((pj30) list.get(0)).S(p4e.b(j, 0, 0, 0, 0, 10));
                int iMax = Math.max(0, pu90VarS2.b - vj30Var.T(((Number) ((l7m0) obj2).getValue()).floatValue() * this.b));
                if (((Function2) obj) != null) {
                    j2 = j;
                    pu90VarS = ((pj30) list.get(2)).S(p4e.b(j2, 0, 0, 0, 0, 10));
                } else {
                    j2 = j;
                    pu90VarS = null;
                }
                int i4 = pu90VarS != null ? pu90VarS.b : 0;
                return vj30.x(vj30Var, i2, i3, new laf0(pu90VarS2, ((pj30) list.get(1)).S(r4e.i(0, -(iMax + i4), j2)), iMax, pu90VarS, i3, i4));
        }
    }
}
