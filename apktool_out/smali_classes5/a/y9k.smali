.class public final synthetic La/y9k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/iak;


# direct methods
.method public synthetic constructor <init>(La/iak;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y9k;->a:B

    iput-object p1, p0, La/y9k;->b:La/iak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/y9k;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/y9k;->b:La/iak;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/iak;->n:La/p7m0;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    move-object v1, p1

    .line 20
    check-cast v1, La/hak;

    .line 21
    .line 22
    new-instance v1, La/fak;

    .line 23
    .line 24
    iget-object v2, p0, La/iak;->m:La/ra10;

    .line 25
    .line 26
    invoke-direct {v1, v2}, La/fak;-><init>(La/ra10;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    instance-of p1, p1, Ljava/util/NoSuchElementException;

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, La/y9k;

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    invoke-direct {v1, p0, p1}, La/y9k;-><init>(La/iak;B)V

    .line 53
    .line 54
    .line 55
    new-instance v4, La/fr9;

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    const/16 v2, 0x11

    .line 59
    .line 60
    invoke-direct {v4, p0, p1, v2}, La/fr9;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 61
    .line 62
    .line 63
    const/16 v5, 0xe

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, La/iak;->n:La/p7m0;

    .line 72
    .line 73
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    move-object v1, p1

    .line 78
    check-cast v1, La/hak;

    .line 79
    .line 80
    new-instance v1, La/fak;

    .line 81
    .line 82
    iget-object v2, p0, La/iak;->m:La/ra10;

    .line 83
    .line 84
    invoke-direct {v1, v2}, La/fak;-><init>(La/ra10;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    instance-of v0, p1, La/zhi0;

    .line 100
    .line 101
    sget-object v1, La/aak;->a:La/aak;

    .line 102
    .line 103
    if-eqz v0, :cond_8

    .line 104
    .line 105
    move-object v0, p1

    .line 106
    check-cast v0, La/zhi0;

    .line 107
    .line 108
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 109
    .line 110
    sget-object v2, La/i2o;->b3:La/i2o;

    .line 111
    .line 112
    if-eq v0, v2, :cond_4

    .line 113
    .line 114
    sget-object v2, La/i2o;->a3:La/i2o;

    .line 115
    .line 116
    if-eq v0, v2, :cond_4

    .line 117
    .line 118
    sget-object v2, La/i2o;->c3:La/i2o;

    .line 119
    .line 120
    if-ne v0, v2, :cond_3

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    invoke-virtual {p0, v1}, La/iak;->x(La/dak;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    new-instance v0, La/bak;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-nez p1, :cond_6

    .line 147
    .line 148
    const-string p1, ""

    .line 149
    .line 150
    :cond_6
    invoke-direct {v0, p1}, La/bak;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v0}, La/iak;->x(La/dak;)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_7
    :goto_2
    invoke-virtual {p0, v1}, La/iak;->x(La/dak;)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_8
    invoke-virtual {p0, v1}, La/iak;->x(La/dak;)V

    .line 162
    .line 163
    .line 164
    :goto_3
    iget-object p0, p0, La/iak;->n:La/p7m0;

    .line 165
    .line 166
    :cond_9
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    move-object v0, p1

    .line 171
    check-cast v0, La/hak;

    .line 172
    .line 173
    sget-object v0, La/eak;->a:La/eak;

    .line 174
    .line 175
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_9

    .line 180
    .line 181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
