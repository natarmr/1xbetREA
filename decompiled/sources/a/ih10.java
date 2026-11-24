package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14759a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ ih10(float f, float f2, byte b) {
        this.f14759a = b;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14759a;
        byte b2 = 16;
        byte b3 = 12;
        byte b4 = 13;
        float f = this.c;
        float f2 = this.b;
        switch (b) {
            case 0:
                z3e z3eVar = (z3e) obj;
                z3eVar.getClass();
                u2e u2eVar = new u2e("BASE_CONTENT_ID");
                u2e u2eVar2 = new u2e("CONTENT_ID");
                z3eVar.c(u2eVar, new ih10(f2, f, (byte) 3));
                z3eVar.c(u2eVar2, new bb3(u2eVar, f, (byte) 9));
                break;
            case 1:
                z3e z3eVar2 = (z3e) obj;
                z3eVar2.getClass();
                u2e u2eVar3 = new u2e("BASE_CONTENT_ID");
                u2e u2eVar4 = new u2e("CONTENT_ID");
                z3eVar2.c(u2eVar3, new ih10(f2, f, (byte) 2));
                z3eVar2.c(u2eVar4, new bb3(u2eVar3, f, (byte) 10));
                break;
            case 2:
                t2e t2eVar = (t2e) obj;
                t2eVar.getClass();
                t2eVar.c(new wmk(new ycl(f2 + f), null));
                break;
            case 3:
                t2e t2eVar2 = (t2e) obj;
                t2eVar2.getClass();
                t2eVar2.c(new wmk(new ycl(f2 + f), null));
                break;
            case 4:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.v(f2);
                uag0Var.b(f);
                break;
            case 5:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.w(f2);
                uag0Var2.y(f2);
                uag0Var2.H(f);
                break;
            case 6:
                uag0 uag0Var3 = (uag0) obj;
                uag0Var3.getClass();
                uag0Var3.w(f2);
                uag0Var3.I(f);
                break;
            case 7:
                t2e t2eVar3 = (t2e) obj;
                t2eVar3.getClass();
                t2eVar3.c(new wmk(new ycl(f2 + f), null));
                break;
            case 8:
                t2e t2eVar4 = (t2e) obj;
                t2eVar4.getClass();
                t2eVar4.c(new wmk(new ycl(f2 + f), null));
                break;
            case 9:
                z3e z3eVar3 = (z3e) obj;
                z3eVar3.getClass();
                u2e u2eVar5 = new u2e(jt40.f17082a);
                u2e u2eVar6 = new u2e(jt40.b);
                u2e u2eVar7 = new u2e(jt40.c);
                z3eVar3.c(u2eVar5, new ih10(f2, f, (byte) 8));
                z3eVar3.c(u2eVar6, new ab3(u2eVar5, (byte) 11));
                z3eVar3.c(u2eVar7, new bb3(u2eVar5, f, (byte) 12));
                break;
            case 10:
                z3e z3eVar4 = (z3e) obj;
                z3eVar4.getClass();
                u2e u2eVar8 = new u2e(jt40.f17082a);
                u2e u2eVar9 = new u2e(jt40.b);
                u2e u2eVar10 = new u2e(jt40.c);
                z3eVar4.c(u2eVar8, new ih10(f2, f, (byte) 7));
                z3eVar4.c(u2eVar9, new ab3(u2eVar8, (byte) 10));
                z3eVar4.c(u2eVar10, new bb3(u2eVar8, f, (byte) 11));
                break;
            case 11:
                z3e z3eVar5 = (z3e) obj;
                z3eVar5.getClass();
                z3eVar5.c(new u2e("CONTENT_ID"), new ih10(f2, f, b3));
                break;
            case 12:
                t2e t2eVar5 = (t2e) obj;
                t2eVar5.getClass();
                t2eVar5.c(new wmk(new ycl(f2 - f), null));
                t2eVar5.d(ouu0.b);
                break;
            case 13:
                t2e t2eVar6 = (t2e) obj;
                t2eVar6.getClass();
                t2eVar6.c(new wmk(new ycl(f2 + f), null));
                break;
            case 14:
                z3e z3eVar6 = (z3e) obj;
                z3eVar6.getClass();
                u2e u2eVar11 = new u2e(ft40.f10093a);
                u2e u2eVar12 = new u2e(ft40.b);
                u2e u2eVar13 = new u2e(ft40.c);
                z3eVar6.c(u2eVar11, new ih10(f2, f, b2));
                z3eVar6.c(u2eVar12, new ab3(u2eVar11, (byte) 13));
                z3eVar6.c(u2eVar13, new bb3(u2eVar11, f, (byte) 13));
                break;
            case 15:
                z3e z3eVar7 = (z3e) obj;
                z3eVar7.getClass();
                u2e u2eVar14 = new u2e(ft40.f10093a);
                u2e u2eVar15 = new u2e(ft40.b);
                u2e u2eVar16 = new u2e(ft40.c);
                z3eVar7.c(u2eVar14, new ih10(f2, f, b4));
                z3eVar7.c(u2eVar15, new ab3(u2eVar14, (byte) 12));
                z3eVar7.c(u2eVar16, new bb3(u2eVar14, f, (byte) 14));
                break;
            case 16:
                t2e t2eVar7 = (t2e) obj;
                t2eVar7.getClass();
                t2eVar7.c(new wmk(new ycl(f2 + f), null));
                break;
            case 17:
                t2e t2eVar8 = (t2e) obj;
                t2eVar8.getClass();
                t2eVar8.c(new wmk(new ycl(f2 + f), null));
                break;
            case 18:
                t2e t2eVar9 = (t2e) obj;
                t2eVar9.getClass();
                t2eVar9.c(new wmk(new ycl(f2 + f), null));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                z3e z3eVar8 = (z3e) obj;
                z3eVar8.getClass();
                u2e u2eVar17 = new u2e(kt40.f18846a);
                u2e u2eVar18 = new u2e(kt40.b);
                u2e u2eVar19 = new u2e(kt40.c);
                z3eVar8.c(u2eVar17, new ih10(f2, f, (byte) 18));
                z3eVar8.c(u2eVar18, new ab3(u2eVar19, (byte) 15));
                z3eVar8.c(u2eVar19, new bb3(u2eVar17, f, (byte) 16));
                break;
            default:
                z3e z3eVar9 = (z3e) obj;
                z3eVar9.getClass();
                u2e u2eVar20 = new u2e(kt40.f18846a);
                u2e u2eVar21 = new u2e(kt40.b);
                u2e u2eVar22 = new u2e(kt40.c);
                z3eVar9.c(u2eVar20, new ih10(f2, f, (byte) 17));
                z3eVar9.c(u2eVar21, new ab3(u2eVar22, (byte) 14));
                z3eVar9.c(u2eVar22, new bb3(u2eVar20, f, (byte) 15));
                break;
        }
        return Unit.f46060a;
    }
}
