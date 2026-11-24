.class public final La/k1v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lkotlin/jvm/functions/Function1;

.field public final synthetic m:La/wdu;

.field public final synthetic n:I

.field public final synthetic o:J

.field public final synthetic p:La/hie0;


# direct methods
.method public constructor <init>(La/yje;Lkotlin/jvm/functions/Function1;La/wdu;IJLa/hie0;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/k1v;->l:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iput-object p3, p0, La/k1v;->m:La/wdu;

    .line 4
    .line 5
    iput p4, p0, La/k1v;->n:I

    .line 6
    .line 7
    iput-wide p5, p0, La/k1v;->o:J

    .line 8
    .line 9
    iput-object p7, p0, La/k1v;->p:La/hie0;

    .line 10
    .line 11
    const/4 p2, 0x3

    .line 12
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/k1v;

    .line 7
    .line 8
    iget-wide v5, p0, La/k1v;->o:J

    .line 9
    .line 10
    iget-object v7, p0, La/k1v;->p:La/hie0;

    .line 11
    .line 12
    iget-object v2, p0, La/k1v;->l:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    iget-object v3, p0, La/k1v;->m:La/wdu;

    .line 15
    .line 16
    iget v4, p0, La/k1v;->n:I

    .line 17
    .line 18
    invoke-direct/range {v0 .. v7}, La/k1v;-><init>(La/yje;Lkotlin/jvm/functions/Function1;La/wdu;IJLa/hie0;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/k1v;->j:La/kmq;

    .line 22
    .line 23
    iput-object p2, v0, La/k1v;->k:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, La/k1v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/k1v;->i:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_2

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
    return-object v4

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, La/k1v;->j:La/kmq;

    .line 28
    .line 29
    iget-object v5, v0, La/k1v;->k:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v9, v5

    .line 32
    check-cast v9, La/jvn;

    .line 33
    .line 34
    new-instance v6, La/h1v;

    .line 35
    .line 36
    iget-wide v10, v0, La/k1v;->o:J

    .line 37
    .line 38
    const/4 v12, 0x0

    .line 39
    iget-object v7, v0, La/k1v;->m:La/wdu;

    .line 40
    .line 41
    iget v8, v0, La/k1v;->n:I

    .line 42
    .line 43
    invoke-direct/range {v6 .. v12}, La/h1v;-><init>(La/wdu;ILa/jvn;JLa/yje;)V

    .line 44
    .line 45
    .line 46
    const-wide/16 v8, 0x1e

    .line 47
    .line 48
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 49
    .line 50
    invoke-static {v8, v9, v5, v6}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    new-instance v6, La/qqu;

    .line 55
    .line 56
    const/16 v8, 0xb

    .line 57
    .line 58
    iget-object v9, v0, La/k1v;->p:La/hie0;

    .line 59
    .line 60
    invoke-direct {v6, v5, v9, v8}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 61
    .line 62
    .line 63
    new-instance v5, La/h0v;

    .line 64
    .line 65
    const/4 v8, 0x2

    .line 66
    invoke-direct {v5, v7, v4, v8}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    new-instance v10, La/a1g;

    .line 70
    .line 71
    const/16 v8, 0x14

    .line 72
    .line 73
    invoke-direct {v10, v6, v5, v8}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    new-instance v11, La/xvu;

    .line 77
    .line 78
    const/4 v5, 0x3

    .line 79
    invoke-direct {v11, v9, v5}, La/xvu;-><init>(La/hie0;B)V

    .line 80
    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    iget-object v6, v0, La/k1v;->l:Lkotlin/jvm/functions/Function1;

    .line 84
    .line 85
    if-nez v6, :cond_2

    .line 86
    .line 87
    new-instance v6, La/i1v;

    .line 88
    .line 89
    invoke-direct {v6, v7, v4, v5}, La/i1v;-><init>(La/wdu;La/yje;B)V

    .line 90
    .line 91
    .line 92
    :cond_2
    move-object v14, v6

    .line 93
    new-instance v15, La/j1v;

    .line 94
    .line 95
    invoke-direct {v15, v7, v4, v5}, La/j1v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 96
    .line 97
    .line 98
    const/16 v16, 0x0

    .line 99
    .line 100
    const/16 v17, 0x28

    .line 101
    .line 102
    const-wide/16 v12, 0x1e

    .line 103
    .line 104
    invoke-static/range {v10 .. v17}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    iput-object v4, v0, La/k1v;->j:La/kmq;

    .line 109
    .line 110
    iput-object v4, v0, La/k1v;->k:Ljava/lang/Object;

    .line 111
    .line 112
    iput-boolean v3, v0, La/k1v;->i:Z

    .line 113
    .line 114
    invoke-static {v2}, La/f7k;->J(La/kmq;)V

    .line 115
    .line 116
    .line 117
    new-instance v3, La/uap;

    .line 118
    .line 119
    const/16 v4, 0xc

    .line 120
    .line 121
    invoke-direct {v3, v2, v4}, La/uap;-><init>(La/kmq;B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v3, v0}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-ne v0, v1, :cond_3

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    :goto_0
    if-ne v0, v1, :cond_4

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    :goto_1
    if-ne v0, v1, :cond_5

    .line 139
    .line 140
    return-object v1

    .line 141
    :cond_5
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0
.end method
