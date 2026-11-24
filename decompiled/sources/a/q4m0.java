package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class q4m0 extends pzs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28105a = 0;
    public final Object b;
    public final Object c;

    public q4m0(hzs0 hzs0Var) {
        hzs0Var.getClass();
        this.b = hzs0Var;
        this.c = maz.a(wez.f39042a, new fyk0(this, (byte) 7));
    }

    public static /* synthetic */ void e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = Payload.TYPE;
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // a.pzs0
    public final t3u0 a() {
        switch (this.f28105a) {
            case 0:
                return t3u0.e;
            default:
                t3u0 t3u0Var = (t3u0) this.b;
                if (t3u0Var != null) {
                    return t3u0Var;
                }
                e(4);
                throw null;
        }
    }

    @Override // a.pzs0
    public final wsy b() {
        byte b = this.f28105a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (wsy) ((a8z) obj).getValue();
            default:
                wsy wsyVar = (wsy) obj;
                if (wsyVar != null) {
                    return wsyVar;
                }
                e(5);
                throw null;
        }
    }

    @Override // a.pzs0
    public final boolean c() {
        switch (this.f28105a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // a.pzs0
    public final pzs0 d(cty ctyVar) {
        switch (this.f28105a) {
            case 0:
                return this;
            default:
                t3u0 t3u0Var = (t3u0) this.b;
                wsy wsyVar = (wsy) this.c;
                wsyVar.getClass();
                return new q4m0(wsyVar, t3u0Var);
        }
    }

    public q4m0(wsy wsyVar, t3u0 t3u0Var) {
        if (t3u0Var == null) {
            e(0);
            throw null;
        }
        if (wsyVar != null) {
            this.b = t3u0Var;
            this.c = wsyVar;
        } else {
            e(1);
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q4m0(wsy wsyVar) {
        this(wsyVar, t3u0.c);
        if (wsyVar != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
