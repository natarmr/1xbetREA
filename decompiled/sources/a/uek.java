package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tek f35533a;
    public static final tek b;
    public static final tek c;
    public static final tek d;
    public static final tek e;
    public static final tek f;
    public static final tek g;
    public static final tek h;
    public static final tek i;
    public static final Map j;
    public static final tek k;
    public static final sek l;
    public static final xak m;
    public static final ddk n;
    public static final nn40 o;
    public static final HashMap p;

    static {
        euu0 euu0Var = euu0.d;
        tek tekVar = new tek(euu0Var, (byte) 0);
        f35533a = tekVar;
        fuu0 fuu0Var = fuu0.d;
        tek tekVar2 = new tek(fuu0Var, (byte) 1);
        b = tekVar2;
        guu0 guu0Var = guu0.d;
        tek tekVar3 = new tek(guu0Var, (byte) 2);
        c = tekVar3;
        buu0 buu0Var = buu0.d;
        tek tekVar4 = new tek(buu0Var, (byte) 3);
        d = tekVar4;
        huu0 huu0Var = huu0.d;
        tek tekVar5 = new tek(huu0Var, (byte) 4);
        e = tekVar5;
        duu0 duu0Var = duu0.d;
        tek tekVar6 = new tek(duu0Var, (byte) 5);
        f = tekVar6;
        auu0 auu0Var = auu0.d;
        tek tekVar7 = new tek(auu0Var, (byte) 6);
        g = tekVar7;
        cuu0 cuu0Var = cuu0.d;
        tek tekVar8 = new tek(cuu0Var, (byte) 7);
        h = tekVar8;
        iuu0 iuu0Var = iuu0.d;
        tek tekVar9 = new tek(iuu0Var, (byte) 8);
        i = tekVar9;
        Collections.unmodifiableSet(tx3.l0(new tek[]{tekVar, tekVar2, tekVar4, tekVar6}));
        HashMap map = new HashMap(6);
        map.put(tekVar2, 0);
        map.put(tekVar, 0);
        map.put(tekVar4, 1);
        map.put(tekVar3, 1);
        map.put(tekVar5, 2);
        j = Collections.unmodifiableMap(map);
        k = tekVar5;
        l = new sek();
        m = new xak((byte) 1);
        n = new ddk();
        try {
            Iterator it = Arrays.asList(new nn40[0]).iterator();
            o = it.hasNext() ? (nn40) it.next() : nn40.f23802a;
            HashMap map2 = new HashMap();
            p = map2;
            map2.put(euu0Var, tekVar);
            map2.put(fuu0Var, tekVar2);
            map2.put(guu0Var, tekVar3);
            map2.put(buu0Var, tekVar4);
            map2.put(huu0Var, tekVar5);
            map2.put(duu0Var, tekVar6);
            map2.put(auu0Var, tekVar7);
            map2.put(cuu0Var, tekVar8);
            map2.put(iuu0Var, tekVar9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i2) {
        String str = i2 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 16 ? 3 : 2];
        if (i2 != 1 && i2 != 3 && i2 != 5 && i2 != 7) {
            switch (i2) {
                case 9:
                    objArr[0] = RemoteMessageConst.FROM;
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = RemoteMessageConst.FROM;
        }
        if (i2 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(tek tekVar, tek tekVar2) {
        if (tekVar == null) {
            a(12);
            throw null;
        }
        xj xjVar = tekVar.f33825a;
        if (tekVar2 == null) {
            a(13);
            throw null;
        }
        xj xjVar2 = tekVar2.f33825a;
        Integer numB = xjVar.b(xjVar2);
        if (numB != null) {
            return numB;
        }
        Integer numB2 = xjVar2.b(xjVar);
        if (numB2 != null) {
            return Integer.valueOf(-numB2.intValue());
        }
        return null;
    }

    public static akj c(vde0 vde0Var, mp9 mp9Var, vjj vjjVar) {
        akj akjVarC;
        if (mp9Var == null) {
            a(8);
            throw null;
        }
        if (vjjVar == null) {
            a(9);
            throw null;
        }
        for (akj akjVar = (akj) mp9Var.o1(); akjVar != null && akjVar.getVisibility() != f; akjVar = (akj) oek.i(akjVar, akj.class, true)) {
            if (!akjVar.getVisibility().a(vde0Var, akjVar, vjjVar)) {
                return akjVar;
            }
        }
        if (!(mp9Var instanceof vxs0) || (akjVarC = c(vde0Var, ((vxs0) mp9Var).h1, vjjVar)) == null) {
            return null;
        }
        return akjVarC;
    }

    public static boolean d(vjj vjjVar, vjj vjjVar2) {
        if (vjjVar2 != null) {
            jdk0 jdk0VarE = oek.e(vjjVar2);
            return jdk0VarE != jdk0.b && jdk0VarE == oek.e(vjjVar);
        }
        a(7);
        throw null;
    }

    public static boolean e(tek tekVar) {
        if (tekVar != null) {
            return tekVar == f35533a || tekVar == b;
        }
        a(14);
        throw null;
    }

    public static tek f(xj xjVar) {
        if (xjVar == null) {
            a(15);
            throw null;
        }
        tek tekVar = (tek) p.get(xjVar);
        if (tekVar != null) {
            return tekVar;
        }
        e9d0.i(xjVar, "Inapplicable visibility: ");
        return null;
    }
}
