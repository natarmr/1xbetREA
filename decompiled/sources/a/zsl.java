package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zsl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44910a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;

    public /* synthetic */ zsl(jie0 jie0Var, qah0 qah0Var, jie0 jie0Var2, pfk0 pfk0Var, boolean z, int i) {
        this.d = jie0Var;
        this.e = qah0Var;
        this.f = jie0Var2;
        this.g = pfk0Var;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44910a;
        boolean z = this.b;
        Object obj2 = this.g;
        Serializable serializable = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                lq5 lq5Var = (lq5) obj4;
                a4x a4xVar = (a4x) obj3;
                Integer num = (Integer) serializable;
                Function2 function2 = (Function2) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                byte b2 = 26;
                cq5 cq5Var = cq5.f4775a;
                eq5 eq5Var = eq5.f8219a;
                dq5 dq5Var = dq5.f6497a;
                gq5 gq5Var = gq5.f11714a;
                fq5 fq5Var = fq5.f9956a;
                iq5 iq5Var = iq5.f15191a;
                hq5 hq5Var = hq5.f13470a;
                kq5 kq5Var = kq5.f18703a;
                if (z) {
                    if (lq5Var instanceof jq5) {
                        hcz.g(hczVar, 8, null, null, new ugd(776113609, true, new awh(lq5Var, b2)), 6);
                    } else if (Intrinsics.d(lq5Var, kq5Var)) {
                        hcz.g(hczVar, 8, null, null, nnw0.b, 6);
                    } else if (Intrinsics.d(lq5Var, hq5Var) || Intrinsics.d(lq5Var, iq5Var)) {
                        hcz.g(hczVar, 6, null, null, nnw0.c, 6);
                    } else if (Intrinsics.d(lq5Var, fq5Var) || Intrinsics.d(lq5Var, gq5Var)) {
                        hcz.g(hczVar, 8, null, null, nnw0.d, 6);
                    } else if (Intrinsics.d(lq5Var, dq5Var) || Intrinsics.d(lq5Var, eq5Var)) {
                        hcz.g(hczVar, 3, null, null, nnw0.e, 6);
                    } else {
                        if (!Intrinsics.d(lq5Var, cq5Var)) {
                            t9f.b();
                            return null;
                        }
                        hcz.g(hczVar, 3, null, null, nnw0.f, 6);
                    }
                    return Unit.f46060a;
                }
                boolean z2 = lq5Var instanceof jq5;
                int i = this.c;
                if (z2) {
                    hczVar.f(a4xVar.size(), new ctl((Object) new j2l((byte) 18), (Object) a4xVar, (byte) 2), new bzh(a4xVar, (byte) 25), new ugd(2039820996, true, new dtl(a4xVar, lq5Var, i, num, function2)));
                } else {
                    boolean zD = Intrinsics.d(lq5Var, kq5Var);
                    byte b3 = 19;
                    if (zD) {
                        hczVar.f(a4xVar.size(), new ctl((Object) new j2l(b3), (Object) a4xVar, (byte) 5), new bzh(a4xVar, (byte) 26), new ugd(2039820996, true, new btl(a4xVar, i, num, function2, (byte) 6)));
                    } else {
                        byte b4 = 20;
                        if (Intrinsics.d(lq5Var, hq5Var)) {
                            hczVar.f(a4xVar.size(), new ctl((Object) new j2l(b4), (Object) a4xVar, (byte) 6), new bzh(a4xVar, (byte) 27), new ugd(2039820996, true, new btl(a4xVar, i, num, function2, (byte) 7)));
                        } else {
                            boolean zD2 = Intrinsics.d(lq5Var, iq5Var);
                            byte b5 = 21;
                            if (zD2) {
                                hczVar.f(a4xVar.size(), new vtf(new j2l(b5), a4xVar, (byte) 28), new bzh(a4xVar, (byte) 19), new ugd(2039820996, true, new btl(a4xVar, i, num, function2, (byte) 0)));
                            } else {
                                byte b6 = 22;
                                if (Intrinsics.d(lq5Var, fq5Var)) {
                                    hczVar.f(a4xVar.size(), new vtf(new j2l(b6), a4xVar, (byte) 29), new bzh(a4xVar, (byte) 20), new ugd(2039820996, true, new btl(a4xVar, i, num, function2, (byte) 1)));
                                } else {
                                    byte b7 = 23;
                                    if (Intrinsics.d(lq5Var, gq5Var)) {
                                        hczVar.f(a4xVar.size(), new ctl((Object) new j2l(b7), (Object) a4xVar, (byte) 0), new bzh(a4xVar, (byte) 21), new ugd(2039820996, true, new btl(a4xVar, i, num, function2, (byte) 2)));
                                    } else {
                                        byte b8 = 1;
                                        boolean zD3 = Intrinsics.d(lq5Var, dq5Var);
                                        byte b9 = 24;
                                        if (zD3) {
                                            hczVar.f(a4xVar.size(), new ctl(new j2l(b9), a4xVar, b8), new bzh(a4xVar, (byte) 22), new ugd(2039820996, true, new btl(a4xVar, i, num, function2, (byte) 3)));
                                        } else if (Intrinsics.d(lq5Var, eq5Var)) {
                                            hczVar.f(a4xVar.size(), new ctl((Object) new j2l((byte) 25), (Object) a4xVar, (byte) 3), new bzh(a4xVar, (byte) 23), new ugd(2039820996, true, new btl(a4xVar, i, num, function2, (byte) 4)));
                                        } else {
                                            if (!Intrinsics.d(lq5Var, cq5Var)) {
                                                t9f.b();
                                                return null;
                                            }
                                            hczVar.f(a4xVar.size(), new ctl((Object) new j2l((byte) 26), (Object) a4xVar, (byte) 4), new bzh(a4xVar, (byte) 24), new ugd(2039820996, true, new btl(a4xVar, i, num, function2, (byte) 5)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return Unit.f46060a;
            default:
                jie0 jie0Var = (jie0) obj4;
                qah0 qah0Var = (qah0) obj3;
                pfk0 pfk0Var = (pfk0) obj2;
                i73 i73Var = (i73) obj;
                i73Var.getClass();
                pz40 pz40Var = i73Var.i;
                hgk0 hgk0Var = (hgk0) i73Var.e;
                float fFloatValue = ((Number) hgk0Var.getValue()).floatValue() - jie0Var.f16571a;
                float fA = qah0Var.a(fFloatValue);
                jie0Var.f16571a = ((Number) hgk0Var.getValue()).floatValue();
                ((jie0) serializable).f16571a = ((Number) i73Var.b()).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    i73Var.a();
                }
                ucz uczVarD = pfk0Var.f26910a.d();
                if (uczVarD == null) {
                    i73Var.a();
                    return Unit.f46060a;
                }
                int i2 = uczVarD.f35454a.f23317a;
                boolean zBooleanValue = ((Boolean) ((hgk0) pz40Var).getValue()).booleanValue();
                int i3 = this.c;
                if (zBooleanValue && z) {
                    if (((Number) i73Var.b()).floatValue() > 0.0f && i2 == i3 - 1) {
                        i73Var.a();
                    } else if (((Number) i73Var.b()).floatValue() < 0.0f && i2 == i3) {
                        i73Var.a();
                    }
                }
                if (((Boolean) ((hgk0) pz40Var).getValue()).booleanValue()) {
                    if (pfk0Var.e(i73Var, uczVarD, i3, new gvj0(1, qah0Var, qah0.class, "scrollBy", "scrollBy(F)F", 0, (byte) 14))) {
                        i73Var.a();
                    }
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ zsl(boolean z, lq5 lq5Var, a4x a4xVar, int i, Integer num, Function2 function2) {
        this.b = z;
        this.d = lq5Var;
        this.e = a4xVar;
        this.c = i;
        this.f = num;
        this.g = function2;
    }
}
