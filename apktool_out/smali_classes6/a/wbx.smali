.class public final La/wbx;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/wbx;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/bst",
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
.field public static final P1:La/bst;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/phf0;

.field public final O1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/wbx;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "playerId"

    .line 16
    .line 17
    const-string v5, "getPlayerId()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/wbx;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/bst;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/wbx;->P1:La/bst;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/vbx;->a:La/vbx;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/wbx;->L1:La/s0r;

    .line 14
    .line 15
    const-class v0, La/hcx;

    .line 16
    .line 17
    sget-object v1, La/sre0;->a:La/tre0;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/y2x;

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    invoke-direct {v1, p0, v2}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/wbx;->M1:La/a8z;

    .line 34
    .line 35
    new-instance v0, La/phf0;

    .line 36
    .line 37
    const-string v1, "player_id"

    .line 38
    .line 39
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La/wbx;->N1:La/phf0;

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, La/wbx;->O1:Z

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 9

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
    const-class v1, La/ubx;

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
    instance-of v3, v0, La/ubx;

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
    check-cast v2, La/ubx;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/wbx;->Q1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/wbx;->N1:La/phf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v3, v2, La/ubx;->b:La/cad;

    .line 77
    .line 78
    iget-object v4, v2, La/ubx;->a:La/gii0;

    .line 79
    .line 80
    iget-object v5, v2, La/ubx;->c:La/m1e;

    .line 81
    .line 82
    iget-object v6, v2, La/ubx;->f:La/ocl;

    .line 83
    .line 84
    iget-object v7, v2, La/ubx;->d:La/ctf0;

    .line 85
    .line 86
    iget-object v2, v2, La/ubx;->e:La/knf0;

    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v8, La/g45;

    .line 101
    .line 102
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v4, v8, La/g45;->a:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object v2, v8, La/g45;->b:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v3, v8, La/g45;->c:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v5, v8, La/g45;->d:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v0, v8, La/g45;->g:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v1, v8, La/g45;->e:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v7, v8, La/g45;->f:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v6, v8, La/g45;->h:Ljava/lang/Object;

    .line 120
    .line 121
    new-instance v0, La/tii;

    .line 122
    .line 123
    const/16 v1, 0x9

    .line 124
    .line 125
    invoke-direct {v0, v8, v1}, La/tii;-><init>(Ljava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    iput-object v0, v8, La/g45;->i:Ljava/lang/Object;

    .line 129
    .line 130
    new-instance v0, La/fiu0;

    .line 131
    .line 132
    iget-object v1, v8, La/g45;->i:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, La/tii;

    .line 135
    .line 136
    const-class v2, La/hcx;

    .line 137
    .line 138
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 143
    .line 144
    .line 145
    iput-object v0, p0, La/wbx;->K1:La/fiu0;

    .line 146
    .line 147
    return-void

    .line 148
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 149
    .line 150
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/wbx;->Q1:[La/iiy;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    aget-object p1, p1, p2

    .line 11
    .line 12
    iget-object p2, p0, La/wbx;->L1:La/s0r;

    .line 13
    .line 14
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast p1, La/aid;

    .line 22
    .line 23
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 24
    .line 25
    new-instance p2, La/owp0;

    .line 26
    .line 27
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, La/xxv;

    .line 31
    .line 32
    const/16 v1, 0x12

    .line 33
    .line 34
    invoke-direct {v0, p0, v1}, La/xxv;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    new-instance p0, La/ugd;

    .line 38
    .line 39
    const v1, -0x5541bebb

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p2, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/wbx;->O1:Z

    .line 2
    .line 3
    return p0
.end method
