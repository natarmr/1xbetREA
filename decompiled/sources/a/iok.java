package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iok implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15120a;
    public final /* synthetic */ wyg b;

    public /* synthetic */ iok(wyg wygVar, byte b) {
        this.f15120a = b;
        this.b = wygVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15120a;
        final byte b2 = 0;
        final byte b3 = 1;
        final wyg wygVar = this.b;
        final cp cpVar = (cp) obj;
        switch (b) {
            case 0:
                cpVar.getClass();
                ((xth) cpVar.u).f41465a.setOnClickListener(new View.OnClickListener() { // from class: a.jok
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b4 = b2;
                        cp cpVar2 = cpVar;
                        wyg wygVar2 = wygVar;
                        switch (b4) {
                            case 0:
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                            case 1:
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                            default:
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                        }
                    }
                });
                cpVar.t(new kgh(cpVar, (byte) 9));
                break;
            case 1:
                cpVar.getClass();
                ((yth) cpVar.u).b.setButtonClickListener(new View.OnClickListener() { // from class: a.jok
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b4 = b3;
                        cp cpVar2 = cpVar;
                        wyg wygVar2 = wygVar;
                        switch (b4) {
                            case 0:
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                            case 1:
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                            default:
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                        }
                    }
                });
                cpVar.t(new ctv(cpVar, cpVar, (byte) 1));
                break;
            case 2:
                cpVar.getClass();
                final byte b4 = 2;
                ((zth) cpVar.u).f44959a.setOnClickListener(new View.OnClickListener() { // from class: a.jok
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b5 = b4;
                        cp cpVar2 = cpVar;
                        wyg wygVar2 = wygVar;
                        switch (b5) {
                            case 0:
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                            case 1:
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                            default:
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                        }
                    }
                });
                cpVar.t(new kzi0(cpVar, (byte) 11));
                break;
            case 3:
                cpVar.getClass();
                View view = cpVar.f40887a;
                view.getClass();
                dyb.O(view, new Function1() { // from class: a.nwr0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b2;
                        cp cpVar2 = cpVar;
                        wyg wygVar2 = wygVar;
                        View view2 = (View) obj2;
                        switch (b5) {
                            case 0:
                                view2.getClass();
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                            default:
                                view2.getClass();
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                cpVar.t(new kzi0(cpVar, (byte) 21));
                break;
            default:
                cpVar.getClass();
                View view2 = cpVar.f40887a;
                view2.getClass();
                dyb.O(view2, new Function1() { // from class: a.nwr0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b3;
                        cp cpVar2 = cpVar;
                        wyg wygVar2 = wygVar;
                        View view3 = (View) obj2;
                        switch (b5) {
                            case 0:
                                view3.getClass();
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                            default:
                                view3.getClass();
                                wygVar2.e((p6t0) cpVar2.u());
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                cpVar.t(new kzi0(cpVar, (byte) 23));
                break;
        }
        return Unit.f46060a;
    }
}
