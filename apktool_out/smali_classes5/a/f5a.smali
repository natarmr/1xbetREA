.class public final La/f5a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pzu;


# direct methods
.method public synthetic constructor <init>(La/pzu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/f5a;->a:La/pzu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;La/bnn0;)Ljava/io/Serializable;
    .locals 1

    .line 1
    new-instance v0, La/q100;

    .line 2
    .line 3
    iget p2, p2, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->a:I

    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, La/q100;-><init>(II)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p0, p0, La/f5a;->a:La/pzu;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3}, La/pzu;->q0(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public b(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/mtu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/mtu;

    .line 7
    .line 8
    iget v1, v0, La/mtu;->k:I

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
    iput v1, v0, La/mtu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/mtu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/mtu;-><init>(La/f5a;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/mtu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/mtu;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v4, v0, La/mtu;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/f5a;->a:La/pzu;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, La/pzu;->E(La/zje;)Ljava/io/Serializable;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    move-object v0, p1

    .line 78
    check-cast v0, La/h85;

    .line 79
    .line 80
    iget-object v0, v0, La/h85;->b:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 81
    .line 82
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->k:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 83
    .line 84
    if-ne v0, v1, :cond_4

    .line 85
    .line 86
    move-object v3, p1

    .line 87
    :cond_5
    if-eqz v3, :cond_6

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    const/4 v4, 0x0

    .line 91
    :goto_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method
