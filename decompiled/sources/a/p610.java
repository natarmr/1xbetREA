package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p610 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26431a;

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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xlw xlwVar;
        switch (this.f26431a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 1:
                wus wusVar = (wus) obj;
                wusVar.getClass();
                return new i310(wusVar);
            case 2:
                xa30 xa30Var = (xa30) obj;
                xa30Var.getClass();
                return new h310(xa30Var);
            case 3:
                ru90 ru90Var = (ru90) obj;
                if (ru90Var.h0()) {
                    c810 c810Var = ru90Var.b;
                    if (!c810Var.o) {
                        Function1 function1E = ru90Var.f31116a.e();
                        if (ru90Var.f31116a.d() != null) {
                            c810Var.U0();
                        } else if (function1E == null) {
                            c810Var.h = null;
                            c810Var.i = null;
                            c810Var.g = null;
                            c810Var.U0();
                        } else {
                            c810Var.h = null;
                            c810Var.i = null;
                            c810Var.z0(ru90Var, 9223372034707292159L, 0L);
                            c810Var.g = function1E;
                        }
                    }
                }
                return Unit.f46060a;
            case 4:
                ru90 ru90Var2 = (ru90) obj;
                if (ru90Var2.h0() && (xlwVar = ru90Var2.c) != null) {
                    c810 c810Var2 = ru90Var2.b;
                    hz40 hz40Var = c810Var2.r;
                    iz40 iz40Var = hz40Var != null ? (iz40) hz40Var.g(xlwVar) : null;
                    if (iz40Var != null) {
                        fp fpVar = c810Var2.q;
                        if (fpVar != null) {
                            fpVar.L(xlwVar);
                        }
                        c810Var2.S0(iz40Var);
                        iz40Var.b();
                    }
                }
                return Unit.f46060a;
            case 5:
                ((e7z) obj).h = true;
                return Unit.f46060a;
            case 6:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 7:
                String str = (String) obj;
                str.getClass();
                pz40 pz40Var = s6t0.f31722a;
                return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(str, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), true, null);
            case 8:
                jg10 jg10Var = (jg10) obj;
                jg10Var.getClass();
                int iIntValue = 0;
                if (jg10Var instanceof hg10) {
                    yh10 yh10Var = ((hg10) jg10Var).f12997a;
                    Iterator it = yh10Var.f42614a.e.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                        } else if (yh10Var.c.f39192a != ((ei10) it.next()).f7836a) {
                            i++;
                        }
                    }
                    Integer numValueOf = i >= 0 ? Integer.valueOf(i) : null;
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    }
                }
                return Integer.valueOf(iIntValue);
            case 9:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 10:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 11:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 12:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 13:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case 14:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                th8.printStackTrace();
                return Unit.f46060a;
            case 15:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                th9.printStackTrace();
                return Unit.f46060a;
            case 16:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 17:
                htz htzVar = zp10.U1;
                return Boolean.valueOf(obj instanceof fl);
            case 18:
                hvk0 hvk0Var = (hvk0) obj;
                hvk0Var.getClass();
                return hvk0Var.getKey();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new b1w(cpVar, (byte) 24));
                return Unit.f46060a;
            case 20:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new b1w(cpVar2, (byte) 25));
                return Unit.f46060a;
            case 21:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                th10.printStackTrace();
                return Unit.f46060a;
            case 22:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                th11.printStackTrace();
                return Unit.f46060a;
            case 23:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                th12.printStackTrace();
                return Unit.f46060a;
            case 24:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                th13.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                th14.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                th15.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                th16.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                th17.printStackTrace();
                return Unit.f46060a;
            default:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                th18.printStackTrace();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ p610(byte b) {
        this.f26431a = b;
    }
}
