.class public final La/axv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final a:La/ywv0;

.field public final b:La/pz40;


# direct methods
.method public constructor <init>(La/ywv0;La/pz40;)V
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
    iput-object p1, p0, La/axv0;->a:La/ywv0;

    .line 8
    .line 9
    iput-object p2, p0, La/axv0;->b:La/pz40;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/pj30;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const v6, 0x7fffffff

    .line 14
    .line 15
    .line 16
    const/4 v7, 0x3

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    move-wide v1, p3

    .line 21
    invoke-static/range {v1 .. v7}, La/p4e;->b(JIIIII)J

    .line 22
    .line 23
    .line 24
    move-result-wide p3

    .line 25
    invoke-interface {v0, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-wide v1, p3

    .line 31
    const/4 p3, 0x0

    .line 32
    :goto_0
    invoke-static {v1, v2}, La/p4e;->f(J)Z

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    const/4 v0, 0x0

    .line 37
    iget-object v3, p0, La/axv0;->a:La/ywv0;

    .line 38
    .line 39
    iget-object p0, p0, La/axv0;->b:La/pz40;

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    if-eqz p4, :cond_4

    .line 43
    .line 44
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, La/pj30;

    .line 49
    .line 50
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    if-eqz p3, :cond_1

    .line 55
    .line 56
    iget v4, p3, La/pu90;->b:I

    .line 57
    .line 58
    move v9, v4

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v9, v8

    .line 61
    :goto_1
    iget-object v3, v3, La/ywv0;->j:La/ruv0;

    .line 62
    .line 63
    invoke-virtual {v3}, La/ruv0;->e()F

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    int-to-float v4, v4

    .line 78
    sub-float/2addr v3, v0

    .line 79
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {v0}, La/si30;->b(F)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    add-int/2addr v3, v9

    .line 98
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    sub-int v0, p4, v0

    .line 103
    .line 104
    if-gez v0, :cond_2

    .line 105
    .line 106
    move v6, v8

    .line 107
    goto :goto_2

    .line 108
    :cond_2
    move v6, v0

    .line 109
    :goto_2
    const/4 v5, 0x0

    .line 110
    const/4 v7, 0x3

    .line 111
    const/4 v3, 0x0

    .line 112
    const/4 v4, 0x0

    .line 113
    invoke-static/range {v1 .. v7}, La/p4e;->b(JIIIII)J

    .line 114
    .line 115
    .line 116
    move-result-wide v3

    .line 117
    invoke-interface {p2, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    sub-int v0, p4, v9

    .line 122
    .line 123
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    sub-int/2addr v0, p0

    .line 134
    if-gez v0, :cond_3

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    move v8, v0

    .line 138
    :goto_3
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    new-instance v0, La/kw7;

    .line 143
    .line 144
    const/4 v1, 0x4

    .line 145
    invoke-direct {v0, p2, p3, v8, v1}, La/kw7;-><init>(La/pu90;La/pu90;IB)V

    .line 146
    .line 147
    .line 148
    invoke-static {p1, p0, p4, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :cond_4
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    check-cast p2, La/pj30;

    .line 158
    .line 159
    if-eqz p3, :cond_5

    .line 160
    .line 161
    iget p4, p3, La/pu90;->b:I

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_5
    move p4, v8

    .line 165
    :goto_4
    iget-object v3, v3, La/ywv0;->j:La/ruv0;

    .line 166
    .line 167
    invoke-virtual {v3}, La/ruv0;->e()F

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    check-cast v4, Ljava/lang/Number;

    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    int-to-float v4, v4

    .line 182
    sub-float/2addr v3, v0

    .line 183
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-static {v0}, La/si30;->b(F)I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    check-cast v4, Ljava/lang/Number;

    .line 200
    .line 201
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    add-int/2addr v4, p4

    .line 206
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    sub-int/2addr v3, v0

    .line 211
    if-gez v3, :cond_6

    .line 212
    .line 213
    move v6, v8

    .line 214
    goto :goto_5

    .line 215
    :cond_6
    move v6, v3

    .line 216
    :goto_5
    const/4 v5, 0x0

    .line 217
    const/4 v7, 0x3

    .line 218
    const/4 v3, 0x0

    .line 219
    const/4 v4, 0x0

    .line 220
    invoke-static/range {v1 .. v7}, La/p4e;->b(JIIIII)J

    .line 221
    .line 222
    .line 223
    move-result-wide v3

    .line 224
    invoke-interface {p2, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    iget v0, p2, La/pu90;->b:I

    .line 229
    .line 230
    add-int/2addr v0, p4

    .line 231
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    check-cast p0, Ljava/lang/Number;

    .line 236
    .line 237
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    add-int/2addr p0, v0

    .line 242
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 243
    .line 244
    .line 245
    move-result p4

    .line 246
    new-instance v0, La/xv2;

    .line 247
    .line 248
    const/4 v1, 0x5

    .line 249
    invoke-direct {v0, p2, p3, v1}, La/xv2;-><init>(La/pu90;La/pu90;B)V

    .line 250
    .line 251
    .line 252
    invoke-static {p1, p4, p0, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0
.end method

.method public final c(La/cnx;Ljava/util/List;I)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/pj30;

    .line 10
    .line 11
    invoke-interface {v0, p3}, La/pj30;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {v1, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, La/pj30;

    .line 21
    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    invoke-interface {p2, p3}, La/pj30;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    :cond_0
    add-int/2addr v0, p1

    .line 29
    iget-object p0, p0, La/axv0;->b:La/pz40;

    .line 30
    .line 31
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    add-int/2addr p0, v0

    .line 42
    return p0
.end method
