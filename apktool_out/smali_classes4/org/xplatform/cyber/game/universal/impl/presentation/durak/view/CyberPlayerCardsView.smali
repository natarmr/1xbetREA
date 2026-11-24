.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic o:I


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:Ljava/util/LinkedHashMap;

.field public final m:Ljava/util/ArrayList;

.field public n:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const p3, 0x7f070648

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->a:I

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const p3, 0x7f070717

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->b:I

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const v0, 0x7f07068c

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->c:I

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const v0, 0x7f0706a6

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->d:I

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const v0, 0x7f07064b

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->e:I

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const v0, 0x7f070660

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->f:I

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    const v0, 0x7f0706e1

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->g:I

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const p2, 0x7f070722

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    iput p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->h:I

    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const v0, 0x7f07072d

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    iput p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->i:I

    .line 129
    .line 130
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    iput p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->j:I

    .line 139
    .line 140
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    iput p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->k:I

    .line 149
    .line 150
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 151
    .line 152
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->l:Ljava/util/LinkedHashMap;

    .line 156
    .line 157
    new-instance p1, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->m:Ljava/util/ArrayList;

    .line 163
    .line 164
    sget-object p1, La/iun;->a:La/iun;

    .line 165
    .line 166
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->n:Ljava/util/List;

    .line 167
    .line 168
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Z)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    iget v3, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->c:I

    .line 8
    .line 9
    mul-int v4, v2, v3

    .line 10
    .line 11
    add-int/lit8 v5, v2, -0x1

    .line 12
    .line 13
    iget v6, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->b:I

    .line 14
    .line 15
    mul-int/2addr v5, v6

    .line 16
    add-int/2addr v5, v4

    .line 17
    const/16 v4, 0xa

    .line 18
    .line 19
    iget v7, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->a:I

    .line 20
    .line 21
    if-gt v5, v7, :cond_0

    .line 22
    .line 23
    sget-object v2, La/hah;->b:La/hah;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-gt v2, v4, :cond_1

    .line 27
    .line 28
    sget-object v2, La/hah;->a:La/hah;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    sget-object v2, La/hah;->c:La/hah;

    .line 32
    .line 33
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    const/4 v10, 0x0

    .line 43
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    const v12, 0x7f08031f

    .line 48
    .line 49
    .line 50
    iget-object v13, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->m:Ljava/util/ArrayList;

    .line 51
    .line 52
    if-eqz v11, :cond_19

    .line 53
    .line 54
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    add-int/lit8 v14, v10, 0x1

    .line 59
    .line 60
    if-ltz v10, :cond_18

    .line 61
    .line 62
    check-cast v11, La/una0;

    .line 63
    .line 64
    iget v11, v11, La/una0;->a:I

    .line 65
    .line 66
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-ne v11, v12, :cond_2

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    invoke-static {v12}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    invoke-static {v12, v0}, La/p1o0;->a(Landroid/view/LayoutInflater;Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;)La/p1o0;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    iget-object v15, v12, La/p1o0;->b:Landroid/widget/ImageView;

    .line 85
    .line 86
    invoke-virtual {v15, v11}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 87
    .line 88
    .line 89
    iget-object v11, v12, La/p1o0;->a:Landroid/widget/FrameLayout;

    .line 90
    .line 91
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move/from16 v19, v6

    .line 98
    .line 99
    move/from16 v20, v7

    .line 100
    .line 101
    move-object/from16 v21, v8

    .line 102
    .line 103
    move/from16 v22, v14

    .line 104
    .line 105
    move-object v14, v2

    .line 106
    goto/16 :goto_7

    .line 107
    .line 108
    :cond_2
    invoke-static {v10, v13}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    check-cast v12, La/p1o0;

    .line 113
    .line 114
    iget-object v15, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->l:Ljava/util/LinkedHashMap;

    .line 115
    .line 116
    if-nez v12, :cond_3

    .line 117
    .line 118
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    invoke-virtual {v15, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    check-cast v9, La/p1o0;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    move-object v9, v12

    .line 130
    :goto_2
    if-nez v9, :cond_4

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-static {v9}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    invoke-static {v9, v0}, La/p1o0;->a(Landroid/view/LayoutInflater;Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;)La/p1o0;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    move/from16 v19, v6

    .line 145
    .line 146
    iget-object v6, v9, La/p1o0;->b:Landroid/widget/ImageView;

    .line 147
    .line 148
    invoke-virtual {v6, v11}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 149
    .line 150
    .line 151
    iget-object v6, v9, La/p1o0;->a:Landroid/widget/FrameLayout;

    .line 152
    .line 153
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-interface {v15, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_4
    move/from16 v19, v6

    .line 165
    .line 166
    :goto_3
    if-eqz v12, :cond_7

    .line 167
    .line 168
    new-instance v6, La/hng;

    .line 169
    .line 170
    move/from16 v20, v7

    .line 171
    .line 172
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-object/from16 v21, v8

    .line 180
    .line 181
    iget-object v8, v12, La/p1o0;->b:Landroid/widget/ImageView;

    .line 182
    .line 183
    iget-object v12, v12, La/p1o0;->c:Landroid/view/View;

    .line 184
    .line 185
    move/from16 v22, v14

    .line 186
    .line 187
    sget-object v14, La/hah;->a:La/hah;

    .line 188
    .line 189
    if-ne v2, v14, :cond_5

    .line 190
    .line 191
    if-eqz v10, :cond_5

    .line 192
    .line 193
    const/4 v14, 0x1

    .line 194
    goto :goto_4

    .line 195
    :cond_5
    const/4 v14, 0x0

    .line 196
    :goto_4
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 200
    .line 201
    .line 202
    iput-object v8, v6, La/hng;->c:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v12, v6, La/hng;->d:Ljava/lang/Object;

    .line 205
    .line 206
    iput-boolean v14, v6, La/hng;->b:Z

    .line 207
    .line 208
    iput v11, v6, La/hng;->a:I

    .line 209
    .line 210
    const v12, 0x7f010021

    .line 211
    .line 212
    .line 213
    invoke-static {v7, v12}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    iput-object v12, v6, La/hng;->e:Ljava/lang/Object;

    .line 221
    .line 222
    const v14, 0x7f010020

    .line 223
    .line 224
    .line 225
    invoke-static {v7, v14}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    iput-object v7, v6, La/hng;->f:Ljava/lang/Object;

    .line 233
    .line 234
    const-wide/16 v23, 0x64

    .line 235
    .line 236
    move-object v14, v2

    .line 237
    int-to-long v1, v10

    .line 238
    mul-long v1, v1, v23

    .line 239
    .line 240
    if-eqz p2, :cond_6

    .line 241
    .line 242
    const-wide/16 v23, 0x258

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_6
    const-wide/16 v23, 0x0

    .line 246
    .line 247
    :goto_5
    add-long v1, v1, v23

    .line 248
    .line 249
    invoke-virtual {v12, v1, v2}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 250
    .line 251
    .line 252
    new-instance v1, La/gng;

    .line 253
    .line 254
    const/4 v2, 0x0

    .line 255
    invoke-direct {v1, v6, v2}, La/gng;-><init>(La/hng;B)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 259
    .line 260
    .line 261
    new-instance v1, La/gng;

    .line 262
    .line 263
    const/4 v2, 0x1

    .line 264
    invoke-direct {v1, v6, v2}, La/gng;-><init>(La/hng;B)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v7, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v8}, Landroid/view/View;->clearAnimation()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v8, v12}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v8, v12}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-interface {v15, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    const/4 v1, 0x0

    .line 287
    invoke-virtual {v13, v10, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_7
    move/from16 v20, v7

    .line 292
    .line 293
    move-object/from16 v21, v8

    .line 294
    .line 295
    move/from16 v22, v14

    .line 296
    .line 297
    move-object v14, v2

    .line 298
    :goto_6
    move-object v12, v9

    .line 299
    :goto_7
    iget-object v1, v12, La/p1o0;->a:Landroid/widget/FrameLayout;

    .line 300
    .line 301
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    iget v6, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->d:I

    .line 306
    .line 307
    const-string v7, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 308
    .line 309
    const/4 v8, 0x0

    .line 310
    if-eqz v2, :cond_f

    .line 311
    .line 312
    const/4 v9, 0x1

    .line 313
    if-eq v2, v9, :cond_c

    .line 314
    .line 315
    const/4 v6, 0x2

    .line 316
    if-ne v2, v6, :cond_b

    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    if-eqz v2, :cond_a

    .line 326
    .line 327
    div-int/lit8 v6, v10, 0xa

    .line 328
    .line 329
    iget v7, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->e:I

    .line 330
    .line 331
    iput v7, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 332
    .line 333
    iget v9, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->f:I

    .line 334
    .line 335
    iput v9, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 336
    .line 337
    div-int/lit8 v11, v4, 0x2

    .line 338
    .line 339
    rem-int/lit8 v13, v4, 0x2

    .line 340
    .line 341
    add-int/2addr v13, v11

    .line 342
    iget v11, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->g:I

    .line 343
    .line 344
    const/16 v15, 0xa

    .line 345
    .line 346
    if-lt v4, v15, :cond_8

    .line 347
    .line 348
    if-lt v10, v13, :cond_8

    .line 349
    .line 350
    sub-int v15, v10, v13

    .line 351
    .line 352
    add-int/2addr v7, v11

    .line 353
    mul-int/2addr v7, v15

    .line 354
    :goto_8
    int-to-float v7, v7

    .line 355
    goto :goto_9

    .line 356
    :cond_8
    add-int/2addr v7, v11

    .line 357
    mul-int/2addr v7, v10

    .line 358
    goto :goto_8

    .line 359
    :goto_9
    invoke-virtual {v1, v7}, Landroid/view/View;->setX(F)V

    .line 360
    .line 361
    .line 362
    iget v7, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->j:I

    .line 363
    .line 364
    const/16 v15, 0xa

    .line 365
    .line 366
    if-lt v4, v15, :cond_9

    .line 367
    .line 368
    if-lt v10, v13, :cond_9

    .line 369
    .line 370
    sub-int/2addr v9, v7

    .line 371
    int-to-float v4, v9

    .line 372
    goto :goto_a

    .line 373
    :cond_9
    add-int v9, v9, v19

    .line 374
    .line 375
    mul-int/2addr v9, v6

    .line 376
    int-to-float v4, v9

    .line 377
    int-to-float v6, v7

    .line 378
    sub-float/2addr v4, v6

    .line 379
    :goto_a
    invoke-virtual {v1, v4}, Landroid/view/View;->setY(F)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v8}, Landroid/view/View;->setRotation(F)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 386
    .line 387
    .line 388
    goto/16 :goto_11

    .line 389
    .line 390
    :cond_a
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 395
    .line 396
    .line 397
    return-void

    .line 398
    :cond_c
    const/16 v15, 0xa

    .line 399
    .line 400
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    if-eqz v2, :cond_e

    .line 408
    .line 409
    if-nez v10, :cond_d

    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    goto :goto_b

    .line 413
    :cond_d
    move/from16 v4, v19

    .line 414
    .line 415
    :goto_b
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 416
    .line 417
    iput v6, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 418
    .line 419
    add-int/2addr v4, v3

    .line 420
    mul-int/2addr v4, v10

    .line 421
    int-to-float v4, v4

    .line 422
    invoke-virtual {v1, v4}, Landroid/view/View;->setX(F)V

    .line 423
    .line 424
    .line 425
    iget v4, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->k:I

    .line 426
    .line 427
    int-to-float v4, v4

    .line 428
    sub-float v4, v8, v4

    .line 429
    .line 430
    invoke-virtual {v1, v4}, Landroid/view/View;->setY(F)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1, v8}, Landroid/view/View;->setRotation(F)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 437
    .line 438
    .line 439
    goto/16 :goto_11

    .line 440
    .line 441
    :cond_e
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    return-void

    .line 445
    :cond_f
    const/16 v15, 0xa

    .line 446
    .line 447
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    if-eqz v2, :cond_17

    .line 455
    .line 456
    div-int/lit8 v7, v4, 0x2

    .line 457
    .line 458
    iget v9, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->i:I

    .line 459
    .line 460
    div-int/2addr v9, v7

    .line 461
    rem-int/lit8 v11, v4, 0x2

    .line 462
    .line 463
    if-eqz v11, :cond_10

    .line 464
    .line 465
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 466
    .line 467
    .line 468
    move-result-object v11

    .line 469
    move-object/from16 v17, v11

    .line 470
    .line 471
    goto :goto_c

    .line 472
    :cond_10
    const/16 v17, 0x0

    .line 473
    .line 474
    :goto_c
    if-ge v10, v7, :cond_11

    .line 475
    .line 476
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 477
    .line 478
    .line 479
    move-result-object v7

    .line 480
    move v11, v8

    .line 481
    move-object v8, v7

    .line 482
    move v7, v9

    .line 483
    goto :goto_e

    .line 484
    :cond_11
    if-nez v17, :cond_13

    .line 485
    .line 486
    :cond_12
    move v11, v8

    .line 487
    move v7, v9

    .line 488
    goto :goto_d

    .line 489
    :cond_13
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    .line 490
    .line 491
    .line 492
    move-result v7

    .line 493
    if-ne v7, v10, :cond_12

    .line 494
    .line 495
    move v11, v8

    .line 496
    move v7, v9

    .line 497
    int-to-double v8, v10

    .line 498
    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    .line 499
    .line 500
    sub-double v8, v8, v16

    .line 501
    .line 502
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 503
    .line 504
    .line 505
    move-result-object v8

    .line 506
    goto :goto_e

    .line 507
    :goto_d
    sub-int v8, v4, v10

    .line 508
    .line 509
    const/16 v18, 0x1

    .line 510
    .line 511
    add-int/lit8 v8, v8, -0x1

    .line 512
    .line 513
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v8

    .line 517
    :goto_e
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 518
    .line 519
    .line 520
    move-result v8

    .line 521
    cmpg-float v9, v8, v11

    .line 522
    .line 523
    if-nez v9, :cond_14

    .line 524
    .line 525
    move v13, v11

    .line 526
    goto :goto_f

    .line 527
    :cond_14
    int-to-float v9, v7

    .line 528
    const/high16 v13, 0x3f800000    # 1.0f

    .line 529
    .line 530
    sub-float v13, v8, v13

    .line 531
    .line 532
    mul-float/2addr v13, v9

    .line 533
    :goto_f
    int-to-float v7, v7

    .line 534
    mul-float/2addr v7, v8

    .line 535
    const/high16 v8, 0x40000000    # 2.0f

    .line 536
    .line 537
    div-float/2addr v13, v8

    .line 538
    sub-float/2addr v7, v13

    .line 539
    sub-float v8, v11, v7

    .line 540
    .line 541
    iget v7, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->h:I

    .line 542
    .line 543
    if-eqz p2, :cond_15

    .line 544
    .line 545
    goto :goto_10

    .line 546
    :cond_15
    neg-int v7, v7

    .line 547
    :goto_10
    int-to-float v9, v10

    .line 548
    sub-int v11, v20, v3

    .line 549
    .line 550
    div-int/2addr v11, v4

    .line 551
    int-to-float v11, v11

    .line 552
    mul-float/2addr v9, v11

    .line 553
    int-to-float v7, v7

    .line 554
    add-float/2addr v9, v7

    .line 555
    const/16 v7, 0x19

    .line 556
    .line 557
    const/16 v11, 0x15e

    .line 558
    .line 559
    invoke-static {v7, v4, v10, v11}, La/f140;->b(IIII)I

    .line 560
    .line 561
    .line 562
    move-result v4

    .line 563
    int-to-float v4, v4

    .line 564
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 565
    .line 566
    iput v6, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 567
    .line 568
    invoke-virtual {v1, v9}, Landroid/view/View;->setX(F)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1, v8}, Landroid/view/View;->setY(F)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1, v4}, Landroid/view/View;->setRotation(F)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v1}, Landroid/view/View;->bringToFront()V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 581
    .line 582
    .line 583
    :goto_11
    iget-object v1, v12, La/p1o0;->c:Landroid/view/View;

    .line 584
    .line 585
    sget-object v2, La/hah;->a:La/hah;

    .line 586
    .line 587
    if-ne v14, v2, :cond_16

    .line 588
    .line 589
    if-eqz v10, :cond_16

    .line 590
    .line 591
    const/4 v2, 0x0

    .line 592
    goto :goto_12

    .line 593
    :cond_16
    const/16 v2, 0x8

    .line 594
    .line 595
    :goto_12
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-object v2, v14

    .line 602
    move v4, v15

    .line 603
    move/from16 v6, v19

    .line 604
    .line 605
    move/from16 v7, v20

    .line 606
    .line 607
    move-object/from16 v8, v21

    .line 608
    .line 609
    move/from16 v10, v22

    .line 610
    .line 611
    goto/16 :goto_1

    .line 612
    .line 613
    :cond_17
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    return-void

    .line 617
    :cond_18
    invoke-static {}, La/q3d;->p()V

    .line 618
    .line 619
    .line 620
    const/16 v17, 0x0

    .line 621
    .line 622
    throw v17

    .line 623
    :cond_19
    move-object v14, v2

    .line 624
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->isEmpty()Z

    .line 625
    .line 626
    .line 627
    move-result v1

    .line 628
    if-eqz v1, :cond_1a

    .line 629
    .line 630
    goto :goto_14

    .line 631
    :cond_1a
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    :cond_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 636
    .line 637
    .line 638
    move-result v2

    .line 639
    if-eqz v2, :cond_1d

    .line 640
    .line 641
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    check-cast v2, La/una0;

    .line 646
    .line 647
    iget v2, v2, La/una0;->a:I

    .line 648
    .line 649
    if-eq v2, v12, :cond_1b

    .line 650
    .line 651
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->S(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    if-eqz v2, :cond_1c

    .line 664
    .line 665
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    check-cast v2, La/p1o0;

    .line 670
    .line 671
    iget-object v2, v2, La/p1o0;->a:Landroid/widget/FrameLayout;

    .line 672
    .line 673
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 674
    .line 675
    .line 676
    invoke-static {v2}, La/hxm0;->v(Landroid/view/View;)V

    .line 677
    .line 678
    .line 679
    goto :goto_13

    .line 680
    :cond_1c
    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    .line 681
    .line 682
    .line 683
    :cond_1d
    :goto_14
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 684
    .line 685
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    if-eqz v1, :cond_1e

    .line 690
    .line 691
    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    .line 692
    .line 693
    .line 694
    move-result v1

    .line 695
    if-nez v1, :cond_1e

    .line 696
    .line 697
    move/from16 v1, p2

    .line 698
    .line 699
    invoke-virtual {v0, v14, v5, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->b(La/hah;Ljava/util/ArrayList;Z)V

    .line 700
    .line 701
    .line 702
    return-void

    .line 703
    :cond_1e
    move/from16 v1, p2

    .line 704
    .line 705
    new-instance v2, La/jah;

    .line 706
    .line 707
    invoke-direct {v2, v0, v14, v5, v1}, La/jah;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;La/hah;Ljava/util/ArrayList;Z)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v0, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 711
    .line 712
    .line 713
    return-void
.end method

.method public final b(La/hah;Ljava/util/ArrayList;Z)V
    .locals 2

    .line 1
    sget-object v0, La/hah;->c:La/hah;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_2

    .line 5
    .line 6
    if-eqz p3, :cond_1

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    div-int/lit8 p1, p1, 0x2

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    rem-int/lit8 p3, p3, 0x2

    .line 19
    .line 20
    add-int/2addr p3, p1

    .line 21
    invoke-static {p2, p3}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    check-cast p2, La/p1o0;

    .line 40
    .line 41
    iget-object p2, p2, La/p1o0;->a:Landroid/widget/FrameLayout;

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    add-int/2addr v1, p2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    sub-int/2addr p1, v1

    .line 54
    int-to-float p1, p1

    .line 55
    iget p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->j:I

    .line 56
    .line 57
    int-to-float p2, p2

    .line 58
    sub-float/2addr p1, p2

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    const/4 p1, 0x0

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, La/p1o0;

    .line 67
    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    iget-object p1, p1, La/p1o0;->a:Landroid/widget/FrameLayout;

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    float-to-int p1, p1

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move p1, v1

    .line 81
    :goto_1
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    check-cast p2, La/p1o0;

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    iget-object p2, p2, La/p1o0;->a:Landroid/widget/FrameLayout;

    .line 90
    .line 91
    if-eqz p2, :cond_4

    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/view/View;->getX()F

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    float-to-int v1, p2

    .line 98
    :cond_4
    iget p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->c:I

    .line 99
    .line 100
    add-int/2addr v1, p2

    .line 101
    sub-int/2addr v1, p1

    .line 102
    iget p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->a:I

    .line 103
    .line 104
    sub-int/2addr p1, v1

    .line 105
    div-int/lit8 p1, p1, 0x2

    .line 106
    .line 107
    int-to-float p1, p1

    .line 108
    :goto_2
    invoke-virtual {p0, p1}, Landroid/view/View;->setX(F)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final c(Ljava/util/List;Ljava/util/ArrayList;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    invoke-static {v1}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v4, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->l:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-eqz v6, :cond_3

    .line 26
    .line 27
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    check-cast v6, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    if-eqz v8, :cond_2

    .line 49
    .line 50
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    check-cast v8, La/una0;

    .line 55
    .line 56
    iget v8, v8, La/una0;->a:I

    .line 57
    .line 58
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    check-cast v9, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    if-ne v9, v8, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_4

    .line 84
    .line 85
    invoke-virtual {v0, v1, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->a(Ljava/util/List;Z)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_a

    .line 89
    .line 90
    :cond_4
    iget-object v5, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->n:Ljava/util/List;

    .line 91
    .line 92
    invoke-static {v5, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    new-instance v6, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_9

    .line 114
    .line 115
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    move-object v8, v7

    .line 120
    check-cast v8, Ljava/lang/Number;

    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eqz v9, :cond_6

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_6
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    :cond_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-eqz v10, :cond_5

    .line 142
    .line 143
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    check-cast v10, La/fng;

    .line 148
    .line 149
    iget v11, v10, La/fng;->b:I

    .line 150
    .line 151
    if-eq v11, v8, :cond_8

    .line 152
    .line 153
    iget v10, v10, La/fng;->a:I

    .line 154
    .line 155
    if-ne v10, v8, :cond_7

    .line 156
    .line 157
    :cond_8
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_9
    check-cast v5, Ljava/lang/Iterable;

    .line 162
    .line 163
    new-instance v3, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-eqz v8, :cond_e

    .line 177
    .line 178
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    move-object v9, v8

    .line 183
    check-cast v9, La/una0;

    .line 184
    .line 185
    iget v9, v9, La/una0;->a:I

    .line 186
    .line 187
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-eqz v10, :cond_a

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    :cond_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    if-eqz v11, :cond_c

    .line 203
    .line 204
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    check-cast v11, La/una0;

    .line 209
    .line 210
    iget v11, v11, La/una0;->a:I

    .line 211
    .line 212
    if-ne v11, v9, :cond_b

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_c
    :goto_4
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    if-eqz v9, :cond_d

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_d
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_e
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    if-eqz v8, :cond_10

    .line 239
    .line 240
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    check-cast v8, La/una0;

    .line 245
    .line 246
    iget v8, v8, La/una0;->a:I

    .line 247
    .line 248
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-virtual {v4, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    check-cast v9, La/p1o0;

    .line 257
    .line 258
    if-eqz v9, :cond_f

    .line 259
    .line 260
    iget-object v9, v9, La/p1o0;->a:Landroid/widget/FrameLayout;

    .line 261
    .line 262
    if-eqz v9, :cond_f

    .line 263
    .line 264
    invoke-static {v9}, La/hxm0;->v(Landroid/view/View;)V

    .line 265
    .line 266
    .line 267
    :cond_f
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-interface {v4, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_10
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    check-cast v3, Ljava/lang/Iterable;

    .line 284
    .line 285
    invoke-static {v5, v3}, Lkotlin/collections/CollectionsKt;->n0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-virtual {v0, v3, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->a(Ljava/util/List;Z)V

    .line 290
    .line 291
    .line 292
    new-instance v3, Landroid/animation/AnimatorSet;

    .line 293
    .line 294
    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 295
    .line 296
    .line 297
    new-instance v5, Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    :cond_11
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    if-eqz v8, :cond_15

    .line 311
    .line 312
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    move-object v9, v8

    .line 317
    check-cast v9, Ljava/lang/Number;

    .line 318
    .line 319
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result v9

    .line 323
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    if-eqz v10, :cond_12

    .line 328
    .line 329
    goto :goto_6

    .line 330
    :cond_12
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v10

    .line 334
    :cond_13
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    if-eqz v11, :cond_11

    .line 339
    .line 340
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v11

    .line 344
    check-cast v11, La/fng;

    .line 345
    .line 346
    iget v12, v11, La/fng;->b:I

    .line 347
    .line 348
    if-eq v12, v9, :cond_14

    .line 349
    .line 350
    iget v11, v11, La/fng;->a:I

    .line 351
    .line 352
    if-ne v11, v9, :cond_13

    .line 353
    .line 354
    :cond_14
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_15
    new-instance v7, Ljava/util/ArrayList;

    .line 359
    .line 360
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    :cond_16
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    const/4 v9, 0x2

    .line 372
    if-eqz v8, :cond_19

    .line 373
    .line 374
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v8

    .line 378
    check-cast v8, Ljava/lang/Number;

    .line 379
    .line 380
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 381
    .line 382
    .line 383
    move-result v8

    .line 384
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v8

    .line 388
    invoke-virtual {v4, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v8

    .line 392
    check-cast v8, La/p1o0;

    .line 393
    .line 394
    if-eqz v8, :cond_18

    .line 395
    .line 396
    iget-object v8, v8, La/p1o0;->a:Landroid/widget/FrameLayout;

    .line 397
    .line 398
    if-nez v8, :cond_17

    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_17
    invoke-virtual {v8}, Landroid/view/View;->getY()F

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    invoke-virtual {v8}, Landroid/view/View;->getY()F

    .line 406
    .line 407
    .line 408
    move-result v11

    .line 409
    float-to-double v11, v11

    .line 410
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 411
    .line 412
    .line 413
    move-result v13

    .line 414
    int-to-double v13, v13

    .line 415
    const-wide v15, 0x3fc999999999999aL    # 0.2

    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    mul-double/2addr v13, v15

    .line 421
    sub-double/2addr v11, v13

    .line 422
    double-to-float v11, v11

    .line 423
    new-array v9, v9, [F

    .line 424
    .line 425
    const/4 v12, 0x0

    .line 426
    aput v10, v9, v12

    .line 427
    .line 428
    const/4 v10, 0x1

    .line 429
    aput v11, v9, v10

    .line 430
    .line 431
    invoke-static {v9}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 432
    .line 433
    .line 434
    move-result-object v9

    .line 435
    new-instance v10, La/fd5;

    .line 436
    .line 437
    const/4 v11, 0x7

    .line 438
    invoke-direct {v10, v8, v11}, La/fd5;-><init>(Ljava/lang/Object;B)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v9, v10}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 442
    .line 443
    .line 444
    const-wide/16 v10, 0x3e8

    .line 445
    .line 446
    invoke-virtual {v9, v10, v11}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 447
    .line 448
    .line 449
    goto :goto_9

    .line 450
    :cond_18
    :goto_8
    const/4 v9, 0x0

    .line 451
    :goto_9
    if-eqz v9, :cond_16

    .line 452
    .line 453
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    goto :goto_7

    .line 457
    :cond_19
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    if-eqz v4, :cond_1a

    .line 462
    .line 463
    goto :goto_a

    .line 464
    :cond_1a
    new-instance v4, La/akc;

    .line 465
    .line 466
    const/4 v5, 0x3

    .line 467
    invoke-direct {v4, v6, v0, v5}, La/akc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 471
    .line 472
    .line 473
    new-instance v4, La/iah;

    .line 474
    .line 475
    invoke-direct {v4, v6, v0, v1, v2}, La/iah;-><init>(Ljava/util/ArrayList;Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;Ljava/util/List;Z)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 479
    .line 480
    .line 481
    new-array v2, v9, [F

    .line 482
    .line 483
    fill-array-data v2, :array_0

    .line 484
    .line 485
    .line 486
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    const-wide/16 v4, 0x7d0

    .line 491
    .line 492
    invoke-virtual {v2, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 493
    .line 494
    .line 495
    invoke-static {v7, v2}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    invoke-virtual {v3, v2}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->start()V

    .line 503
    .line 504
    .line 505
    :goto_a
    iput-object v1, v0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->n:Ljava/util/List;

    .line 506
    .line 507
    return-void

    .line 508
    nop

    .line 509
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
