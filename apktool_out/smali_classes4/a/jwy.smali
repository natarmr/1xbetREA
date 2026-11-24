.class public final synthetic La/jwy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ik00;

.field public final synthetic c:La/mm40;

.field public final synthetic d:La/qdz;

.field public final synthetic e:La/e2d;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/ik00;La/mm40;La/qdz;La/e2d;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/jwy;->a:B

    iput-object p1, p0, La/jwy;->b:La/ik00;

    iput-object p2, p0, La/jwy;->c:La/mm40;

    iput-object p3, p0, La/jwy;->d:La/qdz;

    iput-object p4, p0, La/jwy;->e:La/e2d;

    iput-object p5, p0, La/jwy;->f:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/jwy;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/jwy;->b:La/ik00;

    .line 8
    .line 9
    check-cast p1, La/ir8;

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
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    and-int/lit8 p1, p2, 0x11

    .line 27
    .line 28
    if-eq p1, v2, :cond_0

    .line 29
    .line 30
    move v1, v3

    .line 31
    :cond_0
    and-int/lit8 p1, p2, 0x1

    .line 32
    .line 33
    invoke-virtual {v10, p1, v1}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    move-object v6, v4

    .line 40
    check-cast v6, La/hk00;

    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    iget-object v5, p0, La/jwy;->c:La/mm40;

    .line 44
    .line 45
    iget-object v7, p0, La/jwy;->d:La/qdz;

    .line 46
    .line 47
    iget-object v8, p0, La/jwy;->e:La/e2d;

    .line 48
    .line 49
    iget-object v9, p0, La/jwy;->f:Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    invoke-static/range {v5 .. v11}, La/j47;->o0(La/mm40;La/hk00;La/qdz;La/e2d;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v10}, La/fet;->X()V

    .line 56
    .line 57
    .line 58
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    and-int/lit8 p1, p2, 0x11

    .line 65
    .line 66
    if-eq p1, v2, :cond_2

    .line 67
    .line 68
    move v1, v3

    .line 69
    :cond_2
    and-int/lit8 p1, p2, 0x1

    .line 70
    .line 71
    invoke-virtual {v10, p1, v1}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    move-object v6, v4

    .line 78
    check-cast v6, La/hk00;

    .line 79
    .line 80
    const/4 v11, 0x0

    .line 81
    iget-object v5, p0, La/jwy;->c:La/mm40;

    .line 82
    .line 83
    iget-object v7, p0, La/jwy;->d:La/qdz;

    .line 84
    .line 85
    iget-object v8, p0, La/jwy;->e:La/e2d;

    .line 86
    .line 87
    iget-object v9, p0, La/jwy;->f:Lkotlin/jvm/functions/Function1;

    .line 88
    .line 89
    invoke-static/range {v5 .. v11}, La/dj8;->Q(La/mm40;La/hk00;La/qdz;La/e2d;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-virtual {v10}, La/fet;->X()V

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    and-int/lit8 p1, p2, 0x11

    .line 103
    .line 104
    if-eq p1, v2, :cond_4

    .line 105
    .line 106
    move v1, v3

    .line 107
    :cond_4
    and-int/lit8 p1, p2, 0x1

    .line 108
    .line 109
    invoke-virtual {v10, p1, v1}, La/fet;->U(IZ)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_5

    .line 114
    .line 115
    move-object v6, v4

    .line 116
    check-cast v6, La/hk00;

    .line 117
    .line 118
    const/4 v11, 0x0

    .line 119
    iget-object v5, p0, La/jwy;->c:La/mm40;

    .line 120
    .line 121
    iget-object v7, p0, La/jwy;->d:La/qdz;

    .line 122
    .line 123
    iget-object v8, p0, La/jwy;->e:La/e2d;

    .line 124
    .line 125
    iget-object v9, p0, La/jwy;->f:Lkotlin/jvm/functions/Function1;

    .line 126
    .line 127
    invoke-static/range {v5 .. v11}, La/kc5;->B0(La/mm40;La/hk00;La/qdz;La/e2d;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    invoke-virtual {v10}, La/fet;->X()V

    .line 132
    .line 133
    .line 134
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    and-int/lit8 p1, p2, 0x11

    .line 141
    .line 142
    if-eq p1, v2, :cond_6

    .line 143
    .line 144
    move v1, v3

    .line 145
    :cond_6
    and-int/lit8 p1, p2, 0x1

    .line 146
    .line 147
    invoke-virtual {v10, p1, v1}, La/fet;->U(IZ)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_7

    .line 152
    .line 153
    move-object v6, v4

    .line 154
    check-cast v6, La/hk00;

    .line 155
    .line 156
    const/4 v11, 0x0

    .line 157
    iget-object v5, p0, La/jwy;->c:La/mm40;

    .line 158
    .line 159
    iget-object v7, p0, La/jwy;->d:La/qdz;

    .line 160
    .line 161
    iget-object v8, p0, La/jwy;->e:La/e2d;

    .line 162
    .line 163
    iget-object v9, p0, La/jwy;->f:Lkotlin/jvm/functions/Function1;

    .line 164
    .line 165
    invoke-static/range {v5 .. v11}, La/x8f;->S(La/mm40;La/hk00;La/qdz;La/e2d;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_7
    invoke-virtual {v10}, La/fet;->X()V

    .line 170
    .line 171
    .line 172
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
