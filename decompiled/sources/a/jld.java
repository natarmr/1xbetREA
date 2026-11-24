package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jld implements hgi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rcf0 f16710a;
    public long b;

    public jld(List list, List list2) {
        u3x u3xVarL = b4x.l();
        x0x.A(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            u3xVarL.b(new ild((hgi0) list.get(i), (List) list2.get(i)));
        }
        this.f16710a = u3xVarL.g();
        this.b = -9223372036854775807L;
    }

    @Override // a.hgi0
    public final long b() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            rcf0 rcf0Var = this.f16710a;
            if (i >= rcf0Var.d) {
                break;
            }
            long jB = ((ild) rcf0Var.get(i)).f14972a.b();
            if (jB != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // a.hgi0
    public final boolean e() {
        int i = 0;
        while (true) {
            rcf0 rcf0Var = this.f16710a;
            if (i >= rcf0Var.d) {
                return false;
            }
            if (((ild) rcf0Var.get(i)).f14972a.e()) {
                return true;
            }
            i++;
        }
    }

    @Override // a.hgi0
    public final boolean g(yq00 yq00Var) {
        boolean zG;
        boolean z = false;
        do {
            long jB = b();
            if (jB == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zG = false;
            while (true) {
                rcf0 rcf0Var = this.f16710a;
                if (i >= rcf0Var.d) {
                    break;
                }
                long jB2 = ((ild) rcf0Var.get(i)).f14972a.b();
                boolean z2 = jB2 != Long.MIN_VALUE && jB2 <= yq00Var.f43053a;
                if (jB2 == jB || z2) {
                    zG |= ((ild) rcf0Var.get(i)).f14972a.g(yq00Var);
                }
                i++;
            }
            z |= zG;
        } while (zG);
        return z;
    }

    @Override // a.hgi0
    public final long s() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            rcf0 rcf0Var = this.f16710a;
            if (i >= rcf0Var.d) {
                break;
            }
            ild ildVar = (ild) rcf0Var.get(i);
            long jS = ildVar.f14972a.s();
            b4x b4xVar = ildVar.b;
            if ((b4xVar.contains(1) || b4xVar.contains(2) || b4xVar.contains(4)) && jS != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jS);
            }
            if (jS != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jS);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // a.hgi0
    public final void v(long j) {
        int i = 0;
        while (true) {
            rcf0 rcf0Var = this.f16710a;
            if (i >= rcf0Var.d) {
                return;
            }
            ((ild) rcf0Var.get(i)).v(j);
            i++;
        }
    }
}
