package a;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class s1o extends bag0 {
    public final /* synthetic */ byte d = 1;
    public final p4 e;
    public final Object f;

    public s1o(vkr0 vkr0Var, int i, imx imxVar) {
        super(vkr0Var, i);
        this.e = imxVar;
        this.f = new xoo(1.5f, 60000L);
    }

    public Object n1(Object obj, Object obj2, xdr xdrVar) throws InterruptedException {
        if (obj2 != null) {
            AtomicReference atomicReference = (AtomicReference) ((ilp0) this.f).f14992a;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            while (!atomicReference.compareAndSet(null, countDownLatch)) {
                if (atomicReference.get() != null) {
                }
            }
            bvt0 bvt0Var = new bvt0((ilp0) this.f);
            xdrVar.F(obj2, obj, bvt0Var);
            CountDownLatch countDownLatch2 = (CountDownLatch) ((AtomicReference) ((ilp0) this.f).f14992a).get();
            if (countDownLatch2 != null) {
                countDownLatch2.await();
            }
            return bvt0Var.b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [a.bag0, a.p4, a.s1o] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.yut0, java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Exception] */
    @Override // a.p4
    public final Object q0(td9 td9Var) throws InterruptedException, c44 {
        switch (this.d) {
            case 0:
                ?? r4 = 0;
                while (true) {
                    if (this.c >= 0 && ((xoo) this.f).e > this.c) {
                        if (r4 == 0) {
                            throw new c44("api-call failed due to retry limits, but no exception has tracked", (byte) 15);
                        }
                        throw r4;
                    }
                    if (((xoo) this.f).e > 0) {
                        Thread.sleep(((xoo) this.f).d);
                    }
                    try {
                        return ((imx) this.e).q0(td9Var);
                    } catch (ovt0 e) {
                        r4 = e;
                        F0(r4);
                        ((xoo) this.f).a();
                    } catch (yut0 e2) {
                        r4 = e2;
                        int i = r4.b;
                        if (i != 1 && i != 10 && i != 13) {
                            throw r4;
                        }
                        F0(r4);
                        ((xoo) this.f).a();
                    } catch (zut0 e3) {
                        r4 = e3;
                        F0(r4);
                        ((xoo) this.f).a();
                    }
                }
                break;
            default:
                byte b = this.c;
                if (b >= 0) {
                    int i2 = 0;
                    while (true) {
                        try {
                            CountDownLatch countDownLatch = (CountDownLatch) ((AtomicReference) ((ilp0) this.f).f14992a).get();
                            if (countDownLatch != null) {
                                countDownLatch.await();
                            }
                            return ((ce40) this.e).q0(td9Var);
                        } catch (yut0 e4) {
                            vkr0 vkr0Var = (vkr0) this.b;
                            nvt0 nvt0Var = (nvt0) vkr0Var.e;
                            int i3 = e4.b;
                            boolean z = i3 == 14;
                            Bundle bundle = e4.d;
                            if (z) {
                                String string = bundle != null ? bundle.getString("captcha_img", "") : null;
                                String str = (String) n1(new cvt0(string == null ? "" : string, Integer.valueOf(bundle != null ? bundle.getInt("captcha_height", -1) : -1), Integer.valueOf(bundle != null ? bundle.getInt("captcha_width", -1) : -1), Double.valueOf(bundle != null ? bundle.getDouble("captcha_ratio", -1.0d) : -1.0d), (bundle == null || !bundle.containsKey("is_refresh_enabled")) ? false : bundle.getBoolean("is_refresh_enabled", false)), nvt0Var, qwt0.f29451a);
                                if (str == null) {
                                    throw e4;
                                }
                                String string2 = bundle != null ? bundle.getString("captcha_sid", "") : null;
                                td9Var.b = string2 != null ? string2 : "";
                                td9Var.d = (bundle == null || !bundle.containsKey("captcha_attempt")) ? null : Integer.valueOf(bundle.getInt("captcha_attempt", -1));
                                td9Var.e = (bundle == null || !bundle.containsKey("captcha_ts")) ? null : Double.valueOf(bundle.getDouble("captcha_ts", -1.0d));
                                td9Var.c = str;
                            } else if (i3 == 17) {
                                String string3 = bundle != null ? bundle.getString("validation_url", "") : null;
                                dvt0 dvt0Var = (dvt0) n1(string3 != null ? string3 : "", nvt0Var, swt0.f32941a);
                                if (!Intrinsics.d(dvt0Var, dvt0.g)) {
                                    if (dvt0Var == null || !dvt0Var.f) {
                                        throw e4;
                                    }
                                    String str2 = dvt0Var.b;
                                    str2.getClass();
                                    String str3 = dvt0Var.f6761a;
                                    int i4 = dvt0Var.d;
                                    long j = dvt0Var.e;
                                    UserId userId = dvt0Var.c;
                                    if (userId == null) {
                                        userId = UserId.b;
                                    }
                                    vkr0Var.A(kotlin.collections.a.c(new xut0(i4, j, userId, str2, str3)));
                                }
                            } else {
                                if (i3 != 24) {
                                    if (nvt0Var == null) {
                                        throw e4;
                                    }
                                    throw e4;
                                }
                                String string4 = bundle != null ? bundle.getString("confirmation_text", "") : null;
                                Boolean bool = (Boolean) n1(string4 != null ? string4 : "", nvt0Var, rwt0.f31232a);
                                if (bool == null) {
                                    throw e4;
                                }
                                if (bool.equals(Boolean.FALSE)) {
                                    throw e4;
                                }
                                td9Var.f33756a = bool.booleanValue();
                            }
                            if (i2 != b) {
                                i2++;
                            }
                        }
                    }
                }
                throw new c44("Can't confirm validation due to retry limit!", (byte) 15);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1o(vkr0 vkr0Var, int i, ce40 ce40Var, ilp0 ilp0Var) {
        super(vkr0Var, i);
        ilp0Var.getClass();
        this.e = ce40Var;
        this.f = ilp0Var;
    }
}
