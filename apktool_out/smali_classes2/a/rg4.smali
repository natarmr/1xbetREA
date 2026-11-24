.class public final synthetic La/rg4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fh4;


# direct methods
.method public synthetic constructor <init>(La/fh4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rg4;->a:B

    iput-object p1, p0, La/rg4;->b:La/fh4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/rg4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rg4;->b:La/fh4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    iget-object v0, p0, La/fh4;->S:La/nh70;

    .line 11
    .line 12
    new-instance v1, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 13
    .line 14
    new-instance v2, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Phone;

    .line 15
    .line 16
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, La/zf4;

    .line 21
    .line 22
    iget p0, p0, La/zf4;->h:I

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-direct {v2, p0, v3, v4}, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Phone;-><init>(Ljava/lang/Integer;ZZ)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;->b:Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 34
    .line 35
    invoke-direct {v1, v2, p0}, Lorg/xplatform/picker/api/presentation/PickerDialogParams;-><init>(Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, La/nh70;->h(Lorg/xplatform/picker/api/presentation/PickerDialogParams;)Lorg/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/fh4;->R:La/mi70;

    .line 57
    .line 58
    new-instance v0, La/i38;

    .line 59
    .line 60
    const/16 v1, 0x11

    .line 61
    .line 62
    invoke-direct {v0, v1}, La/i38;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance p0, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 69
    .line 70
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_1
    check-cast p1, La/d7a;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v0, La/uf4;

    .line 85
    .line 86
    invoke-direct {v0, p1}, La/uf4;-><init>(La/d7a;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object p0, p0, La/fh4;->N:La/usd;

    .line 101
    .line 102
    invoke-virtual {p0}, La/usd;->b()Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_3
    check-cast p1, La/k0w0;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, La/fh4;->H:La/zn00;

    .line 118
    .line 119
    sget-object v0, La/we50;->c:La/we50;

    .line 120
    .line 121
    invoke-virtual {p0, v0}, La/zn00;->G0(La/we50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_4
    check-cast p1, La/k0w0;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object p0, p0, La/fh4;->Q:La/svs0;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance p0, Lorg/xplatform/security/impl/navigation/TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1;

    .line 142
    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 147
    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_5
    check-cast p1, La/k0w0;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object p0, p0, La/fh4;->A:La/nh70;

    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    new-instance p0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;

    .line 163
    .line 164
    const-string v0, "KEY_LOGIN_QR_SCANNER_REQUEST"

    .line 165
    .line 166
    const-string v1, "KEY_LOGIN_QR_SCANNER_BUNDLE"

    .line 167
    .line 168
    invoke-direct {p0, v0, v1}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 172
    .line 173
    .line 174
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
