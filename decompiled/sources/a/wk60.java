package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wk60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39293a;

    public /* synthetic */ wk60(byte b) {
        this.f39293a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gmm dmmVar;
        byte b = this.f39293a;
        o0w0 o0w0Var = o0w0.f24450a;
        n0w0 n0w0Var = n0w0.f22721a;
        boolean z = false;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new b1w(cpVar, (byte) 29));
                return Unit.f46060a;
            case 1:
                tn60 tn60Var = (tn60) obj;
                tn60Var.getClass();
                return new o370(tn60Var);
            case 2:
                ((nf8) obj).getClass();
                return Unit.f46060a;
            case 3:
                kg kgVar = (kg) obj;
                kgVar.getClass();
                int iOrdinal = kgVar.ordinal();
                if (iOrdinal == 0) {
                    return ijl.f14880a;
                }
                if (iOrdinal == 1) {
                    return ijl.b;
                }
                if (iOrdinal == 2) {
                    return ijl.c;
                }
                if (iOrdinal == 3) {
                    return ijl.d;
                }
                if (iOrdinal == 4) {
                    return ijl.e;
                }
                t9f.b();
                return null;
            case 4:
                tn60 tn60Var2 = (tn60) obj;
                tn60Var2.getClass();
                return new nx60(tn60Var2);
            case 5:
                ia70 ia70Var = (ia70) obj;
                ia70Var.getClass();
                pz40 pz40Var = s6t0.f31722a;
                ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                boolean z2 = ia70Var.f14424a;
                boolean z3 = ia70Var.b;
                if (z2 && z3) {
                    dmmVar = new dmm(new va50(n2x.M(ia70Var), m2x.K(ia70Var)));
                } else if (z2) {
                    dmmVar = new dmm(new ta50(m2x.K(ia70Var)));
                } else {
                    dmmVar = z3 ? new dmm(new ta50(n2x.M(ia70Var))) : fmm.f9790a;
                }
                return new imm(ilmVar, mlm.f21997a, dmmVar, s6t0.b().f33626a.getBackgroundContent(), false, null);
            case 6:
                ha70 ha70Var = (ha70) obj;
                ha70Var.getClass();
                if ((!ha70Var.e || !ha70Var.d) && (!ha70Var.f12712a || !ha70Var.b || !ha70Var.c)) {
                    z = true;
                }
                pz40 pz40Var2 = s6t0.f31722a;
                return new bc70(z, s6t0.b().f33626a.getSecondary60());
            case 7:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                okt0 okt0VarA = k0w0Var.a(n0w0Var);
                t44 t44VarC = okt0VarA.c();
                t44VarC.getClass();
                t44VarC.f33301a = new bjk(null, false, false, true);
                ((c8d) okt0VarA.f25422a).f3908a = okt0VarA.c().a();
                return Unit.f46060a;
            case 8:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                okt0 okt0VarA2 = k0w0Var2.a(o0w0Var);
                t44 t44VarC2 = okt0VarA2.c();
                t44VarC2.getClass();
                t44VarC2.f33301a = new bjk(null, false, false, true);
                ((c8d) okt0VarA2.f25422a).f3908a = okt0VarA2.c().a();
                return Unit.f46060a;
            case 9:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                okt0 okt0VarA3 = k0w0Var3.a(n0w0Var);
                t44 t44VarC3 = okt0VarA3.c();
                t44VarC3.getClass();
                t44VarC3.f33301a = new bjk(null, false, false, true);
                ((c8d) okt0VarA3.f25422a).f3908a = okt0VarA3.c().a();
                return Unit.f46060a;
            case 10:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                okt0 okt0VarA4 = k0w0Var4.a(n0w0Var);
                t44 t44VarC4 = okt0VarA4.c();
                t44VarC4.getClass();
                t44VarC4.f33301a = new bjk(null, false, false, true);
                ((c8d) okt0VarA4.f25422a).f3908a = okt0VarA4.c().a();
                return Unit.f46060a;
            case 11:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                okt0 okt0VarA5 = k0w0Var5.a(o0w0Var);
                t44 t44VarC5 = okt0VarA5.c();
                t44VarC5.getClass();
                t44VarC5.f33301a = new bjk(null, false, false, true);
                ((c8d) okt0VarA5.f25422a).f3908a = okt0VarA5.c().a();
                return Unit.f46060a;
            case 12:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                okt0 okt0VarA6 = k0w0Var6.a(n0w0Var);
                t44 t44VarC6 = okt0VarA6.c();
                t44VarC6.getClass();
                t44VarC6.f33301a = new bjk(null, false, false, true);
                ((c8d) okt0VarA6.f25422a).f3908a = okt0VarA6.c().a();
                return Unit.f46060a;
            case 13:
                k0w0 k0w0Var7 = (k0w0) obj;
                k0w0Var7.getClass();
                okt0 okt0VarA7 = k0w0Var7.a(o0w0Var);
                t44 t44VarC7 = okt0VarA7.c();
                t44VarC7.getClass();
                t44VarC7.f33301a = new bjk(null, false, false, true);
                ((c8d) okt0VarA7.f25422a).f3908a = okt0VarA7.c().a();
                return Unit.f46060a;
            case 14:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 15:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 16:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 17:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 18:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 20:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case 21:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                th8.printStackTrace();
                return Unit.f46060a;
            case 22:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                th9.printStackTrace();
                return Unit.f46060a;
            case 23:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                th10.printStackTrace();
                return Unit.f46060a;
            case 24:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                th11.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                th12.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                th13.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                us70 us70Var = (us70) obj;
                us70Var.getClass();
                String str = us70Var.b;
                int i = us70Var.f36198a;
                int length = str.length();
                boolean z4 = length > 500;
                IntRange intRange = new IntRange(1, 5, 1);
                ArrayList arrayList = new ArrayList(r3d.q(intRange, 10));
                Iterator it = intRange.iterator();
                while (((kkx) it).c) {
                    int iNextInt = ((bkx) it).nextInt();
                    arrayList.add(new e180(iNextInt, i >= iNextInt ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive_24));
                }
                return new vs70(dyb.r0(arrayList), str, f140.i(length, "/500"), z4, z4 || i <= 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Unit) obj).getClass();
                return Unit.f46060a;
            default:
                q380 q380Var = (q380) obj;
                q380Var.getClass();
                return q380Var.f28039a;
        }
    }
}
