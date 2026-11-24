.class public final synthetic La/nad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fad;


# direct methods
.method public synthetic constructor <init>(La/fad;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nad;->a:B

    iput-object p1, p0, La/nad;->b:La/fad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/nad;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x12

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object p0, p0, La/nad;->b:La/fad;

    .line 10
    .line 11
    check-cast p1, La/yhg0;

    .line 12
    .line 13
    check-cast p2, La/fet;

    .line 14
    .line 15
    check-cast p3, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v0, p3, 0x6

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    move v3, v4

    .line 38
    :cond_0
    or-int/2addr p3, v3

    .line 39
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 40
    .line 41
    if-eq v0, v2, :cond_2

    .line 42
    .line 43
    move v1, v5

    .line 44
    :cond_2
    and-int/lit8 v0, p3, 0x1

    .line 45
    .line 46
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    check-cast p0, La/ead;

    .line 53
    .line 54
    iget-object p0, p0, La/ead;->a:La/jg30;

    .line 55
    .line 56
    iget-object p0, p0, La/jg30;->d:Ljava/lang/String;

    .line 57
    .line 58
    and-int/lit8 p3, p3, 0xe

    .line 59
    .line 60
    invoke-static {p1, p0, p2, p3}, La/vsm0;->e(La/yhg0;Ljava/lang/String;La/fet;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 65
    .line 66
    .line 67
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    and-int/lit8 v0, p3, 0x6

    .line 74
    .line 75
    if-nez v0, :cond_5

    .line 76
    .line 77
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    move v3, v4

    .line 84
    :cond_4
    or-int/2addr p3, v3

    .line 85
    :cond_5
    and-int/lit8 v0, p3, 0x13

    .line 86
    .line 87
    if-eq v0, v2, :cond_6

    .line 88
    .line 89
    move v1, v5

    .line 90
    :cond_6
    and-int/lit8 v0, p3, 0x1

    .line 91
    .line 92
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_7

    .line 97
    .line 98
    check-cast p0, La/ead;

    .line 99
    .line 100
    iget-object p0, p0, La/ead;->a:La/jg30;

    .line 101
    .line 102
    iget-object p0, p0, La/jg30;->c:Ljava/lang/String;

    .line 103
    .line 104
    and-int/lit8 p3, p3, 0xe

    .line 105
    .line 106
    invoke-static {p1, p0, p2, p3}, La/vsm0;->d(La/yhg0;Ljava/lang/String;La/fet;I)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 111
    .line 112
    .line 113
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    and-int/lit8 v0, p3, 0x6

    .line 120
    .line 121
    if-nez v0, :cond_9

    .line 122
    .line 123
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    move v3, v4

    .line 130
    :cond_8
    or-int/2addr p3, v3

    .line 131
    :cond_9
    and-int/lit8 v0, p3, 0x13

    .line 132
    .line 133
    if-eq v0, v2, :cond_a

    .line 134
    .line 135
    move v1, v5

    .line 136
    :cond_a
    and-int/lit8 v0, p3, 0x1

    .line 137
    .line 138
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_b

    .line 143
    .line 144
    check-cast p0, La/ead;

    .line 145
    .line 146
    iget-object p0, p0, La/ead;->a:La/jg30;

    .line 147
    .line 148
    iget-object p0, p0, La/jg30;->b:Ljava/lang/String;

    .line 149
    .line 150
    and-int/lit8 p3, p3, 0xe

    .line 151
    .line 152
    invoke-static {p1, p0, p2, p3}, La/vsm0;->b(La/yhg0;Ljava/lang/String;La/fet;I)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_b
    invoke-virtual {p2}, La/fet;->X()V

    .line 157
    .line 158
    .line 159
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    and-int/lit8 v0, p3, 0x6

    .line 166
    .line 167
    if-nez v0, :cond_d

    .line 168
    .line 169
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_c

    .line 174
    .line 175
    move v3, v4

    .line 176
    :cond_c
    or-int/2addr p3, v3

    .line 177
    :cond_d
    and-int/lit8 v0, p3, 0x13

    .line 178
    .line 179
    if-eq v0, v2, :cond_e

    .line 180
    .line 181
    move v1, v5

    .line 182
    :cond_e
    and-int/lit8 v0, p3, 0x1

    .line 183
    .line 184
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_f

    .line 189
    .line 190
    check-cast p0, La/ead;

    .line 191
    .line 192
    iget-object p0, p0, La/ead;->a:La/jg30;

    .line 193
    .line 194
    iget-object p0, p0, La/jg30;->a:Ljava/lang/String;

    .line 195
    .line 196
    and-int/lit8 p3, p3, 0xe

    .line 197
    .line 198
    invoke-static {p1, p0, p2, p3}, La/vsm0;->f(La/yhg0;Ljava/lang/String;La/fet;I)V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_f
    invoke-virtual {p2}, La/fet;->X()V

    .line 203
    .line 204
    .line 205
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
