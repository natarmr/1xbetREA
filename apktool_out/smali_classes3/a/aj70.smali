.class public La/aj70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/aj70;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xi70",
        "core"
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
.field public static final P1:La/xi70;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/wdk0;

.field public M1:La/q6i;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/aj70;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/core/databinding/FragmentGamesOptionsBinding;"

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
    sput-object v1, La/aj70;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xi70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/aj70;->P1:La/xi70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0248

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/aj70;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/pu50;

    .line 12
    .line 13
    const/16 v1, 0x1c

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La/pu50;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/gg70;

    .line 19
    .line 20
    const/16 v2, 0x8

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/gg70;

    .line 28
    .line 29
    const/16 v4, 0x9

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/tj70;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/ph70;

    .line 47
    .line 48
    const/4 v4, 0x4

    .line 49
    invoke-direct {v3, v1, v4}, La/ph70;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v4, La/ph70;

    .line 53
    .line 54
    const/4 v5, 0x5

    .line 55
    invoke-direct {v4, v1, v5}, La/ph70;-><init>(La/a8z;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, La/aj70;->N1:La/kiu0;

    .line 63
    .line 64
    sget-object v0, La/yi70;->a:La/yi70;

    .line 65
    .line 66
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, La/aj70;->O1:La/s0r;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 1

    .line 1
    invoke-static {p0}, La/sac;->O(Landroidx/fragment/app/Fragment;)La/h5t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p0}, La/h5t;->p(La/aj70;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final G0()La/m0r;
    .locals 2

    .line 1
    sget-object v0, La/aj70;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/aj70;->O1:La/s0r;

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
    check-cast p0, La/m0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/tj70;
    .locals 0

    .line 1
    iget-object p0, p0, La/aj70;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/tj70;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, La/aj70;->G0()La/m0r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, La/m0r;->l:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/aj70;->G0()La/m0r;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/m0r;->h:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p0}, La/aj70;->G0()La/m0r;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, La/m0r;->k:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    const/16 v1, 0x8

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    move v3, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v3, v1

    .line 42
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/aj70;->G0()La/m0r;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p0, p0, La/m0r;->g:Landroid/widget/LinearLayout;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    move v1, v2

    .line 54
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/aj70;->H0()La/tj70;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/tj70;->x()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 10
    .line 11
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 p2, 0x1d

    .line 10
    .line 11
    if-lt p1, p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/aj70;->G0()La/m0r;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p1, p1, La/m0r;->j:Landroid/view/View;

    .line 18
    .line 19
    invoke-static {p1}, La/xl50;->u(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, La/aj70;->G0()La/m0r;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p1, p1, La/m0r;->b:Landroid/widget/LinearLayout;

    .line 27
    .line 28
    new-instance p2, La/l910;

    .line 29
    .line 30
    const/16 v0, 0xa

    .line 31
    .line 32
    invoke-direct {p2, p0, v0}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/aj70;->G0()La/m0r;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p1, p1, La/m0r;->g:Landroid/widget/LinearLayout;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, La/aj70;->G0()La/m0r;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p1, p1, La/m0r;->g:Landroid/widget/LinearLayout;

    .line 53
    .line 54
    sget-object v0, La/ymx;->e:La/ymx;

    .line 55
    .line 56
    new-instance v1, La/wi70;

    .line 57
    .line 58
    invoke-direct {v1, p0, p2}, La/wi70;-><init>(La/aj70;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v0, v1}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/aj70;->G0()La/m0r;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p1, p1, La/m0r;->k:Landroid/widget/LinearLayout;

    .line 69
    .line 70
    new-instance v1, La/wi70;

    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    invoke-direct {v1, p0, v2}, La/wi70;-><init>(La/aj70;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v0, v1}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, La/aj70;->H0()La/tj70;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p1, p1, La/tj70;->p:La/q99;

    .line 84
    .line 85
    invoke-static {p1}, La/xkb;->V(La/htb;)La/itb;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance v0, La/zi70;

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    invoke-direct {v0, p0, v1, p2}, La/zi70;-><init>(La/aj70;La/yje;B)V

    .line 93
    .line 94
    .line 95
    sget-object v3, La/lkz;->a:La/lkz;

    .line 96
    .line 97
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    new-instance v5, La/az60;

    .line 110
    .line 111
    invoke-direct {v5, p1, v3, v0, v1}, La/az60;-><init>(La/itb;La/clz;La/zi70;La/yje;)V

    .line 112
    .line 113
    .line 114
    const/4 p1, 0x3

    .line 115
    invoke-static {v4, v1, v1, v5, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, La/aj70;->H0()La/tj70;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v0, v0, La/tj70;->q:La/p7m0;

    .line 123
    .line 124
    new-instance v3, La/zi70;

    .line 125
    .line 126
    invoke-direct {v3, p0, v1, v2}, La/zi70;-><init>(La/aj70;La/yje;B)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    new-instance v6, La/az60;

    .line 142
    .line 143
    invoke-direct {v6, v0, v4, v3, v1}, La/az60;-><init>(La/gmq;La/clz;La/zi70;La/yje;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v5, v1, v1, v6, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, La/aj70;->H0()La/tj70;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    iget-boolean p1, p0, La/tj70;->t:Z

    .line 154
    .line 155
    if-nez p1, :cond_2

    .line 156
    .line 157
    new-instance p1, La/cj70;

    .line 158
    .line 159
    iget-object v0, p0, La/tj70;->f:La/vcu;

    .line 160
    .line 161
    invoke-virtual {v0}, La/vcu;->a()La/vrs;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sget-object v1, La/vrs;->a:La/vrs;

    .line 166
    .line 167
    if-ne v0, v1, :cond_1

    .line 168
    .line 169
    move p2, v2

    .line 170
    :cond_1
    invoke-direct {p1, p2}, La/cj70;-><init>(Z)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p1}, La/tj70;->z(La/dj70;)V

    .line 174
    .line 175
    .line 176
    :cond_2
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/aj70;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
