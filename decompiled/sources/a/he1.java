package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class he1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f12898a;

    public he1(rrc rrcVar, byte b) {
        switch (b) {
            case 2:
                this.f12898a = maz.b(new dio(rrcVar, (byte) 3));
                break;
            case 3:
            default:
                this.f12898a = maz.b(new dio(rrcVar, (byte) 0));
                break;
            case 4:
                this.f12898a = maz.b(new dio(rrcVar, (byte) 6));
                break;
            case 5:
                this.f12898a = maz.b(new dio(rrcVar, (byte) 7));
                break;
        }
    }

    public tt20 a() {
        return (tt20) this.f12898a.getValue();
    }

    public Object b(bnn0 bnn0Var) {
        return sj3.w0(bnn0Var, ((qco) this.f12898a.getValue()).f28493a, new f1e(2, null, (byte) 22), true, false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object c(int i, String str, int i2, String str2, int i3, int i4, int i5, int i6, zje zjeVar) {
        ge1 ge1Var;
        if (zjeVar instanceof ge1) {
            ge1Var = (ge1) zjeVar;
            int i7 = ge1Var.k;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ge1Var.k = i7 - Integer.MIN_VALUE;
            } else {
                ge1Var = new ge1(this, zjeVar);
            }
        } else {
            ge1Var = new ge1(this, zjeVar);
        }
        ge1 ge1Var2 = ge1Var;
        Object objC = ge1Var2.i;
        wne wneVar = wne.f39444a;
        int i8 = ge1Var2.k;
        if (i8 == 0) {
            z1x.P(objC);
            wd1 wd1Var = (wd1) this.f12898a.getValue();
            ge1Var2.k = 1;
            objC = wd1Var.c(i, str2, i3, i4, str, i2, i6, i5, new fk9(false), ge1Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i8 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        uc1 uc1Var = (uc1) objC;
        uc1Var.getClass();
        int i9 = uc1Var.b;
        String str3 = uc1Var.c;
        if (i9 != 0) {
            if (str3 == null) {
                str3 = "";
            }
            throw new cii0(i9, str3);
        }
        sc1 sc1Var = uc1Var.f35408a;
        List list = sc1Var != null ? sc1Var.f31964a : null;
        return list == null ? iun.f15405a : list;
    }

    public jh70 d() {
        ((vpi) this.f12898a.getValue()).getClass();
        return new jh70();
    }

    public Object e(bnn0 bnn0Var) {
        return sj3.w0(bnn0Var, ((m4l0) this.f12898a.getValue()).f21177a, new tri0(2, null, (byte) 9), true, false);
    }

    public he1() {
        this.f12898a = maz.b(new cbc0((byte) 10));
    }

    public he1(gii0 gii0Var, te1 te1Var, le1 le1Var) {
        gii0Var.getClass();
        this.f12898a = maz.b(new zm(gii0Var, (byte) 3));
    }
}
