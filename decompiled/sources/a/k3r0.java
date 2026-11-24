package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class k3r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k050 f17634a = new k050();
    public List b = iun.f15405a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        i3r0 i3r0Var;
        k050 k050Var;
        if (zjeVar instanceof i3r0) {
            i3r0Var = (i3r0) zjeVar;
            int i = i3r0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                i3r0Var.l = i - Integer.MIN_VALUE;
            } else {
                i3r0Var = new i3r0(this, zjeVar);
            }
        } else {
            i3r0Var = new i3r0(this, zjeVar);
        }
        Object obj = i3r0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = i3r0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.f17634a;
            i3r0Var.i = k050Var2;
            i3r0Var.l = 1;
            if (k050Var2.d(i3r0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = i3r0Var.i;
            z1x.P(obj);
        }
        try {
            return this.b;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List list, zje zjeVar) {
        j3r0 j3r0Var;
        k050 k050Var;
        if (zjeVar instanceof j3r0) {
            j3r0Var = (j3r0) zjeVar;
            int i = j3r0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                j3r0Var.m = i - Integer.MIN_VALUE;
            } else {
                j3r0Var = new j3r0(this, zjeVar);
            }
        } else {
            j3r0Var = new j3r0(this, zjeVar);
        }
        Object obj = j3r0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = j3r0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            j3r0Var.i = list;
            k050Var = this.f17634a;
            j3r0Var.j = k050Var;
            j3r0Var.m = 1;
            if (k050Var.d(j3r0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = j3r0Var.j;
            List list2 = j3r0Var.i;
            z1x.P(obj);
            k050Var = k050Var2;
            list = list2;
        }
        try {
            this.b = list;
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }
}
