.class public final synthetic La/p4p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:I

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(BILa/a4x;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/p4p;->a:B

    iput-object p3, p0, La/p4p;->b:La/a4x;

    iput p2, p0, La/p4p;->c:I

    iput-object p4, p0, La/p4p;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/p4p;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const v2, -0x73c450aa

    .line 5
    .line 6
    .line 7
    iget-object v3, p0, La/p4p;->d:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iget v4, p0, La/p4p;->c:I

    .line 10
    .line 11
    iget-object p0, p0, La/p4p;->b:La/a4x;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v5, p1

    .line 17
    check-cast v5, La/i8z;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance p1, La/x6o;

    .line 23
    .line 24
    const/16 v0, 0x17

    .line 25
    .line 26
    invoke-direct {p1, v0}, La/x6o;-><init>(B)V

    .line 27
    .line 28
    .line 29
    new-instance v0, La/cl2;

    .line 30
    .line 31
    const/4 v6, 0x3

    .line 32
    invoke-direct {v0, v4, v6}, La/cl2;-><init>(IB)V

    .line 33
    .line 34
    .line 35
    move v4, v6

    .line 36
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    new-instance v7, La/d2p;

    .line 41
    .line 42
    invoke-direct {v7, p1, p0, v4}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    new-instance v8, La/a8;

    .line 46
    .line 47
    const/16 p1, 0xc

    .line 48
    .line 49
    invoke-direct {v8, v0, p0, p1}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    new-instance v9, La/v2m;

    .line 53
    .line 54
    const/16 p1, 0x18

    .line 55
    .line 56
    invoke-direct {v9, p0, p1}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 57
    .line 58
    .line 59
    new-instance p1, La/yul;

    .line 60
    .line 61
    const/4 v0, 0x6

    .line 62
    invoke-direct {p1, p0, v3, v0}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 63
    .line 64
    .line 65
    new-instance v10, La/ugd;

    .line 66
    .line 67
    invoke-direct {v10, v2, v1, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual/range {v5 .. v10}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_0
    move-object v0, p1

    .line 77
    check-cast v0, La/i8z;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance p1, La/x6o;

    .line 83
    .line 84
    const/16 v5, 0x16

    .line 85
    .line 86
    invoke-direct {p1, v5}, La/x6o;-><init>(B)V

    .line 87
    .line 88
    .line 89
    new-instance v5, La/cl2;

    .line 90
    .line 91
    const/4 v6, 0x2

    .line 92
    invoke-direct {v5, v4, v6}, La/cl2;-><init>(IB)V

    .line 93
    .line 94
    .line 95
    move v4, v1

    .line 96
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    move v6, v2

    .line 101
    new-instance v2, La/d2p;

    .line 102
    .line 103
    const/4 v7, 0x4

    .line 104
    invoke-direct {v2, p1, p0, v7}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    move-object p1, v3

    .line 108
    new-instance v3, La/a8;

    .line 109
    .line 110
    const/16 v7, 0xd

    .line 111
    .line 112
    invoke-direct {v3, v5, p0, v7}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 113
    .line 114
    .line 115
    move v5, v4

    .line 116
    new-instance v4, La/v2m;

    .line 117
    .line 118
    const/16 v7, 0x19

    .line 119
    .line 120
    invoke-direct {v4, p0, v7}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 121
    .line 122
    .line 123
    new-instance v7, La/yul;

    .line 124
    .line 125
    const/4 v8, 0x7

    .line 126
    invoke-direct {v7, p0, p1, v8}, La/yul;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 127
    .line 128
    .line 129
    move p0, v5

    .line 130
    new-instance v5, La/ugd;

    .line 131
    .line 132
    invoke-direct {v5, v6, p0, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v0 .. v5}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
