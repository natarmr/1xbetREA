package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class tlw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34167a;
    public float b;
    public final Object c;

    public tlw(y8q0 y8q0Var) {
        this.c = y8q0Var;
        this.f34167a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        y8q0 y8q0Var = (y8q0) this.c;
        int i2 = 1;
        if (z) {
            int I = g7x.I(y8q0Var.f, i, z);
            int lineStart = y8q0Var.f.getLineStart(I);
            int iE = y8q0Var.e(I);
            if (i == lineStart || i == iE) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.f34167a == i4) {
            return this.b;
        }
        float fI = z3 ? y8q0Var.i(i, z) : y8q0Var.j(i, z);
        if (z2) {
            this.f34167a = i4;
            this.b = fI;
        }
        return fI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f, zje zjeVar) {
        fff0 fff0Var;
        if (zjeVar instanceof fff0) {
            fff0Var = (fff0) zjeVar;
            int i = fff0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fff0Var.k = i - Integer.MIN_VALUE;
            } else {
                fff0Var = new fff0(this, zjeVar);
            }
        } else {
            fff0Var = new fff0(this, zjeVar);
        }
        Object objInvoke = fff0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fff0Var.k;
        if (i2 == 0) {
            z1x.P(objInvoke);
            cx8 cx8Var = (cx8) this.c;
            Float f2 = new Float(f);
            fff0Var.k = 1;
            objInvoke = cx8Var.invoke(f2, fff0Var);
            if (objInvoke == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objInvoke);
        }
        this.b += ((Number) objInvoke).floatValue();
        return Unit.f46060a;
    }

    public tlw(int i, cx8 cx8Var) {
        this.f34167a = i;
        this.c = cx8Var;
    }
}
