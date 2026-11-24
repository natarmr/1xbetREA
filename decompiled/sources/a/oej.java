package a;

import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oej implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25125a = 1;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ pz40 e;
    public final /* synthetic */ pz40 f;
    public final /* synthetic */ pz40 g;
    public final /* synthetic */ Calendar h;
    public final /* synthetic */ pz40 i;
    public final /* synthetic */ pz40 j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ pz40 l;
    public final /* synthetic */ pz40 m;

    public /* synthetic */ oej(pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, pz40 pz40Var5, pz40 pz40Var6, Calendar calendar, pz40 pz40Var7, pz40 pz40Var8, pz40 pz40Var9, pz40 pz40Var10, pz40 pz40Var11) {
        this.b = pz40Var;
        this.c = pz40Var2;
        this.d = pz40Var3;
        this.e = pz40Var4;
        this.f = pz40Var5;
        this.g = pz40Var6;
        this.h = calendar;
        this.i = pz40Var7;
        this.j = pz40Var8;
        this.k = pz40Var9;
        this.l = pz40Var10;
        this.m = pz40Var11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25125a) {
            case 0:
                SimpleDate simpleDate = (SimpleDate) obj;
                simpleDate.getClass();
                pz40 pz40Var = this.b;
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    pz40 pz40Var2 = this.c;
                    SimpleDateTime simpleDateTime = (SimpleDateTime) pz40Var2.getValue();
                    pz40 pz40Var3 = this.d;
                    SimpleDate simpleDateV = bsr0.V(simpleDate, simpleDateTime.f47285a, ((SimpleDateTime) pz40Var3.getValue()).f47285a);
                    pz40 pz40Var4 = this.e;
                    SimpleDateTime simpleDateTime2 = (SimpleDateTime) pz40Var4.getValue();
                    simpleDateTime2.getClass();
                    rsr0.c0(pz40Var, this.f, this.h, this.g, this.i, this.j, pz40Var4, this.k, this.l, pz40Var2, pz40Var3, this.m, SimpleDateTime.a(simpleDateTime2, simpleDateV, null, 2));
                }
                break;
            default:
                SimpleDate simpleDate2 = (SimpleDate) obj;
                simpleDate2.getClass();
                pz40 pz40Var5 = this.b;
                if (((Boolean) pz40Var5.getValue()).booleanValue()) {
                    pz40 pz40Var6 = this.c;
                    SimpleDateTime simpleDateTime3 = (SimpleDateTime) pz40Var6.getValue();
                    pz40 pz40Var7 = this.d;
                    SimpleDateTime simpleDateTime4 = (SimpleDateTime) pz40Var7.getValue();
                    pz40 pz40Var8 = this.e;
                    SimpleDate simpleDateV2 = bsr0.V(simpleDate2, bsr0.V(((SimpleDateTime) pz40Var8.getValue()).f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a), simpleDateTime4.f47285a);
                    pz40 pz40Var9 = this.f;
                    SimpleDateTime simpleDateTime5 = (SimpleDateTime) pz40Var9.getValue();
                    simpleDateTime5.getClass();
                    rsr0.b0(pz40Var5, this.g, this.h, this.i, this.j, pz40Var8, pz40Var9, this.k, pz40Var6, pz40Var7, this.l, this.m, SimpleDateTime.a(simpleDateTime5, simpleDateV2, null, 2));
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ oej(pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4, pz40 pz40Var5, Calendar calendar, pz40 pz40Var6, pz40 pz40Var7, pz40 pz40Var8, pz40 pz40Var9, pz40 pz40Var10, pz40 pz40Var11) {
        this.b = pz40Var;
        this.c = pz40Var2;
        this.d = pz40Var3;
        this.e = pz40Var4;
        this.f = pz40Var5;
        this.h = calendar;
        this.g = pz40Var6;
        this.i = pz40Var7;
        this.j = pz40Var8;
        this.k = pz40Var9;
        this.l = pz40Var10;
        this.m = pz40Var11;
    }
}
