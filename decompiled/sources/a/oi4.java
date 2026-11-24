package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oi4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25293a;
    public final /* synthetic */ t89 b;

    public /* synthetic */ oi4(t89 t89Var, byte b) {
        this.f25293a = b;
        this.b = t89Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25293a) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.r(fhlVar, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                fhl.u(fhlVar, StaticColors.INSTANCE.m71getBlack300d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126);
                break;
            default:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                fhl.r(fhlVar2, this.b, 0L, 0L, 0.0f, null, null, 0, 126);
                break;
        }
        return Unit.f46060a;
    }
}
