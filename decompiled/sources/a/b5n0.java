package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class b5n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5n0 f2011a;
    public r7z b;
    public final y4n0 c;
    public final y4n0 d;
    public final y4n0 e;

    /* JADX WARN: Type inference failed for: r2v1, types: [a.y4n0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.y4n0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.y4n0] */
    public b5n0(e5n0 e5n0Var) {
        this.f2011a = e5n0Var;
        final byte b = 0;
        this.c = new Function2(this) { // from class: a.y4n0
            public final /* synthetic */ b5n0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                b5n0 b5n0Var = this.b;
                switch (b2) {
                    case 0:
                        e5n0 e5n0Var2 = b5n0Var.f2011a;
                        e7z e7zVar = (e7z) obj;
                        r7z r7zVar = e7zVar.j1;
                        if (r7zVar == null) {
                            r7zVar = new r7z(e7zVar, e5n0Var2);
                            e7zVar.j1 = r7zVar;
                        }
                        b5n0Var.b = r7zVar;
                        b5n0Var.a().i();
                        r7z r7zVarA = b5n0Var.a();
                        if (r7zVarA.c != e5n0Var2) {
                            r7zVarA.c = e5n0Var2;
                            r7zVarA.j(false);
                            e7z.W(r7zVarA.f30000a, false, 7);
                        }
                        break;
                    case 1:
                        b5n0Var.a().b = (nld) obj2;
                        break;
                    default:
                        r7z r7zVarA2 = b5n0Var.a();
                        ((e7z) obj).d0(new o7z(r7zVarA2, (Function2) obj2, r7zVarA2.p));
                        break;
                }
                return Unit.f46060a;
            }
        };
        final byte b2 = 1;
        this.d = new Function2(this) { // from class: a.y4n0
            public final /* synthetic */ b5n0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                b5n0 b5n0Var = this.b;
                switch (b3) {
                    case 0:
                        e5n0 e5n0Var2 = b5n0Var.f2011a;
                        e7z e7zVar = (e7z) obj;
                        r7z r7zVar = e7zVar.j1;
                        if (r7zVar == null) {
                            r7zVar = new r7z(e7zVar, e5n0Var2);
                            e7zVar.j1 = r7zVar;
                        }
                        b5n0Var.b = r7zVar;
                        b5n0Var.a().i();
                        r7z r7zVarA = b5n0Var.a();
                        if (r7zVarA.c != e5n0Var2) {
                            r7zVarA.c = e5n0Var2;
                            r7zVarA.j(false);
                            e7z.W(r7zVarA.f30000a, false, 7);
                        }
                        break;
                    case 1:
                        b5n0Var.a().b = (nld) obj2;
                        break;
                    default:
                        r7z r7zVarA2 = b5n0Var.a();
                        ((e7z) obj).d0(new o7z(r7zVarA2, (Function2) obj2, r7zVarA2.p));
                        break;
                }
                return Unit.f46060a;
            }
        };
        final byte b3 = 2;
        this.e = new Function2(this) { // from class: a.y4n0
            public final /* synthetic */ b5n0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b4 = b3;
                b5n0 b5n0Var = this.b;
                switch (b4) {
                    case 0:
                        e5n0 e5n0Var2 = b5n0Var.f2011a;
                        e7z e7zVar = (e7z) obj;
                        r7z r7zVar = e7zVar.j1;
                        if (r7zVar == null) {
                            r7zVar = new r7z(e7zVar, e5n0Var2);
                            e7zVar.j1 = r7zVar;
                        }
                        b5n0Var.b = r7zVar;
                        b5n0Var.a().i();
                        r7z r7zVarA = b5n0Var.a();
                        if (r7zVarA.c != e5n0Var2) {
                            r7zVarA.c = e5n0Var2;
                            r7zVarA.j(false);
                            e7z.W(r7zVarA.f30000a, false, 7);
                        }
                        break;
                    case 1:
                        b5n0Var.a().b = (nld) obj2;
                        break;
                    default:
                        r7z r7zVarA2 = b5n0Var.a();
                        ((e7z) obj).d0(new o7z(r7zVarA2, (Function2) obj2, r7zVarA2.p));
                        break;
                }
                return Unit.f46060a;
            }
        };
    }

    public final r7z a() {
        r7z r7zVar = this.b;
        if (r7zVar != null) {
            return r7zVar;
        }
        jf4.o("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
