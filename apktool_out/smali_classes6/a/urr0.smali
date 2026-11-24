.class public final La/urr0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/urr0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/j6m0",
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
.field public static final O1:La/j6m0;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:La/s0r;

.field public M1:La/fiu0;

.field public final N1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/urr0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/toto_jackpot/impl/databinding/FragmentTotoJackpotDsBinding;"

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
    sput-object v1, La/urr0;->P1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/j6m0;

    .line 21
    .line 22
    const/16 v1, 0x19

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/j6m0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/urr0;->O1:La/j6m0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d02fb

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae1

    .line 10
    .line 11
    .line 12
    sget-object v2, La/bp3;->b:La/bp3;

    .line 13
    .line 14
    const v3, 0x7f040b5d

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/urr0;->K1:La/e9o0;

    .line 21
    .line 22
    sget-object v0, La/trr0;->a:La/trr0;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/urr0;->L1:La/s0r;

    .line 29
    .line 30
    const-class v0, La/yrr0;

    .line 31
    .line 32
    sget-object v1, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, La/qir0;

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {v1, p0, v2}, La/qir0;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/urr0;->N1:La/a8z;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/urr0;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object v1, p1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/urr0;->L1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v2, v1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v1, La/e6r;

    .line 16
    .line 17
    iget-object v1, v1, La/e6r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    sget-object v3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-static {v1}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v1, v1, La/xiv0;->a:La/uiv0;

    .line 29
    .line 30
    invoke-virtual {v1, v3}, La/uiv0;->i(I)La/pfx;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    iget v1, v1, La/pfx;->b:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v1, v0

    .line 40
    :goto_0
    aget-object p1, p1, v0

    .line 41
    .line 42
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast p1, La/e6r;

    .line 50
    .line 51
    iget-object p1, p1, La/e6r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 52
    .line 53
    new-instance v0, La/nb50;

    .line 54
    .line 55
    const/16 v2, 0x18

    .line 56
    .line 57
    invoke-direct {v0, p0, v1, v2}, La/nb50;-><init>(Ljava/lang/Object;IB)V

    .line 58
    .line 59
    .line 60
    new-instance p0, La/ugd;

    .line 61
    .line 62
    const v1, 0x141b5fae

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, v1, v3, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final C0()V
    .locals 20

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
    const-class v1, La/vrr0;

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
    instance-of v3, v0, La/vrr0;

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
    check-cast v2, La/vrr0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static/range {p0 .. p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v6, v2, La/vrr0;->b:La/sa10;

    .line 63
    .line 64
    iget-object v7, v2, La/vrr0;->c:La/m1e;

    .line 65
    .line 66
    iget-object v8, v2, La/vrr0;->d:La/duj;

    .line 67
    .line 68
    iget-object v4, v2, La/vrr0;->e:La/wsf0;

    .line 69
    .line 70
    iget-object v9, v2, La/vrr0;->f:La/pru;

    .line 71
    .line 72
    iget-object v10, v2, La/vrr0;->g:La/wdk0;

    .line 73
    .line 74
    iget-object v12, v2, La/vrr0;->h:La/ii;

    .line 75
    .line 76
    iget-object v5, v2, La/vrr0;->a:La/cad;

    .line 77
    .line 78
    iget-object v13, v2, La/vrr0;->i:La/ctf0;

    .line 79
    .line 80
    iget-object v14, v2, La/vrr0;->j:La/csr0;

    .line 81
    .line 82
    iget-object v0, v2, La/vrr0;->k:La/knf0;

    .line 83
    .line 84
    iget-object v1, v2, La/vrr0;->l:La/gii0;

    .line 85
    .line 86
    iget-object v3, v2, La/vrr0;->m:La/btt0;

    .line 87
    .line 88
    iget-object v15, v2, La/vrr0;->n:La/hqr0;

    .line 89
    .line 90
    iget-object v2, v2, La/vrr0;->o:La/tgk;

    .line 91
    .line 92
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-object/from16 v18, v3

    .line 123
    .line 124
    new-instance v3, La/v7i;

    .line 125
    .line 126
    move-object/from16 v16, v0

    .line 127
    .line 128
    move-object/from16 v17, v1

    .line 129
    .line 130
    move-object/from16 v19, v2

    .line 131
    .line 132
    invoke-direct/range {v3 .. v19}, La/v7i;-><init>(La/wsf0;La/cad;La/sa10;La/m1e;La/duj;La/pru;La/wdk0;La/i1w0;La/ii;La/ctf0;La/csr0;La/hqr0;La/knf0;La/gii0;La/btt0;La/tgk;)V

    .line 133
    .line 134
    .line 135
    new-instance v0, La/fiu0;

    .line 136
    .line 137
    iget-object v1, v3, La/v7i;->o:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v1, La/yxi;

    .line 140
    .line 141
    const-class v2, La/yrr0;

    .line 142
    .line 143
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 148
    .line 149
    .line 150
    move-object/from16 v1, p0

    .line 151
    .line 152
    iput-object v0, v1, La/urr0;->M1:La/fiu0;

    .line 153
    .line 154
    return-void

    .line 155
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 156
    .line 157
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/urr0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
