.class public final synthetic La/hv80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rv80;


# direct methods
.method public synthetic constructor <init>(La/rv80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hv80;->a:B

    iput-object p1, p0, La/hv80;->b:La/rv80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/hv80;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/hv80;->b:La/rv80;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    sget p1, La/rv80;->V:I

    .line 11
    .line 12
    sget-object p1, La/uu80;->a:La/uu80;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    move-object v0, p1

    .line 21
    check-cast v0, La/pb0;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 27
    .line 28
    iget-object v1, p1, La/ocj;->a:La/p7m0;

    .line 29
    .line 30
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 38
    .line 39
    move-object v3, p1

    .line 40
    check-cast v3, La/yu80;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v12, v0, La/pb0;->a:La/ql5;

    .line 46
    .line 47
    const v13, 0x17fff

    .line 48
    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v11, 0x0

    .line 58
    invoke-static/range {v3 .. v13}, La/yu80;->a(La/yu80;ZZZZZLjava/util/List;Ljava/util/Set;La/gu80;La/ql5;I)La/yu80;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, La/rv80;->B:La/duj;

    .line 77
    .line 78
    new-instance v0, La/ht80;

    .line 79
    .line 80
    const/4 v1, 0x2

    .line 81
    invoke-direct {v0, v1}, La/ht80;-><init>(B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 96
    .line 97
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 98
    .line 99
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 107
    .line 108
    move-object v2, p1

    .line 109
    check-cast v2, La/yu80;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    const/4 v11, 0x0

    .line 115
    const v12, 0x1bfff

    .line 116
    .line 117
    .line 118
    const/4 v3, 0x0

    .line 119
    const/4 v4, 0x0

    .line 120
    const/4 v5, 0x0

    .line 121
    const/4 v6, 0x0

    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v8, 0x0

    .line 124
    const/4 v9, 0x0

    .line 125
    sget-object v10, La/eu80;->a:La/eu80;

    .line 126
    .line 127
    invoke-static/range {v2 .. v12}, La/yu80;->a(La/yu80;ZZZZZLjava/util/List;Ljava/util/Set;La/gu80;La/ql5;I)La/yu80;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-eqz p1, :cond_1

    .line 136
    .line 137
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    instance-of v0, p1, La/jfp;

    .line 146
    .line 147
    iget-object v1, p0, La/rv80;->x:La/ctf0;

    .line 148
    .line 149
    if-eqz v0, :cond_2

    .line 150
    .line 151
    new-instance p1, La/wu80;

    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    new-array v2, v0, [Ljava/lang/Object;

    .line 155
    .line 156
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 157
    .line 158
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const v2, 0x7f1303d7

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-direct {p1, v0}, La/wu80;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_2
    new-instance v0, La/vu80;

    .line 177
    .line 178
    invoke-static {p1, v1}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-direct {v0, p1}, La/vu80;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
