.class public final synthetic La/qhp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rhp0;


# direct methods
.method public synthetic constructor <init>(La/rhp0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qhp0;->a:B

    iput-object p1, p0, La/qhp0;->b:La/rhp0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/qhp0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/qhp0;->b:La/rhp0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Throwable;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    instance-of p1, p1, La/ff5;

    .line 23
    .line 24
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, La/ocj;->a:La/p7m0;

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-object p2, p0

    .line 38
    check-cast p2, La/ghp0;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object p2, p2, La/ghp0;->a:La/shp0;

    .line 44
    .line 45
    new-instance v3, La/ghp0;

    .line 46
    .line 47
    invoke-direct {v3, p2, v1, v1, v2}, La/ghp0;-><init>(La/shp0;ZZZ)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object v3, p0, La/ocj;->a:La/p7m0;

    .line 58
    .line 59
    :cond_2
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-object p1, p0

    .line 67
    check-cast p1, La/ghp0;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object p1, p1, La/ghp0;->a:La/shp0;

    .line 73
    .line 74
    new-instance p2, La/ghp0;

    .line 75
    .line 76
    invoke-direct {p2, p1, v1, v2, v1}, La/ghp0;-><init>(La/shp0;ZZZ)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p0, p2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_2

    .line 84
    .line 85
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 89
    .line 90
    check-cast p2, Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    instance-of p1, p1, La/ff5;

    .line 99
    .line 100
    if-eqz p1, :cond_4

    .line 101
    .line 102
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 103
    .line 104
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 105
    .line 106
    :cond_3
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 114
    .line 115
    move-object v3, p2

    .line 116
    check-cast v3, La/ghp0;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v0, v3, La/ghp0;->a:La/shp0;

    .line 122
    .line 123
    new-instance v3, La/ghp0;

    .line 124
    .line 125
    invoke-direct {v3, v0, v1, v1, v2}, La/ghp0;-><init>(La/shp0;ZZZ)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_3

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 136
    .line 137
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 138
    .line 139
    :cond_5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, La/i3t0;->f:La/oyg0;

    .line 147
    .line 148
    move-object v3, p2

    .line 149
    check-cast v3, La/ghp0;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v0, v3, La/ghp0;->a:La/shp0;

    .line 155
    .line 156
    new-instance v3, La/ghp0;

    .line 157
    .line 158
    invoke-direct {v3, v0, v1, v2, v1}, La/ghp0;-><init>(La/shp0;ZZZ)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, p2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-eqz p2, :cond_5

    .line 166
    .line 167
    :goto_1
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
