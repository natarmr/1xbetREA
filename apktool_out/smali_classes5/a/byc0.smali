.class public final synthetic La/byc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hyc0;


# direct methods
.method public synthetic constructor <init>(La/hyc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/byc0;->a:B

    iput-object p1, p0, La/byc0;->b:La/hyc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/byc0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/byc0;->b:La/hyc0;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/hyc0;->n:La/duj;

    .line 16
    .line 17
    new-instance v1, La/cyc0;

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    invoke-direct {v1, p0, v2}, La/cyc0;-><init>(La/hyc0;B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/hyc0;->u:La/b4j;

    .line 33
    .line 34
    const-string v1, "promo_menu"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, La/b4j;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, La/hyc0;->t:La/x20;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, La/x20;->t(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, La/hyc0;->n:La/duj;

    .line 45
    .line 46
    new-instance v1, La/cyc0;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-direct {v1, p0, v3}, La/cyc0;-><init>(La/hyc0;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 53
    .line 54
    .line 55
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {p0, v2, p1}, La/hyc0;->E(Ljava/lang/Integer;Ljava/lang/Boolean;)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, La/hyc0;->n:La/duj;

    .line 67
    .line 68
    new-instance v2, La/cyc0;

    .line 69
    .line 70
    invoke-direct {v2, p0, v1}, La/cyc0;-><init>(La/hyc0;B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, La/hyc0;->n:La/duj;

    .line 83
    .line 84
    new-instance v1, La/cyc0;

    .line 85
    .line 86
    const/4 v2, 0x6

    .line 87
    invoke-direct {v1, p0, v2}, La/cyc0;-><init>(La/hyc0;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    instance-of v0, p1, Ljava/net/UnknownHostException;

    .line 100
    .line 101
    if-eqz v0, :cond_0

    .line 102
    .line 103
    iget-object p0, p0, La/hyc0;->F:La/p7m0;

    .line 104
    .line 105
    new-instance p1, La/afe;

    .line 106
    .line 107
    new-instance v0, La/mgc0;

    .line 108
    .line 109
    sget-object v3, La/iun;->a:La/iun;

    .line 110
    .line 111
    invoke-direct {v0, v3, v1}, La/mgc0;-><init>(Ljava/util/List;Z)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p1, v0}, La/afe;-><init>(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_0
    iget-object v0, p0, La/hyc0;->n:La/duj;

    .line 125
    .line 126
    new-instance v1, La/cyc0;

    .line 127
    .line 128
    const/4 v2, 0x3

    .line 129
    invoke-direct {v1, p0, v2}, La/cyc0;-><init>(La/hyc0;B)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 133
    .line 134
    .line 135
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, La/hyc0;->n:La/duj;

    .line 142
    .line 143
    new-instance v1, La/cyc0;

    .line 144
    .line 145
    const/4 v2, 0x2

    .line 146
    invoke-direct {v1, p0, v2}, La/cyc0;-><init>(La/hyc0;B)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, La/hyc0;->n:La/duj;

    .line 159
    .line 160
    new-instance v1, La/cyc0;

    .line 161
    .line 162
    const/4 v2, 0x4

    .line 163
    invoke-direct {v1, p0, v2}, La/cyc0;-><init>(La/hyc0;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
