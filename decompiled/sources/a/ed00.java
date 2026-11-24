package a;

/* JADX INFO: loaded from: classes.dex */
public final class ed00 {
    public static bmx a(Object obj, long j) {
        bmx bmxVar = (bmx) jft0.h(obj, j);
        if (((f5d0) bmxVar).f8958a) {
            return bmxVar;
        }
        f5d0 f5d0Var = (f5d0) bmxVar;
        int i = f5d0Var.c;
        f5d0 f5d0VarE = f5d0Var.e(i == 0 ? 10 : i * 2);
        jft0.o(obj, j, f5d0VarE);
        return f5d0VarE;
    }
}
