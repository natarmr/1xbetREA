package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b5q0 extends t4q0 {
    public final String b;
    public final int c;
    public final Function1 d;

    public b5q0(Object obj, String str, int i, Function1 function1) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = function1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.f33334a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
