.class public final synthetic La/wj4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hk4;


# direct methods
.method public synthetic constructor <init>(La/hk4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wj4;->a:B

    iput-object p1, p0, La/wj4;->b:La/hk4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/wj4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wj4;->b:La/hk4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    iget-object v0, p0, La/hk4;->P:La/nh70;

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
    check-cast p0, La/tj4;

    .line 21
    .line 22
    iget p0, p0, La/tj4;->h:I

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
    check-cast p1, La/d7a;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v0, La/oj4;

    .line 57
    .line 58
    invoke-direct {v0, p1}, La/oj4;-><init>(La/d7a;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/hk4;->N()V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, La/hk4;->U:La/mi70;

    .line 87
    .line 88
    new-instance v0, La/i38;

    .line 89
    .line 90
    const/16 v1, 0x11

    .line 91
    .line 92
    invoke-direct {v0, v1}, La/i38;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance p0, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 99
    .line 100
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_3
    check-cast p1, La/k0w0;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object p0, p0, La/hk4;->z:La/nh70;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance p0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;

    .line 120
    .line 121
    const-string v0, "KEY_LOGIN_QR_SCANNER_REQUEST"

    .line 122
    .line 123
    const-string v1, "KEY_LOGIN_QR_SCANNER_BUNDLE"

    .line 124
    .line 125
    invoke-direct {p0, v0, v1}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
