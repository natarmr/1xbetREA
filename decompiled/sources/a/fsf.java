package a;

/* JADX INFO: loaded from: classes4.dex */
public final class fsf {
    public static gsf a(Integer num) {
        Object next;
        c0o c0oVar = gsf.c;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            next = y2VarH.next();
            if (((gsf) next).f11827a.equals(String.valueOf(num))) {
                return (gsf) next;
            }
        }
        next = null;
        return (gsf) next;
    }

    public final jiy serializer() {
        return hsf.f13579a;
    }
}
