package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class xs90 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f41405a;
    public final /* synthetic */ SnapshotStateList b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ float d;
    public final /* synthetic */ a8x e;
    public final /* synthetic */ l7m0 f;
    public final /* synthetic */ vne g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ j73 j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ pz40 l;

    public xs90(SnapshotStateList snapshotStateList, SnapshotStateList snapshotStateList2, xcz xczVar, float f, a8x a8xVar, l7m0 l7m0Var, vne vneVar, float f2, float f3, j73 j73Var, pz40 pz40Var, pz40 pz40Var2) {
        this.f41405a = snapshotStateList;
        this.b = snapshotStateList2;
        this.c = xczVar;
        this.d = f;
        this.e = a8xVar;
        this.f = l7m0Var;
        this.g = vneVar;
        this.h = f2;
        this.i = f3;
        this.j = j73Var;
        this.k = pz40Var;
        this.l = pz40Var2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ar90 ar90Var;
        cav0 cav0Var;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            int i2 = i & 126;
            cav0 cav0Var2 = (cav0) this.f41405a.get(iIntValue);
            fetVar.e0(897980760);
            l7m0 l7m0Var = this.f;
            int iIntValue3 = ((Number) l7m0Var.getValue()).intValue();
            if (cav0Var2.c) {
                ar90Var = iIntValue == iIntValue3 ? xq90.f41305a : zq90.f44798a;
            } else {
                ar90Var = yq90.f43066a;
            }
            ar90 ar90Var2 = ar90Var;
            boolean zG = fetVar.g(cav0Var2);
            if ((((i & 112) ^ 48) <= 32 || !fetVar.e(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            SnapshotStateList snapshotStateList = this.b;
            boolean zI = zG | z | fetVar.i(snapshotStateList) | fetVar.g(this.c) | fetVar.d(this.d) | fetVar.g(this.e) | fetVar.g(l7m0Var) | fetVar.i(this.g);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                cav0Var = cav0Var2;
                us90 us90Var = new us90(cav0Var, iIntValue, snapshotStateList, this.j, this.g, this.k, this.c, this.d, this.e, this.f, this.l);
                fetVar.o0(us90Var);
                objP = us90Var;
            } else {
                cav0Var = cav0Var2;
            }
            c9x.g(null, fs90.f10056a, cav0Var.b, ar90Var2, this.c, iIntValue, this.h, null, this.i, (Function0) objP, fetVar, ((i2 << 12) & 458752) | 48);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
