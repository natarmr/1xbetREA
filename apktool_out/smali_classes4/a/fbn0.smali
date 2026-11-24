.class public final synthetic La/fbn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:La/a4x;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(BLa/a4x;Lkotlin/jvm/functions/Function1;ZZ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/fbn0;->a:B

    iput-boolean p4, p0, La/fbn0;->b:Z

    iput-object p2, p0, La/fbn0;->c:La/a4x;

    iput-boolean p5, p0, La/fbn0;->d:Z

    iput-object p3, p0, La/fbn0;->e:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/fbn0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const v2, -0x4297e015

    .line 5
    .line 6
    .line 7
    iget-object v3, p0, La/fbn0;->e:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iget-boolean v4, p0, La/fbn0;->d:Z

    .line 10
    .line 11
    iget-object v5, p0, La/fbn0;->c:La/a4x;

    .line 12
    .line 13
    iget-boolean p0, p0, La/fbn0;->b:Z

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v6, p1

    .line 19
    check-cast v6, La/i8z;

    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    new-instance p0, La/f8l0;

    .line 27
    .line 28
    const/16 p1, 0x19

    .line 29
    .line 30
    invoke-direct {p0, p1}, La/f8l0;-><init>(B)V

    .line 31
    .line 32
    .line 33
    sget-object p1, La/y860;->h:La/ugd;

    .line 34
    .line 35
    invoke-static {v6, p0, p1}, La/i8z;->d(La/i8z;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    new-instance p0, La/f8l0;

    .line 39
    .line 40
    const/16 p1, 0x1a

    .line 41
    .line 42
    invoke-direct {p0, p1}, La/f8l0;-><init>(B)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    new-instance v8, La/zcn0;

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-direct {v8, p0, v5, p1}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    new-instance v10, La/adn0;

    .line 56
    .line 57
    invoke-direct {v10, v5, p1}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 58
    .line 59
    .line 60
    new-instance p0, La/cz0;

    .line 61
    .line 62
    const/16 p1, 0xb

    .line 63
    .line 64
    invoke-direct {p0, v5, v4, v3, p1}, La/cz0;-><init>(Ljava/util/List;ZLkotlin/jvm/functions/Function1;B)V

    .line 65
    .line 66
    .line 67
    new-instance v11, La/ugd;

    .line 68
    .line 69
    invoke-direct {v11, v2, v1, p0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    invoke-virtual/range {v6 .. v11}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_0
    move-object v0, p1

    .line 80
    check-cast v0, La/i8z;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    if-eqz p0, :cond_1

    .line 86
    .line 87
    new-instance p0, La/f8l0;

    .line 88
    .line 89
    const/16 p1, 0x15

    .line 90
    .line 91
    invoke-direct {p0, p1}, La/f8l0;-><init>(B)V

    .line 92
    .line 93
    .line 94
    sget-object p1, La/o050;->f:La/ugd;

    .line 95
    .line 96
    invoke-static {v0, p0, p1}, La/i8z;->d(La/i8z;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 97
    .line 98
    .line 99
    :cond_1
    new-instance p0, La/f8l0;

    .line 100
    .line 101
    const/16 p1, 0x16

    .line 102
    .line 103
    invoke-direct {p0, p1}, La/f8l0;-><init>(B)V

    .line 104
    .line 105
    .line 106
    move p1, v1

    .line 107
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    move v6, v2

    .line 112
    new-instance v2, La/o3l0;

    .line 113
    .line 114
    const/16 v7, 0x1d

    .line 115
    .line 116
    invoke-direct {v2, p0, v5, v7}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    move p0, v4

    .line 120
    new-instance v4, La/y9k0;

    .line 121
    .line 122
    invoke-direct {v4, v5, v7}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 123
    .line 124
    .line 125
    new-instance v7, La/cz0;

    .line 126
    .line 127
    const/16 v8, 0xa

    .line 128
    .line 129
    invoke-direct {v7, v5, p0, v3, v8}, La/cz0;-><init>(Ljava/util/List;ZLkotlin/jvm/functions/Function1;B)V

    .line 130
    .line 131
    .line 132
    new-instance v5, La/ugd;

    .line 133
    .line 134
    invoke-direct {v5, v6, p1, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    const/4 v3, 0x0

    .line 138
    invoke-virtual/range {v0 .. v5}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
