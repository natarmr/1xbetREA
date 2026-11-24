.class public final synthetic La/zm10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pn10;


# direct methods
.method public synthetic constructor <init>(La/pn10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zm10;->a:B

    iput-object p1, p0, La/zm10;->b:La/pn10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/zm10;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/zm10;->b:La/pn10;

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/tm10;

    .line 19
    .line 20
    iget-object v0, v0, La/tm10;->a:La/io10;

    .line 21
    .line 22
    sget-object v2, La/io10;->c:La/io10;

    .line 23
    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    sget-object v0, La/jo10;->b:La/jo10;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v0, La/jo10;->a:La/jo10;

    .line 30
    .line 31
    :goto_0
    invoke-virtual {p0, v0, v1, v1}, La/pn10;->Q(La/jo10;ZZ)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, La/pn10;->O(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/pn10;->O(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/tm10;

    .line 57
    .line 58
    iget-object v0, v0, La/tm10;->a:La/io10;

    .line 59
    .line 60
    sget-object v2, La/io10;->c:La/io10;

    .line 61
    .line 62
    if-ne v0, v2, :cond_1

    .line 63
    .line 64
    sget-object v0, La/jo10;->b:La/jo10;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    sget-object v0, La/jo10;->a:La/jo10;

    .line 68
    .line 69
    :goto_1
    invoke-virtual {p0, v0, v1, v1}, La/pn10;->Q(La/jo10;ZZ)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/pn10;->O(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    instance-of v0, p1, Ljava/net/UnknownHostException;

    .line 82
    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    invoke-virtual {p0, p1}, La/pn10;->O(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/pn10;->O(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/pn10;->O(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    instance-of v0, p1, Ljava/net/UnknownHostException;

    .line 113
    .line 114
    if-nez v0, :cond_3

    .line 115
    .line 116
    invoke-virtual {p0, p1}, La/pn10;->O(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1}, La/pn10;->O(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p1}, La/pn10;->O(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
