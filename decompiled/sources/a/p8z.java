package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p8z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26583a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ p8z(pz40 pz40Var, ArrayList arrayList, List list, boolean z, byte b) {
        this.f26583a = b;
        this.b = pz40Var;
        this.c = arrayList;
        this.d = list;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f26583a;
        boolean z = this.e;
        List list = this.d;
        ArrayList arrayList = this.c;
        pz40 pz40Var = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.f25867a = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((r8z) arrayList.get(i)).n(ou90Var, z);
                }
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((r8z) list.get(i2)).n(ou90Var, z);
                }
                ou90Var.f25867a = false;
                pz40Var.getValue();
                break;
            default:
                ou90Var.f25867a = true;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((ncz) arrayList.get(i3)).n(ou90Var, z);
                }
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((ncz) list.get(i4)).n(ou90Var, z);
                }
                ou90Var.f25867a = false;
                pz40Var.getValue();
                break;
        }
        return Unit.f46060a;
    }
}
