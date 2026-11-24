package a;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ca6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3993a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ ca6(pz40 pz40Var, byte b) {
        this.f3993a = b;
        this.b = pz40Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x0169  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iE;
        int i;
        Object obj2;
        lie lieVarE0;
        byte b = this.f3993a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                if (pz40Var != null) {
                    pz40Var.setValue(list);
                }
                return Unit.f46060a;
            case 1:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                zai0 zai0Var = cbi0.m;
                Boolean bool = (Boolean) pz40Var.getValue();
                bool.getClass();
                abi0Var.b(zai0Var, bool);
                return Unit.f46060a;
            case 2:
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                pz40Var.setValue(Boolean.valueOf(a9q0Var.f()));
                return Unit.f46060a;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                pz40Var.setValue(bool2);
                return Unit.f46060a;
            case 4:
                qkx qkxVar = (qkx) obj;
                long j = qkxVar.f28908a;
                pz40Var.setValue(qkxVar);
                return Unit.f46060a;
            case 5:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                Bitmap bitmap = (Bitmap) pz40Var.getValue();
                if (bitmap != null) {
                    vw2.b(fhlVar.A0().i()).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
                return Unit.f46060a;
            case 6:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                ((Function1) pz40Var.getValue()).invoke(bool3);
                return Unit.f46060a;
            case 7:
                Integer num = (Integer) obj;
                num.getClass();
                ((Function1) pz40Var.getValue()).invoke(num);
                return Unit.f46060a;
            case 8:
                qkx qkxVar2 = (qkx) obj;
                long j2 = qkxVar2.f28908a;
                pz40Var.setValue(qkxVar2);
                return Unit.f46060a;
            case 9:
                hea heaVar = (hea) obj;
                heaVar.getClass();
                pz40Var.setValue(heaVar);
                return Unit.f46060a;
            case 10:
                pz40Var.setValue((String) obj);
                return Unit.f46060a;
            case 11:
                lz3 lz3Var = (lz3) obj;
                lz3Var.getClass();
                pz40Var.setValue(lz3Var);
                return Unit.f46060a;
            case 12:
                a9q0 a9q0Var2 = (a9q0) obj;
                a9q0Var2.getClass();
                long j3 = a9q0Var2.f491a.b.f42262a.b;
                daq0 daq0Var = new daq0(j3);
                long j4 = ((daq0) pz40Var.getValue()).f5764a;
                idm0.n(j3, j4);
                if (Float.compare(daq0.c(j3), daq0.c(j4)) >= 0) {
                    daq0Var = null;
                }
                pz40Var.setValue(new daq0(daq0Var != null ? daq0Var.f5764a : ((daq0) pz40Var.getValue()).f5764a));
                return Unit.f46060a;
            case 13:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                pz40Var.setValue(bool4);
                return Unit.f46060a;
            case 14:
                ycl yclVar = (ycl) obj;
                if (ycl.a(yclVar.f42389a, 0.0f) > 0) {
                    pz40Var.setValue(yclVar);
                }
                return Unit.f46060a;
            case 15:
                c53 c53Var = (c53) obj;
                c53Var.getClass();
                k7h k7hVar = (k7h) c53Var.d();
                k7h k7hVar2 = (k7h) c53Var.b();
                boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
                k7hVar.getClass();
                k7hVar2.getClass();
                h7h h7hVarI0 = ahy.i0(k7hVar);
                long j5 = k7hVar.d;
                t6h t6hVarH0 = ahy.h0(h7hVarI0, k7hVar);
                h7h h7hVarI1 = ahy.i0(k7hVar2);
                long j6 = k7hVar2.d;
                t6h t6hVarH1 = ahy.h0(h7hVarI1, k7hVar2);
                i7h i7hVar = i7h.f14290a;
                j7h j7hVar = j7h.f16039a;
                if (zBooleanValue) {
                    if (!(t6hVarH0 instanceof q6h) || (t6hVarH1 instanceof q6h)) {
                        a4x a4xVar = k7hVar2.f17819a;
                        a4x a4xVar2 = k7hVar2.b;
                        int i2 = -1;
                        if (j5 != j6) {
                            Iterator it = a4xVar2.iterator();
                            int i3 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    int i4 = i3;
                                    if (((q5h) it.next()).f28151a == j5) {
                                        i = i4;
                                    } else {
                                        i3 = i4 + 1;
                                    }
                                } else {
                                    i = -1;
                                }
                            }
                            Iterator it2 = a4xVar2.iterator();
                            int i5 = 0;
                            while (it2.hasNext()) {
                                if (((q5h) it2.next()).f28151a == j6) {
                                    i2 = i5;
                                    if (i >= 0 || i2 < 0) {
                                        iE = 0;
                                    } else {
                                        iE = Intrinsics.e(i2, i);
                                    }
                                } else {
                                    i5++;
                                }
                            }
                            if (i >= 0) {
                                iE = 0;
                            } else {
                                iE = 0;
                            }
                        } else if (k7hVar2.i == null) {
                            h7h h7hVarI2 = ahy.i0(k7hVar);
                            Long lValueOf = h7hVarI2 != null ? Long.valueOf(h7hVarI2.f12573a) : null;
                            h7h h7hVarI3 = ahy.i0(k7hVar2);
                            Long lValueOf2 = h7hVarI3 != null ? Long.valueOf(h7hVarI3.f12573a) : null;
                            Iterator it3 = a4xVar.iterator();
                            int i6 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    long j7 = ((h7h) it3.next()).f12573a;
                                    if (lValueOf == null || j7 != lValueOf.longValue()) {
                                        i6++;
                                    }
                                } else {
                                    i6 = -1;
                                }
                            }
                            Iterator it4 = a4xVar.iterator();
                            int i7 = 0;
                            while (it4.hasNext()) {
                                long j8 = ((h7h) it4.next()).f12573a;
                                if (lValueOf2 != null && j8 == lValueOf2.longValue()) {
                                    i2 = i7;
                                    if (i6 >= 0 || i2 < 0) {
                                        iE = 0;
                                    } else {
                                        iE = Intrinsics.e(i2, i6);
                                    }
                                } else {
                                    i7++;
                                }
                            }
                            if (i6 >= 0) {
                                iE = 0;
                            } else {
                                iE = 0;
                            }
                        } else {
                            iE = 0;
                        }
                        if (iE == 0) {
                            obj2 = j7hVar;
                        }
                    }
                    obj2 = i7hVar;
                } else {
                    obj2 = j7hVar;
                }
                if (obj2.equals(i7hVar)) {
                    pzn pznVarD = kzn.d(ro4.m0(Response.OK, 0, hhn.c, 2), 0.0f, 2);
                    alo aloVar = alo.b;
                    lieVarE0 = ay3.e0(pznVarD, c53Var.c());
                } else {
                    if (!obj2.equals(j7hVar)) {
                        t9f.b();
                        return null;
                    }
                    lieVarE0 = ay3.e0(pzn.b, alo.b);
                }
                return c53Var.a(lieVarE0, null);
            case 16:
                lz3 lz3Var2 = (lz3) obj;
                lz3Var2.getClass();
                pz40Var.setValue(lz3Var2);
                return Unit.f46060a;
            case 17:
                lz3 lz3Var3 = (lz3) obj;
                lz3Var3.getClass();
                pz40Var.setValue(lz3Var3);
                return Unit.f46060a;
            case 18:
                lz3 lz3Var4 = (lz3) obj;
                lz3Var4.getClass();
                pz40Var.setValue(lz3Var4);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str = (String) obj;
                str.getClass();
                pz40Var.setValue(str);
                return Unit.f46060a;
            case 20:
                am amVar = (am) obj;
                amVar.getClass();
                pz40Var.setValue(amVar);
                return Unit.f46060a;
            case 21:
                ifj ifjVar = (ifj) obj;
                ifjVar.getClass();
                pz40Var.setValue(ifjVar);
                return Unit.f46060a;
            case 22:
                am amVar2 = (am) obj;
                amVar2.getClass();
                pz40Var.setValue(amVar2);
                return Unit.f46060a;
            case 23:
                ifj ifjVar2 = (ifj) obj;
                ifjVar2.getClass();
                pz40Var.setValue(ifjVar2);
                return Unit.f46060a;
            case 24:
                qkx qkxVar3 = (qkx) obj;
                long j9 = qkxVar3.f28908a;
                pz40Var.setValue(qkxVar3);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((iz3) obj).getClass();
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((kz3) obj).getClass();
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rv2 rv2Var = (rv2) obj;
                rv2Var.getClass();
                pz40Var.setValue(rv2Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                pz40Var.setValue(bool5);
                return Unit.f46060a;
            default:
                Float f = (Float) obj;
                f.getClass();
                ((Function1) pz40Var.getValue()).invoke(f);
                return Unit.f46060a;
        }
    }
}
