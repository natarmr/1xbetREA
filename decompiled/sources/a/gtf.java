package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gtf implements dfn0 {
    public static final sf9 c = new sf9(new sd9(4), s950.b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4x f11877a;
    public final long[] b;

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public gtf(rcf0 rcf0Var) {
        int i = rcf0Var.d;
        long j = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            v3x v3xVarListIterator = rcf0Var.listIterator(0);
            Object next = v3xVarListIterator.next();
            if (v3xVarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && v3xVarListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(v3xVarListIterator.next());
                    i2++;
                }
                if (v3xVarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            ftf ftfVar = (ftf) next;
            long j2 = ftfVar.b;
            long j3 = ftfVar.c;
            long j4 = j2 == -9223372036854775807L ? 0L : j2;
            b4x b4xVar = ftfVar.f10109a;
            if (j3 == -9223372036854775807L) {
                this.f11877a = b4x.t(b4xVar);
                this.b = new long[]{j4};
                return;
            } else {
                v3x v3xVar = b4x.b;
                this.f11877a = b4x.v(b4xVar, rcf0.e);
                this.b = new long[]{j4, j3 + j4};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        rcf0 rcf0VarF = b4x.F(c, rcf0Var);
        int i3 = 0;
        while (i2 < rcf0VarF.d) {
            ftf ftfVar2 = (ftf) rcf0VarF.get(i2);
            long j5 = ftfVar2.b;
            long j6 = ftfVar2.c;
            b4x b4xVar2 = ftfVar2.f10109a;
            j5 = j5 == j ? 0L : j5;
            long j7 = j5 + j6;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j8 = this.b[i4];
                if (j8 < j5) {
                    this.b[i3] = j5;
                    arrayList.add(b4xVar2);
                    i3++;
                } else if (j8 == j5 && ((b4x) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, b4xVar2);
                } else {
                    f1t0.g0("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.b[i4] = j5;
                    arrayList.set(i4, b4xVar2);
                }
            } else {
                this.b[i3] = j5;
                arrayList.add(b4xVar2);
                i3++;
            }
            if (j6 != j) {
                this.b[i3] = j7;
                arrayList.add(rcf0.e);
                i3++;
            }
            i2++;
            j = j;
        }
        this.f11877a = b4x.o(arrayList);
    }

    @Override // a.dfn0
    public final int a(long j) {
        int iB = vtt0.b(this.b, j, false);
        if (iB < this.f11877a.size()) {
            return iB;
        }
        return -1;
    }

    @Override // a.dfn0
    public final List e(long j) {
        int iF = vtt0.f(this.b, j, false);
        if (iF != -1) {
            return (b4x) this.f11877a.get(iF);
        }
        v3x v3xVar = b4x.b;
        return rcf0.e;
    }

    @Override // a.dfn0
    public final long j(int i) {
        x0x.A(i < this.f11877a.size());
        return this.b[i];
    }

    @Override // a.dfn0
    public final int l() {
        return this.f11877a.size();
    }
}
