.class public final synthetic La/zwy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hk00;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/hk00;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zwy;->a:B

    iput-object p1, p0, La/zwy;->b:La/hk00;

    iput-object p2, p0, La/zwy;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/zwy;->a:B

    .line 2
    .line 3
    const v1, 0x2fd4df92

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object v3, p0, La/zwy;->c:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iget-object p0, p0, La/zwy;->b:La/hk00;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    check-cast p1, La/hcz;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/hk00;->a:La/a4x;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-instance v5, La/y9k0;

    .line 27
    .line 28
    invoke-direct {v5, p0, v4}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 29
    .line 30
    .line 31
    new-instance v6, La/njh0;

    .line 32
    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    invoke-direct {v6, p0, v3, v7}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/ugd;

    .line 39
    .line 40
    invoke-direct {p0, v1, v4, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0, v2, v5, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/hk00;->a:La/a4x;

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    new-instance v5, La/ap30;

    .line 59
    .line 60
    const/4 v6, 0x3

    .line 61
    invoke-direct {v5, p0, v6}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 62
    .line 63
    .line 64
    new-instance v6, La/a100;

    .line 65
    .line 66
    const/4 v7, 0x7

    .line 67
    invoke-direct {v6, p0, v3, v7}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 68
    .line 69
    .line 70
    new-instance p0, La/ugd;

    .line 71
    .line 72
    invoke-direct {p0, v1, v4, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0, v2, v5, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, La/hk00;->a:La/a4x;

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    new-instance v5, La/ap30;

    .line 91
    .line 92
    invoke-direct {v5, v0, v4}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 93
    .line 94
    .line 95
    new-instance v6, La/h8w;

    .line 96
    .line 97
    const/4 v7, 0x6

    .line 98
    invoke-direct {v6, v0, p0, v3, v7}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 99
    .line 100
    .line 101
    new-instance p0, La/ugd;

    .line 102
    .line 103
    const v0, 0x799532c4

    .line 104
    .line 105
    .line 106
    invoke-direct {p0, v0, v4, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v1, v2, v5, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object p0, p0, La/hk00;->a:La/a4x;

    .line 119
    .line 120
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    new-instance v5, La/far;

    .line 125
    .line 126
    const/16 v6, 0x1b

    .line 127
    .line 128
    invoke-direct {v5, p0, v6}, La/far;-><init>(Ljava/util/List;B)V

    .line 129
    .line 130
    .line 131
    new-instance v6, La/yul;

    .line 132
    .line 133
    const/16 v7, 0xd

    .line 134
    .line 135
    invoke-direct {v6, p0, v3, v7}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 136
    .line 137
    .line 138
    new-instance p0, La/ugd;

    .line 139
    .line 140
    invoke-direct {p0, v1, v4, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v0, v2, v5, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 144
    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
