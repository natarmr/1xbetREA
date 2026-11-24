package a;

import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h1 extends wm40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g950 f12256a;
    public final cu00 b;
    public final cu00 c;
    public final cu00 d;

    public h1(eu00 eu00Var, g950 g950Var) {
        byte b = 0;
        if (eu00Var == null) {
            s0(0);
            throw null;
        }
        byte b2 = 1;
        if (g950Var == null) {
            s0(1);
            throw null;
        }
        this.f12256a = g950Var;
        this.b = new cu00(eu00Var, new g1(this, b));
        this.c = new cu00(eu00Var, new g1(this, b2));
        this.d = new cu00(eu00Var, new g1(this, (byte) 2));
    }

    public static /* synthetic */ void s0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // a.wm40, a.foc
    public final kzj0 I() {
        kzj0 kzj0Var = (kzj0) this.b.invoke();
        if (kzj0Var != null) {
            return kzj0Var;
        }
        s0(20);
        throw null;
    }

    @Override // a.wm40
    public final cr30 J(vzs0 vzs0Var) {
        rek.h(oek.c(this));
        cr30 cr30VarK = K(vzs0Var, cty.b0);
        if (cr30VarK != null) {
            return cr30VarK;
        }
        s0(16);
        throw null;
    }

    @Override // a.wm40
    public final c8z f0() {
        c8z c8zVar = (c8z) this.d.invoke();
        if (c8zVar != null) {
            return c8zVar;
        }
        s0(5);
        throw null;
    }

    @Override // a.vjj
    public final g950 getName() {
        g950 g950Var = this.f12256a;
        if (g950Var != null) {
            return g950Var;
        }
        s0(2);
        throw null;
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.d(this, obj);
    }

    @Override // a.wm40
    public cr30 j0() {
        cr30 cr30Var = (cr30) this.c.invoke();
        if (cr30Var != null) {
            return cr30Var;
        }
        s0(4);
        throw null;
    }

    @Override // a.wen0
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public wm40 f(xzs0 xzs0Var) {
        if (xzs0Var != null) {
            return xzs0Var.f41769a.e() ? this : new vez(this, xzs0Var);
        }
        s0(18);
        throw null;
    }

    @Override // a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public final vjj o1() {
        return this;
    }

    @Override // a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public final foc o1() {
        return this;
    }
}
