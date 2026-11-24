.class public final La/wl40;
.super La/hgd;
.source "SourceFile"


# instance fields
.field public e:Lkotlin/jvm/functions/Function0;

.field public f:La/em40;

.field public g:J

.field public final h:Landroid/view/View;

.field public final i:La/tl40;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;La/em40;JLandroid/view/View;La/k6z;La/w6k;Ljava/util/UUID;La/t33;La/vne;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const v2, 0x7f1401ff

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {p0, v0, v1}, La/hgd;-><init>(Landroid/content/Context;I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/wl40;->e:Lkotlin/jvm/functions/Function0;

    .line 18
    .line 19
    iput-object p2, p0, La/wl40;->f:La/em40;

    .line 20
    .line 21
    iput-wide p3, p0, La/wl40;->g:J

    .line 22
    .line 23
    iput-object p5, p0, La/wl40;->h:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    invoke-virtual {p1, p2}, Landroid/view/Window;->requestFeature(I)Z

    .line 33
    .line 34
    .line 35
    const p2, 0x106000d

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v1}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 42
    .line 43
    .line 44
    new-instance p2, La/tl40;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-direct {p2, p3, p1}, La/tl40;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    .line 51
    .line 52
    .line 53
    new-instance p3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string p4, "Dialog:"

    .line 56
    .line 57
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    const p4, 0x7f0a037f

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p4, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 74
    .line 75
    .line 76
    const/high16 p3, 0x41000000    # 8.0f

    .line 77
    .line 78
    invoke-interface {p7, p3}, La/w6k;->w0(F)F

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    invoke-virtual {p2, p3}, Landroid/view/View;->setElevation(F)V

    .line 83
    .line 84
    .line 85
    new-instance p3, La/ruc;

    .line 86
    .line 87
    const/4 p4, 0x2

    .line 88
    invoke-direct {p3, p4}, La/ruc;-><init>(B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 92
    .line 93
    .line 94
    iput-object p2, p0, La/wl40;->i:La/tl40;

    .line 95
    .line 96
    invoke-virtual {p0, p2}, La/hgd;->setContentView(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p5}, La/s7n0;->l(Landroid/view/View;)La/clz;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    const p4, 0x7f0a1426

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, p4, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-static {p5}, La/n8n0;->h(Landroid/view/View;)La/riu0;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    const p4, 0x7f0a142a

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p4, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p5}, La/w7n0;->p(Landroid/view/View;)La/i0h0;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    const p4, 0x7f0a1429

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2, p4, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, La/wl40;->e:Lkotlin/jvm/functions/Function0;

    .line 130
    .line 131
    iget-object v2, p0, La/wl40;->f:La/em40;

    .line 132
    .line 133
    iget-wide v3, p0, La/wl40;->g:J

    .line 134
    .line 135
    move-object v0, p0

    .line 136
    move-object v5, p6

    .line 137
    invoke-virtual/range {v0 .. v5}, La/wl40;->e(Lkotlin/jvm/functions/Function0;La/em40;JLa/k6z;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    new-instance p3, La/ani0;

    .line 145
    .line 146
    invoke-direct {p3, p2}, La/ani0;-><init>(Landroid/view/View;)V

    .line 147
    .line 148
    .line 149
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 150
    .line 151
    const/16 p4, 0x23

    .line 152
    .line 153
    if-lt p2, p4, :cond_0

    .line 154
    .line 155
    new-instance p2, La/bjv0;

    .line 156
    .line 157
    invoke-direct {p2, p1, p3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_0
    const/16 p4, 0x1e

    .line 162
    .line 163
    if-lt p2, p4, :cond_1

    .line 164
    .line 165
    new-instance p2, La/ajv0;

    .line 166
    .line 167
    invoke-direct {p2, p1, p3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_1
    const/16 p4, 0x1a

    .line 172
    .line 173
    if-lt p2, p4, :cond_2

    .line 174
    .line 175
    new-instance p2, La/ziv0;

    .line 176
    .line 177
    invoke-direct {p2, p1, p3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 178
    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_2
    new-instance p2, La/yiv0;

    .line 182
    .line 183
    invoke-direct {p2, p1, p3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 184
    .line 185
    .line 186
    :goto_0
    iget-object p1, p0, La/wl40;->f:La/em40;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    iget-wide p3, p0, La/wl40;->g:J

    .line 192
    .line 193
    invoke-static {p3, p4}, La/uvw;->M(J)Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    invoke-virtual {p2, p1}, La/ycm0;->w(Z)V

    .line 198
    .line 199
    .line 200
    iget-object p1, p0, La/wl40;->f:La/em40;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    iget-wide p3, p0, La/wl40;->g:J

    .line 206
    .line 207
    invoke-static {p3, p4}, La/uvw;->M(J)Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    invoke-virtual {p2, p1}, La/ycm0;->v(Z)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, La/hgd;->k()La/jg60;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    new-instance p2, La/vl40;

    .line 219
    .line 220
    iget-object p3, p0, La/wl40;->f:La/em40;

    .line 221
    .line 222
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    new-instance p3, La/np30;

    .line 226
    .line 227
    const/16 p4, 0x9

    .line 228
    .line 229
    invoke-direct {p3, p0, p4}, La/np30;-><init>(Ljava/lang/Object;B)V

    .line 230
    .line 231
    .line 232
    move-object/from16 p5, p10

    .line 233
    .line 234
    invoke-direct {p2, p5, p9, p3}, La/vl40;-><init>(La/vne;La/t33;La/np30;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, p0, p2}, La/jg60;->a(La/clz;La/eg60;)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_3
    const-string p0, "Dialog has no window"

    .line 242
    .line 243
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    const/4 p0, 0x0

    .line 247
    throw p0
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(Lkotlin/jvm/functions/Function0;La/em40;JLa/k6z;)V
    .locals 1

    .line 1
    iput-object p1, p0, La/wl40;->e:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    iput-object p2, p0, La/wl40;->f:La/em40;

    .line 4
    .line 5
    iput-wide p3, p0, La/wl40;->g:J

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object p1, La/pnh0;->a:La/pnh0;

    .line 11
    .line 12
    iget-object p1, p0, La/wl40;->h:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    instance-of p2, p1, Landroid/view/WindowManager$LayoutParams;

    .line 23
    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    check-cast p1, Landroid/view/WindowManager$LayoutParams;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    const/4 p2, 0x1

    .line 31
    const/16 p3, 0x2000

    .line 32
    .line 33
    const/4 p4, 0x0

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 37
    .line 38
    and-int/2addr p1, p3

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    move p1, p2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move p1, p4

    .line 44
    :goto_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    move p1, p3

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 p1, -0x2001

    .line 56
    .line 57
    :goto_2
    invoke-virtual {v0, p1, p3}, Landroid/view/Window;->setFlags(II)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    if-ne p1, p2, :cond_3

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_4
    move p2, p4

    .line 74
    :goto_3
    iget-object p1, p0, La/wl40;->i:La/tl40;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    const/4 p2, -0x1

    .line 86
    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setLayout(II)V

    .line 87
    .line 88
    .line 89
    :cond_5
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-eqz p0, :cond_7

    .line 94
    .line 95
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    const/16 p2, 0x1e

    .line 98
    .line 99
    if-lt p1, p2, :cond_6

    .line 100
    .line 101
    const/16 p1, 0x30

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_6
    const/16 p1, 0x10

    .line 105
    .line 106
    :goto_4
    invoke-virtual {p0, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 107
    .line 108
    .line 109
    :cond_7
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/wl40;->e:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    return p1
.end method
