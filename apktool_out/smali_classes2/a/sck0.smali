.class public final synthetic La/sck0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tck0;


# direct methods
.method public synthetic constructor <init>(La/tck0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sck0;->a:B

    iput-object p1, p0, La/sck0;->b:La/tck0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/sck0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/sck0;->b:La/tck0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/iqt0;

    .line 9
    .line 10
    sget-object v0, La/tck0;->t2:La/eke0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/tck0;->P0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/lck0;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La/lck0;-><init>(La/iqt0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    iget-object v0, p0, La/tck0;->m2:La/phf0;

    .line 31
    .line 32
    check-cast p1, La/bdk0;

    .line 33
    .line 34
    sget-object v1, La/tck0;->t2:La/eke0;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    instance-of v1, p1, La/adk0;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, La/tck0;->l2:La/gl5;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    check-cast p1, La/adk0;

    .line 49
    .line 50
    iget-object p1, p1, La/adk0;->a:La/d7a;

    .line 51
    .line 52
    const v0, 0x7f1304dc

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const-string v1, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 63
    .line 64
    invoke-static {p0, v1, p1, v0}, La/gl5;->q(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const-string p0, "captchaDialogDelegate"

    .line 69
    .line 70
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v2

    .line 74
    :cond_1
    instance-of v1, p1, La/zck0;

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    const-string v4, "CODE_CONFIRMATION_ERROR"

    .line 78
    .line 79
    const-string v5, "CODE_CONFIRMED_MESSAGE"

    .line 80
    .line 81
    const-string v6, "CODE_CONFIRMED_RESULT"

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    sget-object v1, La/tck0;->u2:[La/iiy;

    .line 86
    .line 87
    aget-object v1, v1, v3

    .line 88
    .line 89
    invoke-virtual {v0, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast p1, La/zck0;

    .line 94
    .line 95
    iget-boolean v1, p1, La/zck0;->a:Z

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    new-instance v2, Lkotlin/Pair;

    .line 102
    .line 103
    invoke-direct {v2, v6, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p1, La/zck0;->b:Ljava/lang/String;

    .line 107
    .line 108
    new-instance v3, Lkotlin/Pair;

    .line 109
    .line 110
    invoke-direct {v3, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p1, La/zck0;->c:Ljava/lang/String;

    .line 114
    .line 115
    new-instance v1, Lkotlin/Pair;

    .line 116
    .line 117
    invoke-direct {v1, v4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    filled-new-array {v2, v3, v1}, [Lkotlin/Pair;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    sget-object v1, La/yck0;->a:La/yck0;

    .line 136
    .line 137
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_3

    .line 142
    .line 143
    sget-object p1, La/tck0;->u2:[La/iiy;

    .line 144
    .line 145
    aget-object p1, p1, v3

    .line 146
    .line 147
    invoke-virtual {v0, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 152
    .line 153
    new-instance v1, Lkotlin/Pair;

    .line 154
    .line 155
    invoke-direct {v1, v6, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    new-instance v0, Lkotlin/Pair;

    .line 159
    .line 160
    const-string v2, ""

    .line 161
    .line 162
    invoke-direct {v0, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    new-instance v3, Lkotlin/Pair;

    .line 166
    .line 167
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    filled-new-array {v1, v0, v3}, [Lkotlin/Pair;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0, p0, p1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 182
    .line 183
    .line 184
    :goto_0
    invoke-virtual {p0}, La/tck0;->P0()La/k3t0;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    sget-object p1, La/gck0;->a:La/gck0;

    .line 189
    .line 190
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 197
    .line 198
    .line 199
    :goto_1
    return-object v2

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
