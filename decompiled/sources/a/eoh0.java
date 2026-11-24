package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eoh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8140a;

    public /* synthetic */ eoh0(byte b) {
        this.f8140a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dxh0 dxh0Var;
        switch (this.f8140a) {
            case 0:
                yph0 yph0Var = (yph0) obj;
                yph0Var.getClass();
                int iOrdinal = yph0Var.f43030a.ordinal();
                if (iOrdinal == 0) {
                    dxh0Var = axh0.f1625a;
                } else if (iOrdinal == 1) {
                    dxh0Var = zwh0.f45106a;
                } else if (iOrdinal == 2) {
                    dxh0Var = cxh0.f5122a;
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                    dxh0Var = bxh0.f3376a;
                }
                a4x a4xVar = yph0Var.b;
                int i = yph0Var.c;
                return new zph0(dxh0Var, a4xVar, i == 0 ? oqh0.f25688a : oqh0.b, i);
            case 1:
                ((cp) obj).getClass();
                return Unit.f46060a;
            case 2:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ui80(cpVar, (byte) 19));
                return Unit.f46060a;
            case 3:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new ui80(cpVar2, (byte) 20));
                return Unit.f46060a;
            case 4:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new ui80(cpVar3, (byte) 21));
                cpVar3.x(new bb(cpVar3, (byte) 15));
                cpVar3.y(new bb(cpVar3, (byte) 16));
                return Unit.f46060a;
            case 5:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.t(new ui80(cpVar4, (byte) 22));
                return Unit.f46060a;
            case 6:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                hxm0.x(((tku0) cpVar5.u).e, cpVar5.w.getResources().getDimensionPixelSize(R.dimen.size_5));
                cpVar5.t(new ui80(cpVar5, (byte) 23));
                return Unit.f46060a;
            case 7:
                axa axaVar = (axa) obj;
                axaVar.getClass();
                return Integer.valueOf(axaVar.f1614a.f41797a);
            case 8:
                ((axa) obj).getClass();
                return "cashback_cell";
            case 9:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 10:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 11:
                khq0 khq0Var = (khq0) obj;
                gle0 gle0Var = d3i0.n2;
                khq0Var.getClass();
                return sre0.f32672a.b(khq0Var.getClass());
            case 12:
                khq0 khq0Var2 = (khq0) obj;
                gle0 gle0Var2 = d3i0.n2;
                khq0Var2.getClass();
                return khq0Var2.getKey();
            case 13:
                ((l2i0) obj).getClass();
                return new kun((byte) 6);
            case 14:
                ((h4i0) obj).getClass();
                return new e4i0();
            case 15:
                iiy[] iiyVarArr = yai0.f42300a;
                zai0 zai0Var = xai0.e;
                Unit unit = Unit.f46060a;
                ((abi0) obj).b(zai0Var, unit);
                return unit;
            case 16:
                ne60 ne60Var = (ne60) obj;
                long j = ne60Var.f23370a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new q73(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & ne60Var.f23370a))) : i5i0.f14194a;
            case 17:
                q73 q73Var = (q73) obj;
                return new ne60((((long) Float.floatToRawIntBits(q73Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(q73Var.f28229a)) << 32));
            case 18:
                ((vzg0) obj).getClass();
                return new b8i0("", "", "", "", true, false);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                return new z8i0(false, null, ((Number) a8k0.H(vzg0Var, "SELECTED_VALUE_INDEX_KEY", -1)).intValue(), false, false, false);
            case 20:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 21:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 22:
                Sequence sequence = (Sequence) obj;
                sequence.getClass();
                return sequence.iterator();
            case 23:
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                return iterable.iterator();
            case 24:
                return obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Boolean.valueOf(obj == null);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sgy sgyVar = (sgy) obj;
                sgyVar.getClass();
                jiy jiyVarD0 = n6x.d0(sgyVar);
                if (jiyVarD0 != null) {
                    return jiyVarD0;
                }
                if (azw.G(sgyVar).isInterface()) {
                    return new uua0(sgyVar);
                }
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sgy sgyVar2 = (sgy) obj;
                sgyVar2.getClass();
                jiy jiyVarD1 = n6x.d0(sgyVar2);
                if (jiyVarD1 == null) {
                    jiyVarD1 = azw.G(sgyVar2).isInterface() ? new uua0(sgyVar2) : null;
                }
                if (jiyVarD1 != null) {
                    return mrv.j0(jiyVarD1);
                }
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            default:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.c(abi0Var, R.drawable.ic_glyph_chevron_right_small);
                return Unit.f46060a;
        }
    }
}
