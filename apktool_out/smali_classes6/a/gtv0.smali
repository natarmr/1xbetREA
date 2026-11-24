.class public final synthetic La/gtv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ywv0;


# direct methods
.method public synthetic constructor <init>(La/ywv0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gtv0;->a:B

    iput-object p1, p0, La/gtv0;->b:La/ywv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/gtv0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/gtv0;->b:La/ywv0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/lwk;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p1, La/ty2;

    .line 14
    .line 15
    const/16 v0, 0x1d

    .line 16
    .line 17
    invoke-direct {p1, p0, v0}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, La/uag0;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, La/ywv0;->m:La/vkr0;

    .line 27
    .line 28
    iget-object p0, p0, La/vkr0;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, La/t33;

    .line 31
    .line 32
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-virtual {p1, p0}, La/uag0;->H(F)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/bff0;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, La/bff0;->b()La/mkx;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object p0, p0, La/ywv0;->g:La/fuj0;

    .line 58
    .line 59
    iget v1, p1, La/mkx;->b:I

    .line 60
    .line 61
    invoke-virtual {p1}, La/mkx;->a()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    iget-object p0, p0, La/fuj0;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, La/pz40;

    .line 68
    .line 69
    check-cast p0, La/hgk0;

    .line 70
    .line 71
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    move-object v0, p1

    .line 76
    check-cast v0, La/zvv0;

    .line 77
    .line 78
    const/4 v10, 0x0

    .line 79
    const/16 v11, 0xffc

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    const/4 v4, 0x0

    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x0

    .line 88
    invoke-static/range {v0 .. v11}, La/zvv0;->a(La/zvv0;IILa/nsv0;La/nsv0;La/nsv0;IFIFFI)La/zvv0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1, v0}, La/zvv0;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_0

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_2
    check-cast p1, Ljava/lang/Float;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    iget-object p0, p0, La/ywv0;->m:La/vkr0;

    .line 112
    .line 113
    iget-object v0, p0, La/vkr0;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, La/mkt0;

    .line 116
    .line 117
    iget-object v0, v0, La/mkt0;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, La/pz40;

    .line 120
    .line 121
    check-cast v0, La/hgk0;

    .line 122
    .line 123
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_1

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :goto_1
    iget-object p0, p0, La/vkr0;->e:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p0, La/hcp0;

    .line 144
    .line 145
    new-instance v0, La/iuv0;

    .line 146
    .line 147
    invoke-direct {v0, p1}, La/iuv0;-><init>(F)V

    .line 148
    .line 149
    .line 150
    iget-object p0, p0, La/hcp0;->c:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p0, La/q99;

    .line 153
    .line 154
    invoke-interface {p0, v0}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_3
    check-cast p1, Ljava/lang/Float;

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    iget-object p0, p0, La/ywv0;->l:La/oxv0;

    .line 167
    .line 168
    neg-float p1, p1

    .line 169
    invoke-virtual {p0, p1}, La/oxv0;->a(F)V

    .line 170
    .line 171
    .line 172
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
