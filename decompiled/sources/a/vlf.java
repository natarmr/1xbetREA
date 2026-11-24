package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vlf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37619a;

    public /* synthetic */ vlf(byte b) {
        this.f37619a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cpm apmVar;
        Integer num;
        f3g f3gVar = null;
        boolean z = true;
        switch (this.f37619a) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new rn5(cpVar, (byte) 25));
                return Unit.f46060a;
            case 1:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                return kpb.o0((bqr) feeVar.c(), false);
            case 2:
                xa30 xa30Var = (xa30) obj;
                xa30Var.getClass();
                return new rmf(xa30Var);
            case 3:
                wus wusVar = (wus) obj;
                wusVar.getClass();
                return new smf(wusVar);
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 5:
                mbp0 mbp0Var = (mbp0) obj;
                mbp0Var.getClass();
                return xnm0.h(mbp0Var.c, mbp0Var.d, mbp0Var.b, mbp0Var.e, mbp0Var.g, mbp0Var.f21520a);
            case 6:
                mbp0 mbp0Var2 = (mbp0) obj;
                mbp0Var2.getClass();
                return qim0.k(mbp0Var2.h, ucx.X(mbp0Var2.f), mbp0Var2.f21520a, mbp0Var2.k, mbp0Var2.l);
            case 7:
                fuf fufVar = (fuf) obj;
                fufVar.getClass();
                return fufVar.f10159a;
            case 8:
                ((String) obj).getClass();
                return Separators.SP;
            case 9:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(32.0f);
                float fW1 = fhlVar.w0(1.0f);
                float fW2 = fhlVar.w0(8.0f);
                float fW3 = fhlVar.w0(4.0f);
                long j = kkg.G;
                fhl.Q(fhlVar, j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), (((long) Float.floatToRawIntBits(fW0)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)))) << 32), fW1, 0, null, 496);
                fhl.Q(fhlVar, j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)))) & 4294967295L), fW1, 0, qjj.K(fW3, new float[]{fW2, fW2}), 464);
                return Unit.f46060a;
            case 10:
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    Object obj2 = list.get(0);
                    obj2.getClass();
                    y3m y3mVarValueOf = y3m.valueOf((String) obj2);
                    Object obj3 = list.get(1);
                    obj3.getClass();
                    float fFloatValue = ((Float) obj3).floatValue();
                    Object obj4 = list.get(2);
                    obj4.getClass();
                    f3gVar = new f3g(y3mVarValueOf, fFloatValue, ((Float) obj4).floatValue());
                }
                return new upj0(f3gVar);
            case 11:
                ((g3g) obj).getClass();
                return new kun((byte) 3);
            case 12:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                ArrayList arrayList = new ArrayList();
                cpVar2.t(new if6(cpVar2, arrayList, cpVar2, arrayList, (byte) 2));
                return Unit.f46060a;
            case 13:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 14:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 15:
                r4g r4gVar = (r4g) obj;
                r4gVar.getClass();
                return r4gVar.c;
            case 16:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 17:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new cfg(sjdVar);
            case 18:
                egg eggVar = (egg) obj;
                eggVar.getClass();
                List list2 = eggVar.e;
                Integer num2 = eggVar.b;
                int iIntValue = num2 != null ? num2.intValue() : 0;
                vdg vdgVar = eggVar.d;
                boolean z2 = eggVar.f;
                list2.getClass();
                if (!list2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    int i = 0;
                    for (Object obj5 : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        Date date = (Date) obj5;
                        String str = new SimpleDateFormat("dd", Locale.getDefault()).format(date);
                        String str2 = new SimpleDateFormat("MMMM", Locale.getDefault()).format(date);
                        String str3 = !ntb.U(date) ? new SimpleDateFormat("yyyy", Locale.getDefault()).format(date) : null;
                        str.getClass();
                        str2.getClass();
                        arrayList2.add(new cdg0(str, str2, str3, ntb.W(date), iIntValue == i));
                        i = i2;
                    }
                    apmVar = new apm(dyb.r0(arrayList2), vcg0.f37186a, iIntValue, true);
                } else if ((vdgVar == null || vdgVar.b.isEmpty()) && !z2) {
                    apmVar = new apm(lak0.c, vcg0.f37186a, iIntValue, true);
                } else {
                    vcg0 vcg0Var = vcg0.f37186a;
                    apmVar = new bpm();
                }
                return new tfg(apmVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new ok(cpVar3, cpVar3, (byte) 20));
                return Unit.f46060a;
            case 20:
                return new yog(((Float) obj).floatValue());
            case 21:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 22:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.e = new pq2();
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_FROM_BANNER;
                return Unit.f46060a;
            case 23:
                n1g n1gVar2 = (n1g) obj;
                n1gVar2.getClass();
                n1gVar2.e = new mq2();
                n1gVar2.f = l1g.OPEN_SCREEN;
                n1gVar2.g = k1g.OPEN_REGULAR;
                return Unit.f46060a;
            case 24:
                n1g n1gVar3 = (n1g) obj;
                n1gVar3.getClass();
                n1gVar3.e = new oq2();
                n1gVar3.f = l1g.OPEN_SCREEN;
                n1gVar3.g = k1g.OPEN_REGULAR;
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.t(new ok(cpVar4, cpVar4, (byte) 21));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                d8h d8hVar = (d8h) obj;
                d8hVar.getClass();
                Integer num3 = d8hVar.d;
                if (num3 != null && num3.intValue() == 0 && (num = d8hVar.e) != null && num.intValue() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                k7h k7hVar = (k7h) obj;
                k7hVar.getClass();
                return ahy.h0(ahy.i0(k7hVar), k7hVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                e430 e430Var = (e430) obj;
                e430Var.getClass();
                return e430Var;
            default:
                qmd0 qmd0Var = (qmd0) obj;
                qmd0Var.getClass();
                return qmd0Var;
        }
    }
}
