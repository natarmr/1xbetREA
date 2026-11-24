.class public final La/gcc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/a4x;

.field public final synthetic k:La/xcz;

.field public final synthetic l:I

.field public final synthetic m:La/w6k;

.field public final synthetic n:La/k6z;

.field public final synthetic o:La/hh80;

.field public final synthetic p:La/tyl;

.field public final synthetic q:La/vne;

.field public final synthetic r:La/pz40;


# direct methods
.method public constructor <init>(La/a4x;La/xcz;ILa/w6k;La/k6z;La/hh80;La/tyl;La/vne;La/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gcc;->j:La/a4x;

    .line 2
    .line 3
    iput-object p2, p0, La/gcc;->k:La/xcz;

    .line 4
    .line 5
    iput p3, p0, La/gcc;->l:I

    .line 6
    .line 7
    iput-object p4, p0, La/gcc;->m:La/w6k;

    .line 8
    .line 9
    iput-object p5, p0, La/gcc;->n:La/k6z;

    .line 10
    .line 11
    iput-object p6, p0, La/gcc;->o:La/hh80;

    .line 12
    .line 13
    iput-object p7, p0, La/gcc;->p:La/tyl;

    .line 14
    .line 15
    iput-object p8, p0, La/gcc;->q:La/vne;

    .line 16
    .line 17
    iput-object p9, p0, La/gcc;->r:La/pz40;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    new-instance v0, La/gcc;

    .line 2
    .line 3
    iget-object v8, p0, La/gcc;->q:La/vne;

    .line 4
    .line 5
    iget-object v9, p0, La/gcc;->r:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/gcc;->j:La/a4x;

    .line 8
    .line 9
    iget-object v2, p0, La/gcc;->k:La/xcz;

    .line 10
    .line 11
    iget v3, p0, La/gcc;->l:I

    .line 12
    .line 13
    iget-object v4, p0, La/gcc;->m:La/w6k;

    .line 14
    .line 15
    iget-object v5, p0, La/gcc;->n:La/k6z;

    .line 16
    .line 17
    iget-object v6, p0, La/gcc;->o:La/hh80;

    .line 18
    .line 19
    iget-object v7, p0, La/gcc;->p:La/tyl;

    .line 20
    .line 21
    move-object v10, p2

    .line 22
    invoke-direct/range {v0 .. v10}, La/gcc;-><init>(La/a4x;La/xcz;ILa/w6k;La/k6z;La/hh80;La/tyl;La/vne;La/pz40;La/yje;)V

    .line 23
    .line 24
    .line 25
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
    invoke-virtual {p0, p1, p2}, La/gcc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/gcc;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/gcc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    sget-object v9, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v0, v8, La/gcc;->i:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v8, La/gcc;->j:La/a4x;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const/4 v4, 0x0

    .line 34
    move v5, v4

    .line 35
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const/4 v7, -0x1

    .line 40
    if-eqz v6, :cond_3

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    check-cast v6, La/lxl;

    .line 47
    .line 48
    invoke-virtual {v6}, La/lxl;->b()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    move v12, v5

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    move v12, v7

    .line 60
    :goto_1
    if-ne v12, v7, :cond_4

    .line 61
    .line 62
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_4
    sget-object v3, La/lcc;->a:La/uts0;

    .line 66
    .line 67
    iget-object v3, v8, La/gcc;->r:La/pz40;

    .line 68
    .line 69
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    iget-object v6, v8, La/gcc;->o:La/hh80;

    .line 80
    .line 81
    if-nez v5, :cond_6

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    sub-int/2addr v0, v2

    .line 88
    if-ne v12, v0, :cond_5

    .line 89
    .line 90
    move v4, v2

    .line 91
    :cond_5
    new-instance v7, La/xx;

    .line 92
    .line 93
    const/16 v0, 0x16

    .line 94
    .line 95
    invoke-direct {v7, v3, v0}, La/xx;-><init>(La/pz40;B)V

    .line 96
    .line 97
    .line 98
    iput-boolean v2, v8, La/gcc;->i:Z

    .line 99
    .line 100
    iget-object v0, v8, La/gcc;->k:La/xcz;

    .line 101
    .line 102
    iget v3, v8, La/gcc;->l:I

    .line 103
    .line 104
    move v2, v4

    .line 105
    iget-object v4, v8, La/gcc;->m:La/w6k;

    .line 106
    .line 107
    iget-object v5, v8, La/gcc;->n:La/k6z;

    .line 108
    .line 109
    move v1, v12

    .line 110
    invoke-static/range {v0 .. v8}, La/lcc;->f(La/xcz;IZILa/w6k;La/k6z;La/hh80;La/xx;La/zje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-ne v0, v9, :cond_a

    .line 115
    .line 116
    return-object v9

    .line 117
    :cond_6
    move-object/from16 v16, v6

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    sub-int/2addr v0, v2

    .line 124
    if-ne v12, v0, :cond_7

    .line 125
    .line 126
    move v15, v2

    .line 127
    goto :goto_2

    .line 128
    :cond_7
    move v15, v4

    .line 129
    :goto_2
    iget-object v0, v8, La/gcc;->p:La/tyl;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_a

    .line 136
    .line 137
    const/4 v3, 0x3

    .line 138
    iget-object v11, v8, La/gcc;->k:La/xcz;

    .line 139
    .line 140
    iget-object v5, v8, La/gcc;->q:La/vne;

    .line 141
    .line 142
    if-eq v0, v2, :cond_9

    .line 143
    .line 144
    const/4 v2, 0x2

    .line 145
    if-ne v0, v2, :cond_8

    .line 146
    .line 147
    new-instance v0, La/jcc;

    .line 148
    .line 149
    invoke-direct {v0, v11, v12, v1, v4}, La/jcc;-><init>(La/xcz;ILa/yje;B)V

    .line 150
    .line 151
    .line 152
    invoke-static {v5, v1, v1, v0, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 157
    .line 158
    .line 159
    return-object v1

    .line 160
    :cond_9
    new-instance v10, La/kcc;

    .line 161
    .line 162
    const/16 v18, 0x0

    .line 163
    .line 164
    iget-object v13, v8, La/gcc;->m:La/w6k;

    .line 165
    .line 166
    iget v14, v8, La/gcc;->l:I

    .line 167
    .line 168
    iget-object v0, v8, La/gcc;->n:La/k6z;

    .line 169
    .line 170
    move-object/from16 v17, v0

    .line 171
    .line 172
    invoke-direct/range {v10 .. v18}, La/kcc;-><init>(La/xcz;ILa/w6k;IZLa/hh80;La/k6z;La/yje;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v5, v1, v1, v10, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 176
    .line 177
    .line 178
    :cond_a
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object v0
.end method
