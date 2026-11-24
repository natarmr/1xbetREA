package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mzn extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22662a;
    public final /* synthetic */ ozn b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzn(ozn oznVar, long j, byte b) {
        super(1);
        this.f22662a = b;
        this.b = oznVar;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function2;
        Function1 function3;
        Function1 function4;
        int iOrdinal;
        byte b = this.f22662a;
        long j = this.c;
        long jC = 0;
        ozn oznVar = this.b;
        switch (b) {
            case 0:
                int iOrdinal2 = ((azn) obj).ordinal();
                if (iOrdinal2 == 0) {
                    isb isbVar = oznVar.t.f27854a.c;
                    if (isbVar != null && (function1 = isbVar.b) != null) {
                        j = ((qkx) function1.invoke(new qkx(j))).f28908a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    isb isbVar2 = oznVar.u.f1078a.c;
                    if (isbVar2 != null && (function2 = isbVar2.b) != null) {
                        j = ((qkx) function2.invoke(new qkx(j))).f28908a;
                    }
                }
                return new qkx(j);
            case 1:
                azn aznVar = (azn) obj;
                if (aznVar == azn.c && oznVar.u.f1078a.b == null) {
                    jC = oznVar.v.i;
                } else {
                    e8k0 e8k0Var = oznVar.t.f27854a.b;
                    long j2 = (e8k0Var == null || (function4 = e8k0Var.f7377a) == null) ? 0L : ((ikx) function4.invoke(new qkx(j))).f14950a;
                    e8k0 e8k0Var2 = oznVar.u.f1078a.b;
                    long j3 = (e8k0Var2 == null || (function3 = e8k0Var2.f7377a) == null) ? 0L : ((ikx) function3.invoke(new qkx(j))).f14950a;
                    int iOrdinal3 = aznVar.ordinal();
                    if (iOrdinal3 == 0) {
                        jC = j2;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            t9f.b();
                            return null;
                        }
                        jC = j3;
                    }
                }
                return new ikx(jC);
            default:
                azn aznVar2 = (azn) obj;
                if (oznVar.z != null && oznVar.b1() != null && !Intrinsics.d(oznVar.z, oznVar.b1()) && (iOrdinal = aznVar2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    isb isbVar3 = oznVar.u.f1078a.c;
                    if (isbVar3 != null) {
                        Function1 function5 = isbVar3.b;
                        long j4 = this.c;
                        long j5 = ((qkx) function5.invoke(new qkx(j4))).f28908a;
                        u12 u12VarB1 = oznVar.b1();
                        u12VarB1.getClass();
                        k6z k6zVar = k6z.f17794a;
                        long jA = u12VarB1.a(j4, j5, k6zVar);
                        u12 u12Var = oznVar.z;
                        u12Var.getClass();
                        jC = ikx.c(jA, u12Var.a(j4, j5, k6zVar));
                    }
                }
                return new ikx(jC);
        }
    }
}
