.class public final La/w7s0;
.super La/k5;
.source "SourceFile"


# static fields
.field public static final n:Ljava/util/List;


# instance fields
.field public l:La/nmo0;

.field public final m:La/elk0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v0, 0x5

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v0, 0x6

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/16 v0, 0xa

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const/16 v0, 0xb

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    filled-new-array/range {v1 .. v6}, [Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, La/w7s0;->n:Ljava/util/List;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>(La/nmo0;La/elk0;)V
    .locals 3

    .line 1
    const v0, 0x7f07074a

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-direct {p0, p1, v1, v0}, La/k5;-><init>(La/nmo0;ZI)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/w7s0;->l:La/nmo0;

    .line 9
    .line 10
    iput-object p2, p0, La/w7s0;->m:La/elk0;

    .line 11
    .line 12
    iget-object p1, p0, La/k5;->c:La/aab;

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p1, La/aab;->j:Ljava/lang/Integer;

    .line 20
    .line 21
    sget-object p1, La/w7s0;->n:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget-object v0, p0, La/k5;->c:La/aab;

    .line 44
    .line 45
    iget-object v0, v0, La/aab;->i:La/nhe0;

    .line 46
    .line 47
    invoke-virtual {v0, p2}, La/nhe0;->b(I)La/mhe0;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const/16 v0, 0x64

    .line 52
    .line 53
    iput-byte v0, p2, La/mhe0;->b:B

    .line 54
    .line 55
    iget-object p2, p2, La/mhe0;->a:Ljava/util/ArrayList;

    .line 56
    .line 57
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-le v2, v0, :cond_0

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    sub-int/2addr v2, v1

    .line 68
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    return-void
.end method

.method public static s(ILa/w5;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p0, v0, :cond_0

    .line 3
    .line 4
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-virtual {p1, p0}, La/w5;->u(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(II)I
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, La/k5;->e(I)La/y8b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of v1, v0, La/i5s0;

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, La/k5;->a(II)La/y8b;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    instance-of p0, p0, La/rzr0;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    const/16 p0, 0xb

    .line 21
    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x6

    .line 24
    return p0

    .line 25
    :cond_2
    instance-of p0, v0, La/k5s0;

    .line 26
    .line 27
    if-eqz p0, :cond_3

    .line 28
    .line 29
    const/4 p0, 0x4

    .line 30
    return p0

    .line 31
    :cond_3
    instance-of p0, v0, La/h5s0;

    .line 32
    .line 33
    if-eqz p0, :cond_4

    .line 34
    .line 35
    const/4 p0, 0x5

    .line 36
    return p0

    .line 37
    :cond_4
    instance-of p0, v0, La/j5s0;

    .line 38
    .line 39
    if-eqz p0, :cond_5

    .line 40
    .line 41
    const/16 p0, 0x8

    .line 42
    .line 43
    return p0

    .line 44
    :cond_5
    instance-of p0, v0, La/l5s0;

    .line 45
    .line 46
    if-eqz p0, :cond_6

    .line 47
    .line 48
    const/16 p0, 0xa

    .line 49
    .line 50
    return p0

    .line 51
    :cond_6
    :goto_0
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public final f(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/k5;->e(I)La/y8b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of p1, p0, La/k5s0;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x2

    .line 13
    return p0

    .line 14
    :cond_1
    instance-of p1, p0, La/i5s0;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_2
    instance-of p1, p0, La/h5s0;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    const/4 p0, 0x3

    .line 25
    return p0

    .line 26
    :cond_3
    instance-of p1, p0, La/j5s0;

    .line 27
    .line 28
    if-eqz p1, :cond_4

    .line 29
    .line 30
    const/4 p0, 0x7

    .line 31
    return p0

    .line 32
    :cond_4
    instance-of p0, p0, La/l5s0;

    .line 33
    .line 34
    if-eqz p0, :cond_5

    .line 35
    .line 36
    const/16 p0, 0x9

    .line 37
    .line 38
    return p0

    .line 39
    :cond_5
    :goto_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public final g()La/nmo0;
    .locals 0

    .line 1
    iget-object p0, p0, La/w7s0;->l:La/nmo0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(La/w5;La/y8b;)V
    .locals 11

    .line 1
    instance-of v0, p2, La/ozr0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    instance-of p0, p1, La/jzr0;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, La/jzr0;

    .line 12
    .line 13
    :cond_0
    if-eqz v1, :cond_16

    .line 14
    .line 15
    check-cast p2, La/ozr0;

    .line 16
    .line 17
    iget-object p0, v1, La/jzr0;->u:La/d5e0;

    .line 18
    .line 19
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object p1, p2, La/ozr0;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    const p0, 0x7f040ae6

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v1}, La/w7s0;->s(ILa/w5;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    instance-of v0, p2, La/tzr0;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    instance-of p0, p1, La/d8s0;

    .line 38
    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    move-object v1, p1

    .line 42
    check-cast v1, La/d8s0;

    .line 43
    .line 44
    :cond_2
    if-eqz v1, :cond_16

    .line 45
    .line 46
    check-cast p2, La/tzr0;

    .line 47
    .line 48
    iget-object p0, v1, La/d8s0;->u:La/cck;

    .line 49
    .line 50
    iget-object p0, p0, La/cck;->b:Landroid/widget/TextView;

    .line 51
    .line 52
    iget-object p1, p2, La/tzr0;->d:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, v1, La/d8s0;->v:Landroid/content/res/ColorStateList;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 60
    .line 61
    .line 62
    iget p0, p2, La/tzr0;->e:I

    .line 63
    .line 64
    invoke-static {p0, v1}, La/w7s0;->s(ILa/w5;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    instance-of v0, p2, La/rzr0;

    .line 69
    .line 70
    if-eqz v0, :cond_e

    .line 71
    .line 72
    instance-of p0, p1, La/uzr0;

    .line 73
    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    check-cast p1, La/uzr0;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    move-object p1, v1

    .line 80
    :goto_0
    if-eqz p1, :cond_16

    .line 81
    .line 82
    check-cast p2, La/rzr0;

    .line 83
    .line 84
    iget-object p0, p1, La/uzr0;->u:La/iab;

    .line 85
    .line 86
    iget-object v0, p0, La/iab;->c:Landroid/view/View;

    .line 87
    .line 88
    move-object v7, v0

    .line 89
    check-cast v7, Landroid/widget/TextView;

    .line 90
    .line 91
    iget-object v0, p0, La/iab;->e:Landroid/view/View;

    .line 92
    .line 93
    move-object v6, v0

    .line 94
    check-cast v6, Landroid/widget/TextView;

    .line 95
    .line 96
    iget-object v0, p0, La/iab;->f:Landroid/view/View;

    .line 97
    .line 98
    move-object v5, v0

    .line 99
    check-cast v5, Landroid/widget/TextView;

    .line 100
    .line 101
    iget-object v0, p0, La/iab;->h:Landroid/view/View;

    .line 102
    .line 103
    move-object v4, v0

    .line 104
    check-cast v4, Landroid/widget/TextView;

    .line 105
    .line 106
    iget-object v0, p0, La/iab;->g:Landroid/view/View;

    .line 107
    .line 108
    move-object v3, v0

    .line 109
    check-cast v3, Landroid/widget/TextView;

    .line 110
    .line 111
    iget-object p0, p0, La/iab;->b:Landroid/view/View;

    .line 112
    .line 113
    move-object v2, p0

    .line 114
    check-cast v2, Landroid/widget/TextView;

    .line 115
    .line 116
    filled-new-array/range {v2 .. v7}, [Landroid/widget/TextView;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, Landroid/widget/TextView;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    const-string v8, ""

    .line 144
    .line 145
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_5
    iget-object p0, p2, La/rzr0;->e:Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    const/4 v0, 0x0

    .line 159
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-eqz v8, :cond_d

    .line 164
    .line 165
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    add-int/lit8 v9, v0, 0x1

    .line 170
    .line 171
    if-ltz v0, :cond_c

    .line 172
    .line 173
    check-cast v8, La/rss;

    .line 174
    .line 175
    if-eqz v0, :cond_b

    .line 176
    .line 177
    const/4 v10, 0x1

    .line 178
    if-eq v0, v10, :cond_a

    .line 179
    .line 180
    const/4 v10, 0x2

    .line 181
    if-eq v0, v10, :cond_9

    .line 182
    .line 183
    const/4 v10, 0x3

    .line 184
    if-eq v0, v10, :cond_8

    .line 185
    .line 186
    const/4 v10, 0x4

    .line 187
    if-eq v0, v10, :cond_7

    .line 188
    .line 189
    const/4 v10, 0x5

    .line 190
    if-eq v0, v10, :cond_6

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_6
    invoke-static {v7, v8}, La/uzr0;->v(Landroid/widget/TextView;La/rss;)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    invoke-static {v6, v8}, La/uzr0;->v(Landroid/widget/TextView;La/rss;)V

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_8
    invoke-static {v5, v8}, La/uzr0;->v(Landroid/widget/TextView;La/rss;)V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_9
    invoke-static {v4, v8}, La/uzr0;->v(Landroid/widget/TextView;La/rss;)V

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_a
    invoke-static {v3, v8}, La/uzr0;->v(Landroid/widget/TextView;La/rss;)V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_b
    invoke-static {v2, v8}, La/uzr0;->v(Landroid/widget/TextView;La/rss;)V

    .line 214
    .line 215
    .line 216
    :goto_3
    move v0, v9

    .line 217
    goto :goto_2

    .line 218
    :cond_c
    invoke-static {}, La/q3d;->p()V

    .line 219
    .line 220
    .line 221
    throw v1

    .line 222
    :cond_d
    iget p0, p2, La/rzr0;->d:I

    .line 223
    .line 224
    invoke-static {p0, p1}, La/w7s0;->s(ILa/w5;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_e
    instance-of v0, p2, La/szr0;

    .line 229
    .line 230
    if-eqz v0, :cond_10

    .line 231
    .line 232
    instance-of p0, p1, La/izr0;

    .line 233
    .line 234
    if-eqz p0, :cond_f

    .line 235
    .line 236
    move-object v1, p1

    .line 237
    check-cast v1, La/izr0;

    .line 238
    .line 239
    :cond_f
    if-eqz v1, :cond_16

    .line 240
    .line 241
    const p0, 0x7f040ae1

    .line 242
    .line 243
    .line 244
    invoke-static {p0, v1}, La/w7s0;->s(ILa/w5;)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :cond_10
    instance-of v0, p2, La/qzr0;

    .line 249
    .line 250
    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 251
    .line 252
    if-eqz v0, :cond_13

    .line 253
    .line 254
    instance-of p0, p1, La/hzr0;

    .line 255
    .line 256
    if-eqz p0, :cond_11

    .line 257
    .line 258
    move-object v1, p1

    .line 259
    check-cast v1, La/hzr0;

    .line 260
    .line 261
    :cond_11
    if-eqz v1, :cond_16

    .line 262
    .line 263
    const p0, 0x7f040ae7

    .line 264
    .line 265
    .line 266
    invoke-static {p0, v1}, La/w7s0;->s(ILa/w5;)V

    .line 267
    .line 268
    .line 269
    iget-object p0, v1, La/xhe0;->a:Landroid/view/View;

    .line 270
    .line 271
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-eqz p1, :cond_12

    .line 283
    .line 284
    check-cast p2, La/qzr0;

    .line 285
    .line 286
    iget p2, p2, La/qzr0;->e:I

    .line 287
    .line 288
    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 289
    .line 290
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_12
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :cond_13
    instance-of p2, p2, La/pzr0;

    .line 299
    .line 300
    if-eqz p2, :cond_16

    .line 301
    .line 302
    instance-of p2, p1, La/izr0;

    .line 303
    .line 304
    if-eqz p2, :cond_14

    .line 305
    .line 306
    move-object v1, p1

    .line 307
    check-cast v1, La/izr0;

    .line 308
    .line 309
    :cond_14
    if-eqz v1, :cond_16

    .line 310
    .line 311
    iget-object p1, v1, La/xhe0;->a:Landroid/view/View;

    .line 312
    .line 313
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 321
    .line 322
    .line 323
    move-result-object p2

    .line 324
    if-eqz p2, :cond_15

    .line 325
    .line 326
    iget-object p0, p0, La/w7s0;->l:La/nmo0;

    .line 327
    .line 328
    invoke-interface {p0}, La/nmo0;->getContext()Landroid/content/Context;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    const v0, 0x7f0706ba

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 340
    .line 341
    .line 342
    move-result p0

    .line 343
    iput p0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 344
    .line 345
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :cond_15
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :cond_16
    return-void
.end method

.method public final k(La/w5;La/y8b;)V
    .locals 0

    .line 1
    instance-of p0, p1, La/yzr0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/yzr0;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    check-cast p2, La/xzr0;

    .line 12
    .line 13
    iget-object p0, p1, La/yzr0;->u:La/d5e0;

    .line 14
    .line 15
    iget-object p1, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object p2, p2, La/xzr0;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, La/d5e0;->b:Landroid/widget/FrameLayout;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 p1, -0x2

    .line 29
    iput p1, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final l(La/w5;La/y8b;)V
    .locals 9

    .line 1
    instance-of v0, p2, La/k5s0;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    instance-of p0, p1, La/g5s0;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    move-object v3, p1

    .line 14
    check-cast v3, La/g5s0;

    .line 15
    .line 16
    :cond_0
    if-eqz v3, :cond_d

    .line 17
    .line 18
    iget-object p0, v3, La/g5s0;->u:La/auh;

    .line 19
    .line 20
    iget-object p0, p0, La/auh;->b:Landroid/widget/FrameLayout;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const p2, 0x7f040ae1

    .line 30
    .line 31
    .line 32
    invoke-static {p2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {v3, p1}, La/w5;->u(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    iput v2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    invoke-static {v1}, La/hny;->u(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    instance-of v0, p2, La/j5s0;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    instance-of p0, p1, La/f5s0;

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    move-object v3, p1

    .line 64
    check-cast v3, La/f5s0;

    .line 65
    .line 66
    :cond_3
    if-eqz v3, :cond_d

    .line 67
    .line 68
    check-cast p2, La/j5s0;

    .line 69
    .line 70
    iget p0, p2, La/j5s0;->b:I

    .line 71
    .line 72
    invoke-virtual {v3, p0}, La/f5s0;->v(I)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    instance-of v0, p2, La/i5s0;

    .line 77
    .line 78
    if-eqz v0, :cond_8

    .line 79
    .line 80
    instance-of v0, p1, La/m5s0;

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    move-object v3, p1

    .line 85
    check-cast v3, La/m5s0;

    .line 86
    .line 87
    :cond_5
    if-eqz v3, :cond_7

    .line 88
    .line 89
    move-object v0, p2

    .line 90
    check-cast v0, La/i5s0;

    .line 91
    .line 92
    iget-object v1, v0, La/i5s0;->f:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v2, v3, La/m5s0;->u:La/dc3;

    .line 95
    .line 96
    iget-object v4, v2, La/dc3;->c:Landroid/view/View;

    .line 97
    .line 98
    check-cast v4, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 99
    .line 100
    const v5, 0x7f080e03

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageResource(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-lez v6, :cond_6

    .line 111
    .line 112
    sget-object v6, La/u0d;->a:Ljava/util/List;

    .line 113
    .line 114
    sget-object v6, La/qzw;->a:La/qzw;

    .line 115
    .line 116
    const-wide/16 v7, 0x0

    .line 117
    .line 118
    invoke-static {v7, v8, v1}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v4, v6, v1, v5}, La/u0d;->m(Landroid/widget/ImageView;La/qzw;Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    :cond_6
    iget-object v1, v2, La/dc3;->d:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Landroid/widget/TextView;

    .line 128
    .line 129
    iget-object v4, v0, La/i5s0;->d:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    iget-object v1, v2, La/dc3;->e:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Landroid/widget/TextView;

    .line 137
    .line 138
    iget-object v2, v0, La/i5s0;->h:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    iget v0, v0, La/i5s0;->e:I

    .line 144
    .line 145
    invoke-static {v0, v3}, La/w7s0;->s(ILa/w5;)V

    .line 146
    .line 147
    .line 148
    :cond_7
    iget-object p1, p1, La/xhe0;->a:Landroid/view/View;

    .line 149
    .line 150
    new-instance v0, La/bs50;

    .line 151
    .line 152
    const/16 v1, 0x13

    .line 153
    .line 154
    invoke-direct {v0, p0, p2, v1}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_8
    instance-of v0, p2, La/h5s0;

    .line 162
    .line 163
    if-eqz v0, :cond_b

    .line 164
    .line 165
    instance-of p0, p1, La/e5s0;

    .line 166
    .line 167
    if-eqz p0, :cond_9

    .line 168
    .line 169
    move-object v3, p1

    .line 170
    check-cast v3, La/e5s0;

    .line 171
    .line 172
    :cond_9
    if-eqz v3, :cond_d

    .line 173
    .line 174
    check-cast p2, La/h5s0;

    .line 175
    .line 176
    iget-object p0, v3, La/e5s0;->u:La/qn5;

    .line 177
    .line 178
    iget-object p1, p0, La/qn5;->d:Landroid/widget/TextView;

    .line 179
    .line 180
    iget-object v0, p0, La/qn5;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 181
    .line 182
    iget-object v4, p2, La/h5s0;->e:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    iget-object p0, p0, La/qn5;->c:Landroid/widget/TextView;

    .line 188
    .line 189
    iget-object p1, p2, La/h5s0;->d:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    const p1, 0x7f040ae6

    .line 202
    .line 203
    .line 204
    invoke-static {p1, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    invoke-virtual {v3, p0}, La/w5;->u(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    if-eqz p0, :cond_a

    .line 216
    .line 217
    iput v2, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 218
    .line 219
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_a
    invoke-static {v1}, La/hny;->u(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_b
    instance-of p2, p2, La/l5s0;

    .line 228
    .line 229
    if-eqz p2, :cond_d

    .line 230
    .line 231
    instance-of p2, p1, La/f5s0;

    .line 232
    .line 233
    if-eqz p2, :cond_c

    .line 234
    .line 235
    move-object v3, p1

    .line 236
    check-cast v3, La/f5s0;

    .line 237
    .line 238
    :cond_c
    if-eqz v3, :cond_d

    .line 239
    .line 240
    iget-object p0, p0, La/w7s0;->l:La/nmo0;

    .line 241
    .line 242
    invoke-interface {p0}, La/nmo0;->getContext()Landroid/content/Context;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    const p1, 0x7f0706ba

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 254
    .line 255
    .line 256
    move-result p0

    .line 257
    invoke-virtual {v3, p0}, La/f5s0;->v(I)V

    .line 258
    .line 259
    .line 260
    :cond_d
    return-void
.end method

.method public final m(Landroid/view/ViewGroup;I)La/w5;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x4

    .line 10
    const v1, 0x7f070634

    .line 11
    .line 12
    .line 13
    if-eq p2, v0, :cond_5

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    if-eq p2, v0, :cond_4

    .line 17
    .line 18
    const/16 v0, 0x8

    .line 19
    .line 20
    const v2, 0x7f0706ba

    .line 21
    .line 22
    .line 23
    if-eq p2, v0, :cond_3

    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    if-eq p2, v0, :cond_2

    .line 28
    .line 29
    const/16 v0, 0xb

    .line 30
    .line 31
    if-eq p2, v0, :cond_1

    .line 32
    .line 33
    new-instance p2, La/d8s0;

    .line 34
    .line 35
    const v0, 0x7f0d0616

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    new-instance p1, La/cck;

    .line 46
    .line 47
    check-cast p0, Landroid/widget/TextView;

    .line 48
    .line 49
    const/4 v0, 0x3

    .line 50
    invoke-direct {p1, p0, v0}, La/cck;-><init>(Landroid/widget/TextView;B)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p2, p1}, La/d8s0;-><init>(La/cck;)V

    .line 54
    .line 55
    .line 56
    return-object p2

    .line 57
    :cond_0
    const-string p0, "rootView"

    .line 58
    .line 59
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0

    .line 64
    :cond_1
    new-instance p2, La/uzr0;

    .line 65
    .line 66
    invoke-static {p0, p1}, La/iab;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/iab;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-direct {p2, p0}, La/uzr0;-><init>(La/iab;)V

    .line 71
    .line 72
    .line 73
    return-object p2

    .line 74
    :cond_2
    new-instance p0, Landroid/widget/FrameLayout;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 84
    .line 85
    invoke-static {p1, v1}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-static {p1, v2}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-direct {p2, v0, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 97
    .line 98
    .line 99
    new-instance p1, La/izr0;

    .line 100
    .line 101
    invoke-direct {p1, p0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :cond_3
    new-instance p0, Landroid/widget/FrameLayout;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const v0, 0x7f040ae7

    .line 122
    .line 123
    .line 124
    invoke-static {v0, p2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-static {p0, p2}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 133
    .line 134
    .line 135
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 136
    .line 137
    invoke-static {p1, v1}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-static {p1, v2}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-direct {p2, v0, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 149
    .line 150
    .line 151
    new-instance p1, La/hzr0;

    .line 152
    .line 153
    invoke-direct {p1, p0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 154
    .line 155
    .line 156
    return-object p1

    .line 157
    :cond_4
    new-instance p2, La/jzr0;

    .line 158
    .line 159
    invoke-static {p0, p1}, La/d5e0;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-direct {p2, p0}, La/jzr0;-><init>(La/d5e0;)V

    .line 164
    .line 165
    .line 166
    return-object p2

    .line 167
    :cond_5
    new-instance p0, Landroid/widget/FrameLayout;

    .line 168
    .line 169
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 174
    .line 175
    .line 176
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 177
    .line 178
    invoke-static {p1, v1}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    const v1, 0x7f0706b0

    .line 183
    .line 184
    .line 185
    invoke-static {p1, v1}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    invoke-direct {p2, v0, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 193
    .line 194
    .line 195
    new-instance p1, La/izr0;

    .line 196
    .line 197
    invoke-direct {p1, p0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 198
    .line 199
    .line 200
    return-object p1
.end method

.method public final n(Landroid/view/ViewGroup;I)La/w5;
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance p2, La/yzr0;

    .line 10
    .line 11
    invoke-static {p0, p1}, La/d5e0;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {p2, p0}, La/yzr0;-><init>(La/d5e0;)V

    .line 16
    .line 17
    .line 18
    return-object p2
.end method

.method public final o(Landroid/view/ViewGroup;La/y8b;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const p2, 0x7f0d0617

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 36
    .line 37
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public final p(Landroid/view/ViewGroup;I)La/w5;
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    const-string v1, "rootView"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq p2, v3, :cond_6

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    if-eq p2, v4, :cond_4

    .line 18
    .line 19
    const/4 v3, 0x7

    .line 20
    const v5, 0x7f0d01db

    .line 21
    .line 22
    .line 23
    if-eq p2, v3, :cond_2

    .line 24
    .line 25
    const/16 v3, 0x9

    .line 26
    .line 27
    if-eq p2, v3, :cond_0

    .line 28
    .line 29
    new-instance p2, La/m5s0;

    .line 30
    .line 31
    invoke-static {p0, p1}, La/dc3;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/dc3;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {p2, p0}, La/m5s0;-><init>(La/dc3;)V

    .line 36
    .line 37
    .line 38
    return-object p2

    .line 39
    :cond_0
    new-instance p2, La/f5s0;

    .line 40
    .line 41
    invoke-virtual {p0, v5, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    new-instance p1, La/auh;

    .line 48
    .line 49
    check-cast p0, Landroid/widget/FrameLayout;

    .line 50
    .line 51
    invoke-direct {p1, p0, v4}, La/auh;-><init>(Landroid/widget/FrameLayout;B)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p2, p1}, La/f5s0;-><init>(La/auh;)V

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    :cond_1
    invoke-static {v1}, La/hny;->u(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    new-instance p2, La/f5s0;

    .line 63
    .line 64
    invoke-virtual {p0, v5, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    new-instance p1, La/auh;

    .line 71
    .line 72
    check-cast p0, Landroid/widget/FrameLayout;

    .line 73
    .line 74
    invoke-direct {p1, p0, v4}, La/auh;-><init>(Landroid/widget/FrameLayout;B)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p2, p1}, La/f5s0;-><init>(La/auh;)V

    .line 78
    .line 79
    .line 80
    return-object p2

    .line 81
    :cond_3
    invoke-static {v1}, La/hny;->u(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_4
    new-instance p2, La/e5s0;

    .line 86
    .line 87
    const v1, 0x7f0d0617

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const p1, 0x7f0a0b73

    .line 95
    .line 96
    .line 97
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Landroid/widget/TextView;

    .line 102
    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    const p1, 0x7f0a0fce

    .line 106
    .line 107
    .line 108
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Landroid/widget/TextView;

    .line 113
    .line 114
    if-eqz v2, :cond_5

    .line 115
    .line 116
    new-instance p1, La/qn5;

    .line 117
    .line 118
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 119
    .line 120
    invoke-direct {p1, p0, v1, v2, v3}, La/qn5;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 121
    .line 122
    .line 123
    invoke-direct {p2, p1}, La/e5s0;-><init>(La/qn5;)V

    .line 124
    .line 125
    .line 126
    return-object p2

    .line 127
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    const-string p1, "Missing required view with ID: "

    .line 136
    .line 137
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :cond_6
    new-instance p2, La/g5s0;

    .line 146
    .line 147
    const v3, 0x7f0d031f

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v3, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    if-eqz p0, :cond_7

    .line 155
    .line 156
    new-instance p1, La/auh;

    .line 157
    .line 158
    check-cast p0, Landroid/widget/FrameLayout;

    .line 159
    .line 160
    const/4 v0, 0x5

    .line 161
    invoke-direct {p1, p0, v0}, La/auh;-><init>(Landroid/widget/FrameLayout;B)V

    .line 162
    .line 163
    .line 164
    invoke-direct {p2, p1}, La/g5s0;-><init>(La/auh;)V

    .line 165
    .line 166
    .line 167
    return-object p2

    .line 168
    :cond_7
    invoke-static {v1}, La/hny;->u(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-object v0
.end method

.method public final r(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/w7s0;->l:La/nmo0;

    .line 2
    .line 3
    return-void
.end method
