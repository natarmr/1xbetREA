.class public final La/k6w;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/rrd;

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:J

.field public final synthetic n:I


# direct methods
.method public constructor <init>(La/rrd;JJJILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/k6w;->j:La/rrd;

    .line 2
    .line 3
    iput-wide p2, p0, La/k6w;->k:J

    .line 4
    .line 5
    iput-wide p4, p0, La/k6w;->l:J

    .line 6
    .line 7
    iput-wide p6, p0, La/k6w;->m:J

    .line 8
    .line 9
    iput p8, p0, La/k6w;->n:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/k6w;

    .line 2
    .line 3
    iget-wide v6, p0, La/k6w;->m:J

    .line 4
    .line 5
    iget v8, p0, La/k6w;->n:I

    .line 6
    .line 7
    iget-object v1, p0, La/k6w;->j:La/rrd;

    .line 8
    .line 9
    iget-wide v2, p0, La/k6w;->k:J

    .line 10
    .line 11
    iget-wide v4, p0, La/k6w;->l:J

    .line 12
    .line 13
    move-object v9, p2

    .line 14
    invoke-direct/range {v0 .. v9}, La/k6w;-><init>(La/rrd;JJJILa/yje;)V

    .line 15
    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, La/k6w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/k6w;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/k6w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
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
    iget-boolean v2, v0, La/k6w;->i:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    return-object v0

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, La/k6w;->j:La/rrd;

    .line 28
    .line 29
    iget-object v4, v2, La/rrd;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, La/pyu;

    .line 32
    .line 33
    iget-object v2, v2, La/rrd;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, La/btt0;

    .line 36
    .line 37
    invoke-virtual {v2}, La/btt0;->a()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    new-instance v6, Ljava/util/Date;

    .line 46
    .line 47
    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    invoke-virtual {v5, v6, v7}, Ljava/util/TimeZone;->getOffset(J)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    int-to-long v6, v5

    .line 59
    const-wide/32 v8, 0x36ee80

    .line 60
    .line 61
    .line 62
    div-long v8, v6, v8

    .line 63
    .line 64
    const-wide/32 v10, 0xea60

    .line 65
    .line 66
    .line 67
    div-long/2addr v6, v10

    .line 68
    long-to-double v6, v6

    .line 69
    long-to-double v8, v8

    .line 70
    const-wide/high16 v10, 0x404e000000000000L    # 60.0

    .line 71
    .line 72
    mul-double/2addr v10, v8

    .line 73
    sub-double/2addr v6, v10

    .line 74
    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    .line 75
    .line 76
    div-double/2addr v6, v10

    .line 77
    if-gez v5, :cond_2

    .line 78
    .line 79
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    sub-double/2addr v8, v5

    .line 84
    :goto_0
    move-wide/from16 v18, v8

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    add-double/2addr v8, v6

    .line 88
    goto :goto_0

    .line 89
    :goto_1
    new-instance v10, La/wdi0;

    .line 90
    .line 91
    iget-wide v11, v0, La/k6w;->k:J

    .line 92
    .line 93
    iget-wide v13, v0, La/k6w;->l:J

    .line 94
    .line 95
    iget-wide v5, v0, La/k6w;->m:J

    .line 96
    .line 97
    iget v7, v0, La/k6w;->n:I

    .line 98
    .line 99
    move-wide v15, v5

    .line 100
    move/from16 v17, v7

    .line 101
    .line 102
    invoke-direct/range {v10 .. v19}, La/wdi0;-><init>(JJJID)V

    .line 103
    .line 104
    .line 105
    iput-boolean v3, v0, La/k6w;->i:Z

    .line 106
    .line 107
    iget-object v3, v4, La/pyu;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, La/tpv;

    .line 110
    .line 111
    invoke-virtual {v3}, La/tpv;->invoke()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, La/r37;

    .line 116
    .line 117
    invoke-interface {v3, v2, v10, v0}, La/r37;->c(Ljava/lang/String;La/wdi0;La/yje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-ne v0, v1, :cond_3

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    :goto_2
    if-ne v0, v1, :cond_4

    .line 127
    .line 128
    return-object v1

    .line 129
    :cond_4
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0
.end method
