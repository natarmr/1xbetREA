.class public final La/u2s0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/a0s0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/u2s0;",
        "La/yx5;",
        "La/a0s0;",
        "<init>",
        "()V",
        "a/s2m0",
        "daily_tournament"
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
.field public static final X1:La/s2m0;

.field public static final synthetic Y1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/e9o0;

.field public M1:La/cyi;

.field public final N1:La/kiu0;

.field public final O1:La/n0o0;

.field public final P1:La/cgx0;

.field public final Q1:La/phf0;

.field public final R1:La/phf0;

.field public final S1:La/phf0;

.field public final U1:La/s0r;

.field public final V1:La/n0o0;

.field public final W1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/u2s0;

    .line 4
    .line 5
    const-string v2, "fromGames"

    .line 6
    .line 7
    const-string v3, "getFromGames()Z"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "tournamentTitle"

    .line 16
    .line 17
    const-string v5, "getTournamentTitle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "tournamentBgName"

    .line 25
    .line 26
    const-string v6, "getTournamentBgName()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "tournamentPrizeName"

    .line 34
    .line 35
    const-string v7, "getTournamentPrizeName()Ljava/lang/String;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/j0d0;

    .line 41
    .line 42
    const-string v7, "viewBinding"

    .line 43
    .line 44
    const-string v8, "getViewBinding()Lorg/xplatform/games_section/feature/daily_tournament/databinding/FragmentPagerDailyTournamentBinding;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    new-array v1, v1, [La/iiy;

    .line 51
    .line 52
    aput-object v0, v1, v4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v2, v1, v0

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v5, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v6, v1, v0

    .line 65
    .line 66
    sput-object v1, La/u2s0;->Y1:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/s2m0;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/u2s0;->X1:La/s2m0;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d027a

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/u2s0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/e9o0;

    .line 12
    .line 13
    sget-object v1, La/bp3;->a:La/bp3;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    const v2, 0x7f040ae5

    .line 18
    .line 19
    .line 20
    const v3, 0x7f040ae1

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/u2s0;->L1:La/e9o0;

    .line 27
    .line 28
    new-instance v0, La/s2s0;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {v0, p0, v1}, La/s2s0;-><init>(La/u2s0;B)V

    .line 32
    .line 33
    .line 34
    new-instance v1, La/moq0;

    .line 35
    .line 36
    const/16 v2, 0x12

    .line 37
    .line 38
    invoke-direct {v1, p0, v2}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    sget-object v2, La/wez;->b:La/wez;

    .line 42
    .line 43
    new-instance v3, La/moq0;

    .line 44
    .line 45
    const/16 v4, 0x13

    .line 46
    .line 47
    invoke-direct {v3, v1, v4}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-class v2, La/o6j;

    .line 55
    .line 56
    sget-object v3, La/sre0;->a:La/tre0;

    .line 57
    .line 58
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v3, La/p7r0;

    .line 63
    .line 64
    const/16 v4, 0xc

    .line 65
    .line 66
    invoke-direct {v3, v1, v4}, La/p7r0;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    new-instance v4, La/p7r0;

    .line 70
    .line 71
    const/16 v5, 0xd

    .line 72
    .line 73
    invoke-direct {v4, v1, v5}, La/p7r0;-><init>(La/a8z;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, La/u2s0;->N1:La/kiu0;

    .line 81
    .line 82
    new-instance v0, La/s2s0;

    .line 83
    .line 84
    const/4 v1, 0x2

    .line 85
    invoke-direct {v0, p0, v1}, La/s2s0;-><init>(La/u2s0;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, La/u2s0;->O1:La/n0o0;

    .line 93
    .line 94
    new-instance v0, La/cgx0;

    .line 95
    .line 96
    const-string v1, "FROM_GAMES"

    .line 97
    .line 98
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, La/u2s0;->P1:La/cgx0;

    .line 102
    .line 103
    new-instance v0, La/phf0;

    .line 104
    .line 105
    const-string v1, "TOURNAMENT_TITLE"

    .line 106
    .line 107
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p0, La/u2s0;->Q1:La/phf0;

    .line 111
    .line 112
    new-instance v0, La/phf0;

    .line 113
    .line 114
    const-string v1, "TOURNAMENT_BG_NAME"

    .line 115
    .line 116
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, La/u2s0;->R1:La/phf0;

    .line 120
    .line 121
    new-instance v0, La/phf0;

    .line 122
    .line 123
    const-string v1, "TOURNAMENT_PRIZE_NAME"

    .line 124
    .line 125
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p0, La/u2s0;->S1:La/phf0;

    .line 129
    .line 130
    sget-object v0, La/t2s0;->a:La/t2s0;

    .line 131
    .line 132
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iput-object v0, p0, La/u2s0;->U1:La/s0r;

    .line 137
    .line 138
    new-instance v0, La/s2s0;

    .line 139
    .line 140
    const/4 v1, 0x3

    .line 141
    invoke-direct {v0, p0, v1}, La/s2s0;-><init>(La/u2s0;B)V

    .line 142
    .line 143
    .line 144
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-object v0, p0, La/u2s0;->V1:La/n0o0;

    .line 149
    .line 150
    new-instance v0, La/s2s0;

    .line 151
    .line 152
    const/4 v1, 0x4

    .line 153
    invoke-direct {v0, p0, v1}, La/s2s0;-><init>(La/u2s0;B)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iput-object v0, p0, La/u2s0;->W1:La/n0o0;

    .line 161
    .line 162
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 12

    .line 1
    new-instance p1, La/s2s0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/s2s0;-><init>(La/u2s0;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p1, p1, La/o2r;->i:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 15
    .line 16
    const v1, 0x7f0f001b

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->l(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p1, p1, La/o2r;->i:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const v2, 0x7f080654

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p1, p1, La/o2r;->i:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 47
    .line 48
    new-instance v1, La/jpe0;

    .line 49
    .line 50
    const/16 v2, 0xe

    .line 51
    .line 52
    invoke-direct {v1, p0, v2}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object p1, p1, La/o2r;->i:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 63
    .line 64
    new-instance v1, La/b0l0;

    .line 65
    .line 66
    const/16 v2, 0x15

    .line 67
    .line 68
    invoke-direct {v1, p0, v2}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(La/hwq0;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p1, p1, La/o2r;->e:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 79
    .line 80
    const/4 v1, 0x1

    .line 81
    sget-object v2, La/u2s0;->Y1:[La/iiy;

    .line 82
    .line 83
    aget-object v1, v2, v1

    .line 84
    .line 85
    iget-object v3, p0, La/u2s0;->Q1:La/phf0;

    .line 86
    .line 87
    invoke-virtual {v3, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setTitle(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object p1, p1, La/o2r;->e:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 99
    .line 100
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    const v3, 0x7f040ae5

    .line 107
    .line 108
    .line 109
    invoke-static {v1, v3, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setContentScrimColor(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iget-object p1, p1, La/o2r;->e:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 121
    .line 122
    const v1, 0x7f140393

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setExpandedTitleTextAppearance(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget-object p1, p1, La/o2r;->e:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 133
    .line 134
    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setCollapsedTitleTextAppearance(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object p1, p1, La/o2r;->e:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 142
    .line 143
    const/4 v1, -0x1

    .line 144
    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setStatusBarScrimColor(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iget-object p1, p1, La/o2r;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 152
    .line 153
    iget-object v1, p0, La/u2s0;->V1:La/n0o0;

    .line 154
    .line 155
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, La/ub3;

    .line 160
    .line 161
    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/AppBarLayout;->a(La/ub3;)V

    .line 162
    .line 163
    .line 164
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 165
    .line 166
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iget-object v3, p1, La/o2r;->f:Lorg/xplatform/games_section/feature/daily_tournament/presentation/ForegroundImageView;

    .line 171
    .line 172
    const/4 p1, 0x2

    .line 173
    aget-object p1, v2, p1

    .line 174
    .line 175
    iget-object v1, p0, La/u2s0;->R1:La/phf0;

    .line 176
    .line 177
    invoke-virtual {v1, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {p1}, La/ghm0;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    sget-object p1, La/h2x;->a:La/h2x;

    .line 186
    .line 187
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    const/4 v9, 0x0

    .line 192
    const/16 v10, 0x1cc

    .line 193
    .line 194
    const v5, 0x7f080e2a

    .line 195
    .line 196
    .line 197
    const/4 v6, 0x0

    .line 198
    const/4 v8, 0x0

    .line 199
    invoke-static/range {v3 .. v10}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    iget-object v3, v1, La/o2r;->g:Landroid/widget/ImageView;

    .line 207
    .line 208
    const/4 v1, 0x3

    .line 209
    aget-object v4, v2, v1

    .line 210
    .line 211
    iget-object v11, p0, La/u2s0;->S1:La/phf0;

    .line 212
    .line 213
    invoke-virtual {v11, p0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-lez v4, :cond_0

    .line 222
    .line 223
    aget-object v4, v2, v1

    .line 224
    .line 225
    invoke-virtual {v11, p0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {v4}, La/ghm0;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    const/4 v9, 0x0

    .line 238
    const/16 v10, 0x1cc

    .line 239
    .line 240
    const v5, 0x7f080e2a

    .line 241
    .line 242
    .line 243
    const/4 v6, 0x0

    .line 244
    const/4 v8, 0x0

    .line 245
    invoke-static/range {v3 .. v10}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 246
    .line 247
    .line 248
    :cond_0
    aget-object p1, v2, v1

    .line 249
    .line 250
    invoke-virtual {v11, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-nez p1, :cond_1

    .line 259
    .line 260
    const/4 p1, 0x4

    .line 261
    goto :goto_0

    .line 262
    :cond_1
    move p1, v0

    .line 263
    :goto_0
    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    iget-object p1, p1, La/o2r;->l:Landroidx/viewpager2/widget/ViewPager2;

    .line 271
    .line 272
    new-instance v1, La/u7s0;

    .line 273
    .line 274
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    iget-object v3, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 279
    .line 280
    invoke-direct {v1, v2, v3}, La/f5r;-><init>(Landroidx/fragment/app/e;La/glz;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    iget-object p1, p1, La/o2r;->l:Landroidx/viewpager2/widget/ViewPager2;

    .line 291
    .line 292
    iget-object v1, p0, La/u2s0;->W1:La/n0o0;

    .line 293
    .line 294
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    check-cast v1, La/nju0;

    .line 299
    .line 300
    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 301
    .line 302
    .line 303
    new-instance p1, La/uii;

    .line 304
    .line 305
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    iget-object v1, v1, La/o2r;->h:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 310
    .line 311
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    iget-object v2, v2, La/o2r;->l:Landroidx/viewpager2/widget/ViewPager2;

    .line 316
    .line 317
    new-instance v3, La/lcr0;

    .line 318
    .line 319
    const/16 v4, 0x8

    .line 320
    .line 321
    invoke-direct {v3, p0, v4}, La/lcr0;-><init>(Ljava/lang/Object;B)V

    .line 322
    .line 323
    .line 324
    invoke-direct {p1, v1, v2, v3}, La/uii;-><init>(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Landroidx/viewpager2/widget/ViewPager2;Lkotlin/jvm/functions/Function1;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1}, La/uii;->b()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    iget-object p0, p0, La/o2r;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 335
    .line 336
    invoke-static {p0, v0}, La/knm0;->i(Landroid/view/View;Z)V

    .line 337
    .line 338
    .line 339
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/u2s0;->O1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/dyi;

    .line 8
    .line 9
    iget-object v0, v0, La/dyi;->f:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/cyi;

    .line 16
    .line 17
    iput-object v0, p0, La/u2s0;->M1:La/cyi;

    .line 18
    .line 19
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/u2s0;->H0()La/o6j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/o6j;->k:La/p7m0;

    .line 6
    .line 7
    new-instance v4, La/rtq0;

    .line 8
    .line 9
    const/4 v0, 0x5

    .line 10
    const/4 v5, 0x0

    .line 11
    invoke-direct {v4, p0, v5, v0}, La/rtq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v1, La/tsr0;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-direct/range {v1 .. v6}, La/tsr0;-><init>(La/gmq;La/clz;La/rtq0;La/yje;B)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final G0()La/o2r;
    .locals 2

    .line 1
    sget-object v0, La/u2s0;->Y1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/u2s0;->U1:La/s0r;

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
    check-cast p0, La/o2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/o6j;
    .locals 0

    .line 1
    iget-object p0, p0, La/u2s0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/o6j;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/o2r;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 6
    .line 7
    iget-object v1, p0, La/u2s0;->V1:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/ub3;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout;->f(La/ub3;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/u2s0;->G0()La/o2r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/o2r;->l:Landroidx/viewpager2/widget/ViewPager2;

    .line 23
    .line 24
    iget-object v1, p0, La/u2s0;->W1:La/n0o0;

    .line 25
    .line 26
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, La/nju0;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, La/u2s0;->H0()La/o6j;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, La/o6j;->j:La/p7m0;

    .line 40
    .line 41
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-super {p0}, La/yx5;->Z()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final s()La/dyi;
    .locals 0

    .line 1
    iget-object p0, p0, La/u2s0;->O1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/dyi;

    .line 8
    .line 9
    return-object p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u2s0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u2s0;->L1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
