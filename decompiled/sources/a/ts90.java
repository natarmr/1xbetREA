package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ts90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34451a;
    public final /* synthetic */ SnapshotStateList b;

    public /* synthetic */ ts90(SnapshotStateList snapshotStateList, byte b) {
        this.f34451a = b;
        this.b = snapshotStateList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34451a;
        SnapshotStateList snapshotStateList = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((cav0) snapshotStateList.get(((Number) obj).intValue())).c);
            default:
                snapshotStateList.get(((Number) obj).intValue());
                return null;
        }
    }
}
