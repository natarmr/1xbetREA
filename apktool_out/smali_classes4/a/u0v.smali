.class public final La/u0v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/daf;

.field public final synthetic k:Z

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Z

.field public final synthetic n:J

.field public final synthetic o:La/jvn;


# direct methods
.method public constructor <init>(La/daf;ZLjava/util/List;ZJLa/jvn;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/u0v;->j:La/daf;

    .line 2
    .line 3
    iput-boolean p2, p0, La/u0v;->k:Z

    .line 4
    .line 5
    iput-object p3, p0, La/u0v;->l:Ljava/util/List;

    .line 6
    .line 7
    iput-boolean p4, p0, La/u0v;->m:Z

    .line 8
    .line 9
    iput-wide p5, p0, La/u0v;->n:J

    .line 10
    .line 11
    iput-object p7, p0, La/u0v;->o:La/jvn;

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
    new-instance v0, La/u0v;

    .line 2
    .line 3
    iget-wide v5, p0, La/u0v;->n:J

    .line 4
    .line 5
    iget-object v7, p0, La/u0v;->o:La/jvn;

    .line 6
    .line 7
    iget-object v1, p0, La/u0v;->j:La/daf;

    .line 8
    .line 9
    iget-boolean v2, p0, La/u0v;->k:Z

    .line 10
    .line 11
    iget-object v3, p0, La/u0v;->l:Ljava/util/List;

    .line 12
    .line 13
    iget-boolean v4, p0, La/u0v;->m:Z

    .line 14
    .line 15
    move-object v8, p2

    .line 16
    invoke-direct/range {v0 .. v8}, La/u0v;-><init>(La/daf;ZLjava/util/List;ZJLa/jvn;La/yje;)V

    .line 17
    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, La/u0v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/u0v;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/u0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/u0v;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-boolean v2, p0, La/u0v;->i:Z

    .line 25
    .line 26
    iget-object p1, p0, La/u0v;->j:La/daf;

    .line 27
    .line 28
    iget-boolean v1, p0, La/u0v;->k:Z

    .line 29
    .line 30
    iget-object v4, p0, La/u0v;->l:Ljava/util/List;

    .line 31
    .line 32
    iget-boolean v5, p0, La/u0v;->m:Z

    .line 33
    .line 34
    iget-wide v6, p0, La/u0v;->n:J

    .line 35
    .line 36
    iget-object v8, p0, La/u0v;->o:La/jvn;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    iget-object p1, p1, La/daf;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, La/yfu;

    .line 43
    .line 44
    iget-object p1, p1, La/yfu;->a:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v2, p1

    .line 47
    check-cast v2, La/h0q0;

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    move-object v9, p0

    .line 51
    invoke-virtual/range {v2 .. v9}, La/h0q0;->o(ILjava/util/List;ZJLa/jvn;La/zje;)Ljava/io/Serializable;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move-object v9, p0

    .line 57
    iget-object p0, p1, La/daf;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/n4u;

    .line 60
    .line 61
    iget-object p1, p1, La/daf;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, La/viu;

    .line 64
    .line 65
    invoke-virtual {p1}, La/viu;->a()J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    invoke-static {v1, v2}, La/ynq0;->f(J)J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    iget-object p0, p0, La/n4u;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, La/h0q0;

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    move-object v11, v9

    .line 79
    move-wide v9, v1

    .line 80
    move-object v2, p0

    .line 81
    invoke-virtual/range {v2 .. v11}, La/h0q0;->n(ILjava/util/List;ZJLa/jvn;JLa/zje;)Ljava/io/Serializable;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    :goto_0
    if-ne p0, v0, :cond_3

    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_3
    return-object p0
.end method
