package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class au00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1456a;
    public final Function0 b;

    public au00(Object obj, Function0 function0) {
        this.f1456a = obj;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && au00.class == obj.getClass() && this.f1456a.equals(((au00) obj).f1456a);
    }

    public final int hashCode() {
        return this.f1456a.hashCode();
    }
}
