.class public final synthetic La/np4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qp4;


# direct methods
.method public synthetic constructor <init>(La/qp4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/np4;->a:B

    iput-object p1, p0, La/np4;->b:La/qp4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/np4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/np4;->b:La/qp4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/qp4;->R1:La/hfk0;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string p2, "KEY_OPTIONS_TYPE"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v1, 0x21

    .line 24
    .line 25
    if-lt v0, v1, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, La/c7;->B(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    instance-of p2, p1, La/n680;

    .line 37
    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    :cond_1
    check-cast p1, La/n680;

    .line 42
    .line 43
    :goto_0
    check-cast p1, La/n680;

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {p0}, La/qp4;->H0()La/ku4;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_4

    .line 57
    .line 58
    const/4 p2, 0x1

    .line 59
    if-ne p1, p2, :cond_3

    .line 60
    .line 61
    iget-object p0, p0, La/ku4;->v:La/ol60;

    .line 62
    .line 63
    sget-object p1, La/ot4;->a:La/ot4;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iget-object p1, p0, La/ku4;->q:La/i1w0;

    .line 74
    .line 75
    new-instance p2, La/it4;

    .line 76
    .line 77
    const/4 v0, 0x4

    .line 78
    invoke-direct {p2, p0, v0}, La/it4;-><init>(La/ku4;B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    :goto_1
    return-void

    .line 85
    :pswitch_0
    sget-object v0, La/qp4;->R1:La/hfk0;

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const-string v0, "APPLY_FILTERS_REQUEST_KEY"

    .line 91
    .line 92
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-nez p2, :cond_6

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_6
    const-string p2, "RESULT_TYPE_FILTER"

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_b

    .line 106
    .line 107
    const-string v0, "RESULT_PERIOD_FILTER"

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_b

    .line 114
    .line 115
    invoke-virtual {p0}, La/qp4;->H0()La/ku4;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    check-cast p2, Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;

    .line 124
    .line 125
    if-nez p2, :cond_7

    .line 126
    .line 127
    new-instance p2, Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;

    .line 128
    .line 129
    invoke-direct {p2}, Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;-><init>()V

    .line 130
    .line 131
    .line 132
    :cond_7
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 137
    .line 138
    if-nez p1, :cond_8

    .line 139
    .line 140
    new-instance p1, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 141
    .line 142
    invoke-direct {p1}, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;-><init>()V

    .line 143
    .line 144
    .line 145
    :cond_8
    iput-object p2, p0, La/ku4;->B:Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;

    .line 146
    .line 147
    iput-object p1, p0, La/ku4;->C:Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 148
    .line 149
    iget-object p1, p0, La/ku4;->A:La/p7m0;

    .line 150
    .line 151
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    iget-object v0, p0, La/ku4;->B:Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;

    .line 156
    .line 157
    iget-object v1, v0, Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;->a:La/c860;

    .line 158
    .line 159
    sget-object v2, La/c860;->b:La/c860;

    .line 160
    .line 161
    if-eq v1, v2, :cond_9

    .line 162
    .line 163
    new-instance v1, La/k3q;

    .line 164
    .line 165
    iget-object v0, v0, Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;->b:Ljava/lang/String;

    .line 166
    .line 167
    sget-object v2, La/v3q;->a:La/v3q;

    .line 168
    .line 169
    invoke-direct {v1, v0, v2}, La/k3q;-><init>(Ljava/lang/String;La/v3q;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :cond_9
    iget-object p0, p0, La/ku4;->C:Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 176
    .line 177
    iget-object v0, p0, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;->a:La/q760;

    .line 178
    .line 179
    sget-object v1, La/q760;->b:La/q760;

    .line 180
    .line 181
    if-eq v0, v1, :cond_a

    .line 182
    .line 183
    new-instance v0, La/k3q;

    .line 184
    .line 185
    iget-object p0, p0, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;->b:Ljava/lang/String;

    .line 186
    .line 187
    sget-object v1, La/v3q;->b:La/v3q;

    .line 188
    .line 189
    invoke-direct {v0, p0, v1}, La/k3q;-><init>(Ljava/lang/String;La/v3q;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    :cond_a
    invoke-static {p2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p1, p0}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_b
    :goto_2
    return-void

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
