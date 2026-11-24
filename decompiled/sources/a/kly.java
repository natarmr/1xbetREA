package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kly {
    public static final kly d = new kly(null, null, null, 63);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f18513a;
    public final Function1 b;
    public final Function1 c;

    public kly(Function1 function1, Function1 function2, Function1 function3, int i) {
        function1 = (i & 1) != 0 ? null : function1;
        function2 = (i & 4) != 0 ? null : function2;
        function3 = (i & 16) != 0 ? null : function3;
        this.f18513a = function1;
        this.b = function2;
        this.c = function3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kly)) {
            return false;
        }
        kly klyVar = (kly) obj;
        return this.f18513a == klyVar.f18513a && this.b == klyVar.b && this.c == klyVar.c;
    }

    public final int hashCode() {
        Function1 function1 = this.f18513a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 961;
        Function1 function2 = this.b;
        int iHashCode2 = (iHashCode + (function2 != null ? function2.hashCode() : 0)) * 961;
        Function1 function3 = this.c;
        return (iHashCode2 + (function3 != null ? function3.hashCode() : 0)) * 31;
    }
}
