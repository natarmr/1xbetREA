package a;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uj1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35758a;
    public final /* synthetic */ cm80 b;

    public /* synthetic */ uj1(cm80 cm80Var, byte b) {
        this.f35758a = b;
        this.b = cm80Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        e8d0 b8d0Var;
        e8d0 e8d0Var;
        boolean z;
        boolean z2;
        byte b = this.f35758a;
        cm80 cm80Var = this.b;
        switch (b) {
            case 0:
                j8d0 j8d0Var = (j8d0) obj2;
                ((oyg0) obj).getClass();
                j8d0Var.getClass();
                if (cm80Var != null) {
                    if (cm80Var instanceof zl80) {
                        zl80 zl80Var = (zl80) cm80Var;
                        if (zl80Var.b) {
                            b8d0Var = d8d0.f5642a;
                        } else {
                            e8d0 b8d0Var2 = j8d0Var.h;
                            if (b8d0Var2 instanceof b8d0) {
                                i4 i4VarR0 = dyb.r0(CollectionsKt.q0(((b8d0) b8d0Var2).f2151a, zl80Var.f44568a));
                                i4VarR0.getClass();
                                b8d0Var2 = new b8d0(i4VarR0);
                            }
                            e8d0Var = b8d0Var2;
                        }
                        return j8d0.a(j8d0Var, false, e8d0Var, null, null, 3839);
                    }
                    if (cm80Var instanceof wl80) {
                        List list = ((wl80) cm80Var).f39341a;
                        b8d0Var = list.isEmpty() ? new b8d0(lak0.c) : new b8d0(dyb.r0(list));
                    } else if (cm80Var instanceof tl80) {
                        b8d0Var = c8d0.f3909a;
                    }
                    e8d0Var = b8d0Var;
                    return j8d0.a(j8d0Var, false, e8d0Var, null, null, 3839);
                }
                t9f.b();
                return null;
            case 1:
                yx8 yx8Var = (yx8) obj2;
                ((oyg0) obj).getClass();
                yx8Var.getClass();
                boolean z3 = cm80Var instanceof zl80;
                wx8 wx8VarA = wx8.a(yx8Var.f43408a, cm80Var instanceof tl80, z3 && ((zl80) cm80Var).b, cm80Var.a(), 8);
                vx8 vx8Var = yx8Var.b;
                return yx8.a(yx8Var, wx8VarA, vx8.a(vx8Var, z3 && vx8Var.f38188a, 6), null, false, null, null, null, null, false, 1048572);
            case 2:
                rs80 rs80Var = (rs80) obj2;
                List listA = cm80Var.a();
                boolean z4 = (cm80Var instanceof zl80) && ((zl80) cm80Var).b;
                boolean z5 = cm80Var instanceof tl80;
                if (cm80Var instanceof wl80) {
                    wl80 wl80Var = (wl80) cm80Var;
                    if (wl80Var.b && wl80Var.f39341a.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return rs80.a(rs80Var, z4, z5, z, false, false, false, false, null, null, null, listA, null, null, null, null, null, null, false, null, 134086648);
            default:
                yu80 yu80Var = (yu80) obj2;
                List listA2 = cm80Var.a();
                boolean z6 = (cm80Var instanceof zl80) && ((zl80) cm80Var).b;
                boolean z7 = cm80Var instanceof tl80;
                if (cm80Var instanceof wl80) {
                    wl80 wl80Var2 = (wl80) cm80Var;
                    if (wl80Var2.b && wl80Var2.f39341a.isEmpty()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                return yu80.a(yu80Var, z6, z7, z2, false, false, listA2, null, null, null, 126968);
        }
    }
}
