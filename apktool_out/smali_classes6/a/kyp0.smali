.class public final La/kyp0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/kyp0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/y2m0",
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
.field public static final Q1:La/y2m0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public K1:La/vwi;

.field public L1:La/ii;

.field public final M1:La/s0r;

.field public final N1:La/a8z;

.field public final O1:La/phf0;

.field public final P1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/kyp0;

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
    sput-object v1, La/kyp0;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/y2m0;

    .line 33
    .line 34
    const/16 v1, 0x11

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/y2m0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/kyp0;->Q1:La/y2m0;

    .line 40
    .line 41
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
    sget-object v0, La/jyp0;->a:La/jyp0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/kyp0;->M1:La/s0r;

    .line 14
    .line 15
    const-class v0, La/pyp0;

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
    new-instance v1, La/hyp0;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, v2}, La/hyp0;-><init>(La/kyp0;B)V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0xe

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/kyp0;->N1:La/a8z;

    .line 37
    .line 38
    new-instance v0, La/phf0;

    .line 39
    .line 40
    const-string v1, "player_id"

    .line 41
    .line 42
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/kyp0;->O1:La/phf0;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, La/kyp0;->P1:Z

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 10

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
    const-class v1, La/lyp0;

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
    instance-of v3, v0, La/lyp0;

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
    check-cast v2, La/lyp0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/kyp0;->R1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v3, p0, La/kyp0;->O1:La/phf0;

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v0, v2, La/lyp0;->a:La/cad;

    .line 77
    .line 78
    iget-object v4, v2, La/lyp0;->b:La/gii0;

    .line 79
    .line 80
    iget-object v5, v2, La/lyp0;->c:La/knf0;

    .line 81
    .line 82
    iget-object v6, v2, La/lyp0;->d:La/ctf0;

    .line 83
    .line 84
    iget-object v7, v2, La/lyp0;->e:La/typ0;

    .line 85
    .line 86
    iget-object v8, v2, La/lyp0;->f:La/kuy;

    .line 87
    .line 88
    iget-object v2, v2, La/lyp0;->g:La/ii;

    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v9, La/ru;

    .line 109
    .line 110
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v0, v9, La/ru;->a:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v3, v9, La/ru;->b:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v6, v9, La/ru;->e:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v4, v9, La/ru;->c:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v5, v9, La/ru;->d:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v7, v9, La/ru;->f:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v8, v9, La/ru;->g:Ljava/lang/Object;

    .line 126
    .line 127
    new-instance v0, La/psi;

    .line 128
    .line 129
    const/4 v3, 0x2

    .line 130
    const/16 v4, 0x13

    .line 131
    .line 132
    invoke-direct {v0, v9, v3, v4}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, v9, La/ru;->h:Ljava/lang/Object;

    .line 140
    .line 141
    new-instance v0, La/psi;

    .line 142
    .line 143
    invoke-direct {v0, v9, v1, v4}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    iput-object v0, v9, La/ru;->i:Ljava/lang/Object;

    .line 151
    .line 152
    new-instance v0, La/psi;

    .line 153
    .line 154
    const/4 v1, 0x0

    .line 155
    invoke-direct {v0, v9, v1, v4}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 156
    .line 157
    .line 158
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iput-object v0, v9, La/ru;->j:Ljava/lang/Object;

    .line 163
    .line 164
    iget-object v0, v9, La/ru;->j:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, La/n5d0;

    .line 167
    .line 168
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    check-cast v0, La/vwi;

    .line 173
    .line 174
    iput-object v0, p0, La/kyp0;->K1:La/vwi;

    .line 175
    .line 176
    iput-object v2, p0, La/kyp0;->L1:La/ii;

    .line 177
    .line 178
    return-void

    .line 179
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 180
    .line 181
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kyp0;->N1:La/a8z;

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
    new-instance p1, La/hyp0;

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    invoke-direct {p1, p0, p2}, La/hyp0;-><init>(La/kyp0;B)V

    .line 11
    .line 12
    .line 13
    const-string v0, "REQUEST_RESET_FILTERS_DIALOG_KEY"

    .line 14
    .line 15
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, La/iyp0;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, La/iyp0;-><init>(La/kyp0;B)V

    .line 26
    .line 27
    .line 28
    const-string v2, "REQUEST_SEASONS_DIALOG_KEY"

    .line 29
    .line 30
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, La/iyp0;

    .line 38
    .line 39
    invoke-direct {v0, p0, p2}, La/iyp0;-><init>(La/kyp0;B)V

    .line 40
    .line 41
    .line 42
    const-string v2, "REQUEST_SURFACE_TYPES_DIALOG_KEY"

    .line 43
    .line 44
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 45
    .line 46
    .line 47
    sget-object p1, La/kyp0;->R1:[La/iiy;

    .line 48
    .line 49
    aget-object p1, p1, v1

    .line 50
    .line 51
    iget-object v0, p0, La/kyp0;->M1:La/s0r;

    .line 52
    .line 53
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    check-cast p1, La/aid;

    .line 61
    .line 62
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 63
    .line 64
    new-instance v0, La/owp0;

    .line 65
    .line 66
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 67
    .line 68
    .line 69
    new-instance v1, La/l7p0;

    .line 70
    .line 71
    const/16 v2, 0xb

    .line 72
    .line 73
    invoke-direct {v1, p0, v2}, La/l7p0;-><init>(Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    new-instance p0, La/ugd;

    .line 77
    .line 78
    const v2, -0x5638e426

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v2, p2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v0, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/kyp0;->P1:Z

    .line 2
    .line 3
    return p0
.end method
