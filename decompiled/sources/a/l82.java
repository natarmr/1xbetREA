package a;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l82 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19588a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ l82(ArrayList arrayList, byte b) {
        this.f19588a = b;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19588a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = y82.V1;
                return Integer.valueOf(arrayList.size());
            case 1:
                return Integer.valueOf(arrayList.size());
            case 2:
                return ((kiy) arrayList.get(0)).o();
            default:
                zie0 zie0Var = fpk0.V1;
                return Integer.valueOf(arrayList.size());
        }
    }
}
