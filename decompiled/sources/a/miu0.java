package a;

/* JADX INFO: loaded from: classes6.dex */
public interface miu0 {
    default diu0 a(sgy sgyVar, by40 by40Var) {
        sgyVar.getClass();
        return c(azw.G(sgyVar), by40Var);
    }

    default diu0 b(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default diu0 c(Class cls, by40 by40Var) {
        return b(cls);
    }
}
