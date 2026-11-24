.class public final synthetic La/mk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kb0;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/kb0;JLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/mk0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mk0;->b:La/kb0;

    iput-wide p2, p0, La/mk0;->c:J

    iput-object p4, p0, La/mk0;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(La/kb0;Ljava/lang/String;J)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/mk0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mk0;->b:La/kb0;

    iput-object p2, p0, La/mk0;->d:Ljava/lang/String;

    iput-wide p3, p0, La/mk0;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mk0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/mk0;->b:La/kb0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/k0w0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v2, La/kb0;->m:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, La/peg0;

    .line 20
    .line 21
    new-instance v3, La/jr1;

    .line 22
    .line 23
    invoke-direct {v3}, La/jr1;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v4, La/qm1;

    .line 27
    .line 28
    sget-object v7, La/s9s0;->a:La/s9s0;

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    iget-wide v5, v0, La/mk0;->c:J

    .line 32
    .line 33
    iget-object v8, v0, La/mk0;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct/range {v4 .. v9}, La/qm1;-><init>(JLa/s9s0;Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v0, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 42
    .line 43
    move-object v9, v4

    .line 44
    new-instance v4, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 45
    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    const/16 v17, 0x1f7

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    const-wide/16 v7, 0x0

    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    const-wide/16 v11, 0x0

    .line 56
    .line 57
    const-wide/16 v13, 0x0

    .line 58
    .line 59
    const/4 v15, 0x0

    .line 60
    invoke-direct/range {v4 .. v17}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v3, v4}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;-><init>(La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 67
    .line 68
    .line 69
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    move-object/from16 v1, p1

    .line 73
    .line 74
    check-cast v1, La/k0w0;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v2, v2, La/kb0;->m:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, La/peg0;

    .line 82
    .line 83
    new-instance v3, La/fr1;

    .line 84
    .line 85
    new-instance v4, La/fs80;

    .line 86
    .line 87
    sget-object v8, La/iun;->a:La/iun;

    .line 88
    .line 89
    const/4 v12, 0x0

    .line 90
    const/16 v13, 0x78

    .line 91
    .line 92
    iget-object v5, v0, La/mk0;->d:Ljava/lang/String;

    .line 93
    .line 94
    iget-wide v6, v0, La/mk0;->c:J

    .line 95
    .line 96
    const/4 v9, 0x0

    .line 97
    const-wide/16 v10, 0x0

    .line 98
    .line 99
    invoke-direct/range {v4 .. v13}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    const/4 v5, 0x2

    .line 104
    invoke-direct {v3, v4, v0, v5}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v3}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 112
    .line 113
    .line 114
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
