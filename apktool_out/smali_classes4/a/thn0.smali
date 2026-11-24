.class public final La/thn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/webkit/PermissionRequest;

.field public final synthetic c:La/whn0;


# direct methods
.method public constructor <init>(La/whn0;Landroid/webkit/PermissionRequest;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/thn0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/thn0;->c:La/whn0;

    .line 8
    .line 9
    iput-object p2, p0, La/thn0;->b:Landroid/webkit/PermissionRequest;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroid/webkit/PermissionRequest;La/whn0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/thn0;->a:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/thn0;->b:Landroid/webkit/PermissionRequest;

    iput-object p2, p0, La/thn0;->c:La/whn0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/thn0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/thn0;->c:La/whn0;

    .line 4
    .line 5
    iget-object p0, p0, La/thn0;->b:Landroid/webkit/PermissionRequest;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/webkit/PermissionRequest;->deny()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 18
    .line 19
    invoke-static {v0}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    const-string v3, "package"

    .line 29
    .line 30
    invoke-static {v3, v1, v2}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    const/16 v1, 0x213

    .line 38
    .line 39
    invoke-virtual {p0, v0, v1}, La/agd;->startActivityForResult(Landroid/content/Intent;I)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    sget-object v0, La/whn0;->Y1:La/s2m0;

    .line 46
    .line 47
    iget-object v0, v1, La/whn0;->S1:La/n0o0;

    .line 48
    .line 49
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, La/qog0;

    .line 54
    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    new-instance v2, La/p790;

    .line 58
    .line 59
    const/4 v3, 0x2

    .line 60
    invoke-direct {v2, v0, p0, v1, v3}, La/p790;-><init>(La/qog0;Landroid/webkit/PermissionRequest;La/yx5;B)V

    .line 61
    .line 62
    .line 63
    iget-object p0, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, La/qog0;->a()V

    .line 69
    .line 70
    .line 71
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
