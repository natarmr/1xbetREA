.class public final synthetic La/lk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kb0;


# direct methods
.method public synthetic constructor <init>(La/kb0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lk0;->a:B

    iput-object p1, p0, La/lk0;->b:La/kb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/lk0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/lk0;->b:La/kb0;

    .line 4
    .line 5
    check-cast p1, La/k0w0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/kb0;->m:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/peg0;

    .line 16
    .line 17
    new-instance v0, La/jr1;

    .line 18
    .line 19
    new-instance v1, La/evc0;

    .line 20
    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v1, v4, v2, v3}, La/evc0;-><init>(ZJ)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1}, La/jr1;-><init>(La/fvc0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, La/kb0;->m:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, La/peg0;

    .line 46
    .line 47
    new-instance v0, La/hr1;

    .line 48
    .line 49
    sget-object v1, La/s0s;->b:La/s0s;

    .line 50
    .line 51
    const-wide/16 v1, -0x1

    .line 52
    .line 53
    const/4 v3, 0x2

    .line 54
    invoke-direct {v0, v1, v2, v3}, La/hr1;-><init>(JI)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, La/kb0;->m:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, La/peg0;

    .line 73
    .line 74
    new-instance v0, La/fr1;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    const/4 v2, 0x3

    .line 78
    invoke-direct {v0, v1, v1, v2}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 86
    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
