.class public abstract La/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bv3;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/h950;La/roi0;La/gmk0;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/v0;->a:B

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, La/v0;->b:Ljava/lang/Object;

    .line 99
    iput-object p2, p0, La/v0;->c:Ljava/lang/Object;

    .line 100
    iput-object p3, p0, La/v0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    iput-byte v1, v0, La/v0;->a:B

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, La/v0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v2, La/ppv0;

    .line 19
    .line 20
    iget-object v1, v0, La/v0;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ljava/util/UUID;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/16 v34, 0x0

    .line 36
    .line 37
    const v35, 0x1fffffa

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const-wide/16 v9, 0x0

    .line 45
    .line 46
    const-wide/16 v11, 0x0

    .line 47
    .line 48
    const-wide/16 v13, 0x0

    .line 49
    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    const/16 v17, 0x0

    .line 54
    .line 55
    const-wide/16 v18, 0x0

    .line 56
    .line 57
    const-wide/16 v20, 0x0

    .line 58
    .line 59
    const-wide/16 v22, 0x0

    .line 60
    .line 61
    const-wide/16 v24, 0x0

    .line 62
    .line 63
    const/16 v26, 0x0

    .line 64
    .line 65
    const/16 v27, 0x0

    .line 66
    .line 67
    const/16 v28, 0x0

    .line 68
    .line 69
    const-wide/16 v29, 0x0

    .line 70
    .line 71
    const/16 v31, 0x0

    .line 72
    .line 73
    const/16 v32, 0x0

    .line 74
    .line 75
    const/16 v33, 0x0

    .line 76
    .line 77
    invoke-direct/range {v2 .. v35}, La/ppv0;-><init>(Ljava/lang/String;La/zov0;Ljava/lang/String;Ljava/lang/String;La/maj;La/maj;JJJLa/o4e;ILa/af5;JJJJZLa/od80;IJIILjava/lang/String;Ljava/lang/Boolean;I)V

    .line 78
    .line 79
    .line 80
    iput-object v2, v0, La/v0;->c:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    filled-new-array {v1}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, La/dui0;->c([Ljava/lang/Object;)Ljava/util/Set;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iput-object v1, v0, La/v0;->d:Ljava/lang/Object;

    .line 95
    .line 96
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;[La/m50;)V
    .locals 6

    const/4 v0, 0x2

    iput-byte v0, p0, La/v0;->a:B

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput-object p1, p0, La/v0;->b:Ljava/lang/Object;

    .line 108
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 109
    array-length v0, p2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p2, v2

    .line 110
    iget-object v4, v3, La/m50;->a:Ljava/lang/Class;

    .line 111
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    .line 112
    iget-object v5, v3, La/m50;->a:Ljava/lang/Class;

    if-nez v4, :cond_0

    .line 113
    invoke-virtual {p1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 114
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "KeyTypeManager constructed with duplicate factories for primitive "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    invoke-static {v5, p0}, La/ohs0;->l(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 116
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 117
    :cond_1
    array-length v0, p2

    if-lez v0, :cond_2

    .line 118
    aget-object p2, p2, v1

    .line 119
    iget-object p2, p2, La/m50;->a:Ljava/lang/Class;

    .line 120
    iput-object p2, p0, La/v0;->d:Ljava/lang/Object;

    goto :goto_1

    .line 121
    :cond_2
    const-class p2, Ljava/lang/Void;

    iput-object p2, p0, La/v0;->d:Ljava/lang/Object;

    .line 122
    :goto_1
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, La/v0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/v0;->a:B

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v0;->b:Ljava/lang/Object;

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 125
    iput-object v0, p0, La/v0;->d:Ljava/lang/Object;

    .line 126
    iput-object p1, p0, La/v0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/v0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/v0;->c:Ljava/lang/Object;

    .line 102
    const-string p1, "-1"

    .line 103
    invoke-virtual {p3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 104
    const-string p3, ""

    .line 105
    :cond_0
    iput-object p3, p0, La/v0;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public f()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/v0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public g(Ljava/lang/String;)La/v0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/v0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/v0;->r()La/v0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public i(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/v0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, La/v0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/v0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public k()La/lpv0;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/v0;->m()La/lpv0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, La/v0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/ppv0;

    .line 10
    .line 11
    iget-object v2, v2, La/ppv0;->j:La/o4e;

    .line 12
    .line 13
    iget-object v3, v2, La/o4e;->i:Ljava/util/Set;

    .line 14
    .line 15
    check-cast v3, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    iget-boolean v3, v2, La/o4e;->e:Z

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    iget-boolean v3, v2, La/o4e;->c:Z

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    iget-boolean v2, v2, La/o4e;->d:Z

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v2, v5

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    move v2, v4

    .line 41
    :goto_1
    iget-object v3, v0, La/v0;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, La/ppv0;

    .line 44
    .line 45
    iget-boolean v6, v3, La/ppv0;->q:Z

    .line 46
    .line 47
    if-eqz v6, :cond_4

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    iget-wide v7, v3, La/ppv0;->g:J

    .line 53
    .line 54
    const-wide/16 v9, 0x0

    .line 55
    .line 56
    cmp-long v2, v7, v9

    .line 57
    .line 58
    if-gtz v2, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const-string v0, "Expedited jobs cannot be delayed"

    .line 62
    .line 63
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v6

    .line 67
    :cond_3
    const-string v0, "Expedited jobs only support network and storage constraints"

    .line 68
    .line 69
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v6

    .line 73
    :cond_4
    :goto_2
    iget-object v2, v3, La/ppv0;->x:Ljava/lang/String;

    .line 74
    .line 75
    const/16 v6, 0x7f

    .line 76
    .line 77
    if-nez v2, :cond_7

    .line 78
    .line 79
    iget-object v2, v3, La/ppv0;->c:Ljava/lang/String;

    .line 80
    .line 81
    const-string v7, "."

    .line 82
    .line 83
    filled-new-array {v7}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    const/4 v8, 0x6

    .line 88
    invoke-static {v2, v7, v5, v8}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-ne v7, v4, :cond_5

    .line 97
    .line 98
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Ljava/lang/String;

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_5
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/String;

    .line 110
    .line 111
    :goto_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-gt v4, v6, :cond_6

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    invoke-static {v6, v2}, La/ttm0;->L(ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    :goto_4
    iput-object v2, v3, La/ppv0;->x:Ljava/lang/String;

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-le v3, v6, :cond_8

    .line 130
    .line 131
    iget-object v3, v0, La/v0;->c:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, La/ppv0;

    .line 134
    .line 135
    invoke-static {v6, v2}, La/ttm0;->L(ILjava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    iput-object v2, v3, La/ppv0;->x:Ljava/lang/String;

    .line 140
    .line 141
    :cond_8
    :goto_5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iput-object v2, v0, La/v0;->b:Ljava/lang/Object;

    .line 149
    .line 150
    new-instance v3, La/ppv0;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v2, v0, La/v0;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, La/ppv0;

    .line 162
    .line 163
    iget-object v6, v2, La/ppv0;->c:Ljava/lang/String;

    .line 164
    .line 165
    iget-object v5, v2, La/ppv0;->b:La/zov0;

    .line 166
    .line 167
    iget-object v7, v2, La/ppv0;->d:Ljava/lang/String;

    .line 168
    .line 169
    new-instance v8, La/maj;

    .line 170
    .line 171
    iget-object v9, v2, La/ppv0;->e:La/maj;

    .line 172
    .line 173
    invoke-direct {v8, v9}, La/maj;-><init>(La/maj;)V

    .line 174
    .line 175
    .line 176
    new-instance v9, La/maj;

    .line 177
    .line 178
    iget-object v10, v2, La/ppv0;->f:La/maj;

    .line 179
    .line 180
    invoke-direct {v9, v10}, La/maj;-><init>(La/maj;)V

    .line 181
    .line 182
    .line 183
    iget-wide v10, v2, La/ppv0;->g:J

    .line 184
    .line 185
    iget-wide v12, v2, La/ppv0;->h:J

    .line 186
    .line 187
    iget-wide v14, v2, La/ppv0;->i:J

    .line 188
    .line 189
    move-object/from16 v37, v1

    .line 190
    .line 191
    new-instance v1, La/o4e;

    .line 192
    .line 193
    move-object/from16 v16, v3

    .line 194
    .line 195
    iget-object v3, v2, La/ppv0;->j:La/o4e;

    .line 196
    .line 197
    invoke-direct {v1, v3}, La/o4e;-><init>(La/o4e;)V

    .line 198
    .line 199
    .line 200
    iget v3, v2, La/ppv0;->k:I

    .line 201
    .line 202
    move-object/from16 v17, v1

    .line 203
    .line 204
    iget-object v1, v2, La/ppv0;->l:La/af5;

    .line 205
    .line 206
    move/from16 v19, v3

    .line 207
    .line 208
    move-object/from16 v18, v4

    .line 209
    .line 210
    iget-wide v3, v2, La/ppv0;->m:J

    .line 211
    .line 212
    move-wide/from16 v20, v3

    .line 213
    .line 214
    iget-wide v3, v2, La/ppv0;->n:J

    .line 215
    .line 216
    move-wide/from16 v22, v3

    .line 217
    .line 218
    iget-wide v3, v2, La/ppv0;->o:J

    .line 219
    .line 220
    move-wide/from16 v24, v3

    .line 221
    .line 222
    iget-wide v3, v2, La/ppv0;->p:J

    .line 223
    .line 224
    move-object/from16 v26, v1

    .line 225
    .line 226
    iget-boolean v1, v2, La/ppv0;->q:Z

    .line 227
    .line 228
    move/from16 v27, v1

    .line 229
    .line 230
    iget-object v1, v2, La/ppv0;->r:La/od80;

    .line 231
    .line 232
    move-object/from16 v28, v1

    .line 233
    .line 234
    iget v1, v2, La/ppv0;->s:I

    .line 235
    .line 236
    move-wide/from16 v29, v3

    .line 237
    .line 238
    iget-wide v3, v2, La/ppv0;->u:J

    .line 239
    .line 240
    move/from16 v31, v1

    .line 241
    .line 242
    iget v1, v2, La/ppv0;->v:I

    .line 243
    .line 244
    move/from16 v32, v1

    .line 245
    .line 246
    iget v1, v2, La/ppv0;->w:I

    .line 247
    .line 248
    move/from16 v33, v1

    .line 249
    .line 250
    iget-object v1, v2, La/ppv0;->x:Ljava/lang/String;

    .line 251
    .line 252
    iget-object v2, v2, La/ppv0;->y:Ljava/lang/Boolean;

    .line 253
    .line 254
    const/high16 v36, 0x80000

    .line 255
    .line 256
    move-object/from16 v34, v1

    .line 257
    .line 258
    move-object/from16 v35, v2

    .line 259
    .line 260
    move-wide/from16 v38, v3

    .line 261
    .line 262
    move-object/from16 v3, v16

    .line 263
    .line 264
    move-object/from16 v16, v17

    .line 265
    .line 266
    move-object/from16 v4, v18

    .line 267
    .line 268
    move/from16 v17, v19

    .line 269
    .line 270
    move-wide/from16 v19, v20

    .line 271
    .line 272
    move-wide/from16 v21, v22

    .line 273
    .line 274
    move-wide/from16 v23, v24

    .line 275
    .line 276
    move-object/from16 v18, v26

    .line 277
    .line 278
    move-wide/from16 v25, v29

    .line 279
    .line 280
    move/from16 v29, v31

    .line 281
    .line 282
    move-wide/from16 v30, v38

    .line 283
    .line 284
    invoke-direct/range {v3 .. v36}, La/ppv0;-><init>(Ljava/lang/String;La/zov0;Ljava/lang/String;Ljava/lang/String;La/maj;La/maj;JJJLa/o4e;ILa/af5;JJJJZLa/od80;IJIILjava/lang/String;Ljava/lang/Boolean;I)V

    .line 285
    .line 286
    .line 287
    iput-object v3, v0, La/v0;->c:Ljava/lang/Object;

    .line 288
    .line 289
    return-object v37
.end method

.method public l()V
    .locals 2

    .line 1
    iget-object v0, p0, La/v0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v1, v0}, La/hne;->k(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/v0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public m()La/lpv0;
    .locals 3

    .line 1
    new-instance v0, La/yl60;

    .line 2
    .line 3
    iget-object v1, p0, La/v0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/UUID;

    .line 6
    .line 7
    iget-object v2, p0, La/v0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/ppv0;

    .line 10
    .line 11
    iget-object p0, p0, La/v0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/Set;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, p0}, La/lpv0;-><init>(Ljava/util/UUID;La/ppv0;Ljava/util/Set;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public n()V
    .locals 1

    .line 1
    iget-object v0, p0, La/v0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/v0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, La/v0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0}, La/v0;->u()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public abstract o()La/swq;
.end method

.method public p()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public abstract q()Ljava/lang/String;
.end method

.method public r()La/v0;
    .locals 0

    .line 1
    return-object p0
.end method

.method public abstract s()La/p4;
.end method

.method public abstract t()La/eky;
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, La/v0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, ": "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, La/v0;->o()La/swq;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_2
    iget-object p0, p0, La/v0;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ljava/lang/String;

    .line 44
    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public u()V
    .locals 0

    .line 1
    iget-object p0, p0, La/v0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/e7z;

    .line 4
    .line 5
    invoke-virtual {p0}, La/e7z;->Q()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract v(La/og9;)La/x3;
.end method

.method public w()La/v0;
    .locals 3

    .line 1
    sget-object v0, La/od80;->a:La/od80;

    .line 2
    .line 3
    iget-object v1, p0, La/v0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/ppv0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    iput-boolean v2, v1, La/ppv0;->q:Z

    .line 9
    .line 10
    iput-object v0, v1, La/ppv0;->r:La/od80;

    .line 11
    .line 12
    check-cast p0, La/xl60;

    .line 13
    .line 14
    return-object p0
.end method

.method public x(JLjava/util/concurrent/TimeUnit;)La/v0;
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/v0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/ppv0;

    .line 7
    .line 8
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    iput-wide p1, v0, La/ppv0;->g:J

    .line 13
    .line 14
    const-wide p1, 0x7fffffffffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sub-long/2addr p1, v0

    .line 24
    iget-object p3, p0, La/v0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p3, La/ppv0;

    .line 27
    .line 28
    iget-wide v0, p3, La/ppv0;->g:J

    .line 29
    .line 30
    cmp-long p1, p1, v0

    .line 31
    .line 32
    if-lez p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, La/v0;->r()La/v0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    const-string p0, "The given initial delay is too large and will cause an overflow!"

    .line 40
    .line 41
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public abstract y(La/x3;)V
.end method
