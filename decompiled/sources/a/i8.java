package a;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.app_update.impl.presentation.apk_service.AppUpdateDownloadApkService;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i8 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    private final Object a(Object obj, Object obj2) {
        wl3 wl3Var = (wl3) obj;
        dm3 dm3Var = (dm3) this.f41192a;
        qek0 qek0Var = dm3.U1;
        dm3Var.getClass();
        jtv jtvVar = jtv.b;
        if (!Intrinsics.d(wl3Var, rl3.f30677a)) {
            if (Intrinsics.d(wl3Var, ul3.f35854a)) {
                hfk0 hfk0Var = tn3.c2;
                androidx.fragment.app.e eVarC = dm3Var.C();
                eVarC.getClass();
                hfk0Var.getClass();
                String str = tn3.e2;
                if (eVarC.J(str) == null && !eVarC.K) {
                    new tn3().H0(eVarC, str);
                }
                dm3Var.I0().x(jtvVar);
            } else if (wl3Var instanceof sl3) {
                AppUpdateDownloadApkService appUpdateDownloadApkService = dm3Var.R1;
                if (appUpdateDownloadApkService != null) {
                    sl3 sl3Var = (sl3) wl3Var;
                    String str2 = sl3Var.f32378a;
                    String str3 = sl3Var.b;
                    str2.getClass();
                    str3.getClass();
                    ((gl3) appUpdateDownloadApkService.e.getValue()).w(sj3.Y(appUpdateDownloadApkService), str2, str3);
                } else {
                    Context contextD = dm3Var.D();
                    if (contextD != null) {
                        Intent intent = new Intent(dm3Var.D(), (Class<?>) AppUpdateDownloadApkService.class);
                        sl3 sl3Var2 = (sl3) wl3Var;
                        intent.putExtra("KEY_APP_UPDATE_APK_URL", sl3Var2.b);
                        intent.putExtra("KEY_APP_UPDATE_APK_VERSION", sl3Var2.f32378a);
                        contextD.bindService(intent, (am3) dm3Var.P1.getValue(), 1);
                    }
                }
                dm3Var.I0().x(jtvVar);
            } else if (Intrinsics.d(wl3Var, vl3.f37603a)) {
                dm3Var.G0();
                dm3Var.I0().x(jtvVar);
            } else {
                if (!(wl3Var instanceof tl3)) {
                    t9f.b();
                    return null;
                }
                Intent intent2 = new Intent("android.intent.action.INSTALL_PACKAGE");
                tl3 tl3Var = (tl3) wl3Var;
                intent2.setDataAndType(FileProvider.c(dm3Var.o0(), new File(tl3Var.f34125a.getPath()), tl3Var.b.concat(".provider")), "application/vnd.android.package-archive");
                intent2.setFlags(268435457);
                dm3Var.o0().startActivity(intent2);
                dm3Var.I0().x(jtvVar);
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:282:0x072a  */
    /* JADX WARN: Code duplicated, block: B:339:0x0842  */
    /* JADX WARN: Code duplicated, block: B:341:0x0848  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [a.s10, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v58, types: [a.p7m0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.content.Intent] */
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
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v11 java.lang.Object, still in use, count: 2, list:
          (r6v11 java.lang.Object) from 0x083e: PHI (r6 I:??) = (r6v8 java.lang.Object), (r6v11 java.lang.Object) binds: [B:336:0x083d, B:488:0x083e] A[DONT_GENERATE, DONT_INLINE]
          (r6v11 java.lang.Object) from 0x0834: CHECK_CAST (a.t70) (r6v11 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i8.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
