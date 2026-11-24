package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class twv0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lsv0 f34669a;
    public final /* synthetic */ ywv0 b;
    public final /* synthetic */ Function0 c;

    public twv0(lsv0 lsv0Var, ywv0 ywv0Var, Function0 function0) {
        this.f34669a = lsv0Var;
        this.b = ywv0Var;
        this.c = function0;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        Object objD = tto0.d(hpa0Var, new m8s0(this.f34669a, this.b, this.c, (byte) 13), yjeVar, 7);
        return objD == wne.f39444a ? objD : Unit.f46060a;
    }
}
