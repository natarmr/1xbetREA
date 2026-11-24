package a;

import android.content.Context;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.accordion.DsAccordion;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gnm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11596a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gnm(Object obj, Object obj2, byte b) {
        this.f11596a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0186 A[PHI: r2
  0x0186: PHI (r2v4 long) = (r2v3 long), (r2v5 long) binds: [B:53:0x018c, B:50:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j;
        h8o h8oVar;
        h8o h8oVar2;
        Object obj;
        byte b = this.f11596a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj2;
                if (((inm) obj3).f15080a.b()) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 1:
                ((Function1) obj3).invoke(new wdm(false, ((lla) obj2).a()));
                return Unit.f46060a;
            case 2:
                rwh0 rwh0Var = (rwh0) obj3;
                pz40 pz40Var = (pz40) obj2;
                if (((rwh0) pz40Var.getValue()) != rwh0Var) {
                    pz40Var.setValue(rwh0Var);
                }
                return Unit.f46060a;
            case 3:
                ((hdk0) ((idk0) obj3)).b.invoke();
                ((rrm) obj2).a(3);
                return Unit.f46060a;
            case 4:
                ((Function1) obj3).invoke(Long.valueOf(((trm) obj2).f34426a));
                return Unit.f46060a;
            case 5:
                ((Function1) obj3).invoke(new izl(false, ((d6l0) obj2).a()));
                return Unit.f46060a;
            case 6:
                ((Function1) obj3).invoke(new izl(true, ((k6l0) obj2).a()));
                return Unit.f46060a;
            case 7:
                ((Function1) obj3).invoke(new wdm(false, ((q56) obj2).a()));
                return Unit.f46060a;
            case 8:
                ((Function1) obj3).invoke(new wdm(true, ((w56) obj2).a()));
                return Unit.f46060a;
            case 9:
                ((Function1) obj3).invoke(new wdm(false, ((tfa) obj2).a()));
                return Unit.f46060a;
            case 10:
                ((Function1) obj3).invoke(new wdm(true, ((zfa) obj2).a()));
                return Unit.f46060a;
            case 11:
                ((Function1) obj3).invoke(new wdm(false, ((b2o0) obj2).a()));
                return Unit.f46060a;
            case 12:
                ((Function1) obj3).invoke(new wdm(true, ((v1o0) obj2).a()));
                return Unit.f46060a;
            case 13:
                ((Function1) obj3).invoke(new wdm(false, ((bjl0) obj2).a()));
                return Unit.f46060a;
            case 14:
                ((Function1) obj3).invoke(new wdm(false, ((v0g0) obj2).a()));
                return Unit.f46060a;
            case 15:
                ((Function1) obj3).invoke(new wdm(true, ((cml0) obj2).a()));
                return Unit.f46060a;
            case 16:
                ((Function1) obj3).invoke(new wdm(false, ((yhm0) obj2).a()));
                return Unit.f46060a;
            case 17:
                ((Function1) obj3).invoke(new wdm(false, ((eim0) obj2).a()));
                return Unit.f46060a;
            case 18:
                ((Function1) obj3).invoke(new wdm(false, ((kim0) obj2).a()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cqq cqqVar = (cqq) obj2;
                if (((c6q0) obj3).b instanceof d6q0) {
                    cqq.a(cqqVar);
                }
                return Unit.f46060a;
            case 20:
                cqq cqqVar2 = (cqq) obj2;
                if (((s6q0) obj3).b instanceof d6q0) {
                    cqq.a(cqqVar2);
                }
                return Unit.f46060a;
            case 21:
                ((x6q0) obj3).getClass();
                return Unit.f46060a;
            case 22:
                long jL = (((egk0) obj3).l() / 1000) / 60;
                if (((Boolean) ((l7m0) obj2).getValue()).booleanValue()) {
                    j = 999;
                    if (jL > 999) {
                        jL = j;
                    }
                } else {
                    j = 99;
                    if (jL > 99) {
                        jL = j;
                    }
                }
                return Long.valueOf(jL);
            case 23:
                g0o g0oVar = (g0o) obj3;
                String str = (String) obj2;
                zzn zznVar = (zzn) g0oVar.c;
                if (zznVar == null) {
                    Enum[] enumArr = (Enum[]) g0oVar.b;
                    zznVar = new zzn(str, enumArr.length);
                    for (Enum r0 : enumArr) {
                        zznVar.j(r0.name(), false);
                    }
                }
                return zznVar;
            case 24:
                ((Function1) obj3).invoke((o5s0) obj2);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i9o i9oVar = (i9o) obj3;
                n0o0 n0o0Var = i9oVar.k;
                n0o0 n0o0Var2 = i9oVar.j;
                n0o0 n0o0Var3 = i9oVar.i;
                z8o z8oVar = (z8o) obj2;
                n0o0 n0o0Var4 = i9oVar.g;
                ((fee) n0o0Var4.getValue()).d(z8oVar.f);
                n0o0 n0o0Var5 = i9oVar.h;
                fee feeVar = (fee) n0o0Var5.getValue();
                w7o w7oVar = z8oVar.b;
                if (w7oVar != null) {
                    Object obj4 = w7oVar.f38683a;
                    e0g0 e0g0Var = j0g0.b;
                    if (obj4 instanceof g0g0) {
                        obj4 = null;
                    }
                    h8oVar = (h8o) obj4;
                    if (h8oVar == null) {
                        iun iunVar = iun.f15405a;
                        lun lunVar = lun.f20680a;
                        lunVar.getClass();
                        h8oVar = new h8o(iunVar, lunVar);
                    }
                } else {
                    iun iunVar2 = iun.f15405a;
                    lun lunVar2 = lun.f20680a;
                    lunVar2.getClass();
                    h8oVar = new h8o(iunVar2, lunVar2);
                }
                feeVar.d(h8oVar);
                fee feeVar2 = (fee) n0o0Var3.getValue();
                if (w7oVar != null) {
                    Object obj5 = w7oVar.b;
                    e0g0 e0g0Var2 = j0g0.b;
                    if (obj5 instanceof g0g0) {
                        obj5 = null;
                    }
                    h8oVar2 = (h8o) obj5;
                    if (h8oVar2 == null) {
                        iun iunVar3 = iun.f15405a;
                        lun lunVar3 = lun.f20680a;
                        lunVar3.getClass();
                        h8oVar2 = new h8o(iunVar3, lunVar3);
                    }
                } else {
                    iun iunVar4 = iun.f15405a;
                    lun lunVar4 = lun.f20680a;
                    lunVar4.getClass();
                    h8oVar2 = new h8o(iunVar4, lunVar4);
                }
                feeVar2.d(h8oVar2);
                fee feeVar3 = (fee) n0o0Var2.getValue();
                if (w7oVar != null) {
                    Object obj6 = w7oVar.c;
                    e0g0 e0g0Var3 = j0g0.b;
                    obj = (List) (obj6 instanceof g0g0 ? null : obj6);
                    if (obj == null) {
                        obj = iun.f15405a;
                    }
                } else {
                    obj = iun.f15405a;
                }
                feeVar3.d(obj);
                ((fee) n0o0Var.getValue()).d(z8oVar.c);
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.addAll((Collection) ((fee) n0o0Var4.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var5.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var3.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var2.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) n0o0Var.getValue()).b(), lc00VarB);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                pao paoVar = (pao) obj2;
                DsAccordion dsAccordion = new DsAccordion((Context) obj3, null, 2, 0);
                dsAccordion.setLayoutParams(new FrameLayout.LayoutParams(paoVar.b, paoVar.getResources().getDimensionPixelSize(R.dimen.size_18)));
                dsAccordion.setClickable(false);
                paoVar.addView(dsAccordion);
                return dsAccordion;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) obj3).invoke(((rim) obj2).c.f20352a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) obj3).invoke(((lnm) obj2).f20352a);
                return Unit.f46060a;
            default:
                ((Function1) obj3).invoke(Boolean.valueOf(!((imo) obj2).c));
                return Unit.f46060a;
        }
    }
}
