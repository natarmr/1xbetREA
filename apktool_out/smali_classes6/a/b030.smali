.class public final La/b030;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:La/gy20;


# direct methods
.method public constructor <init>(La/gy20;La/ugd;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/b030;->a:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b030;->c:La/gy20;

    iput-object p2, p0, La/b030;->b:La/ugd;

    return-void
.end method

.method public constructor <init>(La/ugd;La/gy20;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/b030;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/b030;->b:La/ugd;

    .line 8
    .line 9
    iput-object p2, p0, La/b030;->c:La/gy20;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/b030;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/y5d;

    .line 11
    .line 12
    check-cast p2, La/fet;

    .line 13
    .line 14
    check-cast p3, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    and-int/lit8 p1, p3, 0x11

    .line 24
    .line 25
    if-eq p1, v1, :cond_0

    .line 26
    .line 27
    move p1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p1, v3

    .line 30
    :goto_0
    and-int/2addr p3, v2

    .line 31
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p0, La/b030;->c:La/gy20;

    .line 38
    .line 39
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    iget-object p0, p0, La/b030;->b:La/ugd;

    .line 44
    .line 45
    invoke-virtual {p0, p1, p2, p3}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 50
    .line 51
    .line 52
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_0
    check-cast p1, La/y5d;

    .line 56
    .line 57
    move-object v8, p2

    .line 58
    check-cast v8, La/fet;

    .line 59
    .line 60
    check-cast p3, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    and-int/lit8 p1, p2, 0x11

    .line 70
    .line 71
    if-eq p1, v1, :cond_2

    .line 72
    .line 73
    move p1, v2

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    move p1, v3

    .line 76
    :goto_2
    and-int/2addr p2, v2

    .line 77
    invoke-virtual {v8, p2, p1}, La/fet;->U(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    iget-object v5, p0, La/b030;->c:La/gy20;

    .line 84
    .line 85
    move-object p1, v5

    .line 86
    check-cast p1, La/fv20;

    .line 87
    .line 88
    iget-object p1, p1, La/fv20;->b:La/a4x;

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    move p2, v3

    .line 95
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    if-eqz p3, :cond_5

    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    add-int/lit8 v0, p2, 0x1

    .line 106
    .line 107
    if-ltz p2, :cond_3

    .line 108
    .line 109
    move-object v6, p3

    .line 110
    check-cast v6, La/d4n;

    .line 111
    .line 112
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    iget-object v4, p0, La/b030;->b:La/ugd;

    .line 121
    .line 122
    invoke-virtual/range {v4 .. v9}, La/ugd;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move p2, v0

    .line 126
    goto :goto_3

    .line 127
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 128
    .line 129
    .line 130
    const/4 p0, 0x0

    .line 131
    throw p0

    .line 132
    :cond_4
    invoke-virtual {v8}, La/fet;->X()V

    .line 133
    .line 134
    .line 135
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
