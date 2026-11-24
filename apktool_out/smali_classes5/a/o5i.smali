.class public final synthetic La/o5i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t9n;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/t9n;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/o5i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o5i;->b:La/t9n;

    iput-object p2, p0, La/o5i;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/t9n;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/o5i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o5i;->b:La/t9n;

    iput-object p2, p0, La/o5i;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/o5i;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/o5i;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/o5i;->b:La/t9n;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/16 p2, 0x181

    .line 18
    .line 19
    invoke-static {p2}, La/x8x;->L(I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-static {p0, v1, p1, p2}, La/jar0;->L(La/t9n;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    move-object v5, p1

    .line 30
    check-cast v5, La/fet;

    .line 31
    .line 32
    check-cast p2, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    and-int/lit8 p2, p1, 0x3

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v2, 0x1

    .line 43
    if-eq p2, v0, :cond_0

    .line 44
    .line 45
    move p2, v2

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p2, v7

    .line 48
    :goto_0
    and-int/2addr p1, v2

    .line 49
    invoke-virtual {v5, p1, p2}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, La/t9n;->a:La/o0x;

    .line 56
    .line 57
    move-object p1, v1

    .line 58
    iget-object v1, p0, La/t9n;->b:La/o0x;

    .line 59
    .line 60
    invoke-virtual {v5, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    if-nez p2, :cond_1

    .line 69
    .line 70
    sget-object p2, La/ukd;->a:La/cl5;

    .line 71
    .line 72
    if-ne v2, p2, :cond_2

    .line 73
    .line 74
    :cond_1
    new-instance v2, La/olh;

    .line 75
    .line 76
    const/4 p2, 0x6

    .line 77
    invoke-direct {v2, p1, p2}, La/olh;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 84
    .line 85
    sget-object v3, La/phu0;->c:La/ugd;

    .line 86
    .line 87
    new-instance p1, La/tx;

    .line 88
    .line 89
    const/16 p2, 0xf

    .line 90
    .line 91
    invoke-direct {p1, p0, p2}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    const p0, 0x762cb27f

    .line 95
    .line 96
    .line 97
    invoke-static {p0, p1, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    const/16 v6, 0x6c00

    .line 102
    .line 103
    invoke-static/range {v0 .. v6}, La/ibm0;->e(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;La/xdr;La/ugd;La/fet;I)V

    .line 104
    .line 105
    .line 106
    sget-object p0, La/qmk;->a:La/zcl;

    .line 107
    .line 108
    const/high16 p0, 0x42300000    # 44.0f

    .line 109
    .line 110
    sget-object p1, La/jm40;->b:La/jm40;

    .line 111
    .line 112
    invoke-static {p1, p0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    sget-object p1, La/qmk;->m:La/zcl;

    .line 117
    .line 118
    sget-object p2, La/vgg0;->a:La/ugg0;

    .line 119
    .line 120
    invoke-static {p1, p1, p1, p1, p0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    sget-object p1, La/zaq0;->b:La/zfn;

    .line 125
    .line 126
    invoke-virtual {v5, p1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    check-cast p2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 131
    .line 132
    invoke-virtual {p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    sget-object p2, La/jd8;->n:La/ljc;

    .line 137
    .line 138
    invoke-static {p0, v0, v1, p2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    const/high16 p2, 0x41200000    # 10.0f

    .line 143
    .line 144
    invoke-static {p0, p2}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    sget-object p2, La/gqw0;->e:La/zx7;

    .line 149
    .line 150
    sget-object v0, La/jr8;->a:La/jr8;

    .line 151
    .line 152
    invoke-virtual {v0, p0, p2}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const p0, 0x7f080a22

    .line 157
    .line 158
    .line 159
    invoke-static {p0, v7, v5}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v5, p1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 168
    .line 169
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 170
    .line 171
    .line 172
    move-result-wide v3

    .line 173
    const/16 v6, 0x38

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    const/4 v1, 0x0

    .line 177
    invoke-static/range {v0 .. v7}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_3
    invoke-virtual {v5}, La/fet;->X()V

    .line 182
    .line 183
    .line 184
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
