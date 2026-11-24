.class public final La/e4i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/h4i0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-wide v0, p1, La/h4i0;->a:J

    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 13
    .line 14
    .line 15
    new-instance v4, Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;

    .line 16
    .line 17
    const/16 v2, 0xb

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Ljava/util/Calendar;->get(I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/16 v3, 0xc

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Ljava/util/Calendar;->get(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v4, v2, v3}, Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;-><init>(II)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p1, La/h4i0;->c:Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    instance-of v5, v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$Interval;

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    move-object v6, v2

    .line 42
    check-cast v6, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$Interval;

    .line 43
    .line 44
    iget-object v6, v6, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$Interval;->a:Ljava/util/Date;

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    invoke-static {v6, v7, p0}, La/bsr0;->h0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    instance-of v6, v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$SingleDate;

    .line 56
    .line 57
    if-eqz v6, :cond_3

    .line 58
    .line 59
    move-object v6, v2

    .line 60
    check-cast v6, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$SingleDate;

    .line 61
    .line 62
    iget-object v6, v6, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$SingleDate;->a:Ljava/util/Date;

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    invoke-static {v6, v7, p0}, La/bsr0;->h0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    :goto_0
    if-eqz v5, :cond_1

    .line 73
    .line 74
    check-cast v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$Interval;

    .line 75
    .line 76
    iget-object v2, v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$Interval;->b:Ljava/util/Date;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    invoke-static {v2, v3, p0}, La/bsr0;->h0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    :goto_1
    move-object v7, v3

    .line 87
    goto :goto_2

    .line 88
    :cond_1
    instance-of v2, v2, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate$SingleDate;

    .line 89
    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :goto_2
    new-instance v2, La/d4i0;

    .line 94
    .line 95
    sget-object v3, La/yg40;->b:La/yg40;

    .line 96
    .line 97
    invoke-static {v0, v1, p0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget-wide v0, p1, La/h4i0;->b:J

    .line 102
    .line 103
    invoke-static {v0, v1, p0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    iget-object v8, p1, La/h4i0;->d:Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct/range {v2 .. v8}, La/d4i0;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v2

    .line 113
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 114
    .line 115
    .line 116
    return-object v3

    .line 117
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 118
    .line 119
    .line 120
    return-object v3
.end method
