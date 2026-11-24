.class public final Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic v:I


# instance fields
.field public q:Z

.field public final r:La/vd7;

.field public s:Landroid/text/TextWatcher;

.field public t:Ljava/math/BigDecimal;

.field public u:La/c4m0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 339
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->q:Z

    .line 16
    .line 17
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const v2, 0x7f0d0061

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    const p1, 0x7f0a01d4

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 35
    .line 36
    if-eqz v2, :cond_e

    .line 37
    .line 38
    const p1, 0x7f0a0f67

    .line 39
    .line 40
    .line 41
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 46
    .line 47
    if-eqz v3, :cond_e

    .line 48
    .line 49
    new-instance p1, La/vd7;

    .line 50
    .line 51
    invoke-direct {p1, p0, v2, v3, p3}, La/vd7;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;B)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 55
    .line 56
    sget-object v3, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iput-object v3, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->t:Ljava/math/BigDecimal;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object v4, La/aqd0;->v:[I

    .line 71
    .line 72
    invoke-virtual {v3, p2, v4, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    const/4 v3, 0x3

    .line 77
    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    move v3, p3

    .line 84
    goto :goto_0

    .line 85
    :cond_1
    const/16 v3, 0x8

    .line 86
    .line 87
    :goto_0
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 95
    .line 96
    .line 97
    :try_start_0
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {p2, p3, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception v2

    .line 113
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 114
    .line 115
    new-instance v3, La/g0g0;

    .line 116
    .line 117
    invoke-direct {v3, v2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    move-object v2, v3

    .line 121
    :goto_1
    nop

    .line 122
    instance-of v3, v2, La/g0g0;

    .line 123
    .line 124
    if-eqz v3, :cond_2

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_2
    move-object v0, v2

    .line 128
    :goto_2
    check-cast v0, Ljava/lang/String;

    .line 129
    .line 130
    const-string v2, ""

    .line 131
    .line 132
    if-nez v0, :cond_3

    .line 133
    .line 134
    move-object v0, v2

    .line 135
    :cond_3
    iget-object p1, p1, La/vd7;->d:Landroid/view/View;

    .line 136
    .line 137
    check-cast p1, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    const/4 p1, 0x4

    .line 143
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    invoke-virtual {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setVisibilityStepButtons(Z)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 154
    .line 155
    iget-object p1, p1, La/vd7;->d:Landroid/view/View;

    .line 156
    .line 157
    check-cast p1, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 158
    .line 159
    new-instance p2, La/qd7;

    .line 160
    .line 161
    invoke-direct {p2, p0, p3}, La/qd7;-><init>(Ljava/lang/Object;B)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p1, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 165
    .line 166
    if-eqz p1, :cond_4

    .line 167
    .line 168
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 169
    .line 170
    .line 171
    :cond_4
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 172
    .line 173
    iget-object p1, p1, La/vd7;->d:Landroid/view/View;

    .line 174
    .line 175
    check-cast p1, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 176
    .line 177
    iget-object p1, p1, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 178
    .line 179
    if-eqz p1, :cond_c

    .line 180
    .line 181
    iget-object p2, p1, Lorg/xplatform/uikit/components/text_field/middle/b;->l:La/i5i;

    .line 182
    .line 183
    sget-object v0, La/i5i;->c:La/i5i;

    .line 184
    .line 185
    if-ne p2, v0, :cond_5

    .line 186
    .line 187
    iget-boolean p2, p1, Lorg/xplatform/uikit/components/text_field/middle/b;->u:Z

    .line 188
    .line 189
    if-eqz p2, :cond_5

    .line 190
    .line 191
    move p2, v1

    .line 192
    goto :goto_3

    .line 193
    :cond_5
    move p2, p3

    .line 194
    :goto_3
    iput-boolean p2, p1, Lorg/xplatform/uikit/components/text_field/middle/b;->h:Z

    .line 195
    .line 196
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->d()V

    .line 197
    .line 198
    .line 199
    iget-boolean p2, p1, Lorg/xplatform/uikit/components/text_field/middle/b;->h:Z

    .line 200
    .line 201
    if-eqz p2, :cond_c

    .line 202
    .line 203
    iput-boolean p3, p1, Lorg/xplatform/uikit/components/text_field/middle/b;->t:Z

    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/view/View;->isFocused()Z

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    if-nez p2, :cond_7

    .line 210
    .line 211
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    if-eqz p2, :cond_7

    .line 216
    .line 217
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    invoke-virtual {p1, v0, p2}, Lorg/xplatform/uikit/components/text_field/middle/b;->g(ILjava/lang/CharSequence;)Z

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    if-ne p2, v1, :cond_7

    .line 226
    .line 227
    iput-boolean v1, p1, Lorg/xplatform/uikit/components/text_field/middle/b;->t:Z

    .line 228
    .line 229
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    if-eqz p2, :cond_6

    .line 234
    .line 235
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    if-eqz p2, :cond_6

    .line 240
    .line 241
    move-object v2, p2

    .line 242
    :cond_6
    iput-object v2, p1, Lorg/xplatform/uikit/components/text_field/middle/b;->s:Ljava/lang/CharSequence;

    .line 243
    .line 244
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    int-to-float v1, v1

    .line 257
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 258
    .line 259
    invoke-static {p2, v0, v1, v2}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    goto :goto_4

    .line 264
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->isFocused()Z

    .line 265
    .line 266
    .line 267
    move-result p2

    .line 268
    if-nez p2, :cond_8

    .line 269
    .line 270
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 271
    .line 272
    .line 273
    move-result-object p2

    .line 274
    goto :goto_4

    .line 275
    :cond_8
    iget-object p2, p1, Lorg/xplatform/uikit/components/text_field/middle/b;->s:Ljava/lang/CharSequence;

    .line 276
    .line 277
    if-eqz p2, :cond_a

    .line 278
    .line 279
    invoke-static {p2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_9

    .line 284
    .line 285
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    :cond_9
    if-nez p2, :cond_b

    .line 290
    .line 291
    :cond_a
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    :cond_b
    :goto_4
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 296
    .line 297
    .line 298
    :cond_c
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 299
    .line 300
    iget-object p1, p1, La/vd7;->d:Landroid/view/View;

    .line 301
    .line 302
    check-cast p1, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 303
    .line 304
    invoke-virtual {p1, p3}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 305
    .line 306
    .line 307
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->s:Landroid/text/TextWatcher;

    .line 308
    .line 309
    if-eqz p1, :cond_d

    .line 310
    .line 311
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 312
    .line 313
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 314
    .line 315
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 316
    .line 317
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 318
    .line 319
    .line 320
    :cond_d
    return-void

    .line 321
    :cond_e
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    const-string p1, "Missing required view with ID: "

    .line 330
    .line 331
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw v0
.end method

.method public static v(Ljava/lang/String;ZLa/sd7;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-byte v0, p2, La/sd7;->a:B

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "."

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/16 v4, 0x2e

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-lez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ne v1, v4, :cond_0

    .line 20
    .line 21
    const-string v1, "0"

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x6

    .line 29
    invoke-static {v4, v5, v1, p0}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v6, -0x1

    .line 34
    if-eq v1, v6, :cond_1

    .line 35
    .line 36
    add-int/2addr v1, v3

    .line 37
    invoke-virtual {p0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string v1, ""

    .line 46
    .line 47
    invoke-static {p0, v2, v1, v5}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :cond_1
    :goto_0
    invoke-static {p0, v4}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-static {p0, v4}, Lkotlin/text/StringsKt;->q0(Ljava/lang/String;C)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {p0, v4}, Lkotlin/text/StringsKt;->n0(Ljava/lang/String;C)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-le v6, v0, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-byte p2, p2, La/sd7;->b:B

    .line 84
    .line 85
    if-le v0, p2, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0, v5, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :cond_3
    invoke-static {v1, v2, p0}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-le p2, v0, :cond_5

    .line 101
    .line 102
    invoke-virtual {p0, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :cond_5
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-le p2, v3, :cond_6

    .line 111
    .line 112
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    const/16 v0, 0x30

    .line 117
    .line 118
    if-ne p2, v0, :cond_6

    .line 119
    .line 120
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eq p2, v4, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    :cond_6
    if-eqz p1, :cond_7

    .line 131
    .line 132
    const-string p1, ".0"

    .line 133
    .line 134
    invoke-static {p0, p1, v5}, Lkotlin/text/c;->n(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_7

    .line 139
    .line 140
    const/4 p1, 0x2

    .line 141
    invoke-static {p1, v5, p0}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    :cond_7
    return-object p0
.end method


# virtual methods
.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "etStep"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->w(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const-string v0, "focusFlag"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->q:Z

    .line 26
    .line 27
    const-string v0, "superState"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lkotlin/Pair;

    .line 6
    .line 7
    const-string v2, "superState"

    .line 8
    .line 9
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 13
    .line 14
    iget-object v0, v0, La/vd7;->d:Landroid/view/View;

    .line 15
    .line 16
    check-cast v0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 17
    .line 18
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v2, Lkotlin/Pair;

    .line 27
    .line 28
    const-string v3, "etStep"

    .line 29
    .line 30
    invoke-direct {v2, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-boolean p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->q:Z

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance v0, Lkotlin/Pair;

    .line 40
    .line 41
    const-string v3, "focusFlag"

    .line 42
    .line 43
    invoke-direct {v0, v3, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    filled-new-array {v1, v2, v0}, [Lkotlin/Pair;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public final setAfterTextChangedListener(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 5
    .line 6
    iget-object v0, v0, La/vd7;->d:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 9
    .line 10
    new-instance v1, La/ud7;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v2, p0, p1}, La/ud7;-><init>(BLandroid/view/View;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->s:Landroid/text/TextWatcher;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setBetLimitsText(Landroid/text/Spannable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 5
    .line 6
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setHelperText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setEachWayBadge(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 2
    .line 3
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setTrailingText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setEditFieldEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 2
    .line 3
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEnabled(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setFormatParams(La/sd7;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 5
    .line 6
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 9
    .line 10
    new-instance v0, La/tjj;

    .line 11
    .line 12
    iget-byte v1, p1, La/sd7;->a:B

    .line 13
    .line 14
    iget-byte p1, p1, La/sd7;->b:B

    .line 15
    .line 16
    invoke-direct {v0, v1, p1}, La/tjj;-><init>(II)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    new-array p1, p1, [Landroid/text/InputFilter;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aput-object v0, p1, v1

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setFilters([Landroid/text/InputFilter;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final setIsNeedClearText(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->q:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMakeBetButtonEnabled(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 2
    .line 3
    iget-object v0, p0, La/vd7;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/vd7;->c:Landroid/view/View;

    .line 11
    .line 12
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/high16 p1, 0x3f800000    # 1.0f

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/high16 p1, 0x3f000000    # 0.5f

    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final setMaxValue(Ljava/math/BigDecimal;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->t:Ljava/math/BigDecimal;

    .line 5
    .line 6
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 7
    .line 8
    iget-object v0, p0, La/vd7;->d:Landroid/view/View;

    .line 9
    .line 10
    check-cast v0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 11
    .line 12
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 13
    .line 14
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 15
    .line 16
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, La/wvb;->L(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-lez v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/math/BigDecimal;->signum()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v1, 0x0

    .line 51
    if-nez v0, :cond_0

    .line 52
    .line 53
    new-instance p1, Ljava/math/BigDecimal;

    .line 54
    .line 55
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 56
    .line 57
    invoke-direct {p1, v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    :cond_1
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setSelection(I)V

    .line 83
    .line 84
    .line 85
    :cond_2
    return-void
.end method

.method public final setMinusButtonClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 2
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
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 5
    .line 6
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 9
    .line 10
    new-instance v0, La/tq;

    .line 11
    .line 12
    const/16 v1, 0x13

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, La/tq;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEndStepperMinusClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setMinusButtonEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 2
    .line 3
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setMinusButtonEnabled(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setOnMakeBetButtonClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 3
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
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 5
    .line 6
    iget-object p0, p0, La/vd7;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/ymx;->i:La/ymx;

    .line 15
    .line 16
    new-instance v1, La/y;

    .line 17
    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    invoke-direct {v1, p1, v2}, La/y;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v0, v1}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setPlaceholder(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 5
    .line 6
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setPlusButtonClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 2
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
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 5
    .line 6
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 9
    .line 10
    new-instance v0, La/tq;

    .line 11
    .line 12
    const/16 v1, 0x12

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, La/tq;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEndStepperPlusClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setPlusButtonEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 2
    .line 3
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setPlusButtonEnabled(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setVisibilityStepButtons(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 2
    .line 3
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setPlusButtonVisible(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setMinusButtonVisible(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final u()V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 2
    .line 3
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final w(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->s:Landroid/text/TextWatcher;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v2, v1, La/vd7;->d:Landroid/view/View;

    .line 11
    .line 12
    check-cast v2, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, v1, La/vd7;->d:Landroid/view/View;

    .line 18
    .line 19
    check-cast v0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 20
    .line 21
    iget-object v1, v1, La/vd7;->d:Landroid/view/View;

    .line 22
    .line 23
    check-cast v1, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p2, :cond_3

    .line 33
    .line 34
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-eqz p1, :cond_2

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-ltz v2, :cond_2

    .line 52
    .line 53
    if-gt v2, v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 66
    :goto_1
    invoke-virtual {v1, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setSelection(I)V

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->s:Landroid/text/TextWatcher;

    .line 70
    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1, p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    return-void
.end method

.method public final x(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La/vd7;->d:Landroid/view/View;

    .line 9
    .line 10
    check-cast v0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, La/vd7;->d:Landroid/view/View;

    .line 17
    .line 18
    check-cast p1, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 26
    .line 27
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 28
    .line 29
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final y(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->u:La/c4m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    xor-int/lit8 v0, p1, 0x1

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMakeBetButtonEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setEditFieldEnabled(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setPlusButtonEnabled(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMinusButtonEnabled(Z)V

    .line 21
    .line 22
    .line 23
    new-instance v0, La/rd7;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, p1, v1}, La/rd7;-><init>(Ljava/lang/Object;ZB)V

    .line 27
    .line 28
    .line 29
    const-wide/16 v1, 0x12c

    .line 30
    .line 31
    invoke-static {p0, v1, v2, v0}, La/hxm0;->l(Landroid/view/View;JLkotlin/jvm/functions/Function0;)La/c4m0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->u:La/c4m0;

    .line 36
    .line 37
    return-void
.end method

.method public final z(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const v0, 0x7f080a43

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const v1, 0x7f040afc

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0, v1}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->r:La/vd7;

    .line 32
    .line 33
    iget-object p0, p0, La/vd7;->d:Landroid/view/View;

    .line 34
    .line 35
    check-cast p0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setHelperIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
