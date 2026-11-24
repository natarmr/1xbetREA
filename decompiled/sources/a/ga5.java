package a;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class ga5 implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10949a;
    public final fq80 b;
    public final r3k0 c;

    public ga5(byte b) {
        this.f10949a = b;
        switch (b) {
            case 1:
                this.b = new fq80(4);
                this.c = new r3k0(-1, -1, "image/webp");
                break;
            default:
                this.b = new fq80(4);
                this.c = new r3k0(-1, -1, "image/avif");
                break;
        }
    }

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) {
        byte b = this.f10949a;
        r3k0 r3k0Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return r3k0Var.a(guoVar, mtcVar);
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        byte b = this.f10949a;
        r3k0 r3k0Var = this.c;
        switch (b) {
            case 0:
                r3k0Var.b(j, j2);
                break;
            default:
                r3k0Var.b(j, j2);
                break;
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) throws EOFException, InterruptedIOException {
        byte b = this.f10949a;
        fq80 fq80Var = this.b;
        switch (b) {
            case 0:
                guj gujVar = (guj) guoVar;
                gujVar.f(4, false);
                fq80Var.J(4);
                gujVar.b(fq80Var.f9961a, 0, 4, false);
                if (fq80Var.B() == 1718909296) {
                    fq80Var.J(4);
                    gujVar.b(fq80Var.f9961a, 0, 4, false);
                    if (fq80Var.B() == 1635150182) {
                        return true;
                    }
                }
                return false;
            default:
                fq80Var.J(4);
                guj gujVar2 = (guj) guoVar;
                gujVar2.b(fq80Var.f9961a, 0, 4, false);
                if (fq80Var.B() == 1380533830) {
                    gujVar2.f(4, false);
                    fq80Var.J(4);
                    gujVar2.b(fq80Var.f9961a, 0, 4, false);
                    if (fq80Var.B() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        byte b = this.f10949a;
        r3k0 r3k0Var = this.c;
        switch (b) {
            case 0:
                r3k0Var.e(huoVar);
                break;
            default:
                r3k0Var.e(huoVar);
                break;
        }
    }

    @Override // a.fuo
    public final void release() {
        byte b = this.f10949a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
