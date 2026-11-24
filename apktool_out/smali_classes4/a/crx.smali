.class public final La/crx;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/kmq;

.field public j:B

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/tzi;

.field public final synthetic m:Z

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Z

.field public final synthetic p:J

.field public final synthetic q:La/jvn;


# direct methods
.method public constructor <init>(La/tzi;ZLjava/util/List;ZJLa/jvn;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/crx;->l:La/tzi;

    .line 2
    .line 3
    iput-boolean p2, p0, La/crx;->m:Z

    .line 4
    .line 5
    iput-object p3, p0, La/crx;->n:Ljava/util/List;

    .line 6
    .line 7
    iput-boolean p4, p0, La/crx;->o:Z

    .line 8
    .line 9
    iput-wide p5, p0, La/crx;->p:J

    .line 10
    .line 11
    iput-object p7, p0, La/crx;->q:La/jvn;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/crx;

    .line 2
    .line 3
    iget-wide v5, p0, La/crx;->p:J

    .line 4
    .line 5
    iget-object v7, p0, La/crx;->q:La/jvn;

    .line 6
    .line 7
    iget-object v1, p0, La/crx;->l:La/tzi;

    .line 8
    .line 9
    iget-boolean v2, p0, La/crx;->m:Z

    .line 10
    .line 11
    iget-object v3, p0, La/crx;->n:Ljava/util/List;

    .line 12
    .line 13
    iget-boolean v4, p0, La/crx;->o:Z

    .line 14
    .line 15
    move-object v8, p2

    .line 16
    invoke-direct/range {v0 .. v8}, La/crx;-><init>(La/tzi;ZLjava/util/List;ZJLa/jvn;La/yje;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/crx;->k:Ljava/lang/Object;

    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, La/crx;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/crx;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/crx;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/crx;->k:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v10, v0

    .line 4
    check-cast v10, La/kmq;

    .line 5
    .line 6
    sget-object v11, La/wne;->a:La/wne;

    .line 7
    .line 8
    iget-byte v0, p0, La/crx;->j:B

    .line 9
    .line 10
    const/4 v12, 0x2

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v13, 0x0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    if-ne v0, v12, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v13

    .line 29
    :cond_1
    iget-object v10, p0, La/crx;->i:La/kmq;

    .line 30
    .line 31
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object v0, p1

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object v13, p0, La/crx;->k:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v10, p0, La/crx;->i:La/kmq;

    .line 42
    .line 43
    iput-byte v1, p0, La/crx;->j:B

    .line 44
    .line 45
    iget-object v0, p0, La/crx;->l:La/tzi;

    .line 46
    .line 47
    iget-boolean v1, p0, La/crx;->m:Z

    .line 48
    .line 49
    iget-object v2, p0, La/crx;->n:Ljava/util/List;

    .line 50
    .line 51
    iget-boolean v3, p0, La/crx;->o:Z

    .line 52
    .line 53
    iget-wide v4, p0, La/crx;->p:J

    .line 54
    .line 55
    iget-object v6, p0, La/crx;->q:La/jvn;

    .line 56
    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    iget-object v0, v0, La/tzi;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, La/yfu;

    .line 62
    .line 63
    iget-object v0, v0, La/yfu;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, La/h0q0;

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    move-object v7, p0

    .line 69
    invoke-virtual/range {v0 .. v7}, La/h0q0;->o(ILjava/util/List;ZJLa/jvn;La/zje;)Ljava/io/Serializable;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    iget-object v1, v0, La/tzi;->h:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, La/n4u;

    .line 77
    .line 78
    iget-object v0, v0, La/tzi;->f:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, La/viu;

    .line 81
    .line 82
    invoke-virtual {v0}, La/viu;->a()J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    invoke-static {v7, v8}, La/ynq0;->f(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    iget-object v0, v1, La/n4u;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, La/h0q0;

    .line 93
    .line 94
    const/4 v1, 0x1

    .line 95
    move-object v9, p0

    .line 96
    invoke-virtual/range {v0 .. v9}, La/h0q0;->n(ILjava/util/List;ZJLa/jvn;JLa/zje;)Ljava/io/Serializable;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    :goto_0
    if-ne v0, v11, :cond_4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    :goto_1
    iput-object v13, p0, La/crx;->k:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v13, p0, La/crx;->i:La/kmq;

    .line 106
    .line 107
    iput-byte v12, p0, La/crx;->j:B

    .line 108
    .line 109
    invoke-interface {v10, v0, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-ne v0, v11, :cond_5

    .line 114
    .line 115
    :goto_2
    return-object v11

    .line 116
    :cond_5
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0
.end method
