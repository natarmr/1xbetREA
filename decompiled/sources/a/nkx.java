package a;

import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class nkx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23702a = 0;

    public final String toString() {
        int i = this.f23702a;
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        string.getClass();
        return "IntRef(element = " + i + ")@" + string;
    }
}
