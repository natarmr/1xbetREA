package a;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class s43 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31585a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s43(Object obj, byte b) {
        super(1);
        this.f31585a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a3  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31585a;
        boolean z = true;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(Intrinsics.d(obj, obj2));
            case 1:
                j jVar = (j) obj;
                jVar.getClass();
                String str = (String) obj2;
                if (Intrinsics.d(jVar.f15657a, cy2.z)) {
                    return "";
                }
                Map map = tzn.f34812a;
                return tzn.a(dwi0.N(jVar, str), false, false);
            case 2:
                s73 s73Var = (s73) obj;
                float f = s73Var.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = s73Var.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = s73Var.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = s73Var.f31731a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new y3d(y3d.b(fbc.c(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, a5d.x), (y4d) obj2));
            case 3:
                uag0 uag0Var = (uag0) obj;
                vdv0 vdv0Var = (vdv0) obj2;
                if (!Float.isNaN(vdv0Var.f) || !Float.isNaN(vdv0Var.g)) {
                    uag0Var.G(osm0.e(Float.isNaN(vdv0Var.f) ? 0.5f : vdv0Var.f, Float.isNaN(vdv0Var.g) ? 0.5f : vdv0Var.g));
                }
                if (!Float.isNaN(vdv0Var.h)) {
                    uag0Var.m(vdv0Var.h);
                }
                if (!Float.isNaN(vdv0Var.i)) {
                    uag0Var.n(vdv0Var.i);
                }
                if (!Float.isNaN(vdv0Var.j)) {
                    uag0Var.v(vdv0Var.j);
                }
                if (!Float.isNaN(vdv0Var.k)) {
                    uag0Var.H(vdv0Var.k);
                }
                if (!Float.isNaN(vdv0Var.l)) {
                    uag0Var.I(vdv0Var.l);
                }
                if (!Float.isNaN(vdv0Var.m)) {
                    uag0Var.C(vdv0Var.m);
                }
                if (!Float.isNaN(vdv0Var.n) || !Float.isNaN(vdv0Var.o)) {
                    uag0Var.w(Float.isNaN(vdv0Var.n) ? 1.0f : vdv0Var.n);
                    uag0Var.y(Float.isNaN(vdv0Var.o) ? 1.0f : vdv0Var.o);
                }
                if (!Float.isNaN(vdv0Var.p)) {
                    uag0Var.b(vdv0Var.p);
                }
                return Unit.f46060a;
            case 4:
                return Boolean.valueOf(!Intrinsics.d(obj, ((hgk0) ((oms0) obj2).d).getValue()));
            case 5:
                ((uag0) obj).b(((Number) ((l7m0) obj2).getValue()).floatValue());
                return Unit.f46060a;
            case 6:
                fhl fhlVar = (fhl) obj;
                dfv dfvVar = (dfv) obj2;
                w03 w03Var = dfvVar.l;
                if (dfvVar.n && dfvVar.A && w03Var != null) {
                    nr nrVarA0 = fhlVar.A0();
                    long jP = nrVarA0.p();
                    nrVarA0.i().l();
                    try {
                        ((fvt0) nrVarA0.b).i(w03Var);
                        dfvVar.d(fhlVar);
                    } finally {
                        defpackage.c.g(nrVarA0, jP);
                    }
                } else {
                    dfvVar.d(fhlVar);
                }
                return Unit.f46060a;
            case 7:
                int iIntValue = ((Number) obj).intValue();
                StringBuilder sb = (StringBuilder) obj2;
                char c = (char) iIntValue;
                if (iIntValue == 32) {
                    sb.append("%20");
                } else if (iIntValue < 32 || iIntValue >= 128 || StringsKt.P("\".<>\\^_`{|}", c)) {
                    String str2 = iIntValue >= 65536 ? new String(new char[]{(char) ((iIntValue >>> 10) + 55232), (char) ((iIntValue & 1023) + 56320)}) : String.valueOf(c);
                    str2.getClass();
                    String strEncode = URLEncoder.encode(str2, "UTF-8");
                    strEncode.getClass();
                    sb.append(strEncode);
                } else {
                    sb.append(c);
                }
                return Unit.f46060a;
            case 8:
                wvq0 wvq0Var = (wvq0) obj;
                wvq0Var.getClass();
                return Integer.valueOf(Intrinsics.e(wvq0Var.f39851a, ((wvq0) obj2).f39851a));
            case 9:
                ((ig00) obj2).cancel(false);
                return Unit.f46060a;
            case 10:
                k810 k810Var = (k810) obj;
                k810Var.getClass();
                v9d v9dVar = (v9d) obj2;
                v9d v9dVarB = v9dVar.b(k810Var);
                CharSequence charSequence = k810Var.d;
                int iX = idx.x(v9dVarB, charSequence);
                if (!idx.X(v9dVarB, v9dVar)) {
                    z = false;
                } else if (iX < charSequence.length()) {
                    k810 k810VarE = k810Var.e(iX + 1);
                    if ((k810VarE != null ? k810VarE.a() : null) != null) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 11:
                ((Context) obj).getClass();
                Context context = (Context) obj2;
                context.getClass();
                MeasurementManager measurementManager = MeasurementManager.get(context);
                measurementManager.getClass();
                return new yj30(measurementManager);
            case 12:
                dpa0 dpa0Var = (dpa0) obj;
                hs40 hs40Var = (hs40) obj2;
                long jJ0 = x2x.j0(dpa0Var, false);
                dqm0.k((j6u0) hs40Var.b, dpa0Var);
                ((htb) hs40Var.c).f(new js40(true, jJ0, 0L));
                dpa0Var.a();
                return Unit.f46060a;
            case 13:
                long j = ((ne60) obj).f23370a;
                r34 r34Var = ((j6u0) obj2).f16007a;
                i6u0 i6u0Var = (i6u0) r34Var.b;
                zaj[] zajVarArr = i6u0Var.d;
                qx3.l(0, zajVarArr.length, null, zajVarArr);
                i6u0Var.e = 0;
                i6u0 i6u0Var2 = (i6u0) r34Var.c;
                zaj[] zajVarArr2 = i6u0Var2.d;
                qx3.l(0, zajVarArr2.length, null, zajVarArr2);
                i6u0Var2.e = 0;
                r34Var.f29768a = 0L;
                return Unit.f46060a;
            default:
                swq0.a((abi0) obj, (ot40) obj2);
                return Unit.f46060a;
        }
    }
}
