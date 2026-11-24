package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ce8 {
    public static de8 a(int i) {
        Object next;
        c0o c0oVar = de8.d;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!((de8) next).f5936a.equals(String.valueOf(i)));
        de8 de8Var = (de8) next;
        return de8Var == null ? de8.NOTHING : de8Var;
    }

    public final jiy serializer() {
        return ee8.f7658a;
    }
}
