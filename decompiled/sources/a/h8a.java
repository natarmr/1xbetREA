package a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h8a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12616a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h8a(Object obj, byte b) {
        this.f12616a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        xbk xbkVar;
        byte b = this.f12616a;
        Context context = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (cpt0) ((g9a) obj).h.get();
            case 1:
                return (g9a) ((i9a) obj).f14378a.get();
            case 2:
                pz40 pz40Var = s6t0.f31722a;
                return new iol(s6t0.b().f33626a.getSecondary40(), s6t0.b().f33626a.getSecondary40(), s6t0.b().f33626a.getSecondary40(), ((iwa) ((jwa) obj)).c, jol.b);
            case 3:
                uya uyaVar = (uya) obj;
                p7m0 p7m0Var = uyaVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    uyaVar.f.getClass();
                } while (!p7m0Var.m(value, kya.a((kya) value, null, null, null, null, false, false, 0L, null, 1007)));
                return Unit.f46060a;
            case 4:
                p7m0 p7m0Var2 = ((yya) obj).w;
                Boolean bool = Boolean.FALSE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool);
                return Unit.f46060a;
            case 5:
                return (scb) ((gii0) ((xex) obj).f40764a).b(sre0.f32672a.b(scb.class));
            case 6:
                return (mfb) ((gii0) ((chf0) obj).b).b(sre0.f32672a.b(mfb.class));
            case 7:
                return (agb) ((gii0) ((ehf0) obj).b).b(sre0.f32672a.b(agb.class));
            case 8:
                return (t6n) obj;
            case 9:
                ((k71) obj).invoke();
                return Unit.f46060a;
            case 10:
                p7m0 p7m0Var3 = ((eqb) obj).u;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var3.getClass();
                p7m0Var3.o(null, bool2);
                return Unit.f46060a;
            case 11:
                p7m0 p7m0Var4 = ((s1c) obj).x;
                do {
                    value2 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value2, f1c.a((f1c) value2, null, false, false, false, 127)));
                return Unit.f46060a;
            case 12:
                p7m0 p7m0Var5 = ((v7c) obj).Q;
                do {
                    value3 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value3, i7c.a((i7c) value3, null, null, null, null, false, false, false, 8191)));
                return Unit.f46060a;
            case 13:
                return Integer.valueOf(((rac) obj).h);
            case 14:
                wdc wdcVar = (wdc) obj;
                p7m0 p7m0Var6 = wdcVar.i.f25029a;
                do {
                    value4 = p7m0Var6.getValue();
                    value4.getClass();
                    wdcVar.f.getClass();
                } while (!p7m0Var6.m(value4, rdc.a((rdc) value4, null, 0.0d, null, null, false, 0.0d, null, false, null, 383)));
                return Unit.f46060a;
            case 15:
                ((ygc) obj).G(cgc.f4304a);
                return Unit.f46060a;
            case 16:
                ((trc) obj).i.o(null, i8d.c);
                return Unit.f46060a;
            case 17:
                int i = esc.m2;
                fiu0 fiu0Var = ((esc) obj).k2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 18:
                return ((iwc) obj).i.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((OnexDatabase) ((rrc) ((nhf0) obj).f23530a).b).r();
            case 20:
                return Float.valueOf(1.0f - ((nyq0) obj).getState().a());
            case 21:
                return ((Iterable) obj).iterator();
            case 22:
                return (x4d) obj;
            case 23:
                Function0 function0 = ((z6d) obj).l1;
                if (function0 != null) {
                    function0.invoke();
                }
                return Boolean.TRUE;
            case 24:
                gl5 gl5Var = hed.Q1;
                fiu0 fiu0Var2 = ((hed) obj).K1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (fed) ((gii0) ((ehf0) obj).b).b(sre0.f32672a.b(fed.class));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                bj5 bj5Var = yed.P1;
                fiu0 fiu0Var3 = ((yed) obj).K1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return kotlin.collections.a.c((Pair) obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                boolean zA = qkx.a(0L, 0L);
                View view = ((skd) obj).f32341a;
                if (zA) {
                    Context context2 = view.getContext();
                    Context baseContext = context2;
                    while (baseContext instanceof ContextWrapper) {
                        if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                            context = baseContext;
                        } else {
                            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                            if (contextWrapper.getBaseContext() != null) {
                                baseContext = contextWrapper.getBaseContext();
                            }
                        }
                        if (context != null) {
                            mjv0.f21914a.getClass();
                            njv0 njv0Var = ljv0.b;
                            njv0Var.getClass();
                            tq8 tq8Var = njv0Var.b(context).f18406a;
                            long jWidth = (((long) tq8Var.c().width()) << 32) | (((long) tq8Var.c().height()) & 4294967295L);
                            return new xbk(jWidth, q8a.e(context).p(n2x.Q(jWidth)));
                        }
                        Configuration configuration = context2.getResources().getConfiguration();
                        a7k a7kVarE = q8a.e(context2);
                        long jI = qbc.i(configuration.screenWidthDp, configuration.screenHeightDp);
                        xbkVar = new xbk(n2x.N(a7kVarE.G0(jI)), jI);
                    }
                    if (context != null) {
                        mjv0.f21914a.getClass();
                        njv0 njv0Var2 = ljv0.b;
                        njv0Var2.getClass();
                        tq8 tq8Var2 = njv0Var2.b(context).f18406a;
                        long jWidth2 = (((long) tq8Var2.c().width()) << 32) | (((long) tq8Var2.c().height()) & 4294967295L);
                        return new xbk(jWidth2, q8a.e(context).p(n2x.Q(jWidth2)));
                    }
                    Configuration configuration2 = context2.getResources().getConfiguration();
                    a7k a7kVarE2 = q8a.e(context2);
                    long jI2 = qbc.i(configuration2.screenWidthDp, configuration2.screenHeightDp);
                    xbkVar = new xbk(n2x.N(a7kVarE2.G0(jI2)), jI2);
                } else {
                    xbkVar = new xbk(0L, q8a.e(view.getContext()).p(n2x.Q(0L)));
                }
                return xbkVar;
            default:
                ((svd) obj).C();
                return Unit.f46060a;
        }
    }
}
