.class public final La/x2h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:I


# direct methods
.method public constructor <init>(FFII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p3, p0, La/x2h;->a:I

    .line 5
    .line 6
    iput p1, p0, La/x2h;->b:F

    .line 7
    .line 8
    iput p2, p0, La/x2h;->c:F

    .line 9
    .line 10
    iput p4, p0, La/x2h;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result v8

    .line 18
    const/4 v9, 0x7

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    move-wide/from16 v3, p3

    .line 23
    .line 24
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 25
    .line 26
    .line 27
    move-result-wide v11

    .line 28
    iget v1, v0, La/x2h;->b:F

    .line 29
    .line 30
    float-to-int v1, v1

    .line 31
    iget v2, v0, La/x2h;->c:F

    .line 32
    .line 33
    float-to-int v2, v2

    .line 34
    iget v3, v0, La/x2h;->d:I

    .line 35
    .line 36
    mul-int/lit8 v4, v3, 0x2

    .line 37
    .line 38
    new-instance v13, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v15, 0x1

    .line 48
    move v14, v15

    .line 49
    :goto_0
    if-ge v14, v5, :cond_0

    .line 50
    .line 51
    move-object/from16 v6, p2

    .line 52
    .line 53
    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    move-object v10, v7

    .line 58
    check-cast v10, La/pj30;

    .line 59
    .line 60
    invoke-static/range {v10 .. v15}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 61
    .line 62
    .line 63
    move-result v14

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move-object/from16 v6, p2

    .line 66
    .line 67
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const/4 v7, 0x0

    .line 72
    move v8, v7

    .line 73
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_1

    .line 78
    .line 79
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    check-cast v9, La/pu90;

    .line 84
    .line 85
    invoke-virtual {v9}, La/pu90;->d0()I

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    add-int/2addr v9, v4

    .line 90
    add-int/2addr v8, v9

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    invoke-static {v11, v12}, La/p4e;->h(J)I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    sub-int/2addr v5, v4

    .line 97
    sub-int/2addr v5, v8

    .line 98
    sub-int/2addr v5, v4

    .line 99
    if-lt v5, v1, :cond_5

    .line 100
    .line 101
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, La/pj30;

    .line 106
    .line 107
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iget v0, v0, La/x2h;->a:I

    .line 116
    .line 117
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    filled-new-array {v2, v5, v6}, [Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->l0(Ljava/util/List;)Ljava/lang/Comparable;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-ltz v0, :cond_2

    .line 140
    .line 141
    move v5, v15

    .line 142
    goto :goto_2

    .line 143
    :cond_2
    move v5, v7

    .line 144
    :goto_2
    if-ltz v2, :cond_3

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_3
    move v15, v7

    .line 148
    :goto_3
    and-int/2addr v5, v15

    .line 149
    if-nez v5, :cond_4

    .line 150
    .line 151
    const-string v5, "width and height must be >= 0"

    .line 152
    .line 153
    invoke-static {v5}, La/zcx;->a(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_4
    invoke-static {v0, v0, v2, v2}, La/r4e;->h(IIII)J

    .line 157
    .line 158
    .line 159
    move-result-wide v5

    .line 160
    invoke-interface {v1, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v13, v7, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_5
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_6

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, La/pu90;

    .line 182
    .line 183
    invoke-virtual {v1}, La/pu90;->d0()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    add-int/2addr v1, v4

    .line 188
    add-int/2addr v7, v1

    .line 189
    goto :goto_4

    .line 190
    :cond_6
    invoke-static {v11, v12}, La/p4e;->h(J)I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    sub-int/2addr v0, v7

    .line 195
    div-int/lit8 v0, v0, 0x2

    .line 196
    .line 197
    new-instance v14, La/kie0;

    .line 198
    .line 199
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    iput v0, v14, La/kie0;->a:I

    .line 207
    .line 208
    invoke-static {v11, v12}, La/p4e;->i(J)I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    invoke-static {v11, v12}, La/p4e;->h(J)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    new-instance v10, La/w2h;

    .line 217
    .line 218
    const/16 v16, 0x0

    .line 219
    .line 220
    move-wide/from16 v17, v11

    .line 221
    .line 222
    move-object v11, v13

    .line 223
    move-wide/from16 v12, v17

    .line 224
    .line 225
    move v15, v3

    .line 226
    invoke-direct/range {v10 .. v16}, La/w2h;-><init>(Ljava/util/ArrayList;JLa/kie0;IB)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v2, p1

    .line 230
    .line 231
    invoke-static {v2, v0, v1, v10}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    return-object v0
.end method
