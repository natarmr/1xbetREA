.class public final synthetic La/y720;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ry6;


# direct methods
.method public synthetic constructor <init>(La/ry6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y720;->a:B

    iput-object p1, p0, La/y720;->b:La/ry6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/y720;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object p0, p0, La/y720;->b:La/ry6;

    .line 8
    .line 9
    check-cast p1, La/y5d;

    .line 10
    .line 11
    check-cast p2, La/fet;

    .line 12
    .line 13
    check-cast p3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
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
    sget-object p1, La/qmk;->a:La/zcl;

    .line 40
    .line 41
    const/high16 v7, 0x40000000    # 2.0f

    .line 42
    .line 43
    const/4 v8, 0x7

    .line 44
    sget-object v3, La/jm40;->b:La/jm40;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p0, p0, La/ry6;->b:La/uf40;

    .line 54
    .line 55
    iget-object p0, p0, La/uf40;->b:La/d480;

    .line 56
    .line 57
    check-cast p0, La/b480;

    .line 58
    .line 59
    invoke-static {p1, p0, p2, v2}, La/idx;->h(La/mm40;La/b480;La/fet;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 64
    .line 65
    .line 66
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    and-int/lit8 p1, p3, 0x11

    .line 73
    .line 74
    if-eq p1, v1, :cond_2

    .line 75
    .line 76
    move p1, v3

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    move p1, v2

    .line 79
    :goto_2
    and-int/2addr p3, v3

    .line 80
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    const/high16 p1, 0x3f800000    # 1.0f

    .line 87
    .line 88
    sget-object v3, La/jm40;->b:La/jm40;

    .line 89
    .line 90
    invoke-static {v3, p1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-object p3, p0, La/ry6;->b:La/uf40;

    .line 95
    .line 96
    iget-object p3, p3, La/uf40;->a:La/ogs;

    .line 97
    .line 98
    check-cast p3, La/kgs;

    .line 99
    .line 100
    iget-object p3, p3, La/kgs;->a:Ljava/lang/String;

    .line 101
    .line 102
    const/4 v0, 0x6

    .line 103
    invoke-static {v0, p2, p1, p3}, La/r7x;->c(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object p0, p0, La/ry6;->c:Ljava/lang/String;

    .line 107
    .line 108
    if-nez p0, :cond_3

    .line 109
    .line 110
    const p0, -0x80f41e3

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, v2}, La/fet;->r(Z)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    const p1, -0x80f41e2

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, p1}, La/fet;->e0(I)V

    .line 124
    .line 125
    .line 126
    sget-object p1, La/qmk;->a:La/zcl;

    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    const/16 v8, 0xd

    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    const/high16 v5, 0x40000000    # 2.0f

    .line 133
    .line 134
    const/4 v6, 0x0

    .line 135
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {v2, p2, p1, p0}, La/o5n0;->c(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v2}, La/fet;->r(Z)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_4
    invoke-virtual {p2}, La/fet;->X()V

    .line 147
    .line 148
    .line 149
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
