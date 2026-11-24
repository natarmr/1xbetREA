.class public final Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field public i:Ljava/lang/String;

.field public final j:F

.field public final k:F

.field public final l:I

.field public final m:Z

.field public final n:Landroid/text/SpannableStringBuilder;

.field public o:Landroid/text/SpannableString;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

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
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->getDefaultEllipsis()C

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->i:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->j:F

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iput v2, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->k:F

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    iput v3, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->l:I

    .line 37
    .line 38
    new-instance v4, Landroid/text/SpannableStringBuilder;

    .line 39
    .line 40
    invoke-direct {v4}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v4, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->n:Landroid/text/SpannableStringBuilder;

    .line 44
    .line 45
    sget-object v4, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 46
    .line 47
    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 48
    .line 49
    .line 50
    sget-object v4, La/bqd0;->z:[I

    .line 51
    .line 52
    invoke-virtual {p1, p2, v4, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 p2, 0x4

    .line 57
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-nez p2, :cond_1

    .line 62
    .line 63
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->getDefaultEllipsis()C

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :cond_1
    iput-object p2, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->i:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    iput p2, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->j:F

    .line 78
    .line 79
    invoke-virtual {p1, p3, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iput p2, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->k:F

    .line 84
    .line 85
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    iput p2, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->l:I

    .line 90
    .line 91
    const/4 p2, 0x3

    .line 92
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-ne p2, v3, :cond_2

    .line 97
    .line 98
    move p3, v3

    .line 99
    :cond_2
    iput-boolean p3, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->m:Z

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 102
    .line 103
    .line 104
    new-instance p1, Landroid/text/SpannableString;

    .line 105
    .line 106
    iget-object p2, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->i:Ljava/lang/String;

    .line 107
    .line 108
    invoke-direct {p1, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->o:Landroid/text/SpannableString;

    .line 112
    .line 113
    return-void
.end method

.method private final getDefaultEllipsis()C
    .locals 0

    const/16 p0, 0x2026

    return p0
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    sub-int/2addr p1, p2

    .line 13
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    sub-int/2addr p1, p2

    .line 18
    int-to-float p1, p1

    .line 19
    iget-boolean p2, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->m:Z

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    :goto_0
    cmpl-float v0, p2, p1

    .line 40
    .line 41
    iget v1, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->l:I

    .line 42
    .line 43
    if-lez v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget v2, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->j:F

    .line 50
    .line 51
    sub-float/2addr v0, v2

    .line 52
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    int-to-float v2, v1

    .line 57
    cmpl-float v0, v0, v2

    .line 58
    .line 59
    if-ltz v0, :cond_0

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p2}, Landroid/graphics/Paint;->getTextSize()F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    sub-float/2addr v0, v2

    .line 70
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    :goto_1
    cmpg-float p2, p2, p1

    .line 91
    .line 92
    if-gez p2, :cond_1

    .line 93
    .line 94
    iget p2, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->k:F

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    sub-float/2addr p2, v0

    .line 101
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    int-to-float v0, v1

    .line 106
    cmpl-float p2, p2, v0

    .line 107
    .line 108
    if-ltz p2, :cond_1

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {p2}, Landroid/graphics/Paint;->getTextSize()F

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    add-float/2addr v2, v0

    .line 119
    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    goto :goto_1

    .line 139
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getMaxLines()I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    int-to-float p2, p2

    .line 144
    mul-float/2addr p2, p1

    .line 145
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {p0}, Landroid/widget/TextView;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {v0, v1, p2, v2}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    if-nez p2, :cond_2

    .line 178
    .line 179
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    iget-object v0, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->i:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    sub-float/2addr p1, p2

    .line 190
    invoke-virtual {p0}, Landroid/widget/TextView;->getMaxLines()I

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    int-to-float p2, p2

    .line 195
    mul-float/2addr p1, p2

    .line 196
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {p0}, Landroid/widget/TextView;->getEllipsize()Landroid/text/TextUtils$TruncateAt;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {p2, v0, p1, v1}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-direct {p0}, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->getDefaultEllipsis()C

    .line 216
    .line 217
    .line 218
    move-result p2

    .line 219
    const/4 v0, 0x0

    .line 220
    const/4 v1, 0x6

    .line 221
    invoke-static {p2, v0, v1, p1}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    add-int/lit8 v0, p2, 0x1

    .line 226
    .line 227
    iget-object v1, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->n:Landroid/text/SpannableStringBuilder;

    .line 228
    .line 229
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    iget-object v1, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->o:Landroid/text/SpannableString;

    .line 237
    .line 238
    invoke-virtual {p1, p2, v0, v1}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 243
    .line 244
    .line 245
    :cond_2
    return-void
.end method

.method public final setEllipsisValue(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->i:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p1, Landroid/text/SpannableString;

    .line 7
    .line 8
    iget-object v0, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->i:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {p1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lorg/xplatform/uikit/components/views/CustomEndEllipsizeTextView;->o:Landroid/text/SpannableString;

    .line 14
    .line 15
    return-void
.end method
