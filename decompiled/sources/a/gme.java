package a;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gme implements c930 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11539a;

    public /* synthetic */ gme(byte b) {
        this.f11539a = b;
    }

    @Override // a.c930
    public final void a(dgu dguVar, b4e b4eVar) {
        boolean z = false;
        int i = 0;
        z = false;
        switch (this.f11539a) {
            case 0:
                b4e b4eVar2 = (saq0) b4eVar;
                dguVar.e();
                int iA = dguVar.A();
                ((xmk0) dguVar.c).a((char) 160);
                dguVar.G(b4eVar2, iA);
                dguVar.b(b4eVar2);
                break;
            case 1:
                etv etvVar = (etv) b4eVar;
                dguVar.e();
                int iA2 = dguVar.A();
                dguVar.I(etvVar);
                ((ljf0) dguVar.b).e(uc9.q, Integer.valueOf(etvVar.g));
                dguVar.G(etvVar, iA2);
                dguVar.b(etvVar);
                break;
            case 2:
                ((xmk0) dguVar.c).a(' ');
                break;
            case 3:
                dguVar.e();
                break;
            case 4:
                b4e b4eVar3 = (un80) b4eVar;
                p78 p78Var = (p78) ((b4e) b4eVar3.b);
                if (p78Var != null) {
                    p78 p78Var2 = (p78) ((b4e) p78Var.b);
                    if (p78Var2 instanceof gc00) {
                        z = ((gc00) p78Var2).g;
                    }
                }
                if (!z) {
                    dguVar.e();
                }
                int iA3 = dguVar.A();
                dguVar.I(b4eVar3);
                ((ljf0) dguVar.b).e(uc9.s, Boolean.valueOf(z));
                dguVar.G(b4eVar3, iA3);
                if (!z) {
                    dguVar.b(b4eVar3);
                }
                break;
            case 5:
                hb00 hb00Var = (hb00) b4eVar;
                int iA4 = dguVar.A();
                dguVar.I(hb00Var);
                ((ljf0) dguVar.b).e(uc9.r, hb00Var.g);
                dguVar.G(hb00Var, iA4);
                break;
            case 6:
                b4e b4eVar4 = (ztm0) b4eVar;
                int iA5 = dguVar.A();
                dguVar.I(b4eVar4);
                dguVar.G(b4eVar4, iA5);
                break;
            case 7:
                b4e b4eVar5 = (ktn) b4eVar;
                int iA6 = dguVar.A();
                dguVar.I(b4eVar5);
                dguVar.G(b4eVar5, iA6);
                break;
            case 8:
                b4e b4eVar6 = (d98) b4eVar;
                dguVar.e();
                int iA7 = dguVar.A();
                dguVar.I(b4eVar6);
                dguVar.G(b4eVar6, iA7);
                dguVar.b(b4eVar6);
                break;
            case 9:
                vxc vxcVar = (vxc) b4eVar;
                int iA8 = dguVar.A();
                xmk0 xmk0Var = (xmk0) dguVar.c;
                StringBuilder sb = xmk0Var.f41130a;
                sb.append((char) 160);
                sb.append(vxcVar.g);
                xmk0Var.a((char) 160);
                dguVar.G(vxcVar, iA8);
                break;
            case 10:
                hpp hppVar = (hpp) b4eVar;
                ime.f(dguVar, hppVar.j, hppVar.k, hppVar);
                break;
            case 11:
                c5x c5xVar = (c5x) b4eVar;
                ime.f(dguVar, null, c5xVar.g, c5xVar);
                break;
            case 12:
                xmk0 xmk0Var2 = (xmk0) dguVar.c;
                cyw cywVar = (cyw) b4eVar;
                w5z w5zVar = (w5z) dguVar.f6058a;
                j98 j98Var = (j98) ((Map) ((pv00) w5zVar.e).f27640a).get(cyw.class);
                if (j98Var == null) {
                    dguVar.I(cywVar);
                    break;
                } else {
                    int iA9 = dguVar.A();
                    dguVar.I(cywVar);
                    if (iA9 == dguVar.A()) {
                        xmk0Var2.a((char) 65532);
                    }
                    boolean z2 = ((b4e) cywVar.b) instanceof hb00;
                    gst gstVar = (gst) w5zVar.d;
                    String str = cywVar.g;
                    gstVar.getClass();
                    ljf0 ljf0Var = (ljf0) dguVar.b;
                    ljf0Var.e(jd8.k, str);
                    ljf0Var.e(jd8.l, Boolean.valueOf(z2));
                    ljf0Var.e(jd8.m, null);
                    Object objA = j98Var.a(w5zVar, ljf0Var);
                    StringBuilder sb2 = xmk0Var2.f41130a;
                    int length = sb2.length();
                    int length2 = sb2.length();
                    if (length > iA9 && iA9 >= 0 && length <= length2) {
                        xmk0.c(xmk0Var2, objA, iA9, length);
                        break;
                    }
                }
                break;
            case 13:
                b4e b4eVar7 = (hd00) b4eVar;
                zzc0 zzc0Var = uc9.n;
                int iA10 = dguVar.A();
                ljf0 ljf0Var2 = (ljf0) dguVar.b;
                dguVar.I(b4eVar7);
                p78 p78Var3 = (p78) ((b4e) b4eVar7.b);
                if (p78Var3 instanceof ba80) {
                    ba80 ba80Var = (ba80) p78Var3;
                    int i2 = ba80Var.h;
                    ljf0Var2.e(zzc0Var, jme.b);
                    ljf0Var2.e(uc9.p, Integer.valueOf(i2));
                    ba80Var.h++;
                } else {
                    ljf0Var2.e(zzc0Var, jme.f16760a);
                    zzc0 zzc0Var2 = uc9.o;
                    for (b4e b4eVarC = (p78) ((b4e) b4eVar7.b); b4eVarC != null; b4eVarC = b4eVarC.c()) {
                        if (b4eVarC instanceof hd00) {
                            i++;
                        }
                    }
                    ljf0Var2.e(zzc0Var2, Integer.valueOf(i));
                }
                dguVar.G(b4eVar7, iA10);
                if (((b4e) b4eVar7.f) != null) {
                    dguVar.e();
                }
                break;
            case 14:
                dguVar.e();
                int iA11 = dguVar.A();
                dguVar.I(b4eVar);
                dguVar.G(b4eVar, iA11);
                dguVar.b(b4eVar);
                break;
            default:
                b4e b4eVar8 = (csm0) b4eVar;
                int iA12 = dguVar.A();
                dguVar.I(b4eVar8);
                dguVar.G(b4eVar8, iA12);
                break;
        }
    }
}
