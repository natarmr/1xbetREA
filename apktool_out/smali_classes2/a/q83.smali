.class public final La/q83;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bv9;


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/util/ArrayList;

.field public final c:La/o83;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/util/ArrayList;La/o83;)V
    .locals 7

    sget-object v4, La/p83;->b:La/p83;

    .line 173
    new-instance v5, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 174
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 175
    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    .line 176
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 177
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 178
    invoke-direct/range {v0 .. v5}, La/q83;-><init>(Ljava/lang/Class;Ljava/util/ArrayList;La/o83;La/p83;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/util/ArrayList;La/o83;La/p83;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/q83;->a:Ljava/lang/Class;

    .line 11
    .line 12
    iput-object p2, p0, La/q83;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    iput-object p3, p0, La/q83;->c:La/o83;

    .line 15
    .line 16
    iput-object p5, p0, La/q83;->d:Ljava/util/List;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 p2, 0xa

    .line 21
    .line 22
    invoke-static {p5, p2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p5

    .line 37
    if-eqz p5, :cond_0

    .line 38
    .line 39
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p5

    .line 43
    check-cast p5, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 46
    .line 47
    .line 48
    move-result-object p5

    .line 49
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iput-object p1, p0, La/q83;->e:Ljava/util/ArrayList;

    .line 54
    .line 55
    iget-object p1, p0, La/q83;->d:Ljava/util/List;

    .line 56
    .line 57
    new-instance p3, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-static {p1, p2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result p5

    .line 63
    invoke-direct {p3, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result p5

    .line 74
    if-eqz p5, :cond_2

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p5

    .line 80
    check-cast p5, Ljava/lang/reflect/Method;

    .line 81
    .line 82
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object p5

    .line 86
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {p5}, La/bqe0;->e(Ljava/lang/Class;)Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-nez v0, :cond_1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_1
    move-object p5, v0

    .line 97
    :goto_2
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    iput-object p3, p0, La/q83;->f:Ljava/util/ArrayList;

    .line 102
    .line 103
    iget-object p1, p0, La/q83;->d:Ljava/util/List;

    .line 104
    .line 105
    new-instance p3, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-static {p1, p2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_3

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    check-cast p2, Ljava/lang/reflect/Method;

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    iput-object p3, p0, La/q83;->g:Ljava/util/ArrayList;

    .line 139
    .line 140
    iget-object p1, p0, La/q83;->c:La/o83;

    .line 141
    .line 142
    sget-object p2, La/o83;->b:La/o83;

    .line 143
    .line 144
    if-ne p1, p2, :cond_5

    .line 145
    .line 146
    sget-object p1, La/p83;->a:La/p83;

    .line 147
    .line 148
    if-ne p4, p1, :cond_5

    .line 149
    .line 150
    iget-object p0, p0, La/q83;->b:Ljava/util/ArrayList;

    .line 151
    .line 152
    const-string p1, "value"

    .line 153
    .line 154
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-eqz p0, :cond_4

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_4
    const-string p0, "Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead."

    .line 166
    .line 167
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const/4 p0, 0x0

    .line 171
    throw p0

    .line 172
    :cond_5
    :goto_4
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/q83;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length v2, v1

    .line 9
    iget-object v3, v0, La/q83;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ne v4, v2, :cond_d

    .line 16
    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    array-length v3, v1

    .line 20
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    array-length v3, v1

    .line 24
    const/4 v4, 0x0

    .line 25
    move v6, v4

    .line 26
    move v7, v6

    .line 27
    :goto_0
    iget-object v8, v0, La/q83;->b:Ljava/util/ArrayList;

    .line 28
    .line 29
    if-ge v6, v3, :cond_c

    .line 30
    .line 31
    aget-object v9, v1, v6

    .line 32
    .line 33
    add-int/lit8 v10, v7, 0x1

    .line 34
    .line 35
    iget-object v11, v0, La/q83;->f:Ljava/util/ArrayList;

    .line 36
    .line 37
    if-nez v9, :cond_0

    .line 38
    .line 39
    iget-object v12, v0, La/q83;->c:La/o83;

    .line 40
    .line 41
    sget-object v13, La/o83;->a:La/o83;

    .line 42
    .line 43
    if-ne v12, v13, :cond_0

    .line 44
    .line 45
    iget-object v9, v0, La/q83;->g:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    :goto_1
    const/16 v17, 0x0

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_0
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    check-cast v12, Ljava/lang/Class;

    .line 59
    .line 60
    instance-of v13, v9, Ljava/lang/Class;

    .line 61
    .line 62
    if-eqz v13, :cond_1

    .line 63
    .line 64
    :goto_2
    const/4 v9, 0x0

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    instance-of v13, v9, La/sgy;

    .line 67
    .line 68
    if-eqz v13, :cond_3

    .line 69
    .line 70
    check-cast v9, La/sgy;

    .line 71
    .line 72
    invoke-static {v9}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    :cond_2
    const/16 v17, 0x0

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_3
    instance-of v13, v9, [Ljava/lang/Object;

    .line 80
    .line 81
    if-eqz v13, :cond_2

    .line 82
    .line 83
    move-object v13, v9

    .line 84
    check-cast v13, [Ljava/lang/Object;

    .line 85
    .line 86
    instance-of v14, v13, [Ljava/lang/Class;

    .line 87
    .line 88
    if-eqz v14, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    instance-of v14, v13, [La/sgy;

    .line 92
    .line 93
    if-eqz v14, :cond_6

    .line 94
    .line 95
    check-cast v9, [La/sgy;

    .line 96
    .line 97
    new-instance v13, Ljava/util/ArrayList;

    .line 98
    .line 99
    array-length v14, v9

    .line 100
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    array-length v14, v9

    .line 104
    move v15, v4

    .line 105
    :goto_3
    if-ge v15, v14, :cond_5

    .line 106
    .line 107
    aget-object v16, v9, v15

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    invoke-static/range {v16 .. v16}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    add-int/lit8 v15, v15, 0x1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    const/16 v17, 0x0

    .line 122
    .line 123
    new-array v5, v4, [Ljava/lang/Class;

    .line 124
    .line 125
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    goto :goto_4

    .line 130
    :cond_6
    const/16 v17, 0x0

    .line 131
    .line 132
    move-object v9, v13

    .line 133
    :goto_4
    invoke-virtual {v12, v9}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_7

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_7
    move-object/from16 v9, v17

    .line 141
    .line 142
    :goto_5
    if-nez v9, :cond_b

    .line 143
    .line 144
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, Ljava/lang/Class;

    .line 155
    .line 156
    const-class v2, Ljava/lang/Class;

    .line 157
    .line 158
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_8

    .line 163
    .line 164
    sget-object v1, La/sre0;->a:La/tre0;

    .line 165
    .line 166
    const-class v2, La/sgy;

    .line 167
    .line 168
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    :goto_6
    move-object v3, v2

    .line 173
    move-object v2, v1

    .line 174
    goto :goto_7

    .line 175
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_9

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_9

    .line 190
    .line 191
    sget-object v1, La/sre0;->a:La/tre0;

    .line 192
    .line 193
    const-class v2, [La/sgy;

    .line 194
    .line 195
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    goto :goto_6

    .line 200
    :cond_9
    sget-object v2, La/sre0;->a:La/tre0;

    .line 201
    .line 202
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    move-object v3, v1

    .line 207
    move-object v1, v2

    .line 208
    :goto_7
    invoke-interface {v3}, La/sgy;->v()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    const-class v5, [Ljava/lang/Object;

    .line 213
    .line 214
    invoke-virtual {v1, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-interface {v1}, La/sgy;->v()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_a

    .line 227
    .line 228
    new-instance v1, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-interface {v3}, La/sgy;->v()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const/16 v4, 0x3c

    .line 241
    .line 242
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-static {v3}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-interface {v2}, La/sgy;->v()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const/16 v2, 0x3e

    .line 268
    .line 269
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    goto :goto_8

    .line 277
    :cond_a
    invoke-interface {v3}, La/sgy;->v()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    :goto_8
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 282
    .line 283
    new-instance v3, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    const-string v4, "Argument #"

    .line 286
    .line 287
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    const/16 v4, 0x20

    .line 294
    .line 295
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string v0, " is not of the required type "

    .line 302
    .line 303
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw v2

    .line 317
    :cond_b
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    add-int/lit8 v6, v6, 0x1

    .line 321
    .line 322
    move v7, v10

    .line 323
    goto/16 :goto_0

    .line 324
    .line 325
    :cond_c
    invoke-static {v8, v2}, Lkotlin/collections/CollectionsKt;->T0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-static {v1}, La/xp20;->m(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    iget-object v2, v0, La/q83;->d:Ljava/util/List;

    .line 334
    .line 335
    iget-object v0, v0, La/q83;->a:Ljava/lang/Class;

    .line 336
    .line 337
    invoke-static {v0, v1, v2}, La/jiq0;->l0(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    return-object v0

    .line 342
    :cond_d
    const/16 v17, 0x0

    .line 343
    .line 344
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    invoke-static {v0, v2}, La/c99;->i(II)V

    .line 349
    .line 350
    .line 351
    return-object v17
.end method

.method public final getReturnType()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, La/q83;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method
