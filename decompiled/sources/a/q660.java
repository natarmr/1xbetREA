package a;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class q660 extends Error {
    /* JADX WARN: Illegal instructions before constructor call */
    public q660(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "An operation is not implemented." : str;
        str.getClass();
        super(str);
    }

    public q660() {
        this(null, 1, null);
    }
}
