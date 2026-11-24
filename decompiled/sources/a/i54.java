package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class i54 implements PointerInputEventHandler {
    public static final i54 b = new i54(0);
    public static final i54 c = new i54(1);
    public static final i54 d = new i54(2);
    public static final i54 e = new i54(3);
    public static final i54 f = new i54(4);
    public static final i54 g = new i54(5);
    public static final i54 h = new i54(6);
    public static final i54 i = new i54(7);
    public static final i54 j = new i54(8);
    public static final i54 k = new i54(9);
    public static final i54 l = new i54(10);
    public static final i54 m = new i54(11);
    public static final i54 n = new i54(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14176a;

    public i54(xwb xwbVar, agk0 agk0Var) {
        this.f14176a = (byte) 13;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hpa0 hpa0Var, yje yjeVar) {
        byte b2 = 0;
        byte b3 = 1;
        byte b4 = 15;
        byte b5 = 2;
        yje yjeVar2 = null;
        switch (this.f14176a) {
            case 0:
                Object objZ0 = ((jnn0) hpa0Var).Z0(yjeVar, new h54(b5, yjeVar2, b2));
                return objZ0 == wne.f39444a ? objZ0 : Unit.f46060a;
            case 1:
                Object objZ1 = ((jnn0) hpa0Var).Z0(yjeVar, new h54(b5, yjeVar2, b3));
                return objZ1 == wne.f39444a ? objZ1 : Unit.f46060a;
            case 2:
                Object objE = bel.e(hpa0Var, new n2l((byte) 26), new xal((byte) 1), new xal((byte) 2), new o33(b4), yjeVar);
                return objE == wne.f39444a ? objE : Unit.f46060a;
            case 3:
                Object objY = ebc.Y(hpa0Var, new of4(b5, yjeVar2, b2), yjeVar);
                return objY == wne.f39444a ? objY : Unit.f46060a;
            case 4:
                Object objZ2 = ((jnn0) hpa0Var).Z0(yjeVar, new h54(b5, yjeVar2, b5));
                return objZ2 == wne.f39444a ? objZ2 : Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                Object objZ3 = ((jnn0) hpa0Var).Z0(yjeVar, new h54(b5, yjeVar2, (byte) 3));
                return objZ3 == wne.f39444a ? objZ3 : Unit.f46060a;
            case 7:
                Object objY2 = ebc.Y(hpa0Var, new of4(b5, yjeVar2, b3), yjeVar);
                return objY2 == wne.f39444a ? objY2 : Unit.f46060a;
            case 8:
                return Unit.f46060a;
            case 9:
                Object objZ4 = ((jnn0) hpa0Var).Z0(yjeVar, new h54(b5, yjeVar2, (byte) 4));
                return objZ4 == wne.f39444a ? objZ4 : Unit.f46060a;
            case 10:
                Object objD = tto0.d(hpa0Var, null, yjeVar, 15);
                return objD == wne.f39444a ? objD : Unit.f46060a;
            case 11:
                return Unit.f46060a;
            case 12:
                Object objD2 = tto0.d(hpa0Var, new ejv0((byte) 16), yjeVar, 7);
                return objD2 == wne.f39444a ? objD2 : Unit.f46060a;
            default:
                return Unit.f46060a;
        }
    }

    public /* synthetic */ i54(byte b2) {
        this.f14176a = b2;
    }
}
