.class public final La/p7l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:I

.field public final c:I

.field public final d:I

.field public e:F

.field public final f:F

.field public final g:F

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:F

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:F

.field public final r:I

.field public final s:I

.field public final t:F

.field public final u:La/a8z;

.field public final v:F

.field public final w:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p7l;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v1, 0x7f070717

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, La/p7l;->b:I

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v1, 0x7f07072d

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, La/p7l;->c:I

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const v1, 0x7f0706c2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, La/p7l;->d:I

    .line 44
    .line 45
    const/high16 v0, 0x3f800000    # 1.0f

    .line 46
    .line 47
    iput v0, p0, La/p7l;->e:F

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const v1, 0x7f0700ad

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, La/p7l;->f:F

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const v1, 0x7f0700a5

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iput v0, p0, La/p7l;->g:F

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const v1, 0x7f07068c

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iput v0, p0, La/p7l;->h:I

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const v1, 0x7f0706cb

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    iput v0, p0, La/p7l;->i:I

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const v1, 0x7f070656

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iput v0, p0, La/p7l;->j:I

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const v1, 0x7f070748

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    iput v0, p0, La/p7l;->k:F

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const v2, 0x7f070667

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    iput v0, p0, La/p7l;->l:I

    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const v2, 0x7f07067a

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    iput v0, p0, La/p7l;->m:I

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const v3, 0x7f0706b0

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    iput v0, p0, La/p7l;->n:I

    .line 165
    .line 166
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const v3, 0x7f0706f8

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    iput v0, p0, La/p7l;->o:I

    .line 178
    .line 179
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const v3, 0x7f070640

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    iput v0, p0, La/p7l;->p:I

    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    iput v0, p0, La/p7l;->q:F

    .line 201
    .line 202
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    iput v0, p0, La/p7l;->r:I

    .line 211
    .line 212
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    const v1, 0x7f0706e2

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    iput v0, p0, La/p7l;->s:I

    .line 224
    .line 225
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    const v1, 0x7f07074b

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    iput v0, p0, La/p7l;->t:F

    .line 237
    .line 238
    new-instance v0, La/ucj;

    .line 239
    .line 240
    const/16 v1, 0x14

    .line 241
    .line 242
    invoke-direct {v0, p0, v1}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 243
    .line 244
    .line 245
    sget-object v1, La/wez;->b:La/wez;

    .line 246
    .line 247
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iput-object v0, p0, La/p7l;->u:La/a8z;

    .line 252
    .line 253
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    const v1, 0x7f07074a

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    iput v0, p0, La/p7l;->v:F

    .line 265
    .line 266
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    const v0, 0x7f0706d0

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    iput p1, p0, La/p7l;->w:I

    .line 278
    .line 279
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    iget v0, p0, La/p7l;->f:F

    .line 2
    .line 3
    iget p0, p0, La/p7l;->e:F

    .line 4
    .line 5
    mul-float/2addr v0, p0

    .line 6
    return v0
.end method

.method public final b()I
    .locals 2

    .line 1
    iget v0, p0, La/p7l;->l:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget v1, p0, La/p7l;->e:F

    .line 5
    .line 6
    mul-float/2addr v0, v1

    .line 7
    invoke-static {v0}, La/si30;->b(F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget p0, p0, La/p7l;->c:I

    .line 12
    .line 13
    mul-int/lit8 p0, p0, 0x2

    .line 14
    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, La/p7l;->n:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget p0, p0, La/p7l;->e:F

    .line 5
    .line 6
    mul-float/2addr v0, p0

    .line 7
    invoke-static {v0}, La/si30;->b(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, La/p7l;->h:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget p0, p0, La/p7l;->e:F

    .line 5
    .line 6
    mul-float/2addr v0, p0

    .line 7
    invoke-static {v0}, La/si30;->b(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, La/p7l;->j:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget p0, p0, La/p7l;->e:F

    .line 5
    .line 6
    mul-float/2addr v0, p0

    .line 7
    invoke-static {v0}, La/si30;->b(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final f()F
    .locals 1

    .line 1
    iget v0, p0, La/p7l;->k:F

    .line 2
    .line 3
    iget p0, p0, La/p7l;->e:F

    .line 4
    .line 5
    mul-float/2addr v0, p0

    .line 6
    return v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, La/p7l;->i:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget p0, p0, La/p7l;->e:F

    .line 5
    .line 6
    mul-float/2addr v0, p0

    .line 7
    invoke-static {v0}, La/si30;->b(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
