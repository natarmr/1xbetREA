.class public final La/z2i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:La/u3i;

.field public final synthetic b:La/u3i;

.field public final synthetic c:La/u3i;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public constructor <init>(La/u3i;La/u3i;La/u3i;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z2i;->a:La/u3i;

    .line 5
    .line 6
    iput-object p2, p0, La/z2i;->b:La/u3i;

    .line 7
    .line 8
    iput-object p3, p0, La/z2i;->c:La/u3i;

    .line 9
    .line 10
    iput p4, p0, La/z2i;->d:I

    .line 11
    .line 12
    iput p5, p0, La/z2i;->e:I

    .line 13
    .line 14
    iput p6, p0, La/z2i;->f:I

    .line 15
    .line 16
    iput p7, p0, La/z2i;->g:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 9
    .line 10
    .line 11
    move-result v9

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, La/pj30;

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, La/pj30;

    .line 25
    .line 26
    iget-object v5, v0, La/z2i;->a:La/u3i;

    .line 27
    .line 28
    instance-of v5, v5, La/z3i;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x2

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    invoke-static {v7, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, La/pj30;

    .line 39
    .line 40
    const/4 v7, 0x3

    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    const/4 v15, 0x0

    .line 44
    const/16 v16, 0xa

    .line 45
    .line 46
    const/4 v12, 0x0

    .line 47
    const/4 v13, 0x0

    .line 48
    const/4 v14, 0x0

    .line 49
    move-wide/from16 v10, p3

    .line 50
    .line 51
    invoke-static/range {v10 .. v16}, La/p4e;->b(JIIIII)J

    .line 52
    .line 53
    .line 54
    move-result-wide v12

    .line 55
    invoke-interface {v5, v12, v13}, La/pj30;->S(J)La/pu90;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move-object v5, v6

    .line 61
    :goto_0
    iget-object v8, v0, La/z2i;->b:La/u3i;

    .line 62
    .line 63
    instance-of v8, v8, La/x3i;

    .line 64
    .line 65
    if-eqz v8, :cond_2

    .line 66
    .line 67
    add-int/lit8 v8, v7, 0x1

    .line 68
    .line 69
    invoke-static {v7, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    check-cast v7, La/pj30;

    .line 74
    .line 75
    if-eqz v7, :cond_1

    .line 76
    .line 77
    const/16 v19, 0x0

    .line 78
    .line 79
    const/16 v20, 0xa

    .line 80
    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    const/16 v18, 0x0

    .line 86
    .line 87
    move-wide/from16 v14, p3

    .line 88
    .line 89
    invoke-static/range {v14 .. v20}, La/p4e;->b(JIIIII)J

    .line 90
    .line 91
    .line 92
    move-result-wide v10

    .line 93
    invoke-interface {v7, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    goto :goto_2

    .line 98
    :cond_1
    :goto_1
    move-object v7, v6

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    move v8, v7

    .line 101
    goto :goto_1

    .line 102
    :goto_2
    iget-object v10, v0, La/z2i;->c:La/u3i;

    .line 103
    .line 104
    instance-of v10, v10, La/s3i;

    .line 105
    .line 106
    if-eqz v10, :cond_3

    .line 107
    .line 108
    invoke-static {v8, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, La/pj30;

    .line 113
    .line 114
    if-eqz v1, :cond_3

    .line 115
    .line 116
    const/16 v19, 0x0

    .line 117
    .line 118
    const/16 v20, 0xa

    .line 119
    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    const/16 v17, 0x0

    .line 123
    .line 124
    const/16 v18, 0x0

    .line 125
    .line 126
    move-wide/from16 v14, p3

    .line 127
    .line 128
    invoke-static/range {v14 .. v20}, La/p4e;->b(JIIIII)J

    .line 129
    .line 130
    .line 131
    move-result-wide v10

    .line 132
    invoke-interface {v1, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    :cond_3
    move-object v8, v6

    .line 137
    filled-new-array {v5, v7, v8}, [La/pu90;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    move v6, v2

    .line 152
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    if-eqz v10, :cond_4

    .line 157
    .line 158
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    check-cast v10, La/pu90;

    .line 163
    .line 164
    iget v10, v10, La/pu90;->a:I

    .line 165
    .line 166
    add-int/2addr v6, v10

    .line 167
    goto :goto_3

    .line 168
    :cond_4
    iget v1, v0, La/z2i;->e:I

    .line 169
    .line 170
    iget v10, v0, La/z2i;->d:I

    .line 171
    .line 172
    sub-int v11, v9, v10

    .line 173
    .line 174
    sub-int/2addr v11, v1

    .line 175
    sub-int/2addr v11, v6

    .line 176
    if-gez v11, :cond_5

    .line 177
    .line 178
    move v1, v2

    .line 179
    goto :goto_4

    .line 180
    :cond_5
    move v1, v11

    .line 181
    :goto_4
    if-gez v11, :cond_6

    .line 182
    .line 183
    move v6, v2

    .line 184
    goto :goto_5

    .line 185
    :cond_6
    move v6, v11

    .line 186
    :goto_5
    const/16 v12, 0xc

    .line 187
    .line 188
    invoke-static {v1, v6, v2, v2, v12}, La/r4e;->b(IIIII)J

    .line 189
    .line 190
    .line 191
    move-result-wide v13

    .line 192
    invoke-interface {v3, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    if-gez v11, :cond_7

    .line 197
    .line 198
    move v1, v2

    .line 199
    goto :goto_6

    .line 200
    :cond_7
    move v1, v11

    .line 201
    :goto_6
    if-gez v11, :cond_8

    .line 202
    .line 203
    move v11, v2

    .line 204
    :cond_8
    invoke-static {v1, v11, v2, v2, v12}, La/r4e;->b(IIIII)J

    .line 205
    .line 206
    .line 207
    move-result-wide v1

    .line 208
    invoke-interface {v4, v1, v2}, La/pj30;->S(J)La/pu90;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    move-object v6, v5

    .line 213
    move-object v5, v1

    .line 214
    new-instance v1, La/y2i;

    .line 215
    .line 216
    iget v4, v0, La/z2i;->d:I

    .line 217
    .line 218
    move v2, v10

    .line 219
    iget v10, v0, La/z2i;->f:I

    .line 220
    .line 221
    iget v11, v0, La/z2i;->f:I

    .line 222
    .line 223
    invoke-direct/range {v1 .. v11}, La/y2i;-><init>(ILa/pu90;ILa/pu90;La/pu90;La/pu90;La/pu90;III)V

    .line 224
    .line 225
    .line 226
    iget v0, v0, La/z2i;->g:I

    .line 227
    .line 228
    move-object/from16 v2, p1

    .line 229
    .line 230
    invoke-static {v2, v9, v0, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    return-object v0
.end method
