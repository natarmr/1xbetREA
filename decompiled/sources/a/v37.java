package a;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, d2 = {"La/v37;", "", "", "auth", "La/bug0;", "request", "La/q16;", "La/eug0;", "La/i2o;", "a", "(Ljava/lang/String;La/bug0;La/yje;)Ljava/lang/Object;", "La/cwe;", "c", "(Ljava/lang/String;La/cwe;La/yje;)Ljava/lang/Object;", "La/c0f;", "b", "(Ljava/lang/String;La/c0f;La/yje;)Ljava/lang/Object;", "d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface v37 {
    @kg80("/MobileLiveBetX/MobileSaleBetSumExtS")
    Object a(@xpv("X-Auth") String str, @jb8 bug0 bug0Var, yje<? super q16<eug0, ? extends i2o>> yjeVar);

    @kg80("/MobileLiveBetX/MobileMakeSaleBet")
    Object b(@xpv("X-Auth") String str, @jb8 c0f c0fVar, yje<? super q16<eug0, ? extends i2o>> yjeVar);

    @kg80("/MobileLiveBetX/MobileRemoveAutoSaleBetRule")
    Object c(@xpv("X-Auth") String str, @jb8 cwe cweVar, yje<? super q16<eug0, ? extends i2o>> yjeVar);

    @kg80("/MobileLiveBetX/MobileAddAutoSaleBetRule")
    Object d(@xpv("X-Auth") String str, @jb8 c0f c0fVar, yje<? super q16<eug0, ? extends i2o>> yjeVar);
}
