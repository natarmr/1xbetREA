package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class maz {
    public static a8z a(wez wezVar, Function0 function0) {
        int iOrdinal = wezVar.ordinal();
        if (iOrdinal == 0) {
            return new n0o0(function0, null, 2, null);
        }
        if (iOrdinal == 1) {
            ftg0 ftg0Var = new ftg0();
            ftg0Var.f10111a = function0;
            ftg0Var.b = m2t0.f21082a;
            return ftg0Var;
        }
        if (iOrdinal != 2) {
            t9f.b();
            return null;
        }
        bft0 bft0Var = new bft0();
        bft0Var.f2520a = function0;
        bft0Var.b = m2t0.f21082a;
        return bft0Var;
    }

    public static n0o0 b(Function0 function0) {
        function0.getClass();
        return new n0o0(function0, null, 2, null);
    }
}
