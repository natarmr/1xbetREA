package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tk10 {
    public static uk10 a(int i) {
        Object next;
        c0o c0oVar = uk10.j;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!((uk10) next).f35805a.equals(String.valueOf(i)));
        uk10 uk10Var = (uk10) next;
        return uk10Var == null ? uk10.NOTHING : uk10Var;
    }

    public final jiy serializer() {
        return vk10.f37554a;
    }
}
