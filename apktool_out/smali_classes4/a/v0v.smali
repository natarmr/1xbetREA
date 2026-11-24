.class public final La/v0v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:J

.field public final synthetic m:La/daf;

.field public final synthetic n:Z

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:Z

.field public final synthetic q:J


# direct methods
.method public constructor <init>(La/yje;JLa/daf;ZLjava/util/List;ZJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, La/v0v;->l:J

    .line 2
    .line 3
    iput-object p4, p0, La/v0v;->m:La/daf;

    .line 4
    .line 5
    iput-boolean p5, p0, La/v0v;->n:Z

    .line 6
    .line 7
    iput-object p6, p0, La/v0v;->o:Ljava/util/List;

    .line 8
    .line 9
    iput-boolean p7, p0, La/v0v;->p:Z

    .line 10
    .line 11
    iput-wide p8, p0, La/v0v;->q:J

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
    .locals 10

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/v0v;

    .line 7
    .line 8
    iget-boolean v7, p0, La/v0v;->p:Z

    .line 9
    .line 10
    iget-wide v8, p0, La/v0v;->q:J

    .line 11
    .line 12
    iget-wide v2, p0, La/v0v;->l:J

    .line 13
    .line 14
    iget-object v4, p0, La/v0v;->m:La/daf;

    .line 15
    .line 16
    iget-boolean v5, p0, La/v0v;->n:Z

    .line 17
    .line 18
    iget-object v6, p0, La/v0v;->o:Ljava/util/List;

    .line 19
    .line 20
    invoke-direct/range {v0 .. v9}, La/v0v;-><init>(La/yje;JLa/daf;ZLjava/util/List;ZJ)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/v0v;->j:La/kmq;

    .line 24
    .line 25
    iput-object p2, v0, La/v0v;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, La/v0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/v0v;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/v0v;->j:La/kmq;

    .line 25
    .line 26
    iget-object v1, p0, La/v0v;->k:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v11, v1

    .line 29
    check-cast v11, La/jvn;

    .line 30
    .line 31
    new-instance v4, La/u0v;

    .line 32
    .line 33
    iget-wide v9, p0, La/v0v;->q:J

    .line 34
    .line 35
    const/4 v12, 0x0

    .line 36
    iget-object v5, p0, La/v0v;->m:La/daf;

    .line 37
    .line 38
    iget-boolean v6, p0, La/v0v;->n:Z

    .line 39
    .line 40
    iget-object v7, p0, La/v0v;->o:Ljava/util/List;

    .line 41
    .line 42
    iget-boolean v8, p0, La/v0v;->p:Z

    .line 43
    .line 44
    invoke-direct/range {v4 .. v12}, La/u0v;-><init>(La/daf;ZLjava/util/List;ZJLa/jvn;La/yje;)V

    .line 45
    .line 46
    .line 47
    iget-wide v5, p0, La/v0v;->l:J

    .line 48
    .line 49
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 50
    .line 51
    invoke-static {v5, v6, v1, v4}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iput-object v2, p0, La/v0v;->j:La/kmq;

    .line 56
    .line 57
    iput-object v2, p0, La/v0v;->k:Ljava/lang/Object;

    .line 58
    .line 59
    iput-boolean v3, p0, La/v0v;->i:Z

    .line 60
    .line 61
    invoke-static {p1, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, v0, :cond_2

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0
.end method
