.class public final La/vvn0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vvn0;",
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
.field public static final W1:La/j6m0;

.field public static final synthetic X1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:La/hnm0;

.field public final M1:Z

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public final P1:La/a8z;

.field public final Q1:La/a8z;

.field public final R1:La/a8z;

.field public final S1:La/s0r;

.field public final U1:La/a8z;

.field public final V1:La/eyg0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/vvn0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/swipex/impl/databinding/SwipexFragmentBinding;"

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
    sput-object v1, La/vvn0;->X1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/j6m0;

    .line 21
    .line 22
    const/16 v1, 0x8

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/j6m0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/vvn0;->W1:La/j6m0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d05a6

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
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    const v3, 0x7f040ae1

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/vvn0;->K1:La/e9o0;

    .line 21
    .line 22
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 23
    .line 24
    iput-object v0, p0, La/vvn0;->L1:La/hnm0;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, La/vvn0;->M1:Z

    .line 28
    .line 29
    new-instance v0, La/qvn0;

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    invoke-direct {v0, p0, v1}, La/qvn0;-><init>(La/vvn0;B)V

    .line 33
    .line 34
    .line 35
    sget-object v1, La/wez;->b:La/wez;

    .line 36
    .line 37
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/vvn0;->P1:La/a8z;

    .line 42
    .line 43
    new-instance v0, La/qvn0;

    .line 44
    .line 45
    const/4 v2, 0x5

    .line 46
    invoke-direct {v0, p0, v2}, La/qvn0;-><init>(La/vvn0;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/vvn0;->Q1:La/a8z;

    .line 54
    .line 55
    const-class v0, La/zyn0;

    .line 56
    .line 57
    sget-object v2, La/sre0;->a:La/tre0;

    .line 58
    .line 59
    invoke-virtual {v2, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v2, La/qvn0;

    .line 64
    .line 65
    const/4 v3, 0x6

    .line 66
    invoke-direct {v2, p0, v3}, La/qvn0;-><init>(La/vvn0;B)V

    .line 67
    .line 68
    .line 69
    const/16 v3, 0xe

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-static {p0, v0, v4, v2, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/vvn0;->R1:La/a8z;

    .line 77
    .line 78
    sget-object v0, La/uvn0;->a:La/uvn0;

    .line 79
    .line 80
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, La/vvn0;->S1:La/s0r;

    .line 85
    .line 86
    new-instance v0, La/a7n0;

    .line 87
    .line 88
    const/16 v2, 0x15

    .line 89
    .line 90
    invoke-direct {v0, v2}, La/a7n0;-><init>(B)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, La/vvn0;->U1:La/a8z;

    .line 98
    .line 99
    new-instance v0, La/eyg0;

    .line 100
    .line 101
    const/16 v1, 0x1b

    .line 102
    .line 103
    invoke-direct {v0, p0, v1}, La/eyg0;-><init>(Ljava/lang/Object;B)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, La/vvn0;->V1:La/eyg0;

    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/ugf0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, La/ugf0;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-static {p1, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/vvn0;->I0()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    sget-object p1, La/rna;->d:La/rna;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p1, La/rna;->c:La/rna;

    .line 25
    .line 26
    :goto_0
    new-instance v0, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 27
    .line 28
    iget-object v1, p0, La/vvn0;->V1:La/eyg0;

    .line 29
    .line 30
    invoke-direct {v0, v1, p1}, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;-><init>(La/qna;La/rna;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p1, p1, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 47
    .line 48
    iget-object v0, p0, La/vvn0;->U1:La/a8z;

    .line 49
    .line 50
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, La/ssn0;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;->setAdapter(La/yge0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p1, p1, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object p1, p1, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, La/vvn0;->I0()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    const/high16 p1, 0x41e00000    # 28.0f

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    const/high16 p1, 0x41f00000    # 30.0f

    .line 89
    .line 90
    :goto_1
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget-object v2, v2, La/wvn0;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 95
    .line 96
    float-to-int p1, p1

    .line 97
    const/4 v3, 0x7

    .line 98
    invoke-static {v1, p1, v3, v2}, La/jmu0;->l(IIILandroid/view/View;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object p1, p1, La/wvn0;->p:Landroidx/compose/ui/platform/ComposeView;

    .line 106
    .line 107
    new-instance v2, La/svn0;

    .line 108
    .line 109
    const/4 v3, 0x1

    .line 110
    invoke-direct {v2, p0, v3}, La/svn0;-><init>(La/vvn0;B)V

    .line 111
    .line 112
    .line 113
    new-instance v4, La/ugd;

    .line 114
    .line 115
    const v5, -0x6bf321f0

    .line 116
    .line 117
    .line 118
    invoke-direct {v4, v5, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1, v0, v4}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object p1, p1, La/wvn0;->h:Lorg/xplatform/uikit/components/chips/DsChips;

    .line 129
    .line 130
    sget-object v0, La/uyl;->b:La/uyl;

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/chips/DsChips;->setSelectionMode(La/uyl;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iget-object p1, p1, La/wvn0;->h:Lorg/xplatform/uikit/components/chips/DsChips;

    .line 140
    .line 141
    new-instance v0, La/svn0;

    .line 142
    .line 143
    invoke-direct {v0, p0, v1}, La/svn0;-><init>(La/vvn0;B)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/chips/DsChips;->setOnChipClickListener(Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget-object p1, p1, La/wvn0;->o:Landroidx/appcompat/widget/AppCompatImageView;

    .line 154
    .line 155
    invoke-static {}, La/cy7;->c()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_2

    .line 160
    .line 161
    const v0, 0x7f0805e5

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_2
    const v0, 0x7f0805e4

    .line 166
    .line 167
    .line 168
    :goto_2
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iget-object p1, p1, La/wvn0;->n:Landroidx/appcompat/widget/AppCompatImageView;

    .line 176
    .line 177
    new-instance v0, La/rvn0;

    .line 178
    .line 179
    const/4 v2, 0x3

    .line 180
    invoke-direct {v0, p0, v2}, La/rvn0;-><init>(La/vvn0;B)V

    .line 181
    .line 182
    .line 183
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, La/vvn0;->I0()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_3

    .line 191
    .line 192
    const/4 p1, 0x0

    .line 193
    goto :goto_3

    .line 194
    :cond_3
    const/high16 p1, 0x41900000    # 18.0f

    .line 195
    .line 196
    :goto_3
    invoke-virtual {p0}, La/vvn0;->I0()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_4

    .line 201
    .line 202
    const/high16 v0, 0x41000000    # 8.0f

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_4
    const/high16 v0, 0x41800000    # 16.0f

    .line 206
    .line 207
    :goto_4
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    iget-object v2, v2, La/wvn0;->g:Landroid/widget/FrameLayout;

    .line 212
    .line 213
    float-to-int p1, p1

    .line 214
    float-to-int v0, v0

    .line 215
    const/4 v4, 0x5

    .line 216
    invoke-static {p1, v0, v4, v2}, La/jmu0;->l(IIILandroid/view/View;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    iget-object p1, p1, La/wvn0;->j:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 224
    .line 225
    sget-object v0, La/ymx;->h:La/ymx;

    .line 226
    .line 227
    new-instance v2, La/rvn0;

    .line 228
    .line 229
    const/4 v4, 0x4

    .line 230
    invoke-direct {v2, p0, v4}, La/rvn0;-><init>(La/vvn0;B)V

    .line 231
    .line 232
    .line 233
    invoke-static {p1, v0, v2}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    iget-object p1, p1, La/wvn0;->e:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 241
    .line 242
    sget-object v2, La/ymx;->e:La/ymx;

    .line 243
    .line 244
    new-instance v4, La/rvn0;

    .line 245
    .line 246
    invoke-direct {v4, p0, v1}, La/rvn0;-><init>(La/vvn0;B)V

    .line 247
    .line 248
    .line 249
    invoke-static {p1, v2, v4}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iget-object p1, p1, La/wvn0;->c:Landroid/widget/TextView;

    .line 257
    .line 258
    new-instance v1, La/rvn0;

    .line 259
    .line 260
    invoke-direct {v1, p0, v3}, La/rvn0;-><init>(La/vvn0;B)V

    .line 261
    .line 262
    .line 263
    invoke-static {p1, v0, v1}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    iget-object p1, p1, La/wvn0;->i:Landroidx/appcompat/widget/AppCompatImageView;

    .line 271
    .line 272
    new-instance v1, La/rvn0;

    .line 273
    .line 274
    const/4 v2, 0x2

    .line 275
    invoke-direct {v1, p0, v2}, La/rvn0;-><init>(La/vvn0;B)V

    .line 276
    .line 277
    .line 278
    invoke-static {p1, v0, v1}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 279
    .line 280
    .line 281
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/vvn0;->Q1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/yvi;

    .line 8
    .line 9
    iget-object v1, v0, La/yvi;->a:La/ii;

    .line 10
    .line 11
    iput-object v1, p0, La/vvn0;->N1:La/ii;

    .line 12
    .line 13
    iget-object v0, v0, La/yvi;->b:La/wdk0;

    .line 14
    .line 15
    iput-object v0, p0, La/vvn0;->O1:La/wdk0;

    .line 16
    .line 17
    return-void
.end method

.method public final D0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/vvn0;->K0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/k3t0;->w()La/gmq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, La/tvn0;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v1, p0, v3, v2}, La/tvn0;-><init>(La/vvn0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    sget-object v2, La/lkz;->a:La/lkz;

    .line 17
    .line 18
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    new-instance v5, La/agn0;

    .line 31
    .line 32
    invoke-direct {v5, v0, v2, v1, v3}, La/agn0;-><init>(La/gmq;La/clz;La/tvn0;La/yje;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, La/vvn0;->K0()La/k3t0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/i3t0;

    .line 44
    .line 45
    invoke-virtual {v1}, La/i3t0;->C()La/gmq;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v2, La/tvn0;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v2, p0, v3, v4}, La/tvn0;-><init>(La/vvn0;La/yje;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    new-instance v5, La/agn0;

    .line 68
    .line 69
    check-cast v1, La/i89;

    .line 70
    .line 71
    invoke-direct {v5, v1, p0, v2, v3}, La/agn0;-><init>(La/i89;La/clz;La/tvn0;La/yje;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final G0()V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/wvn0;->e:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 6
    .line 7
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, La/wvn0;->j:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    new-array v3, v2, [I

    .line 15
    .line 16
    new-array v2, v2, [I

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    aget v2, v2, v1

    .line 26
    .line 27
    aget v3, v3, v1

    .line 28
    .line 29
    sub-int/2addr v2, v3

    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sub-int/2addr v2, v0

    .line 35
    int-to-float v0, v2

    .line 36
    const v2, 0x3f19999a    # 0.6f

    .line 37
    .line 38
    .line 39
    mul-float/2addr v0, v2

    .line 40
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v2, v2, La/wvn0;->c:Landroid/widget/TextView;

    .line 45
    .line 46
    float-to-int v0, v0

    .line 47
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const v3, 0x7f07074b

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const v4, 0x7f07074a

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const v5, 0x7f070748

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    filled-new-array {v2, v3, v4}, [Ljava/lang/Float;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget-object v3, v3, La/wvn0;->c:Landroid/widget/TextView;

    .line 120
    .line 121
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_1

    .line 134
    .line 135
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    check-cast v5, Ljava/lang/Number;

    .line 140
    .line 141
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    iget-object v6, v6, La/wvn0;->c:Landroid/widget/TextView;

    .line 153
    .line 154
    invoke-virtual {v6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    int-to-float v7, v0

    .line 167
    cmpg-float v6, v6, v7

    .line 168
    .line 169
    if-gtz v6, :cond_0

    .line 170
    .line 171
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    iget-object p0, p0, La/wvn0;->c:Landroid/widget/TextView;

    .line 176
    .line 177
    invoke-virtual {p0, v1, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_1
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    iget-object p0, p0, La/wvn0;->c:Landroid/widget/TextView;

    .line 186
    .line 187
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    invoke-virtual {p0, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 198
    .line 199
    .line 200
    return-void
.end method

.method public final H0()Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/vvn0;->J0()La/wvn0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/wvn0;->d:Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/SwipexCardsRecyclerView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    check-cast p0, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 15
    .line 16
    return-object p0
.end method

.method public final I0()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/vvn0;->P1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final J0()La/wvn0;
    .locals 2

    .line 1
    sget-object v0, La/vvn0;->X1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/vvn0;->S1:La/s0r;

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
    check-cast p0, La/wvn0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final K0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vvn0;->R1:La/a8z;

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

.method public final L0(Z)V
    .locals 14

    .line 1
    iget-object v0, p0, La/vvn0;->N1:La/ii;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 7
    .line 8
    const v3, 0x7f130162

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const v4, 0x7f13144d

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const v5, 0x7f130986

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    const p1, 0x7f130abf

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :cond_0
    move-object v6, v1

    .line 42
    sget-object v11, La/n12;->a:La/n12;

    .line 43
    .line 44
    const/4 v12, 0x0

    .line 45
    const/16 v13, 0x5d0

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const-string v8, "CHANGE_FILTERS_KEY"

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    const-string p0, "actionDialogManager"

    .line 67
    .line 68
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v1
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/qvn0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, p0, v0}, La/qvn0;-><init>(La/vvn0;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "REQUEST_TOP_UP"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, La/qvn0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {p1, p0, v1}, La/qvn0;-><init>(La/vvn0;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, La/qvn0;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-direct {p1, p0, v0}, La/qvn0;-><init>(La/vvn0;B)V

    .line 28
    .line 29
    .line 30
    const-string v0, "CHANGE_FILTERS_KEY"

    .line 31
    .line 32
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, La/qvn0;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {p1, p0, v1}, La/qvn0;-><init>(La/vvn0;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v0, La/b0l0;

    .line 49
    .line 50
    const/16 v1, 0xc

    .line 51
    .line 52
    invoke-direct {v0, p0, v1}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    const-string v1, "REQUEST_CONFIRM_BET"

    .line 56
    .line 57
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/vvn0;->M1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vvn0;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vvn0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
