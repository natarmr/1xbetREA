.class public final synthetic La/zr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gs0;


# direct methods
.method public synthetic constructor <init>(La/gs0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zr0;->a:B

    iput-object p1, p0, La/zr0;->b:La/gs0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/zr0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zr0;->b:La/gs0;

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
    iget-object v0, p0, La/gs0;->p:La/duj;

    .line 14
    .line 15
    new-instance v1, La/yr0;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p1, v2}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 25
    .line 26
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 27
    .line 28
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 36
    .line 37
    move-object v2, p1

    .line 38
    check-cast v2, La/ur0;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/16 v7, 0xfb

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    sget-object v4, La/plk0;->a:La/plk0;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-static/range {v2 .. v7}, La/ur0;->a(La/ur0;La/v5q;La/rlk0;La/y5d0;La/uaq0;I)La/ur0;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, La/gs0;->p:La/duj;

    .line 67
    .line 68
    new-instance v1, La/yr0;

    .line 69
    .line 70
    const/4 v2, 0x2

    .line 71
    invoke-direct {v1, p1, v2}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 78
    .line 79
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 80
    .line 81
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 89
    .line 90
    move-object v2, p1

    .line 91
    check-cast v2, La/ur0;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    const/4 v6, 0x0

    .line 97
    const/16 v7, 0xfd

    .line 98
    .line 99
    sget-object v3, La/t5q;->a:La/t5q;

    .line 100
    .line 101
    const/4 v4, 0x0

    .line 102
    const/4 v5, 0x0

    .line 103
    invoke-static/range {v2 .. v7}, La/ur0;->a(La/ur0;La/v5q;La/rlk0;La/y5d0;La/uaq0;I)La/ur0;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_1

    .line 112
    .line 113
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
    iget-object v0, p0, La/gs0;->p:La/duj;

    .line 120
    .line 121
    new-instance v1, La/yr0;

    .line 122
    .line 123
    const/4 v2, 0x1

    .line 124
    invoke-direct {v1, p1, v2}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 131
    .line 132
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 133
    .line 134
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 142
    .line 143
    move-object v2, v0

    .line 144
    check-cast v2, La/ur0;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    const/16 v7, 0xf7

    .line 151
    .line 152
    const/4 v3, 0x0

    .line 153
    const/4 v4, 0x0

    .line 154
    sget-object v5, La/w5d0;->a:La/w5d0;

    .line 155
    .line 156
    invoke-static/range {v2 .. v7}, La/ur0;->a(La/ur0;La/v5q;La/rlk0;La/y5d0;La/uaq0;I)La/ur0;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_2

    .line 165
    .line 166
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
