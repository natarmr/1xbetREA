package a;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class m7z implements c5n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k6z f21343a = k6z.b;
    public float b;
    public float c;
    public final /* synthetic */ r7z d;

    public m7z(r7z r7zVar) {
        this.d = r7zVar;
    }

    @Override // a.vj30
    public final uj30 D0(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            xcx.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new l7z(i, i2, map, function1, this, this.d, function2);
    }

    @Override // a.cnx
    public final boolean M() {
        a7z a7zVar = this.d.f30000a.i1.d;
        return a7zVar == a7z.d || a7zVar == a7z.b;
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.b;
    }

    @Override // a.cnx
    public final k6z getLayoutDirection() {
        return this.f21343a;
    }

    @Override // a.c5n0
    public final List k(Object obj, Function2 function2) {
        r7z r7zVar = this.d;
        r7zVar.i();
        e7z e7zVar = r7zVar.f30000a;
        a7z a7zVar = e7zVar.i1.d;
        a7z a7zVar2 = a7z.f398a;
        if (a7zVar != a7zVar2 && a7zVar != a7z.c && a7zVar != a7z.b && a7zVar != a7z.d) {
            xcx.b("subcompose can only be used inside the measure or layout blocks");
        }
        hz40 hz40Var = r7zVar.g;
        Object objG = hz40Var.g(obj);
        if (objG == null) {
            objG = (e7z) r7zVar.j.l(obj);
            if (objG != null) {
                if (r7zVar.o <= 0) {
                    xcx.b("Check failed.");
                }
                r7zVar.o--;
            } else {
                objG = r7zVar.o(obj);
                if (objG == null) {
                    int i = r7zVar.d;
                    e7z e7zVar2 = new e7z(2);
                    e7zVar.r = true;
                    e7zVar.C(i, e7zVar2);
                    e7zVar.r = false;
                    objG = e7zVar2;
                }
            }
            hz40Var.n(obj, objG);
        }
        e7z e7zVar3 = (e7z) objG;
        if (CollectionsKt.W(r7zVar.d, e7zVar.p()) != e7zVar3) {
            int i2 = ((xz40) ((ty40) e7zVar.p()).b).i(e7zVar3);
            if (i2 < r7zVar.d) {
                xcx.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = r7zVar.d;
            if (i3 != i2) {
                r7zVar.k(i2, i3);
            }
        }
        r7zVar.d++;
        r7zVar.n(e7zVar3, obj, false, function2);
        return (a7zVar == a7zVar2 || a7zVar == a7z.c) ? e7zVar3.n() : e7zVar3.m();
    }

    @Override // a.w6k
    public final float v0() {
        return this.c;
    }
}
