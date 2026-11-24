.class public final La/d2v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/zpu;

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(La/yje;La/zpu;ZZZ)V
    .locals 0

    .line 1
    iput-object p2, p0, La/d2v;->l:La/zpu;

    .line 2
    .line 3
    iput-boolean p3, p0, La/d2v;->m:Z

    .line 4
    .line 5
    iput-boolean p4, p0, La/d2v;->n:Z

    .line 6
    .line 7
    iput-boolean p5, p0, La/d2v;->o:Z

    .line 8
    .line 9
    const/4 p2, 0x3

    .line 10
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/d2v;

    .line 7
    .line 8
    iget-boolean v4, p0, La/d2v;->n:Z

    .line 9
    .line 10
    iget-boolean v5, p0, La/d2v;->o:Z

    .line 11
    .line 12
    iget-object v2, p0, La/d2v;->l:La/zpu;

    .line 13
    .line 14
    iget-boolean v3, p0, La/d2v;->m:Z

    .line 15
    .line 16
    invoke-direct/range {v0 .. v5}, La/d2v;-><init>(La/yje;La/zpu;ZZZ)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/d2v;->j:La/kmq;

    .line 20
    .line 21
    iput-object p2, v0, La/d2v;->k:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, La/d2v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/d2v;->i:Z

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
    iget-object p1, p0, La/d2v;->j:La/kmq;

    .line 25
    .line 26
    iget-object v1, p0, La/d2v;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    iget-object v1, p0, La/d2v;->l:La/zpu;

    .line 35
    .line 36
    iget-object v1, v1, La/zpu;->b:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v4, v1

    .line 39
    check-cast v4, La/rrd;

    .line 40
    .line 41
    iget-boolean v8, p0, La/d2v;->o:Z

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    iget-boolean v5, p0, La/d2v;->m:Z

    .line 45
    .line 46
    iget-boolean v7, p0, La/d2v;->n:Z

    .line 47
    .line 48
    invoke-virtual/range {v4 .. v9}, La/rrd;->v(ZZZZLkotlin/jvm/functions/Function1;)La/utb;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput-object v2, p0, La/d2v;->j:La/kmq;

    .line 53
    .line 54
    iput-object v2, p0, La/d2v;->k:Ljava/lang/Object;

    .line 55
    .line 56
    iput-boolean v3, p0, La/d2v;->i:Z

    .line 57
    .line 58
    invoke-static {p1, v1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v0, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0
.end method
