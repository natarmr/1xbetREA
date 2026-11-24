package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o340 implements etf {
    public static final dmd b = new dmd(new sf9(new sd9((byte) 8), s950.b), new sf9(new sd9((byte) 9), s950.c));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24565a = new ArrayList();

    @Override // a.etf
    public final boolean a(ftf ftfVar, long j) {
        long j2 = ftfVar.b;
        x0x.A(j2 != -9223372036854775807L);
        x0x.A(ftfVar.c != -9223372036854775807L);
        boolean z = j2 <= j && j < ftfVar.d;
        ArrayList arrayList = this.f24565a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((ftf) arrayList.get(size)).b) {
                arrayList.add(size + 1, ftfVar);
                return z;
            }
        }
        arrayList.add(0, ftfVar);
        return z;
    }

    @Override // a.etf
    public final b4x b(long j) {
        ArrayList arrayList = this.f24565a;
        if (!arrayList.isEmpty()) {
            if (j >= ((ftf) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    ftf ftfVar = (ftf) arrayList.get(i);
                    if (j >= ftfVar.b && j < ftfVar.d) {
                        arrayList2.add(ftfVar);
                    }
                    if (j < ftfVar.b) {
                        break;
                    }
                }
                rcf0 rcf0VarF = b4x.F(b, arrayList2);
                u3x u3xVarL = b4x.l();
                for (int i2 = 0; i2 < rcf0VarF.d; i2++) {
                    u3xVarL.c(((ftf) rcf0VarF.get(i2)).f10109a);
                }
                return u3xVarL.g();
            }
        }
        v3x v3xVar = b4x.b;
        return rcf0.e;
    }

    @Override // a.etf
    public final long c(long j) {
        ArrayList arrayList = this.f24565a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((ftf) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((ftf) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((ftf) arrayList.get(i)).b;
            long j3 = ((ftf) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // a.etf
    public final void clear() {
        this.f24565a.clear();
    }

    @Override // a.etf
    public final long d(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f24565a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((ftf) arrayList.get(i)).b;
            long j3 = ((ftf) arrayList.get(i)).d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // a.etf
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f24565a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((ftf) arrayList.get(i)).b;
            if (j > j2 && j > ((ftf) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
