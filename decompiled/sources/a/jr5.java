package a;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class jr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrc f16985a;
    public boolean b;
    public boolean c;
    public pfn k;
    public final p7m0 d = q7m0.a(Boolean.TRUE);
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final LinkedHashMap f = new LinkedHashMap();
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final LinkedHashMap h = new LinkedHashMap();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();
    public final LinkedHashMap l = new LinkedHashMap();
    public final n0o0 m = maz.b(new zo4(this, 12));
    public final LinkedHashSet n = new LinkedHashSet();

    public jr5(rrc rrcVar) {
        this.f16985a = rrcVar;
    }

    public static String c(List list) {
        return "banner_types_".concat(CollectionsKt.b0(CollectionsKt.z0(list), BundleUtil.UNDERLINE_TAG, null, null, null, 62));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        hr5 hr5Var;
        if (zjeVar instanceof hr5) {
            hr5Var = (hr5) zjeVar;
            int i = hr5Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hr5Var.k = i - Integer.MIN_VALUE;
            } else {
                hr5Var = new hr5(this, zjeVar);
            }
        } else {
            hr5Var = new hr5(this, zjeVar);
        }
        Object objW0 = hr5Var.i;
        wne wneVar = wne.f39444a;
        int i2 = hr5Var.k;
        yje yjeVar = null;
        LinkedHashSet linkedHashSet = this.n;
        if (i2 == 0) {
            z1x.P(objW0);
            List listL0 = CollectionsKt.L0(linkedHashSet);
            if (!listL0.isEmpty()) {
                return listL0;
            }
            vn50 vn50Var = (vn50) this.m.getValue();
            hr5Var.k = 1;
            objW0 = sj3.w0(hr5Var, vn50Var.f37702a, new st20(2, yjeVar, (byte) 4), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        List list = (List) objW0;
        linkedHashSet.addAll(list);
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, zje zjeVar) {
        ir5 ir5Var;
        if (zjeVar instanceof ir5) {
            ir5Var = (ir5) zjeVar;
            int i2 = ir5Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ir5Var.k = i2 - Integer.MIN_VALUE;
            } else {
                ir5Var = new ir5(this, zjeVar);
            }
        } else {
            ir5Var = new ir5(this, zjeVar);
        }
        Object obj = ir5Var.i;
        wne wneVar = wne.f39444a;
        int i3 = ir5Var.k;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(obj);
            this.n.add(new Integer(i));
            vn50 vn50Var = (vn50) this.m.getValue();
            un50 un50Var = new un50(i);
            ir5Var.k = 1;
            if (sj3.w0(ir5Var, vn50Var.f37702a, new hk40((Object) vn50Var, (Object) un50Var, yjeVar, (byte) 11), false, true) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
