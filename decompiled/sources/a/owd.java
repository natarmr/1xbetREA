package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class owd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25962a;
    public final /* synthetic */ ctf0 b;

    public /* synthetic */ owd(ctf0 ctf0Var, byte b) {
        this.f25962a = b;
        this.b = ctf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25962a;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                String strA = ctf0Var.b.a(R.string.language_choose_reboot_description_now, Arrays.copyOf(new Object[0], 0));
                lsm0 lsm0Var = ctf0Var.b;
                return new gwd("", "", "", strA, lsm0Var.a(R.string.language_reboot_now, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.later, Arrays.copyOf(new Object[0], 0)));
            case 1:
                String strA2 = ctf0Var.b.a(R.string.daily_task_description_title, Arrays.copyOf(new Object[0], 0));
                lsm0 lsm0Var2 = ctf0Var.b;
                return new m5j(q3d.j(new j5j(strA2, lsm0Var2.a(R.string.daily_task_rules_details_description, Arrays.copyOf(new Object[0], 0))), new j5j(lsm0Var2.a(R.string.daily_task_how_to_join_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.daily_task_how_to_join_description, Arrays.copyOf(new Object[0], 0))), new j5j(lsm0Var2.a(R.string.daily_task_prizes_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.daily_task_prizes_subtitle, Arrays.copyOf(new Object[0], 0)))));
            case 2:
                return new hbk(ctf0Var.b.a(R.string.deposit_limits_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.deposit2_limit_confirm_request_description, Arrays.copyOf(new Object[0], 0)));
            default:
                return new elh0(lak0.c, ctf0Var.b.a(R.string.secret_question, Arrays.copyOf(new Object[0], 0)));
        }
    }
}
