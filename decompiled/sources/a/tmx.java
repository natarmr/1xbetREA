package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class tmx implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f34215a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ pz40 c;

    public tmx(long j, pz40 pz40Var, pz40 pz40Var2) {
        this.f34215a = j;
        this.b = pz40Var;
        this.c = pz40Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        Object objE = bel.e(hpa0Var, new n2l((byte) 26), new xal((byte) 1), new xal((byte) 2), new my2(this.b, this.f34215a, this.c, (byte) 7), yjeVar);
        return objE == wne.f39444a ? objE : Unit.f46060a;
    }
}
