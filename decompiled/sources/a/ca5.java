package a;

/* JADX INFO: loaded from: classes.dex */
public class ca5 implements fvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3991a;
    public final long b;
    public final Object c;

    public ca5(long j, long j2) {
        this.f3991a = (byte) 2;
        this.b = j;
        hvh0 hvh0Var = j2 == 0 ? hvh0.c : new hvh0(0L, j2);
        this.c = new evh0(hvh0Var, hvh0Var);
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        byte b = this.f3991a;
        int i = 1;
        Object obj = this.c;
        switch (b) {
            case 0:
                da5 da5Var = (da5) obj;
                evh0 evh0VarB = da5Var.i[0].b(j);
                while (true) {
                    bjc[] bjcVarArr = da5Var.i;
                    if (i >= bjcVarArr.length) {
                        return evh0VarB;
                    }
                    evh0 evh0VarB2 = bjcVarArr[i].b(j);
                    if (evh0VarB2.f8467a.b < evh0VarB.f8467a.b) {
                        evh0VarB = evh0VarB2;
                    }
                    i++;
                }
                break;
            case 1:
                ajq ajqVar = (ajq) obj;
                ajqVar.k.getClass();
                jtj jtjVar = ajqVar.k;
                long[] jArr = (long[]) jtjVar.b;
                long[] jArr2 = (long[]) jtjVar.c;
                int iF = vtt0.f(jArr, vtt0.j((((long) ajqVar.e) * j) / 1000000, 0L, ajqVar.j - 1), false);
                long j2 = iF == -1 ? 0L : jArr[iF];
                long j3 = iF != -1 ? jArr2[iF] : 0L;
                int i2 = ajqVar.e;
                long j4 = (j2 * 1000000) / ((long) i2);
                long j5 = this.b;
                hvh0 hvh0Var = new hvh0(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new evh0(hvh0Var, hvh0Var);
                }
                int i3 = iF + 1;
                return new evh0(hvh0Var, new hvh0((jArr[i3] * 1000000) / ((long) i2), j5 + jArr2[i3]));
            default:
                return (evh0) obj;
        }
    }

    @Override // a.fvh0
    public final boolean d() {
        switch (this.f3991a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // a.fvh0
    public final long g() {
        switch (this.f3991a) {
            case 0:
                return this.b;
            case 1:
                return ((ajq) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ca5(long j) {
        this(j, 0L);
        this.f3991a = (byte) 2;
    }

    public /* synthetic */ ca5(Object obj, long j, byte b) {
        this.f3991a = b;
        this.c = obj;
        this.b = j;
    }
}
