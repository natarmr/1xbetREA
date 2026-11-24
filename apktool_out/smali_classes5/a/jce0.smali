.class public final synthetic La/jce0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mce0;


# direct methods
.method public synthetic constructor <init>(La/mce0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jce0;->a:B

    iput-object p1, p0, La/jce0;->b:La/mce0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/jce0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object p0, p0, La/jce0;->b:La/mce0;

    .line 9
    .line 10
    check-cast p1, Landroid/view/View;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/mce0;->e2:[La/iiy;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, La/mce0;->R0()La/u3r;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p0, p0, La/u3r;->e:Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->isChecked()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    xor-int/2addr p1, v4

    .line 31
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->setChecked(Z)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    sget-object v0, La/mce0;->e2:[La/iiy;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/mce0;->S0()La/hde0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    new-instance v6, La/ede0;

    .line 51
    .line 52
    invoke-direct {v6, p0, v2}, La/ede0;-><init>(La/hde0;B)V

    .line 53
    .line 54
    .line 55
    new-instance v7, La/fde0;

    .line 56
    .line 57
    invoke-direct {v7, p0, v4}, La/fde0;-><init>(La/hde0;B)V

    .line 58
    .line 59
    .line 60
    new-instance v9, La/gde0;

    .line 61
    .line 62
    invoke-direct {v9, p0, v3, v4}, La/gde0;-><init>(La/hde0;La/yje;B)V

    .line 63
    .line 64
    .line 65
    const/16 v10, 0xc

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_1
    sget-object v0, La/mce0;->e2:[La/iiy;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, La/mce0;->S0()La/hde0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0}, La/mce0;->R0()La/u3r;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    iget-object p0, p0, La/u3r;->e:Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 88
    .line 89
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->isChecked()Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    new-instance v5, La/ede0;

    .line 98
    .line 99
    const/4 v0, 0x3

    .line 100
    invoke-direct {v5, p1, v0}, La/ede0;-><init>(La/hde0;B)V

    .line 101
    .line 102
    .line 103
    new-instance v6, La/fde0;

    .line 104
    .line 105
    invoke-direct {v6, p1, v2}, La/fde0;-><init>(La/hde0;B)V

    .line 106
    .line 107
    .line 108
    new-instance v8, La/fj3;

    .line 109
    .line 110
    invoke-direct {v8, p1, p0, v3, v1}, La/fj3;-><init>(La/diu0;ZLa/yje;B)V

    .line 111
    .line 112
    .line 113
    const/16 v9, 0xc

    .line 114
    .line 115
    const/4 v7, 0x0

    .line 116
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_2
    sget-object v0, La/mce0;->e2:[La/iiy;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, La/mce0;->S0()La/hde0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p0}, La/mce0;->R0()La/u3r;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object p0, p0, La/u3r;->e:Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 136
    .line 137
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;->isChecked()Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    new-instance v5, La/ede0;

    .line 146
    .line 147
    const/4 v0, 0x0

    .line 148
    invoke-direct {v5, p1, v0}, La/ede0;-><init>(La/hde0;B)V

    .line 149
    .line 150
    .line 151
    new-instance v6, La/rd7;

    .line 152
    .line 153
    const/16 v0, 0xf

    .line 154
    .line 155
    invoke-direct {v6, p1, p0, v0}, La/rd7;-><init>(Ljava/lang/Object;ZB)V

    .line 156
    .line 157
    .line 158
    new-instance v8, La/a220;

    .line 159
    .line 160
    invoke-direct {v8, p1, p0, v3, v1}, La/a220;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 161
    .line 162
    .line 163
    const/16 v9, 0xc

    .line 164
    .line 165
    const/4 v7, 0x0

    .line 166
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 167
    .line 168
    .line 169
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
