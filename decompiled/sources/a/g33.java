package a;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g33 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10592a;
    public final /* synthetic */ bhu0 b;

    public /* synthetic */ g33(bhu0 bhu0Var, byte b) {
        this.f10592a = b;
        this.b = bhu0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10592a;
        bhu0 bhu0Var = this.b;
        switch (b) {
            case 0:
                return k33.n(bhu0Var);
            case 1:
                bhu0Var.z.D();
                return Unit.f46060a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                bhu0Var.B.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                return bhu0.o(bhu0Var);
            case 4:
                bhu0Var.i1.invoke(bhu0Var.B);
                return Unit.f46060a;
            default:
                bhu0Var.h1.invoke(bhu0Var.B);
                return Unit.f46060a;
        }
    }
}
