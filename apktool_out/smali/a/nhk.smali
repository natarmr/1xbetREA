.class public final La/nhk;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jtj;


# direct methods
.method public synthetic constructor <init>(La/jtj;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nhk;->a:B

    iput-object p1, p0, La/nhk;->b:La/jtj;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nhk;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/nhk;->b:La/jtj;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/jtj;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Landroid/app/KeyguardManager;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    iget-object p0, p0, La/jtj;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Landroid/app/admin/DevicePolicyManager;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/app/admin/DevicePolicyManager;->getStorageEncryptionStatus()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_4

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    if-eq p0, v0, :cond_3

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    if-eq p0, v0, :cond_2

    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    if-eq p0, v0, :cond_1

    .line 45
    .line 46
    const/4 v0, 0x5

    .line 47
    if-eq p0, v0, :cond_0

    .line 48
    .line 49
    const-string p0, ""

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const-string p0, "active_per_user"

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const-string p0, "active"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const-string p0, "activating"

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const-string p0, "inactive"

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    const-string p0, "unsupported"

    .line 65
    .line 66
    :goto_0
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
