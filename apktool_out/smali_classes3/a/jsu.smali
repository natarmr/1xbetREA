.class public final La/jsu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/lhf0;

.field public final synthetic m:J

.field public final synthetic n:Z

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:La/c3c0;

.field public final synthetic q:Ljava/util/List;


# direct methods
.method public constructor <init>(La/yje;La/lhf0;JZLjava/lang/String;La/c3c0;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/jsu;->l:La/lhf0;

    .line 2
    .line 3
    iput-wide p3, p0, La/jsu;->m:J

    .line 4
    .line 5
    iput-boolean p5, p0, La/jsu;->n:Z

    .line 6
    .line 7
    iput-object p6, p0, La/jsu;->o:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p7, p0, La/jsu;->p:La/c3c0;

    .line 10
    .line 11
    iput-object p8, p0, La/jsu;->q:Ljava/util/List;

    .line 12
    .line 13
    const/4 p2, 0x3

    .line 14
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/jsu;

    .line 7
    .line 8
    iget-object v7, p0, La/jsu;->p:La/c3c0;

    .line 9
    .line 10
    iget-object v8, p0, La/jsu;->q:Ljava/util/List;

    .line 11
    .line 12
    iget-object v2, p0, La/jsu;->l:La/lhf0;

    .line 13
    .line 14
    iget-wide v3, p0, La/jsu;->m:J

    .line 15
    .line 16
    iget-boolean v5, p0, La/jsu;->n:Z

    .line 17
    .line 18
    iget-object v6, p0, La/jsu;->o:Ljava/lang/String;

    .line 19
    .line 20
    invoke-direct/range {v0 .. v8}, La/jsu;-><init>(La/yje;La/lhf0;JZLjava/lang/String;La/c3c0;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/jsu;->j:La/kmq;

    .line 24
    .line 25
    iput-object p2, v0, La/jsu;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, La/jsu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/jsu;->j:La/kmq;

    .line 4
    .line 5
    iget-object v2, v0, La/jsu;->k:Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-boolean v4, v0, La/jsu;->i:Z

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    if-ne v4, v6, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v5

    .line 27
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object v11, v2

    .line 31
    check-cast v11, La/jvn;

    .line 32
    .line 33
    iget-object v2, v0, La/jsu;->l:La/lhf0;

    .line 34
    .line 35
    iget-object v2, v2, La/lhf0;->c:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v8, v2

    .line 38
    check-cast v8, La/gxu;

    .line 39
    .line 40
    iget-object v10, v0, La/jsu;->o:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v9, v0, La/jsu;->p:La/c3c0;

    .line 46
    .line 47
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v2, v0, La/jsu;->q:Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v7, La/al6;

    .line 59
    .line 60
    const/4 v15, 0x0

    .line 61
    iget-boolean v12, v0, La/jsu;->n:Z

    .line 62
    .line 63
    iget-wide v13, v0, La/jsu;->m:J

    .line 64
    .line 65
    invoke-direct/range {v7 .. v15}, La/al6;-><init>(La/gxu;La/c3c0;Ljava/lang/String;La/jvn;ZJLa/yje;)V

    .line 66
    .line 67
    .line 68
    const-wide/16 v8, 0x7530

    .line 69
    .line 70
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 71
    .line 72
    invoke-static {v8, v9, v2, v7}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iput-object v5, v0, La/jsu;->j:La/kmq;

    .line 77
    .line 78
    iput-object v5, v0, La/jsu;->k:Ljava/lang/Object;

    .line 79
    .line 80
    iput-boolean v6, v0, La/jsu;->i:Z

    .line 81
    .line 82
    invoke-static {v1, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-ne v0, v3, :cond_2

    .line 87
    .line 88
    return-object v3

    .line 89
    :cond_2
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0
.end method
