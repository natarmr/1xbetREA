package a;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import org.xplatform.onexdatabase.OnexDatabase_Impl;

/* JADX INFO: loaded from: classes.dex */
public final class lox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnexDatabase_Impl f20412a;
    public final jrs0 b;
    public final AtomicInteger c;
    public final hox d;
    public final hox e;
    public final Object f;

    public lox(OnexDatabase_Impl onexDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f20412a = onexDatabase_Impl;
        jrs0 jrs0Var = new jrs0(onexDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, onexDatabase_Impl.i);
        this.b = jrs0Var;
        this.c = new AtomicInteger(0);
        this.d = new hox(this, (byte) 0);
        this.e = new hox(this, (byte) 1);
        this.f = new Object();
        jrs0Var.j = new hox(this, (byte) 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(qpg0 qpg0Var, zje zjeVar) {
        kox koxVar;
        if (zjeVar instanceof kox) {
            koxVar = (kox) zjeVar;
            int i = koxVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                koxVar.k = i - Integer.MIN_VALUE;
            } else {
                koxVar = new kox(this, zjeVar);
            }
        } else {
            koxVar = new kox(this, zjeVar);
        }
        Object obj = koxVar.i;
        wne wneVar = wne.f39444a;
        int i2 = koxVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            jrs0 jrs0Var = this.b;
            koxVar.k = 1;
            if (jrs0Var.e(qpg0Var, koxVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        synchronized (this.f) {
        }
        return Unit.f46060a;
    }
}
