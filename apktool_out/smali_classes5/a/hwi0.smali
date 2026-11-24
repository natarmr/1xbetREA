.class public final synthetic La/hwi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/hwi0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte p0, p0, La/hwi0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    throw v0

    .line 9
    :pswitch_0
    new-instance p0, La/g0o;

    .line 10
    .line 11
    sget-object v0, La/wbk0;->INSTANCE:La/wbk0;

    .line 12
    .line 13
    new-array v1, v1, [Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    const-string v2, "org.xplatform.onexuser.data.models.accountchange.sms.SmsCodeRequest.DataRequest.SmsDataRequestRequest"

    .line 16
    .line 17
    invoke-direct {p0, v2, v0, v1}, La/g0o;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_1
    new-instance p0, La/g0o;

    .line 22
    .line 23
    sget-object v0, La/sbk0;->INSTANCE:La/sbk0;

    .line 24
    .line 25
    new-array v1, v1, [Ljava/lang/annotation/Annotation;

    .line 26
    .line 27
    const-string v2, "org.xplatform.onexuser.data.models.accountchange.sms.SmsCodeRequest.DataRequest.EmptyDataRequest"

    .line 28
    .line 29
    invoke-direct {p0, v2, v0, v1}, La/g0o;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_2
    sget-object p0, La/dck0;->Companion:La/rbk0;

    .line 34
    .line 35
    invoke-virtual {p0}, La/rbk0;->serializer()La/jiy;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_4
    sget-object p0, La/dak0;->a:La/zsf;

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    const/16 v2, 0x1f4

    .line 47
    .line 48
    invoke-static {v2, v1, p0, v0}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_5
    new-instance p0, La/z3k0;

    .line 54
    .line 55
    invoke-direct {p0, v1}, La/z3k0;-><init>(Z)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_6
    sget p0, La/l2k0;->J:I

    .line 60
    .line 61
    sget-object p0, La/nh5;->a:La/nh5;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_7
    new-instance p0, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 65
    .line 66
    invoke-direct {p0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 67
    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_8
    new-instance p0, La/zw3;

    .line 71
    .line 72
    sget-object v0, La/ctj0;->a:La/ctj0;

    .line 73
    .line 74
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_9
    new-instance p0, La/zw3;

    .line 79
    .line 80
    sget-object v0, La/o9a0;->a:La/o9a0;

    .line 81
    .line 82
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_a
    new-instance p0, La/zw3;

    .line 87
    .line 88
    sget-object v0, La/whp0;->a:La/whp0;

    .line 89
    .line 90
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_b
    new-instance p0, La/zw3;

    .line 95
    .line 96
    sget-object v0, La/irj0;->a:La/irj0;

    .line 97
    .line 98
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 99
    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_c
    new-instance p0, La/zw3;

    .line 103
    .line 104
    sget-object v0, La/me90;->a:La/me90;

    .line 105
    .line 106
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 107
    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_d
    new-instance p0, La/zw3;

    .line 111
    .line 112
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 113
    .line 114
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 115
    .line 116
    .line 117
    return-object p0

    .line 118
    :pswitch_e
    new-instance p0, La/zw3;

    .line 119
    .line 120
    sget-object v0, La/fss;->a:La/fss;

    .line 121
    .line 122
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 123
    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_10
    return-object v0

    .line 130
    :pswitch_11
    new-instance p0, La/rnj0;

    .line 131
    .line 132
    const/4 v2, 0x1

    .line 133
    invoke-direct {p0, v0, v2, v1, v1}, La/rnj0;-><init>(Ljava/io/File;ZZZ)V

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_13
    new-instance p0, La/dlj0;

    .line 141
    .line 142
    invoke-direct {p0}, La/dlj0;-><init>()V

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_14
    new-instance p0, La/zw3;

    .line 147
    .line 148
    sget-object v0, La/moa;->a:La/moa;

    .line 149
    .line 150
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 151
    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_15
    new-instance p0, La/zw3;

    .line 155
    .line 156
    sget-object v0, La/moa;->a:La/moa;

    .line 157
    .line 158
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 159
    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_16
    sget-object p0, La/qbj0;->Z1:La/lme0;

    .line 163
    .line 164
    new-instance p0, La/adz;

    .line 165
    .line 166
    invoke-direct {p0}, La/adz;-><init>()V

    .line 167
    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_17
    new-instance p0, La/s6j0;

    .line 171
    .line 172
    invoke-direct {p0, v1, v1, v1}, La/s6j0;-><init>(ZZZ)V

    .line 173
    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_18
    new-instance p0, La/zw3;

    .line 177
    .line 178
    sget-object v0, La/okx;->a:La/okx;

    .line 179
    .line 180
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 181
    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_19
    new-instance p0, La/zw3;

    .line 185
    .line 186
    sget-object v0, La/okx;->a:La/okx;

    .line 187
    .line 188
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 189
    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 193
    .line 194
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 195
    .line 196
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 197
    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_1b
    new-instance p0, La/zw3;

    .line 201
    .line 202
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 203
    .line 204
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 205
    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_1c
    new-instance p0, La/zw3;

    .line 209
    .line 210
    sget-object v0, La/okx;->a:La/okx;

    .line 211
    .line 212
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 213
    .line 214
    .line 215
    return-object p0

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
