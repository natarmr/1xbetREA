package a;

/* JADX INFO: loaded from: classes4.dex */
public interface xkb0 {
    default sh60 a() {
        c0o c0oVar = sh60.d;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            sh60 sh60Var = (sh60) y2VarH.next();
            if (sh60Var.f32197a.contains(b())) {
                return sh60Var;
            }
        }
        v4i0.o("Collection contains no element matching the predicate.");
        return null;
    }

    skb0 b();
}
