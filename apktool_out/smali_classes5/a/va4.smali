.class public final La/va4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(La/jdk0;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-byte p1, p0, La/va4;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/va4;->b:Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/va4;->a:B

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, La/va4;->b:Landroidx/fragment/app/Fragment;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/va4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/va4;->b:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v0, "video_fragment_tag"

    .line 16
    .line 17
    invoke-static {p0, v0}, La/zss;->d(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "zone_fragment_tag"

    .line 21
    .line 22
    invoke-static {p0, v0}, La/zss;->d(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "OTP_CONFIRMATION_RESULT_KEY"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, "KEY_LOGIN_QR_SCANNER_REQUEST"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v0, "KEY_REQUEST_CONFIRMATION_NEW_PLACE"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v0, "AUTH_LOGIN_DEFAULT_KEY_REQUEST_SUPPORT"

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v0, "KEY_AUTH_ENTRY_POINT_REQUEST"

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, "KEY_PICKER_MODEL_REQUEST"

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
