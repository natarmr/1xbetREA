package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class axi0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1627a;
    public final /* synthetic */ iqt b;
    public final /* synthetic */ ubu c;
    public final /* synthetic */ ctf0 d;
    public final /* synthetic */ pru e;
    public final /* synthetic */ bzt f;
    public final /* synthetic */ czt g;
    public final /* synthetic */ lbu h;
    public final /* synthetic */ sqx i;
    public final /* synthetic */ ivn j;
    public final /* synthetic */ zyt k;
    public final /* synthetic */ yzn0 l;
    public final /* synthetic */ qho m;
    public final /* synthetic */ epc n;

    public /* synthetic */ axi0(iqt iqtVar, ubu ubuVar, ctf0 ctf0Var, pru pruVar, bzt bztVar, czt cztVar, lbu lbuVar, sqx sqxVar, ivn ivnVar, zyt zytVar, rqt rqtVar, rqt rqtVar2, yzn0 yzn0Var, qho qhoVar, epc epcVar, tqt tqtVar, byte b) {
        this.f1627a = b;
        this.b = iqtVar;
        this.c = ubuVar;
        this.d = ctf0Var;
        this.e = pruVar;
        this.f = bztVar;
        this.g = cztVar;
        this.h = lbuVar;
        this.i = sqxVar;
        this.j = ivnVar;
        this.k = zytVar;
        this.l = yzn0Var;
        this.m = qhoVar;
        this.n = epcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1627a;
        epc epcVar = this.n;
        qho qhoVar = this.m;
        yzn0 yzn0Var = this.l;
        zyt zytVar = this.k;
        ivn ivnVar = this.j;
        sqx sqxVar = this.i;
        lbu lbuVar = this.h;
        czt cztVar = this.g;
        bzt bztVar = this.f;
        pru pruVar = this.e;
        ctf0 ctf0Var = this.d;
        ubu ubuVar = this.c;
        iqt iqtVar = this.b;
        switch (b) {
            case 0:
                boolean zA = iqtVar.f15225a.a();
                boolean zA2 = ubuVar.a();
                String strA = ctf0Var.b.a(R.string.settings, Arrays.copyOf(new Object[0], 0));
                sff0 sff0VarA = pruVar.a();
                v8d v8dVarA = bztVar.f3488a.a();
                k0j0 k0j0VarB = cztVar.f5239a.b();
                boolean zJ = lbuVar.j();
                sqxVar.a();
                String strL = ivnVar.l();
                int iA = zytVar.a();
                iun iunVar = iun.f15405a;
                boolean zM = yzn0Var.m();
                int iB = qhoVar.b(R.drawable.ic_glyph_circle_profile);
                boolean z = epcVar.a().f13512a;
                v8dVarA.getClass();
                k0j0VarB.getClass();
                iunVar.getClass();
                return new twi0(false, true, zA, "", strA, "", "", "", "", iunVar, null, false, false, mrh0.b, null, false, false, false, false, false, zA2, false, true, "", false, false, false, true, sff0VarA.e0, sff0VarA.g.r, sff0VarA.O, sff0VarA.N.i, sff0VarA.r0, sff0VarA, v8dVarA, k0j0VarB, zJ, strL, iA, iunVar, zM, iB, false, false, 1, z);
            default:
                boolean zA3 = iqtVar.f15225a.a();
                boolean zA4 = ubuVar.a();
                String strA2 = ctf0Var.b.a(R.string.settings, Arrays.copyOf(new Object[0], 0));
                sff0 sff0VarA2 = pruVar.a();
                v8d v8dVarA2 = bztVar.f3488a.a();
                k0j0 k0j0VarB2 = cztVar.f5239a.b();
                boolean zJ2 = lbuVar.j();
                sqxVar.a();
                String strL2 = ivnVar.l();
                int iA2 = zytVar.a();
                iun iunVar2 = iun.f15405a;
                boolean zM2 = yzn0Var.m();
                int iB2 = qhoVar.b(R.drawable.ic_glyph_circle_profile);
                boolean z2 = epcVar.a().f13512a;
                v8dVarA2.getClass();
                k0j0VarB2.getClass();
                iunVar2.getClass();
                return new tcj0(false, true, zA3, "", strA2, "", "", "", "", false, null, false, false, mrh0.b, null, false, false, false, false, false, zA4, false, true, "", false, false, false, false, sff0VarA2.e0, sff0VarA2.g.r, sff0VarA2.O, sff0VarA2.N.i, sff0VarA2.r0, sff0VarA2, v8dVarA2, k0j0VarB2, zJ2, strL2, iA2, iunVar2, zM2, iB2, false, null, false, false, 1, z2);
        }
    }
}
