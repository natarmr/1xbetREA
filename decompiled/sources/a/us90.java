package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class us90 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cav0 f36201a;
    public final /* synthetic */ int b;
    public final /* synthetic */ SnapshotStateList c;
    public final /* synthetic */ j73 d;
    public final /* synthetic */ vne e;
    public final /* synthetic */ pz40 f;
    public final /* synthetic */ xcz g;
    public final /* synthetic */ float h;
    public final /* synthetic */ a8x i;
    public final /* synthetic */ l7m0 j;
    public final /* synthetic */ pz40 k;

    public us90(cav0 cav0Var, int i, SnapshotStateList snapshotStateList, j73 j73Var, vne vneVar, pz40 pz40Var, xcz xczVar, float f, a8x a8xVar, l7m0 l7m0Var, pz40 pz40Var2) {
        this.f36201a = cav0Var;
        this.b = i;
        this.c = snapshotStateList;
        this.d = j73Var;
        this.e = vneVar;
        this.f = pz40Var;
        this.g = xczVar;
        this.h = f;
        this.i = a8xVar;
        this.j = l7m0Var;
        this.k = pz40Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = this.f36201a.c;
        int iIntValue = this.b;
        if (!z) {
            SnapshotStateList snapshotStateList = this.c;
            Integer numG = ys90.g(snapshotStateList.size(), iIntValue, false, 0, new ts90(snapshotStateList, (byte) 0));
            if (numG != null) {
                iIntValue = numG.intValue();
            }
        }
        int i = iIntValue;
        ys90.d(this.e, this.f, this.g, this.h, this.i, this.j, this.k, i, this.d);
        return Unit.f46060a;
    }
}
