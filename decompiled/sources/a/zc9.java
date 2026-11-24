package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zc9 {
    public static final zc9 m = new zc9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sso f44156a;
    public final ijt b;
    public final ijt c;
    public final ijt d;
    public final ijt e;
    public final ijt f;
    public final ijt g;
    public final ijt h;
    public final ijt i;
    public final ijt j;
    public final ijt k;
    public final ijt l;

    public zc9() {
        sso ssoVarQ = tlb.q(yc9.f42375a);
        fd9.f9347a.getClass();
        ijt ijtVar = fd9.c;
        ijtVar.getClass();
        ijt ijtVar2 = fd9.b;
        ijtVar2.getClass();
        ijt ijtVar3 = fd9.d;
        ijtVar3.getClass();
        ijt ijtVar4 = fd9.e;
        ijtVar4.getClass();
        ijt ijtVar5 = fd9.f;
        ijtVar5.getClass();
        ijt ijtVar6 = fd9.g;
        ijtVar6.getClass();
        ijt ijtVar7 = fd9.i;
        ijtVar7.getClass();
        ijt ijtVar8 = fd9.h;
        ijtVar8.getClass();
        ijt ijtVar9 = fd9.j;
        ijtVar9.getClass();
        ijt ijtVar10 = fd9.k;
        ijtVar10.getClass();
        ijt ijtVar11 = fd9.l;
        ijtVar11.getClass();
        this.f44156a = ssoVarQ;
        this.b = ijtVar;
        this.c = ijtVar2;
        this.d = ijtVar3;
        this.e = ijtVar4;
        this.f = ijtVar5;
        this.g = ijtVar6;
        this.h = ijtVar7;
        this.i = ijtVar8;
        this.j = ijtVar9;
        this.k = ijtVar10;
        this.l = ijtVar11;
    }

    public static String a(swq swqVar) {
        String strB;
        swqVar.getClass();
        twq twqVar = swqVar.f32934a;
        StringBuilder sb = new StringBuilder(kotlin.text.c.s(twqVar.f34663a, '.', '/'));
        sb.append('/');
        if (twqVar.c()) {
            strB = "default-package";
        } else {
            strB = twqVar.g().b();
            strB.getClass();
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
