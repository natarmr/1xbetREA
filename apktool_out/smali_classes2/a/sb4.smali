.class public final synthetic La/sb4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kc4;


# direct methods
.method public synthetic constructor <init>(La/kc4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sb4;->a:B

    iput-object p1, p0, La/sb4;->b:La/kc4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sb4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/sb4;->b:La/kc4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/kc4;->J:La/kd4;

    .line 17
    .line 18
    invoke-virtual {p0}, La/kd4;->a()V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/kc4;->A:La/nh70;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance p0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;

    .line 35
    .line 36
    const-string v0, "KEY_LOGIN_QR_SCANNER_REQUEST"

    .line 37
    .line 38
    const-string v1, "KEY_LOGIN_QR_SCANNER_BUNDLE"

    .line 39
    .line 40
    invoke-direct {p0, v0, v1}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrScannerScreen$1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    check-cast p1, La/d7a;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance v0, La/ib4;

    .line 55
    .line 56
    invoke-direct {v0, p1}, La/ib4;-><init>(La/d7a;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
