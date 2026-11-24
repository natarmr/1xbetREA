package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u83 implements t83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsy f35216a;
    public final Map b;
    public final gmk0 c;

    public u83(kzj0 kzj0Var, Map map, gmk0 gmk0Var) {
        if (kzj0Var == null) {
            a(0);
            throw null;
        }
        if (map == null) {
            a(1);
            throw null;
        }
        this.f35216a = kzj0Var;
        this.b = map;
        this.c = gmk0Var;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = Payload.SOURCE;
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // a.t83
    public final gmk0 b() {
        return this.c;
    }

    @Override // a.t83
    public final Map c() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        a(4);
        throw null;
    }

    @Override // a.t83
    public final swq d() {
        wm40 wm40VarD = rek.d(this);
        if (wm40VarD != null) {
            if (f2o.f(wm40VarD)) {
                wm40VarD = null;
            }
            if (wm40VarD != null) {
                return rek.c(wm40VarD);
            }
        }
        return null;
    }

    @Override // a.t83
    public final wsy getType() {
        wsy wsyVar = this.f35216a;
        if (wsyVar != null) {
            return wsyVar;
        }
        a(3);
        throw null;
    }

    public final String toString() {
        return iek.c.o(this, null);
    }
}
