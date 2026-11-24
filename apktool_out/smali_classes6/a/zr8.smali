.class public final La/zr8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:F

.field public B:F

.field public C:I

.field public D:Ljava/util/List;

.field public E:Ljava/util/List;

.field public final F:I

.field public final G:I

.field public final H:I

.field public I:Landroid/graphics/Rect;

.field public J:Z

.field public K:F

.field public L:I

.field public final a:La/et8;

.field public final b:La/bs8;

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:I

.field public final g:I

.field public final h:Ljava/util/TreeMap;

.field public i:La/vs8;

.field public j:Z

.field public k:Lkotlin/jvm/functions/Function0;

.field public l:La/rs8;

.field public final m:I

.field public n:La/tr8;

.field public final o:Landroid/graphics/Rect;

.field public p:Ljava/util/LinkedHashSet;

.field public final q:Ljava/util/ArrayList;

.field public final r:Ljava/util/LinkedHashSet;

.field public final s:Ljava/util/ArrayList;

.field public t:Ljava/util/List;

.field public u:Z

.field public final v:La/pz40;

.field public final w:Landroid/graphics/Rect;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(La/et8;La/bs8;IIZIIIIIIILa/tr8;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/zr8;->a:La/et8;

    .line 8
    .line 9
    iput-object p2, p0, La/zr8;->b:La/bs8;

    .line 10
    .line 11
    iput p3, p0, La/zr8;->c:I

    .line 12
    .line 13
    iput p4, p0, La/zr8;->d:I

    .line 14
    .line 15
    iput-boolean p5, p0, La/zr8;->e:Z

    .line 16
    .line 17
    iput p6, p0, La/zr8;->f:I

    .line 18
    .line 19
    iput p7, p0, La/zr8;->g:I

    .line 20
    .line 21
    new-instance p2, Ljava/util/TreeMap;

    .line 22
    .line 23
    invoke-direct {p2}, Ljava/util/TreeMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, La/zr8;->h:Ljava/util/TreeMap;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    iput-boolean p2, p0, La/zr8;->j:Z

    .line 30
    .line 31
    iput p4, p0, La/zr8;->m:I

    .line 32
    .line 33
    iput-object p13, p0, La/zr8;->n:La/tr8;

    .line 34
    .line 35
    new-instance p4, Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-direct {p4, p9, p10, p11, p12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 38
    .line 39
    .line 40
    iput-object p4, p0, La/zr8;->o:Landroid/graphics/Rect;

    .line 41
    .line 42
    new-instance p4, Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    invoke-direct {p4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p4, p0, La/zr8;->p:Ljava/util/LinkedHashSet;

    .line 48
    .line 49
    new-instance p4, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p4, p0, La/zr8;->q:Ljava/util/ArrayList;

    .line 55
    .line 56
    new-instance p4, Ljava/util/LinkedHashSet;

    .line 57
    .line 58
    invoke-direct {p4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p4, p0, La/zr8;->r:Ljava/util/LinkedHashSet;

    .line 62
    .line 63
    new-instance p4, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p4, p0, La/zr8;->s:Ljava/util/ArrayList;

    .line 69
    .line 70
    sget-object p4, La/iun;->a:La/iun;

    .line 71
    .line 72
    iput-object p4, p0, La/zr8;->t:Ljava/util/List;

    .line 73
    .line 74
    iput-boolean p2, p0, La/zr8;->u:Z

    .line 75
    .line 76
    invoke-static {p4}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iput-object p2, p0, La/zr8;->v:La/pz40;

    .line 81
    .line 82
    const/4 p2, 0x0

    .line 83
    invoke-static {p2}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 84
    .line 85
    .line 86
    new-instance p2, Landroid/graphics/Rect;

    .line 87
    .line 88
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object p2, p0, La/zr8;->w:Landroid/graphics/Rect;

    .line 92
    .line 93
    iput-object p4, p0, La/zr8;->D:Ljava/util/List;

    .line 94
    .line 95
    iput-object p4, p0, La/zr8;->E:Ljava/util/List;

    .line 96
    .line 97
    iget-object p2, p13, La/tr8;->a:La/xr8;

    .line 98
    .line 99
    invoke-static {p2, p3, p5}, La/y0x0;->L(La/xr8;IZ)I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    iput p2, p0, La/zr8;->F:I

    .line 104
    .line 105
    iget-object p2, p13, La/tr8;->c:La/xr8;

    .line 106
    .line 107
    invoke-static {p2, p3, p5}, La/y0x0;->L(La/xr8;IZ)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    iput p2, p0, La/zr8;->G:I

    .line 112
    .line 113
    iget-object p2, p13, La/tr8;->d:La/xr8;

    .line 114
    .line 115
    invoke-static {p2, p3, p5}, La/y0x0;->L(La/xr8;IZ)I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    iput p2, p0, La/zr8;->H:I

    .line 120
    .line 121
    iput-object p0, p1, La/et8;->b:La/zr8;

    .line 122
    .line 123
    return-void
.end method

.method public static final e(La/zr8;Ljava/util/List;)La/vs8;
    .locals 4

    .line 1
    iget-object p0, p0, La/zr8;->w:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerY()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    :goto_0
    move-object p0, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object v1, v0

    .line 32
    check-cast v1, La/vs8;

    .line 33
    .line 34
    iget-object v1, v1, La/vs8;->f:Landroid/graphics/Rect;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    sub-int v1, p0, v1

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    move-object v3, v2

    .line 51
    check-cast v3, La/vs8;

    .line 52
    .line 53
    iget-object v3, v3, La/vs8;->f:Landroid/graphics/Rect;

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerY()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    sub-int v3, p0, v3

    .line 60
    .line 61
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-le v1, v3, :cond_3

    .line 66
    .line 67
    move-object v0, v2

    .line 68
    move v1, v3

    .line 69
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :goto_1
    check-cast p0, La/vs8;

    .line 77
    .line 78
    return-object p0
.end method


# virtual methods
.method public final a(IIZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, La/zr8;->n:La/tr8;

    .line 2
    .line 3
    iget-object v0, v0, La/tr8;->b:La/ur8;

    .line 4
    .line 5
    sget-object v1, La/ur8;->b:La/ur8;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    move p2, v2

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, La/zr8;->j(IIZZ)V

    .line 12
    .line 13
    .line 14
    if-gez p1, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    :cond_1
    iget-boolean p1, p0, La/zr8;->j:Z

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p0, p0, La/zr8;->l:La/rs8;

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    iget-object p0, p0, La/rs8;->b:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void
.end method

.method public final b()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/zr8;->s:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, La/zr8;->h:Ljava/util/TreeMap;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->V(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Ljava/lang/Integer;

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x1

    .line 25
    if-eqz v3, :cond_3

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {v2}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    check-cast v7, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->e0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    check-cast v7, Ljava/lang/Integer;

    .line 42
    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    iget v8, v0, La/zr8;->L:I

    .line 50
    .line 51
    add-int/lit8 v9, v8, -0x1

    .line 52
    .line 53
    if-ge v9, v3, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v3, v9

    .line 57
    :goto_0
    add-int/2addr v8, v4

    .line 58
    if-le v8, v7, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v7, v8

    .line 62
    :goto_1
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 63
    .line 64
    invoke-direct {v8, v3, v7, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 69
    .line 70
    invoke-direct {v8, v5, v5, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    new-instance v8, Lkotlin/ranges/IntRange;

    .line 75
    .line 76
    invoke-direct {v8, v5, v5, v6}, Lkotlin/ranges/a;-><init>(III)V

    .line 77
    .line 78
    .line 79
    :goto_2
    iget v3, v8, Lkotlin/ranges/a;->a:I

    .line 80
    .line 81
    iget v7, v8, Lkotlin/ranges/a;->b:I

    .line 82
    .line 83
    if-gt v3, v7, :cond_14

    .line 84
    .line 85
    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v2, v8}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, Ljava/util/List;

    .line 94
    .line 95
    if-nez v8, :cond_5

    .line 96
    .line 97
    :cond_4
    move-object/from16 v21, v2

    .line 98
    .line 99
    move v2, v7

    .line 100
    goto/16 :goto_9

    .line 101
    .line 102
    :cond_5
    invoke-static {v8, v4, v4}, Lkotlin/collections/CollectionsKt;->Q0(Ljava/lang/Iterable;II)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_4

    .line 115
    .line 116
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    check-cast v9, Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    move v10, v5

    .line 127
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    if-eqz v11, :cond_6

    .line 132
    .line 133
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    add-int/lit8 v12, v10, 0x1

    .line 138
    .line 139
    if-ltz v10, :cond_13

    .line 140
    .line 141
    check-cast v11, La/vs8;

    .line 142
    .line 143
    iget-object v10, v11, La/vs8;->b:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    check-cast v14, La/vs8;

    .line 150
    .line 151
    if-nez v14, :cond_8

    .line 152
    .line 153
    :cond_7
    :goto_5
    move-object/from16 v21, v2

    .line 154
    .line 155
    move/from16 v20, v7

    .line 156
    .line 157
    move-object/from16 v22, v8

    .line 158
    .line 159
    move-object/from16 v23, v9

    .line 160
    .line 161
    goto/16 :goto_8

    .line 162
    .line 163
    :cond_8
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    check-cast v15, La/vs8;

    .line 168
    .line 169
    if-nez v15, :cond_9

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_9
    iget-object v4, v11, La/vs8;->a:La/ts8;

    .line 173
    .line 174
    iget-object v4, v4, La/ts8;->c:La/pab;

    .line 175
    .line 176
    if-nez v4, :cond_a

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_a
    iget-object v4, v14, La/vs8;->a:La/ts8;

    .line 180
    .line 181
    iget-object v4, v4, La/ts8;->c:La/pab;

    .line 182
    .line 183
    if-nez v4, :cond_b

    .line 184
    .line 185
    iget-object v4, v15, La/vs8;->a:La/ts8;

    .line 186
    .line 187
    iget-object v4, v4, La/ts8;->c:La/pab;

    .line 188
    .line 189
    if-nez v4, :cond_b

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_b
    iget-object v4, v0, La/zr8;->p:Ljava/util/LinkedHashSet;

    .line 193
    .line 194
    invoke-interface {v4, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    iget-object v5, v0, La/zr8;->p:Ljava/util/LinkedHashSet;

    .line 199
    .line 200
    invoke-interface {v5, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    const/16 v16, 0x0

    .line 205
    .line 206
    iget-object v13, v0, La/zr8;->p:Ljava/util/LinkedHashSet;

    .line 207
    .line 208
    invoke-interface {v13, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    if-nez v4, :cond_c

    .line 213
    .line 214
    if-eqz v5, :cond_7

    .line 215
    .line 216
    if-nez v13, :cond_c

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_c
    iget v4, v0, La/zr8;->G:I

    .line 220
    .line 221
    iget v15, v0, La/zr8;->H:I

    .line 222
    .line 223
    if-nez v5, :cond_d

    .line 224
    .line 225
    if-nez v13, :cond_d

    .line 226
    .line 227
    new-instance v5, La/st8;

    .line 228
    .line 229
    iget-object v10, v11, La/vs8;->f:Landroid/graphics/Rect;

    .line 230
    .line 231
    iget v13, v10, Landroid/graphics/Rect;->left:I

    .line 232
    .line 233
    invoke-virtual {v10}, Landroid/graphics/Rect;->centerY()I

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    iget-object v11, v11, La/vs8;->f:Landroid/graphics/Rect;

    .line 238
    .line 239
    iget v14, v11, Landroid/graphics/Rect;->left:I

    .line 240
    .line 241
    sub-int/2addr v14, v15

    .line 242
    sub-int/2addr v14, v4

    .line 243
    invoke-virtual {v11}, Landroid/graphics/Rect;->centerY()I

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    invoke-direct {v5, v13, v10, v14, v4}, La/st8;-><init>(IIII)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_d
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    if-ne v5, v6, :cond_e

    .line 259
    .line 260
    new-instance v4, La/st8;

    .line 261
    .line 262
    iget-object v5, v14, La/vs8;->f:Landroid/graphics/Rect;

    .line 263
    .line 264
    iget v10, v5, Landroid/graphics/Rect;->right:I

    .line 265
    .line 266
    invoke-virtual {v5}, Landroid/graphics/Rect;->centerY()I

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    iget-object v11, v11, La/vs8;->f:Landroid/graphics/Rect;

    .line 271
    .line 272
    iget v13, v11, Landroid/graphics/Rect;->left:I

    .line 273
    .line 274
    invoke-virtual {v11}, Landroid/graphics/Rect;->centerY()I

    .line 275
    .line 276
    .line 277
    move-result v11

    .line 278
    invoke-direct {v4, v10, v5, v13, v11}, La/st8;-><init>(IIII)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto/16 :goto_5

    .line 285
    .line 286
    :cond_e
    new-instance v5, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 289
    .line 290
    .line 291
    iget-object v13, v14, La/vs8;->f:Landroid/graphics/Rect;

    .line 292
    .line 293
    iget v13, v13, Landroid/graphics/Rect;->right:I

    .line 294
    .line 295
    add-int/2addr v13, v4

    .line 296
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    const/4 v10, 0x0

    .line 301
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v14

    .line 305
    if-eqz v14, :cond_11

    .line 306
    .line 307
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v14

    .line 311
    add-int/lit8 v17, v10, 0x1

    .line 312
    .line 313
    if-ltz v10, :cond_10

    .line 314
    .line 315
    check-cast v14, La/vs8;

    .line 316
    .line 317
    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    .line 318
    .line 319
    if-nez v10, :cond_f

    .line 320
    .line 321
    iget-object v10, v14, La/vs8;->f:Landroid/graphics/Rect;

    .line 322
    .line 323
    iget v10, v10, Landroid/graphics/Rect;->top:I

    .line 324
    .line 325
    move/from16 v20, v7

    .line 326
    .line 327
    int-to-double v6, v10

    .line 328
    iget v10, v14, La/vs8;->e:F

    .line 329
    .line 330
    move-wide/from16 v21, v6

    .line 331
    .line 332
    float-to-double v6, v10

    .line 333
    div-double v6, v6, v18

    .line 334
    .line 335
    add-double v6, v6, v21

    .line 336
    .line 337
    move-object/from16 v21, v2

    .line 338
    .line 339
    move-object/from16 v22, v8

    .line 340
    .line 341
    move-object/from16 v23, v9

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_f
    move/from16 v20, v7

    .line 345
    .line 346
    iget v6, v14, La/vs8;->e:F

    .line 347
    .line 348
    iget-object v7, v14, La/vs8;->f:Landroid/graphics/Rect;

    .line 349
    .line 350
    iget v10, v7, Landroid/graphics/Rect;->top:I

    .line 351
    .line 352
    int-to-float v10, v10

    .line 353
    move-object/from16 v21, v2

    .line 354
    .line 355
    add-float v2, v6, v10

    .line 356
    .line 357
    move-object/from16 v22, v8

    .line 358
    .line 359
    move-object/from16 v23, v9

    .line 360
    .line 361
    float-to-double v8, v2

    .line 362
    iget v2, v7, Landroid/graphics/Rect;->bottom:I

    .line 363
    .line 364
    int-to-float v2, v2

    .line 365
    sub-float/2addr v2, v6

    .line 366
    sub-float/2addr v2, v10

    .line 367
    float-to-double v6, v2

    .line 368
    div-double v6, v6, v18

    .line 369
    .line 370
    add-double/2addr v6, v8

    .line 371
    :goto_7
    double-to-float v2, v6

    .line 372
    iget-object v6, v11, La/vs8;->f:Landroid/graphics/Rect;

    .line 373
    .line 374
    invoke-virtual {v6}, Landroid/graphics/Rect;->exactCenterY()F

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    iget v7, v14, La/vs8;->c:F

    .line 379
    .line 380
    invoke-static {v2, v6, v7}, La/p7x;->F(FFF)F

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    float-to-int v2, v2

    .line 385
    new-instance v6, La/st8;

    .line 386
    .line 387
    iget-object v7, v14, La/vs8;->f:Landroid/graphics/Rect;

    .line 388
    .line 389
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 390
    .line 391
    invoke-direct {v6, v7, v2, v13, v2}, La/st8;-><init>(IIII)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move/from16 v10, v17

    .line 398
    .line 399
    move/from16 v7, v20

    .line 400
    .line 401
    move-object/from16 v2, v21

    .line 402
    .line 403
    move-object/from16 v8, v22

    .line 404
    .line 405
    move-object/from16 v9, v23

    .line 406
    .line 407
    const/4 v6, 0x1

    .line 408
    goto :goto_6

    .line 409
    :cond_10
    invoke-static {}, La/q3d;->p()V

    .line 410
    .line 411
    .line 412
    throw v16

    .line 413
    :cond_11
    move-object/from16 v21, v2

    .line 414
    .line 415
    move/from16 v20, v7

    .line 416
    .line 417
    move-object/from16 v22, v8

    .line 418
    .line 419
    move-object/from16 v23, v9

    .line 420
    .line 421
    new-instance v2, La/st8;

    .line 422
    .line 423
    iget-object v4, v11, La/vs8;->f:Landroid/graphics/Rect;

    .line 424
    .line 425
    iget v6, v4, Landroid/graphics/Rect;->left:I

    .line 426
    .line 427
    invoke-virtual {v4}, Landroid/graphics/Rect;->centerY()I

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    iget-object v7, v11, La/vs8;->f:Landroid/graphics/Rect;

    .line 432
    .line 433
    iget v8, v7, Landroid/graphics/Rect;->left:I

    .line 434
    .line 435
    sub-int/2addr v8, v15

    .line 436
    invoke-virtual {v7}, Landroid/graphics/Rect;->centerY()I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    invoke-direct {v2, v6, v4, v8, v7}, La/st8;-><init>(IIII)V

    .line 441
    .line 442
    .line 443
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    check-cast v4, La/st8;

    .line 448
    .line 449
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    check-cast v6, La/st8;

    .line 454
    .line 455
    if-eqz v4, :cond_12

    .line 456
    .line 457
    if-eqz v6, :cond_12

    .line 458
    .line 459
    new-instance v9, La/st8;

    .line 460
    .line 461
    iget v10, v4, La/st8;->c:I

    .line 462
    .line 463
    iget v4, v4, La/st8;->d:I

    .line 464
    .line 465
    invoke-direct {v9, v10, v4, v8, v7}, La/st8;-><init>(IIII)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    new-instance v4, La/st8;

    .line 472
    .line 473
    iget v9, v6, La/st8;->c:I

    .line 474
    .line 475
    iget v6, v6, La/st8;->d:I

    .line 476
    .line 477
    invoke-direct {v4, v9, v6, v8, v7}, La/st8;-><init>(IIII)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    :cond_12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 487
    .line 488
    .line 489
    :goto_8
    move v10, v12

    .line 490
    move/from16 v7, v20

    .line 491
    .line 492
    move-object/from16 v2, v21

    .line 493
    .line 494
    move-object/from16 v8, v22

    .line 495
    .line 496
    move-object/from16 v9, v23

    .line 497
    .line 498
    const/4 v4, 0x2

    .line 499
    const/4 v5, 0x0

    .line 500
    const/4 v6, 0x1

    .line 501
    goto/16 :goto_4

    .line 502
    .line 503
    :cond_13
    const/16 v16, 0x0

    .line 504
    .line 505
    invoke-static {}, La/q3d;->p()V

    .line 506
    .line 507
    .line 508
    throw v16

    .line 509
    :goto_9
    if-eq v3, v2, :cond_14

    .line 510
    .line 511
    add-int/lit8 v3, v3, 0x1

    .line 512
    .line 513
    move v7, v2

    .line 514
    move-object/from16 v2, v21

    .line 515
    .line 516
    const/4 v4, 0x2

    .line 517
    const/4 v5, 0x0

    .line 518
    const/4 v6, 0x1

    .line 519
    goto/16 :goto_3

    .line 520
    .line 521
    :cond_14
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    iget-object v0, v0, La/zr8;->a:La/et8;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    iget-object v0, v0, La/et8;->c:La/pz40;

    .line 534
    .line 535
    check-cast v0, La/hgk0;

    .line 536
    .line 537
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/zr8;->j:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, La/zr8;->I:Landroid/graphics/Rect;

    .line 6
    .line 7
    iget-object p0, p0, La/zr8;->l:La/rs8;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/rs8;->c:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final d(La/a1m0;II)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, La/a1m0;->c:Ljava/util/Map;

    .line 8
    .line 9
    if-gez v2, :cond_0

    .line 10
    .line 11
    sget-object v0, La/iun;->a:La/iun;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v4, v1, La/a1m0;->a:Ljava/util/List;

    .line 15
    .line 16
    add-int/lit8 v5, v2, 0x1

    .line 17
    .line 18
    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, Ljava/util/List;

    .line 27
    .line 28
    if-nez v5, :cond_1

    .line 29
    .line 30
    sget-object v5, La/iun;->a:La/iun;

    .line 31
    .line 32
    :cond_1
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/util/List;

    .line 41
    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    sget-object v3, La/iun;->a:La/iun;

    .line 45
    .line 46
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-ne v5, v6, :cond_3

    .line 55
    .line 56
    move/from16 v5, p3

    .line 57
    .line 58
    move v6, v5

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    mul-int/lit8 v5, p3, 0x2

    .line 61
    .line 62
    add-int/lit8 v6, v5, 0x1

    .line 63
    .line 64
    :goto_0
    new-instance v7, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const/4 v8, 0x0

    .line 74
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-eqz v9, :cond_6

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    add-int/lit8 v10, v8, 0x1

    .line 85
    .line 86
    if-ltz v8, :cond_5

    .line 87
    .line 88
    move-object v14, v9

    .line 89
    check-cast v14, La/pab;

    .line 90
    .line 91
    if-gt v5, v8, :cond_4

    .line 92
    .line 93
    if-gt v8, v6, :cond_4

    .line 94
    .line 95
    new-instance v11, La/ts8;

    .line 96
    .line 97
    add-int/lit8 v9, v2, -0x1

    .line 98
    .line 99
    invoke-virtual {v0, v1, v9, v8}, La/zr8;->d(La/a1m0;II)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    iget-object v8, v14, La/pab;->a:La/lk50;

    .line 104
    .line 105
    iget-object v9, v14, La/pab;->d:La/v5l0;

    .line 106
    .line 107
    iget-object v13, v0, La/zr8;->b:La/bs8;

    .line 108
    .line 109
    invoke-virtual {v13, v8, v9}, La/bs8;->a(La/lk50;La/v5l0;)I

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    move-object v15, v8

    .line 118
    check-cast v15, Ljava/lang/String;

    .line 119
    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    invoke-direct/range {v11 .. v16}, La/ts8;-><init>(Ljava/util/List;ILa/pab;Ljava/lang/String;La/ts8;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    :cond_4
    move v8, v10

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 131
    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    throw v0

    .line 135
    :cond_6
    return-object v7
.end method

.method public final f()Z
    .locals 5

    .line 1
    iget v0, p0, La/zr8;->L:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La/zr8;->h:Ljava/util/TreeMap;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/util/List;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/vs8;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, La/vs8;->f:Landroid/graphics/Rect;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v2

    .line 34
    :goto_0
    iget v3, p0, La/zr8;->L:I

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    add-int/2addr v3, v4

    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v1, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/util/List;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, La/vs8;

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    iget-object v1, v1, La/vs8;->f:Landroid/graphics/Rect;

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move v1, v2

    .line 66
    :goto_1
    if-le v0, v1, :cond_2

    .line 67
    .line 68
    move v0, v1

    .line 69
    :cond_2
    iget-object p0, p0, La/zr8;->w:Landroid/graphics/Rect;

    .line 70
    .line 71
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 72
    .line 73
    if-lt v0, p0, :cond_3

    .line 74
    .line 75
    return v4

    .line 76
    :cond_3
    return v2
.end method

.method public final g(I)I
    .locals 4

    .line 1
    iget-object v0, p0, La/zr8;->E:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/sr8;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v0, v0, La/sr8;->a:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    invoke-static {v1, p1}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_1
    move-object v2, p1

    .line 25
    check-cast v2, La/kkx;

    .line 26
    .line 27
    iget-boolean v2, v2, La/kkx;->c:Z

    .line 28
    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    check-cast v2, La/bkx;

    .line 33
    .line 34
    invoke-virtual {v2}, La/bkx;->nextInt()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget-object v3, p0, La/zr8;->D:Ljava/util/List;

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, La/rr8;

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    iget-boolean v2, v2, La/rr8;->a:Z

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    move v2, v1

    .line 54
    :goto_2
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget v2, p0, La/zr8;->c:I

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    iget v2, p0, La/zr8;->y:I

    .line 60
    .line 61
    :goto_3
    add-int/2addr v0, v2

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    neg-int p0, v0

    .line 64
    return p0
.end method

.method public final h(F)I
    .locals 4

    .line 1
    float-to-int v0, p1

    .line 2
    invoke-virtual {p0, v0}, La/zr8;->g(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    int-to-float v1, v1

    .line 7
    neg-float v1, v1

    .line 8
    iget-object v2, p0, La/zr8;->D:Ljava/util/List;

    .line 9
    .line 10
    add-int/lit8 v3, v0, 0x1

    .line 11
    .line 12
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, La/rr8;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget-boolean v2, v2, La/rr8;->a:Z

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    :goto_0
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget v2, p0, La/zr8;->c:I

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget v2, p0, La/zr8;->y:I

    .line 30
    .line 31
    :goto_1
    int-to-float v2, v2

    .line 32
    int-to-float v0, v0

    .line 33
    invoke-static {p1, v0, v2, v1}, La/rw2;->a(FFFF)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    float-to-int p1, p1

    .line 38
    neg-int p1, p1

    .line 39
    iget p0, p0, La/zr8;->A:F

    .line 40
    .line 41
    float-to-int p0, p0

    .line 42
    sub-int/2addr p1, p0

    .line 43
    return p1
.end method

.method public final i(Ljava/util/List;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/zr8;->o:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_6

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/4 v3, 0x0

    .line 31
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_5

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    add-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    if-ltz v3, :cond_4

    .line 44
    .line 45
    check-cast v4, La/vs8;

    .line 46
    .line 47
    if-lez v3, :cond_1

    .line 48
    .line 49
    iget v3, p0, La/zr8;->f:I

    .line 50
    .line 51
    add-int/2addr v0, v3

    .line 52
    :cond_1
    iget-object v3, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 53
    .line 54
    iget-object v4, v4, La/vs8;->a:La/ts8;

    .line 55
    .line 56
    iget v6, v4, La/ts8;->b:I

    .line 57
    .line 58
    const/16 v7, 0x5c

    .line 59
    .line 60
    if-eqz v6, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move v6, v7

    .line 64
    :goto_2
    add-int/2addr v6, v0

    .line 65
    iget v8, v3, Landroid/graphics/Rect;->left:I

    .line 66
    .line 67
    iget v9, v3, Landroid/graphics/Rect;->right:I

    .line 68
    .line 69
    invoke-virtual {v3, v8, v0, v9, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 70
    .line 71
    .line 72
    iget v3, v4, La/ts8;->b:I

    .line 73
    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    move v7, v3

    .line 77
    :cond_3
    add-int/2addr v0, v7

    .line 78
    move v3, v5

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    throw p0

    .line 85
    :cond_5
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-nez v1, :cond_0

    .line 90
    .line 91
    iget v1, p0, La/zr8;->g:I

    .line 92
    .line 93
    add-int/2addr v0, v1

    .line 94
    goto :goto_0

    .line 95
    :cond_6
    return-void
.end method

.method public final j(IIZZ)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget v2, v0, La/zr8;->A:F

    .line 6
    .line 7
    move/from16 v3, p1

    .line 8
    .line 9
    int-to-float v3, v3

    .line 10
    add-float/2addr v3, v2

    .line 11
    iput v3, v0, La/zr8;->A:F

    .line 12
    .line 13
    iget v4, v0, La/zr8;->C:I

    .line 14
    .line 15
    int-to-float v4, v4

    .line 16
    neg-float v4, v4

    .line 17
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static {v4, v3}, Ljava/lang/Math;->min(FF)F

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iput v3, v0, La/zr8;->A:F

    .line 27
    .line 28
    iget v3, v0, La/zr8;->B:F

    .line 29
    .line 30
    int-to-float v5, v1

    .line 31
    add-float/2addr v3, v5

    .line 32
    iput v3, v0, La/zr8;->B:F

    .line 33
    .line 34
    invoke-static {v4, v3}, Ljava/lang/Math;->min(FF)F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iput v3, v0, La/zr8;->B:F

    .line 39
    .line 40
    iget v3, v0, La/zr8;->A:F

    .line 41
    .line 42
    sub-float/2addr v3, v2

    .line 43
    float-to-int v2, v3

    .line 44
    invoke-virtual {v0}, La/zr8;->m()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, La/zr8;->f()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    iget v5, v0, La/zr8;->L:I

    .line 52
    .line 53
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget-object v6, v0, La/zr8;->h:Ljava/util/TreeMap;

    .line 58
    .line 59
    invoke-virtual {v6, v5}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Ljava/util/List;

    .line 64
    .line 65
    if-eqz v5, :cond_0

    .line 66
    .line 67
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, La/vs8;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/4 v5, 0x0

    .line 75
    :goto_0
    invoke-virtual {v0}, La/zr8;->f()Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    iget v9, v0, La/zr8;->L:I

    .line 80
    .line 81
    const/4 v10, 0x1

    .line 82
    if-eqz v8, :cond_2

    .line 83
    .line 84
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-virtual {v6, v8}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    check-cast v8, Ljava/util/List;

    .line 93
    .line 94
    if-eqz v8, :cond_1

    .line 95
    .line 96
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    check-cast v8, La/vs8;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    const/4 v8, 0x0

    .line 104
    goto :goto_1

    .line 105
    :cond_2
    invoke-virtual {v6}, Ljava/util/TreeMap;->size()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    sub-int/2addr v8, v10

    .line 110
    iget v11, v0, La/zr8;->L:I

    .line 111
    .line 112
    if-ge v9, v8, :cond_4

    .line 113
    .line 114
    add-int/2addr v11, v10

    .line 115
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    invoke-virtual {v6, v8}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, Ljava/util/List;

    .line 124
    .line 125
    if-nez v8, :cond_3

    .line 126
    .line 127
    sget-object v8, La/iun;->a:La/iun;

    .line 128
    .line 129
    :cond_3
    invoke-static {v0, v8}, La/zr8;->e(La/zr8;Ljava/util/List;)La/vs8;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    goto :goto_1

    .line 134
    :cond_4
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-virtual {v6, v8}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    check-cast v8, Ljava/util/List;

    .line 143
    .line 144
    if-nez v8, :cond_5

    .line 145
    .line 146
    sget-object v8, La/iun;->a:La/iun;

    .line 147
    .line 148
    :cond_5
    invoke-static {v0, v8}, La/zr8;->e(La/zr8;Ljava/util/List;)La/vs8;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    :goto_1
    if-eqz v5, :cond_33

    .line 153
    .line 154
    if-nez v8, :cond_6

    .line 155
    .line 156
    goto/16 :goto_1e

    .line 157
    .line 158
    :cond_6
    new-instance v9, Landroid/graphics/Rect;

    .line 159
    .line 160
    iget-object v8, v8, La/vs8;->f:Landroid/graphics/Rect;

    .line 161
    .line 162
    invoke-direct {v9, v8}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 163
    .line 164
    .line 165
    new-instance v8, Landroid/graphics/Rect;

    .line 166
    .line 167
    iget-object v5, v5, La/vs8;->f:Landroid/graphics/Rect;

    .line 168
    .line 169
    invoke-direct {v8, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 170
    .line 171
    .line 172
    const/4 v5, 0x0

    .line 173
    invoke-virtual {v8, v2, v5}, Landroid/graphics/Rect;->offset(II)V

    .line 174
    .line 175
    .line 176
    iget v11, v8, Landroid/graphics/Rect;->right:I

    .line 177
    .line 178
    iget v12, v0, La/zr8;->G:I

    .line 179
    .line 180
    iget v13, v0, La/zr8;->H:I

    .line 181
    .line 182
    const/16 v14, 0x10

    .line 183
    .line 184
    invoke-static {v11, v12, v13, v14}, La/hne;->D(IIII)I

    .line 185
    .line 186
    .line 187
    move-result v15

    .line 188
    const/16 p1, 0x0

    .line 189
    .line 190
    iget v7, v0, La/zr8;->c:I

    .line 191
    .line 192
    sub-int/2addr v15, v7

    .line 193
    iget v7, v8, Landroid/graphics/Rect;->left:I

    .line 194
    .line 195
    invoke-static {v15, v7}, Ljava/lang/Math;->max(II)I

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    sub-int/2addr v11, v7

    .line 200
    invoke-virtual {v6}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    if-eqz v8, :cond_1c

    .line 213
    .line 214
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    check-cast v8, Ljava/util/Map$Entry;

    .line 219
    .line 220
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v16

    .line 224
    check-cast v16, Ljava/lang/Number;

    .line 225
    .line 226
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    check-cast v8, Ljava/util/List;

    .line 235
    .line 236
    move/from16 v16, v10

    .line 237
    .line 238
    iget v10, v0, La/zr8;->L:I

    .line 239
    .line 240
    if-lt v5, v10, :cond_1b

    .line 241
    .line 242
    if-ne v5, v10, :cond_13

    .line 243
    .line 244
    invoke-virtual {v6}, Ljava/util/TreeMap;->size()I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    add-int/lit8 v10, v10, -0x1

    .line 249
    .line 250
    if-ge v5, v10, :cond_13

    .line 251
    .line 252
    if-nez v11, :cond_7

    .line 253
    .line 254
    const/high16 v10, 0x3f800000    # 1.0f

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_7
    iget v10, v0, La/zr8;->L:I

    .line 258
    .line 259
    iget v15, v0, La/zr8;->F:I

    .line 260
    .line 261
    invoke-static {v15, v12, v13, v14}, La/hne;->D(IIII)I

    .line 262
    .line 263
    .line 264
    move-result v15

    .line 265
    iget v14, v0, La/zr8;->A:F

    .line 266
    .line 267
    neg-float v14, v14

    .line 268
    mul-int/2addr v10, v15

    .line 269
    int-to-float v10, v10

    .line 270
    sub-float/2addr v14, v10

    .line 271
    int-to-float v10, v15

    .line 272
    div-float/2addr v14, v10

    .line 273
    invoke-static {v4, v14}, Ljava/lang/Math;->max(FF)F

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 278
    .line 279
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-virtual {v6, v5}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    check-cast v5, Ljava/util/List;

    .line 288
    .line 289
    if-nez v5, :cond_8

    .line 290
    .line 291
    sget-object v5, La/iun;->a:La/iun;

    .line 292
    .line 293
    :cond_8
    invoke-virtual {v0, v5}, La/zr8;->i(Ljava/util/List;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v8}, La/zr8;->i(Ljava/util/List;)V

    .line 297
    .line 298
    .line 299
    const/4 v5, 0x2

    .line 300
    invoke-static {v8, v5, v5}, Lkotlin/collections/CollectionsKt;->Q0(Ljava/lang/Iterable;II)Ljava/util/ArrayList;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    if-eqz v8, :cond_10

    .line 313
    .line 314
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v8

    .line 318
    check-cast v8, Ljava/util/List;

    .line 319
    .line 320
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v14

    .line 324
    check-cast v14, La/vs8;

    .line 325
    .line 326
    if-eqz v14, :cond_f

    .line 327
    .line 328
    iget-object v14, v14, La/vs8;->g:La/vs8;

    .line 329
    .line 330
    if-nez v14, :cond_9

    .line 331
    .line 332
    goto/16 :goto_a

    .line 333
    .line 334
    :cond_9
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    const/4 v15, 0x0

    .line 339
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v18

    .line 343
    if-eqz v18, :cond_f

    .line 344
    .line 345
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v18

    .line 349
    add-int/lit8 v20, v15, 0x1

    .line 350
    .line 351
    if-ltz v15, :cond_e

    .line 352
    .line 353
    move-object/from16 v4, v18

    .line 354
    .line 355
    check-cast v4, La/vs8;

    .line 356
    .line 357
    move/from16 v22, v3

    .line 358
    .line 359
    iget-object v3, v14, La/vs8;->b:Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    move-object/from16 v18, v5

    .line 366
    .line 367
    move/from16 v5, v16

    .line 368
    .line 369
    if-ne v3, v5, :cond_a

    .line 370
    .line 371
    const/4 v3, 0x0

    .line 372
    iput v3, v4, La/vs8;->c:F

    .line 373
    .line 374
    iget-object v3, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 375
    .line 376
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 377
    .line 378
    int-to-float v3, v3

    .line 379
    iput v3, v4, La/vs8;->e:F

    .line 380
    .line 381
    goto/16 :goto_9

    .line 382
    .line 383
    :cond_a
    iget v3, v0, La/zr8;->L:I

    .line 384
    .line 385
    iget v5, v0, La/zr8;->z:I

    .line 386
    .line 387
    if-eq v3, v5, :cond_b

    .line 388
    .line 389
    iget-object v3, v14, La/vs8;->f:Landroid/graphics/Rect;

    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_b
    iget-object v3, v0, La/zr8;->I:Landroid/graphics/Rect;

    .line 393
    .line 394
    :goto_6
    if-nez v3, :cond_c

    .line 395
    .line 396
    iget-object v3, v14, La/vs8;->f:Landroid/graphics/Rect;

    .line 397
    .line 398
    :cond_c
    if-nez v15, :cond_d

    .line 399
    .line 400
    iget-object v5, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 401
    .line 402
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 403
    .line 404
    int-to-float v5, v5

    .line 405
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerY()I

    .line 406
    .line 407
    .line 408
    move-result v15

    .line 409
    int-to-float v15, v15

    .line 410
    invoke-static {v5, v15, v10}, La/p7x;->F(FFF)F

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    iget-object v15, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 415
    .line 416
    iget v15, v15, Landroid/graphics/Rect;->top:I

    .line 417
    .line 418
    int-to-float v15, v15

    .line 419
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerY()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    int-to-float v3, v3

    .line 424
    move/from16 v23, v3

    .line 425
    .line 426
    iget v3, v4, La/vs8;->d:F

    .line 427
    .line 428
    sub-float v3, v23, v3

    .line 429
    .line 430
    invoke-static {v15, v3, v10}, La/p7x;->F(FFF)F

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    float-to-int v3, v3

    .line 435
    iget-object v15, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 436
    .line 437
    move/from16 v23, v3

    .line 438
    .line 439
    iget v3, v15, Landroid/graphics/Rect;->top:I

    .line 440
    .line 441
    sub-int v3, v23, v3

    .line 442
    .line 443
    move/from16 v23, v5

    .line 444
    .line 445
    const/4 v5, 0x0

    .line 446
    invoke-virtual {v15, v5, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 447
    .line 448
    .line 449
    :goto_7
    move/from16 v5, v23

    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_d
    iget-object v5, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 453
    .line 454
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 455
    .line 456
    int-to-float v5, v5

    .line 457
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerY()I

    .line 458
    .line 459
    .line 460
    move-result v15

    .line 461
    int-to-float v15, v15

    .line 462
    invoke-static {v5, v15, v10}, La/p7x;->F(FFF)F

    .line 463
    .line 464
    .line 465
    move-result v5

    .line 466
    iget-object v15, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 467
    .line 468
    iget v15, v15, Landroid/graphics/Rect;->top:I

    .line 469
    .line 470
    int-to-float v15, v15

    .line 471
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerY()I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    int-to-float v3, v3

    .line 476
    move/from16 v23, v3

    .line 477
    .line 478
    iget v3, v4, La/vs8;->d:F

    .line 479
    .line 480
    add-float v3, v23, v3

    .line 481
    .line 482
    move/from16 v23, v3

    .line 483
    .line 484
    iget-object v3, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 485
    .line 486
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    int-to-float v3, v3

    .line 491
    sub-float v3, v23, v3

    .line 492
    .line 493
    invoke-static {v15, v3, v10}, La/p7x;->F(FFF)F

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    float-to-int v3, v3

    .line 498
    iget-object v15, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 499
    .line 500
    move/from16 v23, v3

    .line 501
    .line 502
    iget v3, v15, Landroid/graphics/Rect;->top:I

    .line 503
    .line 504
    sub-int v3, v23, v3

    .line 505
    .line 506
    move/from16 v23, v5

    .line 507
    .line 508
    const/4 v5, 0x0

    .line 509
    invoke-virtual {v15, v5, v3}, Landroid/graphics/Rect;->offset(II)V

    .line 510
    .line 511
    .line 512
    goto :goto_7

    .line 513
    :goto_8
    iget-object v3, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 514
    .line 515
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 516
    .line 517
    int-to-float v3, v3

    .line 518
    sub-float/2addr v5, v3

    .line 519
    iput v5, v4, La/vs8;->e:F

    .line 520
    .line 521
    iput v10, v4, La/vs8;->c:F

    .line 522
    .line 523
    :goto_9
    move-object/from16 v5, v18

    .line 524
    .line 525
    move/from16 v15, v20

    .line 526
    .line 527
    move/from16 v3, v22

    .line 528
    .line 529
    const/4 v4, 0x0

    .line 530
    const/16 v16, 0x1

    .line 531
    .line 532
    goto/16 :goto_5

    .line 533
    .line 534
    :cond_e
    invoke-static {}, La/q3d;->p()V

    .line 535
    .line 536
    .line 537
    throw p1

    .line 538
    :cond_f
    :goto_a
    move/from16 v22, v3

    .line 539
    .line 540
    move-object/from16 v18, v5

    .line 541
    .line 542
    move-object/from16 v5, v18

    .line 543
    .line 544
    move/from16 v3, v22

    .line 545
    .line 546
    const/4 v4, 0x0

    .line 547
    const/16 v16, 0x1

    .line 548
    .line 549
    goto/16 :goto_4

    .line 550
    .line 551
    :cond_10
    move/from16 v22, v3

    .line 552
    .line 553
    iget v3, v0, La/zr8;->K:F

    .line 554
    .line 555
    invoke-static {v3}, La/si30;->b(F)I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    iget v4, v0, La/zr8;->z:I

    .line 560
    .line 561
    if-eq v3, v4, :cond_12

    .line 562
    .line 563
    iget-boolean v4, v0, La/zr8;->J:Z

    .line 564
    .line 565
    if-nez v4, :cond_12

    .line 566
    .line 567
    iget-object v4, v0, La/zr8;->l:La/rs8;

    .line 568
    .line 569
    if-eqz v4, :cond_11

    .line 570
    .line 571
    iget-object v4, v4, La/rs8;->a:La/ydr;

    .line 572
    .line 573
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    invoke-static/range {p3 .. p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 578
    .line 579
    .line 580
    move-result-object v8

    .line 581
    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 582
    .line 583
    .line 584
    move-result-object v10

    .line 585
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 586
    .line 587
    invoke-interface {v4, v5, v8, v10, v14}, La/ydr;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    :cond_11
    iput v3, v0, La/zr8;->z:I

    .line 591
    .line 592
    :cond_12
    move-object/from16 v24, v7

    .line 593
    .line 594
    const/4 v3, 0x0

    .line 595
    goto/16 :goto_11

    .line 596
    .line 597
    :cond_13
    move/from16 v22, v3

    .line 598
    .line 599
    const/4 v5, 0x2

    .line 600
    invoke-static {v8, v5}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    const/4 v4, 0x0

    .line 609
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 610
    .line 611
    .line 612
    move-result v5

    .line 613
    if-eqz v5, :cond_12

    .line 614
    .line 615
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v5

    .line 619
    check-cast v5, Ljava/util/List;

    .line 620
    .line 621
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 622
    .line 623
    .line 624
    move-result-object v8

    .line 625
    const/4 v10, 0x0

    .line 626
    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 627
    .line 628
    .line 629
    move-result v14

    .line 630
    if-eqz v14, :cond_19

    .line 631
    .line 632
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v14

    .line 636
    add-int/lit8 v15, v10, 0x1

    .line 637
    .line 638
    if-ltz v10, :cond_18

    .line 639
    .line 640
    check-cast v14, La/vs8;

    .line 641
    .line 642
    move-object/from16 v20, v3

    .line 643
    .line 644
    iget-object v3, v14, La/vs8;->b:Ljava/util/ArrayList;

    .line 645
    .line 646
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    check-cast v3, La/vs8;

    .line 651
    .line 652
    move/from16 v23, v4

    .line 653
    .line 654
    iget-object v4, v14, La/vs8;->b:Ljava/util/ArrayList;

    .line 655
    .line 656
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v4

    .line 660
    check-cast v4, La/vs8;

    .line 661
    .line 662
    if-eqz v3, :cond_14

    .line 663
    .line 664
    if-eqz v4, :cond_14

    .line 665
    .line 666
    iget-object v3, v3, La/vs8;->f:Landroid/graphics/Rect;

    .line 667
    .line 668
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 669
    .line 670
    move-object/from16 v24, v7

    .line 671
    .line 672
    move-object/from16 v25, v8

    .line 673
    .line 674
    int-to-double v7, v3

    .line 675
    iget-object v4, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 676
    .line 677
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 678
    .line 679
    sub-int/2addr v4, v3

    .line 680
    int-to-double v3, v4

    .line 681
    const-wide/high16 v26, 0x4000000000000000L    # 2.0

    .line 682
    .line 683
    div-double v3, v3, v26

    .line 684
    .line 685
    add-double/2addr v3, v7

    .line 686
    iget-object v7, v14, La/vs8;->f:Landroid/graphics/Rect;

    .line 687
    .line 688
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 689
    .line 690
    .line 691
    move-result v7

    .line 692
    const/16 v18, 0x2

    .line 693
    .line 694
    div-int/lit8 v7, v7, 0x2

    .line 695
    .line 696
    int-to-double v7, v7

    .line 697
    sub-double/2addr v3, v7

    .line 698
    double-to-int v4, v3

    .line 699
    goto :goto_d

    .line 700
    :cond_14
    move-object/from16 v24, v7

    .line 701
    .line 702
    move-object/from16 v25, v8

    .line 703
    .line 704
    if-lez v10, :cond_15

    .line 705
    .line 706
    iget v3, v0, La/zr8;->f:I

    .line 707
    .line 708
    add-int v4, v23, v3

    .line 709
    .line 710
    goto :goto_d

    .line 711
    :cond_15
    move/from16 v4, v23

    .line 712
    .line 713
    :goto_d
    iget-object v3, v14, La/vs8;->f:Landroid/graphics/Rect;

    .line 714
    .line 715
    iget v7, v3, Landroid/graphics/Rect;->top:I

    .line 716
    .line 717
    sub-int v7, v4, v7

    .line 718
    .line 719
    const/4 v8, 0x0

    .line 720
    invoke-virtual {v3, v8, v7}, Landroid/graphics/Rect;->offset(II)V

    .line 721
    .line 722
    .line 723
    const/4 v3, 0x0

    .line 724
    iput v3, v14, La/vs8;->c:F

    .line 725
    .line 726
    if-nez v10, :cond_16

    .line 727
    .line 728
    iget-object v7, v14, La/vs8;->f:Landroid/graphics/Rect;

    .line 729
    .line 730
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 731
    .line 732
    .line 733
    move-result v7

    .line 734
    int-to-float v7, v7

    .line 735
    goto :goto_e

    .line 736
    :cond_16
    move v7, v3

    .line 737
    :goto_e
    iput v7, v14, La/vs8;->e:F

    .line 738
    .line 739
    iget-object v7, v14, La/vs8;->a:La/ts8;

    .line 740
    .line 741
    iget v7, v7, La/ts8;->b:I

    .line 742
    .line 743
    if-eqz v7, :cond_17

    .line 744
    .line 745
    goto :goto_f

    .line 746
    :cond_17
    const/16 v7, 0x5c

    .line 747
    .line 748
    :goto_f
    add-int/2addr v4, v7

    .line 749
    move v10, v15

    .line 750
    move-object/from16 v3, v20

    .line 751
    .line 752
    move-object/from16 v7, v24

    .line 753
    .line 754
    move-object/from16 v8, v25

    .line 755
    .line 756
    goto/16 :goto_c

    .line 757
    .line 758
    :cond_18
    invoke-static {}, La/q3d;->p()V

    .line 759
    .line 760
    .line 761
    throw p1

    .line 762
    :cond_19
    move-object/from16 v20, v3

    .line 763
    .line 764
    move/from16 v23, v4

    .line 765
    .line 766
    move-object/from16 v24, v7

    .line 767
    .line 768
    const/4 v3, 0x0

    .line 769
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 770
    .line 771
    .line 772
    move-result v4

    .line 773
    if-nez v4, :cond_1a

    .line 774
    .line 775
    iget v4, v0, La/zr8;->g:I

    .line 776
    .line 777
    add-int v4, v23, v4

    .line 778
    .line 779
    goto :goto_10

    .line 780
    :cond_1a
    move/from16 v4, v23

    .line 781
    .line 782
    :goto_10
    move-object/from16 v3, v20

    .line 783
    .line 784
    move-object/from16 v7, v24

    .line 785
    .line 786
    goto/16 :goto_b

    .line 787
    .line 788
    :cond_1b
    move/from16 v22, v3

    .line 789
    .line 790
    move v3, v4

    .line 791
    move-object/from16 v24, v7

    .line 792
    .line 793
    :goto_11
    move v4, v3

    .line 794
    move/from16 v3, v22

    .line 795
    .line 796
    move-object/from16 v7, v24

    .line 797
    .line 798
    const/4 v5, 0x0

    .line 799
    const/4 v10, 0x1

    .line 800
    const/16 v14, 0x10

    .line 801
    .line 802
    goto/16 :goto_2

    .line 803
    .line 804
    :cond_1c
    move/from16 v22, v3

    .line 805
    .line 806
    new-instance v3, Landroid/graphics/Rect;

    .line 807
    .line 808
    invoke-direct {v3, v9}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 809
    .line 810
    .line 811
    iget v4, v0, La/zr8;->L:I

    .line 812
    .line 813
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 814
    .line 815
    .line 816
    move-result-object v4

    .line 817
    invoke-virtual {v6, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v4

    .line 821
    check-cast v4, Ljava/util/List;

    .line 822
    .line 823
    if-eqz v4, :cond_1d

    .line 824
    .line 825
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v4

    .line 829
    check-cast v4, La/vs8;

    .line 830
    .line 831
    if-eqz v4, :cond_1d

    .line 832
    .line 833
    iget-object v4, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 834
    .line 835
    if-eqz v4, :cond_1d

    .line 836
    .line 837
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 838
    .line 839
    goto :goto_12

    .line 840
    :cond_1d
    const/4 v4, 0x0

    .line 841
    :goto_12
    iget v5, v0, La/zr8;->L:I

    .line 842
    .line 843
    const/16 v16, 0x1

    .line 844
    .line 845
    add-int/lit8 v5, v5, 0x1

    .line 846
    .line 847
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 848
    .line 849
    .line 850
    move-result-object v5

    .line 851
    invoke-virtual {v6, v5}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v5

    .line 855
    check-cast v5, Ljava/util/List;

    .line 856
    .line 857
    if-eqz v5, :cond_1e

    .line 858
    .line 859
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v5

    .line 863
    check-cast v5, La/vs8;

    .line 864
    .line 865
    if-eqz v5, :cond_1e

    .line 866
    .line 867
    iget-object v5, v5, La/vs8;->f:Landroid/graphics/Rect;

    .line 868
    .line 869
    if-eqz v5, :cond_1e

    .line 870
    .line 871
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 872
    .line 873
    goto :goto_13

    .line 874
    :cond_1e
    const/4 v5, 0x0

    .line 875
    :goto_13
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 876
    .line 877
    .line 878
    move-result v4

    .line 879
    iget-object v5, v0, La/zr8;->n:La/tr8;

    .line 880
    .line 881
    iget-object v5, v5, La/tr8;->b:La/ur8;

    .line 882
    .line 883
    sget-object v7, La/ur8;->a:La/ur8;

    .line 884
    .line 885
    iget-object v8, v0, La/zr8;->o:Landroid/graphics/Rect;

    .line 886
    .line 887
    if-ne v5, v7, :cond_24

    .line 888
    .line 889
    invoke-virtual {v3, v2, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 890
    .line 891
    .line 892
    iget v1, v0, La/zr8;->L:I

    .line 893
    .line 894
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 895
    .line 896
    .line 897
    move-result-object v1

    .line 898
    invoke-virtual {v6, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v1

    .line 902
    check-cast v1, Ljava/util/List;

    .line 903
    .line 904
    if-eqz v1, :cond_1f

    .line 905
    .line 906
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    check-cast v1, La/vs8;

    .line 911
    .line 912
    if-eqz v1, :cond_1f

    .line 913
    .line 914
    iget-object v1, v1, La/vs8;->f:Landroid/graphics/Rect;

    .line 915
    .line 916
    :cond_1f
    iget v1, v0, La/zr8;->L:I

    .line 917
    .line 918
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 919
    .line 920
    .line 921
    move-result-object v1

    .line 922
    invoke-virtual {v6, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    check-cast v1, Ljava/util/List;

    .line 927
    .line 928
    if-eqz v1, :cond_20

    .line 929
    .line 930
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    check-cast v1, La/vs8;

    .line 935
    .line 936
    if-eqz v1, :cond_20

    .line 937
    .line 938
    iget-object v1, v1, La/vs8;->f:Landroid/graphics/Rect;

    .line 939
    .line 940
    if-eqz v1, :cond_20

    .line 941
    .line 942
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 943
    .line 944
    goto :goto_14

    .line 945
    :cond_20
    const/4 v1, 0x0

    .line 946
    :goto_14
    iget v5, v0, La/zr8;->L:I

    .line 947
    .line 948
    const/16 v16, 0x1

    .line 949
    .line 950
    add-int/lit8 v5, v5, 0x1

    .line 951
    .line 952
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 953
    .line 954
    .line 955
    move-result-object v5

    .line 956
    invoke-virtual {v6, v5}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v5

    .line 960
    check-cast v5, Ljava/util/List;

    .line 961
    .line 962
    if-eqz v5, :cond_21

    .line 963
    .line 964
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v5

    .line 968
    check-cast v5, La/vs8;

    .line 969
    .line 970
    if-eqz v5, :cond_21

    .line 971
    .line 972
    iget-object v5, v5, La/vs8;->f:Landroid/graphics/Rect;

    .line 973
    .line 974
    if-eqz v5, :cond_21

    .line 975
    .line 976
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 977
    .line 978
    goto :goto_15

    .line 979
    :cond_21
    const/4 v5, 0x0

    .line 980
    :goto_15
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 981
    .line 982
    .line 983
    move-result v1

    .line 984
    iget v5, v3, Landroid/graphics/Rect;->top:I

    .line 985
    .line 986
    add-int/2addr v1, v5

    .line 987
    iget v7, v0, La/zr8;->m:I

    .line 988
    .line 989
    iget v9, v8, Landroid/graphics/Rect;->bottom:I

    .line 990
    .line 991
    sub-int/2addr v7, v9

    .line 992
    if-gt v1, v7, :cond_22

    .line 993
    .line 994
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 995
    .line 996
    .line 997
    move-result v7

    .line 998
    sub-int/2addr v1, v7

    .line 999
    sub-int/2addr v5, v1

    .line 1000
    iput v5, v3, Landroid/graphics/Rect;->top:I

    .line 1001
    .line 1002
    :cond_22
    add-int/2addr v4, v5

    .line 1003
    if-gez v4, :cond_23

    .line 1004
    .line 1005
    if-eqz v22, :cond_25

    .line 1006
    .line 1007
    :cond_23
    iget v1, v8, Landroid/graphics/Rect;->top:I

    .line 1008
    .line 1009
    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    .line 1010
    .line 1011
    .line 1012
    move-result v1

    .line 1013
    sub-int/2addr v4, v1

    .line 1014
    sub-int/2addr v5, v4

    .line 1015
    iput v5, v3, Landroid/graphics/Rect;->top:I

    .line 1016
    .line 1017
    goto :goto_16

    .line 1018
    :cond_24
    const/16 v16, 0x1

    .line 1019
    .line 1020
    new-instance v3, Landroid/graphics/Rect;

    .line 1021
    .line 1022
    const/4 v5, 0x0

    .line 1023
    invoke-direct {v3, v5, v5, v2, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1024
    .line 1025
    .line 1026
    iget v1, v3, Landroid/graphics/Rect;->top:I

    .line 1027
    .line 1028
    iget v5, v8, Landroid/graphics/Rect;->top:I

    .line 1029
    .line 1030
    sub-int/2addr v4, v5

    .line 1031
    sub-int/2addr v1, v4

    .line 1032
    iput v1, v3, Landroid/graphics/Rect;->top:I

    .line 1033
    .line 1034
    :cond_25
    :goto_16
    invoke-virtual {v6}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v1

    .line 1038
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v1

    .line 1042
    :cond_26
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1043
    .line 1044
    .line 1045
    move-result v3

    .line 1046
    if-eqz v3, :cond_27

    .line 1047
    .line 1048
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v3

    .line 1052
    check-cast v3, Ljava/util/Map$Entry;

    .line 1053
    .line 1054
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v3

    .line 1058
    check-cast v3, Ljava/util/List;

    .line 1059
    .line 1060
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v3

    .line 1064
    :goto_17
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1065
    .line 1066
    .line 1067
    move-result v4

    .line 1068
    if-eqz v4, :cond_26

    .line 1069
    .line 1070
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v4

    .line 1074
    check-cast v4, La/vs8;

    .line 1075
    .line 1076
    iget-object v4, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 1077
    .line 1078
    const/4 v5, 0x0

    .line 1079
    invoke-virtual {v4, v2, v5}, Landroid/graphics/Rect;->offset(II)V

    .line 1080
    .line 1081
    .line 1082
    goto :goto_17

    .line 1083
    :cond_27
    iget-object v1, v0, La/zr8;->q:Ljava/util/ArrayList;

    .line 1084
    .line 1085
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1086
    .line 1087
    .line 1088
    iget-object v2, v0, La/zr8;->r:Ljava/util/LinkedHashSet;

    .line 1089
    .line 1090
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 1091
    .line 1092
    .line 1093
    iget-boolean v3, v0, La/zr8;->u:Z

    .line 1094
    .line 1095
    if-eqz v3, :cond_2a

    .line 1096
    .line 1097
    iget-object v3, v0, La/zr8;->k:Lkotlin/jvm/functions/Function0;

    .line 1098
    .line 1099
    if-eqz v3, :cond_28

    .line 1100
    .line 1101
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v3

    .line 1105
    check-cast v3, Ljava/util/List;

    .line 1106
    .line 1107
    if-nez v3, :cond_29

    .line 1108
    .line 1109
    :cond_28
    sget-object v3, La/iun;->a:La/iun;

    .line 1110
    .line 1111
    :cond_29
    iput-object v3, v0, La/zr8;->t:Ljava/util/List;

    .line 1112
    .line 1113
    const/4 v5, 0x0

    .line 1114
    iput-boolean v5, v0, La/zr8;->u:Z

    .line 1115
    .line 1116
    goto :goto_18

    .line 1117
    :cond_2a
    const/4 v5, 0x0

    .line 1118
    :goto_18
    invoke-virtual {v6}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v3

    .line 1122
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v3

    .line 1126
    :cond_2b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v4

    .line 1130
    if-eqz v4, :cond_32

    .line 1131
    .line 1132
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v4

    .line 1136
    check-cast v4, Ljava/util/Map$Entry;

    .line 1137
    .line 1138
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v4

    .line 1142
    check-cast v4, Ljava/util/List;

    .line 1143
    .line 1144
    const/4 v6, 0x2

    .line 1145
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v4

    .line 1149
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v4

    .line 1153
    :cond_2c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1154
    .line 1155
    .line 1156
    move-result v7

    .line 1157
    if-eqz v7, :cond_2b

    .line 1158
    .line 1159
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v7

    .line 1163
    check-cast v7, Ljava/util/List;

    .line 1164
    .line 1165
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v7

    .line 1169
    move v8, v5

    .line 1170
    :goto_19
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1171
    .line 1172
    .line 1173
    move-result v9

    .line 1174
    if-eqz v9, :cond_2c

    .line 1175
    .line 1176
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v9

    .line 1180
    add-int/lit8 v10, v8, 0x1

    .line 1181
    .line 1182
    if-ltz v8, :cond_31

    .line 1183
    .line 1184
    check-cast v9, La/vs8;

    .line 1185
    .line 1186
    iget-object v11, v9, La/vs8;->f:Landroid/graphics/Rect;

    .line 1187
    .line 1188
    iget v12, v11, Landroid/graphics/Rect;->left:I

    .line 1189
    .line 1190
    iget-object v13, v0, La/zr8;->w:Landroid/graphics/Rect;

    .line 1191
    .line 1192
    iget v14, v13, Landroid/graphics/Rect;->right:I

    .line 1193
    .line 1194
    if-ge v12, v14, :cond_30

    .line 1195
    .line 1196
    iget v12, v13, Landroid/graphics/Rect;->left:I

    .line 1197
    .line 1198
    iget v11, v11, Landroid/graphics/Rect;->right:I

    .line 1199
    .line 1200
    if-ge v12, v11, :cond_30

    .line 1201
    .line 1202
    invoke-interface {v2, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1203
    .line 1204
    .line 1205
    iget-object v11, v0, La/zr8;->t:Ljava/util/List;

    .line 1206
    .line 1207
    iget-object v12, v9, La/vs8;->a:La/ts8;

    .line 1208
    .line 1209
    iget-object v12, v12, La/ts8;->c:La/pab;

    .line 1210
    .line 1211
    if-eqz v12, :cond_2d

    .line 1212
    .line 1213
    iget-object v12, v12, La/pab;->a:La/lk50;

    .line 1214
    .line 1215
    goto :goto_1a

    .line 1216
    :cond_2d
    move-object/from16 v12, p1

    .line 1217
    .line 1218
    :goto_1a
    invoke-static {v11, v12}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v11

    .line 1222
    iget-object v12, v9, La/vs8;->a:La/ts8;

    .line 1223
    .line 1224
    iget-object v13, v12, La/ts8;->c:La/pab;

    .line 1225
    .line 1226
    if-eqz v13, :cond_2e

    .line 1227
    .line 1228
    if-eqz v11, :cond_2e

    .line 1229
    .line 1230
    move/from16 v23, v16

    .line 1231
    .line 1232
    goto :goto_1b

    .line 1233
    :cond_2e
    move/from16 v23, v5

    .line 1234
    .line 1235
    :goto_1b
    new-instance v17, La/us8;

    .line 1236
    .line 1237
    new-instance v11, Landroid/graphics/Rect;

    .line 1238
    .line 1239
    iget-object v13, v9, La/vs8;->f:Landroid/graphics/Rect;

    .line 1240
    .line 1241
    invoke-direct {v11, v13}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 1242
    .line 1243
    .line 1244
    iget v13, v9, La/vs8;->c:F

    .line 1245
    .line 1246
    iget v14, v9, La/vs8;->e:F

    .line 1247
    .line 1248
    iget v9, v9, La/vs8;->d:F

    .line 1249
    .line 1250
    if-nez v8, :cond_2f

    .line 1251
    .line 1252
    sget-object v8, La/qr8;->a:La/qr8;

    .line 1253
    .line 1254
    :goto_1c
    move-object/from16 v24, v8

    .line 1255
    .line 1256
    move/from16 v22, v9

    .line 1257
    .line 1258
    move-object/from16 v19, v11

    .line 1259
    .line 1260
    move-object/from16 v18, v12

    .line 1261
    .line 1262
    move/from16 v20, v13

    .line 1263
    .line 1264
    move/from16 v21, v14

    .line 1265
    .line 1266
    goto :goto_1d

    .line 1267
    :cond_2f
    sget-object v8, La/qr8;->b:La/qr8;

    .line 1268
    .line 1269
    goto :goto_1c

    .line 1270
    :goto_1d
    invoke-direct/range {v17 .. v24}, La/us8;-><init>(La/ts8;Landroid/graphics/Rect;FFFZLa/qr8;)V

    .line 1271
    .line 1272
    .line 1273
    move-object/from16 v8, v17

    .line 1274
    .line 1275
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1276
    .line 1277
    .line 1278
    :cond_30
    move v8, v10

    .line 1279
    goto :goto_19

    .line 1280
    :cond_31
    invoke-static {}, La/q3d;->p()V

    .line 1281
    .line 1282
    .line 1283
    throw p1

    .line 1284
    :cond_32
    iput-object v2, v0, La/zr8;->p:Ljava/util/LinkedHashSet;

    .line 1285
    .line 1286
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v1

    .line 1290
    iget-object v2, v0, La/zr8;->v:La/pz40;

    .line 1291
    .line 1292
    check-cast v2, La/hgk0;

    .line 1293
    .line 1294
    invoke-virtual {v2, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v0}, La/zr8;->b()V

    .line 1298
    .line 1299
    .line 1300
    return-void

    .line 1301
    :cond_33
    :goto_1e
    invoke-virtual {v0}, La/zr8;->b()V

    .line 1302
    .line 1303
    .line 1304
    return-void
.end method

.method public final k(FZZZZLa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p6, La/yr8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/yr8;

    .line 7
    .line 8
    iget v1, v0, La/yr8;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/yr8;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/yr8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, La/yr8;-><init>(La/zr8;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/yr8;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/yr8;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-boolean p2, v0, La/yr8;->i:Z

    .line 37
    .line 38
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p6, p0, La/zr8;->h:Ljava/util/TreeMap;

    .line 53
    .line 54
    invoke-virtual {p6}, Ljava/util/TreeMap;->size()I

    .line 55
    .line 56
    .line 57
    move-result p6

    .line 58
    int-to-float p6, p6

    .line 59
    cmpl-float p6, p1, p6

    .line 60
    .line 61
    if-ltz p6, :cond_3

    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_3
    invoke-virtual {p0}, La/zr8;->m()V

    .line 67
    .line 68
    .line 69
    iget p6, p0, La/zr8;->K:F

    .line 70
    .line 71
    cmpl-float v2, p1, p6

    .line 72
    .line 73
    if-lez v2, :cond_4

    .line 74
    .line 75
    invoke-static {p6}, La/si30;->b(F)I

    .line 76
    .line 77
    .line 78
    move-result p6

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    float-to-double v4, p6

    .line 81
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 82
    .line 83
    .line 84
    move-result-wide v4

    .line 85
    double-to-int p6, v4

    .line 86
    :goto_1
    iput p6, p0, La/zr8;->z:I

    .line 87
    .line 88
    iput-boolean p3, p0, La/zr8;->j:Z

    .line 89
    .line 90
    invoke-virtual {p0, p1}, La/zr8;->h(F)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iput-boolean p2, v0, La/yr8;->i:Z

    .line 95
    .line 96
    iput v3, v0, La/yr8;->l:I

    .line 97
    .line 98
    iget-object p3, p0, La/zr8;->a:La/et8;

    .line 99
    .line 100
    if-eqz p2, :cond_6

    .line 101
    .line 102
    invoke-virtual {p3, p1, p4, p5, v0}, La/et8;->b(IZZLa/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v1, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    iget-object p3, p3, La/et8;->b:La/zr8;

    .line 113
    .line 114
    if-eqz p3, :cond_7

    .line 115
    .line 116
    const/4 p4, 0x0

    .line 117
    invoke-virtual {p3, p1, p4, v3, p5}, La/zr8;->a(IIZZ)V

    .line 118
    .line 119
    .line 120
    :cond_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    :goto_2
    if-ne p1, v1, :cond_8

    .line 123
    .line 124
    return-object v1

    .line 125
    :cond_8
    :goto_3
    if-nez p2, :cond_9

    .line 126
    .line 127
    iput-boolean v3, p0, La/zr8;->j:Z

    .line 128
    .line 129
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0
.end method

.method public final l(La/ts8;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/vs8;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/vs8;-><init>(La/ts8;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/zr8;->i:La/vs8;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/zr8;->h:Ljava/util/TreeMap;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/TreeMap;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, La/zr8;->p:Ljava/util/LinkedHashSet;

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, La/zr8;->q:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, La/zr8;->r:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, La/zr8;->s:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 38
    .line 39
    .line 40
    sget-object v2, La/iun;->a:La/iun;

    .line 41
    .line 42
    iget-object v3, p0, La/zr8;->v:La/pz40;

    .line 43
    .line 44
    check-cast v3, La/hgk0;

    .line 45
    .line 46
    invoke-virtual {v3, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget v2, p0, La/zr8;->c:I

    .line 50
    .line 51
    iget v3, p0, La/zr8;->d:I

    .line 52
    .line 53
    iget-object v4, p0, La/zr8;->w:Landroid/graphics/Rect;

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-virtual {v4, v5, v5, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 57
    .line 58
    .line 59
    iput v5, p0, La/zr8;->z:I

    .line 60
    .line 61
    iget v2, p0, La/zr8;->G:I

    .line 62
    .line 63
    iget v3, p0, La/zr8;->F:I

    .line 64
    .line 65
    add-int/2addr v2, v3

    .line 66
    iget v4, p0, La/zr8;->H:I

    .line 67
    .line 68
    add-int/2addr v2, v4

    .line 69
    iput v2, p0, La/zr8;->y:I

    .line 70
    .line 71
    iget p1, p1, La/ts8;->f:I

    .line 72
    .line 73
    :goto_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_1

    .line 78
    .line 79
    add-int/lit8 v2, p1, -0x1

    .line 80
    .line 81
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    new-instance p1, Ljava/util/ArrayList;

    .line 89
    .line 90
    const/16 v4, 0xa

    .line 91
    .line 92
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-direct {p1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_0

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, La/vs8;

    .line 114
    .line 115
    iget-object v4, v4, La/vs8;->b:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_0
    invoke-static {p1}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    move p1, v2

    .line 126
    goto :goto_0

    .line 127
    :cond_1
    invoke-virtual {v1}, Ljava/util/TreeMap;->size()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    const/4 v0, 0x1

    .line 132
    sub-int/2addr p1, v0

    .line 133
    invoke-virtual {p0, p1}, La/zr8;->g(I)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    neg-int p1, p1

    .line 138
    iget-object v2, p0, La/zr8;->o:Landroid/graphics/Rect;

    .line 139
    .line 140
    iget v4, v2, Landroid/graphics/Rect;->left:I

    .line 141
    .line 142
    add-int/2addr p1, v4

    .line 143
    iput p1, p0, La/zr8;->C:I

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_5

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    check-cast v4, Ljava/util/Map$Entry;

    .line 164
    .line 165
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    check-cast v6, Ljava/lang/Number;

    .line 170
    .line 171
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    check-cast v4, Ljava/util/List;

    .line 180
    .line 181
    iget v7, v2, Landroid/graphics/Rect;->left:I

    .line 182
    .line 183
    iget-object v8, p0, La/zr8;->E:Ljava/util/List;

    .line 184
    .line 185
    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    check-cast v8, La/sr8;

    .line 190
    .line 191
    if-eqz v8, :cond_3

    .line 192
    .line 193
    iget v8, v8, La/sr8;->a:I

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_3
    move v8, v5

    .line 197
    :goto_2
    sub-int/2addr v7, v8

    .line 198
    invoke-virtual {p0, v6}, La/zr8;->g(I)I

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    sub-int/2addr v7, v6

    .line 203
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-eqz v6, :cond_2

    .line 212
    .line 213
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    check-cast v6, La/vs8;

    .line 218
    .line 219
    new-instance v8, Landroid/graphics/Rect;

    .line 220
    .line 221
    iget v9, v2, Landroid/graphics/Rect;->top:I

    .line 222
    .line 223
    add-int v10, v7, v3

    .line 224
    .line 225
    iget-object v11, v6, La/vs8;->a:La/ts8;

    .line 226
    .line 227
    iget v11, v11, La/ts8;->b:I

    .line 228
    .line 229
    if-eqz v11, :cond_4

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_4
    const/16 v11, 0x5c

    .line 233
    .line 234
    :goto_4
    add-int/2addr v11, v9

    .line 235
    invoke-direct {v8, v7, v9, v10, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 236
    .line 237
    .line 238
    iput-object v8, v6, La/vs8;->f:Landroid/graphics/Rect;

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_5
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-eqz v1, :cond_b

    .line 254
    .line 255
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    check-cast v1, Ljava/util/Map$Entry;

    .line 260
    .line 261
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    check-cast v1, Ljava/util/List;

    .line 266
    .line 267
    const/4 v2, 0x2

    .line 268
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-eqz v2, :cond_6

    .line 281
    .line 282
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    check-cast v2, Ljava/util/List;

    .line 287
    .line 288
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-eqz v4, :cond_a

    .line 297
    .line 298
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    check-cast v4, La/vs8;

    .line 303
    .line 304
    iget-object v4, v4, La/vs8;->f:Landroid/graphics/Rect;

    .line 305
    .line 306
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    :cond_8
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    if-eqz v6, :cond_9

    .line 315
    .line 316
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    check-cast v6, La/vs8;

    .line 321
    .line 322
    iget-object v6, v6, La/vs8;->f:Landroid/graphics/Rect;

    .line 323
    .line 324
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    if-le v4, v6, :cond_8

    .line 329
    .line 330
    move v4, v6

    .line 331
    goto :goto_5

    .line 332
    :cond_9
    int-to-float v3, v4

    .line 333
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    int-to-float v4, v4

    .line 338
    div-float/2addr v3, v4

    .line 339
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_7

    .line 348
    .line 349
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    check-cast v4, La/vs8;

    .line 354
    .line 355
    iput v3, v4, La/vs8;->d:F

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_a
    invoke-static {}, La/itt0;->a()V

    .line 359
    .line 360
    .line 361
    return-void

    .line 362
    :cond_b
    const/4 p1, 0x0

    .line 363
    iput p1, p0, La/zr8;->A:F

    .line 364
    .line 365
    invoke-virtual {p0}, La/zr8;->m()V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0, v5}, La/zr8;->g(I)I

    .line 369
    .line 370
    .line 371
    move-result p1

    .line 372
    invoke-virtual {p0, p1, v5, v0, v0}, La/zr8;->j(IIZZ)V

    .line 373
    .line 374
    .line 375
    return-void
.end method

.method public final m()V
    .locals 6

    .line 1
    iget v0, p0, La/zr8;->y:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 8
    .line 9
    iget-object v2, p0, La/zr8;->h:Ljava/util/TreeMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-direct {v0, v3, v2, v4}, Lkotlin/ranges/a;-><init>(III)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    move-object v2, v0

    .line 25
    check-cast v2, La/kkx;

    .line 26
    .line 27
    iget-boolean v2, v2, La/kkx;->c:Z

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    move-object v2, v0

    .line 32
    check-cast v2, La/bkx;

    .line 33
    .line 34
    invoke-virtual {v2}, La/bkx;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    move-object v3, v2

    .line 39
    check-cast v3, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {p0, v3}, La/zr8;->g(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    int-to-float v3, v3

    .line 50
    iget v5, p0, La/zr8;->A:F

    .line 51
    .line 52
    cmpg-float v3, v3, v5

    .line 53
    .line 54
    if-gez v3, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const/4 v2, 0x0

    .line 58
    :goto_0
    check-cast v2, Ljava/lang/Integer;

    .line 59
    .line 60
    if-nez v2, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    sub-int/2addr v0, v4

    .line 68
    if-gez v0, :cond_4

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    invoke-virtual {p0, v0}, La/zr8;->g(I)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iget v3, p0, La/zr8;->A:F

    .line 76
    .line 77
    int-to-float v4, v1

    .line 78
    sub-float/2addr v3, v4

    .line 79
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {p0, v2}, La/zr8;->g(I)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    sub-int/2addr v2, v1

    .line 88
    int-to-float v1, v2

    .line 89
    div-float/2addr v3, v1

    .line 90
    int-to-float v0, v0

    .line 91
    add-float v1, v3, v0

    .line 92
    .line 93
    :goto_1
    iput v1, p0, La/zr8;->K:F

    .line 94
    .line 95
    float-to-int v0, v1

    .line 96
    iput v0, p0, La/zr8;->L:I

    .line 97
    .line 98
    return-void
.end method
