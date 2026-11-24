package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes2.dex */
public final class szn extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f33078a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szn(boolean z) {
        super(1);
        this.f33078a = z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer numValueOf;
        MatchResult matchResult = (MatchResult) obj;
        matchResult.getClass();
        g3 g3VarC = matchResult.c();
        if (g3VarC.b() > 5 && g3VarC.e(5) != null) {
            MatchGroup matchGroupE = g3VarC.e(5);
            matchGroupE.getClass();
            char cCharAt = matchGroupE.f46071a.charAt(0);
            String str = (String) tzn.f34812a.get(Character.valueOf(cCharAt));
            return str == null ? String.valueOf(cCharAt) : str;
        }
        if (g3VarC.e(4) != null) {
            Map map = tzn.f34812a;
            MatchGroup matchGroupE2 = g3VarC.e(4);
            matchGroupE2.getClass();
            String str2 = (String) map.get(Character.valueOf(matchGroupE2.f46071a.charAt(0)));
            return str2 == null ? matchResult.getValue() : str2;
        }
        if (!this.f33078a) {
            numValueOf = null;
        } else if (g3VarC.e(1) != null) {
            numValueOf = (Integer) rzn.f31370a.get(matchResult.getValue());
        } else if (g3VarC.e(2) != null) {
            MatchGroup matchGroupE3 = g3VarC.e(2);
            matchGroupE3.getClass();
            numValueOf = Integer.valueOf(Integer.parseInt(matchGroupE3.f46071a));
        } else if (g3VarC.e(3) != null) {
            MatchGroup matchGroupE4 = g3VarC.e(3);
            matchGroupE4.getClass();
            numValueOf = Integer.valueOf(Integer.parseInt(matchGroupE4.f46071a, CharsKt.checkRadix(16)));
        } else {
            numValueOf = null;
        }
        Character chValueOf = numValueOf != null ? Character.valueOf((char) numValueOf.intValue()) : null;
        if (chValueOf == null) {
            return "&amp;".concat(matchResult.getValue().substring(1));
        }
        String str3 = (String) tzn.f34812a.get(chValueOf);
        return str3 == null ? chValueOf.toString() : str3;
    }
}
