.class public Lorg/xplatform/uikit/components/timer/DsTimer;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final synthetic A:I


# instance fields
.field public a:La/p7n;

.field public b:La/unq0;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Landroid/os/Handler;

.field public h:J

.field public i:Z

.field public j:La/l7n;

.field public k:J

.field public l:Z

.field public m:Landroid/text/StaticLayout;

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:F

.field public final r:I

.field public final s:Landroid/text/TextPaint;

.field public final t:Landroid/text/SpannableString;

.field public u:Ljava/lang/Integer;

.field public v:Ljava/lang/Integer;

.field public final w:La/mx2;

.field public x:Lkotlin/jvm/functions/Function0;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/timer/DsTimer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/timer/DsTimer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p3, 0x7f0409b5

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    sget-object v1, La/unq0;->a:La/unq0;

    .line 16
    .line 17
    iput-object v1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 18
    .line 19
    new-instance v2, Landroid/os/Handler;

    .line 20
    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->g:Landroid/os/Handler;

    .line 29
    .line 30
    const-wide/16 v2, 0x3e8

    .line 31
    .line 32
    iput-wide v2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->h:J

    .line 33
    .line 34
    sget-object v2, La/l7n;->a:La/l7n;

    .line 35
    .line 36
    iput-object v2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->j:La/l7n;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const v4, 0x7f070705

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iput v3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->o:I

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const v4, 0x7f070717

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iput v3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->p:I

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const v4, 0x7f0705cd

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    int-to-float v3, v3

    .line 76
    iput v3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->q:F

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const v4, 0x7f070660

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    iput v3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->r:I

    .line 90
    .line 91
    new-instance v3, Landroid/text/TextPaint;

    .line 92
    .line 93
    const/4 v4, 0x1

    .line 94
    invoke-direct {v3, v4}, Landroid/text/TextPaint;-><init>(I)V

    .line 95
    .line 96
    .line 97
    iput-object v3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->s:Landroid/text/TextPaint;

    .line 98
    .line 99
    invoke-direct {p0}, Lorg/xplatform/uikit/components/timer/DsTimer;->getSpannedSeparator()Landroid/text/SpannableString;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iput-object v5, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->t:Landroid/text/SpannableString;

    .line 104
    .line 105
    new-instance v5, La/mx2;

    .line 106
    .line 107
    const/16 v6, 0x9

    .line 108
    .line 109
    invoke-direct {v5, p0, v6}, La/mx2;-><init>(Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    iput-object v5, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->w:La/mx2;

    .line 113
    .line 114
    new-instance v5, La/ndm;

    .line 115
    .line 116
    const/16 v6, 0x1b

    .line 117
    .line 118
    invoke-direct {v5, v6}, La/ndm;-><init>(B)V

    .line 119
    .line 120
    .line 121
    iput-object v5, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->x:Lkotlin/jvm/functions/Function0;

    .line 122
    .line 123
    sget-object v5, La/bqd0;->t0:[I

    .line 124
    .line 125
    const/4 v6, 0x0

    .line 126
    invoke-virtual {p1, p2, v5, p3, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    const/4 p3, 0x5

    .line 131
    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    sget-object v5, La/bqd0;->s0:[I

    .line 136
    .line 137
    invoke-virtual {p1, p3, v5}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    invoke-static {v0, p1, p3}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    if-eqz v5, :cond_1

    .line 146
    .line 147
    invoke-virtual {v5}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 152
    .line 153
    .line 154
    :cond_1
    invoke-virtual {p3, v6, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-lez v5, :cond_2

    .line 159
    .line 160
    invoke-static {v3, p1, v5}, La/r7x;->q(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 161
    .line 162
    .line 163
    :cond_2
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, v6, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    iput p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->n:I

    .line 171
    .line 172
    const/16 p1, 0x8

    .line 173
    .line 174
    invoke-virtual {p2, p1, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    sget-object p3, La/unq0;->e:La/c0o;

    .line 179
    .line 180
    invoke-static {p1, p3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    check-cast p1, La/unq0;

    .line 185
    .line 186
    if-nez p1, :cond_3

    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_3
    move-object v1, p1

    .line 190
    :goto_0
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/timer/DsTimer;->setTimerType(La/unq0;)V

    .line 191
    .line 192
    .line 193
    const/4 p1, 0x6

    .line 194
    invoke-virtual {p2, p1, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    sget-object p3, La/l7n;->d:La/c0o;

    .line 199
    .line 200
    invoke-static {p1, p3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    check-cast p1, La/l7n;

    .line 205
    .line 206
    if-nez p1, :cond_4

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_4
    move-object v2, p1

    .line 210
    :goto_1
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/timer/DsTimer;->setTimeDirection(La/l7n;)V

    .line 211
    .line 212
    .line 213
    iget p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->c:I

    .line 214
    .line 215
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    iput p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->c:I

    .line 220
    .line 221
    iget p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->d:I

    .line 222
    .line 223
    invoke-virtual {p2, v4, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    iput p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->d:I

    .line 228
    .line 229
    const/4 p1, 0x3

    .line 230
    iget p3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->e:I

    .line 231
    .line 232
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    iput p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->e:I

    .line 237
    .line 238
    const/4 p1, 0x4

    .line 239
    iget p3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->f:I

    .line 240
    .line 241
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    iput p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->f:I

    .line 246
    .line 247
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 248
    .line 249
    .line 250
    invoke-direct {p0}, Lorg/xplatform/uikit/components/timer/DsTimer;->getCurrentTimerState()La/p7n;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    iput-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->a:La/p7n;

    .line 255
    .line 256
    return-void
.end method

.method public static c(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/StaticLayout;
    .locals 9

    .line 1
    invoke-static {p0, p1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    add-float/2addr v0, v1

    .line 8
    float-to-int v3, v0

    .line 9
    const/4 v7, 0x0

    .line 10
    const/16 v8, 0xef0

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    invoke-static/range {v1 .. v8}, La/xdx;->I(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextUtils$TruncateAt;ILandroid/text/Layout$Alignment;I)Landroid/text/StaticLayout;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private final getCurrentTimerState()La/p7n;
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->k:J

    .line 2
    .line 3
    iget-object v2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 4
    .line 5
    sget-object v3, La/unq0;->b:La/unq0;

    .line 6
    .line 7
    if-ne v2, v3, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lorg/xplatform/uikit/components/timer/DsTimer;->getStandardTimerLimitMs()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    sget-object p0, La/unq0;->c:La/unq0;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    if-eq p0, v0, :cond_2

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    if-ne p0, v0, :cond_1

    .line 33
    .line 34
    sget-object p0, La/o7n;->a:La/o7n;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0

    .line 42
    :cond_2
    sget-object p0, La/n7n;->a:La/n7n;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    sget-object p0, La/m7n;->a:La/m7n;

    .line 46
    .line 47
    return-object p0
.end method

.method private final getSpannedSeparator()Landroid/text/SpannableString;
    .locals 4

    .line 1
    new-instance p0, Landroid/text/SpannableString;

    .line 2
    .line 3
    const-string v0, " : "

    .line 4
    .line 5
    invoke-direct {p0, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ltn;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, La/ltn;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/text/SpannableString;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/16 v2, 0x21

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {p0, v0, v3, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method private final getStandardTimerLimitMs()J
    .locals 4

    .line 1
    iget v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->c:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget p0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->f:I

    .line 11
    .line 12
    int-to-long v2, p0

    .line 13
    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    invoke-virtual {p0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    add-long/2addr v2, v0

    .line 20
    return-wide v2
.end method

.method private final getTimeForMeasure()Ljava/lang/CharSequence;
    .locals 8

    .line 1
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->k:J

    .line 7
    .line 8
    iget-object v3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 9
    .line 10
    sget-object v4, La/unq0;->b:La/unq0;

    .line 11
    .line 12
    if-ne v3, v4, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lorg/xplatform/uikit/components/timer/DsTimer;->getStandardTimerLimitMs()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    cmp-long v1, v1, v3

    .line 19
    .line 20
    if-lez v1, :cond_0

    .line 21
    .line 22
    sget-object v1, La/unq0;->c:La/unq0;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 26
    .line 27
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-object v2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->t:Landroid/text/SpannableString;

    .line 32
    .line 33
    const-string v3, "00"

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-eq v1, v4, :cond_3

    .line 39
    .line 40
    const/4 v4, 0x2

    .line 41
    if-ne v1, v4, :cond_2

    .line 42
    .line 43
    iget-wide v4, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->k:J

    .line 44
    .line 45
    const-wide/32 v6, 0xea60

    .line 46
    .line 47
    .line 48
    div-long/2addr v4, v6

    .line 49
    iget v1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->c:I

    .line 50
    .line 51
    int-to-long v6, v1

    .line 52
    cmp-long v1, v4, v6

    .line 53
    .line 54
    if-lez v1, :cond_1

    .line 55
    .line 56
    sget-object v1, La/k7n;->b:La/k7n;

    .line 57
    .line 58
    const-string v3, "000"

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    sget-object v1, La/k7n;->a:La/k7n;

    .line 62
    .line 63
    :goto_1
    invoke-virtual {p0, v3, v1}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v3, v1}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {v0, p0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 82
    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    return-object p0

    .line 86
    :cond_3
    sget-object v1, La/k7n;->a:La/k7n;

    .line 87
    .line 88
    invoke-virtual {p0, v3, v1}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v3, v1}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {v0, p0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_4
    sget-object v1, La/k7n;->a:La/k7n;

    .line 107
    .line 108
    invoke-virtual {p0, v3, v1}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v3, v1}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v3, v1}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {v0, p0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 133
    .line 134
    .line 135
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 4

    .line 1
    new-instance v0, Landroid/text/SpannableString;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, La/rgg0;

    .line 7
    .line 8
    iget v1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->q:F

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget v2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->o:I

    .line 15
    .line 16
    iget v3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->p:I

    .line 17
    .line 18
    invoke-direct {p1, v2, v3, v1}, La/rgg0;-><init>(IILjava/lang/Float;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x21

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->s:Landroid/text/TextPaint;

    .line 32
    .line 33
    invoke-static {v0, p0}, Lorg/xplatform/uikit/components/timer/DsTimer;->c(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/StaticLayout;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
.end method

.method public final b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;
    .locals 3

    .line 1
    new-instance v0, Landroid/text/SpannableString;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    if-ne p1, p2, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->v:Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p1, "000"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimer;->a(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->v:Ljava/lang/Integer;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0

    .line 42
    :cond_2
    iget-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->u:Ljava/lang/Integer;

    .line 43
    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    const-string p1, "00"

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimer;->a(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    iput-object p2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->u:Ljava/lang/Integer;

    .line 62
    .line 63
    :goto_0
    new-instance p2, La/rgg0;

    .line 64
    .line 65
    iget v1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->q:F

    .line 66
    .line 67
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget v2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->n:I

    .line 72
    .line 73
    iget p0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->o:I

    .line 74
    .line 75
    invoke-direct {p2, v2, v1, p1, p0}, La/rgg0;-><init>(ILjava/lang/Float;II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    const/16 p1, 0x21

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    invoke-virtual {v0, p2, v1, p0, p1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 86
    .line 87
    .line 88
    return-object v0
.end method

.method public final d()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->l:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/timer/DsTimer;->e()Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->g:Landroid/os/Handler;

    .line 8
    .line 9
    iget-object v1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->w:La/mx2;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    iget-wide v2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->h:J

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->j:La/l7n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    iget-wide v3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->k:J

    .line 14
    .line 15
    iget-wide v5, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->h:J

    .line 16
    .line 17
    add-long/2addr v3, v5

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    iget-wide v3, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->k:J

    .line 24
    .line 25
    iget-wide v5, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->h:J

    .line 26
    .line 27
    sub-long/2addr v3, v5

    .line 28
    :goto_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 29
    .line 30
    sget-object v5, La/unq0;->c:La/unq0;

    .line 31
    .line 32
    if-ne v0, v5, :cond_5

    .line 33
    .line 34
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->j:La/l7n;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v5, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->c:I

    .line 41
    .line 42
    const-wide/32 v6, 0xea60

    .line 43
    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    if-ne v0, v2, :cond_3

    .line 48
    .line 49
    div-long v6, v3, v6

    .line 50
    .line 51
    int-to-long v8, v5

    .line 52
    cmp-long v0, v6, v8

    .line 53
    .line 54
    if-lez v0, :cond_2

    .line 55
    .line 56
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->z:Z

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    :goto_1
    move v0, v2

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move v0, v1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 65
    .line 66
    .line 67
    return v1

    .line 68
    :cond_4
    div-long v6, v3, v6

    .line 69
    .line 70
    int-to-long v8, v5

    .line 71
    cmp-long v0, v6, v8

    .line 72
    .line 73
    if-gtz v0, :cond_2

    .line 74
    .line 75
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->z:Z

    .line 76
    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :goto_2
    iput-boolean v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->y:Z

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    iput-boolean v2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->z:Z

    .line 85
    .line 86
    :cond_5
    const-wide/16 v5, 0x0

    .line 87
    .line 88
    cmp-long v0, v3, v5

    .line 89
    .line 90
    if-gez v0, :cond_7

    .line 91
    .line 92
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->i:Z

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    const/16 v0, 0x8

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/timer/DsTimer;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    :cond_6
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->x:Lkotlin/jvm/functions/Function0;

    .line 102
    .line 103
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-wide v3, v5

    .line 107
    :cond_7
    invoke-virtual {p0, v3, v4}, Lorg/xplatform/uikit/components/timer/DsTimer;->setTime(J)V

    .line 108
    .line 109
    .line 110
    cmp-long p0, v3, v5

    .line 111
    .line 112
    if-lez p0, :cond_8

    .line 113
    .line 114
    return v2

    .line 115
    :cond_8
    return v1
.end method

.method public final getHideAfterFinishedState()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getOnTimerFinished()Lkotlin/jvm/functions/Function0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->x:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->l:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/timer/DsTimer;->d()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->g:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object p0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->w:La/mx2;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->m:Landroid/text/StaticLayout;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sub-int/2addr v1, v2

    .line 20
    int-to-float v1, v1

    .line 21
    const/high16 v2, 0x40000000    # 2.0f

    .line 22
    .line 23
    div-float/2addr v1, v2

    .line 24
    iget p0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->r:I

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    sub-int/2addr p0, v3

    .line 31
    int-to-float p0, p0

    .line 32
    div-float/2addr p0, v2

    .line 33
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {p1, v1, p0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/timer/DsTimer;->getTimeForMeasure()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->s:Landroid/text/TextPaint;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lorg/xplatform/uikit/components/timer/DsTimer;->c(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/StaticLayout;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/text/Layout;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1}, Landroid/text/Layout;->getHeight()I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget p2, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->r:I

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final setHideAfterFinished(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setOnTimerFinished(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->x:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method

.method public final setTime(J)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 6
    .line 7
    sget-object v4, La/unq0;->b:La/unq0;

    .line 8
    .line 9
    if-ne v3, v4, :cond_0

    .line 10
    .line 11
    invoke-direct {v0}, Lorg/xplatform/uikit/components/timer/DsTimer;->getStandardTimerLimitMs()J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    cmp-long v3, v1, v5

    .line 16
    .line 17
    if-lez v3, :cond_0

    .line 18
    .line 19
    sget-object v3, La/unq0;->c:La/unq0;

    .line 20
    .line 21
    iput-object v3, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 22
    .line 23
    :cond_0
    iput-wide v1, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->k:J

    .line 24
    .line 25
    iget-object v3, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 26
    .line 27
    if-ne v3, v4, :cond_1

    .line 28
    .line 29
    invoke-direct {v0}, Lorg/xplatform/uikit/components/timer/DsTimer;->getStandardTimerLimitMs()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    cmp-long v3, v1, v3

    .line 34
    .line 35
    if-lez v3, :cond_1

    .line 36
    .line 37
    sget-object v3, La/unq0;->c:La/unq0;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v3, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 41
    .line 42
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/4 v4, 0x0

    .line 47
    iget v7, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->f:I

    .line 48
    .line 49
    iget-object v8, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->t:Landroid/text/SpannableString;

    .line 50
    .line 51
    iget v9, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->c:I

    .line 52
    .line 53
    sget-object v10, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 54
    .line 55
    const-wide/32 v11, 0xea60

    .line 56
    .line 57
    .line 58
    const-string v13, "0"

    .line 59
    .line 60
    const/4 v14, 0x1

    .line 61
    if-eqz v3, :cond_f

    .line 62
    .line 63
    if-eq v3, v14, :cond_9

    .line 64
    .line 65
    const/4 v15, 0x2

    .line 66
    if-ne v3, v15, :cond_8

    .line 67
    .line 68
    new-instance v3, Landroid/text/SpannableStringBuilder;

    .line 69
    .line 70
    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    div-long v11, v1, v11

    .line 74
    .line 75
    iget v15, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->e:I

    .line 76
    .line 77
    const-wide/16 v16, 0x3e8

    .line 78
    .line 79
    int-to-long v5, v15

    .line 80
    cmp-long v15, v11, v5

    .line 81
    .line 82
    if-lez v15, :cond_2

    .line 83
    .line 84
    move v15, v14

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    move v15, v4

    .line 87
    :goto_1
    if-eqz v15, :cond_3

    .line 88
    .line 89
    move-wide v11, v5

    .line 90
    :cond_3
    invoke-virtual {v10, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v5

    .line 94
    sub-long/2addr v1, v5

    .line 95
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-ne v6, v14, :cond_4

    .line 104
    .line 105
    invoke-virtual {v13, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    :cond_4
    int-to-long v9, v9

    .line 110
    cmp-long v6, v11, v9

    .line 111
    .line 112
    if-lez v6, :cond_5

    .line 113
    .line 114
    sget-object v6, La/k7n;->b:La/k7n;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    sget-object v6, La/k7n;->a:La/k7n;

    .line 118
    .line 119
    :goto_2
    invoke-virtual {v0, v5, v6}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {v3, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 127
    .line 128
    .line 129
    if-eqz v15, :cond_6

    .line 130
    .line 131
    int-to-long v1, v7

    .line 132
    goto :goto_3

    .line 133
    :cond_6
    div-long v1, v1, v16

    .line 134
    .line 135
    :goto_3
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-ne v2, v14, :cond_7

    .line 144
    .line 145
    invoke-virtual {v13, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :cond_7
    invoke-virtual {v0, v1, v6}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v3, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 154
    .line 155
    .line 156
    goto/16 :goto_9

    .line 157
    .line 158
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_9
    const-wide/16 v16, 0x3e8

    .line 163
    .line 164
    new-instance v3, Landroid/text/SpannableStringBuilder;

    .line 165
    .line 166
    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    div-long v5, v1, v11

    .line 170
    .line 171
    int-to-long v11, v9

    .line 172
    cmp-long v9, v5, v11

    .line 173
    .line 174
    if-lez v9, :cond_a

    .line 175
    .line 176
    move v9, v14

    .line 177
    goto :goto_4

    .line 178
    :cond_a
    move v9, v4

    .line 179
    :goto_4
    if-eqz v9, :cond_b

    .line 180
    .line 181
    move-wide v5, v11

    .line 182
    :cond_b
    invoke-virtual {v10, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 183
    .line 184
    .line 185
    move-result-wide v10

    .line 186
    sub-long/2addr v1, v10

    .line 187
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-ne v6, v14, :cond_c

    .line 196
    .line 197
    invoke-virtual {v13, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    :cond_c
    sget-object v6, La/k7n;->a:La/k7n;

    .line 202
    .line 203
    invoke-virtual {v0, v5, v6}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-virtual {v3, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 211
    .line 212
    .line 213
    if-eqz v9, :cond_d

    .line 214
    .line 215
    int-to-long v1, v7

    .line 216
    goto :goto_5

    .line 217
    :cond_d
    div-long v1, v1, v16

    .line 218
    .line 219
    :goto_5
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-ne v2, v14, :cond_e

    .line 228
    .line 229
    invoke-virtual {v13, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    :cond_e
    invoke-virtual {v0, v1, v6}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v3, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 238
    .line 239
    .line 240
    goto/16 :goto_9

    .line 241
    .line 242
    :cond_f
    const-wide/16 v16, 0x3e8

    .line 243
    .line 244
    new-instance v3, Landroid/text/SpannableStringBuilder;

    .line 245
    .line 246
    invoke-direct {v3}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 247
    .line 248
    .line 249
    const-wide/32 v5, 0x36ee80

    .line 250
    .line 251
    .line 252
    div-long v5, v1, v5

    .line 253
    .line 254
    iget v15, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->d:I

    .line 255
    .line 256
    move-wide/from16 v18, v11

    .line 257
    .line 258
    int-to-long v11, v15

    .line 259
    cmp-long v15, v5, v11

    .line 260
    .line 261
    if-lez v15, :cond_10

    .line 262
    .line 263
    move v15, v14

    .line 264
    goto :goto_6

    .line 265
    :cond_10
    move v15, v4

    .line 266
    :goto_6
    if-eqz v15, :cond_11

    .line 267
    .line 268
    move-wide v5, v11

    .line 269
    :cond_11
    sget-object v11, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 270
    .line 271
    invoke-virtual {v11, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 272
    .line 273
    .line 274
    move-result-wide v11

    .line 275
    sub-long/2addr v1, v11

    .line 276
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    if-ne v6, v14, :cond_12

    .line 285
    .line 286
    invoke-virtual {v13, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    :cond_12
    sget-object v6, La/k7n;->a:La/k7n;

    .line 291
    .line 292
    invoke-virtual {v0, v5, v6}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    invoke-virtual {v3, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 300
    .line 301
    .line 302
    if-eqz v15, :cond_13

    .line 303
    .line 304
    int-to-long v11, v9

    .line 305
    goto :goto_7

    .line 306
    :cond_13
    div-long v11, v1, v18

    .line 307
    .line 308
    :goto_7
    invoke-virtual {v10, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 309
    .line 310
    .line 311
    move-result-wide v9

    .line 312
    sub-long/2addr v1, v9

    .line 313
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 318
    .line 319
    .line 320
    move-result v9

    .line 321
    if-ne v9, v14, :cond_14

    .line 322
    .line 323
    invoke-virtual {v13, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    :cond_14
    invoke-virtual {v0, v5, v6}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    invoke-virtual {v3, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 335
    .line 336
    .line 337
    if-eqz v15, :cond_15

    .line 338
    .line 339
    int-to-long v1, v7

    .line 340
    goto :goto_8

    .line 341
    :cond_15
    div-long v1, v1, v16

    .line 342
    .line 343
    :goto_8
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    if-ne v2, v14, :cond_16

    .line 352
    .line 353
    invoke-virtual {v13, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    :cond_16
    invoke-virtual {v0, v1, v6}, Lorg/xplatform/uikit/components/timer/DsTimer;->b(Ljava/lang/String;La/k7n;)Landroid/text/SpannableString;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-virtual {v3, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 362
    .line 363
    .line 364
    :goto_9
    iget-object v1, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->s:Landroid/text/TextPaint;

    .line 365
    .line 366
    invoke-static {v3, v1}, Lorg/xplatform/uikit/components/timer/DsTimer;->c(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/StaticLayout;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    iput-object v1, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->m:Landroid/text/StaticLayout;

    .line 371
    .line 372
    invoke-direct {v0}, Lorg/xplatform/uikit/components/timer/DsTimer;->getCurrentTimerState()La/p7n;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    iget-object v2, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->a:La/p7n;

    .line 377
    .line 378
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    if-eqz v2, :cond_18

    .line 383
    .line 384
    iget-boolean v2, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->y:Z

    .line 385
    .line 386
    if-eqz v2, :cond_17

    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_17
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :cond_18
    :goto_a
    iput-boolean v4, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->y:Z

    .line 394
    .line 395
    iput-object v1, v0, Lorg/xplatform/uikit/components/timer/DsTimer;->a:La/p7n;

    .line 396
    .line 397
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 398
    .line 399
    .line 400
    return-void
.end method

.method public final setTimeDirection(La/l7n;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->j:La/l7n;

    .line 5
    .line 6
    return-void
.end method

.method public final setTimerType(La/unq0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->b:La/unq0;

    .line 5
    .line 6
    invoke-direct {p0}, Lorg/xplatform/uikit/components/timer/DsTimer;->getCurrentTimerState()La/p7n;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->a:La/p7n;

    .line 11
    .line 12
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->y:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->y:Z

    .line 26
    .line 27
    iput-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->a:La/p7n;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final setUpdateTimeIntervalMs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->h:J

    .line 2
    .line 3
    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    iget-boolean p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->l:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/timer/DsTimer;->d()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void

    .line 14
    :cond_1
    iget-object p1, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->g:Landroid/os/Handler;

    .line 15
    .line 16
    iget-object p0, p0, Lorg/xplatform/uikit/components/timer/DsTimer;->w:La/mx2;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
