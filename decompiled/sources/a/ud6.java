package a;

import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetButton;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;

/* JADX INFO: loaded from: classes.dex */
public final class ud6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wd6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud6(wd6 wd6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wd6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wd6 wd6Var = this.k;
        switch (b) {
            case 0:
                ud6 ud6Var = new ud6(wd6Var, yjeVar, (byte) 0);
                ud6Var.j = obj;
                return ud6Var;
            case 1:
                ud6 ud6Var2 = new ud6(wd6Var, yjeVar, (byte) 1);
                ud6Var2.j = obj;
                return ud6Var2;
            case 2:
                ud6 ud6Var3 = new ud6(wd6Var, yjeVar, (byte) 2);
                ud6Var3.j = obj;
                return ud6Var3;
            case 3:
                ud6 ud6Var4 = new ud6(wd6Var, yjeVar, (byte) 3);
                ud6Var4.j = obj;
                return ud6Var4;
            case 4:
                ud6 ud6Var5 = new ud6(wd6Var, yjeVar, (byte) 4);
                ud6Var5.j = obj;
                return ud6Var5;
            default:
                ud6 ud6Var6 = new ud6(wd6Var, yjeVar, (byte) 5);
                ud6Var6.j = obj;
                return ud6Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ud6) create((de6) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ud6) create((zd6) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ud6) create((ce6) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ud6) create((ee6) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ud6) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ud6) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
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
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        wd6 wd6Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                de6 de6Var = (de6) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                DsPresetButton dsPresetButton = wd6Var.m2;
                if (dsPresetButton != null) {
                    dsPresetButton.setLoading(de6Var.b);
                }
                DsPresetButton dsPresetButton2 = wd6Var.m2;
                if (dsPresetButton2 != null) {
                    dsPresetButton2.setEnabled(de6Var.f5933a);
                }
                return Unit.f46060a;
            case 1:
                zd6 zd6Var = (zd6) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                String str = zd6Var.f44197a;
                if (str.length() == 0) {
                    str = null;
                }
                wd6Var.V0().b.setErrorText(str);
                DsPresetTextFieldBasic dsPresetTextFieldBasic = wd6Var.V0().b;
                SpannableString spannableStringValueOf = SpannableString.valueOf(zd6Var.b);
                spannableStringValueOf.getClass();
                boolean z = zd6Var.c;
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) spannableStringValueOf);
                if (z && spannableStringValueOf.length() > 0) {
                    ImageSpan imageSpan = new ImageSpan(wd6Var.o0(), R.drawable.ic_exclusive);
                    spannableStringBuilderAppend.append((CharSequence) "  ");
                    spannableStringBuilderAppend.setSpan(imageSpan, spannableStringBuilderAppend.length() - 1, spannableStringBuilderAppend.length(), 0);
                }
                dsPresetTextFieldBasic.setHelperText((Spannable) (spannableStringBuilderAppend.length() != 0 ? spannableStringBuilderAppend : null));
                return Unit.f46060a;
            case 2:
                ce6 ce6Var = (ce6) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!Intrinsics.d(ce6Var, ae6.f712a)) {
                    if (!(ce6Var instanceof be6)) {
                        t9f.b();
                        return null;
                    }
                    dub0 dub0Var = wd6Var.l2;
                    if (dub0Var != null) {
                        be6 be6Var = (be6) ce6Var;
                        boolean z2 = be6Var.c;
                        boolean z3 = be6Var.b;
                        dub0Var.setTitle(be6Var.f2432a);
                        dub0Var.setPreviousButtonAlpha(z3 ? 1.0f : 0.5f);
                        dub0Var.setPreviousButtonEnable(z3);
                        dub0Var.setNextButtonAlpha(z2 ? 1.0f : 0.5f);
                        dub0Var.setNextButtonEnable(z2);
                    }
                    DsPresetTextFieldBasic dsPresetTextFieldBasic2 = wd6Var.V0().b;
                    String str2 = ((be6) ce6Var).d;
                    dsPresetTextFieldBasic2.setText(str2);
                    dsPresetTextFieldBasic2.setSelection(str2.length());
                }
                return Unit.f46060a;
            case 3:
                ee6 ee6Var = (ee6) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = ee6Var.f7655a;
                rd6 rd6Var = new rd6(wd6Var, (byte) 1);
                cl5 cl5Var = wd6.o2;
                pe6 pe6Var = new pe6(z4, rd6Var, new yj5(1, wd6Var.W0(), me6.class, "onTextChange", "onTextChange(Ljava/lang/String;)V", 0, (byte) 8));
                wd6Var.n2 = pe6Var;
                String str3 = ee6Var.c;
                if (pe6Var.b && str3.length() > 0) {
                    pe6Var.e = str3;
                }
                pe6 pe6Var2 = wd6Var.n2;
                if (pe6Var2 != null) {
                    pe6Var2.f = ee6Var.b;
                }
                DsPresetTextFieldBasic dsPresetTextFieldBasic3 = wd6Var.V0().b;
                dsPresetTextFieldBasic3.setFilters(new InputFilter[]{new tjj(13, 2)});
                dsPresetTextFieldBasic3.requestFocus();
                pe6 pe6Var3 = wd6Var.n2;
                if (pe6Var3 != null) {
                    wd6Var.V0().b.b.a(pe6Var3);
                }
                return Unit.f46060a;
            case 4:
                String str4 = (String) obj2;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                pe6 pe6Var4 = wd6Var.n2;
                if (pe6Var4 != null) {
                    str4.getClass();
                    if (pe6Var4.b && str4.length() > 0) {
                        pe6Var4.e = str4;
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                wd6Var.V0().b.setTrailingText((String) obj2);
                return Unit.f46060a;
        }
    }
}
