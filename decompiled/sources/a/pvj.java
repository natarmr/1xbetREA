package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class pvj implements pcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f27664a;
    public sbz c;
    public boolean d;
    public float f;
    public int b = -1;
    public int e = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public pvj(int i) {
        this.f27664a = i;
    }

    public static int d(mcz mczVar, boolean z) {
        return z ? ((ncz) CollectionsKt.d0(mczVar.l)).f23317a + 1 : ((ncz) CollectionsKt.U(mczVar.l)).f23317a - 1;
    }

    @Override // a.pcz
    public final void a(jru jruVar, mcz mczVar) {
        List list = mczVar.l;
        int i = this.b;
        boolean z = this.d;
        if (i != -1 && !list.isEmpty() && i != d(mczVar, z)) {
            this.b = -1;
            sbz sbzVar = this.c;
            if (sbzVar != null) {
                sbzVar.cancel();
            }
            this.c = null;
        }
        int i2 = mczVar.o;
        int i3 = this.e;
        if (i3 != -1 && this.f != 0.0f && i3 != i2 && !list.isEmpty()) {
            int iD = d(mczVar, this.f < 0.0f);
            if (iD >= 0 && iD < i2) {
                this.b = iD;
                this.c = jruVar.j(iD, null);
            }
        }
        this.e = i2;
    }

    @Override // a.pcz
    public final void b(rbz rbzVar, int i) {
        int i2 = rbzVar.f30213a;
        if (i2 == -1) {
            i2 = this.f27664a;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            rbzVar.a(i + i3);
        }
    }

    @Override // a.pcz
    public final void c(jru jruVar, float f, mcz mczVar) {
        sbz sbzVar;
        sbz sbzVar2;
        if (!mczVar.l.isEmpty()) {
            boolean z = f < 0.0f;
            int iD = d(mczVar, z);
            if (iD >= 0 && iD < mczVar.o) {
                if (iD != this.b) {
                    if (this.d != z) {
                        this.b = -1;
                        sbz sbzVar3 = this.c;
                        if (sbzVar3 != null) {
                            sbzVar3.cancel();
                        }
                        this.c = null;
                    }
                    this.d = z;
                    this.b = iD;
                    this.c = jruVar.j(iD, null);
                }
                List list = mczVar.l;
                if (z) {
                    ncz nczVar = (ncz) CollectionsKt.d0(list);
                    if (((nczVar.p + nczVar.q) + mczVar.s) - mczVar.n < (-f) && (sbzVar2 = this.c) != null) {
                        sbzVar2.a();
                    }
                } else if (mczVar.m - ((ncz) CollectionsKt.U(list)).p < f && (sbzVar = this.c) != null) {
                    sbzVar.a();
                }
            }
        }
        this.f = f;
    }
}
