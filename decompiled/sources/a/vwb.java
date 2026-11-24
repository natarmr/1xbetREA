package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class vwb implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f38142a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ pz40 c;

    public vwb(float f, a4x a4xVar, pz40 pz40Var) {
        this.f38142a = f;
        this.b = a4xVar;
        this.c = pz40Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        Object objZ0 = ((jnn0) hpa0Var).Z0(yjeVar, new uwb(this.f38142a, this.b, this.c, null));
        return objZ0 == wne.f39444a ? objZ0 : Unit.f46060a;
    }
}
