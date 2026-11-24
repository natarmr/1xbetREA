package a;

/* JADX INFO: loaded from: classes.dex */
public final class ev4 implements s960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ev4 f8451a = new ev4();
    public static final sqp b = sqp.a("eventTimeMs");
    public static final sqp c = sqp.a("eventCode");
    public static final sqp d = sqp.a("complianceData");
    public static final sqp e = sqp.a("eventUptimeMs");
    public static final sqp f = sqp.a("sourceExtension");
    public static final sqp g = sqp.a("sourceExtensionJsonProto3");
    public static final sqp h = sqp.a("timezoneOffsetSeconds");
    public static final sqp i = sqp.a("networkConnectionInfo");
    public static final sqp j = sqp.a("experimentIds");

    @Override // a.cwn
    public final void a(Object obj, Object obj2) {
        iv00 iv00Var = (iv00) obj;
        t960 t960Var = (t960) obj2;
        t960Var.c(b, ((h45) iv00Var).f12418a);
        h45 h45Var = (h45) iv00Var;
        t960Var.a(c, h45Var.b);
        t960Var.a(d, h45Var.c);
        t960Var.c(e, h45Var.d);
        t960Var.a(f, h45Var.e);
        t960Var.a(g, h45Var.f);
        t960Var.c(h, h45Var.g);
        t960Var.a(i, h45Var.h);
        t960Var.a(j, h45Var.i);
    }
}
