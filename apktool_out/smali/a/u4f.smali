.class public final synthetic La/u4f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r7f;


# direct methods
.method public synthetic constructor <init>(La/r7f;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u4f;->a:B

    iput-object p1, p0, La/u4f;->b:La/r7f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u4f;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Throwable;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v5, v0, La/u4f;->b:La/r7f;

    .line 23
    .line 24
    iget-object v0, v5, La/r7f;->Y0:La/mne;

    .line 25
    .line 26
    instance-of v2, v1, Ljava/net/UnknownHostException;

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    iget-object v1, v5, La/r7f;->Z1:La/p7m0;

    .line 32
    .line 33
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v2, La/aje;->a:La/aje;

    .line 38
    .line 39
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_5

    .line 44
    .line 45
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    iget-object v15, v0, La/mne;->b:La/dvj;

    .line 50
    .line 51
    sget-object v13, La/l7f;->a:La/l7f;

    .line 52
    .line 53
    new-instance v0, La/a6f;

    .line 54
    .line 55
    const/4 v1, 0x7

    .line 56
    invoke-direct {v0, v5, v11, v1}, La/a6f;-><init>(La/r7f;La/yje;B)V

    .line 57
    .line 58
    .line 59
    const/16 v17, 0xa

    .line 60
    .line 61
    const/4 v14, 0x0

    .line 62
    move-object/from16 v16, v0

    .line 63
    .line 64
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_0
    instance-of v2, v1, La/j7t0;

    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    instance-of v2, v1, La/zhi0;

    .line 74
    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    move-object v2, v1

    .line 78
    check-cast v2, La/zhi0;

    .line 79
    .line 80
    iget-object v2, v2, La/zhi0;->c:La/kuw;

    .line 81
    .line 82
    sget-object v3, La/i2o;->y:La/i2o;

    .line 83
    .line 84
    if-ne v2, v3, :cond_2

    .line 85
    .line 86
    iget-object v0, v5, La/r7f;->m1:La/tqc;

    .line 87
    .line 88
    iget-object v0, v0, La/tqc;->a:La/g45;

    .line 89
    .line 90
    iget-object v0, v0, La/g45;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, La/ave;

    .line 93
    .line 94
    const-wide/16 v2, 0x0

    .line 95
    .line 96
    iput-wide v2, v0, La/ave;->g:D

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    sget-object v3, La/i2o;->J2:La/i2o;

    .line 100
    .line 101
    if-ne v2, v3, :cond_3

    .line 102
    .line 103
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    iget-object v15, v0, La/mne;->b:La/dvj;

    .line 108
    .line 109
    new-instance v13, La/z6e;

    .line 110
    .line 111
    const/4 v9, 0x0

    .line 112
    const/16 v10, 0x1d

    .line 113
    .line 114
    const/4 v4, 0x1

    .line 115
    const-class v6, La/r7f;

    .line 116
    .line 117
    const-string v7, "showSnackBarError"

    .line 118
    .line 119
    const-string v8, "showSnackBarError(Ljava/lang/Throwable;)V"

    .line 120
    .line 121
    move-object v3, v13

    .line 122
    invoke-direct/range {v3 .. v10}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 123
    .line 124
    .line 125
    new-instance v0, La/d5f;

    .line 126
    .line 127
    const/4 v2, 0x5

    .line 128
    invoke-direct {v0, v5, v11, v2}, La/d5f;-><init>(La/r7f;La/yje;B)V

    .line 129
    .line 130
    .line 131
    const/16 v17, 0xa

    .line 132
    .line 133
    const/4 v14, 0x0

    .line 134
    move-object/from16 v16, v0

    .line 135
    .line 136
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 137
    .line 138
    .line 139
    :cond_3
    :goto_0
    invoke-virtual {v5, v1}, La/r7f;->f0(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_4
    invoke-virtual {v5, v1}, La/r7f;->f0(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_0
    move-object/from16 v1, p1

    .line 150
    .line 151
    check-cast v1, Ljava/lang/Throwable;

    .line 152
    .line 153
    move-object/from16 v2, p2

    .line 154
    .line 155
    check-cast v2, Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance v1, La/a4f;

    .line 164
    .line 165
    sget-object v3, La/rek0;->b:La/rek0;

    .line 166
    .line 167
    const-string v4, ""

    .line 168
    .line 169
    invoke-direct {v1, v2, v4, v3}, La/a4f;-><init>(Ljava/lang/String;Ljava/lang/String;La/sek0;)V

    .line 170
    .line 171
    .line 172
    iget-object v0, v0, La/u4f;->b:La/r7f;

    .line 173
    .line 174
    invoke-virtual {v0, v1}, La/r7f;->R(La/c4f;)V

    .line 175
    .line 176
    .line 177
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object v0

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
