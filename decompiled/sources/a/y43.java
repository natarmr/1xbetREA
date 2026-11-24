package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.MatchResult;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class y43 extends guy implements Function2 {
    public static final y43 b;
    public static final y43 c;
    public static final y43 d;
    public static final y43 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41982a;

    static {
        int i = 2;
        b = new y43(i, (byte) 0);
        c = new y43(i, (byte) 1);
        d = new y43(i, (byte) 2);
        e = new y43(i, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y43(int i, byte b2) {
        super(i);
        this.f41982a = b2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41982a) {
            case 0:
                long j = ((qkx) obj).f28908a;
                long j2 = ((qkx) obj2).f28908a;
                Map map = quu0.f29360a;
                return ro4.g0(0.0f, 400.0f, new qkx(4294967297L), 1);
            case 1:
                azn aznVar = (azn) obj2;
                return Boolean.valueOf(((azn) obj) == aznVar && aznVar == azn.c);
            case 2:
                MatchResult matchResult = (MatchResult) obj;
                String str = (String) obj2;
                matchResult.getClass();
                str.getClass();
                return ((String) matchResult.a().get(1)) + '\"' + str + '\"' + ((String) matchResult.a().get(2));
            case 3:
                ((String) obj).getClass();
                ((JSONObject) obj2).getClass();
                return Unit.f46060a;
            default:
                fqs0 fqs0Var = (fqs0) obj2;
                fqs0Var.getClass();
                return Integer.valueOf(((fqs0) obj).compareTo(fqs0Var));
        }
    }
}
