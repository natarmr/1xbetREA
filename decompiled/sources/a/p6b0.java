package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p6b0 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6b0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    private final Object a(Object obj, Object obj2) {
        k2c0 k2c0Var = (k2c0) obj;
        org.xplatform.personal.impl.presentation.edit.a aVar = (org.xplatform.personal.impl.presentation.edit.a) this.f41192a;
        fl70 fl70Var = org.xplatform.personal.impl.presentation.edit.a.X1;
        aVar.getClass();
        rek0 rek0Var = rek0.b;
        if (k2c0Var != null) {
            if (k2c0Var instanceof j2c0) {
                ii iiVar = aVar.O1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = aVar.H(R.string.caution);
                String strH2 = aVar.H(R.string.change_profile_success_message);
                String strH3 = aVar.H(R.string.ok_new);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "REQUEST_CHANGES_SUCCESS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1496);
                androidx.fragment.app.e eVarC = aVar.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
            } else if (k2c0Var instanceof f2c0) {
                wdk0 wdk0Var = aVar.Q1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                String strH4 = aVar.H(R.string.min_date_birthday_error);
                strH4.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH4, null, null, null, null, 124), aVar, null, null, false, null, 1020);
            } else if (k2c0Var instanceof h2c0) {
                j120.Y(aVar);
                ii iiVar2 = aVar.O1;
                if (iiVar2 == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH5 = aVar.H(R.string.caution);
                String strH6 = aVar.H(R.string.data_lost_warning);
                String strH7 = aVar.H(R.string.ok_new);
                strH7.getClass();
                DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, aVar.H(R.string.cancel), (String) null, "REQUEST_CHANGES_LOST_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC2 = aVar.C();
                eVarC2.getClass();
                iiVar2.d(dialogFields2, eVarC2);
            } else if (k2c0Var instanceof i2c0) {
                wdk0 wdk0Var2 = aVar.Q1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                String strH8 = aVar.H(R.string.error);
                strH8.getClass();
                wdk0.k(wdk0Var2, new xdk0(rek0Var, strH8, null, null, null, null, 124), aVar, null, null, false, null, 1020);
            } else if (k2c0Var instanceof g2c0) {
                aVar.I0(((g2c0) k2c0Var).f10553a);
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object b(Object obj, Object obj2) {
        d7a d7aVar = (d7a) obj;
        org.xplatform.personal.impl.presentation.edit.a aVar = (org.xplatform.personal.impl.presentation.edit.a) this.f41192a;
        fl70 fl70Var = org.xplatform.personal.impl.presentation.edit.a.X1;
        if (aVar.N1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        String strH = aVar.H(R.string.personal_data_entry_title);
        strH.getClass();
        gl5.q(aVar, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH);
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        org.xplatform.personal.impl.presentation.edit.a aVar = (org.xplatform.personal.impl.presentation.edit.a) this.f41192a;
        fl70 fl70Var = org.xplatform.personal.impl.presentation.edit.a.X1;
        aVar.G0().b.setFirstButtonEnabled(zBooleanValue);
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2) {
        ((org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) this.f41192a).P((Throwable) obj);
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2) {
        ((org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) this.f41192a).P((Throwable) obj);
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2) {
        ((org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) this.f41192a).P((Throwable) obj);
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2) {
        ((idc0) this.f41192a).K0((k520) obj);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:428:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:476:0x0cf8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.Object, still in use, count: 2, list:
          (r1v10 java.lang.Object) from 0x0ce7: PHI (r1 I:??) = (r1v5 java.lang.Object), (r1v10 java.lang.Object) binds: [B:468:0x0ce6, B:492:0x0ce7] A[DONT_GENERATE, DONT_INLINE]
          (r1v10 java.lang.Object) from 0x0cdd: CHECK_CAST (androidx.fragment.app.Fragment) (r1v10 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 3406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p6b0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
