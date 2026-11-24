package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22156a;
    public final /* synthetic */ np10 b;

    public /* synthetic */ mp10(np10 np10Var, byte b) {
        this.f22156a = b;
        this.b = np10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22156a;
        np10 np10Var = this.b;
        switch (b) {
            case 0:
                np10Var.b1();
                return Unit.f46060a;
            case 1:
                return new ne60(np10Var.Y);
            default:
                j6z j6zVar = (j6z) ((hgk0) np10Var.A).getValue();
                return new ne60(j6zVar != null ? j6zVar.Y(0L) : 9205357640488583168L);
        }
    }
}
