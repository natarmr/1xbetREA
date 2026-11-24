.class public final La/m73;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;


# direct methods
.method public synthetic constructor <init>(La/us00;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/m73;->a:La/us00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    if-lt v0, v1, :cond_2

    .line 9
    .line 10
    iget-object p0, p0, La/m73;->a:La/us00;

    .line 11
    .line 12
    const-string v0, "phone"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of v0, p0, Landroid/telephony/TelephonyManager;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    :goto_0
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-static {p0}, La/c0g;->i(Landroid/telephony/TelephonyManager;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    const-string p0, "-1"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    return-object p0

    .line 38
    :catch_0
    :cond_2
    return-object p1
.end method

.method public b()La/vqc;
    .locals 3

    .line 1
    new-instance v0, La/vqc;

    .line 2
    .line 3
    new-instance v1, La/wsf0;

    .line 4
    .line 5
    new-instance v2, La/bb6;

    .line 6
    .line 7
    iget-object p0, p0, La/m73;->a:La/us00;

    .line 8
    .line 9
    invoke-direct {v2, p0}, La/bb6;-><init>(La/us00;)V

    .line 10
    .line 11
    .line 12
    const/16 p0, 0x11

    .line 13
    .line 14
    invoke-direct {v1, v2, p0}, La/wsf0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    const/16 p0, 0xa

    .line 18
    .line 19
    invoke-direct {v0, v1, p0}, La/vqc;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
