.class public final La/mwd;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/xvd;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/mwd;",
        "La/stl;",
        "La/xvd;",
        "<init>",
        "()V",
        "a/kwd",
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
.field public static final k2:La/kwd;

.field public static final synthetic l2:[La/iiy;


# instance fields
.field public final g2:La/s0r;

.field public h2:La/fiu0;

.field public i2:La/ii;

.field public final j2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/mwd;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/chooselang/impl/databinding/ConfirmChooseLangaugeDialogBinding;"

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
    sput-object v1, La/mwd;->l2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/kwd;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/mwd;->k2:La/kwd;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/lwd;->a:La/lwd;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/mwd;->g2:La/s0r;

    .line 11
    .line 12
    const-class v0, La/twd;

    .line 13
    .line 14
    sget-object v1, La/sre0;->a:La/tre0;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, La/jwd;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, p0, v2}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, La/mwd;->j2:La/a8z;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final Q0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/mwd;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/mwd;->g2:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/xvd;

    .line 16
    .line 17
    return-object p0
.end method

.method public final V(Landroid/content/Context;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/sik;->V(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, La/af3;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    check-cast v1, La/af3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v3

    .line 26
    :goto_0
    const-class v2, La/iwd;

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/o5d0;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/ze3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v1, v3

    .line 50
    :goto_1
    instance-of v4, v1, La/iwd;

    .line 51
    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v3, v1

    .line 56
    :goto_2
    check-cast v3, La/iwd;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    iget-object v5, v3, La/iwd;->a:La/cad;

    .line 61
    .line 62
    iget-object v6, v3, La/iwd;->b:La/iw20;

    .line 63
    .line 64
    iget-object v7, v3, La/iwd;->c:La/nv20;

    .line 65
    .line 66
    iget-object v11, v3, La/iwd;->g:La/ii;

    .line 67
    .line 68
    iget-object v12, v3, La/iwd;->d:La/yoc;

    .line 69
    .line 70
    iget-object v13, v3, La/iwd;->e:La/yoc;

    .line 71
    .line 72
    iget-object v14, v3, La/iwd;->f:La/gsb;

    .line 73
    .line 74
    iget-object v15, v3, La/iwd;->h:La/zg;

    .line 75
    .line 76
    iget-object v1, v3, La/iwd;->l:La/rqc;

    .line 77
    .line 78
    iget-object v2, v3, La/iwd;->i:La/c1d0;

    .line 79
    .line 80
    iget-object v8, v3, La/iwd;->j:La/v6k;

    .line 81
    .line 82
    iget-object v4, v3, La/iwd;->k:La/rpc;

    .line 83
    .line 84
    iget-object v9, v3, La/iwd;->m:La/au0;

    .line 85
    .line 86
    move-object/from16 v19, v9

    .line 87
    .line 88
    iget-object v9, v3, La/iwd;->n:La/gr70;

    .line 89
    .line 90
    iget-object v10, v3, La/iwd;->o:La/sue;

    .line 91
    .line 92
    move-object/from16 v18, v1

    .line 93
    .line 94
    iget-object v1, v3, La/iwd;->p:La/ctf0;

    .line 95
    .line 96
    move-object/from16 v20, v1

    .line 97
    .line 98
    iget-object v1, v3, La/iwd;->q:La/bsc;

    .line 99
    .line 100
    move-object/from16 v21, v1

    .line 101
    .line 102
    iget-object v1, v3, La/iwd;->r:La/wgu;

    .line 103
    .line 104
    iget-object v3, v3, La/iwd;->s:La/o470;

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-object/from16 v17, v4

    .line 125
    .line 126
    new-instance v4, La/mci;

    .line 127
    .line 128
    move-object/from16 v22, v1

    .line 129
    .line 130
    move-object/from16 v16, v2

    .line 131
    .line 132
    move-object/from16 v23, v3

    .line 133
    .line 134
    invoke-direct/range {v4 .. v23}, La/mci;-><init>(La/cad;La/iw20;La/nv20;La/v6k;La/gr70;La/sue;La/ii;La/yoc;La/yoc;La/gsb;La/zg;La/c1d0;La/rpc;La/rqc;La/au0;La/ctf0;La/bsc;La/wgu;La/o470;)V

    .line 135
    .line 136
    .line 137
    new-instance v1, La/fiu0;

    .line 138
    .line 139
    iget-object v2, v4, La/mci;->r:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, La/uci;

    .line 142
    .line 143
    const-class v3, La/twd;

    .line 144
    .line 145
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 150
    .line 151
    .line 152
    iput-object v1, v0, La/mwd;->h2:La/fiu0;

    .line 153
    .line 154
    iput-object v11, v0, La/mwd;->i2:La/ii;

    .line 155
    .line 156
    return-void

    .line 157
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 158
    .line 159
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 p3, 0x0

    .line 11
    const/4 v0, 0x6

    .line 12
    invoke-direct {p1, p2, p3, v0}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, La/cnc;

    .line 16
    .line 17
    const/16 p3, 0xd

    .line 18
    .line 19
    invoke-direct {p2, p0, p3}, La/cnc;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    new-instance p0, La/ugd;

    .line 23
    .line 24
    const p3, -0x18960bd3

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-direct {p0, p3, v0, p2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/stl;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    const-class p0, La/mwd;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string p1, "Current screen: "

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string p1, "onCreateDialog"

    .line 20
    .line 21
    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    return-void
.end method
