package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cwy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5099a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ olp c;

    public /* synthetic */ cwy(Function1 function1, olp olpVar, byte b) {
        this.f5099a = b;
        this.b = function1;
        this.c = olpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5099a;
        olp olpVar = this.c;
        Function1 function1 = this.b;
        h2l0 h2l0Var = (h2l0) obj;
        switch (b) {
            case 0:
                h2l0Var.getClass();
                int iOrdinal = h2l0Var.ordinal();
                if (iOrdinal == 0) {
                    function1.invoke(new ylp(new npn(olpVar.f25467a, olpVar.c, Long.valueOf(olpVar.d), false), !olpVar.j.f16728a));
                } else if (iOrdinal == 1) {
                    function1.invoke(new omp(olpVar.f25467a));
                }
                break;
            case 1:
                h2l0Var.getClass();
                int iOrdinal2 = h2l0Var.ordinal();
                if (iOrdinal2 == 0) {
                    function1.invoke(new ylp(new npn(olpVar.f25467a, olpVar.c, Long.valueOf(olpVar.d), false), !olpVar.j.f16728a));
                } else if (iOrdinal2 == 1) {
                    function1.invoke(new omp(olpVar.f25467a));
                }
                break;
            case 2:
                h2l0Var.getClass();
                int iOrdinal3 = h2l0Var.ordinal();
                if (iOrdinal3 == 0) {
                    function1.invoke(new ylp(new npn(olpVar.f25467a, olpVar.c, Long.valueOf(olpVar.d), false), !olpVar.j.f16728a));
                } else if (iOrdinal3 == 1) {
                    function1.invoke(new omp(olpVar.f25467a));
                }
                break;
            case 3:
                h2l0Var.getClass();
                int iOrdinal4 = h2l0Var.ordinal();
                if (iOrdinal4 == 0) {
                    function1.invoke(new ylp(new npn(olpVar.f25467a, olpVar.c, Long.valueOf(olpVar.d), false), !olpVar.j.f16728a));
                } else if (iOrdinal4 == 1) {
                    function1.invoke(new omp(olpVar.f25467a));
                } else if (iOrdinal4 == 2) {
                    function1.invoke(new emp(olpVar.f25467a));
                }
                break;
            default:
                h2l0Var.getClass();
                if (z9k0.f44024a[h2l0Var.ordinal()] == 1) {
                    function1.invoke(new omp(olpVar.f25467a));
                }
                break;
        }
        return Unit.f46060a;
    }
}
