package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class z53 extends bnn0 implements Function2 {
    public final /* synthetic */ float i;
    public final /* synthetic */ SnapshotStateList j;
    public final /* synthetic */ float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z53(float f, SnapshotStateList snapshotStateList, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.i = f;
        this.j = snapshotStateList;
        this.k = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new z53(this.i, this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z53) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        float f = this.i / 2.0f;
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size() / 2;
        int size2 = snapshotStateList.size();
        for (int i = 0; i < size2; i++) {
            int i2 = i % 2 == 0 ? (i / 2) + size : size - ((i + 1) / 2);
            snapshotStateList.set(i2, new Float(((i2 - 2) * this.k) + f));
        }
        return Unit.f46060a;
    }
}
