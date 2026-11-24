.class public final La/l7s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:La/rv2;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:La/cgk0;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;La/rv2;IIILa/cgk0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/l7s;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iput-object p2, p0, La/l7s;->b:La/rv2;

    .line 7
    .line 8
    iput p3, p0, La/l7s;->c:I

    .line 9
    .line 10
    iput p4, p0, La/l7s;->d:I

    .line 11
    .line 12
    iput p5, p0, La/l7s;->e:I

    .line 13
    .line 14
    iput-object p6, p0, La/l7s;->f:La/cgk0;

    .line 15
    .line 16
    iput p7, p0, La/l7s;->g:I

    .line 17
    .line 18
    iput p8, p0, La/l7s;->h:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {p3, p4}, La/p4e;->h(J)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    iget-object p3, p0, La/l7s;->a:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p4

    .line 18
    invoke-interface {p3, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object p3, p0, La/l7s;->b:La/rv2;

    .line 22
    .line 23
    invoke-virtual {p3}, La/rv2;->d()La/vtj;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    sget-object v1, La/py20;->a:La/py20;

    .line 28
    .line 29
    invoke-virtual {p4, v1}, La/vtj;->d(Ljava/lang/Object;)F

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    const/4 v1, 0x0

    .line 34
    cmpl-float p4, p4, v1

    .line 35
    .line 36
    iget v1, p0, La/l7s;->d:I

    .line 37
    .line 38
    iget v2, p0, La/l7s;->c:I

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    if-lez p4, :cond_0

    .line 42
    .line 43
    invoke-virtual {p3}, La/rv2;->f()F

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    float-to-int v5, v5

    .line 48
    if-gez v5, :cond_1

    .line 49
    .line 50
    :goto_0
    move v5, v3

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    sub-int v5, v2, v1

    .line 53
    .line 54
    if-gez v5, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    :goto_1
    invoke-virtual {p3}, La/rv2;->d()La/vtj;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-object p3, p3, La/rv2;->e:La/zbk;

    .line 62
    .line 63
    invoke-virtual {p3}, La/zbk;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-virtual {v6, p3}, La/vtj;->d(Ljava/lang/Object;)F

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-nez v6, :cond_2

    .line 76
    .line 77
    if-lez p4, :cond_2

    .line 78
    .line 79
    float-to-int p3, p3

    .line 80
    if-gez p3, :cond_3

    .line 81
    .line 82
    :goto_2
    move p3, v3

    .line 83
    goto :goto_3

    .line 84
    :cond_2
    sub-int p3, v2, v1

    .line 85
    .line 86
    if-gez p3, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    :goto_3
    sub-int p4, v2, v5

    .line 90
    .line 91
    invoke-static {p4, v1, v2}, La/l1e0;->d(III)I

    .line 92
    .line 93
    .line 94
    move-result p4

    .line 95
    sub-int p3, v2, p3

    .line 96
    .line 97
    invoke-static {p3, v1, v2}, La/l1e0;->d(III)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    iget p3, p0, La/l7s;->e:I

    .line 102
    .line 103
    sub-int v1, v4, p3

    .line 104
    .line 105
    iget-object v2, p0, La/l7s;->f:La/cgk0;

    .line 106
    .line 107
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    sub-int/2addr v1, v6

    .line 112
    sub-int/2addr v1, p4

    .line 113
    move v6, v3

    .line 114
    new-instance v3, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    :cond_4
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-eqz v7, :cond_e

    .line 128
    .line 129
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    check-cast v7, La/pj30;

    .line 134
    .line 135
    invoke-interface {v7}, La/pj30;->n()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    instance-of v9, v8, La/iaj;

    .line 140
    .line 141
    const/4 v10, 0x0

    .line 142
    if-eqz v9, :cond_5

    .line 143
    .line 144
    check-cast v8, La/iaj;

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_5
    move-object v8, v10

    .line 148
    :goto_5
    if-eqz v8, :cond_6

    .line 149
    .line 150
    iget-object v8, v8, La/iaj;->b:Ljava/lang/String;

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_6
    move-object v8, v10

    .line 154
    :goto_6
    if-eqz v8, :cond_d

    .line 155
    .line 156
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    sparse-switch v9, :sswitch_data_0

    .line 161
    .line 162
    .line 163
    goto :goto_9

    .line 164
    :sswitch_0
    const-string v9, "MARKETS_ID"

    .line 165
    .line 166
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    if-nez v8, :cond_7

    .line 171
    .line 172
    goto :goto_9

    .line 173
    :cond_7
    invoke-static {v5, p4}, Ljava/lang/Math;->max(II)I

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    iget v9, p0, La/l7s;->h:I

    .line 178
    .line 179
    add-int/2addr v8, v9

    .line 180
    invoke-static {v0, v0, v8, v8}, La/p4e;->a(IIII)J

    .line 181
    .line 182
    .line 183
    move-result-wide v8

    .line 184
    invoke-interface {v7, v8, v9}, La/pj30;->S(J)La/pu90;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    goto :goto_9

    .line 189
    :sswitch_1
    const-string v9, "BACKGROUND_ID"

    .line 190
    .line 191
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-nez v8, :cond_8

    .line 196
    .line 197
    goto :goto_9

    .line 198
    :cond_8
    iget v8, p0, La/l7s;->g:I

    .line 199
    .line 200
    invoke-static {v0, v0, v8, v8}, La/p4e;->a(IIII)J

    .line 201
    .line 202
    .line 203
    move-result-wide v8

    .line 204
    invoke-interface {v7, v8, v9}, La/pj30;->S(J)La/pu90;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    goto :goto_9

    .line 209
    :sswitch_2
    const-string v9, "CONTENT_ID"

    .line 210
    .line 211
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    if-nez v8, :cond_9

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_9
    if-gez v1, :cond_a

    .line 219
    .line 220
    move v8, v6

    .line 221
    goto :goto_7

    .line 222
    :cond_a
    move v8, v1

    .line 223
    :goto_7
    if-gez v1, :cond_b

    .line 224
    .line 225
    move v9, v6

    .line 226
    goto :goto_8

    .line 227
    :cond_b
    move v9, v1

    .line 228
    :goto_8
    invoke-static {v0, v0, v8, v9}, La/p4e;->a(IIII)J

    .line 229
    .line 230
    .line 231
    move-result-wide v8

    .line 232
    invoke-interface {v7, v8, v9}, La/pj30;->S(J)La/pu90;

    .line 233
    .line 234
    .line 235
    move-result-object v10

    .line 236
    goto :goto_9

    .line 237
    :sswitch_3
    const-string v9, "TOOLBAR_ID"

    .line 238
    .line 239
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    if-nez v8, :cond_c

    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_c
    invoke-static {v0, v0, p3, p3}, La/p4e;->a(IIII)J

    .line 247
    .line 248
    .line 249
    move-result-wide v8

    .line 250
    invoke-interface {v7, v8, v9}, La/pj30;->S(J)La/pu90;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    :cond_d
    :goto_9
    if-eqz v10, :cond_4

    .line 255
    .line 256
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto/16 :goto_4

    .line 260
    .line 261
    :cond_e
    new-instance v1, La/lw7;

    .line 262
    .line 263
    const/16 v7, 0x9

    .line 264
    .line 265
    iget v6, p0, La/l7s;->h:I

    .line 266
    .line 267
    invoke-direct/range {v1 .. v7}, La/lw7;-><init>(Ljava/lang/Object;Ljava/lang/Object;IIIB)V

    .line 268
    .line 269
    .line 270
    invoke-static {p1, v0, v4, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    return-object p0

    .line 275
    :sswitch_data_0
    .sparse-switch
        0x2068547f -> :sswitch_3
        0x2caf22c1 -> :sswitch_2
        0x48e075cc -> :sswitch_1
        0x5f9032c3 -> :sswitch_0
    .end sparse-switch
.end method
