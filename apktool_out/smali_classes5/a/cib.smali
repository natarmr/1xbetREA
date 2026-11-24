.class public final La/cib;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vby;

.field public final b:La/lya;


# direct methods
.method public constructor <init>(La/vby;La/lya;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/cib;->a:La/vby;

    .line 8
    .line 9
    iput-object p2, p0, La/cib;->b:La/lya;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final postMessage(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, La/cib;->a:La/vby;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    :try_start_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v1, La/h740;->Companion:La/e740;

    .line 13
    .line 14
    invoke-virtual {v1}, La/e740;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, La/h740;

    .line 25
    .line 26
    iget-object v1, v1, La/h740;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 31
    .line 32
    new-instance v2, La/g0g0;

    .line 33
    .line 34
    invoke-direct {v2, v1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v1, v2

    .line 38
    :goto_0
    nop

    .line 39
    instance-of v2, v1, La/g0g0;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    move-object v1, v3

    .line 45
    :cond_1
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iget-object p0, p0, La/cib;->b:La/lya;

    .line 56
    .line 57
    sparse-switch v2, :sswitch_data_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :sswitch_0
    const-string p1, "IFRAME_OPEN_PROMO_STORE"

    .line 63
    .line 64
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_3
    const-string p1, "://open/promoshop"

    .line 73
    .line 74
    invoke-virtual {p0, p1}, La/lya;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :sswitch_1
    const-string p1, "IFRAME_OPEN_OFFICE"

    .line 80
    .line 81
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_4

    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :cond_4
    const-string p1, "://open/editprofile"

    .line 90
    .line 91
    invoke-virtual {p0, p1}, La/lya;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    goto/16 :goto_4

    .line 95
    .line 96
    :sswitch_2
    const-string p1, "IFRAME_REGISTRATION"

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_5

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_5
    const-string p1, "://open/registration"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/lya;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :sswitch_3
    const-string p1, "IFRAME_AUTHORIZATION"

    .line 112
    .line 113
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_9

    .line 118
    .line 119
    const-string p1, "://open/login"

    .line 120
    .line 121
    invoke-virtual {p0, p1}, La/lya;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :sswitch_4
    const-string v2, "IFRAME_OPEN_BETTING"

    .line 126
    .line 127
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_6

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    sget-object v1, La/xxw;->Companion:La/vxw;

    .line 138
    .line 139
    sget-object v2, La/fw70;->Companion:La/dw70;

    .line 140
    .line 141
    invoke-virtual {v2}, La/dw70;->serializer()La/jiy;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v1, v2}, La/vxw;->serializer(La/jiy;)La/jiy;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, La/jiy;

    .line 150
    .line 151
    invoke-virtual {v0, v1, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, La/xxw;

    .line 156
    .line 157
    iget-object p1, p1, La/xxw;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p1, La/fw70;

    .line 160
    .line 161
    if-eqz p1, :cond_7

    .line 162
    .line 163
    invoke-static {p1}, La/b8k0;->Y(La/fw70;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 167
    goto :goto_2

    .line 168
    :catchall_1
    move-exception p1

    .line 169
    goto :goto_1

    .line 170
    :cond_7
    move-object p1, v3

    .line 171
    goto :goto_2

    .line 172
    :goto_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 173
    .line 174
    new-instance v0, La/g0g0;

    .line 175
    .line 176
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    move-object p1, v0

    .line 180
    :goto_2
    nop

    .line 181
    instance-of v0, p1, La/g0g0;

    .line 182
    .line 183
    if-eqz v0, :cond_8

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_8
    move-object v3, p1

    .line 187
    :goto_3
    check-cast v3, Ljava/lang/String;

    .line 188
    .line 189
    if-eqz v3, :cond_9

    .line 190
    .line 191
    invoke-virtual {p0, v3}, La/lya;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    :cond_9
    :goto_4
    return-void

    .line 195
    :sswitch_data_0
    .sparse-switch
        -0x7d4e9c5b -> :sswitch_4
        0x511d1fe -> :sswitch_3
        0x25f4ae74 -> :sswitch_2
        0x543c4936 -> :sswitch_1
        0x69536b37 -> :sswitch_0
    .end sparse-switch
.end method
