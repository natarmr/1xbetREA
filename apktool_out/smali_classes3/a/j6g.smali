.class public final synthetic La/j6g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l6g;


# direct methods
.method public synthetic constructor <init>(La/l6g;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j6g;->a:B

    iput-object p1, p0, La/j6g;->b:La/l6g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j6g;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/j6g;->b:La/l6g;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/i9g;

    .line 13
    .line 14
    sget-object v2, La/l6g;->Q1:La/kwd;

    .line 15
    .line 16
    const-class v2, La/v4g;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    sget-object v3, La/v4g;->l2:La/kud;

    .line 33
    .line 34
    new-instance v4, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 35
    .line 36
    iget-object v5, v1, La/i9g;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v6, v1, La/i9g;->f:La/l7g;

    .line 39
    .line 40
    iget-object v7, v6, La/l7g;->a:Ljava/lang/String;

    .line 41
    .line 42
    move-object v8, v7

    .line 43
    iget-object v7, v6, La/l7g;->b:Ljava/lang/String;

    .line 44
    .line 45
    move-object v9, v8

    .line 46
    iget-object v8, v6, La/l7g;->c:Ljava/lang/String;

    .line 47
    .line 48
    move-object v10, v9

    .line 49
    iget-object v9, v6, La/l7g;->d:Ljava/lang/String;

    .line 50
    .line 51
    move-object v11, v10

    .line 52
    iget-object v10, v6, La/l7g;->e:Ljava/lang/String;

    .line 53
    .line 54
    move-object v13, v11

    .line 55
    iget-wide v11, v6, La/l7g;->f:J

    .line 56
    .line 57
    iget-wide v14, v6, La/l7g;->g:J

    .line 58
    .line 59
    move-object/from16 p0, v3

    .line 60
    .line 61
    move-object/from16 p1, v4

    .line 62
    .line 63
    iget-wide v3, v1, La/i9g;->a:J

    .line 64
    .line 65
    move-object v6, v13

    .line 66
    move-wide v13, v14

    .line 67
    move-wide v15, v3

    .line 68
    move-object/from16 v4, p1

    .line 69
    .line 70
    invoke-direct/range {v4 .. v16}, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v0, La/l6g;->P1:La/yzn0;

    .line 74
    .line 75
    sget-object v3, La/l6g;->R1:[La/iiy;

    .line 76
    .line 77
    const/4 v5, 0x2

    .line 78
    aget-object v3, v3, v5

    .line 79
    .line 80
    invoke-virtual {v1, v0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v4, v1}, La/kud;->f(Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;Z)La/v4g;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v1, v0, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_0
    move-object/from16 v1, p1

    .line 108
    .line 109
    check-cast v1, Ljava/lang/Long;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v4

    .line 115
    sget-object v1, La/l6g;->Q1:La/kwd;

    .line 116
    .line 117
    invoke-virtual {v0}, La/l6g;->H0()La/w6g;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v1, v3, La/w6g;->j:La/mne;

    .line 126
    .line 127
    iget-object v9, v1, La/mne;->a:La/rwj;

    .line 128
    .line 129
    new-instance v1, La/s6g;

    .line 130
    .line 131
    const/4 v2, 0x0

    .line 132
    invoke-direct {v1, v3, v2}, La/s6g;-><init>(La/w6g;B)V

    .line 133
    .line 134
    .line 135
    new-instance v2, La/ey;

    .line 136
    .line 137
    const/4 v6, 0x0

    .line 138
    const/16 v7, 0xd

    .line 139
    .line 140
    invoke-direct/range {v2 .. v7}, La/ey;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 141
    .line 142
    .line 143
    const/16 v11, 0xa

    .line 144
    .line 145
    const/4 v8, 0x0

    .line 146
    move-object v6, v0

    .line 147
    move-object v7, v1

    .line 148
    move-object v10, v2

    .line 149
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 150
    .line 151
    .line 152
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
