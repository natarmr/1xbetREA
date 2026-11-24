package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pkk0 f16739a;
    public kly b;
    public wpq c;

    public jly(pkk0 pkk0Var) {
        this.f16739a = pkk0Var;
    }

    public final kly a() {
        kly klyVar = this.b;
        if (klyVar != null) {
            return klyVar;
        }
        Intrinsics.h("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        Function1 function1;
        pkk0 pkk0Var;
        if (i == 7) {
            function1 = a().f18513a;
        } else {
            if (i == 2) {
                a();
            } else if (i == 6) {
                function1 = a().b;
            } else if (i == 5) {
                a();
            } else if (i == 3) {
                function1 = a().c;
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                jf4.n("invalid ImeAction");
                return false;
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        if (i == 6) {
            wpq wpqVar = this.c;
            if (wpqVar != null) {
                ((ypq) wpqVar).i(1, true);
                return true;
            }
            Intrinsics.h("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (pkk0Var = this.f16739a) == null) {
                return false;
            }
            ((r3k) pkk0Var).a();
            return true;
        }
        wpq wpqVar2 = this.c;
        if (wpqVar2 != null) {
            ((ypq) wpqVar2).i(2, true);
            return true;
        }
        Intrinsics.h("focusManager");
        throw null;
    }
}
