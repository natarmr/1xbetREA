.class public final synthetic La/nmc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wmc0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/wmc0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nmc0;->a:B

    iput-object p1, p0, La/nmc0;->b:La/wmc0;

    iput-object p2, p0, La/nmc0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/nmc0;->a:B

    .line 2
    .line 3
    sget-object v1, La/ukd;->a:La/cl5;

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, p0, La/nmc0;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object p0, p0, La/nmc0;->b:La/wmc0;

    .line 12
    .line 13
    check-cast p1, La/g9z;

    .line 14
    .line 15
    check-cast p2, La/fet;

    .line 16
    .line 17
    check-cast p3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    and-int/lit8 p1, p3, 0x11

    .line 30
    .line 31
    if-eq p1, v2, :cond_0

    .line 32
    .line 33
    move p1, v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move p1, v4

    .line 36
    :goto_0
    and-int/2addr p3, v3

    .line 37
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    iget-object p0, p0, La/wmc0;->b:La/vmc0;

    .line 44
    .line 45
    invoke-virtual {p2, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    if-ne p3, v1, :cond_2

    .line 56
    .line 57
    :cond_1
    new-instance p3, La/bac0;

    .line 58
    .line 59
    const/16 p1, 0xd

    .line 60
    .line 61
    invoke-direct {p3, v5, p1}, La/bac0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    check-cast p3, Lkotlin/jvm/functions/Function0;

    .line 68
    .line 69
    invoke-static {p0, p3, p2, v4}, La/i4w0;->e(La/vmc0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 74
    .line 75
    .line 76
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    and-int/lit8 p1, p3, 0x11

    .line 83
    .line 84
    if-eq p1, v2, :cond_4

    .line 85
    .line 86
    move p1, v3

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move p1, v4

    .line 89
    :goto_2
    and-int/2addr p3, v3

    .line 90
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_9

    .line 95
    .line 96
    iget-object p0, p0, La/wmc0;->c:La/zmc0;

    .line 97
    .line 98
    invoke-virtual {p2, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    if-nez p1, :cond_5

    .line 107
    .line 108
    if-ne p3, v1, :cond_6

    .line 109
    .line 110
    :cond_5
    new-instance p3, La/ru80;

    .line 111
    .line 112
    const/4 p1, 0x6

    .line 113
    invoke-direct {p3, v5, p1}, La/ru80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_6
    check-cast p3, Lkotlin/jvm/functions/Function2;

    .line 120
    .line 121
    invoke-virtual {p2, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-nez p1, :cond_7

    .line 130
    .line 131
    if-ne v0, v1, :cond_8

    .line 132
    .line 133
    :cond_7
    new-instance v0, La/bac0;

    .line 134
    .line 135
    const/16 p1, 0xc

    .line 136
    .line 137
    invoke-direct {v0, v5, p1}, La/bac0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 144
    .line 145
    invoke-static {p0, p3, v0, p2, v4}, La/i4w0;->v(La/zmc0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_9
    invoke-virtual {p2}, La/fet;->X()V

    .line 150
    .line 151
    .line 152
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
