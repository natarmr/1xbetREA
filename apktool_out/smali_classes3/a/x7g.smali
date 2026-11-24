.class public final synthetic La/x7g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y7g;


# direct methods
.method public synthetic constructor <init>(La/y7g;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x7g;->a:B

    iput-object p1, p0, La/x7g;->b:La/y7g;

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
    iget-byte v1, v0, La/x7g;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/x7g;->b:La/y7g;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Long;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    sget-object v1, La/y7g;->Q1:La/std;

    .line 19
    .line 20
    invoke-virtual {v0}, La/y7g;->H0()La/u8g;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, v3, La/u8g;->j:La/mne;

    .line 29
    .line 30
    iget-object v9, v1, La/mne;->a:La/rwj;

    .line 31
    .line 32
    new-instance v1, La/p8g;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, v3, v2}, La/p8g;-><init>(La/u8g;B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/ey;

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const/16 v7, 0xe

    .line 42
    .line 43
    invoke-direct/range {v2 .. v7}, La/ey;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 44
    .line 45
    .line 46
    const/16 v11, 0xa

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    move-object v6, v0

    .line 50
    move-object v7, v1

    .line 51
    move-object v10, v2

    .line 52
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 53
    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_0
    move-object/from16 v1, p1

    .line 59
    .line 60
    check-cast v1, La/i9g;

    .line 61
    .line 62
    sget-object v2, La/y7g;->Q1:La/std;

    .line 63
    .line 64
    const-class v2, La/v4g;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-nez v3, :cond_0

    .line 79
    .line 80
    sget-object v3, La/v4g;->l2:La/kud;

    .line 81
    .line 82
    new-instance v4, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 83
    .line 84
    iget-object v5, v1, La/i9g;->d:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v6, v1, La/i9g;->f:La/l7g;

    .line 87
    .line 88
    iget-object v7, v6, La/l7g;->a:Ljava/lang/String;

    .line 89
    .line 90
    move-object v8, v7

    .line 91
    iget-object v7, v6, La/l7g;->b:Ljava/lang/String;

    .line 92
    .line 93
    move-object v9, v8

    .line 94
    iget-object v8, v6, La/l7g;->c:Ljava/lang/String;

    .line 95
    .line 96
    move-object v10, v9

    .line 97
    iget-object v9, v6, La/l7g;->d:Ljava/lang/String;

    .line 98
    .line 99
    move-object v11, v10

    .line 100
    iget-object v10, v6, La/l7g;->e:Ljava/lang/String;

    .line 101
    .line 102
    move-object v13, v11

    .line 103
    iget-wide v11, v6, La/l7g;->f:J

    .line 104
    .line 105
    iget-wide v14, v6, La/l7g;->g:J

    .line 106
    .line 107
    move-object/from16 p0, v3

    .line 108
    .line 109
    move-object/from16 p1, v4

    .line 110
    .line 111
    iget-wide v3, v1, La/i9g;->a:J

    .line 112
    .line 113
    move-object v6, v13

    .line 114
    move-wide v13, v14

    .line 115
    move-wide v15, v3

    .line 116
    move-object/from16 v4, p1

    .line 117
    .line 118
    invoke-direct/range {v4 .. v16}, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v0, La/y7g;->P1:La/yzn0;

    .line 122
    .line 123
    sget-object v3, La/y7g;->R1:[La/iiy;

    .line 124
    .line 125
    const/4 v5, 0x2

    .line 126
    aget-object v3, v3, v5

    .line 127
    .line 128
    invoke-virtual {v1, v0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {v4, v1}, La/kud;->f(Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;Z)La/v4g;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v1, v0, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_0
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
