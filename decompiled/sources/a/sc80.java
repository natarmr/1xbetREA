package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sc80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f31975a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ int f;

    public /* synthetic */ sc80(boolean z, boolean z2, boolean z3, long j, Map map, int i) {
        this.f31975a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.e = map;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        iz30 iz30Var = (iz30) obj;
        iz30Var.getClass();
        int iOrdinal = iz30Var.ordinal();
        if (iOrdinal == 21) {
            return new xx10(iz30Var, this.f);
        }
        boolean z = this.b;
        if (iOrdinal == 24) {
            return new hx10(iz30Var, this.f31975a, z);
        }
        if (iOrdinal == 39) {
            return new ix10(iz30Var, this.d);
        }
        switch (iOrdinal) {
            case 13:
                if (this.c) {
                    return new rx10(iz30Var);
                }
                return null;
            case 14:
                return new qx10(iz30Var);
            case 15:
                String str = (String) this.e.get(iz30Var);
                if (str == null) {
                    str = "";
                }
                return new lx10(iz30Var, str, z);
            default:
                return new sx10(iz30Var, z);
        }
    }
}
