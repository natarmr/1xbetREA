package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes2.dex */
public final class ty4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ty4 f34734a = new ty4();
    public static final sqp b = sqp.a("arch");
    public static final sqp c = sqp.a("model");
    public static final sqp d = sqp.a("cores");
    public static final sqp e = sqp.a("ram");
    public static final sqp f = sqp.a("diskSpace");
    public static final sqp g = sqp.a("simulator");
    public static final sqp h = sqp.a(CommonConstant.ReqAccessTokenParam.STATE_LABEL);
    public static final sqp i = sqp.a("manufacturer");
    public static final sqp j = sqp.a("modelClass");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        z8f z8fVar = (z8f) obj;
        t960 t960Var = (t960) obj2;
        t960Var.d(b, ((l25) z8fVar).f19291a);
        l25 l25Var = (l25) z8fVar;
        t960Var.a(c, l25Var.b);
        t960Var.d(d, l25Var.c);
        t960Var.c(e, l25Var.d);
        t960Var.c(f, l25Var.e);
        t960Var.f(g, l25Var.f);
        t960Var.d(h, l25Var.g);
        t960Var.a(i, l25Var.h);
        t960Var.a(j, l25Var.i);
    }
}
