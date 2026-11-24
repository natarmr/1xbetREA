.class public final synthetic La/h940;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m940;

.field public final synthetic c:La/t440;


# direct methods
.method public synthetic constructor <init>(La/m940;La/t440;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h940;->a:B

    iput-object p1, p0, La/h940;->b:La/m940;

    iput-object p2, p0, La/h940;->c:La/t440;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/h940;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/h940;->c:La/t440;

    .line 4
    .line 5
    iget-object p0, p0, La/h940;->b:La/m940;

    .line 6
    .line 7
    check-cast p1, La/k0w0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/m940;->u:La/peg0;

    .line 16
    .line 17
    new-instance v0, La/jr1;

    .line 18
    .line 19
    new-instance v2, La/evc0;

    .line 20
    .line 21
    check-cast v1, La/h440;

    .line 22
    .line 23
    iget-wide v3, v1, La/h440;->a:J

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v2, v1, v3, v4}, La/evc0;-><init>(ZJ)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, La/m940;->u:La/peg0;

    .line 46
    .line 47
    new-instance v0, La/fr1;

    .line 48
    .line 49
    new-instance v2, La/fs80;

    .line 50
    .line 51
    check-cast v1, La/g440;

    .line 52
    .line 53
    iget-wide v4, v1, La/g440;->a:J

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    const/16 v11, 0x7d

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const-wide/16 v8, 0x0

    .line 62
    .line 63
    invoke-direct/range {v2 .. v11}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 64
    .line 65
    .line 66
    sget-object v1, La/q91;->d:La/q91;

    .line 67
    .line 68
    invoke-direct {v0, v2, v1}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, La/m940;->u:La/peg0;

    .line 85
    .line 86
    new-instance v0, La/fr1;

    .line 87
    .line 88
    new-instance v2, La/fs80;

    .line 89
    .line 90
    check-cast v1, La/d440;

    .line 91
    .line 92
    iget-wide v4, v1, La/d440;->b:J

    .line 93
    .line 94
    iget-wide v6, v1, La/d440;->a:J

    .line 95
    .line 96
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    const/4 v10, 0x0

    .line 105
    const/16 v11, 0x75

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    const/4 v6, 0x0

    .line 109
    const-wide/16 v8, 0x0

    .line 110
    .line 111
    invoke-direct/range {v2 .. v11}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 112
    .line 113
    .line 114
    sget-object v1, La/q91;->d:La/q91;

    .line 115
    .line 116
    invoke-direct {v0, v2, v1}, La/fr1;-><init>(La/fs80;La/q91;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
