package a;

/* JADX INFO: loaded from: classes.dex */
public final class x220 implements vmb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final clc f40147a;
    public qkx b;
    public k6z c;
    public qkx d;
    public ikx e;

    public x220(clc clcVar) {
        this.f40147a = clcVar;
    }

    @Override // a.vmb0
    public final long a(mkx mkxVar, long j, k6z k6zVar, long j2) {
        ikx ikxVar = this.e;
        if (ikxVar != null) {
            qkx qkxVar = this.b;
            if ((qkxVar == null ? false : qkx.a(qkxVar.f28908a, j)) && this.c == k6zVar) {
                qkx qkxVar2 = this.d;
                if (qkxVar2 != null ? qkx.a(qkxVar2.f28908a, j2) : false) {
                    return ikxVar.f14950a;
                }
            }
        }
        long jA = this.f40147a.a(mkxVar, j, k6zVar, j2);
        this.b = new qkx(j);
        this.c = k6zVar;
        this.d = new qkx(j2);
        this.e = new ikx(jA);
        return jA;
    }
}
