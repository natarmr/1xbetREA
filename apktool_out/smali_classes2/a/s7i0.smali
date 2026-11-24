.class public final La/s7i0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/s7i0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gne0",
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
.field public static final P1:La/gne0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/gti;

.field public L1:La/ii;

.field public M1:La/evz;

.field public final N1:La/a8z;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/s7i0;

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
    sput-object v1, La/s7i0;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gne0;

    .line 21
    .line 22
    const/16 v1, 0x11

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/gne0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/s7i0;->P1:La/gne0;

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
    const-class v0, La/e8i0;

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
    new-instance v1, La/p7i0;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, La/p7i0;-><init>(La/s7i0;B)V

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
    iput-object v0, p0, La/s7i0;->N1:La/a8z;

    .line 29
    .line 30
    sget-object v0, La/q7i0;->a:La/q7i0;

    .line 31
    .line 32
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/s7i0;->O1:La/s0r;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/p7i0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/p7i0;-><init>(La/s7i0;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "REQUEST_CONFIRMATION_DIALOG_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/s7i0;->Q1:[La/iiy;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aget-object p1, p1, v1

    .line 16
    .line 17
    iget-object v1, p0, La/s7i0;->O1:La/s0r;

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
    new-instance v2, La/uph0;

    .line 36
    .line 37
    const/4 v3, 0x7

    .line 38
    invoke-direct {v2, p0, v3}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance p0, La/ugd;

    .line 42
    .line 43
    const v3, 0x775fa003

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/t7i0;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/t7i0;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/t7i0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v6, v3, La/t7i0;->g:La/mne;

    .line 65
    .line 66
    iget-object v8, v3, La/t7i0;->a:La/ocl;

    .line 67
    .line 68
    iget-object v9, v3, La/t7i0;->b:La/duj;

    .line 69
    .line 70
    iget-object v10, v3, La/t7i0;->c:La/btt0;

    .line 71
    .line 72
    iget-object v11, v3, La/t7i0;->d:La/ctf0;

    .line 73
    .line 74
    iget-object v12, v3, La/t7i0;->e:La/gii0;

    .line 75
    .line 76
    iget-object v13, v3, La/t7i0;->f:La/kuy;

    .line 77
    .line 78
    iget-object v14, v3, La/t7i0;->h:La/ii;

    .line 79
    .line 80
    iget-object v15, v3, La/t7i0;->i:La/rou;

    .line 81
    .line 82
    iget-object v1, v3, La/t7i0;->j:La/e400;

    .line 83
    .line 84
    iget-object v2, v3, La/t7i0;->k:La/evz;

    .line 85
    .line 86
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v4, La/h6i;

    .line 105
    .line 106
    new-instance v5, La/wsz;

    .line 107
    .line 108
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    move-object/from16 v16, v1

    .line 112
    .line 113
    move-object/from16 v17, v2

    .line 114
    .line 115
    invoke-direct/range {v4 .. v17}, La/h6i;-><init>(La/wsz;La/mne;La/i1w0;La/ocl;La/duj;La/btt0;La/ctf0;La/gii0;La/kuy;La/ii;La/rou;La/e400;La/evz;)V

    .line 116
    .line 117
    .line 118
    move-object/from16 v1, v17

    .line 119
    .line 120
    iget-object v2, v4, La/h6i;->p:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v2, La/n5d0;

    .line 123
    .line 124
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, La/gti;

    .line 129
    .line 130
    iput-object v2, v0, La/s7i0;->K1:La/gti;

    .line 131
    .line 132
    iput-object v14, v0, La/s7i0;->L1:La/ii;

    .line 133
    .line 134
    iput-object v1, v0, La/s7i0;->M1:La/evz;

    .line 135
    .line 136
    return-void

    .line 137
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 138
    .line 139
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/s7i0;->G0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/i3t0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/i3t0;->C()La/gmq;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/tye0;

    .line 12
    .line 13
    const/16 v2, 0x1c

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v3, v2}, La/tye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v4, La/r7i0;

    .line 34
    .line 35
    check-cast v0, La/i89;

    .line 36
    .line 37
    invoke-direct {v4, v0, p0, v1, v3}, La/r7i0;-><init>(La/i89;La/clz;La/tye0;La/yje;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x3

    .line 41
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/s7i0;->N1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method
