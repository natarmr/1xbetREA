package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class v950 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37018a;
    public final zqv0 b;
    public final jiy c;

    public v950(jiy jiyVar, byte b) {
        this.f37018a = b;
        switch (b) {
            case 1:
                jiyVar.getClass();
                zw3 zw3Var = new zw3(jiyVar, (byte) 0);
                this.c = zw3Var;
                this.b = x2x.o("androidx.compose.runtime.SnapshotStateList", (uw3) zw3Var.c);
                break;
            default:
                v950 v950Var = new v950(jiyVar, (byte) 1);
                this.c = v950Var;
                this.b = x2x.o("androidx.navigation3.runtime.NavBackStack", v950Var.b);
                break;
        }
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        byte b = this.f37018a;
        jiy jiyVar = this.c;
        switch (b) {
            case 0:
                return new u950((SnapshotStateList) rkjVar.w((v950) jiyVar));
            default:
                List list = (List) rkjVar.w((zw3) jiyVar);
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.addAll(CollectionsKt.L0(list));
                return snapshotStateList;
        }
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        byte b = this.f37018a;
        return this.b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        byte b = this.f37018a;
        jiy jiyVar = this.c;
        switch (b) {
            case 0:
                bwnVar.C((v950) jiyVar, ((u950) obj).f35267a);
                break;
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                snapshotStateList.getClass();
                bwnVar.C((zw3) jiyVar, snapshotStateList);
                break;
        }
    }
}
