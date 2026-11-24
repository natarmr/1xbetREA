package a;

import android.location.Address;
import android.location.Geocoder;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jkt extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public double j;
    public double k;
    public boolean l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkt(mkt mktVar, double d, double d2, Geocoder geocoder, yje yjeVar) {
        super(2, yjeVar);
        this.m = mktVar;
        this.j = d;
        this.k = d2;
        this.n = geocoder;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new jkt((mkt) this.m, this.j, this.k, (Geocoder) obj2, yjeVar);
            default:
                return new jkt((sp70) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((jkt) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        s470 s470Var;
        double d;
        double d2;
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                mkt mktVar = (mkt) this.m;
                wne wneVar = wne.f39444a;
                boolean z = this.l;
                if (!z) {
                    z1x.P(obj);
                    bby bbyVar = mktVar.n;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    mktVar.n = null;
                    xak xakVar = mktVar.b;
                    double d3 = this.j;
                    double d4 = this.k;
                    Geocoder geocoder = (Geocoder) obj2;
                    xakVar.getClass();
                    try {
                        List<Address> fromLocation = geocoder.getFromLocation(d3, d4, 1);
                        if (fromLocation == null) {
                            fromLocation = iun.f15405a;
                        }
                        if (fromLocation == null || !fromLocation.isEmpty()) {
                            Iterator<T> it = fromLocation.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.d(((Address) it.next()).getCountryCode(), "RU")) {
                                    mktVar.f.d(new ikt(mktVar, (byte) 2));
                                }
                                break;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    p7m0 p7m0Var = mktVar.m;
                    o8h0 o8h0Var = o8h0.c;
                    this.l = true;
                    p7m0Var.getClass();
                    p7m0Var.o(null, o8h0Var);
                    if (Unit.f46060a == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                sp70 sp70Var = (sp70) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.l;
                if (!z2) {
                    z1x.P(obj);
                    if (!sp70Var.o.a()) {
                        return Unit.f46060a;
                    }
                    s470 s470Var2 = sp70Var.I.f42064a;
                    double dA = sp70Var.p.a();
                    double dA2 = sp70Var.q.a();
                    t0u t0uVar = sp70Var.G;
                    this.m = s470Var2;
                    this.j = dA;
                    this.k = dA2;
                    this.l = true;
                    Object objA = t0uVar.a(this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                    obj = objA;
                    s470Var = s470Var2;
                    d = dA;
                    d2 = dA2;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d2 = this.k;
                    d = this.j;
                    s470Var = (s470) this.m;
                    z1x.P(obj);
                }
                String str = (String) obj;
                String strB = s470Var.b();
                pn40 pn40Var = pn40.f27267a;
                p3u0 p3u0Var = p3u0.c;
                sp70Var.b.d(new jl40((Object) sp70Var, (Object) strB, (Object) xp20.f(new Pair("$MAX_BET", pn40.d(d2, str, p3u0Var)), new Pair("$MIN_BET", pn40.d(d, str, p3u0Var))), (byte) 17));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkt(sp70 sp70Var, yje yjeVar) {
        super(2, yjeVar);
        this.n = sp70Var;
    }
}
