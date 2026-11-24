package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tp90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34320a;
    public final /* synthetic */ SnapshotStateList b;

    public /* synthetic */ tp90(SnapshotStateList snapshotStateList, byte b) {
        this.f34320a = b;
        this.b = snapshotStateList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.f34320a;
        SnapshotStateList snapshotStateList = this.b;
        int iIntValue = ((Integer) obj).intValue();
        switch (b) {
            case 0:
                z = ((cav0) snapshotStateList.get(iIntValue)).c;
                break;
            default:
                z = ((cav0) snapshotStateList.get(iIntValue)).c;
                break;
        }
        return Boolean.valueOf(z);
    }
}
