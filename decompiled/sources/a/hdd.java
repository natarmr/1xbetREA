package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class hdd {
    public static gi2 a(Function1... function1Arr) {
        if (function1Arr.length > 0) {
            return new gi2(function1Arr, (byte) 1);
        }
        jf4.o("Failed requirement.");
        return null;
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
