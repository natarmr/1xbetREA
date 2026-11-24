package a;

import android.content.Context;
import android.javax.sip.message.Response;
import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a540 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f251a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a540(byte b, Object obj, Function1 function1) {
        this.f251a = b;
        this.c = function1;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v97, types: [a.chf0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        n940 n940Var;
        byte b = this.f251a;
        jp60 jp60Var = jp60.f16887a;
        qp60 qp60Var = qp60.f29101a;
        ?? r6 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ?? r7 = (Function1) obj;
                t440 t440Var = ((i740) obj2).h;
                c440 c440Var = t440Var instanceof c440 ? (c440) t440Var : null;
                r6 = c440Var != null ? c440Var.f3707a : 0;
                ?? r5 = r6 != 0 ? r6 : "";
                if (r5.length() > 0) {
                    r7.invoke(r5);
                }
                return Unit.f46060a;
            case 1:
                m940 m940Var = (m940) obj2;
                String str = (String) obj;
                p7m0 p7m0Var = m940Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    n940Var = (n940) value;
                    m940Var.f.getClass();
                } while (!p7m0Var.m(value, n940.a(n940Var, null, false, eui0.e(n940Var.c, str), null, 11)));
                return Unit.f46060a;
            case 2:
                ((Function1) obj).invoke(Long.valueOf(((qa40) obj2).f28377a));
                return Unit.f46060a;
            case 3:
                ((Function1) obj).invoke(new wqk0(((br40) obj2).c));
                return Unit.f46060a;
            case 4:
                return new u6n(d4d.STATIC_WHITE40, (w6n) obj2, (d280) obj);
            case 5:
                myr0 myr0Var = (myr0) obj;
                ((d650) obj2).H.c(new AggregatorScreenModel(null, null, 0L, new qm1(myr0Var.f22617a, s9s0.f31863a, myr0Var.f.f13873a, false), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                return Unit.f46060a;
            case 6:
                myr0 myr0Var2 = (myr0) obj;
                ((p850) obj2).W.c(new AggregatorScreenModel(null, null, 0L, new qm1(myr0Var2.f22617a, s9s0.f31863a, myr0Var2.f.f13873a, false), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                return Unit.f46060a;
            case 7:
                h2h0 h2h0Var = (h2h0) obj2;
                Function0 function0 = (Function0) obj;
                int size = h2h0Var.f12334a.size() - h2h0Var.c.a().size();
                for (int i = 0; i < size; i++) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 8:
                ((Function1) obj).invoke(Integer.valueOf(((yo5) obj2).f42967a));
                return Unit.f46060a;
            case 9:
                ((Function1) obj).invoke(Integer.valueOf(((vo5) obj2).f37748a));
                return Unit.f46060a;
            case 10:
                ((Function1) obj).invoke(Integer.valueOf(((xo5) obj2).f41199a));
                return Unit.f46060a;
            case 11:
                ((Function1) obj).invoke(((aw50) ((dw50) obj2)).h.c);
                return Unit.f46060a;
            case 12:
                age0 age0Var = (age0) obj;
                if (((a14) ((y3v) obj2).b).get() == 0) {
                    age0Var.invoke();
                }
                return Unit.f46060a;
            case 13:
                return x2x.G((String) obj2, aum0.e, new ugi0[0], new b530(obj, (byte) 29));
            case 14:
                ki60 ki60Var = (ki60) obj2;
                xk80 xk80Var = (xk80) obj;
                htz htzVar = ki60.q2;
                k3t0 k3t0VarP0 = ki60Var.P0();
                zz2 zz2Var = ki60Var.n2;
                iiy[] iiyVarArr = ki60.r2;
                k3t0VarP0.x(new ci60(zz2Var.n(ki60Var, iiyVarArr[1]).intValue(), xk80Var.k(), xk80Var.n(), ki60Var.o2.n(ki60Var, iiyVarArr[2])));
                return Unit.f46060a;
            case 15:
                ki60 ki60Var2 = (ki60) obj2;
                ki60Var2.p2 = (Function0) obj;
                ki60Var2.P0().x(yh60.f42623a);
                return Unit.f46060a;
            case 16:
                ctf0 ctf0Var = (ctf0) obj2;
                iun iunVar = iun.f15405a;
                a4x a4xVarO0 = dyb.o0(iunVar);
                a4x a4xVarO1 = dyb.o0(iunVar);
                a4x a4xVarO2 = dyb.o0(iunVar);
                String strA = ctf0Var.b.a(R.string.next, Arrays.copyOf(new Object[0], 0));
                lsm0 lsm0Var = ctf0Var.b;
                return new ui60(a4xVarO0, a4xVarO1, a4xVarO2, 0, 0, strA, lsm0Var.a(R.string.skip, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.next, Arrays.copyOf(new Object[0], 0)), ((wyu) obj).a());
            case 17:
                return new gj60(((f7u) obj2).x(((lbu) obj).j()));
            case 18:
                ((i3t0) obj2).x(new uh60(((ak60) obj).f));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Window window = (Window) obj2;
                cjv0 cjv0Var = (cjv0) obj;
                return new k9o0(window != null ? Integer.valueOf(window.getStatusBarColor()) : null, window != null ? Integer.valueOf(window.getNavigationBarColor()) : null, cjv0Var != null ? Boolean.valueOf(cjv0Var.f4478a.u()) : null, cjv0Var != null ? Boolean.valueOf(cjv0Var.f4478a.t()) : null);
            case 20:
                jiq0.s0(((cxa) obj2).f5114a, null, (Function1) obj);
                return Unit.f46060a;
            case 21:
                ewa ewaVar = new ewa("", "", "");
                kg kgVarB = ((dmt) obj2).b();
                boolean zA = ((iqt) obj).f15225a.a();
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new ru60(ewaVar, kgVarB, zA, true, true, 0L, lunVar, null, null, iun.f15405a, null, null, 0L);
            case 22:
                ((Function1) obj).invoke(new rw60(((Context) obj2).getClass().getName()));
                return Unit.f46060a;
            case 23:
                Function0 function1 = (Function0) obj;
                if (!((r170) obj2).c) {
                    function1.invoke();
                }
                return Unit.f46060a;
            case 24:
                Function1 function2 = (Function1) obj;
                if (((k570) obj2).a().c) {
                    function2.invoke(qp60Var);
                } else {
                    function2.invoke(jp60Var);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Function1 function3 = (Function1) obj;
                if (((dd50) obj2).c) {
                    function3.invoke(qp60Var);
                } else {
                    function3.invoke(jp60Var);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) obj).invoke(Integer.valueOf(((e180) obj2).f7027a));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                z880 z880Var = (z880) obj2;
                m2r m2rVar = (m2r) obj;
                xi70 xi70Var = z880.U1;
                j120.Y(z880Var);
                m2rVar.e.clearFocus();
                m2rVar.h.clearFocus();
                aa80 aa80VarH0 = z880Var.H0();
                ?? r0 = aa80VarH0.t;
                p7m0 p7m0Var2 = aa80VarH0.z;
                a980 a980Var = ((d980) p7m0Var2.getValue()).d;
                String str2 = a980Var != null ? a980Var.c : null;
                r0.V(str2 != null ? str2 : "", ((d980) p7m0Var2.getValue()).b);
                sac.V(jiu0.a(aa80VarH0), new gk70(1, aa80VarH0, aa80.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 28), null, aa80VarH0.g.f22085a, new mt00((diu0) aa80VarH0, (yje) r6, (byte) 26), 10);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                pd80 pd80Var = (pd80) obj;
                ((Function2) obj2).invoke(Integer.valueOf(pd80Var.f26796a), pd80Var.c);
                return Unit.f46060a;
            default:
                qd80 qd80Var = (qd80) obj;
                ((Function2) obj2).invoke(Integer.valueOf(qd80Var.f28523a), qd80Var.c);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ a540(Object obj, Object obj2, byte b) {
        this.f251a = b;
        this.b = obj;
        this.c = obj2;
    }
}
