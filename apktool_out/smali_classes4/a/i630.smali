.class public final La/i630;
.super La/by5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/by5<",
        "La/zzq;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/i630;",
        "La/by5;",
        "La/zzq;",
        "<init>",
        "()V",
        "a/evz",
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
.field public static final k2:La/evz;

.field public static final synthetic l2:[La/iiy;


# instance fields
.field public b2:La/wsz;

.field public c2:La/fiu0;

.field public d2:La/ii;

.field public final e2:I

.field public final f2:La/kiu0;

.field public final g2:La/nae0;

.field public final h2:La/a8z;

.field public i2:La/vyx;

.field public final j2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/i630;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/cyber/game/core/databinding/FragmentFilterMarketsBinding;"

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
    sput-object v1, La/i630;->l2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/evz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/i630;->k2:La/evz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, La/by5;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f040ae3

    .line 5
    .line 6
    .line 7
    iput v0, p0, La/i630;->e2:I

    .line 8
    .line 9
    new-instance v0, La/e630;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p0, v1}, La/e630;-><init>(La/i630;B)V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/pv10;

    .line 16
    .line 17
    const/16 v2, 0xf

    .line 18
    .line 19
    invoke-direct {v1, p0, v2}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    sget-object v2, La/wez;->b:La/wez;

    .line 23
    .line 24
    new-instance v3, La/pv10;

    .line 25
    .line 26
    const/16 v4, 0x10

    .line 27
    .line 28
    invoke-direct {v3, v1, v4}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-class v3, La/f730;

    .line 36
    .line 37
    sget-object v4, La/sre0;->a:La/tre0;

    .line 38
    .line 39
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v4, La/y620;

    .line 44
    .line 45
    const/4 v5, 0x6

    .line 46
    invoke-direct {v4, v1, v5}, La/y620;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    new-instance v5, La/y620;

    .line 50
    .line 51
    const/4 v6, 0x7

    .line 52
    invoke-direct {v5, v1, v6}, La/y620;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/i630;->f2:La/kiu0;

    .line 60
    .line 61
    sget-object v0, La/g630;->a:La/g630;

    .line 62
    .line 63
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/i630;->g2:La/nae0;

    .line 68
    .line 69
    new-instance v0, La/e630;

    .line 70
    .line 71
    const/4 v1, 0x2

    .line 72
    invoke-direct {v0, p0, v1}, La/e630;-><init>(La/i630;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/i630;->h2:La/a8z;

    .line 80
    .line 81
    new-instance v0, La/e630;

    .line 82
    .line 83
    const/4 v1, 0x3

    .line 84
    invoke-direct {v0, p0, v1}, La/e630;-><init>(La/i630;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, La/i630;->j2:La/a8z;

    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p0, La/sik;->M1:I

    .line 6
    .line 7
    new-instance v1, La/a630;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, p0, p1, v0, v2}, La/a630;-><init>(La/by5;La/kxq;IB)V

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method public final bridge synthetic I0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/i630;->S0()La/zzq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final J0()I
    .locals 0

    .line 1
    iget p0, p0, La/i630;->e2:I

    .line 2
    .line 3
    return p0
.end method

.method public final K0()V
    .locals 15

    .line 1
    new-instance v0, La/e630;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, La/e630;-><init>(La/i630;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/i630;->b2:La/wsz;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    if-eqz v0, :cond_6

    .line 14
    .line 15
    invoke-virtual {p0}, La/i630;->S0()La/zzq;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, La/i630;->T0()La/f730;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v7, La/du20;

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    const/16 v14, 0xa

    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    const-class v10, La/i630;

    .line 30
    .line 31
    const-string v11, "applyTouchHelper"

    .line 32
    .line 33
    const-string v12, "applyTouchHelper(Z)V"

    .line 34
    .line 35
    move-object v9, p0

    .line 36
    invoke-direct/range {v7 .. v14}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 37
    .line 38
    .line 39
    iget-object p0, v0, La/zzq;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 40
    .line 41
    new-instance v3, La/l910;

    .line 42
    .line 43
    const/4 v8, 0x3

    .line 44
    invoke-direct {v3, v2, v8}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const v4, 0x7f0a0ce3

    .line 55
    .line 56
    .line 57
    invoke-interface {v3, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    invoke-interface {v3}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move-object v5, v6

    .line 69
    :goto_0
    instance-of v10, v5, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;

    .line 70
    .line 71
    if-eqz v10, :cond_1

    .line 72
    .line 73
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    move-object v5, v6

    .line 77
    :goto_1
    if-eqz v5, :cond_2

    .line 78
    .line 79
    new-instance v10, La/km00;

    .line 80
    .line 81
    const/16 v11, 0x1a

    .line 82
    .line 83
    invoke-direct {v10, v2, v11}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v10}, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;->setOnFocusChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    new-instance v10, La/lw20;

    .line 90
    .line 91
    const/4 v11, 0x1

    .line 92
    invoke-direct {v10, v2, v11}, La/lw20;-><init>(La/f730;B)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v3, v10}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    .line 96
    .line 97
    .line 98
    if-eqz v5, :cond_3

    .line 99
    .line 100
    new-instance v10, La/nw20;

    .line 101
    .line 102
    invoke-direct {v10, v7, v2}, La/nw20;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v10}, Landroidx/appcompat/widget/d;->setOnQueryTextListener(La/hih0;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    if-eqz v5, :cond_4

    .line 109
    .line 110
    const v7, 0x7f1311c5

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5, v7}, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;->setText(I)V

    .line 114
    .line 115
    .line 116
    :cond_4
    if-eqz v5, :cond_5

    .line 117
    .line 118
    invoke-virtual {v5, v11}, Landroidx/appcompat/widget/d;->setIconifiedByDefault(Z)V

    .line 119
    .line 120
    .line 121
    :cond_5
    iget-object v0, v0, La/zzq;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v7, La/jw20;

    .line 127
    .line 128
    invoke-direct {v7, v5, v1}, La/jw20;-><init>(Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    sget-object v5, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 132
    .line 133
    invoke-static {v0, v7}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-interface {p0, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    new-instance v0, La/lw20;

    .line 145
    .line 146
    invoke-direct {v0, v2, v1}, La/lw20;-><init>(La/f730;B)V

    .line 147
    .line 148
    .line 149
    invoke-interface {p0, v0}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    .line 150
    .line 151
    .line 152
    iget-object p0, v2, La/f730;->q:La/p7m0;

    .line 153
    .line 154
    new-instance v0, La/ow20;

    .line 155
    .line 156
    invoke-direct {v0, v3, v6, v11}, La/ow20;-><init>(Landroid/view/MenuItem;La/yje;B)V

    .line 157
    .line 158
    .line 159
    sget-object v2, La/lkz;->a:La/lkz;

    .line 160
    .line 161
    invoke-static {v9}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    new-instance v4, La/mw20;

    .line 174
    .line 175
    invoke-direct {v4, p0, v2, v0, v6}, La/mw20;-><init>(La/gmq;La/clz;La/ow20;La/yje;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v3, v6, v6, v4, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v9}, La/i630;->S0()La/zzq;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    iget-object p0, p0, La/zzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 186
    .line 187
    iget-object v0, v9, La/i630;->j2:La/a8z;

    .line 188
    .line 189
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    check-cast v0, La/u530;

    .line 194
    .line 195
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v9, v11}, La/i630;->R0(Z)V

    .line 199
    .line 200
    .line 201
    new-instance p0, La/f630;

    .line 202
    .line 203
    invoke-direct {p0, v9, v11}, La/f630;-><init>(La/i630;B)V

    .line 204
    .line 205
    .line 206
    const-string v0, "REQUEST_FILTER_DIALOG_KEY"

    .line 207
    .line 208
    invoke-static {v9, v0, p0}, La/sj3;->t0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9}, La/i630;->T0()La/f730;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    iget-object v3, p0, La/f730;->r:La/p7m0;

    .line 216
    .line 217
    new-instance v5, La/w620;

    .line 218
    .line 219
    const/4 p0, 0x7

    .line 220
    invoke-direct {v5, v9, v6, p0}, La/w620;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 221
    .line 222
    .line 223
    invoke-static {v9}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    new-instance v2, La/mw20;

    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    invoke-direct/range {v2 .. v7}, La/mw20;-><init>(La/gmq;La/clz;La/w620;La/yje;B)V

    .line 239
    .line 240
    .line 241
    invoke-static {p0, v6, v6, v2, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9}, La/i630;->T0()La/f730;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    iget-object p0, p0, La/f730;->s:La/ol60;

    .line 249
    .line 250
    new-instance v0, La/h630;

    .line 251
    .line 252
    invoke-direct {v0, v9, v6, v1}, La/h630;-><init>(La/i630;La/yje;B)V

    .line 253
    .line 254
    .line 255
    invoke-static {v9}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    new-instance v3, La/mw20;

    .line 268
    .line 269
    invoke-direct {v3, p0, v1, v0, v6}, La/mw20;-><init>(La/gmq;La/clz;La/h630;La/yje;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v2, v6, v6, v3, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9}, La/i630;->T0()La/f730;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    iget-object v3, p0, La/f730;->p:La/p7m0;

    .line 280
    .line 281
    new-instance v5, La/h630;

    .line 282
    .line 283
    invoke-direct {v5, v9, v6, v11}, La/h630;-><init>(La/i630;La/yje;B)V

    .line 284
    .line 285
    .line 286
    invoke-static {v9}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    new-instance v2, La/mw20;

    .line 299
    .line 300
    invoke-direct/range {v2 .. v7}, La/mw20;-><init>(La/gmq;La/clz;La/h630;La/yje;B)V

    .line 301
    .line 302
    .line 303
    invoke-static {p0, v6, v6, v2, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :cond_6
    const-string p0, "marketSettingsToolbarFragmentDelegate"

    .line 308
    .line 309
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v6
.end method

.method public final L0()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/j630;

    .line 22
    .line 23
    if-eqz v0, :cond_5

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/j630;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/j630;

    .line 52
    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    move-object v0, p0

    .line 56
    :goto_3
    if-eqz v0, :cond_4

    .line 57
    .line 58
    instance-of v1, v0, La/drs;

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    check-cast v0, La/drs;

    .line 63
    .line 64
    invoke-interface {v0}, La/drs;->q()La/xhi;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v1, v2, La/j630;->a:La/mne;

    .line 69
    .line 70
    iget-object v3, v2, La/j630;->b:La/g2v;

    .line 71
    .line 72
    iget-object v4, v2, La/j630;->f:La/ii;

    .line 73
    .line 74
    iget-object v5, v2, La/j630;->c:La/duj;

    .line 75
    .line 76
    iget-object v6, v2, La/j630;->d:La/kt2;

    .line 77
    .line 78
    iget-object v2, v2, La/j630;->e:La/d1p;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v7, La/ywq0;

    .line 90
    .line 91
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object v0, v7, La/ywq0;->a:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v3, v7, La/ywq0;->b:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v5, v7, La/ywq0;->c:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v6, v7, La/ywq0;->d:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v2, v7, La/ywq0;->e:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v1, v7, La/ywq0;->f:Ljava/lang/Object;

    .line 105
    .line 106
    new-instance v0, La/rki;

    .line 107
    .line 108
    const/16 v1, 0x8

    .line 109
    .line 110
    invoke-direct {v0, v7, v1}, La/rki;-><init>(Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    iput-object v0, v7, La/ywq0;->g:Ljava/lang/Object;

    .line 114
    .line 115
    new-instance v0, La/wsz;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object v0, p0, La/i630;->b2:La/wsz;

    .line 121
    .line 122
    new-instance v0, La/fiu0;

    .line 123
    .line 124
    iget-object v1, v7, La/ywq0;->g:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, La/rki;

    .line 127
    .line 128
    const-class v2, La/f730;

    .line 129
    .line 130
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    iput-object v0, p0, La/i630;->c2:La/fiu0;

    .line 138
    .line 139
    iput-object v4, p0, La/i630;->d2:La/ii;

    .line 140
    .line 141
    return-void

    .line 142
    :cond_3
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    const-string p0, "Can\'t find feature provider!"

    .line 146
    .line 147
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_5
    const-string p0, "Cannot create dependency "

    .line 152
    .line 153
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final R0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, La/i630;->i2:La/vyx;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p1, La/vyx;

    .line 8
    .line 9
    iget-object v0, p0, La/i630;->h2:La/a8z;

    .line 10
    .line 11
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/xx6;

    .line 16
    .line 17
    invoke-direct {p1, v0}, La/vyx;-><init>(La/syx;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/i630;->i2:La/vyx;

    .line 21
    .line 22
    invoke-virtual {p0}, La/i630;->S0()La/zzq;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p0, p0, La/zzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, La/vyx;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, p1}, La/vyx;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iput-object p1, p0, La/i630;->i2:La/vyx;

    .line 39
    .line 40
    return-void
.end method

.method public final S0()La/zzq;
    .locals 2

    .line 1
    sget-object v0, La/i630;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/i630;->g2:La/nae0;

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
    check-cast p0, La/zzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final T0()La/f730;
    .locals 0

    .line 1
    iget-object p0, p0, La/i630;->f2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/f730;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/16 v0, 0x20

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/by5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/16 v0, 0x10

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
