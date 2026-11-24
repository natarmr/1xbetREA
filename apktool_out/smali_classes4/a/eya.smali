.class public final synthetic La/eya;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/htr;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/htr;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/eya;->a:B

    iput-object p1, p0, La/eya;->b:La/htr;

    iput-object p2, p0, La/eya;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/htr;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    iput-byte p3, p0, La/eya;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/eya;->b:La/htr;

    iput-object p2, p0, La/eya;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/eya;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/eya;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v2, p1

    .line 9
    check-cast v2, La/i8z;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v4, La/x6s;

    .line 20
    .line 21
    const/16 p1, 0x17

    .line 22
    .line 23
    invoke-direct {v4, v1, p1}, La/x6s;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 24
    .line 25
    .line 26
    new-instance v5, La/i160;

    .line 27
    .line 28
    const/16 p1, 0xb

    .line 29
    .line 30
    invoke-direct {v5, v1, p1}, La/i160;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/16 v7, 0x8

    .line 35
    .line 36
    iget-object v3, p0, La/eya;->b:La/htr;

    .line 37
    .line 38
    invoke-static/range {v2 .. v7}, La/uzb;->U(La/i8z;La/htr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/xz8;I)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    move-object v0, p1

    .line 45
    check-cast v0, La/i8z;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v2, La/x6s;

    .line 56
    .line 57
    const/16 p1, 0x16

    .line 58
    .line 59
    invoke-direct {v2, v1, p1}, La/x6s;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 60
    .line 61
    .line 62
    new-instance v3, La/i160;

    .line 63
    .line 64
    const/4 p1, 0x4

    .line 65
    invoke-direct {v3, v1, p1}, La/i160;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 66
    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    const/16 v5, 0x8

    .line 70
    .line 71
    iget-object v1, p0, La/eya;->b:La/htr;

    .line 72
    .line 73
    invoke-static/range {v0 .. v5}, La/uzb;->U(La/i8z;La/htr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/xz8;I)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_1
    move-object v0, p1

    .line 80
    check-cast v0, La/i8z;

    .line 81
    .line 82
    check-cast p2, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v2, La/x6s;

    .line 91
    .line 92
    const/16 p1, 0x15

    .line 93
    .line 94
    invoke-direct {v2, v1, p1}, La/x6s;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 95
    .line 96
    .line 97
    const/4 v4, 0x0

    .line 98
    const/16 v5, 0xc

    .line 99
    .line 100
    iget-object v1, p0, La/eya;->b:La/htr;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-static/range {v0 .. v5}, La/uzb;->U(La/i8z;La/htr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/xz8;I)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_2
    check-cast p1, La/fet;

    .line 110
    .line 111
    check-cast p2, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    const/4 p2, 0x1

    .line 117
    invoke-static {p2}, La/x8x;->L(I)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    iget-object p0, p0, La/eya;->b:La/htr;

    .line 122
    .line 123
    invoke-static {p0, v1, p1, p2}, La/zgc;->l(La/htr;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_3
    move-object v0, p1

    .line 130
    check-cast v0, La/i8z;

    .line 131
    .line 132
    check-cast p2, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    new-instance v4, La/xz8;

    .line 141
    .line 142
    const/16 p1, 0x10

    .line 143
    .line 144
    invoke-direct {v4, v1, p1}, La/xz8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 145
    .line 146
    .line 147
    const/4 v5, 0x6

    .line 148
    iget-object v1, p0, La/eya;->b:La/htr;

    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    const/4 v3, 0x0

    .line 152
    invoke-static/range {v0 .. v5}, La/uzb;->U(La/i8z;La/htr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/xz8;I)V

    .line 153
    .line 154
    .line 155
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object p0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
