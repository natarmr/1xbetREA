.class public final Lorg/xplatform/personal/impl/presentation/edit/a;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lorg/xplatform/personal/impl/presentation/edit/a;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/fl70",
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
.field public static final X1:La/fl70;

.field public static final synthetic Y1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/hnm0;

.field public M1:La/sa10;

.field public N1:La/gl5;

.field public O1:La/ii;

.field public P1:La/jh70;

.field public Q1:La/wdk0;

.field public final R1:La/n0o0;

.field public final S1:La/kiu0;

.field public final U1:La/s0r;

.field public V1:La/y3b0;

.field public final W1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, Lorg/xplatform/personal/impl/presentation/edit/a;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/personal/impl/databinding/FragmentProfileEditRecyclerBinding;"

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
    sput-object v1, Lorg/xplatform/personal/impl/presentation/edit/a;->Y1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/fl70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const v0, 0x7f0d029b

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 18
    .line 19
    iput-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->L1:La/hnm0;

    .line 20
    .line 21
    new-instance v0, La/zzb0;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p0, v1}, La/zzb0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/a;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->R1:La/n0o0;

    .line 32
    .line 33
    new-instance v0, La/zzb0;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v0, p0, v2}, La/zzb0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/a;B)V

    .line 37
    .line 38
    .line 39
    new-instance v3, La/c0c0;

    .line 40
    .line 41
    invoke-direct {v3, p0, v1}, La/c0c0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/a;B)V

    .line 42
    .line 43
    .line 44
    sget-object v1, La/wez;->b:La/wez;

    .line 45
    .line 46
    new-instance v4, La/g8b0;

    .line 47
    .line 48
    const/4 v5, 0x5

    .line 49
    invoke-direct {v4, v3, v5}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    sget-object v4, La/sre0;->a:La/tre0;

    .line 57
    .line 58
    const-class v5, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 59
    .line 60
    invoke-virtual {v4, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    new-instance v6, La/x6b0;

    .line 65
    .line 66
    const/4 v7, 0x6

    .line 67
    invoke-direct {v6, v3, v7}, La/x6b0;-><init>(La/a8z;B)V

    .line 68
    .line 69
    .line 70
    new-instance v8, La/x6b0;

    .line 71
    .line 72
    const/4 v9, 0x7

    .line 73
    invoke-direct {v8, v3, v9}, La/x6b0;-><init>(La/a8z;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v5, v6, v8, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->S1:La/kiu0;

    .line 81
    .line 82
    new-instance v0, La/c0c0;

    .line 83
    .line 84
    invoke-direct {v0, p0, v2}, La/c0c0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/a;B)V

    .line 85
    .line 86
    .line 87
    new-instance v2, La/g8b0;

    .line 88
    .line 89
    invoke-direct {v2, v0, v7}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-class v2, La/g0c0;

    .line 97
    .line 98
    invoke-virtual {v4, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    new-instance v3, La/x6b0;

    .line 103
    .line 104
    const/16 v4, 0x8

    .line 105
    .line 106
    invoke-direct {v3, v0, v4}, La/x6b0;-><init>(La/a8z;B)V

    .line 107
    .line 108
    .line 109
    new-instance v4, La/x6b0;

    .line 110
    .line 111
    const/16 v5, 0x9

    .line 112
    .line 113
    invoke-direct {v4, v0, v5}, La/x6b0;-><init>(La/a8z;B)V

    .line 114
    .line 115
    .line 116
    new-instance v5, La/ha30;

    .line 117
    .line 118
    const/16 v6, 0x18

    .line 119
    .line 120
    invoke-direct {v5, p0, v0, v6}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 121
    .line 122
    .line 123
    invoke-static {p0, v2, v3, v4, v5}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 124
    .line 125
    .line 126
    sget-object v0, La/a0c0;->a:La/a0c0;

    .line 127
    .line 128
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->U1:La/s0r;

    .line 133
    .line 134
    new-instance v0, La/zzb0;

    .line 135
    .line 136
    const/4 v2, 0x2

    .line 137
    invoke-direct {v0, p0, v2}, La/zzb0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/a;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iput-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->W1:La/a8z;

    .line 145
    .line 146
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, La/b3r;->d:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 8
    .line 9
    new-instance v2, La/zzb0;

    .line 10
    .line 11
    const/4 v3, 0x4

    .line 12
    invoke-direct {v2, v0, v3}, La/zzb0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/a;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    new-instance v4, La/cz60;

    .line 19
    .line 20
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const/4 v10, 0x0

    .line 25
    const/16 v11, 0x1d

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    const-class v15, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 29
    .line 30
    const-string v8, "onBackPressed"

    .line 31
    .line 32
    const-string v9, "onBackPressed()V"

    .line 33
    .line 34
    move-object v7, v15

    .line 35
    invoke-direct/range {v4 .. v11}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v4}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, La/b3r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {v1, v2}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v1, v1, La/b3r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    invoke-static {v1}, La/bdx;->j0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, La/b3r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v4, 0x3

    .line 68
    invoke-static {v1, v3, v4}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v1, v1, La/b3r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    iget-object v5, v0, Lorg/xplatform/personal/impl/presentation/edit/a;->W1:La/a8z;

    .line 78
    .line 79
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, La/vzb0;

    .line 84
    .line 85
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    const v5, 0x7f070717

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 96
    .line 97
    .line 98
    move-result v22

    .line 99
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const v5, 0x7f0706ea

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 107
    .line 108
    .line 109
    move-result v21

    .line 110
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const v5, 0x7f0706f8

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 118
    .line 119
    .line 120
    move-result v19

    .line 121
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const v5, 0x7f07070c

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 129
    .line 130
    .line 131
    move-result v26

    .line 132
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const v5, 0x7f070712

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const v6, 0x7f070718

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    const v7, 0x7f0700a5

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    int-to-float v6, v6

    .line 166
    new-instance v16, La/y3b0;

    .line 167
    .line 168
    sget-object v7, La/j5d;->a:Landroid/util/TypedValue;

    .line 169
    .line 170
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    const v8, 0x7f040ae3

    .line 175
    .line 176
    .line 177
    invoke-static {v7, v8, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 178
    .line 179
    .line 180
    move-result v17

    .line 181
    new-instance v3, La/wyb0;

    .line 182
    .line 183
    const/4 v7, 0x1

    .line 184
    invoke-direct {v3, v7}, La/wyb0;-><init>(B)V

    .line 185
    .line 186
    .line 187
    new-instance v7, La/wyb0;

    .line 188
    .line 189
    const/4 v8, 0x2

    .line 190
    invoke-direct {v7, v8}, La/wyb0;-><init>(B)V

    .line 191
    .line 192
    .line 193
    move/from16 v20, v19

    .line 194
    .line 195
    move/from16 v23, v19

    .line 196
    .line 197
    move-object/from16 v24, v3

    .line 198
    .line 199
    move/from16 v18, v6

    .line 200
    .line 201
    move-object/from16 v25, v7

    .line 202
    .line 203
    invoke-direct/range {v16 .. v25}, La/y3b0;-><init>(IFIIIIILa/wyb0;La/wyb0;)V

    .line 204
    .line 205
    .line 206
    move-object/from16 v3, v16

    .line 207
    .line 208
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    iget-object v6, v6, La/b3r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 213
    .line 214
    invoke-virtual {v6, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 215
    .line 216
    .line 217
    iput-object v3, v0, Lorg/xplatform/personal/impl/presentation/edit/a;->V1:La/y3b0;

    .line 218
    .line 219
    sget-object v31, La/rmk0;->d:La/rmk0;

    .line 220
    .line 221
    new-instance v23, La/qmk0;

    .line 222
    .line 223
    new-instance v3, La/wyb0;

    .line 224
    .line 225
    invoke-direct {v3, v4}, La/wyb0;-><init>(B)V

    .line 226
    .line 227
    .line 228
    const/16 v32, 0x110

    .line 229
    .line 230
    const/16 v28, 0x0

    .line 231
    .line 232
    const/16 v29, 0x1

    .line 233
    .line 234
    move/from16 v27, v1

    .line 235
    .line 236
    move/from16 v25, v1

    .line 237
    .line 238
    move-object/from16 v30, v3

    .line 239
    .line 240
    move/from16 v24, v5

    .line 241
    .line 242
    invoke-direct/range {v23 .. v32}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 243
    .line 244
    .line 245
    move-object/from16 v1, v23

    .line 246
    .line 247
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    iget-object v3, v3, La/b3r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 252
    .line 253
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 254
    .line 255
    .line 256
    iget-object v1, v0, Lorg/xplatform/personal/impl/presentation/edit/a;->N1:La/gl5;

    .line 257
    .line 258
    if-eqz v1, :cond_0

    .line 259
    .line 260
    new-instance v12, La/cz60;

    .line 261
    .line 262
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 263
    .line 264
    .line 265
    move-result-object v14

    .line 266
    const/16 v18, 0x0

    .line 267
    .line 268
    const/16 v19, 0x1c

    .line 269
    .line 270
    const/4 v13, 0x0

    .line 271
    const-string v16, "onCaptchaCancelled"

    .line 272
    .line 273
    const-string v17, "onCaptchaCancelled()V"

    .line 274
    .line 275
    invoke-direct/range {v12 .. v19}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 276
    .line 277
    .line 278
    move-object v1, v12

    .line 279
    new-instance v12, La/e9b0;

    .line 280
    .line 281
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 282
    .line 283
    .line 284
    move-result-object v14

    .line 285
    const/16 v19, 0x11

    .line 286
    .line 287
    const/4 v13, 0x1

    .line 288
    const-string v16, "onCaptchaConfirmed"

    .line 289
    .line 290
    const-string v17, "onCaptchaConfirmed(Lorg/xplatform/captcha/api/domain/model/UserActionCaptcha;)V"

    .line 291
    .line 292
    invoke-direct/range {v12 .. v19}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 293
    .line 294
    .line 295
    const-string v2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 296
    .line 297
    invoke-static {v0, v2, v1, v12}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    iget-object v1, v1, La/b3r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 305
    .line 306
    new-instance v2, La/zzb0;

    .line 307
    .line 308
    invoke-direct {v2, v0, v4}, La/zzb0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/a;B)V

    .line 309
    .line 310
    .line 311
    invoke-static {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    iget-object v1, v1, La/b3r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 319
    .line 320
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    iget-object v2, v2, La/b3r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 325
    .line 326
    invoke-static {v1, v0, v2}, La/uvw;->R(Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :cond_0
    const-string v0, "captchaDialogDelegate"

    .line 331
    .line 332
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v2
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->R1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/mpi;

    .line 8
    .line 9
    iget-object v1, v0, La/mpi;->w:La/sa10;

    .line 10
    .line 11
    iput-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->M1:La/sa10;

    .line 12
    .line 13
    iget-object v1, v0, La/mpi;->u:La/gl5;

    .line 14
    .line 15
    iput-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->N1:La/gl5;

    .line 16
    .line 17
    iget-object v1, v0, La/mpi;->v:La/ii;

    .line 18
    .line 19
    iput-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->O1:La/ii;

    .line 20
    .line 21
    iget-object v1, v0, La/mpi;->x:La/jh70;

    .line 22
    .line 23
    iput-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->P1:La/jh70;

    .line 24
    .line 25
    iget-object v0, v0, La/mpi;->y:La/wdk0;

    .line 26
    .line 27
    iput-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->Q1:La/wdk0;

    .line 28
    .line 29
    return-void
.end method

.method public final D0()V
    .locals 25

    .line 1
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lorg/xplatform/personal/impl/presentation/edit/n;->p:La/xae0;

    .line 6
    .line 7
    new-instance v2, La/e2c0;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v8, 0x0

    .line 11
    invoke-direct {v2, v0, v8, v3}, La/e2c0;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;La/yje;B)V

    .line 12
    .line 13
    .line 14
    new-instance v0, La/s6n0;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 17
    .line 18
    .line 19
    new-instance v9, La/p6b0;

    .line 20
    .line 21
    const/4 v15, 0x4

    .line 22
    const/16 v16, 0x13

    .line 23
    .line 24
    const/4 v10, 0x2

    .line 25
    const-class v20, Lorg/xplatform/personal/impl/presentation/edit/a;

    .line 26
    .line 27
    const-string v13, "handleUiState"

    .line 28
    .line 29
    const-string v14, "handleUiState(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;)V"

    .line 30
    .line 31
    move-object/from16 v11, p0

    .line 32
    .line 33
    move-object/from16 v12, v20

    .line 34
    .line 35
    invoke-direct/range {v9 .. v16}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    sget-object v1, La/lkz;->a:La/lkz;

    .line 39
    .line 40
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v3, La/f8b0;

    .line 53
    .line 54
    invoke-direct {v3, v0, v1, v9, v8}, La/f8b0;-><init>(La/s6n0;La/clz;La/p6b0;La/yje;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x3

    .line 58
    invoke-static {v2, v8, v8, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 59
    .line 60
    .line 61
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v5, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->q:La/ol60;

    .line 66
    .line 67
    new-instance v17, La/p6b0;

    .line 68
    .line 69
    const/16 v23, 0x4

    .line 70
    .line 71
    const/16 v24, 0x14

    .line 72
    .line 73
    const/16 v18, 0x2

    .line 74
    .line 75
    const-string v21, "handleUiAction"

    .line 76
    .line 77
    const-string v22, "handleUiAction(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiAction;)V"

    .line 78
    .line 79
    move-object/from16 v19, p0

    .line 80
    .line 81
    invoke-direct/range {v17 .. v24}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 82
    .line 83
    .line 84
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v4, La/f8b0;

    .line 97
    .line 98
    const/4 v9, 0x0

    .line 99
    move-object/from16 v7, v17

    .line 100
    .line 101
    invoke-direct/range {v4 .. v9}, La/f8b0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;C)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v1, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->c:La/xzb0;

    .line 112
    .line 113
    iget-object v5, v1, La/xzb0;->d:La/ol60;

    .line 114
    .line 115
    new-instance v17, La/p6b0;

    .line 116
    .line 117
    const/16 v24, 0x15

    .line 118
    .line 119
    const-string v21, "handleOnClickedUiAction"

    .line 120
    .line 121
    const-string v22, "handleOnClickedUiAction(Lorg/xplatform/personal/impl/presentation/edit/delegates/click/OnClickUiAction;)V"

    .line 122
    .line 123
    invoke-direct/range {v17 .. v24}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 124
    .line 125
    .line 126
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v4, La/f8b0;

    .line 139
    .line 140
    move-object/from16 v7, v17

    .line 141
    .line 142
    invoke-direct/range {v4 .. v9}, La/f8b0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;I)V

    .line 143
    .line 144
    .line 145
    invoke-static {v1, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iget-object v1, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->d:La/nqs;

    .line 153
    .line 154
    iget-object v1, v1, La/nqs;->g:Ljava/lang/Object;

    .line 155
    .line 156
    move-object v5, v1

    .line 157
    check-cast v5, La/ol60;

    .line 158
    .line 159
    new-instance v17, La/p6b0;

    .line 160
    .line 161
    const/16 v24, 0x16

    .line 162
    .line 163
    const-string v21, "showCaptcha"

    .line 164
    .line 165
    const-string v22, "showCaptcha(Lorg/xplatform/captcha/api/domain/model/CaptchaResult$UserActionRequired;)V"

    .line 166
    .line 167
    invoke-direct/range {v17 .. v24}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 168
    .line 169
    .line 170
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    new-instance v4, La/f8b0;

    .line 183
    .line 184
    move-object/from16 v7, v17

    .line 185
    .line 186
    invoke-direct/range {v4 .. v9}, La/f8b0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;S)V

    .line 187
    .line 188
    .line 189
    invoke-static {v1, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    iget-object v1, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->s:La/p7m0;

    .line 197
    .line 198
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    new-instance v17, La/p6b0;

    .line 203
    .line 204
    const/16 v24, 0x17

    .line 205
    .line 206
    const-string v21, "handleButtonSaveState"

    .line 207
    .line 208
    const-string v22, "handleButtonSaveState(Z)V"

    .line 209
    .line 210
    invoke-direct/range {v17 .. v24}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 211
    .line 212
    .line 213
    move-object/from16 v2, v17

    .line 214
    .line 215
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    new-instance v5, La/f8b0;

    .line 228
    .line 229
    invoke-direct {v5, v1, v3, v2, v8}, La/f8b0;-><init>(La/xae0;La/clz;La/p6b0;La/yje;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v4, v8, v8, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 233
    .line 234
    .line 235
    return-void
.end method

.method public final G0()La/b3r;
    .locals 2

    .line 1
    sget-object v0, Lorg/xplatform/personal/impl/presentation/edit/a;->Y1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->U1:La/s0r;

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
    check-cast p0, La/b3r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()Lorg/xplatform/personal/impl/presentation/edit/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->S1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/personal/impl/presentation/edit/a;->G0()La/b3r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/b3r;->e:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/b0c0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const-class v12, Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 16
    .line 17
    const-string v5, "onExitClicked"

    .line 18
    .line 19
    const-string v6, "onExitClicked()V"

    .line 20
    .line 21
    move-object v4, v12

    .line 22
    invoke-direct/range {v1 .. v8}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 23
    .line 24
    .line 25
    const-string v2, "REQUEST_CHANGES_LOST_DIALOG_KEY"

    .line 26
    .line 27
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 28
    .line 29
    .line 30
    new-instance v9, La/b0c0;

    .line 31
    .line 32
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    const/4 v15, 0x0

    .line 37
    const/16 v16, 0x1

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    const-string v13, "onExitClicked"

    .line 41
    .line 42
    const-string v14, "onExitClicked()V"

    .line 43
    .line 44
    invoke-direct/range {v9 .. v16}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    const-string v1, "REQUEST_CHANGES_SUCCESS_DIALOG_KEY"

    .line 48
    .line 49
    invoke-static {v0, v1, v9}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 50
    .line 51
    .line 52
    new-instance v9, La/e9b0;

    .line 53
    .line 54
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    const/16 v16, 0x12

    .line 59
    .line 60
    const/4 v10, 0x1

    .line 61
    const-string v13, "onCountrySelected"

    .line 62
    .line 63
    const-string v14, "onCountrySelected(Lorg/xplatform/onexuser/domain/entity/geo/GeoCountry;)V"

    .line 64
    .line 65
    invoke-direct/range {v9 .. v16}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 66
    .line 67
    .line 68
    const-string v1, "COUNTRIES_DIALOG_KEY"

    .line 69
    .line 70
    invoke-static {v0, v1, v9}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 71
    .line 72
    .line 73
    new-instance v9, La/e9b0;

    .line 74
    .line 75
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    const/16 v16, 0x13

    .line 80
    .line 81
    const-string v13, "onLocationSelected"

    .line 82
    .line 83
    const-string v14, "onLocationSelected(Lorg/xplatform/onexuser/domain/registration/RegistrationChoice;)V"

    .line 84
    .line 85
    invoke-direct/range {v9 .. v16}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 86
    .line 87
    .line 88
    const-string v1, "LOCATION_CHOICE_ITEM_KEY"

    .line 89
    .line 90
    invoke-static {v0, v1, v9}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 91
    .line 92
    .line 93
    new-instance v9, La/e9b0;

    .line 94
    .line 95
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/a;->H0()Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    const/16 v16, 0x14

    .line 100
    .line 101
    const-string v13, "onDocumentSelected"

    .line 102
    .line 103
    const-string v14, "onDocumentSelected(Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentUiModel;)V"

    .line 104
    .line 105
    invoke-direct/range {v9 .. v16}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 106
    .line 107
    .line 108
    const-string v1, "DOCUMENT_CHOICE_ITEM_KEY"

    .line 109
    .line 110
    invoke-static {v0, v1, v9}, La/sj3;->t0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->V1:La/y3b0;

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 6
    .line 7
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, La/hxm0;->m(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 10
    .line 11
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, La/hxm0;->n(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/a;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
