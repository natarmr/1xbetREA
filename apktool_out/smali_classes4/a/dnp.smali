.class public final La/dnp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/nnp;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:Z

.field public final synthetic o:Z

.field public p:La/kmq;

.field public q:La/zmb;

.field public r:La/nnp;


# direct methods
.method public constructor <init>(La/yje;La/nnp;Ljava/util/List;ZZ)V
    .locals 0

    .line 1
    iput-object p2, p0, La/dnp;->l:La/nnp;

    .line 2
    .line 3
    iput-object p3, p0, La/dnp;->m:Ljava/util/List;

    .line 4
    .line 5
    iput-boolean p4, p0, La/dnp;->n:Z

    .line 6
    .line 7
    iput-boolean p5, p0, La/dnp;->o:Z

    .line 8
    .line 9
    const/4 p2, 0x3

    .line 10
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/dnp;

    .line 7
    .line 8
    iget-boolean v4, p0, La/dnp;->n:Z

    .line 9
    .line 10
    iget-boolean v5, p0, La/dnp;->o:Z

    .line 11
    .line 12
    iget-object v2, p0, La/dnp;->l:La/nnp;

    .line 13
    .line 14
    iget-object v3, p0, La/dnp;->m:Ljava/util/List;

    .line 15
    .line 16
    invoke-direct/range {v0 .. v5}, La/dnp;-><init>(La/yje;La/nnp;Ljava/util/List;ZZ)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/dnp;->j:La/kmq;

    .line 20
    .line 21
    iput-object p2, v0, La/dnp;->k:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, La/dnp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/dnp;->i:B

    .line 6
    .line 7
    iget-object v5, v0, La/dnp;->l:La/nnp;

    .line 8
    .line 9
    const/4 v9, 0x2

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v10, 0x0

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    if-ne v2, v9, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v10

    .line 29
    :cond_1
    iget-object v2, v0, La/dnp;->r:La/nnp;

    .line 30
    .line 31
    iget-object v3, v0, La/dnp;->q:La/zmb;

    .line 32
    .line 33
    iget-object v4, v0, La/dnp;->p:La/kmq;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v7, v3

    .line 39
    move-object v3, v2

    .line 40
    move-object/from16 v2, p1

    .line 41
    .line 42
    :goto_0
    move-object v11, v4

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v4, v0, La/dnp;->j:La/kmq;

    .line 48
    .line 49
    iget-object v2, v0, La/dnp;->k:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v14, v2

    .line 52
    check-cast v14, La/zmb;

    .line 53
    .line 54
    iget-object v12, v5, La/nnp;->p:La/tzi;

    .line 55
    .line 56
    iget-object v2, v5, La/nnp;->T:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;

    .line 57
    .line 58
    iget-object v13, v2, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->b:La/j700;

    .line 59
    .line 60
    iget-object v6, v2, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->a:Ljava/util/List;

    .line 61
    .line 62
    iget-object v7, v2, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->c:Ljava/util/Set;

    .line 63
    .line 64
    iget-boolean v2, v2, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsScreenParams;->e:Z

    .line 65
    .line 66
    iput-object v10, v0, La/dnp;->j:La/kmq;

    .line 67
    .line 68
    iput-object v10, v0, La/dnp;->k:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v4, v0, La/dnp;->p:La/kmq;

    .line 71
    .line 72
    iput-object v14, v0, La/dnp;->q:La/zmb;

    .line 73
    .line 74
    iput-object v5, v0, La/dnp;->r:La/nnp;

    .line 75
    .line 76
    iput-byte v3, v0, La/dnp;->i:B

    .line 77
    .line 78
    iget-object v3, v12, La/tzi;->f:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, La/mne;

    .line 81
    .line 82
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 83
    .line 84
    new-instance v11, La/c43;

    .line 85
    .line 86
    const/16 v19, 0x0

    .line 87
    .line 88
    iget-object v15, v0, La/dnp;->m:Ljava/util/List;

    .line 89
    .line 90
    move/from16 v18, v2

    .line 91
    .line 92
    move-object/from16 v16, v6

    .line 93
    .line 94
    move-object/from16 v17, v7

    .line 95
    .line 96
    invoke-direct/range {v11 .. v19}, La/c43;-><init>(La/tzi;La/j700;La/zmb;Ljava/util/List;Ljava/util/List;Ljava/util/Set;ZLa/yje;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v3, v11, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-ne v2, v1, :cond_3

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_3
    move-object v3, v5

    .line 107
    move-object v7, v14

    .line 108
    goto :goto_0

    .line 109
    :goto_1
    check-cast v2, La/gmq;

    .line 110
    .line 111
    new-instance v4, La/cnp;

    .line 112
    .line 113
    iget-boolean v6, v0, La/dnp;->n:Z

    .line 114
    .line 115
    invoke-direct {v4, v5, v6, v10}, La/cnp;-><init>(La/nnp;ZLa/yje;)V

    .line 116
    .line 117
    .line 118
    new-instance v6, La/fnq;

    .line 119
    .line 120
    invoke-direct {v6, v2, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 121
    .line 122
    .line 123
    sget v2, La/nnp;->a0:I

    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v2, La/a1g;

    .line 129
    .line 130
    const/16 v4, 0x11

    .line 131
    .line 132
    invoke-direct {v2, v6, v3, v4}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    new-instance v3, La/ic1;

    .line 136
    .line 137
    iget-object v6, v0, La/dnp;->m:Ljava/util/List;

    .line 138
    .line 139
    const/4 v8, 0x0

    .line 140
    iget-boolean v4, v0, La/dnp;->o:Z

    .line 141
    .line 142
    invoke-direct/range {v3 .. v8}, La/ic1;-><init>(ZLa/nnp;Ljava/util/List;La/zmb;La/yje;)V

    .line 143
    .line 144
    .line 145
    iput-object v10, v0, La/dnp;->j:La/kmq;

    .line 146
    .line 147
    iput-object v10, v0, La/dnp;->k:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v10, v0, La/dnp;->p:La/kmq;

    .line 150
    .line 151
    iput-object v10, v0, La/dnp;->q:La/zmb;

    .line 152
    .line 153
    iput-object v10, v0, La/dnp;->r:La/nnp;

    .line 154
    .line 155
    iput-byte v9, v0, La/dnp;->i:B

    .line 156
    .line 157
    invoke-static {v11}, La/f7k;->J(La/kmq;)V

    .line 158
    .line 159
    .line 160
    new-instance v4, La/vnq;

    .line 161
    .line 162
    invoke-direct {v4, v11, v3, v9}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 163
    .line 164
    .line 165
    new-instance v3, La/kie0;

    .line 166
    .line 167
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    new-instance v5, La/xj9;

    .line 171
    .line 172
    invoke-direct {v5, v4, v3}, La/xj9;-><init>(La/kmq;La/kie0;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v5, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-ne v0, v1, :cond_4

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    :goto_2
    if-ne v0, v1, :cond_5

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    :goto_3
    if-ne v0, v1, :cond_6

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    :goto_4
    if-ne v0, v1, :cond_7

    .line 195
    .line 196
    :goto_5
    return-object v1

    .line 197
    :cond_7
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object v0
.end method
