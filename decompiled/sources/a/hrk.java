package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hrk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13534a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ hrk(Function1 function1, byte b) {
        this.f13534a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13534a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                function1.invoke(new cpk(Long.parseLong(str), str2));
                break;
            case 1:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                function1.invoke(new cpk(Long.parseLong(str3), str4));
                break;
            case 2:
                gho ghoVar = (gho) obj;
                long jLongValue = ((Number) obj2).longValue();
                ghoVar.getClass();
                function1.invoke(new con(ghoVar, jLongValue));
                break;
            case 3:
                long jLongValue2 = ((Number) obj).longValue();
                sip sipVar = (sip) obj2;
                sipVar.getClass();
                function1.invoke(new ahw(jLongValue2, sipVar));
                break;
            case 4:
                String str5 = (String) obj2;
                ((String) obj).getClass();
                str5.getClass();
                function1.invoke(new nhw(str5));
                break;
            case 5:
                long jLongValue3 = ((Number) obj).longValue();
                ((String) obj2).getClass();
                function1.invoke(new y350(jLongValue3, gzr0.f12195a));
                break;
            case 6:
                function1.invoke(new f350(((Number) obj).intValue()));
                break;
            case 7:
                m9n m9nVar = (m9n) obj;
                m9nVar.getClass();
                function1.invoke(new cz50(m9nVar.getId(), (String) obj2));
                break;
            case 8:
                m9n m9nVar2 = (m9n) obj;
                m9nVar2.getClass();
                function1.invoke(new jb80(m9nVar2.getId(), (String) obj2));
                break;
            case 9:
                String str6 = (String) obj;
                long jLongValue4 = ((Number) obj2).longValue();
                str6.getClass();
                function1.invoke(new iy80(str6, jLongValue4));
                break;
            case 10:
                function1.invoke(new m6a0(((Boolean) obj2).booleanValue(), ((Number) obj).longValue()));
                break;
            case 11:
                long jLongValue5 = ((Number) obj).longValue();
                ((Boolean) obj2).getClass();
                fxb.D(ivb0.b, new o2b0((byte) 2, jLongValue5, function1)).a();
                break;
            case 12:
                function1.invoke(new qdb0(new nv70(((Number) obj).intValue(), -1000, -1), (String) obj2));
                break;
            case 13:
                long jLongValue6 = ((Number) obj).longValue();
                String str7 = (String) obj2;
                str7.getClass();
                function1.invoke(new k3s0(jLongValue6, str7));
                break;
            default:
                long jLongValue7 = ((Number) obj).longValue();
                String str8 = (String) obj2;
                str8.getClass();
                function1.invoke(new v5s0(jLongValue7, str8));
                break;
        }
        return Unit.f46060a;
    }
}
