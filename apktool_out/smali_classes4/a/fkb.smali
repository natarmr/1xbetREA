.class public final synthetic La/fkb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nla;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/nla;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fkb;->a:B

    iput-object p1, p0, La/fkb;->b:La/nla;

    iput-object p2, p0, La/fkb;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/fkb;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/fkb;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/fkb;->b:La/nla;

    .line 6
    .line 7
    check-cast p1, La/bem;

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
    instance-of v0, p0, La/lla;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    instance-of v0, p1, La/wdm;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance p1, La/cyy;

    .line 24
    .line 25
    new-instance v0, La/hll0;

    .line 26
    .line 27
    check-cast p0, La/lla;

    .line 28
    .line 29
    invoke-interface {p0}, La/lla;->a()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-direct {v0, v2, v3}, La/hll0;-><init>(J)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, v0}, La/cyy;-><init>(La/ill0;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    instance-of v0, p1, La/rdm;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    instance-of p1, p1, La/xdm;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    :goto_0
    new-instance p1, La/cyy;

    .line 53
    .line 54
    new-instance v0, La/gll0;

    .line 55
    .line 56
    check-cast p0, La/lla;

    .line 57
    .line 58
    invoke-interface {p0}, La/lla;->a()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    invoke-direct {v0, v2, v3}, La/gll0;-><init>(J)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v0}, La/cyy;-><init>(La/ill0;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_2
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    instance-of v0, p0, La/lla;

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    instance-of v0, p1, La/wdm;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    new-instance p1, La/mjb;

    .line 86
    .line 87
    new-instance v0, La/hll0;

    .line 88
    .line 89
    check-cast p0, La/lla;

    .line 90
    .line 91
    invoke-interface {p0}, La/lla;->a()J

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    invoke-direct {v0, v2, v3}, La/hll0;-><init>(J)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p1, v0}, La/mjb;-><init>(La/ill0;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    instance-of v0, p1, La/rdm;

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    instance-of p1, p1, La/xdm;

    .line 111
    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    :goto_2
    new-instance p1, La/mjb;

    .line 115
    .line 116
    new-instance v0, La/gll0;

    .line 117
    .line 118
    check-cast p0, La/lla;

    .line 119
    .line 120
    invoke-interface {p0}, La/lla;->a()J

    .line 121
    .line 122
    .line 123
    move-result-wide v2

    .line 124
    invoke-direct {v0, v2, v3}, La/gll0;-><init>(J)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p1, v0}, La/mjb;-><init>(La/ill0;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
