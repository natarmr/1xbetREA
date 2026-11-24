.class public final synthetic La/poe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/woe0;


# direct methods
.method public synthetic constructor <init>(La/woe0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/poe0;->a:B

    iput-object p1, p0, La/poe0;->b:La/woe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/poe0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/poe0;->b:La/woe0;

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/woe0;->S1:La/gne0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/woe0;->H0()La/zoe0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string p1, "rules_top"

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/zoe0;->w(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/woe0;->S1:La/gne0;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/woe0;->H0()La/zoe0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-object p0, p0, La/zoe0;->e:La/pzu;

    .line 37
    .line 38
    iget-object p1, p0, La/pzu;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, La/oeg0;

    .line 41
    .line 42
    invoke-virtual {p1}, La/oeg0;->c()La/i1w0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1, p1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, La/pzu;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, La/jh70;

    .line 53
    .line 54
    iget-object p0, p0, La/pzu;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/pru;

    .line 57
    .line 58
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p0, p0, La/sff0;->V0:La/zuc0;

    .line 63
    .line 64
    invoke-static {v1, p0}, La/jh70;->i(La/jh70;La/zuc0;)Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v0, p0}, La/k0w0;->c(La/m7h0;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    invoke-static {p1, p0, v0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :goto_0
    move-object v0, p0

    .line 79
    check-cast v0, La/paw;

    .line 80
    .line 81
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/oe50;

    .line 92
    .line 93
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_1
    sget-object v0, La/woe0;->S1:La/gne0;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, La/woe0;->H0()La/zoe0;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    iget-object p1, p0, La/zoe0;->o:La/bby;

    .line 110
    .line 111
    const/4 v0, 0x1

    .line 112
    if-eqz p1, :cond_1

    .line 113
    .line 114
    invoke-interface {p1}, La/bby;->isActive()Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-ne p1, v0, :cond_1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    iget-object p1, p0, La/zoe0;->u:La/p7m0;

    .line 122
    .line 123
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-nez p1, :cond_2

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    iget-object p1, p0, La/zoe0;->j:La/yo4;

    .line 137
    .line 138
    iget-object p1, p1, La/yo4;->a:La/kt2;

    .line 139
    .line 140
    const-string v1, "promo_referal_join_call"

    .line 141
    .line 142
    invoke-interface {p1, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, La/zoe0;->f:La/zr1;

    .line 146
    .line 147
    iget-object p1, p1, La/zr1;->a:La/s1p;

    .line 148
    .line 149
    const-wide/16 v1, 0xcfd

    .line 150
    .line 151
    sget-object v3, La/xun;->a:La/xun;

    .line 152
    .line 153
    invoke-virtual {p1, v3, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, La/zoe0;->s:La/p7m0;

    .line 157
    .line 158
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    const/4 v2, 0x0

    .line 164
    invoke-virtual {p1, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    new-instance v4, La/eme0;

    .line 172
    .line 173
    const/4 p1, 0x3

    .line 174
    invoke-direct {v4, p0, p1}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    new-instance v7, La/yoe0;

    .line 178
    .line 179
    invoke-direct {v7, p0, v2, v0}, La/yoe0;-><init>(La/zoe0;La/yje;B)V

    .line 180
    .line 181
    .line 182
    const/16 v8, 0xe

    .line 183
    .line 184
    const/4 v5, 0x0

    .line 185
    const/4 v6, 0x0

    .line 186
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iput-object p1, p0, La/zoe0;->o:La/bby;

    .line 191
    .line 192
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object p0

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
