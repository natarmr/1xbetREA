package a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class xoj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bai0 f41223a;
    public final jgb0 b;
    public final Context c;
    public final String d;
    public final n0o0 e;
    public final LinkedHashSet f;

    public xoj0(Context context, String str, Set set, bai0 bai0Var, jgb0 jgb0Var) {
        set.getClass();
        x6h0 x6h0Var = new x6h0(context, str, (byte) 22);
        this.f41223a = bai0Var;
        this.b = jgb0Var;
        this.c = context;
        this.d = str;
        this.e = maz.b(x6h0Var);
        this.f = set == zoj0.f44723a ? null : CollectionsKt.O0(set);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, zje zjeVar) {
        woj0 woj0Var;
        if (zjeVar instanceof woj0) {
            woj0Var = (woj0) zjeVar;
            int i = woj0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                woj0Var.k = i - Integer.MIN_VALUE;
            } else {
                woj0Var = new woj0(this, zjeVar);
            }
        } else {
            woj0Var = new woj0(this, zjeVar);
        }
        Object objInvoke = woj0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = woj0Var.k;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objInvoke);
            woj0Var.k = 1;
            objInvoke = this.f41223a.invoke(obj, woj0Var);
            if (objInvoke == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        LinkedHashSet linkedHashSet = this.f;
        n0o0 n0o0Var = this.e;
        if (linkedHashSet == null) {
            Map<String, ?> all = ((SharedPreferences) n0o0Var.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) n0o0Var.getValue();
            if (linkedHashSet.isEmpty()) {
                z = false;
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
