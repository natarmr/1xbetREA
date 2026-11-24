.class public final synthetic La/sx4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fy4;


# direct methods
.method public synthetic constructor <init>(La/fy4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sx4;->a:B

    iput-object p1, p0, La/sx4;->b:La/fy4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/sx4;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/sx4;->b:La/fy4;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/fy4;->i:La/duj;

    .line 16
    .line 17
    new-instance v0, La/o33;

    .line 18
    .line 19
    const/16 v1, 0x1b

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/o33;-><init>(B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, La/fy4;->i:La/duj;

    .line 36
    .line 37
    new-instance v1, La/tx4;

    .line 38
    .line 39
    invoke-direct {v1, p0, v2}, La/tx4;-><init>(La/fy4;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/m97;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, La/fy4;->a0:La/ol60;

    .line 54
    .line 55
    new-instance v0, La/fw4;

    .line 56
    .line 57
    sget-object v4, La/pek0;->a:La/pek0;

    .line 58
    .line 59
    iget-object p0, p0, La/fy4;->l:La/ctf0;

    .line 60
    .line 61
    new-array v1, v2, [Ljava/lang/Object;

    .line 62
    .line 63
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 64
    .line 65
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const v2, 0x7f13023f

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    sget-object v8, La/jdk0;->a:La/jdk0;

    .line 77
    .line 78
    new-instance v3, La/xdk0;

    .line 79
    .line 80
    const p0, 0x7f080be7

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    const/16 v10, 0x4c

    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, v3}, La/fw4;-><init>(La/xdk0;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    instance-of p1, p1, Ljava/util/concurrent/CancellationException;

    .line 109
    .line 110
    if-nez p1, :cond_1

    .line 111
    .line 112
    iget-object p1, p0, La/fy4;->W:La/nwo0;

    .line 113
    .line 114
    iget-boolean p1, p1, La/nwo0;->a:Z

    .line 115
    .line 116
    if-eqz p1, :cond_0

    .line 117
    .line 118
    sget-object p1, La/wvo0;->a:La/wvo0;

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_0
    sget-object p1, La/zvo0;->a:La/zvo0;

    .line 122
    .line 123
    :goto_0
    invoke-virtual {p0, p1}, La/fy4;->H(La/gwo0;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, La/fy4;->y()La/qnb0;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget-object p0, p0, La/fy4;->h0:La/p7m0;

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    instance-of p1, p1, Ljava/util/concurrent/CancellationException;

    .line 147
    .line 148
    if-nez p1, :cond_2

    .line 149
    .line 150
    invoke-virtual {p0}, La/fy4;->y()La/qnb0;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iget-object p0, p0, La/fy4;->h0:La/p7m0;

    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object p0, p0, La/fy4;->i:La/duj;

    .line 171
    .line 172
    new-instance v0, La/o33;

    .line 173
    .line 174
    const/16 v1, 0x1a

    .line 175
    .line 176
    invoke-direct {v0, v1}, La/o33;-><init>(B)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
