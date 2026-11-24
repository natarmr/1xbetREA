package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class uic implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f35724a;
    public final /* synthetic */ cgk0 b;
    public final /* synthetic */ pz40 c;

    public uic(boolean z, cgk0 cgk0Var, pz40 pz40Var) {
        this.f35724a = z;
        this.b = cgk0Var;
        this.c = pz40Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        Object objY = ebc.Y(hpa0Var, new tic(this.f35724a, this.b, this.c, null), yjeVar);
        return objY == wne.f39444a ? objY : Unit.f46060a;
    }
}
