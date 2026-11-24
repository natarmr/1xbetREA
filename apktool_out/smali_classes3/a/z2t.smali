.class public final La/z2t;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/yjk;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "La/z2t;",
        "La/nw5;",
        "La/yjk;",
        "<init>",
        "()V",
        "core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic h2:[La/iiy;


# instance fields
.field public e2:La/z6i;

.field public final f2:La/kiu0;

.field public final g2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/z2t;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/core/databinding/DialogXgamesBetSettingsBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/z2t;->h2:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/x2t;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/x2t;-><init>(La/z2t;B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/jfl;

    .line 11
    .line 12
    const/16 v2, 0x1b

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/wez;->b:La/wez;

    .line 18
    .line 19
    new-instance v3, La/jfl;

    .line 20
    .line 21
    const/16 v4, 0x1c

    .line 22
    .line 23
    invoke-direct {v3, v1, v4}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-class v2, La/q3t;

    .line 31
    .line 32
    sget-object v3, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, La/r6p;

    .line 39
    .line 40
    const/16 v4, 0xe

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/r6p;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/r6p;

    .line 46
    .line 47
    const/16 v5, 0xf

    .line 48
    .line 49
    invoke-direct {v4, v1, v5}, La/r6p;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/z2t;->f2:La/kiu0;

    .line 57
    .line 58
    sget-object v0, La/y2t;->a:La/y2t;

    .line 59
    .line 60
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/z2t;->g2:La/nae0;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic L0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final O0()V
    .locals 14

    .line 1
    invoke-virtual {p0}, La/z2t;->V0()La/q3t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/q3t;->n:La/q99;

    .line 6
    .line 7
    invoke-static {v0}, La/xkb;->V(La/htb;)La/itb;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/j0s;

    .line 12
    .line 13
    const/16 v2, 0xa

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v3, v2}, La/j0s;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    new-instance v5, La/fns;

    .line 34
    .line 35
    invoke-direct {v5, v0, v2, v1, v3}, La/fns;-><init>(La/itb;La/clz;La/j0s;La/yje;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x3

    .line 39
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v1, v1, La/yjk;->i:Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 47
    .line 48
    new-instance v2, La/v2t;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct {v2, p0, v4}, La/v2t;-><init>(La/z2t;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v1, v1, La/yjk;->g:Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 62
    .line 63
    new-instance v2, La/v2t;

    .line 64
    .line 65
    const/4 v5, 0x1

    .line 66
    invoke-direct {v2, p0, v5}, La/v2t;-><init>(La/z2t;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v1, v1, La/yjk;->e:Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 77
    .line 78
    new-instance v2, La/v2t;

    .line 79
    .line 80
    const/4 v6, 0x2

    .line 81
    invoke-direct {v2, p0, v6}, La/v2t;-><init>(La/z2t;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v1, v1, La/yjk;->f:Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 92
    .line 93
    new-instance v2, La/v2t;

    .line 94
    .line 95
    invoke-direct {v2, p0, v0}, La/v2t;-><init>(La/z2t;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v1, v1, La/yjk;->h:Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 106
    .line 107
    new-instance v2, La/v2t;

    .line 108
    .line 109
    const/4 v7, 0x4

    .line 110
    invoke-direct {v2, p0, v7}, La/v2t;-><init>(La/z2t;B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget-object v1, v1, La/yjk;->d:Landroidx/appcompat/widget/AppCompatEditText;

    .line 121
    .line 122
    new-instance v2, La/x2t;

    .line 123
    .line 124
    invoke-direct {v2, p0, v5}, La/x2t;-><init>(La/z2t;B)V

    .line 125
    .line 126
    .line 127
    invoke-static {v1, v2}, La/hxm0;->y(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget-object v1, v1, La/yjk;->c:Landroidx/appcompat/widget/AppCompatEditText;

    .line 135
    .line 136
    new-instance v2, La/x2t;

    .line 137
    .line 138
    invoke-direct {v2, p0, v6}, La/x2t;-><init>(La/z2t;B)V

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v2}, La/hxm0;->y(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-object v1, v1, La/yjk;->b:Landroidx/appcompat/widget/AppCompatEditText;

    .line 149
    .line 150
    new-instance v2, La/x2t;

    .line 151
    .line 152
    invoke-direct {v2, p0, v0}, La/x2t;-><init>(La/z2t;B)V

    .line 153
    .line 154
    .line 155
    invoke-static {v1, v2}, La/hxm0;->y(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v0, v0, La/yjk;->d:Landroidx/appcompat/widget/AppCompatEditText;

    .line 163
    .line 164
    new-instance v1, La/w2t;

    .line 165
    .line 166
    invoke-direct {v1, p0, v6}, La/w2t;-><init>(La/z2t;B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-object v0, v0, La/yjk;->c:Landroidx/appcompat/widget/AppCompatEditText;

    .line 177
    .line 178
    new-instance v1, La/w2t;

    .line 179
    .line 180
    invoke-direct {v1, p0, v4}, La/w2t;-><init>(La/z2t;B)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-object v0, v0, La/yjk;->b:Landroidx/appcompat/widget/AppCompatEditText;

    .line 191
    .line 192
    new-instance v1, La/w2t;

    .line 193
    .line 194
    invoke-direct {v1, p0, v5}, La/w2t;-><init>(La/z2t;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iget-object v0, v0, La/yjk;->d:Landroidx/appcompat/widget/AppCompatEditText;

    .line 205
    .line 206
    new-instance v1, La/tjj;

    .line 207
    .line 208
    const/16 v2, 0xd

    .line 209
    .line 210
    invoke-direct {v1, v2, v6}, La/tjj;-><init>(II)V

    .line 211
    .line 212
    .line 213
    new-array v7, v5, [Landroid/text/InputFilter;

    .line 214
    .line 215
    aput-object v1, v7, v4

    .line 216
    .line 217
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget-object v0, v0, La/yjk;->c:Landroidx/appcompat/widget/AppCompatEditText;

    .line 225
    .line 226
    new-instance v1, La/tjj;

    .line 227
    .line 228
    invoke-direct {v1, v2, v6}, La/tjj;-><init>(II)V

    .line 229
    .line 230
    .line 231
    new-array v7, v5, [Landroid/text/InputFilter;

    .line 232
    .line 233
    aput-object v1, v7, v4

    .line 234
    .line 235
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iget-object v0, v0, La/yjk;->b:Landroidx/appcompat/widget/AppCompatEditText;

    .line 243
    .line 244
    new-instance v1, La/tjj;

    .line 245
    .line 246
    invoke-direct {v1, v2, v6}, La/tjj;-><init>(II)V

    .line 247
    .line 248
    .line 249
    new-array v2, v5, [Landroid/text/InputFilter;

    .line 250
    .line 251
    aput-object v1, v2, v4

    .line 252
    .line 253
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0}, La/z2t;->V0()La/q3t;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    new-instance v5, La/h2s;

    .line 265
    .line 266
    const/4 v11, 0x0

    .line 267
    const/16 v12, 0x18

    .line 268
    .line 269
    const/4 v6, 0x1

    .line 270
    const-class v8, La/q3t;

    .line 271
    .line 272
    const-string v9, "handleGameError"

    .line 273
    .line 274
    const-string v10, "handleGameError(Ljava/lang/Throwable;)V"

    .line 275
    .line 276
    invoke-direct/range {v5 .. v12}, La/h2s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 277
    .line 278
    .line 279
    iget-object v0, v7, La/q3t;->l:La/mne;

    .line 280
    .line 281
    iget-object v11, v0, La/mne;->a:La/rwj;

    .line 282
    .line 283
    new-instance v12, La/gkr;

    .line 284
    .line 285
    const/4 v0, 0x5

    .line 286
    invoke-direct {v12, v7, v3, v0}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 287
    .line 288
    .line 289
    const/16 v13, 0xa

    .line 290
    .line 291
    const/4 v10, 0x0

    .line 292
    move-object v8, p0

    .line 293
    move-object v9, v5

    .line 294
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 295
    .line 296
    .line 297
    return-void
.end method

.method public final P0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    instance-of v2, v0, La/bn70;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, La/bn70;

    .line 16
    .line 17
    :cond_1
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-object v0, v1, La/bn70;->L1:La/h5t;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {v0, p0}, La/h5t;->j(La/z2t;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a063f

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final T0()La/yjk;
    .locals 2

    .line 1
    sget-object v0, La/z2t;->h2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/z2t;->g2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/yjk;

    .line 16
    .line 17
    return-object p0
.end method

.method public final U0(La/gxo;)Landroidx/appcompat/widget/AppCompatEditText;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-object p0, p0, La/yjk;->b:Landroidx/appcompat/widget/AppCompatEditText;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p0, p0, La/yjk;->c:Landroidx/appcompat/widget/AppCompatEditText;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-object p0, p0, La/yjk;->d:Landroidx/appcompat/widget/AppCompatEditText;

    .line 37
    .line 38
    return-object p0
.end method

.method public final V0()La/q3t;
    .locals 0

    .line 1
    iget-object p0, p0, La/z2t;->f2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/q3t;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/yjk;->i:Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lorg/xplatform/core/presentation/bet_settings/ChipView;->a(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/yjk;->g:Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/xplatform/core/presentation/bet_settings/ChipView;->a(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, La/yjk;->e:Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lorg/xplatform/core/presentation/bet_settings/ChipView;->a(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, La/yjk;->f:Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lorg/xplatform/core/presentation/bet_settings/ChipView;->a(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    iget-object p0, p0, La/yjk;->h:Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lorg/xplatform/core/presentation/bet_settings/ChipView;->a(Z)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final d0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/z2t;->V0()La/q3t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/gxo;->a:La/gxo;

    .line 6
    .line 7
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v2, v2, La/yjk;->d:Landroidx/appcompat/widget/AppCompatEditText;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v1, v2}, La/q3t;->B(La/gxo;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, La/z2t;->V0()La/q3t;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, La/gxo;->b:La/gxo;

    .line 29
    .line 30
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v2, v2, La/yjk;->c:Landroidx/appcompat/widget/AppCompatEditText;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v1, v2}, La/q3t;->B(La/gxo;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, La/z2t;->V0()La/q3t;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v1, La/gxo;->c:La/gxo;

    .line 52
    .line 53
    invoke-virtual {p0}, La/z2t;->T0()La/yjk;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-object v2, v2, La/yjk;->b:Landroidx/appcompat/widget/AppCompatEditText;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v0, v1, v2}, La/q3t;->B(La/gxo;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 72
    .line 73
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, La/nw5;->J0()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
