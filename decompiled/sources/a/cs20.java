package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cs20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4869a;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ kie0 e;

    public /* synthetic */ cs20(pu90 pu90Var, int i, ArrayList arrayList, kie0 kie0Var, byte b) {
        this.f4869a = b;
        this.b = pu90Var;
        this.c = i;
        this.d = arrayList;
        this.e = kie0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4869a;
        kie0 kie0Var = this.e;
        ArrayList<pu90> arrayList = this.d;
        int i = this.c;
        pu90 pu90Var = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, 0, i - pu90Var.b, 0.0f);
                }
                for (pu90 pu90Var2 : arrayList) {
                    Object objN = pu90Var2.n();
                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                    if (Intrinsics.d(objG0, "MarketCategoriesSubGamesContainerHEADER")) {
                        ou90Var.m(pu90Var2, 0, 0, 0.0f);
                    } else if (Intrinsics.d(objG0, "MarketCategoriesSubGamesContainerITEMS")) {
                        ou90Var.m(pu90Var2, kie0Var.f18333a, 0, 0.0f);
                    }
                }
                break;
            default:
                ou90Var.getClass();
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, 0, i - pu90Var.b, 0.0f);
                }
                for (pu90 pu90Var3 : arrayList) {
                    Object objN2 = pu90Var3.n();
                    p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                    Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                    if (Intrinsics.d(objG1, "MarketCategoriesSubGamesContainerHEADER")) {
                        ou90Var.m(pu90Var3, 0, 0, 0.0f);
                    } else if (Intrinsics.d(objG1, "MarketCategoriesSubGamesContainerITEMS")) {
                        ou90Var.m(pu90Var3, kie0Var.f18333a, 0, 0.0f);
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
