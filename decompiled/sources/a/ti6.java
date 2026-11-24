package a;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ti6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33993a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ti6(fli fliVar, Fragment fragment) {
        this.f33993a = (byte) 5;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33993a;
        Fragment fragment = this.b;
        switch (b) {
            case 0:
                return vqd.i(fragment);
            case 1:
                return vqd.i(fragment);
            case 2:
                return fragment;
            case 3:
                return fragment.n();
            case 4:
                return vqd.i(fragment);
            case 5:
                androidx.fragment.app.e eVarC = fragment.C();
                eVarC.getClass();
                hvm0.j2.getClass();
                if (eVarC.J("SUB_GAME_FILTERS_DIALOG_TAG") == null) {
                    new hvm0().H0(eVarC, "SUB_GAME_FILTERS_DIALOG_TAG");
                }
                return Unit.f46060a;
            case 6:
                return vqd.i(fragment);
            default:
                return vqd.i(fragment);
        }
    }

    public /* synthetic */ ti6(Fragment fragment, byte b) {
        this.f33993a = b;
        this.b = fragment;
    }
}
