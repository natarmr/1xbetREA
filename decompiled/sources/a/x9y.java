package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class x9y extends f0d0 implements o8y {
    public final boolean B;
    public final Pair Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9y(vjj vjjVar, g93 g93Var, gm40 gm40Var, tek tekVar, boolean z, g950 g950Var, gmk0 gmk0Var, d0d0 d0d0Var, int i, boolean z2, Pair pair) {
        super(vjjVar, d0d0Var, g93Var, gm40Var, tekVar, z, g950Var, i, gmk0Var, false, false, false, false, false);
        if (vjjVar == null) {
            k0(0);
            throw null;
        }
        if (g93Var == null) {
            k0(1);
            throw null;
        }
        if (gm40Var == null) {
            k0(2);
            throw null;
        }
        if (tekVar == null) {
            k0(3);
            throw null;
        }
        if (g950Var == null) {
            k0(4);
            throw null;
        }
        if (gmk0Var == null) {
            k0(5);
            throw null;
        }
        if (i == 0) {
            k0(6);
            throw null;
        }
        this.B = z2;
        this.Y = pair;
    }

    public static /* synthetic */ void k0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static x9y x1(vjj vjjVar, j9z j9zVar, tek tekVar, boolean z, g950 g950Var, rog0 rog0Var, boolean z2) {
        gm40 gm40Var = gm40.b;
        if (vjjVar == null) {
            k0(7);
            throw null;
        }
        if (g950Var != null) {
            return new x9y(vjjVar, j9zVar, gm40Var, tekVar, z, g950Var, rog0Var, null, 1, z2, null);
        }
        k0(11);
        throw null;
    }

    @Override // a.f0d0, a.r3u0
    public final boolean N() {
        wsy type = getType();
        if (!this.B) {
            return false;
        }
        type.getClass();
        if (((!ary.H(type) && !nft0.a(type)) || e0t0.e(type)) && !ary.I(type)) {
            return false;
        }
        i93 i93Var = rys0.f31328a;
        swq swqVar = bey.q;
        swqVar.getClass();
        return !rcb.C0(type, swqVar) || ary.I(type);
    }

    @Override // a.s3u0, a.kp9
    public final boolean P() {
        return false;
    }

    @Override // a.o8y
    public final o8y a0(wsy wsyVar, ArrayList arrayList, wsy wsyVar2, Pair pair) {
        g0d0 g0d0Var;
        n0d0 n0d0Var;
        if (wsyVar2 == null) {
            k0(20);
            throw null;
        }
        d0d0 d0d0VarO1 = o1() == this ? null : o1();
        x9y x9yVar = new x9y(j(), getAnnotations(), m(), getVisibility(), this.g, getName(), b(), d0d0VarO1, l(), this.B, pair);
        g0d0 g0d0Var2 = this.x;
        if (g0d0Var2 != null) {
            g0d0 g0d0Var3 = new g0d0(x9yVar, g0d0Var2.getAnnotations(), g0d0Var2.m(), g0d0Var2.getVisibility(), g0d0Var2.f, g0d0Var2.g, g0d0Var2.j, l(), d0d0VarO1 == null ? null : d0d0VarO1.d(), g0d0Var2.b());
            g0d0Var3.m = g0d0Var2.m;
            g0d0Var3.n = wsyVar2;
            g0d0Var = g0d0Var3;
        } else {
            g0d0Var = null;
        }
        n0d0 n0d0Var2 = this.y;
        if (n0d0Var2 != null) {
            n0d0Var = new n0d0(x9yVar, n0d0Var2.getAnnotations(), n0d0Var2.m(), n0d0Var2.getVisibility(), n0d0Var2.f, n0d0Var2.g, n0d0Var2.j, l(), d0d0VarO1 == null ? null : d0d0VarO1.e(), n0d0Var2.b());
            n0d0Var.m = n0d0Var.m;
            k3u0 k3u0Var = (k3u0) n0d0Var2.z().get(0);
            if (k3u0Var == null) {
                n0d0.k0(6);
                throw null;
            }
            n0d0Var.n = k3u0Var;
        } else {
            n0d0Var = null;
        }
        x9yVar.t1(g0d0Var, n0d0Var, this.z, this.A);
        Function0 function0 = this.i;
        if (function0 != null) {
            x9yVar.u1(this.h, function0);
        }
        x9yVar.d0(k());
        x9yVar.w1(wsyVar2, getTypeParameters(), this.u, wsyVar != null ? obb.S(this, wsyVar, ujn.c) : null, iun.f15405a);
        return x9yVar;
    }

    @Override // a.f0d0
    public final f0d0 r1(vjj vjjVar, gm40 gm40Var, tek tekVar, d0d0 d0d0Var, int i, g950 g950Var) {
        if (vjjVar == null) {
            k0(13);
            throw null;
        }
        if (gm40Var == null) {
            k0(14);
            throw null;
        }
        if (tekVar == null) {
            k0(15);
            throw null;
        }
        if (i == 0) {
            k0(16);
            throw null;
        }
        if (g950Var == null) {
            k0(17);
            throw null;
        }
        return new x9y(vjjVar, getAnnotations(), gm40Var, tekVar, this.g, g950Var, gmk0.x0, d0d0Var, i, this.B, this.Y);
    }

    @Override // a.f0d0, a.kp9
    public final Object u(ifk ifkVar) {
        throw null;
    }

    @Override // a.f0d0
    public final void v1(wsy wsyVar) {
    }
}
