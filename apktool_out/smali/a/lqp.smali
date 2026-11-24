.class public final La/lqp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/cqg;

.field public j:La/r2s0;

.field public k:Z

.field public l:B

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:La/m9s;

.field public final synthetic o:Z

.field public final synthetic p:La/r2s0;

.field public final synthetic q:La/ywq0;

.field public final synthetic r:La/yws;


# direct methods
.method public constructor <init>(La/m9s;ZLa/r2s0;La/ywq0;La/yws;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/lqp;->n:La/m9s;

    .line 2
    .line 3
    iput-boolean p2, p0, La/lqp;->o:Z

    .line 4
    .line 5
    iput-object p3, p0, La/lqp;->p:La/r2s0;

    .line 6
    .line 7
    iput-object p4, p0, La/lqp;->q:La/ywq0;

    .line 8
    .line 9
    iput-object p5, p0, La/lqp;->r:La/yws;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/lqp;

    .line 2
    .line 3
    iget-object v4, p0, La/lqp;->q:La/ywq0;

    .line 4
    .line 5
    iget-object v5, p0, La/lqp;->r:La/yws;

    .line 6
    .line 7
    iget-object v1, p0, La/lqp;->n:La/m9s;

    .line 8
    .line 9
    iget-boolean v2, p0, La/lqp;->o:Z

    .line 10
    .line 11
    iget-object v3, p0, La/lqp;->p:La/r2s0;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/lqp;-><init>(La/m9s;ZLa/r2s0;La/ywq0;La/yws;La/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/lqp;->m:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/lqp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/lqp;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/lqp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, La/lqp;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/kmq;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v2, p0, La/lqp;->l:B

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v4, :cond_1

    .line 15
    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, La/lqp;->i:La/cqg;

    .line 19
    .line 20
    check-cast p0, La/tdt0;

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v5

    .line 32
    :cond_1
    iget-boolean v2, p0, La/lqp;->k:Z

    .line 33
    .line 34
    iget-object v4, p0, La/lqp;->j:La/r2s0;

    .line 35
    .line 36
    iget-object v6, p0, La/lqp;->i:La/cqg;

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v12, p0

    .line 42
    move-object v9, v4

    .line 43
    :goto_0
    move v8, v2

    .line 44
    move-object v7, v6

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, La/lqp;->n:La/m9s;

    .line 50
    .line 51
    iget-object v6, p1, La/m9s;->I:La/cqg;

    .line 52
    .line 53
    iget-wide v8, p1, La/m9s;->o:J

    .line 54
    .line 55
    iget-wide v10, p1, La/m9s;->A:J

    .line 56
    .line 57
    iput-object v0, p0, La/lqp;->m:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object v6, p0, La/lqp;->i:La/cqg;

    .line 60
    .line 61
    iget-object p1, p0, La/lqp;->p:La/r2s0;

    .line 62
    .line 63
    iput-object p1, p0, La/lqp;->j:La/r2s0;

    .line 64
    .line 65
    iget-boolean v2, p0, La/lqp;->o:Z

    .line 66
    .line 67
    iput-boolean v2, p0, La/lqp;->k:Z

    .line 68
    .line 69
    iput-byte v4, p0, La/lqp;->l:B

    .line 70
    .line 71
    iget-object v7, p0, La/lqp;->q:La/ywq0;

    .line 72
    .line 73
    move-object v12, p0

    .line 74
    invoke-virtual/range {v7 .. v12}, La/ywq0;->l(JJLa/zje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v1, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move-object v9, p1

    .line 82
    move-object p1, p0

    .line 83
    goto :goto_0

    .line 84
    :goto_1
    move-object v10, p1

    .line 85
    check-cast v10, Ljava/lang/String;

    .line 86
    .line 87
    new-instance v6, La/tdt0;

    .line 88
    .line 89
    iget-object v11, v12, La/lqp;->r:La/yws;

    .line 90
    .line 91
    invoke-direct/range {v6 .. v11}, La/tdt0;-><init>(La/cqg;ZLa/r2s0;Ljava/lang/String;La/yws;)V

    .line 92
    .line 93
    .line 94
    iput-object v5, v12, La/lqp;->m:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v5, v12, La/lqp;->i:La/cqg;

    .line 97
    .line 98
    iput-object v5, v12, La/lqp;->j:La/r2s0;

    .line 99
    .line 100
    iput-byte v3, v12, La/lqp;->l:B

    .line 101
    .line 102
    invoke-interface {v0, v6, v12}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v1, :cond_4

    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :cond_4
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0
.end method
