package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelView;
import org.xplatform.lucky_wheel.presentation.views.WheelView;

/* JADX INFO: loaded from: classes3.dex */
public final class o2d extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ float j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2d(Object obj, float f, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.j = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new o2d((nyq0) obj2, this.j, yjeVar, (byte) 0);
            case 1:
                o2d o2dVar = new o2d((fm10) obj2, yjeVar);
                o2dVar.j = ((Number) obj).floatValue();
                return o2dVar;
            default:
                return new o2d((ppj0) obj2, this.j, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((o2d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((o2d) create(Float.valueOf(((Number) obj).floatValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((o2d) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                nyq0 nyq0Var = (nyq0) obj2;
                float f = nyq0Var.getState().f26070a;
                float f2 = -this.j;
                if (f != f2) {
                    nyq0Var.getState().f26070a = f2;
                }
                break;
            case 1:
                float f3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr = fm10.S1;
                LuckyWheelView luckyWheelView = ((fm10) obj2).G0().t;
                Float f4 = new Float(f3);
                Iterator it = luckyWheelView.v.iterator();
                while (it.hasNext()) {
                    ((WheelView) it.next()).setRotation(f4.floatValue());
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ((ppj0) obj2).c.m(this.j);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2d(fm10 fm10Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.k = fm10Var;
    }
}
