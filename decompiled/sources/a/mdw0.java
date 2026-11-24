package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mdw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21617a;
    public long b;
    public Object c;
    public int d;

    public mdw0(bew0 bew0Var) {
        bew0Var.getClass();
    }

    public static /* synthetic */ String b(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public long a() {
        int i;
        long j = this.b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        mv40 mv40Var = (mv40) this.c;
        long j2 = j * ((long) mv40Var.f);
        int i2 = this.f21617a;
        if (i2 != -1 && (i = this.d) != -1) {
            j2 -= (long) (i2 + i);
        }
        if (j2 <= 0) {
            return -9223372036854775807L;
        }
        return vtt0.R(mv40Var.c, j2 - 1);
    }
}
