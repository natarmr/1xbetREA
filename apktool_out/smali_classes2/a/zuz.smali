.class public final La/zuz;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/zuz;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xuz",
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
.field public static final N1:La/xuz;

.field public static final synthetic O1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/a8z;

.field public final M1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/zuz;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/limits_ee/impl/databinding/FragmentEeLimitsBinding;"

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
    sput-object v1, La/zuz;->O1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xuz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/zuz;->N1:La/xuz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0231

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/qvz;

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
    new-instance v1, La/rcz;

    .line 16
    .line 17
    const/16 v2, 0xb

    .line 18
    .line 19
    invoke-direct {v1, p0, v2}, La/rcz;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, La/zuz;->L1:La/a8z;

    .line 27
    .line 28
    sget-object v0, La/yuz;->a:La/yuz;

    .line 29
    .line 30
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/zuz;->M1:La/s0r;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/zuz;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/zuz;->M1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/vzq;

    .line 16
    .line 17
    iget-object p1, p1, La/vzq;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/owp0;

    .line 20
    .line 21
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/wuz;

    .line 25
    .line 26
    invoke-direct {v2, p0, v0}, La/wuz;-><init>(La/zuz;B)V

    .line 27
    .line 28
    .line 29
    new-instance p0, La/ugd;

    .line 30
    .line 31
    const v0, 0x3591c13b

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-direct {p0, v0, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v1, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final C0()V
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

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
    const-class v1, La/avz;

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
    instance-of v3, v0, La/avz;

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
    check-cast v2, La/avz;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static/range {p0 .. p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v5, v2, La/avz;->a:La/iw20;

    .line 63
    .line 64
    iget-object v8, v2, La/avz;->b:La/sa10;

    .line 65
    .line 66
    iget-object v9, v2, La/avz;->c:La/ii;

    .line 67
    .line 68
    iget-object v10, v2, La/avz;->d:La/m1e;

    .line 69
    .line 70
    iget-object v11, v2, La/avz;->e:La/duj;

    .line 71
    .line 72
    iget-object v12, v2, La/avz;->f:La/btt0;

    .line 73
    .line 74
    iget-object v13, v2, La/avz;->g:La/ctf0;

    .line 75
    .line 76
    iget-object v14, v2, La/avz;->h:La/gii0;

    .line 77
    .line 78
    iget-object v15, v2, La/avz;->i:La/knf0;

    .line 79
    .line 80
    iget-object v6, v2, La/avz;->j:La/cad;

    .line 81
    .line 82
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v3, La/v7i;

    .line 101
    .line 102
    new-instance v4, La/dvz;

    .line 103
    .line 104
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-direct/range {v3 .. v15}, La/v7i;-><init>(La/dvz;La/iw20;La/cad;La/i1w0;La/sa10;La/ii;La/m1e;La/duj;La/btt0;La/ctf0;La/gii0;La/knf0;)V

    .line 108
    .line 109
    .line 110
    new-instance v0, La/fiu0;

    .line 111
    .line 112
    iget-object v1, v3, La/v7i;->o:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, La/rii;

    .line 115
    .line 116
    const-class v2, La/qvz;

    .line 117
    .line 118
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 123
    .line 124
    .line 125
    move-object/from16 v1, p0

    .line 126
    .line 127
    iput-object v0, v1, La/zuz;->K1:La/fiu0;

    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 131
    .line 132
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/wuz;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {p1, p0, v0}, La/wuz;-><init>(La/zuz;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "SEND_RESULT_REQUEST_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
