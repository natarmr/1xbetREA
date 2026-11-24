package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d83 extends v73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5624a;
    public final ja80 b;
    public final int c;

    public d83(ArrayList arrayList, ja80 ja80Var) {
        this.f5624a = arrayList;
        this.b = ja80Var;
        int iOrdinal = ja80Var.ordinal();
        Object obj = null;
        int iC = 0;
        int i = 1;
        if (iOrdinal == 0) {
            if (!arrayList.isEmpty()) {
                Object obj2 = arrayList.get(0);
                int iC2 = ((v73) obj2).c();
                int size = arrayList.size() - 1;
                if (1 <= size) {
                    while (true) {
                        Object obj3 = arrayList.get(i);
                        int iC3 = ((v73) obj3).c();
                        if (iC2 < iC3) {
                            obj2 = obj3;
                            iC2 = iC3;
                        }
                        if (i == size) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                obj = obj2;
            }
            v73 v73Var = (v73) obj;
            if (v73Var != null) {
                iC = v73Var.c();
            }
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                throw null;
            }
            int size2 = arrayList.size();
            int iC4 = 0;
            while (iC < size2) {
                iC4 += ((v73) arrayList.get(iC)).c();
                iC++;
            }
            iC = iC4;
        }
        this.c = iC;
    }

    @Override // a.v73
    public final void b(hz40 hz40Var, int i, int i2) {
        int iOrdinal = this.b.ordinal();
        int i3 = 0;
        ArrayList arrayList = this.f5624a;
        if (iOrdinal == 0) {
            int size = arrayList.size();
            while (i3 < size) {
                ((v73) arrayList.get(i3)).b(hz40Var, i, i2);
                i3++;
            }
            return;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return;
        }
        int size2 = arrayList.size();
        while (i3 < size2) {
            v73 v73Var = (v73) arrayList.get(i3);
            v73Var.b(hz40Var, i, i2);
            i2 += v73Var.c();
            i3++;
        }
    }

    @Override // a.v73
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d83)) {
            return false;
        }
        d83 d83Var = (d83) obj;
        return this.f5624a.equals(d83Var.f5624a) && this.b == d83Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5624a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatorSet(animators=" + this.f5624a + ", ordering=" + this.b + Separators.RPAREN;
    }
}
