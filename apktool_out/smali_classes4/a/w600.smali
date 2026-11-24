.class public final La/w600;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:Z

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Integer;

.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Z

.field public final synthetic q:J

.field public final synthetic r:La/wdu;

.field public final synthetic s:Ljava/util/List;

.field public final synthetic t:J


# direct methods
.method public constructor <init>(ZLjava/lang/String;ILjava/lang/Integer;ILjava/lang/String;ZJLa/wdu;Ljava/util/List;JLa/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/w600;->j:Z

    .line 2
    .line 3
    iput-object p2, p0, La/w600;->k:Ljava/lang/String;

    .line 4
    .line 5
    iput p3, p0, La/w600;->l:I

    .line 6
    .line 7
    iput-object p4, p0, La/w600;->m:Ljava/lang/Integer;

    .line 8
    .line 9
    iput p5, p0, La/w600;->n:I

    .line 10
    .line 11
    iput-object p6, p0, La/w600;->o:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p7, p0, La/w600;->p:Z

    .line 14
    .line 15
    iput-wide p8, p0, La/w600;->q:J

    .line 16
    .line 17
    iput-object p10, p0, La/w600;->r:La/wdu;

    .line 18
    .line 19
    iput-object p11, p0, La/w600;->s:Ljava/util/List;

    .line 20
    .line 21
    iput-wide p12, p0, La/w600;->t:J

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1, p14}, La/bnn0;-><init>(ILa/yje;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 15

    .line 1
    new-instance v0, La/w600;

    .line 2
    .line 3
    iget-object v11, p0, La/w600;->s:Ljava/util/List;

    .line 4
    .line 5
    iget-wide v12, p0, La/w600;->t:J

    .line 6
    .line 7
    iget-boolean v1, p0, La/w600;->j:Z

    .line 8
    .line 9
    iget-object v2, p0, La/w600;->k:Ljava/lang/String;

    .line 10
    .line 11
    iget v3, p0, La/w600;->l:I

    .line 12
    .line 13
    iget-object v4, p0, La/w600;->m:Ljava/lang/Integer;

    .line 14
    .line 15
    iget v5, p0, La/w600;->n:I

    .line 16
    .line 17
    iget-object v6, p0, La/w600;->o:Ljava/lang/String;

    .line 18
    .line 19
    iget-boolean v7, p0, La/w600;->p:Z

    .line 20
    .line 21
    iget-wide v8, p0, La/w600;->q:J

    .line 22
    .line 23
    iget-object v10, p0, La/w600;->r:La/wdu;

    .line 24
    .line 25
    move-object/from16 v14, p2

    .line 26
    .line 27
    invoke-direct/range {v0 .. v14}, La/w600;-><init>(ZLjava/lang/String;ILjava/lang/Integer;ILjava/lang/String;ZJLa/wdu;Ljava/util/List;JLa/yje;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    check-cast p2, La/yje;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, La/w600;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/w600;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/w600;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/w600;->r:La/wdu;

    .line 4
    .line 5
    iget-object v2, v1, La/wdu;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/bwl;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-byte v4, v0, La/w600;->i:B

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x0

    .line 16
    if-eqz v4, :cond_2

    .line 17
    .line 18
    if-eq v4, v6, :cond_1

    .line 19
    .line 20
    if-ne v4, v5, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v2, p1

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
    return-object v7

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v2, p1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-boolean v4, v0, La/w600;->j:Z

    .line 44
    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    iget-object v7, v0, La/w600;->k:Ljava/lang/String;

    .line 48
    .line 49
    :cond_3
    move-object v15, v7

    .line 50
    iget-boolean v12, v0, La/w600;->p:Z

    .line 51
    .line 52
    iget-wide v13, v0, La/w600;->q:J

    .line 53
    .line 54
    iget v8, v0, La/w600;->l:I

    .line 55
    .line 56
    iget-object v9, v0, La/w600;->m:Ljava/lang/Integer;

    .line 57
    .line 58
    iget v10, v0, La/w600;->n:I

    .line 59
    .line 60
    iget-object v11, v0, La/w600;->o:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static/range {v8 .. v15}, La/jeb;->O(ILjava/lang/Integer;ILjava/lang/String;ZJLjava/lang/String;)Ljava/util/TreeMap;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    if-eqz v4, :cond_5

    .line 67
    .line 68
    iput-byte v6, v0, La/w600;->i:B

    .line 69
    .line 70
    iget-object v2, v2, La/bwl;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, La/wgn;

    .line 73
    .line 74
    invoke-virtual {v2}, La/wgn;->invoke()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, La/t8p;

    .line 79
    .line 80
    invoke-interface {v2, v7, v0}, La/t8p;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-ne v2, v3, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    :goto_0
    check-cast v2, La/dx5;

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    new-instance v4, La/r8p;

    .line 91
    .line 92
    iget-object v6, v0, La/w600;->s:Ljava/util/List;

    .line 93
    .line 94
    invoke-direct {v4, v6}, La/r8p;-><init>(Ljava/util/List;)V

    .line 95
    .line 96
    .line 97
    iput-byte v5, v0, La/w600;->i:B

    .line 98
    .line 99
    iget-object v2, v2, La/bwl;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, La/wgn;

    .line 102
    .line 103
    invoke-virtual {v2}, La/wgn;->invoke()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, La/t8p;

    .line 108
    .line 109
    invoke-interface {v2, v7, v4, v0}, La/t8p;->b(Ljava/util/Map;La/r8p;La/yje;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    if-ne v2, v3, :cond_6

    .line 114
    .line 115
    :goto_1
    return-object v3

    .line 116
    :cond_6
    :goto_2
    check-cast v2, La/dx5;

    .line 117
    .line 118
    :goto_3
    invoke-virtual {v2}, La/dx5;->a()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Ljava/lang/Iterable;

    .line 123
    .line 124
    new-instance v3, Ljava/util/ArrayList;

    .line 125
    .line 126
    const/16 v4, 0xa

    .line 127
    .line 128
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_7

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    check-cast v4, La/su10;

    .line 150
    .line 151
    sget-object v5, La/sip;->b:La/sip;

    .line 152
    .line 153
    iget-wide v6, v0, La/w600;->t:J

    .line 154
    .line 155
    invoke-static {v4, v5, v6, v7}, La/g7x;->a0(La/su10;La/sip;J)La/nas;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_7
    iget-object v0, v1, La/wdu;->j:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, La/f8p;

    .line 166
    .line 167
    sget-object v1, La/j8p;->a:La/j8p;

    .line 168
    .line 169
    invoke-virtual {v0, v3, v1}, La/f8p;->a(Ljava/util/ArrayList;La/j8p;)V

    .line 170
    .line 171
    .line 172
    return-object v3
.end method
