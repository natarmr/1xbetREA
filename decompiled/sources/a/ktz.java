package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ktz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18888a;
    public final /* synthetic */ i4 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ktz(i4 i4Var, Function1 function1, byte b) {
        this.f18888a = b;
        this.b = i4Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18888a;
        byte b2 = 13;
        byte b3 = 27;
        byte b4 = 18;
        Function1 function1 = this.c;
        i4 i4Var = this.b;
        byte b5 = 1;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        switch (b) {
            case 0:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 9), new ugd(802480018, true, new yul(i4Var, function1, (byte) 21)));
                break;
            case 1:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 10), new ugd(802480018, true, new yul(i4Var, function1, (byte) 22)));
                break;
            case 2:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 12), new ugd(802480018, true, new yul(i4Var, function1, (byte) 24)));
                break;
            case 3:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 11), new ugd(802480018, true, new yul(i4Var, function1, (byte) 23)));
                break;
            case 4:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 14), new ugd(802480018, true, new yul(i4Var, function1, (byte) 26)));
                break;
            case 5:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 13), new ugd(802480018, true, new yul(i4Var, function1, (byte) 25)));
                break;
            case 6:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 16), new ugd(802480018, true, new yul(i4Var, function1, (byte) 28)));
                break;
            case 7:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 15), new ugd(802480018, true, new yul(i4Var, function1, b3)));
                break;
            case 8:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 18), new ugd(802480018, true, new a100(i4Var, function1, (byte) 0)));
                break;
            case 9:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 17), new ugd(802480018, true, new yul(i4Var, function1, (byte) 29)));
                break;
            case 10:
                hczVar.f(i4Var.size(), null, new bgz(i4Var, (byte) 19), new ugd(802480018, true, new a100(i4Var, function1, b5)));
                break;
            default:
                hczVar.f(i4Var.size(), new ygy(new o240(b4), i4Var, (byte) 27), new ap30(i4Var, (byte) 18), new ugd(2039820996, true, new a100(i4Var, function1, b2)));
                break;
        }
        return Unit.f46060a;
    }
}
