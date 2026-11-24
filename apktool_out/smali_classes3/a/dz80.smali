.class public final synthetic La/dz80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gz80;


# direct methods
.method public synthetic constructor <init>(La/gz80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dz80;->a:B

    iput-object p1, p0, La/dz80;->b:La/gz80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/dz80;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/dz80;->b:La/gz80;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Ljava/lang/Throwable;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 15
    .line 16
    iget-object v1, p1, La/ocj;->a:La/p7m0;

    .line 17
    .line 18
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 26
    .line 27
    move-object v3, p1

    .line 28
    check-cast v3, La/az80;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 34
    .line 35
    new-instance v2, La/g0g0;

    .line 36
    .line 37
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    new-instance v5, La/j0g0;

    .line 41
    .line 42
    invoke-direct {v5, v2}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    const/16 v8, 0xd

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-static/range {v3 .. v8}, La/az80;->a(La/az80;ZLa/j0g0;Ljava/util/List;Ljava/util/LinkedHashMap;I)La/az80;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v1, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    iget-object p0, p0, La/gz80;->y:La/duj;

    .line 61
    .line 62
    new-instance p1, La/ht80;

    .line 63
    .line 64
    const/16 v1, 0x8

    .line 65
    .line 66
    invoke-direct {p1, v1}, La/ht80;-><init>(B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0, p1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, La/gz80;->y:La/duj;

    .line 81
    .line 82
    new-instance v0, La/ht80;

    .line 83
    .line 84
    const/4 v1, 0x7

    .line 85
    invoke-direct {v0, v1}, La/ht80;-><init>(B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v0, La/xy80;

    .line 100
    .line 101
    iget-object v1, p0, La/gz80;->B:La/ctf0;

    .line 102
    .line 103
    const/4 v2, 0x0

    .line 104
    new-array v3, v2, [Ljava/lang/Object;

    .line 105
    .line 106
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 107
    .line 108
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    const v3, 0x7f131302

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-direct {v0, v1}, La/xy80;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object p0, p0, La/gz80;->y:La/duj;

    .line 137
    .line 138
    new-instance v0, La/ht80;

    .line 139
    .line 140
    const/4 v1, 0x6

    .line 141
    invoke-direct {v0, v1}, La/ht80;-><init>(B)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
