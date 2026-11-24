package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r3l0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29795a;
    public final /* synthetic */ dsm b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ r3l0(dsm dsmVar, Function0 function0, Function0 function1, Function1 function2, byte b) {
        this.f29795a = b;
        this.b = dsmVar;
        this.c = function0;
        this.d = function1;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29795a;
        Function1 function1 = this.e;
        Function0 function0 = this.d;
        Function0 function2 = this.c;
        dsm dsmVar = this.b;
        switch (b) {
            case 0:
                if (dsmVar instanceof asm) {
                    if (function2 != null) {
                        function2.invoke();
                    }
                } else if (dsmVar instanceof bsm) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    if (!(dsmVar instanceof csm)) {
                        t9f.b();
                        return null;
                    }
                    if (function1 != null) {
                        function1.invoke(((csm) dsmVar).f4897a);
                    }
                }
                return Unit.f46060a;
            case 1:
                if (dsmVar instanceof asm) {
                    if (function2 != null) {
                        function2.invoke();
                    }
                } else if (dsmVar instanceof bsm) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    if (!(dsmVar instanceof csm)) {
                        t9f.b();
                        return null;
                    }
                    if (function1 != null) {
                        function1.invoke(((csm) dsmVar).f4897a);
                    }
                }
                return Unit.f46060a;
            case 2:
                if (dsmVar instanceof asm) {
                    if (function2 != null) {
                        function2.invoke();
                    }
                } else if (dsmVar instanceof bsm) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    if (!(dsmVar instanceof csm)) {
                        t9f.b();
                        return null;
                    }
                    if (function1 != null) {
                        function1.invoke(((csm) dsmVar).f4897a);
                    }
                }
                return Unit.f46060a;
            default:
                if (dsmVar instanceof asm) {
                    if (function2 != null) {
                        function2.invoke();
                    }
                } else if (dsmVar instanceof bsm) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    if (!(dsmVar instanceof csm)) {
                        t9f.b();
                        return null;
                    }
                    if (function1 != null) {
                        function1.invoke(((csm) dsmVar).f4897a);
                    }
                }
                return Unit.f46060a;
        }
    }
}
