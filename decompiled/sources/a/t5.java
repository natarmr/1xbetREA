package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t5 extends yjj implements hzs0 {
    public final t3u0 f;
    public final boolean g;
    public final int h;
    public final cu00 i;
    public final cu00 j;
    public final eu00 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(int i, g93 g93Var, vjj vjjVar, eu00 eu00Var, g950 g950Var, t3u0 t3u0Var, boolean z) {
        super(vjjVar, g93Var, g950Var, gmk0.x0);
        if (eu00Var == null) {
            k0(0);
            throw null;
        }
        byte b = 1;
        if (vjjVar == null) {
            k0(1);
            throw null;
        }
        byte b2 = 2;
        if (g93Var == null) {
            k0(2);
            throw null;
        }
        if (g950Var == null) {
            k0(3);
            throw null;
        }
        if (t3u0Var == null) {
            k0(4);
            throw null;
        }
        this.f = t3u0Var;
        this.g = z;
        this.h = i;
        this.i = new cu00(eu00Var, new h5(this, (Object) eu00Var, b));
        this.j = new cu00(eu00Var, new h5(this, (Object) g950Var, b2));
        this.k = eu00Var;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // a.hzs0
    public final eu00 D() {
        eu00 eu00Var = this.k;
        if (eu00Var != null) {
            return eu00Var;
        }
        k0(14);
        throw null;
    }

    @Override // a.hzs0
    public final boolean H() {
        return false;
    }

    @Override // a.foc
    public final kzj0 I() {
        kzj0 kzj0Var = (kzj0) this.j.invoke();
        if (kzj0Var != null) {
            return kzj0Var;
        }
        k0(10);
        throw null;
    }

    @Override // a.hzs0
    public final int getIndex() {
        return this.h;
    }

    @Override // a.hzs0
    public final List getUpperBounds() {
        List listG = ((s5) h()).b();
        if (listG != null) {
            return listG;
        }
        k0(8);
        throw null;
    }

    @Override // a.hzs0, a.foc
    public final iys0 h() {
        iys0 iys0Var = (iys0) this.i.invoke();
        if (iys0Var != null) {
            return iys0Var;
        }
        k0(9);
        throw null;
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.e(this, obj);
    }

    public List p1(List list) {
        if (list == null) {
            k0(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        k0(13);
        throw null;
    }

    @Override // a.hzs0
    public final boolean q() {
        return this.g;
    }

    public abstract List q1();

    @Override // a.hzs0
    public final t3u0 t() {
        t3u0 t3u0Var = this.f;
        if (t3u0Var != null) {
            return t3u0Var;
        }
        k0(7);
        throw null;
    }

    @Override // a.yjj, a.wjj, a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public final vjj o1() {
        return this;
    }

    @Override // a.yjj, a.wjj, a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public final hzs0 o1() {
        return this;
    }

    @Override // a.yjj, a.wjj, a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public final foc o1() {
        return this;
    }

    @Override // a.yjj
    public final xjj o1() {
        return this;
    }
}
