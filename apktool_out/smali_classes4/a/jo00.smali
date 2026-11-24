.class public final La/jo00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/j700;

.field public final synthetic m:La/pzu;

.field public final synthetic n:I

.field public final synthetic o:Ljava/util/Set;

.field public final synthetic p:La/jvn;

.field public final synthetic q:Z

.field public final synthetic r:J

.field public final synthetic s:Ljava/util/Set;

.field public t:La/kmq;


# direct methods
.method public constructor <init>(La/yje;La/j700;La/pzu;ILjava/util/Set;La/jvn;ZJLjava/util/Set;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/jo00;->l:La/j700;

    .line 2
    .line 3
    iput-object p3, p0, La/jo00;->m:La/pzu;

    .line 4
    .line 5
    iput p4, p0, La/jo00;->n:I

    .line 6
    .line 7
    iput-object p5, p0, La/jo00;->o:Ljava/util/Set;

    .line 8
    .line 9
    iput-object p6, p0, La/jo00;->p:La/jvn;

    .line 10
    .line 11
    iput-boolean p7, p0, La/jo00;->q:Z

    .line 12
    .line 13
    iput-wide p8, p0, La/jo00;->r:J

    .line 14
    .line 15
    iput-object p10, p0, La/jo00;->s:Ljava/util/Set;

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/jo00;

    .line 7
    .line 8
    iget-wide v8, p0, La/jo00;->r:J

    .line 9
    .line 10
    iget-object v10, p0, La/jo00;->s:Ljava/util/Set;

    .line 11
    .line 12
    iget-object v2, p0, La/jo00;->l:La/j700;

    .line 13
    .line 14
    iget-object v3, p0, La/jo00;->m:La/pzu;

    .line 15
    .line 16
    iget v4, p0, La/jo00;->n:I

    .line 17
    .line 18
    iget-object v5, p0, La/jo00;->o:Ljava/util/Set;

    .line 19
    .line 20
    iget-object v6, p0, La/jo00;->p:La/jvn;

    .line 21
    .line 22
    iget-boolean v7, p0, La/jo00;->q:Z

    .line 23
    .line 24
    invoke-direct/range {v0 .. v10}, La/jo00;-><init>(La/yje;La/j700;La/pzu;ILjava/util/Set;La/jvn;ZJLjava/util/Set;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, La/jo00;->j:La/kmq;

    .line 28
    .line 29
    iput-object p2, v0, La/jo00;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, La/jo00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    sget-object v12, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v11, La/jo00;->i:B

    .line 6
    .line 7
    const/4 v13, 0x2

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v14, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    if-ne v0, v13, :cond_0

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v14

    .line 27
    :cond_1
    iget-object v0, v11, La/jo00;->t:La/kmq;

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object v15, v0

    .line 33
    move-object/from16 v0, p1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v15, v11, La/jo00;->j:La/kmq;

    .line 40
    .line 41
    iget-object v0, v11, La/jo00;->k:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v2, v11, La/jo00;->l:La/j700;

    .line 50
    .line 51
    if-nez v0, :cond_4

    .line 52
    .line 53
    sget-object v0, La/j700;->c:La/j700;

    .line 54
    .line 55
    if-ne v2, v0, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    const/4 v0, 0x0

    .line 59
    goto :goto_1

    .line 60
    :cond_4
    :goto_0
    move v0, v1

    .line 61
    :goto_1
    iget-object v3, v11, La/jo00;->m:La/pzu;

    .line 62
    .line 63
    iget-object v3, v3, La/pzu;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, La/wdu;

    .line 66
    .line 67
    iput-object v14, v11, La/jo00;->j:La/kmq;

    .line 68
    .line 69
    iput-object v14, v11, La/jo00;->k:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v15, v11, La/jo00;->t:La/kmq;

    .line 72
    .line 73
    iput-byte v1, v11, La/jo00;->i:B

    .line 74
    .line 75
    move v1, v0

    .line 76
    move-object v0, v3

    .line 77
    iget v3, v11, La/jo00;->n:I

    .line 78
    .line 79
    iget-object v4, v11, La/jo00;->o:Ljava/util/Set;

    .line 80
    .line 81
    iget-object v5, v11, La/jo00;->p:La/jvn;

    .line 82
    .line 83
    iget-boolean v6, v11, La/jo00;->q:Z

    .line 84
    .line 85
    iget-wide v7, v11, La/jo00;->r:J

    .line 86
    .line 87
    iget-object v9, v11, La/jo00;->s:Ljava/util/Set;

    .line 88
    .line 89
    const/4 v10, 0x0

    .line 90
    invoke-virtual/range {v0 .. v11}, La/wdu;->k(ZLa/j700;ILjava/util/Set;La/jvn;ZJLjava/util/Set;ZLa/zje;)Ljava/io/Serializable;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-ne v0, v12, :cond_5

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_5
    :goto_2
    iput-object v14, v11, La/jo00;->j:La/kmq;

    .line 98
    .line 99
    iput-object v14, v11, La/jo00;->k:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v14, v11, La/jo00;->t:La/kmq;

    .line 102
    .line 103
    iput-byte v13, v11, La/jo00;->i:B

    .line 104
    .line 105
    invoke-static {v15}, La/f7k;->J(La/kmq;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v15, v0, v11}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-ne v0, v12, :cond_6

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_3
    if-ne v0, v12, :cond_7

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    :goto_4
    if-ne v0, v12, :cond_8

    .line 123
    .line 124
    :goto_5
    return-object v12

    .line 125
    :cond_8
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object v0
.end method
