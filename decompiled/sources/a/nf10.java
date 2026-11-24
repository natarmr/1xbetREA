package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.aggregator.loyalty_program.api.navigation.models.LoyaltyProgramScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nf10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23413a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ yfu c;
    public final /* synthetic */ bzt d;
    public final /* synthetic */ wgu e;
    public final /* synthetic */ LoyaltyProgramScreenParams f;
    public final /* synthetic */ z7z g;
    public final /* synthetic */ z7z h;

    public /* synthetic */ nf10(ctf0 ctf0Var, yfu yfuVar, bzt bztVar, wgu wguVar, LoyaltyProgramScreenParams loyaltyProgramScreenParams, z7z z7zVar, z7z z7zVar2, byte b) {
        this.f23413a = b;
        this.b = ctf0Var;
        this.c = yfuVar;
        this.d = bztVar;
        this.e = wguVar;
        this.f = loyaltyProgramScreenParams;
        this.g = z7zVar;
        this.h = z7zVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23413a;
        z7z z7zVar = this.h;
        z7z z7zVar2 = this.g;
        LoyaltyProgramScreenParams loyaltyProgramScreenParams = this.f;
        wgu wguVar = this.e;
        bzt bztVar = this.d;
        yfu yfuVar = this.c;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                String strA = ctf0Var.b.a(R.string.loyalty_program_title, Arrays.copyOf(new Object[0], 0));
                yfuVar.j();
                int i = bztVar.f3488a.a().r;
                String strA2 = wguVar.a();
                boolean z = loyaltyProgramScreenParams.f46310a;
                if (z) {
                    z7zVar = z7zVar2;
                }
                Object obj = z7zVar.get();
                obj.getClass();
                return new lf10(strA, i, strA2, ve10.f37260a, z, (i1w0) obj, false);
            default:
                String strA3 = ctf0Var.b.a(R.string.loyalty_program_title, Arrays.copyOf(new Object[0], 0));
                yfuVar.j();
                int i2 = bztVar.f3488a.a().r;
                String strA4 = wguVar.a();
                boolean z2 = loyaltyProgramScreenParams.f46310a;
                if (z2) {
                    z7zVar = z7zVar2;
                }
                Object obj2 = z7zVar.get();
                obj2.getClass();
                return new gh10(strA3, i2, strA4, ig10.f14714a, z2, (i1w0) obj2, false);
        }
    }
}
