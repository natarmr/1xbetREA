package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eg90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7754a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ xdr c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ eg90(pz40 pz40Var, xdr xdrVar, ugd ugdVar, byte b) {
        this.f7754a = b;
        this.b = pz40Var;
        this.c = xdrVar;
        this.d = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7754a;
        ugd ugdVar = this.d;
        xdr xdrVar = this.c;
        pz40 pz40Var = this.b;
        hcz hczVar = (hcz) obj;
        switch (b) {
            case 0:
                hczVar.getClass();
                List list = (List) pz40Var.getValue();
                hczVar.f(list.size(), new m160(new ht80((byte) 25), list, (byte) 23), new a580(list, (byte) 9), new ugd(2039820996, true, new ng90(list, xdrVar, ugdVar, (byte) 0)));
                break;
            case 1:
                hczVar.getClass();
                List list2 = (List) pz40Var.getValue();
                hczVar.f(list2.size(), new m160(new ht80((byte) 28), list2, (byte) 24), new a580(list2, (byte) 10), new ugd(2039820996, true, new ng90(list2, xdrVar, ugdVar, (byte) 1)));
                break;
            case 2:
                hczVar.getClass();
                List list3 = (List) pz40Var.getValue();
                hczVar.f(list3.size(), new m160(new ht80((byte) 26), list3, (byte) 26), new a580(list3, (byte) 12), new ugd(2039820996, true, new ng90(list3, xdrVar, ugdVar, (byte) 3)));
                break;
            default:
                hczVar.getClass();
                List list4 = (List) pz40Var.getValue();
                hczVar.f(list4.size(), new m160(new ht80((byte) 27), list4, (byte) 27), new a580(list4, (byte) 13), new ugd(2039820996, true, new ng90(list4, xdrVar, ugdVar, (byte) 4)));
                break;
        }
        return Unit.f46060a;
    }
}
