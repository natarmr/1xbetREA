package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class zy2 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45184a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zy2(Object obj, byte b) {
        this.f45184a = b;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        byte b = this.f45184a;
        byte b2 = 13;
        byte b3 = 2;
        byte b4 = 7;
        byte b5 = 0;
        byte b6 = 1;
        yje yjeVar2 = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                Object objY = ebc.Y(hpa0Var, new yy2((az2) obj, yjeVar2, b5), yjeVar);
                return objY == wne.f39444a ? objY : Unit.f46060a;
            case 1:
                Object objY2 = ebc.Y(hpa0Var, new wij((xij) obj, yjeVar2, b5), yjeVar);
                return objY2 == wne.f39444a ? objY2 : Unit.f46060a;
            case 2:
                Object objJ = d5c.J(yjeVar, new juy((Object) hpa0Var, obj, yjeVar2, (byte) 4));
                return objJ == wne.f39444a ? objJ : Unit.f46060a;
            case 3:
                ppj0 ppj0Var = (ppj0) obj;
                ebz ebzVar = new ebz(ppj0Var, (byte) 25);
                da00 da00Var = new da00(ppj0Var, (byte) 0);
                da00 da00Var2 = new da00(ppj0Var, (byte) 1);
                g2z g2zVar = new g2z(ppj0Var, b2);
                float f = bel.f2455a;
                Object objY3 = ebc.Y(hpa0Var, new xdl((Object) ebzVar, (wdr) g2zVar, (wdr) da00Var, (Object) da00Var2, (yje) null, (byte) 1), yjeVar);
                wne wneVar = wne.f39444a;
                if (objY3 != wneVar) {
                    objY3 = Unit.f46060a;
                }
                return objY3 == wneVar ? objY3 : Unit.f46060a;
            case 4:
                Object objD = tto0.d(hpa0Var, new r3w((Function0) obj, b2), yjeVar, 7);
                return objD == wne.f39444a ? objD : Unit.f46060a;
            case 5:
                Object objZ0 = ((jnn0) hpa0Var).Z0(yjeVar, new ma6((ep90) obj, yjeVar2, b6));
                return objZ0 == wne.f39444a ? objZ0 : Unit.f46060a;
            case 6:
                Object objZ1 = ((jnn0) hpa0Var).Z0(yjeVar, new ma6((ome) obj, yjeVar2, b3));
                return objZ1 == wne.f39444a ? objZ1 : Unit.f46060a;
            case 7:
                Object objY4 = ebc.Y(hpa0Var, new obz((oum0) obj, yjeVar2, b3), yjeVar);
                return objY4 == wne.f39444a ? objY4 : Unit.f46060a;
            case 8:
                Object objY5 = ebc.Y(hpa0Var, new yy2(new g0p0(1, (z4q0) obj, z4q0.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, (byte) 28), yjeVar2, b6), yjeVar);
                wne wneVar2 = wne.f39444a;
                if (objY5 != wneVar2) {
                    objY5 = Unit.f46060a;
                }
                return objY5 == wneVar2 ? objY5 : Unit.f46060a;
            case 9:
                k7q0 k7q0Var = (k7q0) obj;
                cgx0 cgx0Var = k7q0Var.A;
                i7q0 i7q0Var = k7q0Var.z;
                jnn0 jnn0Var = (jnn0) hpa0Var;
                jnn0Var.getClass();
                wgu0 wgu0Var = vcc.Z(jnn0Var).B;
                zz2 zz2Var = new zz2();
                zz2Var.b = wgu0Var;
                Object objY6 = ebc.Y(hpa0Var, new obz(zz2Var, cgx0Var, i7q0Var, null), yjeVar);
                if (objY6 != wne.f39444a) {
                    objY6 = Unit.f46060a;
                }
                return objY6 == wne.f39444a ? objY6 : Unit.f46060a;
            default:
                Object objJ2 = d5c.J(yjeVar, new khx(hpa0Var, (p5q0) obj, yjeVar2, b4));
                wne wneVar3 = wne.f39444a;
                if (objJ2 != wneVar3) {
                    objJ2 = Unit.f46060a;
                }
                return objJ2 == wneVar3 ? objJ2 : Unit.f46060a;
        }
    }
}
