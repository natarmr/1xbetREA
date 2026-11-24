package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qib implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28783a;
    public final /* synthetic */ pru b;
    public final /* synthetic */ ctf0 c;

    public /* synthetic */ qib(ctf0 ctf0Var, pru pruVar) {
        this.f28783a = (byte) 2;
        this.c = ctf0Var;
        this.b = pruVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28783a;
        pru pruVar = this.b;
        ctf0 ctf0Var = this.c;
        switch (b) {
            case 0:
                String strA = pruVar.a().Z1;
                if (strA.length() == 0) {
                    strA = ctf0Var.b.a(R.string.one_x_club, Arrays.copyOf(new Object[0], 0));
                }
                return new kib(true, true, vhb.f37421a, false, true, strA);
            case 1:
                sff0 sff0VarA = pruVar.a();
                gx7 gx7Var = sff0VarA.f32117a;
                return new l2f("", false, gx7Var.j, false, null, gx7Var.e ? q3d.j(new i2f(ctf0Var.b.a(R.string.pf_bet, Arrays.copyOf(new Object[0], 0))), new j2f(gx7Var.f)) : iun.f15405a, 0, sff0VarA.g.x, gx7Var.b.h, sff0VarA.J1);
            default:
                return new bmr0(ctf0Var.b.a(R.string.change_toto_dialog_title_without_name_v2, Arrays.copyOf(new Object[]{pruVar.a().f32117a.f}, 1)), iun.f15405a);
        }
    }

    public /* synthetic */ qib(byte b, pru pruVar, ctf0 ctf0Var) {
        this.f28783a = b;
        this.b = pruVar;
        this.c = ctf0Var;
    }
}
