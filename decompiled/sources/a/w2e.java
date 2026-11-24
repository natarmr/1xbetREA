package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w2e {
    public int b;
    public boolean c;
    public final k4e d;
    public final int e;
    public w2e f;
    public ukk0 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f38443a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public w2e(k4e k4eVar, int i) {
        this.d = k4eVar;
        this.e = i;
    }

    public final void a(w2e w2eVar, int i) {
        b(w2eVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(w2e w2eVar, int i, int i2, boolean z) {
        if (w2eVar == null) {
            j();
            return true;
        }
        if (!z && !i(w2eVar)) {
            return false;
        }
        this.f = w2eVar;
        if (w2eVar.f38443a == null) {
            w2eVar.f38443a = new HashSet();
        }
        HashSet hashSet = this.f.f38443a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ydv0 ydv0Var, ArrayList arrayList) {
        HashSet hashSet = this.f38443a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                lmc.H(((w2e) it.next()).d, i, arrayList, ydv0Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        w2e w2eVar;
        if (this.d.i0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (w2eVar = this.f) == null || w2eVar.d.i0 != 8) ? this.g : i;
    }

    public final w2e f() {
        int i = this.e;
        int iE = hne.E(i);
        k4e k4eVar = this.d;
        switch (iE) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return k4eVar.L;
            case 2:
                return k4eVar.M;
            case 3:
                return k4eVar.J;
            case 4:
                return k4eVar.K;
            default:
                c99.l(vqd.B(i));
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f38443a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((w2e) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0061 A[RETURN] */
    public final boolean i(w2e w2eVar) {
        if (w2eVar != null) {
            k4e k4eVar = w2eVar.d;
            int i = w2eVar.e;
            int i2 = this.e;
            if (i != i2) {
                switch (hne.E(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(k4eVar instanceof qiv)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(k4eVar instanceof qiv)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i != 2 && i != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        c99.l(vqd.B(i2));
                        return false;
                }
            } else if (i2 != 6 || (k4eVar.F && this.d.F)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        w2e w2eVar = this.f;
        if (w2eVar != null && (hashSet = w2eVar.f38443a) != null) {
            hashSet.remove(this);
            if (this.f.f38443a.size() == 0) {
                this.f.f38443a = null;
            }
        }
        this.f38443a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        ukk0 ukk0Var = this.i;
        if (ukk0Var == null) {
            this.i = new ukk0(1);
        } else {
            ukk0Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.k0 + Separators.COLON + vqd.B(this.e);
    }
}
