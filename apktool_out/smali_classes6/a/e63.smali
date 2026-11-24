.class public final La/e63;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/e63;->a:B

    iput p1, p0, La/e63;->b:F

    iput-object p2, p0, La/e63;->c:Ljava/lang/Object;

    iput-object p3, p0, La/e63;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-byte v3, v0, La/e63;->a:B

    .line 8
    .line 9
    const/4 v10, 0x1

    .line 10
    iget-object v11, v0, La/e63;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v12, v0, La/e63;->d:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v3, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v13, 0x0

    .line 25
    if-gez v3, :cond_0

    .line 26
    .line 27
    move v14, v13

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v14, v3

    .line 30
    :goto_0
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-gez v3, :cond_1

    .line 35
    .line 36
    move/from16 v20, v13

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move/from16 v20, v3

    .line 40
    .line 41
    :goto_1
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    move-object v15, v3

    .line 46
    check-cast v15, La/pj30;

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    const/16 v9, 0xa

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    move-wide/from16 v3, p3

    .line 55
    .line 56
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    invoke-interface {v15, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 61
    .line 62
    .line 63
    move-result-object v15

    .line 64
    iget v3, v15, La/pu90;->b:I

    .line 65
    .line 66
    check-cast v12, La/l7m0;

    .line 67
    .line 68
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    iget v0, v0, La/e63;->b:F

    .line 79
    .line 80
    mul-float/2addr v4, v0

    .line 81
    invoke-interface {v1, v4}, La/w6k;->T(F)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    sub-int/2addr v3, v0

    .line 86
    invoke-static {v13, v3}, Ljava/lang/Math;->max(II)I

    .line 87
    .line 88
    .line 89
    move-result v18

    .line 90
    check-cast v11, Lkotlin/jvm/functions/Function2;

    .line 91
    .line 92
    if-eqz v11, :cond_2

    .line 93
    .line 94
    const/4 v0, 0x2

    .line 95
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/pj30;

    .line 100
    .line 101
    const/4 v8, 0x0

    .line 102
    const/16 v9, 0xa

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    const/4 v6, 0x0

    .line 106
    const/4 v7, 0x0

    .line 107
    move-wide/from16 v3, p3

    .line 108
    .line 109
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 110
    .line 111
    .line 112
    move-result-wide v5

    .line 113
    invoke-interface {v0, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    goto :goto_2

    .line 118
    :cond_2
    move-wide/from16 v3, p3

    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    :goto_2
    if-eqz v0, :cond_3

    .line 122
    .line 123
    iget v5, v0, La/pu90;->b:I

    .line 124
    .line 125
    move/from16 v21, v5

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_3
    move/from16 v21, v13

    .line 129
    .line 130
    :goto_3
    add-int v5, v18, v21

    .line 131
    .line 132
    neg-int v5, v5

    .line 133
    invoke-static {v13, v5, v3, v4}, La/r4e;->i(IIJ)J

    .line 134
    .line 135
    .line 136
    move-result-wide v3

    .line 137
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, La/pj30;

    .line 142
    .line 143
    invoke-interface {v2, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 144
    .line 145
    .line 146
    move-result-object v17

    .line 147
    move-object/from16 v16, v15

    .line 148
    .line 149
    new-instance v15, La/laf0;

    .line 150
    .line 151
    move-object/from16 v19, v0

    .line 152
    .line 153
    invoke-direct/range {v15 .. v21}, La/laf0;-><init>(La/pu90;La/pu90;ILa/pu90;II)V

    .line 154
    .line 155
    .line 156
    move/from16 v13, v20

    .line 157
    .line 158
    invoke-static {v1, v14, v13, v15}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :pswitch_0
    move-wide/from16 v3, p3

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v6, Ljava/util/ArrayList;

    .line 169
    .line 170
    const/16 v5, 0xa

    .line 171
    .line 172
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-eqz v5, :cond_4

    .line 188
    .line 189
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    check-cast v5, La/pj30;

    .line 194
    .line 195
    invoke-interface {v5, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    iget v5, v0, La/e63;->b:F

    .line 208
    .line 209
    if-gt v2, v10, :cond_5

    .line 210
    .line 211
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    new-instance v7, La/c63;

    .line 220
    .line 221
    invoke-direct {v7, v3, v4, v6, v5}, La/c63;-><init>(JLjava/util/ArrayList;F)V

    .line 222
    .line 223
    .line 224
    invoke-static {v1, v0, v2, v7}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    goto :goto_5

    .line 229
    :cond_5
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 234
    .line 235
    .line 236
    move-result v9

    .line 237
    move-object v7, v11

    .line 238
    check-cast v7, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 239
    .line 240
    move-object v8, v12

    .line 241
    check-cast v8, La/t33;

    .line 242
    .line 243
    new-instance v2, La/d63;

    .line 244
    .line 245
    invoke-direct/range {v2 .. v8}, La/d63;-><init>(JFLjava/util/ArrayList;Landroidx/compose/runtime/snapshots/SnapshotStateList;La/t33;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v1, v0, v9, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    :goto_5
    return-object v0

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
