package a;

import java.util.Map;
import org.xbet.client1.R;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public interface tf3 {
    static RulesScreenFactoryImpl$getRulesFragmentOldScreen$1 a(uf3 uf3Var, String str, Map map, int i) {
        if ((i & 2) != 0) {
            map = lun.f20680a;
            map.getClass();
        }
        boolean z = (i & 16) == 0;
        uf3Var.getClass();
        return new RulesScreenFactoryImpl$getRulesFragmentOldScreen$1(new RuleData(str, 8, map, ""), R.string.rules, z);
    }
}
