.class public final La/kvb0;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kvb0;->a:B

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object p1, p0, La/kvb0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/kvb0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/kvb0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/lvb0;

    .line 10
    .line 11
    :try_start_0
    sget-object v0, La/gix0;->c:La/gix0;

    .line 12
    .line 13
    iget-object v2, p0, La/lvb0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, v0, La/gix0;->a:La/jix0;

    .line 16
    .line 17
    invoke-interface {v0, v2}, La/jix0;->zza(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljavax/crypto/Mac;

    .line 22
    .line 23
    iget-object p0, p0, La/lvb0;->b:Ljavax/crypto/spec/SecretKeySpec;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    move-object v1, v0

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p0

    .line 31
    invoke-static {p0}, La/itt0;->o(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-object v1

    .line 35
    :pswitch_0
    check-cast p0, La/fuj0;

    .line 36
    .line 37
    iget-object p0, p0, La/fuj0;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p0, La/lvb0;

    .line 47
    .line 48
    :try_start_1
    sget-object v0, La/lyn;->c:La/lyn;

    .line 49
    .line 50
    iget-object v2, p0, La/lvb0;->a:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v0, v0, La/lyn;->a:La/kyn;

    .line 53
    .line 54
    invoke-interface {v0, v2}, La/kyn;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ljavax/crypto/Mac;

    .line 59
    .line 60
    iget-object p0, p0, La/lvb0;->b:Ljavax/crypto/spec/SecretKeySpec;

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 63
    .line 64
    .line 65
    move-object v1, v0

    .line 66
    goto :goto_1

    .line 67
    :catch_1
    move-exception p0

    .line 68
    invoke-static {p0}, La/itt0;->o(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :goto_1
    return-object v1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
