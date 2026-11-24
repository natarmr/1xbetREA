package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class hrm implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13538a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;

    public hrm(float f, et8 et8Var, boolean z, vne vneVar, float f2) {
        this.f13538a = (byte) 2;
        this.d = f;
        this.b = et8Var;
        this.f = z;
        this.c = vneVar;
        this.e = f2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        byte b = this.f13538a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objE = bel.e(hpa0Var, new n2l((byte) 26), new xal((byte) 1), new xal((byte) 2), new w5m((Function1) obj2, (prm) obj, this.d, this.e, this.f), yjeVar);
                return objE == wne.f39444a ? objE : Unit.f46060a;
            case 1:
                Object objD = tto0.d(hpa0Var, new m4m((Function1) obj2, (prm) obj, this.d, this.e, this.f), yjeVar, 7);
                return objD == wne.f39444a ? objD : Unit.f46060a;
            default:
                et8 et8Var = (et8) obj2;
                d38 d38Var = new d38(et8Var, (byte) 12);
                vne vneVar = (vne) obj;
                boolean z = this.f;
                igm igmVar = new igm((Object) et8Var, z, (Object) vneVar, (byte) 3);
                Object objY = ebc.Y(hpa0Var, new at8(new vb8(et8Var, z), this.d, d38Var, new j6u0(), new xs8(et8Var, vneVar, z, this.e), igmVar, null), yjeVar);
                wne wneVar = wne.f39444a;
                if (objY != wneVar) {
                    objY = Unit.f46060a;
                }
                return objY == wneVar ? objY : Unit.f46060a;
        }
    }

    public /* synthetic */ hrm(Function1 function1, prm prmVar, float f, float f2, boolean z, byte b) {
        this.f13538a = b;
        this.b = function1;
        this.c = prmVar;
        this.d = f;
        this.e = f2;
        this.f = z;
    }
}
