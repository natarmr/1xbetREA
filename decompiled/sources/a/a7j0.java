package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a7j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f374a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ a7j0(a4x a4xVar, Function1 function1, byte b) {
        this.f374a = b;
        this.b = a4xVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f374a;
        byte b2 = 12;
        byte b3 = 16;
        byte b4 = 21;
        byte b5 = 23;
        byte b6 = 2;
        byte b7 = 17;
        byte b8 = 6;
        byte b9 = 4;
        byte b10 = 3;
        Function1 function1 = this.c;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(a4xVar.size(), null, new d1c0(a4xVar, (byte) 29), new ugd(802480018, true, new njh0(a4xVar, function1, b8)));
                break;
            case 1:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(a4xVar.size(), new zcn0(new acm0((byte) 17), a4xVar, b10), new adn0(a4xVar, (byte) 2), new ugd(2039820996, true, new gic(a4xVar, a4xVar, function1, b9)));
                break;
            case 2:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                meo0 meo0Var = new meo0(b2);
                meo0 meo0Var2 = new meo0((byte) 13);
                hczVar3.f(a4xVar.size(), new adn0(xdx.E(a4xVar, meo0Var), (byte) 10), new zcn0(meo0Var2, a4xVar, (byte) 11), new ugd(-1311333631, true, new njh0(a4xVar, function1, b7)));
                break;
            case 3:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(a4xVar.size(), new zcn0(new ofo0(b3), a4xVar, b2), new adn0(a4xVar, (byte) 11), new ugd(2039820996, true, new gic((List) a4xVar, function1, a4xVar, (byte) 5)));
                break;
            case 4:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hczVar5.f(a4xVar.size(), new adn0(xdx.E(a4xVar, new meo0((byte) 18)), (byte) 16), new adn0(a4xVar, (byte) 17), new ugd(-1311333631, true, new njh0(a4xVar, function1, (byte) 19)));
                break;
            case 5:
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                hczVar6.f(a4xVar.size(), null, new adn0(a4xVar, (byte) 21), new ugd(2039820996, true, new gic(a4xVar, a4xVar, function1, b8)));
                break;
            case 6:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8zVar.e(a4xVar.size(), new zcn0(new t9r0(b10), a4xVar, (byte) 22), null, new zcn0(new t9r0(b9), a4xVar, b5), new ugd(-1117249557, true, new njh0(a4xVar, function1, b4)));
                break;
            case 7:
                hcz hczVar7 = (hcz) obj;
                hczVar7.getClass();
                t9r0 t9r0Var = new t9r0((byte) 27);
                t9r0 t9r0Var2 = new t9r0((byte) 28);
                hczVar7.f(a4xVar.size(), new vdr0(xdx.E(a4xVar, t9r0Var), (byte) 6), new xlr0(t9r0Var2, a4xVar, b6), new ugd(-1311333631, true, new njh0(a4xVar, function1, b5)));
                break;
            default:
                hcz hczVar8 = (hcz) obj;
                hczVar8.getClass();
                g4s0 g4s0Var = new g4s0(b10);
                g4s0 g4s0Var2 = new g4s0(b9);
                hczVar8.f(a4xVar.size(), new vdr0(xdx.E(a4xVar, g4s0Var), (byte) 7), new xlr0(g4s0Var2, a4xVar, b10), new ugd(-1311333631, true, new njh0(a4xVar, function1, (byte) 24)));
                break;
        }
        return Unit.f46060a;
    }
}
