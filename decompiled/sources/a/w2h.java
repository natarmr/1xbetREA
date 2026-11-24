package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w2h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38447a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ kie0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ w2h(ArrayList arrayList, long j, kie0 kie0Var, int i, byte b) {
        this.f38447a = b;
        this.b = arrayList;
        this.c = j;
        this.d = kie0Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38447a;
        int i = this.e;
        kie0 kie0Var = this.d;
        long j = this.c;
        ArrayList<pu90> arrayList = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                for (pu90 pu90Var : arrayList) {
                    int i2 = (p4e.i(j) - pu90Var.e0()) / 2;
                    int i3 = kie0Var.f18333a + i;
                    kie0Var.f18333a = i3;
                    ou90Var.g(pu90Var, i2, i3, 0.0f);
                    kie0Var.f18333a = pu90Var.d0() + i + kie0Var.f18333a;
                }
                break;
            default:
                ou90Var.getClass();
                for (pu90 pu90Var2 : arrayList) {
                    int i4 = (p4e.i(j) - pu90Var2.e0()) / 2;
                    int i5 = kie0Var.f18333a + i;
                    kie0Var.f18333a = i5;
                    ou90Var.g(pu90Var2, i4, i5, 0.0f);
                    kie0Var.f18333a = pu90Var2.d0() + i + kie0Var.f18333a;
                }
                break;
        }
        return Unit.f46060a;
    }
}
