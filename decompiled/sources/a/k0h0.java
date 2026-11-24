package a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k0h0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0h0 f17467a = new k0h0();
    public static final wgi0 b = x2x.F("androidx.savedstate.SavedState", new ugi0[0]);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Pair[] pairArr;
        Object objValueOf;
        if (rkjVar instanceof tzg0) {
            tzg0 tzg0Var = (tzg0) rkjVar;
            boolean zD = Intrinsics.d(tzg0Var.n, "");
            Bundle bundle = tzg0Var.l;
            return zD ? bundle : b8k0.L(bundle, tzg0Var.n);
        }
        Map map = (Map) rkjVar.w(l0h0.f19202a);
        map.getClass();
        jo20 jo20Var = new jo20(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            chi0 chi0Var = (chi0) entry.getValue();
            if (chi0Var instanceof wm8) {
                objValueOf = Boolean.valueOf(((wm8) chi0Var).f39391a);
            } else if (chi0Var instanceof tvb) {
                objValueOf = Character.valueOf(((tvb) chi0Var).f34591a);
            } else if (chi0Var instanceof wbl) {
                objValueOf = Double.valueOf(((wbl) chi0Var).f38884a);
            } else if (chi0Var instanceof qlq) {
                objValueOf = Float.valueOf(((qlq) chi0Var).f28946a);
            } else if (chi0Var instanceof wkx) {
                objValueOf = Integer.valueOf(((wkx) chi0Var).f39329a);
            } else if (chi0Var instanceof y710) {
                objValueOf = Long.valueOf(((y710) chi0Var).f42128a);
            } else if (Intrinsics.d(chi0Var, m860.INSTANCE)) {
                objValueOf = null;
            } else if (chi0Var instanceof itm0) {
                objValueOf = ((itm0) chi0Var).f15361a;
            } else if (chi0Var instanceof ovb) {
                objValueOf = ((ovb) chi0Var).f25916a;
            } else if (chi0Var instanceof qm8) {
                objValueOf = ((qm8) chi0Var).f28970a;
            } else if (chi0Var instanceof nub) {
                objValueOf = ((nub) chi0Var).f24141a;
            } else if (chi0Var instanceof kbl) {
                objValueOf = ((kbl) chi0Var).f18019a;
            } else if (chi0Var instanceof elq) {
                objValueOf = ((elq) chi0Var).f8014a;
            } else if (chi0Var instanceof xjx) {
                objValueOf = ((xjx) chi0Var).f41007a;
            } else if (chi0Var instanceof b710) {
                objValueOf = ((b710) chi0Var).f2082a;
            } else if (chi0Var instanceof ism0) {
                objValueOf = ((ism0) chi0Var).f15312a;
            } else if (chi0Var instanceof fvb) {
                objValueOf = ((fvb) chi0Var).f10206a;
            } else if (chi0Var instanceof nzg0) {
                objValueOf = ((nzg0) chi0Var).f24371a;
            } else if (chi0Var instanceof ekx) {
                objValueOf = ((ekx) chi0Var).f7973a;
            } else if (chi0Var instanceof usm0) {
                objValueOf = ((usm0) chi0Var).f36219a;
            } else if (chi0Var instanceof kvb) {
                objValueOf = ((kvb) chi0Var).f18950a;
            } else if (chi0Var instanceof e0h0) {
                objValueOf = ((e0h0) chi0Var).f6989a;
            } else {
                if (!(chi0Var instanceof o0h0)) {
                    t9f.b();
                    return null;
                }
                objValueOf = ((o0h0) chi0Var).f24424a;
            }
            jo20Var.put(str, objValueOf);
        }
        jo20 jo20VarB = jo20Var.b();
        if (jo20VarB.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(jo20VarB.i);
            Object it = ((ko20) jo20VarB.entrySet()).iterator();
            while (((io20) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((go20) it).next();
                arrayList.add(new Pair((String) entry2.getKey(), entry2.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        return i120.V((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        Object o0h0Var;
        Object kvbVar;
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        if (bwnVar instanceof uzg0) {
            uzg0 uzg0Var = (uzg0) bwnVar;
            boolean zD = Intrinsics.d(uzg0Var.w, "");
            Bundle bundle2 = uzg0Var.u;
            if (zD) {
                bundle2.putAll(bundle);
                return;
            }
            String str = uzg0Var.w;
            str.getClass();
            bundle2.putBundle(str, bundle);
            return;
        }
        jo20 jo20VarA0 = b8k0.a0(bundle);
        jo20 jo20Var = new jo20(jo20VarA0.i);
        Object it = ((ko20) jo20VarA0.entrySet()).iterator();
        while (((io20) it).hasNext()) {
            Map.Entry entry = (Map.Entry) ((go20) it).next();
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                kvbVar = m860.INSTANCE;
            } else {
                if (value instanceof Boolean) {
                    o0h0Var = new wm8(((Boolean) value).booleanValue());
                } else if (value instanceof Character) {
                    o0h0Var = new tvb(((Character) value).charValue());
                } else if (value instanceof Double) {
                    o0h0Var = new wbl(((Number) value).doubleValue());
                } else if (value instanceof Float) {
                    o0h0Var = new qlq(((Number) value).floatValue());
                } else if (value instanceof Integer) {
                    o0h0Var = new wkx(((Number) value).intValue());
                } else if (value instanceof Long) {
                    o0h0Var = new y710(((Number) value).longValue());
                } else if (value instanceof String) {
                    o0h0Var = new itm0((String) value);
                } else if (value instanceof CharSequence) {
                    o0h0Var = new ovb(value.toString());
                } else if (value instanceof boolean[]) {
                    o0h0Var = new qm8((boolean[]) value);
                } else if (value instanceof char[]) {
                    o0h0Var = new nub((char[]) value);
                } else if (value instanceof double[]) {
                    o0h0Var = new kbl((double[]) value);
                } else if (value instanceof float[]) {
                    o0h0Var = new elq((float[]) value);
                } else if (value instanceof int[]) {
                    o0h0Var = new xjx((int[]) value);
                } else if (value instanceof long[]) {
                    o0h0Var = new b710((long[]) value);
                } else if (value instanceof Object[]) {
                    Object[] objArr = (Object[]) value;
                    if (objArr.length == 0) {
                        kvbVar = new ism0(new String[0]);
                    } else {
                        Object objA = tx3.A(objArr);
                        if (objA instanceof Integer) {
                            o0h0Var = new xjx((int[]) objArr);
                        } else if (objA instanceof String) {
                            o0h0Var = new ism0((String[]) objArr);
                        } else if (objA instanceof CharSequence) {
                            ArrayList arrayList = new ArrayList(objArr.length);
                            for (Object[] objArr2 : objArr) {
                                arrayList.add(String.valueOf(objArr2));
                            }
                            kvbVar = new kvb(arrayList);
                        } else {
                            if (!(objA instanceof Bundle)) {
                                StringBuilder sb = new StringBuilder("Unsupported Array type: ");
                                objA.getClass();
                                jf4.o(kng0.g(sre0.f32672a, objA.getClass(), sb));
                                return;
                            }
                            o0h0Var = new e0h0((List) objArr);
                        }
                    }
                } else if (value instanceof List) {
                    List list = (List) value;
                    if (list.isEmpty()) {
                        kvbVar = new usm0(iun.f15405a);
                    } else {
                        Object objU = CollectionsKt.U(list);
                        if (objU instanceof Integer) {
                            o0h0Var = new ekx(list);
                        } else if (objU instanceof String) {
                            o0h0Var = new usm0(list);
                        } else if (objU instanceof CharSequence) {
                            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((CharSequence) it2.next()).toString());
                            }
                            kvbVar = new kvb(arrayList2);
                        } else {
                            if (!(objU instanceof Bundle)) {
                                StringBuilder sb2 = new StringBuilder("Unsupported List type: ");
                                objU.getClass();
                                jf4.o(kng0.g(sre0.f32672a, objU.getClass(), sb2));
                                return;
                            }
                            o0h0Var = new e0h0(list);
                        }
                    }
                } else {
                    if (!(value instanceof Bundle)) {
                        jf4.o(kng0.g(sre0.f32672a, value.getClass(), new StringBuilder("Unsupported type in SavedState: ")));
                        return;
                    }
                    o0h0Var = new o0h0((Bundle) value);
                }
                kvbVar = o0h0Var;
            }
            jo20Var.put(str2, kvbVar);
        }
        bwnVar.C(l0h0.f19202a, jo20Var.b());
    }
}
