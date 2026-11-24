package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lw7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20750a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ lw7(int i, pu90 pu90Var, pu90 pu90Var2, int i2, int i3, byte b) {
        this.f20750a = b;
        this.c = i;
        this.b = pu90Var;
        this.d = pu90Var2;
        this.e = i2;
        this.f = i3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20750a;
        int i = this.f;
        int i2 = this.e;
        int i3 = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                pu90 pu90Var = (pu90) obj3;
                pu90 pu90Var2 = (pu90) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                ou90Var.m(pu90Var, i3, i2, 0.0f);
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, i3 + pu90Var.f27604a + i, i2, 0.0f);
                }
                break;
            case 1:
                pu90 pu90Var3 = (pu90) obj2;
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                ou90Var2.m((pu90) obj3, 0, i3, 0.0f);
                ou90Var2.m(pu90Var3, i2 - pu90Var3.f27604a, i, 0.0f);
                break;
            case 2:
                pu90 pu90Var4 = (pu90) obj3;
                pu90 pu90Var5 = (pu90) obj2;
                ou90 ou90Var3 = (ou90) obj;
                ou90Var3.getClass();
                ou90Var3.m(pu90Var4, 0, (i3 - pu90Var4.b) / 2, 0.0f);
                if (pu90Var5 != null) {
                    int i4 = pu90Var4.f27604a + i2;
                    int i5 = i - pu90Var5.f27604a;
                    if (i4 > i5) {
                        i4 = i5;
                    }
                    ou90Var3.m(pu90Var5, i4, (i3 - pu90Var5.b) / 2, 0.0f);
                }
                break;
            case 3:
                pu90 pu90Var6 = (pu90) obj3;
                pu90 pu90Var7 = (pu90) obj2;
                ou90 ou90Var4 = (ou90) obj;
                ou90Var4.getClass();
                ou90Var4.m(pu90Var6, 0, (i3 - pu90Var6.b) / 2, 0.0f);
                if (pu90Var7 != null) {
                    int i6 = pu90Var6.f27604a + i2;
                    int i7 = i - pu90Var7.f27604a;
                    if (i6 > i7) {
                        i6 = i7;
                    }
                    ou90Var4.m(pu90Var7, i6, (i3 - pu90Var7.b) / 2, 0.0f);
                }
                break;
            case 4:
                pu90 pu90Var8 = (pu90) obj3;
                pu90 pu90Var9 = (pu90) obj2;
                ou90 ou90Var5 = (ou90) obj;
                ou90Var5.getClass();
                ou90Var5.m(pu90Var8, 0, (i3 - pu90Var8.b) / 2, 0.0f);
                if (pu90Var9 != null) {
                    int i8 = pu90Var8.f27604a + i2;
                    int i9 = i - pu90Var9.f27604a;
                    if (i8 > i9) {
                        i8 = i9;
                    }
                    ou90Var5.m(pu90Var9, i8, (i3 - pu90Var9.b) / 2, 0.0f);
                }
                break;
            case 5:
                pu90 pu90Var10 = (pu90) obj3;
                pu90 pu90Var11 = (pu90) obj2;
                ou90 ou90Var6 = (ou90) obj;
                ou90Var6.getClass();
                if (pu90Var10 != null) {
                    ou90Var6.m(pu90Var10, i3, (i2 - pu90Var10.b) / 2, 0.0f);
                }
                if (pu90Var11 != null) {
                    ou90Var6.m(pu90Var11, (i - pu90Var11.f27604a) - i3, (i2 - pu90Var11.b) / 2, 0.0f);
                }
                break;
            case 6:
                pu90 pu90Var12 = (pu90) obj3;
                pu90 pu90Var13 = (pu90) obj2;
                ou90 ou90Var7 = (ou90) obj;
                ou90Var7.getClass();
                if (pu90Var12 != null) {
                    ou90Var7.m(pu90Var12, 0, i3 / 2, 0.0f);
                }
                if (pu90Var13 != null) {
                    ou90Var7.m(pu90Var13, i2 - pu90Var13.f27604a, i / 2, 0.0f);
                }
                break;
            case 7:
                pu90 pu90Var14 = (pu90) obj3;
                pu90 pu90Var15 = (pu90) obj2;
                ou90 ou90Var8 = (ou90) obj;
                ou90Var8.getClass();
                if (pu90Var14 != null) {
                    ou90Var8.m(pu90Var14, 0, i3 / 2, 0.0f);
                }
                if (pu90Var15 != null) {
                    ou90Var8.m(pu90Var15, i2 - pu90Var15.f27604a, i / 2, 0.0f);
                }
                break;
            case 8:
                pu90 pu90Var16 = (pu90) obj3;
                pu90 pu90Var17 = (pu90) obj2;
                ou90 ou90Var9 = (ou90) obj;
                ou90Var9.getClass();
                ou90Var9.m(pu90Var16, 0, (i - pu90Var16.b) / 2, 0.0f);
                if (pu90Var17 != null) {
                    ou90Var9.m(pu90Var17, i3 - i2, (i - pu90Var17.b) / 2, 0.0f);
                }
                break;
            default:
                ou90 ou90Var10 = (ou90) obj;
                ou90Var10.getClass();
                int iL = ((cgk0) obj3).l();
                for (pu90 pu90Var18 : (ArrayList) obj2) {
                    Object objN = pu90Var18.n();
                    iaj iajVar = objN instanceof iaj ? (iaj) objN : null;
                    String str = iajVar != null ? iajVar.b : null;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case 543708287:
                                if (str.equals("TOOLBAR_ID")) {
                                    ou90Var10.m(pu90Var18, 0, iL, 0.0f);
                                    iL += pu90Var18.b;
                                }
                                break;
                            case 749675201:
                                if (str.equals("CONTENT_ID")) {
                                    ou90Var10.m(pu90Var18, 0, iL, 0.0f);
                                }
                                break;
                            case 1222669772:
                                if (str.equals("BACKGROUND_ID")) {
                                    ou90Var10.m(pu90Var18, 0, 0, 0.0f);
                                }
                                break;
                            case 1603285699:
                                if (str.equals("MARKETS_ID")) {
                                    ou90Var10.m(pu90Var18, 0, (i3 - i2) - i, 0.0f);
                                }
                                break;
                        }
                    }
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lw7(pu90 pu90Var, int i, int i2, pu90 pu90Var2, int i3, byte b) {
        this.f20750a = b;
        this.b = pu90Var;
        this.c = i;
        this.e = i2;
        this.d = pu90Var2;
        this.f = i3;
    }

    public /* synthetic */ lw7(pu90 pu90Var, int i, pu90 pu90Var2, int i2, int i3, byte b) {
        this.f20750a = b;
        this.b = pu90Var;
        this.c = i;
        this.d = pu90Var2;
        this.e = i2;
        this.f = i3;
    }

    public /* synthetic */ lw7(Object obj, Object obj2, int i, int i2, int i3, byte b) {
        this.f20750a = b;
        this.b = obj;
        this.d = obj2;
        this.c = i;
        this.e = i2;
        this.f = i3;
    }
}
