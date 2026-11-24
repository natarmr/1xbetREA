package a;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eyw implements vii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8646a;
    public final /* synthetic */ fot0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eyw(fot0 fot0Var, Object obj, byte b) {
        this.f8646a = b;
        this.b = fot0Var;
        this.c = obj;
    }

    @Override // a.vii0
    public final void a(xii0 xii0Var) {
        byte b = this.f8646a;
        Object obj = this.c;
        fot0 fot0Var = this.b;
        switch (b) {
            case 0:
                jyw jywVar = (jyw) fot0Var;
                kyw kywVar = (kyw) obj;
                if (jywVar.d() != null) {
                    ofm0.m();
                    uii0 uii0Var = jywVar.x;
                    if (uii0Var != null) {
                        uii0Var.b();
                        jywVar.x = null;
                    }
                    o3x o3xVar = jywVar.w;
                    if (o3xVar != null) {
                        o3xVar.a();
                        jywVar.w = null;
                    }
                    kywVar.c();
                    jywVar.f();
                    myw mywVar = (myw) jywVar.i;
                    h55 h55Var = jywVar.j;
                    h55Var.getClass();
                    tii0 tii0VarG = jywVar.G(mywVar, h55Var);
                    jywVar.v = tii0VarG;
                    Object[] objArr = {tii0VarG.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    jywVar.E(Collections.unmodifiableList(arrayList));
                    jywVar.r();
                    break;
                }
                break;
            default:
                ae40 ae40Var = (ae40) fot0Var;
                xii0Var.getClass();
                ae40Var.E(kotlin.collections.a.c(ae40Var.H((Size) obj).c()));
                ae40Var.r();
                break;
        }
    }
}
