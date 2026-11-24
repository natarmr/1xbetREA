.class public final La/vjr;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vjr;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xak",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final P1:La/xak;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/lhi;

.field public L1:La/ii;

.field public M1:La/atz;

.field public final N1:La/a8z;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/vjr;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/vjr;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xak;

    .line 21
    .line 22
    const/16 v1, 0x15

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/xak;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/vjr;->P1:La/xak;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/hkr;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/tjr;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, La/tjr;-><init>(La/vjr;B)V

    .line 19
    .line 20
    .line 21
    const/16 v2, 0xe

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/vjr;->N1:La/a8z;

    .line 29
    .line 30
    sget-object v0, La/ujr;->a:La/ujr;

    .line 31
    .line 32
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/vjr;->O1:La/s0r;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/tjr;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/tjr;-><init>(La/vjr;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "REQUEST_RESULT_DIALOG_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/vjr;->Q1:[La/iiy;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aget-object p1, p1, v1

    .line 16
    .line 17
    iget-object v1, p0, La/vjr;->O1:La/s0r;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, La/aid;

    .line 27
    .line 28
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 29
    .line 30
    new-instance v1, La/owp0;

    .line 31
    .line 32
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, La/jar;

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    invoke-direct {v2, p0, v3}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance p0, La/ugd;

    .line 42
    .line 43
    const v3, 0x184b6dd4

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v1, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final C0()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/wjr;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/wjr;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/wjr;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v6, v2, La/wjr;->a:La/gii0;

    .line 63
    .line 64
    iget-object v7, v2, La/wjr;->b:La/btt0;

    .line 65
    .line 66
    iget-object v8, v2, La/wjr;->c:La/ctf0;

    .line 67
    .line 68
    iget-object v10, v2, La/wjr;->d:La/duj;

    .line 69
    .line 70
    iget-object v11, v2, La/wjr;->e:La/ii;

    .line 71
    .line 72
    iget-object v5, v2, La/wjr;->f:La/mne;

    .line 73
    .line 74
    iget-object v12, v2, La/wjr;->g:La/njo;

    .line 75
    .line 76
    iget-object v13, v2, La/wjr;->h:La/wgu;

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v3, La/nc0;

    .line 97
    .line 98
    new-instance v4, La/htz;

    .line 99
    .line 100
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-direct/range {v3 .. v13}, La/nc0;-><init>(La/htz;La/mne;La/gii0;La/btt0;La/ctf0;La/i1w0;La/duj;La/ii;La/njo;La/wgu;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v3, La/nc0;->n:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, La/n5d0;

    .line 109
    .line 110
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, La/lhi;

    .line 115
    .line 116
    iput-object v0, p0, La/vjr;->K1:La/lhi;

    .line 117
    .line 118
    iput-object v11, p0, La/vjr;->L1:La/ii;

    .line 119
    .line 120
    new-instance v0, La/atz;

    .line 121
    .line 122
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v0, p0, La/vjr;->M1:La/atz;

    .line 126
    .line 127
    return-void

    .line 128
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 129
    .line 130
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/vjr;->N1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/k3t0;

    .line 8
    .line 9
    check-cast v0, La/i3t0;

    .line 10
    .line 11
    invoke-virtual {v0}, La/i3t0;->C()La/gmq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/sxk;

    .line 16
    .line 17
    const/16 v2, 0x1b

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v1, p0, v3, v2}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/lkz;->a:La/lkz;

    .line 24
    .line 25
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v4, La/g6q;

    .line 38
    .line 39
    check-cast v0, La/i89;

    .line 40
    .line 41
    invoke-direct {v4, v0, p0, v1, v3}, La/g6q;-><init>(La/i89;La/clz;La/sxk;La/yje;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x3

    .line 45
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 46
    .line 47
    .line 48
    return-void
.end method
