package a;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public class lgi0 extends jgi0 {
    public static v2e b(Iterator it) {
        it.getClass();
        return new v2e(new sx3(it, (byte) 4));
    }

    public static final ckq c(Sequence sequence, Function1 function1) {
        if (!(sequence instanceof qls0)) {
            return new ckq(sequence, new eoh0((byte) 24), function1);
        }
        qls0 qls0Var = (qls0) sequence;
        return new ckq(qls0Var.f28951a, qls0Var.b, function1);
    }

    public static v2e d(Function0 function0) {
        return new v2e(new tjt(function0, new r3w(function0, (byte) 25)));
    }

    public static Sequence e(Function1 function1, Object obj) {
        function1.getClass();
        return obj == null ? wun.f39799a : new tjt(new xhd(obj, (byte) 3), function1);
    }
}
