.class public final La/ze7;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ze7;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cl5",
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
.field public static final P1:La/cl5;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/aai;

.field public final L1:La/zz2;

.field public M1:La/ii;

.field public final N1:La/a8z;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ze7;

    .line 4
    .line 5
    const-string v2, "limitTypeId"

    .line 6
    .line 7
    const-string v3, "getLimitTypeId()I"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/ze7;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/cl5;

    .line 33
    .line 34
    const/4 v1, 0x6

    .line 35
    invoke-direct {v0, v1}, La/cl5;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/ze7;->P1:La/cl5;

    .line 39
    .line 40
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
    new-instance v0, La/zz2;

    .line 8
    .line 9
    const-string v1, "LIMIT_TYPE_KEY"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/ze7;->L1:La/zz2;

    .line 15
    .line 16
    const-class v0, La/kf7;

    .line 17
    .line 18
    sget-object v1, La/sre0;->a:La/tre0;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, La/we7;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-direct {v1, p0, v2}, La/we7;-><init>(La/ze7;B)V

    .line 28
    .line 29
    .line 30
    const/16 v2, 0xe

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/ze7;->N1:La/a8z;

    .line 38
    .line 39
    sget-object v0, La/xe7;->a:La/xe7;

    .line 40
    .line 41
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, La/ze7;->O1:La/s0r;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/we7;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/we7;-><init>(La/ze7;B)V

    .line 5
    .line 6
    .line 7
    const-string v0, "REQUEST_CONFIRMATION_DIALOG_KEY"

    .line 8
    .line 9
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/ze7;->Q1:[La/iiy;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    aget-object p1, p1, v0

    .line 16
    .line 17
    iget-object v1, p0, La/ze7;->O1:La/s0r;

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
    new-instance v2, La/m87;

    .line 36
    .line 37
    invoke-direct {v2, p0, v0}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    new-instance p0, La/ugd;

    .line 41
    .line 42
    const v3, -0x6ab667a0

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v1, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final C0()V
    .locals 17

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
    const-class v2, La/me7;

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
    instance-of v4, v1, La/me7;

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
    check-cast v3, La/me7;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    sget-object v1, La/ze7;->Q1:[La/iiy;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    aget-object v1, v1, v2

    .line 65
    .line 66
    iget-object v2, v0, La/ze7;->L1:La/zz2;

    .line 67
    .line 68
    invoke-virtual {v2, v0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v7, v3, La/me7;->a:La/gii0;

    .line 76
    .line 77
    iget-object v8, v3, La/me7;->b:La/btt0;

    .line 78
    .line 79
    iget-object v9, v3, La/me7;->c:La/ctf0;

    .line 80
    .line 81
    iget-object v12, v3, La/me7;->d:La/duj;

    .line 82
    .line 83
    iget-object v13, v3, La/me7;->e:La/ii;

    .line 84
    .line 85
    iget-object v6, v3, La/me7;->f:La/mne;

    .line 86
    .line 87
    iget-object v14, v3, La/me7;->g:La/kwz;

    .line 88
    .line 89
    iget-object v15, v3, La/me7;->h:La/njo;

    .line 90
    .line 91
    iget-object v1, v3, La/me7;->i:La/ocl;

    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v4, La/h6i;

    .line 112
    .line 113
    new-instance v5, La/htz;

    .line 114
    .line 115
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    move-object/from16 v16, v1

    .line 119
    .line 120
    invoke-direct/range {v4 .. v16}, La/h6i;-><init>(La/htz;La/mne;La/gii0;La/btt0;La/ctf0;La/i1w0;Ljava/lang/Integer;La/duj;La/ii;La/kwz;La/njo;La/ocl;)V

    .line 121
    .line 122
    .line 123
    iget-object v1, v4, La/h6i;->p:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v1, La/n5d0;

    .line 126
    .line 127
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, La/aai;

    .line 132
    .line 133
    iput-object v1, v0, La/ze7;->K1:La/aai;

    .line 134
    .line 135
    iput-object v13, v0, La/ze7;->M1:La/ii;

    .line 136
    .line 137
    return-void

    .line 138
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 139
    .line 140
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/ze7;->G0()La/k3t0;

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
    new-instance v1, La/yp6;

    .line 12
    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v3, v2}, La/yp6;-><init>(Ljava/lang/Object;La/yje;B)V

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
    new-instance v4, La/u47;

    .line 34
    .line 35
    check-cast v0, La/i89;

    .line 36
    .line 37
    invoke-direct {v4, v0, p0, v1, v3}, La/u47;-><init>(La/i89;La/clz;La/yp6;La/yje;)V

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
    iget-object p0, p0, La/ze7;->N1:La/a8z;

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
