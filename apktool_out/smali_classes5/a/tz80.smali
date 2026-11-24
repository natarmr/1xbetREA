.class public final synthetic La/tz80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xz80;


# direct methods
.method public synthetic constructor <init>(La/xz80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tz80;->a:B

    iput-object p1, p0, La/tz80;->b:La/xz80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/tz80;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/tz80;->b:La/xz80;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/iqt0;

    .line 10
    .line 11
    sget-object v0, La/xz80;->U1:La/xi70;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/xz80;->H0()Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->j:La/z4w0;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, La/z4w0;->a(La/iqt0;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 29
    .line 30
    sget-object v0, La/xz80;->U1:La/xi70;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, La/xz80;->H0()Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->e:La/mxg0;

    .line 40
    .line 41
    sget-object v0, La/pwf0;->a:La/pwf0;

    .line 42
    .line 43
    invoke-virtual {p1}, La/mxg0;->b()V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->c:La/i1w0;

    .line 47
    .line 48
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v2, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->f:La/zn00;

    .line 53
    .line 54
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->d:La/we50;

    .line 55
    .line 56
    invoke-virtual {v2, p0}, La/zn00;->G0(La/we50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    instance-of v2, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 61
    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    new-instance v2, La/e1w0;

    .line 65
    .line 66
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 67
    .line 68
    invoke-direct {v2, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 69
    .line 70
    .line 71
    new-instance p0, La/c8d;

    .line 72
    .line 73
    sget-object v3, La/y7d;->a:La/v7d;

    .line 74
    .line 75
    invoke-direct {p0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    new-instance v2, La/w0w0;

    .line 83
    .line 84
    invoke-direct {v2, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 85
    .line 86
    .line 87
    new-instance p0, La/c8d;

    .line 88
    .line 89
    sget-object v3, La/y7d;->a:La/v7d;

    .line 90
    .line 91
    invoke-direct {p0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-static {p1, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :goto_1
    move-object v0, p0

    .line 102
    check-cast v0, La/paw;

    .line 103
    .line 104
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_1

    .line 109
    .line 110
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, La/oe50;

    .line 115
    .line 116
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_1
    check-cast p1, Landroid/text/Editable;

    .line 124
    .line 125
    sget-object v0, La/xz80;->U1:La/xi70;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, La/xz80;->H0()Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    iget-object v0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->b:La/vzg0;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v2, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->o:La/p7m0;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-lez v3, :cond_2

    .line 150
    .line 151
    const/4 v1, 0x1

    .line 152
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-virtual {v2, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    const-string v2, "current_password_key"

    .line 168
    .line 169
    if-nez v1, :cond_3

    .line 170
    .line 171
    sget-object p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$Default;->b:Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$Default;

    .line 172
    .line 173
    invoke-virtual {v0, v2, p0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_3
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->n:La/xae0;

    .line 178
    .line 179
    iget-object p0, p0, La/xae0;->a:La/n7m0;

    .line 180
    .line 181
    invoke-interface {p0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    check-cast p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;

    .line 186
    .line 187
    invoke-virtual {p0}, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;->a()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-nez p0, :cond_4

    .line 196
    .line 197
    new-instance p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$PasswordInputted;

    .line 198
    .line 199
    invoke-direct {p0, p1}, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$PasswordInputted;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v2, p0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
