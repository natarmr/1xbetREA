.class public final synthetic La/f4e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i4e0;


# direct methods
.method public synthetic constructor <init>(La/i4e0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f4e0;->a:B

    iput-object p1, p0, La/f4e0;->b:La/i4e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/f4e0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/f4e0;->b:La/i4e0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    check-cast p2, Landroid/os/Bundle;

    .line 11
    .line 12
    sget-object v0, La/i4e0;->P1:La/xi70;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string p1, "SELECTOR_RESULT_SELECTOR_TYPE"

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_6

    .line 27
    .line 28
    const-string v0, "SELECTOR_RESULT"

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_6

    .line 35
    .line 36
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v2, 0x21

    .line 39
    .line 40
    if-gt v1, v2, :cond_0

    .line 41
    .line 42
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {p2}, La/e4e0;->f(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/os/Parcelable;

    .line 52
    .line 53
    :goto_0
    check-cast v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 54
    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    const/4 v3, 0x0

    .line 61
    if-lt v1, v2, :cond_2

    .line 62
    .line 63
    invoke-static {p2}, La/e4e0;->e(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    instance-of p2, p1, La/i6i0;

    .line 73
    .line 74
    if-nez p2, :cond_3

    .line 75
    .line 76
    move-object p1, v3

    .line 77
    :cond_3
    check-cast p1, La/i6i0;

    .line 78
    .line 79
    :goto_1
    instance-of p2, p1, La/i6i0;

    .line 80
    .line 81
    if-eqz p2, :cond_4

    .line 82
    .line 83
    move-object v3, p1

    .line 84
    check-cast v3, La/i6i0;

    .line 85
    .line 86
    :cond_4
    if-nez v3, :cond_5

    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    iget-object p0, p0, La/i4e0;->O1:La/a8z;

    .line 92
    .line 93
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, La/k3t0;

    .line 98
    .line 99
    new-instance p1, La/z3e0;

    .line 100
    .line 101
    invoke-direct {p1, v3, v0}, La/z3e0;-><init>(La/i6i0;Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    :goto_2
    return-object p0

    .line 110
    :pswitch_0
    iget-object p0, p0, La/i4e0;->O1:La/a8z;

    .line 111
    .line 112
    check-cast p1, La/fet;

    .line 113
    .line 114
    check-cast p2, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    sget-object v0, La/i4e0;->P1:La/xi70;

    .line 121
    .line 122
    and-int/lit8 v0, p2, 0x3

    .line 123
    .line 124
    const/4 v1, 0x2

    .line 125
    const/4 v2, 0x1

    .line 126
    const/4 v3, 0x0

    .line 127
    if-eq v0, v1, :cond_7

    .line 128
    .line 129
    move v0, v2

    .line 130
    goto :goto_3

    .line 131
    :cond_7
    move v0, v3

    .line 132
    :goto_3
    and-int/2addr p2, v2

    .line 133
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_a

    .line 138
    .line 139
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, La/k3t0;

    .line 144
    .line 145
    check-cast p2, La/i3t0;

    .line 146
    .line 147
    invoke-virtual {p2, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    move-object v6, p0

    .line 156
    check-cast v6, La/k3t0;

    .line 157
    .line 158
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-nez p0, :cond_8

    .line 167
    .line 168
    sget-object p0, La/ukd;->a:La/cl5;

    .line 169
    .line 170
    if-ne v0, p0, :cond_9

    .line 171
    .line 172
    :cond_8
    new-instance v4, La/prc0;

    .line 173
    .line 174
    const/4 v10, 0x0

    .line 175
    const/16 v11, 0x15

    .line 176
    .line 177
    const/4 v5, 0x1

    .line 178
    const-class v7, La/k3t0;

    .line 179
    .line 180
    const-string v8, "onAction"

    .line 181
    .line 182
    const-string v9, "onAction(Ljava/lang/Object;)V"

    .line 183
    .line 184
    invoke-direct/range {v4 .. v11}, La/prc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    move-object v0, v4

    .line 191
    :cond_9
    check-cast v0, La/jhy;

    .line 192
    .line 193
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 194
    .line 195
    invoke-static {p2, v0, p1, v3}, La/dwi0;->v(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_a
    invoke-virtual {p1}, La/fet;->X()V

    .line 200
    .line 201
    .line 202
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object p0

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
