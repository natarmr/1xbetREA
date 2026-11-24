package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bi9 implements etf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2649a;
    public ArrayList b;

    public bi9(byte b) {
        this.f2649a = b;
        switch (b) {
            case 1:
                this.b = new ArrayList();
                break;
            default:
                this.b = null;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // a.etf
    public boolean a(ftf ftfVar, long j) {
        boolean z;
        ArrayList arrayList = this.b;
        long j2 = ftfVar.b;
        x0x.A(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = ftfVar.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((ftf) arrayList.get(size)).b) {
                arrayList.add(size + 1, ftfVar);
                return z;
            }
            if (((ftf) arrayList.get(size)).b <= j) {
                z = false;
            }
        }
        arrayList.add(0, ftfVar);
        return z;
    }

    @Override // a.etf
    public b4x b(long j) {
        int iH = h(j);
        if (iH == 0) {
            v3x v3xVar = b4x.b;
            return rcf0.e;
        }
        ftf ftfVar = (ftf) this.b.get(iH - 1);
        long j2 = ftfVar.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return ftfVar.f10109a;
        }
        v3x v3xVar2 = b4x.b;
        return rcf0.e;
    }

    @Override // a.etf
    public long c(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || j < ((ftf) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((ftf) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                ftf ftfVar = (ftf) arrayList.get(i - 1);
                long j3 = ftfVar.d;
                return (j3 == -9223372036854775807L || j3 > j) ? ftfVar.b : j3;
            }
        }
        ftf ftfVar2 = (ftf) g8x.H(arrayList);
        long j4 = ftfVar2.d;
        return (j4 == -9223372036854775807L || j < j4) ? ftfVar2.b : j4;
    }

    @Override // a.etf
    public void clear() {
        this.b.clear();
    }

    @Override // a.etf
    public long d(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((ftf) arrayList.get(0)).b) {
            return ((ftf) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((ftf) arrayList.get(i)).b;
            if (j < j2) {
                long j3 = ((ftf) arrayList.get(i - 1)).d;
                return (j3 == -9223372036854775807L || j3 <= j || j3 >= j2) ? j2 : j3;
            }
        }
        long j4 = ((ftf) g8x.H(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // a.etf
    public void e(long j) {
        ArrayList arrayList = this.b;
        int iH = h(j);
        if (iH == 0) {
            return;
        }
        long j2 = ((ftf) arrayList.get(iH - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iH--;
        }
        arrayList.subList(0, iH).clear();
    }

    public void f(ai9 ai9Var) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.b.size();
            ArrayList arrayList = this.b;
            if (i >= size) {
                arrayList.add(ai9Var);
                return;
            } else {
                if (((ai9) arrayList.get(i)).f912a.b > ai9Var.f912a.b) {
                    this.b.add(i, ai9Var);
                    return;
                }
                i++;
            }
        }
    }

    public void g(bi9 bi9Var) {
        if (bi9Var.b == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(bi9Var.b.size());
        }
        Iterator it = bi9Var.b.iterator();
        while (it.hasNext()) {
            f((ai9) it.next());
        }
    }

    public int h(long j) {
        ArrayList arrayList = this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((ftf) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public String toString() {
        switch (this.f2649a) {
            case 0:
                if (this.b == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    sb.append(((ai9) it.next()).toString());
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
