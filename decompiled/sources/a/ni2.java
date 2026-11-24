package a;

import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ni2 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public boolean k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(qi2 qi2Var, i8l0 i8l0Var, boolean z, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 0;
        this.l = qi2Var;
        this.m = i8l0Var;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.m;
        switch (b) {
            case 0:
                return new ni2((qi2) this.l, (i8l0) obj, this.k, yjeVar);
            case 1:
                return new ni2((iqi) this.l, this.k, (String) obj, yjeVar, (byte) 1);
            case 2:
                return new ni2((nn20) this.l, (m97) obj, yjeVar);
            case 3:
                return new ni2((ata0) obj, yjeVar);
            default:
                return new ni2((LinkedHashSet) this.l, this.k, (xot0) obj, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((ni2) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object value;
        boolean zJ;
        Object objR;
        Object value2;
        Object value3;
        sff0 sff0VarA;
        Object objC2;
        boolean z;
        Object value4;
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                qi2 qi2Var = (qi2) this.l;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    j3c j3cVar = qi2Var.o;
                    this.j = true;
                    objC = j3cVar.c(this);
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                wh2 wh2Var = new wh2((wcb) objC, qi2Var.t, (i8l0) obj2, this.k);
                p7m0 p7m0Var = qi2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ei2.a((ei2) value, wh2Var, false, null, false, false, null, 126)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                nhf0 nhf0Var = (nhf0) ((iqi) this.l).c;
                this.j = true;
                Object objD0 = qjj.d0(((mne) nhf0Var.d).b, new xj1((Object) nhf0Var, this.k, obj2, (yje) null, (byte) 4), this);
                return objD0 == wneVar2 ? wneVar2 : objD0;
            case 2:
                nn20 nn20Var = (nn20) this.l;
                ocj ocjVar = nn20Var.i;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.k;
                if (!z4) {
                    z1x.P(obj);
                    zJ = nn20Var.i0.j();
                    this.j = zJ;
                    this.k = true;
                    objR = nn20Var.R(zJ, (m97) obj2, this);
                    if (objR == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z5 = this.j;
                    z1x.P(obj);
                    zJ = z5;
                    objR = obj;
                }
                boolean zBooleanValue = ((Boolean) objR).booleanValue();
                int i = nn20.c1;
                if (!nn20Var.z.a().l.g || zJ) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, b820.a((b820) value2, null, null, null, null, null, null, null, false, false, false, false, false, 8175)));
                }
                if (!zBooleanValue) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, b820.a((b820) value3, null, null, null, null, null, null, null, false, false, false, false, false, 8159)));
                }
                return Unit.f46060a;
            case 3:
                ata0 ata0Var = (ata0) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.k;
                if (!z6) {
                    z1x.P(obj);
                    sff0VarA = ata0Var.v.a();
                    boolean zJ2 = ata0Var.C.j();
                    j3c j3cVar2 = ata0Var.B;
                    this.l = sff0VarA;
                    this.j = zJ2;
                    this.k = true;
                    objC2 = j3cVar2.c(this);
                    if (objC2 == wneVar4) {
                        return wneVar4;
                    }
                    z = zJ2;
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = this.j;
                    sff0 sff0Var = (sff0) this.l;
                    z1x.P(obj);
                    sff0VarA = sff0Var;
                    objC2 = obj;
                }
                bsa0 bsa0Var = new bsa0(sff0VarA, z, (wcb) objC2, ata0Var.E);
                p7m0 p7m0Var4 = ata0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, nsa0.a((nsa0) value4, null, null, null, false, bsa0Var, false, null, 959)));
                return Unit.f46060a;
            default:
                xot0 xot0Var = (xot0) obj2;
                LinkedHashMap linkedHashMap = xot0Var.k;
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                boolean z8 = true;
                if (z7) {
                    if (z7) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl: Building SessionConfig...");
                }
                zii0 zii0Var = new zii0((LinkedHashSet) this.l, this.k);
                xii0 xii0Var = ((wii0) zii0Var.e.getValue()).c() ? (xii0) zii0Var.f.getValue() : null;
                if (xii0Var == null) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "Using default SessionConfig");
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    HashSet hashSet = new HashSet();
                    wy40 wy40VarL = wy40.l();
                    ArrayList arrayList = new ArrayList();
                    tz40 tz40VarA = tz40.a();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    ArrayList arrayList6 = new ArrayList(arrayList2);
                    ArrayList arrayList7 = new ArrayList(arrayList3);
                    ArrayList arrayList8 = new ArrayList(arrayList4);
                    ArrayList arrayList9 = new ArrayList(hashSet);
                    b780 b780VarJ = b780.j(wy40VarL);
                    ArrayList arrayList10 = new ArrayList(arrayList);
                    eoo0 eoo0Var = eoo0.b;
                    ArrayMap arrayMap = new ArrayMap();
                    ArrayMap arrayMap2 = tz40VarA.f8147a;
                    for (String str : arrayMap2.keySet()) {
                        arrayMap.put(str, arrayMap2.get(str));
                        arrayList5 = arrayList5;
                    }
                    z8 = true;
                    xii0Var = new xii0(arrayList5, arrayList6, arrayList7, arrayList8, new t7a(arrayList9, b780VarJ, 1, arrayList10, new eoo0(arrayMap)), null, null, 0, null);
                }
                t7a t7aVar = xii0Var.g;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl: SessionConfig built. Updating state...");
                }
                oot0 oot0Var = oot0.f25610a;
                odd oddVar = xot0.l;
                ex2 ex2Var = xot0Var.e.e;
                bbw0 bbw0Var = new bbw0((byte) 16);
                if (!t7aVar.a().equals(h55.h)) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                    key.getClass();
                    ((wy40) bbw0Var.b).y(s5x0.C(key), t7aVar.a());
                }
                bbw0Var.o(t7aVar.b);
                eoo0 eoo0Var2 = t7aVar.e;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayMap arrayMap3 = eoo0Var2.f8147a;
                Set<String> setKeySet = arrayMap3.keySet();
                setKeySet.getClass();
                for (String str2 : setKeySet) {
                    Object obj3 = arrayMap3.get(str2);
                    obj3.getClass();
                    linkedHashMap2.put(str2, obj3);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                ex2Var.getClass();
                List list = t7aVar.d;
                list.getClass();
                ux9 ux9Var = new ux9();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ux9Var.b((vx9) it.next(), ex2Var);
                }
                linkedHashMap.put(oot0Var, new rot0(bbw0Var, linkedHashMap3, dui0.c(ux9Var), new onf0(t7aVar.c)));
                kpt0 kpt0Var = xot0Var.c;
                List listUnmodifiableList = Collections.unmodifiableList(t7aVar.f33457a);
                listUnmodifiableList.getClass();
                LinkedHashSet linkedHashSetB = kpt0Var.b(listUnmodifiableList);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl: State update processing.");
                }
                rot0 rot0VarO = xot0.o(linkedHashMap);
                this.j = z8;
                Object objR2 = xot0Var.r(rot0VarO, linkedHashSetB, this);
                return objR2 == wneVar5 ? wneVar5 : objR2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(nn20 nn20Var, m97 m97Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 2;
        this.l = nn20Var;
        this.m = m97Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(ata0 ata0Var, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 3;
        this.m = ata0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni2(Object obj, boolean z, Object obj2, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = z;
        this.m = obj2;
    }
}
