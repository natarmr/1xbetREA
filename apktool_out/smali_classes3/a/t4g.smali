.class public final synthetic La/t4g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v4g;


# direct methods
.method public synthetic constructor <init>(La/v4g;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t4g;->a:B

    iput-object p1, p0, La/t4g;->b:La/v4g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-byte p1, p0, La/t4g;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/t4g;->b:La/v4g;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/v4g;->l2:La/kud;

    .line 9
    .line 10
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, La/v4g;->i2:La/kiu0;

    .line 15
    .line 16
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, La/x4g;

    .line 21
    .line 22
    iget-object v0, p1, La/x4g;->b:La/hzg;

    .line 23
    .line 24
    iget-object v1, p1, La/x4g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 25
    .line 26
    iget-object v2, p1, La/x4g;->f:La/luu;

    .line 27
    .line 28
    iget-object v2, v2, La/luu;->a:La/nok0;

    .line 29
    .line 30
    invoke-virtual {v2}, La/nok0;->a()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    move-object v4, v3

    .line 49
    check-cast v4, La/lok0;

    .line 50
    .line 51
    iget v5, v4, La/lok0;->a:I

    .line 52
    .line 53
    int-to-long v5, v5

    .line 54
    iget-wide v7, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->i:J

    .line 55
    .line 56
    cmp-long v5, v5, v7

    .line 57
    .line 58
    if-nez v5, :cond_0

    .line 59
    .line 60
    iget-object v4, v4, La/lok0;->t:Ljava/util/List;

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    const/4 v3, 0x0

    .line 75
    :goto_0
    check-cast v3, La/lok0;

    .line 76
    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    iget p1, v3, La/lok0;->a:I

    .line 80
    .line 81
    int-to-long v1, p1

    .line 82
    iget-object p1, v3, La/lok0;->b:Ljava/lang/String;

    .line 83
    .line 84
    check-cast v0, La/uzg;

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2, p1}, La/uzg;->o(JLjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    iget-boolean v2, p1, La/x4g;->e:Z

    .line 91
    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    iget-object v0, p1, La/x4g;->d:La/oeg0;

    .line 95
    .line 96
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object p1, p1, La/x4g;->g:La/kys0;

    .line 105
    .line 106
    iget-wide v3, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->g:J

    .line 107
    .line 108
    iget-object v1, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->a:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p1, v3, v4, v1}, La/kys0;->d(JLjava/lang/String;)Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {v2, p1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 115
    .line 116
    .line 117
    iget-object p1, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    invoke-static {v0, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :goto_1
    move-object v1, p1

    .line 125
    check-cast v1, La/paw;

    .line 126
    .line 127
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_4

    .line 132
    .line 133
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, La/oe50;

    .line 138
    .line 139
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    iget-wide v4, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->h:J

    .line 144
    .line 145
    iget-wide v6, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->g:J

    .line 146
    .line 147
    iget-object v3, v1, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;->a:Ljava/lang/String;

    .line 148
    .line 149
    sget-object p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 150
    .line 151
    iget-byte v8, p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 152
    .line 153
    sget-object p1, La/k1g;->b:La/k1g;

    .line 154
    .line 155
    move-object v2, v0

    .line 156
    check-cast v2, La/uzg;

    .line 157
    .line 158
    invoke-virtual/range {v2 .. v8}, La/uzg;->f(Ljava/lang/String;JJI)V

    .line 159
    .line 160
    .line 161
    :cond_4
    :goto_2
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
