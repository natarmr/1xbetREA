package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class czp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rip0 f5233a;
    public static final sip0 b;
    public static final qip0 c;

    static {
        e5h0 e5h0Var = e5h0.f7234a;
        f5233a = new rip0(uyp.d);
        e5h0 e5h0Var2 = e5h0.f7234a;
        b = new sip0();
        c = qip0.f28803a;
    }

    public static final String a(d0t d0tVar, ctf0 ctf0Var) {
        d0tVar.getClass();
        ctf0Var.getClass();
        return d0tVar.h ? ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)) : d0tVar.p.f30947a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x0185  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    public static final a4x b(long j, d0t d0tVar) {
        ArrayList arrayList;
        Object next;
        Iterable<pr40> iterable;
        Object next2;
        Iterable<pr40> iterable2;
        uyp uypVar;
        long j2 = kvg.d.b;
        byte b2 = 15;
        sip0 sip0Var = b;
        qip0 qip0Var = c;
        if (j != j2) {
            boolean zIsEmpty = d0tVar.p.d.isEmpty();
            rqs rqsVar = d0tVar.p;
            rip0 rip0Var = f5233a;
            if (zIsEmpty) {
                Iterator it = rqsVar.n.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((cmr) next).f4620a != dmr.v);
                cmr cmrVar = (cmr) next;
                String str = cmrVar != null ? cmrVar.b : null;
                String str2 = str != null ? str : "";
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 == null) {
                    iterable = iun.f15405a;
                } else {
                    wcy wcyVarC = vdx.f37253a;
                    if (wcyVarC == null) {
                        wcyVarC = qxw.c(new f8l0(b2));
                        vdx.f37253a = wcyVarC;
                    }
                    iterable = (List) wcyVarC.b(new zw3(mrv.j0(pr40.Companion.serializer()), (byte) 0), str2);
                    if (iterable == null) {
                        iterable = iun.f15405a;
                    }
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                for (pr40 pr40Var : iterable) {
                    arrayList2.add(new bzp(String.valueOf(pr40Var != null ? pr40Var.f27448a : null), Intrinsics.d(pr40Var != null ? pr40Var.b : null, qzb.c0(d0tVar)) ? rip0Var : sip0Var, Intrinsics.d(pr40Var != null ? pr40Var.b : null, qzb.r0(d0tVar)) ? rip0Var : sip0Var));
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                List<df90> list = rqsVar.d;
                ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                for (df90 df90Var : list) {
                    tf90 tf90Var = df90Var.b;
                    arrayList3.add(new bzp(String.valueOf(df90Var.f5989a), tf90Var.b != 0 ? rip0Var : sip0Var, tf90Var.c != 0 ? rip0Var : sip0Var));
                }
                arrayList = new ArrayList(arrayList3);
            }
            if (arrayList.size() < 5) {
                arrayList.add(new bzp(String.valueOf(arrayList.size() + 1), qip0Var, qip0Var));
            }
            return dyb.o0(arrayList);
        }
        Iterator it2 = d0tVar.p.n.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((cmr) next2).f4620a != dmr.v);
        cmr cmrVar2 = (cmr) next2;
        String str3 = cmrVar2 != null ? cmrVar2.b : null;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.length() <= 0) {
            str3 = null;
        }
        if (str3 == null) {
            iterable2 = iun.f15405a;
        } else {
            wcy wcyVarC2 = vdx.f37253a;
            if (wcyVarC2 == null) {
                wcyVarC2 = qxw.c(new f8l0(b2));
                vdx.f37253a = wcyVarC2;
            }
            iterable2 = (List) wcyVarC2.b(new zw3(mrv.j0(pr40.Companion.serializer()), (byte) 0), str3);
            if (iterable2 == null) {
                iterable2 = iun.f15405a;
            }
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(iterable2, 10));
        for (pr40 pr40Var2 : iterable2) {
            String str4 = pr40Var2 != null ? pr40Var2.c : null;
            if (str4 == null) {
                str4 = "";
            }
            switch (str4) {
                case "Regular":
                    uypVar = uyp.e;
                    break;
                case "Friendship":
                    uypVar = uyp.c;
                    break;
                case "Fatality":
                    uypVar = uyp.b;
                    break;
                case "Brutality":
                    uypVar = uyp.f36502a;
                    break;
                default:
                    uypVar = uyp.d;
                    break;
            }
            char c2 = pr40Var2 != null ? Intrinsics.d(pr40Var2.f, Boolean.TRUE) : false ? (char) 1 : (char) 2;
            e5h0 e5h0Var = e5h0.f7234a;
            tip0 rip0Var2 = new rip0(uypVar);
            String strValueOf = String.valueOf(pr40Var2 != null ? pr40Var2.f27448a : null);
            tip0 tip0Var = c2 == 1 ? rip0Var2 : sip0Var;
            if (c2 == 1) {
                rip0Var2 = sip0Var;
            }
            arrayList4.add(new bzp(strValueOf, tip0Var, rip0Var2));
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        if (arrayList5.size() < 5) {
            arrayList5.add(new bzp(String.valueOf(arrayList5.size() + 1), qip0Var, qip0Var));
        }
        return dyb.o0(arrayList5);
    }
}
