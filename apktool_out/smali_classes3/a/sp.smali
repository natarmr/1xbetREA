.class public final La/sp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rrd;


# direct methods
.method public synthetic constructor <init>(La/rrd;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/sp;->a:La/rrd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/cpx;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/cpx;

    .line 7
    .line 8
    iget v1, v0, La/cpx;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/cpx;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cpx;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/cpx;-><init>(La/sp;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/cpx;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/cpx;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p3, La/tl5;->c:La/tl5;

    .line 51
    .line 52
    iput v3, v0, La/cpx;->k:I

    .line 53
    .line 54
    iget-object p0, p0, La/sp;->a:La/rrd;

    .line 55
    .line 56
    invoke-virtual {p0, p1, p2, p3, v0}, La/rrd;->g(JLa/tl5;La/yje;)Ljava/io/Serializable;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    if-ne p3, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    check-cast p3, La/ql5;

    .line 64
    .line 65
    iget-object p0, p3, La/ql5;->i:La/txs0;

    .line 66
    .line 67
    invoke-virtual {p0}, La/txs0;->a()Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    xor-int/2addr p0, v3

    .line 72
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method

.method public b(La/ql5;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/sp;->a:La/rrd;

    .line 5
    .line 6
    iget-object p0, p0, La/rrd;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/tg5;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La/tg5;->c(La/ql5;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, La/tg5;->c:J

    .line 18
    .line 19
    return-void
.end method
