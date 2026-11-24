package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class pje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SnapshotStateList f27086a = new SnapshotStateList();

    public static void b(pje pjeVar, Function2 function2, ugd ugdVar, Function0 function0, int i) {
        if ((i & 8) != 0) {
            ugdVar = null;
        }
        pjeVar.f27086a.add(new ugd(-1789283891, true, new x2g(function2, pjeVar, ugdVar, function0)));
    }

    public final void a(oje ojeVar, fet fetVar, int i) {
        fetVar.g0(-798501095);
        int i2 = (fetVar.g(ojeVar) ? 4 : 2) | i | (fetVar.g(this) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.f27086a;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((xdr) snapshotStateList.get(i3)).F(ojeVar, fetVar, Integer.valueOf(i2 & 14));
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(this, ojeVar, i, (byte) 5);
        }
    }
}
