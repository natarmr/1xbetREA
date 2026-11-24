.class public final Landroidx/compose/foundation/lazy/layout/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ry40;

.field public final b:[Ljava/lang/Object;

.field public final c:I


# direct methods
.method public constructor <init>(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/b;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/layout/b;->b()La/zz2;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iget v0, p1, Lkotlin/ranges/a;->a:I

    .line 9
    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v1, "negative nearestRange.first"

    .line 14
    .line 15
    invoke-static {v1}, La/adx;->c(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    iget p1, p1, Lkotlin/ranges/a;->b:I

    .line 19
    .line 20
    iget v1, p2, La/zz2;->a:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-ge p1, v0, :cond_1

    .line 29
    .line 30
    sget-object p1, La/v960;->a:La/ry40;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/c;->a:La/ry40;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    new-array p2, p1, [Ljava/lang/Object;

    .line 39
    .line 40
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/c;->b:[Ljava/lang/Object;

    .line 41
    .line 42
    iput p1, p0, Landroidx/compose/foundation/lazy/layout/c;->c:I

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    sub-int v1, p1, v0

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    new-array v2, v1, [Ljava/lang/Object;

    .line 50
    .line 51
    iput-object v2, p0, Landroidx/compose/foundation/lazy/layout/c;->b:[Ljava/lang/Object;

    .line 52
    .line 53
    iput v0, p0, Landroidx/compose/foundation/lazy/layout/c;->c:I

    .line 54
    .line 55
    new-instance v2, La/ry40;

    .line 56
    .line 57
    invoke-direct {v2, v1}, La/ry40;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p2, La/zz2;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, La/xz40;

    .line 63
    .line 64
    const-string v3, ", size "

    .line 65
    .line 66
    const-string v4, "Index "

    .line 67
    .line 68
    if-ltz v0, :cond_2

    .line 69
    .line 70
    iget v5, p2, La/zz2;->a:I

    .line 71
    .line 72
    if-ge v0, v5, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget v5, p2, La/zz2;->a:I

    .line 76
    .line 77
    new-instance v6, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-static {v5}, La/adx;->e(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :goto_1
    if-ltz p1, :cond_3

    .line 99
    .line 100
    iget v5, p2, La/zz2;->a:I

    .line 101
    .line 102
    if-ge p1, v5, :cond_3

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    iget p2, p2, La/zz2;->a:I

    .line 106
    .line 107
    new-instance v5, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-static {p2}, La/adx;->e(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :goto_2
    if-lt p1, v0, :cond_4

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v3, "toIndex ("

    .line 134
    .line 135
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v3, ") should be not smaller than fromIndex ("

    .line 142
    .line 143
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v3, ")"

    .line 150
    .line 151
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-static {p2}, La/adx;->a(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :goto_3
    invoke-static {v0, v1}, La/q5x;->A(ILa/xz40;)I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    iget-object v3, v1, La/xz40;->a:[Ljava/lang/Object;

    .line 166
    .line 167
    aget-object v3, v3, p2

    .line 168
    .line 169
    check-cast v3, La/zmx;

    .line 170
    .line 171
    iget v3, v3, La/zmx;->a:I

    .line 172
    .line 173
    :goto_4
    if-gt v3, p1, :cond_8

    .line 174
    .line 175
    iget-object v4, v1, La/xz40;->a:[Ljava/lang/Object;

    .line 176
    .line 177
    aget-object v4, v4, p2

    .line 178
    .line 179
    check-cast v4, La/zmx;

    .line 180
    .line 181
    iget-object v5, v4, La/zmx;->c:La/waz;

    .line 182
    .line 183
    invoke-interface {v5}, La/waz;->getKey()Lkotlin/jvm/functions/Function1;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    iget v6, v4, La/zmx;->a:I

    .line 188
    .line 189
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    iget v8, v4, La/zmx;->b:I

    .line 194
    .line 195
    add-int/2addr v8, v6

    .line 196
    add-int/lit8 v8, v8, -0x1

    .line 197
    .line 198
    invoke-static {p1, v8}, Ljava/lang/Math;->min(II)I

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-gt v7, v8, :cond_7

    .line 203
    .line 204
    :goto_5
    if-eqz v5, :cond_5

    .line 205
    .line 206
    sub-int v9, v7, v6

    .line 207
    .line 208
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    invoke-interface {v5, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    if-nez v9, :cond_6

    .line 217
    .line 218
    :cond_5
    new-instance v9, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    .line 219
    .line 220
    invoke-direct {v9, v7}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;-><init>(I)V

    .line 221
    .line 222
    .line 223
    :cond_6
    invoke-virtual {v2, v7, v9}, La/ry40;->g(ILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iget-object v10, p0, Landroidx/compose/foundation/lazy/layout/c;->b:[Ljava/lang/Object;

    .line 227
    .line 228
    iget v11, p0, Landroidx/compose/foundation/lazy/layout/c;->c:I

    .line 229
    .line 230
    sub-int v11, v7, v11

    .line 231
    .line 232
    aput-object v9, v10, v11

    .line 233
    .line 234
    if-eq v7, v8, :cond_7

    .line 235
    .line 236
    add-int/lit8 v7, v7, 0x1

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_7
    iget v4, v4, La/zmx;->b:I

    .line 240
    .line 241
    add-int/2addr v3, v4

    .line 242
    add-int/lit8 p2, p2, 0x1

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_8
    iput-object v2, p0, Landroidx/compose/foundation/lazy/layout/c;->a:La/ry40;

    .line 246
    .line 247
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/c;->a:La/ry40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ry40;->d(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, La/ry40;->c:[I

    .line 10
    .line 11
    aget p0, p0, p1

    .line 12
    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, -0x1

    .line 15
    return p0
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/c;->c:I

    .line 2
    .line 3
    sub-int/2addr p1, v0

    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/c;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    array-length v0, p0

    .line 9
    if-ge p1, v0, :cond_0

    .line 10
    .line 11
    aget-object p0, p0, p1

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method
