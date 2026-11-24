package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ya4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42276a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ ya4(Function0 function0, Function1 function1, byte b) {
        this.f42276a = b;
        this.c = function0;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        byte b = this.f42276a;
        byte b2 = 1;
        Function0 function0 = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                function0.invoke();
                function1.invoke(new t94(iIntValue));
                return Unit.f46060a;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                if (iIntValue2 == 0) {
                    function1.invoke(k17.f17506a);
                } else if (iIntValue2 == 1) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 2:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new sw8(cpVar, function1, function0, b2));
                return Unit.f46060a;
            case 3:
                kim kimVar = (kim) obj;
                kimVar.getClass();
                if (kimVar instanceof eim) {
                    function0.invoke();
                } else if (kimVar instanceof iim) {
                    function1.invoke(new jjp(((iim) kimVar).f14835a));
                } else if (kimVar instanceof jim) {
                    function1.invoke(new mjp(((jim) kimVar).f16582a));
                } else if (kimVar instanceof him) {
                    function1.invoke(new ljp(((him) kimVar).f13119a));
                } else if (kimVar instanceof gim) {
                    function1.invoke(ijp.f14885a);
                } else {
                    if (!(kimVar instanceof fim)) {
                        t9f.b();
                        return null;
                    }
                    int i = ((fim) kimVar).f9595a;
                    if (i == 0) {
                        obj2 = djp.f6199a;
                    } else if (i == 1) {
                        obj2 = cjp.f4472a;
                    } else if (i == 2) {
                        obj2 = fjp.f9654a;
                    } else if (i == 3) {
                        obj2 = bjp.f2717a;
                    } else {
                        if (i != 4) {
                            return Unit.f46060a;
                        }
                        obj2 = ejp.f7919a;
                    }
                    function1.invoke(obj2);
                }
                return Unit.f46060a;
            case 4:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                t2k t2kVar = (t2k) cpVar2.u;
                t2kVar.b.setOnItemClickListener(new nc40(function1, (byte) 11));
                t2kVar.c.setButtonClickListener(new c0(function0, (byte) 13));
                cpVar2.t(new ctv(cpVar2, cpVar2, (byte) 18));
                return Unit.f46060a;
            default:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    function1.invoke(((w5q0) x5q0Var).f38596a);
                } else if (x5q0Var instanceof v5q0) {
                    function0.invoke();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ya4(Function1 function1, Function0 function0, byte b) {
        this.f42276a = b;
        this.b = function1;
        this.c = function0;
    }
}
