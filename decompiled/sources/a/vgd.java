package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vgd implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37376a;

    public /* synthetic */ vgd(byte b) {
        this.f37376a = b;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b = 2;
        boolean z = false;
        byte b2 = 1;
        switch (this.f37376a) {
            case 0:
                vpl vplVar = (vpl) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ycl yclVar = (ycl) obj3;
                fet fetVar = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                vplVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = ((iIntValue2 & 8) == 0 ? fetVar.g(vplVar) : fetVar.i(vplVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= fetVar.d(yclVar.f42389a) ? 256 : 128;
                }
                if (fetVar.U(i & 1, (i & 1171) != 1170)) {
                    ccq0.o(jm40.b, vplVar, yclVar.f42389a, iIntValue, fetVar, ((i << 3) & 112) | 6 | (i & 896) | ((i << 6) & 7168));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40 mm40Var = (mm40) obj2;
                qal0 qal0Var = (qal0) obj3;
                fet fetVar2 = (fet) obj4;
                int iD = dw9.d((Integer) obj5, (y5d) obj, mm40Var);
                if ((iD & 48) == 0) {
                    i2 = iD | (fetVar2.g(mm40Var) ? 32 : 16);
                } else {
                    i2 = iD;
                }
                if ((iD & 384) == 0) {
                    i2 |= (iD & 512) == 0 ? fetVar2.g(qal0Var) : fetVar2.i(qal0Var) ? 256 : 128;
                }
                if (!fetVar2.U(i2 & 1, (i2 & 1169) != 1168)) {
                    fetVar2.X();
                } else if (qal0Var == null) {
                    fetVar2.e0(-195368327);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-195368326);
                    z1x.f(mm40Var, u1c.M(893094985, new ygd(qal0Var, z ? (byte) 1 : (byte) 0), fetVar2), u1c.M(497836432, new ygd(qal0Var, b2), fetVar2), u1c.M(1476184559, new ygd(qal0Var, b), fetVar2), u1c.M(-1840434610, new ygd(qal0Var, (byte) 3), fetVar2), fetVar2, ((i2 >> 3) & 14) | 28080);
                    fetVar2.r(false);
                }
                break;
            case 2:
                mm40 mm40Var2 = (mm40) obj;
                String str = (String) obj2;
                y9q0 y9q0Var = (y9q0) obj3;
                fet fetVar3 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                mm40Var2.getClass();
                str.getClass();
                y9q0Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i3 = (fetVar3.g(mm40Var2) ? 4 : 2) | iIntValue3;
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= fetVar3.g(str) ? 32 : 16;
                }
                if ((iIntValue3 & 384) == 0) {
                    i3 |= fetVar3.g(y9q0Var) ? 256 : 128;
                }
                if (fetVar3.U(i3 & 1, (i3 & 1171) != 1170)) {
                    v8q0.a(str, o7k0.d(mm40Var2, 1.0f), ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar3, (i3 >> 3) & 14, (i3 << 15) & 29360128, 131064);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                mm40 mm40Var3 = (mm40) obj;
                String str2 = (String) obj2;
                y9q0 y9q0Var2 = (y9q0) obj3;
                fet fetVar4 = (fet) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                mm40Var3.getClass();
                str2.getClass();
                y9q0Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i4 = (fetVar4.g(mm40Var3) ? 4 : 2) | iIntValue4;
                } else {
                    i4 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i4 |= fetVar4.g(str2) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i4 |= fetVar4.g(y9q0Var2) ? 256 : 128;
                }
                if (fetVar4.U(i4 & 1, (i4 & 1171) != 1170)) {
                    v8q0.a(str2, o7k0.d(mm40Var3, 1.0f), ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var2, fetVar4, (i4 >> 3) & 14, (i4 << 15) & 29360128, 131064);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                mm40 mm40Var4 = (mm40) obj;
                String str3 = (String) obj2;
                y9q0 y9q0Var3 = (y9q0) obj3;
                fet fetVar5 = (fet) obj4;
                int iIntValue5 = ((Integer) obj5).intValue();
                mm40Var4.getClass();
                str3.getClass();
                y9q0Var3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i5 = (fetVar5.g(mm40Var4) ? 4 : 2) | iIntValue5;
                } else {
                    i5 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i5 |= fetVar5.g(str3) ? 32 : 16;
                }
                if ((iIntValue5 & 384) == 0) {
                    i5 |= fetVar5.g(y9q0Var3) ? 256 : 128;
                }
                if (fetVar5.U(i5 & 1, (i5 & 1171) != 1170)) {
                    v8q0.a(str3, o7k0.d(mm40Var4, 1.0f), ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var3, fetVar5, (i5 >> 3) & 14, (i5 << 15) & 29360128, 131064);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                mm40 mm40Var5 = (mm40) obj;
                String str4 = (String) obj2;
                y9q0 y9q0Var4 = (y9q0) obj3;
                fet fetVar6 = (fet) obj4;
                int iIntValue6 = ((Integer) obj5).intValue();
                mm40Var5.getClass();
                str4.getClass();
                y9q0Var4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    i6 = (fetVar6.g(mm40Var5) ? 4 : 2) | iIntValue6;
                } else {
                    i6 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i6 |= fetVar6.g(str4) ? 32 : 16;
                }
                if ((iIntValue6 & 384) == 0) {
                    i6 |= fetVar6.g(y9q0Var4) ? 256 : 128;
                }
                if (fetVar6.U(i6 & 1, (i6 & 1171) != 1170)) {
                    v8q0.a(str4, o7k0.d(mm40Var5, 1.0f), ((ThemeColors) fetVar6.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var4, fetVar6, (i6 >> 3) & 14, (i6 << 15) & 29360128, 131064);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                g5q0 g5q0Var = (g5q0) obj;
                v4q0 v4q0Var = (v4q0) obj2;
                Function0 function0 = (Function0) obj3;
                fet fetVar7 = (fet) obj4;
                int iIntValue7 = ((Integer) obj5).intValue();
                if ((iIntValue7 & 6) == 0) {
                    i7 = ((iIntValue7 & 8) == 0 ? fetVar7.g(g5q0Var) : fetVar7.i(g5q0Var) ? 4 : 2) | iIntValue7;
                } else {
                    i7 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i7 |= (iIntValue7 & 64) == 0 ? fetVar7.g(v4q0Var) : fetVar7.i(v4q0Var) ? 32 : 16;
                }
                if ((iIntValue7 & 384) == 0) {
                    i7 |= fetVar7.i(function0) ? 256 : 128;
                }
                if (fetVar7.U(i7 & 1, (i7 & 1171) != 1170)) {
                    xxj.c(g5q0Var, v4q0Var, function0, fetVar7, i7 & 1022);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                g5q0 g5q0Var2 = (g5q0) obj;
                v4q0 v4q0Var2 = (v4q0) obj2;
                Function0 function1 = (Function0) obj3;
                fet fetVar8 = (fet) obj4;
                int iIntValue8 = ((Integer) obj5).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i8 = ((iIntValue8 & 8) == 0 ? fetVar8.g(g5q0Var2) : fetVar8.i(g5q0Var2) ? 4 : 2) | iIntValue8;
                } else {
                    i8 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i8 |= (iIntValue8 & 64) == 0 ? fetVar8.g(v4q0Var2) : fetVar8.i(v4q0Var2) ? 32 : 16;
                }
                if ((iIntValue8 & 384) == 0) {
                    i8 |= fetVar8.i(function1) ? 256 : 128;
                }
                if (fetVar8.U(i8 & 1, (i8 & 1171) != 1170)) {
                    xxj.c(g5q0Var2, v4q0Var2, function1, fetVar8, i8 & 1022);
                } else {
                    fetVar8.X();
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((o9q0) obj5).f24893a;
                String string = ((CharSequence) obj4).subSequence(o9q0.f(j), o9q0.e(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return Unit.f46060a;
    }
}
