.class public final La/e05;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/a4x;

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:La/xcz;

.field public final synthetic m:La/vne;

.field public final synthetic n:I

.field public final synthetic o:La/pz40;


# direct methods
.method public constructor <init>(La/a4x;ZZLa/xcz;La/vne;ILa/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/e05;->i:La/a4x;

    .line 2
    .line 3
    iput-boolean p2, p0, La/e05;->j:Z

    .line 4
    .line 5
    iput-boolean p3, p0, La/e05;->k:Z

    .line 6
    .line 7
    iput-object p4, p0, La/e05;->l:La/xcz;

    .line 8
    .line 9
    iput-object p5, p0, La/e05;->m:La/vne;

    .line 10
    .line 11
    iput p6, p0, La/e05;->n:I

    .line 12
    .line 13
    iput-object p7, p0, La/e05;->o:La/pz40;

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
    new-instance v0, La/e05;

    .line 2
    .line 3
    iget v6, p0, La/e05;->n:I

    .line 4
    .line 5
    iget-object v7, p0, La/e05;->o:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/e05;->i:La/a4x;

    .line 8
    .line 9
    iget-boolean v2, p0, La/e05;->j:Z

    .line 10
    .line 11
    iget-boolean v3, p0, La/e05;->k:Z

    .line 12
    .line 13
    iget-object v4, p0, La/e05;->l:La/xcz;

    .line 14
    .line 15
    iget-object v5, p0, La/e05;->m:La/vne;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, La/e05;-><init>(La/a4x;ZZLa/xcz;La/vne;ILa/pz40;La/yje;)V

    .line 19
    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, La/e05;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/e05;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/e05;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, La/e05;->i:La/a4x;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    move-object v5, v4

    .line 30
    check-cast v5, La/lxl;

    .line 31
    .line 32
    invoke-virtual {v5}, La/lxl;->b()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/4 v4, 0x0

    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    move-object v5, v3

    .line 58
    check-cast v5, La/lxl;

    .line 59
    .line 60
    iget-object v6, v0, La/e05;->o:La/pz40;

    .line 61
    .line 62
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v6, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move-object v3, v4

    .line 76
    :goto_1
    check-cast v3, La/lxl;

    .line 77
    .line 78
    const/4 v1, 0x3

    .line 79
    iget v9, v0, La/e05;->n:I

    .line 80
    .line 81
    iget-object v11, v0, La/e05;->m:La/vne;

    .line 82
    .line 83
    iget-object v7, v0, La/e05;->l:La/xcz;

    .line 84
    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const/4 v6, 0x0

    .line 92
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    const/4 v10, -0x1

    .line 97
    if-eqz v8, :cond_5

    .line 98
    .line 99
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    check-cast v8, La/lxl;

    .line 104
    .line 105
    iget-wide v13, v8, La/lxl;->a:J

    .line 106
    .line 107
    move-wide v15, v13

    .line 108
    const/16 p1, 0x0

    .line 109
    .line 110
    iget-wide v12, v3, La/lxl;->a:J

    .line 111
    .line 112
    cmp-long v8, v15, v12

    .line 113
    .line 114
    if-nez v8, :cond_4

    .line 115
    .line 116
    move v8, v6

    .line 117
    goto :goto_3

    .line 118
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    const/16 p1, 0x0

    .line 122
    .line 123
    move v8, v10

    .line 124
    :goto_3
    if-eq v8, v10, :cond_7

    .line 125
    .line 126
    new-instance v5, La/f05;

    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v6, 0x1

    .line 130
    invoke-direct/range {v5 .. v10}, La/f05;-><init>(ZLa/xcz;IILa/yje;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v11, v4, v4, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_6
    const/16 p1, 0x0

    .line 138
    .line 139
    :cond_7
    :goto_4
    iget-boolean v5, v0, La/e05;->j:Z

    .line 140
    .line 141
    if-eqz v5, :cond_8

    .line 142
    .line 143
    iget-boolean v0, v0, La/e05;->k:Z

    .line 144
    .line 145
    if-eqz v0, :cond_8

    .line 146
    .line 147
    if-nez v3, :cond_8

    .line 148
    .line 149
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_8

    .line 154
    .line 155
    new-instance v5, La/f05;

    .line 156
    .line 157
    const/4 v10, 0x0

    .line 158
    move/from16 v8, p1

    .line 159
    .line 160
    move/from16 v6, p1

    .line 161
    .line 162
    invoke-direct/range {v5 .. v10}, La/f05;-><init>(ZLa/xcz;IILa/yje;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v11, v4, v4, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 166
    .line 167
    .line 168
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object v0
.end method
