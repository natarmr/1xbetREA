package a;

import android.text.Editable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.layouts.linear.TextInputEditTextNew;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t6q0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33431a;

    public /* synthetic */ t6q0(byte b) {
        this.f33431a = b;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x02a1  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        f9q0 f9q0VarB;
        smk0 smk0Var;
        switch (this.f33431a) {
            case 0:
                z6q0 z6q0Var = (z6q0) obj;
                String str = z6q0Var.g.b;
                long j = z6q0Var.f;
                int i = o9q0.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > 0) {
                    qsn qsnVarK = osm0.k();
                    if (qsnVarK != null) {
                        int iB = qsnVarK.b(i2 - 1, str);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i2 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                        }
                    } else if (i2 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new g6k(((int) (z6q0Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 1:
                z6q0 z6q0Var2 = (z6q0) obj;
                String str2 = z6q0Var2.g.b;
                long j2 = z6q0Var2.f;
                int i3 = o9q0.c;
                int i4 = osm0.i((int) (j2 & 4294967295L), str2);
                if (i4 != -1) {
                    return new g6k(0, i4 - ((int) (z6q0Var2.f & 4294967295L)));
                }
                return null;
            case 2:
                z6q0 z6q0Var3 = (z6q0) obj;
                Integer numE = z6q0Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j3 = z6q0Var3.f;
                int i5 = o9q0.c;
                return new g6k(((int) (4294967295L & j3)) - iIntValue, 0);
            case 3:
                z6q0 z6q0Var4 = (z6q0) obj;
                Integer numD = z6q0Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j4 = z6q0Var4.f;
                int i6 = o9q0.c;
                return new g6k(0, iIntValue2 - ((int) (4294967295L & j4)));
            case 4:
                z6q0 z6q0Var5 = (z6q0) obj;
                Integer numC = z6q0Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j5 = z6q0Var5.f;
                int i7 = o9q0.c;
                return new g6k(((int) (4294967295L & j5)) - iIntValue3, 0);
            case 5:
                z6q0 z6q0Var6 = (z6q0) obj;
                Integer numB = z6q0Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = z6q0Var6.f;
                int i8 = o9q0.c;
                return new g6k(0, iIntValue4 - ((int) (4294967295L & j6)));
            case 6:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                ma80 ma80Var = ((Boolean) obj2).booleanValue() ? ma80.f21447a : ma80.b;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new d7q0(ma80Var, ((Float) obj3).floatValue());
            case 7:
                return Unit.f46060a;
            case 8:
                int i9 = TextInputEditTextNew.j2;
                ((String) obj).getClass();
                return Unit.f46060a;
            case 9:
                return Unit.f46060a;
            case 10:
                return Unit.f46060a;
            case 11:
                return Unit.f46060a;
            case 12:
                return Unit.f46060a;
            case 13:
                return Unit.f46060a;
            case 14:
                i83 i83Var = (i83) obj;
                Object obj4 = i83Var.f14321a;
                if (!(obj4 instanceof kb00) || (f9q0VarB = ((kb00) obj4).b()) == null || (f9q0VarB.f9167a == null && f9q0VarB.b == null && f9q0VarB.c == null && f9q0VarB.d == null)) {
                    return q3d.e(i83Var);
                }
                Object obj5 = i83Var.f14321a;
                obj5.getClass();
                f9q0 f9q0VarB2 = ((kb00) obj5).b();
                if (f9q0VarB2 == null || (smk0Var = f9q0VarB2.f9167a) == null) {
                    smk0Var = new smk0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65535);
                }
                return q3d.e(i83Var, new i83(i83Var.b, i83Var.c, smk0Var));
            case 15:
                zai0 zai0Var = xai0.B;
                Unit unit = Unit.f46060a;
                ((abi0) obj).b(zai0Var, unit);
                return unit;
            case 16:
                ((Editable) obj).getClass();
                return Unit.f46060a;
            case 17:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 18:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new pgj0(cpVar, cpVar, (byte) 18));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new kzi0(cpVar2, (byte) 20));
                return Unit.f46060a;
            case 20:
                ((cp) obj).getClass();
                return Unit.f46060a;
            case 21:
                n1g n1gVar = (n1g) obj;
                rq2 rq2Var = new rq2();
                n1gVar.getClass();
                n1gVar.e = rq2Var;
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_REGULAR;
                n1gVar.d = j1g.REAL;
                return Unit.f46060a;
            case 22:
                List list2 = (List) obj;
                return new oyq0(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue(), ((Number) list2.get(2)).floatValue());
            case 23:
                s8l0 s8l0Var = (s8l0) obj;
                s8l0Var.getClass();
                return Long.valueOf(s8l0Var.f31808a);
            case 24:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new d5r0(sjdVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                View view = (View) obj;
                y2m0 y2m0Var = q7r0.O1;
                view.getClass();
                RecyclerView recyclerView = (RecyclerView) view;
                return new b6r(recyclerView, recyclerView);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                d9r0 d9r0Var = (d9r0) obj;
                d9r0Var.getClass();
                return d9r0Var.f5716a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar, s6t0.b().f33626a.getBackground(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            default:
                fhl fhlVar2 = (fhl) obj;
                j6m0 j6m0Var = v9r0.O1;
                fhlVar2.getClass();
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.u(fhlVar2, s6t0.b().f33626a.getBackground(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
        }
    }
}
