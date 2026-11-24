package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wme implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39403a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wme(Object obj, Object obj2, byte b) {
        this.f39403a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        byte b = this.f39403a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objJ = d5c.J(yjeVar, new ah0(hpa0Var, (p5q0) obj2, (k7q0) obj, null, (byte) 7));
                return objJ == wne.f39444a ? objJ : Unit.f46060a;
            case 1:
                Object objD = tto0.d(hpa0Var, new cw7((pz40) obj2, (pz40) obj, (byte) 6), yjeVar, 7);
                return objD == wne.f39444a ? objD : Unit.f46060a;
            default:
                Object objD2 = tto0.d(hpa0Var, new dff0((Function2) obj2, (elg0) obj, (byte) 18), yjeVar, 7);
                return objD2 == wne.f39444a ? objD2 : Unit.f46060a;
        }
    }
}
