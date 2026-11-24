package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class l7z implements uj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19583a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ m7z e;
    public final /* synthetic */ r7z f;
    public final /* synthetic */ Function1 g;

    public l7z(int i, int i2, Map map, Function1 function1, m7z m7zVar, r7z r7zVar, Function1 function2) {
        this.f19583a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
        this.e = m7zVar;
        this.f = r7zVar;
        this.g = function2;
    }

    @Override // a.uj30
    public final Map a() {
        return this.c;
    }

    @Override // a.uj30
    public final void b() {
        qdx qdxVar;
        e7z e7zVar = this.f.f30000a;
        boolean zM = this.e.M();
        Function1 function1 = this.g;
        if (!zM || (qdxVar = ((rdx) e7zVar.h1.d).E1) == null) {
            function1.invoke(((rdx) e7zVar.h1.d).p);
        } else {
            function1.invoke(qdxVar.p);
        }
    }

    @Override // a.uj30
    public final Function1 e() {
        return this.d;
    }

    @Override // a.uj30
    public final int f() {
        return this.b;
    }

    @Override // a.uj30
    public final int j() {
        return this.f19583a;
    }
}
