.class public final synthetic La/twy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o6w;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/o6w;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/twy;->a:B

    iput-object p1, p0, La/twy;->b:La/o6w;

    iput-object p2, p0, La/twy;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/twy;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const v2, 0x2fd4df92

    .line 5
    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, p0, La/twy;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object p0, p0, La/twy;->b:La/o6w;

    .line 12
    .line 13
    check-cast p1, La/hcz;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/o6w;->a:La/a4x;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    new-instance v6, La/y9k0;

    .line 28
    .line 29
    invoke-direct {v6, p0, v1}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 30
    .line 31
    .line 32
    new-instance v1, La/njh0;

    .line 33
    .line 34
    const/16 v7, 0x9

    .line 35
    .line 36
    invoke-direct {v1, p0, v5, v7}, La/njh0;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 37
    .line 38
    .line 39
    new-instance p0, La/ugd;

    .line 40
    .line 41
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0, v4, v6, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/o6w;->a:La/a4x;

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    new-instance v1, La/ap30;

    .line 60
    .line 61
    const/4 v6, 0x4

    .line 62
    invoke-direct {v1, p0, v6}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 63
    .line 64
    .line 65
    new-instance v6, La/a100;

    .line 66
    .line 67
    const/16 v7, 0x8

    .line 68
    .line 69
    invoke-direct {v6, p0, v5, v7}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 70
    .line 71
    .line 72
    new-instance p0, La/ugd;

    .line 73
    .line 74
    invoke-direct {p0, v2, v3, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0, v4, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, La/o6w;->a:La/a4x;

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    new-instance v6, La/ap30;

    .line 93
    .line 94
    invoke-direct {v6, v0, v1}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 95
    .line 96
    .line 97
    new-instance v1, La/h8w;

    .line 98
    .line 99
    const/4 v7, 0x7

    .line 100
    invoke-direct {v1, v0, p0, v5, v7}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 101
    .line 102
    .line 103
    new-instance p0, La/ugd;

    .line 104
    .line 105
    const v0, 0x799532c4

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, v0, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v2, v4, v6, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object p0, p0, La/o6w;->a:La/a4x;

    .line 121
    .line 122
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    new-instance v1, La/far;

    .line 127
    .line 128
    const/16 v6, 0x1c

    .line 129
    .line 130
    invoke-direct {v1, p0, v6}, La/far;-><init>(Ljava/util/List;B)V

    .line 131
    .line 132
    .line 133
    new-instance v6, La/yul;

    .line 134
    .line 135
    const/16 v7, 0xe

    .line 136
    .line 137
    invoke-direct {v6, p0, v5, v7}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 138
    .line 139
    .line 140
    new-instance p0, La/ugd;

    .line 141
    .line 142
    invoke-direct {p0, v2, v3, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0, v4, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 146
    .line 147
    .line 148
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
