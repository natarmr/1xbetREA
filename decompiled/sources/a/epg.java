package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class epg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8187a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ xdr c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ epg(l7m0 l7m0Var, xdr xdrVar, ugd ugdVar, byte b) {
        this.f8187a = b;
        this.b = l7m0Var;
        this.c = xdrVar;
        this.d = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8187a;
        ugd ugdVar = this.d;
        xdr xdrVar = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                a4x a4xVar = (a4x) l7m0Var.getValue();
                i8zVar.e(a4xVar.size(), new oea(a4xVar, (byte) 3), new eod(xdrVar, a4xVar, (byte) 23), new oea(a4xVar, (byte) 4), new ugd(1020377841, true, new fpg(ugdVar, a4xVar, (byte) 0)));
                break;
            default:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                List list = (List) l7m0Var.getValue();
                hczVar.f(list.size(), new m160(new ht80((byte) 24), list, (byte) 25), new a580(list, (byte) 11), new ugd(2039820996, true, new ng90(list, xdrVar, ugdVar, (byte) 2)));
                break;
        }
        return Unit.f46060a;
    }
}
