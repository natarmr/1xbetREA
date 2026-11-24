.class public final synthetic La/zcj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/Calendar;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Calendar;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zcj;->a:B

    iput-object p1, p0, La/zcj;->b:Ljava/util/Calendar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/zcj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/zcj;->b:Ljava/util/Calendar;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, [J

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    aget-wide v2, p1, v2

    .line 16
    .line 17
    invoke-static {v2, v3, p0}, La/bsr0;->h0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    aget-wide v1, p1, v1

    .line 22
    .line 23
    invoke-static {v1, v2, p0}, La/bsr0;->h0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance p1, La/xk9;

    .line 28
    .line 29
    invoke-direct {p1, v0, p0}, La/xk9;-><init>(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_0
    check-cast p1, [J

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    aget-wide v2, p1, v2

    .line 39
    .line 40
    invoke-static {v2, v3, p0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    aget-wide v1, p1, v1

    .line 45
    .line 46
    invoke-static {v1, v2, p0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance p1, La/wk9;

    .line 51
    .line 52
    invoke-direct {p1, v0, p0}, La/wk9;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v3, 0x2

    .line 66
    const/4 v4, 0x0

    .line 67
    if-ge v0, v3, :cond_0

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Ljava/lang/Long;

    .line 75
    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    invoke-static {v2, v3, p0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    move-object v0, v4

    .line 88
    :goto_0
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Ljava/lang/Long;

    .line 93
    .line 94
    if-eqz p1, :cond_2

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v1

    .line 100
    invoke-static {v1, v2, p0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    goto :goto_1

    .line 105
    :cond_2
    move-object p0, v4

    .line 106
    :goto_1
    if-nez v0, :cond_3

    .line 107
    .line 108
    if-nez p0, :cond_3

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    new-instance v4, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 112
    .line 113
    invoke-direct {v4, v0, p0}, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    return-object v4

    .line 117
    :pswitch_2
    check-cast p1, Ljava/lang/Long;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    invoke-static {v0, v1, p0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
