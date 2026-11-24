.class public final La/x6w;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/c1w;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/x6w;",
        "La/nw5;",
        "La/c1w;",
        "<init>",
        "()V",
        "a/art",
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
.field public static final k2:La/art;

.field public static final synthetic l2:[La/iiy;


# instance fields
.field public e2:La/fiu0;

.field public final f2:La/kiu0;

.field public final g2:La/nae0;

.field public final h2:La/a8z;

.field public final i2:La/yzn0;

.field public final j2:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/x6w;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bethistory/impl/databinding/HistoryFilterDialogBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "historyType"

    .line 16
    .line 17
    const-string v5, "getHistoryType()Lorg/xplatform/bethistory/domain/model/BetHistoryTypeModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "typeHistoryScreen"

    .line 25
    .line 26
    const-string v6, "getTypeHistoryScreen()Lorg/xplatform/bethistory/domain/model/TypeHistoryScreen;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/x6w;->l2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/art;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/x6w;->k2:La/art;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/t6w;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/t6w;-><init>(La/x6w;B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/t7t;

    .line 11
    .line 12
    const/16 v2, 0x1c

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/wez;->b:La/wez;

    .line 18
    .line 19
    new-instance v3, La/t7t;

    .line 20
    .line 21
    const/16 v4, 0x1d

    .line 22
    .line 23
    invoke-direct {v3, v1, v4}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-class v3, La/wnm0;

    .line 31
    .line 32
    sget-object v4, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v4, La/qwv;

    .line 39
    .line 40
    const/16 v5, 0xc

    .line 41
    .line 42
    invoke-direct {v4, v1, v5}, La/qwv;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v5, La/qwv;

    .line 46
    .line 47
    const/16 v6, 0xd

    .line 48
    .line 49
    invoke-direct {v5, v1, v6}, La/qwv;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/x6w;->f2:La/kiu0;

    .line 57
    .line 58
    sget-object v0, La/u6w;->a:La/u6w;

    .line 59
    .line 60
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/x6w;->g2:La/nae0;

    .line 65
    .line 66
    new-instance v0, La/t6w;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-direct {v0, p0, v1}, La/t6w;-><init>(La/x6w;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/x6w;->h2:La/a8z;

    .line 77
    .line 78
    new-instance v0, La/yzn0;

    .line 79
    .line 80
    const-string v1, "EXTRA_BET_HISTORY_TYPE"

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, La/x6w;->i2:La/yzn0;

    .line 86
    .line 87
    new-instance v0, La/yzn0;

    .line 88
    .line 89
    const-string v1, "TYPE_HISTORY_SCREEN"

    .line 90
    .line 91
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, La/x6w;->j2:La/yzn0;

    .line 95
    .line 96
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
    invoke-virtual {p0}, La/x6w;->T0()La/c1w;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final O0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/x6w;->T0()La/c1w;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/c1w;->b:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    new-instance v1, La/q10;

    .line 8
    .line 9
    const/16 v2, 0x18

    .line 10
    .line 11
    invoke-direct {v1, p0, v2}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/x6w;->T0()La/c1w;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, La/c1w;->c:La/jk3;

    .line 22
    .line 23
    iget-object v1, v0, La/jk3;->d:Landroid/view/View;

    .line 24
    .line 25
    check-cast v1, Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const v3, 0x7f1300e4

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, La/jk3;->c:Landroid/view/View;

    .line 42
    .line 43
    check-cast v1, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;

    .line 44
    .line 45
    new-instance v2, La/wg;

    .line 46
    .line 47
    const/16 v3, 0x1a

    .line 48
    .line 49
    invoke-direct {v2, p0, v0, v3}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, v0, La/jk3;->f:Landroid/view/View;

    .line 56
    .line 57
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 58
    .line 59
    new-instance v2, La/q10;

    .line 60
    .line 61
    const/16 v3, 0x19

    .line 62
    .line 63
    invoke-direct {v2, v0, v3}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, La/x6w;->T0()La/c1w;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v0, v0, La/c1w;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 74
    .line 75
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, La/x6w;->T0()La/c1w;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v0, v0, La/c1w;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 92
    .line 93
    iget-object v1, p0, La/x6w;->h2:La/a8z;

    .line 94
    .line 95
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, La/y6w;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, La/x6w;->U0()La/wnm0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v0, v0, La/wnm0;->k:La/p7m0;

    .line 109
    .line 110
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    new-instance v1, La/w6w;

    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    invoke-direct {v1, p0, v7, v2}, La/w6w;-><init>(La/x6w;La/yje;B)V

    .line 119
    .line 120
    .line 121
    sget-object v2, La/lkz;->a:La/lkz;

    .line 122
    .line 123
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    new-instance v4, La/r1w;

    .line 136
    .line 137
    invoke-direct {v4, v0, v2, v1, v7}, La/r1w;-><init>(La/xae0;La/clz;La/w6w;La/yje;)V

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x3

    .line 141
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, La/x6w;->U0()La/wnm0;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-object v1, v1, La/wnm0;->j:La/p7m0;

    .line 149
    .line 150
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    new-instance v6, La/w6w;

    .line 155
    .line 156
    const/4 v1, 0x1

    .line 157
    invoke-direct {v6, p0, v7, v1}, La/w6w;-><init>(La/x6w;La/yje;B)V

    .line 158
    .line 159
    .line 160
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    new-instance v3, La/r1w;

    .line 173
    .line 174
    const/4 v8, 0x0

    .line 175
    invoke-direct/range {v3 .. v8}, La/r1w;-><init>(La/xae0;La/clz;La/w6w;La/yje;B)V

    .line 176
    .line 177
    .line 178
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, La/x6w;->U0()La/wnm0;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    iget-object v1, v1, La/wnm0;->l:La/qoj0;

    .line 186
    .line 187
    invoke-static {v1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    new-instance v2, La/w6w;

    .line 192
    .line 193
    const/4 v3, 0x2

    .line 194
    invoke-direct {v2, p0, v7, v3}, La/w6w;-><init>(La/x6w;La/yje;B)V

    .line 195
    .line 196
    .line 197
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    new-instance v4, La/r1w;

    .line 210
    .line 211
    invoke-direct {v4, v1, p0, v2, v7}, La/r1w;-><init>(La/vae0;La/clz;La/w6w;La/yje;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 215
    .line 216
    .line 217
    return-void
.end method

.method public final P0()V
    .locals 5

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
    const-class v1, La/rnm0;

    .line 22
    .line 23
    if-eqz v0, :cond_3

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
    instance-of v3, v0, La/rnm0;

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
    check-cast v2, La/rnm0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    sget-object v1, La/x6w;->l2:[La/iiy;

    .line 57
    .line 58
    aget-object v0, v1, v0

    .line 59
    .line 60
    iget-object v3, p0, La/x6w;->i2:La/yzn0;

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/s77;

    .line 67
    .line 68
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const/4 v4, 0x2

    .line 73
    aget-object v1, v1, v4

    .line 74
    .line 75
    iget-object v4, p0, La/x6w;->j2:La/yzn0;

    .line 76
    .line 77
    invoke-virtual {v4, p0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, La/sys0;

    .line 82
    .line 83
    invoke-virtual {v2, v0, v3, v1}, La/rnm0;->a(La/s77;La/i1w0;La/sys0;)La/ru;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, La/ru;->y()La/fiu0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, La/x6w;->e2:La/fiu0;

    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 95
    .line 96
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0b09

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f130245

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final T0()La/c1w;
    .locals 2

    .line 1
    sget-object v0, La/x6w;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/x6w;->g2:La/nae0;

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
    check-cast p0, La/c1w;

    .line 16
    .line 17
    return-object p0
.end method

.method public final U0()La/wnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/x6w;->f2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wnm0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/nw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, La/yae;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-direct {p1, p0, p2}, La/yae;-><init>(Landroid/app/Dialog;B)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
