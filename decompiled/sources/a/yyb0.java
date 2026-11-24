package a;

/* JADX INFO: loaded from: classes.dex */
public class yyb0 extends z7k0 {
    public final jy40 d;
    public volatile ncq0 e;
    public volatile ncq0 f;

    public yyb0(dvn dvnVar, int i, String str) {
        super(dvnVar, o9d.f24874a.incrementAndGet());
        int i2 = f710.f9038a;
        this.d = new jy40(6);
        new hz40();
    }

    public ncq0 c(long j, long j2, String str) {
        ncq0 ncq0Var;
        synchronized (this.d) {
            try {
                jy40 jy40Var = this.d;
                Object objD = jy40Var.d(j);
                if (objD == null) {
                    ncq0 ncq0Var2 = new ncq0(j, j2, str, this);
                    jy40Var.g(ncq0Var2, j);
                    objD = ncq0Var2;
                }
                ncq0Var = (ncq0) objD;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ncq0Var;
    }
}
