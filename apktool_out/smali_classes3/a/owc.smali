.class public final La/owc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/rwc;

.field public final synthetic l:Z

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/rwc;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/owc;->k:La/rwc;

    .line 2
    .line 3
    iput-boolean p2, p0, La/owc;->l:Z

    .line 4
    .line 5
    iput p3, p0, La/owc;->m:I

    .line 6
    .line 7
    iput-object p4, p0, La/owc;->n:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p5, p0, La/owc;->o:Z

    .line 10
    .line 11
    iput-object p6, p0, La/owc;->p:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, La/owc;->q:Ljava/lang/String;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/owc;

    .line 2
    .line 3
    iget-object v6, p0, La/owc;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v7, p0, La/owc;->q:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/owc;->k:La/rwc;

    .line 8
    .line 9
    iget-boolean v2, p0, La/owc;->l:Z

    .line 10
    .line 11
    iget v3, p0, La/owc;->m:I

    .line 12
    .line 13
    iget-object v4, p0, La/owc;->n:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v5, p0, La/owc;->o:Z

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, La/owc;-><init>(La/rwc;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/yje;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/owc;->j:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/owc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/owc;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/owc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/owc;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/vne;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/owc;->i:B

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x2

    .line 13
    const/4 v6, 0x1

    .line 14
    iget-object v7, v0, La/owc;->k:La/rwc;

    .line 15
    .line 16
    if-eqz v3, :cond_2

    .line 17
    .line 18
    if-eq v3, v6, :cond_1

    .line 19
    .line 20
    if-ne v3, v5, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v4

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v0, p1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v3, v7, La/rwc;->d:La/up70;

    .line 44
    .line 45
    const-string v8, "GET_CMS_BANNER_CATEGORIES"

    .line 46
    .line 47
    invoke-virtual {v3, v8}, La/up70;->c(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    iget-object v10, v0, La/owc;->k:La/rwc;

    .line 52
    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    iget-object v1, v10, La/rwc;->d:La/up70;

    .line 56
    .line 57
    iput-object v4, v0, La/owc;->j:Ljava/lang/Object;

    .line 58
    .line 59
    iput-byte v6, v0, La/owc;->i:B

    .line 60
    .line 61
    invoke-virtual {v1, v8, v0}, La/up70;->a(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-ne v0, v2, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_0
    check-cast v0, Ljava/util/List;

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_4
    new-instance v9, La/nwc;

    .line 72
    .line 73
    iget-object v3, v0, La/owc;->q:Ljava/lang/String;

    .line 74
    .line 75
    const/16 v17, 0x0

    .line 76
    .line 77
    iget-boolean v11, v0, La/owc;->l:Z

    .line 78
    .line 79
    iget v12, v0, La/owc;->m:I

    .line 80
    .line 81
    iget-object v13, v0, La/owc;->n:Ljava/lang/String;

    .line 82
    .line 83
    iget-boolean v14, v0, La/owc;->o:Z

    .line 84
    .line 85
    iget-object v15, v0, La/owc;->p:Ljava/lang/String;

    .line 86
    .line 87
    move-object/from16 v16, v3

    .line 88
    .line 89
    invoke-direct/range {v9 .. v17}, La/nwc;-><init>(La/rwc;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/yje;)V

    .line 90
    .line 91
    .line 92
    const/4 v3, 0x3

    .line 93
    invoke-static {v1, v4, v9, v3}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object v3, v7, La/rwc;->d:La/up70;

    .line 98
    .line 99
    iget-object v3, v3, La/up70;->a:Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    invoke-interface {v3, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    new-instance v3, La/mwc;

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    invoke-direct {v3, v7, v6}, La/mwc;-><init>(La/rwc;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v3}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 111
    .line 112
    .line 113
    iput-object v4, v0, La/owc;->j:Ljava/lang/Object;

    .line 114
    .line 115
    iput-byte v5, v0, La/owc;->i:B

    .line 116
    .line 117
    invoke-virtual {v1, v0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-ne v0, v2, :cond_5

    .line 122
    .line 123
    :goto_1
    return-object v2

    .line 124
    :cond_5
    :goto_2
    check-cast v0, Ljava/util/List;

    .line 125
    .line 126
    iget-object v1, v7, La/rwc;->c:La/nhf0;

    .line 127
    .line 128
    new-instance v2, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_6

    .line 142
    .line 143
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    check-cast v4, La/awc;

    .line 148
    .line 149
    iget-object v4, v4, La/awc;->c:Ljava/util/List;

    .line 150
    .line 151
    invoke-static {v2, v4}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_6
    iget-object v1, v1, La/nhf0;->d:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 163
    .line 164
    .line 165
    return-object v0
.end method
