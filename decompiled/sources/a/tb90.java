package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tb90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33652a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ float d;

    public /* synthetic */ tb90(pz40 pz40Var, ugd ugdVar, float f, byte b) {
        this.f33652a = b;
        this.b = pz40Var;
        this.c = ugdVar;
        this.d = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33652a;
        float f = this.d;
        ugd ugdVar = this.c;
        pz40 pz40Var = this.b;
        hcz hczVar = (hcz) obj;
        switch (b) {
            case 0:
                hczVar.getClass();
                List list = (List) pz40Var.getValue();
                hczVar.f(list.size(), new m160(new ht80((byte) 21), list, (byte) 22), new a580(list, (byte) 8), new ugd(2039820996, true, new ub90(list, ugdVar, f, (byte) 0)));
                break;
            default:
                hczVar.getClass();
                List list2 = (List) pz40Var.getValue();
                hczVar.f(list2.size(), new xlr0(new efr0((byte) 29), list2, (byte) 9), new vdr0(list2, (byte) 14), new ugd(2039820996, true, new ub90(list2, ugdVar, f, (byte) 1)));
                break;
        }
        return Unit.f46060a;
    }
}
