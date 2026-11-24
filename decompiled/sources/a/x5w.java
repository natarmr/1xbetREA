package a;

import java.io.Serializable;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.List;
import java.util.NavigableMap;
import javax.net.ssl.SSLException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x5w extends m06 {
    public final sys0 b;
    public final afm0 c;
    public final s5w d;
    public final s77 e;
    public final String f;
    public final boolean g;
    public final String h;

    public x5w(sys0 sys0Var, afm0 afm0Var, s5w s5wVar, s77 s77Var, String str, boolean z, String str2) {
        sys0Var.getClass();
        s5wVar.getClass();
        s77Var.getClass();
        this.b = sys0Var;
        this.c = afm0Var;
        this.d = s5wVar;
        this.e = s77Var;
        this.f = str;
        this.g = z;
        this.h = str2;
    }

    @Override // a.m06
    public final Object a(om80 om80Var) {
        Integer num;
        mm80 mm80VarA;
        om80Var.getClass();
        if (this.g || (num = om80Var.b) == null || (mm80VarA = om80Var.a(num.intValue())) == null) {
            return null;
        }
        return (String) mm80VarA.b;
    }

    @Override // a.m06
    public final lm80 b(Throwable th) {
        return new lm80(th);
    }

    @Override // a.m06
    public final boolean d(Object obj, Object obj2) {
        return Intrinsics.d((String) obj, (String) obj2);
    }

    @Override // a.m06
    public final Serializable f(km80 km80Var, yje yjeVar) throws Throwable {
        List listL0;
        List listL1;
        String str = (String) km80Var.a();
        s77 s77Var = this.e;
        int i = (s77Var == s77.TOTO || s77Var == s77.JACKPOT || s77Var == s77.AUTO) ? Integer.MAX_VALUE : km80Var.f18526a;
        if (km80Var instanceof im80) {
            s5w s5wVar = this.d;
            synchronized (s5wVar.d) {
                NavigableMap navigableMapTailMap = s5wVar.f31675a;
                if (str != null) {
                    try {
                        navigableMapTailMap = navigableMapTailMap.descendingMap().tailMap(str, false);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Collection collectionValues = navigableMapTailMap.values();
                collectionValues.getClass();
                listL1 = CollectionsKt.L0(CollectionsKt.t0(CollectionsKt.D0(collectionValues, i)));
            }
            return g(str, listL1);
        }
        if (!(km80Var instanceof jm80) && !(km80Var instanceof hm80)) {
            t9f.b();
            return null;
        }
        s5w s5wVar2 = this.d;
        synchronized (s5wVar2.d) {
            NavigableMap navigableMapTailMap2 = s5wVar2.f31675a;
            if (str != null) {
                try {
                    navigableMapTailMap2 = navigableMapTailMap2.tailMap(str, false);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Collection collectionValues2 = navigableMapTailMap2.values();
            collectionValues2.getClass();
            listL0 = CollectionsKt.L0(CollectionsKt.D0(collectionValues2, i));
        }
        if (!listL0.isEmpty()) {
            return g(str, listL0);
        }
        Serializable serializableH = h(km80Var, (zje) yjeVar);
        return serializableH == wne.f39444a ? serializableH : (Pair) serializableH;
    }

    public final Pair g(String str, List list) {
        n3w n3wVar;
        n3w n3wVar2;
        s77 s77Var = s77.TOTO;
        String strF = null;
        s77 s77Var2 = this.e;
        String strF2 = (s77Var2 == s77Var || s77Var2 == s77.JACKPOT || s77Var2 == s77.AUTO || list.size() < 15 || (n3wVar2 = (n3w) CollectionsKt.f0(list)) == null) ? null : n3wVar2.f();
        if (str != null && (n3wVar = (n3w) CollectionsKt.firstOrNull(list)) != null) {
            strF = n3wVar.f();
        }
        return new Pair(strF2, new mm80(list, strF, strF2));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if (r1 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if (r1 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        if (r1 == r0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(a.km80 r10, a.zje r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.x5w.h(a.km80, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.u5w, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final Object i(u5w u5wVar, zje zjeVar) {
        v5w v5wVar;
        ?? r7;
        if (zjeVar instanceof v5w) {
            v5wVar = (v5w) zjeVar;
            int i = v5wVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                v5wVar.l = i - Integer.MIN_VALUE;
            } else {
                v5wVar = new v5w(this, zjeVar);
            }
        } else {
            v5wVar = new v5w(this, zjeVar);
        }
        Object obj = v5wVar.j;
        wne wneVar = wne.f39444a;
        int i2 = v5wVar.l;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    Function1 function1 = v5wVar.i;
                    z1x.P(obj);
                    return obj;
                }
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u5wVar = v5wVar.i;
            }
            z1x.P(obj);
            r7 = u5wVar;
        } catch (Throwable th) {
            if (th instanceof oqt0) {
                throw th;
            }
            v5wVar.i = u5wVar;
            v5wVar.l = 2;
            r7 = u5wVar;
            if (qcc.O(3000L, v5wVar) != wneVar) {
            }
        }
        v5wVar.i = r7;
        v5wVar.l = 1;
        Object objInvoke = r7.invoke(v5wVar);
        return objInvoke == wneVar ? wneVar : objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0091 -> B:13:0x002f). Please report as a decompilation issue!!! */
    public final Object j(u5w u5wVar, zje zjeVar) throws Throwable {
        w5w w5wVar;
        int i;
        int i2;
        Throwable th;
        Function1 function1;
        Function1 function2;
        Function1 function3;
        if (zjeVar instanceof w5w) {
            w5wVar = (w5w) zjeVar;
            int i3 = w5wVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w5wVar.m = i3 - Integer.MIN_VALUE;
            } else {
                w5wVar = new w5w(this, zjeVar);
            }
        } else {
            w5wVar = new w5w(this, zjeVar);
        }
        Object obj = w5wVar.k;
        wne wneVar = wne.f39444a;
        int i4 = w5wVar.m;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    i2 = w5wVar.j;
                    function1 = w5wVar.i;
                    try {
                        z1x.P(obj);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i4 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = w5wVar.j;
                    Function1 function4 = w5wVar.i;
                    z1x.P(obj);
                    i = i5;
                    function3 = function4;
                    function2 = function3;
                }
                boolean z = (th instanceof oqt0) || ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof ProtocolException) || (th instanceof SSLException));
                int i6 = i2 + 1;
                if (i2 >= 3 || z) {
                    throw th;
                }
                w5wVar.i = function1;
                w5wVar.j = i6;
                w5wVar.m = 2;
                if (qcc.O(3000L, w5wVar) != wneVar) {
                    i = i6;
                    function3 = function1;
                    function2 = function3;
                }
            }
            z1x.P(obj);
            i = 0;
            function2 = u5wVar;
        } catch (Throwable th3) {
            Function1 function5 = function2;
            i2 = i;
            th = th3;
            function1 = function5;
        }
        w5wVar.i = function2;
        w5wVar.j = i;
        w5wVar.m = 1;
        Object objInvoke = function2.invoke(w5wVar);
        return objInvoke == wneVar ? wneVar : objInvoke;
    }
}
