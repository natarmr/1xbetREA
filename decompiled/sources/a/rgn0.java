package a;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rgn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30447a;

    public /* synthetic */ rgn0(byte b) {
        this.f30447a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        cpm apmVar;
        byte b = 6;
        byte b2 = 10;
        byte b3 = 4;
        switch (this.f30447a) {
            case 0:
                ((Unit) obj).getClass();
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 2:
                iiy[] iiyVarArr = yai0.f42300a;
                zai0 zai0Var = xai0.m;
                iiy iiyVar = yai0.f42300a[5];
                Boolean bool = Boolean.TRUE;
                zai0Var.getClass();
                ((abi0) obj).b(zai0Var, bool);
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            case 4:
                return Float.valueOf(1.0f);
            case 5:
                return Float.valueOf(((Context) obj).getResources().getDisplayMetrics().density);
            case 6:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 7:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 8:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 9:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                ConstraintLayout constraintLayout = ((tsn0) cpVar.u).f34468a;
                constraintLayout.getClass();
                tl60.a(constraintLayout, new us40(constraintLayout, (byte) 1));
                cpVar.t(new pgj0(cpVar, cpVar, b));
                return Unit.f46060a;
            case 10:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                ConstraintLayout constraintLayout2 = ((jtn0) cpVar2.u).f17108a;
                constraintLayout2.getClass();
                tl60.a(constraintLayout2, new us40(constraintLayout2, (byte) 2));
                cpVar2.t(new pgj0(cpVar2, cpVar2, (byte) 7));
                return Unit.f46060a;
            case 11:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                ConstraintLayout constraintLayout3 = ((ktn0) cpVar3.u).f18875a;
                constraintLayout3.getClass();
                tl60.a(constraintLayout3, new us40(constraintLayout3, (byte) 3));
                cpVar3.t(new pgj0(cpVar3, cpVar3, (byte) 8));
                return Unit.f46060a;
            case 12:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 13:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 14:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case 15:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                th8.printStackTrace();
                return Unit.f46060a;
            case 16:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                ConstraintLayout constraintLayout4 = ((zvn0) cpVar4.u).f45067a;
                constraintLayout4.getClass();
                tl60.a(constraintLayout4, new us40(constraintLayout4, (byte) 4));
                cpVar4.t(new pgj0(cpVar4, cpVar4, (byte) 9));
                return Unit.f46060a;
            case 17:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                ConstraintLayout constraintLayout5 = ((nwn0) cpVar5.u).f24242a;
                constraintLayout5.getClass();
                tl60.a(constraintLayout5, new us40(constraintLayout5, (byte) 5));
                cpVar5.t(new pgj0(cpVar5, cpVar5, b2));
                return Unit.f46060a;
            case 18:
                cp cpVar6 = (cp) obj;
                cpVar6.getClass();
                ConstraintLayout constraintLayout6 = ((own0) cpVar6.u).f25972a;
                constraintLayout6.getClass();
                tl60.a(constraintLayout6, new us40(constraintLayout6, (byte) 6));
                cpVar6.t(new pgj0(cpVar6, cpVar6, (byte) 11));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                i7o0 i7o0Var = (i7o0) obj;
                i7o0Var.getClass();
                List list = i7o0Var.e;
                Integer num = i7o0Var.b;
                int iIntValue = num != null ? num.intValue() : 0;
                List list2 = i7o0Var.d;
                boolean z = i7o0Var.f;
                list.getClass();
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    int i = 0;
                    for (Object obj2 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        Date date = (Date) obj2;
                        String str = new SimpleDateFormat("dd", Locale.getDefault()).format(date);
                        String str2 = new SimpleDateFormat("MMMM", Locale.getDefault()).format(date);
                        String str3 = ntb.U(date) ? null : new SimpleDateFormat("yyyy", Locale.getDefault()).format(date);
                        str.getClass();
                        str2.getClass();
                        arrayList.add(new cdg0(str, str2, str3, ntb.W(date), iIntValue == i));
                        i = i2;
                    }
                    apmVar = new apm(dyb.r0(arrayList), vcg0.f37186a, iIntValue, true);
                } else if (list2 != null || z) {
                    vcg0 vcg0Var = vcg0.f37186a;
                    apmVar = new bpm();
                } else {
                    apmVar = new apm(lak0.c, vcg0.f37186a, iIntValue, true);
                }
                return new y6o0(apmVar);
            case 20:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 21:
                qpg0 qpg0Var = (qpg0) obj;
                qpg0Var.getClass();
                xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (xpg0VarZ0.W0()) {
                        arrayList2.add(xpg0VarZ0.J0(0));
                    }
                    xpg0VarZ0.close();
                    return arrayList2;
                } catch (Throwable th9) {
                    xpg0VarZ0.close();
                    throw th9;
                }
            case 22:
                cp cpVar7 = (cp) obj;
                cpVar7.getClass();
                cpVar7.t(new kzi0(cpVar7, (byte) 15));
                return Unit.f46060a;
            case 23:
                a2n a2nVar = (a2n) obj;
                a2nVar.getClass();
                return a2nVar.getKey();
            case 24:
                a2n a2nVar2 = (a2n) obj;
                a2nVar2.getClass();
                return sre0.f32672a.b(a2nVar2.getClass());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ggj ggjVar = (ggj) obj;
                ggjVar.getClass();
                return new blb0(ggjVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                d5l0 d5l0Var = (d5l0) obj;
                d5l0Var.getClass();
                return new clb0(d5l0Var);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((glb0) obj).getClass();
                return new kun(b3);
            default:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar, s6t0.b().f33626a.getBackground(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
        }
    }
}
