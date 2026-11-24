package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j3d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15825a;
    public final /* synthetic */ float b;
    public final /* synthetic */ pu90 c;

    public /* synthetic */ j3d(float f, pu90 pu90Var) {
        this.f15825a = (byte) 1;
        this.b = f;
        this.c = pu90Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15825a;
        float f = this.b;
        pu90 pu90Var = this.c;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                if (pu90Var != null) {
                    ou90Var.g(pu90Var, 0, (int) f, 0.0f);
                }
                break;
            case 1:
                ou90Var.getClass();
                if (f < 1.0f) {
                    ou90Var.g(pu90Var, 0, 0, 0.0f);
                }
                break;
            default:
                ou90Var.getClass();
                if (pu90Var != null) {
                    ou90Var.g(pu90Var, 0, (int) f, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ j3d(pu90 pu90Var, float f, byte b) {
        this.f15825a = b;
        this.c = pu90Var;
        this.b = f;
    }
}
