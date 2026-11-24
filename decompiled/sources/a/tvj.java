package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class tvj implements qvj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34601a = 0;
    public final Function2 b;
    public final Function2 c;
    public final Function2 d;
    public final Function2 e;
    public final Function2 f;
    public final Function2 g;

    public tvj(Function2 function2, Function2 function3, Function2 function4, int i) {
        zuh zuhVar = new zuh((byte) 24);
        zuh zuhVar2 = new zuh((byte) 26);
        function2 = (i & 4) != 0 ? new zuh((byte) 28) : function2;
        function3 = (i & 8) != 0 ? new svj((byte) 0) : function3;
        svj svjVar = new svj((byte) 2);
        function4 = (i & 32) != 0 ? new svj((byte) 3) : function4;
        this.b = zuhVar;
        this.c = zuhVar2;
        this.d = function2;
        this.e = function3;
        this.f = svjVar;
        this.g = function4;
    }

    @Override // a.qvj
    public final void onCreate(clz clzVar) {
        byte b = this.f34601a;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                function2.invoke(clzVar, this);
                break;
            default:
                function2.invoke(clzVar, this);
                break;
        }
    }

    @Override // a.qvj
    public final void onDestroy(clz clzVar) {
        byte b = this.f34601a;
        Function2 function2 = this.g;
        switch (b) {
            case 0:
                function2.invoke(clzVar, this);
                break;
            default:
                function2.invoke(clzVar, this);
                break;
        }
    }

    @Override // a.qvj
    public final void onPause(clz clzVar) {
        byte b = this.f34601a;
        Function2 function2 = this.e;
        switch (b) {
            case 0:
                function2.invoke(clzVar, this);
                break;
            default:
                function2.invoke(clzVar, this);
                break;
        }
    }

    @Override // a.qvj
    public final void onResume(clz clzVar) {
        byte b = this.f34601a;
        Function2 function2 = this.d;
        switch (b) {
            case 0:
                function2.invoke(clzVar, this);
                break;
            default:
                function2.invoke(clzVar, this);
                break;
        }
    }

    @Override // a.qvj
    public final void onStart(clz clzVar) {
        byte b = this.f34601a;
        Function2 function2 = this.c;
        switch (b) {
            case 0:
                function2.invoke(clzVar, this);
                break;
            default:
                function2.invoke(clzVar, this);
                break;
        }
    }

    @Override // a.qvj
    public final void onStop(clz clzVar) {
        byte b = this.f34601a;
        Function2 function2 = this.f;
        switch (b) {
            case 0:
                function2.invoke(clzVar, this);
                break;
            default:
                function2.invoke(clzVar, this);
                break;
        }
    }

    public tvj(Function2 function2) {
        zuh zuhVar = new zuh((byte) 23);
        zuh zuhVar2 = new zuh((byte) 25);
        zuh zuhVar3 = new zuh((byte) 27);
        zuh zuhVar4 = new zuh((byte) 29);
        svj svjVar = new svj((byte) 1);
        this.b = zuhVar;
        this.c = zuhVar2;
        this.d = zuhVar3;
        this.e = zuhVar4;
        this.f = svjVar;
        this.g = function2;
    }
}
