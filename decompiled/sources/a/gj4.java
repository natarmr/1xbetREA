package a;

import android.app.Dialog;
import android.hardware.camera2.CameraManager;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gj4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11378a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gj4(fy4 fy4Var, Function1 function1) {
        this.f11378a = (byte) 5;
        this.c = fy4Var;
        this.b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        Object zfs0Var;
        bby bbyVar;
        bby bbyVar2;
        jge0 jge0Var;
        byte b = 10;
        boolean z = true;
        Object[] objArr = 0;
        yje yjeVar = null;
        switch (this.f11378a) {
            case 0:
                ((Function1) this.b).invoke(new ph4(((si4) this.c).b));
                return Unit.f46060a;
            case 1:
                ctf0 ctf0Var = (ctf0) this.b;
                g2v g2vVar = (g2v) this.c;
                ctf0Var.getClass();
                return new zn4(false, ctf0Var.b.a(R.string.authenticator_sessions, Arrays.copyOf(new Object[0], 0)), true, false, g2v.d(g2vVar, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, null, 350), false, null, iun.f15405a);
            case 2:
                ((Function1) this.b).invoke((k3q) this.c);
                return Unit.f46060a;
            case 3:
                ((Function1) this.b).invoke(new h74(((ao4) this.c).f1183a));
                return Unit.f46060a;
            case 4:
                ((Function1) this.b).invoke((q84) this.c);
                return Unit.f46060a;
            case 5:
                fy4 fy4Var = (fy4) this.c;
                Function1 function1 = (Function1) this.b;
                m97 m97Var = (m97) CollectionsKt.U(fy4Var.L.g().e);
                fy4Var.K.a(m97Var);
                function1.invoke(m97Var);
                return Unit.f46060a;
            case 6:
                return new s75(new m65(false, true, iun.f15405a, false, xun.f41520a), ((pru) this.c).a().b.f13233a, ((iqt) this.b).f15225a.a(), false);
            case 7:
                ((uhd) this.b).c = (Function0) this.c;
                return Unit.f46060a;
            case 8:
                sc5 sc5Var = (sc5) this.b;
                g7z g7zVar = (g7z) this.c;
                sc5Var.w = sc5Var.r.a(g7zVar.f10839a.d(), g7zVar.getLayoutDirection(), g7zVar);
                return Unit.f46060a;
            case 9:
                gd5 gd5Var = (gd5) this.b;
                gd5Var.d((View) this.c);
                gd5Var.c = null;
                return Unit.f46060a;
            case 10:
                dk5 dk5Var = (dk5) this.b;
                List<vk5> list = (List) this.c;
                h7k h7kVar = dk5Var.s;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (vk5 vk5Var : list) {
                    vk5Var.getClass();
                    if (vk5Var instanceof tjz) {
                        tjz tjzVar = (tjz) vk5Var;
                        if (tjzVar instanceof sjz) {
                            zfs0Var = new ljz(((sjz) tjzVar).f ^ z);
                        } else if (tjzVar instanceof rjz) {
                            zfs0Var = kjz.f18411a;
                        } else if (tjzVar instanceof qjz) {
                            zfs0Var = jjz.f16641a;
                        } else if (tjzVar instanceof ojz) {
                            zfs0Var = hjz.f13183a;
                        } else if (tjzVar instanceof pjz) {
                            zfs0Var = ijz.f14902a;
                        } else {
                            if (!(tjzVar instanceof njz)) {
                                t9f.b();
                                return null;
                            }
                            zfs0Var = gjz.f11422a;
                        }
                    } else if (vk5Var instanceof lfs0) {
                        zfs0Var = kfs0.f18211a;
                    } else if (vk5Var instanceof aes0) {
                        zfs0Var = new zds0(((aes0) vk5Var).b);
                    } else if (vk5Var instanceof ogs0) {
                        ogs0 ogs0Var = (ogs0) vk5Var;
                        zfs0Var = new zfs0(ogs0Var.f25234a, ogs0Var.b, ogs0Var.i, ogs0Var.j, ogs0Var.f, ogs0Var.h, ogs0Var.g, ogs0Var.k);
                    } else if (vk5Var instanceof ues0) {
                        zfs0Var = tes0.f33837a;
                    } else if (vk5Var instanceof gxn) {
                        zfs0Var = fxn.f10317a;
                    } else {
                        if (!(vk5Var instanceof tds0)) {
                            t9f.b();
                            return null;
                        }
                        zfs0Var = sds0.f32046a;
                    }
                    arrayList.add(zfs0Var);
                    z = true;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    w9h0 w9h0Var = (w9h0) obj;
                    if (!(w9h0Var instanceof fxn) && !(w9h0Var instanceof tes0) && !(w9h0Var instanceof sds0)) {
                        arrayList2.add(obj);
                    }
                }
                qes0 qes0Var = new qes0(h7kVar, arrayList2, dk5Var.S(), f1t0.e0(dk5Var.c));
                dk5Var.P = qes0Var;
                return qes0Var;
            case 11:
                yw5 yw5Var = (yw5) this.b;
                ww5 ww5Var = (ww5) this.c;
                b4e b4eVar = yw5Var.f43354a;
                b4eVar.getClass();
                synchronized (b4eVar.d) {
                    if (((LinkedHashSet) b4eVar.f).remove(ww5Var) && ((LinkedHashSet) b4eVar.f).isEmpty()) {
                        b4eVar.h();
                    }
                    break;
                }
                return Unit.f46060a;
            case 12:
                a8q0 a8q0Var = (a8q0) this.b;
                pz40 pz40Var = (pz40) this.c;
                if (!o9q0.b(a8q0Var.b, ((a8q0) pz40Var.getValue()).b) || !Intrinsics.d(a8q0Var.c, ((a8q0) pz40Var.getValue()).c)) {
                    pz40Var.setValue(a8q0Var);
                }
                return Unit.f46060a;
            case 13:
                e9q0 e9q0Var = (e9q0) this.b;
                j83 j83Var = (j83) this.c;
                if (e9q0Var == null) {
                    return j83Var;
                }
                SnapshotStateList snapshotStateList = e9q0Var.c;
                boolean zIsEmpty = snapshotStateList.isEmpty();
                j83 j83Var2 = e9q0Var.b;
                if (!zIsEmpty) {
                    m2q0 m2q0Var = new m2q0(j83Var2);
                    int size = snapshotStateList.size();
                    for (int i = 0; i < size; i++) {
                        ((Function1) snapshotStateList.get(i)).invoke(m2q0Var);
                    }
                    j83Var2 = m2q0Var.b;
                }
                e9q0Var.b = j83Var2;
                return j83Var2 == null ? j83Var : j83Var2;
            case 14:
                qjj.W((vne) this.b, null, null, new la6((bxq0) this.c, yjeVar, objArr == true ? 1 : 0), 3);
                return Boolean.TRUE;
            case 15:
                ((x6f) this.b).invoke(((gc6) ((cp) this.c).u()).c);
                return Unit.f46060a;
            case 16:
                Dialog dialog = (Dialog) this.b;
                Function0 function0 = (Function0) this.c;
                cl5 cl5Var = hz6.p2;
                dialog.dismiss();
                function0.invoke();
                return Unit.f46060a;
            case 17:
                de7 de7Var = (de7) this.b;
                ao6 ao6Var = (ao6) this.c;
                BetZip betZip = de7Var.c;
                if (betZip != null) {
                    ao6Var.invoke(betZip);
                }
                return Unit.f46060a;
            case 18:
                h38 h38Var = (h38) this.b;
                pyq pyqVar = (pyq) this.c;
                yk5 yk5Var = h38.V1;
                j120.Y(h38Var);
                DsPhoneTextField dsPhoneTextField = pyqVar.e;
                dsPhoneTextField.clearFocus();
                d48 d48VarH0 = h38Var.H0();
                String strValueOf = String.valueOf(dsPhoneTextField.getCode());
                String str = ((v38) d48VarH0.B.getValue()).b;
                if (!StringsKt.W(str) && (((bbyVar = d48VarH0.G) == null || !bbyVar.isActive()) && ((bbyVar2 = d48VarH0.I) == null || !bbyVar2.isActive()))) {
                    if (d48VarH0.J) {
                        d48VarH0.I = sac.V(jiu0.a(d48VarH0), new ye7(1, d48VarH0, d48.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, d48VarH0.d.b, new xb2((Object) str, (Object) d48VarH0, (Object) strValueOf, (yje) null, (byte) 8), 10);
                    } else {
                        d48VarH0.C.f(n38.f22837a);
                    }
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function1) this.b).invoke(new tb8(((xb8) this.c).f40589a));
                return Unit.f46060a;
            case 20:
                ((Function1) ((pz40) this.c).getValue()).invoke((rd8) this.b);
                return Unit.f46060a;
            case 21:
                return new cz8((String) this.b, (String) this.c);
            case 22:
                Function0 function2 = (Function0) this.b;
                s460 s460Var = (s460) this.c;
                if (function2 != null && (jge0Var = (jge0) function2.invoke()) != null) {
                    return jge0Var;
                }
                if (!s460Var.g1().n) {
                    s460Var = null;
                }
                if (s460Var != null) {
                    return k9x.r(0L, n2x.Q(s460Var.c));
                }
                return null;
            case 23:
                a99 a99Var = (a99) this.b;
                a99Var.h((y89) this.c);
                a99Var.c = new ej8(b);
                return Unit.f46060a;
            case 24:
                ((uwe) this.b).invoke(new mc9(((kc9) this.c).f18047a));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((uwe) this.b).invoke(new nc9(((pc9) this.c).f26747a));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) this.b).invoke(((fxf) this.c).d);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((oi9) this.b).r.invoke((pi9) this.c);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((CameraManager) this.b).unregisterAvailabilityCallback((xv9) this.c);
                return Unit.f46060a;
            default:
                ((qw9) this.b).c.unregisterAvailabilityCallback((pw9) this.c);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ gj4(Object obj, Object obj2, byte b) {
        this.f11378a = b;
        this.b = obj;
        this.c = obj2;
    }
}
