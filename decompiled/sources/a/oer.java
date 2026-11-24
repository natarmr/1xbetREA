package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oer extends yjj implements mer {
    public final mer A;
    public final int B;
    public mer Y;
    public Map Z;
    public List f;
    public List g;
    public wsy h;
    public List i;
    public c8z j;
    public c8z k;
    public gm40 l;
    public tek m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public Collection y;
    public volatile lhf z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oer(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var) {
        super(vjjVar, g93Var, g950Var, gmk0Var);
        if (vjjVar == null) {
            k0(0);
            throw null;
        }
        if (g93Var == null) {
            k0(1);
            throw null;
        }
        if (g950Var == null) {
            k0(2);
            throw null;
        }
        if (i == 0) {
            k0(3);
            throw null;
        }
        if (gmk0Var == null) {
            k0(4);
            throw null;
        }
        this.m = uek.i;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = false;
        this.y = null;
        this.z = null;
        this.Y = null;
        this.Z = null;
        this.A = merVar == null ? this : merVar;
        this.B = i;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = Payload.SOURCE;
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = RemoteMessageConst.Notification.VISIBILITY;
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                objArr[0] = "substitutor";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[1] = "copy";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "doSubstitute";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 21:
            case 23:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static ArrayList s1(mer merVar, List list, xzs0 xzs0Var, boolean z, boolean z2, boolean[] zArr) throws wzs0 {
        if (list == null) {
            k0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k3u0 k3u0Var = (k3u0) it.next();
            wsy type = k3u0Var.getType();
            t3u0 t3u0Var = t3u0.d;
            wsy wsyVarH = xzs0Var.h(type, t3u0Var);
            wsy wsyVar = k3u0Var.k;
            wsy wsyVarH2 = wsyVar == null ? null : xzs0Var.h(wsyVar, t3u0Var);
            if (wsyVarH == null) {
                return null;
            }
            if ((wsyVarH != k3u0Var.getType() || wsyVar != wsyVarH2) && zArr != null) {
                zArr[0] = true;
            }
            jfl jflVar = k3u0Var instanceof j3u0 ? new jfl((List) ((j3u0) k3u0Var).m.getValue(), (byte) 20) : null;
            k3u0 k3u0Var2 = z ? null : k3u0Var;
            int i = k3u0Var.g;
            g93 annotations = k3u0Var.getAnnotations();
            g950 name = k3u0Var.getName();
            boolean zQ1 = k3u0Var.q1();
            boolean z3 = k3u0Var.i;
            boolean z4 = k3u0Var.j;
            gmk0 gmk0VarB = z2 ? k3u0Var.b() : gmk0.x0;
            annotations.getClass();
            name.getClass();
            gmk0VarB.getClass();
            arrayList.add(jflVar == null ? new k3u0(merVar, k3u0Var2, i, annotations, name, wsyVarH, zQ1, z3, z4, wsyVarH2, gmk0VarB) : new j3u0(merVar, k3u0Var2, i, annotations, name, wsyVarH, zQ1, z3, z4, wsyVarH2, gmk0VarB, jflVar));
        }
        return arrayList;
    }

    @Override // a.kp9
    public final c8z C() {
        return this.k;
    }

    @Override // a.kp9
    public final c8z F() {
        return this.j;
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.kp9
    public boolean P() {
        return this.x;
    }

    @Override // a.sq30
    public final boolean Q() {
        return this.s;
    }

    @Override // a.mer
    public final mer T() {
        return this.Y;
    }

    @Override // a.kp9
    public final List W() {
        List list = this.i;
        if (list != null) {
            return list;
        }
        k0(13);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.mer] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // a.yjj, a.wjj, a.vjj, a.kp9
    /* JADX INFO: renamed from: a */
    public mer o1() {
        mer merVar = this.A;
        ?? O1 = this;
        if (merVar != this) {
            O1 = merVar.o1();
        }
        if (O1 != 0) {
            return O1;
        }
        k0(20);
        throw null;
    }

    @Override // a.mer
    public final boolean b0() {
        return this.t;
    }

    public void d0(Collection collection) {
        if (collection == null) {
            k0(17);
            throw null;
        }
        this.y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((mer) it.next()).e0()) {
                this.u = true;
                return;
            }
        }
    }

    @Override // a.mer
    public final boolean e0() {
        return this.u;
    }

    @Override // a.wen0
    public mer f(xzs0 xzs0Var) {
        if (xzs0Var == null) {
            k0(22);
            throw null;
        }
        if (xzs0Var.f41769a.e()) {
            return this;
        }
        ner nerVarU1 = u1(xzs0Var);
        nerVarU1.e = o1();
        nerVarU1.o = true;
        nerVarU1.w = true;
        return nerVarU1.x.r1(nerVarU1);
    }

    public ler g0() {
        return u1(xzs0.b);
    }

    @Override // a.kp9
    public wsy getReturnType() {
        return this.h;
    }

    @Override // a.kp9
    public final List getTypeParameters() {
        List list = this.f;
        if (list != null) {
            return list;
        }
        e9d0.v(this, "typeParameters == null for ");
        return null;
    }

    @Override // a.akj, a.sq30
    public final tek getVisibility() {
        tek tekVar = this.m;
        if (tekVar != null) {
            return tekVar;
        }
        k0(16);
        throw null;
    }

    public Object i0(zjj zjjVar, Object obj) {
        return zjjVar.j(this, obj);
    }

    @Override // a.sq30
    public boolean isExternal() {
        return this.p;
    }

    @Override // a.mer
    public final boolean isInfix() {
        if (this.o) {
            return true;
        }
        Iterator it = o1().k().iterator();
        while (it.hasNext()) {
            if (((mer) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    @Override // a.mer
    public boolean isInline() {
        return this.q;
    }

    @Override // a.mer
    public final boolean isOperator() {
        if (this.n) {
            return true;
        }
        Iterator it = o1().k().iterator();
        while (it.hasNext()) {
            if (((mer) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.v;
    }

    public Collection k() {
        lhf lhfVar = this.z;
        if (lhfVar != null) {
            this.y = (Collection) lhfVar.invoke();
            this.z = null;
        }
        Collection collection = this.y;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        k0(14);
        throw null;
    }

    @Override // a.mp9
    public final int l() {
        int i = this.B;
        if (i != 0) {
            return i;
        }
        k0(21);
        throw null;
    }

    @Override // a.sq30
    public final gm40 m() {
        gm40 gm40Var = this.l;
        if (gm40Var != null) {
            return gm40Var;
        }
        k0(15);
        throw null;
    }

    public final mer p1(vjj vjjVar, gm40 gm40Var, tek tekVar) {
        mer merVarBuild = g0().h(vjjVar).r(gm40Var).k(tekVar).d(2).i().build();
        if (merVarBuild != null) {
            return merVarBuild;
        }
        k0(26);
        throw null;
    }

    public abstract oer q1(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var);

    /* JADX WARN: Code duplicated, block: B:103:0x0216  */
    /* JADX WARN: Code duplicated, block: B:106:0x021b  */
    /* JADX WARN: Code duplicated, block: B:114:0x023c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0240  */
    /* JADX WARN: Code duplicated, block: B:118:0x0243  */
    /* JADX WARN: Code duplicated, block: B:120:0x024b  */
    /* JADX WARN: Code duplicated, block: B:129:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:73:0x015b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:98:0x020c  */
    public oer r1(ner nerVar) throws wzs0 {
        g93 annotations;
        c8z c8zVar;
        c8z c8zVar2;
        c8z c8zVar3;
        c8z c8zVar4;
        ArrayList arrayListS1;
        wsy wsyVarH;
        boolean z;
        boolean z2;
        Boolean bool;
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap;
        Map map;
        mer merVar;
        lhf lhfVar;
        c8z c8zVarF;
        boolean z3;
        wsy wsyVarH2;
        boolean z4;
        boolean[] zArr = new boolean[1];
        if (nerVar.s != null) {
            annotations = getAnnotations();
            g93 g93Var = nerVar.s;
            annotations.getClass();
            g93Var.getClass();
            if (annotations.isEmpty()) {
                annotations = g93Var;
            } else if (!g93Var.isEmpty()) {
                annotations = new i93(tx3.g0(new g93[]{annotations, g93Var}), (byte) 1);
            }
        } else {
            annotations = getAnnotations();
        }
        g93 g93Var2 = annotations;
        vjj vjjVar = nerVar.b;
        mer merVar2 = nerVar.e;
        int i = nerVar.f;
        g950 g950Var = nerVar.l;
        gmk0 gmk0VarB = nerVar.o ? ((yjj) (merVar2 != null ? merVar2 : o1())).b() : gmk0.x0;
        if (gmk0VarB == null) {
            k0(27);
            throw null;
        }
        oer oerVarQ1 = q1(i, g93Var2, vjjVar, merVar2, g950Var, gmk0VarB);
        List typeParameters = nerVar.r;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        xzs0 xzs0VarL0 = vdb.l0(typeParameters, nerVar.f23400a, oerVarQ1, arrayList, zArr);
        if (xzs0VarL0 != null) {
            ArrayList arrayList2 = new ArrayList();
            if (nerVar.h.isEmpty()) {
                c8zVar = nerVar.i;
                if (c8zVar != null) {
                    wsyVarH2 = xzs0VarL0.h(c8zVar.getType(), t3u0.d);
                    if (wsyVarH2 != null) {
                        nerVar.i.p1();
                        c8z c8zVar5 = new c8z(oerVarQ1, new lso(oerVarQ1, wsyVarH2), nerVar.i.getAnnotations());
                        boolean z5 = zArr[0];
                        if (wsyVarH2 != nerVar.i.getType()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zArr[0] = z4 | z5;
                        c8zVar2 = c8zVar5;
                    }
                } else {
                    c8zVar2 = null;
                }
                c8zVar3 = nerVar.j;
                if (c8zVar3 != null) {
                    c8zVarF = c8zVar3.f(xzs0VarL0);
                    if (c8zVarF != null) {
                        boolean z6 = zArr[0];
                        if (c8zVarF != nerVar.j) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zArr[0] = z6 | z3;
                        c8zVar4 = c8zVarF;
                    }
                } else {
                    c8zVar4 = null;
                }
                arrayListS1 = s1(oerVarQ1, nerVar.g, xzs0VarL0, nerVar.p, nerVar.o, zArr);
                if (arrayListS1 != null) {
                    boolean z7 = zArr[0];
                    if (wsyVarH != nerVar.k) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z7 | z;
                    zArr[0] = z2;
                    if (z2) {
                    }
                    oerVarQ1.t1(c8zVar2, c8zVar4, arrayList2, arrayList, arrayListS1, wsyVarH, nerVar.c, nerVar.d);
                    oerVarQ1.n = this.n;
                    oerVarQ1.o = this.o;
                    oerVarQ1.p = this.p;
                    oerVarQ1.q = this.q;
                    oerVarQ1.r = this.r;
                    oerVarQ1.v = this.v;
                    oerVarQ1.s = this.s;
                    oerVarQ1.v1(this.w);
                    oerVarQ1.t = nerVar.q;
                    oerVarQ1.u = nerVar.t;
                    bool = nerVar.v;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.x;
                    }
                    oerVarQ1.w1(zBooleanValue);
                    if (nerVar.u.isEmpty()) {
                        linkedHashMap = nerVar.u;
                        map = this.Z;
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            oerVarQ1.Z = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            oerVarQ1.Z = linkedHashMap;
                        }
                    } else {
                        linkedHashMap = nerVar.u;
                        map = this.Z;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            oerVarQ1.Z = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            oerVarQ1.Z = linkedHashMap;
                        }
                    }
                    if (nerVar.n) {
                        merVar = this.Y;
                        if (merVar == null) {
                            merVar = this;
                        }
                        oerVarQ1.Y = merVar.f(xzs0VarL0);
                    } else {
                        merVar = this.Y;
                        if (merVar == null) {
                            merVar = this;
                        }
                        oerVarQ1.Y = merVar.f(xzs0VarL0);
                    }
                    if (nerVar.m) {
                        if (nerVar.f23400a.e()) {
                            lhfVar = this.z;
                            if (lhfVar != null) {
                                oerVarQ1.z = lhfVar;
                                return oerVarQ1;
                            }
                            oerVarQ1.d0(k());
                            return oerVarQ1;
                        }
                        oerVarQ1.z = new lhf(this, xzs0VarL0);
                    }
                    return oerVarQ1;
                }
            } else {
                int i2 = 0;
                for (c8z c8zVar6 : nerVar.h) {
                    wsy wsyVarH3 = xzs0VarL0.h(c8zVar6.getType(), t3u0.d);
                    if (wsyVarH3 != null) {
                        int i3 = i2 + 1;
                        arrayList2.add(obb.M(oerVarQ1, wsyVarH3, ((mje) c8zVar6.p1()).n1(), c8zVar6.getAnnotations(), i2));
                        zArr[0] = zArr[0] | (wsyVarH3 != c8zVar6.getType());
                        i2 = i3;
                    }
                }
                c8zVar = nerVar.i;
                if (c8zVar != null) {
                    wsyVarH2 = xzs0VarL0.h(c8zVar.getType(), t3u0.d);
                    if (wsyVarH2 != null) {
                        nerVar.i.p1();
                        c8z c8zVar7 = new c8z(oerVarQ1, new lso(oerVarQ1, wsyVarH2), nerVar.i.getAnnotations());
                        boolean z8 = zArr[0];
                        if (wsyVarH2 != nerVar.i.getType()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zArr[0] = z4 | z8;
                        c8zVar2 = c8zVar7;
                    }
                } else {
                    c8zVar2 = null;
                }
                c8zVar3 = nerVar.j;
                if (c8zVar3 != null) {
                    c8zVarF = c8zVar3.f(xzs0VarL0);
                    if (c8zVarF != null) {
                        boolean z9 = zArr[0];
                        if (c8zVarF != nerVar.j) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zArr[0] = z9 | z3;
                        c8zVar4 = c8zVarF;
                    }
                } else {
                    c8zVar4 = null;
                }
                arrayListS1 = s1(oerVarQ1, nerVar.g, xzs0VarL0, nerVar.p, nerVar.o, zArr);
                if (arrayListS1 != null && (wsyVarH = xzs0VarL0.h(nerVar.k, t3u0.e)) != null) {
                    boolean z10 = zArr[0];
                    if (wsyVarH != nerVar.k) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z10 | z;
                    zArr[0] = z2;
                    if (z2 && nerVar.w) {
                        return this;
                    }
                    oerVarQ1.t1(c8zVar2, c8zVar4, arrayList2, arrayList, arrayListS1, wsyVarH, nerVar.c, nerVar.d);
                    oerVarQ1.n = this.n;
                    oerVarQ1.o = this.o;
                    oerVarQ1.p = this.p;
                    oerVarQ1.q = this.q;
                    oerVarQ1.r = this.r;
                    oerVarQ1.v = this.v;
                    oerVarQ1.s = this.s;
                    oerVarQ1.v1(this.w);
                    oerVarQ1.t = nerVar.q;
                    oerVarQ1.u = nerVar.t;
                    bool = nerVar.v;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.x;
                    }
                    oerVarQ1.w1(zBooleanValue);
                    if (nerVar.u.isEmpty() || this.Z != null) {
                        linkedHashMap = nerVar.u;
                        map = this.Z;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            oerVarQ1.Z = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            oerVarQ1.Z = linkedHashMap;
                        }
                    }
                    if (nerVar.n || this.Y != null) {
                        merVar = this.Y;
                        if (merVar == null) {
                            merVar = this;
                        }
                        oerVarQ1.Y = merVar.f(xzs0VarL0);
                    }
                    if (nerVar.m && !o1().k().isEmpty()) {
                        if (nerVar.f23400a.e()) {
                            lhfVar = this.z;
                            if (lhfVar != null) {
                                oerVarQ1.z = lhfVar;
                                return oerVarQ1;
                            }
                            oerVarQ1.d0(k());
                            return oerVarQ1;
                        }
                        oerVarQ1.z = new lhf(this, xzs0VarL0);
                    }
                    return oerVarQ1;
                }
            }
        }
        return null;
    }

    public void t1(c8z c8zVar, c8z c8zVar2, List list, List list2, List list3, wsy wsyVar, gm40 gm40Var, tek tekVar) {
        if (list == null) {
            k0(5);
            throw null;
        }
        if (list2 == null) {
            k0(6);
            throw null;
        }
        if (list3 == null) {
            k0(7);
            throw null;
        }
        if (tekVar == null) {
            k0(8);
            throw null;
        }
        this.f = CollectionsKt.L0(list2);
        this.g = CollectionsKt.L0(list3);
        this.h = wsyVar;
        this.l = gm40Var;
        this.m = tekVar;
        this.j = c8zVar;
        this.k = c8zVar2;
        this.i = list;
        for (int i = 0; i < list2.size(); i++) {
            hzs0 hzs0Var = (hzs0) list2.get(i);
            if (hzs0Var.getIndex() != i) {
                StringBuilder sb = new StringBuilder();
                sb.append(hzs0Var);
                int index = hzs0Var.getIndex();
                sb.append(" index is ");
                sb.append(index);
                sb.append(" but position is ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            k3u0 k3u0Var = (k3u0) list3.get(i2);
            if (k3u0Var.g != i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k3u0Var);
                int i3 = k3u0Var.g;
                sb2.append("index is ");
                sb2.append(i3);
                sb2.append(" but position is ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public Object u(ifk ifkVar) {
        Map map = this.Z;
        if (map == null) {
            return null;
        }
        return map.get(ifkVar);
    }

    public final ner u1(xzs0 xzs0Var) {
        if (xzs0Var != null) {
            return new ner(this, xzs0Var.f41769a, j(), m(), getVisibility(), l(), z(), W(), this.j, getReturnType());
        }
        k0(24);
        throw null;
    }

    public void v1(boolean z) {
        this.w = z;
    }

    @Override // a.mer
    public boolean w() {
        return this.r;
    }

    public void w1(boolean z) {
        this.x = z;
    }

    public final void x1(kzj0 kzj0Var) {
        if (kzj0Var != null) {
            this.h = kzj0Var;
        } else {
            k0(11);
            throw null;
        }
    }

    @Override // a.kp9
    public final List z() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        k0(19);
        throw null;
    }
}
