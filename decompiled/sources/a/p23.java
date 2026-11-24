package a;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.secret.impl.SecurityImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class p23 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p23(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new p23(2, yjeVar, (byte) 0);
            case 1:
                return new p23(2, yjeVar, (byte) 1);
            case 2:
                return new p23(2, yjeVar, (byte) 2);
            case 3:
                return new p23(2, yjeVar, (byte) 3);
            case 4:
                return new p23(2, yjeVar, (byte) 4);
            case 5:
                return new p23(2, yjeVar, (byte) 5);
            case 6:
                return new p23(2, yjeVar, (byte) 6);
            case 7:
                return new p23(2, yjeVar, (byte) 7);
            case 8:
                return new p23(2, yjeVar, (byte) 8);
            case 9:
                return new p23(2, yjeVar, (byte) 9);
            case 10:
                return new p23(2, yjeVar, (byte) 10);
            case 11:
                return new p23(2, yjeVar, (byte) 11);
            case 12:
                return new p23(2, yjeVar, (byte) 12);
            case 13:
                return new p23(2, yjeVar, (byte) 13);
            default:
                return new p23(2, yjeVar, (byte) 14);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((p23) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((p23) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((p23) create((gmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((p23) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((p23) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((p23) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                ((p23) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
                return "";
            case 7:
                return ((p23) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((p23) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((p23) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((p23) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((p23) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((p23) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((p23) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return new p23(2, (yje) obj2, (byte) 14).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return Choreographer.getInstance();
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                return "";
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            default:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                System.loadLibrary("security");
                odd oddVar = SecurityImpl.f;
                Unit unit = Unit.f46060a;
                oddVar.N(unit);
                return unit;
        }
    }
}
