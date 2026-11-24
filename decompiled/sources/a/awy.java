package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class awy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1596a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ilp c;

    public /* synthetic */ awy(Function1 function1, ilp ilpVar, byte b) {
        this.f1596a = b;
        this.b = function1;
        this.c = ilpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1596a;
        ilp ilpVar = this.c;
        Function1 function1 = this.b;
        h2l0 h2l0Var = (h2l0) obj;
        switch (b) {
            case 0:
                h2l0Var.getClass();
                int iOrdinal = h2l0Var.ordinal();
                if (iOrdinal == 0) {
                    function1.invoke(new ylp(new npn(ilpVar.f14991a, ilpVar.c, Long.valueOf(ilpVar.e), ilpVar.d), !ilpVar.m.f6295a));
                } else if (iOrdinal == 1) {
                    function1.invoke(new omp(ilpVar.f14991a));
                }
                break;
            case 1:
                h2l0Var.getClass();
                int iOrdinal2 = h2l0Var.ordinal();
                if (iOrdinal2 == 0) {
                    function1.invoke(new ylp(new npn(ilpVar.f14991a, ilpVar.c, Long.valueOf(ilpVar.e), ilpVar.d), !ilpVar.m.f6295a));
                } else if (iOrdinal2 == 1) {
                    function1.invoke(new omp(ilpVar.f14991a));
                }
                break;
            case 2:
                h2l0Var.getClass();
                int iOrdinal3 = h2l0Var.ordinal();
                if (iOrdinal3 == 0) {
                    function1.invoke(new ylp(new npn(ilpVar.f14991a, ilpVar.c, Long.valueOf(ilpVar.e), ilpVar.d), !ilpVar.m.f6295a));
                } else if (iOrdinal3 == 1) {
                    function1.invoke(new omp(ilpVar.f14991a));
                }
                break;
            case 3:
                h2l0Var.getClass();
                int iOrdinal4 = h2l0Var.ordinal();
                if (iOrdinal4 == 0) {
                    function1.invoke(new ylp(new npn(ilpVar.f14991a, ilpVar.c, Long.valueOf(ilpVar.e), ilpVar.d), !ilpVar.m.f6295a));
                } else if (iOrdinal4 == 1) {
                    function1.invoke(new omp(ilpVar.f14991a));
                } else if (iOrdinal4 == 2) {
                    function1.invoke(new emp(ilpVar.f14991a));
                }
                break;
            default:
                h2l0Var.getClass();
                if (z9k0.f44024a[h2l0Var.ordinal()] == 1) {
                    function1.invoke(new omp(ilpVar.f14991a));
                }
                break;
        }
        return Unit.f46060a;
    }
}
