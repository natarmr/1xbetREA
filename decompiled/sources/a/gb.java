package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10992a;
    public final /* synthetic */ vhj0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ gb(Function1 function1, vhj0 vhj0Var) {
        this.f10992a = (byte) 0;
        this.c = function1;
        this.b = vhj0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10992a;
        Function1 function1 = this.c;
        vhj0 vhj0Var = this.b;
        switch (b) {
            case 0:
                ((hej0) obj).getClass();
                function1.invoke(new oyi0(vhj0Var));
                break;
            case 1:
                ixx ixxVar = (ixx) obj;
                ixxVar.getClass();
                DsSettingsCell dsSettingsCell = ixxVar.d;
                dsSettingsCell.getClass();
                dyb.N(dsSettingsCell, ymx.INTERVAL_400, new gb(vhj0Var, function1, (byte) 2));
                DsSettingsCell dsSettingsCell2 = ixxVar.f15563a;
                dsSettingsCell2.setFirst(vhj0Var.c);
                dsSettingsCell2.setLast(false);
                dsSettingsCell.setAllowClickWhenDisabled(true);
                dsSettingsCell.setEnabled(true);
                ixxVar.b.setImageResource(R.drawable.ic_glyph_coefficient);
                DsCellMiddleTitle dsCellMiddleTitle = ixxVar.c;
                dsCellMiddleTitle.setTitle(vhj0Var.f37433a);
                String str = vhj0Var.b;
                dsCellMiddleTitle.setSubtitleVisible(str.length() > 0);
                dsCellMiddleTitle.setSubtitle(str);
                break;
            case 2:
                ((View) obj).getClass();
                vhj0Var.getClass();
                function1.invoke(vhj0Var);
                break;
            case 3:
                lxx lxxVar = (lxx) obj;
                lxxVar.getClass();
                DsSettingsCell dsSettingsCell3 = lxxVar.e;
                DsCellRightLabel dsCellRightLabel = lxxVar.d;
                dsSettingsCell3.getClass();
                dyb.N(dsSettingsCell3, ymx.INTERVAL_400, new gb(vhj0Var, function1, (byte) 4));
                DsSettingsCell dsSettingsCell4 = lxxVar.f20837a;
                dsSettingsCell4.setFirst(vhj0Var.c);
                dsSettingsCell4.setLast(false);
                dsSettingsCell3.setAllowClickWhenDisabled(true);
                dsSettingsCell3.setEnabled(true);
                lxxVar.b.setImageResource(R.drawable.ic_glyph_coefficient);
                DsCellMiddleTitle dsCellMiddleTitle2 = lxxVar.c;
                dsCellMiddleTitle2.setTitle(vhj0Var.f37433a);
                String str2 = vhj0Var.b;
                dsCellMiddleTitle2.setSubtitleVisible(str2.length() > 0);
                dsCellMiddleTitle2.setSubtitle(str2);
                dsCellRightLabel.setVisibility(8);
                break;
            default:
                ((View) obj).getClass();
                vhj0Var.getClass();
                function1.invoke(vhj0Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gb(vhj0 vhj0Var, Function1 function1, byte b) {
        this.f10992a = b;
        this.b = vhj0Var;
        this.c = function1;
    }
}
