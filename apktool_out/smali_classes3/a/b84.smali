.class public final La/b84;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/b84;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gfk0",
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
.field public static final P1:La/gfk0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/cgx0;

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public final N1:La/s0r;

.field public final O1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/b84;

    .line 4
    .line 5
    const-string v2, "showNavigationBarBundle"

    .line 6
    .line 7
    const-string v3, "getShowNavigationBarBundle()Z"

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
    const-string v5, "getBinding()Lorg/xplatform/auth_history/impl/databinding/FragmentAuthHistoryComposeBinding;"

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
    sput-object v1, La/b84;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/gfk0;

    .line 33
    .line 34
    const/16 v1, 0x19

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/b84;->P1:La/gfk0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d01f7

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/cgx0;

    .line 8
    .line 9
    const-string v1, "SHOW_NAVIGATION_BAR_BUNDLE"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/b84;->K1:La/cgx0;

    .line 16
    .line 17
    sget-object v0, La/a84;->a:La/a84;

    .line 18
    .line 19
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/b84;->N1:La/s0r;

    .line 24
    .line 25
    const-class v0, La/l94;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/a13;

    .line 34
    .line 35
    const/16 v2, 0x16

    .line 36
    .line 37
    invoke-direct {v1, p0, v2}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, La/b84;->O1:La/a8z;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/b84;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/b84;->N1:La/s0r;

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
    check-cast p1, La/dyq;

    .line 16
    .line 17
    iget-object p1, p1, La/dyq;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/fa2;

    .line 20
    .line 21
    const/16 v2, 0x9

    .line 22
    .line 23
    invoke-direct {v1, p0, v2}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance v2, La/ugd;

    .line 27
    .line 28
    const v3, -0x30eb915a

    .line 29
    .line 30
    .line 31
    invoke-direct {v2, v3, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, La/shd;

    .line 35
    .line 36
    const/16 v3, 0xf

    .line 37
    .line 38
    invoke-direct {v1, v3}, La/shd;-><init>(B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v1, v2}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, La/z74;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {p1, p0, v1}, La/z74;-><init>(La/b84;B)V

    .line 48
    .line 49
    .line 50
    const-string v1, "REQUEST_EXIT_ALL_SESSIONS_DIALOG_KEY"

    .line 51
    .line 52
    invoke-static {p0, v1, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, La/z74;

    .line 56
    .line 57
    invoke-direct {p1, p0, v0}, La/z74;-><init>(La/b84;B)V

    .line 58
    .line 59
    .line 60
    const-string v0, "REQUEST_EXIT_SESSION_DIALOG_KEY"

    .line 61
    .line 62
    invoke-static {p0, v0, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final C0()V
    .locals 19

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
    const-class v2, La/n74;

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
    instance-of v4, v1, La/n74;

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
    check-cast v3, La/n74;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v5, v3, La/n74;->a:La/cad;

    .line 65
    .line 66
    iget-object v6, v3, La/n74;->b:La/lef0;

    .line 67
    .line 68
    iget-object v10, v3, La/n74;->c:La/m1e;

    .line 69
    .line 70
    iget-object v11, v3, La/n74;->f:La/kt2;

    .line 71
    .line 72
    iget-object v12, v3, La/n74;->g:La/duj;

    .line 73
    .line 74
    iget-object v13, v3, La/n74;->h:La/g2v;

    .line 75
    .line 76
    iget-object v9, v3, La/n74;->j:La/ii;

    .line 77
    .line 78
    iget-object v14, v3, La/n74;->i:La/ctf0;

    .line 79
    .line 80
    iget-object v15, v3, La/n74;->k:La/btt0;

    .line 81
    .line 82
    iget-object v1, v3, La/n74;->d:La/esh0;

    .line 83
    .line 84
    iget-object v2, v3, La/n74;->e:La/knf0;

    .line 85
    .line 86
    iget-object v4, v3, La/n74;->l:La/gii0;

    .line 87
    .line 88
    iget-object v7, v3, La/n74;->m:La/wdk0;

    .line 89
    .line 90
    iget-object v3, v3, La/n74;->n:La/d1p;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-object/from16 v17, v4

    .line 123
    .line 124
    new-instance v4, La/qv2;

    .line 125
    .line 126
    move-object/from16 v16, v2

    .line 127
    .line 128
    move-object/from16 v18, v7

    .line 129
    .line 130
    move-object v7, v3

    .line 131
    invoke-direct/range {v4 .. v18}, La/qv2;-><init>(La/cad;La/lef0;La/d1p;La/i1w0;La/ii;La/m1e;La/kt2;La/duj;La/g2v;La/ctf0;La/btt0;La/knf0;La/gii0;La/wdk0;)V

    .line 132
    .line 133
    .line 134
    move-object/from16 v1, v18

    .line 135
    .line 136
    new-instance v2, La/fiu0;

    .line 137
    .line 138
    iget-object v3, v4, La/qv2;->n:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v3, La/n8i;

    .line 141
    .line 142
    const-class v4, La/l94;

    .line 143
    .line 144
    invoke-static {v4, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 149
    .line 150
    .line 151
    iput-object v2, v0, La/b84;->L1:La/fiu0;

    .line 152
    .line 153
    iput-object v1, v0, La/b84;->M1:La/wdk0;

    .line 154
    .line 155
    return-void

    .line 156
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 157
    .line 158
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/b84;->O1:La/a8z;

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
