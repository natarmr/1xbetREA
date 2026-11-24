package a;

/* JADX INFO: loaded from: classes5.dex */
public final class r470 {
    public static s470 a(long j) {
        Object next;
        c0o c0oVar = s470.v;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((s470) next).a() != j);
        s470 s470Var = (s470) next;
        return s470Var == null ? s470.GAME_UNAVAILABLE : s470Var;
    }

    public final jiy serializer() {
        return c570.f3758a;
    }
}
