.class public final La/hr0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public final synthetic k:J


# direct methods
.method public constructor <init>(JLa/yje;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/hr0;->k:J

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    new-instance p2, La/hr0;

    .line 8
    .line 9
    iget-wide v0, p0, La/hr0;->k:J

    .line 10
    .line 11
    invoke-direct {p2, v0, v1, p3}, La/hr0;-><init>(JLa/yje;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p2, La/hr0;->j:La/kmq;

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p2, p0}, La/hr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/hr0;->j:La/kmq;

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, p0, La/hr0;->i:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    if-eq v2, v4, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x2

    .line 14
    if-ne v2, p0, :cond_1

    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, La/nh1;

    .line 30
    .line 31
    new-instance v2, La/ezc0;

    .line 32
    .line 33
    const-string v5, "0"

    .line 34
    .line 35
    const-string v6, "ALL_FILTER_DEFAULT_CHIP"

    .line 36
    .line 37
    invoke-direct {v2, v5, v6, v4}, La/ezc0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-wide v5, p0, La/hr0;->k:J

    .line 45
    .line 46
    invoke-direct {p1, v5, v6, v2}, La/nh1;-><init>(JLjava/util/List;)V

    .line 47
    .line 48
    .line 49
    iput-object v3, p0, La/hr0;->j:La/kmq;

    .line 50
    .line 51
    iput-byte v4, p0, La/hr0;->i:B

    .line 52
    .line 53
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-ne p0, v1, :cond_3

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_3
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0
.end method
