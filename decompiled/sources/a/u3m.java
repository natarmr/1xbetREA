package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class u3m implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35004a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u3m(boolean z, Object obj, byte b) {
        this.f35004a = b;
        this.b = z;
        this.c = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        byte b = this.f35004a;
        Object obj = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                Object objY = ebc.Y(hpa0Var, new t3m(z, (pz40) obj, null), yjeVar);
                return objY == wne.f39444a ? objY : Unit.f46060a;
            default:
                if (!z) {
                    return Unit.f46060a;
                }
                Function1 function1 = (Function1) obj;
                Object objE = bel.e(hpa0Var, new abh0(function1, (byte) 11), new w7i0(function1, (byte) 6), new w7i0(function1, (byte) 7), new ru80(function1, (byte) 12), yjeVar);
                return objE == wne.f39444a ? objE : Unit.f46060a;
        }
    }
}
