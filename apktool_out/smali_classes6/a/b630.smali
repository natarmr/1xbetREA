.class public final La/b630;
.super La/by5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/by5<",
        "La/yik;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/b630;",
        "La/by5;",
        "La/yik;",
        "<init>",
        "()V",
        "a/htz",
        "impl"
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
.field public static final m2:La/htz;

.field public static final synthetic n2:[La/iiy;


# instance fields
.field public b2:La/evz;

.field public c2:La/fiu0;

.field public d2:La/ii;

.field public final e2:I

.field public final f2:La/kiu0;

.field public final g2:La/phf0;

.field public final h2:La/r34;

.field public final i2:La/nae0;

.field public final j2:La/a8z;

.field public k2:La/vyx;

.field public final l2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/b630;

    .line 4
    .line 5
    const-string v2, "componentKey"

    .line 6
    .line 7
    const-string v3, "getComponentKey()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "subGameId"

    .line 16
    .line 17
    const-string v5, "getSubGameId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "binding"

    .line 25
    .line 26
    const-string v6, "getBinding()Lorg/xplatform/sportgame/markets/settings/impl/databinding/DialogMarketsSettingsBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/b630;->n2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/htz;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/b630;->m2:La/htz;

    .line 50
    .line 51
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
    iput v0, p0, La/b630;->e2:I

    .line 8
    .line 9
    new-instance v0, La/w530;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, La/w530;-><init>(La/b630;B)V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/pv10;

    .line 16
    .line 17
    const/16 v2, 0xd

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
    const/16 v4, 0xe

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
    const-class v3, La/e730;

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
    const/4 v5, 0x4

    .line 46
    invoke-direct {v4, v1, v5}, La/y620;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    new-instance v5, La/y620;

    .line 50
    .line 51
    const/4 v6, 0x5

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
    iput-object v0, p0, La/b630;->f2:La/kiu0;

    .line 60
    .line 61
    new-instance v0, La/phf0;

    .line 62
    .line 63
    const-string v1, "MARKET_SETTINGS_DIALOG_PARAMS_KEY"

    .line 64
    .line 65
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, La/b630;->g2:La/phf0;

    .line 69
    .line 70
    new-instance v0, La/r34;

    .line 71
    .line 72
    const-string v1, "MARKET_SETTINGS_DIALOG_SUB_GAME_ID_KEY"

    .line 73
    .line 74
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, La/b630;->h2:La/r34;

    .line 78
    .line 79
    sget-object v0, La/y530;->a:La/y530;

    .line 80
    .line 81
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/b630;->i2:La/nae0;

    .line 86
    .line 87
    new-instance v0, La/w530;

    .line 88
    .line 89
    const/4 v1, 0x1

    .line 90
    invoke-direct {v0, p0, v1}, La/w530;-><init>(La/b630;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, La/b630;->j2:La/a8z;

    .line 98
    .line 99
    new-instance v0, La/w530;

    .line 100
    .line 101
    const/4 v1, 0x2

    .line 102
    invoke-direct {v0, p0, v1}, La/w530;-><init>(La/b630;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, La/b630;->l2:La/a8z;

    .line 110
    .line 111
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
    const/4 v2, 0x0

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
    invoke-virtual {p0}, La/b630;->S0()La/yik;

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
    iget p0, p0, La/b630;->e2:I

    .line 2
    .line 3
    return p0
.end method

.method public final K0()V
    .locals 15

    .line 1
    new-instance v0, La/w530;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, La/w530;-><init>(La/b630;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/b630;->b2:La/evz;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    if-eqz v0, :cond_6

    .line 14
    .line 15
    invoke-virtual {p0}, La/b630;->S0()La/yik;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, La/b630;->T0()La/e730;

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
    const/4 v14, 0x7

    .line 27
    const/4 v8, 0x1

    .line 28
    const-class v10, La/b630;

    .line 29
    .line 30
    const-string v11, "applyTouchHelper"

    .line 31
    .line 32
    const-string v12, "applyTouchHelper(Z)V"

    .line 33
    .line 34
    move-object v9, p0

    .line 35
    invoke-direct/range {v7 .. v14}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    iget-object p0, v0, La/yik;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 39
    .line 40
    new-instance v3, La/l910;

    .line 41
    .line 42
    const/4 v4, 0x2

    .line 43
    invoke-direct {v3, v2, v4}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const v4, 0x7f0a0ce3

    .line 54
    .line 55
    .line 56
    invoke-interface {v3, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    invoke-interface {v3}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move-object v5, v6

    .line 68
    :goto_0
    instance-of v8, v5, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;

    .line 69
    .line 70
    if-eqz v8, :cond_1

    .line 71
    .line 72
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move-object v5, v6

    .line 76
    :goto_1
    if-eqz v5, :cond_2

    .line 77
    .line 78
    new-instance v8, La/km00;

    .line 79
    .line 80
    const/16 v10, 0x19

    .line 81
    .line 82
    invoke-direct {v8, v2, v10}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v8}, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;->setOnFocusChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    new-instance v8, La/kw20;

    .line 89
    .line 90
    const/4 v10, 0x1

    .line 91
    invoke-direct {v8, v2, v10}, La/kw20;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v3, v8}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    .line 95
    .line 96
    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    new-instance v8, La/ieu;

    .line 100
    .line 101
    const/16 v11, 0x1d

    .line 102
    .line 103
    invoke-direct {v8, v7, v2, v11}, La/ieu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v8}, Landroidx/appcompat/widget/d;->setOnQueryTextListener(La/hih0;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    if-eqz v5, :cond_4

    .line 110
    .line 111
    const v7, 0x7f1311c5

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v7}, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;->setText(I)V

    .line 115
    .line 116
    .line 117
    :cond_4
    if-eqz v5, :cond_5

    .line 118
    .line 119
    invoke-virtual {v5, v10}, Landroidx/appcompat/widget/d;->setIconifiedByDefault(Z)V

    .line 120
    .line 121
    .line 122
    :cond_5
    iget-object v0, v0, La/yik;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v7, La/iw20;

    .line 128
    .line 129
    invoke-direct {v7, v5}, La/iw20;-><init>(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object v5, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 133
    .line 134
    invoke-static {v0, v7}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-interface {p0, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    new-instance v0, La/kw20;

    .line 146
    .line 147
    const/4 v4, 0x0

    .line 148
    invoke-direct {v0, v2, v4}, La/kw20;-><init>(Ljava/lang/Object;B)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p0, v0}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    .line 152
    .line 153
    .line 154
    iget-object p0, v2, La/e730;->t:La/p7m0;

    .line 155
    .line 156
    new-instance v0, La/ow20;

    .line 157
    .line 158
    invoke-direct {v0, v3, v6, v4}, La/ow20;-><init>(Landroid/view/MenuItem;La/yje;B)V

    .line 159
    .line 160
    .line 161
    sget-object v2, La/lkz;->a:La/lkz;

    .line 162
    .line 163
    invoke-static {v9}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    new-instance v5, La/v620;

    .line 176
    .line 177
    invoke-direct {v5, p0, v2, v0, v6}, La/v620;-><init>(La/gmq;La/clz;La/ow20;La/yje;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v3, v6, v6, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9}, La/b630;->S0()La/yik;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    iget-object p0, p0, La/yik;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    iget-object v0, v9, La/b630;->l2:La/a8z;

    .line 190
    .line 191
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, La/t530;

    .line 196
    .line 197
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v9, v10}, La/b630;->R0(Z)V

    .line 201
    .line 202
    .line 203
    new-instance p0, La/x530;

    .line 204
    .line 205
    invoke-direct {p0, v9, v10}, La/x530;-><init>(La/b630;B)V

    .line 206
    .line 207
    .line 208
    const-string v0, "REQUEST_FILTER_DIALOG_KEY"

    .line 209
    .line 210
    invoke-static {v9, v0, p0}, La/sj3;->t0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v9}, La/b630;->T0()La/e730;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    iget-object p0, p0, La/e730;->u:La/p7m0;

    .line 218
    .line 219
    new-instance v0, La/w620;

    .line 220
    .line 221
    const/4 v2, 0x6

    .line 222
    invoke-direct {v0, v9, v6, v2}, La/w620;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 223
    .line 224
    .line 225
    invoke-static {v9}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    new-instance v5, La/mw20;

    .line 238
    .line 239
    invoke-direct {v5, p0, v2, v0, v6}, La/mw20;-><init>(La/gmq;La/clz;La/w620;La/yje;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v3, v6, v6, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v9}, La/b630;->T0()La/e730;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    iget-object p0, p0, La/e730;->r:La/qoj0;

    .line 250
    .line 251
    new-instance v0, La/z530;

    .line 252
    .line 253
    invoke-direct {v0, v9, v6, v4}, La/z530;-><init>(La/b630;La/yje;B)V

    .line 254
    .line 255
    .line 256
    invoke-static {v9}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    new-instance v4, La/mw20;

    .line 269
    .line 270
    invoke-direct {v4, p0, v2, v0, v6}, La/mw20;-><init>(La/gmq;La/clz;La/z530;La/yje;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v3, v6, v6, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9}, La/b630;->T0()La/e730;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    iget-object v3, p0, La/e730;->s:La/p7m0;

    .line 281
    .line 282
    new-instance v5, La/z530;

    .line 283
    .line 284
    invoke-direct {v5, v9, v6, v10}, La/z530;-><init>(La/b630;La/yje;B)V

    .line 285
    .line 286
    .line 287
    invoke-static {v9}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    new-instance v2, La/mw20;

    .line 300
    .line 301
    const/4 v7, 0x0

    .line 302
    invoke-direct/range {v2 .. v7}, La/mw20;-><init>(La/gmq;La/clz;La/z530;La/yje;B)V

    .line 303
    .line 304
    .line 305
    invoke-static {p0, v6, v6, v2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :cond_6
    const-string p0, "marketSettingsToolbarFragmentDelegate"

    .line 310
    .line 311
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v6
.end method

.method public final L0()V
    .locals 10

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
    const-class v1, La/c630;

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
    instance-of v3, v0, La/c630;

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
    check-cast v2, La/c630;

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
    instance-of v1, v0, La/ocl0;

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    check-cast v0, La/ocl0;

    .line 63
    .line 64
    new-instance v1, La/w530;

    .line 65
    .line 66
    const/4 v3, 0x4

    .line 67
    invoke-direct {v1, p0, v3}, La/w530;-><init>(La/b630;B)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, v1}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, v2, La/c630;->a:La/mne;

    .line 75
    .line 76
    iget-object v3, v2, La/c630;->b:La/sa10;

    .line 77
    .line 78
    iget-object v4, v2, La/c630;->c:La/duj;

    .line 79
    .line 80
    iget-object v5, v2, La/c630;->d:La/s31;

    .line 81
    .line 82
    iget-object v6, v2, La/c630;->f:La/kt2;

    .line 83
    .line 84
    iget-object v7, v2, La/c630;->e:La/ii;

    .line 85
    .line 86
    iget-object v8, v2, La/c630;->g:La/d1p;

    .line 87
    .line 88
    iget-object v2, v2, La/c630;->h:La/jw20;

    .line 89
    .line 90
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v9, La/g45;

    .line 103
    .line 104
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-object v0, v9, La/g45;->a:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v2, v9, La/g45;->b:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v3, v9, La/g45;->c:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v4, v9, La/g45;->d:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v5, v9, La/g45;->e:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v6, v9, La/g45;->f:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v8, v9, La/g45;->g:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v1, v9, La/g45;->h:Ljava/lang/Object;

    .line 122
    .line 123
    new-instance v0, La/rki;

    .line 124
    .line 125
    const/4 v1, 0x7

    .line 126
    invoke-direct {v0, v9, v1}, La/rki;-><init>(Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    iput-object v0, v9, La/g45;->i:Ljava/lang/Object;

    .line 130
    .line 131
    new-instance v0, La/evz;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v0, p0, La/b630;->b2:La/evz;

    .line 137
    .line 138
    new-instance v0, La/fiu0;

    .line 139
    .line 140
    iget-object v1, v9, La/g45;->i:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, La/rki;

    .line 143
    .line 144
    const-class v2, La/e730;

    .line 145
    .line 146
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 151
    .line 152
    .line 153
    iput-object v0, p0, La/b630;->c2:La/fiu0;

    .line 154
    .line 155
    iput-object v7, p0, La/b630;->d2:La/ii;

    .line 156
    .line 157
    return-void

    .line 158
    :cond_3
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_4
    const-string p0, "Can\'t find feature provider!"

    .line 162
    .line 163
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_5
    const-string p0, "Cannot create dependency "

    .line 168
    .line 169
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public final M0()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v1, v0, Landroid/view/View;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    check-cast v0, Landroid/view/View;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz v0, :cond_2

    .line 25
    .line 26
    new-instance v1, La/nr00;

    .line 27
    .line 28
    invoke-direct {v1, p0}, La/nr00;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 32
    .line 33
    invoke-static {v0, v1}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    return-void
.end method

.method public final R0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, La/b630;->k2:La/vyx;

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
    iget-object v0, p0, La/b630;->j2:La/a8z;

    .line 10
    .line 11
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/wx6;

    .line 16
    .line 17
    invoke-direct {p1, v0}, La/vyx;-><init>(La/syx;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/b630;->k2:La/vyx;

    .line 21
    .line 22
    invoke-virtual {p0}, La/b630;->S0()La/yik;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p0, p0, La/yik;->d:Landroidx/recyclerview/widget/RecyclerView;

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
    iput-object p1, p0, La/b630;->k2:La/vyx;

    .line 39
    .line 40
    return-void
.end method

.method public final S0()La/yik;
    .locals 2

    .line 1
    sget-object v0, La/b630;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/b630;->i2:La/nae0;

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
    check-cast p0, La/yik;

    .line 16
    .line 17
    return-object p0
.end method

.method public final T0()La/e730;
    .locals 0

    .line 1
    iget-object p0, p0, La/b630;->f2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/e730;

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
