.class public final synthetic La/dq6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oy6;


# direct methods
.method public synthetic constructor <init>(La/oy6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dq6;->a:B

    iput-object p1, p0, La/dq6;->b:La/oy6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/dq6;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/dq6;->b:La/oy6;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    check-cast p1, La/y5d;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p2, La/fet;

    .line 15
    .line 16
    check-cast p3, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    and-int/lit8 p1, p3, 0x11

    .line 26
    .line 27
    if-eq p1, v1, :cond_0

    .line 28
    .line 29
    move p1, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v2

    .line 32
    :goto_0
    and-int/2addr p3, v3

    .line 33
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p0, p0, La/oy6;->a:La/vf40;

    .line 40
    .line 41
    iget-object p0, p0, La/vf40;->a:La/pgs;

    .line 42
    .line 43
    check-cast p0, La/jgs;

    .line 44
    .line 45
    iget-object p0, p0, La/jgs;->a:Ljava/lang/String;

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-static {v2, p2, p1, p0}, La/a8k0;->e(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 53
    .line 54
    .line 55
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_0
    move-object v8, p2

    .line 59
    check-cast v8, La/fet;

    .line 60
    .line 61
    check-cast p3, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    and-int/lit8 p1, p2, 0x11

    .line 71
    .line 72
    if-eq p1, v1, :cond_2

    .line 73
    .line 74
    move v2, v3

    .line 75
    :cond_2
    and-int/lit8 p1, p2, 0x1

    .line 76
    .line 77
    invoke-virtual {v8, p1, v2}, La/fet;->U(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    sget-object p1, La/qmk;->a:La/zcl;

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    const/4 p2, 0x2

    .line 87
    sget-object p3, La/jm40;->b:La/jm40;

    .line 88
    .line 89
    const/high16 v0, 0x41400000    # 12.0f

    .line 90
    .line 91
    invoke-static {p3, v0, p1, p2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    iget-object p1, p0, La/oy6;->a:La/vf40;

    .line 96
    .line 97
    iget-object v5, p1, La/vf40;->b:La/j43;

    .line 98
    .line 99
    new-instance p1, La/dq6;

    .line 100
    .line 101
    invoke-direct {p1, p0, v3}, La/dq6;-><init>(La/oy6;B)V

    .line 102
    .line 103
    .line 104
    const p0, -0x3c794fa

    .line 105
    .line 106
    .line 107
    invoke-static {p0, p1, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    const/16 v9, 0xd80

    .line 112
    .line 113
    const/4 v6, 0x0

    .line 114
    invoke-static/range {v4 .. v9}, La/q8x;->i(La/mm40;La/j43;La/xdr;La/ugd;La/fet;I)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    invoke-virtual {v8}, La/fet;->X()V

    .line 119
    .line 120
    .line 121
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
