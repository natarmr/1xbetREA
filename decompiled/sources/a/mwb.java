package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22495a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public ArrayList i;

    public final void a() {
        iuw iuwVar;
        iuw iuwVar2;
        ArrayList<iuw> arrayList = this.i;
        if (arrayList == null) {
            return;
        }
        this.f22495a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b((iuw) it.next());
        }
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        Iterator it2 = arrayList.iterator();
        do {
            iuwVar = null;
            if (!it2.hasNext()) {
                iuwVar2 = null;
                break;
            }
            iuwVar2 = (iuw) it2.next();
        } while (((v500) iuwVar2).d != 1);
        if (iuwVar2 != null) {
            v500 v500Var = (v500) iuwVar2;
            this.e = v500Var.p;
            this.f = v500Var.q;
            for (iuw iuwVar3 : arrayList) {
                if (((v500) iuwVar3).d == 1) {
                    v500 v500Var2 = (v500) iuwVar3;
                    float f = v500Var2.q;
                    if (f < this.f) {
                        this.f = f;
                    }
                    float f2 = v500Var2.p;
                    if (f2 > this.e) {
                        this.e = f2;
                    }
                }
            }
        }
        for (iuw iuwVar4 : arrayList) {
            if (((v500) iuwVar4).d == 2) {
                iuwVar = iuwVar4;
                break;
            }
        }
        if (iuwVar != null) {
            v500 v500Var3 = (v500) iuwVar;
            this.g = v500Var3.p;
            this.h = v500Var3.q;
            for (iuw iuwVar5 : arrayList) {
                if (((v500) iuwVar5).d == 2) {
                    v500 v500Var4 = (v500) iuwVar5;
                    float f3 = v500Var4.q;
                    if (f3 < this.h) {
                        this.h = f3;
                    }
                    float f4 = v500Var4.p;
                    if (f4 > this.g) {
                        this.g = f4;
                    }
                }
            }
        }
    }

    public final void b(iuw iuwVar) {
        if (this.f22495a < ((v500) iuwVar).p) {
            this.f22495a = ((v500) iuwVar).p;
        }
        float f = this.b;
        v500 v500Var = (v500) iuwVar;
        float f2 = v500Var.q;
        if (f > f2) {
            this.b = f2;
        }
        float f3 = this.c;
        float f4 = v500Var.r;
        if (f3 < f4) {
            this.c = f4;
        }
        float f5 = this.d;
        float f6 = v500Var.s;
        if (f5 > f6) {
            this.d = f6;
        }
        if (((v500) iuwVar).d == 1) {
            float f7 = this.e;
            float f8 = v500Var.p;
            if (f7 < f8) {
                this.e = f8;
            }
            if (this.f > f2) {
                this.f = f2;
                return;
            }
            return;
        }
        float f9 = this.g;
        float f10 = v500Var.p;
        if (f9 < f10) {
            this.g = f10;
        }
        if (this.h > f2) {
            this.h = f2;
        }
    }

    public final iuw c(int i) {
        ArrayList arrayList = this.i;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (iuw) arrayList.get(i);
    }

    public final int d() {
        Iterator it = this.i.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((v500) ((iuw) it.next())).o.size();
        }
        return size;
    }

    public final float e(int i) {
        if (i == 1) {
            float f = this.e;
            return f == -3.4028235E38f ? this.g : f;
        }
        float f2 = this.g;
        return f2 == -3.4028235E38f ? this.e : f2;
    }

    public final float f(int i) {
        if (i == 1) {
            float f = this.f;
            return f == Float.MAX_VALUE ? this.h : f;
        }
        float f2 = this.h;
        return f2 == Float.MAX_VALUE ? this.f : f2;
    }
}
