.class public final La/y3w;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/qa7;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/y3w;",
        "La/nw5;",
        "La/qa7;",
        "<init>",
        "()V",
        "a/sqt",
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
.field public static final n2:La/sqt;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final e2:La/phf0;

.field public final f2:La/yzn0;

.field public final g2:La/cgx0;

.field public final h2:La/cgx0;

.field public final i2:La/yzn0;

.field public j2:La/fiu0;

.field public final k2:La/kiu0;

.field public final l2:La/nae0;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/y3w;

    .line 4
    .line 5
    const-string v2, "requestKey"

    .line 6
    .line 7
    const-string v3, "getRequestKey()Ljava/lang/String;"

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
    const-string v3, "historyItem"

    .line 16
    .line 17
    const-string v5, "getHistoryItem()Lorg/xplatform/bethistory/domain/model/HistoryItemModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "isBonusBalance"

    .line 25
    .line 26
    const-string v6, "isBonusBalance()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "hideEdit"

    .line 34
    .line 35
    const-string v7, "getHideEdit()Z"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "typeHistoryScreen"

    .line 43
    .line 44
    const-string v8, "getTypeHistoryScreen()Lorg/xplatform/bethistory/domain/model/TypeHistoryScreen;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/j0d0;

    .line 50
    .line 51
    const-string v8, "binding"

    .line 52
    .line 53
    const-string v9, "getBinding()Lorg/xplatform/bethistory/impl/databinding/BetInfoDialogBinding;"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x6

    .line 59
    new-array v1, v1, [La/iiy;

    .line 60
    .line 61
    aput-object v0, v1, v4

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    aput-object v2, v1, v0

    .line 65
    .line 66
    const/4 v0, 0x2

    .line 67
    aput-object v3, v1, v0

    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    aput-object v5, v1, v0

    .line 71
    .line 72
    const/4 v0, 0x4

    .line 73
    aput-object v6, v1, v0

    .line 74
    .line 75
    const/4 v0, 0x5

    .line 76
    aput-object v7, v1, v0

    .line 77
    .line 78
    sput-object v1, La/y3w;->o2:[La/iiy;

    .line 79
    .line 80
    new-instance v0, La/sqt;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    sput-object v0, La/y3w;->n2:La/sqt;

    .line 86
    .line 87
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/y3w;->e2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/yzn0;

    .line 14
    .line 15
    const-string v1, "BUNDLE_HISTORY_ITEM"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/y3w;->f2:La/yzn0;

    .line 21
    .line 22
    new-instance v0, La/cgx0;

    .line 23
    .line 24
    const-string v1, "BUNDLE_IS_BONUS_BALANCE"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/y3w;->g2:La/cgx0;

    .line 30
    .line 31
    new-instance v0, La/cgx0;

    .line 32
    .line 33
    const-string v1, "BUNDLE_HIDE_EDIT"

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/y3w;->h2:La/cgx0;

    .line 39
    .line 40
    new-instance v0, La/yzn0;

    .line 41
    .line 42
    const-string v1, "TYPE_HISTORY_SCREEN"

    .line 43
    .line 44
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, La/y3w;->i2:La/yzn0;

    .line 48
    .line 49
    new-instance v0, La/v3w;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, p0, v1}, La/v3w;-><init>(La/y3w;B)V

    .line 53
    .line 54
    .line 55
    new-instance v1, La/t7t;

    .line 56
    .line 57
    const/16 v2, 0x1a

    .line 58
    .line 59
    invoke-direct {v1, p0, v2}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    sget-object v2, La/wez;->b:La/wez;

    .line 63
    .line 64
    new-instance v3, La/t7t;

    .line 65
    .line 66
    const/16 v4, 0x1b

    .line 67
    .line 68
    invoke-direct {v3, v1, v4}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const-class v3, La/b4w;

    .line 76
    .line 77
    sget-object v4, La/sre0;->a:La/tre0;

    .line 78
    .line 79
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    new-instance v4, La/qwv;

    .line 84
    .line 85
    const/16 v5, 0xa

    .line 86
    .line 87
    invoke-direct {v4, v1, v5}, La/qwv;-><init>(La/a8z;B)V

    .line 88
    .line 89
    .line 90
    new-instance v5, La/qwv;

    .line 91
    .line 92
    const/16 v6, 0xb

    .line 93
    .line 94
    invoke-direct {v5, v1, v6}, La/qwv;-><init>(La/a8z;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, La/y3w;->k2:La/kiu0;

    .line 102
    .line 103
    sget-object v0, La/w3w;->a:La/w3w;

    .line 104
    .line 105
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, La/y3w;->l2:La/nae0;

    .line 110
    .line 111
    new-instance v0, La/v3w;

    .line 112
    .line 113
    const/4 v1, 0x1

    .line 114
    invoke-direct {v0, p0, v1}, La/v3w;-><init>(La/y3w;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iput-object v0, p0, La/y3w;->m2:La/a8z;

    .line 122
    .line 123
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
    invoke-virtual {p0}, La/y3w;->T0()La/qa7;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final O0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/y3w;->T0()La/qa7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/qa7;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/y3w;->T0()La/qa7;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, La/qa7;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    new-instance v1, La/vwk;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const v3, 0x7f080dc6

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v2}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const v4, 0x7f0706f8

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-direct {v1, v2, v3}, La/vwk;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, La/y3w;->T0()La/qa7;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v0, v0, La/qa7;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    iget-object v1, p0, La/y3w;->m2:La/a8z;

    .line 62
    .line 63
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, La/z3w;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, La/y3w;->k2:La/kiu0;

    .line 73
    .line 74
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, La/b4w;

    .line 79
    .line 80
    iget-object v1, v1, La/b4w;->g:La/p7m0;

    .line 81
    .line 82
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v2, La/x3w;

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    const/4 v4, 0x0

    .line 90
    invoke-direct {v2, p0, v4, v3}, La/x3w;-><init>(La/y3w;La/yje;B)V

    .line 91
    .line 92
    .line 93
    sget-object v3, La/lkz;->a:La/lkz;

    .line 94
    .line 95
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    new-instance v6, La/r1w;

    .line 108
    .line 109
    invoke-direct {v6, v1, v3, v2, v4}, La/r1w;-><init>(La/xae0;La/clz;La/x3w;La/yje;)V

    .line 110
    .line 111
    .line 112
    const/4 v1, 0x3

    .line 113
    invoke-static {v5, v4, v4, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/b4w;

    .line 121
    .line 122
    iget-object v0, v0, La/b4w;->h:La/qoj0;

    .line 123
    .line 124
    invoke-static {v0}, La/vtb;->M(La/mz40;)La/vae0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    new-instance v2, La/x3w;

    .line 129
    .line 130
    const/4 v3, 0x1

    .line 131
    invoke-direct {v2, p0, v4, v3}, La/x3w;-><init>(La/y3w;La/yje;B)V

    .line 132
    .line 133
    .line 134
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    new-instance v5, La/r1w;

    .line 147
    .line 148
    invoke-direct {v5, v0, p0, v2, v4}, La/r1w;-><init>(La/vae0;La/clz;La/x3w;La/yje;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v3, v4, v4, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final P0()V
    .locals 9

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
    const-class v1, La/u3w;

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
    instance-of v3, v0, La/u3w;

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
    check-cast v2, La/u3w;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    sget-object v1, La/y3w;->o2:[La/iiy;

    .line 57
    .line 58
    aget-object v0, v1, v0

    .line 59
    .line 60
    iget-object v3, p0, La/y3w;->f2:La/yzn0;

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v6, v0

    .line 67
    check-cast v6, La/n3w;

    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    aget-object v0, v1, v0

    .line 71
    .line 72
    iget-object v3, p0, La/y3w;->h2:La/cgx0;

    .line 73
    .line 74
    invoke-virtual {v3, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    const/4 v0, 0x2

    .line 79
    aget-object v0, v1, v0

    .line 80
    .line 81
    iget-object v3, p0, La/y3w;->g2:La/cgx0;

    .line 82
    .line 83
    invoke-virtual {v3, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    const/4 v0, 0x4

    .line 88
    aget-object v0, v1, v0

    .line 89
    .line 90
    iget-object v1, p0, La/y3w;->i2:La/yzn0;

    .line 91
    .line 92
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    move-object v5, v0

    .line 97
    check-cast v5, La/sys0;

    .line 98
    .line 99
    iget-object v0, v2, La/u3w;->a:La/fsd;

    .line 100
    .line 101
    iget-object v4, v2, La/u3w;->b:La/iw20;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v3, La/uii;

    .line 107
    .line 108
    invoke-direct/range {v3 .. v8}, La/uii;-><init>(La/iw20;La/sys0;La/n3w;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 109
    .line 110
    .line 111
    new-instance v0, La/fiu0;

    .line 112
    .line 113
    iget-object v1, v3, La/uii;->f:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v1, La/tii;

    .line 116
    .line 117
    const-class v2, La/b4w;

    .line 118
    .line 119
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, La/y3w;->j2:La/fiu0;

    .line 127
    .line 128
    return-void

    .line 129
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 130
    .line 131
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
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
    const v0, 0x7f131226

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

.method public final T0()La/qa7;
    .locals 2

    .line 1
    sget-object v0, La/y3w;->o2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/y3w;->l2:La/nae0;

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
    check-cast p0, La/qa7;

    .line 16
    .line 17
    return-object p0
.end method
