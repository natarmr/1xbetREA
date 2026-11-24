.class public final synthetic La/znj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/eoj0;


# direct methods
.method public synthetic constructor <init>(La/eoj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/znj0;->a:B

    iput-object p1, p0, La/znj0;->b:La/eoj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/znj0;->a:B

    .line 2
    .line 3
    const v1, 0x7f13051d

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object p0, p0, La/znj0;->b:La/eoj0;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Throwable;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
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
    instance-of p1, p1, La/xto;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, La/eoj0;->z:La/ctf0;

    .line 27
    .line 28
    new-array p2, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 31
    .line 32
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p1, v1, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p1, p0, La/eoj0;->z:La/ctf0;

    .line 42
    .line 43
    new-array p2, v2, [Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 46
    .line 47
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const v0, 0x7f13051e

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :goto_0
    new-instance p2, La/pnj0;

    .line 59
    .line 60
    iget-object v0, p0, La/eoj0;->z:La/ctf0;

    .line 61
    .line 62
    new-array v1, v2, [Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 65
    .line 66
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const v2, 0x7f13051c

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-direct {p2, v0, p1}, La/pnj0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    instance-of p1, p1, La/xto;

    .line 93
    .line 94
    if-eqz p1, :cond_1

    .line 95
    .line 96
    iget-object p1, p0, La/eoj0;->z:La/ctf0;

    .line 97
    .line 98
    new-array p2, v2, [Ljava/lang/Object;

    .line 99
    .line 100
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 101
    .line 102
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p1, v1, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    goto :goto_1

    .line 111
    :cond_1
    iget-object p1, p0, La/eoj0;->z:La/ctf0;

    .line 112
    .line 113
    new-array p2, v2, [Ljava/lang/Object;

    .line 114
    .line 115
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 116
    .line 117
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    const v0, 0x7f130520

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :goto_1
    new-instance p2, La/pnj0;

    .line 129
    .line 130
    iget-object v0, p0, La/eoj0;->z:La/ctf0;

    .line 131
    .line 132
    new-array v1, v2, [Ljava/lang/Object;

    .line 133
    .line 134
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 135
    .line 136
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    const v2, 0x7f13051f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-direct {p2, v0, p1}, La/pnj0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, p2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
