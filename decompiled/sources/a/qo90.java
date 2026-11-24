package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class qo90 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29063a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ qo90(Function1 function1, byte b) {
        this.f29063a = b;
        this.b = function1;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        byte b = this.f29063a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                Object objZ0 = ((jnn0) hpa0Var).Z0(yjeVar, new po90(function1, null, (byte) 0));
                return objZ0 == wne.f39444a ? objZ0 : Unit.f46060a;
            case 1:
                hpa0Var.getClass();
                Object objZ1 = ((jnn0) hpa0Var).Z0(yjeVar, new po90(function1, null, (byte) 1));
                return objZ1 == wne.f39444a ? objZ1 : Unit.f46060a;
            default:
                Object objE = bel.e(hpa0Var, new elk0(function1, (byte) 11), new uck0(function1, (byte) 16), new uck0(function1, (byte) 17), new ru80(function1, (byte) 13), yjeVar);
                return objE == wne.f39444a ? objE : Unit.f46060a;
        }
    }
}
