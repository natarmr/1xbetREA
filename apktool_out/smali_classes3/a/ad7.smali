.class public final synthetic La/ad7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Throwable;

.field public final synthetic c:La/kd7;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Throwable;La/kd7;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ad7;->a:B

    iput-object p1, p0, La/ad7;->b:Ljava/lang/Throwable;

    iput-object p2, p0, La/ad7;->c:La/kd7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ad7;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/ad7;->c:La/kd7;

    .line 6
    .line 7
    iget-object v0, v0, La/ad7;->b:Ljava/lang/Throwable;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v2, La/kd7;->s:La/ctf0;

    .line 13
    .line 14
    move-object/from16 v3, p1

    .line 15
    .line 16
    check-cast v3, Ljava/lang/Throwable;

    .line 17
    .line 18
    move-object/from16 v7, p2

    .line 19
    .line 20
    check-cast v7, Ljava/lang/String;

    .line 21
    .line 22
    sget-object v5, La/rek0;->b:La/rek0;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    instance-of v3, v0, Ljava/net/SocketTimeoutException;

    .line 31
    .line 32
    const v4, 0x7f1311ad

    .line 33
    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    instance-of v3, v0, Ljava/net/UnknownHostException;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    instance-of v3, v0, Ljavax/net/ssl/SSLHandshakeException;

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    instance-of v3, v0, Ljava/net/ConnectException;

    .line 50
    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    instance-of v0, v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    :goto_0
    new-instance v0, La/kc7;

    .line 59
    .line 60
    new-instance v8, La/xdk0;

    .line 61
    .line 62
    new-array v3, v6, [Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v7, v1, La/ctf0;->b:La/lsm0;

    .line 65
    .line 66
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v7, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    new-array v3, v6, [Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 77
    .line 78
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const v4, 0x7f13115d

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    const/4 v14, 0x0

    .line 90
    const/16 v15, 0x78

    .line 91
    .line 92
    const/4 v12, 0x0

    .line 93
    const/4 v13, 0x0

    .line 94
    move-object v9, v5

    .line 95
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v0, v8}, La/kc7;-><init>(La/xdk0;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    new-instance v0, La/kc7;

    .line 106
    .line 107
    new-instance v3, La/xdk0;

    .line 108
    .line 109
    new-array v8, v6, [Ljava/lang/Object;

    .line 110
    .line 111
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 112
    .line 113
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-virtual {v1, v4, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    const/4 v10, 0x0

    .line 122
    const/16 v11, 0x78

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    const/4 v9, 0x0

    .line 126
    move-object v4, v3

    .line 127
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 128
    .line 129
    .line 130
    invoke-direct {v0, v4}, La/kc7;-><init>(La/xdk0;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_0
    move-object/from16 v1, p1

    .line 140
    .line 141
    check-cast v1, Ljava/lang/Throwable;

    .line 142
    .line 143
    move-object/from16 v3, p2

    .line 144
    .line 145
    check-cast v3, Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    instance-of v1, v0, La/zhi0;

    .line 154
    .line 155
    if-eqz v1, :cond_5

    .line 156
    .line 157
    check-cast v0, La/zhi0;

    .line 158
    .line 159
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 160
    .line 161
    sget-object v1, La/i2o;->r:La/i2o;

    .line 162
    .line 163
    if-ne v0, v1, :cond_5

    .line 164
    .line 165
    sget-object v0, La/dc7;->a:La/dc7;

    .line 166
    .line 167
    invoke-virtual {v2, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
