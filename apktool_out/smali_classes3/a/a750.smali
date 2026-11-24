.class public final synthetic La/a750;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p850;

.field public final synthetic c:La/ha8;


# direct methods
.method public synthetic constructor <init>(La/p850;La/ha8;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a750;->a:B

    iput-object p1, p0, La/a750;->b:La/p850;

    iput-object p2, p0, La/a750;->c:La/ha8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/a750;->a:B

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    iget-object v2, p0, La/a750;->c:La/ha8;

    .line 5
    .line 6
    iget-object p0, p0, La/a750;->b:La/p850;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, La/ha8;->getKey()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, La/b850;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, p1, v1}, La/b850;-><init>(Ljava/lang/String;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v2}, La/ha8;->getKey()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, La/p850;->b0(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, La/ha8;->getKey()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v0, La/l750;

    .line 47
    .line 48
    const/4 v1, 0x5

    .line 49
    invoke-direct {v0, p1, v2, v1}, La/l750;-><init>(Ljava/lang/String;La/ha8;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-interface {v2}, La/ha8;->getKey()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v0, La/b850;

    .line 66
    .line 67
    const/4 v1, 0x4

    .line 68
    invoke-direct {v0, p1, v1}, La/b850;-><init>(Ljava/lang/String;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-interface {v2}, La/ha8;->getKey()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v0, La/b850;

    .line 85
    .line 86
    const/4 v1, 0x6

    .line 87
    invoke-direct {v0, p1, v1}, La/b850;-><init>(Ljava/lang/String;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

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
    invoke-interface {v2}, La/ha8;->getKey()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    new-instance v0, La/b850;

    .line 104
    .line 105
    invoke-direct {v0, p1, v1}, La/b850;-><init>(Ljava/lang/String;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-interface {v2}, La/ha8;->getKey()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    new-instance v0, La/b850;

    .line 122
    .line 123
    const/16 v1, 0x8

    .line 124
    .line 125
    invoke-direct {v0, p1, v1}, La/b850;-><init>(Ljava/lang/String;B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-interface {v2}, La/ha8;->getKey()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    new-instance v0, La/l750;

    .line 142
    .line 143
    invoke-direct {v0, p1, v2, v1}, La/l750;-><init>(Ljava/lang/String;La/ha8;B)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    nop

    .line 153
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
