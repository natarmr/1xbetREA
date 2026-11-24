package a;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k3m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17625a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k3m(float f, ctf0 ctf0Var, boolean z) {
        this.d = ctf0Var;
        this.b = f;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17625a;
        boolean z = this.c;
        float f = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                i3m i3mVar = (i3m) obj2;
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                if (z) {
                    i3mVar.b.m(Float.intBitsToFloat((int) (j6zVar.Y(0L) & 4294967295L)) + ((int) (4294967295L & j6zVar.g())));
                    ((hgk0) i3mVar.c).setValue(new ycl(f));
                }
                break;
            default:
                ctf0 ctf0Var = (ctf0) obj2;
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                pzw.E(bnk0Var, ctf0Var.b.a(R.string.n_percents, Arrays.copyOf(new Object[]{StringsKt.w0(StringsKt.w0(String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), '0'), '.')}, 1)), z ? ctf0Var.d(R.dimen.text_20) : ctf0Var.d(R.dimen.text_14), z ? R.color.static_games_text_victory : R.color.static_white_80, 0, 0, 50);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ k3m(boolean z, i3m i3mVar, float f) {
        this.c = z;
        this.d = i3mVar;
        this.b = f;
    }
}
