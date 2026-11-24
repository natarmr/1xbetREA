.class public final La/o77;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/r77;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/o77;",
        "La/nw5;",
        "La/r77;",
        "<init>",
        "()V",
        "a/kl5",
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
.field public static final k2:La/kl5;

.field public static final synthetic l2:[La/iiy;


# instance fields
.field public final e2:La/es;

.field public final f2:La/cgx0;

.field public final g2:La/phf0;

.field public final h2:La/phf0;

.field public final i2:La/yzn0;

.field public final j2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/o77;

    .line 4
    .line 5
    const-string v2, "betHistoryTypesList"

    .line 6
    .line 7
    const-string v3, "getBetHistoryTypesList()Ljava/util/List;"

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
    const-string v3, "hasHistoryHide"

    .line 16
    .line 17
    const-string v5, "getHasHistoryHide()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "totoName"

    .line 25
    .line 26
    const-string v6, "getTotoName()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "requestKey"

    .line 34
    .line 35
    const-string v7, "getRequestKey()Ljava/lang/String;"

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
    const-string v9, "getBinding()Lorg/xplatform/bethistory/impl/databinding/BetHistoryTypeDialogNewBinding;"

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
    sput-object v1, La/o77;->l2:[La/iiy;

    .line 79
    .line 80
    new-instance v0, La/kl5;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    sput-object v0, La/o77;->k2:La/kl5;

    .line 86
    .line 87
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/es;

    .line 5
    .line 6
    const-string v1, "BUNDLE_BET_HISTORY_TYPE_LIST"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/es;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/o77;->e2:La/es;

    .line 12
    .line 13
    new-instance v0, La/cgx0;

    .line 14
    .line 15
    const-string v1, "HIDE_HISTORY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/o77;->f2:La/cgx0;

    .line 21
    .line 22
    new-instance v0, La/phf0;

    .line 23
    .line 24
    const-string v1, "BUNDLE_TOTO_NAME"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/o77;->g2:La/phf0;

    .line 30
    .line 31
    new-instance v0, La/phf0;

    .line 32
    .line 33
    const-string v1, "BUNDLE_REQUEST_KEY"

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/o77;->h2:La/phf0;

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
    iput-object v0, p0, La/o77;->i2:La/yzn0;

    .line 48
    .line 49
    sget-object v0, La/n77;->a:La/n77;

    .line 50
    .line 51
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/o77;->j2:La/nae0;

    .line 56
    .line 57
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
    invoke-virtual {p0}, La/o77;->T0()La/r77;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final O0()V
    .locals 12

    .line 1
    sget-object v0, La/o77;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, La/o77;->e2:La/es;

    .line 7
    .line 8
    invoke-virtual {v3, p0, v2}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    move-object v6, v4

    .line 28
    check-cast v6, La/m77;

    .line 29
    .line 30
    iget-boolean v6, v6, La/m77;->b:Z

    .line 31
    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v4, v5

    .line 36
    :goto_0
    check-cast v4, La/m77;

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    iget-object v5, v4, La/m77;->a:La/s77;

    .line 41
    .line 42
    :cond_2
    const/16 v2, 0x8

    .line 43
    .line 44
    if-eqz v5, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0}, La/o77;->T0()La/r77;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object v4, v4, La/r77;->c:Landroid/widget/LinearLayout;

    .line 51
    .line 52
    sget-object v6, La/s77;->c:La/s77;

    .line 53
    .line 54
    if-ne v5, v6, :cond_3

    .line 55
    .line 56
    iget-object v5, p0, La/o77;->f2:La/cgx0;

    .line 57
    .line 58
    const/4 v6, 0x1

    .line 59
    aget-object v6, v0, v6

    .line 60
    .line 61
    invoke-virtual {v5, p0, v6}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    move v2, v1

    .line 72
    :cond_3
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/o77;->T0()La/r77;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iget-object v2, v2, La/r77;->c:Landroid/widget/LinearLayout;

    .line 80
    .line 81
    new-instance v4, La/os5;

    .line 82
    .line 83
    const/16 v5, 0x14

    .line 84
    .line 85
    invoke-direct {v4, p0, v5}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-virtual {p0}, La/o77;->T0()La/r77;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    iget-object v4, v4, La/r77;->e:Landroid/widget/TextView;

    .line 97
    .line 98
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    :goto_1
    new-instance v2, La/q77;

    .line 102
    .line 103
    aget-object v1, v0, v1

    .line 104
    .line 105
    invoke-virtual {v3, p0, v1}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const/4 v3, 0x2

    .line 110
    aget-object v3, v0, v3

    .line 111
    .line 112
    iget-object v4, p0, La/o77;->g2:La/phf0;

    .line 113
    .line 114
    invoke-virtual {v4, p0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    new-instance v4, La/ur6;

    .line 119
    .line 120
    const/4 v10, 0x0

    .line 121
    const/16 v11, 0x16

    .line 122
    .line 123
    const/4 v5, 0x1

    .line 124
    const-class v7, La/o77;

    .line 125
    .line 126
    const-string v8, "onItemClick"

    .line 127
    .line 128
    const-string v9, "onItemClick(Lorg/xplatform/bethistory/history/presentation/dialog/BetHistoryTypeData;)V"

    .line 129
    .line 130
    move-object v6, p0

    .line 131
    invoke-direct/range {v4 .. v11}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 132
    .line 133
    .line 134
    const/4 p0, 0x4

    .line 135
    aget-object p0, v0, p0

    .line 136
    .line 137
    iget-object v0, v6, La/o77;->i2:La/yzn0;

    .line 138
    .line 139
    invoke-virtual {v0, v6, p0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, La/sys0;

    .line 144
    .line 145
    invoke-direct {v2, v1, v3, v4, p0}, La/q77;-><init>(Ljava/util/List;Ljava/lang/String;La/ur6;La/sys0;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6}, La/o77;->T0()La/r77;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    iget-object p0, p0, La/r77;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 153
    .line 154
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 155
    .line 156
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6}, La/o77;->T0()La/r77;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    iget-object p0, p0, La/r77;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 171
    .line 172
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0c43

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
    const v0, 0x7f1309f2

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

.method public final T0()La/r77;
    .locals 2

    .line 1
    sget-object v0, La/o77;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/o77;->j2:La/nae0;

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
    check-cast p0, La/r77;

    .line 16
    .line 17
    return-object p0
.end method
