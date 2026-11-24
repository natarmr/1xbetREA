package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ez80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gz80 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez80(gz80 gz80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gz80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gz80 gz80Var = this.k;
        switch (b) {
            case 0:
                ez80 ez80Var = new ez80(gz80Var, yjeVar, (byte) 0);
                ez80Var.j = ((Boolean) obj).booleanValue();
                return ez80Var;
            default:
                return new ez80(gz80Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ez80) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ez80) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        by80 by80Var;
        p7m0 p7m0Var;
        Object value3;
        String lowerCase;
        byte b = this.i;
        gz80 gz80Var = this.k;
        Object obj2 = null;
        Object[] objArr = 0;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    int i = gz80.M;
                    bby bbyVar = gz80Var.I;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        bby bbyVar2 = gz80Var.I;
                        if (bbyVar2 != null) {
                            bbyVar2.cancel(null);
                        }
                        gz80Var.I = sac.V(jiu0.a(gz80Var), new dz80(gz80Var, (byte) 3), null, gz80Var.v.b, new ez80(gz80Var, objArr == true ? 1 : 0, b2), 10);
                    }
                }
                int i2 = gz80.M;
                p7m0 p7m0Var2 = gz80Var.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, az80.a((az80) value, z, null, null, null, 14)));
                return Unit.f46060a;
            default:
                oyg0 oyg0Var = gz80Var.f;
                ocj ocjVar = gz80Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    dq00 dq00Var = gz80Var.w;
                    this.j = true;
                    obj = dq00Var.g(this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list = (List) obj;
                int i3 = gz80.M;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, az80.a((az80) value2, false, new j0g0(list), null, null, 13)));
                long j = gz80Var.p;
                String lowerCase2 = kotlin.text.c.r(gz80Var.o, BundleUtil.UNDERLINE_TAG, Separators.SP, false).toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (lowerCase2.length() != 0) {
                    b2 = (!gz80Var.q || j == 0) ? (byte) 0 : (byte) 1;
                    for (Object obj3 : list) {
                        by80 by80Var2 = (by80) obj3;
                        if (kotlin.text.c.o(by80Var2.f3405a, lowerCase2) && (b2 == 0 || Intrinsics.d(by80Var2.b, String.valueOf(j)))) {
                            obj2 = obj3;
                            by80Var = (by80) obj2;
                            if (by80Var != null) {
                                p7m0Var = ocjVar.f25029a;
                                do {
                                    value3 = p7m0Var.getValue();
                                    value3.getClass();
                                    oyg0Var.getClass();
                                    lowerCase = by80Var.f3405a.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                } while (!p7m0Var.m(value3, az80.a((az80) value3, false, null, kotlin.collections.a.c(lowerCase), null, 11)));
                                gz80Var.M(by80Var);
                            }
                        }
                    }
                    by80Var = (by80) obj2;
                    if (by80Var != null) {
                        p7m0Var = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                            lowerCase = by80Var.f3405a.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        } while (!p7m0Var.m(value3, az80.a((az80) value3, false, null, kotlin.collections.a.c(lowerCase), null, 11)));
                        gz80Var.M(by80Var);
                    }
                }
                return Unit.f46060a;
        }
    }
}
