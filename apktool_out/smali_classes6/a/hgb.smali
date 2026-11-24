.class public final La/hgb;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/hgb;",
        "La/yx5;",
        "",
        "<init>",
        "()V",
        "a/kl5",
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
.field public static final c2:La/kl5;

.field public static final synthetic d2:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/e9o0;

.field public final M1:Z

.field public final N1:La/r34;

.field public final O1:La/khf0;

.field public final P1:La/phf0;

.field public Q1:La/fiu0;

.field public R1:La/zfb;

.field public final S1:Ljava/util/HashMap;

.field public final U1:La/d930;

.field public V1:I

.field public final W1:La/s0r;

.field public X1:La/jk3;

.field public final Y1:La/v62;

.field public final Z1:La/tvj;

.field public final a2:La/kiu0;

.field public final b2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/hgb;

    .line 4
    .line 5
    const-string v2, "sportId"

    .line 6
    .line 7
    const-string v3, "getSportId()J"

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
    const-string v3, "stageId"

    .line 16
    .line 17
    const-string v5, "getStageId()Lorg/xplatform/statistic/stage/api/domain/TypeStageId;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "title"

    .line 25
    .line 26
    const-string v6, "getTitle()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "binding"

    .line 34
    .line 35
    const-string v7, "getBinding()Lorg/xplatform/statistic/stage/impl/databinding/FragmentChampStatisticTourNetBinding;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/hgb;->d2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/kl5;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/hgb;->c2:La/kl5;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d0211

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
    iput-object v0, p0, La/hgb;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/e9o0;

    .line 12
    .line 13
    const v1, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    const v2, 0x7f040ae3

    .line 17
    .line 18
    .line 19
    const/16 v3, 0xc

    .line 20
    .line 21
    invoke-direct {v0, v1, v2, v3}, La/e9o0;-><init>(III)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/hgb;->L1:La/e9o0;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, La/hgb;->M1:Z

    .line 28
    .line 29
    new-instance v1, La/r34;

    .line 30
    .line 31
    const-string v2, "SPORT_ID"

    .line 32
    .line 33
    invoke-direct {v1, v2}, La/r34;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/hgb;->N1:La/r34;

    .line 37
    .line 38
    new-instance v1, La/khf0;

    .line 39
    .line 40
    const-string v2, "STAGE_ID"

    .line 41
    .line 42
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, La/hgb;->O1:La/khf0;

    .line 46
    .line 47
    new-instance v1, La/phf0;

    .line 48
    .line 49
    const-string v2, "TITLE"

    .line 50
    .line 51
    invoke-direct {v1, v2}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, La/hgb;->P1:La/phf0;

    .line 55
    .line 56
    new-instance v1, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v1, p0, La/hgb;->S1:Ljava/util/HashMap;

    .line 62
    .line 63
    new-instance v1, La/d930;

    .line 64
    .line 65
    invoke-direct {v1, v0}, La/d930;-><init>(B)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, La/hgb;->U1:La/d930;

    .line 69
    .line 70
    sget-object v1, La/egb;->a:La/egb;

    .line 71
    .line 72
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, p0, La/hgb;->W1:La/s0r;

    .line 77
    .line 78
    new-instance v1, La/v62;

    .line 79
    .line 80
    const/4 v2, 0x6

    .line 81
    invoke-direct {v1, p0, v2}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, La/hgb;->Y1:La/v62;

    .line 85
    .line 86
    new-instance v1, La/tvj;

    .line 87
    .line 88
    new-instance v2, La/bgb;

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    invoke-direct {v2, p0, v4}, La/bgb;-><init>(La/hgb;B)V

    .line 92
    .line 93
    .line 94
    new-instance v5, La/bgb;

    .line 95
    .line 96
    invoke-direct {v5, p0, v0}, La/bgb;-><init>(La/hgb;B)V

    .line 97
    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    const/16 v7, 0x33

    .line 101
    .line 102
    invoke-direct {v1, v2, v5, v6, v7}, La/tvj;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 103
    .line 104
    .line 105
    iput-object v1, p0, La/hgb;->Z1:La/tvj;

    .line 106
    .line 107
    new-instance v1, La/dgb;

    .line 108
    .line 109
    invoke-direct {v1, p0, v4}, La/dgb;-><init>(La/hgb;B)V

    .line 110
    .line 111
    .line 112
    new-instance v2, La/h79;

    .line 113
    .line 114
    invoke-direct {v2, p0, v3}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    sget-object v3, La/wez;->b:La/wez;

    .line 118
    .line 119
    new-instance v4, La/h79;

    .line 120
    .line 121
    const/16 v5, 0xd

    .line 122
    .line 123
    invoke-direct {v4, v2, v5}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const-class v4, La/jgb;

    .line 131
    .line 132
    sget-object v5, La/sre0;->a:La/tre0;

    .line 133
    .line 134
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    new-instance v5, La/rt6;

    .line 139
    .line 140
    const/16 v6, 0x1a

    .line 141
    .line 142
    invoke-direct {v5, v2, v6}, La/rt6;-><init>(La/a8z;B)V

    .line 143
    .line 144
    .line 145
    new-instance v6, La/rt6;

    .line 146
    .line 147
    const/16 v7, 0x1b

    .line 148
    .line 149
    invoke-direct {v6, v2, v7}, La/rt6;-><init>(La/a8z;B)V

    .line 150
    .line 151
    .line 152
    invoke-static {p0, v4, v5, v6, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iput-object v1, p0, La/hgb;->a2:La/kiu0;

    .line 157
    .line 158
    new-instance v1, La/dgb;

    .line 159
    .line 160
    invoke-direct {v1, p0, v0}, La/dgb;-><init>(La/hgb;B)V

    .line 161
    .line 162
    .line 163
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iput-object v0, p0, La/hgb;->b2:La/a8z;

    .line 168
    .line 169
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, La/qem0;->r(Landroid/content/Context;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    xor-int/lit8 v5, p1, 0x1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, La/qem0;->r(Landroid/content/Context;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    xor-int/lit8 v6, p1, 0x1

    .line 37
    .line 38
    const v3, 0x7f040ae3

    .line 39
    .line 40
    .line 41
    const v4, 0x7f040ae3

    .line 42
    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, La/ofm0;->y(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 60
    .line 61
    iput v1, p0, La/hgb;->V1:I

    .line 62
    .line 63
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    const/16 v2, 0x1d

    .line 66
    .line 67
    if-le v1, v2, :cond_1

    .line 68
    .line 69
    const/16 v1, 0x30

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    const/16 v1, 0x10

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 78
    .line 79
    .line 80
    :goto_0
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object p1, p1, La/xyq;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 85
    .line 86
    new-instance v1, La/peg0;

    .line 87
    .line 88
    const/16 v2, 0x14

    .line 89
    .line 90
    invoke-direct {v1, p0, v2}, La/peg0;-><init>(Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 94
    .line 95
    invoke-static {p1, v1}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget-object p1, p1, La/xyq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 103
    .line 104
    invoke-static {p1, v0, v0}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iget-object p1, p1, La/xyq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 112
    .line 113
    sget-object v1, La/hgb;->d2:[La/iiy;

    .line 114
    .line 115
    const/4 v2, 0x2

    .line 116
    aget-object v1, v1, v2

    .line 117
    .line 118
    iget-object v3, p0, La/hgb;->P1:La/phf0;

    .line 119
    .line 120
    invoke-virtual {v3, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object p1, p1, La/xyq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 132
    .line 133
    new-instance v1, La/dgb;

    .line 134
    .line 135
    invoke-direct {v1, p0, v2}, La/dgb;-><init>(La/hgb;B)V

    .line 136
    .line 137
    .line 138
    invoke-static {p1, v1}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget-object p1, p1, La/xyq;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 146
    .line 147
    invoke-static {p1}, La/jk3;->b(Landroid/view/ViewGroup;)La/jk3;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iput-object p1, p0, La/hgb;->X1:La/jk3;

    .line 152
    .line 153
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget-object p1, p1, La/xyq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 158
    .line 159
    new-instance v1, La/dgb;

    .line 160
    .line 161
    const/4 v3, 0x3

    .line 162
    invoke-direct {v1, p0, v3}, La/dgb;-><init>(La/hgb;B)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1, v1}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 166
    .line 167
    .line 168
    new-instance v4, La/hc50;

    .line 169
    .line 170
    sget-object v6, La/ybg0;->a:La/ybg0;

    .line 171
    .line 172
    new-instance v8, La/dgb;

    .line 173
    .line 174
    const/4 v1, 0x4

    .line 175
    invoke-direct {v8, p0, v1}, La/dgb;-><init>(La/hgb;B)V

    .line 176
    .line 177
    .line 178
    const/16 v9, 0x7f0

    .line 179
    .line 180
    const-string v5, "search"

    .line 181
    .line 182
    const v7, 0x7f080bc3

    .line 183
    .line 184
    .line 185
    invoke-direct/range {v4 .. v9}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 186
    .line 187
    .line 188
    filled-new-array {v4}, [La/hc50;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {v1}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 197
    .line 198
    .line 199
    const-string v1, "search"

    .line 200
    .line 201
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->g(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    new-instance v1, La/dgb;

    .line 205
    .line 206
    const/4 v3, 0x5

    .line 207
    invoke-direct {v1, p0, v3}, La/dgb;-><init>(La/hgb;B)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setOnHideSearchBarClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 211
    .line 212
    .line 213
    const v1, 0x7f13163f

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setSearchFieldHint(Ljava/lang/CharSequence;)V

    .line 221
    .line 222
    .line 223
    new-instance v1, La/cgb;

    .line 224
    .line 225
    invoke-direct {v1, p0, v0}, La/cgb;-><init>(La/hgb;B)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->e(Lkotlin/jvm/functions/Function1;)V

    .line 229
    .line 230
    .line 231
    iget-object p1, p0, La/hgb;->X1:La/jk3;

    .line 232
    .line 233
    if-eqz p1, :cond_2

    .line 234
    .line 235
    iget-object p1, p1, La/jk3;->d:Landroid/view/View;

    .line 236
    .line 237
    check-cast p1, Landroid/widget/ImageView;

    .line 238
    .line 239
    new-instance v0, La/cgb;

    .line 240
    .line 241
    invoke-direct {v0, p0, v2}, La/cgb;-><init>(La/hgb;B)V

    .line 242
    .line 243
    .line 244
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 245
    .line 246
    .line 247
    :cond_2
    iget-object p1, p0, La/hgb;->X1:La/jk3;

    .line 248
    .line 249
    if-eqz p1, :cond_3

    .line 250
    .line 251
    iget-object p1, p1, La/jk3;->c:Landroid/view/View;

    .line 252
    .line 253
    check-cast p1, Landroid/widget/ImageView;

    .line 254
    .line 255
    new-instance v0, La/cgb;

    .line 256
    .line 257
    const/4 v1, 0x0

    .line 258
    invoke-direct {v0, p0, v1}, La/cgb;-><init>(La/hgb;B)V

    .line 259
    .line 260
    .line 261
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 262
    .line 263
    .line 264
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-virtual {p1}, La/n6r;->b()V

    .line 269
    .line 270
    .line 271
    iget-object p1, p1, La/n6r;->c:La/glz;

    .line 272
    .line 273
    iget-object p0, p0, La/hgb;->Z1:La/tvj;

    .line 274
    .line 275
    invoke-virtual {p1, p0}, La/glz;->a(La/blz;)V

    .line 276
    .line 277
    .line 278
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/hgb;->b2:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/mwi;

    .line 8
    .line 9
    invoke-virtual {v0}, La/mwi;->a()La/fiu0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/hgb;->Q1:La/fiu0;

    .line 14
    .line 15
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/hgb;->H0()La/jgb;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/jgb;->j:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, La/lkz;->a:La/lkz;

    .line 12
    .line 13
    new-instance v1, La/ggb;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v1, p0, v3, v2}, La/ggb;-><init>(La/hgb;La/yje;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, La/yxa;

    .line 33
    .line 34
    invoke-direct {v5, v0, v2, v1, v3}, La/yxa;-><init>(La/xae0;La/clz;La/ggb;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/hgb;->H0()La/jgb;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, La/jgb;->k:La/p7m0;

    .line 46
    .line 47
    new-instance v2, La/ggb;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-direct {v2, p0, v3, v4}, La/ggb;-><init>(La/hgb;La/yje;B)V

    .line 51
    .line 52
    .line 53
    sget-object v4, La/lkz;->a:La/lkz;

    .line 54
    .line 55
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    new-instance v6, La/yxa;

    .line 68
    .line 69
    invoke-direct {v6, v1, v4, v2, v3}, La/yxa;-><init>(La/gmq;La/clz;La/ggb;La/yje;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v5, v3, v3, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/hgb;->H0()La/jgb;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v1, v1, La/jgb;->l:La/qoj0;

    .line 80
    .line 81
    invoke-static {v1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    new-instance v2, La/ggb;

    .line 86
    .line 87
    const/4 v4, 0x2

    .line 88
    invoke-direct {v2, p0, v3, v4}, La/ggb;-><init>(La/hgb;La/yje;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    new-instance v5, La/yxa;

    .line 104
    .line 105
    invoke-direct {v5, v1, p0, v2, v3}, La/yxa;-><init>(La/vae0;La/clz;La/ggb;La/yje;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final G0()La/xyq;
    .locals 2

    .line 1
    sget-object v0, La/hgb;->d2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hgb;->W1:La/s0r;

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
    check-cast p0, La/xyq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/jgb;
    .locals 0

    .line 1
    iget-object p0, p0, La/hgb;->a2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/jgb;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Ljava/util/List;Z)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, La/hgb;->K0(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, La/hgb;->G0()La/xyq;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v2, v2, La/xyq;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 12
    .line 13
    const/16 v3, 0x8

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, La/hgb;->G0()La/xyq;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v2, v2, La/xyq;->b:Landroid/widget/FrameLayout;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/adapter/LinearLayoutManagerWithAccurateOffset;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-direct {v2, v3}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/adapter/LinearLayoutManagerWithAccurateOffset;-><init>(Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, La/hgb;->G0()La/xyq;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v3, v3, La/xyq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/zfb;

    .line 46
    .line 47
    new-instance v5, La/o47;

    .line 48
    .line 49
    invoke-virtual {v0}, La/hgb;->H0()La/jgb;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    const/4 v11, 0x0

    .line 54
    const/16 v12, 0x15

    .line 55
    .line 56
    const/4 v6, 0x2

    .line 57
    const-class v16, La/jgb;

    .line 58
    .line 59
    const-string v9, "showBottomSheet"

    .line 60
    .line 61
    const-string v10, "showBottomSheet(Lorg/xplatform/statistic/stage/impl/stage_net/presentation/models/NetCellUiModel;Ljava/lang/String;)V"

    .line 62
    .line 63
    move-object/from16 v8, v16

    .line 64
    .line 65
    invoke-direct/range {v5 .. v12}, La/o47;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 66
    .line 67
    .line 68
    new-instance v13, La/vra;

    .line 69
    .line 70
    invoke-virtual {v0}, La/hgb;->H0()La/jgb;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    const/16 v19, 0x0

    .line 75
    .line 76
    const/16 v20, 0x1c

    .line 77
    .line 78
    const/4 v14, 0x1

    .line 79
    const-string v17, "onClickGameItem"

    .line 80
    .line 81
    const-string v18, "onClickGameItem(Lorg/xplatform/statistic/stage/impl/stage_net/presentation/models/NetCellUiModel;)V"

    .line 82
    .line 83
    invoke-direct/range {v13 .. v20}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 84
    .line 85
    .line 86
    move-object v8, v13

    .line 87
    new-instance v13, La/o47;

    .line 88
    .line 89
    invoke-virtual {v0}, La/hgb;->H0()La/jgb;

    .line 90
    .line 91
    .line 92
    move-result-object v15

    .line 93
    const/16 v20, 0x16

    .line 94
    .line 95
    const/4 v14, 0x2

    .line 96
    const-string v17, "onClickTab"

    .line 97
    .line 98
    const-string v18, "onClickTab(II)V"

    .line 99
    .line 100
    invoke-direct/range {v13 .. v20}, La/o47;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 101
    .line 102
    .line 103
    iget-object v10, v0, La/hgb;->U1:La/d930;

    .line 104
    .line 105
    iget-object v6, v0, La/hgb;->S1:Ljava/util/HashMap;

    .line 106
    .line 107
    move/from16 v11, p2

    .line 108
    .line 109
    move-object v7, v5

    .line 110
    move-object v9, v13

    .line 111
    move-object/from16 v5, p1

    .line 112
    .line 113
    invoke-direct/range {v4 .. v11}, La/zfb;-><init>(Ljava/util/List;Ljava/util/HashMap;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;La/d930;Z)V

    .line 114
    .line 115
    .line 116
    iput-object v4, v0, La/hgb;->R1:La/zfb;

    .line 117
    .line 118
    invoke-virtual {v0}, La/hgb;->G0()La/xyq;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iget-object v2, v2, La/xyq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 123
    .line 124
    iget-object v3, v0, La/hgb;->R1:La/zfb;

    .line 125
    .line 126
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, La/hgb;->G0()La/xyq;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    iget-object v2, v2, La/xyq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 134
    .line 135
    const/4 v3, 0x1

    .line 136
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, La/hgb;->G0()La/xyq;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    iget-object v2, v2, La/xyq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 144
    .line 145
    new-instance v3, La/fgb;

    .line 146
    .line 147
    invoke-direct {v3, v0, v1}, La/fgb;-><init>(La/yx5;B)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(La/jhe0;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, La/hgb;->G0()La/xyq;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget-object v1, v1, La/xyq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 158
    .line 159
    new-instance v2, La/twk;

    .line 160
    .line 161
    iget-object v0, v0, La/hgb;->R1:La/zfb;

    .line 162
    .line 163
    if-nez v0, :cond_0

    .line 164
    .line 165
    return-void

    .line 166
    :cond_0
    invoke-direct {v2, v0}, La/twk;-><init>(La/zfb;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public final J0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f05000f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const v0, 0x7f0d0576

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const v0, 0x7f0d0575

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p0, p0, La/xyq;->e:Lorg/xplatform/ui_core/viewcomponents/layouts/linear/ShimmerLinearLayout;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/ShimmerLinearLayout;->setShimmerItems(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    if-eqz p1, :cond_2

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/16 p1, 0x8

    .line 41
    .line 42
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final K0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/xyq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 v1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/hgb;->J0(Z)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final L0(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, La/ypm;->b:La/ypm;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, La/ypm;->a:La/ypm;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/xyq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 13
    .line 14
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, La/wf40;->d(La/ypm;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, La/xyq;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 24
    .line 25
    const-string p1, "search"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v1, p0, La/hgb;->V1:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/hgb;->G0()La/xyq;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, La/xyq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, La/hgb;->R1:La/zfb;

    .line 28
    .line 29
    invoke-virtual {p0}, La/hgb;->H0()La/jgb;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    iput-boolean v1, v0, La/jgb;->q:Z

    .line 35
    .line 36
    iget-object v1, v0, La/jgb;->k:La/p7m0;

    .line 37
    .line 38
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    instance-of v2, v2, La/o26;

    .line 43
    .line 44
    if-nez v2, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    instance-of v1, v1, La/n26;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    :cond_0
    invoke-virtual {v0}, La/jgb;->y()V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, La/n6r;->b()V

    .line 62
    .line 63
    .line 64
    iget-object v0, v0, La/n6r;->c:La/glz;

    .line 65
    .line 66
    iget-object p0, p0, La/hgb;->Z1:La/tvj;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, La/glz;->f(La/blz;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/hgb;->M1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hgb;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hgb;->L1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
