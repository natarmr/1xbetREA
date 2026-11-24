package a;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gu7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11915a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ agk0 c;

    public /* synthetic */ gu7(pz40 pz40Var, agk0 agk0Var, byte b) {
        this.f11915a = b;
        this.b = pz40Var;
        this.c = agk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11915a;
        agk0 agk0Var = this.c;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new Pair(pz40Var.getValue(), Float.valueOf(agk0Var.l()));
    }
}
