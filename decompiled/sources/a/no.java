package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class no {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aue0 f23847a = aue0.c;
    public final k050 b = new k050();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(zje zjeVar) {
        lo loVar;
        k050 k050Var;
        if (zjeVar instanceof lo) {
            loVar = (lo) zjeVar;
            int i = loVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                loVar.l = i - Integer.MIN_VALUE;
            } else {
                loVar = new lo(this, zjeVar);
            }
        } else {
            loVar = new lo(this, zjeVar);
        }
        Object obj = loVar.j;
        wne wneVar = wne.f39444a;
        int i2 = loVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.b;
            loVar.i = k050Var2;
            loVar.l = 1;
            if (k050Var2.d(loVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = loVar.i;
            z1x.P(obj);
        }
        try {
            return this.f23847a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(aue0 aue0Var, yje yjeVar) {
        mo moVar;
        k050 k050Var;
        if (yjeVar instanceof mo) {
            moVar = (mo) yjeVar;
            int i = moVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                moVar.m = i - Integer.MIN_VALUE;
            } else {
                moVar = new mo(this, yjeVar);
            }
        } else {
            moVar = new mo(this, yjeVar);
        }
        Object obj = moVar.k;
        wne wneVar = wne.f39444a;
        int i2 = moVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            moVar.i = aue0Var;
            k050Var = this.b;
            moVar.j = k050Var;
            moVar.m = 1;
            if (k050Var.d(moVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = moVar.j;
            aue0 aue0Var2 = moVar.i;
            z1x.P(obj);
            k050Var = k050Var2;
            aue0Var = aue0Var2;
        }
        try {
            if (this.f23847a != aue0Var) {
                this.f23847a = aue0Var;
            }
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }
}
