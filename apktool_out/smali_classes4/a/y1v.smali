.class public final La/y1v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lkotlin/jvm/functions/Function1;

.field public final synthetic m:La/rrd;

.field public final synthetic n:Z

.field public final synthetic o:I

.field public final synthetic p:La/hie0;


# direct methods
.method public constructor <init>(La/yje;Lkotlin/jvm/functions/Function1;La/rrd;ZILa/hie0;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/y1v;->l:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iput-object p3, p0, La/y1v;->m:La/rrd;

    .line 4
    .line 5
    iput-boolean p4, p0, La/y1v;->n:Z

    .line 6
    .line 7
    iput p5, p0, La/y1v;->o:I

    .line 8
    .line 9
    iput-object p6, p0, La/y1v;->p:La/hie0;

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
    .locals 7

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/y1v;

    .line 7
    .line 8
    iget v5, p0, La/y1v;->o:I

    .line 9
    .line 10
    iget-object v6, p0, La/y1v;->p:La/hie0;

    .line 11
    .line 12
    iget-object v2, p0, La/y1v;->l:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    iget-object v3, p0, La/y1v;->m:La/rrd;

    .line 15
    .line 16
    iget-boolean v4, p0, La/y1v;->n:Z

    .line 17
    .line 18
    invoke-direct/range {v0 .. v6}, La/y1v;-><init>(La/yje;Lkotlin/jvm/functions/Function1;La/rrd;ZILa/hie0;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/y1v;->j:La/kmq;

    .line 22
    .line 23
    iput-object p2, v0, La/y1v;->k:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, La/y1v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/y1v;->i:Z

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
    iget-object v2, v0, La/y1v;->j:La/kmq;

    .line 28
    .line 29
    iget-object v5, v0, La/y1v;->k:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v10, v5

    .line 32
    check-cast v10, La/jvn;

    .line 33
    .line 34
    new-instance v6, La/eae;

    .line 35
    .line 36
    iget v9, v0, La/y1v;->o:I

    .line 37
    .line 38
    const/4 v11, 0x0

    .line 39
    iget-object v7, v0, La/y1v;->m:La/rrd;

    .line 40
    .line 41
    iget-boolean v8, v0, La/y1v;->n:Z

    .line 42
    .line 43
    invoke-direct/range {v6 .. v11}, La/eae;-><init>(La/rrd;ZILa/jvn;La/yje;)V

    .line 44
    .line 45
    .line 46
    const-wide/16 v8, 0x8

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
    iget-object v8, v0, La/y1v;->p:La/hie0;

    .line 57
    .line 58
    const/16 v9, 0xc

    .line 59
    .line 60
    invoke-direct {v6, v5, v8, v9}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 61
    .line 62
    .line 63
    new-instance v5, La/h0v;

    .line 64
    .line 65
    const/4 v10, 0x3

    .line 66
    invoke-direct {v5, v7, v4, v10}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    new-instance v11, La/a1g;

    .line 70
    .line 71
    const/16 v10, 0x14

    .line 72
    .line 73
    invoke-direct {v11, v6, v5, v10}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    new-instance v12, La/xvu;

    .line 77
    .line 78
    const/4 v5, 0x4

    .line 79
    invoke-direct {v12, v8, v5}, La/xvu;-><init>(La/hie0;B)V

    .line 80
    .line 81
    .line 82
    iget-object v5, v0, La/y1v;->l:Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    if-nez v5, :cond_2

    .line 85
    .line 86
    new-instance v5, La/x1v;

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    invoke-direct {v5, v7, v4, v6}, La/x1v;-><init>(La/rrd;La/yje;B)V

    .line 90
    .line 91
    .line 92
    :cond_2
    move-object v15, v5

    .line 93
    new-instance v5, La/j1v;

    .line 94
    .line 95
    invoke-direct {v5, v7, v4, v3}, La/j1v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 96
    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    const/16 v18, 0x28

    .line 101
    .line 102
    const-wide/16 v13, 0x8

    .line 103
    .line 104
    move-object/from16 v16, v5

    .line 105
    .line 106
    invoke-static/range {v11 .. v18}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    iput-object v4, v0, La/y1v;->j:La/kmq;

    .line 111
    .line 112
    iput-object v4, v0, La/y1v;->k:Ljava/lang/Object;

    .line 113
    .line 114
    iput-boolean v3, v0, La/y1v;->i:Z

    .line 115
    .line 116
    invoke-static {v2}, La/f7k;->J(La/kmq;)V

    .line 117
    .line 118
    .line 119
    new-instance v3, La/uap;

    .line 120
    .line 121
    invoke-direct {v3, v2, v9}, La/uap;-><init>(La/kmq;B)V

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
