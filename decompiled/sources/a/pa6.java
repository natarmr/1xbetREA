package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class pa6 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26639a;
    public final /* synthetic */ bxq0 b;

    public /* synthetic */ pa6(bxq0 bxq0Var, byte b) {
        this.f26639a = b;
        this.b = bxq0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        byte b = this.f26639a;
        yje yjeVar2 = null;
        bxq0 bxq0Var = this.b;
        switch (b) {
            case 0:
                Object objJ = d5c.J(yjeVar, new oa6(hpa0Var, bxq0Var, yjeVar2, (byte) 0));
                return objJ == wne.f39444a ? objJ : Unit.f46060a;
            default:
                Object objJ2 = d5c.J(yjeVar, new oa6(hpa0Var, bxq0Var, yjeVar2, (byte) 1));
                return objJ2 == wne.f39444a ? objJ2 : Unit.f46060a;
        }
    }
}
