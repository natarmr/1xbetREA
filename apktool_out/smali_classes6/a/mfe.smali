.class public final synthetic La/mfe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/db00;

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/db00;ZLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/mfe;->a:B

    iput-object p1, p0, La/mfe;->b:La/db00;

    iput-boolean p2, p0, La/mfe;->c:Z

    iput-object p3, p0, La/mfe;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/mfe;->a:B

    .line 2
    .line 3
    sget-object v1, La/ukd;->a:La/cl5;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    check-cast p1, La/zdz;

    .line 10
    .line 11
    move-object v10, p2

    .line 12
    check-cast v10, La/fet;

    .line 13
    .line 14
    check-cast p3, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    and-int/lit8 p1, p2, 0x11

    .line 24
    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    if-eq p1, v3, :cond_0

    .line 29
    .line 30
    move v2, v4

    .line 31
    :cond_0
    and-int/lit8 p1, p2, 0x1

    .line 32
    .line 33
    invoke-virtual {v10, p1, v2}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    sget-object p1, La/qmk;->a:La/zcl;

    .line 40
    .line 41
    const/high16 v6, 0x41000000    # 8.0f

    .line 42
    .line 43
    const/4 v7, 0x7

    .line 44
    sget-object v2, La/jm40;->b:La/jm40;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v1, :cond_1

    .line 58
    .line 59
    new-instance p1, La/vzd;

    .line 60
    .line 61
    const/4 p2, 0x4

    .line 62
    invoke-direct {p1, p2}, La/vzd;-><init>(B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v10, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    move-object v9, p1

    .line 69
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 70
    .line 71
    const/16 v11, 0x6000

    .line 72
    .line 73
    iget-object v6, p0, La/mfe;->b:La/db00;

    .line 74
    .line 75
    iget-boolean v7, p0, La/mfe;->c:Z

    .line 76
    .line 77
    iget-object v8, p0, La/mfe;->d:Lkotlin/jvm/functions/Function1;

    .line 78
    .line 79
    invoke-static/range {v5 .. v11}, La/t9x;->y(La/mm40;La/db00;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {v10}, La/fet;->X()V

    .line 84
    .line 85
    .line 86
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_0
    if-eq p1, v3, :cond_3

    .line 90
    .line 91
    move v2, v4

    .line 92
    :cond_3
    and-int/lit8 p1, p2, 0x1

    .line 93
    .line 94
    invoke-virtual {v10, p1, v2}, La/fet;->U(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_5

    .line 99
    .line 100
    sget-object p1, La/qmk;->a:La/zcl;

    .line 101
    .line 102
    const/high16 v6, 0x41000000    # 8.0f

    .line 103
    .line 104
    const/4 v7, 0x7

    .line 105
    sget-object v2, La/jm40;->b:La/jm40;

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    const/4 v4, 0x0

    .line 109
    const/4 v5, 0x0

    .line 110
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-ne p1, v1, :cond_4

    .line 119
    .line 120
    new-instance p1, La/vzd;

    .line 121
    .line 122
    const/4 p2, 0x5

    .line 123
    invoke-direct {p1, p2}, La/vzd;-><init>(B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    move-object v9, p1

    .line 130
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 131
    .line 132
    const/16 v11, 0x6000

    .line 133
    .line 134
    iget-object v6, p0, La/mfe;->b:La/db00;

    .line 135
    .line 136
    iget-boolean v7, p0, La/mfe;->c:Z

    .line 137
    .line 138
    iget-object v8, p0, La/mfe;->d:Lkotlin/jvm/functions/Function1;

    .line 139
    .line 140
    invoke-static/range {v5 .. v11}, La/t9x;->y(La/mm40;La/db00;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_5
    invoke-virtual {v10}, La/fet;->X()V

    .line 145
    .line 146
    .line 147
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
