package a;

import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c8b0 extends eiu0 {
    public final ctf0 c;

    public c8b0(ctf0 ctf0Var) {
        this.c = ctf0Var;
    }

    public static void v(lc00 lc00Var, lc00 lc00Var2, y4t y4tVar) {
        Object next;
        ListIterator listIterator = lc00Var2.listIterator(0);
        do {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                next = null;
                break;
            }
            next = pawVar.next();
        } while (!Intrinsics.d(((uv60) next).c(), y4tVar.f42020a));
        uv60 uv60Var = (uv60) next;
        if (uv60Var != null) {
            lc00Var.add(uv60Var);
        }
    }
}
