package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ka2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17942a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ ka2(pz40 pz40Var, boolean z, Function1 function1, byte b) {
        this.f17942a = b;
        this.b = pz40Var;
        this.c = z;
        this.d = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17942a;
        byte b2 = 27;
        byte b3 = 12;
        byte b4 = 11;
        byte b5 = 3;
        byte b6 = 2;
        byte b7 = 4;
        Object[] objArr = 0;
        byte b8 = 5;
        v5q0 v5q0Var = v5q0.f36837a;
        Function1 function1 = this.d;
        boolean z = this.c;
        pz40 pz40Var = this.b;
        byte b9 = 1;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = (a4x) pz40Var.getValue();
                hczVar.f(a4xVar.size(), new g5(new dj1(b2), a4xVar, (byte) 25), new g5(new dj1((byte) 28), a4xVar, (byte) 26), new ugd(802480018, true, new ra2(a4xVar, z, function1, objArr == true ? 1 : 0)));
                break;
            case 1:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = (a4x) pz40Var.getValue();
                hczVar2.f(a4xVar2.size(), new g5(new xd2((byte) 0), a4xVar2, b2), new g5(new xd2((byte) 1), a4xVar2, (byte) 28), new ugd(802480018, true, new ra2(a4xVar2, z, function1, b9)));
                break;
            case 2:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                List list = (List) pz40Var.getValue();
                hczVar3.f(list.size(), new ci2(new h26(b4), list, (byte) 21), new ci2(new h26(b3), list, (byte) 22), new ugd(802480018, true, new cz0(list, z, function1, b6)));
                break;
            case 3:
                iqq iqqVar = (iqq) obj;
                iqqVar.getClass();
                boolean z2 = (pz40Var.getValue() == null && z) || iqqVar.b();
                if (!Intrinsics.d(pz40Var.getValue(), Boolean.valueOf(z2)) && function1 != null) {
                    function1.invoke(Boolean.valueOf(z2));
                }
                pz40Var.setValue(Boolean.valueOf(z2));
                break;
            case 4:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (z && x5q0Var.equals(v5q0Var)) {
                    pz40Var.setValue(Boolean.valueOf(true ^ ((Boolean) pz40Var.getValue()).booleanValue()));
                }
                function1.invoke(x5q0Var);
                break;
            case 5:
                x5q0 x5q0Var2 = (x5q0) obj;
                x5q0Var2.getClass();
                if (z && x5q0Var2.equals(v5q0Var)) {
                    pz40Var.setValue(Boolean.valueOf(true ^ ((Boolean) pz40Var.getValue()).booleanValue()));
                }
                function1.invoke(x5q0Var2);
                break;
            case 6:
                x5q0 x5q0Var3 = (x5q0) obj;
                x5q0Var3.getClass();
                if (z && x5q0Var3.equals(v5q0Var)) {
                    pz40Var.setValue(Boolean.valueOf(true ^ ((Boolean) pz40Var.getValue()).booleanValue()));
                }
                function1.invoke(x5q0Var3);
                break;
            case 7:
                x5q0 x5q0Var4 = (x5q0) obj;
                x5q0Var4.getClass();
                if (z && x5q0Var4.equals(v5q0Var)) {
                    pz40Var.setValue(Boolean.valueOf(true ^ ((Boolean) pz40Var.getValue()).booleanValue()));
                }
                function1.invoke(x5q0Var4);
                break;
            case 8:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                a4x a4xVar3 = (a4x) pz40Var.getValue();
                i8zVar.e(a4xVar3.size(), new zu90(b4, new kma0((byte) 18), a4xVar3), null, new zu90(b3, new kma0((byte) 19), a4xVar3), new ugd(-1117249557, true, new ra2(a4xVar3, z, function1, b5)));
                break;
            case 9:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                a4x a4xVar4 = (a4x) pz40Var.getValue();
                hczVar4.f(a4xVar4.size(), new pwe0(new wtf0((byte) 2), a4xVar4, b8), new pwe0(new wtf0((byte) 3), a4xVar4, (byte) 6), new ugd(802480018, true, new ra2(a4xVar4, z, function1, b7)));
                break;
            default:
                i8z i8zVar2 = (i8z) obj;
                i8zVar2.getClass();
                a4x a4xVar5 = (a4x) pz40Var.getValue();
                i8zVar2.e(a4xVar5.size(), new zcn0(new rgn0((byte) 23), a4xVar5, b7), null, new zcn0(new rgn0((byte) 24), a4xVar5, b8), new ugd(-1117249557, true, new ra2(a4xVar5, z, function1, b8)));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ka2(boolean z, Function1 function1, pz40 pz40Var, byte b) {
        this.f17942a = b;
        this.c = z;
        this.d = function1;
        this.b = pz40Var;
    }
}
