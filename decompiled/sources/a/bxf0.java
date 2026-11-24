package a;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H§@¢\u0006\u0004\b\u000b\u0010\tJ&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\r\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\r\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\r\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001f\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b \u0010!J0\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\"\u001a\u00020\u001b2\b\b\u0001\u0010\r\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&J&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\r\u001a\u00020'H§@¢\u0006\u0004\b(\u0010)¨\u0006*À\u0006\u0003"}, d2 = {"La/bxf0;", "", "La/lzf0;", "La/xwf0;", "request", "La/q16;", "La/pzf0;", "La/i2o;", "i", "(La/lzf0;La/yje;)Ljava/lang/Object;", "La/twf0;", "h", "La/ym50;", "body", "", "e", "(La/ym50;La/yje;)Ljava/lang/Object;", "La/m4c;", "c", "(La/m4c;La/yje;)Ljava/lang/Object;", "La/b4c;", "d", "(La/b4c;La/yje;)Ljava/lang/Object;", "La/eck0;", "La/t16;", "g", "(La/eck0;La/yje;)Ljava/lang/Object;", "", "language", "", "mode", "", "a", "(Ljava/lang/String;ILa/yje;)Ljava/lang/Object;", "auth", "La/l0c;", "La/jd;", "b", "(Ljava/lang/String;La/l0c;La/yje;)Ljava/lang/Object;", "La/kqb;", "f", "(La/kqb;La/yje;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface bxf0 {
    @ofr("Account/v1/GetPasswordRequirements")
    Object a(@nkd0("language") String str, @nkd0("mode") int i, yje<? super q16<? extends List<String>, ? extends i2o>> yjeVar);

    @kg80("Account/v1/Mb/ChangePassword2Step")
    Object b(@xpv("X-Auth") String str, @jb8 l0c l0cVar, yje<? super q16<jd, ? extends i2o>> yjeVar);

    @kg80("Account/v1/CheckPassword")
    Object c(@jb8 m4c m4cVar, yje<? super q16<Boolean, ? extends i2o>> yjeVar);

    @kg80("Account/v1/CheckPassword")
    Object d(@jb8 b4c b4cVar, yje<? super q16<Boolean, ? extends i2o>> yjeVar);

    @kg80("Account/v1/Mb/SetNewPassword")
    Object e(@jb8 ym50 ym50Var, yje<? super q16<Boolean, ? extends i2o>> yjeVar);

    @kg80("Account/v2/ChangePassword2Step2")
    Object f(@jb8 kqb kqbVar, yje<? super q16<jd, ? extends i2o>> yjeVar);

    @kg80("Account/v1/Mb/ChangePasswordFinal")
    Object g(@jb8 eck0 eck0Var, yje<? super q16<t16, ? extends i2o>> yjeVar);

    @kg80("Account/v1/Mb/PasswordRepair")
    Object h(@jb8 lzf0<twf0> lzf0Var, yje<? super q16<pzf0, ? extends i2o>> yjeVar);

    @kg80("Account/v1/Mb/PasswordRepair")
    Object i(@jb8 lzf0<xwf0> lzf0Var, yje<? super q16<pzf0, ? extends i2o>> yjeVar);
}
