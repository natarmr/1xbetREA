.class public final synthetic La/gp90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kp90;


# direct methods
.method public synthetic constructor <init>(La/kp90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gp90;->a:B

    iput-object p1, p0, La/gp90;->b:La/kp90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/gp90;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La/t0w0;->a:La/t0w0;

    .line 5
    .line 6
    iget-object p0, p0, La/gp90;->b:La/kp90;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/k0w0;

    .line 12
    .line 13
    invoke-virtual {p1, v2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p1, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, La/c8d;

    .line 20
    .line 21
    sget-object v0, La/cfx0;->o:La/bjk;

    .line 22
    .line 23
    iget-object p0, p0, La/kp90;->w:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v2, La/bjk;

    .line 26
    .line 27
    invoke-direct {v2, p0, v1, v1, v1}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 28
    .line 29
    .line 30
    new-instance p0, La/v7d;

    .line 31
    .line 32
    invoke-direct {p0, v1, v2, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 33
    .line 34
    .line 35
    iput-object p0, p1, La/c8d;->a:La/w7d;

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p1, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, La/c8d;

    .line 49
    .line 50
    sget-object v0, La/cfx0;->o:La/bjk;

    .line 51
    .line 52
    iget-object p0, p0, La/kp90;->w:Ljava/lang/String;

    .line 53
    .line 54
    new-instance v2, La/bjk;

    .line 55
    .line 56
    invoke-direct {v2, p0, v1, v1, v1}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 57
    .line 58
    .line 59
    new-instance p0, La/v7d;

    .line 60
    .line 61
    invoke-direct {p0, v1, v2, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 62
    .line 63
    .line 64
    iput-object p0, p1, La/c8d;->a:La/w7d;

    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, La/kp90;->x:La/cyu;

    .line 75
    .line 76
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/br90;

    .line 81
    .line 82
    iget-object v0, v0, La/br90;->b:La/zqp;

    .line 83
    .line 84
    iget-object v0, v0, La/zqp;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, La/cyu;->y(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 90
    .line 91
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 92
    .line 93
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 101
    .line 102
    move-object v2, p1

    .line 103
    check-cast v2, La/br90;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object v1, v2, La/br90;->b:La/zqp;

    .line 109
    .line 110
    iget-object v1, v1, La/zqp;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v3, La/zqp;

    .line 116
    .line 117
    const/4 v4, 0x1

    .line 118
    invoke-direct {v3, v1, v4}, La/zqp;-><init>(Ljava/lang/String;Z)V

    .line 119
    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    const/16 v7, 0x3d

    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    const/4 v5, 0x0

    .line 126
    invoke-static/range {v2 .. v7}, La/br90;->a(La/br90;La/zqp;Ljava/lang/String;Ljava/util/ArrayList;ZI)La/br90;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_0

    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    iget-object p1, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p1, La/c8d;

    .line 151
    .line 152
    sget-object v0, La/cfx0;->o:La/bjk;

    .line 153
    .line 154
    iget-object p0, p0, La/kp90;->w:Ljava/lang/String;

    .line 155
    .line 156
    new-instance v2, La/bjk;

    .line 157
    .line 158
    invoke-direct {v2, p0, v1, v1, v1}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 159
    .line 160
    .line 161
    new-instance p0, La/v7d;

    .line 162
    .line 163
    invoke-direct {p0, v1, v2, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 164
    .line 165
    .line 166
    iput-object p0, p1, La/c8d;->a:La/w7d;

    .line 167
    .line 168
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
