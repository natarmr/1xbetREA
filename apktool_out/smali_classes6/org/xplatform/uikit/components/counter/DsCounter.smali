.class public final Lorg/xplatform/uikit/components/counter/DsCounter;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static final synthetic i:I


# instance fields
.field public final a:La/a8z;

.field public final b:I

.field public final c:La/n0o0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public g:La/r0m;

.field public h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 304
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/counter/DsCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 303
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/counter/DsCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/ntl;

    .line 15
    .line 16
    invoke-direct {v2, p0, v0}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sget-object v3, La/wez;->b:La/wez;

    .line 20
    .line 21
    invoke-static {v3, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iput-object v2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->a:La/a8z;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const v3, 0x7f070705

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iput v2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->b:I

    .line 39
    .line 40
    new-instance v2, La/ryl;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-direct {v2, p1, v3}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iput-object v2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->c:La/n0o0;

    .line 51
    .line 52
    new-instance v2, La/ryl;

    .line 53
    .line 54
    invoke-direct {v2, p1, v0}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput-object v2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->d:La/n0o0;

    .line 62
    .line 63
    new-instance v2, La/ryl;

    .line 64
    .line 65
    const/4 v4, 0x3

    .line 66
    invoke-direct {v2, p1, v4}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iput-object v2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->e:La/n0o0;

    .line 74
    .line 75
    new-instance v2, La/lrk;

    .line 76
    .line 77
    const/16 v5, 0xd

    .line 78
    .line 79
    invoke-direct {v2, p1, p0, v5}, La/lrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iput-object v2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->f:La/n0o0;

    .line 87
    .line 88
    sget-object v2, La/r0m;->n:La/r0m;

    .line 89
    .line 90
    iput-object v2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 91
    .line 92
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAccordionImageView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAttachHelper()La/k14;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iput-boolean p3, v2, La/k14;->f:Z

    .line 111
    .line 112
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAttachHelper()La/k14;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2, p2}, La/k14;->a(Landroid/util/AttributeSet;)V

    .line 117
    .line 118
    .line 119
    sget-object v2, La/bqd0;->x:[I

    .line 120
    .line 121
    invoke-virtual {p1, p2, v2, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p2, v4, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    sget-object v4, La/r0m;->t:La/c0o;

    .line 130
    .line 131
    invoke-virtual {v4, v2}, La/c0o;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, La/r0m;

    .line 136
    .line 137
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/counter/DsCounter;->setComponentStyle(La/r0m;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    const/16 v7, 0x8

    .line 157
    .line 158
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    invoke-static {p2, p1, v8}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-eqz p1, :cond_1

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    :cond_1
    if-ge v2, v3, :cond_2

    .line 173
    .line 174
    invoke-virtual {p0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->j()V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_2
    if-nez v1, :cond_3

    .line 182
    .line 183
    invoke-virtual {p0, v4, v6}, Lorg/xplatform/uikit/components/counter/DsCounter;->e(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_3
    const-string p1, "%s %s"

    .line 188
    .line 189
    if-lez v5, :cond_4

    .line 190
    .line 191
    new-instance v4, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    iget-object v6, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 197
    .line 198
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    const/16 v6, 0x63

    .line 202
    .line 203
    invoke-static {v2, v6}, Lorg/xplatform/uikit/components/counter/DsCounter;->c(II)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v2, "/"

    .line 211
    .line 212
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    iget-object v2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-static {v5, v6}, Lorg/xplatform/uikit/components/counter/DsCounter;->c(II)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 248
    .line 249
    .line 250
    goto :goto_0

    .line 251
    :cond_4
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    iget-object v5, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 256
    .line 257
    iget-short v5, v5, La/r0m;->a:S

    .line 258
    .line 259
    invoke-static {v2, v5}, Lorg/xplatform/uikit/components/counter/DsCounter;->c(II)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 276
    .line 277
    .line 278
    :goto_0
    invoke-virtual {p0, v3}, Landroid/view/View;->setActivated(Z)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->j()V

    .line 285
    .line 286
    .line 287
    :goto_1
    invoke-virtual {p2, p3, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    invoke-static {p0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->f(Lorg/xplatform/uikit/components/counter/DsCounter;Z)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 295
    .line 296
    .line 297
    const-string p1, "Counter"

    .line 298
    .line 299
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    return-void
.end method

.method public static final a(Landroid/content/Context;Lorg/xplatform/uikit/components/counter/DsCounter;)Landroidx/appcompat/widget/AppCompatImageView;
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, La/jmu0;->d()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->getArrowDownDrawable()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    const/16 p0, 0x8

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static c(II)Ljava/lang/String;
    .locals 0

    .line 1
    if-gt p0, p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "+"

    .line 9
    .line 10
    invoke-static {p1, p0}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static f(Lorg/xplatform/uikit/components/counter/DsCounter;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getArrowUpDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getArrowDownDrawable()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAccordionImageView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private final getAccordionImageView()Landroidx/appcompat/widget/AppCompatImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->f:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getArrowDownDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->d:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getArrowUpDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->c:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getAttachHelper()La/k14;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/k14;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k14;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->e:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lorg/xplatform/uikit/components/counter/DsCounter;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAttachHelper()La/k14;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1, p2}, La/k14;->b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 13
    .line 14
    return-object p0
.end method

.method public final d(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    if-nez p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->setCount(Ljava/lang/Integer;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object v3, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 26
    .line 27
    iget-short v3, v3, La/r0m;->a:S

    .line 28
    .line 29
    if-gt v2, v3, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const-string p1, "+"

    .line 41
    .line 42
    invoke-static {v3, p1}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 p2, 0x2

    .line 51
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string p2, "%s %s"

    .line 56
    .line 57
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v1}, Landroid/view/View;->setActivated(Z)V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->j()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    :goto_1
    const/16 p1, 0x8

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->j()V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final e(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x8

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->j()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object v3, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 26
    .line 27
    if-lez v2, :cond_1

    .line 28
    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/16 v3, 0x63

    .line 42
    .line 43
    invoke-static {p1, v3}, Lorg/xplatform/uikit/components/counter/DsCounter;->c(II)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, "/"

    .line 51
    .line 52
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget-object p2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v3}, Lorg/xplatform/uikit/components/counter/DsCounter;->c(II)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iget-short p2, v3, La/r0m;->a:S

    .line 81
    .line 82
    invoke-static {p1, p2}, Lorg/xplatform/uikit/components/counter/DsCounter;->c(II)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v1}, Landroid/view/View;->setActivated(Z)V

    .line 90
    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->j()V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final g(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAttachHelper()La/k14;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, La/k14;->d(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final getComponentStyle()La/r0m;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCount()Ljava/lang/Integer;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 26
    .line 27
    new-instance v0, La/g0g0;

    .line 28
    .line 29
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p0, v0

    .line 33
    :goto_0
    nop

    .line 34
    instance-of v0, p0, La/g0g0;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    :cond_0
    check-cast p0, Ljava/lang/Integer;

    .line 40
    .line 41
    return-object p0
.end method

.method public final h(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAttachHelper()La/k14;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/k14;->a:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of v0, p0, Landroid/graphics/drawable/GradientDrawable;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p0, Landroid/graphics/drawable/GradientDrawable;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p0, v1

    .line 20
    :goto_0
    if-eqz p0, :cond_2

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_1
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    return-void
.end method

.method public final i(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAttachHelper()La/k14;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, La/k14;->e(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCount()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAccordionImageView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 12
    .line 13
    iget-object p1, p1, La/r0m;->j:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sub-int/2addr p4, p2

    .line 36
    iget p1, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->h:I

    .line 37
    .line 38
    sub-int/2addr p4, p1

    .line 39
    div-int/lit8 p1, p4, 0x2

    .line 40
    .line 41
    :goto_0
    sub-int/2addr p5, p3

    .line 42
    div-int/lit8 p5, p5, 0x2

    .line 43
    .line 44
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAccordionImageView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    new-instance p3, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result p4

    .line 73
    if-eqz p4, :cond_3

    .line 74
    .line 75
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    move-object v0, p4

    .line 80
    check-cast v0, Landroid/view/View;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    move v0, p1

    .line 97
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    move-object v4, p1

    .line 108
    check-cast v4, Landroid/view/View;

    .line 109
    .line 110
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    add-int v2, p1, v0

    .line 115
    .line 116
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    div-int/lit8 p1, p1, 0x2

    .line 121
    .line 122
    sub-int v1, p5, p1

    .line 123
    .line 124
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    div-int/lit8 p1, p1, 0x2

    .line 129
    .line 130
    add-int v3, p1, p5

    .line 131
    .line 132
    move-object v5, p0

    .line 133
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 134
    .line 135
    .line 136
    iget p0, v5, Lorg/xplatform/uikit/components/counter/DsCounter;->b:I

    .line 137
    .line 138
    add-int v0, v2, p0

    .line 139
    .line 140
    move-object p0, v5

    .line 141
    goto :goto_2

    .line 142
    :cond_4
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAccordionImageView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAccordionImageView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-static {p2}, La/jmu0;->g(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget p2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->h:I

    .line 22
    .line 23
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAccordionImageView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v1, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->b:I

    .line 32
    .line 33
    add-int/2addr v0, v1

    .line 34
    add-int/2addr v0, p2

    .line 35
    iput v0, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->h:I

    .line 36
    .line 37
    :cond_0
    iget-object p2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 38
    .line 39
    iget-object p2, p2, La/r0m;->j:Ljava/lang/Integer;

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move p2, p1

    .line 60
    :goto_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 61
    .line 62
    iget-object v0, v0, La/r0m;->k:Ljava/lang/Integer;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v0, p1

    .line 83
    :goto_1
    add-int/2addr p2, v0

    .line 84
    iget-object v0, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 85
    .line 86
    iget-boolean v0, v0, La/r0m;->g:Z

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    sub-int p2, v0, p2

    .line 95
    .line 96
    iget v1, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->h:I

    .line 97
    .line 98
    sub-int/2addr p2, v1

    .line 99
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const/high16 v2, 0x40000000    # 2.0f

    .line 104
    .line 105
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-virtual {v1, p2, p1}, Landroid/view/View;->measure(II)V

    .line 114
    .line 115
    .line 116
    iget p1, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->h:I

    .line 117
    .line 118
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    add-int/2addr p2, p1

    .line 127
    iput p2, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->h:I

    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_3
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {p1}, La/jmu0;->g(Landroid/view/View;)V

    .line 142
    .line 143
    .line 144
    iget p1, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->h:I

    .line 145
    .line 146
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    add-int/2addr v0, p1

    .line 155
    iput v0, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->h:I

    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    add-int/2addr v0, p1

    .line 166
    iget p1, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->h:I

    .line 167
    .line 168
    add-int/2addr v0, p1

    .line 169
    add-int/2addr v0, p2

    .line 170
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public final setComponentStyle(La/r0m;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 5
    .line 6
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v1, p1, La/r0m;->b:I

    .line 11
    .line 12
    iget-object v2, p1, La/r0m;->f:Ljava/lang/Integer;

    .line 13
    .line 14
    iget-object v3, p1, La/r0m;->d:Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-static {v1, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget v1, p1, La/r0m;->i:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v1, p1, La/r0m;->h:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p1, La/r0m;->c:Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 52
    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 v0, 0x0

    .line 77
    :goto_0
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/counter/DsCounter;->h(Ljava/lang/Integer;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p1, La/r0m;->e:Ljava/lang/Integer;

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    if-eqz v0, :cond_1

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    goto :goto_1

    .line 101
    :cond_1
    move v0, v1

    .line 102
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAttachHelper()La/k14;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    iput v0, v3, La/k14;->e:I

    .line 107
    .line 108
    iget-object v4, v3, La/k14;->g:Ljava/lang/Integer;

    .line 109
    .line 110
    if-eqz v4, :cond_2

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    iget-object v3, v3, La/k14;->a:Landroid/view/View;

    .line 117
    .line 118
    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-eqz v3, :cond_2

    .line 123
    .line 124
    invoke-static {v3, v4, v0}, La/gq80;->m0(Landroid/graphics/drawable/Drawable;II)V

    .line 125
    .line 126
    .line 127
    :cond_2
    if-eqz v2, :cond_3

    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/counter/DsCounter;->i(I)V

    .line 145
    .line 146
    .line 147
    :cond_3
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getAccordionImageView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sget-object v2, La/r0m;->o:La/r0m;

    .line 152
    .line 153
    if-ne p1, v2, :cond_4

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    const/16 v1, 0x8

    .line 157
    .line 158
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public final setCount(Ljava/lang/Integer;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, Lorg/xplatform/uikit/components/counter/DsCounter;->g:La/r0m;

    .line 20
    .line 21
    iget-short v3, v3, La/r0m;->a:S

    .line 22
    .line 23
    if-gt v2, v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string p1, "+"

    .line 35
    .line 36
    invoke-static {v3, p1}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Landroid/view/View;->setActivated(Z)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->j()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, ""

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    const/16 p1, 0x8

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->j()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, La/jmu0;->b(Landroid/view/View;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setTextColor(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCounterTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
