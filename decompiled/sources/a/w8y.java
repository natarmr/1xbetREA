package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tek f38749a;
    public static final tek b;
    public static final tek c;
    public static final HashMap d;

    static {
        may mayVar = may.d;
        tek tekVar = new tek(mayVar, (byte) 9);
        f38749a = tekVar;
        oay oayVar = oay.d;
        tek tekVar2 = new tek(oayVar, (byte) 10);
        b = tekVar2;
        nay nayVar = nay.d;
        tek tekVar3 = new tek(nayVar, (byte) 11);
        c = tekVar3;
        HashMap map = new HashMap();
        d = map;
        map.put(mayVar, tekVar);
        map.put(oayVar, tekVar2);
        map.put(nayVar, tekVar3);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = RemoteMessageConst.FROM;
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(akj akjVar, vjj vjjVar) {
        if (akjVar == null) {
            a(2);
            throw null;
        }
        if (vjjVar == null) {
            a(3);
            throw null;
        }
        mg80 mg80Var = (mg80) oek.i(akjVar, mg80.class, false);
        mg80 mg80Var2 = (mg80) oek.i(vjjVar, mg80.class, false);
        return (mg80Var2 == null || mg80Var == null || !((ng80) mg80Var).f.equals(((ng80) mg80Var2).f)) ? false : true;
    }

    public static boolean c(vde0 vde0Var, akj akjVar, vjj vjjVar) {
        akj akjVarS;
        if (vjjVar == null) {
            a(1);
            throw null;
        }
        if (akjVar instanceof mp9) {
            akjVarS = oek.s((mp9) akjVar);
        } else {
            int i = oek.f25126a;
            akjVarS = akjVar;
        }
        if (b(akjVarS, vjjVar)) {
            return true;
        }
        return uek.c.a(vde0Var, akjVar, vjjVar);
    }
}
