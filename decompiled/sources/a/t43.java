package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class t43 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33299a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t43(Object obj, byte b) {
        super(2);
        this.f33299a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33299a;
        boolean z = true;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                azn aznVar = (azn) obj;
                azn aznVar2 = (azn) obj2;
                azn aznVar3 = azn.c;
                return Boolean.valueOf(aznVar == aznVar3 && aznVar2 == aznVar3 && !((alo) obj3).f1078a.e);
            case 1:
                k810 k810Var = (k810) obj;
                v9d v9dVar = (v9d) obj2;
                k810Var.getClass();
                v9dVar.getClass();
                s9d s9dVar = (s9d) obj3;
                v9d v9dVar2 = s9dVar.e;
                for (jr20 jr20Var : s9dVar.i) {
                    if (jr20Var.b(v9dVar, k810Var)) {
                        return Boolean.valueOf(z);
                    }
                    if (jr20Var instanceof h98) {
                        v9dVar2.getClass();
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                long j = ((ne60) obj2).f23370a;
                ((dpa0) obj).a();
                ((lie0) obj3).f20100a = j;
                return Unit.f46060a;
        }
    }
}
