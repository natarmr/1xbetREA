.class public final synthetic La/y1l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/y1l;->a:B

    iput-object p1, p0, La/y1l;->c:Ljava/lang/Object;

    iput p2, p0, La/y1l;->b:I

    iput-object p3, p0, La/y1l;->d:Ljava/lang/Object;

    iput-object p4, p0, La/y1l;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/y1l;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/y1l;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/y1l;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/y1l;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Ljava/util/ArrayList;

    .line 13
    .line 14
    move-object v7, v2

    .line 15
    check-cast v7, La/xdr;

    .line 16
    .line 17
    move-object v8, v1

    .line 18
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    check-cast p1, La/g9z;

    .line 21
    .line 22
    check-cast p2, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    move-object v9, p3

    .line 29
    check-cast v9, La/fet;

    .line 30
    .line 31
    check-cast p4, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    and-int/lit8 p1, p3, 0x30

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v9, p2}, La/fet;->e(I)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    const/16 p1, 0x20

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/16 p1, 0x10

    .line 54
    .line 55
    :goto_0
    or-int/2addr p3, p1

    .line 56
    :cond_1
    and-int/lit16 p1, p3, 0x91

    .line 57
    .line 58
    const/16 p4, 0x90

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    const/4 v1, 0x0

    .line 62
    if-eq p1, p4, :cond_2

    .line 63
    .line 64
    move p1, v0

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move p1, v1

    .line 67
    :goto_1
    and-int/2addr p3, v0

    .line 68
    invoke-virtual {v9, p3, p1}, La/fet;->U(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    invoke-static {p2, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    move-object v5, p1

    .line 79
    check-cast v5, La/xo5;

    .line 80
    .line 81
    if-nez v5, :cond_3

    .line 82
    .line 83
    const p0, 0x33b21f8f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v9, p0}, La/fet;->e0(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9, v1}, La/fet;->r(Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    const p1, 0x33b21f90

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9, p1}, La/fet;->e0(I)V

    .line 97
    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    const/16 v10, 0x40

    .line 101
    .line 102
    iget v6, p0, La/y1l;->b:I

    .line 103
    .line 104
    invoke-static/range {v4 .. v10}, La/y860;->t(La/mm40;La/xo5;ILa/xdr;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9, v1}, La/fet;->r(Z)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    invoke-virtual {v9}, La/fet;->X()V

    .line 112
    .line 113
    .line 114
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_0
    check-cast v3, La/s1g;

    .line 118
    .line 119
    check-cast v2, La/j8l;

    .line 120
    .line 121
    check-cast v1, Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;

    .line 122
    .line 123
    check-cast p1, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    check-cast p2, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    check-cast p3, Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    check-cast p4, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result p4

    .line 147
    sget v0, Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;->k:I

    .line 148
    .line 149
    if-eqz v3, :cond_5

    .line 150
    .line 151
    invoke-virtual {v3, p1, p2, p3, p4}, La/s1g;->b(IIII)V

    .line 152
    .line 153
    .line 154
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    iget p0, p0, La/y1l;->b:I

    .line 159
    .line 160
    sub-int/2addr p0, p2

    .line 161
    div-int/lit8 p0, p0, 0x2

    .line 162
    .line 163
    int-to-float p1, p1

    .line 164
    iget p2, v1, Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;->f:F

    .line 165
    .line 166
    add-float/2addr p1, p2

    .line 167
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    int-to-float p2, p2

    .line 172
    add-float/2addr p2, p1

    .line 173
    float-to-int p1, p1

    .line 174
    float-to-int p2, p2

    .line 175
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 176
    .line 177
    .line 178
    move-result p3

    .line 179
    add-int/2addr p3, p0

    .line 180
    invoke-virtual {v2, p1, p0, p2, p3}, Landroid/view/View;->layout(IIII)V

    .line 181
    .line 182
    .line 183
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
