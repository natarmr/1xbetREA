package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g160 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10496a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ g160(a4x a4xVar, mm40 mm40Var, Function1 function1, byte b) {
        this.f10496a = b;
        this.b = a4xVar;
        this.c = mm40Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10496a;
        Function1 function1 = this.d;
        mm40 mm40Var = this.c;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(a4xVar.size(), new m160(new mb50((byte) 14), a4xVar, (byte) 6), new ap30(a4xVar, (byte) 29), new ugd(802480018, true, new kp0(a4xVar, mm40Var, function1, (byte) 4)));
                break;
            case 1:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8zVar.e(a4xVar.size(), new ygy(new mb50((byte) 17), a4xVar, (byte) 29), null, new ap30(a4xVar, (byte) 23), new ugd(-1117249557, true, new kp0(a4xVar, mm40Var, function1, (byte) 2)));
                break;
            case 2:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(a4xVar.size(), new m160(new mb50((byte) 15), a4xVar, (byte) 3), new ap30(a4xVar, (byte) 27), new ugd(802480018, true, new kp0(a4xVar, mm40Var, function1, (byte) 3)));
                break;
            case 3:
                i8z i8zVar2 = (i8z) obj;
                i8zVar2.getClass();
                i8zVar2.e(a4xVar.size(), new m160(new r580((byte) 1), a4xVar, (byte) 13), null, new a580(a4xVar, (byte) 1), new ugd(-1117249557, true, new kp0(a4xVar, mm40Var, function1, (byte) 5)));
                break;
            default:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hczVar3.f(a4xVar.size(), new zu90((byte) 8, new jfa0((byte) 8), a4xVar), new a580(a4xVar, (byte) 25), new ugd(2039820996, true, new kp0(a4xVar, mm40Var, function1, (byte) 6)));
                break;
        }
        return Unit.f46060a;
    }
}
