package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yhd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42632a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ yhd(Function0 function0, Function0 function1, byte b) {
        this.f42632a = b;
        this.b = function0;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42632a;
        Function0 function0 = this.c;
        Function0 function1 = this.b;
        switch (b) {
            case 0:
                ilz ilzVar = (ilz) obj;
                ilzVar.getClass();
                if (function1 != null) {
                    function1.invoke();
                }
                return new zhd(ilzVar, function0, (byte) 0);
            case 1:
                nlz nlzVar = (nlz) obj;
                nlzVar.getClass();
                if (function1 != null) {
                    function1.invoke();
                }
                return new ub5(nlzVar, function0, (byte) 1);
            case 2:
                long jLongValue = ((Long) obj).longValue();
                if (jLongValue == 1) {
                    function1.invoke();
                } else if (jLongValue == 2) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke();
                } else if (iIntValue == 1) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 4:
                g5q0 g5q0Var = (g5q0) obj;
                function1.invoke();
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    g5q0Var.close();
                }
                return Unit.f46060a;
            case 5:
                int iIntValue2 = ((Integer) obj).intValue();
                byte b2 = 20;
                if (iIntValue2 == 0) {
                    dyb.Q(new xhl0(function1, b2));
                } else if (iIntValue2 == 1) {
                    dyb.Q(new xhl0(function0, b2));
                }
                return Unit.f46060a;
            case 6:
                int iIntValue3 = ((Integer) obj).intValue();
                byte b3 = 23;
                if (iIntValue3 == 0) {
                    dyb.Q(new xhl0(function1, b3));
                } else if (iIntValue3 == 1) {
                    dyb.Q(new xhl0(function0, b3));
                }
                return Unit.f46060a;
            default:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, otr0.b)) {
                    function1.invoke();
                } else if (Intrinsics.d(jtlVar, otr0.f25843a)) {
                    function0.invoke();
                }
                return Unit.f46060a;
        }
    }
}
