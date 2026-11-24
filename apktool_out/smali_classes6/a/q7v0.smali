.class public final synthetic La/q7v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s7v0;


# direct methods
.method public synthetic constructor <init>(La/s7v0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q7v0;->a:B

    iput-object p1, p0, La/q7v0;->b:La/s7v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/q7v0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/q7v0;->b:La/s7v0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/s7v0;->P1:La/wxs0;

    .line 10
    .line 11
    iget-object p0, p0, La/s7v0;->N1:La/a8z;

    .line 12
    .line 13
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/k3t0;

    .line 18
    .line 19
    sget-object v0, La/h7v0;->a:La/h7v0;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/s7v0;->P1:La/wxs0;

    .line 28
    .line 29
    iget-object p0, p0, La/s7v0;->N1:La/a8z;

    .line 30
    .line 31
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/k3t0;

    .line 36
    .line 37
    sget-object v0, La/i7v0;->a:La/i7v0;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    sget-object v0, La/s7v0;->P1:La/wxs0;

    .line 46
    .line 47
    iget-object p0, p0, La/s7v0;->K1:La/fiu0;

    .line 48
    .line 49
    if-eqz p0, :cond_0

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_0
    const-string p0, "viewModelFactory"

    .line 53
    .line 54
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :pswitch_2
    sget-object v0, La/s7v0;->P1:La/wxs0;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    instance-of v2, v0, La/af3;

    .line 72
    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    check-cast v0, La/af3;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object v0, v1

    .line 79
    :goto_0
    const-class v2, La/t7v0;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/o5d0;

    .line 92
    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/ze3;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move-object v0, v1

    .line 103
    :goto_1
    instance-of v3, v0, La/t7v0;

    .line 104
    .line 105
    if-nez v3, :cond_3

    .line 106
    .line 107
    move-object v0, v1

    .line 108
    :cond_3
    check-cast v0, La/t7v0;

    .line 109
    .line 110
    if-eqz v0, :cond_4

    .line 111
    .line 112
    iget-object v1, p0, La/s7v0;->L1:La/khf0;

    .line 113
    .line 114
    sget-object v2, La/s7v0;->Q1:[La/iiy;

    .line 115
    .line 116
    const/4 v3, 0x0

    .line 117
    aget-object v2, v2, v3

    .line 118
    .line 119
    invoke-virtual {v1, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    move-object v4, v1

    .line 124
    check-cast v4, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 125
    .line 126
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-object v3, v0, La/t7v0;->a:La/cad;

    .line 134
    .line 135
    iget-object v6, v0, La/t7v0;->b:La/gii0;

    .line 136
    .line 137
    iget-object v7, v0, La/t7v0;->c:La/g2v;

    .line 138
    .line 139
    iget-object v8, v0, La/t7v0;->d:La/m1e;

    .line 140
    .line 141
    iget-object v9, v0, La/t7v0;->e:La/ctf0;

    .line 142
    .line 143
    iget-object v10, v0, La/t7v0;->f:La/kys0;

    .line 144
    .line 145
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance v2, La/nzi;

    .line 155
    .line 156
    invoke-direct/range {v2 .. v10}, La/nzi;-><init>(La/cad;Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;La/i1w0;La/gii0;La/g2v;La/m1e;La/ctf0;La/kys0;)V

    .line 157
    .line 158
    .line 159
    move-object v1, v2

    .line 160
    goto :goto_2

    .line 161
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 162
    .line 163
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :goto_2
    return-object v1

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
