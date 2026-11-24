.class public final synthetic La/vng0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/aog0;


# direct methods
.method public synthetic constructor <init>(La/aog0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vng0;->a:B

    iput-object p1, p0, La/vng0;->b:La/aog0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/vng0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vng0;->b:La/aog0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/aog0;->s:La/duj;

    .line 9
    .line 10
    iget-object v1, p0, La/i3t0;->i:La/ocj;

    .line 11
    .line 12
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 13
    .line 14
    move-object v3, p1

    .line 15
    check-cast v3, Ljava/lang/Throwable;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    instance-of p0, v3, La/kcy;

    .line 21
    .line 22
    const/16 v4, 0x19

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    iget-object p0, v1, La/ocj;->a:La/p7m0;

    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-object v5, p1

    .line 36
    check-cast v5, La/ong0;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v6, v5, La/ong0;->e:La/mdm;

    .line 42
    .line 43
    sget-object v7, La/iun;->a:La/iun;

    .line 44
    .line 45
    const/4 v9, 0x0

    .line 46
    const/16 v10, 0x133

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    invoke-static/range {v5 .. v10}, La/ong0;->a(La/ong0;La/mdm;Ljava/util/List;La/xkg0;ZI)La/ong0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    new-instance p0, La/vtf0;

    .line 60
    .line 61
    invoke-direct {p0, v4}, La/vtf0;-><init>(B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v3, p0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    instance-of p0, v3, La/ff5;

    .line 69
    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    iget-object p0, v1, La/ocj;->a:La/p7m0;

    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-object v3, p1

    .line 82
    check-cast v3, La/ong0;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v4, v3, La/ong0;->f:La/mdm;

    .line 88
    .line 89
    sget-object v5, La/iun;->a:La/iun;

    .line 90
    .line 91
    const/4 v7, 0x1

    .line 92
    const/16 v8, 0x133

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-static/range {v3 .. v8}, La/ong0;->a(La/ong0;La/mdm;Ljava/util/List;La/xkg0;ZI)La/ong0;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_2

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 107
    .line 108
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-object v5, p0

    .line 116
    check-cast v5, La/ong0;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v6, v5, La/ong0;->e:La/mdm;

    .line 122
    .line 123
    sget-object v7, La/iun;->a:La/iun;

    .line 124
    .line 125
    const/4 v9, 0x0

    .line 126
    const/16 v10, 0x133

    .line 127
    .line 128
    const/4 v8, 0x0

    .line 129
    invoke-static/range {v5 .. v10}, La/ong0;->a(La/ong0;La/mdm;Ljava/util/List;La/xkg0;ZI)La/ong0;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {v1, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_4

    .line 138
    .line 139
    new-instance p0, La/vtf0;

    .line 140
    .line 141
    invoke-direct {p0, v4}, La/vtf0;-><init>(B)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v3, p0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object p0, p0, La/aog0;->s:La/duj;

    .line 156
    .line 157
    new-instance v0, La/vtf0;

    .line 158
    .line 159
    const/16 v1, 0x18

    .line 160
    .line 161
    invoke-direct {v0, v1}, La/vtf0;-><init>(B)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 165
    .line 166
    .line 167
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
