package a;

import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pej implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26856a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ l7m0 h;
    public final /* synthetic */ l7m0 i;
    public final /* synthetic */ l7m0 j;
    public final /* synthetic */ l7m0 k;
    public final /* synthetic */ l7m0 l;
    public final /* synthetic */ l7m0 m;

    public /* synthetic */ pej(o2s o2sVar, l7m0 l7m0Var, l7m0 l7m0Var2, j2s j2sVar, l7m0 l7m0Var3, l7m0 l7m0Var4, l7m0 l7m0Var5, l7m0 l7m0Var6, l7m0 l7m0Var7, l7m0 l7m0Var8, l7m0 l7m0Var9, l7m0 l7m0Var10) {
        this.f26856a = (byte) 2;
        this.b = o2sVar;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.f = j2sVar;
        this.g = l7m0Var3;
        this.h = l7m0Var4;
        this.i = l7m0Var5;
        this.j = l7m0Var6;
        this.k = l7m0Var7;
        this.l = l7m0Var8;
        this.m = l7m0Var9;
        this.e = l7m0Var10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26856a;
        l7m0 l7m0Var = this.k;
        l7m0 l7m0Var2 = this.j;
        l7m0 l7m0Var3 = this.i;
        l7m0 l7m0Var4 = this.h;
        l7m0 l7m0Var5 = this.g;
        l7m0 l7m0Var6 = this.d;
        l7m0 l7m0Var7 = this.c;
        Object obj3 = this.e;
        l7m0 l7m0Var8 = this.m;
        l7m0 l7m0Var9 = this.l;
        Object obj4 = this.f;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                pz40 pz40Var = (pz40) obj5;
                pz40 pz40Var2 = (pz40) l7m0Var7;
                pz40 pz40Var3 = (pz40) l7m0Var6;
                Calendar calendar = (Calendar) obj3;
                pz40 pz40Var4 = (pz40) obj4;
                pz40 pz40Var5 = (pz40) l7m0Var5;
                pz40 pz40Var6 = (pz40) l7m0Var4;
                pz40 pz40Var7 = (pz40) l7m0Var3;
                pz40 pz40Var8 = (pz40) l7m0Var2;
                pz40 pz40Var9 = (pz40) l7m0Var;
                pz40 pz40Var10 = (pz40) l7m0Var9;
                pz40 pz40Var11 = (pz40) l7m0Var8;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                if (((Boolean) pz40Var.getValue()).booleanValue() && pz40Var2.getValue() != ulq0.b) {
                    rsr0.c0(pz40Var, pz40Var2, calendar, pz40Var4, pz40Var5, pz40Var6, pz40Var3, pz40Var7, pz40Var8, pz40Var9, pz40Var10, pz40Var11, rsr0.j0((SimpleDateTime) pz40Var3.getValue(), iIntValue, iIntValue2));
                }
                break;
            case 1:
                pz40 pz40Var12 = (pz40) obj5;
                pz40 pz40Var13 = (pz40) l7m0Var7;
                pz40 pz40Var14 = (pz40) l7m0Var6;
                Calendar calendar2 = (Calendar) obj3;
                pz40 pz40Var15 = (pz40) obj4;
                pz40 pz40Var16 = (pz40) l7m0Var5;
                pz40 pz40Var17 = (pz40) l7m0Var4;
                pz40 pz40Var18 = (pz40) l7m0Var3;
                pz40 pz40Var19 = (pz40) l7m0Var2;
                pz40 pz40Var20 = (pz40) l7m0Var;
                pz40 pz40Var21 = (pz40) l7m0Var9;
                pz40 pz40Var22 = (pz40) l7m0Var8;
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                if (((Boolean) pz40Var12.getValue()).booleanValue() && pz40Var13.getValue() != ulq0.b) {
                    rsr0.b0(pz40Var12, pz40Var13, calendar2, pz40Var15, pz40Var16, pz40Var17, pz40Var14, pz40Var18, pz40Var19, pz40Var20, pz40Var21, pz40Var22, rsr0.j0((SimpleDateTime) pz40Var14.getValue(), iIntValue3, iIntValue4));
                }
                break;
            default:
                o2s o2sVar = (o2s) obj5;
                j2s j2sVar = (j2s) obj4;
                l7m0 l7m0Var10 = (l7m0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                xak xakVar = j2s.b2;
                byte b2 = 0;
                if (fetVar.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dub.E(o7k0.c, o2sVar, u1c.M(1634904518, new qe4(o2sVar, this.c, this.d, j2sVar, this.g, this.h, this.i, this.j, this.k), fetVar), u1c.M(-1219730117, new z1s(l7m0Var9, j2sVar, b2), fetVar), u1c.M(-1277921592, new v7i0(l7m0Var8, (byte) 28), fetVar), u1c.M(1560632649, new a2s(l7m0Var10, j2sVar, b2), fetVar), fetVar, 224646);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ pej(pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, Calendar calendar, pz40 pz40Var4, pz40 pz40Var5, pz40 pz40Var6, pz40 pz40Var7, pz40 pz40Var8, pz40 pz40Var9, pz40 pz40Var10, pz40 pz40Var11, byte b) {
        this.f26856a = b;
        this.b = pz40Var;
        this.c = pz40Var2;
        this.d = pz40Var3;
        this.e = calendar;
        this.f = pz40Var4;
        this.g = pz40Var5;
        this.h = pz40Var6;
        this.i = pz40Var7;
        this.j = pz40Var8;
        this.k = pz40Var9;
        this.l = pz40Var10;
        this.m = pz40Var11;
    }
}
