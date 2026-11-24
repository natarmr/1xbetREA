package a;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class xuv implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41529a;
    public final r3k0 b;
    public huo c;
    public fuo d;
    public Pair e;
    public final fuo f;

    public xuv(int i, byte b) {
        this.f41529a = b;
        switch (b) {
            case 1:
                this.b = new r3k0(65496, 2, "image/jpeg");
                this.f = (i & 1) == 0 ? new tby() : null;
                break;
            default:
                this.b = new r3k0(-1, -1, "image/heif");
                this.f = (i & 1) != 0 ? null : new wuv();
                break;
        }
    }

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) {
        byte b = this.f41529a;
        fuo fuoVar = this.b;
        fuo fuoVar2 = this.f;
        switch (b) {
            case 0:
                fuo fuoVar3 = this.d;
                if (fuoVar3 == null) {
                    wuv wuvVar = (wuv) fuoVar2;
                    x0x.K(fuoVar3 == null);
                    wuvVar.getClass();
                    if (d5c.U(guoVar, true)) {
                        fuoVar = wuvVar;
                    }
                    this.d = fuoVar;
                    guoVar.g();
                    Pair pair = this.e;
                    if (pair != null) {
                        this.d.b(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    fuo fuoVar4 = this.d;
                    huo huoVar = this.c;
                    huoVar.getClass();
                    fuoVar4.e(huoVar);
                }
                break;
            default:
                fuo fuoVar5 = this.d;
                if (fuoVar5 == null) {
                    tby tbyVar = (tby) fuoVar2;
                    x0x.K(fuoVar5 == null);
                    tbyVar.getClass();
                    if (tbyVar.c(guoVar)) {
                        fuoVar = tbyVar;
                    }
                    this.d = fuoVar;
                    guoVar.g();
                    Pair pair2 = this.e;
                    if (pair2 != null) {
                        this.d.b(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    fuo fuoVar6 = this.d;
                    huo huoVar2 = this.c;
                    huoVar2.getClass();
                    fuoVar6.e(huoVar2);
                }
                break;
        }
        return this.d.a(guoVar, mtcVar);
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        switch (this.f41529a) {
            case 0:
                fuo fuoVar = this.d;
                if (fuoVar == null) {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                } else {
                    fuoVar.b(j, j2);
                }
                break;
            default:
                fuo fuoVar2 = this.d;
                if (fuoVar2 == null) {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                } else {
                    fuoVar2.b(j, j2);
                }
                break;
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        byte b = this.f41529a;
        fuo fuoVar = this.f;
        switch (b) {
            case 0:
                if (((wuv) fuoVar) != null && d5c.U(guoVar, true)) {
                    return true;
                }
                ((guj) guoVar).f = 0;
                return d5c.U(guoVar, false);
            default:
                tby tbyVar = (tby) fuoVar;
                if (tbyVar != null && tbyVar.c(guoVar)) {
                    return true;
                }
                ((guj) guoVar).f = 0;
                return this.b.c(guoVar);
        }
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        byte b = this.f41529a;
        r3k0 r3k0Var = this.b;
        fuo fuoVar = this.f;
        switch (b) {
            case 0:
                this.c = huoVar;
                if (((wuv) fuoVar) == null) {
                    this.d = r3k0Var;
                    r3k0Var.e(huoVar);
                }
                break;
            default:
                this.c = huoVar;
                if (((tby) fuoVar) == null) {
                    this.d = r3k0Var;
                    r3k0Var.e(huoVar);
                }
                break;
        }
    }

    @Override // a.fuo
    public final void release() {
        byte b = this.f41529a;
        fuo fuoVar = this.f;
        switch (b) {
            case 0:
                wuv wuvVar = (wuv) fuoVar;
                if (wuvVar != null) {
                    wuvVar.release();
                }
                break;
            default:
                tby tbyVar = (tby) fuoVar;
                if (tbyVar != null) {
                    tbyVar.release();
                }
                break;
        }
    }
}
